package com.axboot.domain.file;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCommonFile is a Querydsl query type for CommonFile
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCommonFile extends EntityPathBase<CommonFile> {

    private static final long serialVersionUID = -723519257L;

    public static final QCommonFile commonFile = new QCommonFile("commonFile");

    public final com.axboot.domain.QBaseJpaModel _super = new com.axboot.domain.QBaseJpaModel(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final EnumPath<com.chequer.axboot.core.code.AXBootTypes.Deleted> delYn = createEnum("delYn", com.chequer.axboot.core.code.AXBootTypes.Deleted.class);

    public final StringPath desc = createString("desc");

    public final StringPath extension = createString("extension");

    public final StringPath fileNm = createString("fileNm");

    public final NumberPath<Long> fileSize = createNumber("fileSize", Long.class);

    public final StringPath fileType = createString("fileType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath saveNm = createString("saveNm");

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public final StringPath targetId = createString("targetId");

    public final StringPath targetType = createString("targetType");

    //inherited
    public final DateTimePath<java.time.Instant> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QCommonFile(String variable) {
        super(CommonFile.class, forVariable(variable));
    }

    public QCommonFile(Path<? extends CommonFile> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommonFile(PathMetadata metadata) {
        super(CommonFile.class, metadata);
    }

}

