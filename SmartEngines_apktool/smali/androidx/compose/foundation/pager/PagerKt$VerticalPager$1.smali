.class final Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Pager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/pager/PagerKt;->VerticalPager-oI3XNZo(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$changed1:I

.field final synthetic $$default:I

.field final synthetic $beyondViewportPageCount:I

.field final synthetic $contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field final synthetic $flingBehavior:Landroidx/compose/foundation/gestures/TargetedFlingBehavior;

.field final synthetic $horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

.field final synthetic $key:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $pageContent:Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function4<",
            "Landroidx/compose/foundation/pager/PagerScope;",
            "Ljava/lang/Integer;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $pageNestedScrollConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

.field final synthetic $pageSize:Landroidx/compose/foundation/pager/PageSize;

.field final synthetic $pageSpacing:F

.field final synthetic $reverseLayout:Z

.field final synthetic $snapPosition:Landroidx/compose/foundation/gestures/snapping/SnapPosition;

.field final synthetic $state:Landroidx/compose/foundation/pager/PagerState;

.field final synthetic $userScrollEnabled:Z


# direct methods
.method constructor <init>(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/pager/PagerState;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/foundation/pager/PageSize;",
            "IF",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
            "Landroidx/compose/foundation/gestures/snapping/SnapPosition;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Landroidx/compose/foundation/pager/PagerScope;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;III)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    iput-object p2, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    iput-object p4, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$pageSize:Landroidx/compose/foundation/pager/PageSize;

    iput p5, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$beyondViewportPageCount:I

    iput p6, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$pageSpacing:F

    iput-object p7, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    iput-object p8, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$flingBehavior:Landroidx/compose/foundation/gestures/TargetedFlingBehavior;

    iput-boolean p9, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$userScrollEnabled:Z

    iput-boolean p10, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$reverseLayout:Z

    iput-object p11, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$key:Lkotlin/jvm/functions/Function1;

    iput-object p12, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$pageNestedScrollConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    iput-object p13, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$snapPosition:Landroidx/compose/foundation/gestures/snapping/SnapPosition;

    iput-object p14, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$pageContent:Lkotlin/jvm/functions/Function4;

    iput p15, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$$changed:I

    move/from16 p1, p16

    iput p1, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$$changed1:I

    move/from16 p1, p17

    iput p1, p0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$$default:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    iget-object v2, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$modifier:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    iget-object v4, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$pageSize:Landroidx/compose/foundation/pager/PageSize;

    iget v5, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$beyondViewportPageCount:I

    iget v6, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$pageSpacing:F

    iget-object v7, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    iget-object v8, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$flingBehavior:Landroidx/compose/foundation/gestures/TargetedFlingBehavior;

    iget-boolean v9, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$userScrollEnabled:Z

    iget-boolean v10, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$reverseLayout:Z

    iget-object v11, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$key:Lkotlin/jvm/functions/Function1;

    iget-object v12, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$pageNestedScrollConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    iget-object v13, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$snapPosition:Landroidx/compose/foundation/gestures/snapping/SnapPosition;

    iget-object v14, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$pageContent:Lkotlin/jvm/functions/Function4;

    iget v15, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$$changed:I

    or-int/lit8 v15, v15, 0x1

    invoke-static {v15}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v16

    iget v15, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$$changed1:I

    invoke-static {v15}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v17

    iget v15, v0, Landroidx/compose/foundation/pager/PagerKt$VerticalPager$1;->$$default:I

    move/from16 v18, v15

    move-object/from16 v15, p1

    invoke-static/range {v1 .. v18}, Landroidx/compose/foundation/pager/PagerKt;->VerticalPager-oI3XNZo(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V

    return-void
.end method
