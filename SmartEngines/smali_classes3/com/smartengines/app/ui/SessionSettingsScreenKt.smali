.class public final Lcom/smartengines/app/ui/SessionSettingsScreenKt;
.super Ljava/lang/Object;
.source "SessionSettingsScreen.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSessionSettingsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionSettingsScreen.kt\ncom/smartengines/app/ui/SessionSettingsScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,122:1\n1225#2,6:123\n*S KotlinDebug\n*F\n+ 1 SessionSettingsScreen.kt\ncom/smartengines/app/ui/SessionSettingsScreenKt\n*L\n34#1:123,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u00a2\u0006\u0002\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "SessionSettingsScreen",
        "",
        "action",
        "",
        "Lcom/smartengines/engine/SessionSettingsLogger$Action;",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;II)V",
        "SettingsDark_Preview",
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
.method public static synthetic $r8$lambda$a_VTTGmF41hJ45-Oa5OoLUfxG-E(Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/smartengines/app/ui/SessionSettingsScreenKt;->SessionSettingsScreen$lambda$1(Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$gerjc8XhRIHTqVQ4lvOMDG0djg4(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/SessionSettingsScreenKt;->SettingsDark_Preview$lambda$2(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final SessionSettingsScreen(Ljava/util/List;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/SessionSettingsLogger$Action;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v0, p2

    move/from16 v1, p3

    const v2, 0x527f371c

    move-object/from16 v3, p1

    .line 35
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v13

    const-string v2, "C(SessionSettingsScreen)33@1415L46,37@1535L30,39@1603L2478,39@1571L2510:SessionSettingsScreen.kt#83idza"

    invoke-static {v13, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v0, 0x2

    goto :goto_0

    :cond_0
    move v3, v0

    :goto_0
    const/4 v4, 0x1

    if-ne v2, v4, :cond_2

    and-int/lit8 v3, v3, 0xb

    const/4 v5, 0x2

    if-ne v3, v5, :cond_2

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    .line 105
    :cond_1
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v2, p0

    goto/16 :goto_5

    .line 35
    :cond_2
    :goto_1
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v3, v0, 0x1

    if-eqz v3, :cond_4

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    .line 34
    :cond_3
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_3

    :cond_4
    :goto_2
    if-eqz v2, :cond_6

    const v2, 0x4eb8a1f

    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "CC(remember):SessionSettingsScreen.kt#9igjgp"

    invoke-static {v13, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 123
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 124
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_5

    .line 34
    sget-object v2, Lcom/smartengines/app/SessionSettingsLoggerImpl;->INSTANCE:Lcom/smartengines/app/SessionSettingsLoggerImpl;

    invoke-virtual {v2}, Lcom/smartengines/app/SessionSettingsLoggerImpl;->getActions()Ljava/util/List;

    move-result-object v2

    .line 126
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 34
    :cond_5
    check-cast v2, Ljava/util/List;

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_4

    :cond_6
    :goto_3
    move-object/from16 v2, p0

    :goto_4
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 38
    sget-object v3, Lcom/smartengines/app/ui/SessionSettingsScreenKt$SessionSettingsScreen$2;->INSTANCE:Lcom/smartengines/app/ui/SessionSettingsScreenKt$SessionSettingsScreen$2;

    check-cast v3, Lkotlin/jvm/functions/Function0;

    const/4 v5, 0x0

    invoke-static {v5, v3, v13, v5, v4}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 40
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v3, v5, v4, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v5, Lcom/smartengines/app/ui/SessionSettingsScreenKt$SessionSettingsScreen$3;

    invoke-direct {v5, v2}, Lcom/smartengines/app/ui/SessionSettingsScreenKt$SessionSettingsScreen$3;-><init>(Ljava/util/List;)V

    const/16 v6, 0x36

    const v7, -0x43f90549

    invoke-static {v7, v4, v5, v13, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Lkotlin/jvm/functions/Function2;

    const v14, 0xc00006

    const/16 v15, 0x7e

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v3 .. v15}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 105
    :goto_5
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v3

    if-eqz v3, :cond_7

    new-instance v4, Lcom/smartengines/app/ui/SessionSettingsScreenKt$$ExternalSyntheticLambda0;

    invoke-direct {v4, v2, v0, v1}, Lcom/smartengines/app/ui/SessionSettingsScreenKt$$ExternalSyntheticLambda0;-><init>(Ljava/util/List;II)V

    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_7
    return-void
.end method

.method private static final SessionSettingsScreen$lambda$1(Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lcom/smartengines/app/ui/SessionSettingsScreenKt;->SessionSettingsScreen(Ljava/util/List;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final SessionSettingsScreen$onBack()V
    .locals 2

    .line 37
    sget-object v0, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/smartengines/app/AppViewModel;->setShowSessionSettings(Z)V

    return-void
.end method

.method private static final SettingsDark_Preview(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const v0, 0x6a8641b3

    .line 109
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p0

    const-string v0, "C(SettingsDark_Preview)109@4292L478:SessionSettingsScreen.kt#83idza"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p1, :cond_1

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 121
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    .line 110
    :cond_1
    :goto_0
    sget-object v0, Lcom/smartengines/app/ui/ComposableSingletons$SessionSettingsScreenKt;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$SessionSettingsScreenKt;

    invoke-virtual {v0}, Lcom/smartengines/app/ui/ComposableSingletons$SessionSettingsScreenKt;->getLambda-3$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x36

    const/4 v2, 0x1

    invoke-static {v2, v0, p0, v1}, Lcom/smartengines/app/ui/theme/ThemeKt;->SmartEnginesTheme(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 121
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lcom/smartengines/app/ui/SessionSettingsScreenKt$$ExternalSyntheticLambda1;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/SessionSettingsScreenKt$$ExternalSyntheticLambda1;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2
    return-void
.end method

.method private static final SettingsDark_Preview$lambda$2(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/SessionSettingsScreenKt;->SettingsDark_Preview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$SessionSettingsScreen$onBack()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/smartengines/app/ui/SessionSettingsScreenKt;->SessionSettingsScreen$onBack()V

    return-void
.end method
