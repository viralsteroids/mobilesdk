.class final Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor$Api23Impl;
.super Ljava/lang/Object;
.source "CaptureOutputSurfaceForCaptureProcessor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/extensions/internal/compat/workaround/CaptureOutputSurfaceForCaptureProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Api23Impl"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static setImageTimestamp(Landroid/media/Image;J)V
    .locals 0

    .line 172
    invoke-virtual {p0, p1, p2}, Landroid/media/Image;->setTimestamp(J)V

    return-void
.end method
