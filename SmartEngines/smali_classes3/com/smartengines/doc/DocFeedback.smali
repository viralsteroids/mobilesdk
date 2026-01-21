.class public Lcom/smartengines/doc/DocFeedback;
.super Ljava/lang/Object;
.source "DocFeedback.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 109
    invoke-static {}, Lcom/smartengines/doc/jnidocengineJNI;->new_DocFeedback()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/doc/DocFeedback;-><init>(JZ)V

    .line 110
    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {p0, v0, v1, v2, v2}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_director_connect(Lcom/smartengines/doc/DocFeedback;JZZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/doc/DocFeedback;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocFeedback;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocFeedback;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/doc/DocFeedback;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/doc/DocFeedback;->delete()V

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
.method public AcceptsPagePreprocessingFeedback()Z
    .locals 2

    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/smartengines/doc/DocFeedback;

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_AcceptsPagePreprocessingFeedback(JLcom/smartengines/doc/DocFeedback;)Z

    move-result v0

    return v0

    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_AcceptsPagePreprocessingFeedbackSwigExplicitDocFeedback(JLcom/smartengines/doc/DocFeedback;)Z

    move-result v0

    return v0
.end method

.method public AcceptsPagesLocalizationFeedback()Z
    .locals 2

    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/smartengines/doc/DocFeedback;

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_AcceptsPagesLocalizationFeedback(JLcom/smartengines/doc/DocFeedback;)Z

    move-result v0

    return v0

    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_AcceptsPagesLocalizationFeedbackSwigExplicitDocFeedback(JLcom/smartengines/doc/DocFeedback;)Z

    move-result v0

    return v0
.end method

.method public AcceptsRawFieldsLocalizationFeedback()Z
    .locals 2

    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/smartengines/doc/DocFeedback;

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_AcceptsRawFieldsLocalizationFeedback(JLcom/smartengines/doc/DocFeedback;)Z

    move-result v0

    return v0

    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_AcceptsRawFieldsLocalizationFeedbackSwigExplicitDocFeedback(JLcom/smartengines/doc/DocFeedback;)Z

    move-result v0

    return v0
.end method

.method public AcceptsRawFieldsRecognitionFeedback()Z
    .locals 2

    .line 97
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/smartengines/doc/DocFeedback;

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_AcceptsRawFieldsRecognitionFeedback(JLcom/smartengines/doc/DocFeedback;)Z

    move-result v0

    return v0

    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_AcceptsRawFieldsRecognitionFeedbackSwigExplicitDocFeedback(JLcom/smartengines/doc/DocFeedback;)Z

    move-result v0

    return v0
.end method

.method public FeedbackReceived(Lcom/smartengines/doc/DocFeedbackContainer;)V
    .locals 6

    .line 69
    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocFeedbackContainer;->getCPtr(Lcom/smartengines/doc/DocFeedbackContainer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_FeedbackReceived(JLcom/smartengines/doc/DocFeedback;JLcom/smartengines/doc/DocFeedbackContainer;)V

    return-void
.end method

.method public PagePrepocessingFeedbackReceived(Lcom/smartengines/doc/DocPagesFeedbackContainer;)V
    .locals 6

    .line 85
    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocPagesFeedbackContainer;->getCPtr(Lcom/smartengines/doc/DocPagesFeedbackContainer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_PagePrepocessingFeedbackReceived(JLcom/smartengines/doc/DocFeedback;JLcom/smartengines/doc/DocPagesFeedbackContainer;)V

    return-void
.end method

.method public PagesLocalizationFeedbackReceived(Lcom/smartengines/doc/DocPagesFeedbackContainer;)V
    .locals 6

    .line 77
    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocPagesFeedbackContainer;->getCPtr(Lcom/smartengines/doc/DocPagesFeedbackContainer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_PagesLocalizationFeedbackReceived(JLcom/smartengines/doc/DocFeedback;JLcom/smartengines/doc/DocPagesFeedbackContainer;)V

    return-void
.end method

.method public RawFiedlsRecognitionFeedbackReceived(Lcom/smartengines/doc/DocRawFieldsFeedbackContainer;)V
    .locals 6

    .line 101
    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocRawFieldsFeedbackContainer;->getCPtr(Lcom/smartengines/doc/DocRawFieldsFeedbackContainer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_RawFiedlsRecognitionFeedbackReceived(JLcom/smartengines/doc/DocFeedback;JLcom/smartengines/doc/DocRawFieldsFeedbackContainer;)V

    return-void
.end method

.method public RawFieldsLocalizationFeedbackReceived(Lcom/smartengines/doc/DocRawFieldsFeedbackContainer;)V
    .locals 6

    .line 93
    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocRawFieldsFeedbackContainer;->getCPtr(Lcom/smartengines/doc/DocRawFieldsFeedbackContainer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_RawFieldsLocalizationFeedbackReceived(JLcom/smartengines/doc/DocFeedback;JLcom/smartengines/doc/DocRawFieldsFeedbackContainer;)V

    return-void
.end method

.method public ResultReceived(Lcom/smartengines/doc/DocResult;)V
    .locals 6

    .line 105
    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocResult;->getCPtr(Lcom/smartengines/doc/DocResult;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_ResultReceived(JLcom/smartengines/doc/DocFeedback;JLcom/smartengines/doc/DocResult;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/doc/DocFeedback;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/doc/DocFeedback;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocFeedback(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/doc/DocFeedback;->delete()V

    return-void
.end method

.method protected swigDirectorDisconnect()V
    .locals 1

    const/4 v0, 0x0

    .line 54
    iput-boolean v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCMemOwn:Z

    .line 55
    invoke-virtual {p0}, Lcom/smartengines/doc/DocFeedback;->delete()V

    return-void
.end method

.method public swigReleaseOwnership()V
    .locals 3

    const/4 v0, 0x0

    .line 59
    iput-boolean v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCMemOwn:Z

    .line 60
    iget-wide v1, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {p0, v1, v2, v0}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_change_ownership(Lcom/smartengines/doc/DocFeedback;JZ)V

    return-void
.end method

.method public swigTakeOwnership()V
    .locals 3

    const/4 v0, 0x1

    .line 64
    iput-boolean v0, p0, Lcom/smartengines/doc/DocFeedback;->swigCMemOwn:Z

    .line 65
    iget-wide v1, p0, Lcom/smartengines/doc/DocFeedback;->swigCPtr:J

    invoke-static {p0, v1, v2, v0}, Lcom/smartengines/doc/jnidocengineJNI;->DocFeedback_change_ownership(Lcom/smartengines/doc/DocFeedback;JZ)V

    return-void
.end method
