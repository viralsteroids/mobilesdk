.class public Lcom/smartengines/doc/DocTableObject;
.super Lcom/smartengines/doc/DocBasicObject;
.source "DocTableObject.java"


# instance fields
.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 2

    .line 17
    invoke-static {p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableObject_SWIGUpcast(J)J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p3}, Lcom/smartengines/doc/DocBasicObject;-><init>(JZ)V

    .line 18
    iput-wide p1, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    return-void
.end method

.method public static ObjectTypeStatic()Ljava/lang/String;
    .locals 1

    .line 54
    invoke-static {}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableObject_ObjectTypeStatic()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocTableObject;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 22
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocTableObject;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 28
    iget-boolean v0, p0, Lcom/smartengines/doc/DocTableObject;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 30
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    const/4 v2, 0x0

    .line 31
    iput-boolean v2, p0, Lcom/smartengines/doc/DocTableObject;->swigCMemOwn:Z

    .line 32
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTableObject;->delete()V

    return-wide v0

    .line 29
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
.method public GetCell(II)Lcom/smartengines/doc/DocMultiStringTextObject;
    .locals 3

    .line 91
    new-instance v0, Lcom/smartengines/doc/DocMultiStringTextObject;

    iget-wide v1, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    invoke-static {v1, v2, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableObject_GetCell(JLcom/smartengines/doc/DocTableObject;II)J

    move-result-wide p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocMultiStringTextObject;-><init>(JZ)V

    return-object v0
.end method

.method public GetColName(II)Ljava/lang/String;
    .locals 2

    .line 74
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableObject_GetColName(JLcom/smartengines/doc/DocTableObject;II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GetColsCount(I)I
    .locals 2

    .line 62
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableObject_GetColsCount(JLcom/smartengines/doc/DocTableObject;I)I

    move-result p1

    return p1
.end method

.method public GetMutableCell(II)Lcom/smartengines/doc/DocMultiStringTextObject;
    .locals 3

    .line 95
    new-instance v0, Lcom/smartengines/doc/DocMultiStringTextObject;

    iget-wide v1, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    invoke-static {v1, v2, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableObject_GetMutableCell(JLcom/smartengines/doc/DocTableObject;II)J

    move-result-wide p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocMultiStringTextObject;-><init>(JZ)V

    return-object v0
.end method

.method public GetRowsCount()I
    .locals 2

    .line 58
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableObject_GetRowsCount(JLcom/smartengines/doc/DocTableObject;)I

    move-result v0

    return v0
.end method

.method public GetTextCell(II)Lcom/smartengines/doc/DocTextObject;
    .locals 3

    .line 82
    new-instance v0, Lcom/smartengines/doc/DocTextObject;

    iget-wide v1, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    invoke-static {v1, v2, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableObject_GetTextCell(JLcom/smartengines/doc/DocTableObject;II)J

    move-result-wide p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocTextObject;-><init>(JZ)V

    return-object v0
.end method

.method public GetTextCellPtr(II)Lcom/smartengines/doc/DocTextObject;
    .locals 2

    .line 86
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableObject_GetTextCellPtr(JLcom/smartengines/doc/DocTableObject;II)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 87
    :cond_0
    new-instance v0, Lcom/smartengines/doc/DocTextObject;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocTextObject;-><init>(JZ)V

    return-object v0
.end method

.method public ResizeCols(II)V
    .locals 2

    .line 70
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableObject_ResizeCols(JLcom/smartengines/doc/DocTableObject;II)V

    return-void
.end method

.method public ResizeRows(I)V
    .locals 2

    .line 66
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableObject_ResizeRows(JLcom/smartengines/doc/DocTableObject;I)V

    return-void
.end method

.method public SetCell(IILcom/smartengines/doc/DocMultiStringTextObject;)V
    .locals 8

    .line 99
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    invoke-static {p3}, Lcom/smartengines/doc/DocMultiStringTextObject;->getCPtr(Lcom/smartengines/doc/DocMultiStringTextObject;)J

    move-result-wide v5

    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object v7, p3

    invoke-static/range {v0 .. v7}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableObject_SetCell(JLcom/smartengines/doc/DocTableObject;IIJLcom/smartengines/doc/DocMultiStringTextObject;)V

    return-void
.end method

.method public SetColName(IILjava/lang/String;)V
    .locals 6

    .line 78
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocTableObject_SetColName(JLcom/smartengines/doc/DocTableObject;IILjava/lang/String;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 4

    monitor-enter p0

    .line 43
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 44
    iget-boolean v0, p0, Lcom/smartengines/doc/DocTableObject;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 45
    iput-boolean v0, p0, Lcom/smartengines/doc/DocTableObject;->swigCMemOwn:Z

    .line 46
    iget-wide v0, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocTableObject(J)V

    .line 48
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocTableObject;->swigCPtr:J

    .line 50
    :cond_1
    invoke-super {p0}, Lcom/smartengines/doc/DocBasicObject;->delete()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
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

    .line 39
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTableObject;->delete()V

    return-void
.end method
