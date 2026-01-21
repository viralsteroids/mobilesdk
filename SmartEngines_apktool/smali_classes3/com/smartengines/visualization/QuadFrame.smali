.class public final Lcom/smartengines/visualization/QuadFrame;
.super Ljava/lang/Object;
.source "QuadFrame.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0008H\u00c6\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c7\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d7\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d7\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d7\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/smartengines/visualization/QuadFrame;",
        "",
        "quads",
        "",
        "Lcom/smartengines/visualization/Quad;",
        "imageSize",
        "Landroid/util/Size;",
        "timestamp",
        "",
        "<init>",
        "(Ljava/util/Set;Landroid/util/Size;J)V",
        "getQuads",
        "()Ljava/util/Set;",
        "getImageSize",
        "()Landroid/util/Size;",
        "getTimestamp",
        "()J",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "visualization_release"
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
.field private final imageSize:Landroid/util/Size;

.field private final quads:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/smartengines/visualization/Quad;",
            ">;"
        }
    .end annotation
.end field

.field private final timestamp:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Landroid/util/Size;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/smartengines/visualization/Quad;",
            ">;",
            "Landroid/util/Size;",
            "J)V"
        }
    .end annotation

    const-string v0, "quads"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageSize"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/smartengines/visualization/QuadFrame;->quads:Ljava/util/Set;

    .line 12
    iput-object p2, p0, Lcom/smartengines/visualization/QuadFrame;->imageSize:Landroid/util/Size;

    .line 13
    iput-wide p3, p0, Lcom/smartengines/visualization/QuadFrame;->timestamp:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Set;Landroid/util/Size;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p3

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/smartengines/visualization/QuadFrame;-><init>(Ljava/util/Set;Landroid/util/Size;J)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/visualization/QuadFrame;Ljava/util/Set;Landroid/util/Size;JILjava/lang/Object;)Lcom/smartengines/visualization/QuadFrame;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/smartengines/visualization/QuadFrame;->quads:Ljava/util/Set;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/smartengines/visualization/QuadFrame;->imageSize:Landroid/util/Size;

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-wide p3, p0, Lcom/smartengines/visualization/QuadFrame;->timestamp:J

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/smartengines/visualization/QuadFrame;->copy(Ljava/util/Set;Landroid/util/Size;J)Lcom/smartengines/visualization/QuadFrame;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/smartengines/visualization/Quad;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/smartengines/visualization/QuadFrame;->quads:Ljava/util/Set;

    return-object v0
.end method

.method public final component2()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/visualization/QuadFrame;->imageSize:Landroid/util/Size;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/smartengines/visualization/QuadFrame;->timestamp:J

    return-wide v0
.end method

.method public final copy(Ljava/util/Set;Landroid/util/Size;J)Lcom/smartengines/visualization/QuadFrame;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/smartengines/visualization/Quad;",
            ">;",
            "Landroid/util/Size;",
            "J)",
            "Lcom/smartengines/visualization/QuadFrame;"
        }
    .end annotation

    const-string v0, "quads"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageSize"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/visualization/QuadFrame;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/smartengines/visualization/QuadFrame;-><init>(Ljava/util/Set;Landroid/util/Size;J)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/visualization/QuadFrame;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/visualization/QuadFrame;

    iget-object v1, p0, Lcom/smartengines/visualization/QuadFrame;->quads:Ljava/util/Set;

    iget-object v3, p1, Lcom/smartengines/visualization/QuadFrame;->quads:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/smartengines/visualization/QuadFrame;->imageSize:Landroid/util/Size;

    iget-object v3, p1, Lcom/smartengines/visualization/QuadFrame;->imageSize:Landroid/util/Size;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/smartengines/visualization/QuadFrame;->timestamp:J

    iget-wide v5, p1, Lcom/smartengines/visualization/QuadFrame;->timestamp:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getImageSize()Landroid/util/Size;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/smartengines/visualization/QuadFrame;->imageSize:Landroid/util/Size;

    return-object v0
.end method

.method public final getQuads()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/smartengines/visualization/Quad;",
            ">;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/smartengines/visualization/QuadFrame;->quads:Ljava/util/Set;

    return-object v0
.end method

.method public final getTimestamp()J
    .locals 2

    .line 13
    iget-wide v0, p0, Lcom/smartengines/visualization/QuadFrame;->timestamp:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/smartengines/visualization/QuadFrame;->quads:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/visualization/QuadFrame;->imageSize:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/smartengines/visualization/QuadFrame;->timestamp:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "QuadFrame(quads="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/visualization/QuadFrame;->quads:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imageSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/visualization/QuadFrame;->imageSize:Landroid/util/Size;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/smartengines/visualization/QuadFrame;->timestamp:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
