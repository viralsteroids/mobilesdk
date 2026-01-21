.class public Lcom/smartengines/doc/DocSessionSettings;
.super Ljava/lang/Object;
.source "DocSessionSettings.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocSessionSettings;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocSessionSettings;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/doc/DocSessionSettings;->delete()V

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

    .line 147
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_AddEnabledDocumentTypes(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method public Clone()Lcom/smartengines/doc/DocSessionSettings;
    .locals 4

    .line 54
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_Clone(JLcom/smartengines/doc/DocSessionSettings;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 55
    :cond_0
    new-instance v2, Lcom/smartengines/doc/DocSessionSettings;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/doc/DocSessionSettings;-><init>(JZ)V

    return-object v2
.end method

.method public DisableForensics()V
    .locals 2

    .line 171
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_DisableForensics(JLcom/smartengines/doc/DocSessionSettings;)V

    return-void
.end method

.method public EnableForensics()V
    .locals 2

    .line 167
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_EnableForensics(JLcom/smartengines/doc/DocSessionSettings;)V

    return-void
.end method

.method public GetCurrentMode()Ljava/lang/String;
    .locals 2

    .line 107
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_GetCurrentMode(JLcom/smartengines/doc/DocSessionSettings;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public GetDocumentInfo(Ljava/lang/String;)Lcom/smartengines/doc/DocDocumentInfo;
    .locals 3

    .line 143
    new-instance v0, Lcom/smartengines/doc/DocDocumentInfo;

    iget-wide v1, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_GetDocumentInfo(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocDocumentInfo;-><init>(JZ)V

    return-object v0
.end method

.method public GetEnabledDocumentType(I)Ljava/lang/String;
    .locals 2

    .line 139
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_GetEnabledDocumentType(JLcom/smartengines/doc/DocSessionSettings;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GetEnabledDocumentTypesCount()I
    .locals 2

    .line 131
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_GetEnabledDocumentTypesCount(JLcom/smartengines/doc/DocSessionSettings;)I

    move-result v0

    return v0
.end method

.method public GetInternalEnginesCount()I
    .locals 2

    .line 115
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_GetInternalEnginesCount(JLcom/smartengines/doc/DocSessionSettings;)I

    move-result v0

    return v0
.end method

.method public GetOption(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 67
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_GetOption(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GetOptionsCount()I
    .locals 2

    .line 59
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_GetOptionsCount(JLcom/smartengines/doc/DocSessionSettings;)I

    move-result v0

    return v0
.end method

.method public GetSupportedDocumentType(II)Ljava/lang/String;
    .locals 2

    .line 127
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_GetSupportedDocumentType(JLcom/smartengines/doc/DocSessionSettings;II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GetSupportedDocumentTypesCount(I)I
    .locals 2

    .line 119
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_GetSupportedDocumentTypesCount(JLcom/smartengines/doc/DocSessionSettings;I)I

    move-result p1

    return p1
.end method

.method public GetSupportedMode(I)Ljava/lang/String;
    .locals 2

    .line 95
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_GetSupportedMode(JLcom/smartengines/doc/DocSessionSettings;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GetSupportedModesCount()I
    .locals 2

    .line 87
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_GetSupportedModesCount(JLcom/smartengines/doc/DocSessionSettings;)I

    move-result v0

    return v0
.end method

.method public HasEnabledDocumentType(Ljava/lang/String;)Z
    .locals 2

    .line 135
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_HasEnabledDocumentType(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasOption(Ljava/lang/String;)Z
    .locals 2

    .line 63
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_HasOption(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasSupportedDocumentType(ILjava/lang/String;)Z
    .locals 2

    .line 123
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_HasSupportedDocumentType(JLcom/smartengines/doc/DocSessionSettings;ILjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasSupportedMode(Ljava/lang/String;)Z
    .locals 2

    .line 91
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_HasSupportedMode(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public IsForensicsEnabled()Z
    .locals 2

    .line 163
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_IsForensicsEnabled(JLcom/smartengines/doc/DocSessionSettings;)Z

    move-result v0

    return v0
.end method

.method public OptionsBegin()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 79
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_OptionsBegin(JLcom/smartengines/doc/DocSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public OptionsEnd()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 83
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_OptionsEnd(JLcom/smartengines/doc/DocSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public PermissiblePrefixDocMasksBegin()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 155
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_PermissiblePrefixDocMasksBegin(JLcom/smartengines/doc/DocSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public PermissiblePrefixDocMasksEnd()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 159
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_PermissiblePrefixDocMasksEnd(JLcom/smartengines/doc/DocSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public RemoveEnabledDocumentTypes(Ljava/lang/String;)V
    .locals 2

    .line 151
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_RemoveEnabledDocumentTypes(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveOption(Ljava/lang/String;)V
    .locals 2

    .line 75
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_RemoveOption(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method public SetCurrentMode(Ljava/lang/String;)V
    .locals 2

    .line 111
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_SetCurrentMode(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method public SetOption(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 71
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_SetOption(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public SupportedModesBegin()Lcom/smartengines/common/StringsVectorIterator;
    .locals 4

    .line 99
    new-instance v0, Lcom/smartengines/common/StringsVectorIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_SupportedModesBegin(JLcom/smartengines/doc/DocSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsVectorIterator;-><init>(JZ)V

    return-object v0
.end method

.method public SupportedModesEnd()Lcom/smartengines/common/StringsVectorIterator;
    .locals 4

    .line 103
    new-instance v0, Lcom/smartengines/common/StringsVectorIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocSessionSettings_SupportedModesEnd(JLcom/smartengines/doc/DocSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsVectorIterator;-><init>(JZ)V

    return-object v0
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocSessionSettings(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocSessionSettings;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/doc/DocSessionSettings;->delete()V

    return-void
.end method
