.class final Lcom/smartengines/tree/ui/MultiLevelKt$MultiLevelTreeView$1$2$1;
.super Ljava/lang/Object;
.source "MultiLevel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/tree/ui/MultiLevelKt;->MultiLevelTreeView(Lcom/smartengines/tree/ui/MultiLevelTreeModel;Lkotlin/jvm/functions/Function1;Lcom/smartengines/tree/ui/TreeViewOptions;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
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
.field final synthetic $model:Lcom/smartengines/tree/ui/MultiLevelTreeModel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/smartengines/tree/ui/MultiLevelTreeModel<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic $onLeafClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TT;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $row:Lcom/smartengines/tree/ui/RowData;


# direct methods
.method constructor <init>(Lcom/smartengines/tree/ui/RowData;Lkotlin/jvm/functions/Function1;Lcom/smartengines/tree/ui/MultiLevelTreeModel;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/tree/ui/RowData;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/smartengines/tree/ui/MultiLevelTreeModel<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/tree/ui/MultiLevelKt$MultiLevelTreeView$1$2$1;->$row:Lcom/smartengines/tree/ui/RowData;

    iput-object p2, p0, Lcom/smartengines/tree/ui/MultiLevelKt$MultiLevelTreeView$1$2$1;->$onLeafClick:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/smartengines/tree/ui/MultiLevelKt$MultiLevelTreeView$1$2$1;->$model:Lcom/smartengines/tree/ui/MultiLevelTreeModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 56
    invoke-virtual {p0}, Lcom/smartengines/tree/ui/MultiLevelKt$MultiLevelTreeView$1$2$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 57
    iget-object v0, p0, Lcom/smartengines/tree/ui/MultiLevelKt$MultiLevelTreeView$1$2$1;->$row:Lcom/smartengines/tree/ui/RowData;

    invoke-virtual {v0}, Lcom/smartengines/tree/ui/RowData;->getNode()Lcom/smartengines/tree/TreeNode;

    move-result-object v0

    invoke-interface {v0}, Lcom/smartengines/tree/TreeNode;->isLeaf()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    iget-object v0, p0, Lcom/smartengines/tree/ui/MultiLevelKt$MultiLevelTreeView$1$2$1;->$onLeafClick:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/smartengines/tree/ui/MultiLevelKt$MultiLevelTreeView$1$2$1;->$row:Lcom/smartengines/tree/ui/RowData;

    invoke-virtual {v1}, Lcom/smartengines/tree/ui/RowData;->getNode()Lcom/smartengines/tree/TreeNode;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type T of com.smartengines.tree.ui.MultiLevelKt.MultiLevelTreeView$lambda$6$lambda$5"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/smartengines/tree/ui/MultiLevelKt$MultiLevelTreeView$1$2$1;->$model:Lcom/smartengines/tree/ui/MultiLevelTreeModel;

    iget-object v1, p0, Lcom/smartengines/tree/ui/MultiLevelKt$MultiLevelTreeView$1$2$1;->$row:Lcom/smartengines/tree/ui/RowData;

    invoke-virtual {v0, v1}, Lcom/smartengines/tree/ui/MultiLevelTreeModel;->onBranchRowClick$tree_release(Lcom/smartengines/tree/ui/RowData;)V

    return-void
.end method
