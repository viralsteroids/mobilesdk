.class public Lcom/smartengines/code/CodeEngineSession;
.super Ljava/lang/Object;
.source "CodeEngineSession.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/code/CodeEngineSession;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/code/CodeEngineSession;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/code/CodeEngineSession;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/code/CodeEngineSession;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/code/CodeEngineSession;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/code/CodeEngineSession;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/code/CodeEngineSession;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/code/CodeEngineSession;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/code/CodeEngineSession;->delete()V

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
    iget-wide v0, p0, Lcom/smartengines/code/CodeEngineSession;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/code/jnicodeengineJNI;->CodeEngineSession_Activate(JLcom/smartengines/code/CodeEngineSession;Ljava/lang/String;)V

    return-void
.end method

.method public GetActivationRequest()Ljava/lang/String;
    .locals 2

    .line 54
    iget-wide v0, p0, Lcom/smartengines/code/CodeEngineSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeEngineSession_GetActivationRequest(JLcom/smartengines/code/CodeEngineSession;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public GetCurrentResult()Lcom/smartengines/code/CodeEngineResult;
    .locals 4

    .line 74
    new-instance v0, Lcom/smartengines/code/CodeEngineResult;

    iget-wide v1, p0, Lcom/smartengines/code/CodeEngineSession;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeEngineSession_GetCurrentResult(JLcom/smartengines/code/CodeEngineSession;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/code/CodeEngineResult;-><init>(JZ)V

    return-object v0
.end method

.method public IsActivated()Z
    .locals 2

    .line 62
    iget-wide v0, p0, Lcom/smartengines/code/CodeEngineSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeEngineSession_IsActivated(JLcom/smartengines/code/CodeEngineSession;)Z

    move-result v0

    return v0
.end method

.method public IsResultTerminal()Z
    .locals 2

    .line 78
    iget-wide v0, p0, Lcom/smartengines/code/CodeEngineSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeEngineSession_IsResultTerminal(JLcom/smartengines/code/CodeEngineSession;)Z

    move-result v0

    return v0
.end method

.method public Process(Lcom/smartengines/common/ByteString;)Lcom/smartengines/code/CodeEngineResult;
    .locals 7

    .line 70
    new-instance v0, Lcom/smartengines/code/CodeEngineResult;

    iget-wide v1, p0, Lcom/smartengines/code/CodeEngineSession;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/ByteString;->getCPtr(Lcom/smartengines/common/ByteString;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/code/jnicodeengineJNI;->CodeEngineSession_Process__SWIG_1(JLcom/smartengines/code/CodeEngineSession;JLcom/smartengines/common/ByteString;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/code/CodeEngineResult;-><init>(JZ)V

    return-object v0
.end method

.method public Process(Lcom/smartengines/common/Image;)Lcom/smartengines/code/CodeEngineResult;
    .locals 7

    .line 66
    new-instance v0, Lcom/smartengines/code/CodeEngineResult;

    iget-wide v1, p0, Lcom/smartengines/code/CodeEngineSession;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Image;->getCPtr(Lcom/smartengines/common/Image;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/code/jnicodeengineJNI;->CodeEngineSession_Process__SWIG_0(JLcom/smartengines/code/CodeEngineSession;JLcom/smartengines/common/Image;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/code/CodeEngineResult;-><init>(JZ)V

    return-object v0
.end method

.method public Reset()V
    .locals 2

    .line 82
    iget-wide v0, p0, Lcom/smartengines/code/CodeEngineSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeEngineSession_Reset(JLcom/smartengines/code/CodeEngineSession;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/code/CodeEngineSession;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/code/CodeEngineSession;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/code/CodeEngineSession;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/code/jnicodeengineJNI;->delete_CodeEngineSession(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/code/CodeEngineSession;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/code/CodeEngineSession;->delete()V

    return-void
.end method
