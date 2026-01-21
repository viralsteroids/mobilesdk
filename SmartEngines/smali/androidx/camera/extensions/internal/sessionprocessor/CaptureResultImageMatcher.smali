.class Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;
.super Ljava/lang/Object;
.source "CaptureResultImageMatcher.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher$ImageReferenceListener;
    }
.end annotation


# static fields
.field private static final INVALID_TIMESTAMP:I = -0x1


# instance fields
.field mCaptureStageIdMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field mImageReferenceListener:Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher$ImageReferenceListener;

.field private final mLock:Ljava/lang/Object;

.field private final mPendingCaptureResults:Landroid/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LongSparseArray<",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mPendingImages:Landroid/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LongSparseArray<",
            "Ljava/util/List<",
            "Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    .line 40
    new-instance v0, Landroid/util/LongSparseArray;

    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    .line 45
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mCaptureStageIdMap:Ljava/util/Map;

    .line 49
    new-instance v0, Landroid/util/LongSparseArray;

    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    return-void
.end method

.method private addToList(Landroid/util/LongSparseArray;JLjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/util/LongSparseArray<",
            "Ljava/util/List<",
            "TT;>;>;JTT;)V"
        }
    .end annotation

    .line 94
    invoke-virtual {p1, p2, p3}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 97
    invoke-virtual {p1, p2, p3, v0}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 99
    :cond_0
    invoke-interface {v0, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private getTimeStampFromCaptureResult(Landroid/hardware/camera2/TotalCaptureResult;)J
    .locals 2

    .line 131
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->SENSOR_TIMESTAMP:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_0

    .line 134
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method private matchImages()V
    .locals 10

    .line 205
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 207
    :try_start_0
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    invoke-virtual {v1}, Landroid/util/LongSparseArray;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_2

    .line 208
    iget-object v3, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    invoke-virtual {v3, v1}, Landroid/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 209
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    const/4 v4, 0x0

    .line 210
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/hardware/camera2/TotalCaptureResult;

    .line 211
    invoke-direct {p0, v5}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->getTimeStampFromCaptureResult(Landroid/hardware/camera2/TotalCaptureResult;)J

    move-result-wide v6

    .line 212
    iget-object v8, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    invoke-virtual {v8, v1}, Landroid/util/LongSparseArray;->keyAt(I)J

    move-result-wide v8

    cmp-long v8, v6, v8

    if-nez v8, :cond_0

    move v8, v2

    goto :goto_1

    :cond_0
    move v8, v4

    :goto_1
    invoke-static {v8}, Landroidx/core/util/Preconditions;->checkState(Z)V

    .line 213
    iget-object v8, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    invoke-virtual {v8, v6, v7}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    if-eqz v8, :cond_1

    .line 214
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_1

    .line 215
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;

    .line 216
    iget-object v4, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    invoke-direct {p0, v4, v6, v7, v2}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->removeFromList(Landroid/util/LongSparseArray;JLjava/lang/Object;)V

    .line 218
    invoke-interface {v3, v5}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 219
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 220
    iget-object v3, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    invoke-virtual {v3, v1}, Landroid/util/LongSparseArray;->removeAt(I)V

    goto :goto_2

    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    move-object v2, v5

    .line 228
    :cond_3
    :goto_2
    invoke-direct {p0}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->removeStaleData()V

    .line 229
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_4

    if-eqz v5, :cond_4

    .line 232
    invoke-direct {p0, v2, v5}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->notifyImage(Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;Landroid/hardware/camera2/TotalCaptureResult;)V

    :cond_4
    return-void

    :catchall_0
    move-exception v1

    .line 229
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private notifyImage(Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 3

    .line 145
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 146
    :try_start_0
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mImageReferenceListener:Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher$ImageReferenceListener;

    if-eqz v1, :cond_0

    .line 148
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mCaptureStageIdMap:Ljava/util/Map;

    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    goto :goto_0

    .line 150
    :cond_0
    invoke-interface {p1}, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;->decrement()Z

    const/4 v1, 0x0

    move-object v2, v1

    .line 152
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 156
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 155
    invoke-interface {v1, p1, p2, v0}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher$ImageReferenceListener;->onImageReferenceIncoming(Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;Landroid/hardware/camera2/TotalCaptureResult;I)V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 152
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private removeFromList(Landroid/util/LongSparseArray;JLjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/util/LongSparseArray<",
            "Ljava/util/List<",
            "TT;>;>;JTT;)V"
        }
    .end annotation

    .line 103
    invoke-virtual {p1, p2, p3}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 105
    invoke-interface {v0, p4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 106
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p4

    if-eqz p4, :cond_0

    .line 107
    invoke-virtual {p1, p2, p3}, Landroid/util/LongSparseArray;->remove(J)V

    :cond_0
    return-void
.end method

.method private removeStaleData()V
    .locals 7

    .line 169
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 171
    :try_start_0
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    invoke-virtual {v1}, Landroid/util/LongSparseArray;->size()I

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    invoke-virtual {v1}, Landroid/util/LongSparseArray;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_3

    .line 175
    :cond_0
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/util/LongSparseArray;->keyAt(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 176
    iget-object v3, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    invoke-virtual {v3, v2}, Landroid/util/LongSparseArray;->keyAt(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 180
    invoke-virtual {v2, v1}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Landroidx/core/util/Preconditions;->checkArgument(Z)V

    .line 182
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-lez v3, :cond_3

    .line 183
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    invoke-virtual {v1}, Landroid/util/LongSparseArray;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_5

    .line 184
    iget-object v3, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    invoke-virtual {v3, v1}, Landroid/util/LongSparseArray;->keyAt(I)J

    move-result-wide v3

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-gez v3, :cond_2

    .line 185
    iget-object v3, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    invoke-virtual {v3, v1}, Landroid/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 186
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;

    .line 187
    invoke-interface {v4}, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;->decrement()Z

    goto :goto_1

    .line 189
    :cond_1
    iget-object v3, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    invoke-virtual {v3, v1}, Landroid/util/LongSparseArray;->removeAt(I)V

    :cond_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 193
    :cond_3
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    invoke-virtual {v2}, Landroid/util/LongSparseArray;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_2
    if-ltz v2, :cond_5

    .line 194
    iget-object v3, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    invoke-virtual {v3, v2}, Landroid/util/LongSparseArray;->keyAt(I)J

    move-result-wide v3

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-gez v3, :cond_4

    .line 195
    iget-object v3, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    invoke-virtual {v3, v2}, Landroid/util/LongSparseArray;->removeAt(I)V

    :cond_4
    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    .line 199
    :cond_5
    monitor-exit v0

    return-void

    .line 172
    :cond_6
    :goto_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 199
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method captureResultIncoming(Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 1

    const/4 v0, 0x0

    .line 113
    invoke-virtual {p0, p1, v0}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->captureResultIncoming(Landroid/hardware/camera2/TotalCaptureResult;I)V

    return-void
.end method

.method captureResultIncoming(Landroid/hardware/camera2/TotalCaptureResult;I)V
    .locals 5

    .line 118
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 119
    :try_start_0
    invoke-direct {p0, p1}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->getTimeStampFromCaptureResult(Landroid/hardware/camera2/TotalCaptureResult;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    .line 121
    monitor-exit v0

    return-void

    .line 124
    :cond_0
    iget-object v3, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    invoke-direct {p0, v3, v1, v2, p1}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->addToList(Landroid/util/LongSparseArray;JLjava/lang/Object;)V

    .line 125
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mCaptureStageIdMap:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    invoke-direct {p0}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->matchImages()V

    return-void

    :catchall_0
    move-exception p1

    .line 126
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method clear()V
    .locals 5

    .line 59
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 60
    :try_start_0
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    invoke-virtual {v1}, Landroid/util/LongSparseArray;->clear()V

    const/4 v1, 0x0

    .line 61
    :goto_0
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    invoke-virtual {v2}, Landroid/util/LongSparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 62
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    invoke-virtual {v2, v1}, Landroid/util/LongSparseArray;->keyAt(I)J

    move-result-wide v2

    .line 63
    iget-object v4, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    invoke-virtual {v4, v2, v3}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;

    .line 64
    invoke-interface {v3}, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;->decrement()Z

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 67
    :cond_1
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    invoke-virtual {v1}, Landroid/util/LongSparseArray;->clear()V

    .line 68
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mCaptureStageIdMap:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 69
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method clearImageReferenceListener()V
    .locals 2

    .line 80
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 81
    :try_start_0
    iput-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mImageReferenceListener:Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher$ImageReferenceListener;

    .line 82
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method imageIncoming(Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;)V
    .locals 5

    .line 86
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 87
    :try_start_0
    invoke-interface {p1}, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;->get()Landroid/media/Image;

    move-result-object v1

    .line 88
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    invoke-virtual {v1}, Landroid/media/Image;->getTimestamp()J

    move-result-wide v3

    invoke-direct {p0, v2, v3, v4, p1}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->addToList(Landroid/util/LongSparseArray;JLjava/lang/Object;)V

    .line 89
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    invoke-direct {p0}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->matchImages()V

    return-void

    :catchall_0
    move-exception p1

    .line 89
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method setImageReferenceListener(Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher$ImageReferenceListener;)V
    .locals 1

    .line 74
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 75
    :try_start_0
    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mImageReferenceListener:Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher$ImageReferenceListener;

    .line 76
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
