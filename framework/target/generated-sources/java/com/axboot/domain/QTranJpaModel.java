package com.axboot.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTranJpaModel is a Querydsl query type for TranJpaModel
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QTranJpaModel extends EntityPathBase<TranJpaModel<? extends java.io.Serializable>> {

    private static final long serialVersionUID = 232106027L;

    public static final QTranJpaModel tranJpaModel = new QTranJpaModel("tranJpaModel");

    public final DateTimePath<java.util.Date> createdAt = createDateTime("createdAt", java.util.Date.class);

    public final StringPath createdBy = createString("createdBy");

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QTranJpaModel(String variable) {
        super((Class) TranJpaModel.class, forVariable(variable));
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QTranJpaModel(Path<? extends TranJpaModel> path) {
        super((Class) path.getType(), path.getMetadata());
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QTranJpaModel(PathMetadata metadata) {
        super((Class) TranJpaModel.class, metadata);
    }

}

