.class public final Lcom/smartengines/app/ui/TargetsViewModel;
.super Ljava/lang/Object;
.source "TargetsViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTargetsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetsViewModel.kt\ncom/smartengines/app/ui/TargetsViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,38:1\n81#2:39\n107#2,2:40\n*S KotlinDebug\n*F\n+ 1 TargetsViewModel.kt\ncom/smartengines/app/ui/TargetsViewModel\n*L\n17#1:39\n17#1:40,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\rJ\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c7\u0001J\u0013\u0010#\u001a\u00020\u00162\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d7\u0003J\t\u0010%\u001a\u00020&H\u00d7\u0001J\t\u0010\'\u001a\u00020\rH\u00d7\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006("
    }
    d2 = {
        "Lcom/smartengines/app/ui/TargetsViewModel;",
        "",
        "treeGroup",
        "Lcom/smartengines/app/targets/TreeGroup;",
        "<init>",
        "(Lcom/smartengines/app/targets/TreeGroup;)V",
        "getTreeGroup",
        "()Lcom/smartengines/app/targets/TreeGroup;",
        "title",
        "Lcom/smartengines/utils/Name;",
        "getTitle",
        "()Lcom/smartengines/utils/Name;",
        "<set-?>",
        "",
        "filter",
        "getFilter",
        "()Ljava/lang/String;",
        "setFilter",
        "(Ljava/lang/String;)V",
        "filter$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "showFilter",
        "",
        "getShowFilter",
        "()Z",
        "multiLevelTreeModel",
        "Lcom/smartengines/tree/ui/MultiLevelTreeModel;",
        "Lcom/smartengines/app/targets/TreeItem;",
        "getMultiLevelTreeModel",
        "()Lcom/smartengines/tree/ui/MultiLevelTreeModel;",
        "onFilterChanged",
        "",
        "newFilter",
        "component1",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final filter$delegate:Landroidx/compose/runtime/MutableState;

.field private final multiLevelTreeModel:Lcom/smartengines/tree/ui/MultiLevelTreeModel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/smartengines/tree/ui/MultiLevelTreeModel<",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;"
        }
    .end annotation
.end field

.field private final showFilter:Z

.field private final title:Lcom/smartengines/utils/Name;

.field private final treeGroup:Lcom/smartengines/app/targets/TreeGroup;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/app/targets/TreeGroup;)V
    .locals 3

    const-string/jumbo v0, "treeGroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/smartengines/app/ui/TargetsViewModel;->treeGroup:Lcom/smartengines/app/targets/TreeGroup;

    .line 14
    invoke-virtual {p1}, Lcom/smartengines/app/targets/TreeGroup;->getName()Lcom/smartengines/utils/Name;

    move-result-object v0

    iput-object v0, p0, Lcom/smartengines/app/ui/TargetsViewModel;->title:Lcom/smartengines/utils/Name;

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 17
    const-string v2, ""

    invoke-static {v2, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    iput-object v0, p0, Lcom/smartengines/app/ui/TargetsViewModel;->filter$delegate:Landroidx/compose/runtime/MutableState;

    .line 18
    invoke-virtual {p1}, Lcom/smartengines/app/targets/TreeGroup;->getChildren()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x1e

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/smartengines/app/ui/TargetsViewModel;->showFilter:Z

    .line 21
    new-instance v0, Lcom/smartengines/tree/ui/MultiLevelTreeModel;

    .line 22
    invoke-virtual {p0}, Lcom/smartengines/app/ui/TargetsViewModel;->getFilter()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/smartengines/app/targets/TreeGroup;->getChildren()Ljava/util/List;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/smartengines/app/ui/TargetsFilterKt;->filterData(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 21
    invoke-direct {v0, p1}, Lcom/smartengines/tree/ui/MultiLevelTreeModel;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Lcom/smartengines/app/ui/TargetsViewModel;->multiLevelTreeModel:Lcom/smartengines/tree/ui/MultiLevelTreeModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/app/ui/TargetsViewModel;Lcom/smartengines/app/targets/TreeGroup;ILjava/lang/Object;)Lcom/smartengines/app/ui/TargetsViewModel;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/smartengines/app/ui/TargetsViewModel;->treeGroup:Lcom/smartengines/app/targets/TreeGroup;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/smartengines/app/ui/TargetsViewModel;->copy(Lcom/smartengines/app/targets/TreeGroup;)Lcom/smartengines/app/ui/TargetsViewModel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/smartengines/app/targets/TreeGroup;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/ui/TargetsViewModel;->treeGroup:Lcom/smartengines/app/targets/TreeGroup;

    return-object v0
.end method

.method public final copy(Lcom/smartengines/app/targets/TreeGroup;)Lcom/smartengines/app/ui/TargetsViewModel;
    .locals 1

    const-string/jumbo v0, "treeGroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/app/ui/TargetsViewModel;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/TargetsViewModel;-><init>(Lcom/smartengines/app/targets/TreeGroup;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/app/ui/TargetsViewModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/app/ui/TargetsViewModel;

    iget-object v1, p0, Lcom/smartengines/app/ui/TargetsViewModel;->treeGroup:Lcom/smartengines/app/targets/TreeGroup;

    iget-object p1, p1, Lcom/smartengines/app/ui/TargetsViewModel;->treeGroup:Lcom/smartengines/app/targets/TreeGroup;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getFilter()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/smartengines/app/ui/TargetsViewModel;->filter$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 39
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getMultiLevelTreeModel()Lcom/smartengines/tree/ui/MultiLevelTreeModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/smartengines/tree/ui/MultiLevelTreeModel<",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/smartengines/app/ui/TargetsViewModel;->multiLevelTreeModel:Lcom/smartengines/tree/ui/MultiLevelTreeModel;

    return-object v0
.end method

.method public final getShowFilter()Z
    .locals 1

    .line 18
    iget-boolean v0, p0, Lcom/smartengines/app/ui/TargetsViewModel;->showFilter:Z

    return v0
.end method

.method public final getTitle()Lcom/smartengines/utils/Name;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/smartengines/app/ui/TargetsViewModel;->title:Lcom/smartengines/utils/Name;

    return-object v0
.end method

.method public final getTreeGroup()Lcom/smartengines/app/targets/TreeGroup;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/smartengines/app/ui/TargetsViewModel;->treeGroup:Lcom/smartengines/app/targets/TreeGroup;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/ui/TargetsViewModel;->treeGroup:Lcom/smartengines/app/targets/TreeGroup;

    invoke-virtual {v0}, Lcom/smartengines/app/targets/TreeGroup;->hashCode()I

    move-result v0

    return v0
.end method

.method public final onFilterChanged(Ljava/lang/String;)V
    .locals 2

    const-string v0, "newFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0, p1}, Lcom/smartengines/app/ui/TargetsViewModel;->setFilter(Ljava/lang/String;)V

    .line 31
    iget-object p1, p0, Lcom/smartengines/app/ui/TargetsViewModel;->multiLevelTreeModel:Lcom/smartengines/tree/ui/MultiLevelTreeModel;

    .line 32
    invoke-virtual {p0}, Lcom/smartengines/app/ui/TargetsViewModel;->getFilter()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/app/ui/TargetsViewModel;->treeGroup:Lcom/smartengines/app/targets/TreeGroup;

    invoke-virtual {v1}, Lcom/smartengines/app/targets/TreeGroup;->getChildren()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/smartengines/app/ui/TargetsFilterKt;->filterData(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 31
    invoke-virtual {p1, v0}, Lcom/smartengines/tree/ui/MultiLevelTreeModel;->setData(Ljava/util/List;)V

    return-void
.end method

.method public final setFilter(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    iget-object v0, p0, Lcom/smartengines/app/ui/TargetsViewModel;->filter$delegate:Landroidx/compose/runtime/MutableState;

    .line 40
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TargetsViewModel(treeGroup="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/app/ui/TargetsViewModel;->treeGroup:Lcom/smartengines/app/targets/TreeGroup;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
