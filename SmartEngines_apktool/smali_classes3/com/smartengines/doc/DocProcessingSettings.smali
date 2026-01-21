.class public Lcom/smartengines/doc/DocProcessingSettings;
.super Ljava/lang/Object;
.source "DocProcessingSettings.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocProcessingSettings;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocProcessingSettings;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/doc/DocProcessingSettings;->delete()V

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
.method public AvailableRoutinesBegin()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 130
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_AvailableRoutinesBegin(JLcom/smartengines/doc/DocProcessingSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public AvailableRoutinesEnd()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 134
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_AvailableRoutinesEnd(JLcom/smartengines/doc/DocProcessingSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public BindFeedbackReporter(Lcom/smartengines/doc/DocFeedback;)V
    .locals 6

    .line 158
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocFeedback;->getCPtr(Lcom/smartengines/doc/DocFeedback;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_BindFeedbackReporter(JLcom/smartengines/doc/DocProcessingSettings;JLcom/smartengines/doc/DocFeedback;)V

    return-void
.end method

.method public GetAvailableRoutinesCount()I
    .locals 2

    .line 122
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_GetAvailableRoutinesCount(JLcom/smartengines/doc/DocProcessingSettings;)I

    move-result v0

    return v0
.end method

.method public GetCurrentSourceID()I
    .locals 2

    .line 114
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_GetCurrentSourceID(JLcom/smartengines/doc/DocProcessingSettings;)I

    move-result v0

    return v0
.end method

.method public GetEnabledDocumentType(I)Ljava/lang/String;
    .locals 2

    .line 110
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_GetEnabledDocumentType(JLcom/smartengines/doc/DocProcessingSettings;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GetEnabledDocumentTypesCount()I
    .locals 2

    .line 102
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_GetEnabledDocumentTypesCount(JLcom/smartengines/doc/DocProcessingSettings;)I

    move-result v0

    return v0
.end method

.method public GetFeedbackReporter()Lcom/smartengines/doc/DocFeedback;
    .locals 4

    .line 162
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_GetFeedbackReporter(JLcom/smartengines/doc/DocProcessingSettings;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 163
    :cond_0
    new-instance v2, Lcom/smartengines/doc/DocFeedback;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/doc/DocFeedback;-><init>(JZ)V

    return-object v2
.end method

.method public GetOption(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 62
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_GetOption(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GetOptionsCount()I
    .locals 2

    .line 54
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_GetOptionsCount(JLcom/smartengines/doc/DocProcessingSettings;)I

    move-result v0

    return v0
.end method

.method public GetSessionOption(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 90
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_GetSessionOption(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GetSessionOptionsCount()I
    .locals 2

    .line 82
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_GetSessionOptionsCount(JLcom/smartengines/doc/DocProcessingSettings;)I

    move-result v0

    return v0
.end method

.method public HasAvailableRoutine(Ljava/lang/String;)Z
    .locals 2

    .line 126
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_HasAvailableRoutine(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasEnabledDocumentType(Ljava/lang/String;)Z
    .locals 2

    .line 106
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_HasEnabledDocumentType(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasOption(Ljava/lang/String;)Z
    .locals 2

    .line 58
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_HasOption(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasSessionOption(Ljava/lang/String;)Z
    .locals 2

    .line 86
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_HasSessionOption(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public OptionsBegin()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 74
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_OptionsBegin(JLcom/smartengines/doc/DocProcessingSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public OptionsEnd()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 78
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_OptionsEnd(JLcom/smartengines/doc/DocProcessingSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public RemoveOption(Ljava/lang/String;)V
    .locals 2

    .line 70
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_RemoveOption(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;)V

    return-void
.end method

.method public RoutinesQueueClear()V
    .locals 2

    .line 154
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_RoutinesQueueClear(JLcom/smartengines/doc/DocProcessingSettings;)V

    return-void
.end method

.method public RoutinesQueueFront()Ljava/lang/String;
    .locals 2

    .line 142
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_RoutinesQueueFront(JLcom/smartengines/doc/DocProcessingSettings;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public RoutinesQueuePop()V
    .locals 2

    .line 150
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_RoutinesQueuePop(JLcom/smartengines/doc/DocProcessingSettings;)V

    return-void
.end method

.method public RoutinesQueuePush(Ljava/lang/String;)V
    .locals 2

    .line 146
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_RoutinesQueuePush(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;)V

    return-void
.end method

.method public RoutinesQueueSize()I
    .locals 2

    .line 138
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_RoutinesQueueSize(JLcom/smartengines/doc/DocProcessingSettings;)I

    move-result v0

    return v0
.end method

.method public SessionOptionsBegin()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 94
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_SessionOptionsBegin(JLcom/smartengines/doc/DocProcessingSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public SessionOptionsEnd()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 98
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_SessionOptionsEnd(JLcom/smartengines/doc/DocProcessingSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public SetCurrentSourceID(I)V
    .locals 2

    .line 118
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_SetCurrentSourceID(JLcom/smartengines/doc/DocProcessingSettings;I)V

    return-void
.end method

.method public SetOption(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 66
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocProcessingSettings_SetOption(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocProcessingSettings(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocProcessingSettings;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/doc/DocProcessingSettings;->delete()V

    return-void
.end method
