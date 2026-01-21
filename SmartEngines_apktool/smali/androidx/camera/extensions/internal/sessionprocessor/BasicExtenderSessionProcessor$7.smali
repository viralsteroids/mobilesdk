.class Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor$7;
.super Ljava/lang/Object;
.source "BasicExtenderSessionProcessor.java"

# interfaces
.implements Landroidx/camera/core/impl/RequestProcessor$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor;->startTrigger(Landroidx/camera/core/impl/Config;Landroidx/camera/core/impl/TagBundle;Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor;

.field final synthetic val$callback:Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;

.field final synthetic val$captureSequenceId:I

.field final synthetic val$tagBundle:Landroidx/camera/core/impl/TagBundle;


# direct methods
.method constructor <init>(Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor;Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;ILandroidx/camera/core/impl/TagBundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 700
    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor$7;->this$0:Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor;

    iput-object p2, p0, Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor$7;->val$callback:Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;

    iput p3, p0, Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor$7;->val$captureSequenceId:I

    iput-object p4, p0, Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor$7;->val$tagBundle:Landroidx/camera/core/impl/TagBundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCaptureCompleted(Landroidx/camera/core/impl/RequestProcessor$Request;Landroidx/camera/core/impl/CameraCaptureResult;)V
    .locals 5

    .line 704
    iget-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor$7;->val$callback:Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;

    invoke-interface {p2}, Landroidx/camera/core/impl/CameraCaptureResult;->getTimestamp()J

    move-result-wide v0

    iget v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor$7;->val$captureSequenceId:I

    new-instance v3, Landroidx/camera/extensions/internal/Camera2CameraCaptureResult;

    iget-object v4, p0, Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor$7;->val$tagBundle:Landroidx/camera/core/impl/TagBundle;

    .line 706
    invoke-interface {p2}, Landroidx/camera/core/impl/CameraCaptureResult;->getCaptureResult()Landroid/hardware/camera2/CaptureResult;

    move-result-object p2

    invoke-direct {v3, v4, p2}, Landroidx/camera/extensions/internal/Camera2CameraCaptureResult;-><init>(Landroidx/camera/core/impl/TagBundle;Landroid/hardware/camera2/CaptureResult;)V

    .line 704
    invoke-interface {p1, v0, v1, v2, v3}, Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;->onCaptureCompleted(JILandroidx/camera/core/impl/CameraCaptureResult;)V

    .line 707
    iget-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor$7;->val$callback:Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;

    iget p2, p0, Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor$7;->val$captureSequenceId:I

    invoke-interface {p1, p2}, Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;->onCaptureSequenceCompleted(I)V

    return-void
.end method

.method public onCaptureFailed(Landroidx/camera/core/impl/RequestProcessor$Request;Landroidx/camera/core/impl/CameraCaptureFailure;)V
    .locals 0

    .line 713
    iget-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor$7;->val$callback:Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;

    iget p2, p0, Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor$7;->val$captureSequenceId:I

    invoke-interface {p1, p2}, Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;->onCaptureFailed(I)V

    return-void
.end method
