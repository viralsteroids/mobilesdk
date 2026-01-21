.class public final Lcom/smartengines/visualization/MockKt;
.super Ljava/lang/Object;
.source "Mock.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0017\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0004\"\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "mockQuadsPrimary",
        "",
        "Lcom/smartengines/visualization/QuadFrame;",
        "getMockQuadsPrimary",
        "()Ljava/util/List;",
        "mockQuadsSecondary",
        "getMockQuadsSecondary",
        "mockQuadsSinglePoints",
        "getMockQuadsSinglePoints",
        "mockVisualizations",
        "",
        "Lcom/smartengines/visualization/Visualization;",
        "getMockVisualizations",
        "()Ljava/util/Collection;",
        "visualization_release"
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
.method public static final getMockQuadsPrimary()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/QuadFrame;",
            ">;"
        }
    .end annotation

    .line 8
    new-instance v0, Lcom/smartengines/visualization/QuadFrame;

    .line 10
    new-instance v1, Lcom/smartengines/visualization/Quad;

    const/4 v2, 0x4

    .line 11
    new-array v2, v2, [Lcom/smartengines/visualization/QuadPoint;

    new-instance v3, Lcom/smartengines/visualization/QuadPoint;

    const/high16 v4, 0x41200000    # 10.0f

    invoke-direct {v3, v4, v4}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    .line 12
    new-instance v3, Lcom/smartengines/visualization/QuadPoint;

    const/high16 v5, 0x42b40000    # 90.0f

    invoke-direct {v3, v5, v4}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    const/4 v6, 0x1

    aput-object v3, v2, v6

    .line 13
    new-instance v3, Lcom/smartengines/visualization/QuadPoint;

    invoke-direct {v3, v5, v5}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    const/4 v6, 0x2

    aput-object v3, v2, v6

    .line 14
    new-instance v3, Lcom/smartengines/visualization/QuadPoint;

    invoke-direct {v3, v4, v5}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    const/4 v4, 0x3

    aput-object v3, v2, v4

    .line 10
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/smartengines/visualization/Quad;-><init>(Ljava/util/List;)V

    .line 9
    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    .line 17
    new-instance v2, Landroid/util/Size;

    const/16 v3, 0x64

    invoke-direct {v2, v3, v3}, Landroid/util/Size;-><init>(II)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    .line 8
    invoke-direct/range {v0 .. v6}, Lcom/smartengines/visualization/QuadFrame;-><init>(Ljava/util/Set;Landroid/util/Size;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final getMockQuadsSecondary()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/QuadFrame;",
            ">;"
        }
    .end annotation

    .line 21
    new-instance v0, Lcom/smartengines/visualization/QuadFrame;

    const/4 v1, 0x2

    .line 23
    new-array v2, v1, [Lcom/smartengines/visualization/Quad;

    new-instance v3, Lcom/smartengines/visualization/Quad;

    const/4 v4, 0x4

    .line 24
    new-array v5, v4, [Lcom/smartengines/visualization/QuadPoint;

    new-instance v6, Lcom/smartengines/visualization/QuadPoint;

    const/high16 v7, 0x41a00000    # 20.0f

    invoke-direct {v6, v7, v7}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    const/4 v8, 0x0

    aput-object v6, v5, v8

    .line 25
    new-instance v6, Lcom/smartengines/visualization/QuadPoint;

    const/high16 v9, 0x42200000    # 40.0f

    invoke-direct {v6, v9, v7}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    const/4 v10, 0x1

    aput-object v6, v5, v10

    .line 26
    new-instance v6, Lcom/smartengines/visualization/QuadPoint;

    invoke-direct {v6, v9, v9}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    aput-object v6, v5, v1

    .line 27
    new-instance v6, Lcom/smartengines/visualization/QuadPoint;

    invoke-direct {v6, v7, v9}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    const/4 v7, 0x3

    aput-object v6, v5, v7

    .line 23
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v3, v5}, Lcom/smartengines/visualization/Quad;-><init>(Ljava/util/List;)V

    aput-object v3, v2, v8

    .line 29
    new-instance v3, Lcom/smartengines/visualization/Quad;

    .line 30
    new-array v4, v4, [Lcom/smartengines/visualization/QuadPoint;

    new-instance v5, Lcom/smartengines/visualization/QuadPoint;

    const/high16 v6, 0x42480000    # 50.0f

    invoke-direct {v5, v6, v6}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    aput-object v5, v4, v8

    .line 31
    new-instance v5, Lcom/smartengines/visualization/QuadPoint;

    const/high16 v8, 0x42a00000    # 80.0f

    invoke-direct {v5, v8, v6}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    aput-object v5, v4, v10

    .line 32
    new-instance v5, Lcom/smartengines/visualization/QuadPoint;

    invoke-direct {v5, v8, v8}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    aput-object v5, v4, v1

    .line 33
    new-instance v1, Lcom/smartengines/visualization/QuadPoint;

    invoke-direct {v1, v6, v8}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    aput-object v1, v4, v7

    .line 29
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v3, v1}, Lcom/smartengines/visualization/Quad;-><init>(Ljava/util/List;)V

    aput-object v3, v2, v10

    .line 22
    invoke-static {v2}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    .line 36
    new-instance v2, Landroid/util/Size;

    const/16 v3, 0x64

    invoke-direct {v2, v3, v3}, Landroid/util/Size;-><init>(II)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    .line 21
    invoke-direct/range {v0 .. v6}, Lcom/smartengines/visualization/QuadFrame;-><init>(Ljava/util/Set;Landroid/util/Size;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final getMockQuadsSinglePoints()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/QuadFrame;",
            ">;"
        }
    .end annotation

    .line 39
    new-instance v0, Lcom/smartengines/visualization/QuadFrame;

    const/4 v1, 0x2

    .line 41
    new-array v1, v1, [Lcom/smartengines/visualization/Quad;

    new-instance v2, Lcom/smartengines/visualization/Quad;

    .line 42
    new-instance v3, Lcom/smartengines/visualization/QuadPoint;

    const/high16 v4, 0x42480000    # 50.0f

    const/high16 v5, 0x41f00000    # 30.0f

    invoke-direct {v3, v4, v5}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    .line 41
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/smartengines/visualization/Quad;-><init>(Ljava/util/List;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 44
    new-instance v2, Lcom/smartengines/visualization/Quad;

    .line 45
    new-instance v3, Lcom/smartengines/visualization/QuadPoint;

    invoke-direct {v3, v5, v4}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    .line 44
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/smartengines/visualization/Quad;-><init>(Ljava/util/List;)V

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 40
    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    .line 48
    new-instance v2, Landroid/util/Size;

    const/16 v3, 0x64

    invoke-direct {v2, v3, v3}, Landroid/util/Size;-><init>(II)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    .line 39
    invoke-direct/range {v0 .. v6}, Lcom/smartengines/visualization/QuadFrame;-><init>(Ljava/util/Set;Landroid/util/Size;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final getMockVisualizations()Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/smartengines/visualization/Visualization;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x3

    .line 60
    new-array v0, v0, [Lcom/smartengines/visualization/Visualization;

    new-instance v1, Lcom/smartengines/visualization/Visualization$Quads;

    invoke-static {}, Lcom/smartengines/visualization/MockKt;->getMockQuadsPrimary()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/smartengines/visualization/Visualization$Quads;-><init>(Ljava/util/List;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 61
    new-instance v1, Lcom/smartengines/visualization/Visualization$Quads;

    invoke-static {}, Lcom/smartengines/visualization/MockKt;->getMockQuadsSecondary()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/smartengines/visualization/Visualization$Quads;-><init>(Ljava/util/List;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 62
    new-instance v1, Lcom/smartengines/visualization/Visualization$Instruction;

    const-string v2, "The instruction"

    invoke-direct {v1, v2}, Lcom/smartengines/visualization/Visualization$Instruction;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 59
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method
