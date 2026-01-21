package com.smartengines.engine;

import android.graphics.Bitmap;
import com.smartengines.visualization.Visualization;
import java.util.Collection;
import kotlin.Metadata;

/* compiled from: Session.kt */
@Metadata(m513d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m514d2 = {"Lcom/smartengines/engine/Session;", "", "isEnded", "", "()Z", "visualizations", "", "Lcom/smartengines/visualization/Visualization;", "getVisualizations", "()Ljava/util/Collection;", "processImage", "", "bitmap", "Landroid/graphics/Bitmap;", "delete", "currentResult", "Lcom/smartengines/engine/Result;", "getCurrentResult", "()Lcom/smartengines/engine/Result;", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface Session {
    void delete();

    Result getCurrentResult();

    Collection<Visualization> getVisualizations();

    boolean isEnded();

    void processImage(Bitmap bitmap);
}
