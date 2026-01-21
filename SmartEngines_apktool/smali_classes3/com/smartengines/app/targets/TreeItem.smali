.class public interface abstract Lcom/smartengines/app/targets/TreeItem;
.super Ljava/lang/Object;
.source "TreeItem.kt"

# interfaces
.implements Lcom/smartengines/tree/TreeNode;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/app/targets/TreeItem$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u001a\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/smartengines/app/targets/TreeItem;",
        "Lcom/smartengines/tree/TreeNode;",
        "name",
        "Lcom/smartengines/utils/Name;",
        "getName",
        "()Lcom/smartengines/utils/Name;",
        "icon",
        "",
        "getIcon",
        "()Ljava/lang/Integer;",
        "children",
        "",
        "getChildren",
        "()Ljava/util/List;",
        "app_storeRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getChildren()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getIcon()Ljava/lang/Integer;
.end method

.method public abstract getName()Lcom/smartengines/utils/Name;
.end method
