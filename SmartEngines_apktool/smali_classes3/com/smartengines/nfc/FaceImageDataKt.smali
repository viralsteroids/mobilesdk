.class public final Lcom/smartengines/nfc/FaceImageDataKt;
.super Ljava/lang/Object;
.source "FaceImageData.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFaceImageData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceImageData.kt\ncom/smartengines/nfc/FaceImageDataKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1863#2:32\n1863#2,2:33\n1864#2:35\n*S KotlinDebug\n*F\n+ 1 FaceImageData.kt\ncom/smartengines/nfc/FaceImageDataKt\n*L\n26#1:32\n27#1:33,2\n26#1:35\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u0001\u00a8\u0006\u0004"
    }
    d2 = {
        "toFaceImageDataList",
        "",
        "Lcom/smartengines/nfc/FaceImageData;",
        "Lorg/jmrtd/lds/iso19794/FaceInfo;",
        "nfc_release"
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
.method public static final toFaceImageDataList(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/jmrtd/lds/iso19794/FaceInfo;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/smartengines/nfc/FaceImageData;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 26
    check-cast p0, Ljava/lang/Iterable;

    .line 32
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jmrtd/lds/iso19794/FaceInfo;

    .line 27
    invoke-virtual {v1}, Lorg/jmrtd/lds/iso19794/FaceInfo;->getFaceImageInfos()Ljava/util/List;

    move-result-object v1

    const-string v2, "getFaceImageInfos(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    .line 33
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jmrtd/lds/iso19794/FaceImageInfo;

    .line 28
    new-instance v3, Lcom/smartengines/nfc/FaceImageData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v3, v2}, Lcom/smartengines/nfc/FaceImageData;-><init>(Lorg/jmrtd/lds/iso19794/FaceImageInfo;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method
