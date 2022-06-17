package com.axboot.domain.user.auth;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserAuthId is a Querydsl query type for UserAuthId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QUserAuthId extends BeanPath<UserAuthId> {

    private static final long serialVersionUID = 1849323075L;

    public static final QUserAuthId userAuthId = new QUserAuthId("userAuthId");

    public final StringPath grpAuthCd = createString("grpAuthCd");

    public final StringPath userCd = createString("userCd");

    public QUserAuthId(String variable) {
        super(UserAuthId.class, forVariable(variable));
    }

    public QUserAuthId(Path<? extends UserAuthId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserAuthId(PathMetadata metadata) {
        super(UserAuthId.class, metadata);
    }

}

