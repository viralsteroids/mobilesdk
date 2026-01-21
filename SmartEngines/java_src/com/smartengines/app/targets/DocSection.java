package com.smartengines.app.targets;

import androidx.autofill.HintConstants;
import com.smartengines.utils.Name;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocTargetsList.kt */
@Metadata(m513d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u001bH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m514d2 = {"Lcom/smartengines/app/targets/DocSection;", "", "type", "Lcom/smartengines/app/targets/DocSectionType;", HintConstants.AUTOFILL_HINT_NAME, "Lcom/smartengines/utils/Name;", "items", "", "Lcom/smartengines/app/targets/TreeItem;", "<init>", "(Lcom/smartengines/app/targets/DocSectionType;Lcom/smartengines/utils/Name;Ljava/util/List;)V", "getType", "()Lcom/smartengines/app/targets/DocSectionType;", "getName", "()Lcom/smartengines/utils/Name;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DocSection {
    public static final int $stable = 8;
    private final List<TreeItem> items;
    private final Name name;
    private final DocSectionType type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocSection copy$default(DocSection docSection, DocSectionType docSectionType, Name name, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            docSectionType = docSection.type;
        }
        if ((i & 2) != 0) {
            name = docSection.name;
        }
        if ((i & 4) != 0) {
            list = docSection.items;
        }
        return docSection.copy(docSectionType, name, list);
    }

    /* renamed from: component1, reason: from getter */
    public final DocSectionType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final Name getName() {
        return this.name;
    }

    public final List<TreeItem> component3() {
        return this.items;
    }

    public final DocSection copy(DocSectionType type, Name name, List<? extends TreeItem> items) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(items, "items");
        return new DocSection(type, name, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocSection)) {
            return false;
        }
        DocSection docSection = (DocSection) other;
        return this.type == docSection.type && Intrinsics.areEqual(this.name, docSection.name) && Intrinsics.areEqual(this.items, docSection.items);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Name name = this.name;
        return ((iHashCode + (name == null ? 0 : name.hashCode())) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "DocSection(type=" + this.type + ", name=" + this.name + ", items=" + this.items + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DocSection(DocSectionType type, Name name, List<? extends TreeItem> items) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(items, "items");
        this.type = type;
        this.name = name;
        this.items = items;
    }

    public /* synthetic */ DocSection(DocSectionType docSectionType, Name name, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(docSectionType, (i & 2) != 0 ? null : name, list);
    }

    public final DocSectionType getType() {
        return this.type;
    }

    public final Name getName() {
        return this.name;
    }

    public final List<TreeItem> getItems() {
        return this.items;
    }
}
