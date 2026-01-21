.class public final Lcom/smartengines/app/ui/ProcessingScreenKt;
.super Ljava/lang/Object;
.source "ProcessingScreen.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nProcessingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessingScreen.kt\ncom/smartengines/app/ui/ProcessingScreenKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,100:1\n71#2:101\n69#2,5:102\n74#2:135\n78#2:139\n79#3,6:107\n86#3,4:122\n90#3,2:132\n94#3:138\n368#4,9:113\n377#4:134\n378#4,2:136\n4034#5,6:126\n81#6:140\n*S KotlinDebug\n*F\n+ 1 ProcessingScreen.kt\ncom/smartengines/app/ui/ProcessingScreenKt\n*L\n57#1:101\n57#1:102,5\n57#1:135\n57#1:139\n57#1:107,6\n57#1:122,4\n57#1:132,2\n57#1:138\n57#1:113,9\n57#1:134\n57#1:136,2\n57#1:126,6\n52#1:140\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\u0008\u0008H\u0007\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n\u00b2\u0006\n\u0010\u000b\u001a\u00020\u000cX\u008a\u0084\u0002"
    }
    d2 = {
        "ProcessingScreen",
        "",
        "selectedTreeLeaf",
        "Lcom/smartengines/app/targets/TreeLeaf;",
        "imageProcessingState",
        "Lcom/smartengines/engine/ImageProcessingState;",
        "cameraContent",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/ImageProcessingState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V",
        "app_storeRelease",
        "cameraButtonsState",
        "Lcom/smartengines/app/CameraButtonsState;"
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
.method public static synthetic $r8$lambda$2gte3DkGI5aXfuvEp2cq9IHQjv0(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/ImageProcessingState;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/smartengines/app/ui/ProcessingScreenKt;->ProcessingScreen$lambda$2(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/ImageProcessingState;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final ProcessingScreen(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/ImageProcessingState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/app/targets/TreeLeaf;",
            "Lcom/smartengines/engine/ImageProcessingState;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "selectedTreeLeaf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageProcessingState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraContent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x4ee8052a

    .line 51
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    const-string p3, "C(ProcessingScreen)P(2,1)51@2165L16,56@2351L1034:ProcessingScreen.kt#83idza"

    invoke-static {v4, p3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 52
    sget-object p3, Lcom/smartengines/app/CameraButtonsModel;->INSTANCE:Lcom/smartengines/app/CameraButtonsModel;

    invoke-virtual {p3}, Lcom/smartengines/app/CameraButtonsModel;->getStateFlow()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p3

    check-cast p3, Lkotlinx/coroutines/flow/StateFlow;

    const/4 v0, 0x0

    const/16 v1, 0x8

    const/4 v2, 0x1

    invoke-static {p3, v0, v4, v1, v2}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object p3

    .line 57
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v0}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 58
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getTopCenter()Landroidx/compose/ui/Alignment;

    move-result-object v1

    const v2, 0x2bb5b5d7

    .line 57
    const-string v3, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"

    .line 101
    invoke-static {v4, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .line 105
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v1

    const v3, -0x4ee9b9da

    .line 106
    const-string v5, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    .line 107
    invoke-static {v4, v3, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 108
    invoke-static {v4, v2}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v3

    .line 109
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v5

    .line 110
    invoke-static {v4, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 112
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    const v7, -0x2942ffcf

    .line 111
    const-string v8, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    .line 113
    invoke-static {v4, v7, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 114
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v7

    instance-of v7, v7, Landroidx/compose/runtime/Applier;

    if-nez v7, :cond_0

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 115
    :cond_0
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 116
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 117
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    .line 119
    :cond_1
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 121
    :goto_0
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v6

    .line 122
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v1, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 123
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v5, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 125
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 127
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 128
    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 129
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 132
    :cond_3
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v0, -0x7ff519f7    # -1.000876E-39f

    .line 134
    const-string v1, "C73@3429L9:Box.kt#2w3rfo"

    .line 135
    invoke-static {v4, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    check-cast v0, Landroidx/compose/foundation/layout/BoxScope;

    const v0, 0x7a45b012

    const-string v1, "C:ProcessingScreen.kt#83idza"

    .line 60
    invoke-static {v4, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const v0, 0x6f4c9bd8

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "64@2659L8,67@2747L10"

    invoke-static {v4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 63
    instance-of v0, p1, Lcom/smartengines/engine/ImageProcessingState$WAITING;

    if-nez v0, :cond_4

    instance-of v1, p1, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;

    if-eqz v1, :cond_5

    :cond_4
    shr-int/lit8 v1, p4, 0x6

    and-int/lit8 v1, v1, 0xe

    .line 65
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v4, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    invoke-static {p3}, Lcom/smartengines/app/ui/ProcessingScreenKt;->ProcessingScreen$lambda$0(Landroidx/compose/runtime/State;)Lcom/smartengines/app/CameraButtonsState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/smartengines/app/CameraButtonsState;->isCrop()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 68
    invoke-static {v4, v2}, Lcom/smartengines/app/ui/CropViewKt;->CropView(Landroidx/compose/runtime/Composer;I)V

    :cond_5
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    if-eqz v0, :cond_6

    const v0, 0x6f4cc423

    .line 75
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "74@2879L81"

    invoke-static {v4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    sget-object v0, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v0}, Lcom/smartengines/app/Model;->getPhotoTaking()Lcom/smartengines/app/PhotoTakingState;

    move-result-object v2

    invoke-static {p3}, Lcom/smartengines/app/ui/ProcessingScreenKt;->ProcessingScreen$lambda$0(Landroidx/compose/runtime/State;)Lcom/smartengines/app/CameraButtonsState;

    move-result-object v3

    const/16 v6, 0x8

    const/16 v7, 0x8

    move-object v5, v4

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lcom/smartengines/app/ui/ProcessingScreenWaitingKt;->ProcessingScreenWaiting(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/app/PhotoTakingState;Lcom/smartengines/app/CameraButtonsState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v1

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_1

    :cond_6
    move-object v2, p0

    move-object v5, v4

    .line 76
    instance-of p0, p1, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;

    if-eqz p0, :cond_7

    const p0, 0x6f4cd2a3

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p0, "75@2996L49"

    invoke-static {v5, p0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;

    move-object v4, v5

    const/16 v5, 0x48

    const/4 v6, 0x4

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/smartengines/app/ui/ProcessingScreenVideoKt;->ProcessingScreenVideo(Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;Lcom/smartengines/app/targets/TreeLeaf;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v4

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_1

    .line 77
    :cond_7
    instance-of p0, p1, Lcom/smartengines/engine/ImageProcessingState$PHOTO_PROCESSING;

    if-eqz p0, :cond_8

    const p0, 0x6f4cdd88

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p0, "76@3081L118"

    invoke-static {v5, p0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    sget-object p0, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {p0}, Lcom/smartengines/app/Model;->getPhotoTaking()Lcom/smartengines/app/PhotoTakingState;

    move-result-object p0

    const-string p3, "null cannot be cast to non-null type com.smartengines.app.PhotoTakingState.Ready"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/smartengines/app/PhotoTakingState$Ready;

    invoke-virtual {p0}, Lcom/smartengines/app/PhotoTakingState$Ready;->getPhoto()Lcom/smartengines/app/Photo;

    move-result-object v1

    move-object p0, p1

    check-cast p0, Lcom/smartengines/engine/ImageProcessingState$PHOTO_PROCESSING;

    invoke-virtual {p0}, Lcom/smartengines/engine/ImageProcessingState$PHOTO_PROCESSING;->getVisualizations()Ljava/util/Collection;

    move-result-object p0

    const/16 v6, 0x248

    const/16 v7, 0x8

    const/4 v4, 0x0

    move-object v3, v2

    move-object v2, p0

    invoke-static/range {v1 .. v7}, Lcom/smartengines/app/ui/ProcessingScreenPhotoKt;->ProcessingScreenPhoto(Lcom/smartengines/app/Photo;Ljava/util/Collection;Lcom/smartengines/app/targets/TreeLeaf;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v3

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_1

    .line 78
    :cond_8
    instance-of p0, p1, Lcom/smartengines/engine/ImageProcessingState$FINISHED;

    if-eqz p0, :cond_9

    const p0, 0x6f4cf083

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p0, "77@3235L49"

    invoke-static {v5, p0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Lcom/smartengines/engine/ImageProcessingState$FINISHED;

    move-object v4, v5

    const/16 v5, 0x48

    const/4 v6, 0x4

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/smartengines/app/ui/ProcessingScreenResultKt;->ProcessingScreenResult(Lcom/smartengines/engine/ImageProcessingState$FINISHED;Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/app/settings/CommonSettings;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v4

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_1

    .line 79
    :cond_9
    instance-of p0, p1, Lcom/smartengines/engine/ImageProcessingState$ERROR;

    if-eqz p0, :cond_b

    const p0, 0x6f4cfb23

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p0, "78@3320L49"

    invoke-static {v5, p0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move-object p0, p1

    check-cast p0, Lcom/smartengines/engine/ImageProcessingState$ERROR;

    const/16 p3, 0x48

    invoke-static {p0, v2, v5, p3}, Lcom/smartengines/app/ui/ProcessingScreenErrorKt;->ProcessingScreenError(Lcom/smartengines/engine/ImageProcessingState$ERROR;Lcom/smartengines/app/targets/TreeLeaf;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 60
    :goto_1
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 135
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 136
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 113
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 107
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 101
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 139
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_a

    new-instance p3, Lcom/smartengines/app/ui/ProcessingScreenKt$$ExternalSyntheticLambda0;

    invoke-direct {p3, v2, p1, p2, p4}, Lcom/smartengines/app/ui/ProcessingScreenKt$$ExternalSyntheticLambda0;-><init>(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/ImageProcessingState;Lkotlin/jvm/functions/Function2;I)V

    invoke-interface {p0, p3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_a
    return-void

    :cond_b
    const p0, 0x6f4cbfb8

    .line 74
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final ProcessingScreen$lambda$0(Landroidx/compose/runtime/State;)Lcom/smartengines/app/CameraButtonsState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/CameraButtonsState;",
            ">;)",
            "Lcom/smartengines/app/CameraButtonsState;"
        }
    .end annotation

    .line 140
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/smartengines/app/CameraButtonsState;

    return-object p0
.end method

.method private static final ProcessingScreen$lambda$2(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/ImageProcessingState;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    const-string p5, "$selectedTreeLeaf"

    invoke-static {p0, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "$imageProcessingState"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "$cameraContent"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/smartengines/app/ui/ProcessingScreenKt;->ProcessingScreen(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/ImageProcessingState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
