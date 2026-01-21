.class public final Lcom/smartengines/visualization/QuadDrawingKt;
.super Ljava/lang/Object;
.source "QuadDrawing.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQuadDrawing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuadDrawing.kt\ncom/smartengines/visualization/QuadDrawingKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n128#2,7:94\n1225#3,6:101\n1225#3,6:107\n1225#3,6:113\n1863#4:119\n1863#4,2:120\n1864#4:122\n1863#4:123\n1863#4,2:124\n1864#4:126\n1863#4:127\n1863#4,2:128\n1864#4:130\n*S KotlinDebug\n*F\n+ 1 QuadDrawing.kt\ncom/smartengines/visualization/QuadDrawingKt\n*L\n31#1:94,7\n73#1:101,6\n74#1:107,6\n75#1:113,6\n77#1:119\n78#1:120,2\n77#1:122\n82#1:123\n83#1:124,2\n82#1:126\n87#1:127\n88#1:128,2\n87#1:130\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0001H\u0002\u00a2\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0013H\u0003\u00a2\u0006\u0002\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "drawQuadPoints",
        "",
        "quadPoints",
        "",
        "Lcom/smartengines/visualization/QuadPoint;",
        "field",
        "Landroid/util/Size;",
        "color",
        "Landroidx/compose/ui/graphics/Color;",
        "lineWidth",
        "scope",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "drawQuadPoints-XO-JAsU",
        "(Ljava/util/List;Landroid/util/Size;JFLandroidx/compose/ui/graphics/drawscope/DrawScope;)F",
        "offset",
        "Landroidx/compose/ui/geometry/Offset;",
        "scale",
        "(Lcom/smartengines/visualization/QuadPoint;F)J",
        "Preview",
        "",
        "(Landroidx/compose/runtime/Composer;I)V",
        "visualization_release"
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
.method public static synthetic $r8$lambda$AunxsihSKFO7hR7-QyYG2dmDqp8(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/smartengines/visualization/QuadDrawingKt;->Preview$lambda$12(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$gsJb9bLOkW2HvFvBZaDjsm5EFPc(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/visualization/QuadDrawingKt;->Preview$lambda$13(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final Preview(Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const v0, -0x3ef0ad22

    .line 72
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p0

    const-string v0, "C(Preview)72@2531L29,73@2579L31,74@2629L34,75@2668L565:QuadDrawing.kt#hal2ob"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p1, :cond_1

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 92
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    :cond_1
    :goto_0
    const v0, -0x462ed13e

    .line 72
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "CC(remember):QuadDrawing.kt#9igjgp"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 101
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 102
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_2

    .line 73
    invoke-static {}, Lcom/smartengines/visualization/MockKt;->getMockQuadsPrimary()Ljava/util/List;

    move-result-object v1

    .line 104
    invoke-interface {p0, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 73
    :cond_2
    check-cast v1, Ljava/util/List;

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v2, -0x462ecb3c

    invoke-interface {p0, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 107
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 108
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_3

    .line 74
    invoke-static {}, Lcom/smartengines/visualization/MockKt;->getMockQuadsSecondary()Ljava/util/List;

    move-result-object v2

    .line 110
    invoke-interface {p0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 74
    :cond_3
    check-cast v2, Ljava/util/List;

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v3, -0x462ec4f9

    invoke-interface {p0, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 113
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 114
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_4

    .line 75
    invoke-static {}, Lcom/smartengines/visualization/MockKt;->getMockQuadsSinglePoints()Ljava/util/List;

    move-result-object v0

    .line 116
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 75
    :cond_4
    check-cast v0, Ljava/util/List;

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 76
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v3, v6, v4, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v4, Lcom/smartengines/visualization/QuadDrawingKt$$ExternalSyntheticLambda0;

    invoke-direct {v4, v1, v2, v0}, Lcom/smartengines/visualization/QuadDrawingKt$$ExternalSyntheticLambda0;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    const/4 v0, 0x6

    invoke-static {v3, v4, p0, v0}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 92
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lcom/smartengines/visualization/QuadDrawingKt$$ExternalSyntheticLambda1;

    invoke-direct {v0, p1}, Lcom/smartengines/visualization/QuadDrawingKt$$ExternalSyntheticLambda1;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_5
    return-void
.end method

.method private static final Preview$lambda$12(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;
    .locals 11

    const-string v3, "$frames1"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$frames2"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$frames3"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$this$Canvas"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    .line 119
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/smartengines/visualization/QuadFrame;

    .line 78
    invoke-virtual {v3}, Lcom/smartengines/visualization/QuadFrame;->getQuads()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .line 120
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/smartengines/visualization/Quad;

    .line 79
    invoke-virtual {v4}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3}, Lcom/smartengines/visualization/QuadFrame;->getImageSize()Landroid/util/Size;

    move-result-object v5

    sget-object v6, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/graphics/Color$Companion;->getRed-0d7_KjU()J

    move-result-wide v6

    const/high16 v8, 0x41000000    # 8.0f

    move-object v9, p3

    invoke-static/range {v4 .. v9}, Lcom/smartengines/visualization/QuadDrawingKt;->drawQuadPoints-XO-JAsU(Ljava/util/List;Landroid/util/Size;JFLandroidx/compose/ui/graphics/drawscope/DrawScope;)F

    goto :goto_0

    .line 82
    :cond_1
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .line 123
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/visualization/QuadFrame;

    .line 83
    invoke-virtual {v1}, Lcom/smartengines/visualization/QuadFrame;->getQuads()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 124
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/smartengines/visualization/Quad;

    .line 84
    invoke-virtual {v4}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1}, Lcom/smartengines/visualization/QuadFrame;->getImageSize()Landroid/util/Size;

    move-result-object v5

    sget-object v6, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/graphics/Color$Companion;->getBlue-0d7_KjU()J

    move-result-wide v6

    const/high16 v8, 0x41000000    # 8.0f

    move-object v9, p3

    invoke-static/range {v4 .. v9}, Lcom/smartengines/visualization/QuadDrawingKt;->drawQuadPoints-XO-JAsU(Ljava/util/List;Landroid/util/Size;JFLandroidx/compose/ui/graphics/drawscope/DrawScope;)F

    goto :goto_1

    .line 87
    :cond_3
    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    .line 127
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/visualization/QuadFrame;

    .line 88
    invoke-virtual {v1}, Lcom/smartengines/visualization/QuadFrame;->getQuads()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 128
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/smartengines/visualization/Quad;

    .line 89
    invoke-virtual {v3}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1}, Lcom/smartengines/visualization/QuadFrame;->getImageSize()Landroid/util/Size;

    move-result-object v5

    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getYellow-0d7_KjU()J

    move-result-wide v6

    const/high16 v8, 0x41000000    # 8.0f

    move-object v9, p3

    invoke-static/range {v4 .. v9}, Lcom/smartengines/visualization/QuadDrawingKt;->drawQuadPoints-XO-JAsU(Ljava/util/List;Landroid/util/Size;JFLandroidx/compose/ui/graphics/drawscope/DrawScope;)F

    goto :goto_2

    .line 92
    :cond_5
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final Preview$lambda$13(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/visualization/QuadDrawingKt;->Preview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final drawQuadPoints-XO-JAsU(Ljava/util/List;Landroid/util/Size;JFLandroidx/compose/ui/graphics/drawscope/DrawScope;)F
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/QuadPoint;",
            ">;",
            "Landroid/util/Size;",
            "JF",
            "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
            ")F"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "field"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "scope"

    move-object/from16 v3, p5

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-interface {v3}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v1

    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v1, v4

    .line 27
    invoke-interface {v3}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v4

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v4, v5

    .line 28
    invoke-static {v1, v4}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 29
    invoke-interface {v3}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v4

    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v5, v1

    sub-float/2addr v4, v5

    const/4 v5, 0x2

    int-to-float v5, v5

    div-float/2addr v4, v5

    .line 30
    invoke-interface {v3}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v6

    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v6

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v1

    sub-float/2addr v6, v2

    div-float v2, v6, v5

    .line 94
    invoke-interface {v3}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v5

    invoke-interface {v5}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    move-result-object v5

    invoke-interface {v5, v4, v2}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V

    if-eqz v0, :cond_3

    .line 35
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x1

    if-le v5, v6, :cond_1

    .line 36
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    :goto_0
    if-ge v6, v5, :cond_0

    add-int/lit8 v7, v6, -0x1

    .line 39
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/smartengines/visualization/QuadPoint;

    invoke-static {v7, v1}, Lcom/smartengines/visualization/QuadDrawingKt;->offset(Lcom/smartengines/visualization/QuadPoint;F)J

    move-result-wide v7

    .line 40
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/smartengines/visualization/QuadPoint;

    invoke-static {v9, v1}, Lcom/smartengines/visualization/QuadDrawingKt;->offset(Lcom/smartengines/visualization/QuadPoint;F)J

    move-result-wide v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v15, 0x1f0

    const/16 v16, 0x0

    move v11, v6

    move-wide/from16 v21, v9

    move v9, v5

    move-wide v5, v7

    move-wide/from16 v7, v21

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v19, v2

    move-object v2, v3

    move/from16 v18, v4

    move/from16 v20, v17

    move-wide/from16 v3, p2

    move/from16 v17, v9

    move/from16 v9, p4

    .line 37
    :try_start_1
    invoke-static/range {v2 .. v16}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    add-int/lit8 v6, v20, 0x1

    move-object/from16 v3, p5

    move/from16 v5, v17

    move/from16 v4, v18

    move/from16 v2, v19

    goto :goto_0

    :cond_0
    move/from16 v19, v2

    move/from16 v18, v4

    .line 46
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/visualization/QuadPoint;

    invoke-static {v2, v1}, Lcom/smartengines/visualization/QuadDrawingKt;->offset(Lcom/smartengines/visualization/QuadPoint;F)J

    move-result-wide v5

    .line 47
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/visualization/QuadPoint;

    invoke-static {v0, v1}, Lcom/smartengines/visualization/QuadDrawingKt;->offset(Lcom/smartengines/visualization/QuadPoint;F)J

    move-result-wide v7

    const/16 v15, 0x1f0

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-wide/from16 v3, p2

    move/from16 v9, p4

    move-object/from16 v2, p5

    .line 44
    invoke-static/range {v2 .. v16}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    goto :goto_1

    :cond_1
    move/from16 v19, v2

    move/from16 v18, v4

    .line 53
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v6, :cond_2

    .line 57
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/visualization/QuadPoint;

    invoke-static {v0, v1}, Lcom/smartengines/visualization/QuadDrawingKt;->offset(Lcom/smartengines/visualization/QuadPoint;F)J

    move-result-wide v6

    const/16 v12, 0x78

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-wide/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v2, p5

    .line 54
    invoke-static/range {v2 .. v13}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawCircle-VaOC9Bg$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    :goto_1
    move/from16 v4, v18

    move/from16 v6, v19

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    move/from16 v19, v2

    move/from16 v18, v4

    .line 98
    :goto_2
    invoke-interface/range {p5 .. p5}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    move-result-object v1

    move/from16 v4, v18

    neg-float v2, v4

    move/from16 v6, v19

    neg-float v3, v6

    invoke-interface {v1, v2, v3}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V

    throw v0

    :cond_3
    move v6, v2

    :goto_3
    invoke-interface/range {p5 .. p5}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    move-result-object v0

    neg-float v2, v4

    neg-float v3, v6

    invoke-interface {v0, v2, v3}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V

    return v1
.end method

.method private static final offset(Lcom/smartengines/visualization/QuadPoint;F)J
    .locals 1

    .line 66
    invoke-virtual {p0}, Lcom/smartengines/visualization/QuadPoint;->getX()F

    move-result v0

    mul-float/2addr v0, p1

    invoke-virtual {p0}, Lcom/smartengines/visualization/QuadPoint;->getY()F

    move-result p0

    mul-float/2addr p0, p1

    invoke-static {v0, p0}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide p0

    return-wide p0
.end method
