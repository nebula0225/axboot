package com.axboot.domain.log;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QErrorLog is a Querydsl query type for ErrorLog
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QErrorLog extends EntityPathBase<ErrorLog> {

    private static final long serialVersionUID = 833950552L;

    public static final QErrorLog errorLog = new QErrorLog("errorLog");

    public final com.axboot.domain.QSimpleJpaModel _super = new com.axboot.domain.QSimpleJpaModel(this);

    public final StringPath alertYn = createString("alertYn");

    public final DateTimePath<java.time.Instant> errorDatetime = createDateTime("errorDatetime", java.time.Instant.class);

    public final StringPath headerMap = createString("headerMap");

    public final StringPath hostName = createString("hostName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath loggerName = createString("loggerName");

    public final StringPath message = createString("message");

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final StringPath parameterMap = createString("parameterMap");

    public final StringPath path = createString("path");

    public final StringPath phase = createString("phase");

    public final StringPath serverName = createString("serverName");

    public final StringPath system = createString("system");

    public final StringPath trace = createString("trace");

    public final StringPath userInfo = createString("userInfo");

    public QErrorLog(String variable) {
        super(ErrorLog.class, forVariable(variable));
    }

    public QErrorLog(Path<? extends ErrorLog> path) {
        super(path.getType(), path.getMetadata());
    }

    public QErrorLog(PathMetadata metadata) {
        super(ErrorLog.class, metadata);
    }

}

