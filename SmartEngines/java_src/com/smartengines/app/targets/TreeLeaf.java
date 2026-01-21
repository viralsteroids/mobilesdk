package com.smartengines.app.targets;

import androidx.autofill.HintConstants;
import com.smartengines.app.targets.TreeItem;
import com.smartengines.engine.RecognitionTarget;
import com.smartengines.tree.TreeNode;
import com.smartengines.utils.Name;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TreeLeaf.kt */
@Metadata(m513d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006$"}, m514d2 = {"Lcom/smartengines/app/targets/TreeLeaf;", "Lcom/smartengines/app/targets/TreeItem;", HintConstants.AUTOFILL_HINT_NAME, "Lcom/smartengines/utils/Name;", "icon", "", "descr", "priority", "", "showInfoButton", "", "doctypes", "", "", "target", "Lcom/smartengines/engine/RecognitionTarget;", "<init>", "(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;)V", "getName", "()Lcom/smartengines/utils/Name;", "getPriority", "()I", "getShowInfoButton", "()Z", "getDoctypes", "()Ljava/util/List;", "getTarget", "()Lcom/smartengines/engine/RecognitionTarget;", "children", "getChildren", "_descr", "getDescr", "()Ljava/lang/String;", "_icon", "getIcon", "()Ljava/lang/Integer;", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TreeLeaf implements TreeItem {
    public static final int $stable = 8;
    private final Object _descr;
    private final Object _icon;
    private final List<TreeItem> children;
    private final List<String> doctypes;
    private final Name name;
    private final int priority;
    private final boolean showInfoButton;
    private final RecognitionTarget target;

    public TreeLeaf(Name name, Object obj, Object obj2, int i, boolean z, List<String> list, RecognitionTarget target) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(target, "target");
        this.name = name;
        this.priority = i;
        this.showInfoButton = z;
        this.doctypes = list;
        this.target = target;
        this._descr = obj2;
        this._icon = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TreeLeaf(Name name, Object obj, Object obj2, int i, boolean z, List list, RecognitionTarget recognitionTarget, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        RecognitionTarget recognitionTarget2;
        List list2;
        obj = (i2 & 2) != 0 ? null : obj;
        obj2 = (i2 & 4) != 0 ? null : obj2;
        i = (i2 & 8) != 0 ? 0 : i;
        z = (i2 & 16) != 0 ? false : z;
        if ((i2 & 32) != 0) {
            recognitionTarget2 = recognitionTarget;
            list2 = null;
        } else {
            recognitionTarget2 = recognitionTarget;
            list2 = list;
        }
        this(name, obj, obj2, i, z, list2, recognitionTarget2);
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

    public final int getPriority() {
        return this.priority;
    }

    public final boolean getShowInfoButton() {
        return this.showInfoButton;
    }

    public final List<String> getDoctypes() {
        return this.doctypes;
    }

    public final RecognitionTarget getTarget() {
        return this.target;
    }

    @Override // com.smartengines.app.targets.TreeItem, com.smartengines.tree.TreeNode
    public List<TreeItem> getChildren() {
        return this.children;
    }

    public final String getDescr() {
        Object obj = this._descr;
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    @Override // com.smartengines.app.targets.TreeItem
    public Integer getIcon() {
        Object obj = this._icon;
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Icon) {
            return Integer.valueOf(((Icon) obj).toInt());
        }
        return null;
    }
}
