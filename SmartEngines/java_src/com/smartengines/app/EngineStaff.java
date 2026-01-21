package com.smartengines.app;

import com.smartengines.app.targets.TreeGroup;
import com.smartengines.app.targets.TreeItem;
import com.smartengines.engine.EngineLoader;
import com.smartengines.utils.Name;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EngineStaff.kt */
@Metadata(m513d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, m514d2 = {"Lcom/smartengines/app/EngineStaff;", "", "loader", "Lcom/smartengines/engine/EngineLoader;", "targets", "Lcom/smartengines/app/targets/TreeItem;", "<init>", "(Lcom/smartengines/engine/EngineLoader;Lcom/smartengines/app/targets/TreeItem;)V", "getLoader", "()Lcom/smartengines/engine/EngineLoader;", "getTargets", "()Lcom/smartengines/app/targets/TreeItem;", "setTargets", "(Lcom/smartengines/app/targets/TreeItem;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EngineStaff {
    public static final int $stable = 8;
    private final EngineLoader loader;
    private TreeItem targets;

    public static /* synthetic */ EngineStaff copy$default(EngineStaff engineStaff, EngineLoader engineLoader, TreeItem treeItem, int i, Object obj) {
        if ((i & 1) != 0) {
            engineLoader = engineStaff.loader;
        }
        if ((i & 2) != 0) {
            treeItem = engineStaff.targets;
        }
        return engineStaff.copy(engineLoader, treeItem);
    }

    /* renamed from: component1, reason: from getter */
    public final EngineLoader getLoader() {
        return this.loader;
    }

    /* renamed from: component2, reason: from getter */
    public final TreeItem getTargets() {
        return this.targets;
    }

    public final EngineStaff copy(EngineLoader loader, TreeItem targets) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(targets, "targets");
        return new EngineStaff(loader, targets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EngineStaff)) {
            return false;
        }
        EngineStaff engineStaff = (EngineStaff) other;
        return Intrinsics.areEqual(this.loader, engineStaff.loader) && Intrinsics.areEqual(this.targets, engineStaff.targets);
    }

    public int hashCode() {
        return (this.loader.hashCode() * 31) + this.targets.hashCode();
    }

    public String toString() {
        return "EngineStaff(loader=" + this.loader + ", targets=" + this.targets + ')';
    }

    public EngineStaff(EngineLoader loader, TreeItem targets) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(targets, "targets");
        this.loader = loader;
        this.targets = targets;
    }

    public final EngineLoader getLoader() {
        return this.loader;
    }

    public /* synthetic */ EngineStaff(EngineLoader engineLoader, TreeItem treeItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            treeItem = new TreeGroup(new Name("no data"), null, CollectionsKt.emptyList(), 0, null, null, 48, null);
        }
        this(engineLoader, treeItem);
    }

    public final TreeItem getTargets() {
        return this.targets;
    }

    public final void setTargets(TreeItem treeItem) {
        Intrinsics.checkNotNullParameter(treeItem, "<set-?>");
        this.targets = treeItem;
    }
}
