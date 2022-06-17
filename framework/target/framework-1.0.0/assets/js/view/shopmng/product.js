var fnObj = {};
var ACTIONS = axboot.actionExtend(fnObj, {
    PAGE_SEARCH: function (caller, act, data) {
        axboot.ajax({
            type: "GET",
            url: ["product"],
            data: caller.searchView.getData(),
            callback: function (res) {
                caller.gridView01.setData(res);
            }
        });
        return false;
    },
    PAGE_SAVE: function (caller, act, data) {
        var saveList = [].concat(caller.gridView01.getData("modified"));
        saveList = saveList.concat(caller.gridView01.getData("deleted"));

        axboot.ajax({
            type: "PUT",
            url: ["product"],
            data: JSON.stringify(saveList),
            callback: function (res) {
                ACTIONS.dispatch(ACTIONS.PAGE_SEARCH);
                axToast.push(LANG("onsave"));
            }
        });
    },
    ITEM_ADD: function (caller, act, data) {
        caller.gridView01.addRow();
    },
    ITEM_DEL: function (caller, act, data) {
        caller.gridView01.delRow("selected");
    }
});

var CODE = {}; // 추가

// fnObj 기본 함수 스타트와 리사이즈
fnObj.pageStart = function () {
	
	// 추가
	var _this = this;
	
	axboot.call({
		type: "GET",
		url: "/api/v1/commonCodes",
		data: {groupCd: "ORIGIN"},
		callback: function(res){ // callback : 매개변수를 전달 받아 함수의 내부에서 실행하는 함수
			var originList = [];
			res.list.forEach(function(n){
				originList.push({
					CD:n.code, NM:n.name + "(" + n.code + ")" // ex) 한국(KR)
				});
			});
			this.originList = originList;
 			// alert(JSON.stringify(this.originList));
		}
	}).done(function(){
	CODE = this; // call을통해 수집된 데이터들
	
	// this --> _this 로 변경
    _this.pageButtonView.initView();
    _this.searchView.initView();
    _this.gridView01.initView();

    ACTIONS.dispatch(ACTIONS.PAGE_SEARCH);
    
    }); // 추가
};

fnObj.pageResize = function () {

};


fnObj.pageButtonView = axboot.viewExtend({
    initView: function () {
        axboot.buttonClick(this, "data-page-btn", {
            "search": function () {
                ACTIONS.dispatch(ACTIONS.PAGE_SEARCH);
            },
            "save": function () {
                ACTIONS.dispatch(ACTIONS.PAGE_SAVE);
            }
        });
    }
});

//== view 시작
/**
 * searchView
 */
fnObj.searchView = axboot.viewExtend(axboot.searchView, {
    initView: function () {
        this.target = $(document["searchView0"]);
        this.target.attr("onsubmit", "return ACTIONS.dispatch(ACTIONS.PAGE_SEARCH);");
        this.filter = $("#filter");
    },
    getData: function () {
        return {
            pageNumber: this.pageNumber,
            pageSize: this.pageSize,
            filter: this.filter.val()
        }
    }
});


/**
 * gridView
 */
fnObj.gridView01 = axboot.viewExtend(axboot.gridView, {
    initView: function () {
        var _this = this;
        this.originList = CODE.originList; // 추가
        
        this.target = axboot.gridBuilder({
            showRowSelector: true,
            frozenColumnIndex: 0,
            sortable: true,
            multipleSelect: true,
            target: $('[data-ax5grid="grid-view-01"]'),
            columns: [
                {key: "prdtCd", label: "제품코드", width: 250, align: "center", editor: {type: "text", disabled: "notCreated"}},
                {key: "prdtNm", label: "제품명", width: 200, align: "center", editor: "text"},
                // 추가
                {
					key: "origin", 
					label: "원산지", 
					width: 100, 
					align: "center", 
					editor: {
								type: "select",
								config: {
									columnKeys: {
										optionValue: "CD",
										optionText: "NM"	
									},
									options: this.originList
								}
							}
				},
                {key: "purchasePrice", label: "매입가격", align: "right", editor: "number", formatter: "money"},
                {key: "salesPrice", label: "판매가격", editor: "number", align: "right", formatter: "money"},
                {key: "updatedAt", label: "작성/수정 일", width: 200, editor: "date", align: "center"},
                {key: "updatedBy", label: "작성자", editor: "String", align: "center"}
            ],
            body: {
                onClick: function () {
                    this.self.select(this.dindex, {selectedClear: true});
                }
            }
        });

        axboot.buttonClick(this, "data-grid-view-01-btn", {
            "add": function () {
                ACTIONS.dispatch(ACTIONS.ITEM_ADD);
            },
            "delete": function () {
                ACTIONS.dispatch(ACTIONS.ITEM_DEL);
            }
        });
    },
    getData: function (_type) {
        var list = [];
        var _list = this.target.getList(_type);

        if (_type == "modified" || _type == "deleted") {
            list = ax5.util.filter(_list, function () {
                return this.prdtCd;
            });
        } else {
            list = _list;
        }
        return list;
    },
    addRow: function () {
        this.target.addRow({__created__: true, posUseYn: "N", useYn: "Y"}, "last");
    }
});