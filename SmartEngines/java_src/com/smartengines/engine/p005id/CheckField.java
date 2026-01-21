package com.smartengines.engine.p005id;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdResultData.kt */
@Metadata(m513d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m514d2 = {"Lcom/smartengines/engine/id/CheckField;", "", "key", "", "value", "Lcom/smartengines/engine/id/CheckStatus;", "attr", "", "Lcom/smartengines/engine/id/Attribute;", "<init>", "(Ljava/lang/String;Lcom/smartengines/engine/id/CheckStatus;Ljava/util/List;)V", "getKey", "()Ljava/lang/String;", "getValue", "()Lcom/smartengines/engine/id/CheckStatus;", "getAttr", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckField {
    private final List<Attribute> attr;
    private final String key;
    private final CheckStatus value;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckField copy$default(CheckField checkField, String str, CheckStatus checkStatus, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkField.key;
        }
        if ((i & 2) != 0) {
            checkStatus = checkField.value;
        }
        if ((i & 4) != 0) {
            list = checkField.attr;
        }
        return checkField.copy(str, checkStatus, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final CheckStatus getValue() {
        return this.value;
    }

    public final List<Attribute> component3() {
        return this.attr;
    }

    public final CheckField copy(String key, CheckStatus value, List<Attribute> attr) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(attr, "attr");
        return new CheckField(key, value, attr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckField)) {
            return false;
        }
        CheckField checkField = (CheckField) other;
        return Intrinsics.areEqual(this.key, checkField.key) && this.value == checkField.value && Intrinsics.areEqual(this.attr, checkField.attr);
    }

    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.value.hashCode()) * 31) + this.attr.hashCode();
    }

    public String toString() {
        return "CheckField(key=" + this.key + ", value=" + this.value + ", attr=" + this.attr + ')';
    }

    public CheckField(String key, CheckStatus value, List<Attribute> attr) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(attr, "attr");
        this.key = key;
        this.value = value;
        this.attr = attr;
    }

    public final String getKey() {
        return this.key;
    }

    public final CheckStatus getValue() {
        return this.value;
    }

    public final List<Attribute> getAttr() {
        return this.attr;
    }
}
