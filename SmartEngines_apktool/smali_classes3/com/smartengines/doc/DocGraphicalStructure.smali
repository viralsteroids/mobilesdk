.class public Lcom/smartengines/doc/DocGraphicalStructure;
.super Ljava/lang/Object;
.source "DocGraphicalStructure.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocGraphicalStructure;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocGraphicalStructure;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/doc/DocGraphicalStructure;->delete()V

    return-wide v0

    .line 30
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "Cannot release ownership as memory is not owned"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const-wide/16 v0, 0x0

    return-wide v0
.end method


# virtual methods
.method public AddCollection(Lcom/smartengines/doc/DocObjectsCollection;)Lcom/smartengines/doc/DocObjectsCollectionsMutableIterator;
    .locals 7

    .line 74
    new-instance v0, Lcom/smartengines/doc/DocObjectsCollectionsMutableIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocObjectsCollection;->getCPtr(Lcom/smartengines/doc/DocObjectsCollection;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_AddCollection__SWIG_0(JLcom/smartengines/doc/DocGraphicalStructure;JLcom/smartengines/doc/DocObjectsCollection;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocObjectsCollectionsMutableIterator;-><init>(JZ)V

    return-object v0
.end method

.method public AddCollection(Lcom/smartengines/doc/DocObjectsCollection;Lcom/smartengines/doc/DocTagsCollection;)Lcom/smartengines/doc/DocObjectsCollectionsMutableIterator;
    .locals 10

    .line 78
    new-instance v0, Lcom/smartengines/doc/DocObjectsCollectionsMutableIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocObjectsCollection;->getCPtr(Lcom/smartengines/doc/DocObjectsCollection;)J

    move-result-wide v4

    invoke-static {p2}, Lcom/smartengines/doc/DocTagsCollection;->getCPtr(Lcom/smartengines/doc/DocTagsCollection;)J

    move-result-wide v7

    move-object v3, p0

    move-object v6, p1

    move-object v9, p2

    invoke-static/range {v1 .. v9}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_AddCollection__SWIG_1(JLcom/smartengines/doc/DocGraphicalStructure;JLcom/smartengines/doc/DocObjectsCollection;JLcom/smartengines/doc/DocTagsCollection;)J

    move-result-wide p1

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocObjectsCollectionsMutableIterator;-><init>(JZ)V

    return-object v0
.end method

.method public GetCollection(I)Lcom/smartengines/doc/DocObjectsCollection;
    .locals 3

    .line 62
    new-instance v0, Lcom/smartengines/doc/DocObjectsCollection;

    iget-wide v1, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_GetCollection(JLcom/smartengines/doc/DocGraphicalStructure;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocObjectsCollection;-><init>(JZ)V

    return-object v0
.end method

.method public GetCollectionTags(I)Lcom/smartengines/doc/DocTagsCollection;
    .locals 3

    .line 70
    new-instance v0, Lcom/smartengines/doc/DocTagsCollection;

    iget-wide v1, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_GetCollectionTags(JLcom/smartengines/doc/DocGraphicalStructure;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTagsCollection;-><init>(JZ)V

    return-object v0
.end method

.method public GetCollectionsCount()I
    .locals 2

    .line 54
    iget-wide v0, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_GetCollectionsCount(JLcom/smartengines/doc/DocGraphicalStructure;)I

    move-result v0

    return v0
.end method

.method public GetMutableCollection(I)Lcom/smartengines/doc/DocObjectsCollection;
    .locals 3

    .line 66
    new-instance v0, Lcom/smartengines/doc/DocObjectsCollection;

    iget-wide v1, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_GetMutableCollection(JLcom/smartengines/doc/DocGraphicalStructure;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocObjectsCollection;-><init>(JZ)V

    return-object v0
.end method

.method public GetMutableViewsCollection()Lcom/smartengines/doc/DocViewsCollection;
    .locals 4

    .line 118
    new-instance v0, Lcom/smartengines/doc/DocViewsCollection;

    iget-wide v1, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_GetMutableViewsCollection(JLcom/smartengines/doc/DocGraphicalStructure;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocViewsCollection;-><init>(JZ)V

    return-object v0
.end method

.method public GetViewsCollection()Lcom/smartengines/doc/DocViewsCollection;
    .locals 4

    .line 114
    new-instance v0, Lcom/smartengines/doc/DocViewsCollection;

    iget-wide v1, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_GetViewsCollection(JLcom/smartengines/doc/DocGraphicalStructure;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocViewsCollection;-><init>(JZ)V

    return-object v0
.end method

.method public HasCollection(I)Z
    .locals 2

    .line 58
    iget-wide v0, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_HasCollection(JLcom/smartengines/doc/DocGraphicalStructure;I)Z

    move-result p1

    return p1
.end method

.method public MutableObjectsCollectionsBegin()Lcom/smartengines/doc/DocObjectsCollectionsMutableIterator;
    .locals 4

    .line 98
    new-instance v0, Lcom/smartengines/doc/DocObjectsCollectionsMutableIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_MutableObjectsCollectionsBegin(JLcom/smartengines/doc/DocGraphicalStructure;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocObjectsCollectionsMutableIterator;-><init>(JZ)V

    return-object v0
.end method

.method public MutableObjectsCollectionsEnd()Lcom/smartengines/doc/DocObjectsCollectionsMutableIterator;
    .locals 4

    .line 102
    new-instance v0, Lcom/smartengines/doc/DocObjectsCollectionsMutableIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_MutableObjectsCollectionsEnd(JLcom/smartengines/doc/DocGraphicalStructure;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocObjectsCollectionsMutableIterator;-><init>(JZ)V

    return-object v0
.end method

.method public MutableObjectsCollectionsSlice(Ljava/lang/String;)Lcom/smartengines/doc/DocObjectsCollectionsMutableSliceIterator;
    .locals 3

    .line 110
    new-instance v0, Lcom/smartengines/doc/DocObjectsCollectionsMutableSliceIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_MutableObjectsCollectionsSlice(JLcom/smartengines/doc/DocGraphicalStructure;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocObjectsCollectionsMutableSliceIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ObjectsCollectionsBegin()Lcom/smartengines/doc/DocObjectsCollectionsIterator;
    .locals 4

    .line 90
    new-instance v0, Lcom/smartengines/doc/DocObjectsCollectionsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_ObjectsCollectionsBegin(JLcom/smartengines/doc/DocGraphicalStructure;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocObjectsCollectionsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ObjectsCollectionsEnd()Lcom/smartengines/doc/DocObjectsCollectionsIterator;
    .locals 4

    .line 94
    new-instance v0, Lcom/smartengines/doc/DocObjectsCollectionsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_ObjectsCollectionsEnd(JLcom/smartengines/doc/DocGraphicalStructure;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocObjectsCollectionsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ObjectsCollectionsSlice(Ljava/lang/String;)Lcom/smartengines/doc/DocObjectsCollectionsSliceIterator;
    .locals 3

    .line 106
    new-instance v0, Lcom/smartengines/doc/DocObjectsCollectionsSliceIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_ObjectsCollectionsSlice(JLcom/smartengines/doc/DocGraphicalStructure;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocObjectsCollectionsSliceIterator;-><init>(JZ)V

    return-object v0
.end method

.method public RemoveCollection(I)V
    .locals 2

    .line 86
    iget-wide v0, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_RemoveCollection(JLcom/smartengines/doc/DocGraphicalStructure;I)V

    return-void
.end method

.method public Serialize(Lcom/smartengines/common/Serializer;)V
    .locals 6

    .line 122
    iget-wide v0, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Serializer;->getCPtr(Lcom/smartengines/common/Serializer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_Serialize(JLcom/smartengines/doc/DocGraphicalStructure;JLcom/smartengines/common/Serializer;)V

    return-void
.end method

.method public SetCollection(ILcom/smartengines/doc/DocObjectsCollection;)V
    .locals 7

    .line 82
    iget-wide v0, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/doc/DocObjectsCollection;->getCPtr(Lcom/smartengines/doc/DocObjectsCollection;)J

    move-result-wide v4

    move-object v2, p0

    move v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocGraphicalStructure_SetCollection(JLcom/smartengines/doc/DocGraphicalStructure;IJLcom/smartengines/doc/DocObjectsCollection;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocGraphicalStructure(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocGraphicalStructure;->swigCPtr:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected finalize()V
    .locals 0

    .line 40
    invoke-virtual {p0}, Lcom/smartengines/doc/DocGraphicalStructure;->delete()V

    return-void
.end method
