package com.smartengines.nfc;

import android.util.Size;
import java.io.DataInputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.iso19794.FaceImageInfo;

/* compiled from: FaceImageData.kt */
@Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m514d2 = {"Lcom/smartengines/nfc/FaceImageData;", "", "mimeType", "", "size", "Landroid/util/Size;", "buffer", "", "<init>", "(Ljava/lang/String;Landroid/util/Size;[B)V", "jmrtdFaceImageInfo", "Lorg/jmrtd/lds/iso19794/FaceImageInfo;", "(Lorg/jmrtd/lds/iso19794/FaceImageInfo;)V", "getMimeType", "()Ljava/lang/String;", "getSize", "()Landroid/util/Size;", "getBuffer", "()[B", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class FaceImageData {
    private final byte[] buffer;
    private final String mimeType;
    private final Size size;

    public FaceImageData(String mimeType, Size size, byte[] buffer) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.mimeType = mimeType;
        this.size = size;
        this.buffer = buffer;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Size getSize() {
        return this.size;
    }

    public final byte[] getBuffer() {
        return this.buffer;
    }

    public FaceImageData(FaceImageInfo jmrtdFaceImageInfo) throws IOException {
        Intrinsics.checkNotNullParameter(jmrtdFaceImageInfo, "jmrtdFaceImageInfo");
        String mimeType = jmrtdFaceImageInfo.getMimeType();
        Intrinsics.checkNotNullExpressionValue(mimeType, "getMimeType(...)");
        Size size = new Size(jmrtdFaceImageInfo.getWidth(), jmrtdFaceImageInfo.getHeight());
        int imageLength = jmrtdFaceImageInfo.getImageLength();
        byte[] bArr = new byte[imageLength];
        new DataInputStream(jmrtdFaceImageInfo.getImageInputStream()).readFully(bArr, 0, imageLength);
        Unit unit = Unit.INSTANCE;
        this(mimeType, size, bArr);
    }
}
