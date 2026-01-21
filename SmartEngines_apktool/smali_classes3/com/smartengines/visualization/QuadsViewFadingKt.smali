.class public final Lcom/smartengines/visualization/QuadsViewFadingKt;
.super Ljava/lang/Object;
.source "QuadsViewFading.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQuadsViewFading.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuadsViewFading.kt\ncom/smartengines/visualization/QuadsViewFadingKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,110:1\n1225#2,6:111\n774#3:117\n865#3,2:118\n1863#3:121\n1863#3,2:122\n1864#3:124\n81#4:120\n*S KotlinDebug\n*F\n+ 1 QuadsViewFading.kt\ncom/smartengines/visualization/QuadsViewFadingKt\n*L\n33#1:111,6\n96#1:117\n96#1:118,2\n36#1:121\n44#1:122,2\n36#1:124\n29#1:120\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\u001a\'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0014\u0010\u0010\u001a\u00020\t*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0002\u001a0\u0010\u0013\u001a\u00020\u00032\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00152\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\u00180\u0017H\u0082@\u00a2\u0006\u0002\u0010\u0019\u001a\u0018\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0018*\u0008\u0012\u0004\u0012\u00020\u00110\u0018H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\rX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\rX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b\u00b2\u0006\u0010\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0018X\u008a\u0084\u0002"
    }
    d2 = {
        "TAG",
        "",
        "QuadsViewFading",
        "",
        "visObject",
        "Lcom/smartengines/visualization/Visualization$Quads;",
        "lineColor",
        "Landroidx/compose/ui/graphics/Color;",
        "lineWidth",
        "",
        "QuadsViewFading-iJQMabo",
        "(Lcom/smartengines/visualization/Visualization$Quads;JFLandroidx/compose/runtime/Composer;I)V",
        "LIFE_TIME",
        "",
        "YOUTH_TIME",
        "MIN_ALPHA",
        "calculateAlpha",
        "Lcom/smartengines/visualization/QuadFrame;",
        "time",
        "backgroundTask",
        "input",
        "Lkotlinx/coroutines/flow/Flow;",
        "data",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "",
        "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "recalculate",
        "visualization_release",
        "frames"
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
.field private static final LIFE_TIME:J = 0x7d0L

.field private static final MIN_ALPHA:F = 0.1f

.field private static final TAG:Ljava/lang/String; = "myapp.QuadsFading"

.field private static final YOUTH_TIME:J = 0x12cL


# direct methods
.method public static synthetic $r8$lambda$9kq5oMsZ25dZb1TYFgJgPhPpqTQ(Lcom/smartengines/visualization/Visualization$Quads;JFILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/smartengines/visualization/QuadsViewFadingKt;->QuadsViewFading_iJQMabo$lambda$5(Lcom/smartengines/visualization/Visualization$Quads;JFILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$SxtkC7rg24VHN00DckHWFFCnRT8(Landroidx/compose/runtime/State;JFLandroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/smartengines/visualization/QuadsViewFadingKt;->QuadsViewFading_iJQMabo$lambda$4$lambda$3(Landroidx/compose/runtime/State;JFLandroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final QuadsViewFading-iJQMabo(Lcom/smartengines/visualization/Visualization$Quads;JFLandroidx/compose/runtime/Composer;I)V
    .locals 7

    const-string/jumbo v0, "visObject"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x71663bfc

    .line 26
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p4

    const-string v0, "C(QuadsViewFading)P(2,0:c#ui.graphics.Color)28@895L16,32@1073L574,32@1032L615:QuadsViewFading.kt#hal2ob"

    invoke-static {p4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0}, Lcom/smartengines/visualization/Visualization$Quads;->getDataFlow()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    const/4 v1, 0x0

    const/16 v2, 0x8

    const/4 v3, 0x1

    invoke-static {v0, v1, p4, v2, v3}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v0

    .line 33
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const/4 v4, 0x0

    invoke-static {v2, v4, v3, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const v2, -0x80a763b

    invoke-interface {p4, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "CC(remember):QuadsViewFading.kt#9igjgp"

    invoke-static {p4, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 v4, p5, 0x70

    xor-int/lit8 v4, v4, 0x30

    const/4 v5, 0x0

    const/16 v6, 0x20

    if-le v4, v6, :cond_0

    invoke-interface {p4, p1, p2}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v4

    if-nez v4, :cond_1

    :cond_0
    and-int/lit8 v4, p5, 0x30

    if-ne v4, v6, :cond_2

    :cond_1
    move v4, v3

    goto :goto_0

    :cond_2
    move v4, v5

    :goto_0
    or-int/2addr v2, v4

    and-int/lit16 v4, p5, 0x380

    xor-int/lit16 v4, v4, 0x180

    const/16 v6, 0x100

    if-le v4, v6, :cond_3

    invoke-interface {p4, p3}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v4

    if-nez v4, :cond_5

    :cond_3
    and-int/lit16 v4, p5, 0x180

    if-ne v4, v6, :cond_4

    goto :goto_1

    :cond_4
    move v3, v5

    :cond_5
    :goto_1
    or-int/2addr v2, v3

    .line 111
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_6

    .line 112
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_7

    .line 33
    :cond_6
    new-instance v3, Lcom/smartengines/visualization/QuadsViewFadingKt$$ExternalSyntheticLambda0;

    invoke-direct {v3, v0, p1, p2, p3}, Lcom/smartengines/visualization/QuadsViewFadingKt$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/runtime/State;JF)V

    .line 114
    invoke-interface {p4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 33
    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v0, 0x6

    invoke-static {v1, v3, p4, v0}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p4

    if-eqz p4, :cond_8

    new-instance v0, Lcom/smartengines/visualization/QuadsViewFadingKt$$ExternalSyntheticLambda1;

    move-object v1, p0

    move-wide v2, p1

    move v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/smartengines/visualization/QuadsViewFadingKt$$ExternalSyntheticLambda1;-><init>(Lcom/smartengines/visualization/Visualization$Quads;JFI)V

    invoke-interface {p4, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_8
    return-void
.end method

.method private static final QuadsViewFading_iJQMabo$lambda$0(Landroidx/compose/runtime/State;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/QuadFrame;",
            ">;>;)",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/QuadFrame;",
            ">;"
        }
    .end annotation

    .line 120
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final QuadsViewFading_iJQMabo$lambda$4$lambda$3(Landroidx/compose/runtime/State;JFLandroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;
    .locals 18

    const-string v0, "$frames$delegate"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this$Canvas"

    move-object/from16 v6, p4

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 36
    invoke-static {v1}, Lcom/smartengines/visualization/QuadsViewFadingKt;->QuadsViewFading_iJQMabo$lambda$0(Landroidx/compose/runtime/State;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 121
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/smartengines/visualization/QuadFrame;

    .line 38
    invoke-static {v9, v7, v8}, Lcom/smartengines/visualization/QuadsViewFadingKt;->calculateAlpha(Lcom/smartengines/visualization/QuadFrame;J)F

    move-result v12

    const v1, 0x3dcccccd    # 0.1f

    cmpl-float v1, v12, v1

    if-lez v1, :cond_0

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-wide/from16 v10, p1

    .line 40
    invoke-static/range {v10 .. v17}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v3

    .line 44
    invoke-virtual {v9}, Lcom/smartengines/visualization/QuadFrame;->getQuads()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 122
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/visualization/Quad;

    .line 45
    invoke-virtual {v1}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v9}, Lcom/smartengines/visualization/QuadFrame;->getImageSize()Landroid/util/Size;

    move-result-object v2

    move/from16 v5, p3

    invoke-static/range {v1 .. v6}, Lcom/smartengines/visualization/QuadDrawingKt;->drawQuadPoints-XO-JAsU(Ljava/util/List;Landroid/util/Size;JFLandroidx/compose/ui/graphics/drawscope/DrawScope;)F

    move-object/from16 v6, p4

    goto :goto_1

    :cond_0
    move-object/from16 v6, p4

    goto :goto_0

    .line 49
    :cond_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final QuadsViewFading_iJQMabo$lambda$5(Lcom/smartengines/visualization/Visualization$Quads;JFILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    const-string p6, "$visObject"

    invoke-static {p0, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v5

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lcom/smartengines/visualization/QuadsViewFadingKt;->QuadsViewFading-iJQMabo(Lcom/smartengines/visualization/Visualization$Quads;JFLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$backgroundTask(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/smartengines/visualization/QuadsViewFadingKt;->backgroundTask(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$recalculate(Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/smartengines/visualization/QuadsViewFadingKt;->recalculate(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final backgroundTask(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/smartengines/visualization/QuadFrame;",
            ">;",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/QuadFrame;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 70
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 71
    new-instance v1, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2;

    invoke-direct {v1, v0, p1}, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlinx/coroutines/flow/MutableStateFlow;)V

    check-cast v1, Lkotlinx/coroutines/flow/FlowCollector;

    invoke-interface {p0, v1, p2}, Lkotlinx/coroutines/flow/Flow;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final calculateAlpha(Lcom/smartengines/visualization/QuadFrame;J)F
    .locals 4

    .line 59
    invoke-virtual {p0}, Lcom/smartengines/visualization/QuadFrame;->getTimestamp()J

    move-result-wide v0

    const-wide/16 v2, 0x12c

    add-long/2addr v0, v2

    sub-long/2addr p1, v0

    long-to-float p0, p1

    const-wide/16 p1, 0x7d0

    long-to-float p1, p1

    div-float/2addr p0, p1

    const/high16 p1, 0x3f800000    # 1.0f

    sub-float p0, p1, p0

    cmpl-float p2, p0, p1

    if-lez p2, :cond_0

    return p1

    :cond_0
    const/4 p1, 0x0

    cmpg-float p2, p0, p1

    if-gez p2, :cond_1

    return p1

    :cond_1
    return p0
.end method

.method private static final recalculate(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/QuadFrame;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/QuadFrame;",
            ">;"
        }
    .end annotation

    .line 95
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 96
    check-cast p0, Ljava/lang/Iterable;

    .line 117
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .line 118
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/smartengines/visualization/QuadFrame;

    .line 96
    invoke-virtual {v4}, Lcom/smartengines/visualization/QuadFrame;->getTimestamp()J

    move-result-wide v4

    sub-long v4, v0, v4

    const-wide/16 v6, 0x7d0

    cmp-long v4, v4, v6

    if-gez v4, :cond_0

    .line 118
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 119
    :cond_1
    check-cast v2, Ljava/util/List;

    return-object v2
.end method
