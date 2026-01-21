.class public Lcom/smartengines/doc/DocPhysicalPage;
.super Ljava/lang/Object;
.source "DocPhysicalPage.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocPhysicalPage;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocPhysicalPage;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/doc/DocPhysicalPage;->delete()V

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
.method public BarcodeObjectsBegin(Ljava/lang/String;)Lcom/smartengines/doc/DocBarcodeObjectsIterator;
    .locals 3

    .line 82
    new-instance v0, Lcom/smartengines/doc/DocBarcodeObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_BarcodeObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBarcodeObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public BarcodeObjectsEnd(Ljava/lang/String;)Lcom/smartengines/doc/DocBarcodeObjectsIterator;
    .locals 3

    .line 86
    new-instance v0, Lcom/smartengines/doc/DocBarcodeObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_BarcodeObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBarcodeObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public BasicObjectsBegin(Ljava/lang/String;)Lcom/smartengines/doc/DocBasicObjectsIterator;
    .locals 3

    .line 206
    new-instance v0, Lcom/smartengines/doc/DocBasicObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_BasicObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBasicObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public BasicObjectsEnd(Ljava/lang/String;)Lcom/smartengines/doc/DocBasicObjectsIterator;
    .locals 3

    .line 210
    new-instance v0, Lcom/smartengines/doc/DocBasicObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_BasicObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocBasicObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public CheckboxObjectsBegin(Ljava/lang/String;)Lcom/smartengines/doc/DocCheckboxObjectsIterator;
    .locals 3

    .line 90
    new-instance v0, Lcom/smartengines/doc/DocCheckboxObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_CheckboxObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocCheckboxObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public CheckboxObjectsEnd(Ljava/lang/String;)Lcom/smartengines/doc/DocCheckboxObjectsIterator;
    .locals 3

    .line 94
    new-instance v0, Lcom/smartengines/doc/DocCheckboxObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_CheckboxObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocCheckboxObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ForensicCheckObjectsBegin(Ljava/lang/String;)Lcom/smartengines/doc/DocForensicCheckObjectsIterator;
    .locals 3

    .line 106
    new-instance v0, Lcom/smartengines/doc/DocForensicCheckObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_ForensicCheckObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocForensicCheckObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ForensicCheckObjectsEnd(Ljava/lang/String;)Lcom/smartengines/doc/DocForensicCheckObjectsIterator;
    .locals 3

    .line 110
    new-instance v0, Lcom/smartengines/doc/DocForensicCheckObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_ForensicCheckObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocForensicCheckObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ForensicObjectsBegin(Ljava/lang/String;)Lcom/smartengines/doc/DocMetaObjectsIterator;
    .locals 3

    .line 98
    new-instance v0, Lcom/smartengines/doc/DocMetaObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_ForensicObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocMetaObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ForensicObjectsEnd(Ljava/lang/String;)Lcom/smartengines/doc/DocMetaObjectsIterator;
    .locals 3

    .line 102
    new-instance v0, Lcom/smartengines/doc/DocMetaObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_ForensicObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocMetaObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public GetBarcodeObjectsCount(Ljava/lang/String;)I
    .locals 2

    .line 126
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetBarcodeObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public GetBasicObjectsCount(Ljava/lang/String;)I
    .locals 2

    .line 214
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetBasicObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public GetCheckboxObjectsCount(Ljava/lang/String;)I
    .locals 2

    .line 130
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetCheckboxObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public GetForensicCheckObjectsCount(Ljava/lang/String;)I
    .locals 2

    .line 138
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetForensicCheckObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public GetForensicObjectsCount(Ljava/lang/String;)I
    .locals 2

    .line 134
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetForensicObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public GetFulltextBasicObjectsBegin()Lcom/smartengines/doc/DocTextObjectsIterator;
    .locals 4

    .line 173
    new-instance v0, Lcom/smartengines/doc/DocTextObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetFulltextBasicObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocTextObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public GetFulltextBasicObjectsEnd()Lcom/smartengines/doc/DocTextObjectsIterator;
    .locals 4

    .line 177
    new-instance v0, Lcom/smartengines/doc/DocTextObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetFulltextBasicObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocTextObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public GetImageObjectsCount(Ljava/lang/String;)I
    .locals 2

    .line 118
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetImageObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public GetPageImageFromScene(Lcom/smartengines/common/Image;)Lcom/smartengines/common/Image;
    .locals 6

    .line 181
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Image;->getCPtr(Lcom/smartengines/common/Image;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetPageImageFromScene(JLcom/smartengines/doc/DocPhysicalPage;JLcom/smartengines/common/Image;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 182
    :cond_0
    new-instance p1, Lcom/smartengines/common/Image;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, v2}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p1
.end method

.method public GetPageInfo()Lcom/smartengines/doc/DocPageInfo;
    .locals 4

    .line 146
    new-instance v0, Lcom/smartengines/doc/DocPageInfo;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetPageInfo(JLcom/smartengines/doc/DocPhysicalPage;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocPageInfo;-><init>(JZ)V

    return-object v0
.end method

.method public GetPageInfoPtr()Lcom/smartengines/doc/DocPageInfo;
    .locals 4

    .line 150
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetPageInfoPtr(JLcom/smartengines/doc/DocPhysicalPage;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 151
    :cond_0
    new-instance v2, Lcom/smartengines/doc/DocPageInfo;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/doc/DocPageInfo;-><init>(JZ)V

    return-object v2
.end method

.method public GetPagePolygon()Lcom/smartengines/common/Polygon;
    .locals 4

    .line 159
    new-instance v0, Lcom/smartengines/common/Polygon;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetPagePolygon(JLcom/smartengines/doc/DocPhysicalPage;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/Polygon;-><init>(JZ)V

    return-object v0
.end method

.method public GetPagePolygonPtr()Lcom/smartengines/common/Polygon;
    .locals 4

    .line 168
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetPagePolygonPtr(JLcom/smartengines/doc/DocPhysicalPage;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 169
    :cond_0
    new-instance v2, Lcom/smartengines/common/Polygon;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/common/Polygon;-><init>(JZ)V

    return-object v2
.end method

.method public GetPageQuadrangle()Lcom/smartengines/common/Quadrangle;
    .locals 4

    .line 155
    new-instance v0, Lcom/smartengines/common/Quadrangle;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetPageQuadrangle(JLcom/smartengines/doc/DocPhysicalPage;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/Quadrangle;-><init>(JZ)V

    return-object v0
.end method

.method public GetPageQuadranglePtr()Lcom/smartengines/common/Quadrangle;
    .locals 4

    .line 163
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetPageQuadranglePtr(JLcom/smartengines/doc/DocPhysicalPage;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 164
    :cond_0
    new-instance v2, Lcom/smartengines/common/Quadrangle;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/common/Quadrangle;-><init>(JZ)V

    return-object v2
.end method

.method public GetRawTextObject(Ljava/lang/String;)Lcom/smartengines/doc/DocTextObject;
    .locals 3

    .line 202
    new-instance v0, Lcom/smartengines/doc/DocTextObject;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetRawTextObject(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTextObject;-><init>(JZ)V

    return-object v0
.end method

.method public GetRawTextObjectsCount()I
    .locals 2

    .line 194
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetRawTextObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;)I

    move-result v0

    return v0
.end method

.method public GetSourceSceneID()I
    .locals 2

    .line 54
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetSourceSceneID(JLcom/smartengines/doc/DocPhysicalPage;)I

    move-result v0

    return v0
.end method

.method public GetTableObjectsCount(Ljava/lang/String;)I
    .locals 2

    .line 122
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetTableObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public GetTextObjectsCount(Ljava/lang/String;)I
    .locals 2

    .line 114
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_GetTextObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public HasBasicObjects()Z
    .locals 2

    .line 142
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_HasBasicObjects(JLcom/smartengines/doc/DocPhysicalPage;)Z

    move-result v0

    return v0
.end method

.method public HasRawTextObject(Ljava/lang/String;)Z
    .locals 2

    .line 198
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_HasRawTextObject(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public ImageObjectsBegin(Ljava/lang/String;)Lcom/smartengines/doc/DocImageObjectsIterator;
    .locals 3

    .line 66
    new-instance v0, Lcom/smartengines/doc/DocImageObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_ImageObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocImageObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ImageObjectsEnd(Ljava/lang/String;)Lcom/smartengines/doc/DocImageObjectsIterator;
    .locals 3

    .line 70
    new-instance v0, Lcom/smartengines/doc/DocImageObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_ImageObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocImageObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public RawTextObjectsBegin()Lcom/smartengines/doc/DocTextObjectsIterator;
    .locals 4

    .line 186
    new-instance v0, Lcom/smartengines/doc/DocTextObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_RawTextObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocTextObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public RawTextObjectsEnd()Lcom/smartengines/doc/DocTextObjectsIterator;
    .locals 4

    .line 190
    new-instance v0, Lcom/smartengines/doc/DocTextObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_RawTextObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocTextObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public TableObjectsBegin(Ljava/lang/String;)Lcom/smartengines/doc/DocTableObjectsIterator;
    .locals 3

    .line 74
    new-instance v0, Lcom/smartengines/doc/DocTableObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_TableObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTableObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public TableObjectsEnd(Ljava/lang/String;)Lcom/smartengines/doc/DocTableObjectsIterator;
    .locals 3

    .line 78
    new-instance v0, Lcom/smartengines/doc/DocTableObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_TableObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTableObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public TextObjectsBegin(Ljava/lang/String;)Lcom/smartengines/doc/DocTextObjectsIterator;
    .locals 3

    .line 58
    new-instance v0, Lcom/smartengines/doc/DocTextObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_TextObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTextObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public TextObjectsEnd(Ljava/lang/String;)Lcom/smartengines/doc/DocTextObjectsIterator;
    .locals 3

    .line 62
    new-instance v0, Lcom/smartengines/doc/DocTextObjectsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocPhysicalPage_TextObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTextObjectsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocPhysicalPage(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocPhysicalPage;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/doc/DocPhysicalPage;->delete()V

    return-void
.end method
