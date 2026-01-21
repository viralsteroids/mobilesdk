.class public final Lcom/smartengines/app/ui/ScreenDataKt;
.super Ljava/lang/Object;
.source "ScreenData.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nScreenData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenData.kt\ncom/smartengines/app/ui/ScreenDataKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,39:1\n77#2:40\n1225#3,3:41\n1228#3,3:46\n149#4:44\n149#4:45\n*S KotlinDebug\n*F\n+ 1 ScreenData.kt\ncom/smartengines/app/ui/ScreenDataKt\n*L\n26#1:40\n28#1:41,3\n28#1:46,3\n30#1:44\n31#1:45\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u001a\r\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\u0008\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\"\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\t"
    }
    d2 = {
        "screenData",
        "Lcom/smartengines/app/ui/ScreenData;",
        "getScreenData",
        "()Lcom/smartengines/app/ui/ScreenData;",
        "setScreenData",
        "(Lcom/smartengines/app/ui/ScreenData;)V",
        "ReadScreenData",
        "",
        "(Landroidx/compose/runtime/Composer;I)V",
        "app_storeRelease"
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
.field public static screenData:Lcom/smartengines/app/ui/ScreenData;


# direct methods
.method public static synthetic $r8$lambda$K3y5a7nt5N_RPsRHrC3PrSLOtzU(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/ScreenDataKt;->ReadScreenData$lambda$1(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final ReadScreenData(Landroidx/compose/runtime/Composer;I)V
    .locals 10

    const v0, -0x1d5b5eaa

    .line 25
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p0

    const-string v0, "C(ReadScreenData)25@771L7,26@822L27,27@883L334:ScreenData.kt#83idza"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p1, :cond_1

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 36
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    const v1, 0x789c5f52

    const-string v2, "CC:CompositionLocal.kt#9igjgp"

    .line 40
    invoke-static {p0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 26
    check-cast v0, Landroid/content/res/Configuration;

    const/4 v1, 0x0

    .line 27
    invoke-static {p0, v1}, Landroidx/compose/material3/adaptive/AndroidWindowAdaptiveInfo_androidKt;->currentWindowAdaptiveInfo(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;->getWindowSizeClass()Landroidx/window/core/layout/WindowSizeClass;

    move-result-object v1

    const v2, -0x196b0d12

    invoke-interface {p0, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "CC(remember):ScreenData.kt#9igjgp"

    invoke-static {p0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 41
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 42
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_2

    .line 29
    new-instance v4, Lcom/smartengines/app/ui/ScreenData;

    .line 30
    iget v2, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    int-to-float v2, v2

    .line 44
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    .line 31
    iget v0, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float v0, v0

    .line 45
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    .line 32
    invoke-virtual {v1}, Landroidx/window/core/layout/WindowSizeClass;->getWindowWidthSizeClass()Landroidx/window/core/layout/WindowWidthSizeClass;

    move-result-object v0

    sget-object v2, Landroidx/window/core/layout/WindowWidthSizeClass;->COMPACT:Landroidx/window/core/layout/WindowWidthSizeClass;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v7, v0, 0x1

    .line 33
    invoke-virtual {v1}, Landroidx/window/core/layout/WindowSizeClass;->getWindowHeightSizeClass()Landroidx/window/core/layout/WindowHeightSizeClass;

    move-result-object v0

    sget-object v1, Landroidx/window/core/layout/WindowHeightSizeClass;->COMPACT:Landroidx/window/core/layout/WindowHeightSizeClass;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v8, v0, 0x1

    const/4 v9, 0x0

    .line 29
    invoke-direct/range {v4 .. v9}, Lcom/smartengines/app/ui/ScreenData;-><init>(FFZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 46
    invoke-interface {p0, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v2, v4

    .line 28
    :cond_2
    check-cast v2, Lcom/smartengines/app/ui/ScreenData;

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v2}, Lcom/smartengines/app/ui/ScreenDataKt;->setScreenData(Lcom/smartengines/app/ui/ScreenData;)V

    .line 36
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_3

    new-instance v0, Lcom/smartengines/app/ui/ScreenDataKt$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/ScreenDataKt$$ExternalSyntheticLambda0;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_3
    return-void
.end method

.method private static final ReadScreenData$lambda$1(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/ScreenDataKt;->ReadScreenData(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final getScreenData()Lcom/smartengines/app/ui/ScreenData;
    .locals 1

    .line 13
    sget-object v0, Lcom/smartengines/app/ui/ScreenDataKt;->screenData:Lcom/smartengines/app/ui/ScreenData;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "screenData"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public static final setScreenData(Lcom/smartengines/app/ui/ScreenData;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    sput-object p0, Lcom/smartengines/app/ui/ScreenDataKt;->screenData:Lcom/smartengines/app/ui/ScreenData;

    return-void
.end method
