package com.smartengines.camera;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import androidx.camera.core.ImageProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraUtils.kt */
@Metadata(m513d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a-\u0010\u0007\u001a\u00020\b*\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m514d2 = {"TAG", "", "sensorRotation", "", "getDisplayRotation", "activity", "Landroid/app/Activity;", "toBitmapLikeInPreview", "Landroid/graphics/Bitmap;", "Landroidx/camera/core/ImageProxy;", "isFrontCamera", "", "sizeLimit", "", "(Landroidx/camera/core/ImageProxy;Landroid/app/Activity;ZLjava/lang/Integer;)Landroid/graphics/Bitmap;", "camera_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CameraUtilsKt {
    private static final String TAG = "myapp.CameraUtils";
    private static final float sensorRotation = 90.0f;

    private static final float getDisplayRotation(Activity activity) {
        int rotation;
        if (Build.VERSION.SDK_INT >= 30) {
            rotation = activity.getDisplay().getRotation();
        } else {
            rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        }
        if (rotation == 0) {
            return 0.0f;
        }
        if (rotation == 1) {
            return sensorRotation;
        }
        if (rotation == 2) {
            return 180.0f;
        }
        if (rotation == 3) {
            return 270.0f;
        }
        Log.e(TAG, "Unsupported display rotation code: " + rotation);
        return 0.0f;
    }

    public static /* synthetic */ Bitmap toBitmapLikeInPreview$default(ImageProxy imageProxy, Activity activity, boolean z, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return toBitmapLikeInPreview(imageProxy, activity, z, num);
    }

    public static final Bitmap toBitmapLikeInPreview(ImageProxy imageProxy, Activity activity, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(imageProxy, "<this>");
        float displayRotation = activity != null ? getDisplayRotation(activity) : 0.0f;
        Bitmap bitmap = imageProxy.toBitmap();
        Intrinsics.checkNotNullExpressionValue(bitmap, "toBitmap(...)");
        Matrix matrix = new Matrix();
        imageProxy.getImageInfo().getSensorToBufferTransformMatrix().invert(matrix);
        matrix.postRotate(sensorRotation - displayRotation);
        if (z) {
            matrix.postScale(1.0f, -1.0f);
        }
        if (num != null) {
            float fIntValue = num.intValue();
            float fMin = Math.min(fIntValue / bitmap.getWidth(), fIntValue / bitmap.getHeight());
            if (fMin < 1.0f) {
                matrix.postScale(fMin, fMin);
            }
        }
        Rect cropRect = imageProxy.getCropRect();
        Intrinsics.checkNotNullExpressionValue(cropRect, "getCropRect(...)");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, cropRect.left, cropRect.top, cropRect.width(), cropRect.height(), matrix, false);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }
}
