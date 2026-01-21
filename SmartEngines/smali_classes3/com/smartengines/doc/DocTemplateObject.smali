.class public Lcom/smartengines/doc/DocTemplateObject;
.super Lcom/smartengines/doc/DocBasicObject;
.source "DocTemplateObject.java"


# instance fields
.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 2

    .line 17
    invoke-static {p1, p2}, Lcom/smartengines/doc/jnidocengineJNI;->DocTemplateObject_SWIGUpcast(J)J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p3}, Lcom/smartengines/doc/DocBasicObject;-><init>(JZ)V

    .line 18
    iput-wide p1, p0, Lcom/smartengines/doc/DocTemplateObject;->swigCPtr:J

    return-void
.end method

.method public static ObjectTypeStatic()Ljava/lang/String;
    .locals 1

    .line 54
    invoke-static {}, Lcom/smartengines/doc/jnidocengineJNI;->DocTemplateObject_ObjectTypeStatic()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getCPtr(Lcom/smartengines/doc/DocTemplateObject;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 22
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocTemplateObject;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/doc/DocTemplateObject;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 28
    iget-boolean v0, p0, Lcom/smartengines/doc/DocTemplateObject;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 30
    iget-wide v0, p0, Lcom/smartengines/doc/DocTemplateObject;->swigCPtr:J

    const/4 v2, 0x0

    .line 31
    iput-boolean v2, p0, Lcom/smartengines/doc/DocTemplateObject;->swigCMemOwn:Z

    .line 32
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTemplateObject;->delete()V

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
.method public declared-synchronized delete()V
    .locals 4

    monitor-enter p0

    .line 43
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/doc/DocTemplateObject;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 44
    iget-boolean v0, p0, Lcom/smartengines/doc/DocTemplateObject;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 45
    iput-boolean v0, p0, Lcom/smartengines/doc/DocTemplateObject;->swigCMemOwn:Z

    .line 46
    iget-wide v0, p0, Lcom/smartengines/doc/DocTemplateObject;->swigCPtr:J

    invoke-static {v0, v1}, Lcom/smartengines/doc/jnidocengineJNI;->delete_DocTemplateObject(J)V

    .line 48
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/doc/DocTemplateObject;->swigCPtr:J

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
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTemplateObject;->delete()V

    return-void
.end method
