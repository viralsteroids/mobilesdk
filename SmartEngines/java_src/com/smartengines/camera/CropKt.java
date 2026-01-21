package com.smartengines.camera;

import android.graphics.Bitmap;
import androidx.compose.p000ui.geometry.Rect;
import androidx.compose.p000ui.geometry.Size;
import androidx.compose.p000ui.geometry.SizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: Crop.kt */
@Metadata(m513d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0007¨\u0006\b"}, m514d2 = {"calculateTargetCropRectangle", "Landroidx/compose/ui/geometry/Rect;", "screen", "Landroidx/compose/ui/geometry/Size;", "calculateTargetCropRectangle-uvyYCjk", "(J)Landroidx/compose/ui/geometry/Rect;", "applyTargetCrop", "Landroid/graphics/Bitmap;", "camera_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CropKt {
    /* renamed from: calculateTargetCropRectangle-uvyYCjk, reason: not valid java name */
    public static final Rect m7811calculateTargetCropRectangleuvyYCjk(long j) {
        float fM4423getWidthimpl = Size.m4423getWidthimpl(j);
        float f = 0.9f * fM4423getWidthimpl;
        float f2 = 2;
        float f3 = f / f2;
        float f4 = (fM4423getWidthimpl - f) / f2;
        float fM4420getHeightimpl = (Size.m4420getHeightimpl(j) - f3) / f2;
        return new Rect(f4, fM4420getHeightimpl, f + f4, f3 + fM4420getHeightimpl);
    }

    public static final Bitmap applyTargetCrop(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Rect rectM7811calculateTargetCropRectangleuvyYCjk = m7811calculateTargetCropRectangleuvyYCjk(SizeKt.Size(bitmap.getWidth(), bitmap.getHeight()));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, MathKt.roundToInt(rectM7811calculateTargetCropRectangleuvyYCjk.getLeft()), MathKt.roundToInt(rectM7811calculateTargetCropRectangleuvyYCjk.getTop()), MathKt.roundToInt(rectM7811calculateTargetCropRectangleuvyYCjk.getWidth()), MathKt.roundToInt(rectM7811calculateTargetCropRectangleuvyYCjk.getHeight()));
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }
}
