package com.smartengines.tree.p009ui;

import com.smartengines.tree.TreeNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiLevelTreeModel.kt */
@Metadata(m513d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0005"}, m514d2 = {"mapOnExpanded", "", "Lcom/smartengines/tree/ui/RowData;", "row", "mapOnCollapsed", "tree_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class MultiLevelTreeModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<RowData> mapOnExpanded(List<RowData> list, RowData rowData) {
        ArrayList arrayList = new ArrayList();
        for (RowData rowData2 : list) {
            if (Intrinsics.areEqual(rowData2, rowData)) {
                arrayList.add(RowData.copy$default(rowData2, null, 0, true, 3, null));
                List<TreeNode> children = rowData.getNode().getChildren();
                if (children != null) {
                    Iterator<T> it = children.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new RowData((TreeNode) it.next(), rowData.getLevel() + 1, false));
                    }
                }
            } else {
                arrayList.add(rowData2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<RowData> mapOnCollapsed(List<RowData> list, RowData rowData) {
        ArrayList arrayList = new ArrayList();
        for (RowData rowData2 : list) {
            if (Intrinsics.areEqual(rowData2, rowData)) {
                arrayList.add(RowData.copy$default(rowData2, null, 0, false, 3, null));
            } else if (!rowData.getNode().containsChild(rowData2.getNode())) {
                arrayList.add(rowData2);
            }
        }
        return arrayList;
    }
}
