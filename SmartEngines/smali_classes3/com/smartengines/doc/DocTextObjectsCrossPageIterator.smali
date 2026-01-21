.class public Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;
.super Ljava/lang/Object;
.source "DocTextObjectsCrossPageIterator.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->swigCPtr:J

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;)V
    .locals 2

    .line 54
    invoke-static {p1}, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->getCPtr(Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;)J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/smartengines/doc/jnidocengineJNI;->new_DocTextObjectsCrossPageIterator(JLcom/smartengines/doc/DocTextObjectsCrossPageIterator;)J

    move-result-wide v0

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;-><init>(JZ)V

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->delete()V

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
.method public Advance()V
    .locals 2

    .line 70
    iget-wide v0, p0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTextObjectsCrossPageIterator_Advance(JLcom/smartengines/doc/DocTextObjectsCrossPageIterator;)V

    return-void
.end method

.method public Equals(Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;)Z
    .locals 6

    .line 74
    iget-wide v0, p0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->getCPtr(Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/doc/jnidocengineJNI;->DocTextObjectsCrossPageIterator_Equals(JLcom/smartengines/doc/DocTextObjectsCrossPageIterator;JLcom/smartengines/doc/DocTextObjectsCrossPageIterator;)Z

    move-result p1

    return p1
.end method

.method public GetObjectID()I
    .locals 2

    .line 62
    iget-wide v0, p0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTextObjectsCrossPageIterator_GetObjectID(JLcom/smartengines/doc/DocTextObjectsCrossPageIterator;)I

    move-result v0

    return v0
.end method

.method public GetPhysicalPageID()I
    .locals 2

    .line 58
    iget-wide v0, p0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTextObjectsCrossPageIterator_GetPhysicalPageID(JLcom/smartengines/doc/DocTextObjectsCrossPageIterator;)I

    move-result v0

    return v0
.end method

.method public GetTextObject()Lcom/smartengines/doc/DocTextObject;
    .locals 4

    .line 66
    new-instance v0, Lcom/smartengines/doc/DocTextObject;

    iget-wide v1, p0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/doc/jnidocengineJNI;->DocTextObjectsCrossPageIterator_GetTextObject(JLcom/smartengines/doc/DocTextObjectsCrossPageIterator;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/doc/DocTextObject;-><init>(JZ)V

    return-object v0
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocTextObjectsCrossPageIterator(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTextObjectsCrossPageIterator;->delete()V

    return-void
.end method
