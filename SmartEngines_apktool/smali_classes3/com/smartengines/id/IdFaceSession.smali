.class public Lcom/smartengines/id/IdFaceSession;
.super Ljava/lang/Object;
.source "IdFaceSession.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/id/IdFaceSession;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/id/IdFaceSession;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/id/IdFaceSession;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/id/IdFaceSession;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/id/IdFaceSession;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/id/IdFaceSession;->delete()V

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
.method public Activate(Ljava/lang/String;)V
    .locals 2

    .line 58
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSession_Activate(JLcom/smartengines/id/IdFaceSession;Ljava/lang/String;)V

    return-void
.end method

.method public AddFaceImage(Lcom/smartengines/common/Image;)V
    .locals 6

    .line 74
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Image;->getCPtr(Lcom/smartengines/common/Image;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSession_AddFaceImage(JLcom/smartengines/id/IdFaceSession;JLcom/smartengines/common/Image;)V

    return-void
.end method

.method public GetActivationRequest()Ljava/lang/String;
    .locals 2

    .line 54
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSession_GetActivationRequest(JLcom/smartengines/id/IdFaceSession;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public GetAllowedNumberOfFailedINstructions()J
    .locals 2

    .line 102
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSession_GetAllowedNumberOfFailedINstructions(JLcom/smartengines/id/IdFaceSession;)J

    move-result-wide v0

    return-wide v0
.end method

.method public GetInitializerInstructionTime()J
    .locals 2

    .line 106
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSession_GetInitializerInstructionTime(JLcom/smartengines/id/IdFaceSession;)J

    move-result-wide v0

    return-wide v0
.end method

.method public GetInstructionsCount()J
    .locals 2

    .line 94
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSession_GetInstructionsCount(JLcom/smartengines/id/IdFaceSession;)J

    move-result-wide v0

    return-wide v0
.end method

.method public GetLivenessResult()Lcom/smartengines/id/IdFaceLivenessResult;
    .locals 4

    .line 90
    new-instance v0, Lcom/smartengines/id/IdFaceLivenessResult;

    iget-wide v1, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSession_GetLivenessResult(JLcom/smartengines/id/IdFaceSession;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdFaceLivenessResult;-><init>(JZ)V

    return-object v0
.end method

.method public GetPassAllInstruction()J
    .locals 2

    .line 110
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSession_GetPassAllInstruction(JLcom/smartengines/id/IdFaceSession;)J

    move-result-wide v0

    return-wide v0
.end method

.method public GetPushedImagesCount()J
    .locals 2

    .line 98
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSession_GetPushedImagesCount(JLcom/smartengines/id/IdFaceSession;)J

    move-result-wide v0

    return-wide v0
.end method

.method public GetRects(Lcom/smartengines/common/Image;)Lcom/smartengines/id/IdFaceRectsResult;
    .locals 7

    .line 82
    new-instance v0, Lcom/smartengines/id/IdFaceRectsResult;

    iget-wide v1, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Image;->getCPtr(Lcom/smartengines/common/Image;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSession_GetRects(JLcom/smartengines/id/IdFaceSession;JLcom/smartengines/common/Image;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdFaceRectsResult;-><init>(JZ)V

    return-object v0
.end method

.method public GetSimilarity(Lcom/smartengines/common/Image;Lcom/smartengines/common/Image;)Lcom/smartengines/id/IdFaceSimilarityResult;
    .locals 10

    .line 66
    new-instance v0, Lcom/smartengines/id/IdFaceSimilarityResult;

    iget-wide v1, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Image;->getCPtr(Lcom/smartengines/common/Image;)J

    move-result-wide v4

    invoke-static {p2}, Lcom/smartengines/common/Image;->getCPtr(Lcom/smartengines/common/Image;)J

    move-result-wide v7

    move-object v3, p0

    move-object v6, p1

    move-object v9, p2

    invoke-static/range {v1 .. v9}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSession_GetSimilarity(JLcom/smartengines/id/IdFaceSession;JLcom/smartengines/common/Image;JLcom/smartengines/common/Image;)J

    move-result-wide p1

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/id/IdFaceSimilarityResult;-><init>(JZ)V

    return-object v0
.end method

.method public GetSimilarityWith(Lcom/smartengines/common/Image;)Lcom/smartengines/id/IdFaceSimilarityResult;
    .locals 7

    .line 70
    new-instance v0, Lcom/smartengines/id/IdFaceSimilarityResult;

    iget-wide v1, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Image;->getCPtr(Lcom/smartengines/common/Image;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSession_GetSimilarityWith(JLcom/smartengines/id/IdFaceSession;JLcom/smartengines/common/Image;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdFaceSimilarityResult;-><init>(JZ)V

    return-object v0
.end method

.method public HasAccumulatedImage()Z
    .locals 2

    .line 86
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSession_HasAccumulatedImage(JLcom/smartengines/id/IdFaceSession;)Z

    move-result v0

    return v0
.end method

.method public IsActivated()Z
    .locals 2

    .line 62
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSession_IsActivated(JLcom/smartengines/id/IdFaceSession;)Z

    move-result v0

    return v0
.end method

.method public Reset()V
    .locals 2

    .line 114
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSession_Reset(JLcom/smartengines/id/IdFaceSession;)V

    return-void
.end method

.method public SetFaceToMatchWith(Lcom/smartengines/common/Image;)V
    .locals 6

    .line 78
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Image;->getCPtr(Lcom/smartengines/common/Image;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/id/jniidengineJNI;->IdFaceSession_SetFaceToMatchWith(JLcom/smartengines/id/IdFaceSession;JLcom/smartengines/common/Image;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/id/IdFaceSession;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/id/IdFaceSession;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/id/jniidengineJNI;->delete_IdFaceSession(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/id/IdFaceSession;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/id/IdFaceSession;->delete()V

    return-void
.end method
