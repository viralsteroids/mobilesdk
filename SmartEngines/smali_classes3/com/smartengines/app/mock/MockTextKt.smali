.class public final Lcom/smartengines/app/mock/MockTextKt;
.super Ljava/lang/Object;
.source "MockText.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\"\u0011\u0010\u0000\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0008"
    }
    d2 = {
        "mockTextResultData",
        "Lcom/smartengines/engine/text/TextResultData;",
        "getMockTextResultData",
        "()Lcom/smartengines/engine/text/TextResultData;",
        "mockTextBitmap",
        "Landroid/graphics/Bitmap;",
        "context",
        "Landroid/content/Context;",
        "app_storeRelease"
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
.method public static final getMockTextResultData()Lcom/smartengines/engine/text/TextResultData;
    .locals 20

    .line 12
    new-instance v0, Lcom/smartengines/engine/text/TextResultData;

    const/4 v1, 0x2

    .line 14
    new-array v2, v1, [Lcom/smartengines/engine/text/TextResultChunk;

    new-instance v3, Lcom/smartengines/engine/text/TextResultChunk;

    new-instance v8, Lcom/smartengines/engine/Geometry;

    const/4 v9, 0x4

    .line 15
    new-array v4, v9, [Lcom/smartengines/visualization/QuadPoint;

    new-instance v5, Lcom/smartengines/visualization/QuadPoint;

    const/high16 v10, 0x42c80000    # 100.0f

    const v6, 0x44d48000    # 1700.0f

    invoke-direct {v5, v10, v6}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    const/4 v11, 0x0

    aput-object v5, v4, v11

    .line 16
    new-instance v5, Lcom/smartengines/visualization/QuadPoint;

    invoke-direct {v5, v6, v6}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    const/4 v12, 0x1

    aput-object v5, v4, v12

    .line 17
    new-instance v5, Lcom/smartengines/visualization/QuadPoint;

    const v7, 0x45002000    # 2050.0f

    invoke-direct {v5, v6, v7}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    aput-object v5, v4, v1

    .line 18
    new-instance v5, Lcom/smartengines/visualization/QuadPoint;

    invoke-direct {v5, v10, v7}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    const/4 v13, 0x3

    aput-object v5, v4, v13

    .line 14
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 19
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 14
    invoke-direct {v8, v11, v4, v5}, Lcom/smartengines/engine/Geometry;-><init>(ILjava/util/List;Landroid/graphics/Rect;)V

    const-string/jumbo v4, "\u041f\u043e\u043f\u0440\u043e\u0431\u0443\u0439\u0442\u0435"

    const-wide v5, 0x3feccccccccccccdL    # 0.9

    const/4 v7, 0x1

    invoke-direct/range {v3 .. v8}, Lcom/smartengines/engine/text/TextResultChunk;-><init>(Ljava/lang/String;DZLcom/smartengines/engine/Geometry;)V

    aput-object v3, v2, v11

    .line 22
    new-instance v14, Lcom/smartengines/engine/text/TextResultChunk;

    new-instance v3, Lcom/smartengines/engine/Geometry;

    .line 23
    new-array v4, v9, [Lcom/smartengines/visualization/QuadPoint;

    new-instance v5, Lcom/smartengines/visualization/QuadPoint;

    const v6, 0x450ca000    # 2250.0f

    invoke-direct {v5, v10, v6}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    aput-object v5, v4, v11

    .line 24
    new-instance v5, Lcom/smartengines/visualization/QuadPoint;

    const/high16 v7, 0x44fa0000    # 2000.0f

    invoke-direct {v5, v7, v6}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    aput-object v5, v4, v12

    .line 25
    new-instance v5, Lcom/smartengines/visualization/QuadPoint;

    const v6, 0x451f6000    # 2550.0f

    invoke-direct {v5, v7, v6}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    aput-object v5, v4, v1

    .line 26
    new-instance v1, Lcom/smartengines/visualization/QuadPoint;

    invoke-direct {v1, v10, v6}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    aput-object v1, v4, v13

    .line 22
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 27
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 22
    invoke-direct {v3, v11, v1, v4}, Lcom/smartengines/engine/Geometry;-><init>(ILjava/util/List;Landroid/graphics/Rect;)V

    const-string/jumbo v15, "\u043f\u0438\u0440\u043e\u0433 5 \u0441\u044b\u0440\u043e\u0432"

    const-wide/high16 v16, 0x3fe0000000000000L    # 0.5

    const/16 v18, 0x0

    move-object/from16 v19, v3

    invoke-direct/range {v14 .. v19}, Lcom/smartengines/engine/text/TextResultChunk;-><init>(Ljava/lang/String;DZLcom/smartengines/engine/Geometry;)V

    aput-object v14, v2, v12

    .line 13
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 30
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    .line 12
    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/text/TextResultData;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public static final mockTextBitmap(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    const-string v0, "sample_text.jpg"

    invoke-static {p0, v0}, Lcom/smartengines/utils/UtilsKt;->loadBitmapFromAssetFile(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method
