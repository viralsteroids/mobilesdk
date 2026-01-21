.class public Lcom/smartengines/id/IdTemplateDetectionResult;
.super Ljava/lang/Object;
.source "IdTemplateDetectionResult.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/id/IdTemplateDetectionResult;)V
    .locals 2

    .line 70
    invoke-static {p1}, Lcom/smartengines/id/IdTemplateDetectionResult;->getCPtr(Lcom/smartengines/id/IdTemplateDetectionResult;)J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/smartengines/id/jniidengineJNI;->new_IdTemplateDetectionResult__SWIG_4(JLcom/smartengines/id/IdTemplateDetectionResult;)J

    move-result-wide v0

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/smartengines/id/IdTemplateDetectionResult;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/smartengines/common/Quadrangle;)V
    .locals 2

    .line 66
    invoke-static {p2}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v0

    invoke-static {p1, v0, v1, p2}, Lcom/smartengines/id/jniidengineJNI;->new_IdTemplateDetectionResult__SWIG_3(Ljava/lang/String;JLcom/smartengines/common/Quadrangle;)J

    move-result-wide p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/smartengines/id/IdTemplateDetectionResult;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/smartengines/common/Quadrangle;Z)V
    .locals 2

    .line 62
    invoke-static {p2}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v0

    invoke-static {p1, v0, v1, p2, p3}, Lcom/smartengines/id/jniidengineJNI;->new_IdTemplateDetectionResult__SWIG_2(Ljava/lang/String;JLcom/smartengines/common/Quadrangle;Z)J

    move-result-wide p1

    const/4 p3, 0x1

    invoke-direct {p0, p1, p2, p3}, Lcom/smartengines/id/IdTemplateDetectionResult;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/smartengines/common/Quadrangle;ZD)V
    .locals 7

    .line 58
    invoke-static {p2}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v1

    move-object v0, p1

    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    invoke-static/range {v0 .. v6}, Lcom/smartengines/id/jniidengineJNI;->new_IdTemplateDetectionResult__SWIG_1(Ljava/lang/String;JLcom/smartengines/common/Quadrangle;ZD)J

    move-result-wide p1

    const/4 p3, 0x1

    invoke-direct {p0, p1, p2, p3}, Lcom/smartengines/id/IdTemplateDetectionResult;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/smartengines/common/Quadrangle;ZDLcom/smartengines/common/Size;)V
    .locals 10

    .line 54
    invoke-static {p2}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v1

    invoke-static/range {p6 .. p6}, Lcom/smartengines/common/Size;->getCPtr(Lcom/smartengines/common/Size;)J

    move-result-wide v7

    move-object v0, p1

    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    move-object/from16 v9, p6

    invoke-static/range {v0 .. v9}, Lcom/smartengines/id/jniidengineJNI;->new_IdTemplateDetectionResult__SWIG_0(Ljava/lang/String;JLcom/smartengines/common/Quadrangle;ZDJLcom/smartengines/common/Size;)J

    move-result-wide p1

    const/4 p3, 0x1

    invoke-direct {p0, p1, p2, p3}, Lcom/smartengines/id/IdTemplateDetectionResult;-><init>(JZ)V

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/id/IdTemplateDetectionResult;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/id/IdTemplateDetectionResult;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/id/IdTemplateDetectionResult;->delete()V

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
.method public AttributesBegin()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 134
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_AttributesBegin(JLcom/smartengines/id/IdTemplateDetectionResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public AttributesEnd()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 138
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_AttributesEnd(JLcom/smartengines/id/IdTemplateDetectionResult;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public GetAttribute(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 118
    iget-wide v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_GetAttribute(JLcom/smartengines/id/IdTemplateDetectionResult;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GetAttributesCount()I
    .locals 2

    .line 114
    iget-wide v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_GetAttributesCount(JLcom/smartengines/id/IdTemplateDetectionResult;)I

    move-result v0

    return v0
.end method

.method public GetConfidence()D
    .locals 2

    .line 98
    iget-wide v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_GetConfidence(JLcom/smartengines/id/IdTemplateDetectionResult;)D

    move-result-wide v0

    return-wide v0
.end method

.method public GetIsAccepted()Z
    .locals 2

    .line 90
    iget-wide v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_GetIsAccepted(JLcom/smartengines/id/IdTemplateDetectionResult;)Z

    move-result v0

    return v0
.end method

.method public GetQuadrangle()Lcom/smartengines/common/Quadrangle;
    .locals 4

    .line 82
    new-instance v0, Lcom/smartengines/common/Quadrangle;

    iget-wide v1, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_GetQuadrangle(JLcom/smartengines/id/IdTemplateDetectionResult;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/Quadrangle;-><init>(JZ)V

    return-object v0
.end method

.method public GetStandardSize()Lcom/smartengines/common/Size;
    .locals 4

    .line 106
    new-instance v0, Lcom/smartengines/common/Size;

    iget-wide v1, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_GetStandardSize(JLcom/smartengines/id/IdTemplateDetectionResult;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/Size;-><init>(JZ)V

    return-object v0
.end method

.method public GetTemplateName()Ljava/lang/String;
    .locals 2

    .line 74
    iget-wide v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_GetTemplateName(JLcom/smartengines/id/IdTemplateDetectionResult;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public HasAttribute(Ljava/lang/String;)Z
    .locals 2

    .line 122
    iget-wide v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_HasAttribute(JLcom/smartengines/id/IdTemplateDetectionResult;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public RemoveAttribute(Ljava/lang/String;)V
    .locals 2

    .line 130
    iget-wide v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_RemoveAttribute(JLcom/smartengines/id/IdTemplateDetectionResult;Ljava/lang/String;)V

    return-void
.end method

.method public SetAttribute(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 126
    iget-wide v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_SetAttribute(JLcom/smartengines/id/IdTemplateDetectionResult;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public SetConfidence(D)V
    .locals 2

    .line 102
    iget-wide v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_SetConfidence(JLcom/smartengines/id/IdTemplateDetectionResult;D)V

    return-void
.end method

.method public SetIsAccepted(Z)V
    .locals 2

    .line 94
    iget-wide v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_SetIsAccepted(JLcom/smartengines/id/IdTemplateDetectionResult;Z)V

    return-void
.end method

.method public SetQuadrangle(Lcom/smartengines/common/Quadrangle;)V
    .locals 6

    .line 86
    iget-wide v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_SetQuadrangle(JLcom/smartengines/id/IdTemplateDetectionResult;JLcom/smartengines/common/Quadrangle;)V

    return-void
.end method

.method public SetStandardSize(Lcom/smartengines/common/Size;)V
    .locals 6

    .line 110
    iget-wide v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Size;->getCPtr(Lcom/smartengines/common/Size;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_SetStandardSize(JLcom/smartengines/id/IdTemplateDetectionResult;JLcom/smartengines/common/Size;)V

    return-void
.end method

.method public SetTemplateName(Ljava/lang/String;)V
    .locals 2

    .line 78
    iget-wide v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/id/jniidengineJNI;->IdTemplateDetectionResult_SetTemplateName(JLcom/smartengines/id/IdTemplateDetectionResult;Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/id/jniidengineJNI;->delete_IdTemplateDetectionResult(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/id/IdTemplateDetectionResult;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/id/IdTemplateDetectionResult;->delete()V

    return-void
.end method
