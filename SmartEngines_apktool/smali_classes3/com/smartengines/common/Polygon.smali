.class public Lcom/smartengines/common/Polygon;
.super Ljava/lang/Object;
.source "Polygon.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 52
    invoke-static {}, Lcom/smartengines/common/jnisecommonJNI;->new_Polygon__SWIG_0()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/common/Polygon;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-boolean p3, p0, Lcom/smartengines/common/Polygon;->swigCMemOwn:Z

    .line 17
    iput-wide p1, p0, Lcom/smartengines/common/Polygon;->swigCPtr:J

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/common/Point;I)V
    .locals 2

    .line 56
    invoke-static {p1}, Lcom/smartengines/common/Point;->getCPtr(Lcom/smartengines/common/Point;)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lcom/smartengines/common/jnisecommonJNI;->new_Polygon__SWIG_1(JLcom/smartengines/common/Point;I)J

    move-result-wide p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/smartengines/common/Polygon;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/common/Polygon;)V
    .locals 2

    .line 60
    invoke-static {p1}, Lcom/smartengines/common/Polygon;->getCPtr(Lcom/smartengines/common/Polygon;)J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/smartengines/common/jnisecommonJNI;->new_Polygon__SWIG_2(JLcom/smartengines/common/Polygon;)J

    move-result-wide v0

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/smartengines/common/Polygon;-><init>(JZ)V

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/common/Polygon;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 21
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/common/Polygon;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/common/Polygon;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 27
    iget-boolean v0, p0, Lcom/smartengines/common/Polygon;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 29
    iget-wide v0, p0, Lcom/smartengines/common/Polygon;->swigCPtr:J

    const/4 v2, 0x0

    .line 30
    iput-boolean v2, p0, Lcom/smartengines/common/Polygon;->swigCMemOwn:Z

    .line 31
    invoke-virtual {p0}, Lcom/smartengines/common/Polygon;->delete()V

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
.method public GetBoundingRectangle()Lcom/smartengines/common/Rectangle;
    .locals 4

    .line 89
    new-instance v0, Lcom/smartengines/common/Rectangle;

    iget-wide v1, p0, Lcom/smartengines/common/Polygon;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/common/jnisecommonJNI;->Polygon_GetBoundingRectangle(JLcom/smartengines/common/Polygon;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/Rectangle;-><init>(JZ)V

    return-object v0
.end method

.method public GetMutablePoint(I)Lcom/smartengines/common/Point;
    .locals 3

    .line 77
    new-instance v0, Lcom/smartengines/common/Point;

    iget-wide v1, p0, Lcom/smartengines/common/Polygon;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->Polygon_GetMutablePoint(JLcom/smartengines/common/Polygon;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/Point;-><init>(JZ)V

    return-object v0
.end method

.method public GetPoint(I)Lcom/smartengines/common/Point;
    .locals 3

    .line 73
    new-instance v0, Lcom/smartengines/common/Point;

    iget-wide v1, p0, Lcom/smartengines/common/Polygon;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->Polygon_GetPoint(JLcom/smartengines/common/Polygon;I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/Point;-><init>(JZ)V

    return-object v0
.end method

.method public GetPoints()Lcom/smartengines/common/Point;
    .locals 4

    .line 68
    iget-wide v0, p0, Lcom/smartengines/common/Polygon;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Polygon_GetPoints(JLcom/smartengines/common/Polygon;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 69
    :cond_0
    new-instance v2, Lcom/smartengines/common/Point;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/common/Point;-><init>(JZ)V

    return-object v2
.end method

.method public GetPointsCount()I
    .locals 2

    .line 64
    iget-wide v0, p0, Lcom/smartengines/common/Polygon;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Polygon_GetPointsCount(JLcom/smartengines/common/Polygon;)I

    move-result v0

    return v0
.end method

.method public Resize(I)V
    .locals 2

    .line 85
    iget-wide v0, p0, Lcom/smartengines/common/Polygon;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->Polygon_Resize(JLcom/smartengines/common/Polygon;I)V

    return-void
.end method

.method public Serialize(Lcom/smartengines/common/Serializer;)V
    .locals 6

    .line 93
    iget-wide v0, p0, Lcom/smartengines/common/Polygon;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Serializer;->getCPtr(Lcom/smartengines/common/Serializer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->Polygon_Serialize(JLcom/smartengines/common/Polygon;JLcom/smartengines/common/Serializer;)V

    return-void
.end method

.method public SetPoint(ILcom/smartengines/common/Point;)V
    .locals 7

    .line 81
    iget-wide v0, p0, Lcom/smartengines/common/Polygon;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/common/Point;->getCPtr(Lcom/smartengines/common/Point;)J

    move-result-wide v4

    move-object v2, p0

    move v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/common/jnisecommonJNI;->Polygon_SetPoint(JLcom/smartengines/common/Polygon;IJLcom/smartengines/common/Point;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 42
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/common/Polygon;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 43
    iget-boolean v4, p0, Lcom/smartengines/common/Polygon;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 44
    iput-boolean v4, p0, Lcom/smartengines/common/Polygon;->swigCMemOwn:Z

    .line 45
    invoke-static {v0, v1}, Lcom/smartengines/common/jnisecommonJNI;->delete_Polygon(J)V

    .line 47
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/common/Polygon;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/common/Polygon;->delete()V

    return-void
.end method
