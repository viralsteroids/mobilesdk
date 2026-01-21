.class public Lcom/smartengines/id/IdFaceLivenessResult;
.super Ljava/lang/Object;
.source "IdFaceLivenessResult.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 58
    invoke-static {}, Lcom/smartengines/id/jniidengineJNI;->new_IdFaceLivenessResult__SWIG_1()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/id/IdFaceLivenessResult;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(D)V
    .locals 1

    .line 54
    invoke-static {p1, p2}, Lcom/smartengines/id/jniidengineJNI;->new_IdFaceLivenessResult__SWIG_0(D)J

    move-result-wide p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/smartengines/id/IdFaceLivenessResult;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/id/IdFaceLivenessResult;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/id/IdFaceLivenessResult;->swigCPtr:J

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/id/IdFaceLivenessResult;)V
    .locals 2

    .line 62
    invoke-static {p1}, Lcom/smartengines/id/IdFaceLivenessResult;->getCPtr(Lcom/smartengines/id/IdFaceLivenessResult;)J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/smartengines/id/jniidengineJNI;->new_IdFaceLivenessResult__SWIG_2(JLcom/smartengines/id/IdFaceLivenessResult;)J

    move-result-wide v0

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/smartengines/id/IdFaceLivenessResult;-><init>(JZ)V

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/id/IdFaceLivenessResult;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceLivenessResult;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/id/IdFaceLivenessResult;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/id/IdFaceLivenessResult;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceLivenessResult;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/id/IdFaceLivenessResult;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/id/IdFaceLivenessResult;->delete()V

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
.method public GetLivenessEstimation()D
    .locals 2

    .line 66
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceLivenessResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFaceLivenessResult_GetLivenessEstimation(JLcom/smartengines/id/IdFaceLivenessResult;)D

    move-result-wide v0

    return-wide v0
.end method

.method public GetLivenessInstruction()Ljava/lang/String;
    .locals 2

    .line 74
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceLivenessResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFaceLivenessResult_GetLivenessInstruction(JLcom/smartengines/id/IdFaceLivenessResult;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public SetLivenessEstimation(D)V
    .locals 2

    .line 70
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceLivenessResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdFaceLivenessResult_SetLivenessEstimation(JLcom/smartengines/id/IdFaceLivenessResult;D)V

    return-void
.end method

.method public SetLivenessInstruction(Ljava/lang/String;)V
    .locals 2

    .line 78
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceLivenessResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFaceLivenessResult_SetLivenessInstruction(JLcom/smartengines/id/IdFaceLivenessResult;Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceLivenessResult;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/id/IdFaceLivenessResult;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/id/IdFaceLivenessResult;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/id/jniidengineJNI;->delete_IdFaceLivenessResult(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/id/IdFaceLivenessResult;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/id/IdFaceLivenessResult;->delete()V

    return-void
.end method
