.class public Lcom/smartengines/common/SerializationParameters;
.super Ljava/lang/Object;
.source "SerializationParameters.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 52
    invoke-static {}, Lcom/smartengines/common/jnisecommonJNI;->new_SerializationParameters__SWIG_0()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/common/SerializationParameters;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-boolean p3, p0, Lcom/smartengines/common/SerializationParameters;->swigCMemOwn:Z

    .line 17
    iput-wide p1, p0, Lcom/smartengines/common/SerializationParameters;->swigCPtr:J

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/common/SerializationParameters;)V
    .locals 2

    .line 56
    invoke-static {p1}, Lcom/smartengines/common/SerializationParameters;->getCPtr(Lcom/smartengines/common/SerializationParameters;)J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/smartengines/common/jnisecommonJNI;->new_SerializationParameters__SWIG_1(JLcom/smartengines/common/SerializationParameters;)J

    move-result-wide v0

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/smartengines/common/SerializationParameters;-><init>(JZ)V

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/common/SerializationParameters;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 21
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/common/SerializationParameters;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/common/SerializationParameters;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 27
    iget-boolean v0, p0, Lcom/smartengines/common/SerializationParameters;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 29
    iget-wide v0, p0, Lcom/smartengines/common/SerializationParameters;->swigCPtr:J

    const/4 v2, 0x0

    .line 30
    iput-boolean v2, p0, Lcom/smartengines/common/SerializationParameters;->swigCMemOwn:Z

    .line 31
    invoke-virtual {p0}, Lcom/smartengines/common/SerializationParameters;->delete()V

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
.method public AddIgnoredKey(Ljava/lang/String;)V
    .locals 2

    .line 84
    iget-wide v0, p0, Lcom/smartengines/common/SerializationParameters;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->SerializationParameters_AddIgnoredKey(JLcom/smartengines/common/SerializationParameters;Ljava/lang/String;)V

    return-void
.end method

.method public AddIgnoredObjectType(Ljava/lang/String;)V
    .locals 2

    .line 64
    iget-wide v0, p0, Lcom/smartengines/common/SerializationParameters;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->SerializationParameters_AddIgnoredObjectType(JLcom/smartengines/common/SerializationParameters;Ljava/lang/String;)V

    return-void
.end method

.method public HasIgnoredKey(Ljava/lang/String;)Z
    .locals 2

    .line 80
    iget-wide v0, p0, Lcom/smartengines/common/SerializationParameters;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->SerializationParameters_HasIgnoredKey(JLcom/smartengines/common/SerializationParameters;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasIgnoredObjectType(Ljava/lang/String;)Z
    .locals 2

    .line 60
    iget-wide v0, p0, Lcom/smartengines/common/SerializationParameters;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->SerializationParameters_HasIgnoredObjectType(JLcom/smartengines/common/SerializationParameters;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public IgnoredKeysBegin()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 92
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/common/SerializationParameters;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/common/jnisecommonJNI;->SerializationParameters_IgnoredKeysBegin(JLcom/smartengines/common/SerializationParameters;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public IgnoredKeysEnd()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 96
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/common/SerializationParameters;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/common/jnisecommonJNI;->SerializationParameters_IgnoredKeysEnd(JLcom/smartengines/common/SerializationParameters;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public IgnoredObjectTypesBegin()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 72
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/common/SerializationParameters;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/common/jnisecommonJNI;->SerializationParameters_IgnoredObjectTypesBegin(JLcom/smartengines/common/SerializationParameters;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public IgnoredObjectTypesEnd()Lcom/smartengines/common/StringsSetIterator;
    .locals 4

    .line 76
    new-instance v0, Lcom/smartengines/common/StringsSetIterator;

    iget-wide v1, p0, Lcom/smartengines/common/SerializationParameters;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/common/jnisecommonJNI;->SerializationParameters_IgnoredObjectTypesEnd(JLcom/smartengines/common/SerializationParameters;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsSetIterator;-><init>(JZ)V

    return-object v0
.end method

.method public RemoveIgnoredKey(Ljava/lang/String;)V
    .locals 2

    .line 88
    iget-wide v0, p0, Lcom/smartengines/common/SerializationParameters;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->SerializationParameters_RemoveIgnoredKey(JLcom/smartengines/common/SerializationParameters;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveIgnoredObjectType(Ljava/lang/String;)V
    .locals 2

    .line 68
    iget-wide v0, p0, Lcom/smartengines/common/SerializationParameters;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->SerializationParameters_RemoveIgnoredObjectType(JLcom/smartengines/common/SerializationParameters;Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 42
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/common/SerializationParameters;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 43
    iget-boolean v4, p0, Lcom/smartengines/common/SerializationParameters;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 44
    iput-boolean v4, p0, Lcom/smartengines/common/SerializationParameters;->swigCMemOwn:Z

    .line 45
    invoke-static {v0, v1}, Lcom/smartengines/common/jnisecommonJNI;->delete_SerializationParameters(J)V

    .line 47
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/common/SerializationParameters;->swigCPtr:J
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
    invoke-virtual {p0}, Lcom/smartengines/common/SerializationParameters;->delete()V

    return-void
.end method
