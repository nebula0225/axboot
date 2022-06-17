package com.axboot.domain.user.auth;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserAuth is a Querydsl query type for UserAuth
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserAuth extends EntityPathBase<UserAuth> {

    private static final long serialVersionUID = 1981810440L;

    public static final QUserAuth userAuth = new QUserAuth("userAuth");

    public final com.axboot.domain.QBaseJpaModel _super = new com.axboot.domain.QBaseJpaModel(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final StringPath grpAuthCd = createString("grpAuthCd");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.Instant> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public final StringPath userCd = createString("userCd");

    public QUserAuth(String variable) {
        super(UserAuth.class, forVariable(variable));
    }

    public QUserAuth(Path<? extends UserAuth> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserAuth(PathMetadata metadata) {
        super(UserAuth.class, metadata);
    }

}

