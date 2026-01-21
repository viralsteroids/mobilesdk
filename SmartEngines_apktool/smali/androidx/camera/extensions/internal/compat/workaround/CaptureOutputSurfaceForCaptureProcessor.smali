.class public Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;
.super Ljava/lang/Object;
.source "CaptureOutputSurfaceForCaptureProcessor.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor$ImageWriterCompat;,
        Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor$Api23Impl;
    }
.end annotation


# static fields
.field private static final MAX_IMAGES:I = 0x2

.field private static final TAG:Ljava/lang/String; = "CaptureOutputSurface"

.field private static final UNSPECIFIED_TIMESTAMP:J = -0x1L


# instance fields
.field private final mImageWriter:Landroid/media/ImageWriter;

.field private final mIntermediateImageReader:Landroidx/camera/core/impl/ImageReaderProxy;

.field private mIsClosed:Z

.field private final mLock:Ljava/lang/Object;

.field private final mNeedIntermediaSurface:Z

.field private final mNeedOverrideTimestamp:Z

.field mOutputImageTimeStamp:J

.field private final mOutputSurface:Landroid/view/Surface;


# direct methods
.method public constructor <init>(Landroid/view/Surface;Landroid/util/Size;Z)V
    .locals 3

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mLock:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 66
    iput-boolean v0, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mIsClosed:Z

    const-wide/16 v1, -0x1

    .line 72
    iput-wide v1, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mOutputImageTimeStamp:J

    .line 77
    iput-boolean p3, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mNeedOverrideTimestamp:Z

    .line 78
    const-class v1, Landroidx/camera/extensions/internal/compat/quirk/CaptureOutputSurfaceOccupiedQuirk;

    invoke-static {v1}, Landroidx/camera/extensions/internal/compat/quirk/DeviceQuirks;->get(Ljava/lang/Class;)Landroidx/camera/core/impl/Quirk;

    move-result-object v1

    if-nez v1, :cond_0

    if-eqz p3, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    iput-boolean v0, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mNeedIntermediaSurface:Z

    .line 80
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt p3, v1, :cond_2

    if-eqz v0, :cond_2

    .line 81
    const-string p3, "CaptureOutputSurface"

    const-string v0, "Enabling intermediate surface"

    invoke-static {p3, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result p3

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    const/16 v0, 0x23

    const/4 v1, 0x2

    .line 82
    invoke-static {p3, p2, v0, v1}, Landroidx/camera/core/ImageReaderProxys;->createIsolatedReader(IIII)Landroidx/camera/core/impl/ImageReaderProxy;

    move-result-object p2

    iput-object p2, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mIntermediateImageReader:Landroidx/camera/core/impl/ImageReaderProxy;

    .line 85
    invoke-interface {p2}, Landroidx/camera/core/impl/ImageReaderProxy;->getSurface()Landroid/view/Surface;

    move-result-object p3

    iput-object p3, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mOutputSurface:Landroid/view/Surface;

    .line 86
    invoke-static {p1, v1, v0}, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor$ImageWriterCompat;->newInstance(Landroid/view/Surface;II)Landroid/media/ImageWriter;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mImageWriter:Landroid/media/ImageWriter;

    .line 88
    new-instance p1, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor$$ExternalSyntheticLambda0;

    invoke-direct {p1, p0}, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor$$ExternalSyntheticLambda0;-><init>(Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;)V

    .line 105
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    move-result-object p3

    .line 88
    invoke-interface {p2, p1, p3}, Landroidx/camera/core/impl/ImageReaderProxy;->setOnImageAvailableListener(Landroidx/camera/core/impl/ImageReaderProxy$OnImageAvailableListener;Ljava/util/concurrent/Executor;)V

    return-void

    .line 107
    :cond_2
    iput-object p1, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mOutputSurface:Landroid/view/Surface;

    const/4 p1, 0x0

    .line 108
    iput-object p1, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mIntermediateImageReader:Landroidx/camera/core/impl/ImageReaderProxy;

    .line 109
    iput-object p1, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mImageWriter:Landroid/media/ImageWriter;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 135
    iget-object v0, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 136
    :try_start_0
    iput-boolean v1, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mIsClosed:Z

    .line 137
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_0

    iget-boolean v1, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mNeedIntermediaSurface:Z

    if-eqz v1, :cond_0

    .line 138
    iget-object v1, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mIntermediateImageReader:Landroidx/camera/core/impl/ImageReaderProxy;

    invoke-interface {v1}, Landroidx/camera/core/impl/ImageReaderProxy;->clearOnImageAvailableListener()V

    .line 139
    iget-object v1, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mIntermediateImageReader:Landroidx/camera/core/impl/ImageReaderProxy;

    invoke-interface {v1}, Landroidx/camera/core/impl/ImageReaderProxy;->close()V

    .line 140
    iget-object v1, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mImageWriter:Landroid/media/ImageWriter;

    invoke-static {v1}, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor$ImageWriterCompat;->close(Landroid/media/ImageWriter;)V

    .line 142
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 1

    .line 128
    iget-object v0, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mOutputSurface:Landroid/view/Surface;

    return-object v0
.end method

.method synthetic lambda$new$0$androidx-camera-extensions-internal-compat-workaround-CaptureOutputSurfaceForCaptureProcessor(Landroidx/camera/core/impl/ImageReaderProxy;)V
    .locals 5

    .line 89
    iget-object v0, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 90
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mIsClosed:Z

    if-eqz v1, :cond_0

    .line 91
    monitor-exit v0

    return-void

    .line 93
    :cond_0
    invoke-interface {p1}, Landroidx/camera/core/impl/ImageReaderProxy;->acquireNextImage()Landroidx/camera/core/ImageProxy;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 95
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getImage()Landroid/media/Image;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 97
    iget-boolean v1, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mNeedOverrideTimestamp:Z

    if-eqz v1, :cond_1

    iget-wide v1, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mOutputImageTimeStamp:J

    const-wide/16 v3, -0x1

    cmp-long v3, v1, v3

    if-eqz v3, :cond_1

    .line 99
    invoke-static {p1, v1, v2}, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor$Api23Impl;->setImageTimestamp(Landroid/media/Image;J)V

    .line 101
    :cond_1
    iget-object v1, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mImageWriter:Landroid/media/ImageWriter;

    invoke-static {v1, p1}, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor$ImageWriterCompat;->queueInputImage(Landroid/media/ImageWriter;Landroid/media/Image;)V

    .line 104
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setOutputImageTimestamp(J)V
    .locals 1

    .line 117
    iget-boolean v0, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mNeedOverrideTimestamp:Z

    if-eqz v0, :cond_0

    .line 118
    iput-wide p1, p0, Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;->mOutputImageTimeStamp:J

    :cond_0
    return-void
.end method
