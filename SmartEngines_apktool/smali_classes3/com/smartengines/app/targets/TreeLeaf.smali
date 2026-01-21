.class public final Lcom/smartengines/app/targets/TreeLeaf;
.super Ljava/lang/Object;
.source "TreeLeaf.kt"

# interfaces
.implements Lcom/smartengines/app/targets/TreeItem;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0007\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0010\u0008\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000cX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0019R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lcom/smartengines/app/targets/TreeLeaf;",
        "Lcom/smartengines/app/targets/TreeItem;",
        "name",
        "Lcom/smartengines/utils/Name;",
        "icon",
        "",
        "descr",
        "priority",
        "",
        "showInfoButton",
        "",
        "doctypes",
        "",
        "",
        "target",
        "Lcom/smartengines/engine/RecognitionTarget;",
        "<init>",
        "(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;)V",
        "getName",
        "()Lcom/smartengines/utils/Name;",
        "getPriority",
        "()I",
        "getShowInfoButton",
        "()Z",
        "getDoctypes",
        "()Ljava/util/List;",
        "getTarget",
        "()Lcom/smartengines/engine/RecognitionTarget;",
        "children",
        "getChildren",
        "_descr",
        "getDescr",
        "()Ljava/lang/String;",
        "_icon",
        "getIcon",
        "()Ljava/lang/Integer;",
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


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final _descr:Ljava/lang/Object;

.field private final _icon:Ljava/lang/Object;

.field private final children:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;"
        }
    .end annotation
.end field

.field private final doctypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final name:Lcom/smartengines/utils/Name;

.field private final priority:I

.field private final showInfoButton:Z

.field private final target:Lcom/smartengines/engine/RecognitionTarget;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/utils/Name;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "IZ",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/smartengines/engine/RecognitionTarget;",
            ")V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "target"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/smartengines/app/targets/TreeLeaf;->name:Lcom/smartengines/utils/Name;

    .line 18
    iput p4, p0, Lcom/smartengines/app/targets/TreeLeaf;->priority:I

    .line 19
    iput-boolean p5, p0, Lcom/smartengines/app/targets/TreeLeaf;->showInfoButton:Z

    .line 20
    iput-object p6, p0, Lcom/smartengines/app/targets/TreeLeaf;->doctypes:Ljava/util/List;

    .line 23
    iput-object p7, p0, Lcom/smartengines/app/targets/TreeLeaf;->target:Lcom/smartengines/engine/RecognitionTarget;

    .line 29
    iput-object p3, p0, Lcom/smartengines/app/targets/TreeLeaf;->_descr:Ljava/lang/Object;

    .line 34
    iput-object p2, p0, Lcom/smartengines/app/targets/TreeLeaf;->_icon:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p9, p8, 0x2

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p9, p8, 0x8

    const/4 v1, 0x0

    if-eqz p9, :cond_2

    move p4, v1

    :cond_2
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_3

    move p5, v1

    :cond_3
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_4

    move-object p8, p7

    move-object p7, v0

    goto :goto_0

    :cond_4
    move-object p8, p7

    move-object p7, p6

    :goto_0
    move p6, p5

    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 12
    invoke-direct/range {p1 .. p8}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;)V

    return-void
.end method


# virtual methods
.method public containsChild(Lcom/smartengines/tree/TreeNode;)Z
    .locals 0

    .line 12
    invoke-static {p0, p1}, Lcom/smartengines/app/targets/TreeItem$DefaultImpls;->containsChild(Lcom/smartengines/app/targets/TreeItem;Lcom/smartengines/tree/TreeNode;)Z

    move-result p1

    return p1
.end method

.method public getChildren()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/smartengines/app/targets/TreeLeaf;->children:Ljava/util/List;

    return-object v0
.end method

.method public final getDescr()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/smartengines/app/targets/TreeLeaf;->_descr:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getDoctypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/smartengines/app/targets/TreeLeaf;->doctypes:Ljava/util/List;

    return-object v0
.end method

.method public getIcon()Ljava/lang/Integer;
    .locals 2

    .line 36
    iget-object v0, p0, Lcom/smartengines/app/targets/TreeLeaf;->_icon:Ljava/lang/Object;

    .line 37
    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Integer;

    return-object v0

    .line 38
    :cond_0
    instance-of v1, v0, Lcom/smartengines/app/targets/Icon;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/smartengines/app/targets/Icon;

    invoke-virtual {v0}, Lcom/smartengines/app/targets/Icon;->toInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getName()Lcom/smartengines/utils/Name;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/smartengines/app/targets/TreeLeaf;->name:Lcom/smartengines/utils/Name;

    return-object v0
.end method

.method public final getPriority()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/smartengines/app/targets/TreeLeaf;->priority:I

    return v0
.end method

.method public final getShowInfoButton()Z
    .locals 1

    .line 19
    iget-boolean v0, p0, Lcom/smartengines/app/targets/TreeLeaf;->showInfoButton:Z

    return v0
.end method

.method public final getTarget()Lcom/smartengines/engine/RecognitionTarget;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/smartengines/app/targets/TreeLeaf;->target:Lcom/smartengines/engine/RecognitionTarget;

    return-object v0
.end method

.method public isLeaf()Z
    .locals 1

    .line 12
    invoke-static {p0}, Lcom/smartengines/app/targets/TreeItem$DefaultImpls;->isLeaf(Lcom/smartengines/app/targets/TreeItem;)Z

    move-result v0

    return v0
.end method
