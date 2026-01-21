.class public final Lcom/smartengines/tree/TreeNode$DefaultImpls;
.super Ljava/lang/Object;
.source "TreeNode.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/tree/TreeNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTreeNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeNode.kt\ncom/smartengines/tree/TreeNode$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1863#2,2:21\n*S KotlinDebug\n*F\n+ 1 TreeNode.kt\ncom/smartengines/tree/TreeNode$DefaultImpls\n*L\n13#1:21,2\n*E\n"
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


# direct methods
.method public static containsChild(Lcom/smartengines/tree/TreeNode;Lcom/smartengines/tree/TreeNode;)Z
    .locals 3

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-interface {p0}, Lcom/smartengines/tree/TreeNode;->getChildren()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_2

    check-cast p0, Ljava/lang/Iterable;

    .line 21
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/tree/TreeNode;

    .line 14
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    return v2

    .line 15
    :cond_1
    invoke-interface {v0, p1}, Lcom/smartengines/tree/TreeNode;->containsChild(Lcom/smartengines/tree/TreeNode;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static isLeaf(Lcom/smartengines/tree/TreeNode;)Z
    .locals 0

    .line 10
    invoke-interface {p0}, Lcom/smartengines/tree/TreeNode;->getChildren()Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
