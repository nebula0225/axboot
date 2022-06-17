package com.axboot.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSimpleJpaModel is a Querydsl query type for SimpleJpaModel
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QSimpleJpaModel extends EntityPathBase<SimpleJpaModel<? extends java.io.Serializable>> {

    private static final long serialVersionUID = 278676274L;

    public static final QSimpleJpaModel simpleJpaModel = new QSimpleJpaModel("simpleJpaModel");

    public final BooleanPath new$ = createBoolean("new");

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QSimpleJpaModel(String variable) {
        super((Class) SimpleJpaModel.class, forVariable(variable));
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QSimpleJpaModel(Path<? extends SimpleJpaModel> path) {
        super((Class) path.getType(), path.getMetadata());
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QSimpleJpaModel(PathMetadata metadata) {
        super((Class) SimpleJpaModel.class, metadata);
    }

}

