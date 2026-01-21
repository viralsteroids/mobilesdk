package com.smartengines.engine.doc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocResultData.kt */
@Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m514d2 = {"Lcom/smartengines/engine/doc/PhysicalDocumentData;", "", "pages", "", "Lcom/smartengines/engine/doc/PhysicalPageData;", "<init>", "(Ljava/util/List;)V", "getPages", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PhysicalDocumentData {
    private final List<PhysicalPageData> pages;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhysicalDocumentData copy$default(PhysicalDocumentData physicalDocumentData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = physicalDocumentData.pages;
        }
        return physicalDocumentData.copy(list);
    }

    public final List<PhysicalPageData> component1() {
        return this.pages;
    }

    public final PhysicalDocumentData copy(List<PhysicalPageData> pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        return new PhysicalDocumentData(pages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PhysicalDocumentData) && Intrinsics.areEqual(this.pages, ((PhysicalDocumentData) other).pages);
    }

    public int hashCode() {
        return this.pages.hashCode();
    }

    public String toString() {
        return "PhysicalDocumentData(pages=" + this.pages + ')';
    }

    public PhysicalDocumentData(List<PhysicalPageData> pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.pages = pages;
    }

    public final List<PhysicalPageData> getPages() {
        return this.pages;
    }
}
