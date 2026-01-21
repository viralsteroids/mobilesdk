.class public final Lcom/smartengines/targets/id/IdSessionOptions;
.super Ljava/lang/Object;
.source "IdSessionOptions.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;,
        Lcom/smartengines/targets/id/IdSessionOptions$Mode;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIdSessionOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdSessionOptions.kt\ncom/smartengines/targets/id/IdSessionOptions\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1053#2:137\n1863#2:138\n1053#2:139\n1863#2:140\n1053#2:141\n1863#2,2:142\n1864#2:144\n1864#2:145\n*S KotlinDebug\n*F\n+ 1 IdSessionOptions.kt\ncom/smartengines/targets/id/IdSessionOptions\n*L\n28#1:137\n28#1:138\n29#1:139\n29#1:140\n30#1:141\n30#1:142,2\n29#1:144\n28#1:145\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0008\u0010\n\u001a\u00020\u0004H\u0016J\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u001f\u0010\u000c\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/smartengines/targets/id/IdSessionOptions;",
        "",
        "modes",
        "",
        "",
        "Lcom/smartengines/targets/id/IdSessionOptions$Mode;",
        "<init>",
        "(Ljava/util/Map;)V",
        "getModes",
        "()Ljava/util/Map;",
        "toString",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "Mode",
        "InternalEngine",
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
.field private final modes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/targets/id/IdSessionOptions$Mode;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/targets/id/IdSessionOptions$Mode;",
            ">;)V"
        }
    .end annotation

    const-string v0, "modes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/smartengines/targets/id/IdSessionOptions;->modes:Ljava/util/Map;

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/targets/id/IdSessionOptions;Ljava/util/Map;ILjava/lang/Object;)Lcom/smartengines/targets/id/IdSessionOptions;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/smartengines/targets/id/IdSessionOptions;->modes:Ljava/util/Map;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/smartengines/targets/id/IdSessionOptions;->copy(Ljava/util/Map;)Lcom/smartengines/targets/id/IdSessionOptions;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/targets/id/IdSessionOptions$Mode;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/smartengines/targets/id/IdSessionOptions;->modes:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/util/Map;)Lcom/smartengines/targets/id/IdSessionOptions;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/targets/id/IdSessionOptions$Mode;",
            ">;)",
            "Lcom/smartengines/targets/id/IdSessionOptions;"
        }
    .end annotation

    const-string v0, "modes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/targets/id/IdSessionOptions;

    invoke-direct {v0, p1}, Lcom/smartengines/targets/id/IdSessionOptions;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/targets/id/IdSessionOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/targets/id/IdSessionOptions;

    iget-object v1, p0, Lcom/smartengines/targets/id/IdSessionOptions;->modes:Ljava/util/Map;

    iget-object p1, p1, Lcom/smartengines/targets/id/IdSessionOptions;->modes:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getModes()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/targets/id/IdSessionOptions$Mode;",
            ">;"
        }
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/smartengines/targets/id/IdSessionOptions;->modes:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/smartengines/targets/id/IdSessionOptions;->modes:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mode / internal engine / supported document type\n------------------------------------------------\n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    iget-object v1, p0, Lcom/smartengines/targets/id/IdSessionOptions;->modes:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 137
    new-instance v2, Lcom/smartengines/targets/id/IdSessionOptions$toString$$inlined$sortedBy$1;

    invoke-direct {v2}, Lcom/smartengines/targets/id/IdSessionOptions$toString$$inlined$sortedBy$1;-><init>()V

    check-cast v2, Ljava/util/Comparator;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 138
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/targets/id/IdSessionOptions$Mode;

    .line 29
    invoke-virtual {v2}, Lcom/smartengines/targets/id/IdSessionOptions$Mode;->getInternalEngines()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 139
    new-instance v4, Lcom/smartengines/targets/id/IdSessionOptions$toString$lambda$5$$inlined$sortedBy$1;

    invoke-direct {v4}, Lcom/smartengines/targets/id/IdSessionOptions$toString$lambda$5$$inlined$sortedBy$1;-><init>()V

    check-cast v4, Ljava/util/Comparator;

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 140
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;

    .line 30
    invoke-virtual {v4}, Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;->getSupportedDocumentTypes()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 141
    new-instance v6, Lcom/smartengines/targets/id/IdSessionOptions$toString$lambda$5$lambda$4$$inlined$sortedBy$1;

    invoke-direct {v6}, Lcom/smartengines/targets/id/IdSessionOptions$toString$lambda$5$lambda$4$$inlined$sortedBy$1;-><init>()V

    check-cast v6, Ljava/util/Comparator;

    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 142
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 31
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/smartengines/targets/id/IdSessionOptions$Mode;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " / "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v4}, Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const/16 v7, 0xa

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 33
    :cond_1
    const-string v4, "\n"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
