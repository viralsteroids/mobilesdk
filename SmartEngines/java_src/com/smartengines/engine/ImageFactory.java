package com.smartengines.engine;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.smartengines.common.Image;
import com.smartengines.common.ImagePixelFormat;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageFactory.kt */
@Metadata(m513d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m514d2 = {"Lcom/smartengines/engine/ImageFactory;", "", "<init>", "()V", "TAG", "", "imageFromBitmap", "Lcom/smartengines/common/Image;", "bitmap", "Landroid/graphics/Bitmap;", "imageToBitmap", "image", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ImageFactory {
    public static final ImageFactory INSTANCE = new ImageFactory();
    private static final String TAG = "myapp.ImageFactory";

    private ImageFactory() {
    }

    public final Image imageFromBitmap(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        byteBufferAllocate.rewind();
        byte[] bArrArray = byteBufferAllocate.array();
        int rowBytes = bitmap.getRowBytes();
        Image imageFromBufferExtended = Image.FromBufferExtended(bArrArray, bitmap.getWidth(), bitmap.getHeight(), rowBytes, ImagePixelFormat.IPF_RGBA, 1);
        Intrinsics.checkNotNullExpressionValue(imageFromBufferExtended, "FromBufferExtended(...)");
        return imageFromBufferExtended;
    }

    public final Bitmap imageToBitmap(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        byte[] bArrDecode = Base64.decode(image.GetBase64String().GetCStr(), 0);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeByteArray, "decodeByteArray(...)");
        return bitmapDecodeByteArray;
    }
}
