package com.smartengines.engine;

import android.graphics.Bitmap;
import com.smartengines.visualization.Visualization;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Mock.kt */
@Metadata(m513d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m514d2 = {"Lcom/smartengines/engine/MockSession;", "Lcom/smartengines/engine/Session;", "<init>", "()V", "processImage", "", "bitmap", "Landroid/graphics/Bitmap;", "delete", "currentResult", "Lcom/smartengines/engine/Result;", "getCurrentResult", "()Lcom/smartengines/engine/Result;", "isEnded", "", "()Z", "visualizations", "", "Lcom/smartengines/visualization/Visualization;", "getVisualizations", "()Ljava/util/Collection;", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class MockSession implements Session {
    private final Result currentResult;

    @Override // com.smartengines.engine.Session
    public void delete() {
    }

    @Override // com.smartengines.engine.Session
    /* renamed from: isEnded */
    public boolean getIsEnded() {
        return true;
    }

    @Override // com.smartengines.engine.Session
    public void processImage(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
    }

    @Override // com.smartengines.engine.Session
    public Result getCurrentResult() {
        return this.currentResult;
    }

    @Override // com.smartengines.engine.Session
    public Collection<Visualization> getVisualizations() {
        return CollectionsKt.emptyList();
    }
}
