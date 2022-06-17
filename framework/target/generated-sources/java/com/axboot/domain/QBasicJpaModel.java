package com.axboot.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBasicJpaModel is a Querydsl query type for BasicJpaModel
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QBasicJpaModel extends EntityPathBase<BasicJpaModel<? extends java.io.Serializable>> {

    private static final long serialVersionUID = 1619572938L;

    public static final QBasicJpaModel basicJpaModel = new QBasicJpaModel("basicJpaModel");

    public final BooleanPath new$ = createBoolean("new");

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QBasicJpaModel(String variable) {
        super((Class) BasicJpaModel.class, forVariable(variable));
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QBasicJpaModel(Path<? extends BasicJpaModel> path) {
        super((Class) path.getType(), path.getMetadata());
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QBasicJpaModel(PathMetadata metadata) {
        super((Class) BasicJpaModel.class, metadata);
    }

}

