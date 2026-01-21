package com.smartengines.app.mock;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.smartengines.engine.Geometry;
import com.smartengines.engine.text.TextResultChunk;
import com.smartengines.engine.text.TextResultData;
import com.smartengines.utils.UtilsKt;
import com.smartengines.visualization.QuadPoint;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MockText.kt */
@Metadata(m513d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\b"}, m514d2 = {"mockTextResultData", "Lcom/smartengines/engine/text/TextResultData;", "getMockTextResultData", "()Lcom/smartengines/engine/text/TextResultData;", "mockTextBitmap", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class MockTextKt {
    public static final TextResultData getMockTextResultData() {
        return new TextResultData(CollectionsKt.listOf((Object[]) new TextResultChunk[]{new TextResultChunk("Попробуйте", 0.9d, true, new Geometry(0, CollectionsKt.listOf((Object[]) new QuadPoint[]{new QuadPoint(100.0f, 1700.0f), new QuadPoint(1700.0f, 1700.0f), new QuadPoint(1700.0f, 2050.0f), new QuadPoint(100.0f, 2050.0f)}), new Rect())), new TextResultChunk("пирог 5 сыров", 0.5d, false, new Geometry(0, CollectionsKt.listOf((Object[]) new QuadPoint[]{new QuadPoint(100.0f, 2250.0f), new QuadPoint(2000.0f, 2250.0f), new QuadPoint(2000.0f, 2550.0f), new QuadPoint(100.0f, 2550.0f)}), new Rect()))}), CollectionsKt.emptyList());
    }

    public static final Bitmap mockTextBitmap(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.loadBitmapFromAssetFile(context, "sample_text.jpg");
    }
}
