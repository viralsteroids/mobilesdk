.class public Lcom/smartengines/doc/DocVideoSession;
.super Ljava/lang/Object;
.source "DocVideoSession.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/doc/DocVideoSession;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/doc/DocVideoSession;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocVideoSession;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocVideoSession;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocVideoSession;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/doc/DocVideoSession;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/doc/DocVideoSession;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/doc/DocVideoSession;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/doc/DocVideoSession;->delete()V

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

    .line 63
    iget-wide v0, p0, Lcom/smartengines/doc/DocVideoSession;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocVideoSession_Activate(JLcom/smartengines/doc/DocVideoSession;Ljava/lang/String;)V

    return-void
.end method

.method public CreateProcessingSettings()Lcom/smartengines/doc/DocProcessingSettings;
    .locals 4

    .line 54
    iget-wide v0, p0, Lcom/smartengines/doc/DocVideoSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocVideoSession_CreateProcessingSettings(JLcom/smartengines/doc/DocVideoSession;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 55
    :cond_0
    new-instance v2, Lcom/smartengines/doc/DocProcessingSettings;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/doc/DocProcessingSettings;-><init>(JZ)V

    return-object v2
.end method

.method public GetActivationRequest()Ljava/lang/String;
    .locals 2

    .line 59
    iget-wide v0, p0, Lcom/smartengines/doc/DocVideoSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocVideoSession_GetActivationRequest(JLcom/smartengines/doc/DocVideoSession;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public GetCurrentResult()Lcom/smartengines/doc/DocResult;
    .locals 4

    .line 79
    new-instance v0, Lcom/smartengines/doc/DocResult;

    iget-wide v1, p0, Lcom/smartengines/doc/DocVideoSession;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocVideoSession_GetCurrentResult(JLcom/smartengines/doc/DocVideoSession;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocResult;-><init>(JZ)V

    return-object v0
.end method

.method public GetMutableCurrentResult()Lcom/smartengines/doc/DocResult;
    .locals 4

    .line 83
    new-instance v0, Lcom/smartengines/doc/DocResult;

    iget-wide v1, p0, Lcom/smartengines/doc/DocVideoSession;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocVideoSession_GetMutableCurrentResult(JLcom/smartengines/doc/DocVideoSession;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocResult;-><init>(JZ)V

    return-object v0
.end method

.method public IsActivated()Z
    .locals 2

    .line 67
    iget-wide v0, p0, Lcom/smartengines/doc/DocVideoSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocVideoSession_IsActivated(JLcom/smartengines/doc/DocVideoSession;)Z

    move-result v0

    return v0
.end method

.method public ProcessImage(Lcom/smartengines/common/Image;Lcom/smartengines/doc/DocProcessingSettings;)V
    .locals 9

    .line 71
    iget-wide v0, p0, Lcom/smartengines/doc/DocVideoSession;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Image;->getCPtr(Lcom/smartengines/common/Image;)J

    move-result-wide v3

    invoke-static {p2}, Lcom/smartengines/doc/DocProcessingSettings;->getCPtr(Lcom/smartengines/doc/DocProcessingSettings;)J

    move-result-wide v6

    move-object v2, p0

    move-object v5, p1

    move-object v8, p2

    invoke-static/range {v0 .. v8}, Lcom/smartengines/doc/jnidocengineJNI;->DocVideoSession_ProcessImage(JLcom/smartengines/doc/DocVideoSession;JLcom/smartengines/common/Image;JLcom/smartengines/doc/DocProcessingSettings;)V

    return-void
.end method

.method public Reset()V
    .locals 2

    .line 75
    iget-wide v0, p0, Lcom/smartengines/doc/DocVideoSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocVideoSession_Reset(JLcom/smartengines/doc/DocVideoSession;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocVideoSession;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/doc/DocVideoSession;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/doc/DocVideoSession;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocVideoSession(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocVideoSession;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/doc/DocVideoSession;->delete()V

    return-void
.end method
