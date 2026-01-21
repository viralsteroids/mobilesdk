.class public Lcom/smartengines/doc/DocTagsCollection;
.super Ljava/lang/Object;
.source "DocTagsCollection.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCPtr:J

    return-void
.end method

.method public static Create()Lcom/smartengines/doc/DocTagsCollection;
    .locals 4

    .line 82
    invoke-static {}, Lcom/smartengines/doc/jnidocengineJNI;->DocTagsCollection_Create()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 83
    :cond_0
    new-instance v2, Lcom/smartengines/doc/DocTagsCollection;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/doc/DocTagsCollection;-><init>(JZ)V

    return-object v2
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocTagsCollection;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocTagsCollection;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTagsCollection;->delete()V

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
.method public AddTag(Ljava/lang/String;)V
    .locals 2

    .line 62
    iget-wide v0, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocTagsCollection_AddTag(JLcom/smartengines/doc/DocTagsCollection;Ljava/lang/String;)V

    return-void
.end method

.method public GetTagsCount()I
    .locals 2

    .line 54
    iget-wide v0, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTagsCollection_GetTagsCount(JLcom/smartengines/doc/DocTagsCollection;)I

    move-result v0

    return v0
.end method

.method public HasTag(Ljava/lang/String;)Z
    .locals 2

    .line 58
    iget-wide v0, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocTagsCollection_HasTag(JLcom/smartengines/doc/DocTagsCollection;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public RemoveTag(Ljava/lang/String;)V
    .locals 2

    .line 66
    iget-wide v0, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocTagsCollection_RemoveTag(JLcom/smartengines/doc/DocTagsCollection;Ljava/lang/String;)V

    return-void
.end method

.method public Serialize(Lcom/smartengines/common/Serializer;)V
    .locals 6

    .line 78
    iget-wide v0, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Serializer;->getCPtr(Lcom/smartengines/common/Serializer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocTagsCollection_Serialize(JLcom/smartengines/doc/DocTagsCollection;JLcom/smartengines/common/Serializer;)V

    return-void
.end method

.method public TagsBegin()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 70
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTagsCollection_TagsBegin(JLcom/smartengines/doc/DocTagsCollection;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public TagsEnd()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 74
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTagsCollection_TagsEnd(JLcom/smartengines/doc/DocTagsCollection;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocTagsCollection(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocTagsCollection;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTagsCollection;->delete()V

    return-void
.end method
