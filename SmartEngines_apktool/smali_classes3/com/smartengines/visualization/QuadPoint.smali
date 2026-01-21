.class public final Lcom/smartengines/visualization/QuadPoint;
.super Ljava/lang/Object;
.source "QuadPoint.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B\u0019\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0008B\u0019\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0005\u0010\nB\u0011\u0008\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0005\u0010\rJ\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c7\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d7\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00d7\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/smartengines/visualization/QuadPoint;",
        "",
        "x",
        "",
        "y",
        "<init>",
        "(FF)V",
        "",
        "(II)V",
        "",
        "(DD)V",
        "json",
        "Lorg/json/JSONObject;",
        "(Lorg/json/JSONObject;)V",
        "getX",
        "()F",
        "getY",
        "toString",
        "",
        "getJson",
        "()Lorg/json/JSONObject;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
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
.field private final x:F

.field private final y:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(DD)V
    .locals 0

    double-to-float p1, p1

    double-to-float p2, p3

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput p1, p0, Lcom/smartengines/visualization/QuadPoint;->x:F

    .line 12
    iput p2, p0, Lcom/smartengines/visualization/QuadPoint;->y:F

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    int-to-float p1, p1

    int-to-float p2, p2

    .line 18
    invoke-direct {p0, p1, p2}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 3

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    const-string/jumbo v0, "x"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-float v0, v0

    .line 31
    const-string/jumbo v1, "y"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    double-to-float p1, v1

    .line 29
    invoke-direct {p0, v0, p1}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/visualization/QuadPoint;FFILjava/lang/Object;)Lcom/smartengines/visualization/QuadPoint;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/smartengines/visualization/QuadPoint;->x:F

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/smartengines/visualization/QuadPoint;->y:F

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/smartengines/visualization/QuadPoint;->copy(FF)Lcom/smartengines/visualization/QuadPoint;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/smartengines/visualization/QuadPoint;->x:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/smartengines/visualization/QuadPoint;->y:F

    return v0
.end method

.method public final copy(FF)Lcom/smartengines/visualization/QuadPoint;
    .locals 1

    new-instance v0, Lcom/smartengines/visualization/QuadPoint;

    invoke-direct {v0, p1, p2}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/visualization/QuadPoint;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/visualization/QuadPoint;

    iget v1, p0, Lcom/smartengines/visualization/QuadPoint;->x:F

    iget v3, p1, Lcom/smartengines/visualization/QuadPoint;->x:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/smartengines/visualization/QuadPoint;->y:F

    iget p1, p1, Lcom/smartengines/visualization/QuadPoint;->y:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getJson()Lorg/json/JSONObject;
    .locals 4

    .line 23
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 24
    iget v1, p0, Lcom/smartengines/visualization/QuadPoint;->x:F

    float-to-double v1, v1

    const-string/jumbo v3, "x"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 25
    iget v1, p0, Lcom/smartengines/visualization/QuadPoint;->y:F

    float-to-double v1, v1

    const-string/jumbo v3, "y"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    return-object v0
.end method

.method public final getX()F
    .locals 1

    .line 11
    iget v0, p0, Lcom/smartengines/visualization/QuadPoint;->x:F

    return v0
.end method

.method public final getY()F
    .locals 1

    .line 12
    iget v0, p0, Lcom/smartengines/visualization/QuadPoint;->y:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/smartengines/visualization/QuadPoint;->x:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/smartengines/visualization/QuadPoint;->y:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/smartengines/visualization/QuadPoint;->x:F

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/smartengines/visualization/QuadPoint;->y:F

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
