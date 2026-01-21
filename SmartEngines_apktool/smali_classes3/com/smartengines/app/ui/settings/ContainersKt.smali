.class public final Lcom/smartengines/app/ui/settings/ContainersKt;
.super Ljava/lang/Object;
.source "Containers.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a#\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u0010\u0008\u001a\r\u0010\t\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "SettingsContainers",
        "",
        "onBack",
        "Lkotlin/Function0;",
        "codeSettings",
        "Lcom/smartengines/app/settings/CodeSettings;",
        "(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/CodeSettings;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic $r8$lambda$pXxDQchKhaxTZSc11m3Wjah6Blk(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/settings/ContainersKt;->Preview_Dark$lambda$1(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$uWA3Z8muJUfEcNPWv1_XckI6BDc(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/settings/ContainersKt;->Preview_Light$lambda$2(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$w3gHMl025zhuANjFFYCeb-m9vKA(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/CodeSettings;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/smartengines/app/ui/settings/ContainersKt;->SettingsContainers$lambda$0(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/CodeSettings;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final Preview_Dark(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const v0, -0x26c36c04

    .line 35
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p0

    const-string v0, "C(Preview_Dark)36@1130L193:Containers.kt#v86m6v"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p1, :cond_1

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 36
    invoke-static {v0}, Lcom/smartengines/app/ui/AppContentKt;->setPreview(Z)V

    .line 37
    sget-object v1, Lcom/smartengines/app/ui/settings/ComposableSingletons$ContainersKt;->INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$ContainersKt;

    invoke-virtual {v1}, Lcom/smartengines/app/ui/settings/ComposableSingletons$ContainersKt;->getLambda-2$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    const/16 v2, 0x36

    invoke-static {v0, v1, p0, v2}, Lcom/smartengines/app/ui/theme/ThemeKt;->SmartEnginesTheme(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 44
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lcom/smartengines/app/ui/settings/ContainersKt$$ExternalSyntheticLambda2;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/settings/ContainersKt$$ExternalSyntheticLambda2;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2
    return-void
.end method

.method private static final Preview_Dark$lambda$1(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/settings/ContainersKt;->Preview_Dark(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final Preview_Light(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const v0, -0x26cda40e

    .line 47
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p0

    const-string v0, "C(Preview_Light)48@1448L194:Containers.kt#v86m6v"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p1, :cond_1

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 56
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 48
    invoke-static {v0}, Lcom/smartengines/app/ui/AppContentKt;->setPreview(Z)V

    .line 49
    sget-object v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$ContainersKt;->INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$ContainersKt;

    invoke-virtual {v0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$ContainersKt;->getLambda-4$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x36

    const/4 v2, 0x0

    invoke-static {v2, v0, p0, v1}, Lcom/smartengines/app/ui/theme/ThemeKt;->SmartEnginesTheme(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 56
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lcom/smartengines/app/ui/settings/ContainersKt$$ExternalSyntheticLambda1;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/settings/ContainersKt$$ExternalSyntheticLambda1;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2
    return-void
.end method

.method private static final Preview_Light$lambda$2(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/settings/ContainersKt;->Preview_Light(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final SettingsContainers(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/CodeSettings;Landroidx/compose/runtime/Composer;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/smartengines/app/settings/CodeSettings;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "onBack"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "codeSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x6e593360

    .line 18
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p2

    const-string v0, "C(SettingsContainers)P(1)18@660L233,18@621L272:Containers.kt#v86m6v"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 19
    new-instance v0, Lcom/smartengines/app/ui/settings/ContainersKt$SettingsContainers$1;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/settings/ContainersKt$SettingsContainers$1;-><init>(Lcom/smartengines/app/settings/CodeSettings;)V

    const/16 v1, 0x36

    const v2, 0x780a9988

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, p2, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function3;

    shl-int/lit8 v1, p3, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/lit16 v1, v1, 0x186

    const-string/jumbo v2, "\u041a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440\u044b"

    invoke-static {v2, p0, v0, p2, v1}, Lcom/smartengines/app/ui/settings/FragmentsKt;->SettingsScaffold(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p2

    if-eqz p2, :cond_0

    new-instance v0, Lcom/smartengines/app/ui/settings/ContainersKt$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0, p1, p3}, Lcom/smartengines/app/ui/settings/ContainersKt$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/CodeSettings;I)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_0
    return-void
.end method

.method private static final SettingsContainers$lambda$0(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/CodeSettings;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    const-string p4, "$onBack"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "$codeSettings"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/smartengines/app/ui/settings/ContainersKt;->SettingsContainers(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/CodeSettings;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
