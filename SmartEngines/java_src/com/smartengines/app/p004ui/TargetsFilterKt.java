package com.smartengines.app.p004ui;

import android.util.Log;
import com.smartengines.app.targets.TreeGroup;
import com.smartengines.app.targets.TreeItem;
import com.smartengines.app.targets.TreeLeaf;
import com.smartengines.targets.p008id.IdTarget;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TargetsFilter.kt */
@Metadata(m513d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m514d2 = {"TAG", "", "filterData", "", "Lcom/smartengines/app/targets/TreeItem;", "filter", "data", "checkNode", "", "node", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TargetsFilterKt {
    private static final String TAG = "myapp.Targets2Screen";

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<TreeItem> filterData(String filter, List<? extends TreeItem> data) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(data, "data");
        if (filter.length() == 0) {
            return data;
        }
        ArrayList arrayList = new ArrayList();
        for (TreeItem treeItem : data) {
            if (checkNode(treeItem, filter)) {
                arrayList.add(treeItem);
            } else if (treeItem instanceof TreeGroup) {
                TreeGroup treeGroup = (TreeGroup) treeItem;
                List<TreeItem> children = treeGroup.getChildren();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : children) {
                    if (checkNode((TreeItem) obj, filter)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                if (!arrayList3.isEmpty()) {
                    arrayList.add(TreeGroup.copy$default(treeGroup, null, null, arrayList3, 0, null, null, 59, null));
                }
            }
        }
        Log.d(TAG, "filterData " + filter + " => " + arrayList);
        return arrayList;
    }

    private static final boolean checkNode(TreeItem treeItem, String str) {
        String altName;
        String str2 = str;
        if (!StringsKt.contains((CharSequence) treeItem.getName().toString(), (CharSequence) str2, true) && (!(treeItem instanceof TreeGroup) || (altName = ((TreeGroup) treeItem).getAltName()) == null || !StringsKt.contains((CharSequence) altName, (CharSequence) str2, true))) {
            if (!(treeItem instanceof TreeLeaf)) {
                return false;
            }
            TreeLeaf treeLeaf = (TreeLeaf) treeItem;
            if (!(treeLeaf.getTarget() instanceof IdTarget) || !StringsKt.contains((CharSequence) ((IdTarget) treeLeaf.getTarget()).getMask(), (CharSequence) str2, true)) {
                return false;
            }
        }
        return true;
    }
}
