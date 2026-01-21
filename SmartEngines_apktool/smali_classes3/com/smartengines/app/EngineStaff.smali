.class public final Lcom/smartengines/app/EngineStaff;
.super Ljava/lang/Object;
.source "EngineStaff.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c7\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d7\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d7\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d7\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/smartengines/app/EngineStaff;",
        "",
        "loader",
        "Lcom/smartengines/engine/EngineLoader;",
        "targets",
        "Lcom/smartengines/app/targets/TreeItem;",
        "<init>",
        "(Lcom/smartengines/engine/EngineLoader;Lcom/smartengines/app/targets/TreeItem;)V",
        "getLoader",
        "()Lcom/smartengines/engine/EngineLoader;",
        "getTargets",
        "()Lcom/smartengines/app/targets/TreeItem;",
        "setTargets",
        "(Lcom/smartengines/app/targets/TreeItem;)V",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final loader:Lcom/smartengines/engine/EngineLoader;

.field private targets:Lcom/smartengines/app/targets/TreeItem;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/engine/EngineLoader;Lcom/smartengines/app/targets/TreeItem;)V
    .locals 1

    const-string v0, "loader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "targets"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/smartengines/app/EngineStaff;->loader:Lcom/smartengines/engine/EngineLoader;

    .line 10
    iput-object p2, p0, Lcom/smartengines/app/EngineStaff;->targets:Lcom/smartengines/app/targets/TreeItem;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/smartengines/engine/EngineLoader;Lcom/smartengines/app/targets/TreeItem;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 10
    new-instance v0, Lcom/smartengines/app/targets/TreeGroup;

    new-instance v1, Lcom/smartengines/utils/Name;

    const-string p2, "no data"

    invoke-direct {v1, p2}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    const/16 v7, 0x30

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/smartengines/app/targets/TreeGroup;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/String;Lcom/smartengines/app/targets/TreeGroupViewType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p2, v0

    check-cast p2, Lcom/smartengines/app/targets/TreeItem;

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/smartengines/app/EngineStaff;-><init>(Lcom/smartengines/engine/EngineLoader;Lcom/smartengines/app/targets/TreeItem;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/app/EngineStaff;Lcom/smartengines/engine/EngineLoader;Lcom/smartengines/app/targets/TreeItem;ILjava/lang/Object;)Lcom/smartengines/app/EngineStaff;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/smartengines/app/EngineStaff;->loader:Lcom/smartengines/engine/EngineLoader;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/smartengines/app/EngineStaff;->targets:Lcom/smartengines/app/targets/TreeItem;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/EngineStaff;->copy(Lcom/smartengines/engine/EngineLoader;Lcom/smartengines/app/targets/TreeItem;)Lcom/smartengines/app/EngineStaff;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/smartengines/engine/EngineLoader;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/EngineStaff;->loader:Lcom/smartengines/engine/EngineLoader;

    return-object v0
.end method

.method public final component2()Lcom/smartengines/app/targets/TreeItem;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/EngineStaff;->targets:Lcom/smartengines/app/targets/TreeItem;

    return-object v0
.end method

.method public final copy(Lcom/smartengines/engine/EngineLoader;Lcom/smartengines/app/targets/TreeItem;)Lcom/smartengines/app/EngineStaff;
    .locals 1

    const-string v0, "loader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "targets"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/app/EngineStaff;

    invoke-direct {v0, p1, p2}, Lcom/smartengines/app/EngineStaff;-><init>(Lcom/smartengines/engine/EngineLoader;Lcom/smartengines/app/targets/TreeItem;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/app/EngineStaff;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/app/EngineStaff;

    iget-object v1, p0, Lcom/smartengines/app/EngineStaff;->loader:Lcom/smartengines/engine/EngineLoader;

    iget-object v3, p1, Lcom/smartengines/app/EngineStaff;->loader:Lcom/smartengines/engine/EngineLoader;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/smartengines/app/EngineStaff;->targets:Lcom/smartengines/app/targets/TreeItem;

    iget-object p1, p1, Lcom/smartengines/app/EngineStaff;->targets:Lcom/smartengines/app/targets/TreeItem;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getLoader()Lcom/smartengines/engine/EngineLoader;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/smartengines/app/EngineStaff;->loader:Lcom/smartengines/engine/EngineLoader;

    return-object v0
.end method

.method public final getTargets()Lcom/smartengines/app/targets/TreeItem;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/smartengines/app/EngineStaff;->targets:Lcom/smartengines/app/targets/TreeItem;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/smartengines/app/EngineStaff;->loader:Lcom/smartengines/engine/EngineLoader;

    invoke-virtual {v0}, Lcom/smartengines/engine/EngineLoader;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/app/EngineStaff;->targets:Lcom/smartengines/app/targets/TreeItem;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setTargets(Lcom/smartengines/app/targets/TreeItem;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iput-object p1, p0, Lcom/smartengines/app/EngineStaff;->targets:Lcom/smartengines/app/targets/TreeItem;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EngineStaff(loader="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/app/EngineStaff;->loader:Lcom/smartengines/engine/EngineLoader;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", targets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/app/EngineStaff;->targets:Lcom/smartengines/app/targets/TreeItem;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
