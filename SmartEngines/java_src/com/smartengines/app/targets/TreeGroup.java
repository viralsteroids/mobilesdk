package com.smartengines.app.targets;

import androidx.autofill.HintConstants;
import com.smartengines.app.targets.TreeGroupViewType;
import com.smartengines.app.targets.TreeItem;
import com.smartengines.tree.TreeNode;
import com.smartengines.utils.Name;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TreeGroup.kt */
@Metadata(m513d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JT\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÇ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H×\u0003J\t\u0010(\u001a\u00020\u0005H×\u0001J\t\u0010)\u001a\u00020\nH×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, m514d2 = {"Lcom/smartengines/app/targets/TreeGroup;", "Lcom/smartengines/app/targets/TreeItem;", HintConstants.AUTOFILL_HINT_NAME, "Lcom/smartengines/utils/Name;", "icon", "", "children", "", "priority", "altName", "", "viewType", "Lcom/smartengines/app/targets/TreeGroupViewType;", "<init>", "(Lcom/smartengines/utils/Name;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/String;Lcom/smartengines/app/targets/TreeGroupViewType;)V", "getName", "()Lcom/smartengines/utils/Name;", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChildren", "()Ljava/util/List;", "getPriority", "()I", "getAltName", "()Ljava/lang/String;", "getViewType", "()Lcom/smartengines/app/targets/TreeGroupViewType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/smartengines/utils/Name;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/String;Lcom/smartengines/app/targets/TreeGroupViewType;)Lcom/smartengines/app/targets/TreeGroup;", "equals", "", "other", "", "hashCode", "toString", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TreeGroup implements TreeItem {
    public static final int $stable = 8;
    private final String altName;
    private final List<TreeItem> children;
    private final Integer icon;
    private final Name name;
    private final int priority;
    private final TreeGroupViewType viewType;

    public static /* synthetic */ TreeGroup copy$default(TreeGroup treeGroup, Name name, Integer num, List list, int i, String str, TreeGroupViewType treeGroupViewType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            name = treeGroup.name;
        }
        if ((i2 & 2) != 0) {
            num = treeGroup.icon;
        }
        if ((i2 & 4) != 0) {
            list = treeGroup.children;
        }
        if ((i2 & 8) != 0) {
            i = treeGroup.priority;
        }
        if ((i2 & 16) != 0) {
            str = treeGroup.altName;
        }
        if ((i2 & 32) != 0) {
            treeGroupViewType = treeGroup.viewType;
        }
        String str2 = str;
        TreeGroupViewType treeGroupViewType2 = treeGroupViewType;
        return treeGroup.copy(name, num, list, i, str2, treeGroupViewType2);
    }

    /* renamed from: component1, reason: from getter */
    public final Name getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    public final List<TreeItem> component3() {
        return this.children;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAltName() {
        return this.altName;
    }

    /* renamed from: component6, reason: from getter */
    public final TreeGroupViewType getViewType() {
        return this.viewType;
    }

    public final TreeGroup copy(Name name, Integer icon, List<? extends TreeItem> children, int priority, String altName, TreeGroupViewType viewType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        return new TreeGroup(name, icon, children, priority, altName, viewType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TreeGroup)) {
            return false;
        }
        TreeGroup treeGroup = (TreeGroup) other;
        return Intrinsics.areEqual(this.name, treeGroup.name) && Intrinsics.areEqual(this.icon, treeGroup.icon) && Intrinsics.areEqual(this.children, treeGroup.children) && this.priority == treeGroup.priority && Intrinsics.areEqual(this.altName, treeGroup.altName) && Intrinsics.areEqual(this.viewType, treeGroup.viewType);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Integer num = this.icon;
        int iHashCode2 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.children.hashCode()) * 31) + Integer.hashCode(this.priority)) * 31;
        String str = this.altName;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.viewType.hashCode();
    }

    public String toString() {
        return "TreeGroup(name=" + this.name + ", icon=" + this.icon + ", children=" + this.children + ", priority=" + this.priority + ", altName=" + this.altName + ", viewType=" + this.viewType + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TreeGroup(Name name, Integer num, List<? extends TreeItem> children, int i, String str, TreeGroupViewType viewType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.name = name;
        this.icon = num;
        this.children = children;
        this.priority = i;
        this.altName = str;
        this.viewType = viewType;
    }

    @Override // com.smartengines.tree.TreeNode
    public boolean containsChild(TreeNode treeNode) {
        return TreeItem.DefaultImpls.containsChild(this, treeNode);
    }

    @Override // com.smartengines.tree.TreeNode
    public boolean isLeaf() {
        return TreeItem.DefaultImpls.isLeaf(this);
    }

    @Override // com.smartengines.app.targets.TreeItem
    public Name getName() {
        return this.name;
    }

    @Override // com.smartengines.app.targets.TreeItem
    public Integer getIcon() {
        return this.icon;
    }

    public /* synthetic */ TreeGroup(Name name, Integer num, List list, int i, String str, TreeGroupViewType.OneLevelRows oneLevelRows, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? TreeGroupViewType.OneLevelRows.INSTANCE : oneLevelRows);
    }

    @Override // com.smartengines.app.targets.TreeItem, com.smartengines.tree.TreeNode
    public List<TreeItem> getChildren() {
        return this.children;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getAltName() {
        return this.altName;
    }

    public final TreeGroupViewType getViewType() {
        return this.viewType;
    }
}
