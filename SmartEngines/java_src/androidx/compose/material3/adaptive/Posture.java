package androidx.compose.material3.adaptive;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Posture.kt */
@Metadata(m513d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\n¨\u0006\u0011"}, m514d2 = {"Landroidx/compose/material3/adaptive/Posture;", "", "isTabletop", "", "hingeList", "", "Landroidx/compose/material3/adaptive/HingeInfo;", "(ZLjava/util/List;)V", "getHingeList", "()Ljava/util/List;", "()Z", "equals", "other", "hashCode", "", "toString", "", "adaptive_release"}, m515k = 1, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class Posture {
    public static final int $stable = 0;
    private final List<HingeInfo> hingeList;
    private final boolean isTabletop;

    /* JADX WARN: Multi-variable type inference failed */
    public Posture() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public Posture(boolean z, List<HingeInfo> list) {
        this.isTabletop = z;
        this.hingeList = list;
    }

    public /* synthetic */ Posture(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<HingeInfo> getHingeList() {
        return this.hingeList;
    }

    /* renamed from: isTabletop, reason: from getter */
    public final boolean getIsTabletop() {
        return this.isTabletop;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Posture)) {
            return false;
        }
        Posture posture = (Posture) other;
        return this.isTabletop == posture.isTabletop && Intrinsics.areEqual(this.hingeList, posture.hingeList);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isTabletop) * 31) + this.hingeList.hashCode();
    }

    public String toString() {
        return "Posture(isTabletop=" + this.isTabletop + ", hinges=[" + CollectionsKt.joinToString$default(this.hingeList, ", ", null, null, 0, null, null, 62, null) + "])";
    }
}
