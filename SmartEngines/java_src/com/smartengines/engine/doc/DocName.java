package com.smartengines.engine.doc;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocResultData.kt */
@Metadata(m513d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, m514d2 = {"Lcom/smartengines/engine/doc/DocName;", "", "default", "", ImagesContract.LOCAL, "shortLocal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDefault", "()Ljava/lang/String;", "getLocal", "getShortLocal", "getShort", "language", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DocName {
    private final String default;
    private final String local;
    private final String shortLocal;

    public static /* synthetic */ DocName copy$default(DocName docName, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = docName.default;
        }
        if ((i & 2) != 0) {
            str2 = docName.local;
        }
        if ((i & 4) != 0) {
            str3 = docName.shortLocal;
        }
        return docName.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDefault() {
        return this.default;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLocal() {
        return this.local;
    }

    /* renamed from: component3, reason: from getter */
    public final String getShortLocal() {
        return this.shortLocal;
    }

    public final DocName copy(String str, String local, String shortLocal) {
        Intrinsics.checkNotNullParameter(str, "default");
        Intrinsics.checkNotNullParameter(local, "local");
        Intrinsics.checkNotNullParameter(shortLocal, "shortLocal");
        return new DocName(str, local, shortLocal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocName)) {
            return false;
        }
        DocName docName = (DocName) other;
        return Intrinsics.areEqual(this.default, docName.default) && Intrinsics.areEqual(this.local, docName.local) && Intrinsics.areEqual(this.shortLocal, docName.shortLocal);
    }

    public int hashCode() {
        return (((this.default.hashCode() * 31) + this.local.hashCode()) * 31) + this.shortLocal.hashCode();
    }

    public String toString() {
        return "DocName(default=" + this.default + ", local=" + this.local + ", shortLocal=" + this.shortLocal + ')';
    }

    public DocName(String str, String local, String shortLocal) {
        Intrinsics.checkNotNullParameter(str, "default");
        Intrinsics.checkNotNullParameter(local, "local");
        Intrinsics.checkNotNullParameter(shortLocal, "shortLocal");
        this.default = str;
        this.local = local;
        this.shortLocal = shortLocal;
    }

    public final String getDefault() {
        return this.default;
    }

    public final String getLocal() {
        return this.local;
    }

    public final String getShortLocal() {
        return this.shortLocal;
    }

    public final String getShort(String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        if (Intrinsics.areEqual(language, "ru")) {
            String str = this.shortLocal;
            if (str.length() == 0) {
                String str2 = this.local;
                if (str2.length() == 0) {
                    str2 = this.default;
                }
                str = str2;
            }
            return str;
        }
        return this.default;
    }
}
