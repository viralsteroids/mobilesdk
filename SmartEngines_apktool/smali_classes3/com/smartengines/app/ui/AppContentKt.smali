.class public final Lcom/smartengines/app/ui/AppContentKt;
.super Ljava/lang/Object;
.source "AppContent.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAppContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppContent.kt\ncom/smartengines/app/ui/AppContentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,113:1\n77#2:114\n1225#3,6:115\n81#4:121\n*S KotlinDebug\n*F\n+ 1 AppContent.kt\ncom/smartengines/app/ui/AppContentKt\n*L\n40#1:114\n46#1:115,6\n47#1:121\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0007\u00a2\u0006\u0002\u0010\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0007\"\u0004\u0008\u0008\u0010\t\u00a8\u0006\n\u00b2\u0006\n\u0010\u000b\u001a\u00020\u000cX\u008a\u0084\u0002\u00b2\u0006\n\u0010\r\u001a\u00020\u0006X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u000e\u001a\u00020\u0006X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"
    }
    d2 = {
        "TAG",
        "",
        "AppContent",
        "",
        "(Landroidx/compose/runtime/Composer;I)V",
        "isPreview",
        "",
        "()Z",
        "setPreview",
        "(Z)V",
        "app_storeRelease",
        "commonSettings",
        "Lcom/smartengines/app/settings/CommonSettings;",
        "modelIsLoaded",
        "showIntro",
        "imageProcessingState",
        "Lcom/smartengines/engine/ImageProcessingState;"
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
.field private static final TAG:Ljava/lang/String; = "myapp.AppContent"

.field private static isPreview:Z


# direct methods
.method public static synthetic $r8$lambda$L9PbZc5L9qk8izxnYPVWHstvN-o(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/AppContentKt;->AppContent$lambda$2(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final AppContent(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const v0, 0x5f566308    # 1.54482E19f

    .line 39
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p0

    const-string v0, "C(AppContent)39@1633L7,42@1665L16,45@1721L35,46@1808L16,47@1853L16,49@1881L35,53@2097L2852,53@2041L2908:AppContent.kt#83idza"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p1, :cond_1

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 110
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_1

    .line 40
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    const v1, 0x789c5f52

    const-string v2, "CC:CompositionLocal.kt#9igjgp"

    .line 114
    invoke-static {p0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 40
    check-cast v0, Landroid/content/Context;

    const/4 v1, 0x0

    .line 43
    invoke-static {p0, v1}, Lcom/smartengines/app/ui/ScreenDataKt;->ReadScreenData(Landroidx/compose/runtime/Composer;I)V

    const v2, -0x1d4b7bd1

    invoke-interface {p0, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "CC(remember):AppContent.kt#9igjgp"

    invoke-static {p0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 115
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 116
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_2

    .line 46
    invoke-static {v0}, Lcom/smartengines/utils/VersionKt;->appVersionCode(Landroid/content/Context;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 118
    invoke-interface {p0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 46
    :cond_2
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 47
    invoke-static {}, Lcom/smartengines/app/AppKt;->getCommonSettingsStore()Lcom/smartengines/app/settings/CommonSettingsStore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/app/settings/CommonSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x1

    invoke-static {v0, v4, p0, v5, v6}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v0

    .line 48
    sget-object v7, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v7}, Lcom/smartengines/app/Model;->getError()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v7

    check-cast v7, Lkotlinx/coroutines/flow/StateFlow;

    invoke-static {v7, v4, p0, v5, v6}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v4

    invoke-interface {v4}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Throwable;

    .line 50
    new-instance v5, Lcom/smartengines/app/ui/AppContentKt$AppContent$1;

    sget-object v7, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-direct {v5, v7}, Lcom/smartengines/app/ui/AppContentKt$AppContent$1;-><init>(Ljava/lang/Object;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    invoke-static {v1, v5, p0, v1, v6}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 54
    invoke-static {v0}, Lcom/smartengines/app/ui/AppContentKt;->AppContent$lambda$1(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CommonSettings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CommonSettings;->getDarkTheme()Z

    move-result v1

    new-instance v5, Lcom/smartengines/app/ui/AppContentKt$AppContent$2;

    invoke-direct {v5, v2, v3, v4, v0}, Lcom/smartengines/app/ui/AppContentKt$AppContent$2;-><init>(JLjava/lang/Throwable;Landroidx/compose/runtime/State;)V

    const/16 v0, 0x36

    const v2, 0x1bc6717d

    invoke-static {v2, v6, v5, p0, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/16 v2, 0x30

    invoke-static {v1, v0, p0, v2}, Lcom/smartengines/app/ui/theme/ThemeKt;->SmartEnginesTheme(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 110
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_3

    new-instance v0, Lcom/smartengines/app/ui/AppContentKt$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/AppContentKt$$ExternalSyntheticLambda0;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_3
    return-void
.end method

.method private static final AppContent$lambda$1(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CommonSettings;
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

    .line 121
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/smartengines/app/settings/CommonSettings;

    return-object p0
.end method

.method private static final AppContent$lambda$2(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/AppContentKt;->AppContent(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$AppContent$lambda$1(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CommonSettings;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/smartengines/app/ui/AppContentKt;->AppContent$lambda$1(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CommonSettings;

    move-result-object p0

    return-object p0
.end method

.method public static final isPreview()Z
    .locals 1

    .line 112
    sget-boolean v0, Lcom/smartengines/app/ui/AppContentKt;->isPreview:Z

    return v0
.end method

.method public static final setPreview(Z)V
    .locals 0

    .line 112
    sput-boolean p0, Lcom/smartengines/app/ui/AppContentKt;->isPreview:Z

    return-void
.end method
