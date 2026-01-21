.class public final Lcom/smartengines/visualization/Visualization$Timer$Data;
.super Ljava/lang/Object;
.source "Visualization.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/visualization/Visualization$Timer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Data"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c7\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d7\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d7\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d7\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008R\u0011\u0010\n\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0008\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/smartengines/visualization/Visualization$Timer$Data;",
        "",
        "startTime",
        "",
        "stopTime",
        "<init>",
        "(JJ)V",
        "getStartTime",
        "()J",
        "getStopTime",
        "length",
        "getLength",
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
.field public static final $stable:I


# instance fields
.field private final startTime:J

.field private final stopTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/smartengines/visualization/Visualization$Timer$Data;->startTime:J

    iput-wide p3, p0, Lcom/smartengines/visualization/Visualization$Timer$Data;->stopTime:J

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/visualization/Visualization$Timer$Data;JJILjava/lang/Object;)Lcom/smartengines/visualization/Visualization$Timer$Data;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lcom/smartengines/visualization/Visualization$Timer$Data;->startTime:J

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    iget-wide p3, p0, Lcom/smartengines/visualization/Visualization$Timer$Data;->stopTime:J

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/smartengines/visualization/Visualization$Timer$Data;->copy(JJ)Lcom/smartengines/visualization/Visualization$Timer$Data;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/smartengines/visualization/Visualization$Timer$Data;->startTime:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/smartengines/visualization/Visualization$Timer$Data;->stopTime:J

    return-wide v0
.end method

.method public final copy(JJ)Lcom/smartengines/visualization/Visualization$Timer$Data;
    .locals 1

    new-instance v0, Lcom/smartengines/visualization/Visualization$Timer$Data;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/smartengines/visualization/Visualization$Timer$Data;-><init>(JJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/visualization/Visualization$Timer$Data;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/visualization/Visualization$Timer$Data;

    iget-wide v3, p0, Lcom/smartengines/visualization/Visualization$Timer$Data;->startTime:J

    iget-wide v5, p1, Lcom/smartengines/visualization/Visualization$Timer$Data;->startTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/smartengines/visualization/Visualization$Timer$Data;->stopTime:J

    iget-wide v5, p1, Lcom/smartengines/visualization/Visualization$Timer$Data;->stopTime:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getLength()J
    .locals 4

    .line 86
    iget-wide v0, p0, Lcom/smartengines/visualization/Visualization$Timer$Data;->stopTime:J

    iget-wide v2, p0, Lcom/smartengines/visualization/Visualization$Timer$Data;->startTime:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final getStartTime()J
    .locals 2

    .line 84
    iget-wide v0, p0, Lcom/smartengines/visualization/Visualization$Timer$Data;->startTime:J

    return-wide v0
.end method

.method public final getStopTime()J
    .locals 2

    .line 84
    iget-wide v0, p0, Lcom/smartengines/visualization/Visualization$Timer$Data;->stopTime:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/smartengines/visualization/Visualization$Timer$Data;->startTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/smartengines/visualization/Visualization$Timer$Data;->stopTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Data(startTime="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/smartengines/visualization/Visualization$Timer$Data;->startTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stopTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/smartengines/visualization/Visualization$Timer$Data;->stopTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
