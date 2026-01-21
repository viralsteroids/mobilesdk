.class public Lcom/smartengines/id/IdEngine;
.super Ljava/lang/Object;
.source "IdEngine.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/id/IdEngine;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    return-void
.end method

.method public static Create(Ljava/lang/String;)Lcom/smartengines/id/IdEngine;
    .locals 4

    .line 149
    invoke-static {p0}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_Create__SWIG_3(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 150
    :cond_0
    new-instance p0, Lcom/smartengines/id/IdEngine;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/id/IdEngine;-><init>(JZ)V

    return-object p0
.end method

.method public static Create(Ljava/lang/String;Z)Lcom/smartengines/id/IdEngine;
    .locals 2

    .line 144
    invoke-static {p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_Create__SWIG_2(Ljava/lang/String;Z)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 145
    :cond_0
    new-instance v0, Lcom/smartengines/id/IdEngine;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lcom/smartengines/id/IdEngine;-><init>(JZ)V

    return-object v0
.end method

.method public static Create(Ljava/lang/String;ZI)Lcom/smartengines/id/IdEngine;
    .locals 2

    .line 139
    invoke-static {p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_Create__SWIG_1(Ljava/lang/String;ZI)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long p2, p0, v0

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 140
    :cond_0
    new-instance p2, Lcom/smartengines/id/IdEngine;

    const/4 v0, 0x1

    invoke-direct {p2, p0, p1, v0}, Lcom/smartengines/id/IdEngine;-><init>(JZ)V

    return-object p2
.end method

.method public static Create(Ljava/lang/String;ZIZ)Lcom/smartengines/id/IdEngine;
    .locals 0

    .line 134
    invoke-static {p0, p1, p2, p3}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_Create__SWIG_0(Ljava/lang/String;ZIZ)J

    move-result-wide p0

    const-wide/16 p2, 0x0

    cmp-long p2, p0, p2

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 135
    :cond_0
    new-instance p2, Lcom/smartengines/id/IdEngine;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p1, p3}, Lcom/smartengines/id/IdEngine;-><init>(JZ)V

    return-object p2
.end method

.method public static Create([B)Lcom/smartengines/id/IdEngine;
    .locals 4

    .line 169
    invoke-static {p0}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_Create__SWIG_7([B)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 170
    :cond_0
    new-instance p0, Lcom/smartengines/id/IdEngine;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/id/IdEngine;-><init>(JZ)V

    return-object p0
.end method

.method public static Create([BZ)Lcom/smartengines/id/IdEngine;
    .locals 2

    .line 164
    invoke-static {p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_Create__SWIG_6([BZ)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 165
    :cond_0
    new-instance v0, Lcom/smartengines/id/IdEngine;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lcom/smartengines/id/IdEngine;-><init>(JZ)V

    return-object v0
.end method

.method public static Create([BZI)Lcom/smartengines/id/IdEngine;
    .locals 2

    .line 159
    invoke-static {p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_Create__SWIG_5([BZI)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long p2, p0, v0

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 160
    :cond_0
    new-instance p2, Lcom/smartengines/id/IdEngine;

    const/4 v0, 0x1

    invoke-direct {p2, p0, p1, v0}, Lcom/smartengines/id/IdEngine;-><init>(JZ)V

    return-object p2
.end method

.method public static Create([BZIZ)Lcom/smartengines/id/IdEngine;
    .locals 0

    .line 154
    invoke-static {p0, p1, p2, p3}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_Create__SWIG_4([BZIZ)J

    move-result-wide p0

    const-wide/16 p2, 0x0

    cmp-long p2, p0, p2

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 155
    :cond_0
    new-instance p2, Lcom/smartengines/id/IdEngine;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p1, p3}, Lcom/smartengines/id/IdEngine;-><init>(JZ)V

    return-object p2
.end method

.method public static CreateFromEmbeddedBundle()Lcom/smartengines/id/IdEngine;
    .locals 4

    .line 189
    invoke-static {}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_CreateFromEmbeddedBundle__SWIG_3()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 190
    :cond_0
    new-instance v2, Lcom/smartengines/id/IdEngine;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/id/IdEngine;-><init>(JZ)V

    return-object v2
.end method

.method public static CreateFromEmbeddedBundle(Z)Lcom/smartengines/id/IdEngine;
    .locals 4

    .line 184
    invoke-static {p0}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_CreateFromEmbeddedBundle__SWIG_2(Z)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 185
    :cond_0
    new-instance p0, Lcom/smartengines/id/IdEngine;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/id/IdEngine;-><init>(JZ)V

    return-object p0
.end method

.method public static CreateFromEmbeddedBundle(ZI)Lcom/smartengines/id/IdEngine;
    .locals 2

    .line 179
    invoke-static {p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_CreateFromEmbeddedBundle__SWIG_1(ZI)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 180
    :cond_0
    new-instance v0, Lcom/smartengines/id/IdEngine;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lcom/smartengines/id/IdEngine;-><init>(JZ)V

    return-object v0
.end method

.method public static CreateFromEmbeddedBundle(ZIZ)Lcom/smartengines/id/IdEngine;
    .locals 2

    .line 174
    invoke-static {p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_CreateFromEmbeddedBundle__SWIG_0(ZIZ)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long p2, p0, v0

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 175
    :cond_0
    new-instance p2, Lcom/smartengines/id/IdEngine;

    const/4 v0, 0x1

    invoke-direct {p2, p0, p1, v0}, Lcom/smartengines/id/IdEngine;-><init>(JZ)V

    return-object p2
.end method

.method public static GetVersion()Ljava/lang/String;
    .locals 1

    .line 194
    invoke-static {}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_GetVersion()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getCPtr(Lcom/smartengines/id/IdEngine;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/id/IdEngine;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/id/IdEngine;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/id/IdEngine;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/id/IdEngine;->delete()V

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
.method public CreateFaceSessionSettings()Lcom/smartengines/id/IdFaceSessionSettings;
    .locals 4

    .line 79
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_CreateFaceSessionSettings(JLcom/smartengines/id/IdEngine;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 80
    :cond_0
    new-instance v2, Lcom/smartengines/id/IdFaceSessionSettings;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/id/IdFaceSessionSettings;-><init>(JZ)V

    return-object v2
.end method

.method public CreateFieldProcessingSessionSettings()Lcom/smartengines/id/IdFieldProcessingSessionSettings;
    .locals 4

    .line 99
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_CreateFieldProcessingSessionSettings(JLcom/smartengines/id/IdEngine;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 100
    :cond_0
    new-instance v2, Lcom/smartengines/id/IdFieldProcessingSessionSettings;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/id/IdFieldProcessingSessionSettings;-><init>(JZ)V

    return-object v2
.end method

.method public CreateFileAnalysisSessionSettings()Lcom/smartengines/id/IdFileAnalysisSessionSettings;
    .locals 4

    .line 69
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_CreateFileAnalysisSessionSettings(JLcom/smartengines/id/IdEngine;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 70
    :cond_0
    new-instance v2, Lcom/smartengines/id/IdFileAnalysisSessionSettings;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/id/IdFileAnalysisSessionSettings;-><init>(JZ)V

    return-object v2
.end method

.method public CreateSessionSettings()Lcom/smartengines/id/IdSessionSettings;
    .locals 4

    .line 54
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_CreateSessionSettings(JLcom/smartengines/id/IdEngine;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 55
    :cond_0
    new-instance v2, Lcom/smartengines/id/IdSessionSettings;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/id/IdSessionSettings;-><init>(JZ)V

    return-object v2
.end method

.method public CreateVideoAuthenticationSessionSettings()Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;
    .locals 4

    .line 109
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_CreateVideoAuthenticationSessionSettings(JLcom/smartengines/id/IdEngine;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 110
    :cond_0
    new-instance v2, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;-><init>(JZ)V

    return-object v2
.end method

.method public ProcessOneShotLiveness(Lcom/smartengines/common/Image;)Lcom/smartengines/id/IdFaceOslResult;
    .locals 6

    .line 94
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Image;->getCPtr(Lcom/smartengines/common/Image;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_ProcessOneShotLiveness(JLcom/smartengines/id/IdEngine;JLcom/smartengines/common/Image;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 95
    :cond_0
    new-instance p1, Lcom/smartengines/id/IdFaceOslResult;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, v2}, Lcom/smartengines/id/IdFaceOslResult;-><init>(JZ)V

    return-object p1
.end method

.method public SpawnFaceSession(Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;)Lcom/smartengines/id/IdFaceSession;
    .locals 7

    .line 89
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdFaceSessionSettings;->getCPtr(Lcom/smartengines/id/IdFaceSessionSettings;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_SpawnFaceSession__SWIG_1(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 90
    :cond_0
    new-instance v0, Lcom/smartengines/id/IdFaceSession;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/id/IdFaceSession;-><init>(JZ)V

    return-object v0
.end method

.method public SpawnFaceSession(Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;Lcom/smartengines/id/IdFaceFeedback;)Lcom/smartengines/id/IdFaceSession;
    .locals 10

    .line 84
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdFaceSessionSettings;->getCPtr(Lcom/smartengines/id/IdFaceSessionSettings;)J

    move-result-wide v3

    invoke-static {p3}, Lcom/smartengines/id/IdFaceFeedback;->getCPtr(Lcom/smartengines/id/IdFaceFeedback;)J

    move-result-wide v7

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    move-object v9, p3

    invoke-static/range {v0 .. v9}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_SpawnFaceSession__SWIG_0(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;JLcom/smartengines/id/IdFaceFeedback;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 85
    :cond_0
    new-instance p3, Lcom/smartengines/id/IdFaceSession;

    const/4 v0, 0x1

    invoke-direct {p3, p1, p2, v0}, Lcom/smartengines/id/IdFaceSession;-><init>(JZ)V

    return-object p3
.end method

.method public SpawnFieldProcessingSession(Lcom/smartengines/id/IdFieldProcessingSessionSettings;Ljava/lang/String;)Lcom/smartengines/id/IdFieldProcessingSession;
    .locals 7

    .line 104
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->getCPtr(Lcom/smartengines/id/IdFieldProcessingSessionSettings;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_SpawnFieldProcessingSession(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdFieldProcessingSessionSettings;Ljava/lang/String;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 105
    :cond_0
    new-instance v0, Lcom/smartengines/id/IdFieldProcessingSession;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/id/IdFieldProcessingSession;-><init>(JZ)V

    return-object v0
.end method

.method public SpawnFileAnalysisSession(Lcom/smartengines/id/IdFileAnalysisSessionSettings;Ljava/lang/String;)Lcom/smartengines/id/IdFileAnalysisSession;
    .locals 7

    .line 74
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdFileAnalysisSessionSettings;->getCPtr(Lcom/smartengines/id/IdFileAnalysisSessionSettings;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_SpawnFileAnalysisSession(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdFileAnalysisSessionSettings;Ljava/lang/String;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 75
    :cond_0
    new-instance v0, Lcom/smartengines/id/IdFileAnalysisSession;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/id/IdFileAnalysisSession;-><init>(JZ)V

    return-object v0
.end method

.method public SpawnSession(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)Lcom/smartengines/id/IdSession;
    .locals 7

    .line 64
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdSessionSettings;->getCPtr(Lcom/smartengines/id/IdSessionSettings;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_SpawnSession__SWIG_1(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 65
    :cond_0
    new-instance v0, Lcom/smartengines/id/IdSession;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/id/IdSession;-><init>(JZ)V

    return-object v0
.end method

.method public SpawnSession(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Lcom/smartengines/id/IdFeedback;)Lcom/smartengines/id/IdSession;
    .locals 10

    .line 59
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdSessionSettings;->getCPtr(Lcom/smartengines/id/IdSessionSettings;)J

    move-result-wide v3

    invoke-static {p3}, Lcom/smartengines/id/IdFeedback;->getCPtr(Lcom/smartengines/id/IdFeedback;)J

    move-result-wide v7

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    move-object v9, p3

    invoke-static/range {v0 .. v9}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_SpawnSession__SWIG_0(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;JLcom/smartengines/id/IdFeedback;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 60
    :cond_0
    new-instance p3, Lcom/smartengines/id/IdSession;

    const/4 v0, 0x1

    invoke-direct {p3, p1, p2, v0}, Lcom/smartengines/id/IdSession;-><init>(JZ)V

    return-object p3
.end method

.method public SpawnVideoAuthenticationSession(Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)Lcom/smartengines/id/IdVideoAuthenticationSession;
    .locals 7

    .line 129
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->getCPtr(Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_SpawnVideoAuthenticationSession__SWIG_3(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 130
    :cond_0
    new-instance v0, Lcom/smartengines/id/IdVideoAuthenticationSession;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/id/IdVideoAuthenticationSession;-><init>(JZ)V

    return-object v0
.end method

.method public SpawnVideoAuthenticationSession(Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;Lcom/smartengines/id/IdVideoAuthenticationCallbacks;)Lcom/smartengines/id/IdVideoAuthenticationSession;
    .locals 10

    .line 124
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->getCPtr(Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

    move-result-wide v3

    invoke-static {p3}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->getCPtr(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;)J

    move-result-wide v7

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    move-object v9, p3

    invoke-static/range {v0 .. v9}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_SpawnVideoAuthenticationSession__SWIG_2(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;JLcom/smartengines/id/IdVideoAuthenticationCallbacks;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 125
    :cond_0
    new-instance p3, Lcom/smartengines/id/IdVideoAuthenticationSession;

    const/4 v0, 0x1

    invoke-direct {p3, p1, p2, v0}, Lcom/smartengines/id/IdVideoAuthenticationSession;-><init>(JZ)V

    return-object p3
.end method

.method public SpawnVideoAuthenticationSession(Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;Lcom/smartengines/id/IdVideoAuthenticationCallbacks;Lcom/smartengines/id/IdFeedback;)Lcom/smartengines/id/IdVideoAuthenticationSession;
    .locals 13

    .line 119
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->getCPtr(Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

    move-result-wide v3

    invoke-static/range {p3 .. p3}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->getCPtr(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;)J

    move-result-wide v7

    invoke-static/range {p4 .. p4}, Lcom/smartengines/id/IdFeedback;->getCPtr(Lcom/smartengines/id/IdFeedback;)J

    move-result-wide v10

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    move-object/from16 v9, p3

    move-object/from16 v12, p4

    invoke-static/range {v0 .. v12}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_SpawnVideoAuthenticationSession__SWIG_1(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;JLcom/smartengines/id/IdVideoAuthenticationCallbacks;JLcom/smartengines/id/IdFeedback;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 120
    :cond_0
    new-instance v0, Lcom/smartengines/id/IdVideoAuthenticationSession;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/id/IdVideoAuthenticationSession;-><init>(JZ)V

    return-object v0
.end method

.method public SpawnVideoAuthenticationSession(Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;Lcom/smartengines/id/IdVideoAuthenticationCallbacks;Lcom/smartengines/id/IdFeedback;Lcom/smartengines/id/IdFaceFeedback;)Lcom/smartengines/id/IdVideoAuthenticationSession;
    .locals 18

    move-object/from16 v4, p0

    .line 114
    iget-wide v2, v4, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    invoke-static/range {p1 .. p1}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->getCPtr(Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

    move-result-wide v5

    invoke-static/range {p3 .. p3}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->getCPtr(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;)J

    move-result-wide v9

    invoke-static/range {p4 .. p4}, Lcom/smartengines/id/IdFeedback;->getCPtr(Lcom/smartengines/id/IdFeedback;)J

    move-result-wide v12

    invoke-static/range {p5 .. p5}, Lcom/smartengines/id/IdFaceFeedback;->getCPtr(Lcom/smartengines/id/IdFaceFeedback;)J

    move-result-wide v15

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v11, p3

    move-object/from16 v14, p4

    move-object/from16 v17, p5

    invoke-static/range {v2 .. v17}, Lcom/smartengines/id/jniidengineJNI;->IdEngine_SpawnVideoAuthenticationSession__SWIG_0(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;JLcom/smartengines/id/IdVideoAuthenticationCallbacks;JLcom/smartengines/id/IdFeedback;JLcom/smartengines/id/IdFaceFeedback;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 115
    :cond_0
    new-instance v2, Lcom/smartengines/id/IdVideoAuthenticationSession;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/id/IdVideoAuthenticationSession;-><init>(JZ)V

    return-object v2
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/id/IdEngine;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/id/IdEngine;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/id/jniidengineJNI;->delete_IdEngine(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/id/IdEngine;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/id/IdEngine;->delete()V

    return-void
.end method
