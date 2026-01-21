.class public Lcom/smartengines/id/IdFaceSimilarityResult;
.super Ljava/lang/Object;
.source "IdFaceSimilarityResult.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 62
    invoke-static {}, Lcom/smartengines/id/jniidengineJNI;->new_IdFaceSimilarityResult__SWIG_2()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/id/IdFaceSimilarityResult;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(D)V
    .locals 1

    .line 58
    invoke-static {p1, p2}, Lcom/smartengines/id/jniidengineJNI;->new_IdFaceSimilarityResult__SWIG_1(D)J

    move-result-wide p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/smartengines/id/IdFaceSimilarityResult;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(DLcom/smartengines/id/IdFaceStatus;)V
    .locals 0

    .line 54
    invoke-virtual {p3}, Lcom/smartengines/id/IdFaceStatus;->swigValue()I

    move-result p3

    invoke-static {p1, p2, p3}, Lcom/smartengines/id/jniidengineJNI;->new_IdFaceSimilarityResult__SWIG_0(DI)J

    move-result-wide p1

    const/4 p3, 0x1

    invoke-direct {p0, p1, p2, p3}, Lcom/smartengines/id/IdFaceSimilarityResult;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/id/IdFaceSimilarityResult;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/id/IdFaceSimilarityResult;->swigCPtr:J

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/id/IdFaceSimilarityResult;)V
    .locals 2

    .line 66
    invoke-static {p1}, Lcom/smartengines/id/IdFaceSimilarityResult;->getCPtr(Lcom/smartengines/id/IdFaceSimilarityResult;)J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/smartengines/id/jniidengineJNI;->new_IdFaceSimilarityResult__SWIG_3(JLcom/smartengines/id/IdFaceSimilarityResult;)J

    move-result-wide v0

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/smartengines/id/IdFaceSimilarityResult;-><init>(JZ)V

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/id/IdFaceSimilarityResult;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSimilarityResult;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/id/IdFaceSimilarityResult;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/id/IdFaceSimilarityResult;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSimilarityResult;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/id/IdFaceSimilarityResult;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/id/IdFaceSimilarityResult;->delete()V

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
.method public GetSimilarity()Lcom/smartengines/id/IdFaceSimilarity;
    .locals 2

    .line 86
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSimilarityResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSimilarityResult_GetSimilarity(JLcom/smartengines/id/IdFaceSimilarityResult;)I

    move-result v0

    invoke-static {v0}, Lcom/smartengines/id/IdFaceSimilarity;->swigToEnum(I)Lcom/smartengines/id/IdFaceSimilarity;

    move-result-object v0

    return-object v0
.end method

.method public GetSimilarityEstimation()D
    .locals 2

    .line 70
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSimilarityResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSimilarityResult_GetSimilarityEstimation(JLcom/smartengines/id/IdFaceSimilarityResult;)D

    move-result-wide v0

    return-wide v0
.end method

.method public GetStatus()Lcom/smartengines/id/IdFaceStatus;
    .locals 2

    .line 78
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSimilarityResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSimilarityResult_GetStatus(JLcom/smartengines/id/IdFaceSimilarityResult;)I

    move-result v0

    invoke-static {v0}, Lcom/smartengines/id/IdFaceStatus;->swigToEnum(I)Lcom/smartengines/id/IdFaceStatus;

    move-result-object v0

    return-object v0
.end method

.method public SetSimilarityEstimation(D)V
    .locals 2

    .line 74
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSimilarityResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSimilarityResult_SetSimilarityEstimation(JLcom/smartengines/id/IdFaceSimilarityResult;D)V

    return-void
.end method

.method public SetStatus(Lcom/smartengines/id/IdFaceStatus;)V
    .locals 2

    .line 82
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSimilarityResult;->swigCPtr:J

    invoke-virtual {p1}, Lcom/smartengines/id/IdFaceStatus;->swigValue()I

    move-result p1

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSimilarityResult_SetStatus(JLcom/smartengines/id/IdFaceSimilarityResult;I)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSimilarityResult;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/id/IdFaceSimilarityResult;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/id/IdFaceSimilarityResult;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/id/jniidengineJNI;->delete_IdFaceSimilarityResult(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/id/IdFaceSimilarityResult;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/id/IdFaceSimilarityResult;->delete()V

    return-void
.end method
