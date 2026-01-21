.class public Lcom/smartengines/common/OcrString;
.super Ljava/lang/Object;
.source "OcrString.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 52
    invoke-static {}, Lcom/smartengines/common/jnisecommonJNI;->new_OcrString__SWIG_0()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/common/OcrString;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-boolean p3, p0, Lcom/smartengines/common/OcrString;->swigCMemOwn:Z

    .line 17
    iput-wide p1, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/common/OcrChar;I)V
    .locals 2

    .line 60
    invoke-static {p1}, Lcom/smartengines/common/OcrChar;->getCPtr(Lcom/smartengines/common/OcrChar;)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lcom/smartengines/common/jnisecommonJNI;->new_OcrString__SWIG_2(JLcom/smartengines/common/OcrChar;I)J

    move-result-wide p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/smartengines/common/OcrString;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/common/OcrString;)V
    .locals 2

    .line 64
    invoke-static {p1}, Lcom/smartengines/common/OcrString;->getCPtr(Lcom/smartengines/common/OcrString;)J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/smartengines/common/jnisecommonJNI;->new_OcrString__SWIG_3(JLcom/smartengines/common/OcrString;)J

    move-result-wide v0

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/smartengines/common/OcrString;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 56
    invoke-static {p1}, Lcom/smartengines/common/jnisecommonJNI;->new_OcrString__SWIG_1(Ljava/lang/String;)J

    move-result-wide v0

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/smartengines/common/OcrString;-><init>(JZ)V

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/common/OcrString;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 21
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/common/OcrString;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 27
    iget-boolean v0, p0, Lcom/smartengines/common/OcrString;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 29
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    const/4 v2, 0x0

    .line 30
    iput-boolean v2, p0, Lcom/smartengines/common/OcrString;->swigCMemOwn:Z

    .line 31
    invoke-virtual {p0}, Lcom/smartengines/common/OcrString;->delete()V

    return-wide v0

    .line 28
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
.method public AppendChar(Lcom/smartengines/common/OcrChar;)V
    .locals 6

    .line 89
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/OcrChar;->getCPtr(Lcom/smartengines/common/OcrChar;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_AppendChar(JLcom/smartengines/common/OcrString;JLcom/smartengines/common/OcrChar;)V

    return-void
.end method

.method public AppendString(Lcom/smartengines/common/OcrString;)V
    .locals 6

    .line 93
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/OcrString;->getCPtr(Lcom/smartengines/common/OcrString;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_AppendString(JLcom/smartengines/common/OcrString;JLcom/smartengines/common/OcrString;)V

    return-void
.end method

.method public GetAcceptFlag()Z
    .locals 2

    .line 105
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_GetAcceptFlag(JLcom/smartengines/common/OcrString;)Z

    move-result v0

    return v0
.end method

.method public GetBestVariantConfidenceByIndex(I)F
    .locals 2

    .line 113
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_GetBestVariantConfidenceByIndex(JLcom/smartengines/common/OcrString;I)F

    move-result p1

    return p1
.end method

.method public GetCellAcceptFlagByIndex(I)Z
    .locals 2

    .line 109
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_GetCellAcceptFlagByIndex(JLcom/smartengines/common/OcrString;I)Z

    move-result p1

    return p1
.end method

.method public GetChar(I)Lcom/smartengines/common/OcrChar;
    .locals 3

    .line 77
    new-instance v0, Lcom/smartengines/common/OcrChar;

    iget-wide v1, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_GetChar(JLcom/smartengines/common/OcrString;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/OcrChar;-><init>(JZ)V

    return-object v0
.end method

.method public GetChars()Lcom/smartengines/common/OcrChar;
    .locals 4

    .line 72
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_GetChars(JLcom/smartengines/common/OcrString;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 73
    :cond_0
    new-instance v2, Lcom/smartengines/common/OcrChar;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/common/OcrChar;-><init>(JZ)V

    return-object v2
.end method

.method public GetCharsCount()I
    .locals 2

    .line 68
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_GetCharsCount(JLcom/smartengines/common/OcrString;)I

    move-result v0

    return v0
.end method

.method public GetFirstString()Lcom/smartengines/common/MutableString;
    .locals 4

    .line 121
    new-instance v0, Lcom/smartengines/common/MutableString;

    iget-wide v1, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_GetFirstString(JLcom/smartengines/common/OcrString;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/MutableString;-><init>(JZ)V

    return-object v0
.end method

.method public GetMutableChar(I)Lcom/smartengines/common/OcrChar;
    .locals 3

    .line 81
    new-instance v0, Lcom/smartengines/common/OcrChar;

    iget-wide v1, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_GetMutableChar(JLcom/smartengines/common/OcrString;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/OcrChar;-><init>(JZ)V

    return-object v0
.end method

.method public GetPairTable()Lcom/smartengines/common/OcrPair;
    .locals 4

    .line 137
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_GetPairTable(JLcom/smartengines/common/OcrString;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 138
    :cond_0
    new-instance v2, Lcom/smartengines/common/OcrPair;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/common/OcrPair;-><init>(JZ)V

    return-object v2
.end method

.method public GetQuadrangleByIndex(I)Lcom/smartengines/common/Quadrangle;
    .locals 3

    .line 101
    new-instance v0, Lcom/smartengines/common/Quadrangle;

    iget-wide v1, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_GetQuadrangleByIndex(JLcom/smartengines/common/OcrString;I)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/Quadrangle;-><init>(JZ)V

    return-object v0
.end method

.method public RepackChars()V
    .locals 2

    .line 129
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_RepackChars(JLcom/smartengines/common/OcrString;)V

    return-void
.end method

.method public Resize(I)V
    .locals 2

    .line 97
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_Resize(JLcom/smartengines/common/OcrString;I)V

    return-void
.end method

.method public Serialize(Lcom/smartengines/common/Serializer;)V
    .locals 6

    .line 133
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Serializer;->getCPtr(Lcom/smartengines/common/Serializer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_Serialize(JLcom/smartengines/common/OcrString;JLcom/smartengines/common/Serializer;)V

    return-void
.end method

.method public SetChar(ILcom/smartengines/common/OcrChar;)V
    .locals 7

    .line 85
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/common/OcrChar;->getCPtr(Lcom/smartengines/common/OcrChar;)J

    move-result-wide v4

    move-object v2, p0

    move v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_SetChar(JLcom/smartengines/common/OcrString;IJLcom/smartengines/common/OcrChar;)V

    return-void
.end method

.method public SortVariants()V
    .locals 2

    .line 117
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_SortVariants(JLcom/smartengines/common/OcrString;)V

    return-void
.end method

.method public UnpackChars()V
    .locals 2

    .line 125
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->OcrString_UnpackChars(JLcom/smartengines/common/OcrString;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 42
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 43
    iget-boolean v4, p0, Lcom/smartengines/common/OcrString;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 44
    iput-boolean v4, p0, Lcom/smartengines/common/OcrString;->swigCMemOwn:Z

    .line 45
    invoke-static {v0, v1}, Lcom/smartengines/common/jnisecommonJNI;->delete_OcrString(J)V

    .line 47
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/common/OcrString;->swigCPtr:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
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

    .line 38
    invoke-virtual {p0}, Lcom/smartengines/common/OcrString;->delete()V

    return-void
.end method
