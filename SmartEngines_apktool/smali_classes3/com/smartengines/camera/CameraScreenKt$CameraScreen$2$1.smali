.class final Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1;
.super Ljava/lang/Object;
.source "CameraScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/camera/CameraScreenKt;->CameraScreen(Landroidx/camera/view/LifecycleCameraController;Lcom/smartengines/camera/PreviewScaleType;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $cameraController:Landroidx/camera/view/LifecycleCameraController;

.field final synthetic $previewScaleType:Lcom/smartengines/camera/PreviewScaleType;


# direct methods
.method public static synthetic $r8$lambda$3CiWxPJus4EoNxaebzQU1TESQuw(Lcom/smartengines/camera/PreviewScaleType;Landroidx/camera/view/LifecycleCameraController;Landroid/content/Context;)Landroidx/camera/view/PreviewView;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1;->invoke$lambda$2(Lcom/smartengines/camera/PreviewScaleType;Landroidx/camera/view/LifecycleCameraController;Landroid/content/Context;)Landroidx/camera/view/PreviewView;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/smartengines/camera/PreviewScaleType;Landroidx/camera/view/LifecycleCameraController;)V
    .locals 0

    iput-object p1, p0, Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1;->$previewScaleType:Lcom/smartengines/camera/PreviewScaleType;

    iput-object p2, p0, Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1;->$cameraController:Landroidx/camera/view/LifecycleCameraController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$2(Lcom/smartengines/camera/PreviewScaleType;Landroidx/camera/view/LifecycleCameraController;Landroid/content/Context;)Landroidx/camera/view/PreviewView;
    .locals 2

    const-string v0, "$cameraController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    new-instance v0, Landroidx/camera/view/PreviewView;

    invoke-direct {v0, p2}, Landroidx/camera/view/PreviewView;-><init>(Landroid/content/Context;)V

    .line 92
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {p2, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    check-cast p2, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, p2}, Landroidx/camera/view/PreviewView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 p2, -0x1000000

    .line 96
    invoke-virtual {v0, p2}, Landroidx/camera/view/PreviewView;->setBackgroundColor(I)V

    .line 97
    sget-object p2, Landroidx/camera/view/PreviewView$ImplementationMode;->COMPATIBLE:Landroidx/camera/view/PreviewView$ImplementationMode;

    invoke-virtual {v0, p2}, Landroidx/camera/view/PreviewView;->setImplementationMode(Landroidx/camera/view/PreviewView$ImplementationMode;)V

    .line 98
    sget-object p2, Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/smartengines/camera/PreviewScaleType;->ordinal()I

    move-result p0

    aget p0, p2, p0

    const/4 p2, 0x1

    if-eq p0, p2, :cond_1

    const/4 p2, 0x2

    if-ne p0, p2, :cond_0

    .line 100
    sget-object p0, Landroidx/camera/view/PreviewView$ScaleType;->FILL_CENTER:Landroidx/camera/view/PreviewView$ScaleType;

    goto :goto_0

    .line 98
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 99
    :cond_1
    sget-object p0, Landroidx/camera/view/PreviewView$ScaleType;->FIT_CENTER:Landroidx/camera/view/PreviewView$ScaleType;

    .line 98
    :goto_0
    invoke-virtual {v0, p0}, Landroidx/camera/view/PreviewView;->setScaleType(Landroidx/camera/view/PreviewView$ScaleType;)V

    .line 103
    check-cast p1, Landroidx/camera/view/CameraController;

    invoke-virtual {v0, p1}, Landroidx/camera/view/PreviewView;->setController(Landroidx/camera/view/CameraController;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 86
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v0, "C87@3242L1028:CameraScreen.kt#7douci"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 88
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 106
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 88
    :cond_1
    :goto_0
    sget-object p2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast p2, Landroidx/compose/ui/Modifier;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 89
    invoke-static {p2, v2, v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 88
    iget-object p2, p0, Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1;->$previewScaleType:Lcom/smartengines/camera/PreviewScaleType;

    iget-object v0, p0, Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1;->$cameraController:Landroidx/camera/view/LifecycleCameraController;

    new-instance v3, Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1$$ExternalSyntheticLambda0;

    invoke-direct {v3, p2, v0}, Lcom/smartengines/camera/CameraScreenKt$CameraScreen$2$1$$ExternalSyntheticLambda0;-><init>(Lcom/smartengines/camera/PreviewScaleType;Landroidx/camera/view/LifecycleCameraController;)V

    const/16 v7, 0x30

    const/4 v8, 0x4

    const/4 v5, 0x0

    move-object v6, p1

    invoke-static/range {v3 .. v8}, Landroidx/compose/ui/viewinterop/AndroidView_androidKt;->AndroidView(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
