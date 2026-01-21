.class public Lcom/smartengines/common/OcrPair;
.super Ljava/lang/Object;
.source "OcrPair.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 52
    invoke-static {}, Lcom/smartengines/common/jnisecommonJNI;->new_OcrPair__SWIG_0()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/common/OcrPair;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-boolean p3, p0, Lcom/smartengines/common/OcrPair;->swigCMemOwn:Z

    .line 17
    iput-wide p1, p0, Lcom/smartengines/common/OcrPair;->swigCPtr:J

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/common/MutableString;F)V
    .locals 2

    .line 56
    invoke-static {p1}, Lcom/smartengines/common/MutableString;->getCPtr(Lcom/smartengines/common/MutableString;)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lcom/smartengines/common/jnisecommonJNI;->new_OcrPair__SWIG_1(JLcom/smartengines/common/MutableString;F)J

    move-result-wide p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/smartengines/common/OcrPair;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/common/MutableString;I)V
    .locals 2

    .line 64
    invoke-static {p1}, Lcom/smartengines/common/MutableString;->getCPtr(Lcom/smartengines/common/MutableString;)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lcom/smartengines/common/jnisecommonJNI;->new_OcrPair__SWIG_3(JLcom/smartengines/common/MutableString;I)J

    move-result-wide p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/smartengines/common/OcrPair;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;F)V
    .locals 1

    .line 60
    invoke-static {p1, p2}, Lcom/smartengines/common/jnisecommonJNI;->new_OcrPair__SWIG_2(Ljava/lang/String;F)J

    move-result-wide p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/smartengines/common/OcrPair;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 68
    invoke-static {p1, p2}, Lcom/smartengines/common/jnisecommonJNI;->new_OcrPair__SWIG_4(Ljava/lang/String;I)J

    move-result-wide p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/smartengines/common/OcrPair;-><init>(JZ)V

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/common/OcrPair;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 21
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/common/OcrPair;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/common/OcrPair;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 27
    iget-boolean v0, p0, Lcom/smartengines/common/OcrPair;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 29
    iget-wide v0, p0, Lcom/smartengines/common/OcrPair;->swigCPtr:J

    const/4 v2, 0x0

    .line 30
    iput-boolean v2, p0, Lcom/smartengines/common/OcrPair;->swigCMemOwn:Z

    .line 31
    invoke-virtual {p0}, Lcom/smartengines/common/OcrPair;->delete()V

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
.method public GetCharacter()Ljava/lang/String;
    .locals 2

    .line 72
    iget-wide v0, p0, Lcom/smartengines/common/OcrPair;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->OcrPair_GetCharacter(JLcom/smartengines/common/OcrPair;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public GetConfidence()S
    .locals 2

    .line 84
    iget-wide v0, p0, Lcom/smartengines/common/OcrPair;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->OcrPair_GetConfidence(JLcom/smartengines/common/OcrPair;)S

    move-result v0

    return v0
.end method

.method public Serialize(Lcom/smartengines/common/Serializer;)V
    .locals 6

    .line 96
    iget-wide v0, p0, Lcom/smartengines/common/OcrPair;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Serializer;->getCPtr(Lcom/smartengines/common/Serializer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->OcrPair_Serialize(JLcom/smartengines/common/OcrPair;JLcom/smartengines/common/Serializer;)V

    return-void
.end method

.method public SetCharacter(Lcom/smartengines/common/MutableString;)V
    .locals 6

    .line 76
    iget-wide v0, p0, Lcom/smartengines/common/OcrPair;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/MutableString;->getCPtr(Lcom/smartengines/common/MutableString;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->OcrPair_SetCharacter__SWIG_0(JLcom/smartengines/common/OcrPair;JLcom/smartengines/common/MutableString;)V

    return-void
.end method

.method public SetCharacter(Ljava/lang/String;)V
    .locals 2

    .line 80
    iget-wide v0, p0, Lcom/smartengines/common/OcrPair;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->OcrPair_SetCharacter__SWIG_1(JLcom/smartengines/common/OcrPair;Ljava/lang/String;)V

    return-void
.end method

.method public SetConfidence(F)V
    .locals 2

    .line 88
    iget-wide v0, p0, Lcom/smartengines/common/OcrPair;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->OcrPair_SetConfidence__SWIG_0(JLcom/smartengines/common/OcrPair;F)V

    return-void
.end method

.method public SetConfidence(I)V
    .locals 2

    .line 92
    iget-wide v0, p0, Lcom/smartengines/common/OcrPair;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->OcrPair_SetConfidence__SWIG_1(JLcom/smartengines/common/OcrPair;I)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 42
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/common/OcrPair;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 43
    iget-boolean v4, p0, Lcom/smartengines/common/OcrPair;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 44
    iput-boolean v4, p0, Lcom/smartengines/common/OcrPair;->swigCMemOwn:Z

    .line 45
    invoke-static {v0, v1}, Lcom/smartengines/common/jnisecommonJNI;->delete_OcrPair(J)V

    .line 47
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/common/OcrPair;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/common/OcrPair;->delete()V

    return-void
.end method
