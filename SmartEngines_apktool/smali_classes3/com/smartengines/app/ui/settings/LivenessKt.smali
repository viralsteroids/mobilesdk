.class public final Lcom/smartengines/app/ui/settings/LivenessKt;
.super Ljava/lang/Object;
.source "Liveness.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLiveness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Liveness.kt\ncom/smartengines/app/ui/settings/LivenessKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,109:1\n77#2:110\n1225#3,6:111\n1225#3,6:117\n81#4:123\n107#4,2:124\n*S KotlinDebug\n*F\n+ 1 Liveness.kt\ncom/smartengines/app/ui/settings/LivenessKt\n*L\n34#1:110\n37#1:111,6\n39#1:117,6\n37#1:123\n37#1:124,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\u001a-\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\u0008\u001a\r\u0010\t\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b\u00b2\u0006\n\u0010\u000c\u001a\u00020\rX\u008a\u008e\u0002"
    }
    d2 = {
        "SettingsLiveness",
        "",
        "onBack",
        "Lkotlin/Function0;",
        "idSettings",
        "Lcom/smartengines/app/settings/IdSettings;",
        "idSettingsWriter",
        "Lcom/smartengines/app/settings/IdSettingsWriter;",
        "(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;Landroidx/compose/runtime/Composer;II)V",
        "Preview_Dark",
        "(Landroidx/compose/runtime/Composer;I)V",
        "app_storeRelease",
        "highlightDelta",
        ""
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
.method public static synthetic $r8$lambda$WQHLteaagIGANO26brjhWew5XzQ(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/smartengines/app/ui/settings/LivenessKt;->SettingsLiveness$lambda$4(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$dWB7LVwi_I6gtGW7je_1ITKgN_4(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/settings/LivenessKt;->Preview_Dark$lambda$5(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final Preview_Dark(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const v0, -0xad00515

    .line 98
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p0

    const-string v0, "C(Preview_Dark)99@3779L229:Liveness.kt#v86m6v"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p1, :cond_1

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 108
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 99
    invoke-static {v0}, Lcom/smartengines/app/ui/AppContentKt;->setPreview(Z)V

    .line 100
    sget-object v1, Lcom/smartengines/app/ui/settings/ComposableSingletons$LivenessKt;->INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$LivenessKt;

    invoke-virtual {v1}, Lcom/smartengines/app/ui/settings/ComposableSingletons$LivenessKt;->getLambda-2$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    const/16 v2, 0x36

    invoke-static {v0, v1, p0, v2}, Lcom/smartengines/app/ui/theme/ThemeKt;->SmartEnginesTheme(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 108
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lcom/smartengines/app/ui/settings/LivenessKt$$ExternalSyntheticLambda1;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/settings/LivenessKt$$ExternalSyntheticLambda1;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2
    return-void
.end method

.method private static final Preview_Dark$lambda$5(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/settings/LivenessKt;->Preview_Dark(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final SettingsLiveness(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;Landroidx/compose/runtime/Composer;II)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/smartengines/app/settings/IdSettings;",
            "Lcom/smartengines/app/settings/IdSettingsWriter;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "onBack"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "idSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x4ee24fbf

    move-object/from16 v3, p3

    .line 33
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v0

    const-string v3, "C(SettingsLiveness)P(2)33@1337L7,36@1436L34,38@1507L106,38@1476L137,45@1684L1859,45@1619L1924:Liveness.kt#v86m6v"

    invoke-static {v0, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v3, p5, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-eqz v3, :cond_0

    or-int/lit8 v3, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p4, 0xe

    if-nez v3, :cond_2

    invoke-interface {v0, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v5

    goto :goto_0

    :cond_1
    move v3, v4

    :goto_0
    or-int v3, p4, v3

    goto :goto_1

    :cond_2
    move/from16 v3, p4

    :goto_1
    and-int/lit8 v6, p5, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, p4, 0x70

    if-nez v6, :cond_5

    invoke-interface {v0, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v3, v3, 0x80

    :cond_6
    if-ne v6, v5, :cond_8

    and-int/lit16 v7, v3, 0x2db

    const/16 v8, 0x92

    if-ne v7, v8, :cond_8

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_4

    .line 92
    :cond_7
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v3, p2

    goto/16 :goto_8

    .line 33
    :cond_8
    :goto_4
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v7, p4, 0x1

    if-eqz v7, :cond_a

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_5

    .line 32
    :cond_9
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    if-eqz v6, :cond_b

    and-int/lit16 v3, v3, -0x381

    goto :goto_6

    :cond_a
    :goto_5
    if-eqz v6, :cond_b

    invoke-static {}, Lcom/smartengines/app/AppKt;->getIdSettingsStore()Lcom/smartengines/app/settings/IdSettingsStore;

    move-result-object v6

    check-cast v6, Lcom/smartengines/app/settings/IdSettingsWriter;

    and-int/lit16 v3, v3, -0x381

    goto :goto_7

    :cond_b
    :goto_6
    move-object v6, p2

    :goto_7
    move v8, v3

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 34
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v3

    check-cast v3, Landroidx/compose/runtime/CompositionLocal;

    const v7, 0x789c5f52

    const-string v9, "CC:CompositionLocal.kt#9igjgp"

    .line 110
    invoke-static {v0, v7, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 34
    check-cast v3, Landroid/content/Context;

    .line 36
    invoke-virtual {p1}, Lcom/smartengines/app/settings/IdSettings;->getInstrCount()I

    move-result v7

    div-int/2addr v7, v5

    const/4 v5, 0x0

    invoke-static {v7, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v7

    const v9, -0x647985c1

    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v9, "CC(remember):Liveness.kt#9igjgp"

    invoke-static {v0, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 111
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    .line 112
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    const/4 v12, 0x0

    if-ne v10, v11, :cond_c

    .line 37
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v5, v12, v4, v12}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v10

    .line 114
    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 37
    :cond_c
    check-cast v10, Landroidx/compose/runtime/MutableState;

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 39
    invoke-static {v10}, Lcom/smartengines/app/ui/settings/LivenessKt;->SettingsLiveness$lambda$1(Landroidx/compose/runtime/MutableState;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const v5, -0x64797c99

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v0, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 117
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .line 118
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v5, v9, :cond_d

    .line 39
    new-instance v5, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$1$1;

    invoke-direct {v5, v10, v12}, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$1$1;-><init>(Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 120
    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 39
    :cond_d
    check-cast v5, Lkotlin/jvm/functions/Function2;

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v9, 0x40

    invoke-static {v4, v5, v0, v9}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 46
    sget v4, Lcom/smartengines/app/R$string;->s_liveness:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    const-string v4, "getString(...)"

    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2;

    move-object v4, p1

    move-object v5, v6

    move v6, v7

    move-object v7, v10

    invoke-direct/range {v2 .. v7}, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2;-><init>(Landroid/content/Context;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;ILandroidx/compose/runtime/MutableState;)V

    const/16 v3, 0x36

    const v4, 0x5a726119

    const/4 v6, 0x1

    invoke-static {v4, v6, v2, v0, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function3;

    shl-int/lit8 v3, v8, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/lit16 v3, v3, 0x180

    invoke-static {v9, p0, v2, v0, v3}, Lcom/smartengines/app/ui/settings/FragmentsKt;->SettingsScaffold(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    move-object v3, v5

    .line 92
    :goto_8
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lcom/smartengines/app/ui/settings/LivenessKt$$ExternalSyntheticLambda0;

    move-object v1, p0

    move-object v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/smartengines/app/ui/settings/LivenessKt$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;II)V

    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_e
    return-void
.end method

.method private static final SettingsLiveness$lambda$1(Landroidx/compose/runtime/MutableState;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 37
    check-cast p0, Landroidx/compose/runtime/State;

    .line 123
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final SettingsLiveness$lambda$2(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    .line 37
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 124
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final SettingsLiveness$lambda$4(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    const-string p6, "$onBack"

    invoke-static {p0, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "$idSettings"

    invoke-static {p1, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/settings/LivenessKt;->SettingsLiveness(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$SettingsLiveness$lambda$1(Landroidx/compose/runtime/MutableState;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/smartengines/app/ui/settings/LivenessKt;->SettingsLiveness$lambda$1(Landroidx/compose/runtime/MutableState;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$SettingsLiveness$lambda$2(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/smartengines/app/ui/settings/LivenessKt;->SettingsLiveness$lambda$2(Landroidx/compose/runtime/MutableState;Z)V

    return-void
.end method
