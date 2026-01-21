.class public final Landroidx/compose/ui/graphics/vector/PathNodeKt;
.super Ljava/lang/Object;
.source "PathNode.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,419:1\n338#1,7:420\n338#1,7:427\n338#1,7:434\n338#1,7:441\n338#1,7:448\n338#1,7:455\n338#1,7:462\n338#1,7:469\n338#1,7:476\n338#1,7:483\n338#1,7:490\n338#1,7:497\n338#1,7:504\n338#1,7:511\n338#1,7:518\n338#1,7:525\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n158#1:420,7\n167#1:427,7\n171#1:434,7\n180#1:441,7\n189#1:448,7\n198#1:455,7\n207#1:462,7\n223#1:469,7\n234#1:476,7\n248#1:483,7\n262#1:490,7\n276#1:497,7\n285#1:504,7\n294#1:511,7\n303#1:518,7\n315#1:525,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0000\n\u0002\u0010\u000c\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u001f\u001a\u00020 2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0008H\u0002\u001ai\u0010\'\u001a\u00020 2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00082\u0006\u0010(\u001a\u00020\u000828\u0008\u0004\u0010)\u001a2\u0012\u0013\u0012\u00110%\u00a2\u0006\u000c\u0008+\u0012\u0008\u0008,\u0012\u0004\u0008\u0008(-\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008+\u0012\u0008\u0008,\u0012\u0004\u0008\u0008(.\u0012\u0004\u0012\u00020#0*H\u0082\u0008\u001a&\u0010/\u001a\u00020 2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0008H\u0002\u001a4\u00100\u001a\u00020 *\u00020\u00012\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020#01j\u0008\u0012\u0004\u0012\u00020#`22\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0008H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u00063"
    }
    d2 = {
        "ArcToKey",
        "",
        "CloseKey",
        "CurveToKey",
        "HorizontalToKey",
        "LineToKey",
        "MoveToKey",
        "NUM_ARC_TO_ARGS",
        "",
        "NUM_CURVE_TO_ARGS",
        "NUM_HORIZONTAL_TO_ARGS",
        "NUM_LINE_TO_ARGS",
        "NUM_MOVE_TO_ARGS",
        "NUM_QUAD_TO_ARGS",
        "NUM_REFLECTIVE_CURVE_TO_ARGS",
        "NUM_REFLECTIVE_QUAD_TO_ARGS",
        "NUM_VERTICAL_TO_ARGS",
        "QuadToKey",
        "ReflectiveCurveToKey",
        "ReflectiveQuadToKey",
        "RelativeArcToKey",
        "RelativeCloseKey",
        "RelativeCurveToKey",
        "RelativeHorizontalToKey",
        "RelativeLineToKey",
        "RelativeMoveToKey",
        "RelativeQuadToKey",
        "RelativeReflectiveCurveToKey",
        "RelativeReflectiveQuadToKey",
        "RelativeVerticalToKey",
        "VerticalToKey",
        "pathMoveNodeFromArgs",
        "",
        "nodes",
        "",
        "Landroidx/compose/ui/graphics/vector/PathNode;",
        "args",
        "",
        "count",
        "pathNodesFromArgs",
        "numArgs",
        "nodeFor",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "subArray",
        "start",
        "pathRelativeMoveNodeFromArgs",
        "addPathNodes",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "ui-graphics_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ArcToKey:C = 'A'

.field private static final CloseKey:C = 'Z'

.field private static final CurveToKey:C = 'C'

.field private static final HorizontalToKey:C = 'H'

.field private static final LineToKey:C = 'L'

.field private static final MoveToKey:C = 'M'

.field private static final NUM_ARC_TO_ARGS:I = 0x7

.field private static final NUM_CURVE_TO_ARGS:I = 0x6

.field private static final NUM_HORIZONTAL_TO_ARGS:I = 0x1

.field private static final NUM_LINE_TO_ARGS:I = 0x2

.field private static final NUM_MOVE_TO_ARGS:I = 0x2

.field private static final NUM_QUAD_TO_ARGS:I = 0x4

.field private static final NUM_REFLECTIVE_CURVE_TO_ARGS:I = 0x4

.field private static final NUM_REFLECTIVE_QUAD_TO_ARGS:I = 0x2

.field private static final NUM_VERTICAL_TO_ARGS:I = 0x1

.field private static final QuadToKey:C = 'Q'

.field private static final ReflectiveCurveToKey:C = 'S'

.field private static final ReflectiveQuadToKey:C = 'T'

.field private static final RelativeArcToKey:C = 'a'

.field private static final RelativeCloseKey:C = 'z'

.field private static final RelativeCurveToKey:C = 'c'

.field private static final RelativeHorizontalToKey:C = 'h'

.field private static final RelativeLineToKey:C = 'l'

.field private static final RelativeMoveToKey:C = 'm'

.field private static final RelativeQuadToKey:C = 'q'

.field private static final RelativeReflectiveCurveToKey:C = 's'

.field private static final RelativeReflectiveQuadToKey:C = 't'

.field private static final RelativeVerticalToKey:C = 'v'

.field private static final VerticalToKey:C = 'V'


# direct methods
.method public static final addPathNodes(CLjava/util/ArrayList;[FI)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(C",
            "Ljava/util/ArrayList<",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;[FI)V"
        }
    .end annotation

    const/16 v0, 0x7a

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x5a

    if-ne p0, v0, :cond_1

    .line 152
    :goto_0
    sget-object p0, Landroidx/compose/ui/graphics/vector/PathNode$Close;->INSTANCE:Landroidx/compose/ui/graphics/vector/PathNode$Close;

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    const/16 v0, 0x6d

    if-ne p0, v0, :cond_2

    .line 154
    check-cast p1, Ljava/util/List;

    invoke-static {p1, p2, p3}, Landroidx/compose/ui/graphics/vector/PathNodeKt;->pathRelativeMoveNodeFromArgs(Ljava/util/List;[FI)V

    return-void

    :cond_2
    const/16 v0, 0x4d

    if-ne p0, v0, :cond_3

    .line 156
    check-cast p1, Ljava/util/List;

    invoke-static {p1, p2, p3}, Landroidx/compose/ui/graphics/vector/PathNodeKt;->pathMoveNodeFromArgs(Ljava/util/List;[FI)V

    return-void

    :cond_3
    const/16 v0, 0x6c

    const/4 v1, 0x0

    if-ne p0, v0, :cond_4

    add-int/lit8 p3, p3, -0x2

    :goto_1
    if-gt v1, p3, :cond_17

    .line 423
    move-object p0, p1

    check-cast p0, Ljava/util/List;

    .line 164
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    aget v2, p2, v1

    add-int/lit8 v3, v1, 0x1

    aget v3, p2, v3

    invoke-direct {v0, v2, v3}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    check-cast v0, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 423
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x2

    goto :goto_1

    :cond_4
    const/16 v0, 0x4c

    if-ne p0, v0, :cond_5

    add-int/lit8 p3, p3, -0x2

    :goto_2
    if-gt v1, p3, :cond_17

    .line 430
    move-object p0, p1

    check-cast p0, Ljava/util/List;

    .line 168
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    aget v2, p2, v1

    add-int/lit8 v3, v1, 0x1

    aget v3, p2, v3

    invoke-direct {v0, v2, v3}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    check-cast v0, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 430
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x2

    goto :goto_2

    :cond_5
    const/16 v0, 0x68

    const/4 v2, 0x1

    if-ne p0, v0, :cond_6

    sub-int/2addr p3, v2

    :goto_3
    if-gt v1, p3, :cond_17

    .line 437
    move-object p0, p1

    check-cast p0, Ljava/util/List;

    .line 177
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;

    aget v2, p2, v1

    invoke-direct {v0, v2}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;-><init>(F)V

    check-cast v0, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 437
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_6
    const/16 v0, 0x48

    if-ne p0, v0, :cond_7

    sub-int/2addr p3, v2

    :goto_4
    if-gt v1, p3, :cond_17

    .line 444
    move-object p0, p1

    check-cast p0, Ljava/util/List;

    .line 186
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;

    aget v2, p2, v1

    invoke-direct {v0, v2}, Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;-><init>(F)V

    check-cast v0, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 444
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_7
    const/16 v0, 0x76

    if-ne p0, v0, :cond_8

    sub-int/2addr p3, v2

    :goto_5
    if-gt v1, p3, :cond_17

    .line 451
    move-object p0, p1

    check-cast p0, Ljava/util/List;

    .line 195
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;

    aget v2, p2, v1

    invoke-direct {v0, v2}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;-><init>(F)V

    check-cast v0, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 451
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_8
    const/16 v0, 0x56

    if-ne p0, v0, :cond_9

    sub-int/2addr p3, v2

    :goto_6
    if-gt v1, p3, :cond_17

    .line 458
    move-object p0, p1

    check-cast p0, Ljava/util/List;

    .line 204
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;

    aget v2, p2, v1

    invoke-direct {v0, v2}, Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;-><init>(F)V

    check-cast v0, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 458
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_9
    const/16 v0, 0x63

    if-ne p0, v0, :cond_a

    add-int/lit8 p3, p3, -0x6

    :goto_7
    if-gt v1, p3, :cond_17

    .line 465
    move-object p0, p1

    check-cast p0, Ljava/util/List;

    .line 213
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;

    .line 214
    aget v3, p2, v1

    add-int/lit8 v0, v1, 0x1

    .line 215
    aget v4, p2, v0

    add-int/lit8 v0, v1, 0x2

    .line 216
    aget v5, p2, v0

    add-int/lit8 v0, v1, 0x3

    .line 217
    aget v6, p2, v0

    add-int/lit8 v0, v1, 0x4

    .line 218
    aget v7, p2, v0

    add-int/lit8 v0, v1, 0x5

    .line 219
    aget v8, p2, v0

    .line 213
    invoke-direct/range {v2 .. v8}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;-><init>(FFFFFF)V

    check-cast v2, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 465
    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x6

    goto :goto_7

    :cond_a
    const/16 v0, 0x43

    if-ne p0, v0, :cond_b

    add-int/lit8 p3, p3, -0x6

    :goto_8
    if-gt v1, p3, :cond_17

    .line 472
    move-object p0, p1

    check-cast p0, Ljava/util/List;

    .line 224
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;

    .line 225
    aget v3, p2, v1

    add-int/lit8 v0, v1, 0x1

    .line 226
    aget v4, p2, v0

    add-int/lit8 v0, v1, 0x2

    .line 227
    aget v5, p2, v0

    add-int/lit8 v0, v1, 0x3

    .line 228
    aget v6, p2, v0

    add-int/lit8 v0, v1, 0x4

    .line 229
    aget v7, p2, v0

    add-int/lit8 v0, v1, 0x5

    .line 230
    aget v8, p2, v0

    .line 224
    invoke-direct/range {v2 .. v8}, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;-><init>(FFFFFF)V

    check-cast v2, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 472
    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x6

    goto :goto_8

    :cond_b
    const/16 v0, 0x73

    if-ne p0, v0, :cond_c

    add-int/lit8 p3, p3, -0x4

    :goto_9
    if-gt v1, p3, :cond_17

    .line 479
    move-object p0, p1

    check-cast p0, Ljava/util/List;

    .line 240
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;

    .line 241
    aget v2, p2, v1

    add-int/lit8 v3, v1, 0x1

    .line 242
    aget v3, p2, v3

    add-int/lit8 v4, v1, 0x2

    .line 243
    aget v4, p2, v4

    add-int/lit8 v5, v1, 0x3

    .line 244
    aget v5, p2, v5

    .line 240
    invoke-direct {v0, v2, v3, v4, v5}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;-><init>(FFFF)V

    check-cast v0, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 479
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x4

    goto :goto_9

    :cond_c
    const/16 v0, 0x53

    if-ne p0, v0, :cond_d

    add-int/lit8 p3, p3, -0x4

    :goto_a
    if-gt v1, p3, :cond_17

    .line 486
    move-object p0, p1

    check-cast p0, Ljava/util/List;

    .line 254
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;

    .line 255
    aget v2, p2, v1

    add-int/lit8 v3, v1, 0x1

    .line 256
    aget v3, p2, v3

    add-int/lit8 v4, v1, 0x2

    .line 257
    aget v4, p2, v4

    add-int/lit8 v5, v1, 0x3

    .line 258
    aget v5, p2, v5

    .line 254
    invoke-direct {v0, v2, v3, v4, v5}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;-><init>(FFFF)V

    check-cast v0, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 486
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x4

    goto :goto_a

    :cond_d
    const/16 v0, 0x71

    if-ne p0, v0, :cond_e

    add-int/lit8 p3, p3, -0x4

    :goto_b
    if-gt v1, p3, :cond_17

    .line 493
    move-object p0, p1

    check-cast p0, Ljava/util/List;

    .line 268
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;

    .line 269
    aget v2, p2, v1

    add-int/lit8 v3, v1, 0x1

    .line 270
    aget v3, p2, v3

    add-int/lit8 v4, v1, 0x2

    .line 271
    aget v4, p2, v4

    add-int/lit8 v5, v1, 0x3

    .line 272
    aget v5, p2, v5

    .line 268
    invoke-direct {v0, v2, v3, v4, v5}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;-><init>(FFFF)V

    check-cast v0, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 493
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x4

    goto :goto_b

    :cond_e
    const/16 v0, 0x51

    if-ne p0, v0, :cond_f

    add-int/lit8 p3, p3, -0x4

    :goto_c
    if-gt v1, p3, :cond_17

    .line 500
    move-object p0, p1

    check-cast p0, Ljava/util/List;

    .line 277
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;

    .line 278
    aget v2, p2, v1

    add-int/lit8 v3, v1, 0x1

    .line 279
    aget v3, p2, v3

    add-int/lit8 v4, v1, 0x2

    .line 280
    aget v4, p2, v4

    add-int/lit8 v5, v1, 0x3

    .line 281
    aget v5, p2, v5

    .line 277
    invoke-direct {v0, v2, v3, v4, v5}, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;-><init>(FFFF)V

    check-cast v0, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 500
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x4

    goto :goto_c

    :cond_f
    const/16 v0, 0x74

    if-ne p0, v0, :cond_10

    add-int/lit8 p3, p3, -0x2

    :goto_d
    if-gt v1, p3, :cond_17

    .line 507
    move-object p0, p1

    check-cast p0, Ljava/util/List;

    .line 291
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;

    aget v2, p2, v1

    add-int/lit8 v3, v1, 0x1

    aget v3, p2, v3

    invoke-direct {v0, v2, v3}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;-><init>(FF)V

    check-cast v0, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 507
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x2

    goto :goto_d

    :cond_10
    const/16 v0, 0x54

    if-ne p0, v0, :cond_11

    add-int/lit8 p3, p3, -0x2

    :goto_e
    if-gt v1, p3, :cond_17

    .line 514
    move-object p0, p1

    check-cast p0, Ljava/util/List;

    .line 300
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;

    aget v2, p2, v1

    add-int/lit8 v3, v1, 0x1

    aget v3, p2, v3

    invoke-direct {v0, v2, v3}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;-><init>(FF)V

    check-cast v0, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 514
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x2

    goto :goto_e

    :cond_11
    const/16 v0, 0x61

    const/4 v3, 0x0

    if-ne p0, v0, :cond_14

    add-int/lit8 p3, p3, -0x7

    move p0, v1

    :goto_f
    if-gt p0, p3, :cond_17

    .line 521
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    .line 304
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;

    .line 305
    aget v5, p2, p0

    add-int/lit8 v6, p0, 0x1

    .line 306
    aget v6, p2, v6

    add-int/lit8 v7, p0, 0x2

    .line 307
    aget v7, p2, v7

    add-int/lit8 v8, p0, 0x3

    .line 308
    aget v8, p2, v8

    invoke-static {v8, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-eqz v8, :cond_12

    move v8, v2

    goto :goto_10

    :cond_12
    move v8, v1

    :goto_10
    add-int/lit8 v9, p0, 0x4

    .line 309
    aget v9, p2, v9

    invoke-static {v9, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-eqz v9, :cond_13

    move v9, v2

    goto :goto_11

    :cond_13
    move v9, v1

    :goto_11
    add-int/lit8 v10, p0, 0x5

    .line 310
    aget v10, p2, v10

    add-int/lit8 v11, p0, 0x6

    .line 311
    aget v11, p2, v11

    .line 304
    invoke-direct/range {v4 .. v11}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;-><init>(FFFZZFF)V

    check-cast v4, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 521
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p0, p0, 0x7

    goto :goto_f

    :cond_14
    const/16 v0, 0x41

    if-ne p0, v0, :cond_18

    add-int/lit8 p3, p3, -0x7

    move p0, v1

    :goto_12
    if-gt p0, p3, :cond_17

    .line 528
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    .line 316
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;

    .line 317
    aget v5, p2, p0

    add-int/lit8 v6, p0, 0x1

    .line 318
    aget v6, p2, v6

    add-int/lit8 v7, p0, 0x2

    .line 319
    aget v7, p2, v7

    add-int/lit8 v8, p0, 0x3

    .line 320
    aget v8, p2, v8

    invoke-static {v8, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-eqz v8, :cond_15

    move v8, v2

    goto :goto_13

    :cond_15
    move v8, v1

    :goto_13
    add-int/lit8 v9, p0, 0x4

    .line 321
    aget v9, p2, v9

    invoke-static {v9, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-eqz v9, :cond_16

    move v9, v2

    goto :goto_14

    :cond_16
    move v9, v1

    :goto_14
    add-int/lit8 v10, p0, 0x5

    .line 322
    aget v10, p2, v10

    add-int/lit8 v11, p0, 0x6

    .line 323
    aget v11, p2, v11

    .line 316
    invoke-direct/range {v4 .. v11}, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;-><init>(FFFZZFF)V

    check-cast v4, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 528
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p0, p0, 0x7

    goto :goto_12

    :cond_17
    return-void

    .line 327
    :cond_18
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Unknown command for: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final pathMoveNodeFromArgs(Ljava/util/List;[FI)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;[FI)V"
        }
    .end annotation

    const/4 v0, 0x2

    sub-int/2addr p2, v0

    if-ltz p2, :cond_0

    .line 355
    new-instance v1, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    const/4 v2, 0x0

    aget v2, p1, v2

    const/4 v3, 0x1

    aget v3, p1, v3

    invoke-direct {v1, v2, v3}, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;-><init>(FF)V

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    if-gt v0, p2, :cond_0

    .line 358
    new-instance v1, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    aget v2, p1, v0

    add-int/lit8 v3, v0, 0x1

    aget v3, p1, v3

    invoke-direct {v1, v2, v3}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static final pathNodesFromArgs(Ljava/util/List;[FIILkotlin/jvm/functions/Function2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;[FII",
            "Lkotlin/jvm/functions/Function2<",
            "-[F-",
            "Ljava/lang/Integer;",
            "+",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;)V"
        }
    .end annotation

    sub-int/2addr p2, p3

    const/4 v0, 0x0

    :goto_0
    if-gt v0, p2, :cond_0

    .line 341
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p4, p1, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v0, p3

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static final pathRelativeMoveNodeFromArgs(Ljava/util/List;[FI)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;[FI)V"
        }
    .end annotation

    const/4 v0, 0x2

    sub-int/2addr p2, v0

    if-ltz p2, :cond_0

    .line 373
    new-instance v1, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    const/4 v2, 0x0

    aget v2, p1, v2

    const/4 v3, 0x1

    aget v3, p1, v3

    invoke-direct {v1, v2, v3}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;-><init>(FF)V

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    if-gt v0, p2, :cond_0

    .line 376
    new-instance v1, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    aget v2, p1, v0

    add-int/lit8 v3, v0, 0x1

    aget v3, p1, v3

    invoke-direct {v1, v2, v3}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_0
    return-void
.end method
