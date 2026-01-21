.class public Lcom/smartengines/doc/DocPageInfo;
.super Ljava/lang/Object;
.source "DocPageInfo.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/doc/DocPageInfo;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/doc/DocPageInfo;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocPageInfo;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocPageInfo;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocPageInfo;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/doc/DocPageInfo;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/doc/DocPageInfo;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/doc/DocPageInfo;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/doc/DocPageInfo;->delete()V

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
.method public GarbageReason(I)Ljava/lang/String;
    .locals 2

    .line 62
    iget-wide v0, p0, Lcom/smartengines/doc/DocPageInfo;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPageInfo_GarbageReason(JLcom/smartengines/doc/DocPageInfo;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GarbageReasonsCount()I
    .locals 2

    .line 58
    iget-wide v0, p0, Lcom/smartengines/doc/DocPageInfo;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocPageInfo_GarbageReasonsCount(JLcom/smartengines/doc/DocPageInfo;)I

    move-result v0

    return v0
.end method

.method public IsGarbage()Z
    .locals 2

    .line 54
    iget-wide v0, p0, Lcom/smartengines/doc/DocPageInfo;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocPageInfo_IsGarbage(JLcom/smartengines/doc/DocPageInfo;)Z

    move-result v0

    return v0
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocPageInfo;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/doc/DocPageInfo;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/doc/DocPageInfo;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocPageInfo(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocPageInfo;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/doc/DocPageInfo;->delete()V

    return-void
.end method
