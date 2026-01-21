.class public Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;
.super Ljava/io/InputStream;
.source "InputStreamBuffer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jmrtd/io/InputStreamBuffer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "SubInputStream"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private markedPosition:I

.field private position:I

.field private syncObject:Ljava/lang/Object;

.field final synthetic this$0:Lorg/jmrtd/io/InputStreamBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 112
    const-class v0, Lorg/jmrtd/io/InputStreamBuffer;

    return-void
.end method

.method public constructor <init>(Lorg/jmrtd/io/InputStreamBuffer;Ljava/lang/Object;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 p1, 0x0

    .line 127
    iput p1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    const/4 p1, -0x1

    .line 128
    iput p1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->markedPosition:I

    .line 129
    iput-object p2, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->syncObject:Ljava/lang/Object;

    return-void
.end method

.method private syncCarrierPosition(I)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    int-to-long v0, p1

    .line 306
    iget-object v2, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v2}, Lorg/jmrtd/io/InputStreamBuffer;->access$100(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/PositionInputStream;

    move-result-object v2

    invoke-virtual {v2}, Lorg/jmrtd/io/PositionInputStream;->getPosition()J

    move-result-wide v2

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 309
    :cond_0
    iget-object v2, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v2}, Lorg/jmrtd/io/InputStreamBuffer;->access$100(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/PositionInputStream;

    move-result-object v2

    invoke-virtual {v2}, Lorg/jmrtd/io/PositionInputStream;->reset()V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_1

    int-to-long v2, v2

    .line 312
    iget-object v4, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v4}, Lorg/jmrtd/io/InputStreamBuffer;->access$100(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/PositionInputStream;

    move-result-object v4

    sub-long v5, v0, v2

    invoke-virtual {v4, v5, v6}, Lorg/jmrtd/io/PositionInputStream;->skip(J)J

    move-result-wide v4

    add-long/2addr v2, v4

    long-to-int v2, v2

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public available()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 263
    iget-object v0, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v0}, Lorg/jmrtd/io/InputStreamBuffer;->access$000(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/FragmentBuffer;

    move-result-object v0

    iget v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    invoke-virtual {v0, v1}, Lorg/jmrtd/io/FragmentBuffer;->getBufferedLength(I)I

    move-result v0

    return v0
.end method

.method public close()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public getBuffer()Lorg/jmrtd/io/FragmentBuffer;
    .locals 1

    .line 138
    iget-object v0, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v0}, Lorg/jmrtd/io/InputStreamBuffer;->access$000(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/FragmentBuffer;

    move-result-object v0

    return-object v0
.end method

.method public getPosition()I
    .locals 1

    .line 294
    iget v0, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    return v0
.end method

.method public declared-synchronized mark(I)V
    .locals 0

    monitor-enter p0

    .line 272
    :try_start_0
    iget p1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    iput p1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->markedPosition:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 273
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public markSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public read()I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 143
    iget-object v0, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->syncObject:Ljava/lang/Object;

    monitor-enter v0

    .line 144
    :try_start_0
    iget v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    iget-object v2, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v2}, Lorg/jmrtd/io/InputStreamBuffer;->access$000(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/FragmentBuffer;

    move-result-object v2

    invoke-virtual {v2}, Lorg/jmrtd/io/FragmentBuffer;->getLength()I

    move-result v2

    const/4 v3, -0x1

    if-lt v1, v2, :cond_0

    .line 146
    monitor-exit v0

    return v3

    .line 147
    :cond_0
    iget-object v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v1}, Lorg/jmrtd/io/InputStreamBuffer;->access$000(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/FragmentBuffer;

    move-result-object v1

    iget v2, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    invoke-virtual {v1, v2}, Lorg/jmrtd/io/FragmentBuffer;->isCoveredByFragment(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 149
    iget-object v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v1}, Lorg/jmrtd/io/InputStreamBuffer;->access$000(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/FragmentBuffer;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jmrtd/io/FragmentBuffer;->getBuffer()[B

    move-result-object v1

    iget v2, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    monitor-exit v0

    return v1

    .line 152
    :cond_1
    iget-object v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v1}, Lorg/jmrtd/io/InputStreamBuffer;->access$100(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/PositionInputStream;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jmrtd/io/PositionInputStream;->markSupported()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 153
    iget v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    invoke-direct {p0, v1}, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->syncCarrierPosition(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    :cond_2
    :try_start_1
    iget-object v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v1}, Lorg/jmrtd/io/InputStreamBuffer;->access$100(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/PositionInputStream;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jmrtd/io/PositionInputStream;->read()I

    move-result v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gez v1, :cond_3

    .line 158
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return v3

    .line 161
    :cond_3
    :try_start_3
    iget-object v2, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v2}, Lorg/jmrtd/io/InputStreamBuffer;->access$000(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/FragmentBuffer;

    move-result-object v2

    iget v3, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    int-to-byte v4, v1

    invoke-virtual {v2, v3, v4}, Lorg/jmrtd/io/FragmentBuffer;->addFragment(IB)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 162
    :try_start_4
    monitor-exit v0

    return v1

    :catch_0
    move-exception v1

    .line 169
    throw v1

    :catchall_0
    move-exception v1

    .line 172
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1
.end method

.method public read([B)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 177
    iget-object v0, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->syncObject:Ljava/lang/Object;

    monitor-enter v0

    .line 178
    :try_start_0
    array-length v1, p1

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2, v1}, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->read([BII)I

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 179
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public read([BII)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 184
    iget-object v0, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->syncObject:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p1, :cond_7

    if-ltz p2, :cond_6

    if-ltz p3, :cond_6

    .line 187
    :try_start_0
    array-length v1, p1

    sub-int/2addr v1, p2

    if-gt p3, v1, :cond_6

    if-nez p3, :cond_0

    const/4 p1, 0x0

    .line 190
    monitor-exit v0

    return p1

    .line 193
    :cond_0
    iget-object v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v1}, Lorg/jmrtd/io/InputStreamBuffer;->access$000(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/FragmentBuffer;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jmrtd/io/FragmentBuffer;->getLength()I

    move-result v1

    iget v2, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    sub-int/2addr v1, v2

    if-le p3, v1, :cond_1

    .line 194
    iget-object p3, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {p3}, Lorg/jmrtd/io/InputStreamBuffer;->access$000(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/FragmentBuffer;

    move-result-object p3

    invoke-virtual {p3}, Lorg/jmrtd/io/FragmentBuffer;->getLength()I

    move-result p3

    iget v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    sub-int/2addr p3, v1

    .line 197
    :cond_1
    iget v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    iget-object v2, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v2}, Lorg/jmrtd/io/InputStreamBuffer;->access$000(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/FragmentBuffer;

    move-result-object v2

    invoke-virtual {v2}, Lorg/jmrtd/io/FragmentBuffer;->getLength()I

    move-result v2

    if-lt v1, v2, :cond_2

    const/4 p1, -0x1

    .line 199
    monitor-exit v0

    return p1

    .line 202
    :cond_2
    iget-object v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v1}, Lorg/jmrtd/io/InputStreamBuffer;->access$100(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/PositionInputStream;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jmrtd/io/PositionInputStream;->markSupported()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 203
    iget v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    invoke-direct {p0, v1}, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->syncCarrierPosition(I)V

    .line 206
    :cond_3
    iget-object v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v1}, Lorg/jmrtd/io/InputStreamBuffer;->access$000(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/FragmentBuffer;

    move-result-object v1

    iget v2, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    invoke-virtual {v1, v2, p3}, Lorg/jmrtd/io/FragmentBuffer;->getSmallestUnbufferedFragment(II)Lorg/jmrtd/io/FragmentBuffer$Fragment;

    move-result-object v1

    .line 207
    invoke-virtual {v1}, Lorg/jmrtd/io/FragmentBuffer$Fragment;->getLength()I

    move-result v2

    if-lez v2, :cond_5

    .line 209
    invoke-virtual {v1}, Lorg/jmrtd/io/FragmentBuffer$Fragment;->getOffset()I

    move-result p3

    iget v2, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    sub-int/2addr p3, v2

    .line 210
    invoke-virtual {v1}, Lorg/jmrtd/io/FragmentBuffer$Fragment;->getLength()I

    move-result v2

    .line 211
    iget-object v3, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v3}, Lorg/jmrtd/io/InputStreamBuffer;->access$000(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/FragmentBuffer;

    move-result-object v3

    invoke-virtual {v3}, Lorg/jmrtd/io/FragmentBuffer;->getBuffer()[B

    move-result-object v3

    iget v4, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    invoke-static {v3, v4, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 212
    iget v3, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    add-int/2addr v3, p3

    iput v3, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    .line 214
    iget-object v3, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v3}, Lorg/jmrtd/io/InputStreamBuffer;->access$100(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/PositionInputStream;

    move-result-object v3

    invoke-virtual {v3}, Lorg/jmrtd/io/PositionInputStream;->markSupported()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 215
    iget v3, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    invoke-direct {p0, v3}, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->syncCarrierPosition(I)V

    .line 219
    :cond_4
    iget-object v3, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v3}, Lorg/jmrtd/io/InputStreamBuffer;->access$100(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/PositionInputStream;

    move-result-object v3

    add-int/2addr p2, p3

    invoke-virtual {v3, p1, p2, v2}, Lorg/jmrtd/io/PositionInputStream;->read([BII)I

    move-result v2

    .line 220
    iget-object v3, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v3}, Lorg/jmrtd/io/InputStreamBuffer;->access$000(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/FragmentBuffer;

    move-result-object v3

    invoke-virtual {v1}, Lorg/jmrtd/io/FragmentBuffer$Fragment;->getOffset()I

    move-result v1

    invoke-virtual {v3, v1, p1, p2, v2}, Lorg/jmrtd/io/FragmentBuffer;->addFragment(I[BII)V

    .line 221
    iget p1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    add-int/2addr p1, v2

    iput p1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    add-int/2addr p3, v2

    .line 223
    monitor-exit v0

    return p3

    .line 226
    :cond_5
    iget-object v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v1}, Lorg/jmrtd/io/InputStreamBuffer;->access$000(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/FragmentBuffer;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jmrtd/io/FragmentBuffer;->getLength()I

    move-result v1

    iget v2, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    sub-int/2addr v1, v2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 227
    iget-object v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v1}, Lorg/jmrtd/io/InputStreamBuffer;->access$000(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/FragmentBuffer;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jmrtd/io/FragmentBuffer;->getBuffer()[B

    move-result-object v1

    iget v2, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    invoke-static {v1, v2, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 228
    iget p1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    add-int/2addr p1, p3

    iput p1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    .line 229
    monitor-exit v0

    return p3

    .line 188
    :cond_6
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 186
    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    .line 231
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public declared-synchronized reset()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 277
    :try_start_0
    iget v0, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->markedPosition:I

    if-ltz v0, :cond_0

    .line 280
    iput v0, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 281
    monitor-exit p0

    return-void

    .line 278
    :cond_0
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid reset, was mark() called?"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public skip(J)J
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 236
    iget-object v0, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->syncObject:Ljava/lang/Object;

    monitor-enter v0

    .line 237
    :try_start_0
    iget-object v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v1}, Lorg/jmrtd/io/InputStreamBuffer;->access$000(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/FragmentBuffer;

    move-result-object v1

    iget v2, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    invoke-virtual {v1, v2}, Lorg/jmrtd/io/FragmentBuffer;->getBufferedLength(I)I

    move-result v1

    int-to-long v2, v1

    cmp-long v4, p1, v2

    if-gtz v4, :cond_0

    .line 241
    iget v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    int-to-long v1, v1

    add-long/2addr v1, p1

    long-to-int v1, v1

    iput v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    .line 242
    monitor-exit v0

    return-wide p1

    .line 246
    :cond_0
    iget v4, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    add-int/2addr v4, v1

    iput v4, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    .line 248
    iget-object v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v1}, Lorg/jmrtd/io/InputStreamBuffer;->access$100(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/PositionInputStream;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jmrtd/io/PositionInputStream;->markSupported()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 249
    iget v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    invoke-direct {p0, v1}, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->syncCarrierPosition(I)V

    .line 250
    iget-object v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->this$0:Lorg/jmrtd/io/InputStreamBuffer;

    invoke-static {v1}, Lorg/jmrtd/io/InputStreamBuffer;->access$100(Lorg/jmrtd/io/InputStreamBuffer;)Lorg/jmrtd/io/PositionInputStream;

    move-result-object v1

    sub-long/2addr p1, v2

    invoke-virtual {v1, p1, p2}, Lorg/jmrtd/io/PositionInputStream;->skip(J)J

    move-result-wide p1

    .line 251
    iget v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    long-to-int v4, p1

    add-int/2addr v1, v4

    iput v1, p0, Lorg/jmrtd/io/InputStreamBuffer$SubInputStream;->position:I

    goto :goto_0

    :cond_1
    sub-long/2addr p1, v2

    .line 253
    invoke-super {p0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1

    :goto_0
    add-long/2addr v2, p1

    .line 256
    monitor-exit v0

    return-wide v2

    :catchall_0
    move-exception p1

    .line 258
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
