package com.smartengines.engine;

import android.graphics.Rect;
import com.smartengines.visualization.Quad;
import com.smartengines.visualization.QuadPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Geometry.kt */
@Metadata(m513d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m514d2 = {"Lcom/smartengines/engine/Geometry;", "", "sceneId", "", "points", "", "Lcom/smartengines/visualization/QuadPoint;", "bounds", "Landroid/graphics/Rect;", "<init>", "(ILjava/util/List;Landroid/graphics/Rect;)V", "getSceneId", "()I", "getPoints", "()Ljava/util/List;", "getBounds", "()Landroid/graphics/Rect;", "toQuad", "Lcom/smartengines/visualization/Quad;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Geometry {
    private final Rect bounds;
    private final List<QuadPoint> points;
    private final int sceneId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Geometry copy$default(Geometry geometry, int i, List list, Rect rect, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = geometry.sceneId;
        }
        if ((i2 & 2) != 0) {
            list = geometry.points;
        }
        if ((i2 & 4) != 0) {
            rect = geometry.bounds;
        }
        return geometry.copy(i, list, rect);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSceneId() {
        return this.sceneId;
    }

    public final List<QuadPoint> component2() {
        return this.points;
    }

    /* renamed from: component3, reason: from getter */
    public final Rect getBounds() {
        return this.bounds;
    }

    public final Geometry copy(int sceneId, List<QuadPoint> points, Rect bounds) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return new Geometry(sceneId, points, bounds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Geometry)) {
            return false;
        }
        Geometry geometry = (Geometry) other;
        return this.sceneId == geometry.sceneId && Intrinsics.areEqual(this.points, geometry.points) && Intrinsics.areEqual(this.bounds, geometry.bounds);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.sceneId) * 31) + this.points.hashCode()) * 31) + this.bounds.hashCode();
    }

    public String toString() {
        return "Geometry(sceneId=" + this.sceneId + ", points=" + this.points + ", bounds=" + this.bounds + ')';
    }

    public Geometry(int i, List<QuadPoint> points, Rect bounds) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.sceneId = i;
        this.points = points;
        this.bounds = bounds;
    }

    public final int getSceneId() {
        return this.sceneId;
    }

    public final List<QuadPoint> getPoints() {
        return this.points;
    }

    public final Rect getBounds() {
        return this.bounds;
    }

    public final Quad toQuad() {
        if (this.points.size() == 4) {
            return new Quad(this.points);
        }
        return null;
    }
}
