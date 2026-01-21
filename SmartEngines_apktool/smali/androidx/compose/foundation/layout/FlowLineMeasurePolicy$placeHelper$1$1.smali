.class final Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "FlowLayout.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->placeHelper([Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;I[III[IIII)Landroidx/compose/ui/layout/MeasureResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $beforeCrossAxisAlignmentLine:I

.field final synthetic $crossAxisLayoutSize:I

.field final synthetic $crossAxisOffset:[I

.field final synthetic $currentLineIndex:I

.field final synthetic $endIndex:I

.field final synthetic $mainAxisPositions:[I

.field final synthetic $placeables:[Landroidx/compose/ui/layout/Placeable;

.field final synthetic $startIndex:I

.field final synthetic $this_with:Landroidx/compose/ui/layout/MeasureScope;

.field final synthetic this$0:Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;


# direct methods
.method constructor <init>([IIII[Landroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;ILandroidx/compose/ui/layout/MeasureScope;I[I)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$crossAxisOffset:[I

    iput p2, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$currentLineIndex:I

    iput p3, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$startIndex:I

    iput p4, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$endIndex:I

    iput-object p5, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$placeables:[Landroidx/compose/ui/layout/Placeable;

    iput-object p6, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->this$0:Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;

    iput p7, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$crossAxisLayoutSize:I

    iput-object p8, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$this_with:Landroidx/compose/ui/layout/MeasureScope;

    iput p9, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$beforeCrossAxisAlignmentLine:I

    iput-object p10, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$mainAxisPositions:[I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 557
    check-cast p1, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V
    .locals 10

    .line 558
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$crossAxisOffset:[I

    if-eqz v0, :cond_0

    iget v1, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$currentLineIndex:I

    aget v0, v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 559
    :goto_0
    iget v1, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$startIndex:I

    :goto_1
    iget v2, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$endIndex:I

    if-ge v1, v2, :cond_2

    .line 560
    iget-object v2, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$placeables:[Landroidx/compose/ui/layout/Placeable;

    aget-object v4, v2, v1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 561
    iget-object v3, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->this$0:Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;

    .line 563
    invoke-static {v4}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/Placeable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    move-result-object v5

    .line 564
    iget v6, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$crossAxisLayoutSize:I

    .line 565
    iget-object v2, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$this_with:Landroidx/compose/ui/layout/MeasureScope;

    invoke-interface {v2}, Landroidx/compose/ui/layout/MeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v7

    .line 566
    iget v8, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$beforeCrossAxisAlignmentLine:I

    .line 561
    invoke-interface/range {v3 .. v8}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->getCrossAxisPosition(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/layout/RowColumnParentData;ILandroidx/compose/ui/unit/LayoutDirection;I)I

    move-result v2

    add-int v5, v2, v0

    .line 568
    iget-object v2, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->this$0:Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;

    invoke-interface {v2}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->isHorizontal()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 570
    iget-object v2, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$mainAxisPositions:[I

    iget v3, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$startIndex:I

    sub-int v3, v1, v3

    aget v2, v2, v3

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    move v6, v5

    move v5, v2

    .line 569
    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    goto :goto_2

    :cond_1
    move-object v3, p1

    .line 576
    iget-object p1, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$mainAxisPositions:[I

    iget v2, p0, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy$placeHelper$1$1;->$startIndex:I

    sub-int v2, v1, v2

    aget v6, p1, v2

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 574
    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    move-object p1, v3

    goto :goto_1

    :cond_2
    return-void
.end method
