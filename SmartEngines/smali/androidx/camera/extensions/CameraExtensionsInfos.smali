.class Landroidx/camera/extensions/CameraExtensionsInfos;
.super Ljava/lang/Object;
.source "CameraExtensionsInfos.java"


# static fields
.field private static final NORMAL_MODE_CAMERA_EXTENSIONS_INFO:Landroidx/camera/extensions/CameraExtensionsInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    new-instance v0, Landroidx/camera/extensions/CameraExtensionsInfos$1;

    invoke-direct {v0}, Landroidx/camera/extensions/CameraExtensionsInfos$1;-><init>()V

    sput-object v0, Landroidx/camera/extensions/CameraExtensionsInfos;->NORMAL_MODE_CAMERA_EXTENSIONS_INFO:Landroidx/camera/extensions/CameraExtensionsInfo;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static from(Landroidx/camera/core/CameraInfo;)Landroidx/camera/extensions/CameraExtensionsInfo;
    .locals 2

    .line 38
    instance-of v0, p0, Landroidx/camera/core/impl/RestrictedCameraInfo;

    const-string v1, "The input camera info must be an instance retrieved from the camera that is returned by invoking CameraProvider#bindToLifecycle() with an extension enabled camera selector."

    invoke-static {v0, v1}, Landroidx/core/util/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 42
    check-cast p0, Landroidx/camera/core/impl/RestrictedCameraInfo;

    .line 43
    invoke-virtual {p0}, Landroidx/camera/core/impl/RestrictedCameraInfo;->getSessionProcessor()Landroidx/camera/core/impl/SessionProcessor;

    move-result-object p0

    .line 44
    instance-of v0, p0, Landroidx/camera/extensions/CameraExtensionsInfo;

    if-eqz v0, :cond_0

    .line 45
    check-cast p0, Landroidx/camera/extensions/CameraExtensionsInfo;

    return-object p0

    .line 47
    :cond_0
    sget-object p0, Landroidx/camera/extensions/CameraExtensionsInfos;->NORMAL_MODE_CAMERA_EXTENSIONS_INFO:Landroidx/camera/extensions/CameraExtensionsInfo;

    return-object p0
.end method
