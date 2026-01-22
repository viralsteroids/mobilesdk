.class final Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;
.super Ljava/lang/Object;
.source "AppContent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1;->invoke(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAppContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppContent.kt\ncom/smartengines/app/ui/AppContentKt$AppContent$2$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,113:1\n1225#2,6:114\n1#3:120\n81#4:121\n81#4:122\n107#4,2:123\n81#4:125\n*S KotlinDebug\n*F\n+ 1 AppContent.kt\ncom/smartengines/app/ui/AppContentKt$AppContent$2$1$1\n*L\n76#1:114,6\n62#1:121\n76#1:122\n76#1:123,2\n86#1:125\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $appVersion:J

.field final synthetic $commonSettings$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/CommonSettings;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $error:Ljava/lang/Throwable;


# direct methods
.method public static synthetic $r8$lambda$AJz0Goa6lNp6g-HBy_UFawTCoi8()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->invoke$lambda$12$lambda$11()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$jMakioHKVhtMeBFVTzuEEUToBoc()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->invoke$lambda$6()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$rAOTexB8NBPVABASbgSzfbW6Oz0()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->invoke$lambda$10$lambda$9()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$uqoD8yA51eHaS0KcNjvY7CpltwA()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->invoke$lambda$5()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$wDtNry_fLS8AnMy2FnliV0jfQf0()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->invoke$lambda$7()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method constructor <init>(JLjava/lang/Throwable;Landroidx/compose/runtime/State;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/Throwable;",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/CommonSettings;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->$appVersion:J

    iput-object p3, p0, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->$error:Ljava/lang/Throwable;

    iput-object p4, p0, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->$commonSettings$delegate:Landroidx/compose/runtime/State;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0(Landroidx/compose/runtime/State;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 121
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final invoke$lambda$10$lambda$9()Lkotlin/Unit;
    .locals 2

    .line 101
    sget-object v0, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/smartengines/app/AppViewModel;->setOnPhotoTaken(Lkotlin/jvm/functions/Function1;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invoke$lambda$12$lambda$11()Lkotlin/Unit;
    .locals 2

    .line 106
    sget-object v0, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v0}, Lcom/smartengines/app/Model;->getError()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invoke$lambda$2(Landroidx/compose/runtime/MutableState;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 76
    check-cast p0, Landroidx/compose/runtime/State;

    .line 122
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final invoke$lambda$3(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    .line 76
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 123
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final invoke$lambda$4(Landroidx/compose/runtime/State;)Lcom/smartengines/engine/ImageProcessingState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lcom/smartengines/engine/ImageProcessingState;",
            ">;)",
            "Lcom/smartengines/engine/ImageProcessingState;"
        }
    .end annotation

    .line 125
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/smartengines/engine/ImageProcessingState;

    return-object p0
.end method

.method private static final invoke$lambda$5()Lkotlin/Unit;
    .locals 2

    .line 95
    sget-object v0, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/smartengines/app/AppViewModel;->setShowInfo(Z)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invoke$lambda$6()Lkotlin/Unit;
    .locals 2

    .line 96
    sget-object v0, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/smartengines/app/AppViewModel;->setShowTestErrors(Z)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invoke$lambda$7()Lkotlin/Unit;
    .locals 2

    .line 98
    sget-object v0, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    sget-object v1, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    invoke-virtual {v1}, Lcom/smartengines/app/AppViewModel;->getShowSettings()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/smartengines/app/AppViewModel;->setShowSettings(Z)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 56
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "C*105@4873L44:AppContent.kt#83idza"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 58
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 106
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 58
    :cond_1
    :goto_0
    sget-object p2, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    invoke-virtual {p2}, Lcom/smartengines/app/AppViewModel;->getMainRoute()Lcom/smartengines/app/ui/MainRoute;

    move-result-object p2

    .line 61
    sget-object v1, Lcom/smartengines/app/ui/MainRoute$Home;->INSTANCE:Lcom/smartengines/app/ui/MainRoute$Home;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    const p2, -0x1d6d236a

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p2, "61@2420L16,62@2461L163"

    invoke-static {p1, p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 62
    sget-object p2, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {p2}, Lcom/smartengines/app/Model;->getLoadedState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-static {p2, v5, p1, v2, v4}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object p2

    .line 64
    invoke-static {p2}, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->invoke$lambda$0(Landroidx/compose/runtime/State;)Z

    move-result p2

    .line 65
    sget-object v0, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v0}, Lcom/smartengines/app/Model;->getHomeScreenTargets()Ljava/util/List;

    move-result-object v0

    const/16 v1, 0x40

    .line 63
    invoke-static {p2, v0, p1, v1}, Lcom/smartengines/app/ui/HomeScreenKt;->HomeScreen(ZLjava/util/List;Landroidx/compose/runtime/Composer;I)V

    .line 61
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_2

    .line 70
    :cond_2
    instance-of v1, p2, Lcom/smartengines/app/ui/MainRoute$TargetList;

    if-eqz v1, :cond_3

    const v0, -0x1d678f3c

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "70@2756L37"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 71
    check-cast p2, Lcom/smartengines/app/ui/MainRoute$TargetList;

    invoke-virtual {p2}, Lcom/smartengines/app/ui/MainRoute$TargetList;->getTargetsViewModel()Lcom/smartengines/app/ui/TargetsViewModel;

    move-result-object p2

    sget v0, Lcom/smartengines/app/ui/TargetsViewModel;->$stable:I

    invoke-static {p2, p1, v0}, Lcom/smartengines/app/ui/TargetsScreenKt;->TargetsScreen(Lcom/smartengines/app/ui/TargetsViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 70
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_2

    .line 75
    :cond_3
    instance-of v1, p2, Lcom/smartengines/app/ui/MainRoute$TargetProcessing;

    if-eqz v1, :cond_10

    const v1, -0x1d6463e8

    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "75@2954L104,85@3636L16,86@3681L173"

    invoke-static {p1, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const v1, 0x20158b11

    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "CC(remember):AppContent.kt#9igjgp"

    invoke-static {p1, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 76
    iget-object v1, p0, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->$commonSettings$delegate:Landroidx/compose/runtime/State;

    .line 114
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .line 115
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v6, v7, :cond_5

    .line 76
    move-object v6, p2

    check-cast v6, Lcom/smartengines/app/ui/MainRoute$TargetProcessing;

    invoke-virtual {v6}, Lcom/smartengines/app/ui/MainRoute$TargetProcessing;->getSelectedLeaf()Lcom/smartengines/app/targets/TreeLeaf;

    move-result-object v6

    invoke-virtual {v6}, Lcom/smartengines/app/targets/TreeLeaf;->getTarget()Lcom/smartengines/engine/RecognitionTarget;

    move-result-object v6

    instance-of v6, v6, Lcom/smartengines/targets/id/LivenessTarget;

    if-eqz v6, :cond_4

    invoke-static {v1}, Lcom/smartengines/app/ui/AppContentKt;->access$AppContent$lambda$1(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CommonSettings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CommonSettings;->getLivenessIntro()Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v4

    goto :goto_1

    :cond_4
    move v1, v3

    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1, v5, v0, v5}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v6

    .line 117
    invoke-interface {p1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 76
    :cond_5
    check-cast v6, Landroidx/compose/runtime/MutableState;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 86
    sget-object v0, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v0}, Lcom/smartengines/app/Model;->getImageProcessor()Lcom/smartengines/engine/ImageProcessor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/engine/ImageProcessor;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-static {v0, v5, p1, v2, v4}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v0

    .line 87
    check-cast p2, Lcom/smartengines/app/ui/MainRoute$TargetProcessing;

    invoke-virtual {p2}, Lcom/smartengines/app/ui/MainRoute$TargetProcessing;->getSelectedLeaf()Lcom/smartengines/app/targets/TreeLeaf;

    move-result-object p2

    invoke-static {v0}, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->invoke$lambda$4(Landroidx/compose/runtime/State;)Lcom/smartengines/engine/ImageProcessingState;

    move-result-object v0

    sget-object v1, Lcom/smartengines/app/ui/ComposableSingletons$AppContentKt;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$AppContentKt;

    invoke-virtual {v1}, Lcom/smartengines/app/ui/ComposableSingletons$AppContentKt;->getLambda-1$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    sget v6, Lcom/smartengines/app/targets/TreeLeaf;->$stable:I

    or-int/lit16 v6, v6, 0x1c0

    invoke-static {p2, v0, v1, p1, v6}, Lcom/smartengines/app/ui/ProcessingScreenKt;->ProcessingScreen(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/ImageProcessingState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 75
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_2
    const p2, 0x20160d1e

    .line 58
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p2, "94@4020L60"

    invoke-static {p1, p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 95
    sget-object p2, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    invoke-virtual {p2}, Lcom/smartengines/app/AppViewModel;->getShowInfo()Z

    move-result p2

    const/4 v0, 0x3

    const/4 v1, 0x6

    if-eqz p2, :cond_6

    new-instance p2, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1$$ExternalSyntheticLambda0;

    invoke-direct {p2}, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1$$ExternalSyntheticLambda0;-><init>()V

    iget-object v6, p0, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->$commonSettings$delegate:Landroidx/compose/runtime/State;

    invoke-static {v6}, Lcom/smartengines/app/ui/AppContentKt;->access$AppContent$lambda$1(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CommonSettings;

    move-result-object v6

    sget v7, Lcom/smartengines/app/settings/CommonSettings;->$stable:I

    shl-int/2addr v7, v0

    or-int/2addr v7, v1

    invoke-static {p2, v6, p1, v7}, Lcom/smartengines/app/ui/InfoScreenKt;->InfoScreen(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/CommonSettings;Landroidx/compose/runtime/Composer;I)V

    :cond_6
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const p2, 0x20161a05

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p2, "95@4198L16,95@4122L99"

    invoke-static {p1, p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 96
    sget-object p2, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    invoke-virtual {p2}, Lcom/smartengines/app/AppViewModel;->getShowTestErrors()Z

    move-result p2

    if-eqz p2, :cond_7

    new-instance p2, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1$$ExternalSyntheticLambda1;

    invoke-direct {p2}, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1$$ExternalSyntheticLambda1;-><init>()V

    sget-object v6, Lcom/smartengines/app/targets/IdTargetTestUtils;->INSTANCE:Lcom/smartengines/app/targets/IdTargetTestUtils;

    invoke-virtual {v6}, Lcom/smartengines/app/targets/IdTargetTestUtils;->getErrors()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v6

    check-cast v6, Lkotlinx/coroutines/flow/StateFlow;

    invoke-static {v6, v5, p1, v2, v4}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v6, 0x46

    invoke-static {p2, v2, p1, v6}, Lcom/smartengines/app/ui/TestScreenKt;->TestScreen(Lkotlin/jvm/functions/Function0;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    :cond_7
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const p2, 0x20162b51

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p2, "96@4263L15"

    invoke-static {p1, p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 97
    sget-object p2, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    invoke-virtual {p2}, Lcom/smartengines/app/AppViewModel;->getShowExit()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-static {p1, v3}, Lcom/smartengines/app/com/smartengines/app/ui/AppExitDialogKt;->AppExitDialog(Landroidx/compose/runtime/Composer;I)V

    :cond_8
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const p2, 0x2016329e

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p2, "97@4320L60"

    invoke-static {p1, p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 98
    sget-object p2, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    invoke-virtual {p2}, Lcom/smartengines/app/AppViewModel;->getShowSettings()Z

    move-result p2

    if-eqz p2, :cond_9

    new-instance p2, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1$$ExternalSyntheticLambda2;

    invoke-direct {p2}, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1$$ExternalSyntheticLambda2;-><init>()V

    invoke-static {p2, p1, v1}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->SettingsScreen(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    :cond_9
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const p2, 0x20163f39

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p2, "98@4422L23"

    invoke-static {p1, p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 99
    sget-object p2, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    invoke-virtual {p2}, Lcom/smartengines/app/AppViewModel;->getShowSessionSettings()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-static {v5, p1, v3, v4}, Lcom/smartengines/app/ui/SessionSettingsScreenKt;->SessionSettingsScreen(Ljava/util/List;Landroidx/compose/runtime/Composer;II)V

    :cond_a
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 100
    sget-object p2, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    invoke-virtual {p2}, Lcom/smartengines/app/AppViewModel;->getFacesModel()Lcom/smartengines/app/FacesModel2;

    move-result-object p2

    const v2, 0x201648c7

    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "*99@4486L16"

    invoke-static {p1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p2, :cond_b

    goto :goto_3

    :cond_b
    sget v2, Lcom/smartengines/app/FacesModel2;->$stable:I

    invoke-static {p2, p1, v2}, Lcom/smartengines/app/ui/FacesScreen2Kt;->FacesScreen2(Lcom/smartengines/app/FacesModel2;Landroidx/compose/runtime/Composer;I)V

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_3
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 101
    sget-object p2, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    invoke-virtual {p2}, Lcom/smartengines/app/AppViewModel;->getOnPhotoTaken()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    const v2, 0x20165096

    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "*100@4546L64"

    invoke-static {p1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p2, :cond_c

    goto :goto_4

    .line 120
    :cond_c
    new-instance v2, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1$$ExternalSyntheticLambda3;

    invoke-direct {v2}, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1$$ExternalSyntheticLambda3;-><init>()V

    .line 101
    invoke-static {v2, p2, p1, v1}, Lcom/smartengines/app/ui/PhotoDialogKt;->PhotoDialog(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_4
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 103
    iget-wide v1, p0, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->$appVersion:J

    iget-object p2, p0, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->$commonSettings$delegate:Landroidx/compose/runtime/State;

    invoke-static {p2}, Lcom/smartengines/app/ui/AppContentKt;->access$AppContent$lambda$1(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CommonSettings;

    move-result-object p2

    invoke-virtual {p2}, Lcom/smartengines/app/settings/CommonSettings;->getEulaVersion()J

    move-result-wide v6

    cmp-long p2, v1, v6

    # BYPASS EULA - always skip to tutorial check
    goto :cond_d

    const p2, 0x201667b5

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p2, "102@4722L12"

    invoke-static {p1, p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {v5, v5, p1, v3, v0}, Lcom/smartengines/app/ui/EulaScreenKt;->EulaScreen(Lcom/smartengines/app/settings/CommonSettingWriter;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_6

    .line 104
    :cond_d
    iget-object p2, p0, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->$commonSettings$delegate:Landroidx/compose/runtime/State;

    invoke-static {p2}, Lcom/smartengines/app/ui/AppContentKt;->access$AppContent$lambda$1(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CommonSettings;

    move-result-object p2

    invoke-virtual {p2}, Lcom/smartengines/app/settings/CommonSettings;->getTutorialShown()Z

    move-result p2

    # BYPASS TUTORIAL - always skip
    goto :cond_e

    const p2, 0x201670f3

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p2, "103@4796L10"

    invoke-static {p1, p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {p1, v3}, Lcom/smartengines/app/ui/TutorialKt;->Tutorial(Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_e
    const p2, -0x1d482d07

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    :goto_5
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 106
    :goto_6
    iget-object p2, p0, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1;->$error:Ljava/lang/Throwable;

    if-nez p2, :cond_f

    return-void

    :cond_f
    new-instance v0, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1$$ExternalSyntheticLambda4;

    invoke-direct {v0}, Lcom/smartengines/app/ui/AppContentKt$AppContent$2$1$1$$ExternalSyntheticLambda4;-><init>()V

    const/16 v1, 0x38

    invoke-static {p2, v0, p1, v1}, Lcom/smartengines/app/ui/ErrorDialogKt;->ErrorDialog(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    return-void

    :cond_10
    const p2, 0x201537dc

    .line 58
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
