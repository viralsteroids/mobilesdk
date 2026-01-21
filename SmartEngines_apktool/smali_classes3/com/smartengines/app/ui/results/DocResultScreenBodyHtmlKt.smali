.class public final Lcom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt;
.super Ljava/lang/Object;
.source "DocResultScreenBodyHtml.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDocResultScreenBodyHtml.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocResultScreenBodyHtml.kt\ncom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,63:1\n77#2:64\n1225#3,6:65\n1225#3,6:107\n71#4:71\n68#4,6:72\n74#4:106\n78#4:116\n79#5,6:78\n86#5,4:93\n90#5,2:103\n94#5:115\n368#6,9:84\n377#6:105\n378#6,2:113\n4034#7,6:97\n*S KotlinDebug\n*F\n+ 1 DocResultScreenBodyHtml.kt\ncom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt\n*L\n25#1:64\n26#1:65,6\n44#1:107,6\n32#1:71\n32#1:72,6\n32#1:106\n32#1:116\n32#1:78,6\n32#1:93,4\n32#1:103,2\n32#1:115\n32#1:84,9\n32#1:105\n32#1:113,2\n32#1:97,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "DocResultScreenBodyHtml",
        "",
        "resultData",
        "Lcom/smartengines/engine/doc/DocResultData;",
        "docSettings",
        "Lcom/smartengines/app/settings/DocSettings;",
        "(Lcom/smartengines/engine/doc/DocResultData;Lcom/smartengines/app/settings/DocSettings;Landroidx/compose/runtime/Composer;I)V",
        "DataResultScreen_Preview",
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
.method public static synthetic $r8$lambda$HOCWbZSjQ6UK2j4URyQVMLARXJA(Landroid/content/Context;)Landroid/webkit/WebView;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt;->DocResultScreenBodyHtml$lambda$5$lambda$2(Landroid/content/Context;)Landroid/webkit/WebView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Jxr1FbiSp_mi5vzRzHhIGU46p1I(Lcom/smartengines/engine/doc/DocResultData;Lcom/smartengines/app/settings/DocSettings;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt;->DocResultScreenBodyHtml$lambda$6(Lcom/smartengines/engine/doc/DocResultData;Lcom/smartengines/app/settings/DocSettings;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$j9CzhzsFvjOgDiBiDPqe7Yvto4g(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt;->DataResultScreen_Preview$lambda$7(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$nVUpfG-7rZLM9klx6Lcn5ianVQY(Ljava/lang/String;Landroid/webkit/WebView;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt;->DocResultScreenBodyHtml$lambda$5$lambda$4$lambda$3(Ljava/lang/String;Landroid/webkit/WebView;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final DataResultScreen_Preview(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const v0, -0x621d8f54

    .line 55
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p0

    const-string v0, "C(DataResultScreen_Preview)56@2037L139:DocResultScreenBodyHtml.kt#4ipo3i"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p1, :cond_1

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 62
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 56
    invoke-static {v0}, Lcom/smartengines/app/ui/AppContentKt;->setPreview(Z)V

    .line 57
    sget-object v1, Lcom/smartengines/app/ui/results/ComposableSingletons$DocResultScreenBodyHtmlKt;->INSTANCE:Lcom/smartengines/app/ui/results/ComposableSingletons$DocResultScreenBodyHtmlKt;

    invoke-virtual {v1}, Lcom/smartengines/app/ui/results/ComposableSingletons$DocResultScreenBodyHtmlKt;->getLambda-2$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    const/16 v2, 0x36

    invoke-static {v0, v1, p0, v2}, Lcom/smartengines/app/ui/theme/ThemeKt;->SmartEnginesTheme(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 62
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lcom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt$$ExternalSyntheticLambda3;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt$$ExternalSyntheticLambda3;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2
    return-void
.end method

.method private static final DataResultScreen_Preview$lambda$7(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt;->DataResultScreen_Preview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final DocResultScreenBodyHtml(Lcom/smartengines/engine/doc/DocResultData;Lcom/smartengines/app/settings/DocSettings;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v0, "resultData"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "docSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5eb07abc

    .line 24
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    const-string p2, "C(DocResultScreenBodyHtml)P(1)24@892L7,25@915L288,31@1209L579:DocResultScreenBodyHtml.kt#4ipo3i"

    invoke-static {v4, p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 25
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object p2

    check-cast p2, Landroidx/compose/runtime/CompositionLocal;

    const v0, 0x789c5f52

    const-string v1, "CC:CompositionLocal.kt#9igjgp"

    .line 64
    invoke-static {v4, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, p2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 25
    check-cast p2, Landroid/content/Context;

    const v0, 0x78c26882

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "CC(remember):DocResultScreenBodyHtml.kt#9igjgp"

    invoke-static {v4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 65
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 66
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_0

    .line 28
    invoke-virtual {p1}, Lcom/smartengines/app/settings/DocSettings;->getShowImages()Z

    move-result v1

    .line 29
    invoke-virtual {p1}, Lcom/smartengines/app/settings/DocSettings;->getShowTables()Z

    move-result v2

    .line 30
    invoke-virtual {p1}, Lcom/smartengines/app/settings/DocSettings;->getShowAttrib()Z

    move-result v3

    .line 26
    invoke-static {p0, p2, v1, v2, v3}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtml(Lcom/smartengines/engine/doc/DocResultData;Landroid/content/Context;ZZZ)Ljava/lang/String;

    move-result-object v1

    .line 68
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 26
    :cond_0
    check-cast v1, Ljava/lang/String;

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 32
    sget-object p2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast p2, Landroidx/compose/ui/Modifier;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static {p2, v5, v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    const v2, 0x2bb5b5d7

    const-string v3, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"

    .line 71
    invoke-static {v4, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 72
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v2

    const/4 v3, 0x0

    .line 76
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v2

    const v5, -0x4ee9b9da

    .line 77
    const-string v6, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    .line 78
    invoke-static {v4, v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 79
    invoke-static {v4, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v3

    .line 80
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v5

    .line 81
    invoke-static {v4, p2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    .line 83
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    const v7, -0x2942ffcf

    .line 82
    const-string v8, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    .line 84
    invoke-static {v4, v7, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 85
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v7

    instance-of v7, v7, Landroidx/compose/runtime/Applier;

    if-nez v7, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 86
    :cond_1
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 87
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 88
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    .line 90
    :cond_2
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 92
    :goto_0
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v6

    .line 93
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v2, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 94
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v5, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 96
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 98
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v5

    if-nez v5, :cond_3

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 99
    :cond_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 100
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 103
    :cond_4
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, p2, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const p2, -0x7ff519f7    # -1.000876E-39f

    .line 105
    const-string v2, "C73@3429L9:Box.kt#2w3rfo"

    .line 106
    invoke-static {v4, p2, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object p2, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    check-cast p2, Landroidx/compose/foundation/layout/BoxScope;

    const p2, -0x1a1dfd6b

    const-string v2, "C43@1695L86,32@1257L525:DocResultScreenBodyHtml.kt#4ipo3i"

    .line 33
    invoke-static {v4, p2, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    move-object p2, v1

    new-instance v1, Lcom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt$$ExternalSyntheticLambda0;-><init>()V

    const v2, 0x76a9837

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 107
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 108
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_5

    .line 44
    new-instance v0, Lcom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt$$ExternalSyntheticLambda1;

    invoke-direct {v0, p2}, Lcom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt$$ExternalSyntheticLambda1;-><init>(Ljava/lang/String;)V

    .line 110
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 44
    :cond_5
    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v5, 0x186

    const/4 v6, 0x2

    const/4 v2, 0x0

    .line 33
    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/viewinterop/AndroidView_androidKt;->AndroidView(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 106
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 113
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 84
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 78
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 71
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 116
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lcom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt$$ExternalSyntheticLambda2;

    invoke-direct {v0, p0, p1, p3}, Lcom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt$$ExternalSyntheticLambda2;-><init>(Lcom/smartengines/engine/doc/DocResultData;Lcom/smartengines/app/settings/DocSettings;I)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_6
    return-void
.end method

.method private static final DocResultScreenBodyHtml$lambda$5$lambda$2(Landroid/content/Context;)Landroid/webkit/WebView;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    new-instance v0, Landroid/webkit/WebView;

    invoke-direct {v0, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 35
    new-instance p0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {p0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p0}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 39
    invoke-static {}, Lcom/smartengines/app/ui/AppContentKt;->isPreview()Z

    move-result p0

    if-nez p0, :cond_0

    .line 40
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 41
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    :cond_0
    return-object v0
.end method

.method private static final DocResultScreenBodyHtml$lambda$5$lambda$4$lambda$3(Ljava/lang/String;Landroid/webkit/WebView;)Lkotlin/Unit;
    .locals 7

    const-string v0, "$html"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    const-string/jumbo v5, "utf-8"

    const/4 v6, 0x0

    const/4 v2, 0x0

    const-string/jumbo v4, "text/html"

    move-object v3, p0

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final DocResultScreenBodyHtml$lambda$6(Lcom/smartengines/engine/doc/DocResultData;Lcom/smartengines/app/settings/DocSettings;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    const-string p4, "$resultData"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "$docSettings"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/smartengines/app/ui/results/DocResultScreenBodyHtmlKt;->DocResultScreenBodyHtml(Lcom/smartengines/engine/doc/DocResultData;Lcom/smartengines/app/settings/DocSettings;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
