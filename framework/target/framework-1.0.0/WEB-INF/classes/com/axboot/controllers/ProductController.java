package com.axboot.controllers;

import com.chequer.axboot.core.api.response.Responses;
import com.chequer.axboot.core.controllers.BaseController;
import com.chequer.axboot.core.parameter.RequestParams;
import org.springframework.stereotype.Controller;

import com.axboot.domain.prdt.Product;
import com.axboot.domain.prdt.ProductService;
import com.chequer.axboot.core.api.response.ApiResponse;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wordnik.swagger.annotations.ApiImplicitParam;
import com.wordnik.swagger.annotations.ApiImplicitParams;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping(value = "/api/v1/product")
public class ProductController extends BaseController {

    @Inject
    private ProductService productService;

    @ApiImplicitParams(
    		{
		    	@ApiImplicitParam(name="prdtCd", value = "제품코드", dataType = "String", paramType = "query"),
		    	@ApiImplicitParam(name="prdtNm", value = "제품명", dataType = "String", paramType = "query"),
		    	@ApiImplicitParam(name="filter", value = "검색어", dataType = "String", paramType = "query")
    		}
    )
    @RequestMapping(method = RequestMethod.GET, produces = APPLICATION_JSON)
    public Responses.ListResponse list(RequestParams<Product> requestParams) {
        List<Product> list = productService.gets(requestParams);
        return Responses.ListResponse.of(list);
    }

    @RequestMapping(method = {RequestMethod.PUT}, produces = APPLICATION_JSON)
    public ApiResponse save(@RequestBody List<Product> request) {
        productService.savePrdt(request);
        return ok();
    }
}