.class public Lcom/smartengines/id/IdFieldProcessingSessionSettings;
.super Ljava/lang/Object;
.source "IdFieldProcessingSessionSettings.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/id/IdFieldProcessingSessionSettings;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/id/IdFieldProcessingSessionSettings;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->delete()V

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
.method public Clone()Lcom/smartengines/id/IdFieldProcessingSessionSettings;
    .locals 4

    .line 54
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSessionSettings_Clone(JLcom/smartengines/id/IdFieldProcessingSessionSettings;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 55
    :cond_0
    new-instance v2, Lcom/smartengines/id/IdFieldProcessingSessionSettings;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/id/IdFieldProcessingSessionSettings;-><init>(JZ)V

    return-object v2
.end method

.method public GetCurrentFieldProcessor()Ljava/lang/String;
    .locals 2

    .line 75
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSessionSettings_GetCurrentFieldProcessor(JLcom/smartengines/id/IdFieldProcessingSessionSettings;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public GetOption(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 87
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSessionSettings_GetOption(JLcom/smartengines/id/IdFieldProcessingSessionSettings;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GetOptionsCount()I
    .locals 2

    .line 83
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSessionSettings_GetOptionsCount(JLcom/smartengines/id/IdFieldProcessingSessionSettings;)I

    move-result v0

    return v0
.end method

.method public GetSupportedFieldProcessorsCount()I
    .locals 2

    .line 59
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSessionSettings_GetSupportedFieldProcessorsCount(JLcom/smartengines/id/IdFieldProcessingSessionSettings;)I

    move-result v0

    return v0
.end method

.method public HasOption(Ljava/lang/String;)Z
    .locals 2

    .line 91
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSessionSettings_HasOption(JLcom/smartengines/id/IdFieldProcessingSessionSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasSupportedFieldProcessor(Ljava/lang/String;)Z
    .locals 2

    .line 63
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSessionSettings_HasSupportedFieldProcessor(JLcom/smartengines/id/IdFieldProcessingSessionSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public OptionsBegin()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 103
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSessionSettings_OptionsBegin(JLcom/smartengines/id/IdFieldProcessingSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public OptionsEnd()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 107
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSessionSettings_OptionsEnd(JLcom/smartengines/id/IdFieldProcessingSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public RemoveOption(Ljava/lang/String;)V
    .locals 2

    .line 99
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSessionSettings_RemoveOption(JLcom/smartengines/id/IdFieldProcessingSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method public SetCurrentFieldProcessor(Ljava/lang/String;)V
    .locals 2

    .line 79
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSessionSettings_SetCurrentFieldProcessor(JLcom/smartengines/id/IdFieldProcessingSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method public SetOption(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 95
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSessionSettings_SetOption(JLcom/smartengines/id/IdFieldProcessingSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public SupportedFieldProcessorsBegin()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 67
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSessionSettings_SupportedFieldProcessorsBegin(JLcom/smartengines/id/IdFieldProcessingSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public SupportedFieldProcessorsEnd()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 71
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSessionSettings_SupportedFieldProcessorsEnd(JLcom/smartengines/id/IdFieldProcessingSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/id/jniidengineJNI;->delete_IdFieldProcessingSessionSettings(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/id/IdFieldProcessingSessionSettings;->delete()V

    return-void
.end method
