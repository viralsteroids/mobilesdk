.class public Lcom/smartengines/text/TextEngine;
.super Ljava/lang/Object;
.source "TextEngine.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/text/TextEngine;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/text/TextEngine;->swigCPtr:J

    return-void
.end method

.method public static Create(Ljava/lang/String;)Lcom/smartengines/text/TextEngine;
    .locals 4

    .line 74
    invoke-static {p0}, Lcom/smartengines/text/jnitextengineJNI;->TextEngine_Create__SWIG_1(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 75
    :cond_0
    new-instance p0, Lcom/smartengines/text/TextEngine;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/text/TextEngine;-><init>(JZ)V

    return-object p0
.end method

.method public static Create(Ljava/lang/String;Z)Lcom/smartengines/text/TextEngine;
    .locals 2

    .line 69
    invoke-static {p0, p1}, Lcom/smartengines/text/jnitextengineJNI;->TextEngine_Create__SWIG_0(Ljava/lang/String;Z)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 70
    :cond_0
    new-instance v0, Lcom/smartengines/text/TextEngine;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lcom/smartengines/text/TextEngine;-><init>(JZ)V

    return-object v0
.end method

.method public static Create([B)Lcom/smartengines/text/TextEngine;
    .locals 4

    .line 84
    invoke-static {p0}, Lcom/smartengines/text/jnitextengineJNI;->TextEngine_Create__SWIG_3([B)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 85
    :cond_0
    new-instance p0, Lcom/smartengines/text/TextEngine;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/text/TextEngine;-><init>(JZ)V

    return-object p0
.end method

.method public static Create([BZ)Lcom/smartengines/text/TextEngine;
    .locals 2

    .line 79
    invoke-static {p0, p1}, Lcom/smartengines/text/jnitextengineJNI;->TextEngine_Create__SWIG_2([BZ)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 80
    :cond_0
    new-instance v0, Lcom/smartengines/text/TextEngine;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lcom/smartengines/text/TextEngine;-><init>(JZ)V

    return-object v0
.end method

.method public static CreateFromEmbeddedBundle()Lcom/smartengines/text/TextEngine;
    .locals 4

    .line 94
    invoke-static {}, Lcom/smartengines/text/jnitextengineJNI;->TextEngine_CreateFromEmbeddedBundle__SWIG_1()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 95
    :cond_0
    new-instance v2, Lcom/smartengines/text/TextEngine;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/text/TextEngine;-><init>(JZ)V

    return-object v2
.end method

.method public static CreateFromEmbeddedBundle(Z)Lcom/smartengines/text/TextEngine;
    .locals 4

    .line 89
    invoke-static {p0}, Lcom/smartengines/text/jnitextengineJNI;->TextEngine_CreateFromEmbeddedBundle__SWIG_0(Z)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 90
    :cond_0
    new-instance p0, Lcom/smartengines/text/TextEngine;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/text/TextEngine;-><init>(JZ)V

    return-object p0
.end method

.method public static GetVersion()Ljava/lang/String;
    .locals 1

    .line 99
    invoke-static {}, Lcom/smartengines/text/jnitextengineJNI;->TextEngine_GetVersion()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getCPtr(Lcom/smartengines/text/TextEngine;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/text/TextEngine;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/text/TextEngine;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/text/TextEngine;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/text/TextEngine;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/text/TextEngine;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/text/TextEngine;->delete()V

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
.method public CreateSessionSettings()Lcom/smartengines/text/TextSessionSettings;
    .locals 4

    .line 54
    iget-wide v0, p0, Lcom/smartengines/text/TextEngine;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/text/jnitextengineJNI;->TextEngine_CreateSessionSettings(JLcom/smartengines/text/TextEngine;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 55
    :cond_0
    new-instance v2, Lcom/smartengines/text/TextSessionSettings;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/text/TextSessionSettings;-><init>(JZ)V

    return-object v2
.end method

.method public SpawnSession(Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;)Lcom/smartengines/text/TextSession;
    .locals 7

    .line 64
    iget-wide v0, p0, Lcom/smartengines/text/TextEngine;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/text/TextSessionSettings;->getCPtr(Lcom/smartengines/text/TextSessionSettings;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/text/jnitextengineJNI;->TextEngine_SpawnSession__SWIG_1(JLcom/smartengines/text/TextEngine;JLcom/smartengines/text/TextSessionSettings;Ljava/lang/String;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 65
    :cond_0
    new-instance v0, Lcom/smartengines/text/TextSession;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/text/TextSession;-><init>(JZ)V

    return-object v0
.end method

.method public SpawnSession(Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;Lcom/smartengines/text/TextFeedback;)Lcom/smartengines/text/TextSession;
    .locals 10

    .line 59
    iget-wide v0, p0, Lcom/smartengines/text/TextEngine;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/text/TextSessionSettings;->getCPtr(Lcom/smartengines/text/TextSessionSettings;)J

    move-result-wide v3

    invoke-static {p3}, Lcom/smartengines/text/TextFeedback;->getCPtr(Lcom/smartengines/text/TextFeedback;)J

    move-result-wide v7

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    move-object v9, p3

    invoke-static/range {v0 .. v9}, Lcom/smartengines/text/jnitextengineJNI;->TextEngine_SpawnSession__SWIG_0(JLcom/smartengines/text/TextEngine;JLcom/smartengines/text/TextSessionSettings;Ljava/lang/String;JLcom/smartengines/text/TextFeedback;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 60
    :cond_0
    new-instance p3, Lcom/smartengines/text/TextSession;

    const/4 v0, 0x1

    invoke-direct {p3, p1, p2, v0}, Lcom/smartengines/text/TextSession;-><init>(JZ)V

    return-object p3
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/text/TextEngine;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/text/TextEngine;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/text/TextEngine;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/text/jnitextengineJNI;->delete_TextEngine(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/text/TextEngine;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/text/TextEngine;->delete()V

    return-void
.end method
