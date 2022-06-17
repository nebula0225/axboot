package com.axboot.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseJpaModel is a Querydsl query type for BaseJpaModel
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QBaseJpaModel extends EntityPathBase<BaseJpaModel<? extends java.io.Serializable>> {

    private static final long serialVersionUID = -1763035695L;

    public static final QBaseJpaModel baseJpaModel = new QBaseJpaModel("baseJpaModel");

    public final DateTimePath<java.time.Instant> createdAt = createDateTime("createdAt", java.time.Instant.class);

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.time.Instant> updatedAt = createDateTime("updatedAt", java.time.Instant.class);

    public final StringPath updatedBy = createString("updatedBy");

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QBaseJpaModel(String variable) {
        super((Class) BaseJpaModel.class, forVariable(variable));
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QBaseJpaModel(Path<? extends BaseJpaModel> path) {
        super((Class) path.getType(), path.getMetadata());
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QBaseJpaModel(PathMetadata metadata) {
        super((Class) BaseJpaModel.class, metadata);
    }

}

