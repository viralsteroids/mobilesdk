package com.smartengines.nfc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FaceImageDecoded.kt */
@Metadata(m513d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m514d2 = {"Lcom/smartengines/nfc/FaceImageDecoded;", "", "data", "Lcom/smartengines/nfc/FaceImageData;", "bitmap", "Lcom/smartengines/nfc/FaceImageBitmap;", "<init>", "(Lcom/smartengines/nfc/FaceImageData;Lcom/smartengines/nfc/FaceImageBitmap;)V", "getData", "()Lcom/smartengines/nfc/FaceImageData;", "getBitmap", "()Lcom/smartengines/nfc/FaceImageBitmap;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FaceImageDecoded {
    private final FaceImageBitmap bitmap;
    private final FaceImageData data;

    public static /* synthetic */ FaceImageDecoded copy$default(FaceImageDecoded faceImageDecoded, FaceImageData faceImageData, FaceImageBitmap faceImageBitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            faceImageData = faceImageDecoded.data;
        }
        if ((i & 2) != 0) {
            faceImageBitmap = faceImageDecoded.bitmap;
        }
        return faceImageDecoded.copy(faceImageData, faceImageBitmap);
    }

    /* renamed from: component1, reason: from getter */
    public final FaceImageData getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final FaceImageBitmap getBitmap() {
        return this.bitmap;
    }

    public final FaceImageDecoded copy(FaceImageData data, FaceImageBitmap bitmap) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return new FaceImageDecoded(data, bitmap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceImageDecoded)) {
            return false;
        }
        FaceImageDecoded faceImageDecoded = (FaceImageDecoded) other;
        return Intrinsics.areEqual(this.data, faceImageDecoded.data) && Intrinsics.areEqual(this.bitmap, faceImageDecoded.bitmap);
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.bitmap.hashCode();
    }

    public String toString() {
        return "FaceImageDecoded(data=" + this.data + ", bitmap=" + this.bitmap + ')';
    }

    public FaceImageDecoded(FaceImageData data, FaceImageBitmap bitmap) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.data = data;
        this.bitmap = bitmap;
    }

    public final FaceImageData getData() {
        return this.data;
    }

    public final FaceImageBitmap getBitmap() {
        return this.bitmap;
    }
}
