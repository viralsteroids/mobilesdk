package com.smartengines.tree.p009ui;

import androidx.autofill.HintConstants;
import com.smartengines.tree.TreeNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Preview.kt */
@Metadata(m513d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m514d2 = {"Lcom/smartengines/tree/ui/AppNode;", "Lcom/smartengines/tree/TreeNode;", HintConstants.AUTOFILL_HINT_NAME, "", "children", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getChildren", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tree_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AppNode implements TreeNode {
    public static final int $stable = 8;
    private final List<AppNode> children;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppNode copy$default(AppNode appNode, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appNode.name;
        }
        if ((i & 2) != 0) {
            list = appNode.children;
        }
        return appNode.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<AppNode> component2() {
        return this.children;
    }

    public final AppNode copy(String name, List<AppNode> children) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new AppNode(name, children);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppNode)) {
            return false;
        }
        AppNode appNode = (AppNode) other;
        return Intrinsics.areEqual(this.name, appNode.name) && Intrinsics.areEqual(this.children, appNode.children);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        List<AppNode> list = this.children;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "AppNode(name=" + this.name + ", children=" + this.children + ')';
    }

    public AppNode(String name, List<AppNode> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.children = list;
    }

    public /* synthetic */ AppNode(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list);
    }

    @Override // com.smartengines.tree.TreeNode
    public boolean containsChild(TreeNode treeNode) {
        return TreeNode.DefaultImpls.containsChild(this, treeNode);
    }

    @Override // com.smartengines.tree.TreeNode
    public boolean isLeaf() {
        return TreeNode.DefaultImpls.isLeaf(this);
    }

    public final String getName() {
        return this.name;
    }

    @Override // com.smartengines.tree.TreeNode
    public List<AppNode> getChildren() {
        return this.children;
    }
}
