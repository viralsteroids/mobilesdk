.class public final Lcom/smartengines/app/ui/VisualizationScreenKt;
.super Ljava/lang/Object;
.source "VisualizationScreen.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVisualizationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisualizationScreen.kt\ncom/smartengines/app/ui/VisualizationScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n77#2:117\n1863#3:118\n1864#3:120\n1#4:119\n*S KotlinDebug\n*F\n+ 1 VisualizationScreen.kt\ncom/smartengines/app/ui/VisualizationScreenKt\n*L\n26#1:117\n28#1:118\n28#1:120\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a/\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u0007\u00a2\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "VisualizationScreen",
        "",
        "visualizations",
        "",
        "Lcom/smartengines/visualization/Visualization;",
        "showQuads",
        "",
        "visualizationSettings",
        "Lcom/smartengines/app/settings/VisualizationSettings;",
        "(Ljava/util/Collection;ZLcom/smartengines/app/settings/VisualizationSettings;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic $r8$lambda$5w3wblrsVPHdnV33shx0Tqhk2Qg(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/VisualizationScreenKt;->Preview$lambda$3(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$QvcKOPxzynWO4fR0Ro0Rlcrwu2M(Ljava/util/Collection;ZLcom/smartengines/app/settings/VisualizationSettings;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/smartengines/app/ui/VisualizationScreenKt;->VisualizationScreen$lambda$2(Ljava/util/Collection;ZLcom/smartengines/app/settings/VisualizationSettings;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final Preview(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const v0, 0x70eb1692

    .line 107
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p0

    const-string v0, "C(Preview)107@3670L204:VisualizationScreen.kt#83idza"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p1, :cond_1

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 116
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    .line 108
    :cond_1
    :goto_0
    sget-object v0, Lcom/smartengines/app/ui/ComposableSingletons$VisualizationScreenKt;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$VisualizationScreenKt;

    invoke-virtual {v0}, Lcom/smartengines/app/ui/ComposableSingletons$VisualizationScreenKt;->getLambda-2$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x36

    const/4 v2, 0x1

    invoke-static {v2, v0, p0, v1}, Lcom/smartengines/app/ui/theme/ThemeKt;->SmartEnginesTheme(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 116
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lcom/smartengines/app/ui/VisualizationScreenKt$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/VisualizationScreenKt$$ExternalSyntheticLambda0;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2
    return-void
.end method

.method private static final Preview$lambda$3(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/VisualizationScreenKt;->Preview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final VisualizationScreen(Ljava/util/Collection;ZLcom/smartengines/app/settings/VisualizationSettings;Landroidx/compose/runtime/Composer;II)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lcom/smartengines/visualization/Visualization;",
            ">;Z",
            "Lcom/smartengines/app/settings/VisualizationSettings;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string/jumbo v0, "visualizations"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1394a665

    .line 25
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v6

    const-string v0, "C(VisualizationScreen)P(2)25@1100L7:VisualizationScreen.kt#83idza"

    invoke-static {v6, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_0

    .line 23
    invoke-static {}, Lcom/smartengines/app/AppKt;->getCommonSettingsStore()Lcom/smartengines/app/settings/CommonSettingsStore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/app/settings/CommonSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/app/settings/CommonSettings;

    invoke-virtual {v0}, Lcom/smartengines/app/settings/CommonSettings;->getShowQuads()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_1

    .line 24
    sget-object v2, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v2}, Lcom/smartengines/app/Model;->getVisualizationSettings()Lcom/smartengines/app/settings/VisualizationSettings;

    move-result-object v2

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object v8, p2

    .line 26
    :goto_1
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v2

    check-cast v2, Landroidx/compose/runtime/CompositionLocal;

    const v3, 0x789c5f52

    const-string v4, "CC:CompositionLocal.kt#9igjgp"

    .line 117
    invoke-static {v6, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 26
    move-object v9, v2

    check-cast v9, Landroidx/compose/ui/unit/Density;

    .line 28
    move-object v2, p0

    check-cast v2, Ljava/lang/Iterable;

    .line 118
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/visualization/Visualization;

    .line 32
    instance-of v3, v2, Lcom/smartengines/visualization/Visualization$Quads;

    if-eqz v3, :cond_3

    const v3, -0x5c542e5d

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "34@1336L263"

    invoke-static {v6, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-eqz v0, :cond_2

    .line 36
    check-cast v2, Lcom/smartengines/visualization/Visualization$Quads;

    .line 37
    invoke-virtual {v8}, Lcom/smartengines/app/settings/VisualizationSettings;->getPrimaryLineColor-0d7_KjU()J

    move-result-wide v3

    .line 38
    invoke-virtual {v8}, Lcom/smartengines/app/settings/VisualizationSettings;->getPrimaryLineWidth-D9Ej5fM()F

    move-result v5

    invoke-interface {v9, v5}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v5

    sget v7, Lcom/smartengines/visualization/Visualization$Quads;->$stable:I

    .line 35
    invoke-static/range {v2 .. v7}, Lcom/smartengines/visualization/QuadsViewFadingKt;->QuadsViewFading-iJQMabo(Lcom/smartengines/visualization/Visualization$Quads;JFLandroidx/compose/runtime/Composer;I)V

    .line 32
    :cond_2
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_2

    .line 44
    :cond_3
    instance-of v3, v2, Lcom/smartengines/visualization/Visualization$Instruction;

    if-eqz v3, :cond_4

    const v3, -0x5c4d456d

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "44@1722L212"

    invoke-static {v6, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 46
    check-cast v2, Lcom/smartengines/visualization/Visualization$Instruction;

    .line 47
    sget-object v3, Lcom/smartengines/visualization/IdLivenessInstructions;->INSTANCE:Lcom/smartengines/visualization/IdLivenessInstructions;

    invoke-virtual {v3}, Lcom/smartengines/visualization/IdLivenessInstructions;->getItems()Ljava/util/Map;

    move-result-object v3

    .line 48
    invoke-virtual {v8}, Lcom/smartengines/app/settings/VisualizationSettings;->getInstructionColor-0d7_KjU()J

    move-result-wide v4

    sget v7, Lcom/smartengines/visualization/Visualization$Instruction;->$stable:I

    or-int/lit8 v7, v7, 0x40

    .line 45
    invoke-static/range {v2 .. v7}, Lcom/smartengines/visualization/InstructionViewKt;->InstructionView-XO-JAsU(Lcom/smartengines/visualization/Visualization$Instruction;Ljava/util/Map;JLandroidx/compose/runtime/Composer;I)V

    .line 44
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_2

    .line 53
    :cond_4
    instance-of v3, v2, Lcom/smartengines/visualization/Visualization$Steps;

    if-eqz v3, :cond_5

    const v3, -0x5c48b805

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "53@2027L76"

    invoke-static {v6, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 55
    check-cast v2, Lcom/smartengines/visualization/Visualization$Steps;

    sget v3, Lcom/smartengines/visualization/Visualization$Steps;->$stable:I

    .line 54
    invoke-static {v2, v6, v3}, Lcom/smartengines/visualization/StepsViewKt;->StepsView(Lcom/smartengines/visualization/Visualization$Steps;Landroidx/compose/runtime/Composer;I)V

    .line 53
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_2

    .line 60
    :cond_5
    instance-of v3, v2, Lcom/smartengines/visualization/Visualization$Timer;

    if-eqz v3, :cond_6

    const v3, -0x5c462925

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "60@2196L76"

    invoke-static {v6, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 62
    check-cast v2, Lcom/smartengines/visualization/Visualization$Timer;

    sget v3, Lcom/smartengines/visualization/Visualization$Timer;->$stable:I

    .line 61
    invoke-static {v2, v6, v3}, Lcom/smartengines/visualization/TimerViewKt;->TimerView(Lcom/smartengines/visualization/Visualization$Timer;Landroidx/compose/runtime/Composer;I)V

    .line 60
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_2

    :cond_6
    const v0, -0x4d4d10f7

    .line 29
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 120
    :cond_7
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v6

    if-eqz v6, :cond_8

    move v2, v0

    new-instance v0, Lcom/smartengines/app/ui/VisualizationScreenKt$$ExternalSyntheticLambda1;

    move-object v1, p0

    move v4, p4

    move/from16 v5, p5

    move-object v3, v8

    invoke-direct/range {v0 .. v5}, Lcom/smartengines/app/ui/VisualizationScreenKt$$ExternalSyntheticLambda1;-><init>(Ljava/util/Collection;ZLcom/smartengines/app/settings/VisualizationSettings;II)V

    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_8
    return-void
.end method

.method private static final VisualizationScreen$lambda$2(Ljava/util/Collection;ZLcom/smartengines/app/settings/VisualizationSettings;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    const-string p6, "$visualizations"

    invoke-static {p0, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/VisualizationScreenKt;->VisualizationScreen(Ljava/util/Collection;ZLcom/smartengines/app/settings/VisualizationSettings;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
