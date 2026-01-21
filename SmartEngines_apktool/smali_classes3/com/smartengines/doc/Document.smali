.class public Lcom/smartengines/doc/Document;
.super Ljava/lang/Object;
.source "Document.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/doc/Document;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    return-void
.end method

.method public static BaseClassNameStatic()Ljava/lang/String;
    .locals 1

    .line 54
    invoke-static {}, Lcom/smartengines/doc/jnidocengineJNI;->Document_BaseClassNameStatic()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getCPtr(Lcom/smartengines/doc/Document;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/Document;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/doc/Document;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/doc/Document;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/doc/Document;->delete()V

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
.method public AttributesBegin()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 223
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_AttributesBegin(JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public AttributesEnd()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 227
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_AttributesEnd(JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public BarcodeFieldsBegin()Lcom/smartengines/doc/DocBarcodeFieldsIterator;
    .locals 4

    .line 195
    new-instance v0, Lcom/smartengines/doc/DocBarcodeFieldsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_BarcodeFieldsBegin(JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocBarcodeFieldsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public BarcodeFieldsEnd()Lcom/smartengines/doc/DocBarcodeFieldsIterator;
    .locals 4

    .line 199
    new-instance v0, Lcom/smartengines/doc/DocBarcodeFieldsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_BarcodeFieldsEnd(JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocBarcodeFieldsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public CheckboxFieldsBegin()Lcom/smartengines/doc/DocCheckboxFieldsIterator;
    .locals 4

    .line 110
    new-instance v0, Lcom/smartengines/doc/DocCheckboxFieldsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_CheckboxFieldsBegin(JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocCheckboxFieldsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public CheckboxFieldsEnd()Lcom/smartengines/doc/DocCheckboxFieldsIterator;
    .locals 4

    .line 114
    new-instance v0, Lcom/smartengines/doc/DocCheckboxFieldsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_CheckboxFieldsEnd(JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocCheckboxFieldsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ForensicCheckFieldsBegin()Lcom/smartengines/doc/DocForensicCheckFieldsIterator;
    .locals 4

    .line 155
    new-instance v0, Lcom/smartengines/doc/DocForensicCheckFieldsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_ForensicCheckFieldsBegin(JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocForensicCheckFieldsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ForensicCheckFieldsEnd()Lcom/smartengines/doc/DocForensicCheckFieldsIterator;
    .locals 4

    .line 159
    new-instance v0, Lcom/smartengines/doc/DocForensicCheckFieldsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_ForensicCheckFieldsEnd(JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocForensicCheckFieldsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ForensicFieldsBegin()Lcom/smartengines/doc/DocForensicFieldsIterator;
    .locals 4

    .line 130
    new-instance v0, Lcom/smartengines/doc/DocForensicFieldsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_ForensicFieldsBegin(JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocForensicFieldsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ForensicFieldsEnd()Lcom/smartengines/doc/DocForensicFieldsIterator;
    .locals 4

    .line 134
    new-instance v0, Lcom/smartengines/doc/DocForensicFieldsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_ForensicFieldsEnd(JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocForensicFieldsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public GetAttribute(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 211
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetAttribute(JLcom/smartengines/doc/Document;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GetAttributesCount()I
    .locals 2

    .line 203
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetAttributesCount(JLcom/smartengines/doc/Document;)I

    move-result v0

    return v0
.end method

.method public GetBarcodeField(Ljava/lang/String;)Lcom/smartengines/doc/DocBarcodeField;
    .locals 3

    .line 191
    new-instance v0, Lcom/smartengines/doc/DocBarcodeField;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetBarcodeField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBarcodeField;-><init>(JZ)V

    return-object v0
.end method

.method public GetBarcodeFieldsCount()I
    .locals 2

    .line 183
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetBarcodeFieldsCount(JLcom/smartengines/doc/Document;)I

    move-result v0

    return v0
.end method

.method public GetCheckboxField(Ljava/lang/String;)Lcom/smartengines/doc/DocCheckboxField;
    .locals 3

    .line 106
    new-instance v0, Lcom/smartengines/doc/DocCheckboxField;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetCheckboxField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocCheckboxField;-><init>(JZ)V

    return-object v0
.end method

.method public GetCheckboxFieldsCount()I
    .locals 2

    .line 98
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetCheckboxFieldsCount(JLcom/smartengines/doc/Document;)I

    move-result v0

    return v0
.end method

.method public GetForensicCheckField(Ljava/lang/String;)Lcom/smartengines/doc/DocForensicCheckField;
    .locals 3

    .line 146
    new-instance v0, Lcom/smartengines/doc/DocForensicCheckField;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetForensicCheckField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocForensicCheckField;-><init>(JZ)V

    return-object v0
.end method

.method public GetForensicCheckFieldPtr(Ljava/lang/String;)Lcom/smartengines/doc/DocForensicCheckField;
    .locals 4

    .line 150
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetForensicCheckFieldPtr(JLcom/smartengines/doc/Document;Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 151
    :cond_0
    new-instance p1, Lcom/smartengines/doc/DocForensicCheckField;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, v2}, Lcom/smartengines/doc/DocForensicCheckField;-><init>(JZ)V

    return-object p1
.end method

.method public GetForensicCheckFieldsCount()I
    .locals 2

    .line 138
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetForensicCheckFieldsCount(JLcom/smartengines/doc/Document;)I

    move-result v0

    return v0
.end method

.method public GetForensicField(Ljava/lang/String;)Lcom/smartengines/doc/DocForensicField;
    .locals 3

    .line 126
    new-instance v0, Lcom/smartengines/doc/DocForensicField;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetForensicField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocForensicField;-><init>(JZ)V

    return-object v0
.end method

.method public GetForensicFieldsCount()I
    .locals 2

    .line 118
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetForensicFieldsCount(JLcom/smartengines/doc/Document;)I

    move-result v0

    return v0
.end method

.method public GetImageField(Ljava/lang/String;)Lcom/smartengines/doc/DocImageField;
    .locals 3

    .line 86
    new-instance v0, Lcom/smartengines/doc/DocImageField;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetImageField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocImageField;-><init>(JZ)V

    return-object v0
.end method

.method public GetImageFieldsCount()I
    .locals 2

    .line 78
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetImageFieldsCount(JLcom/smartengines/doc/Document;)I

    move-result v0

    return v0
.end method

.method public GetMutableBarcodeField(Ljava/lang/String;)Lcom/smartengines/doc/DocBarcodeField;
    .locals 3

    .line 320
    new-instance v0, Lcom/smartengines/doc/DocBarcodeField;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetMutableBarcodeField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBarcodeField;-><init>(JZ)V

    return-object v0
.end method

.method public GetMutableCheckboxField(Ljava/lang/String;)Lcom/smartengines/doc/DocCheckboxField;
    .locals 3

    .line 267
    new-instance v0, Lcom/smartengines/doc/DocCheckboxField;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetMutableCheckboxField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocCheckboxField;-><init>(JZ)V

    return-object v0
.end method

.method public GetMutableForensicCheckField(Ljava/lang/String;)Lcom/smartengines/doc/DocForensicCheckField;
    .locals 3

    .line 291
    new-instance v0, Lcom/smartengines/doc/DocForensicCheckField;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetMutableForensicCheckField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocForensicCheckField;-><init>(JZ)V

    return-object v0
.end method

.method public GetMutableForensicCheckFieldPtr(Ljava/lang/String;)Lcom/smartengines/doc/DocForensicCheckField;
    .locals 4

    .line 295
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetMutableForensicCheckFieldPtr(JLcom/smartengines/doc/Document;Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 296
    :cond_0
    new-instance p1, Lcom/smartengines/doc/DocForensicCheckField;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, v2}, Lcom/smartengines/doc/DocForensicCheckField;-><init>(JZ)V

    return-object p1
.end method

.method public GetMutableForensicField(Ljava/lang/String;)Lcom/smartengines/doc/DocForensicField;
    .locals 3

    .line 279
    new-instance v0, Lcom/smartengines/doc/DocForensicField;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetMutableForensicField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocForensicField;-><init>(JZ)V

    return-object v0
.end method

.method public GetMutableImageField(Ljava/lang/String;)Lcom/smartengines/doc/DocImageField;
    .locals 3

    .line 255
    new-instance v0, Lcom/smartengines/doc/DocImageField;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetMutableImageField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocImageField;-><init>(JZ)V

    return-object v0
.end method

.method public GetMutableTableField(Ljava/lang/String;)Lcom/smartengines/doc/DocTableField;
    .locals 3

    .line 308
    new-instance v0, Lcom/smartengines/doc/DocTableField;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetMutableTableField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTableField;-><init>(JZ)V

    return-object v0
.end method

.method public GetMutableTextField(Ljava/lang/String;)Lcom/smartengines/doc/DocTextField;
    .locals 3

    .line 243
    new-instance v0, Lcom/smartengines/doc/DocTextField;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetMutableTextField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTextField;-><init>(JZ)V

    return-object v0
.end method

.method public GetPhysicalDocIdx()I
    .locals 2

    .line 239
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetPhysicalDocIdx(JLcom/smartengines/doc/Document;)I

    move-result v0

    return v0
.end method

.method public GetTableField(Ljava/lang/String;)Lcom/smartengines/doc/DocTableField;
    .locals 3

    .line 171
    new-instance v0, Lcom/smartengines/doc/DocTableField;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetTableField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTableField;-><init>(JZ)V

    return-object v0
.end method

.method public GetTableFieldsCount()I
    .locals 2

    .line 163
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetTableFieldsCount(JLcom/smartengines/doc/Document;)I

    move-result v0

    return v0
.end method

.method public GetTextField(Ljava/lang/String;)Lcom/smartengines/doc/DocTextField;
    .locals 3

    .line 66
    new-instance v0, Lcom/smartengines/doc/DocTextField;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetTextField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTextField;-><init>(JZ)V

    return-object v0
.end method

.method public GetTextFieldsCount()I
    .locals 2

    .line 58
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetTextFieldsCount(JLcom/smartengines/doc/Document;)I

    move-result v0

    return v0
.end method

.method public GetType()Ljava/lang/String;
    .locals 2

    .line 231
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_GetType(JLcom/smartengines/doc/Document;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public HasAttribute(Ljava/lang/String;)Z
    .locals 2

    .line 207
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_HasAttribute(JLcom/smartengines/doc/Document;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasBarcodeField(Ljava/lang/String;)Z
    .locals 2

    .line 187
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_HasBarcodeField(JLcom/smartengines/doc/Document;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasCheckboxField(Ljava/lang/String;)Z
    .locals 2

    .line 102
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_HasCheckboxField(JLcom/smartengines/doc/Document;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasForensicCheckField(Ljava/lang/String;)Z
    .locals 2

    .line 142
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_HasForensicCheckField(JLcom/smartengines/doc/Document;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasForensicField(Ljava/lang/String;)Z
    .locals 2

    .line 122
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_HasForensicField(JLcom/smartengines/doc/Document;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasImageField(Ljava/lang/String;)Z
    .locals 2

    .line 82
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_HasImageField(JLcom/smartengines/doc/Document;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasTableField(Ljava/lang/String;)Z
    .locals 2

    .line 167
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_HasTableField(JLcom/smartengines/doc/Document;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasTextField(Ljava/lang/String;)Z
    .locals 2

    .line 62
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_HasTextField(JLcom/smartengines/doc/Document;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public ImageFieldsBegin()Lcom/smartengines/doc/DocImageFieldsIterator;
    .locals 4

    .line 90
    new-instance v0, Lcom/smartengines/doc/DocImageFieldsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_ImageFieldsBegin(JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocImageFieldsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ImageFieldsEnd()Lcom/smartengines/doc/DocImageFieldsIterator;
    .locals 4

    .line 94
    new-instance v0, Lcom/smartengines/doc/DocImageFieldsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_ImageFieldsEnd(JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocImageFieldsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public RemoveAttribute(Ljava/lang/String;)V
    .locals 2

    .line 219
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_RemoveAttribute(JLcom/smartengines/doc/Document;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveBarcodeField(Ljava/lang/String;)V
    .locals 2

    .line 328
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_RemoveBarcodeField(JLcom/smartengines/doc/Document;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveCheckboxField(Ljava/lang/String;)V
    .locals 2

    .line 275
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_RemoveCheckboxField(JLcom/smartengines/doc/Document;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveForensicCheckField(Ljava/lang/String;)V
    .locals 2

    .line 304
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_RemoveForensicCheckField(JLcom/smartengines/doc/Document;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveForensicField(Ljava/lang/String;)V
    .locals 2

    .line 287
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_RemoveForensicField(JLcom/smartengines/doc/Document;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveImageField(Ljava/lang/String;)V
    .locals 2

    .line 263
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_RemoveImageField(JLcom/smartengines/doc/Document;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveTableField(Ljava/lang/String;)V
    .locals 2

    .line 316
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_RemoveTableField(JLcom/smartengines/doc/Document;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveTextField(Ljava/lang/String;)V
    .locals 2

    .line 251
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->Document_RemoveTextField(JLcom/smartengines/doc/Document;Ljava/lang/String;)V

    return-void
.end method

.method public Serialize(Lcom/smartengines/common/Serializer;)V
    .locals 6

    .line 235
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Serializer;->getCPtr(Lcom/smartengines/common/Serializer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->Document_Serialize(JLcom/smartengines/doc/Document;JLcom/smartengines/common/Serializer;)V

    return-void
.end method

.method public SetAttribute(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 215
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->Document_SetAttribute(JLcom/smartengines/doc/Document;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public SetBarcodeField(Ljava/lang/String;Lcom/smartengines/doc/DocBarcodeField;)V
    .locals 7

    .line 324
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/doc/DocBarcodeField;->getCPtr(Lcom/smartengines/doc/DocBarcodeField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->Document_SetBarcodeField(JLcom/smartengines/doc/Document;Ljava/lang/String;JLcom/smartengines/doc/DocBarcodeField;)V

    return-void
.end method

.method public SetCheckboxField(Ljava/lang/String;Lcom/smartengines/doc/DocCheckboxField;)V
    .locals 7

    .line 271
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/doc/DocCheckboxField;->getCPtr(Lcom/smartengines/doc/DocCheckboxField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->Document_SetCheckboxField(JLcom/smartengines/doc/Document;Ljava/lang/String;JLcom/smartengines/doc/DocCheckboxField;)V

    return-void
.end method

.method public SetForensicCheckField(Ljava/lang/String;Lcom/smartengines/doc/DocForensicCheckField;)V
    .locals 7

    .line 300
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/doc/DocForensicCheckField;->getCPtr(Lcom/smartengines/doc/DocForensicCheckField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->Document_SetForensicCheckField(JLcom/smartengines/doc/Document;Ljava/lang/String;JLcom/smartengines/doc/DocForensicCheckField;)V

    return-void
.end method

.method public SetForensicField(Ljava/lang/String;Lcom/smartengines/doc/DocForensicField;)V
    .locals 7

    .line 283
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/doc/DocForensicField;->getCPtr(Lcom/smartengines/doc/DocForensicField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->Document_SetForensicField(JLcom/smartengines/doc/Document;Ljava/lang/String;JLcom/smartengines/doc/DocForensicField;)V

    return-void
.end method

.method public SetImageField(Ljava/lang/String;Lcom/smartengines/doc/DocImageField;)V
    .locals 7

    .line 259
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/doc/DocImageField;->getCPtr(Lcom/smartengines/doc/DocImageField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->Document_SetImageField(JLcom/smartengines/doc/Document;Ljava/lang/String;JLcom/smartengines/doc/DocImageField;)V

    return-void
.end method

.method public SetTableField(Ljava/lang/String;Lcom/smartengines/doc/DocTableField;)V
    .locals 7

    .line 312
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/doc/DocTableField;->getCPtr(Lcom/smartengines/doc/DocTableField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->Document_SetTableField(JLcom/smartengines/doc/Document;Ljava/lang/String;JLcom/smartengines/doc/DocTableField;)V

    return-void
.end method

.method public SetTextField(Ljava/lang/String;Lcom/smartengines/doc/DocTextField;)V
    .locals 7

    .line 247
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/doc/DocTextField;->getCPtr(Lcom/smartengines/doc/DocTextField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->Document_SetTextField(JLcom/smartengines/doc/Document;Ljava/lang/String;JLcom/smartengines/doc/DocTextField;)V

    return-void
.end method

.method public TableFieldsBegin()Lcom/smartengines/doc/DocTableFieldsIterator;
    .locals 4

    .line 175
    new-instance v0, Lcom/smartengines/doc/DocTableFieldsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_TableFieldsBegin(JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocTableFieldsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public TableFieldsEnd()Lcom/smartengines/doc/DocTableFieldsIterator;
    .locals 4

    .line 179
    new-instance v0, Lcom/smartengines/doc/DocTableFieldsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_TableFieldsEnd(JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocTableFieldsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public TextFieldsBegin()Lcom/smartengines/doc/DocTextFieldsIterator;
    .locals 4

    .line 70
    new-instance v0, Lcom/smartengines/doc/DocTextFieldsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_TextFieldsBegin(JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocTextFieldsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public TextFieldsEnd()Lcom/smartengines/doc/DocTextFieldsIterator;
    .locals 4

    .line 74
    new-instance v0, Lcom/smartengines/doc/DocTextFieldsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->Document_TextFieldsEnd(JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocTextFieldsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/Document;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/doc/Document;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/doc/Document;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_Document(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/Document;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/doc/Document;->delete()V

    return-void
.end method
