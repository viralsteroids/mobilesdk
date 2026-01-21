package com.smartengines.engine;

import com.smartengines.visualization.Quad;
import java.util.Collection;
import kotlin.Metadata;

/* compiled from: Result.kt */
@Metadata(m513d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, m514d2 = {"Lcom/smartengines/engine/Result;", "", "quads", "", "Lcom/smartengines/visualization/Quad;", "getQuads", "()Ljava/util/Collection;", "isEmpty", "", "()Z", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface Result {
    Collection<Quad> getQuads();

    boolean isEmpty();
}
