.class public final Lcom/smartengines/app/ui/results/LivenessResultScreenKt;
.super Ljava/lang/Object;
.source "LivenessResultScreen.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\u0008\u001a\r\u0010\t\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "LivenessResultScreen",
        "",
        "selectedTreeLeaf",
        "Lcom/smartengines/app/targets/TreeLeaf;",
        "lvResultData",
        "Lcom/smartengines/engine/id/LvResultData;",
        "settings",
        "Lcom/smartengines/app/settings/CommonSettings;",
        "(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/LvResultData;Lcom/smartengines/app/settings/CommonSettings;Landroidx/compose/runtime/Composer;II)V",
        "Preview",
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


# direct methods
.method public static synthetic $r8$lambda$1LpDX8PQvWJ6sbSRjoWseCT9FYk(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/results/LivenessResultScreenKt;->Preview$lambda$1(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$haURFR8KbMVJr5YRbD_tcqtCCeM(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/LvResultData;Lcom/smartengines/app/settings/CommonSettings;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/smartengines/app/ui/results/LivenessResultScreenKt;->LivenessResultScreen$lambda$0(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/LvResultData;Lcom/smartengines/app/settings/CommonSettings;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final LivenessResultScreen(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/LvResultData;Lcom/smartengines/app/settings/CommonSettings;Landroidx/compose/runtime/Composer;II)V
    .locals 6

    const-string v0, "selectedTreeLeaf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lvResultData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x6c15b51

    .line 36
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p3

    const-string v0, "C(LivenessResultScreen)P(1)39@1486L543,39@1478L551:LivenessResultScreen.kt#4ipo3i"

    invoke-static {p3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_0

    .line 35
    invoke-static {}, Lcom/smartengines/app/AppKt;->getCommonSettingsStore()Lcom/smartengines/app/settings/CommonSettingsStore;

    move-result-object p2

    invoke-virtual {p2}, Lcom/smartengines/app/settings/CommonSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/smartengines/app/settings/CommonSettings;

    :cond_0
    move-object v3, p2

    .line 40
    new-instance p2, Lcom/smartengines/app/ui/results/LivenessResultScreenKt$LivenessResultScreen$1;

    invoke-direct {p2, p0, v3, p1}, Lcom/smartengines/app/ui/results/LivenessResultScreenKt$LivenessResultScreen$1;-><init>(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/engine/id/LvResultData;)V

    const/16 v0, 0x36

    const v1, -0x4df2d688

    const/4 v2, 0x1

    invoke-static {v1, v2, p2, p3, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p2

    check-cast p2, Lkotlin/jvm/functions/Function3;

    const/4 v0, 0x6

    invoke-static {p2, p3, v0}, Lcom/smartengines/app/ui/BodyBoxKt;->BodyBox(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance v0, Lcom/smartengines/app/ui/results/LivenessResultScreenKt$$ExternalSyntheticLambda0;

    move-object v1, p0

    move-object v2, p1

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/smartengines/app/ui/results/LivenessResultScreenKt$$ExternalSyntheticLambda0;-><init>(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/LvResultData;Lcom/smartengines/app/settings/CommonSettings;II)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_1
    return-void
.end method

.method private static final LivenessResultScreen$lambda$0(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/LvResultData;Lcom/smartengines/app/settings/CommonSettings;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    const-string p6, "$selectedTreeLeaf"

    invoke-static {p0, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "$lvResultData"

    invoke-static {p1, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/results/LivenessResultScreenKt;->LivenessResultScreen(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/LvResultData;Lcom/smartengines/app/settings/CommonSettings;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final Preview(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const v0, -0x2883a308

    .line 64
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p0

    const-string v0, "C(Preview)64@2238L16,65@2259L225:LivenessResultScreen.kt#4ipo3i"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p1, :cond_1

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 75
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 65
    invoke-static {p0, v0}, Lcom/smartengines/app/ui/ScreenDataKt;->ReadScreenData(Landroidx/compose/runtime/Composer;I)V

    .line 66
    sget-object v0, Lcom/smartengines/app/ui/results/ComposableSingletons$LivenessResultScreenKt;->INSTANCE:Lcom/smartengines/app/ui/results/ComposableSingletons$LivenessResultScreenKt;

    invoke-virtual {v0}, Lcom/smartengines/app/ui/results/ComposableSingletons$LivenessResultScreenKt;->getLambda-2$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x36

    const/4 v2, 0x1

    invoke-static {v2, v0, p0, v1}, Lcom/smartengines/app/ui/theme/ThemeKt;->SmartEnginesTheme(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 75
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lcom/smartengines/app/ui/results/LivenessResultScreenKt$$ExternalSyntheticLambda1;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/results/LivenessResultScreenKt$$ExternalSyntheticLambda1;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2
    return-void
.end method

.method private static final Preview$lambda$1(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/results/LivenessResultScreenKt;->Preview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
