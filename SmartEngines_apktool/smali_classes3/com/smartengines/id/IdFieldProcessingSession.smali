.class public Lcom/smartengines/id/IdFieldProcessingSession;
.super Ljava/lang/Object;
.source "IdFieldProcessingSession.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/id/IdFieldProcessingSession;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/id/IdFieldProcessingSession;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/id/IdFieldProcessingSession;->delete()V

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
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_Activate(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)V

    return-void
.end method

.method public AnimatedFieldsBegin()Lcom/smartengines/id/IdAnimatedFieldsMapIterator;
    .locals 4

    .line 146
    new-instance v0, Lcom/smartengines/id/IdAnimatedFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_AnimatedFieldsBegin(JLcom/smartengines/id/IdFieldProcessingSession;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdAnimatedFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public AnimatedFieldsEnd()Lcom/smartengines/id/IdAnimatedFieldsMapIterator;
    .locals 4

    .line 150
    new-instance v0, Lcom/smartengines/id/IdAnimatedFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_AnimatedFieldsEnd(JLcom/smartengines/id/IdFieldProcessingSession;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdAnimatedFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public CheckFieldsBegin()Lcom/smartengines/id/IdCheckFieldsMapIterator;
    .locals 4

    .line 174
    new-instance v0, Lcom/smartengines/id/IdCheckFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_CheckFieldsBegin(JLcom/smartengines/id/IdFieldProcessingSession;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdCheckFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public CheckFieldsEnd()Lcom/smartengines/id/IdCheckFieldsMapIterator;
    .locals 4

    .line 178
    new-instance v0, Lcom/smartengines/id/IdCheckFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_CheckFieldsEnd(JLcom/smartengines/id/IdFieldProcessingSession;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdCheckFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public GetActivationRequest()Ljava/lang/String;
    .locals 2

    .line 54
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_GetActivationRequest(JLcom/smartengines/id/IdFieldProcessingSession;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public GetAnimatedField(Ljava/lang/String;)Lcom/smartengines/id/IdAnimatedField;
    .locals 3

    .line 134
    new-instance v0, Lcom/smartengines/id/IdAnimatedField;

    iget-wide v1, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_GetAnimatedField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdAnimatedField;-><init>(JZ)V

    return-object v0
.end method

.method public GetAnimatedFieldsCount()I
    .locals 2

    .line 126
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_GetAnimatedFieldsCount(JLcom/smartengines/id/IdFieldProcessingSession;)I

    move-result v0

    return v0
.end method

.method public GetCheckField(Ljava/lang/String;)Lcom/smartengines/id/IdCheckField;
    .locals 3

    .line 162
    new-instance v0, Lcom/smartengines/id/IdCheckField;

    iget-wide v1, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_GetCheckField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdCheckField;-><init>(JZ)V

    return-object v0
.end method

.method public GetCheckFieldsCount()I
    .locals 2

    .line 154
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_GetCheckFieldsCount(JLcom/smartengines/id/IdFieldProcessingSession;)I

    move-result v0

    return v0
.end method

.method public GetImageField(Ljava/lang/String;)Lcom/smartengines/id/IdImageField;
    .locals 3

    .line 106
    new-instance v0, Lcom/smartengines/id/IdImageField;

    iget-wide v1, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_GetImageField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdImageField;-><init>(JZ)V

    return-object v0
.end method

.method public GetImageFieldsCount()I
    .locals 2

    .line 98
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_GetImageFieldsCount(JLcom/smartengines/id/IdFieldProcessingSession;)I

    move-result v0

    return v0
.end method

.method public GetTextField(Ljava/lang/String;)Lcom/smartengines/id/IdTextField;
    .locals 3

    .line 78
    new-instance v0, Lcom/smartengines/id/IdTextField;

    iget-wide v1, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_GetTextField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdTextField;-><init>(JZ)V

    return-object v0
.end method

.method public GetTextFieldsCount()I
    .locals 2

    .line 70
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_GetTextFieldsCount(JLcom/smartengines/id/IdFieldProcessingSession;)I

    move-result v0

    return v0
.end method

.method public HasAnimatedField(Ljava/lang/String;)Z
    .locals 2

    .line 130
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_HasAnimatedField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasCheckField(Ljava/lang/String;)Z
    .locals 2

    .line 158
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_HasCheckField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasImageField(Ljava/lang/String;)Z
    .locals 2

    .line 102
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_HasImageField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasTextField(Ljava/lang/String;)Z
    .locals 2

    .line 74
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_HasTextField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public ImageFieldsBegin()Lcom/smartengines/id/IdImageFieldsMapIterator;
    .locals 4

    .line 118
    new-instance v0, Lcom/smartengines/id/IdImageFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_ImageFieldsBegin(JLcom/smartengines/id/IdFieldProcessingSession;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdImageFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ImageFieldsEnd()Lcom/smartengines/id/IdImageFieldsMapIterator;
    .locals 4

    .line 122
    new-instance v0, Lcom/smartengines/id/IdImageFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_ImageFieldsEnd(JLcom/smartengines/id/IdFieldProcessingSession;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdImageFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public IsActivated()Z
    .locals 2

    .line 62
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_IsActivated(JLcom/smartengines/id/IdFieldProcessingSession;)Z

    move-result v0

    return v0
.end method

.method public Process()V
    .locals 2

    .line 66
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_Process(JLcom/smartengines/id/IdFieldProcessingSession;)V

    return-void
.end method

.method public RemoveAnimatedField(Ljava/lang/String;)V
    .locals 2

    .line 142
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_RemoveAnimatedField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveCheckField(Ljava/lang/String;)V
    .locals 2

    .line 170
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_RemoveCheckField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveImageField(Ljava/lang/String;)V
    .locals 2

    .line 114
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_RemoveImageField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveTextField(Ljava/lang/String;)V
    .locals 2

    .line 86
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_RemoveTextField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)V

    return-void
.end method

.method public Reset()V
    .locals 2

    .line 182
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_Reset(JLcom/smartengines/id/IdFieldProcessingSession;)V

    return-void
.end method

.method public SetAnimatedField(Ljava/lang/String;Lcom/smartengines/id/IdAnimatedField;)V
    .locals 7

    .line 138
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/id/IdAnimatedField;->getCPtr(Lcom/smartengines/id/IdAnimatedField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_SetAnimatedField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;JLcom/smartengines/id/IdAnimatedField;)V

    return-void
.end method

.method public SetCheckField(Ljava/lang/String;Lcom/smartengines/id/IdCheckField;)V
    .locals 7

    .line 166
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/id/IdCheckField;->getCPtr(Lcom/smartengines/id/IdCheckField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_SetCheckField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;JLcom/smartengines/id/IdCheckField;)V

    return-void
.end method

.method public SetImageField(Ljava/lang/String;Lcom/smartengines/id/IdImageField;)V
    .locals 7

    .line 110
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/id/IdImageField;->getCPtr(Lcom/smartengines/id/IdImageField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_SetImageField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;JLcom/smartengines/id/IdImageField;)V

    return-void
.end method

.method public SetTextField(Ljava/lang/String;Lcom/smartengines/id/IdTextField;)V
    .locals 7

    .line 82
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/id/IdTextField;->getCPtr(Lcom/smartengines/id/IdTextField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_SetTextField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;JLcom/smartengines/id/IdTextField;)V

    return-void
.end method

.method public TextFieldsBegin()Lcom/smartengines/id/IdTextFieldsMapIterator;
    .locals 4

    .line 90
    new-instance v0, Lcom/smartengines/id/IdTextFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_TextFieldsBegin(JLcom/smartengines/id/IdFieldProcessingSession;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdTextFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public TextFieldsEnd()Lcom/smartengines/id/IdTextFieldsMapIterator;
    .locals 4

    .line 94
    new-instance v0, Lcom/smartengines/id/IdTextFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdFieldProcessingSession_TextFieldsEnd(JLcom/smartengines/id/IdFieldProcessingSession;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdTextFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/id/jniidengineJNI;->delete_IdFieldProcessingSession(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/id/IdFieldProcessingSession;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/id/IdFieldProcessingSession;->delete()V

    return-void
.end method
