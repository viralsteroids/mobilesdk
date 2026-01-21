.class public final synthetic Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;

.field public final synthetic f$1:Z

.field public final synthetic f$2:Ljava/util/HashMap;

.field public final synthetic f$3:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;ZLjava/util/HashMap;Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$$ExternalSyntheticLambda0;->f$0:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;

    iput-boolean p2, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$$ExternalSyntheticLambda0;->f$1:Z

    iput-object p3, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$$ExternalSyntheticLambda0;->f$2:Ljava/util/HashMap;

    iput-object p4, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$$ExternalSyntheticLambda0;->f$3:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 0
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$$ExternalSyntheticLambda0;->f$0:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;

    iget-boolean v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$$ExternalSyntheticLambda0;->f$1:Z

    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$$ExternalSyntheticLambda0;->f$2:Ljava/util/HashMap;

    iget-object v3, p0, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$$ExternalSyntheticLambda0;->f$3:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;

    invoke-virtual {v0, v1, v2, v3}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->lambda$process$1$androidx-camera-extensions-internal-sessionprocessor-StillCaptureProcessor(ZLjava/util/HashMap;Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;)V

    return-void
.end method
