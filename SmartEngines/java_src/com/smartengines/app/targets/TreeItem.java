package com.smartengines.app.targets;

import androidx.autofill.HintConstants;
import com.smartengines.tree.TreeNode;
import com.smartengines.utils.Name;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TreeItem.kt */
@Metadata(m513d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m514d2 = {"Lcom/smartengines/app/targets/TreeItem;", "Lcom/smartengines/tree/TreeNode;", HintConstants.AUTOFILL_HINT_NAME, "Lcom/smartengines/utils/Name;", "getName", "()Lcom/smartengines/utils/Name;", "icon", "", "getIcon", "()Ljava/lang/Integer;", "children", "", "getChildren", "()Ljava/util/List;", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface TreeItem extends TreeNode {
    @Override // com.smartengines.tree.TreeNode
    List<TreeItem> getChildren();

    Integer getIcon();

    Name getName();

    /* compiled from: TreeItem.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class DefaultImpls {
        public static boolean containsChild(TreeItem treeItem, TreeNode child) {
            Intrinsics.checkNotNullParameter(child, "child");
            return TreeNode.DefaultImpls.containsChild(treeItem, child);
        }

        public static boolean isLeaf(TreeItem treeItem) {
            return TreeNode.DefaultImpls.isLeaf(treeItem);
        }
    }
}
