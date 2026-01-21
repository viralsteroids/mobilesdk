.class public Lcom/smartengines/doc/DocImageField;
.super Ljava/lang/Object;
.source "DocImageField.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/doc/DocImageField;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/doc/DocImageField;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocImageField;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocImageField;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocImageField;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/doc/DocImageField;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/doc/DocImageField;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/doc/DocImageField;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/doc/DocImageField;->delete()V

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
.method public GetBaseFieldInfo()Lcom/smartengines/doc/DocBaseFieldInfo;
    .locals 4

    .line 54
    new-instance v0, Lcom/smartengines/doc/DocBaseFieldInfo;

    iget-wide v1, p0, Lcom/smartengines/doc/DocImageField;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocImageField_GetBaseFieldInfo(JLcom/smartengines/doc/DocImageField;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocBaseFieldInfo;-><init>(JZ)V

    return-object v0
.end method

.method public GetImage()Lcom/smartengines/common/Image;
    .locals 4

    .line 62
    new-instance v0, Lcom/smartengines/common/Image;

    iget-wide v1, p0, Lcom/smartengines/doc/DocImageField;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocImageField_GetImage(JLcom/smartengines/doc/DocImageField;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v0
.end method

.method public GetMutableBaseFieldInfo()Lcom/smartengines/doc/DocBaseFieldInfo;
    .locals 4

    .line 58
    new-instance v0, Lcom/smartengines/doc/DocBaseFieldInfo;

    iget-wide v1, p0, Lcom/smartengines/doc/DocImageField;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocImageField_GetMutableBaseFieldInfo(JLcom/smartengines/doc/DocImageField;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocBaseFieldInfo;-><init>(JZ)V

    return-object v0
.end method

.method public GetMutableImage()Lcom/smartengines/common/Image;
    .locals 4

    .line 66
    new-instance v0, Lcom/smartengines/common/Image;

    iget-wide v1, p0, Lcom/smartengines/doc/DocImageField;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocImageField_GetMutableImage(JLcom/smartengines/doc/DocImageField;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v0
.end method

.method public Serialize(Lcom/smartengines/common/Serializer;)V
    .locals 6

    .line 74
    iget-wide v0, p0, Lcom/smartengines/doc/DocImageField;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Serializer;->getCPtr(Lcom/smartengines/common/Serializer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocImageField_Serialize(JLcom/smartengines/doc/DocImageField;JLcom/smartengines/common/Serializer;)V

    return-void
.end method

.method public SetImage(Lcom/smartengines/common/Image;)V
    .locals 6

    .line 70
    iget-wide v0, p0, Lcom/smartengines/doc/DocImageField;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Image;->getCPtr(Lcom/smartengines/common/Image;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocImageField_SetImage(JLcom/smartengines/doc/DocImageField;JLcom/smartengines/common/Image;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocImageField;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/doc/DocImageField;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/doc/DocImageField;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocImageField(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocImageField;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/doc/DocImageField;->delete()V

    return-void
.end method
