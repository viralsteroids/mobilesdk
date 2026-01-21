package com.smartengines.tree.p009ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.exifinterface.media.ExifInterface;
import com.smartengines.tree.TreeNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiLevelTreeModel.kt */
@Metadata(m513d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0005H\u0002J\u0014\u0010\u0015\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0019R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m514d2 = {"Lcom/smartengines/tree/ui/MultiLevelTreeModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/smartengines/tree/TreeNode;", "", "data", "", "<init>", "(Ljava/util/List;)V", "_data", "getData", "()Ljava/util/List;", "rows", "Landroidx/compose/runtime/MutableState;", "Lcom/smartengines/tree/ui/RowData;", "getRows$tree_release", "()Landroidx/compose/runtime/MutableState;", "calculateRows", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "getLazyListState", "()Landroidx/compose/foundation/lazy/LazyListState;", "setData", "", "onBranchRowClick", "row", "onBranchRowClick$tree_release", "tree_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class MultiLevelTreeModel<T extends TreeNode> {
    public static final int $stable = 8;
    private List<? extends T> _data;
    private final LazyListState lazyListState;
    private final MutableState<List<RowData>> rows;

    public MultiLevelTreeModel(List<? extends T> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this._data = data;
        this.rows = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(calculateRows(), null, 2, null);
        int i = 0;
        this.lazyListState = new LazyListState(i, i, 3, null);
    }

    public final List<T> getData() {
        return this._data;
    }

    public final MutableState<List<RowData>> getRows$tree_release() {
        return this.rows;
    }

    private final List<RowData> calculateRows() {
        List<? extends T> list = this._data;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new RowData((TreeNode) it.next(), 0, false));
        }
        return arrayList;
    }

    public final LazyListState getLazyListState() {
        return this.lazyListState;
    }

    public final void setData(List<? extends T> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this._data = data;
        this.rows.setValue(calculateRows());
    }

    public final void onBranchRowClick$tree_release(RowData row) {
        Intrinsics.checkNotNullParameter(row, "row");
        this.rows.setValue(row.getExpanded() ? MultiLevelTreeModelKt.mapOnCollapsed(this.rows.getValue(), row) : MultiLevelTreeModelKt.mapOnExpanded(this.rows.getValue(), row));
    }
}
