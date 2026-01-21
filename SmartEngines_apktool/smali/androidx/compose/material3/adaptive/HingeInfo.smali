.class public final Landroidx/compose/material3/adaptive/HingeInfo;
.super Ljava/lang/Object;
.source "Posture.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\u0013\u0010\r\u001a\u00020\u00052\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010\u000f\u001a\u00020\u0010H\u0016J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u000cR\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u000cR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u000c\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/compose/material3/adaptive/HingeInfo;",
        "",
        "bounds",
        "Landroidx/compose/ui/geometry/Rect;",
        "isFlat",
        "",
        "isVertical",
        "isSeparating",
        "isOccluding",
        "(Landroidx/compose/ui/geometry/Rect;ZZZZ)V",
        "getBounds",
        "()Landroidx/compose/ui/geometry/Rect;",
        "()Z",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "adaptive_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final bounds:Landroidx/compose/ui/geometry/Rect;

.field private final isFlat:Z

.field private final isOccluding:Z

.field private final isSeparating:Z

.field private final isVertical:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/geometry/Rect;ZZZZ)V
    .locals 0

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    iput-object p1, p0, Landroidx/compose/material3/adaptive/HingeInfo;->bounds:Landroidx/compose/ui/geometry/Rect;

    .line 101
    iput-boolean p2, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isFlat:Z

    .line 102
    iput-boolean p3, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isVertical:Z

    .line 103
    iput-boolean p4, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isSeparating:Z

    .line 104
    iput-boolean p5, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isOccluding:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 108
    :cond_0
    instance-of v1, p1, Landroidx/compose/material3/adaptive/HingeInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 109
    :cond_1
    iget-object v1, p0, Landroidx/compose/material3/adaptive/HingeInfo;->bounds:Landroidx/compose/ui/geometry/Rect;

    check-cast p1, Landroidx/compose/material3/adaptive/HingeInfo;

    iget-object v3, p1, Landroidx/compose/material3/adaptive/HingeInfo;->bounds:Landroidx/compose/ui/geometry/Rect;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    .line 110
    :cond_2
    iget-boolean v1, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isFlat:Z

    iget-boolean v3, p1, Landroidx/compose/material3/adaptive/HingeInfo;->isFlat:Z

    if-eq v1, v3, :cond_3

    return v2

    .line 111
    :cond_3
    iget-boolean v1, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isVertical:Z

    iget-boolean v3, p1, Landroidx/compose/material3/adaptive/HingeInfo;->isVertical:Z

    if-eq v1, v3, :cond_4

    return v2

    .line 112
    :cond_4
    iget-boolean v1, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isSeparating:Z

    iget-boolean v3, p1, Landroidx/compose/material3/adaptive/HingeInfo;->isSeparating:Z

    if-eq v1, v3, :cond_5

    return v2

    .line 113
    :cond_5
    iget-boolean v1, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isOccluding:Z

    iget-boolean p1, p1, Landroidx/compose/material3/adaptive/HingeInfo;->isOccluding:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBounds()Landroidx/compose/ui/geometry/Rect;
    .locals 1

    .line 100
    iget-object v0, p0, Landroidx/compose/material3/adaptive/HingeInfo;->bounds:Landroidx/compose/ui/geometry/Rect;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 118
    iget-object v0, p0, Landroidx/compose/material3/adaptive/HingeInfo;->bounds:Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 119
    iget-boolean v1, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isFlat:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 120
    iget-boolean v1, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isVertical:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 121
    iget-boolean v1, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isSeparating:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 122
    iget-boolean v1, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isOccluding:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isFlat()Z
    .locals 1

    .line 101
    iget-boolean v0, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isFlat:Z

    return v0
.end method

.method public final isOccluding()Z
    .locals 1

    .line 104
    iget-boolean v0, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isOccluding:Z

    return v0
.end method

.method public final isSeparating()Z
    .locals 1

    .line 103
    iget-boolean v0, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isSeparating:Z

    return v0
.end method

.method public final isVertical()Z
    .locals 1

    .line 102
    iget-boolean v0, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isVertical:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HingeInfo(bounds="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/material3/adaptive/HingeInfo;->bounds:Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isFlat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 128
    iget-boolean v1, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isFlat:Z

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 128
    const-string v1, ", isVertical="

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 129
    iget-boolean v1, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isVertical:Z

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 129
    const-string v1, ", isSeparating="

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 130
    iget-boolean v1, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isSeparating:Z

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 130
    const-string v1, ", isOccluding="

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 131
    iget-boolean v1, p0, Landroidx/compose/material3/adaptive/HingeInfo;->isOccluding:Z

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
