package com.smartengines.app;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Log;
import androidx.compose.p000ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p000ui.graphics.ImageBitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Photo.kt */
@Metadata(m513d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m514d2 = {"Lcom/smartengines/app/Photo;", "", "bitmap", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/graphics/Bitmap;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "imageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "getImageBitmap", "()Landroidx/compose/ui/graphics/ImageBitmap;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Photo {
    public static final int $stable = 8;
    private final Bitmap bitmap;
    private final ImageBitmap imageBitmap;

    public static /* synthetic */ Photo copy$default(Photo photo, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = photo.bitmap;
        }
        return photo.copy(bitmap);
    }

    /* renamed from: component1, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final Photo copy(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return new Photo(bitmap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Photo) && Intrinsics.areEqual(this.bitmap, ((Photo) other).bitmap);
    }

    public int hashCode() {
        return this.bitmap.hashCode();
    }

    public String toString() {
        return "Photo(bitmap=" + this.bitmap + ')';
    }

    public Photo(Bitmap bitmap) {
        ImageBitmap imageBitmapAsImageBitmap;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.bitmap = bitmap;
        int width = bitmap.getWidth() * bitmap.getHeight();
        Log.w("myapp.Ph", " ============================ size: " + width + ' ' + bitmap.getWidth() + ' ' + bitmap.getHeight() + ' ');
        if (width > 10000000) {
            Log.w("myapp.Ph", " ============================ reducing ");
            float f = 1.0E7f / width;
            Matrix matrix = new Matrix();
            matrix.preScale(f, f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            imageBitmapAsImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(bitmapCreateBitmap);
        } else {
            imageBitmapAsImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(bitmap);
        }
        this.imageBitmap = imageBitmapAsImageBitmap;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final ImageBitmap getImageBitmap() {
        return this.imageBitmap;
    }
}
