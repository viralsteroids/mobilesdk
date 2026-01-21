.class public final Lcom/smartengines/app/ui/settings/SettingsScreenKt;
.super Ljava/lang/Object;
.source "SettingsScreen.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSettingsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsScreen.kt\ncom/smartengines/app/ui/settings/SettingsScreenKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,162:1\n81#2:163\n81#2:164\n81#2:165\n81#2:166\n81#2:167\n*S KotlinDebug\n*F\n+ 1 SettingsScreen.kt\ncom/smartengines/app/ui/settings/SettingsScreenKt\n*L\n51#1:163\n52#1:164\n53#1:165\n54#1:166\n55#1:167\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u00a2\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0008\u00b2\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002\u00b2\u0006\n\u0010\u000b\u001a\u00020\u000cX\u008a\u0084\u0002\u00b2\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002\u00b2\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"
    }
    d2 = {
        "SettingsScreen",
        "",
        "onDismiss",
        "Lkotlin/Function0;",
        "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V",
        "Preview_Dark",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Preview_Light",
        "app_storeRelease",
        "commonSettings",
        "Lcom/smartengines/app/settings/CommonSettings;",
        "codeSettings",
        "Lcom/smartengines/app/settings/CodeSettings;",
        "idSettings",
        "Lcom/smartengines/app/settings/IdSettings;",
        "docSettings",
        "Lcom/smartengines/app/settings/DocSettings;",
        "textSettings",
        "Lcom/smartengines/app/settings/TextSettings;"
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
.method public static synthetic $r8$lambda$IAAidY0U0c3bjxSJ0J6_MtPoL8U(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->Preview_Light$lambda$7(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$XQhs70CIG88_hIFCK4ibe3Jo9FI(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->Preview_Dark$lambda$6(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$aBaaGJeI4fd7HuYVqfeK9A56jAE(Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->SettingsScreen$lambda$5(Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final Preview_Dark(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const v0, -0x35149701    # -7713919.5f

    .line 149
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p0

    const-string v0, "C(Preview_Dark)149@5038L82:SettingsScreen.kt#v86m6v"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p1, :cond_1

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 153
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    .line 150
    :cond_1
    :goto_0
    sget-object v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$SettingsScreenKt;->INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$SettingsScreenKt;

    invoke-virtual {v0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$SettingsScreenKt;->getLambda-1$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x36

    const/4 v2, 0x1

    invoke-static {v2, v0, p0, v1}, Lcom/smartengines/app/ui/theme/ThemeKt;->SmartEnginesTheme(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 153
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$$ExternalSyntheticLambda0;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2
    return-void
.end method

.method private static final Preview_Dark$lambda$6(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->Preview_Dark(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final Preview_Light(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const v0, -0x35cfba0b

    .line 156
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p0

    const-string v0, "C(Preview_Light)156@5222L83:SettingsScreen.kt#v86m6v"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p1, :cond_1

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 160
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    .line 157
    :cond_1
    :goto_0
    sget-object v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$SettingsScreenKt;->INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$SettingsScreenKt;

    invoke-virtual {v0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$SettingsScreenKt;->getLambda-2$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x36

    const/4 v2, 0x0

    invoke-static {v2, v0, p0, v1}, Lcom/smartengines/app/ui/theme/ThemeKt;->SmartEnginesTheme(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 160
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$$ExternalSyntheticLambda1;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$$ExternalSyntheticLambda1;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2
    return-void
.end method

.method private static final Preview_Light$lambda$7(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->Preview_Light(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final SettingsScreen(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p0

    move/from16 v8, p2

    const-string v0, "onDismiss"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3ef5a0bf

    move-object/from16 v1, p1

    .line 46
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    const-string v0, "C(SettingsScreen)47@1887L33,50@1986L16,51@2053L16,52@2118L16,53@2184L16,54@2251L16,59@2409L23,61@2482L2353,61@2438L2397:SettingsScreen.kt#v86m6v"

    invoke-static {v9, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, v8, 0xe

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v3, v0, 0xb

    if-ne v3, v1, :cond_3

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    .line 144
    :cond_2
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v19, v9

    goto/16 :goto_3

    :cond_3
    :goto_2
    shl-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    const/4 v1, 0x0

    const/4 v10, 0x1

    .line 48
    invoke-static {v1, v2, v9, v0, v10}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 51
    invoke-static {}, Lcom/smartengines/app/AppKt;->getCommonSettingsStore()Lcom/smartengines/app/settings/CommonSettingsStore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/app/settings/CommonSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    const/4 v3, 0x0

    const/16 v4, 0x8

    invoke-static {v0, v3, v9, v4, v10}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v0

    .line 52
    invoke-static {}, Lcom/smartengines/app/AppKt;->getCodeSettingsStore()Lcom/smartengines/app/settings/CodeSettingsStore;

    move-result-object v5

    invoke-virtual {v5}, Lcom/smartengines/app/settings/CodeSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v5

    invoke-static {v5, v3, v9, v4, v10}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v5

    .line 53
    invoke-static {}, Lcom/smartengines/app/AppKt;->getIdSettingsStore()Lcom/smartengines/app/settings/IdSettingsStore;

    move-result-object v6

    invoke-virtual {v6}, Lcom/smartengines/app/settings/IdSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v6

    invoke-static {v6, v3, v9, v4, v10}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v6

    .line 54
    invoke-static {}, Lcom/smartengines/app/AppKt;->getDocSettingsStore()Lcom/smartengines/app/settings/DocSettingsStore;

    move-result-object v7

    invoke-virtual {v7}, Lcom/smartengines/app/settings/DocSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v7

    invoke-static {v7, v3, v9, v4, v10}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v7

    .line 55
    invoke-static {}, Lcom/smartengines/app/AppKt;->getTextSettingsStore()Lcom/smartengines/app/settings/TextSettingsStore;

    move-result-object v11

    invoke-virtual {v11}, Lcom/smartengines/app/settings/TextSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v11

    invoke-static {v11, v3, v9, v4, v10}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v11

    new-array v1, v1, [Landroidx/navigation/Navigator;

    .line 60
    invoke-static {v1, v9, v4}, Landroidx/navigation/compose/NavHostControllerKt;->rememberNavController([Landroidx/navigation/Navigator;Landroidx/compose/runtime/Composer;I)Landroidx/navigation/NavHostController;

    move-result-object v1

    .line 62
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v4, Landroidx/compose/ui/Modifier;

    const/4 v12, 0x0

    invoke-static {v4, v12, v10, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    move-object v3, v0

    new-instance v0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v11

    invoke-direct/range {v0 .. v7}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;-><init>(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    const/16 v1, 0x36

    const v3, -0x57829ba6

    invoke-static {v3, v10, v0, v9, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lkotlin/jvm/functions/Function2;

    const v20, 0xc00006

    const/16 v21, 0x7e

    const/4 v10, 0x0

    move-object/from16 v19, v9

    move-object v9, v12

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v9 .. v21}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 144
    :goto_3
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v1, Lcom/smartengines/app/ui/settings/SettingsScreenKt$$ExternalSyntheticLambda2;

    invoke-direct {v1, v2, v8}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$$ExternalSyntheticLambda2;-><init>(Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_4
    return-void
.end method

.method private static final SettingsScreen$lambda$0(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CommonSettings;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/CommonSettings;",
            ">;)",
            "Lcom/smartengines/app/settings/CommonSettings;"
        }
    .end annotation

    .line 163
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/smartengines/app/settings/CommonSettings;

    return-object p0
.end method

.method private static final SettingsScreen$lambda$1(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CodeSettings;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/CodeSettings;",
            ">;)",
            "Lcom/smartengines/app/settings/CodeSettings;"
        }
    .end annotation

    .line 164
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/smartengines/app/settings/CodeSettings;

    return-object p0
.end method

.method private static final SettingsScreen$lambda$2(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/IdSettings;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/IdSettings;",
            ">;)",
            "Lcom/smartengines/app/settings/IdSettings;"
        }
    .end annotation

    .line 165
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/smartengines/app/settings/IdSettings;

    return-object p0
.end method

.method private static final SettingsScreen$lambda$3(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/DocSettings;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/DocSettings;",
            ">;)",
            "Lcom/smartengines/app/settings/DocSettings;"
        }
    .end annotation

    .line 166
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/smartengines/app/settings/DocSettings;

    return-object p0
.end method

.method private static final SettingsScreen$lambda$4(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/TextSettings;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/TextSettings;",
            ">;)",
            "Lcom/smartengines/app/settings/TextSettings;"
        }
    .end annotation

    .line 167
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/smartengines/app/settings/TextSettings;

    return-object p0
.end method

.method private static final SettingsScreen$lambda$5(Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    const-string p3, "$onDismiss"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->SettingsScreen(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$SettingsScreen$lambda$0(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CommonSettings;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->SettingsScreen$lambda$0(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CommonSettings;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$SettingsScreen$lambda$1(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CodeSettings;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->SettingsScreen$lambda$1(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CodeSettings;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$SettingsScreen$lambda$2(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/IdSettings;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->SettingsScreen$lambda$2(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/IdSettings;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$SettingsScreen$lambda$3(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/DocSettings;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->SettingsScreen$lambda$3(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/DocSettings;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$SettingsScreen$lambda$4(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/TextSettings;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->SettingsScreen$lambda$4(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/TextSettings;

    move-result-object p0

    return-object p0
.end method
