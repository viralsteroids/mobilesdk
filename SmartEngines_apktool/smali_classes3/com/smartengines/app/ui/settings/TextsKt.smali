.class public final Lcom/smartengines/app/ui/settings/TextsKt;
.super Ljava/lang/Object;
.source "Texts.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTexts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Texts.kt\ncom/smartengines/app/ui/settings/TextsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,76:1\n77#2:77\n1225#3,6:78\n*S KotlinDebug\n*F\n+ 1 Texts.kt\ncom/smartengines/app/ui/settings/TextsKt\n*L\n28#1:77\n29#1:78,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a-\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\u0008\u001a\r\u0010\t\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "SettingsTexts",
        "",
        "onBack",
        "Lkotlin/Function0;",
        "textSettings",
        "Lcom/smartengines/app/settings/TextSettings;",
        "textSettingsWriter",
        "Lcom/smartengines/app/settings/TextSettingsWriter;",
        "(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/TextSettings;Lcom/smartengines/app/settings/TextSettingsWriter;Landroidx/compose/runtime/Composer;II)V",
        "Preview_Dark",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Preview_Light",
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
.method public static synthetic $r8$lambda$A28Pge9GZYOCnO27VSMylKCwizE(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/TextSettings;Lcom/smartengines/app/settings/TextSettingsWriter;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/smartengines/app/ui/settings/TextsKt;->SettingsTexts$lambda$1(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/TextSettings;Lcom/smartengines/app/settings/TextSettingsWriter;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$DJxYz8l3k_NnIoklJYeBMrIzchY(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/settings/TextsKt;->Preview_Light$lambda$3(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$R-7EnqmdIapwfb0fSZrHecS_87o(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/settings/TextsKt;->Preview_Dark$lambda$2(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final Preview_Dark(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const v0, 0x47cf91da

    .line 52
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p0

    const-string v0, "C(Preview_Dark)53@1865L230:Texts.kt#v86m6v"

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

    .line 53
    invoke-static {v0}, Lcom/smartengines/app/ui/AppContentKt;->setPreview(Z)V

    .line 54
    sget-object v1, Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt;->INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt;

    invoke-virtual {v1}, Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt;->getLambda-2$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    const/16 v2, 0x36

    invoke-static {v0, v1, p0, v2}, Lcom/smartengines/app/ui/theme/ThemeKt;->SmartEnginesTheme(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 62
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lcom/smartengines/app/ui/settings/TextsKt$$ExternalSyntheticLambda2;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/settings/TextsKt$$ExternalSyntheticLambda2;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2
    return-void
.end method

.method private static final Preview_Dark$lambda$2(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/settings/TextsKt;->Preview_Dark(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final Preview_Light(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const v0, -0x7431d7dc

    .line 65
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p0

    const-string v0, "C(Preview_Light)66@2220L231:Texts.kt#v86m6v"

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
    const/4 v0, 0x1

    .line 66
    invoke-static {v0}, Lcom/smartengines/app/ui/AppContentKt;->setPreview(Z)V

    .line 67
    sget-object v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt;->INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt;

    invoke-virtual {v0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt;->getLambda-4$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x36

    const/4 v2, 0x0

    invoke-static {v2, v0, p0, v1}, Lcom/smartengines/app/ui/theme/ThemeKt;->SmartEnginesTheme(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 75
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lcom/smartengines/app/ui/settings/TextsKt$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/settings/TextsKt$$ExternalSyntheticLambda0;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2
    return-void
.end method

.method private static final Preview_Light$lambda$3(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/settings/TextsKt;->Preview_Light(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final SettingsTexts(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/TextSettings;Lcom/smartengines/app/settings/TextSettingsWriter;Landroidx/compose/runtime/Composer;II)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/smartengines/app/settings/TextSettings;",
            "Lcom/smartengines/app/settings/TextSettingsWriter;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "onBack"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "textSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1703f325

    .line 27
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p3

    const-string v0, "C(SettingsTexts)27@1075L7,28@1104L132,33@1307L321,33@1242L386:Texts.kt#v86m6v"

    invoke-static {p3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v0, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v0, p4, 0xe

    if-nez v0, :cond_2

    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_2
    move v0, p4

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, p4, 0x70

    if-nez v2, :cond_5

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v0, v0, 0x80

    :cond_6
    if-ne v2, v1, :cond_8

    and-int/lit16 v1, v0, 0x2db

    const/16 v3, 0x92

    if-ne v1, v3, :cond_8

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_5

    .line 45
    :cond_7
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :goto_4
    move-object v7, p2

    goto/16 :goto_9

    .line 27
    :cond_8
    :goto_5
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_a

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_6

    .line 26
    :cond_9
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    if-eqz v2, :cond_b

    goto :goto_7

    :cond_a
    :goto_6
    if-eqz v2, :cond_b

    invoke-static {}, Lcom/smartengines/app/AppKt;->getTextSettingsStore()Lcom/smartengines/app/settings/TextSettingsStore;

    move-result-object p2

    check-cast p2, Lcom/smartengines/app/settings/TextSettingsWriter;

    :goto_7
    and-int/lit16 v0, v0, -0x381

    :cond_b
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 28
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/CompositionLocal;

    const v2, 0x789c5f52

    const-string v3, "CC:CompositionLocal.kt#9igjgp"

    .line 77
    invoke-static {p3, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p3, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 28
    check-cast v1, Landroid/content/Context;

    const v2, -0xa295f0

    invoke-interface {p3, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "CC(remember):Texts.kt#9igjgp"

    invoke-static {p3, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 78
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 79
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x1

    if-ne v2, v3, :cond_d

    .line 30
    sget-object v2, Lcom/smartengines/dictionaries/TextDictionaries;->INSTANCE:Lcom/smartengines/dictionaries/TextDictionaries;

    .line 31
    sget-object v3, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v3}, Lcom/smartengines/app/Model;->getBuildFlavor()Lcom/smartengines/app/settings/BuildFlavor;

    move-result-object v3

    sget-object v5, Lcom/smartengines/app/settings/BuildFlavor;->STORE:Lcom/smartengines/app/settings/BuildFlavor;

    if-ne v3, v5, :cond_c

    move v3, v4

    goto :goto_8

    :cond_c
    const/4 v3, 0x0

    .line 30
    :goto_8
    invoke-virtual {v2, v1, v3}, Lcom/smartengines/dictionaries/TextDictionaries;->loadTextLanguages(Landroid/content/Context;Z)Ljava/util/List;

    move-result-object v2

    .line 81
    invoke-interface {p3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 29
    :cond_d
    check-cast v2, Ljava/util/List;

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 34
    sget v3, Lcom/smartengines/app/R$string;->target_text:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v5, "getString(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lcom/smartengines/app/ui/settings/TextsKt$SettingsTexts$1;

    invoke-direct {v5, v1, p1, p2, v2}, Lcom/smartengines/app/ui/settings/TextsKt$SettingsTexts$1;-><init>(Landroid/content/Context;Lcom/smartengines/app/settings/TextSettings;Lcom/smartengines/app/settings/TextSettingsWriter;Ljava/util/List;)V

    const/16 v1, 0x36

    const v2, -0x2d010603

    invoke-static {v2, v4, v5, p3, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function3;

    shl-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/lit16 v0, v0, 0x180

    invoke-static {v3, p0, v1, p3, v0}, Lcom/smartengines/app/ui/settings/FragmentsKt;->SettingsScaffold(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto/16 :goto_4

    .line 45
    :goto_9
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p2

    if-eqz p2, :cond_e

    new-instance v4, Lcom/smartengines/app/ui/settings/TextsKt$$ExternalSyntheticLambda1;

    move-object v5, p0

    move-object v6, p1

    move v8, p4

    move v9, p5

    invoke-direct/range {v4 .. v9}, Lcom/smartengines/app/ui/settings/TextsKt$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/TextSettings;Lcom/smartengines/app/settings/TextSettingsWriter;II)V

    invoke-interface {p2, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_e
    return-void
.end method

.method private static final SettingsTexts$lambda$1(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/TextSettings;Lcom/smartengines/app/settings/TextSettingsWriter;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    const-string p6, "$onBack"

    invoke-static {p0, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "$textSettings"

    invoke-static {p1, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/settings/TextsKt;->SettingsTexts(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/TextSettings;Lcom/smartengines/app/settings/TextSettingsWriter;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
