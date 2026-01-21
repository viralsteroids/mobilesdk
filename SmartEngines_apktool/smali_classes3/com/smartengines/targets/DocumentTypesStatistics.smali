.class public final Lcom/smartengines/targets/DocumentTypesStatistics;
.super Ljava/lang/Object;
.source "DocumentTypesStatistics.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/targets/DocumentTypesStatistics$Calculated;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u0018B\u0017\u0012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000f\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\u0011\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0004H\u00d6\u0001R \u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\u0006R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/smartengines/targets/DocumentTypesStatistics;",
        "",
        "dictionary",
        "",
        "",
        "<init>",
        "(Ljava/util/Set;)V",
        "getDictionary",
        "()Ljava/util/Set;",
        "setDictionary",
        "all",
        "Ljava/util/HashSet;",
        "getAll",
        "()Ljava/util/HashSet;",
        "calculate",
        "Lcom/smartengines/targets/DocumentTypesStatistics$Calculated;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "Calculated",
        "targets_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final all:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private dictionary:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/smartengines/targets/DocumentTypesStatistics;-><init>(Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "dictionary"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/smartengines/targets/DocumentTypesStatistics;->dictionary:Ljava/util/Set;

    .line 8
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/smartengines/targets/DocumentTypesStatistics;->all:Ljava/util/HashSet;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 6
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcom/smartengines/targets/DocumentTypesStatistics;-><init>(Ljava/util/Set;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/targets/DocumentTypesStatistics;Ljava/util/Set;ILjava/lang/Object;)Lcom/smartengines/targets/DocumentTypesStatistics;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/smartengines/targets/DocumentTypesStatistics;->dictionary:Ljava/util/Set;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/smartengines/targets/DocumentTypesStatistics;->copy(Ljava/util/Set;)Lcom/smartengines/targets/DocumentTypesStatistics;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final calculate()Lcom/smartengines/targets/DocumentTypesStatistics$Calculated;
    .locals 10

    .line 19
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 20
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 22
    iget-object v2, p0, Lcom/smartengines/targets/DocumentTypesStatistics;->all:Ljava/util/HashSet;

    check-cast v2, Ljava/lang/Iterable;

    .line 23
    iget-object v3, p0, Lcom/smartengines/targets/DocumentTypesStatistics;->dictionary:Ljava/util/Set;

    .line 21
    invoke-static {v2, v3, v0, v1}, Lcom/smartengines/targets/TargetUtilsKt;->reduceByDictionary(Ljava/lang/Iterable;Ljava/util/Set;Ljava/util/HashSet;Ljava/util/HashSet;)Ljava/util/Set;

    move-result-object v7

    .line 27
    new-instance v4, Lcom/smartengines/targets/DocumentTypesStatistics$Calculated;

    .line 28
    iget-object v2, p0, Lcom/smartengines/targets/DocumentTypesStatistics;->all:Ljava/util/HashSet;

    move-object v5, v2

    check-cast v5, Ljava/util/Set;

    iget-object v6, p0, Lcom/smartengines/targets/DocumentTypesStatistics;->dictionary:Ljava/util/Set;

    move-object v8, v0

    check-cast v8, Ljava/util/Set;

    .line 29
    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v6, v1}, Lkotlin/collections/SetsKt;->minus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v9

    .line 27
    invoke-direct/range {v4 .. v9}, Lcom/smartengines/targets/DocumentTypesStatistics$Calculated;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V

    return-object v4
.end method

.method public final component1()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/smartengines/targets/DocumentTypesStatistics;->dictionary:Ljava/util/Set;

    return-object v0
.end method

.method public final copy(Ljava/util/Set;)Lcom/smartengines/targets/DocumentTypesStatistics;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/smartengines/targets/DocumentTypesStatistics;"
        }
    .end annotation

    const-string v0, "dictionary"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/targets/DocumentTypesStatistics;

    invoke-direct {v0, p1}, Lcom/smartengines/targets/DocumentTypesStatistics;-><init>(Ljava/util/Set;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/targets/DocumentTypesStatistics;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/targets/DocumentTypesStatistics;

    iget-object v1, p0, Lcom/smartengines/targets/DocumentTypesStatistics;->dictionary:Ljava/util/Set;

    iget-object p1, p1, Lcom/smartengines/targets/DocumentTypesStatistics;->dictionary:Ljava/util/Set;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getAll()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/smartengines/targets/DocumentTypesStatistics;->all:Ljava/util/HashSet;

    return-object v0
.end method

.method public final getDictionary()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 6
    iget-object v0, p0, Lcom/smartengines/targets/DocumentTypesStatistics;->dictionary:Ljava/util/Set;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/smartengines/targets/DocumentTypesStatistics;->dictionary:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final setDictionary(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iput-object p1, p0, Lcom/smartengines/targets/DocumentTypesStatistics;->dictionary:Ljava/util/Set;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DocumentTypesStatistics(dictionary="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/targets/DocumentTypesStatistics;->dictionary:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
