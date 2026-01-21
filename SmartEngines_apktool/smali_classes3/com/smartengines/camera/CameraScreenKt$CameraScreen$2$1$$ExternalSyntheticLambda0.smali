.class public final synthetic Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/camera/PreviewScaleType;

.field public final synthetic f$1:Landroidx/camera/view/LifecycleCameraController;


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/camera/PreviewScaleType;Landroidx/camera/view/LifecycleCameraController;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1$$ExternalSyntheticLambda0;->f$0:Lcom/smartengines/camera/PreviewScaleType;

    iput-object p2, p0, Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1$$ExternalSyntheticLambda0;->f$1:Landroidx/camera/view/LifecycleCameraController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1$$ExternalSyntheticLambda0;->f$0:Lcom/smartengines/camera/PreviewScaleType;

    iget-object v1, p0, Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1$$ExternalSyntheticLambda0;->f$1:Landroidx/camera/view/LifecycleCameraController;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, p1}, Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1;->$r8$lambda$3CiWxPJus4EoNxaebzQU1TESQuw(Lcom/smartengines/camera/PreviewScaleType;Landroidx/camera/view/LifecycleCameraController;Landroid/content/Context;)Landroidx/camera/view/PreviewView;

    move-result-object p1

    return-object p1
.end method
