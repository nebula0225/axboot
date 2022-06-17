package com.axboot.domain.program;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QProgram is a Querydsl query type for Program
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProgram extends EntityPathBase<Program> {

    private static final long serialVersionUID = -1632013304L;

    public static final QProgram program = new QProgram("program");

    public final com.axboot.domain.QBaseJpaModel _super = new com.axboot.domain.QBaseJpaModel(this);

    public final StringPath authCheck = createString("authCheck");

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final StringPath delAh = createString("delAh");

    public final StringPath exlAh = createString("exlAh");

    public final StringPath fn1Ah = createString("fn1Ah");

    public final StringPath fn2Ah = createString("fn2Ah");

    public final StringPath fn3Ah = createString("fn3Ah");

    public final StringPath fn4Ah = createString("fn4Ah");

    public final StringPath fn5Ah = createString("fn5Ah");

    public final StringPath progCd = createString("progCd");

    public final StringPath progNm = createString("progNm");

    public final StringPath progPh = createString("progPh");

    public final StringPath remark = createString("remark");

    public final StringPath savAh = createString("savAh");

    public final StringPath schAh = createString("schAh");

    public final StringPath target = createString("target");

    //inherited
    public final DateTimePath<java.time.Instant> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QProgram(String variable) {
        super(Program.class, forVariable(variable));
    }

    public QProgram(Path<? extends Program> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProgram(PathMetadata metadata) {
        super(Program.class, metadata);
    }

}

