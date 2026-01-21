.class public Lcom/smartengines/common/Point;
.super Ljava/lang/Object;
.source "Point.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 52
    invoke-static {}, Lcom/smartengines/common/jnisecommonJNI;->new_Point__SWIG_0()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/common/Point;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(DD)V
    .locals 0

    .line 56
    invoke-static {p1, p2, p3, p4}, Lcom/smartengines/common/jnisecommonJNI;->new_Point__SWIG_1(DD)J

    move-result-wide p1

    const/4 p3, 0x1

    invoke-direct {p0, p1, p2, p3}, Lcom/smartengines/common/Point;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-boolean p3, p0, Lcom/smartengines/common/Point;->swigCMemOwn:Z

    .line 17
    iput-wide p1, p0, Lcom/smartengines/common/Point;->swigCPtr:J

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/common/Point;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 21
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/common/Point;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/common/Point;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 27
    iget-boolean v0, p0, Lcom/smartengines/common/Point;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 29
    iget-wide v0, p0, Lcom/smartengines/common/Point;->swigCPtr:J

    const/4 v2, 0x0

    .line 30
    iput-boolean v2, p0, Lcom/smartengines/common/Point;->swigCMemOwn:Z

    .line 31
    invoke-virtual {p0}, Lcom/smartengines/common/Point;->delete()V

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
.method public Serialize(Lcom/smartengines/common/Serializer;)V
    .locals 6

    .line 60
    iget-wide v0, p0, Lcom/smartengines/common/Point;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Serializer;->getCPtr(Lcom/smartengines/common/Serializer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->Point_Serialize(JLcom/smartengines/common/Point;JLcom/smartengines/common/Serializer;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 42
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/common/Point;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 43
    iget-boolean v4, p0, Lcom/smartengines/common/Point;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 44
    iput-boolean v4, p0, Lcom/smartengines/common/Point;->swigCMemOwn:Z

    .line 45
    invoke-static {v0, v1}, Lcom/smartengines/common/jnisecommonJNI;->delete_Point(J)V

    .line 47
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/common/Point;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/common/Point;->delete()V

    return-void
.end method

.method public getX()D
    .locals 2

    .line 68
    iget-wide v0, p0, Lcom/smartengines/common/Point;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Point_x_get(JLcom/smartengines/common/Point;)D

    move-result-wide v0

    return-wide v0
.end method

.method public getY()D
    .locals 2

    .line 76
    iget-wide v0, p0, Lcom/smartengines/common/Point;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Point_y_get(JLcom/smartengines/common/Point;)D

    move-result-wide v0

    return-wide v0
.end method

.method public setX(D)V
    .locals 2

    .line 64
    iget-wide v0, p0, Lcom/smartengines/common/Point;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/common/jnisecommonJNI;->Point_x_set(JLcom/smartengines/common/Point;D)V

    return-void
.end method

.method public setY(D)V
    .locals 2

    .line 72
    iget-wide v0, p0, Lcom/smartengines/common/Point;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/common/jnisecommonJNI;->Point_y_set(JLcom/smartengines/common/Point;D)V

    return-void
.end method
