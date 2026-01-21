.class public final Lcom/smartengines/app/targets/TreeItem$DefaultImpls;
.super Ljava/lang/Object;
.source "TreeItem.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/targets/TreeItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
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
.method public static containsChild(Lcom/smartengines/app/targets/TreeItem;Lcom/smartengines/tree/TreeNode;)Z
    .locals 1

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    check-cast p0, Lcom/smartengines/tree/TreeNode;

    invoke-static {p0, p1}, Lcom/smartengines/tree/TreeNode$DefaultImpls;->containsChild(Lcom/smartengines/tree/TreeNode;Lcom/smartengines/tree/TreeNode;)Z

    move-result p0

    return p0
.end method

.method public static isLeaf(Lcom/smartengines/app/targets/TreeItem;)Z
    .locals 0

    .line 6
    check-cast p0, Lcom/smartengines/tree/TreeNode;

    invoke-static {p0}, Lcom/smartengines/tree/TreeNode$DefaultImpls;->isLeaf(Lcom/smartengines/tree/TreeNode;)Z

    move-result p0

    return p0
.end method
