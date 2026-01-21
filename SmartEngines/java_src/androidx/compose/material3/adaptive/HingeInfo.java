package androidx.compose.material3.adaptive;

import androidx.compose.p000ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Posture.kt */
@Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\f¨\u0006\u0013"}, m514d2 = {"Landroidx/compose/material3/adaptive/HingeInfo;", "", "bounds", "Landroidx/compose/ui/geometry/Rect;", "isFlat", "", "isVertical", "isSeparating", "isOccluding", "(Landroidx/compose/ui/geometry/Rect;ZZZZ)V", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "()Z", "equals", "other", "hashCode", "", "toString", "", "adaptive_release"}, m515k = 1, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class HingeInfo {
    public static final int $stable = 0;
    private final Rect bounds;
    private final boolean isFlat;
    private final boolean isOccluding;
    private final boolean isSeparating;
    private final boolean isVertical;

    public HingeInfo(Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        this.bounds = rect;
        this.isFlat = z;
        this.isVertical = z2;
        this.isSeparating = z3;
        this.isOccluding = z4;
    }

    public final Rect getBounds() {
        return this.bounds;
    }

    /* renamed from: isFlat, reason: from getter */
    public final boolean getIsFlat() {
        return this.isFlat;
    }

    /* renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    /* renamed from: isSeparating, reason: from getter */
    public final boolean getIsSeparating() {
        return this.isSeparating;
    }

    /* renamed from: isOccluding, reason: from getter */
    public final boolean getIsOccluding() {
        return this.isOccluding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HingeInfo)) {
            return false;
        }
        HingeInfo hingeInfo = (HingeInfo) other;
        return Intrinsics.areEqual(this.bounds, hingeInfo.bounds) && this.isFlat == hingeInfo.isFlat && this.isVertical == hingeInfo.isVertical && this.isSeparating == hingeInfo.isSeparating && this.isOccluding == hingeInfo.isOccluding;
    }

    public int hashCode() {
        return (((((((this.bounds.hashCode() * 31) + Boolean.hashCode(this.isFlat)) * 31) + Boolean.hashCode(this.isVertical)) * 31) + Boolean.hashCode(this.isSeparating)) * 31) + Boolean.hashCode(this.isOccluding);
    }

    public String toString() {
        return "HingeInfo(bounds=" + this.bounds + ", isFlat=" + this.isFlat + ", isVertical=" + this.isVertical + ", isSeparating=" + this.isSeparating + ", isOccluding=" + this.isOccluding + ')';
    }
}
