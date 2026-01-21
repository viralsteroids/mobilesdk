.class public Lcom/smartengines/id/IdAnimatedField;
.super Ljava/lang/Object;
.source "IdAnimatedField.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 54
    invoke-static {}, Lcom/smartengines/id/jniidengineJNI;->new_IdAnimatedField__SWIG_0()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/id/IdAnimatedField;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/id/IdAnimatedField;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/id/IdAnimatedField;->swigCPtr:J

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/id/IdAnimatedField;)V
    .locals 2

    .line 70
    invoke-static {p1}, Lcom/smartengines/id/IdAnimatedField;->getCPtr(Lcom/smartengines/id/IdAnimatedField;)J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/smartengines/id/jniidengineJNI;->new_IdAnimatedField__SWIG_4(JLcom/smartengines/id/IdAnimatedField;)J

    move-result-wide v0

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/smartengines/id/IdAnimatedField;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 66
    invoke-static {p1}, Lcom/smartengines/id/jniidengineJNI;->new_IdAnimatedField__SWIG_3(Ljava/lang/String;)J

    move-result-wide v0

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/smartengines/id/IdAnimatedField;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    .line 62
    invoke-static {p1, p2}, Lcom/smartengines/id/jniidengineJNI;->new_IdAnimatedField__SWIG_2(Ljava/lang/String;Z)J

    move-result-wide p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/smartengines/id/IdAnimatedField;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZD)V
    .locals 0

    .line 58
    invoke-static {p1, p2, p3, p4}, Lcom/smartengines/id/jniidengineJNI;->new_IdAnimatedField__SWIG_1(Ljava/lang/String;ZD)J

    move-result-wide p1

    const/4 p3, 0x1

    invoke-direct {p0, p1, p2, p3}, Lcom/smartengines/id/IdAnimatedField;-><init>(JZ)V

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/id/IdAnimatedField;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/id/IdAnimatedField;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/id/IdAnimatedField;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/id/IdAnimatedField;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/id/IdAnimatedField;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/id/IdAnimatedField;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/id/IdAnimatedField;->delete()V

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
.method public AppendFrame(Lcom/smartengines/common/Image;)V
    .locals 6

    .line 90
    iget-wide v0, p0, Lcom/smartengines/id/IdAnimatedField;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Image;->getCPtr(Lcom/smartengines/common/Image;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/id/jniidengineJNI;->IdAnimatedField_AppendFrame(JLcom/smartengines/id/IdAnimatedField;JLcom/smartengines/common/Image;)V

    return-void
.end method

.method public ClearFrames()V
    .locals 2

    .line 94
    iget-wide v0, p0, Lcom/smartengines/id/IdAnimatedField;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdAnimatedField_ClearFrames(JLcom/smartengines/id/IdAnimatedField;)V

    return-void
.end method

.method public GetBaseFieldInfo()Lcom/smartengines/id/IdBaseFieldInfo;
    .locals 4

    .line 98
    new-instance v0, Lcom/smartengines/id/IdBaseFieldInfo;

    iget-wide v1, p0, Lcom/smartengines/id/IdAnimatedField;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdAnimatedField_GetBaseFieldInfo(JLcom/smartengines/id/IdAnimatedField;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdBaseFieldInfo;-><init>(JZ)V

    return-object v0
.end method

.method public GetFrame(I)Lcom/smartengines/common/Image;
    .locals 3

    .line 86
    new-instance v0, Lcom/smartengines/common/Image;

    iget-wide v1, p0, Lcom/smartengines/id/IdAnimatedField;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdAnimatedField_GetFrame(JLcom/smartengines/id/IdAnimatedField;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v0
.end method

.method public GetFramesCount()I
    .locals 2

    .line 82
    iget-wide v0, p0, Lcom/smartengines/id/IdAnimatedField;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdAnimatedField_GetFramesCount(JLcom/smartengines/id/IdAnimatedField;)I

    move-result v0

    return v0
.end method

.method public GetMutableBaseFieldInfo()Lcom/smartengines/id/IdBaseFieldInfo;
    .locals 4

    .line 102
    new-instance v0, Lcom/smartengines/id/IdBaseFieldInfo;

    iget-wide v1, p0, Lcom/smartengines/id/IdAnimatedField;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdAnimatedField_GetMutableBaseFieldInfo(JLcom/smartengines/id/IdAnimatedField;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdBaseFieldInfo;-><init>(JZ)V

    return-object v0
.end method

.method public GetName()Ljava/lang/String;
    .locals 2

    .line 74
    iget-wide v0, p0, Lcom/smartengines/id/IdAnimatedField;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdAnimatedField_GetName(JLcom/smartengines/id/IdAnimatedField;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public SetName(Ljava/lang/String;)V
    .locals 2

    .line 78
    iget-wide v0, p0, Lcom/smartengines/id/IdAnimatedField;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdAnimatedField_SetName(JLcom/smartengines/id/IdAnimatedField;Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/id/IdAnimatedField;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/id/IdAnimatedField;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/id/IdAnimatedField;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/id/jniidengineJNI;->delete_IdAnimatedField(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/id/IdAnimatedField;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/id/IdAnimatedField;->delete()V

    return-void
.end method
