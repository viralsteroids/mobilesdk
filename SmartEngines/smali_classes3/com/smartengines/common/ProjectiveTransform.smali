.class public Lcom/smartengines/common/ProjectiveTransform;
.super Ljava/lang/Object;
.source "ProjectiveTransform.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-boolean p3, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCMemOwn:Z

    .line 17
    iput-wide p1, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCPtr:J

    return-void
.end method

.method public static CanCreate(Lcom/smartengines/common/Quadrangle;Lcom/smartengines/common/Quadrangle;)Z
    .locals 6

    .line 52
    invoke-static {p0}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v0

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->ProjectiveTransform_CanCreate__SWIG_0(JLcom/smartengines/common/Quadrangle;JLcom/smartengines/common/Quadrangle;)Z

    move-result p0

    return p0
.end method

.method public static CanCreate(Lcom/smartengines/common/Quadrangle;Lcom/smartengines/common/Size;)Z
    .locals 6

    .line 56
    invoke-static {p0}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v0

    invoke-static {p1}, Lcom/smartengines/common/Size;->getCPtr(Lcom/smartengines/common/Size;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->ProjectiveTransform_CanCreate__SWIG_1(JLcom/smartengines/common/Quadrangle;JLcom/smartengines/common/Size;)Z

    move-result p0

    return p0
.end method

.method public static Create()Lcom/smartengines/common/ProjectiveTransform;
    .locals 4

    .line 60
    invoke-static {}, Lcom/smartengines/common/jnisecommonJNI;->ProjectiveTransform_Create__SWIG_0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 61
    :cond_0
    new-instance v2, Lcom/smartengines/common/ProjectiveTransform;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/common/ProjectiveTransform;-><init>(JZ)V

    return-object v2
.end method

.method public static Create(Lcom/smartengines/common/Quadrangle;Lcom/smartengines/common/Quadrangle;)Lcom/smartengines/common/ProjectiveTransform;
    .locals 6

    .line 65
    invoke-static {p0}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v0

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->ProjectiveTransform_Create__SWIG_1(JLcom/smartengines/common/Quadrangle;JLcom/smartengines/common/Quadrangle;)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 66
    :cond_0
    new-instance v0, Lcom/smartengines/common/ProjectiveTransform;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lcom/smartengines/common/ProjectiveTransform;-><init>(JZ)V

    return-object v0
.end method

.method public static Create(Lcom/smartengines/common/Quadrangle;Lcom/smartengines/common/Size;)Lcom/smartengines/common/ProjectiveTransform;
    .locals 6

    .line 70
    invoke-static {p0}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v0

    invoke-static {p1}, Lcom/smartengines/common/Size;->getCPtr(Lcom/smartengines/common/Size;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->ProjectiveTransform_Create__SWIG_2(JLcom/smartengines/common/Quadrangle;JLcom/smartengines/common/Size;)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 71
    :cond_0
    new-instance v0, Lcom/smartengines/common/ProjectiveTransform;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lcom/smartengines/common/ProjectiveTransform;-><init>(JZ)V

    return-object v0
.end method

.method public static getCPtr(Lcom/smartengines/common/ProjectiveTransform;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 21
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/common/ProjectiveTransform;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 27
    iget-boolean v0, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 29
    iget-wide v0, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCPtr:J

    const/4 v2, 0x0

    .line 30
    iput-boolean v2, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCMemOwn:Z

    .line 31
    invoke-virtual {p0}, Lcom/smartengines/common/ProjectiveTransform;->delete()V

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
.method public Clone()Lcom/smartengines/common/ProjectiveTransform;
    .locals 4

    .line 75
    iget-wide v0, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->ProjectiveTransform_Clone(JLcom/smartengines/common/ProjectiveTransform;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 76
    :cond_0
    new-instance v2, Lcom/smartengines/common/ProjectiveTransform;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/common/ProjectiveTransform;-><init>(JZ)V

    return-object v2
.end method

.method public CloneInverted()Lcom/smartengines/common/ProjectiveTransform;
    .locals 4

    .line 100
    iget-wide v0, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->ProjectiveTransform_CloneInverted(JLcom/smartengines/common/ProjectiveTransform;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 101
    :cond_0
    new-instance v2, Lcom/smartengines/common/ProjectiveTransform;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/common/ProjectiveTransform;-><init>(JZ)V

    return-object v2
.end method

.method public Invert()V
    .locals 2

    .line 96
    iget-wide v0, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->ProjectiveTransform_Invert(JLcom/smartengines/common/ProjectiveTransform;)V

    return-void
.end method

.method public IsInvertable()Z
    .locals 2

    .line 92
    iget-wide v0, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->ProjectiveTransform_IsInvertable(JLcom/smartengines/common/ProjectiveTransform;)Z

    move-result v0

    return v0
.end method

.method public Serialize(Lcom/smartengines/common/Serializer;)V
    .locals 6

    .line 105
    iget-wide v0, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Serializer;->getCPtr(Lcom/smartengines/common/Serializer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->ProjectiveTransform_Serialize(JLcom/smartengines/common/ProjectiveTransform;JLcom/smartengines/common/Serializer;)V

    return-void
.end method

.method public TransformPoint(Lcom/smartengines/common/Point;)Lcom/smartengines/common/Point;
    .locals 7

    .line 80
    new-instance v0, Lcom/smartengines/common/Point;

    iget-wide v1, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Point;->getCPtr(Lcom/smartengines/common/Point;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/common/jnisecommonJNI;->ProjectiveTransform_TransformPoint(JLcom/smartengines/common/ProjectiveTransform;JLcom/smartengines/common/Point;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/Point;-><init>(JZ)V

    return-object v0
.end method

.method public TransformPolygon(Lcom/smartengines/common/Polygon;)Lcom/smartengines/common/Polygon;
    .locals 7

    .line 88
    new-instance v0, Lcom/smartengines/common/Polygon;

    iget-wide v1, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Polygon;->getCPtr(Lcom/smartengines/common/Polygon;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/common/jnisecommonJNI;->ProjectiveTransform_TransformPolygon(JLcom/smartengines/common/ProjectiveTransform;JLcom/smartengines/common/Polygon;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/Polygon;-><init>(JZ)V

    return-object v0
.end method

.method public TransformQuad(Lcom/smartengines/common/Quadrangle;)Lcom/smartengines/common/Quadrangle;
    .locals 7

    .line 84
    new-instance v0, Lcom/smartengines/common/Quadrangle;

    iget-wide v1, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v4

    move-object v3, p0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/common/jnisecommonJNI;->ProjectiveTransform_TransformQuad(JLcom/smartengines/common/ProjectiveTransform;JLcom/smartengines/common/Quadrangle;)J

    move-result-wide v1

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/Quadrangle;-><init>(JZ)V

    return-object v0
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 42
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 43
    iget-boolean v4, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 44
    iput-boolean v4, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCMemOwn:Z

    .line 45
    invoke-static {v0, v1}, Lcom/smartengines/common/jnisecommonJNI;->delete_ProjectiveTransform(J)V

    .line 47
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/common/ProjectiveTransform;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/common/ProjectiveTransform;->delete()V

    return-void
.end method
