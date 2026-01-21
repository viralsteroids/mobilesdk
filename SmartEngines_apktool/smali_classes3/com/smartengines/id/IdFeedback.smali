.class public Lcom/smartengines/id/IdFeedback;
.super Ljava/lang/Object;
.source "IdFeedback.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 89
    invoke-static {}, Lcom/smartengines/id/jniidengineJNI;->new_IdFeedback()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/id/IdFeedback;-><init>(JZ)V

    .line 90
    iget-wide v0, p0, Lcom/smartengines/id/IdFeedback;->swigCPtr:J

    invoke-static {p0, v0, v1, v2, v2}, Lcom/smartengines/id/jniidengineJNI;->IdFeedback_director_connect(Lcom/smartengines/id/IdFeedback;JZZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/id/IdFeedback;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/id/IdFeedback;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/id/IdFeedback;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/id/IdFeedback;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/id/IdFeedback;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/id/IdFeedback;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/id/IdFeedback;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/id/IdFeedback;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/id/IdFeedback;->delete()V

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
.method public FeedbackReceived(Lcom/smartengines/id/IdFeedbackContainer;)V
    .locals 6

    .line 69
    iget-wide v0, p0, Lcom/smartengines/id/IdFeedback;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdFeedbackContainer;->getCPtr(Lcom/smartengines/id/IdFeedbackContainer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/id/jniidengineJNI;->IdFeedback_FeedbackReceived(JLcom/smartengines/id/IdFeedback;JLcom/smartengines/id/IdFeedbackContainer;)V

    return-void
.end method

.method public ResultReceived(Lcom/smartengines/id/IdResult;)V
    .locals 6

    .line 81
    iget-wide v0, p0, Lcom/smartengines/id/IdFeedback;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdResult;->getCPtr(Lcom/smartengines/id/IdResult;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/id/jniidengineJNI;->IdFeedback_ResultReceived(JLcom/smartengines/id/IdFeedback;JLcom/smartengines/id/IdResult;)V

    return-void
.end method

.method public SessionEnded()V
    .locals 2

    .line 85
    iget-wide v0, p0, Lcom/smartengines/id/IdFeedback;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFeedback_SessionEnded(JLcom/smartengines/id/IdFeedback;)V

    return-void
.end method

.method public TemplateDetectionResultReceived(Lcom/smartengines/id/IdTemplateDetectionResult;)V
    .locals 6

    .line 73
    iget-wide v0, p0, Lcom/smartengines/id/IdFeedback;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdTemplateDetectionResult;->getCPtr(Lcom/smartengines/id/IdTemplateDetectionResult;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/id/jniidengineJNI;->IdFeedback_TemplateDetectionResultReceived(JLcom/smartengines/id/IdFeedback;JLcom/smartengines/id/IdTemplateDetectionResult;)V

    return-void
.end method

.method public TemplateSegmentationResultReceived(Lcom/smartengines/id/IdTemplateSegmentationResult;)V
    .locals 6

    .line 77
    iget-wide v0, p0, Lcom/smartengines/id/IdFeedback;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdTemplateSegmentationResult;->getCPtr(Lcom/smartengines/id/IdTemplateSegmentationResult;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/id/jniidengineJNI;->IdFeedback_TemplateSegmentationResultReceived(JLcom/smartengines/id/IdFeedback;JLcom/smartengines/id/IdTemplateSegmentationResult;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/id/IdFeedback;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/id/IdFeedback;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/id/IdFeedback;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/id/jniidengineJNI;->delete_IdFeedback(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/id/IdFeedback;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/id/IdFeedback;->delete()V

    return-void
.end method

.method protected swigDirectorDisconnect()V
    .locals 1

    const/4 v0, 0x0

    .line 54
    iput-boolean v0, p0, Lcom/smartengines/id/IdFeedback;->swigCMemOwn:Z

    .line 55
    invoke-virtual {p0}, Lcom/smartengines/id/IdFeedback;->delete()V

    return-void
.end method

.method public swigReleaseOwnership()V
    .locals 3

    const/4 v0, 0x0

    .line 59
    iput-boolean v0, p0, Lcom/smartengines/id/IdFeedback;->swigCMemOwn:Z

    .line 60
    iget-wide v1, p0, Lcom/smartengines/id/IdFeedback;->swigCPtr:J

    invoke-static {p0, v1, v2, v0}, Lcom/smartengines/id/jniidengineJNI;->IdFeedback_change_ownership(Lcom/smartengines/id/IdFeedback;JZ)V

    return-void
.end method

.method public swigTakeOwnership()V
    .locals 3

    const/4 v0, 0x1

    .line 64
    iput-boolean v0, p0, Lcom/smartengines/id/IdFeedback;->swigCMemOwn:Z

    .line 65
    iget-wide v1, p0, Lcom/smartengines/id/IdFeedback;->swigCPtr:J

    invoke-static {p0, v1, v2, v0}, Lcom/smartengines/id/jniidengineJNI;->IdFeedback_change_ownership(Lcom/smartengines/id/IdFeedback;JZ)V

    return-void
.end method
