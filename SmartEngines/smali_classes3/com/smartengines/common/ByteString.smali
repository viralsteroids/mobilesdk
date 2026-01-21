.class public Lcom/smartengines/common/ByteString;
.super Ljava/lang/Object;
.source "ByteString.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 52
    invoke-static {}, Lcom/smartengines/common/jnisecommonJNI;->new_ByteString__SWIG_0()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/common/ByteString;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-boolean p3, p0, Lcom/smartengines/common/ByteString;->swigCMemOwn:Z

    .line 17
    iput-wide p1, p0, Lcom/smartengines/common/ByteString;->swigCPtr:J

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/common/ByteString;)V
    .locals 2

    .line 60
    invoke-static {p1}, Lcom/smartengines/common/ByteString;->getCPtr(Lcom/smartengines/common/ByteString;)J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/smartengines/common/jnisecommonJNI;->new_ByteString__SWIG_2(JLcom/smartengines/common/ByteString;)J

    move-result-wide v0

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/smartengines/common/ByteString;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    .line 56
    invoke-static {p1}, Lcom/smartengines/common/jnisecommonJNI;->new_ByteString__SWIG_1([B)J

    move-result-wide v0

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/smartengines/common/ByteString;-><init>(JZ)V

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/common/ByteString;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 21
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/common/ByteString;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/common/ByteString;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 27
    iget-boolean v0, p0, Lcom/smartengines/common/ByteString;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 29
    iget-wide v0, p0, Lcom/smartengines/common/ByteString;->swigCPtr:J

    const/4 v2, 0x0

    .line 30
    iput-boolean v2, p0, Lcom/smartengines/common/ByteString;->swigCMemOwn:Z

    .line 31
    invoke-virtual {p0}, Lcom/smartengines/common/ByteString;->delete()V

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
.method public CopyBase64ToBuffer(Ljava/lang/String;I)I
    .locals 2

    .line 76
    iget-wide v0, p0, Lcom/smartengines/common/ByteString;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/common/jnisecommonJNI;->ByteString_CopyBase64ToBuffer(JLcom/smartengines/common/ByteString;Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public CopyHexToBuffer(Ljava/lang/String;I)I
    .locals 2

    .line 88
    iget-wide v0, p0, Lcom/smartengines/common/ByteString;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/common/jnisecommonJNI;->ByteString_CopyHexToBuffer(JLcom/smartengines/common/ByteString;Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public GetBase64String()Lcom/smartengines/common/MutableString;
    .locals 4

    .line 80
    new-instance v0, Lcom/smartengines/common/MutableString;

    iget-wide v1, p0, Lcom/smartengines/common/ByteString;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/common/jnisecommonJNI;->ByteString_GetBase64String(JLcom/smartengines/common/ByteString;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/MutableString;-><init>(JZ)V

    return-object v0
.end method

.method public GetHexString()Lcom/smartengines/common/MutableString;
    .locals 4

    .line 92
    new-instance v0, Lcom/smartengines/common/MutableString;

    iget-wide v1, p0, Lcom/smartengines/common/ByteString;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/common/jnisecommonJNI;->ByteString_GetHexString(JLcom/smartengines/common/ByteString;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/MutableString;-><init>(JZ)V

    return-object v0
.end method

.method public GetLength()I
    .locals 2

    .line 68
    iget-wide v0, p0, Lcom/smartengines/common/ByteString;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->ByteString_GetLength(JLcom/smartengines/common/ByteString;)I

    move-result v0

    return v0
.end method

.method public GetRequiredBase64BufferLength()I
    .locals 2

    .line 72
    iget-wide v0, p0, Lcom/smartengines/common/ByteString;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->ByteString_GetRequiredBase64BufferLength(JLcom/smartengines/common/ByteString;)I

    move-result v0

    return v0
.end method

.method public GetRequiredHexBufferLength()I
    .locals 2

    .line 84
    iget-wide v0, p0, Lcom/smartengines/common/ByteString;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->ByteString_GetRequiredHexBufferLength(JLcom/smartengines/common/ByteString;)I

    move-result v0

    return v0
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 42
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/common/ByteString;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 43
    iget-boolean v4, p0, Lcom/smartengines/common/ByteString;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 44
    iput-boolean v4, p0, Lcom/smartengines/common/ByteString;->swigCMemOwn:Z

    .line 45
    invoke-static {v0, v1}, Lcom/smartengines/common/jnisecommonJNI;->delete_ByteString(J)V

    .line 47
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/common/ByteString;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/common/ByteString;->delete()V

    return-void
.end method

.method public swap(Lcom/smartengines/common/ByteString;)V
    .locals 6

    .line 64
    iget-wide v0, p0, Lcom/smartengines/common/ByteString;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/ByteString;->getCPtr(Lcom/smartengines/common/ByteString;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->ByteString_swap(JLcom/smartengines/common/ByteString;JLcom/smartengines/common/ByteString;)V

    return-void
.end method
