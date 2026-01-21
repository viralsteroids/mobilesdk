.class public Lcom/smartengines/doc/DocBaseFieldInfo;
.super Ljava/lang/Object;
.source "DocBaseFieldInfo.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocBaseFieldInfo;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocBaseFieldInfo;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/doc/DocBaseFieldInfo;->delete()V

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

    .line 86
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_AttributesBegin(JLcom/smartengines/doc/DocBaseFieldInfo;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public AttributesEnd()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 90
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_AttributesEnd(JLcom/smartengines/doc/DocBaseFieldInfo;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ConnectBasicObject(II)V
    .locals 2

    .line 190
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectBasicObject(JLcom/smartengines/doc/DocBaseFieldInfo;II)V

    return-void
.end method

.method public ConnectedBarcodeObjectsBegin(Lcom/smartengines/doc/DocPhysicalDocument;)Lcom/smartengines/doc/DocBarcodeObjectsCrossPageIterator;
    .locals 7

    .line 142
    new-instance v0, Lcom/smartengines/doc/DocBarcodeObjectsCrossPageIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocPhysicalDocument;->getCPtr(Lcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectedBarcodeObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBarcodeObjectsCrossPageIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ConnectedBarcodeObjectsEnd(Lcom/smartengines/doc/DocPhysicalDocument;)Lcom/smartengines/doc/DocBarcodeObjectsCrossPageIterator;
    .locals 7

    .line 146
    new-instance v0, Lcom/smartengines/doc/DocBarcodeObjectsCrossPageIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocPhysicalDocument;->getCPtr(Lcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectedBarcodeObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBarcodeObjectsCrossPageIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ConnectedBasicObjectsBegin(Lcom/smartengines/doc/DocGraphicalStructure;)Lcom/smartengines/doc/DocBasicObjectsCrossSliceIterator;
    .locals 7

    .line 174
    new-instance v0, Lcom/smartengines/doc/DocBasicObjectsCrossSliceIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocGraphicalStructure;->getCPtr(Lcom/smartengines/doc/DocGraphicalStructure;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectedBasicObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocGraphicalStructure;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBasicObjectsCrossSliceIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ConnectedBasicObjectsEnd(Lcom/smartengines/doc/DocGraphicalStructure;)Lcom/smartengines/doc/DocBasicObjectsCrossSliceIterator;
    .locals 7

    .line 178
    new-instance v0, Lcom/smartengines/doc/DocBasicObjectsCrossSliceIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocGraphicalStructure;->getCPtr(Lcom/smartengines/doc/DocGraphicalStructure;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectedBasicObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocGraphicalStructure;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBasicObjectsCrossSliceIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ConnectedCheckboxObjectsBegin(Lcom/smartengines/doc/DocPhysicalDocument;)Lcom/smartengines/doc/DocCheckboxObjectsCrossPageIterator;
    .locals 7

    .line 118
    new-instance v0, Lcom/smartengines/doc/DocCheckboxObjectsCrossPageIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocPhysicalDocument;->getCPtr(Lcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectedCheckboxObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocCheckboxObjectsCrossPageIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ConnectedCheckboxObjectsEnd(Lcom/smartengines/doc/DocPhysicalDocument;)Lcom/smartengines/doc/DocCheckboxObjectsCrossPageIterator;
    .locals 7

    .line 122
    new-instance v0, Lcom/smartengines/doc/DocCheckboxObjectsCrossPageIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocPhysicalDocument;->getCPtr(Lcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectedCheckboxObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocCheckboxObjectsCrossPageIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ConnectedForensicCheckObjectsBegin(Lcom/smartengines/doc/DocPhysicalDocument;)Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;
    .locals 7

    .line 126
    new-instance v0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocPhysicalDocument;->getCPtr(Lcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectedForensicCheckObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ConnectedForensicCheckObjectsEnd(Lcom/smartengines/doc/DocPhysicalDocument;)Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;
    .locals 7

    .line 130
    new-instance v0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocPhysicalDocument;->getCPtr(Lcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectedForensicCheckObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ConnectedForensicObjectsBegin(Lcom/smartengines/doc/DocPhysicalDocument;)Lcom/smartengines/doc/DocMetaObjectsCrossPageIterator;
    .locals 7

    .line 134
    new-instance v0, Lcom/smartengines/doc/DocMetaObjectsCrossPageIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocPhysicalDocument;->getCPtr(Lcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectedForensicObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocMetaObjectsCrossPageIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ConnectedForensicObjectsEnd(Lcom/smartengines/doc/DocPhysicalDocument;)Lcom/smartengines/doc/DocMetaObjectsCrossPageIterator;
    .locals 7

    .line 138
    new-instance v0, Lcom/smartengines/doc/DocMetaObjectsCrossPageIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocPhysicalDocument;->getCPtr(Lcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectedForensicObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocMetaObjectsCrossPageIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ConnectedImageObjectsBegin(Lcom/smartengines/doc/DocPhysicalDocument;)Lcom/smartengines/doc/DocImageObjectsCrossPageIterator;
    .locals 7

    .line 110
    new-instance v0, Lcom/smartengines/doc/DocImageObjectsCrossPageIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocPhysicalDocument;->getCPtr(Lcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectedImageObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocImageObjectsCrossPageIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ConnectedImageObjectsEnd(Lcom/smartengines/doc/DocPhysicalDocument;)Lcom/smartengines/doc/DocImageObjectsCrossPageIterator;
    .locals 7

    .line 114
    new-instance v0, Lcom/smartengines/doc/DocImageObjectsCrossPageIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocPhysicalDocument;->getCPtr(Lcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectedImageObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocImageObjectsCrossPageIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ConnectedTableObjectsBegin(Lcom/smartengines/doc/DocPhysicalDocument;)Lcom/smartengines/doc/DocTableObjectsCrossPageIterator;
    .locals 7

    .line 102
    new-instance v0, Lcom/smartengines/doc/DocTableObjectsCrossPageIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocPhysicalDocument;->getCPtr(Lcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectedTableObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTableObjectsCrossPageIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ConnectedTableObjectsEnd(Lcom/smartengines/doc/DocPhysicalDocument;)Lcom/smartengines/doc/DocTableObjectsCrossPageIterator;
    .locals 7

    .line 106
    new-instance v0, Lcom/smartengines/doc/DocTableObjectsCrossPageIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocPhysicalDocument;->getCPtr(Lcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectedTableObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTableObjectsCrossPageIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ConnectedTextObjectsBegin(Lcom/smartengines/doc/DocPhysicalDocument;)Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;
    .locals 7

    .line 94
    new-instance v0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocPhysicalDocument;->getCPtr(Lcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectedTextObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ConnectedTextObjectsEnd(Lcom/smartengines/doc/DocPhysicalDocument;)Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;
    .locals 7

    .line 98
    new-instance v0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocPhysicalDocument;->getCPtr(Lcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_ConnectedTextObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;-><init>(JZ)V

    return-object v0
.end method

.method public GetAcceptFlag()Z
    .locals 2

    .line 62
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_GetAcceptFlag(JLcom/smartengines/doc/DocBaseFieldInfo;)Z

    move-result v0

    return v0
.end method

.method public GetAttribute(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 82
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_GetAttribute(JLcom/smartengines/doc/DocBaseFieldInfo;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GetAttributesCount()I
    .locals 2

    .line 74
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_GetAttributesCount(JLcom/smartengines/doc/DocBaseFieldInfo;)I

    move-result v0

    return v0
.end method

.method public GetConfidence()D
    .locals 2

    .line 58
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_GetConfidence(JLcom/smartengines/doc/DocBaseFieldInfo;)D

    move-result-wide v0

    return-wide v0
.end method

.method public GetName()Ljava/lang/String;
    .locals 2

    .line 54
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_GetName(JLcom/smartengines/doc/DocBaseFieldInfo;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public HasAttribute(Ljava/lang/String;)Z
    .locals 2

    .line 78
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_HasAttribute(JLcom/smartengines/doc/DocBaseFieldInfo;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public IsFictive()Z
    .locals 2

    .line 70
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_IsFictive(JLcom/smartengines/doc/DocBaseFieldInfo;)Z

    move-result v0

    return v0
.end method

.method public IsValid()Z
    .locals 2

    .line 66
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_IsValid(JLcom/smartengines/doc/DocBaseFieldInfo;)Z

    move-result v0

    return v0
.end method

.method public MutableConnectedBasicObjectsBegin(Lcom/smartengines/doc/DocGraphicalStructure;)Lcom/smartengines/doc/DocBasicObjectsMutableCrossSliceIterator;
    .locals 7

    .line 182
    new-instance v0, Lcom/smartengines/doc/DocBasicObjectsMutableCrossSliceIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocGraphicalStructure;->getCPtr(Lcom/smartengines/doc/DocGraphicalStructure;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_MutableConnectedBasicObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocGraphicalStructure;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBasicObjectsMutableCrossSliceIterator;-><init>(JZ)V

    return-object v0
.end method

.method public MutableConnectedBasicObjectsEnd(Lcom/smartengines/doc/DocGraphicalStructure;)Lcom/smartengines/doc/DocBasicObjectsMutableCrossSliceIterator;
    .locals 7

    .line 186
    new-instance v0, Lcom/smartengines/doc/DocBasicObjectsMutableCrossSliceIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocGraphicalStructure;->getCPtr(Lcom/smartengines/doc/DocGraphicalStructure;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_MutableConnectedBasicObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocGraphicalStructure;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBasicObjectsMutableCrossSliceIterator;-><init>(JZ)V

    return-object v0
.end method

.method public RemoveAttribute(Ljava/lang/String;)V
    .locals 2

    .line 170
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_RemoveAttribute(JLcom/smartengines/doc/DocBaseFieldInfo;Ljava/lang/String;)V

    return-void
.end method

.method public Serialize(Lcom/smartengines/common/Serializer;)V
    .locals 6

    .line 150
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Serializer;->getCPtr(Lcom/smartengines/common/Serializer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_Serialize(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/common/Serializer;)V

    return-void
.end method

.method public SetAcceptFlag(Z)V
    .locals 2

    .line 162
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_SetAcceptFlag(JLcom/smartengines/doc/DocBaseFieldInfo;Z)V

    return-void
.end method

.method public SetAttribute(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 166
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_SetAttribute(JLcom/smartengines/doc/DocBaseFieldInfo;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public SetConfidence(D)V
    .locals 2

    .line 158
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_SetConfidence(JLcom/smartengines/doc/DocBaseFieldInfo;D)V

    return-void
.end method

.method public SetName(Ljava/lang/String;)V
    .locals 2

    .line 154
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocBaseFieldInfo_SetName(JLcom/smartengines/doc/DocBaseFieldInfo;Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocBaseFieldInfo(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocBaseFieldInfo;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/doc/DocBaseFieldInfo;->delete()V

    return-void
.end method
