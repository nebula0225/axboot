package com.axboot.domain.user.auth.menu;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuthGroupMenu_AuthGroupMenuId is a Querydsl query type for AuthGroupMenuId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QAuthGroupMenu_AuthGroupMenuId extends BeanPath<AuthGroupMenu.AuthGroupMenuId> {

    private static final long serialVersionUID = 1574669119L;

    public static final QAuthGroupMenu_AuthGroupMenuId authGroupMenuId = new QAuthGroupMenu_AuthGroupMenuId("authGroupMenuId");

    public final StringPath grpAuthCd = createString("grpAuthCd");

    public final NumberPath<Long> menuId = createNumber("menuId", Long.class);

    public QAuthGroupMenu_AuthGroupMenuId(String variable) {
        super(AuthGroupMenu.AuthGroupMenuId.class, forVariable(variable));
    }

    public QAuthGroupMenu_AuthGroupMenuId(Path<? extends AuthGroupMenu.AuthGroupMenuId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuthGroupMenu_AuthGroupMenuId(PathMetadata metadata) {
        super(AuthGroupMenu.AuthGroupMenuId.class, metadata);
    }

}

