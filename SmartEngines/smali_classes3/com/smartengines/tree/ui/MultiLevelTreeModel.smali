.class public final Lcom/smartengines/tree/ui/MultiLevelTreeModel;
.super Ljava/lang/Object;
.source "MultiLevelTreeModel.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/smartengines/tree/TreeNode;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultiLevelTreeModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiLevelTreeModel.kt\ncom/smartengines/tree/ui/MultiLevelTreeModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1557#2:84\n1628#2,3:85\n*S KotlinDebug\n*F\n+ 1 MultiLevelTreeModel.kt\ncom/smartengines/tree/ui/MultiLevelTreeModel\n*L\n22#1:84\n22#1:85,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0005H\u0002J\u0014\u0010\u0015\u001a\u00020\u00162\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rH\u0000\u00a2\u0006\u0002\u0008\u0019R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR \u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u00050\u000cX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/smartengines/tree/ui/MultiLevelTreeModel;",
        "T",
        "Lcom/smartengines/tree/TreeNode;",
        "",
        "data",
        "",
        "<init>",
        "(Ljava/util/List;)V",
        "_data",
        "getData",
        "()Ljava/util/List;",
        "rows",
        "Landroidx/compose/runtime/MutableState;",
        "Lcom/smartengines/tree/ui/RowData;",
        "getRows$tree_release",
        "()Landroidx/compose/runtime/MutableState;",
        "calculateRows",
        "lazyListState",
        "Landroidx/compose/foundation/lazy/LazyListState;",
        "getLazyListState",
        "()Landroidx/compose/foundation/lazy/LazyListState;",
        "setData",
        "",
        "onBranchRowClick",
        "row",
        "onBranchRowClick$tree_release",
        "tree_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private _data:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+TT;>;"
        }
    .end annotation
.end field

.field private final lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

.field private final rows:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/smartengines/tree/ui/RowData;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/smartengines/tree/ui/MultiLevelTreeModel;->_data:Ljava/util/List;

    .line 19
    invoke-direct {p0}, Lcom/smartengines/tree/ui/MultiLevelTreeModel;->calculateRows()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/tree/ui/MultiLevelTreeModel;->rows:Landroidx/compose/runtime/MutableState;

    .line 26
    new-instance p1, Landroidx/compose/foundation/lazy/LazyListState;

    const/4 v0, 0x0

    const/4 v2, 0x3

    invoke-direct {p1, v0, v0, v2, v1}, Landroidx/compose/foundation/lazy/LazyListState;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/smartengines/tree/ui/MultiLevelTreeModel;->lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

    return-void
.end method

.method private final calculateRows()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/tree/ui/RowData;",
            ">;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/smartengines/tree/ui/MultiLevelTreeModel;->_data:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 84
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 85
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 86
    check-cast v2, Lcom/smartengines/tree/TreeNode;

    .line 22
    new-instance v3, Lcom/smartengines/tree/ui/RowData;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4, v4}, Lcom/smartengines/tree/ui/RowData;-><init>(Lcom/smartengines/tree/TreeNode;IZ)V

    .line 86
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 87
    :cond_0
    check-cast v1, Ljava/util/List;

    return-object v1
.end method


# virtual methods
.method public final getData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/smartengines/tree/ui/MultiLevelTreeModel;->_data:Ljava/util/List;

    return-object v0
.end method

.method public final getLazyListState()Landroidx/compose/foundation/lazy/LazyListState;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/smartengines/tree/ui/MultiLevelTreeModel;->lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

    return-object v0
.end method

.method public final getRows$tree_release()Landroidx/compose/runtime/MutableState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/smartengines/tree/ui/RowData;",
            ">;>;"
        }
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/smartengines/tree/ui/MultiLevelTreeModel;->rows:Landroidx/compose/runtime/MutableState;

    return-object v0
.end method

.method public final onBranchRowClick$tree_release(Lcom/smartengines/tree/ui/RowData;)V
    .locals 2

    const-string v0, "row"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    iget-object v0, p0, Lcom/smartengines/tree/ui/MultiLevelTreeModel;->rows:Landroidx/compose/runtime/MutableState;

    invoke-virtual {p1}, Lcom/smartengines/tree/ui/RowData;->getExpanded()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 38
    iget-object v1, p0, Lcom/smartengines/tree/ui/MultiLevelTreeModel;->rows:Landroidx/compose/runtime/MutableState;

    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v1, p1}, Lcom/smartengines/tree/ui/MultiLevelTreeModelKt;->access$mapOnCollapsed(Ljava/util/List;Lcom/smartengines/tree/ui/RowData;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    .line 40
    :cond_0
    iget-object v1, p0, Lcom/smartengines/tree/ui/MultiLevelTreeModel;->rows:Landroidx/compose/runtime/MutableState;

    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v1, p1}, Lcom/smartengines/tree/ui/MultiLevelTreeModelKt;->access$mapOnExpanded(Ljava/util/List;Lcom/smartengines/tree/ui/RowData;)Ljava/util/List;

    move-result-object p1

    .line 37
    :goto_0
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setData(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iput-object p1, p0, Lcom/smartengines/tree/ui/MultiLevelTreeModel;->_data:Ljava/util/List;

    .line 32
    iget-object p1, p0, Lcom/smartengines/tree/ui/MultiLevelTreeModel;->rows:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Lcom/smartengines/tree/ui/MultiLevelTreeModel;->calculateRows()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method
