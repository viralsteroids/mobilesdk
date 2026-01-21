.class public Lcom/smartengines/doc/DocObjectsCollection;
.super Ljava/lang/Object;
.source "DocObjectsCollection.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    return-void
.end method

.method public static BaseClassNameStatic()Ljava/lang/String;
    .locals 1

    .line 54
    invoke-static {}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_BaseClassNameStatic()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static Create(Ljava/lang/String;)Lcom/smartengines/doc/DocObjectsCollection;
    .locals 4

    .line 58
    invoke-static {p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_Create(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 59
    :cond_0
    new-instance p0, Lcom/smartengines/doc/DocObjectsCollection;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/doc/DocObjectsCollection;-><init>(JZ)V

    return-object p0
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocObjectsCollection;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocObjectsCollection;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/doc/DocObjectsCollection;->delete()V

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
.method public AddObject(Lcom/smartengines/doc/DocBasicObject;)Lcom/smartengines/doc/DocBasicObjectsMutableIterator;
    .locals 7

    .line 105
    new-instance v0, Lcom/smartengines/doc/DocBasicObjectsMutableIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocBasicObject;->getCPtr(Lcom/smartengines/doc/DocBasicObject;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_AddObject(JLcom/smartengines/doc/DocObjectsCollection;JLcom/smartengines/doc/DocBasicObject;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBasicObjectsMutableIterator;-><init>(JZ)V

    return-object v0
.end method

.method public BasicObjectsBegin()Lcom/smartengines/doc/DocBasicObjectsIterator;
    .locals 4

    .line 121
    new-instance v0, Lcom/smartengines/doc/DocBasicObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_BasicObjectsBegin(JLcom/smartengines/doc/DocObjectsCollection;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocBasicObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public BasicObjectsEnd()Lcom/smartengines/doc/DocBasicObjectsIterator;
    .locals 4

    .line 125
    new-instance v0, Lcom/smartengines/doc/DocBasicObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_BasicObjectsEnd(JLcom/smartengines/doc/DocObjectsCollection;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocBasicObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public BasicObjectsSlice(Ljava/lang/String;)Lcom/smartengines/doc/DocBasicObjectsSliceIterator;
    .locals 3

    .line 137
    new-instance v0, Lcom/smartengines/doc/DocBasicObjectsSliceIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_BasicObjectsSlice(JLcom/smartengines/doc/DocObjectsCollection;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBasicObjectsSliceIterator;-><init>(JZ)V

    return-object v0
.end method

.method public Clone()Lcom/smartengines/doc/DocObjectsCollection;
    .locals 4

    .line 68
    iget-wide v0, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_Clone(JLcom/smartengines/doc/DocObjectsCollection;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 69
    :cond_0
    new-instance v2, Lcom/smartengines/doc/DocObjectsCollection;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/doc/DocObjectsCollection;-><init>(JZ)V

    return-object v2
.end method

.method public CreateObject()Lcom/smartengines/doc/DocBasicObject;
    .locals 4

    .line 63
    iget-wide v0, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_CreateObject(JLcom/smartengines/doc/DocObjectsCollection;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 64
    :cond_0
    new-instance v2, Lcom/smartengines/doc/DocBasicObject;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/doc/DocBasicObject;-><init>(JZ)V

    return-object v2
.end method

.method public GetFrameID()I
    .locals 2

    .line 77
    iget-wide v0, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_GetFrameID(JLcom/smartengines/doc/DocObjectsCollection;)I

    move-result v0

    return v0
.end method

.method public GetMutableObject(I)Lcom/smartengines/doc/DocBasicObject;
    .locals 3

    .line 97
    new-instance v0, Lcom/smartengines/doc/DocBasicObject;

    iget-wide v1, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_GetMutableObject(JLcom/smartengines/doc/DocObjectsCollection;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBasicObject;-><init>(JZ)V

    return-object v0
.end method

.method public GetObject(I)Lcom/smartengines/doc/DocBasicObject;
    .locals 3

    .line 93
    new-instance v0, Lcom/smartengines/doc/DocBasicObject;

    iget-wide v1, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_GetObject(JLcom/smartengines/doc/DocObjectsCollection;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBasicObject;-><init>(JZ)V

    return-object v0
.end method

.method public GetObjectTags(I)Lcom/smartengines/doc/DocTagsCollection;
    .locals 3

    .line 101
    new-instance v0, Lcom/smartengines/doc/DocTagsCollection;

    iget-wide v1, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_GetObjectTags(JLcom/smartengines/doc/DocObjectsCollection;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTagsCollection;-><init>(JZ)V

    return-object v0
.end method

.method public GetObjectsCount()I
    .locals 2

    .line 85
    iget-wide v0, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_GetObjectsCount(JLcom/smartengines/doc/DocObjectsCollection;)I

    move-result v0

    return v0
.end method

.method public HasObject(I)Z
    .locals 2

    .line 89
    iget-wide v0, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_HasObject(JLcom/smartengines/doc/DocObjectsCollection;I)Z

    move-result p1

    return p1
.end method

.method public MutableBasicObjectsBegin()Lcom/smartengines/doc/DocBasicObjectsMutableIterator;
    .locals 4

    .line 129
    new-instance v0, Lcom/smartengines/doc/DocBasicObjectsMutableIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_MutableBasicObjectsBegin(JLcom/smartengines/doc/DocObjectsCollection;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocBasicObjectsMutableIterator;-><init>(JZ)V

    return-object v0
.end method

.method public MutableBasicObjectsEnd()Lcom/smartengines/doc/DocBasicObjectsMutableIterator;
    .locals 4

    .line 133
    new-instance v0, Lcom/smartengines/doc/DocBasicObjectsMutableIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_MutableBasicObjectsEnd(JLcom/smartengines/doc/DocObjectsCollection;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocBasicObjectsMutableIterator;-><init>(JZ)V

    return-object v0
.end method

.method public MutableBasicObjectsSlice(Ljava/lang/String;)Lcom/smartengines/doc/DocBasicObjectsMutableSliceIterator;
    .locals 3

    .line 141
    new-instance v0, Lcom/smartengines/doc/DocBasicObjectsMutableSliceIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_MutableBasicObjectsSlice(JLcom/smartengines/doc/DocObjectsCollection;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBasicObjectsMutableSliceIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ObjectType()Ljava/lang/String;
    .locals 2

    .line 73
    iget-wide v0, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_ObjectType(JLcom/smartengines/doc/DocObjectsCollection;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public RemoveObject(I)V
    .locals 2

    .line 113
    iget-wide v0, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_RemoveObject(JLcom/smartengines/doc/DocObjectsCollection;I)V

    return-void
.end method

.method public RemoveObjectDeep(ILcom/smartengines/doc/DocViewsCollection;)V
    .locals 7

    .line 117
    iget-wide v0, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/doc/DocViewsCollection;->getCPtr(Lcom/smartengines/doc/DocViewsCollection;)J

    move-result-wide v4

    move-object v2, p0

    move v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_RemoveObjectDeep(JLcom/smartengines/doc/DocObjectsCollection;IJLcom/smartengines/doc/DocViewsCollection;)V

    return-void
.end method

.method public Serialize(Lcom/smartengines/common/Serializer;)V
    .locals 6

    .line 145
    iget-wide v0, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Serializer;->getCPtr(Lcom/smartengines/common/Serializer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_Serialize(JLcom/smartengines/doc/DocObjectsCollection;JLcom/smartengines/common/Serializer;)V

    return-void
.end method

.method public SetFrameID(I)V
    .locals 2

    .line 81
    iget-wide v0, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_SetFrameID(JLcom/smartengines/doc/DocObjectsCollection;I)V

    return-void
.end method

.method public SetObject(ILcom/smartengines/doc/DocBasicObject;)V
    .locals 7

    .line 109
    iget-wide v0, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/doc/DocBasicObject;->getCPtr(Lcom/smartengines/doc/DocBasicObject;)J

    move-result-wide v4

    move-object v2, p0

    move v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocObjectsCollection_SetObject(JLcom/smartengines/doc/DocObjectsCollection;IJLcom/smartengines/doc/DocBasicObject;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocObjectsCollection(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocObjectsCollection;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/doc/DocObjectsCollection;->delete()V

    return-void
.end method
