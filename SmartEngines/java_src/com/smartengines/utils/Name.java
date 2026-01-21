package com.smartengines.utils;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Name.kt */
@Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\bB\u001d\b\u0016\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u0005\u0010\u000bJ\b\u0010\u000f\u001a\u00020\u0003H\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m514d2 = {"Lcom/smartengines/utils/Name;", "", "en", "", "ru", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "value", "(Ljava/lang/String;)V", "map", "", "(Ljava/util/Map;)V", "getEn", "()Ljava/lang/String;", "getRu", "toString", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "Companion", "utils_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Name {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static String language = "en";
    private final String en;
    private final String ru;

    public static /* synthetic */ Name copy$default(Name name, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = name.en;
        }
        if ((i & 2) != 0) {
            str2 = name.ru;
        }
        return name.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEn() {
        return this.en;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRu() {
        return this.ru;
    }

    public final Name copy(String en, String ru) {
        Intrinsics.checkNotNullParameter(en, "en");
        Intrinsics.checkNotNullParameter(ru, "ru");
        return new Name(en, ru);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Name)) {
            return false;
        }
        Name name = (Name) other;
        return Intrinsics.areEqual(this.en, name.en) && Intrinsics.areEqual(this.ru, name.ru);
    }

    public int hashCode() {
        return (this.en.hashCode() * 31) + this.ru.hashCode();
    }

    public Name(String en, String ru) {
        Intrinsics.checkNotNullParameter(en, "en");
        Intrinsics.checkNotNullParameter(ru, "ru");
        this.en = en;
        this.ru = ru;
    }

    public final String getEn() {
        return this.en;
    }

    public final String getRu() {
        return this.ru;
    }

    /* compiled from: Name.kt */
    @Metadata(m513d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, m514d2 = {"Lcom/smartengines/utils/Name$Companion;", "", "<init>", "()V", "language", "", "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "utils_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getLanguage() {
            return Name.language;
        }

        public final void setLanguage(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            Name.language = str;
        }
    }

    public String toString() {
        return Intrinsics.areEqual(language, "ru") ? this.ru : this.en;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Name(String value) {
        this(value, value);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Name(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        String str = map.get("en");
        str = str == null ? "???" : str;
        String str2 = map.get("ru");
        this(str, str2 != null ? str2 : "???");
    }
}
