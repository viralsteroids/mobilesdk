.class public final Lcom/smartengines/engine/id/LvResultData;
.super Ljava/lang/Object;
.source "LvResultData.kt"

# interfaces
.implements Lcom/smartengines/engine/Result;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u000e2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000f\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/smartengines/engine/id/LvResultData;",
        "Lcom/smartengines/engine/Result;",
        "livenessEstimation",
        "",
        "<init>",
        "(D)V",
        "getLivenessEstimation",
        "()D",
        "quads",
        "",
        "Lcom/smartengines/visualization/Quad;",
        "getQuads",
        "()Ljava/util/Collection;",
        "isEmpty",
        "",
        "()Z",
        "component1",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "engine_release"
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
.field private final livenessEstimation:D


# direct methods
.method public constructor <init>(D)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-wide p1, p0, Lcom/smartengines/engine/id/LvResultData;->livenessEstimation:D

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/engine/id/LvResultData;DILjava/lang/Object;)Lcom/smartengines/engine/id/LvResultData;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-wide p1, p0, Lcom/smartengines/engine/id/LvResultData;->livenessEstimation:D

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/smartengines/engine/id/LvResultData;->copy(D)Lcom/smartengines/engine/id/LvResultData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/smartengines/engine/id/LvResultData;->livenessEstimation:D

    return-wide v0
.end method

.method public final copy(D)Lcom/smartengines/engine/id/LvResultData;
    .locals 1

    new-instance v0, Lcom/smartengines/engine/id/LvResultData;

    invoke-direct {v0, p1, p2}, Lcom/smartengines/engine/id/LvResultData;-><init>(D)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/engine/id/LvResultData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/engine/id/LvResultData;

    iget-wide v3, p0, Lcom/smartengines/engine/id/LvResultData;->livenessEstimation:D

    iget-wide v5, p1, Lcom/smartengines/engine/id/LvResultData;->livenessEstimation:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getLivenessEstimation()D
    .locals 2

    .line 7
    iget-wide v0, p0, Lcom/smartengines/engine/id/LvResultData;->livenessEstimation:D

    return-wide v0
.end method

.method public getQuads()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/smartengines/visualization/Quad;",
            ">;"
        }
    .end annotation

    .line 11
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/smartengines/engine/id/LvResultData;->livenessEstimation:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LvResultData(livenessEstimation="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/smartengines/engine/id/LvResultData;->livenessEstimation:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
