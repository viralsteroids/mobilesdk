.class public Lcom/smartengines/id/IdSessionSettings;
.super Ljava/lang/Object;
.source "IdSessionSettings.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/id/IdSessionSettings;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/id/IdSessionSettings;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/id/IdSessionSettings;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/id/IdSessionSettings;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/id/IdSessionSettings;->delete()V

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
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_AddEnabledDocumentTypes(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method public Clone()Lcom/smartengines/id/IdSessionSettings;
    .locals 4

    .line 54
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_Clone(JLcom/smartengines/id/IdSessionSettings;)J

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

.method public DisableField(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 211
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_DisableField(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public DisableForensicField(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 267
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_DisableForensicField(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public DisableForensics()V
    .locals 2

    .line 223
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_DisableForensics(JLcom/smartengines/id/IdSessionSettings;)V

    return-void
.end method

.method public EnableField(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 207
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_EnableField(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public EnableForensicField(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 263
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_EnableForensicField(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public EnableForensics()V
    .locals 2

    .line 219
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_EnableForensics(JLcom/smartengines/id/IdSessionSettings;)V

    return-void
.end method

.method public EnabledDocumentTypesBegin()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 151
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_EnabledDocumentTypesBegin(JLcom/smartengines/id/IdSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public EnabledDocumentTypesEnd()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 155
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_EnabledDocumentTypesEnd(JLcom/smartengines/id/IdSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public EnabledFieldsBegin(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;
    .locals 3

    .line 199
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_EnabledFieldsBegin(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public EnabledFieldsEnd(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;
    .locals 3

    .line 203
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_EnabledFieldsEnd(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public EnabledForensicFieldsBegin(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;
    .locals 3

    .line 255
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_EnabledForensicFieldsBegin(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public EnabledForensicFieldsEnd(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;
    .locals 3

    .line 259
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_EnabledForensicFieldsEnd(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public GetCurrentMode()Ljava/lang/String;
    .locals 2

    .line 103
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_GetCurrentMode(JLcom/smartengines/id/IdSessionSettings;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public GetDocumentInfo(Ljava/lang/String;)Lcom/smartengines/id/IdDocumentInfo;
    .locals 3

    .line 167
    new-instance v0, Lcom/smartengines/id/IdDocumentInfo;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_GetDocumentInfo(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdDocumentInfo;-><init>(JZ)V

    return-object v0
.end method

.method public GetEnabledDocumentTypesCount()I
    .locals 2

    .line 143
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_GetEnabledDocumentTypesCount(JLcom/smartengines/id/IdSessionSettings;)I

    move-result v0

    return v0
.end method

.method public GetEnabledFieldsCount(Ljava/lang/String;)I
    .locals 2

    .line 191
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_GetEnabledFieldsCount(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public GetEnabledForensicFieldsCount(Ljava/lang/String;)I
    .locals 2

    .line 247
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_GetEnabledForensicFieldsCount(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public GetFieldType(Ljava/lang/String;Ljava/lang/String;)Lcom/smartengines/id/IdFieldType;
    .locals 2

    .line 187
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_GetFieldType(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Lcom/smartengines/id/IdFieldType;->swigToEnum(I)Lcom/smartengines/id/IdFieldType;

    move-result-object p1

    return-object p1
.end method

.method public GetForensicFieldType(Ljava/lang/String;Ljava/lang/String;)Lcom/smartengines/id/IdFieldType;
    .locals 2

    .line 243
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_GetForensicFieldType(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Lcom/smartengines/id/IdFieldType;->swigToEnum(I)Lcom/smartengines/id/IdFieldType;

    move-result-object p1

    return-object p1
.end method

.method public GetInternalEnginesCount()I
    .locals 2

    .line 111
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_GetInternalEnginesCount(JLcom/smartengines/id/IdSessionSettings;)I

    move-result v0

    return v0
.end method

.method public GetOption(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 63
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_GetOption(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GetOptionsCount()I
    .locals 2

    .line 59
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_GetOptionsCount(JLcom/smartengines/id/IdSessionSettings;)I

    move-result v0

    return v0
.end method

.method public GetSupportedDocumentTypesCount(Ljava/lang/String;)I
    .locals 2

    .line 127
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_GetSupportedDocumentTypesCount(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public GetSupportedFieldsCount(Ljava/lang/String;)I
    .locals 2

    .line 171
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_GetSupportedFieldsCount(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public GetSupportedForensicFieldsCount(Ljava/lang/String;)I
    .locals 2

    .line 227
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_GetSupportedForensicFieldsCount(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public GetSupportedModesCount()I
    .locals 2

    .line 87
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_GetSupportedModesCount(JLcom/smartengines/id/IdSessionSettings;)I

    move-result v0

    return v0
.end method

.method public HasEnabledDocumentType(Ljava/lang/String;)Z
    .locals 2

    .line 147
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_HasEnabledDocumentType(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasEnabledField(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 195
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_HasEnabledField(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasEnabledForensicField(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 251
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_HasEnabledForensicField(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasInternalEngine(Ljava/lang/String;)Z
    .locals 2

    .line 115
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_HasInternalEngine(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasOption(Ljava/lang/String;)Z
    .locals 2

    .line 67
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_HasOption(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasSupportedDocumentType(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 131
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_HasSupportedDocumentType(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasSupportedField(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 175
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_HasSupportedField(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasSupportedForensicField(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 231
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_HasSupportedForensicField(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasSupportedMode(Ljava/lang/String;)Z
    .locals 2

    .line 91
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_HasSupportedMode(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public InternalEngineNamesBegin()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 119
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_InternalEngineNamesBegin(JLcom/smartengines/id/IdSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public InternalEngineNamesEnd()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 123
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_InternalEngineNamesEnd(JLcom/smartengines/id/IdSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public IsForensicsEnabled()Z
    .locals 2

    .line 215
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_IsForensicsEnabled(JLcom/smartengines/id/IdSessionSettings;)Z

    move-result v0

    return v0
.end method

.method public OptionsBegin()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 79
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_OptionsBegin(JLcom/smartengines/id/IdSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public OptionsEnd()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 83
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_OptionsEnd(JLcom/smartengines/id/IdSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public PermissiblePrefixDocMasksBegin()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 271
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_PermissiblePrefixDocMasksBegin(JLcom/smartengines/id/IdSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public PermissiblePrefixDocMasksEnd()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 275
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_PermissiblePrefixDocMasksEnd(JLcom/smartengines/id/IdSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public RemoveEnabledDocumentTypes(Ljava/lang/String;)V
    .locals 2

    .line 163
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_RemoveEnabledDocumentTypes(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveOption(Ljava/lang/String;)V
    .locals 2

    .line 75
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_RemoveOption(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method public SetCurrentMode(Ljava/lang/String;)V
    .locals 2

    .line 107
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_SetCurrentMode(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method public SetOption(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 71
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_SetOption(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public SupportedDocumentTypesBegin(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;
    .locals 3

    .line 135
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_SupportedDocumentTypesBegin(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public SupportedDocumentTypesEnd(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;
    .locals 3

    .line 139
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_SupportedDocumentTypesEnd(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public SupportedFieldsBegin(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;
    .locals 3

    .line 179
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_SupportedFieldsBegin(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public SupportedFieldsEnd(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;
    .locals 3

    .line 183
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_SupportedFieldsEnd(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public SupportedForensicFieldsBegin(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;
    .locals 3

    .line 235
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_SupportedForensicFieldsBegin(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public SupportedForensicFieldsEnd(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;
    .locals 3

    .line 239
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_SupportedForensicFieldsEnd(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public SupportedModesBegin()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 95
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_SupportedModesBegin(JLcom/smartengines/id/IdSessionSettings;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public SupportedModesEnd()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 99
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdSessionSettings_SupportedModesEnd(JLcom/smartengines/id/IdSessionSettings;)J

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
    iget-wide v0, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/id/IdSessionSettings;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/id/IdSessionSettings;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/id/jniidengineJNI;->delete_IdSessionSettings(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/id/IdSessionSettings;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/id/IdSessionSettings;->delete()V

    return-void
.end method
