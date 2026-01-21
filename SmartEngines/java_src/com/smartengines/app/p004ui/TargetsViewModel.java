package com.smartengines.app.p004ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.smartengines.app.targets.TreeGroup;
import com.smartengines.app.targets.TreeItem;
import com.smartengines.tree.p009ui.MultiLevelTreeModel;
import com.smartengines.utils.Name;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;

/* compiled from: TargetsViewModel.kt */
@Metadata(m513d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\rJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010#\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010%\u001a\u00020&H×\u0001J\t\u0010'\u001a\u00020\rH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006("}, m514d2 = {"Lcom/smartengines/app/ui/TargetsViewModel;", "", "treeGroup", "Lcom/smartengines/app/targets/TreeGroup;", "<init>", "(Lcom/smartengines/app/targets/TreeGroup;)V", "getTreeGroup", "()Lcom/smartengines/app/targets/TreeGroup;", MessageBundle.TITLE_ENTRY, "Lcom/smartengines/utils/Name;", "getTitle", "()Lcom/smartengines/utils/Name;", "<set-?>", "", "filter", "getFilter", "()Ljava/lang/String;", "setFilter", "(Ljava/lang/String;)V", "filter$delegate", "Landroidx/compose/runtime/MutableState;", "showFilter", "", "getShowFilter", "()Z", "multiLevelTreeModel", "Lcom/smartengines/tree/ui/MultiLevelTreeModel;", "Lcom/smartengines/app/targets/TreeItem;", "getMultiLevelTreeModel", "()Lcom/smartengines/tree/ui/MultiLevelTreeModel;", "onFilterChanged", "", "newFilter", "component1", "copy", "equals", "other", "hashCode", "", "toString", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TargetsViewModel {
    public static final int $stable = 8;

    /* renamed from: filter$delegate, reason: from kotlin metadata */
    private final MutableState filter;
    private final MultiLevelTreeModel<TreeItem> multiLevelTreeModel;
    private final boolean showFilter;
    private final Name title;
    private final TreeGroup treeGroup;

    public static /* synthetic */ TargetsViewModel copy$default(TargetsViewModel targetsViewModel, TreeGroup treeGroup, int i, Object obj) {
        if ((i & 1) != 0) {
            treeGroup = targetsViewModel.treeGroup;
        }
        return targetsViewModel.copy(treeGroup);
    }

    /* renamed from: component1, reason: from getter */
    public final TreeGroup getTreeGroup() {
        return this.treeGroup;
    }

    public final TargetsViewModel copy(TreeGroup treeGroup) {
        Intrinsics.checkNotNullParameter(treeGroup, "treeGroup");
        return new TargetsViewModel(treeGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TargetsViewModel) && Intrinsics.areEqual(this.treeGroup, ((TargetsViewModel) other).treeGroup);
    }

    public int hashCode() {
        return this.treeGroup.hashCode();
    }

    public String toString() {
        return "TargetsViewModel(treeGroup=" + this.treeGroup + ')';
    }

    public TargetsViewModel(TreeGroup treeGroup) {
        Intrinsics.checkNotNullParameter(treeGroup, "treeGroup");
        this.treeGroup = treeGroup;
        this.title = treeGroup.getName();
        this.filter = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.showFilter = treeGroup.getChildren().size() > 30;
        this.multiLevelTreeModel = new MultiLevelTreeModel<>(TargetsFilterKt.filterData(getFilter(), treeGroup.getChildren()));
    }

    public final TreeGroup getTreeGroup() {
        return this.treeGroup;
    }

    public final Name getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getFilter() {
        return (String) this.filter.getValue();
    }

    public final void setFilter(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.filter.setValue(str);
    }

    public final boolean getShowFilter() {
        return this.showFilter;
    }

    public final MultiLevelTreeModel<TreeItem> getMultiLevelTreeModel() {
        return this.multiLevelTreeModel;
    }

    public final void onFilterChanged(String newFilter) {
        Intrinsics.checkNotNullParameter(newFilter, "newFilter");
        setFilter(newFilter);
        this.multiLevelTreeModel.setData(TargetsFilterKt.filterData(getFilter(), this.treeGroup.getChildren()));
    }
}
