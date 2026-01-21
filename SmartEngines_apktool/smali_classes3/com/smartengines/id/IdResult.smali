.class public Lcom/smartengines/id/IdResult;
.super Ljava/lang/Object;
.source "IdResult.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 58
    invoke-static {}, Lcom/smartengines/id/jniidengineJNI;->new_IdResult__SWIG_1()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/id/IdResult;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/id/IdResult;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/id/IdResult;)V
    .locals 2

    .line 62
    invoke-static {p1}, Lcom/smartengines/id/IdResult;->getCPtr(Lcom/smartengines/id/IdResult;)J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/smartengines/id/jniidengineJNI;->new_IdResult__SWIG_2(JLcom/smartengines/id/IdResult;)J

    move-result-wide v0

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/smartengines/id/IdResult;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    .line 54
    invoke-static {p1}, Lcom/smartengines/id/jniidengineJNI;->new_IdResult__SWIG_0(Z)J

    move-result-wide v0

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/smartengines/id/IdResult;-><init>(JZ)V

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/id/IdResult;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/id/IdResult;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/id/IdResult;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/id/IdResult;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/id/IdResult;->delete()V

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
.method public AnimatedFieldsBegin()Lcom/smartengines/id/IdAnimatedFieldsMapIterator;
    .locals 4

    .line 198
    new-instance v0, Lcom/smartengines/id/IdAnimatedFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_AnimatedFieldsBegin(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdAnimatedFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public AnimatedFieldsEnd()Lcom/smartengines/id/IdAnimatedFieldsMapIterator;
    .locals 4

    .line 202
    new-instance v0, Lcom/smartengines/id/IdAnimatedFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_AnimatedFieldsEnd(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdAnimatedFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public AppendTemplateDetectionResult(Lcom/smartengines/id/IdTemplateDetectionResult;)V
    .locals 6

    .line 82
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdTemplateDetectionResult;->getCPtr(Lcom/smartengines/id/IdTemplateDetectionResult;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/id/jniidengineJNI;->IdResult_AppendTemplateDetectionResult(JLcom/smartengines/id/IdResult;JLcom/smartengines/id/IdTemplateDetectionResult;)V

    return-void
.end method

.method public AppendTemplateSegmentationResult(Lcom/smartengines/id/IdTemplateSegmentationResult;)V
    .locals 6

    .line 98
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/id/IdTemplateSegmentationResult;->getCPtr(Lcom/smartengines/id/IdTemplateSegmentationResult;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/id/jniidengineJNI;->IdResult_AppendTemplateSegmentationResult(JLcom/smartengines/id/IdResult;JLcom/smartengines/id/IdTemplateSegmentationResult;)V

    return-void
.end method

.method public CheckFieldsBegin()Lcom/smartengines/id/IdCheckFieldsMapIterator;
    .locals 4

    .line 226
    new-instance v0, Lcom/smartengines/id/IdCheckFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_CheckFieldsBegin(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdCheckFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public CheckFieldsEnd()Lcom/smartengines/id/IdCheckFieldsMapIterator;
    .locals 4

    .line 230
    new-instance v0, Lcom/smartengines/id/IdCheckFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_CheckFieldsEnd(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdCheckFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ClearTemplateDetectionResults()V
    .locals 2

    .line 86
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_ClearTemplateDetectionResults(JLcom/smartengines/id/IdResult;)V

    return-void
.end method

.method public ClearTemplateSegmentationResults()V
    .locals 2

    .line 102
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_ClearTemplateSegmentationResults(JLcom/smartengines/id/IdResult;)V

    return-void
.end method

.method public CorrespondingFieldNamesBegin(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;
    .locals 3

    .line 426
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_CorrespondingFieldNamesBegin(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public CorrespondingFieldNamesEnd(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;
    .locals 3

    .line 430
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_CorrespondingFieldNamesEnd(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public CorrespondingRawFieldNamesBegin(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;
    .locals 3

    .line 410
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_CorrespondingRawFieldNamesBegin(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public CorrespondingRawFieldNamesEnd(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;
    .locals 3

    .line 414
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_CorrespondingRawFieldNamesEnd(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ForensicAnimatedFieldsBegin()Lcom/smartengines/id/IdAnimatedFieldsMapIterator;
    .locals 4

    .line 310
    new-instance v0, Lcom/smartengines/id/IdAnimatedFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_ForensicAnimatedFieldsBegin(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdAnimatedFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ForensicAnimatedFieldsEnd()Lcom/smartengines/id/IdAnimatedFieldsMapIterator;
    .locals 4

    .line 314
    new-instance v0, Lcom/smartengines/id/IdAnimatedFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_ForensicAnimatedFieldsEnd(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdAnimatedFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ForensicCheckFieldsBegin()Lcom/smartengines/id/IdCheckFieldsMapIterator;
    .locals 4

    .line 338
    new-instance v0, Lcom/smartengines/id/IdCheckFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_ForensicCheckFieldsBegin(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdCheckFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ForensicCheckFieldsEnd()Lcom/smartengines/id/IdCheckFieldsMapIterator;
    .locals 4

    .line 342
    new-instance v0, Lcom/smartengines/id/IdCheckFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_ForensicCheckFieldsEnd(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdCheckFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ForensicImageFieldsBegin()Lcom/smartengines/id/IdImageFieldsMapIterator;
    .locals 4

    .line 282
    new-instance v0, Lcom/smartengines/id/IdImageFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_ForensicImageFieldsBegin(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdImageFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ForensicImageFieldsEnd()Lcom/smartengines/id/IdImageFieldsMapIterator;
    .locals 4

    .line 286
    new-instance v0, Lcom/smartengines/id/IdImageFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_ForensicImageFieldsEnd(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdImageFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ForensicTextFieldsBegin()Lcom/smartengines/id/IdTextFieldsMapIterator;
    .locals 4

    .line 254
    new-instance v0, Lcom/smartengines/id/IdTextFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_ForensicTextFieldsBegin(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdTextFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ForensicTextFieldsEnd()Lcom/smartengines/id/IdTextFieldsMapIterator;
    .locals 4

    .line 258
    new-instance v0, Lcom/smartengines/id/IdTextFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_ForensicTextFieldsEnd(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdTextFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public GetAnimatedField(Ljava/lang/String;)Lcom/smartengines/id/IdAnimatedField;
    .locals 3

    .line 186
    new-instance v0, Lcom/smartengines/id/IdAnimatedField;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetAnimatedField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdAnimatedField;-><init>(JZ)V

    return-object v0
.end method

.method public GetAnimatedFieldsCount()I
    .locals 2

    .line 178
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetAnimatedFieldsCount(JLcom/smartengines/id/IdResult;)I

    move-result v0

    return v0
.end method

.method public GetCheckField(Ljava/lang/String;)Lcom/smartengines/id/IdCheckField;
    .locals 3

    .line 214
    new-instance v0, Lcom/smartengines/id/IdCheckField;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetCheckField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdCheckField;-><init>(JZ)V

    return-object v0
.end method

.method public GetCheckFieldsCount()I
    .locals 2

    .line 206
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetCheckFieldsCount(JLcom/smartengines/id/IdResult;)I

    move-result v0

    return v0
.end method

.method public GetCorrespondingFieldsCount(Ljava/lang/String;)I
    .locals 2

    .line 418
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetCorrespondingFieldsCount(JLcom/smartengines/id/IdResult;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public GetCorrespondingRawFieldsCount(Ljava/lang/String;)I
    .locals 2

    .line 402
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetCorrespondingRawFieldsCount(JLcom/smartengines/id/IdResult;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public GetDocumentType()Ljava/lang/String;
    .locals 2

    .line 66
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetDocumentType(JLcom/smartengines/id/IdResult;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public GetForensicAnimatedField(Ljava/lang/String;)Lcom/smartengines/id/IdAnimatedField;
    .locals 3

    .line 298
    new-instance v0, Lcom/smartengines/id/IdAnimatedField;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetForensicAnimatedField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdAnimatedField;-><init>(JZ)V

    return-object v0
.end method

.method public GetForensicAnimatedFieldsCount()I
    .locals 2

    .line 290
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetForensicAnimatedFieldsCount(JLcom/smartengines/id/IdResult;)I

    move-result v0

    return v0
.end method

.method public GetForensicCheckField(Ljava/lang/String;)Lcom/smartengines/id/IdCheckField;
    .locals 3

    .line 326
    new-instance v0, Lcom/smartengines/id/IdCheckField;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetForensicCheckField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdCheckField;-><init>(JZ)V

    return-object v0
.end method

.method public GetForensicCheckFieldsCount()I
    .locals 2

    .line 318
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetForensicCheckFieldsCount(JLcom/smartengines/id/IdResult;)I

    move-result v0

    return v0
.end method

.method public GetForensicImageField(Ljava/lang/String;)Lcom/smartengines/id/IdImageField;
    .locals 3

    .line 270
    new-instance v0, Lcom/smartengines/id/IdImageField;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetForensicImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdImageField;-><init>(JZ)V

    return-object v0
.end method

.method public GetForensicImageFieldsCount()I
    .locals 2

    .line 262
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetForensicImageFieldsCount(JLcom/smartengines/id/IdResult;)I

    move-result v0

    return v0
.end method

.method public GetForensicTextField(Ljava/lang/String;)Lcom/smartengines/id/IdTextField;
    .locals 3

    .line 242
    new-instance v0, Lcom/smartengines/id/IdTextField;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetForensicTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdTextField;-><init>(JZ)V

    return-object v0
.end method

.method public GetForensicTextFieldsCount()I
    .locals 2

    .line 234
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetForensicTextFieldsCount(JLcom/smartengines/id/IdResult;)I

    move-result v0

    return v0
.end method

.method public GetImageField(Ljava/lang/String;)Lcom/smartengines/id/IdImageField;
    .locals 3

    .line 158
    new-instance v0, Lcom/smartengines/id/IdImageField;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdImageField;-><init>(JZ)V

    return-object v0
.end method

.method public GetImageFieldsCount()I
    .locals 2

    .line 150
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetImageFieldsCount(JLcom/smartengines/id/IdResult;)I

    move-result v0

    return v0
.end method

.method public GetIsTerminal()Z
    .locals 2

    .line 106
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetIsTerminal(JLcom/smartengines/id/IdResult;)Z

    move-result v0

    return v0
.end method

.method public GetRawImageField(Ljava/lang/String;)Lcom/smartengines/id/IdImageField;
    .locals 3

    .line 382
    new-instance v0, Lcom/smartengines/id/IdImageField;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetRawImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdImageField;-><init>(JZ)V

    return-object v0
.end method

.method public GetRawImageFieldsCount()I
    .locals 2

    .line 374
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetRawImageFieldsCount(JLcom/smartengines/id/IdResult;)I

    move-result v0

    return v0
.end method

.method public GetRawTextField(Ljava/lang/String;)Lcom/smartengines/id/IdTextField;
    .locals 3

    .line 354
    new-instance v0, Lcom/smartengines/id/IdTextField;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetRawTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdTextField;-><init>(JZ)V

    return-object v0
.end method

.method public GetRawTextFieldsCount()I
    .locals 2

    .line 346
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetRawTextFieldsCount(JLcom/smartengines/id/IdResult;)I

    move-result v0

    return v0
.end method

.method public GetSeenTemplates()Lcom/smartengines/common/StringsSet;
    .locals 4

    .line 114
    new-instance v0, Lcom/smartengines/common/StringsSet;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetSeenTemplates(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSet;-><init>(JZ)V

    return-object v0
.end method

.method public GetTemplateDetectionResult(I)Lcom/smartengines/id/IdTemplateDetectionResult;
    .locals 3

    .line 78
    new-instance v0, Lcom/smartengines/id/IdTemplateDetectionResult;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetTemplateDetectionResult(JLcom/smartengines/id/IdResult;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdTemplateDetectionResult;-><init>(JZ)V

    return-object v0
.end method

.method public GetTemplateDetectionResultsCount()I
    .locals 2

    .line 74
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetTemplateDetectionResultsCount(JLcom/smartengines/id/IdResult;)I

    move-result v0

    return v0
.end method

.method public GetTemplateSegmentationResult(I)Lcom/smartengines/id/IdTemplateSegmentationResult;
    .locals 3

    .line 94
    new-instance v0, Lcom/smartengines/id/IdTemplateSegmentationResult;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetTemplateSegmentationResult(JLcom/smartengines/id/IdResult;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdTemplateSegmentationResult;-><init>(JZ)V

    return-object v0
.end method

.method public GetTemplateSegmentationResultsCount()I
    .locals 2

    .line 90
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetTemplateSegmentationResultsCount(JLcom/smartengines/id/IdResult;)I

    move-result v0

    return v0
.end method

.method public GetTerminalTemplates()Lcom/smartengines/common/StringsSet;
    .locals 4

    .line 118
    new-instance v0, Lcom/smartengines/common/StringsSet;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetTerminalTemplates(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSet;-><init>(JZ)V

    return-object v0
.end method

.method public GetTextField(Ljava/lang/String;)Lcom/smartengines/id/IdTextField;
    .locals 3

    .line 130
    new-instance v0, Lcom/smartengines/id/IdTextField;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/id/IdTextField;-><init>(JZ)V

    return-object v0
.end method

.method public GetTextFieldsCount()I
    .locals 2

    .line 122
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_GetTextFieldsCount(JLcom/smartengines/id/IdResult;)I

    move-result v0

    return v0
.end method

.method public HasAnimatedField(Ljava/lang/String;)Z
    .locals 2

    .line 182
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_HasAnimatedField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasCheckField(Ljava/lang/String;)Z
    .locals 2

    .line 210
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_HasCheckField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasCorrespondingField(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 422
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdResult_HasCorrespondingField(JLcom/smartengines/id/IdResult;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasCorrespondingRawField(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 406
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdResult_HasCorrespondingRawField(JLcom/smartengines/id/IdResult;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasForensicAnimatedField(Ljava/lang/String;)Z
    .locals 2

    .line 294
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_HasForensicAnimatedField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasForensicCheckField(Ljava/lang/String;)Z
    .locals 2

    .line 322
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_HasForensicCheckField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasForensicImageField(Ljava/lang/String;)Z
    .locals 2

    .line 266
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_HasForensicImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasForensicTextField(Ljava/lang/String;)Z
    .locals 2

    .line 238
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_HasForensicTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasImageField(Ljava/lang/String;)Z
    .locals 2

    .line 154
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_HasImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasRawImageField(Ljava/lang/String;)Z
    .locals 2

    .line 378
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_HasRawImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasRawTextField(Ljava/lang/String;)Z
    .locals 2

    .line 350
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_HasRawTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasTextField(Ljava/lang/String;)Z
    .locals 2

    .line 126
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_HasTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public ImageFieldsBegin()Lcom/smartengines/id/IdImageFieldsMapIterator;
    .locals 4

    .line 170
    new-instance v0, Lcom/smartengines/id/IdImageFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_ImageFieldsBegin(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdImageFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ImageFieldsEnd()Lcom/smartengines/id/IdImageFieldsMapIterator;
    .locals 4

    .line 174
    new-instance v0, Lcom/smartengines/id/IdImageFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_ImageFieldsEnd(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdImageFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public RawImageFieldsBegin()Lcom/smartengines/id/IdImageFieldsMapIterator;
    .locals 4

    .line 394
    new-instance v0, Lcom/smartengines/id/IdImageFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_RawImageFieldsBegin(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdImageFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public RawImageFieldsEnd()Lcom/smartengines/id/IdImageFieldsMapIterator;
    .locals 4

    .line 398
    new-instance v0, Lcom/smartengines/id/IdImageFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_RawImageFieldsEnd(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdImageFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public RawTextFieldsBegin()Lcom/smartengines/id/IdTextFieldsMapIterator;
    .locals 4

    .line 366
    new-instance v0, Lcom/smartengines/id/IdTextFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_RawTextFieldsBegin(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdTextFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public RawTextFieldsEnd()Lcom/smartengines/id/IdTextFieldsMapIterator;
    .locals 4

    .line 370
    new-instance v0, Lcom/smartengines/id/IdTextFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_RawTextFieldsEnd(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdTextFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public RemoveAnimatedField(Ljava/lang/String;)V
    .locals 2

    .line 194
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_RemoveAnimatedField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveCheckField(Ljava/lang/String;)V
    .locals 2

    .line 222
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_RemoveCheckField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveForensicAnimatedField(Ljava/lang/String;)V
    .locals 2

    .line 306
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_RemoveForensicAnimatedField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveForensicCheckField(Ljava/lang/String;)V
    .locals 2

    .line 334
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_RemoveForensicCheckField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveForensicImageField(Ljava/lang/String;)V
    .locals 2

    .line 278
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_RemoveForensicImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveForensicTextField(Ljava/lang/String;)V
    .locals 2

    .line 250
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_RemoveForensicTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveImageField(Ljava/lang/String;)V
    .locals 2

    .line 166
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_RemoveImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveRawImageField(Ljava/lang/String;)V
    .locals 2

    .line 390
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_RemoveRawImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveRawTextField(Ljava/lang/String;)V
    .locals 2

    .line 362
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_RemoveRawTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveTextField(Ljava/lang/String;)V
    .locals 2

    .line 138
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_RemoveTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V

    return-void
.end method

.method public SetAnimatedField(Ljava/lang/String;Lcom/smartengines/id/IdAnimatedField;)V
    .locals 7

    .line 190
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/id/IdAnimatedField;->getCPtr(Lcom/smartengines/id/IdAnimatedField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdResult_SetAnimatedField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdAnimatedField;)V

    return-void
.end method

.method public SetCheckField(Ljava/lang/String;Lcom/smartengines/id/IdCheckField;)V
    .locals 7

    .line 218
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/id/IdCheckField;->getCPtr(Lcom/smartengines/id/IdCheckField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdResult_SetCheckField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdCheckField;)V

    return-void
.end method

.method public SetDocumentType(Ljava/lang/String;)V
    .locals 2

    .line 70
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_SetDocumentType(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V

    return-void
.end method

.method public SetForensicAnimatedField(Ljava/lang/String;Lcom/smartengines/id/IdAnimatedField;)V
    .locals 7

    .line 302
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/id/IdAnimatedField;->getCPtr(Lcom/smartengines/id/IdAnimatedField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdResult_SetForensicAnimatedField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdAnimatedField;)V

    return-void
.end method

.method public SetForensicCheckField(Ljava/lang/String;Lcom/smartengines/id/IdCheckField;)V
    .locals 7

    .line 330
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/id/IdCheckField;->getCPtr(Lcom/smartengines/id/IdCheckField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdResult_SetForensicCheckField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdCheckField;)V

    return-void
.end method

.method public SetForensicImageField(Ljava/lang/String;Lcom/smartengines/id/IdImageField;)V
    .locals 7

    .line 274
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/id/IdImageField;->getCPtr(Lcom/smartengines/id/IdImageField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdResult_SetForensicImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdImageField;)V

    return-void
.end method

.method public SetForensicTextField(Ljava/lang/String;Lcom/smartengines/id/IdTextField;)V
    .locals 7

    .line 246
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/id/IdTextField;->getCPtr(Lcom/smartengines/id/IdTextField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdResult_SetForensicTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdTextField;)V

    return-void
.end method

.method public SetImageField(Ljava/lang/String;Lcom/smartengines/id/IdImageField;)V
    .locals 7

    .line 162
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/id/IdImageField;->getCPtr(Lcom/smartengines/id/IdImageField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdResult_SetImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdImageField;)V

    return-void
.end method

.method public SetIsTerminal(Z)V
    .locals 2

    .line 110
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdResult_SetIsTerminal(JLcom/smartengines/id/IdResult;Z)V

    return-void
.end method

.method public SetRawImageField(Ljava/lang/String;Lcom/smartengines/id/IdImageField;)V
    .locals 7

    .line 386
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/id/IdImageField;->getCPtr(Lcom/smartengines/id/IdImageField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdResult_SetRawImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdImageField;)V

    return-void
.end method

.method public SetRawTextField(Ljava/lang/String;Lcom/smartengines/id/IdTextField;)V
    .locals 7

    .line 358
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/id/IdTextField;->getCPtr(Lcom/smartengines/id/IdTextField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdResult_SetRawTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdTextField;)V

    return-void
.end method

.method public SetTextField(Ljava/lang/String;Lcom/smartengines/id/IdTextField;)V
    .locals 7

    .line 134
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/id/IdTextField;->getCPtr(Lcom/smartengines/id/IdTextField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->IdResult_SetTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdTextField;)V

    return-void
.end method

.method public TextFieldsBegin()Lcom/smartengines/id/IdTextFieldsMapIterator;
    .locals 4

    .line 142
    new-instance v0, Lcom/smartengines/id/IdTextFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_TextFieldsBegin(JLcom/smartengines/id/IdResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/id/IdTextFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public TextFieldsEnd()Lcom/smartengines/id/IdTextFieldsMapIterator;
    .locals 4

    .line 146
    new-instance v0, Lcom/smartengines/id/IdTextFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdResult_TextFieldsEnd(JLcom/smartengines/id/IdResult;)J

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
    iget-wide v0, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/id/IdResult;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/id/IdResult;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/id/jniidengineJNI;->delete_IdResult(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/id/IdResult;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/id/IdResult;->delete()V

    return-void
.end method
