.class public Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;
.super Ljava/lang/Object;
.source "IdVideoAuthenticationSessionSettings.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->delete()V

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
.method public AddEnabledDocumentTypes(Ljava/lang/String;)V
    .locals 2

    .line 159
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_AddEnabledDocumentTypes(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method public Clone()Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;
    .locals 4

    .line 54
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_Clone(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 55
    :cond_0
    new-instance v2, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;-><init>(JZ)V

    return-object v2
.end method

.method public EnabledDocumentTypesBegin()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 151
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_EnabledDocumentTypesBegin(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public EnabledDocumentTypesEnd()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 155
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_EnabledDocumentTypesEnd(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public GetCurrentMode()Ljava/lang/String;
    .locals 2

    .line 103
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_GetCurrentMode(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public GetCurrentVideoAuthenticationMode()Ljava/lang/String;
    .locals 2

    .line 187
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_GetCurrentVideoAuthenticationMode(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public GetDocumentInfo(Ljava/lang/String;)Lcom/smartengines/id/IdDocumentInfo;
    .locals 3

    .line 191
    new-instance v0, Lcom/smartengines/id/IdDocumentInfo;

    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_GetDocumentInfo(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdDocumentInfo;-><init>(JZ)V

    return-object v0
.end method

.method public GetEnabledDocumentTypesCount()I
    .locals 2

    .line 143
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_GetEnabledDocumentTypesCount(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)I

    move-result v0

    return v0
.end method

.method public GetInternalEnginesCount()I
    .locals 2

    .line 111
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_GetInternalEnginesCount(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)I

    move-result v0

    return v0
.end method

.method public GetOption(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 63
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_GetOption(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GetOptionsCount()I
    .locals 2

    .line 59
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_GetOptionsCount(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)I

    move-result v0

    return v0
.end method

.method public GetSupportedDocumentTypesCount(Ljava/lang/String;)I
    .locals 2

    .line 127
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_GetSupportedDocumentTypesCount(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public GetSupportedModesCount()I
    .locals 2

    .line 87
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_GetSupportedModesCount(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)I

    move-result v0

    return v0
.end method

.method public GetVideoAuthenticationModesCount()I
    .locals 2

    .line 167
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_GetVideoAuthenticationModesCount(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)I

    move-result v0

    return v0
.end method

.method public HasEnabledDocumentType(Ljava/lang/String;)Z
    .locals 2

    .line 147
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_HasEnabledDocumentType(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasInternalEngine(Ljava/lang/String;)Z
    .locals 2

    .line 115
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_HasInternalEngine(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasOption(Ljava/lang/String;)Z
    .locals 2

    .line 67
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_HasOption(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasSupportedDocumentType(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 131
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_HasSupportedDocumentType(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasSupportedMode(Ljava/lang/String;)Z
    .locals 2

    .line 91
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_HasSupportedMode(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasVideoAuthenticationMode(Ljava/lang/String;)Z
    .locals 2

    .line 171
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_HasVideoAuthenticationMode(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public InternalEngineNamesBegin()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 119
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_InternalEngineNamesBegin(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public InternalEngineNamesEnd()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 123
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_InternalEngineNamesEnd(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public IsForensicsEnabled()Z
    .locals 2

    .line 203
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_IsForensicsEnabled(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)Z

    move-result v0

    return v0
.end method

.method public OptionsBegin()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 79
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_OptionsBegin(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public OptionsEnd()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 83
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_OptionsEnd(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public PermissiblePrefixDocMasksBegin()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 195
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_PermissiblePrefixDocMasksBegin(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public PermissiblePrefixDocMasksEnd()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 199
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_PermissiblePrefixDocMasksEnd(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public RemoveEnabledDocumentTypes(Ljava/lang/String;)V
    .locals 2

    .line 163
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_RemoveEnabledDocumentTypes(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveOption(Ljava/lang/String;)V
    .locals 2

    .line 75
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_RemoveOption(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method public SetCurrentMode(Ljava/lang/String;)V
    .locals 2

    .line 107
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_SetCurrentMode(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method public SetCurrentVideoAuthenticationMode(Ljava/lang/String;)V
    .locals 2

    .line 183
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_SetCurrentVideoAuthenticationMode(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method public SetOption(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 71
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_SetOption(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public SupportedDocumentTypesBegin(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;
    .locals 3

    .line 135
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_SupportedDocumentTypesBegin(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public SupportedDocumentTypesEnd(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;
    .locals 3

    .line 139
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_SupportedDocumentTypesEnd(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public SupportedModesBegin()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 95
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_SupportedModesBegin(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public SupportedModesEnd()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 99
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_SupportedModesEnd(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public VideoAuthenticationModesBegin()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 175
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_VideoAuthenticationModesBegin(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public VideoAuthenticationModesEnd()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 179
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdVideoAuthenticationSessionSettings_VideoAuthenticationModesEnd(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J

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
    iget-wide v0, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/id/jniidengineJNI;->delete_IdVideoAuthenticationSessionSettings(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->delete()V

    return-void
.end method
