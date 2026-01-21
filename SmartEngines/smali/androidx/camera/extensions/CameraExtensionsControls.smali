.class Landroidx/camera/extensions/CameraExtensionsControls;
.super Ljava/lang/Object;
.source "CameraExtensionsControls.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static from(Landroidx/camera/core/CameraControl;)Landroidx/camera/extensions/CameraExtensionsControl;
    .locals 2

    .line 38
    instance-of v0, p0, Landroidx/camera/core/impl/RestrictedCameraControl;

    const-string v1, "The input camera control must be an instance retrieved from the camera that is returned by invoking CameraProvider#bindToLifecycle() with an extension enabled camera selector."

    invoke-static {v0, v1}, Landroidx/core/util/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 43
    check-cast p0, Landroidx/camera/core/impl/RestrictedCameraControl;

    .line 44
    invoke-virtual {p0}, Landroidx/camera/core/impl/RestrictedCameraControl;->getSessionProcessor()Landroidx/camera/core/impl/SessionProcessor;

    move-result-object p0

    .line 45
    instance-of v0, p0, Landroidx/camera/extensions/CameraExtensionsControl;

    if-eqz v0, :cond_0

    .line 46
    check-cast p0, Landroidx/camera/extensions/CameraExtensionsControl;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
