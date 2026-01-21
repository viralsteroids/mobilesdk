.class public final Lcom/smartengines/camera/CropKt;
.super Ljava/lang/Object;
.source "Crop.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "calculateTargetCropRectangle",
        "Landroidx/compose/ui/geometry/Rect;",
        "screen",
        "Landroidx/compose/ui/geometry/Size;",
        "calculateTargetCropRectangle-uvyYCjk",
        "(J)Landroidx/compose/ui/geometry/Rect;",
        "applyTargetCrop",
        "Landroid/graphics/Bitmap;",
        "camera_release"
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
.method public static final applyTargetCrop(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/smartengines/camera/CropKt;->calculateTargetCropRectangle-uvyYCjk(J)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v1

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v1

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getWidth()F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getHeight()F

    move-result v0

    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v0

    .line 21
    invoke-static {p0, v1, v2, v3, v0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object p0

    const-string v0, "createBitmap(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final calculateTargetCropRectangle-uvyYCjk(J)Landroidx/compose/ui/geometry/Rect;
    .locals 3

    .line 9
    invoke-static {p0, p1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v0

    .line 10
    invoke-static {p0, p1}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result p0

    const p1, 0x3f666666    # 0.9f

    mul-float/2addr p1, v0

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float v2, p1, v1

    sub-float/2addr v0, p1

    div-float/2addr v0, v1

    sub-float/2addr p0, v2

    div-float/2addr p0, v1

    .line 15
    new-instance v1, Landroidx/compose/ui/geometry/Rect;

    add-float/2addr p1, v0

    add-float/2addr v2, p0

    invoke-direct {v1, v0, p0, p1, v2}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    return-object v1
.end method
