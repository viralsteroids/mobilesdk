package com.smartengines.engine.p005id;

import com.smartengines.engine.Result;
import com.smartengines.visualization.Quad;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: LvResultData.kt */
@Metadata(m513d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f¨\u0006\u0019"}, m514d2 = {"Lcom/smartengines/engine/id/LvResultData;", "Lcom/smartengines/engine/Result;", "livenessEstimation", "", "<init>", "(D)V", "getLivenessEstimation", "()D", "quads", "", "Lcom/smartengines/visualization/Quad;", "getQuads", "()Ljava/util/Collection;", "isEmpty", "", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LvResultData implements Result {
    private final double livenessEstimation;

    public static /* synthetic */ LvResultData copy$default(LvResultData lvResultData, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = lvResultData.livenessEstimation;
        }
        return lvResultData.copy(d);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLivenessEstimation() {
        return this.livenessEstimation;
    }

    public final LvResultData copy(double livenessEstimation) {
        return new LvResultData(livenessEstimation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LvResultData) && Double.compare(this.livenessEstimation, ((LvResultData) other).livenessEstimation) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.livenessEstimation);
    }

    @Override // com.smartengines.engine.Result
    public boolean isEmpty() {
        return false;
    }

    public String toString() {
        return "LvResultData(livenessEstimation=" + this.livenessEstimation + ')';
    }

    public LvResultData(double d) {
        this.livenessEstimation = d;
    }

    public final double getLivenessEstimation() {
        return this.livenessEstimation;
    }

    @Override // com.smartengines.engine.Result
    public Collection<Quad> getQuads() {
        return CollectionsKt.emptyList();
    }
}
