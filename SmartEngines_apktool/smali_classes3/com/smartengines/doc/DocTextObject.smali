.class public Lcom/smartengines/doc/DocTextObject;
.super Lcom/smartengines/doc/DocBasicObject;
.source "DocTextObject.java"


# instance fields
.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 2

    .line 17
    invoke-static {p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocTextObject_SWIGUpcast(J)J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p3}, Lcom/smartengines/doc/DocBasicObject;-><init>(JZ)V

    .line 18
    iput-wide p1, p0, Lcom/smartengines/doc/DocTextObject;->swigCPtr:J

    return-void
.end method

.method public static ObjectTypeStatic()Ljava/lang/String;
    .locals 1

    .line 54
    invoke-static {}, Lcom/smartengines/doc/jnidocengineJNI;->DocTextObject_ObjectTypeStatic()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocTextObject;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 22
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocTextObject;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocTextObject;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 28
    iget-boolean v0, p0, Lcom/smartengines/doc/DocTextObject;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 30
    iget-wide v0, p0, Lcom/smartengines/doc/DocTextObject;->swigCPtr:J

    const/4 v2, 0x0

    .line 31
    iput-boolean v2, p0, Lcom/smartengines/doc/DocTextObject;->swigCMemOwn:Z

    .line 32
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTextObject;->delete()V

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
.method public GetMutableOcrString()Lcom/smartengines/common/OcrString;
    .locals 4

    .line 75
    new-instance v0, Lcom/smartengines/common/OcrString;

    iget-wide v1, p0, Lcom/smartengines/doc/DocTextObject;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTextObject_GetMutableOcrString(JLcom/smartengines/doc/DocTextObject;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/OcrString;-><init>(JZ)V

    return-object v0
.end method

.method public GetOcrString()Lcom/smartengines/common/OcrString;
    .locals 4

    .line 58
    new-instance v0, Lcom/smartengines/common/OcrString;

    iget-wide v1, p0, Lcom/smartengines/doc/DocTextObject;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTextObject_GetOcrString(JLcom/smartengines/doc/DocTextObject;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/OcrString;-><init>(JZ)V

    return-object v0
.end method

.method public GetTextLineObject(I)Lcom/smartengines/doc/DocTextLineObject;
    .locals 3

    .line 66
    new-instance v0, Lcom/smartengines/doc/DocTextLineObject;

    iget-wide v1, p0, Lcom/smartengines/doc/DocTextObject;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocTextObject_GetTextLineObject(JLcom/smartengines/doc/DocTextObject;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/doc/DocTextLineObject;-><init>(JZ)V

    return-object v0
.end method

.method public GetTextLineObjectPtr(I)Lcom/smartengines/doc/DocTextLineObject;
    .locals 4

    .line 70
    iget-wide v0, p0, Lcom/smartengines/doc/DocTextObject;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/doc/jnidocengineJNI;->DocTextObject_GetTextLineObjectPtr(JLcom/smartengines/doc/DocTextObject;I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 71
    :cond_0
    new-instance p1, Lcom/smartengines/doc/DocTextLineObject;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, v2}, Lcom/smartengines/doc/DocTextLineObject;-><init>(JZ)V

    return-object p1
.end method

.method public GetTextLineObjectsCount()I
    .locals 2

    .line 62
    iget-wide v0, p0, Lcom/smartengines/doc/DocTextObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTextObject_GetTextLineObjectsCount(JLcom/smartengines/doc/DocTextObject;)I

    move-result v0

    return v0
.end method

.method public SetOcrString(Lcom/smartengines/common/OcrString;)V
    .locals 6

    .line 79
    iget-wide v0, p0, Lcom/smartengines/doc/DocTextObject;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/OcrString;->getCPtr(Lcom/smartengines/common/OcrString;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocTextObject_SetOcrString(JLcom/smartengines/doc/DocTextObject;JLcom/smartengines/common/OcrString;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 4

    monitor-enter p0

    .line 43
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocTextObject;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 44
    iget-boolean v0, p0, Lcom/smartengines/doc/DocTextObject;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 45
    iput-boolean v0, p0, Lcom/smartengines/doc/DocTextObject;->swigCMemOwn:Z

    .line 46
    iget-wide v0, p0, Lcom/smartengines/doc/DocTextObject;->swigCPtr:J

    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocTextObject(J)V

    .line 48
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocTextObject;->swigCPtr:J

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
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTextObject;->delete()V

    return-void
.end method
