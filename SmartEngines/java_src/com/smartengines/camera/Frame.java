package com.smartengines.camera;

import android.graphics.Bitmap;
import androidx.camera.core.ImageProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Frame.kt */
@Metadata(m513d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m514d2 = {"Lcom/smartengines/camera/Frame;", "", "bitmap", "Landroid/graphics/Bitmap;", "imageProxy", "Landroidx/camera/core/ImageProxy;", "<init>", "(Landroid/graphics/Bitmap;Landroidx/camera/core/ImageProxy;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getImageProxy", "()Landroidx/camera/core/ImageProxy;", "close", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "camera_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Frame {
    public static final int $stable = 8;
    private final Bitmap bitmap;
    private final ImageProxy imageProxy;

    public static /* synthetic */ Frame copy$default(Frame frame, Bitmap bitmap, ImageProxy imageProxy, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = frame.bitmap;
        }
        if ((i & 2) != 0) {
            imageProxy = frame.imageProxy;
        }
        return frame.copy(bitmap, imageProxy);
    }

    /* renamed from: component1, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* renamed from: component2, reason: from getter */
    public final ImageProxy getImageProxy() {
        return this.imageProxy;
    }

    public final Frame copy(Bitmap bitmap, ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return new Frame(bitmap, imageProxy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) other;
        return Intrinsics.areEqual(this.bitmap, frame.bitmap) && Intrinsics.areEqual(this.imageProxy, frame.imageProxy);
    }

    public int hashCode() {
        int iHashCode = this.bitmap.hashCode() * 31;
        ImageProxy imageProxy = this.imageProxy;
        return iHashCode + (imageProxy == null ? 0 : imageProxy.hashCode());
    }

    public String toString() {
        return "Frame(bitmap=" + this.bitmap + ", imageProxy=" + this.imageProxy + ')';
    }

    public Frame(Bitmap bitmap, ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.bitmap = bitmap;
        this.imageProxy = imageProxy;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final ImageProxy getImageProxy() {
        return this.imageProxy;
    }

    public final void close() {
        ImageProxy imageProxy = this.imageProxy;
        if (imageProxy != null) {
            imageProxy.close();
        }
    }
}
