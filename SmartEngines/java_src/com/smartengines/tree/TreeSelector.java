package com.smartengines.tree;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TreeSelector.kt */
@Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000J\u000e\u0010\u0013\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003J.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÇ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u001dH×\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000e\u0010\t¨\u0006\u001e"}, m514d2 = {"Lcom/smartengines/tree/TreeSelector;", ExifInterface.GPS_DIRECTION_TRUE, "", "root", "stack", "", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "getRoot", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStack", "()Ljava/util/List;", "selected", "getSelected", "push", "node", "(Ljava/lang/Object;)Lcom/smartengines/tree/TreeSelector;", "pop", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/util/List;)Lcom/smartengines/tree/TreeSelector;", "equals", "", "other", "hashCode", "", "toString", "", "tree_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TreeSelector<T> {
    public static final int $stable = 8;
    private final T root;
    private final T selected;
    private final List<T> stack;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TreeSelector copy$default(TreeSelector treeSelector, Object obj, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = treeSelector.root;
        }
        if ((i & 2) != 0) {
            list = treeSelector.stack;
        }
        return treeSelector.copy(obj, list);
    }

    public final T component1() {
        return this.root;
    }

    public final List<T> component2() {
        return this.stack;
    }

    public final TreeSelector<T> copy(T root, List<? extends T> stack) {
        Intrinsics.checkNotNullParameter(stack, "stack");
        return new TreeSelector<>(root, stack);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TreeSelector)) {
            return false;
        }
        TreeSelector treeSelector = (TreeSelector) other;
        return Intrinsics.areEqual(this.root, treeSelector.root) && Intrinsics.areEqual(this.stack, treeSelector.stack);
    }

    public int hashCode() {
        T t = this.root;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.stack.hashCode();
    }

    public String toString() {
        return "TreeSelector(root=" + this.root + ", stack=" + this.stack + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TreeSelector(T t, List<? extends T> stack) {
        Intrinsics.checkNotNullParameter(stack, "stack");
        this.root = t;
        this.stack = stack;
        Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) stack);
        this.selected = objLastOrNull != 0 ? objLastOrNull : t;
    }

    public final T getRoot() {
        return this.root;
    }

    public /* synthetic */ TreeSelector(Object obj, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<T> getStack() {
        return this.stack;
    }

    public final T getSelected() {
        return this.selected;
    }

    public final TreeSelector<T> push(T node) {
        return copy$default(this, null, CollectionsKt.plus((Collection) this.stack, (Object) node), 1, null);
    }

    public final TreeSelector<T> pop() {
        if (this.stack.isEmpty()) {
            return null;
        }
        List<T> list = this.stack;
        return copy$default(this, null, CollectionsKt.minus(list, CollectionsKt.last((List) list)), 1, null);
    }
}
