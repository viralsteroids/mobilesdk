.class public final Lcom/smartengines/camera/Frame;
.super Ljava/lang/Object;
.source "Frame.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0006\u0010\u000c\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c7\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d7\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d7\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d7\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/smartengines/camera/Frame;",
        "",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "imageProxy",
        "Landroidx/camera/core/ImageProxy;",
        "<init>",
        "(Landroid/graphics/Bitmap;Landroidx/camera/core/ImageProxy;)V",
        "getBitmap",
        "()Landroid/graphics/Bitmap;",
        "getImageProxy",
        "()Landroidx/camera/core/ImageProxy;",
        "close",
        "",
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
        "camera_release"
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
.field private final bitmap:Landroid/graphics/Bitmap;

.field private final imageProxy:Landroidx/camera/core/ImageProxy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;Landroidx/camera/core/ImageProxy;)V
    .locals 1

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/smartengines/camera/Frame;->bitmap:Landroid/graphics/Bitmap;

    .line 13
    iput-object p2, p0, Lcom/smartengines/camera/Frame;->imageProxy:Landroidx/camera/core/ImageProxy;

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/camera/Frame;Landroid/graphics/Bitmap;Landroidx/camera/core/ImageProxy;ILjava/lang/Object;)Lcom/smartengines/camera/Frame;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/smartengines/camera/Frame;->bitmap:Landroid/graphics/Bitmap;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/smartengines/camera/Frame;->imageProxy:Landroidx/camera/core/ImageProxy;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/smartengines/camera/Frame;->copy(Landroid/graphics/Bitmap;Landroidx/camera/core/ImageProxy;)Lcom/smartengines/camera/Frame;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/smartengines/camera/Frame;->imageProxy:Landroidx/camera/core/ImageProxy;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/ImageProxy;->close()V

    :cond_0
    return-void
.end method

.method public final component1()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/camera/Frame;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final component2()Landroidx/camera/core/ImageProxy;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/camera/Frame;->imageProxy:Landroidx/camera/core/ImageProxy;

    return-object v0
.end method

.method public final copy(Landroid/graphics/Bitmap;Landroidx/camera/core/ImageProxy;)Lcom/smartengines/camera/Frame;
    .locals 1

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/camera/Frame;

    invoke-direct {v0, p1, p2}, Lcom/smartengines/camera/Frame;-><init>(Landroid/graphics/Bitmap;Landroidx/camera/core/ImageProxy;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/camera/Frame;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/camera/Frame;

    iget-object v1, p0, Lcom/smartengines/camera/Frame;->bitmap:Landroid/graphics/Bitmap;

    iget-object v3, p1, Lcom/smartengines/camera/Frame;->bitmap:Landroid/graphics/Bitmap;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/smartengines/camera/Frame;->imageProxy:Landroidx/camera/core/ImageProxy;

    iget-object p1, p1, Lcom/smartengines/camera/Frame;->imageProxy:Landroidx/camera/core/ImageProxy;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/smartengines/camera/Frame;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final getImageProxy()Landroidx/camera/core/ImageProxy;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/smartengines/camera/Frame;->imageProxy:Landroidx/camera/core/ImageProxy;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/smartengines/camera/Frame;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/camera/Frame;->imageProxy:Landroidx/camera/core/ImageProxy;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Frame(bitmap="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/camera/Frame;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imageProxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/camera/Frame;->imageProxy:Landroidx/camera/core/ImageProxy;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
