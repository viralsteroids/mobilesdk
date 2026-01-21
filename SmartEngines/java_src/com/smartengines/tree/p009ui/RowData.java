package com.smartengines.tree.p009ui;

import com.smartengines.tree.TreeNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiLevelTreeModel.kt */
@Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0005H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m514d2 = {"Lcom/smartengines/tree/ui/RowData;", "", "node", "Lcom/smartengines/tree/TreeNode;", "level", "", "expanded", "", "<init>", "(Lcom/smartengines/tree/TreeNode;IZ)V", "getNode", "()Lcom/smartengines/tree/TreeNode;", "getLevel", "()I", "getExpanded", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "tree_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RowData {
    public static final int $stable = 8;
    private final boolean expanded;
    private final int level;
    private final TreeNode node;

    public static /* synthetic */ RowData copy$default(RowData rowData, TreeNode treeNode, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            treeNode = rowData.node;
        }
        if ((i2 & 2) != 0) {
            i = rowData.level;
        }
        if ((i2 & 4) != 0) {
            z = rowData.expanded;
        }
        return rowData.copy(treeNode, i, z);
    }

    /* renamed from: component1, reason: from getter */
    public final TreeNode getNode() {
        return this.node;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getExpanded() {
        return this.expanded;
    }

    public final RowData copy(TreeNode node, int level, boolean expanded) {
        Intrinsics.checkNotNullParameter(node, "node");
        return new RowData(node, level, expanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowData)) {
            return false;
        }
        RowData rowData = (RowData) other;
        return Intrinsics.areEqual(this.node, rowData.node) && this.level == rowData.level && this.expanded == rowData.expanded;
    }

    public int hashCode() {
        return (((this.node.hashCode() * 31) + Integer.hashCode(this.level)) * 31) + Boolean.hashCode(this.expanded);
    }

    public String toString() {
        return "RowData(node=" + this.node + ", level=" + this.level + ", expanded=" + this.expanded + ')';
    }

    public RowData(TreeNode node, int i, boolean z) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.node = node;
        this.level = i;
        this.expanded = z;
    }

    public final TreeNode getNode() {
        return this.node;
    }

    public final int getLevel() {
        return this.level;
    }

    public final boolean getExpanded() {
        return this.expanded;
    }
}
