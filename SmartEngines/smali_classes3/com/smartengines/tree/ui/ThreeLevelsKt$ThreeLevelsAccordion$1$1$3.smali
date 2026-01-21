.class final Lcom/smartengines/tree/ui/ThreeLevelsKt$ThreeLevelsAccordion$1$1$3;
.super Ljava/lang/Object;
.source "ThreeLevels.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/tree/ui/ThreeLevelsKt;->ThreeLevelsAccordion(ILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/animation/AnimatedVisibilityScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
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
.field final synthetic $colNumber:I

.field final synthetic $node:Lcom/smartengines/tree/TreeNode;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field final synthetic $onNodeClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TT;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $secondLevelNodeContent:Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function4<",
            "TT;",
            "Ljava/lang/Boolean;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $thirdLevelNodeContent:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "TT;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/smartengines/tree/TreeNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function4<",
            "-TT;-",
            "Ljava/lang/Boolean;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-TT;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$ThreeLevelsAccordion$1$1$3;->$node:Lcom/smartengines/tree/TreeNode;

    iput p2, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$ThreeLevelsAccordion$1$1$3;->$colNumber:I

    iput-object p3, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$ThreeLevelsAccordion$1$1$3;->$onNodeClick:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$ThreeLevelsAccordion$1$1$3;->$secondLevelNodeContent:Lkotlin/jvm/functions/Function4;

    iput-object p5, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$ThreeLevelsAccordion$1$1$3;->$thirdLevelNodeContent:Lkotlin/jvm/functions/Function3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 54
    check-cast p1, Landroidx/compose/animation/AnimatedVisibilityScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/tree/ui/ThreeLevelsKt$ThreeLevelsAccordion$1$1$3;->invoke(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const-string p3, "$this$AnimatedVisibility"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C*55@2228L337:ThreeLevels.kt#snoj4b"

    invoke-static {p2, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 55
    iget-object p1, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$ThreeLevelsAccordion$1$1$3;->$node:Lcom/smartengines/tree/TreeNode;

    invoke-interface {p1}, Lcom/smartengines/tree/TreeNode;->getChildren()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$ThreeLevelsAccordion$1$1$3;->$colNumber:I

    iget-object v2, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$ThreeLevelsAccordion$1$1$3;->$onNodeClick:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$ThreeLevelsAccordion$1$1$3;->$secondLevelNodeContent:Lkotlin/jvm/functions/Function4;

    iget-object v4, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$ThreeLevelsAccordion$1$1$3;->$thirdLevelNodeContent:Lkotlin/jvm/functions/Function3;

    const/16 v6, 0x40

    move-object v5, p2

    .line 56
    invoke-static/range {v0 .. v6}, Lcom/smartengines/tree/ui/TwoLevelsKt;->TwoLevelsIconsRows(ILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
