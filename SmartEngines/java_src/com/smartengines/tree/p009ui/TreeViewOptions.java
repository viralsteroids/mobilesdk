package com.smartengines.tree.p009ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiLevel.kt */
@Metadata(m513d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0003H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, m514d2 = {"Lcom/smartengines/tree/ui/TreeViewOptions;", "", "levelPadding", "", "expandIconWidth", "spaceBetweenRows", "<init>", "(ILjava/lang/Integer;I)V", "getLevelPadding", "()I", "getExpandIconWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSpaceBetweenRows", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;I)Lcom/smartengines/tree/ui/TreeViewOptions;", "equals", "", "other", "hashCode", "toString", "", "tree_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TreeViewOptions {
    public static final int $stable = 0;
    private final Integer expandIconWidth;
    private final int levelPadding;
    private final int spaceBetweenRows;

    public TreeViewOptions() {
        this(0, null, 0, 7, null);
    }

    public static /* synthetic */ TreeViewOptions copy$default(TreeViewOptions treeViewOptions, int i, Integer num, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = treeViewOptions.levelPadding;
        }
        if ((i3 & 2) != 0) {
            num = treeViewOptions.expandIconWidth;
        }
        if ((i3 & 4) != 0) {
            i2 = treeViewOptions.spaceBetweenRows;
        }
        return treeViewOptions.copy(i, num, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLevelPadding() {
        return this.levelPadding;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getExpandIconWidth() {
        return this.expandIconWidth;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSpaceBetweenRows() {
        return this.spaceBetweenRows;
    }

    public final TreeViewOptions copy(int levelPadding, Integer expandIconWidth, int spaceBetweenRows) {
        return new TreeViewOptions(levelPadding, expandIconWidth, spaceBetweenRows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TreeViewOptions)) {
            return false;
        }
        TreeViewOptions treeViewOptions = (TreeViewOptions) other;
        return this.levelPadding == treeViewOptions.levelPadding && Intrinsics.areEqual(this.expandIconWidth, treeViewOptions.expandIconWidth) && this.spaceBetweenRows == treeViewOptions.spaceBetweenRows;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.levelPadding) * 31;
        Integer num = this.expandIconWidth;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.spaceBetweenRows);
    }

    public String toString() {
        return "TreeViewOptions(levelPadding=" + this.levelPadding + ", expandIconWidth=" + this.expandIconWidth + ", spaceBetweenRows=" + this.spaceBetweenRows + ')';
    }

    public TreeViewOptions(int i, Integer num, int i2) {
        this.levelPadding = i;
        this.expandIconWidth = num;
        this.spaceBetweenRows = i2;
    }

    public final int getLevelPadding() {
        return this.levelPadding;
    }

    public /* synthetic */ TreeViewOptions(int i, Integer num, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 16 : i, (i3 & 2) != 0 ? 24 : num, (i3 & 4) != 0 ? 6 : i2);
    }

    public final Integer getExpandIconWidth() {
        return this.expandIconWidth;
    }

    public final int getSpaceBetweenRows() {
        return this.spaceBetweenRows;
    }
}
