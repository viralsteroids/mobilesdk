package com.smartengines.visualization;

import android.util.Size;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuadFrame.kt */
@Metadata(m513d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u001bH×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m514d2 = {"Lcom/smartengines/visualization/QuadFrame;", "", "quads", "", "Lcom/smartengines/visualization/Quad;", "imageSize", "Landroid/util/Size;", "timestamp", "", "<init>", "(Ljava/util/Set;Landroid/util/Size;J)V", "getQuads", "()Ljava/util/Set;", "getImageSize", "()Landroid/util/Size;", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "visualization_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QuadFrame {
    public static final int $stable = 8;
    private final Size imageSize;
    private final Set<Quad> quads;
    private final long timestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuadFrame copy$default(QuadFrame quadFrame, Set set, Size size, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            set = quadFrame.quads;
        }
        if ((i & 2) != 0) {
            size = quadFrame.imageSize;
        }
        if ((i & 4) != 0) {
            j = quadFrame.timestamp;
        }
        return quadFrame.copy(set, size, j);
    }

    public final Set<Quad> component1() {
        return this.quads;
    }

    /* renamed from: component2, reason: from getter */
    public final Size getImageSize() {
        return this.imageSize;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final QuadFrame copy(Set<Quad> quads, Size imageSize, long timestamp) {
        Intrinsics.checkNotNullParameter(quads, "quads");
        Intrinsics.checkNotNullParameter(imageSize, "imageSize");
        return new QuadFrame(quads, imageSize, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuadFrame)) {
            return false;
        }
        QuadFrame quadFrame = (QuadFrame) other;
        return Intrinsics.areEqual(this.quads, quadFrame.quads) && Intrinsics.areEqual(this.imageSize, quadFrame.imageSize) && this.timestamp == quadFrame.timestamp;
    }

    public int hashCode() {
        return (((this.quads.hashCode() * 31) + this.imageSize.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "QuadFrame(quads=" + this.quads + ", imageSize=" + this.imageSize + ", timestamp=" + this.timestamp + ')';
    }

    public QuadFrame(Set<Quad> quads, Size imageSize, long j) {
        Intrinsics.checkNotNullParameter(quads, "quads");
        Intrinsics.checkNotNullParameter(imageSize, "imageSize");
        this.quads = quads;
        this.imageSize = imageSize;
        this.timestamp = j;
    }

    public final Set<Quad> getQuads() {
        return this.quads;
    }

    public final Size getImageSize() {
        return this.imageSize;
    }

    public /* synthetic */ QuadFrame(Set set, Size size, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, size, (i & 4) != 0 ? System.currentTimeMillis() : j);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
