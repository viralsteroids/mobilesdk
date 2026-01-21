.class public Lcom/smartengines/doc/DocResult;
.super Ljava/lang/Object;
.source "DocResult.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/doc/DocResult;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocResult;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocResult;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/doc/DocResult;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/doc/DocResult;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/doc/DocResult;->delete()V

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
.method public AddDocument(Lcom/smartengines/doc/Document;)Lcom/smartengines/doc/DocumentsMutableIterator;
    .locals 7

    .line 135
    new-instance v0, Lcom/smartengines/doc/DocumentsMutableIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/Document;->getCPtr(Lcom/smartengines/doc/Document;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_AddDocument(JLcom/smartengines/doc/DocResult;JLcom/smartengines/doc/Document;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocumentsMutableIterator;-><init>(JZ)V

    return-object v0
.end method

.method public AddTextModesBegin()Lcom/smartengines/common/StringsVectorIterator;
    .locals 4

    .line 191
    new-instance v0, Lcom/smartengines/common/StringsVectorIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_AddTextModesBegin(JLcom/smartengines/doc/DocResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsVectorIterator;-><init>(JZ)V

    return-object v0
.end method

.method public AddTextModesEnd()Lcom/smartengines/common/StringsVectorIterator;
    .locals 4

    .line 195
    new-instance v0, Lcom/smartengines/common/StringsVectorIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_AddTextModesEnd(JLcom/smartengines/doc/DocResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsVectorIterator;-><init>(JZ)V

    return-object v0
.end method

.method public BuildPDFABuffer()V
    .locals 2

    .line 167
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_BuildPDFABuffer(JLcom/smartengines/doc/DocResult;)V

    return-void
.end method

.method public CanBuildPDFABuffer()Z
    .locals 2

    .line 163
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_CanBuildPDFABuffer(JLcom/smartengines/doc/DocResult;)Z

    move-result v0

    return v0
.end method

.method public Clone()Lcom/smartengines/doc/DocResult;
    .locals 4

    .line 59
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_Clone(JLcom/smartengines/doc/DocResult;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 60
    :cond_0
    new-instance v2, Lcom/smartengines/doc/DocResult;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/doc/DocResult;-><init>(JZ)V

    return-object v2
.end method

.method public DocumentsBegin()Lcom/smartengines/doc/DocumentsIterator;
    .locals 4

    .line 76
    new-instance v0, Lcom/smartengines/doc/DocumentsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_DocumentsBegin(JLcom/smartengines/doc/DocResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocumentsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public DocumentsEnd()Lcom/smartengines/doc/DocumentsIterator;
    .locals 4

    .line 80
    new-instance v0, Lcom/smartengines/doc/DocumentsIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_DocumentsEnd(JLcom/smartengines/doc/DocResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocumentsIterator;-><init>(JZ)V

    return-object v0
.end method

.method public DocumentsSlice(Ljava/lang/String;)Lcom/smartengines/doc/DocumentsSliceIterator;
    .locals 3

    .line 155
    new-instance v0, Lcom/smartengines/doc/DocumentsSliceIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_DocumentsSlice(JLcom/smartengines/doc/DocResult;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocumentsSliceIterator;-><init>(JZ)V

    return-object v0
.end method

.method public GetAddTextMode()Ljava/lang/String;
    .locals 2

    .line 183
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetAddTextMode(JLcom/smartengines/doc/DocResult;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public GetColourMode()Z
    .locals 2

    .line 223
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetColourMode(JLcom/smartengines/doc/DocResult;)Z

    move-result v0

    return v0
.end method

.method public GetDocument(I)Lcom/smartengines/doc/Document;
    .locals 3

    .line 72
    new-instance v0, Lcom/smartengines/doc/Document;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetDocument(JLcom/smartengines/doc/DocResult;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/Document;-><init>(JZ)V

    return-object v0
.end method

.method public GetDocumentTags(I)Lcom/smartengines/doc/DocTagsCollection;
    .locals 3

    .line 131
    new-instance v0, Lcom/smartengines/doc/DocTagsCollection;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetDocumentTags(JLcom/smartengines/doc/DocResult;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTagsCollection;-><init>(JZ)V

    return-object v0
.end method

.method public GetDocumentsCount()I
    .locals 2

    .line 64
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetDocumentsCount(JLcom/smartengines/doc/DocResult;)I

    move-result v0

    return v0
.end method

.method public GetGraphicalStructure()Lcom/smartengines/doc/DocGraphicalStructure;
    .locals 4

    .line 119
    new-instance v0, Lcom/smartengines/doc/DocGraphicalStructure;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetGraphicalStructure(JLcom/smartengines/doc/DocResult;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocGraphicalStructure;-><init>(JZ)V

    return-object v0
.end method

.method public GetLastSceneInfo()Lcom/smartengines/doc/DocSceneInfo;
    .locals 4

    .line 105
    new-instance v0, Lcom/smartengines/doc/DocSceneInfo;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetLastSceneInfo(JLcom/smartengines/doc/DocResult;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocSceneInfo;-><init>(JZ)V

    return-object v0
.end method

.method public GetLastSceneInfoPtr()Lcom/smartengines/doc/DocSceneInfo;
    .locals 4

    .line 114
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetLastSceneInfoPtr(JLcom/smartengines/doc/DocResult;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 115
    :cond_0
    new-instance v2, Lcom/smartengines/doc/DocSceneInfo;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/doc/DocSceneInfo;-><init>(JZ)V

    return-object v2
.end method

.method public GetMutableDocument(I)Lcom/smartengines/doc/Document;
    .locals 3

    .line 127
    new-instance v0, Lcom/smartengines/doc/Document;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetMutableDocument(JLcom/smartengines/doc/DocResult;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/Document;-><init>(JZ)V

    return-object v0
.end method

.method public GetMutableGraphicalStructure()Lcom/smartengines/doc/DocGraphicalStructure;
    .locals 4

    .line 123
    new-instance v0, Lcom/smartengines/doc/DocGraphicalStructure;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetMutableGraphicalStructure(JLcom/smartengines/doc/DocResult;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocGraphicalStructure;-><init>(JZ)V

    return-object v0
.end method

.method public GetPDFABuffer([B)V
    .locals 2

    .line 171
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetPDFABuffer(JLcom/smartengines/doc/DocResult;[B)V

    return-void
.end method

.method public GetPDFABufferSize()I
    .locals 2

    .line 175
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetPDFABufferSize(JLcom/smartengines/doc/DocResult;)I

    move-result v0

    return v0
.end method

.method public GetPhysicalDocument(I)Lcom/smartengines/doc/DocPhysicalDocument;
    .locals 3

    .line 88
    new-instance v0, Lcom/smartengines/doc/DocPhysicalDocument;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetPhysicalDocument(JLcom/smartengines/doc/DocResult;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocPhysicalDocument;-><init>(JZ)V

    return-object v0
.end method

.method public GetPhysicalDocumentPtr(I)Lcom/smartengines/doc/DocPhysicalDocument;
    .locals 4

    .line 92
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetPhysicalDocumentPtr(JLcom/smartengines/doc/DocResult;I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 93
    :cond_0
    new-instance p1, Lcom/smartengines/doc/DocPhysicalDocument;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, v2}, Lcom/smartengines/doc/DocPhysicalDocument;-><init>(JZ)V

    return-object p1
.end method

.method public GetSceneInfo(I)Lcom/smartengines/doc/DocSceneInfo;
    .locals 3

    .line 101
    new-instance v0, Lcom/smartengines/doc/DocSceneInfo;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetSceneInfo(JLcom/smartengines/doc/DocResult;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocSceneInfo;-><init>(JZ)V

    return-object v0
.end method

.method public GetSceneInfoPtr(I)Lcom/smartengines/doc/DocSceneInfo;
    .locals 4

    .line 109
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetSceneInfoPtr(JLcom/smartengines/doc/DocResult;I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 110
    :cond_0
    new-instance p1, Lcom/smartengines/doc/DocSceneInfo;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, v2}, Lcom/smartengines/doc/DocSceneInfo;-><init>(JZ)V

    return-object p1
.end method

.method public GetScenesCount()I
    .locals 2

    .line 97
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetScenesCount(JLcom/smartengines/doc/DocResult;)I

    move-result v0

    return v0
.end method

.method public GetTextTypeMode()Ljava/lang/String;
    .locals 2

    .line 203
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_GetTextTypeMode(JLcom/smartengines/doc/DocResult;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public HasAddTextMode(Ljava/lang/String;)Z
    .locals 2

    .line 187
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_HasAddTextMode(JLcom/smartengines/doc/DocResult;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasDocument(I)Z
    .locals 2

    .line 68
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_HasDocument(JLcom/smartengines/doc/DocResult;I)Z

    move-result p1

    return p1
.end method

.method public HasTextTypeMode(Ljava/lang/String;)Z
    .locals 2

    .line 207
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_HasTextTypeMode(JLcom/smartengines/doc/DocResult;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public MutableDocumentsBegin()Lcom/smartengines/doc/DocumentsMutableIterator;
    .locals 4

    .line 147
    new-instance v0, Lcom/smartengines/doc/DocumentsMutableIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_MutableDocumentsBegin(JLcom/smartengines/doc/DocResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocumentsMutableIterator;-><init>(JZ)V

    return-object v0
.end method

.method public MutableDocumentsEnd()Lcom/smartengines/doc/DocumentsMutableIterator;
    .locals 4

    .line 151
    new-instance v0, Lcom/smartengines/doc/DocumentsMutableIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_MutableDocumentsEnd(JLcom/smartengines/doc/DocResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocumentsMutableIterator;-><init>(JZ)V

    return-object v0
.end method

.method public MutableDocumentsSlice(Ljava/lang/String;)Lcom/smartengines/doc/DocumentsMutableSliceIterator;
    .locals 3

    .line 159
    new-instance v0, Lcom/smartengines/doc/DocumentsMutableSliceIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_MutableDocumentsSlice(JLcom/smartengines/doc/DocResult;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocumentsMutableSliceIterator;-><init>(JZ)V

    return-object v0
.end method

.method public PartialClone()Lcom/smartengines/doc/DocResult;
    .locals 4

    .line 54
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_PartialClone(JLcom/smartengines/doc/DocResult;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 55
    :cond_0
    new-instance v2, Lcom/smartengines/doc/DocResult;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/doc/DocResult;-><init>(JZ)V

    return-object v2
.end method

.method public RemoveDocument(I)V
    .locals 2

    .line 143
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_RemoveDocument(JLcom/smartengines/doc/DocResult;I)V

    return-void
.end method

.method public Serialize(Lcom/smartengines/common/Serializer;)V
    .locals 6

    .line 84
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Serializer;->getCPtr(Lcom/smartengines/common/Serializer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_Serialize(JLcom/smartengines/doc/DocResult;JLcom/smartengines/common/Serializer;)V

    return-void
.end method

.method public SetAddTextMode(Ljava/lang/String;)V
    .locals 2

    .line 179
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_SetAddTextMode(JLcom/smartengines/doc/DocResult;Ljava/lang/String;)V

    return-void
.end method

.method public SetColourMode(Z)V
    .locals 2

    .line 219
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_SetColourMode(JLcom/smartengines/doc/DocResult;Z)V

    return-void
.end method

.method public SetDocument(ILcom/smartengines/doc/Document;)V
    .locals 7

    .line 139
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/doc/Document;->getCPtr(Lcom/smartengines/doc/Document;)J

    move-result-wide v4

    move-object v2, p0

    move v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_SetDocument(JLcom/smartengines/doc/DocResult;IJLcom/smartengines/doc/Document;)V

    return-void
.end method

.method public SetTextTypeMode(Ljava/lang/String;)V
    .locals 2

    .line 199
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_SetTextTypeMode(JLcom/smartengines/doc/DocResult;Ljava/lang/String;)V

    return-void
.end method

.method public TextTypeModesBegin()Lcom/smartengines/common/StringsVectorIterator;
    .locals 4

    .line 211
    new-instance v0, Lcom/smartengines/common/StringsVectorIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_TextTypeModesBegin(JLcom/smartengines/doc/DocResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsVectorIterator;-><init>(JZ)V

    return-object v0
.end method

.method public TextTypeModesEnd()Lcom/smartengines/common/StringsVectorIterator;
    .locals 4

    .line 215
    new-instance v0, Lcom/smartengines/common/StringsVectorIterator;

    iget-wide v1, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocResult_TextTypeModesEnd(JLcom/smartengines/doc/DocResult;)J

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
    iget-wide v0, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/doc/DocResult;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/doc/DocResult;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocResult(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocResult;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/doc/DocResult;->delete()V

    return-void
.end method
