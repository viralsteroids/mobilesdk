.class Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;
.super Ljava/lang/Object;
.source "StillCaptureProcessor.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "StillCaptureProcessor"

.field private static final UNSPECIFIED_TIMESTAMP:J = -0x1L


# instance fields
.field mCaptureOutputSurface:Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;

.field final mCaptureProcessorImpl:Landroidx/camera/extensions/impl/CaptureProcessorImpl;

.field final mCaptureResultImageMatcher:Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;

.field mCaptureResults:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Landroid/util/Pair<",
            "Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ">;>;"
        }
    .end annotation
.end field

.field mIsClosed:Z

.field private mIsPostviewConfigured:Z

.field final mLock:Ljava/lang/Object;

.field mOnCaptureResultCallback:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;

.field mSourceCaptureResult:Landroid/hardware/camera2/TotalCaptureResult;

.field mTimeStampForOutputImage:J


# direct methods
.method constructor <init>(Landroidx/camera/extensions/impl/CaptureProcessorImpl;Landroid/view/Surface;Landroid/util/Size;Landroidx/camera/core/impl/OutputSurface;Z)V
    .locals 3

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    new-instance v0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;

    invoke-direct {v0}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;-><init>()V

    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureResultImageMatcher:Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;

    .line 69
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mLock:Ljava/lang/Object;

    .line 70
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureResults:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 75
    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mOnCaptureResultCallback:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;

    .line 78
    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mSourceCaptureResult:Landroid/hardware/camera2/TotalCaptureResult;

    const/4 v0, 0x0

    .line 81
    iput-boolean v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mIsClosed:Z

    const-wide/16 v1, -0x1

    .line 83
    iput-wide v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mTimeStampForOutputImage:J

    .line 90
    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureProcessorImpl:Landroidx/camera/extensions/impl/CaptureProcessorImpl;

    .line 92
    new-instance v1, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;

    invoke-direct {v1, p2, p3, p5}, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;-><init>(Landroid/view/Surface;Landroid/util/Size;Z)V

    iput-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureOutputSurface:Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;

    .line 96
    invoke-virtual {v1}, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->getSurface()Landroid/view/Surface;

    move-result-object p2

    const/16 p5, 0x23

    .line 95
    invoke-interface {p1, p2, p5}, Landroidx/camera/extensions/impl/CaptureProcessorImpl;->onOutputSurface(Landroid/view/Surface;I)V

    .line 97
    invoke-interface {p1, p5}, Landroidx/camera/extensions/impl/CaptureProcessorImpl;->onImageFormatUpdate(I)V

    const/4 p2, 0x1

    if-eqz p4, :cond_0

    move v1, p2

    goto :goto_0

    :cond_0
    move v1, v0

    .line 99
    :goto_0
    iput-boolean v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mIsPostviewConfigured:Z

    if-eqz p4, :cond_2

    .line 100
    sget-object v1, Landroidx/camera/extensions/internal/Version;->VERSION_1_4:Landroidx/camera/extensions/internal/Version;

    .line 101
    invoke-static {v1}, Landroidx/camera/extensions/internal/ClientVersion;->isMinimumCompatibleVersion(Landroidx/camera/extensions/internal/Version;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Landroidx/camera/extensions/internal/Version;->VERSION_1_4:Landroidx/camera/extensions/internal/Version;

    .line 102
    invoke-static {v1}, Landroidx/camera/extensions/internal/ExtensionVersion;->isMinimumCompatibleVersion(Landroidx/camera/extensions/internal/Version;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 104
    invoke-virtual {p4}, Landroidx/camera/core/impl/OutputSurface;->getImageFormat()I

    move-result v1

    if-ne v1, p5, :cond_1

    move v0, p2

    .line 103
    :cond_1
    invoke-static {v0}, Landroidx/core/util/Preconditions;->checkArgument(Z)V

    .line 105
    invoke-virtual {p4}, Landroidx/camera/core/impl/OutputSurface;->getSize()Landroid/util/Size;

    move-result-object p2

    invoke-interface {p1, p3, p2}, Landroidx/camera/extensions/impl/CaptureProcessorImpl;->onResolutionUpdate(Landroid/util/Size;Landroid/util/Size;)V

    .line 106
    invoke-virtual {p4}, Landroidx/camera/core/impl/OutputSurface;->getSurface()Landroid/view/Surface;

    move-result-object p2

    invoke-interface {p1, p2}, Landroidx/camera/extensions/impl/CaptureProcessorImpl;->onPostviewOutputSurface(Landroid/view/Surface;)V

    return-void

    .line 109
    :cond_2
    invoke-interface {p1, p3}, Landroidx/camera/extensions/impl/CaptureProcessorImpl;->onResolutionUpdate(Landroid/util/Size;)V

    return-void
.end method


# virtual methods
.method clearCaptureResults()V
    .locals 3

    .line 125
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 127
    :try_start_0
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureResults:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Pair;

    .line 128
    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;

    invoke-interface {v2}, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;->decrement()Z

    goto :goto_0

    .line 130
    :cond_0
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureResults:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 131
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method close()V
    .locals 3

    .line 288
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 289
    :try_start_0
    const-string v1, "StillCaptureProcessor"

    const-string v2, "Close the StillCaptureProcessor"

    invoke-static {v1, v2}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 290
    iput-boolean v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mIsClosed:Z

    .line 291
    invoke-virtual {p0}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->clearCaptureResults()V

    .line 292
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureResultImageMatcher:Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;

    invoke-virtual {v1}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->clearImageReferenceListener()V

    .line 293
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureResultImageMatcher:Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;

    invoke-virtual {v1}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->clear()V

    .line 294
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureOutputSurface:Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;

    invoke-virtual {v1}, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->close()V

    .line 295
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method synthetic lambda$process$1$androidx-camera-extensions-internal-sessionprocessor-StillCaptureProcessor(ZLjava/util/HashMap;Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;)V
    .locals 4

    .line 185
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 187
    :try_start_0
    iget-boolean v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mIsClosed:Z

    if-eqz v2, :cond_1

    .line 188
    const-string p1, "StillCaptureProcessor"

    const-string p2, "Ignore process() in closed state."

    invoke-static {p1, p2}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 248
    :try_start_1
    const-string p1, "StillCaptureProcessor"

    const-string p2, "CaptureProcessorImpl.process() finish"

    invoke-static {p1, p2}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    iget-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mOnCaptureResultCallback:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;

    if-eqz p1, :cond_0

    .line 250
    invoke-interface {p1}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;->onProcessCompleted()V

    .line 251
    iput-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mOnCaptureResultCallback:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;

    .line 253
    :cond_0
    invoke-virtual {p0}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->clearCaptureResults()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    .line 191
    :cond_1
    :try_start_2
    const-string v2, "StillCaptureProcessor"

    const-string v3, "CaptureProcessorImpl.process() begin"

    invoke-static {v2, v3}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    sget-object v2, Landroidx/camera/extensions/internal/Version;->VERSION_1_4:Landroidx/camera/extensions/internal/Version;

    invoke-static {v2}, Landroidx/camera/extensions/internal/ExtensionVersion;->isMinimumCompatibleVersion(Landroidx/camera/extensions/internal/Version;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Landroidx/camera/extensions/internal/Version;->VERSION_1_4:Landroidx/camera/extensions/internal/Version;

    .line 193
    invoke-static {v2}, Landroidx/camera/extensions/internal/ClientVersion;->isMinimumCompatibleVersion(Landroidx/camera/extensions/internal/Version;)Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mIsPostviewConfigured:Z

    if-eqz p1, :cond_2

    .line 196
    iget-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureProcessorImpl:Landroidx/camera/extensions/impl/CaptureProcessorImpl;

    new-instance v2, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$1;

    invoke-direct {v2, p0, p3}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$1;-><init>(Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;)V

    .line 215
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    move-result-object v3

    .line 196
    invoke-interface {p1, p2, v2, v3}, Landroidx/camera/extensions/impl/CaptureProcessorImpl;->processWithPostview(Ljava/util/Map;Landroidx/camera/extensions/impl/ProcessResultImpl;Ljava/util/concurrent/Executor;)V

    goto :goto_0

    .line 216
    :cond_2
    sget-object p1, Landroidx/camera/extensions/internal/Version;->VERSION_1_3:Landroidx/camera/extensions/internal/Version;

    invoke-static {p1}, Landroidx/camera/extensions/internal/ExtensionVersion;->isMinimumCompatibleVersion(Landroidx/camera/extensions/internal/Version;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Landroidx/camera/extensions/internal/Version;->VERSION_1_3:Landroidx/camera/extensions/internal/Version;

    .line 218
    invoke-static {p1}, Landroidx/camera/extensions/internal/ClientVersion;->isMinimumCompatibleVersion(Landroidx/camera/extensions/internal/Version;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 220
    iget-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureProcessorImpl:Landroidx/camera/extensions/impl/CaptureProcessorImpl;

    new-instance v2, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$2;

    invoke-direct {v2, p0, p3}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$2;-><init>(Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;)V

    .line 237
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    move-result-object v3

    .line 220
    invoke-interface {p1, p2, v2, v3}, Landroidx/camera/extensions/impl/CaptureProcessorImpl;->process(Ljava/util/Map;Landroidx/camera/extensions/impl/ProcessResultImpl;Ljava/util/concurrent/Executor;)V

    goto :goto_0

    .line 239
    :cond_3
    iget-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureProcessorImpl:Landroidx/camera/extensions/impl/CaptureProcessorImpl;

    invoke-interface {p1, p2}, Landroidx/camera/extensions/impl/CaptureProcessorImpl;->process(Ljava/util/Map;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 248
    :goto_0
    :try_start_3
    const-string p1, "StillCaptureProcessor"

    const-string p2, "CaptureProcessorImpl.process() finish"

    invoke-static {p1, p2}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    iget-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mOnCaptureResultCallback:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;

    if-eqz p1, :cond_4

    .line 250
    invoke-interface {p1}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;->onProcessCompleted()V

    .line 251
    :goto_1
    iput-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mOnCaptureResultCallback:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;

    .line 253
    :cond_4
    invoke-virtual {p0}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->clearCaptureResults()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 242
    :try_start_4
    const-string p2, "StillCaptureProcessor"

    const-string v2, "mCaptureProcessorImpl.process exception "

    invoke-static {p2, v2, p1}, Landroidx/camera/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 243
    iput-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mOnCaptureResultCallback:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;

    if-eqz p3, :cond_5

    .line 245
    invoke-interface {p3, p1}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;->onError(Ljava/lang/Exception;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 248
    :cond_5
    :try_start_5
    const-string p1, "StillCaptureProcessor"

    const-string p2, "CaptureProcessorImpl.process() finish"

    invoke-static {p1, p2}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    iget-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mOnCaptureResultCallback:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;

    if-eqz p1, :cond_4

    .line 250
    invoke-interface {p1}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;->onProcessCompleted()V

    goto :goto_1

    .line 255
    :goto_2
    monitor-exit v0

    return-void

    .line 248
    :goto_3
    const-string p2, "StillCaptureProcessor"

    const-string p3, "CaptureProcessorImpl.process() finish"

    invoke-static {p2, p3}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    iget-object p2, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mOnCaptureResultCallback:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;

    if-eqz p2, :cond_6

    .line 250
    invoke-interface {p2}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;->onProcessCompleted()V

    .line 251
    iput-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mOnCaptureResultCallback:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;

    .line 253
    :cond_6
    invoke-virtual {p0}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->clearCaptureResults()V

    .line 254
    throw p1

    :catchall_1
    move-exception p1

    .line 255
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method synthetic lambda$startCapture$0$androidx-camera-extensions-internal-sessionprocessor-StillCaptureProcessor(Ljava/util/List;Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;ZLandroidx/camera/extensions/internal/sessionprocessor/ImageReference;Landroid/hardware/camera2/TotalCaptureResult;I)V
    .locals 5

    .line 0
    const-string v0, "mCaptureResult has capture stage Id: "

    const-string v1, "onImageReferenceIncoming  captureStageId="

    .line 148
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mLock:Ljava/lang/Object;

    monitor-enter v2

    .line 149
    :try_start_0
    iget-boolean v3, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mIsClosed:Z

    if-eqz v3, :cond_0

    .line 150
    invoke-interface {p4}, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;->decrement()Z

    .line 151
    const-string p1, "StillCaptureProcessor"

    const-string p2, "Ignore image in closed state"

    invoke-static {p1, p2}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    monitor-exit v2

    return-void

    .line 154
    :cond_0
    const-string v3, "StillCaptureProcessor"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureResults:Ljava/util/HashMap;

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    new-instance v3, Landroid/util/Pair;

    invoke-direct {v3, p4, p5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    const-string p4, "StillCaptureProcessor"

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p6, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureResults:Ljava/util/HashMap;

    .line 161
    invoke-virtual {p6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p6

    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p5

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    .line 160
    invoke-static {p4, p5}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    iget-object p4, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureResults:Ljava/util/HashMap;

    invoke-virtual {p4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 163
    iget-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureResults:Ljava/util/HashMap;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->process(Ljava/util/Map;Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;Z)V

    .line 165
    :cond_1
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method notifyCaptureResult(Landroid/hardware/camera2/TotalCaptureResult;I)V
    .locals 4

    .line 261
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureResultImageMatcher:Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->captureResultIncoming(Landroid/hardware/camera2/TotalCaptureResult;I)V

    .line 264
    iget-wide v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mTimeStampForOutputImage:J

    const-wide/16 v2, -0x1

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    .line 265
    sget-object p2, Landroid/hardware/camera2/CaptureResult;->SENSOR_TIMESTAMP:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, p2}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    if-eqz p2, :cond_0

    .line 267
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mTimeStampForOutputImage:J

    .line 268
    iget-object p2, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureOutputSurface:Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;

    invoke-virtual {p2, v0, v1}, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->setOutputImageTimestamp(J)V

    .line 272
    :cond_0
    iget-object p2, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mLock:Ljava/lang/Object;

    monitor-enter p2

    .line 273
    :try_start_0
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mSourceCaptureResult:Landroid/hardware/camera2/TotalCaptureResult;

    if-nez v0, :cond_1

    .line 274
    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mSourceCaptureResult:Landroid/hardware/camera2/TotalCaptureResult;

    .line 276
    :cond_1
    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method notifyImage(Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;)V
    .locals 1

    .line 280
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureResultImageMatcher:Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;

    invoke-virtual {v0, p1}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->imageIncoming(Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;)V

    return-void
.end method

.method process(Ljava/util/Map;Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/util/Pair<",
            "Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ">;>;",
            "Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;",
            "Z)V"
        }
    .end annotation

    .line 172
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 174
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mLock:Ljava/lang/Object;

    monitor-enter v1

    .line 175
    :try_start_0
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 177
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Pair;

    .line 178
    new-instance v5, Landroid/util/Pair;

    iget-object v6, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;

    .line 179
    invoke-interface {v6}, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;->get()Landroid/media/Image;

    move-result-object v6

    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Landroid/hardware/camera2/TotalCaptureResult;

    invoke-direct {v5, v6, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 178
    invoke-virtual {v0, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 181
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->ioExecutor()Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance v1, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p3, v0, p2}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$$ExternalSyntheticLambda0;-><init>(Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;ZLjava/util/HashMap;Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    .line 181
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method startCapture(ZLjava/util/List;Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;",
            ")V"
        }
    .end annotation

    .line 136
    const-string v0, "StillCaptureProcessor"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Start the capture: enablePostview="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v0, -0x1

    .line 137
    iput-wide v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mTimeStampForOutputImage:J

    .line 138
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 139
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mIsClosed:Z

    xor-int/lit8 v1, v1, 0x1

    const-string v2, "StillCaptureProcessor is closed. Can\'t invoke startCapture()"

    invoke-static {v1, v2}, Landroidx/core/util/Preconditions;->checkState(ZLjava/lang/String;)V

    .line 141
    iput-object p3, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mOnCaptureResultCallback:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;

    .line 142
    invoke-virtual {p0}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->clearCaptureResults()V

    .line 143
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureResultImageMatcher:Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;

    invoke-virtual {v0}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->clear()V

    .line 146
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->mCaptureResultImageMatcher:Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;

    new-instance v1, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, p2, p3, p1}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$$ExternalSyntheticLambda1;-><init>(Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;Ljava/util/List;Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;Z)V

    invoke-virtual {v0, v1}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->setImageReferenceListener(Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher$ImageReferenceListener;)V

    return-void

    :catchall_0
    move-exception p1

    .line 143
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
