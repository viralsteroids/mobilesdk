.class public final Lcom/smartengines/camera/CameraStaffKt;
.super Ljava/lang/Object;
.source "CameraStaff.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCameraStaff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraStaff.kt\ncom/smartengines/camera/CameraStaffKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,125:1\n1225#2,6:126\n1225#2,6:133\n77#3:132\n*S KotlinDebug\n*F\n+ 1 CameraStaff.kt\ncom/smartengines/camera/CameraStaffKt\n*L\n36#1:126,6\n121#1:133,6\n75#1:132\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aC\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0016\u0008\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bH\u0007\u00a2\u0006\u0002\u0010\u000e\u001a<\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0016\u0008\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u001a\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0007\u00a2\u0006\u0002\u0010\u0014\u001a\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017\u001a?\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00032\'\u0010\u0019\u001a#\u0012\u0004\u0012\u00020\u000c\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u001b\u0012\u0008\u0008\u001c\u0012\u0004\u0008\u0008(\u001d\u0012\u0004\u0012\u00020\r0\u001a\u001a\u0015\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0007\u00a2\u0006\u0002\u0010!\u001a\u001d\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0003\u00a2\u0006\u0002\u0010$\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"
    }
    d2 = {
        "TAG",
        "",
        "rememberCameraController",
        "Landroidx/camera/view/LifecycleCameraController;",
        "context",
        "Landroid/content/Context;",
        "cameraSelector",
        "Landroidx/camera/core/CameraSelector;",
        "analyzerExecutor",
        "Ljava/util/concurrent/Executor;",
        "onVideoFrame",
        "Lkotlin/Function1;",
        "Landroidx/camera/core/ImageProxy;",
        "",
        "(Landroid/content/Context;Landroidx/camera/core/CameraSelector;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/camera/view/LifecycleCameraController;",
        "initCamera",
        "StartStopCameraEffect",
        "isCameraEnabled",
        "",
        "cameraController",
        "(ZLandroidx/camera/view/LifecycleCameraController;Landroidx/compose/runtime/Composer;I)V",
        "switchCamera",
        "controller",
        "Landroidx/camera/view/CameraController;",
        "takePhoto",
        "onPhotoTaken",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "isFrontCamera",
        "AutoRequestCameraPermission",
        "permissionState",
        "Lcom/google/accompanist/permissions/PermissionState;",
        "(Lcom/google/accompanist/permissions/PermissionState;Landroidx/compose/runtime/Composer;I)V",
        "CameraPermissionRequestEffectLauncher",
        "isGranted",
        "(ZLcom/google/accompanist/permissions/PermissionState;Landroidx/compose/runtime/Composer;I)V",
        "camera_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "myapp.CameraStaff"


# direct methods
.method public static synthetic $r8$lambda$AntwYDB-O4QH5V1VMXqwUf58SHo(ZLcom/google/accompanist/permissions/PermissionState;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/smartengines/camera/CameraStaffKt;->CameraPermissionRequestEffectLauncher$lambda$7(ZLcom/google/accompanist/permissions/PermissionState;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Ckq12QLJbuEsC1UYoMUgtRqyUPE(ZLandroidx/camera/view/LifecycleCameraController;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/smartengines/camera/CameraStaffKt;->StartStopCameraEffect$lambda$3(ZLandroidx/camera/view/LifecycleCameraController;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$FokEQWlRDnJnKNdIfkr5TM2U1-M(Lcom/google/accompanist/permissions/PermissionState;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/smartengines/camera/CameraStaffKt;->AutoRequestCameraPermission$lambda$4(Lcom/google/accompanist/permissions/PermissionState;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$VM9_4ndGswmPR-8rClh8S5Z4gVg(Lkotlin/jvm/functions/Function1;Landroidx/camera/core/ImageProxy;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/camera/CameraStaffKt;->initCamera$lambda$1(Lkotlin/jvm/functions/Function1;Landroidx/camera/core/ImageProxy;)V

    return-void
.end method

.method public static synthetic $r8$lambda$abD2zclspl5GGNHxZIenhUvB3XM(ZLcom/google/accompanist/permissions/PermissionState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/camera/CameraStaffKt;->CameraPermissionRequestEffectLauncher$lambda$6$lambda$5(ZLcom/google/accompanist/permissions/PermissionState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$gWxS2fGnjBDBB24B0Q1acE9nMIw(ZLandroidx/camera/view/LifecycleCameraController;Landroidx/lifecycle/LifecycleOwner;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/camera/CameraStaffKt;->StartStopCameraEffect$lambda$2(ZLandroidx/camera/view/LifecycleCameraController;Landroidx/lifecycle/LifecycleOwner;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final AutoRequestCameraPermission(Lcom/google/accompanist/permissions/PermissionState;Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "permissionState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x6f2b9d87

    .line 115
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p1

    const-string v0, "C(AutoRequestCameraPermission)115@4090L88:CameraStaff.kt#7douci"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p2, 0xe

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    and-int/lit8 v2, v0, 0xb

    if-ne v2, v1, :cond_3

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    .line 117
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_3

    .line 116
    :cond_3
    :goto_2
    invoke-interface {p0}, Lcom/google/accompanist/permissions/PermissionState;->getStatus()Lcom/google/accompanist/permissions/PermissionStatus;

    move-result-object v1

    invoke-static {v1}, Lcom/google/accompanist/permissions/PermissionsUtilKt;->isGranted(Lcom/google/accompanist/permissions/PermissionStatus;)Z

    move-result v1

    shl-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    invoke-static {v1, p0, p1, v0}, Lcom/smartengines/camera/CameraStaffKt;->CameraPermissionRequestEffectLauncher(ZLcom/google/accompanist/permissions/PermissionState;Landroidx/compose/runtime/Composer;I)V

    .line 117
    :goto_3
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda5;

    invoke-direct {v0, p0, p2}, Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda5;-><init>(Lcom/google/accompanist/permissions/PermissionState;I)V

    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_4
    return-void
.end method

.method private static final AutoRequestCameraPermission$lambda$4(Lcom/google/accompanist/permissions/PermissionState;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    const-string p3, "$permissionState"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcom/smartengines/camera/CameraStaffKt;->AutoRequestCameraPermission(Lcom/google/accompanist/permissions/PermissionState;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final CameraPermissionRequestEffectLauncher(ZLcom/google/accompanist/permissions/PermissionState;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const v0, 0x29d53fa5

    .line 120
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p2

    const-string v0, "C(CameraPermissionRequestEffectLauncher)120@4354L72,120@4343L83:CameraStaff.kt#7douci"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0xe

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v2, p3, 0x70

    const/16 v3, 0x20

    if-nez v2, :cond_3

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit8 v2, v0, 0x5b

    const/16 v4, 0x12

    if-ne v2, v4, :cond_5

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    .line 124
    :cond_4
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_6

    :cond_5
    :goto_3
    const v2, 0x5908d524

    .line 120
    invoke-interface {p2, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "CC(remember):CameraStaff.kt#9igjgp"

    invoke-static {p2, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, v0, 0xe

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v2, v1, :cond_6

    move v1, v4

    goto :goto_4

    :cond_6
    move v1, v5

    :goto_4
    and-int/lit8 v0, v0, 0x70

    if-ne v0, v3, :cond_7

    goto :goto_5

    :cond_7
    move v4, v5

    :goto_5
    or-int v0, v1, v4

    .line 133
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_8

    .line 134
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_9

    .line 121
    :cond_8
    new-instance v1, Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0, p1}, Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda3;-><init>(ZLcom/google/accompanist/permissions/PermissionState;)V

    .line 136
    invoke-interface {p2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 121
    :cond_9
    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v1, p2, v5}, Landroidx/compose/runtime/EffectsKt;->SideEffect(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 124
    :goto_6
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p2

    if-eqz p2, :cond_a

    new-instance v0, Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda4;

    invoke-direct {v0, p0, p1, p3}, Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda4;-><init>(ZLcom/google/accompanist/permissions/PermissionState;I)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_a
    return-void
.end method

.method private static final CameraPermissionRequestEffectLauncher$lambda$6$lambda$5(ZLcom/google/accompanist/permissions/PermissionState;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$permissionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    .line 122
    invoke-interface {p1}, Lcom/google/accompanist/permissions/PermissionState;->launchPermissionRequest()V

    .line 123
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final CameraPermissionRequestEffectLauncher$lambda$7(ZLcom/google/accompanist/permissions/PermissionState;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    const-string p4, "$permissionState"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/smartengines/camera/CameraStaffKt;->CameraPermissionRequestEffectLauncher(ZLcom/google/accompanist/permissions/PermissionState;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final StartStopCameraEffect(ZLandroidx/camera/view/LifecycleCameraController;Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "cameraController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x224ed56e

    .line 74
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p2

    const-string v0, "C(StartStopCameraEffect)P(1)74@2716L7,75@2728L414:CameraStaff.kt#7douci"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 75
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    const v1, 0x789c5f52

    const-string v2, "CC:CompositionLocal.kt#9igjgp"

    .line 132
    invoke-static {p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 75
    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    .line 76
    new-instance v1, Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1, v0}, Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda0;-><init>(ZLandroidx/camera/view/LifecycleCameraController;Landroidx/lifecycle/LifecycleOwner;)V

    const/4 v0, 0x0

    invoke-static {v1, p2, v0}, Landroidx/compose/runtime/EffectsKt;->SideEffect(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p2

    if-eqz p2, :cond_0

    new-instance v0, Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0, p1, p3}, Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda1;-><init>(ZLandroidx/camera/view/LifecycleCameraController;I)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_0
    return-void
.end method

.method private static final StartStopCameraEffect$lambda$2(ZLandroidx/camera/view/LifecycleCameraController;Landroidx/lifecycle/LifecycleOwner;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$cameraController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    const-string v0, "myapp.CameraStaff"

    if-eqz p0, :cond_0

    .line 78
    invoke-virtual {p1}, Landroidx/camera/view/LifecycleCameraController;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object p0

    if-nez p0, :cond_1

    .line 79
    const-string/jumbo p0, "start the camera"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    invoke-virtual {p1, p2}, Landroidx/camera/view/LifecycleCameraController;->bindToLifecycle(Landroidx/lifecycle/LifecycleOwner;)V

    goto :goto_0

    .line 83
    :cond_0
    invoke-virtual {p1}, Landroidx/camera/view/LifecycleCameraController;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 84
    const-string/jumbo p0, "stop the camera"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    invoke-virtual {p1}, Landroidx/camera/view/LifecycleCameraController;->unbind()V

    .line 88
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final StartStopCameraEffect$lambda$3(ZLandroidx/camera/view/LifecycleCameraController;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    const-string p4, "$cameraController"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/smartengines/camera/CameraStaffKt;->StartStopCameraEffect(ZLandroidx/camera/view/LifecycleCameraController;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final initCamera(Landroid/content/Context;Landroidx/camera/core/CameraSelector;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function1;)Landroidx/camera/view/LifecycleCameraController;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/camera/core/CameraSelector;",
            "Ljava/util/concurrent/Executor;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/camera/core/ImageProxy;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/camera/view/LifecycleCameraController;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraSelector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    const-string v0, "myapp.CameraStaff"

    const-string v1, "init camera"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    new-instance v0, Landroidx/camera/view/LifecycleCameraController;

    invoke-direct {v0, p0}, Landroidx/camera/view/LifecycleCameraController;-><init>(Landroid/content/Context;)V

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    .line 50
    new-instance p0, Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda2;

    invoke-direct {p0, p3}, Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p2, p0}, Landroidx/camera/view/LifecycleCameraController;->setImageAnalysisAnalyzer(Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageAnalysis$Analyzer;)V

    :cond_0
    const/4 p0, 0x0

    .line 51
    invoke-virtual {v0, p0}, Landroidx/camera/view/LifecycleCameraController;->setEnabledUseCases(I)V

    .line 53
    invoke-virtual {v0, p1}, Landroidx/camera/view/LifecycleCameraController;->setCameraSelector(Landroidx/camera/core/CameraSelector;)V

    .line 55
    new-instance p0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    invoke-direct {p0}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;-><init>()V

    .line 56
    sget-object p1, Landroidx/camera/core/resolutionselector/ResolutionStrategy;->HIGHEST_AVAILABLE_STRATEGY:Landroidx/camera/core/resolutionselector/ResolutionStrategy;

    invoke-virtual {p0, p1}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->setResolutionStrategy(Landroidx/camera/core/resolutionselector/ResolutionStrategy;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    move-result-object p0

    .line 64
    invoke-virtual {p0}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->build()Landroidx/camera/core/resolutionselector/ResolutionSelector;

    move-result-object p0

    const-string p1, "build(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-virtual {v0, p0}, Landroidx/camera/view/LifecycleCameraController;->setImageAnalysisResolutionSelector(Landroidx/camera/core/resolutionselector/ResolutionSelector;)V

    .line 66
    invoke-virtual {v0, p0}, Landroidx/camera/view/LifecycleCameraController;->setImageCaptureResolutionSelector(Landroidx/camera/core/resolutionselector/ResolutionSelector;)V

    return-object v0
.end method

.method public static synthetic initCamera$default(Landroid/content/Context;Landroidx/camera/core/CameraSelector;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/camera/view/LifecycleCameraController;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 43
    sget-object p1, Landroidx/camera/core/CameraSelector;->DEFAULT_BACK_CAMERA:Landroidx/camera/core/CameraSelector;

    :cond_0
    and-int/lit8 p5, p4, 0x4

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 41
    :cond_2
    invoke-static {p0, p1, p2, p3}, Lcom/smartengines/camera/CameraStaffKt;->initCamera(Landroid/content/Context;Landroidx/camera/core/CameraSelector;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function1;)Landroidx/camera/view/LifecycleCameraController;

    move-result-object p0

    return-object p0
.end method

.method private static final initCamera$lambda$1(Lkotlin/jvm/functions/Function1;Landroidx/camera/core/ImageProxy;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final rememberCameraController(Landroid/content/Context;Landroidx/camera/core/CameraSelector;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/camera/view/LifecycleCameraController;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/camera/core/CameraSelector;",
            "Ljava/util/concurrent/Executor;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/camera/core/ImageProxy;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/camera/view/LifecycleCameraController;"
        }
    .end annotation

    const-string p5, "context"

    invoke-static {p0, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p5, 0x1cca018d

    invoke-interface {p4, p5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p5, "C(rememberCameraController)P(2,1)35@1277L92:CameraStaff.kt#7douci"

    invoke-static {p4, p5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p5, p6, 0x2

    if-eqz p5, :cond_0

    .line 32
    sget-object p1, Landroidx/camera/core/CameraSelector;->DEFAULT_BACK_CAMERA:Landroidx/camera/core/CameraSelector;

    :cond_0
    and-int/lit8 p5, p6, 0x4

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p5, p6, 0x8

    if-eqz p5, :cond_2

    move-object p3, v0

    :cond_2
    const p5, -0x425c41a6

    .line 34
    invoke-interface {p4, p5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p5, "CC(remember):CameraStaff.kt#9igjgp"

    invoke-static {p4, p5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 126
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p5

    .line 127
    sget-object p6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p6

    if-ne p5, p6, :cond_3

    .line 37
    invoke-static {p0, p1, p2, p3}, Lcom/smartengines/camera/CameraStaffKt;->initCamera(Landroid/content/Context;Landroidx/camera/core/CameraSelector;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function1;)Landroidx/camera/view/LifecycleCameraController;

    move-result-object p5

    .line 129
    invoke-interface {p4, p5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 36
    :cond_3
    check-cast p5, Landroidx/camera/view/LifecycleCameraController;

    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p5
.end method

.method public static final switchCamera(Landroidx/camera/view/CameraController;)V
    .locals 2

    const-string v0, "controller"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    invoke-virtual {p0}, Landroidx/camera/view/CameraController;->getCameraSelector()Landroidx/camera/core/CameraSelector;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/CameraSelector;->DEFAULT_BACK_CAMERA:Landroidx/camera/core/CameraSelector;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    sget-object v0, Landroidx/camera/core/CameraSelector;->DEFAULT_FRONT_CAMERA:Landroidx/camera/core/CameraSelector;

    goto :goto_0

    .line 96
    :cond_0
    sget-object v0, Landroidx/camera/core/CameraSelector;->DEFAULT_BACK_CAMERA:Landroidx/camera/core/CameraSelector;

    .line 92
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/camera/view/CameraController;->setCameraSelector(Landroidx/camera/core/CameraSelector;)V

    return-void
.end method

.method public static final takePhoto(Landroid/content/Context;Landroidx/camera/view/LifecycleCameraController;Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/camera/view/LifecycleCameraController;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/camera/core/ImageProxy;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPhotoTaken"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    invoke-static {p0}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object p0

    new-instance v0, Lcom/smartengines/camera/CameraStaffKt$takePhoto$1;

    invoke-direct {v0, p2, p1}, Lcom/smartengines/camera/CameraStaffKt$takePhoto$1;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/camera/view/LifecycleCameraController;)V

    check-cast v0, Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;

    invoke-virtual {p1, p0, v0}, Landroidx/camera/view/LifecycleCameraController;->takePicture(Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;)V

    return-void
.end method
