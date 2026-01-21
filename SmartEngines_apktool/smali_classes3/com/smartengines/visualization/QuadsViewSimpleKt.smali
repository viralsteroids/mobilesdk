.class public final Lcom/smartengines/visualization/QuadsViewSimpleKt;
.super Ljava/lang/Object;
.source "QuadsViewSimple.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQuadsViewSimple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuadsViewSimple.kt\ncom/smartengines/visualization/QuadsViewSimpleKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1225#2,6:44\n1225#2,6:50\n1863#3:56\n1863#3,2:57\n1864#3:59\n*S KotlinDebug\n*F\n+ 1 QuadsViewSimple.kt\ncom/smartengines/visualization/QuadsViewSimpleKt\n*L\n36#1:44,6\n37#1:50,6\n23#1:56\n24#1:57,2\n23#1:59\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\u001a-\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "QuadsViewSimple",
        "",
        "frames",
        "",
        "Lcom/smartengines/visualization/QuadFrame;",
        "lineColor",
        "Landroidx/compose/ui/graphics/Color;",
        "lineWidth",
        "",
        "QuadsViewSimple-iJQMabo",
        "(Ljava/util/List;JFLandroidx/compose/runtime/Composer;I)V",
        "Preview",
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
.method public static synthetic $r8$lambda$5z0FfGfaB2NAydSSB8JTtEpYJ7E(Ljava/util/List;JFILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/smartengines/visualization/QuadsViewSimpleKt;->QuadsViewSimple_iJQMabo$lambda$3(Ljava/util/List;JFILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Ml9zzB792nc9EiN49EUx5hMuV-M(Ljava/util/List;JFLandroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/smartengines/visualization/QuadsViewSimpleKt;->QuadsViewSimple_iJQMabo$lambda$2(Ljava/util/List;JFLandroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$wwfdnMeCH0nnatByeI67QglmO64(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/visualization/QuadsViewSimpleKt;->Preview$lambda$6(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final Preview(Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const v0, -0x1257d8ae

    .line 35
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    const-string p0, "C(Preview)35@1084L29,36@1132L31,37@1168L42,38@1215L39:QuadsViewSimple.kt#hal2ob"

    invoke-static {v5, p0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p1, :cond_1

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 40
    :cond_0
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    :cond_1
    :goto_0
    const p0, -0x462f861e

    .line 35
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p0, "CC(remember):QuadsViewSimple.kt#9igjgp"

    invoke-static {v5, p0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 44
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 45
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    .line 36
    invoke-static {}, Lcom/smartengines/visualization/MockKt;->getMockQuadsPrimary()Ljava/util/List;

    move-result-object v0

    .line 47
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 36
    :cond_2
    move-object v1, v0

    check-cast v1, Ljava/util/List;

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v0, -0x462f801c

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v5, p0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 50
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p0

    .line 51
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_3

    .line 37
    invoke-static {}, Lcom/smartengines/visualization/MockKt;->getMockQuadsSecondary()Ljava/util/List;

    move-result-object p0

    .line 53
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 37
    :cond_3
    check-cast p0, Ljava/util/List;

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 38
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getGreen-0d7_KjU()J

    move-result-wide v2

    const/high16 v4, 0x41400000    # 12.0f

    const/16 v6, 0x1b8

    invoke-static/range {v1 .. v6}, Lcom/smartengines/visualization/QuadsViewSimpleKt;->QuadsViewSimple-iJQMabo(Ljava/util/List;JFLandroidx/compose/runtime/Composer;I)V

    .line 39
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getRed-0d7_KjU()J

    move-result-wide v2

    const/high16 v4, 0x41000000    # 8.0f

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/smartengines/visualization/QuadsViewSimpleKt;->QuadsViewSimple-iJQMabo(Ljava/util/List;JFLandroidx/compose/runtime/Composer;I)V

    .line 40
    :goto_1
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, Lcom/smartengines/visualization/QuadsViewSimpleKt$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/smartengines/visualization/QuadsViewSimpleKt$$ExternalSyntheticLambda0;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_4
    return-void
.end method

.method private static final Preview$lambda$6(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/visualization/QuadsViewSimpleKt;->Preview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final QuadsViewSimple-iJQMabo(Ljava/util/List;JFLandroidx/compose/runtime/Composer;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/QuadFrame;",
            ">;JF",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "frames"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x30546f3c

    .line 18
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p4

    const-string v0, "C(QuadsViewSimple)P(!1,1:c#ui.graphics.Color)21@633L226:QuadsViewSimple.kt#hal2ob"

    invoke-static {p4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 22
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v1, Lcom/smartengines/visualization/QuadsViewSimpleKt$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/smartengines/visualization/QuadsViewSimpleKt$$ExternalSyntheticLambda1;-><init>(Ljava/util/List;JF)V

    const/4 v2, 0x6

    invoke-static {v0, v1, p4, v2}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p4

    if-eqz p4, :cond_0

    new-instance v0, Lcom/smartengines/visualization/QuadsViewSimpleKt$$ExternalSyntheticLambda2;

    move-object v1, p0

    move-wide v2, p1

    move v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/smartengines/visualization/QuadsViewSimpleKt$$ExternalSyntheticLambda2;-><init>(Ljava/util/List;JFI)V

    invoke-interface {p4, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_0
    return-void
.end method

.method private static final QuadsViewSimple_iJQMabo$lambda$2(Ljava/util/List;JFLandroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;
    .locals 9

    const-string v0, "$frames"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this$Canvas"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    check-cast p0, Ljava/lang/Iterable;

    .line 56
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/visualization/QuadFrame;

    .line 24
    invoke-virtual {v0}, Lcom/smartengines/visualization/QuadFrame;->getQuads()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 57
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/visualization/Quad;

    .line 25
    invoke-virtual {v2}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0}, Lcom/smartengines/visualization/QuadFrame;->getImageSize()Landroid/util/Size;

    move-result-object v4

    move-wide v5, p1

    move v7, p3

    move-object v8, p4

    invoke-static/range {v3 .. v8}, Lcom/smartengines/visualization/QuadDrawingKt;->drawQuadPoints-XO-JAsU(Ljava/util/List;Landroid/util/Size;JFLandroidx/compose/ui/graphics/drawscope/DrawScope;)F

    goto :goto_0

    .line 28
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final QuadsViewSimple_iJQMabo$lambda$3(Ljava/util/List;JFILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    const-string p6, "$frames"

    invoke-static {p0, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v5

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lcom/smartengines/visualization/QuadsViewSimpleKt;->QuadsViewSimple-iJQMabo(Ljava/util/List;JFLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
