.class public final Lcom/smartengines/tree/ui/MultiLevelTreeModelKt;
.super Ljava/lang/Object;
.source "MultiLevelTreeModel.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultiLevelTreeModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiLevelTreeModel.kt\ncom/smartengines/tree/ui/MultiLevelTreeModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1863#2:84\n1863#2,2:85\n1864#2:87\n1863#2,2:88\n*S KotlinDebug\n*F\n+ 1 MultiLevelTreeModel.kt\ncom/smartengines/tree/ui/MultiLevelTreeModelKt\n*L\n54#1:84\n59#1:85,2\n54#1:87\n70#1:88,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a \u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a \u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a8\u0006\u0005"
    }
    d2 = {
        "mapOnExpanded",
        "",
        "Lcom/smartengines/tree/ui/RowData;",
        "row",
        "mapOnCollapsed",
        "tree_release"
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
.method public static final synthetic access$mapOnCollapsed(Ljava/util/List;Lcom/smartengines/tree/ui/RowData;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/smartengines/tree/ui/MultiLevelTreeModelKt;->mapOnCollapsed(Ljava/util/List;Lcom/smartengines/tree/ui/RowData;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$mapOnExpanded(Ljava/util/List;Lcom/smartengines/tree/ui/RowData;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/smartengines/tree/ui/MultiLevelTreeModelKt;->mapOnExpanded(Ljava/util/List;Lcom/smartengines/tree/ui/RowData;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final mapOnCollapsed(Ljava/util/List;Lcom/smartengines/tree/ui/RowData;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/smartengines/tree/ui/RowData;",
            ">;",
            "Lcom/smartengines/tree/ui/RowData;",
            ")",
            "Ljava/util/List<",
            "Lcom/smartengines/tree/ui/RowData;",
            ">;"
        }
    .end annotation

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    check-cast p0, Ljava/lang/Iterable;

    .line 88
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/smartengines/tree/ui/RowData;

    .line 71
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 73
    invoke-static/range {v2 .. v7}, Lcom/smartengines/tree/ui/RowData;->copy$default(Lcom/smartengines/tree/ui/RowData;Lcom/smartengines/tree/TreeNode;IZILjava/lang/Object;)Lcom/smartengines/tree/ui/RowData;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {p1}, Lcom/smartengines/tree/ui/RowData;->getNode()Lcom/smartengines/tree/TreeNode;

    move-result-object v1

    invoke-virtual {v2}, Lcom/smartengines/tree/ui/RowData;->getNode()Lcom/smartengines/tree/TreeNode;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/smartengines/tree/TreeNode;->containsChild(Lcom/smartengines/tree/TreeNode;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 78
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 69
    :cond_2
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private static final mapOnExpanded(Ljava/util/List;Lcom/smartengines/tree/ui/RowData;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/smartengines/tree/ui/RowData;",
            ">;",
            "Lcom/smartengines/tree/ui/RowData;",
            ")",
            "Ljava/util/List<",
            "Lcom/smartengines/tree/ui/RowData;",
            ">;"
        }
    .end annotation

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    check-cast p0, Ljava/lang/Iterable;

    .line 84
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/smartengines/tree/ui/RowData;

    .line 55
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    .line 57
    invoke-static/range {v2 .. v7}, Lcom/smartengines/tree/ui/RowData;->copy$default(Lcom/smartengines/tree/ui/RowData;Lcom/smartengines/tree/TreeNode;IZILjava/lang/Object;)Lcom/smartengines/tree/ui/RowData;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    invoke-virtual {p1}, Lcom/smartengines/tree/ui/RowData;->getNode()Lcom/smartengines/tree/TreeNode;

    move-result-object v1

    invoke-interface {v1}, Lcom/smartengines/tree/TreeNode;->getChildren()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Ljava/lang/Iterable;

    .line 85
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/tree/TreeNode;

    .line 60
    new-instance v3, Lcom/smartengines/tree/ui/RowData;

    invoke-virtual {p1}, Lcom/smartengines/tree/ui/RowData;->getLevel()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v3, v2, v4, v5}, Lcom/smartengines/tree/ui/RowData;-><init>(Lcom/smartengines/tree/TreeNode;IZ)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 53
    :cond_2
    check-cast v0, Ljava/util/List;

    return-object v0
.end method
