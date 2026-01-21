.class Landroidx/camera/camera2/internal/CaptureSession$2;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
.source "CaptureSession.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/camera2/internal/CaptureSession;->issueBurstCaptureRequest(Ljava/util/List;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/camera/camera2/internal/CaptureSession;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/CaptureSession;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    .line 844
    iput-object p1, p0, Landroidx/camera/camera2/internal/CaptureSession$2;->this$0:Landroidx/camera/camera2/internal/CaptureSession;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 1

    .line 851
    iget-object p1, p0, Landroidx/camera/camera2/internal/CaptureSession$2;->this$0:Landroidx/camera/camera2/internal/CaptureSession;

    iget-object p1, p1, Landroidx/camera/camera2/internal/CaptureSession;->mSessionLock:Ljava/lang/Object;

    monitor-enter p1

    .line 852
    :try_start_0
    iget-object p2, p0, Landroidx/camera/camera2/internal/CaptureSession$2;->this$0:Landroidx/camera/camera2/internal/CaptureSession;

    iget-object p2, p2, Landroidx/camera/camera2/internal/CaptureSession;->mSessionConfig:Landroidx/camera/core/impl/SessionConfig;

    if-nez p2, :cond_0

    .line 853
    monitor-exit p1

    return-void

    .line 855
    :cond_0
    iget-object p2, p0, Landroidx/camera/camera2/internal/CaptureSession$2;->this$0:Landroidx/camera/camera2/internal/CaptureSession;

    iget-object p2, p2, Landroidx/camera/camera2/internal/CaptureSession;->mSessionConfig:Landroidx/camera/core/impl/SessionConfig;

    .line 856
    invoke-virtual {p2}, Landroidx/camera/core/impl/SessionConfig;->getRepeatingCaptureConfig()Landroidx/camera/core/impl/CaptureConfig;

    move-result-object p2

    .line 857
    const-string p3, "CaptureSession"

    const-string v0, "Submit FLASH_MODE_OFF request"

    invoke-static {p3, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 858
    iget-object p3, p0, Landroidx/camera/camera2/internal/CaptureSession$2;->this$0:Landroidx/camera/camera2/internal/CaptureSession;

    .line 859
    invoke-static {p3}, Landroidx/camera/camera2/internal/CaptureSession;->access$000(Landroidx/camera/camera2/internal/CaptureSession;)Landroidx/camera/camera2/internal/compat/workaround/TorchStateReset;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroidx/camera/camera2/internal/compat/workaround/TorchStateReset;->createTorchResetRequest(Landroidx/camera/core/impl/CaptureConfig;)Landroidx/camera/core/impl/CaptureConfig;

    move-result-object p2

    .line 858
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroidx/camera/camera2/internal/CaptureSession;->issueCaptureRequests(Ljava/util/List;)V

    .line 861
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
