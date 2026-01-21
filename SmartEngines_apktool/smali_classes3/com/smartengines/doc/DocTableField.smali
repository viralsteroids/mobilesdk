.class public Lcom/smartengines/doc/DocTableField;
.super Ljava/lang/Object;
.source "DocTableField.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/doc/DocTableField;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocTableField;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocTableField;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/doc/DocTableField;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/doc/DocTableField;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTableField;->delete()V

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
.method public GetBaseFieldInfo()Lcom/smartengines/doc/DocBaseFieldInfo;
    .locals 4

    .line 54
    new-instance v0, Lcom/smartengines/doc/DocBaseFieldInfo;

    iget-wide v1, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_GetBaseFieldInfo(JLcom/smartengines/doc/DocTableField;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocBaseFieldInfo;-><init>(JZ)V

    return-object v0
.end method

.method public GetCell(II)Lcom/smartengines/doc/DocTextField;
    .locals 3

    .line 70
    new-instance v0, Lcom/smartengines/doc/DocTextField;

    iget-wide v1, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v1, v2, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_GetCell(JLcom/smartengines/doc/DocTableField;II)J

    move-result-wide p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocTextField;-><init>(JZ)V

    return-object v0
.end method

.method public GetColName(I)Ljava/lang/String;
    .locals 2

    .line 156
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_GetColName(JLcom/smartengines/doc/DocTableField;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GetColsCount()I
    .locals 2

    .line 66
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_GetColsCount(JLcom/smartengines/doc/DocTableField;)I

    move-result v0

    return v0
.end method

.method public GetColumnIndexByName(Ljava/lang/String;)I
    .locals 2

    .line 86
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_GetColumnIndexByName(JLcom/smartengines/doc/DocTableField;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public GetHeaderCell(II)Lcom/smartengines/doc/DocTextField;
    .locals 3

    .line 118
    new-instance v0, Lcom/smartengines/doc/DocTextField;

    iget-wide v1, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v1, v2, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_GetHeaderCell(JLcom/smartengines/doc/DocTableField;II)J

    move-result-wide p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocTextField;-><init>(JZ)V

    return-object v0
.end method

.method public GetHeaderCellPtr(II)Lcom/smartengines/doc/DocTextField;
    .locals 2

    .line 126
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_GetHeaderCellPtr(JLcom/smartengines/doc/DocTableField;II)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 127
    :cond_0
    new-instance v0, Lcom/smartengines/doc/DocTextField;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocTextField;-><init>(JZ)V

    return-object v0
.end method

.method public GetHeaderColsCount()I
    .locals 2

    .line 114
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_GetHeaderColsCount(JLcom/smartengines/doc/DocTableField;)I

    move-result v0

    return v0
.end method

.method public GetHeaderMutableCell(II)Lcom/smartengines/doc/DocTextField;
    .locals 3

    .line 122
    new-instance v0, Lcom/smartengines/doc/DocTextField;

    iget-wide v1, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v1, v2, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_GetHeaderMutableCell(JLcom/smartengines/doc/DocTableField;II)J

    move-result-wide p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocTextField;-><init>(JZ)V

    return-object v0
.end method

.method public GetHeaderMutableCellPtr(II)Lcom/smartengines/doc/DocTextField;
    .locals 2

    .line 131
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_GetHeaderMutableCellPtr(JLcom/smartengines/doc/DocTableField;II)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 132
    :cond_0
    new-instance v0, Lcom/smartengines/doc/DocTextField;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocTextField;-><init>(JZ)V

    return-object v0
.end method

.method public GetHeaderRowsCount()I
    .locals 2

    .line 110
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_GetHeaderRowsCount(JLcom/smartengines/doc/DocTableField;)I

    move-result v0

    return v0
.end method

.method public GetMutableBaseFieldInfo()Lcom/smartengines/doc/DocBaseFieldInfo;
    .locals 4

    .line 58
    new-instance v0, Lcom/smartengines/doc/DocBaseFieldInfo;

    iget-wide v1, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_GetMutableBaseFieldInfo(JLcom/smartengines/doc/DocTableField;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocBaseFieldInfo;-><init>(JZ)V

    return-object v0
.end method

.method public GetMutableCell(II)Lcom/smartengines/doc/DocTextField;
    .locals 3

    .line 74
    new-instance v0, Lcom/smartengines/doc/DocTextField;

    iget-wide v1, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v1, v2, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_GetMutableCell(JLcom/smartengines/doc/DocTableField;II)J

    move-result-wide p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocTextField;-><init>(JZ)V

    return-object v0
.end method

.method public GetRowsCount()I
    .locals 2

    .line 62
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_GetRowsCount(JLcom/smartengines/doc/DocTableField;)I

    move-result v0

    return v0
.end method

.method public HasColumnIndexByName(Ljava/lang/String;)Z
    .locals 2

    .line 82
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_HasColumnIndexByName(JLcom/smartengines/doc/DocTableField;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public ResizeCols(I)V
    .locals 2

    .line 98
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_ResizeCols__SWIG_0(JLcom/smartengines/doc/DocTableField;I)V

    return-void
.end method

.method public ResizeCols(ILcom/smartengines/doc/DocTextField;)V
    .locals 7

    .line 102
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/doc/DocTextField;->getCPtr(Lcom/smartengines/doc/DocTextField;)J

    move-result-wide v4

    move-object v2, p0

    move v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_ResizeCols__SWIG_1(JLcom/smartengines/doc/DocTableField;IJLcom/smartengines/doc/DocTextField;)V

    return-void
.end method

.method public ResizeHeaderCols(I)V
    .locals 2

    .line 148
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_ResizeHeaderCols__SWIG_0(JLcom/smartengines/doc/DocTableField;I)V

    return-void
.end method

.method public ResizeHeaderCols(ILcom/smartengines/doc/DocTextField;)V
    .locals 7

    .line 152
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/doc/DocTextField;->getCPtr(Lcom/smartengines/doc/DocTextField;)J

    move-result-wide v4

    move-object v2, p0

    move v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_ResizeHeaderCols__SWIG_1(JLcom/smartengines/doc/DocTableField;IJLcom/smartengines/doc/DocTextField;)V

    return-void
.end method

.method public ResizeHeaderRows(I)V
    .locals 2

    .line 140
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_ResizeHeaderRows__SWIG_0(JLcom/smartengines/doc/DocTableField;I)V

    return-void
.end method

.method public ResizeHeaderRows(ILcom/smartengines/doc/DocTextField;)V
    .locals 7

    .line 144
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/doc/DocTextField;->getCPtr(Lcom/smartengines/doc/DocTextField;)J

    move-result-wide v4

    move-object v2, p0

    move v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_ResizeHeaderRows__SWIG_1(JLcom/smartengines/doc/DocTableField;IJLcom/smartengines/doc/DocTextField;)V

    return-void
.end method

.method public ResizeRows(I)V
    .locals 2

    .line 90
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_ResizeRows__SWIG_0(JLcom/smartengines/doc/DocTableField;I)V

    return-void
.end method

.method public ResizeRows(ILcom/smartengines/doc/DocTextField;)V
    .locals 7

    .line 94
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/doc/DocTextField;->getCPtr(Lcom/smartengines/doc/DocTextField;)J

    move-result-wide v4

    move-object v2, p0

    move v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_ResizeRows__SWIG_1(JLcom/smartengines/doc/DocTableField;IJLcom/smartengines/doc/DocTextField;)V

    return-void
.end method

.method public Serialize(Lcom/smartengines/common/Serializer;)V
    .locals 6

    .line 106
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Serializer;->getCPtr(Lcom/smartengines/common/Serializer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_Serialize(JLcom/smartengines/doc/DocTableField;JLcom/smartengines/common/Serializer;)V

    return-void
.end method

.method public SetCell(IILcom/smartengines/doc/DocTextField;)V
    .locals 8

    .line 78
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {p3}, Lcom/smartengines/doc/DocTextField;->getCPtr(Lcom/smartengines/doc/DocTextField;)J

    move-result-wide v5

    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object v7, p3

    invoke-static/range {v0 .. v7}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_SetCell(JLcom/smartengines/doc/DocTableField;IIJLcom/smartengines/doc/DocTextField;)V

    return-void
.end method

.method public SetColName(ILjava/lang/String;)V
    .locals 2

    .line 160
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_SetColName(JLcom/smartengines/doc/DocTableField;ILjava/lang/String;)V

    return-void
.end method

.method public SetHeaderCell(IILcom/smartengines/doc/DocTextField;)V
    .locals 8

    .line 136
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    invoke-static {p3}, Lcom/smartengines/doc/DocTextField;->getCPtr(Lcom/smartengines/doc/DocTextField;)J

    move-result-wide v5

    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object v7, p3

    invoke-static/range {v0 .. v7}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableField_SetHeaderCell(JLcom/smartengines/doc/DocTableField;IIJLcom/smartengines/doc/DocTextField;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/doc/DocTableField;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/doc/DocTableField;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocTableField(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocTableField;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTableField;->delete()V

    return-void
.end method
