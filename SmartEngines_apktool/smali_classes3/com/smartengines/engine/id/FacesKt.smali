.class public final Lcom/smartengines/engine/id/FacesKt;
.super Ljava/lang/Object;
.source "Faces.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "compareFaces",
        "Lcom/smartengines/engine/id/FacesResult;",
        "Lcom/smartengines/engine/id/IdEngineWrapper;",
        "bitmapOne",
        "Landroid/graphics/Bitmap;",
        "bitmapTwo",
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
.method public static final compareFaces(Lcom/smartengines/engine/id/IdEngineWrapper;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Lcom/smartengines/engine/id/FacesResult;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmapOne"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmapTwo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 32
    :try_start_0
    invoke-virtual {p0}, Lcom/smartengines/engine/id/IdEngineWrapper;->getIdEngine()Lcom/smartengines/id/IdEngine;

    move-result-object v1

    invoke-virtual {v1}, Lcom/smartengines/id/IdEngine;->CreateFaceSessionSettings()Lcom/smartengines/id/IdFaceSessionSettings;

    move-result-object v1

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/engine/id/IdEngineWrapper;->getIdEngine()Lcom/smartengines/id/IdEngine;

    move-result-object v2

    invoke-virtual {p0}, Lcom/smartengines/engine/id/IdEngineWrapper;->getSignature()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, v1, p0}, Lcom/smartengines/id/IdEngine;->SpawnFaceSession(Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;)Lcom/smartengines/id/IdFaceSession;

    move-result-object v0

    .line 36
    sget-object p0, Lcom/smartengines/engine/ImageFactory;->INSTANCE:Lcom/smartengines/engine/ImageFactory;

    invoke-virtual {p0, p1}, Lcom/smartengines/engine/ImageFactory;->imageFromBitmap(Landroid/graphics/Bitmap;)Lcom/smartengines/common/Image;

    move-result-object p0

    .line 37
    sget-object p1, Lcom/smartengines/engine/ImageFactory;->INSTANCE:Lcom/smartengines/engine/ImageFactory;

    invoke-virtual {p1, p2}, Lcom/smartengines/engine/ImageFactory;->imageFromBitmap(Landroid/graphics/Bitmap;)Lcom/smartengines/common/Image;

    move-result-object p1

    .line 35
    invoke-virtual {v0, p0, p1}, Lcom/smartengines/id/IdFaceSession;->GetSimilarity(Lcom/smartengines/common/Image;Lcom/smartengines/common/Image;)Lcom/smartengines/id/IdFaceSimilarityResult;

    move-result-object p0

    .line 40
    invoke-virtual {v0}, Lcom/smartengines/id/IdFaceSession;->delete()V

    .line 42
    invoke-virtual {p0}, Lcom/smartengines/id/IdFaceSimilarityResult;->GetStatus()Lcom/smartengines/id/IdFaceStatus;

    move-result-object p1

    .line 43
    sget-object p2, Lcom/smartengines/id/IdFaceStatus;->IdFaceStatus_Success:Lcom/smartengines/id/IdFaceStatus;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 44
    new-instance p1, Lcom/smartengines/engine/id/FacesResult$Success;

    invoke-virtual {p0}, Lcom/smartengines/id/IdFaceSimilarityResult;->GetSimilarityEstimation()D

    move-result-wide v1

    invoke-direct {p1, v1, v2}, Lcom/smartengines/engine/id/FacesResult$Success;-><init>(D)V

    check-cast p1, Lcom/smartengines/engine/id/FacesResult;

    return-object p1

    .line 46
    :cond_0
    sget-object p0, Lcom/smartengines/engine/id/FacesResult$Error;->Companion:Lcom/smartengines/engine/id/FacesResult$Error$Companion;

    invoke-virtual {p1}, Lcom/smartengines/id/IdFaceStatus;->swigValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/smartengines/engine/id/FacesResult$Error$Companion;->fromInt(I)Lcom/smartengines/engine/id/FacesResult$Error;

    move-result-object p0

    check-cast p0, Lcom/smartengines/engine/id/FacesResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    if-eqz v0, :cond_1

    .line 49
    invoke-virtual {v0}, Lcom/smartengines/id/IdFaceSession;->delete()V

    .line 50
    :cond_1
    new-instance p1, Lcom/smartengines/engine/id/FacesResult$Exception;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_2

    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_2
    invoke-direct {p1, p2}, Lcom/smartengines/engine/id/FacesResult$Exception;-><init>(Ljava/lang/String;)V

    check-cast p1, Lcom/smartengines/engine/id/FacesResult;

    return-object p1
.end method
