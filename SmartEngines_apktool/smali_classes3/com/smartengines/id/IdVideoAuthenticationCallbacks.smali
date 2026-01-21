.class public Lcom/smartengines/id/IdVideoAuthenticationCallbacks;
.super Ljava/lang/Object;
.source "IdVideoAuthenticationCallbacks.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 109
    invoke-static {}, Lcom/smartengines/id/jniidengineJNI;->new_IdVideoAuthenticationCallbacks()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;-><init>(JZ)V

    .line 110
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    invoke-static {p0, v0, v1, v2, v2}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationCallbacks_director_connect(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;JZZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->delete()V

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
.method public AnomalyRegistered(ILcom/smartengines/id/IdVideoAuthenticationAnomaly;)V
    .locals 7

    .line 73
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/id/IdVideoAuthenticationAnomaly;->getCPtr(Lcom/smartengines/id/IdVideoAuthenticationAnomaly;)J

    move-result-wide v4

    move-object v2, p0

    move v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationCallbacks_AnomalyRegistered(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;IJLcom/smartengines/id/IdVideoAuthenticationAnomaly;)V

    return-void
.end method

.method public AuthenticationStatusUpdated(Lcom/smartengines/id/IdCheckStatus;)V
    .locals 2

    .line 89
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    invoke-virtual {p1}, Lcom/smartengines/id/IdCheckStatus;->swigValue()I

    move-result p1

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationCallbacks_AuthenticationStatusUpdated(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;I)V

    return-void
.end method

.method public DocumentResultUpdated(Lcom/smartengines/id/IdResult;)V
    .locals 6

    .line 77
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdResult;->getCPtr(Lcom/smartengines/id/IdResult;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationCallbacks_DocumentResultUpdated(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;JLcom/smartengines/id/IdResult;)V

    return-void
.end method

.method public FaceLivenessResultUpdated(Lcom/smartengines/id/IdFaceLivenessResult;)V
    .locals 6

    .line 85
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdFaceLivenessResult;->getCPtr(Lcom/smartengines/id/IdFaceLivenessResult;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationCallbacks_FaceLivenessResultUpdated(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;JLcom/smartengines/id/IdFaceLivenessResult;)V

    return-void
.end method

.method public FaceMatchingResultUpdated(Lcom/smartengines/id/IdFaceSimilarityResult;)V
    .locals 6

    .line 81
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdFaceSimilarityResult;->getCPtr(Lcom/smartengines/id/IdFaceSimilarityResult;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationCallbacks_FaceMatchingResultUpdated(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;JLcom/smartengines/id/IdFaceSimilarityResult;)V

    return-void
.end method

.method public GlobalTimeoutReached()V
    .locals 2

    .line 93
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationCallbacks_GlobalTimeoutReached(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;)V

    return-void
.end method

.method public InstructionReceived(ILcom/smartengines/id/IdVideoAuthenticationInstruction;)V
    .locals 7

    .line 69
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/id/IdVideoAuthenticationInstruction;->getCPtr(Lcom/smartengines/id/IdVideoAuthenticationInstruction;)J

    move-result-wide v4

    move-object v2, p0

    move v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationCallbacks_InstructionReceived(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;IJLcom/smartengines/id/IdVideoAuthenticationInstruction;)V

    return-void
.end method

.method public InstructionTimeoutReached()V
    .locals 2

    .line 97
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationCallbacks_InstructionTimeoutReached(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;)V

    return-void
.end method

.method public MessageReceived(Ljava/lang/String;)V
    .locals 2

    .line 105
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationCallbacks_MessageReceived(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;Ljava/lang/String;)V

    return-void
.end method

.method public SessionEnded()V
    .locals 2

    .line 101
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationCallbacks_SessionEnded(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/id/jniidengineJNI;->delete_IdVideoAuthenticationCallbacks(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->delete()V

    return-void
.end method

.method protected swigDirectorDisconnect()V
    .locals 1

    const/4 v0, 0x0

    .line 54
    iput-boolean v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCMemOwn:Z

    .line 55
    invoke-virtual {p0}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->delete()V

    return-void
.end method

.method public swigReleaseOwnership()V
    .locals 3

    const/4 v0, 0x0

    .line 59
    iput-boolean v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCMemOwn:Z

    .line 60
    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    invoke-static {p0, v1, v2, v0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationCallbacks_change_ownership(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;JZ)V

    return-void
.end method

.method public swigTakeOwnership()V
    .locals 3

    const/4 v0, 0x1

    .line 64
    iput-boolean v0, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCMemOwn:Z

    .line 65
    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->swigCPtr:J

    invoke-static {p0, v1, v2, v0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationCallbacks_change_ownership(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;JZ)V

    return-void
.end method
