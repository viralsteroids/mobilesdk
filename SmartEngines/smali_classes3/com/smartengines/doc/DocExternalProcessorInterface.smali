.class public Lcom/smartengines/doc/DocExternalProcessorInterface;
.super Ljava/lang/Object;
.source "DocExternalProcessorInterface.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 73
    invoke-static {}, Lcom/smartengines/doc/jnidocengineJNI;->new_DocExternalProcessorInterface()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/doc/DocExternalProcessorInterface;-><init>(JZ)V

    .line 74
    iget-wide v0, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCPtr:J

    invoke-static {p0, v0, v1, v2, v2}, Lcom/smartengines/doc/jnidocengineJNI;->DocExternalProcessorInterface_director_connect(Lcom/smartengines/doc/DocExternalProcessorInterface;JZZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocExternalProcessorInterface;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocExternalProcessorInterface;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/doc/DocExternalProcessorInterface;->delete()V

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
.method public Process(Lcom/smartengines/doc/DocResult;Lcom/smartengines/doc/DocProcessingSettings;Lcom/smartengines/doc/DocProcessingArguments;)V
    .locals 12

    .line 69
    iget-wide v0, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocResult;->getCPtr(Lcom/smartengines/doc/DocResult;)J

    move-result-wide v3

    invoke-static {p2}, Lcom/smartengines/doc/DocProcessingSettings;->getCPtr(Lcom/smartengines/doc/DocProcessingSettings;)J

    move-result-wide v6

    invoke-static {p3}, Lcom/smartengines/doc/DocProcessingArguments;->getCPtr(Lcom/smartengines/doc/DocProcessingArguments;)J

    move-result-wide v9

    move-object v2, p0

    move-object v5, p1

    move-object v8, p2

    move-object v11, p3

    invoke-static/range {v0 .. v11}, Lcom/smartengines/doc/jnidocengineJNI;->DocExternalProcessorInterface_Process(JLcom/smartengines/doc/DocExternalProcessorInterface;JLcom/smartengines/doc/DocResult;JLcom/smartengines/doc/DocProcessingSettings;JLcom/smartengines/doc/DocProcessingArguments;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocExternalProcessorInterface(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/doc/DocExternalProcessorInterface;->delete()V

    return-void
.end method

.method protected swigDirectorDisconnect()V
    .locals 1

    const/4 v0, 0x0

    .line 54
    iput-boolean v0, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCMemOwn:Z

    .line 55
    invoke-virtual {p0}, Lcom/smartengines/doc/DocExternalProcessorInterface;->delete()V

    return-void
.end method

.method public swigReleaseOwnership()V
    .locals 3

    const/4 v0, 0x0

    .line 59
    iput-boolean v0, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCMemOwn:Z

    .line 60
    iget-wide v1, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCPtr:J

    invoke-static {p0, v1, v2, v0}, Lcom/smartengines/doc/jnidocengineJNI;->DocExternalProcessorInterface_change_ownership(Lcom/smartengines/doc/DocExternalProcessorInterface;JZ)V

    return-void
.end method

.method public swigTakeOwnership()V
    .locals 3

    const/4 v0, 0x1

    .line 64
    iput-boolean v0, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCMemOwn:Z

    .line 65
    iget-wide v1, p0, Lcom/smartengines/doc/DocExternalProcessorInterface;->swigCPtr:J

    invoke-static {p0, v1, v2, v0}, Lcom/smartengines/doc/jnidocengineJNI;->DocExternalProcessorInterface_change_ownership(Lcom/smartengines/doc/DocExternalProcessorInterface;JZ)V

    return-void
.end method
