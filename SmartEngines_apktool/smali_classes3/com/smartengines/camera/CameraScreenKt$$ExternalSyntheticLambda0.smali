.class public final synthetic Lcom/smartengines/camera/CameraScreenKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/google/accompanist/permissions/PermissionState;

.field public final synthetic f$1:Landroidx/camera/view/LifecycleCameraController;

.field public final synthetic f$2:Landroidx/lifecycle/LifecycleOwner;


# direct methods
.method public synthetic constructor <init>(Lcom/google/accompanist/permissions/PermissionState;Landroidx/camera/view/LifecycleCameraController;Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/camera/CameraScreenKt$$ExternalSyntheticLambda0;->f$0:Lcom/google/accompanist/permissions/PermissionState;

    iput-object p2, p0, Lcom/smartengines/camera/CameraScreenKt$$ExternalSyntheticLambda0;->f$1:Landroidx/camera/view/LifecycleCameraController;

    iput-object p3, p0, Lcom/smartengines/camera/CameraScreenKt$$ExternalSyntheticLambda0;->f$2:Landroidx/lifecycle/LifecycleOwner;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/smartengines/camera/CameraScreenKt$$ExternalSyntheticLambda0;->f$0:Lcom/google/accompanist/permissions/PermissionState;

    iget-object v1, p0, Lcom/smartengines/camera/CameraScreenKt$$ExternalSyntheticLambda0;->f$1:Landroidx/camera/view/LifecycleCameraController;

    iget-object v2, p0, Lcom/smartengines/camera/CameraScreenKt$$ExternalSyntheticLambda0;->f$2:Landroidx/lifecycle/LifecycleOwner;

    invoke-static {v0, v1, v2}, Lcom/smartengines/camera/CameraScreenKt;->$r8$lambda$e_T_VpzOpgwr-AHWqpiWGNz70a8(Lcom/google/accompanist/permissions/PermissionState;Landroidx/camera/view/LifecycleCameraController;Landroidx/lifecycle/LifecycleOwner;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
