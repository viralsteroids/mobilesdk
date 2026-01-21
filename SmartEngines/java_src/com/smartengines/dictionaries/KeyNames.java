package com.smartengines.dictionaries;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyName.kt */
@Metadata(m513d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m514d2 = {"Lcom/smartengines/dictionaries/KeyNames;", "", "key", "", "names", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getKey", "()Ljava/lang/String;", "getNames", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "dictionaries_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class KeyNames {
    private final String key;
    private final Map<String, String> names;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KeyNames copy$default(KeyNames keyNames, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = keyNames.key;
        }
        if ((i & 2) != 0) {
            map = keyNames.names;
        }
        return keyNames.copy(str, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final Map<String, String> component2() {
        return this.names;
    }

    public final KeyNames copy(String key, Map<String, String> names) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(names, "names");
        return new KeyNames(key, names);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyNames)) {
            return false;
        }
        KeyNames keyNames = (KeyNames) other;
        return Intrinsics.areEqual(this.key, keyNames.key) && Intrinsics.areEqual(this.names, keyNames.names);
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.names.hashCode();
    }

    public String toString() {
        return "KeyNames(key=" + this.key + ", names=" + this.names + ')';
    }

    public KeyNames(String key, Map<String, String> names) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(names, "names");
        this.key = key;
        this.names = names;
    }

    public final String getKey() {
        return this.key;
    }

    public final Map<String, String> getNames() {
        return this.names;
    }
}
