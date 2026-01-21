package com.smartengines.engine.doc;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocResultNamesFiller.kt */
@Metadata(m513d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m514d2 = {"Lcom/smartengines/engine/doc/SessionFieldInfo;", "", HintConstants.AUTOFILL_HINT_NAME, "Lcom/smartengines/engine/doc/DocName;", "type", "", "format", "formatExt", "<init>", "(Lcom/smartengines/engine/doc/DocName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Lcom/smartengines/engine/doc/DocName;", "getType", "()Ljava/lang/String;", "getFormat", "getFormatExt", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
final /* data */ class SessionFieldInfo {
    private final String format;
    private final String formatExt;
    private final DocName name;
    private final String type;

    public static /* synthetic */ SessionFieldInfo copy$default(SessionFieldInfo sessionFieldInfo, DocName docName, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            docName = sessionFieldInfo.name;
        }
        if ((i & 2) != 0) {
            str = sessionFieldInfo.type;
        }
        if ((i & 4) != 0) {
            str2 = sessionFieldInfo.format;
        }
        if ((i & 8) != 0) {
            str3 = sessionFieldInfo.formatExt;
        }
        return sessionFieldInfo.copy(docName, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final DocName getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFormatExt() {
        return this.formatExt;
    }

    public final SessionFieldInfo copy(DocName name, String type, String format, String formatExt) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(formatExt, "formatExt");
        return new SessionFieldInfo(name, type, format, formatExt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionFieldInfo)) {
            return false;
        }
        SessionFieldInfo sessionFieldInfo = (SessionFieldInfo) other;
        return Intrinsics.areEqual(this.name, sessionFieldInfo.name) && Intrinsics.areEqual(this.type, sessionFieldInfo.type) && Intrinsics.areEqual(this.format, sessionFieldInfo.format) && Intrinsics.areEqual(this.formatExt, sessionFieldInfo.formatExt);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.format.hashCode()) * 31) + this.formatExt.hashCode();
    }

    public String toString() {
        return "SessionFieldInfo(name=" + this.name + ", type=" + this.type + ", format=" + this.format + ", formatExt=" + this.formatExt + ')';
    }

    public SessionFieldInfo(DocName name, String type, String format, String formatExt) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(formatExt, "formatExt");
        this.name = name;
        this.type = type;
        this.format = format;
        this.formatExt = formatExt;
    }

    public final DocName getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getFormatExt() {
        return this.formatExt;
    }
}
