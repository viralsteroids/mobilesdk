.class public Lcom/smartengines/text/TextScene;
.super Ljava/lang/Object;
.source "TextScene.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/text/TextScene;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/text/TextScene;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/text/TextScene;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/text/TextScene;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/text/TextScene;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/text/TextScene;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/text/TextScene;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/text/TextScene;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/text/TextScene;->delete()V

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
.method public CreateIterator()Lcom/smartengines/text/TextIterator;
    .locals 4

    .line 59
    iget-wide v0, p0, Lcom/smartengines/text/TextScene;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/text/jnitextengineJNI;->TextScene_CreateIterator__SWIG_1(JLcom/smartengines/text/TextScene;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 60
    :cond_0
    new-instance v2, Lcom/smartengines/text/TextIterator;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/text/TextIterator;-><init>(JZ)V

    return-object v2
.end method

.method public CreateIterator(Ljava/lang/String;)Lcom/smartengines/text/TextIterator;
    .locals 4

    .line 54
    iget-wide v0, p0, Lcom/smartengines/text/TextScene;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/text/jnitextengineJNI;->TextScene_CreateIterator__SWIG_0(JLcom/smartengines/text/TextScene;Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 55
    :cond_0
    new-instance p1, Lcom/smartengines/text/TextIterator;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, v2}, Lcom/smartengines/text/TextIterator;-><init>(JZ)V

    return-object p1
.end method

.method public GetPageImage()Lcom/smartengines/common/Image;
    .locals 4

    .line 68
    new-instance v0, Lcom/smartengines/common/Image;

    iget-wide v1, p0, Lcom/smartengines/text/TextScene;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/text/jnitextengineJNI;->TextScene_GetPageImage(JLcom/smartengines/text/TextScene;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v0
.end method

.method public IsGarbage()Z
    .locals 2

    .line 64
    iget-wide v0, p0, Lcom/smartengines/text/TextScene;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/text/jnitextengineJNI;->TextScene_IsGarbage(JLcom/smartengines/text/TextScene;)Z

    move-result v0

    return v0
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/text/TextScene;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/text/TextScene;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/text/TextScene;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/text/jnitextengineJNI;->delete_TextScene(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/text/TextScene;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/text/TextScene;->delete()V

    return-void
.end method
