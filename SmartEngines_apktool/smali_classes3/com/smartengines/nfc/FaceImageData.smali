.class public final Lcom/smartengines/nfc/FaceImageData;
.super Ljava/lang/Object;
.source "FaceImageData.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tB\u0011\u0008\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0008\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/smartengines/nfc/FaceImageData;",
        "",
        "mimeType",
        "",
        "size",
        "Landroid/util/Size;",
        "buffer",
        "",
        "<init>",
        "(Ljava/lang/String;Landroid/util/Size;[B)V",
        "jmrtdFaceImageInfo",
        "Lorg/jmrtd/lds/iso19794/FaceImageInfo;",
        "(Lorg/jmrtd/lds/iso19794/FaceImageInfo;)V",
        "getMimeType",
        "()Ljava/lang/String;",
        "getSize",
        "()Landroid/util/Size;",
        "getBuffer",
        "()[B",
        "nfc_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final buffer:[B

.field private final mimeType:Ljava/lang/String;

.field private final size:Landroid/util/Size;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/util/Size;[B)V
    .locals 1

    const-string v0, "mimeType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "size"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buffer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/smartengines/nfc/FaceImageData;->mimeType:Ljava/lang/String;

    .line 11
    iput-object p2, p0, Lcom/smartengines/nfc/FaceImageData;->size:Landroid/util/Size;

    .line 12
    iput-object p3, p0, Lcom/smartengines/nfc/FaceImageData;->buffer:[B

    return-void
.end method

.method public constructor <init>(Lorg/jmrtd/lds/iso19794/FaceImageInfo;)V
    .locals 5

    const-string v0, "jmrtdFaceImageInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p1}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->getMimeType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getMimeType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    new-instance v1, Landroid/util/Size;

    invoke-virtual {p1}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/util/Size;-><init>(II)V

    .line 17
    invoke-virtual {p1}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->getImageLength()I

    move-result v2

    new-array v3, v2, [B

    .line 18
    new-instance v4, Ljava/io/DataInputStream;

    invoke-virtual {p1}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->getImageInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {v4, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 p1, 0x0

    .line 19
    invoke-virtual {v4, v3, p1, v2}, Ljava/io/DataInputStream;->readFully([BII)V

    .line 20
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    invoke-direct {p0, v0, v1, v3}, Lcom/smartengines/nfc/FaceImageData;-><init>(Ljava/lang/String;Landroid/util/Size;[B)V

    return-void
.end method


# virtual methods
.method public final getBuffer()[B
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/smartengines/nfc/FaceImageData;->buffer:[B

    return-object v0
.end method

.method public final getMimeType()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/smartengines/nfc/FaceImageData;->mimeType:Ljava/lang/String;

    return-object v0
.end method

.method public final getSize()Landroid/util/Size;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/smartengines/nfc/FaceImageData;->size:Landroid/util/Size;

    return-object v0
.end method
