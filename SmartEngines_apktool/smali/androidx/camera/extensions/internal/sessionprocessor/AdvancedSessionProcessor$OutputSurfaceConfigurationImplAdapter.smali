.class Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter;
.super Ljava/lang/Object;
.source "AdvancedSessionProcessor.java"

# interfaces
.implements Landroidx/camera/extensions/impl/advanced/OutputSurfaceConfigurationImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "OutputSurfaceConfigurationImplAdapter"
.end annotation


# instance fields
.field private final mAnalysisOutputSurface:Landroidx/camera/extensions/impl/advanced/OutputSurfaceImpl;

.field private final mCaptureOutputSurface:Landroidx/camera/extensions/impl/advanced/OutputSurfaceImpl;

.field private final mPostviewOutputSurface:Landroidx/camera/extensions/impl/advanced/OutputSurfaceImpl;

.field private final mPreviewOutputSurface:Landroidx/camera/extensions/impl/advanced/OutputSurfaceImpl;


# direct methods
.method constructor <init>(Landroidx/camera/core/impl/OutputSurfaceConfiguration;)V
    .locals 3

    .line 436
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 437
    new-instance v0, Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceImplAdapter;

    .line 438
    invoke-virtual {p1}, Landroidx/camera/core/impl/OutputSurfaceConfiguration;->getPreviewOutputSurface()Landroidx/camera/core/impl/OutputSurface;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceImplAdapter;-><init>(Landroidx/camera/core/impl/OutputSurface;)V

    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter;->mPreviewOutputSurface:Landroidx/camera/extensions/impl/advanced/OutputSurfaceImpl;

    .line 439
    new-instance v0, Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceImplAdapter;

    .line 440
    invoke-virtual {p1}, Landroidx/camera/core/impl/OutputSurfaceConfiguration;->getImageCaptureOutputSurface()Landroidx/camera/core/impl/OutputSurface;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceImplAdapter;-><init>(Landroidx/camera/core/impl/OutputSurface;)V

    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter;->mCaptureOutputSurface:Landroidx/camera/extensions/impl/advanced/OutputSurfaceImpl;

    .line 442
    invoke-virtual {p1}, Landroidx/camera/core/impl/OutputSurfaceConfiguration;->getImageAnalysisOutputSurface()Landroidx/camera/core/impl/OutputSurface;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 443
    new-instance v0, Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceImplAdapter;

    .line 444
    invoke-virtual {p1}, Landroidx/camera/core/impl/OutputSurfaceConfiguration;->getImageAnalysisOutputSurface()Landroidx/camera/core/impl/OutputSurface;

    move-result-object v2

    invoke-direct {v0, v2}, Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceImplAdapter;-><init>(Landroidx/camera/core/impl/OutputSurface;)V

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter;->mAnalysisOutputSurface:Landroidx/camera/extensions/impl/advanced/OutputSurfaceImpl;

    .line 446
    invoke-virtual {p1}, Landroidx/camera/core/impl/OutputSurfaceConfiguration;->getPostviewOutputSurface()Landroidx/camera/core/impl/OutputSurface;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 447
    new-instance v1, Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceImplAdapter;

    .line 448
    invoke-virtual {p1}, Landroidx/camera/core/impl/OutputSurfaceConfiguration;->getPostviewOutputSurface()Landroidx/camera/core/impl/OutputSurface;

    move-result-object p1

    invoke-direct {v1, p1}, Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceImplAdapter;-><init>(Landroidx/camera/core/impl/OutputSurface;)V

    :cond_1
    iput-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter;->mPostviewOutputSurface:Landroidx/camera/extensions/impl/advanced/OutputSurfaceImpl;

    return-void
.end method


# virtual methods
.method public getImageAnalysisOutputSurface()Landroidx/camera/extensions/impl/advanced/OutputSurfaceImpl;
    .locals 1

    .line 466
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter;->mAnalysisOutputSurface:Landroidx/camera/extensions/impl/advanced/OutputSurfaceImpl;

    return-object v0
.end method

.method public getImageCaptureOutputSurface()Landroidx/camera/extensions/impl/advanced/OutputSurfaceImpl;
    .locals 1

    .line 460
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter;->mCaptureOutputSurface:Landroidx/camera/extensions/impl/advanced/OutputSurfaceImpl;

    return-object v0
.end method

.method public getPostviewOutputSurface()Landroidx/camera/extensions/impl/advanced/OutputSurfaceImpl;
    .locals 1

    .line 472
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter;->mPostviewOutputSurface:Landroidx/camera/extensions/impl/advanced/OutputSurfaceImpl;

    return-object v0
.end method

.method public getPreviewOutputSurface()Landroidx/camera/extensions/impl/advanced/OutputSurfaceImpl;
    .locals 1

    .line 454
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter;->mPreviewOutputSurface:Landroidx/camera/extensions/impl/advanced/OutputSurfaceImpl;

    return-object v0
.end method
