package com.axboot.domain.code;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCommonCode is a Querydsl query type for CommonCode
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCommonCode extends EntityPathBase<CommonCode> {

    private static final long serialVersionUID = -1637418937L;

    public static final QCommonCode commonCode = new QCommonCode("commonCode");

    public final com.axboot.domain.QBaseJpaModel _super = new com.axboot.domain.QBaseJpaModel(this);

    public final StringPath code = createString("code");

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final StringPath data1 = createString("data1");

    public final StringPath data2 = createString("data2");

    public final StringPath data3 = createString("data3");

    public final NumberPath<Integer> data4 = createNumber("data4", Integer.class);

    public final NumberPath<Integer> data5 = createNumber("data5", Integer.class);

    public final StringPath groupCd = createString("groupCd");

    public final StringPath groupNm = createString("groupNm");

    public final StringPath name = createString("name");

    public final StringPath remark = createString("remark");

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    //inherited
    public final DateTimePath<java.time.Instant> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public final EnumPath<com.chequer.axboot.core.code.AXBootTypes.Used> useYn = createEnum("useYn", com.chequer.axboot.core.code.AXBootTypes.Used.class);

    public QCommonCode(String variable) {
        super(CommonCode.class, forVariable(variable));
    }

    public QCommonCode(Path<? extends CommonCode> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommonCode(PathMetadata metadata) {
        super(CommonCode.class, metadata);
    }

}

