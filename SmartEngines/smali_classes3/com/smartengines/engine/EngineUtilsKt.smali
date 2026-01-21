.class public final Lcom/smartengines/engine/EngineUtilsKt;
.super Ljava/lang/Object;
.source "EngineUtils.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEngineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineUtils.kt\ncom/smartengines/engine/EngineUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "toQuad",
        "Lcom/smartengines/visualization/Quad;",
        "Lcom/smartengines/common/Quadrangle;",
        "toQuadrangle",
        "toRectangle",
        "Lcom/smartengines/common/Rectangle;",
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
.method public static final toQuad(Lcom/smartengines/common/Quadrangle;)Lcom/smartengines/visualization/Quad;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_0

    .line 12
    invoke-virtual {p0, v1}, Lcom/smartengines/common/Quadrangle;->GetPoint(I)Lcom/smartengines/common/Point;

    move-result-object v2

    .line 14
    new-instance v3, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v2}, Lcom/smartengines/common/Point;->getX()D

    move-result-wide v4

    invoke-virtual {v2}, Lcom/smartengines/common/Point;->getY()D

    move-result-wide v6

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/smartengines/visualization/QuadPoint;-><init>(DD)V

    .line 13
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 19
    :cond_0
    new-instance p0, Lcom/smartengines/visualization/Quad;

    check-cast v0, Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/smartengines/visualization/Quad;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method public static final toQuad(Lcom/smartengines/common/Rectangle;)Lcom/smartengines/visualization/Quad;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    new-instance v0, Lcom/smartengines/visualization/Quad;

    const/4 v1, 0x4

    .line 45
    new-array v1, v1, [Lcom/smartengines/visualization/QuadPoint;

    new-instance v2, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getX()I

    move-result v3

    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getY()I

    move-result v4

    invoke-direct {v2, v3, v4}, Lcom/smartengines/visualization/QuadPoint;-><init>(II)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 46
    new-instance v2, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getX()I

    move-result v3

    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getWidth()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getY()I

    move-result v4

    invoke-direct {v2, v3, v4}, Lcom/smartengines/visualization/QuadPoint;-><init>(II)V

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 47
    new-instance v2, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getX()I

    move-result v3

    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getWidth()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getY()I

    move-result v4

    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getHeight()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v2, v3, v4}, Lcom/smartengines/visualization/QuadPoint;-><init>(II)V

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 48
    new-instance v2, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getX()I

    move-result v3

    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getY()I

    move-result v4

    invoke-virtual {p0}, Lcom/smartengines/common/Rectangle;->getHeight()I

    move-result p0

    add-int/2addr v4, p0

    invoke-direct {v2, v3, v4}, Lcom/smartengines/visualization/QuadPoint;-><init>(II)V

    const/4 p0, 0x3

    aput-object v2, v1, p0

    .line 44
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/smartengines/visualization/Quad;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static final toQuadrangle(Lcom/smartengines/visualization/Quad;)Lcom/smartengines/common/Quadrangle;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    new-instance v0, Lcom/smartengines/common/Quadrangle;

    .line 24
    new-instance v1, Lcom/smartengines/common/Point;

    invoke-virtual {p0}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v2}, Lcom/smartengines/visualization/QuadPoint;->getX()F

    move-result v2

    float-to-double v4, v2

    invoke-virtual {p0}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v2}, Lcom/smartengines/visualization/QuadPoint;->getX()F

    move-result v2

    float-to-double v2, v2

    invoke-direct {v1, v4, v5, v2, v3}, Lcom/smartengines/common/Point;-><init>(DD)V

    .line 25
    new-instance v2, Lcom/smartengines/common/Point;

    invoke-virtual {p0}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v3}, Lcom/smartengines/visualization/QuadPoint;->getX()F

    move-result v3

    float-to-double v5, v3

    invoke-virtual {p0}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v3}, Lcom/smartengines/visualization/QuadPoint;->getX()F

    move-result v3

    float-to-double v3, v3

    invoke-direct {v2, v5, v6, v3, v4}, Lcom/smartengines/common/Point;-><init>(DD)V

    .line 26
    new-instance v3, Lcom/smartengines/common/Point;

    invoke-virtual {p0}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x2

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v4}, Lcom/smartengines/visualization/QuadPoint;->getX()F

    move-result v4

    float-to-double v6, v4

    invoke-virtual {p0}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v4}, Lcom/smartengines/visualization/QuadPoint;->getX()F

    move-result v4

    float-to-double v4, v4

    invoke-direct {v3, v6, v7, v4, v5}, Lcom/smartengines/common/Point;-><init>(DD)V

    .line 27
    new-instance v4, Lcom/smartengines/common/Point;

    invoke-virtual {p0}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x3

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v5}, Lcom/smartengines/visualization/QuadPoint;->getX()F

    move-result v5

    float-to-double v7, v5

    invoke-virtual {p0}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {p0}, Lcom/smartengines/visualization/QuadPoint;->getX()F

    move-result p0

    float-to-double v5, p0

    invoke-direct {v4, v7, v8, v5, v6}, Lcom/smartengines/common/Point;-><init>(DD)V

    .line 23
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/smartengines/common/Quadrangle;-><init>(Lcom/smartengines/common/Point;Lcom/smartengines/common/Point;Lcom/smartengines/common/Point;Lcom/smartengines/common/Point;)V

    return-object v0
.end method

.method public static final toRectangle(Lcom/smartengines/visualization/Quad;)Lcom/smartengines/common/Rectangle;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-virtual {p0}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v1}, Lcom/smartengines/visualization/QuadPoint;->getX()F

    move-result v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v2}, Lcom/smartengines/visualization/QuadPoint;->getX()F

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p0}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v2}, Lcom/smartengines/visualization/QuadPoint;->getX()F

    move-result v2

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v3}, Lcom/smartengines/visualization/QuadPoint;->getX()F

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p0}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v3}, Lcom/smartengines/visualization/QuadPoint;->getY()F

    move-result v3

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v4}, Lcom/smartengines/visualization/QuadPoint;->getY()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    goto :goto_2

    .line 34
    :cond_2
    invoke-virtual {p0}, Lcom/smartengines/visualization/Quad;->getPoints()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v0}, Lcom/smartengines/visualization/QuadPoint;->getY()F

    move-result v0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v4}, Lcom/smartengines/visualization/QuadPoint;->getY()F

    move-result v4

    invoke-static {v0, v4}, Ljava/lang/Math;->max(FF)F

    move-result v0

    goto :goto_3

    .line 35
    :cond_3
    new-instance p0, Lcom/smartengines/common/Rectangle;

    float-to-int v4, v1

    float-to-int v5, v3

    sub-float/2addr v2, v1

    float-to-int v1, v2

    sub-float/2addr v0, v3

    float-to-int v0, v0

    invoke-direct {p0, v4, v5, v1, v0}, Lcom/smartengines/common/Rectangle;-><init>(IIII)V

    return-object p0

    .line 34
    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0

    .line 33
    :cond_5
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0

    .line 32
    :cond_6
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0

    .line 31
    :cond_7
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method
