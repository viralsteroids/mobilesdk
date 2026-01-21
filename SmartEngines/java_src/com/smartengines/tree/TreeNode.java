package com.smartengines.tree;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TreeNode.kt */
@Metadata(m513d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0000H\u0016R\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\u000b"}, m514d2 = {"Lcom/smartengines/tree/TreeNode;", "", "children", "", "getChildren", "()Ljava/util/List;", "isLeaf", "", "()Z", "containsChild", "child", "tree_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface TreeNode {
    boolean containsChild(TreeNode child);

    List<TreeNode> getChildren();

    boolean isLeaf();

    /* compiled from: TreeNode.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class DefaultImpls {
        public static boolean isLeaf(TreeNode treeNode) {
            return treeNode.getChildren() == null;
        }

        public static boolean containsChild(TreeNode treeNode, TreeNode child) {
            Intrinsics.checkNotNullParameter(child, "child");
            List<TreeNode> children = treeNode.getChildren();
            if (children == null) {
                return false;
            }
            for (TreeNode treeNode2 : children) {
                if (Intrinsics.areEqual(treeNode2, child) || treeNode2.containsChild(child)) {
                    return true;
                }
            }
            return false;
        }
    }
}
