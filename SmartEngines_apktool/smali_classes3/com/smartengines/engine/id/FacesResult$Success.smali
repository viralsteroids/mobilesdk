.class public final Lcom/smartengines/engine/id/FacesResult$Success;
.super Ljava/lang/Object;
.source "Faces.kt"

# interfaces
.implements Lcom/smartengines/engine/id/FacesResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/engine/id/FacesResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Success"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/smartengines/engine/id/FacesResult$Success;",
        "Lcom/smartengines/engine/id/FacesResult;",
        "similarity",
        "",
        "<init>",
        "(D)V",
        "getSimilarity",
        "()D",
        "component1",
        "copy",
        "equals",
        "",
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
.field private final similarity:D


# direct methods
.method public constructor <init>(D)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/smartengines/engine/id/FacesResult$Success;->similarity:D

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/engine/id/FacesResult$Success;DILjava/lang/Object;)Lcom/smartengines/engine/id/FacesResult$Success;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-wide p1, p0, Lcom/smartengines/engine/id/FacesResult$Success;->similarity:D

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/smartengines/engine/id/FacesResult$Success;->copy(D)Lcom/smartengines/engine/id/FacesResult$Success;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/smartengines/engine/id/FacesResult$Success;->similarity:D

    return-wide v0
.end method

.method public final copy(D)Lcom/smartengines/engine/id/FacesResult$Success;
    .locals 1

    new-instance v0, Lcom/smartengines/engine/id/FacesResult$Success;

    invoke-direct {v0, p1, p2}, Lcom/smartengines/engine/id/FacesResult$Success;-><init>(D)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/engine/id/FacesResult$Success;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/engine/id/FacesResult$Success;

    iget-wide v3, p0, Lcom/smartengines/engine/id/FacesResult$Success;->similarity:D

    iget-wide v5, p1, Lcom/smartengines/engine/id/FacesResult$Success;->similarity:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getSimilarity()D
    .locals 2

    .line 12
    iget-wide v0, p0, Lcom/smartengines/engine/id/FacesResult$Success;->similarity:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/smartengines/engine/id/FacesResult$Success;->similarity:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Success(similarity="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/smartengines/engine/id/FacesResult$Success;->similarity:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
