.class public final Lcom/smartengines/engine/GeometryKt;
.super Ljava/lang/Object;
.source "Geometry.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGeometry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Geometry.kt\ncom/smartengines/engine/GeometryKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "toGeometry",
        "Lcom/smartengines/engine/Geometry;",
        "Lcom/smartengines/common/Polygon;",
        "sceneId",
        "",
        "engine_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toGeometry(Lcom/smartengines/common/Polygon;I)Lcom/smartengines/engine/Geometry;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    invoke-virtual {p0}, Lcom/smartengines/common/Polygon;->GetPointsCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 27
    invoke-virtual {p0, v2}, Lcom/smartengines/common/Polygon;->GetPoint(I)Lcom/smartengines/common/Point;

    move-result-object v3

    .line 28
    new-instance v4, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v3}, Lcom/smartengines/common/Point;->getX()D

    move-result-wide v5

    double-to-float v5, v5

    invoke-virtual {v3}, Lcom/smartengines/common/Point;->getY()D

    move-result-wide v6

    double-to-float v3, v6

    invoke-direct {v4, v5, v3}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 31
    :cond_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 25
    check-cast v0, Ljava/util/List;

    .line 32
    invoke-virtual {p0}, Lcom/smartengines/common/Polygon;->GetBoundingRectangle()Lcom/smartengines/common/Rectangle;

    move-result-object p0

    new-instance v1, Landroid/graphics/Rect;

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getX()I

    move-result v2

    .line 34
    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getY()I

    move-result v3

    .line 35
    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getX()I

    move-result v4

    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getWidth()I

    move-result v5

    add-int/2addr v4, v5

    .line 36
    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getY()I

    move-result v5

    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getHeight()I

    move-result p0

    add-int/2addr v5, p0

    .line 32
    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 23
    new-instance p0, Lcom/smartengines/engine/Geometry;

    invoke-direct {p0, p1, v0, v1}, Lcom/smartengines/engine/Geometry;-><init>(ILjava/util/List;Landroid/graphics/Rect;)V

    return-object p0
.end method
