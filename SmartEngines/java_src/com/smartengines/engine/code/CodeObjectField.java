package com.smartengines.engine.code;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeResultData.kt */
@Metadata(m513d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, m514d2 = {"Lcom/smartengines/engine/code/CodeObjectField;", "", HintConstants.AUTOFILL_HINT_NAME, "", "value", "isAccepted", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getValue", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CodeObjectField {
    private final boolean isAccepted;
    private final String name;
    private final String value;

    public static /* synthetic */ CodeObjectField copy$default(CodeObjectField codeObjectField, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeObjectField.name;
        }
        if ((i & 2) != 0) {
            str2 = codeObjectField.value;
        }
        if ((i & 4) != 0) {
            z = codeObjectField.isAccepted;
        }
        return codeObjectField.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAccepted() {
        return this.isAccepted;
    }

    public final CodeObjectField copy(String name, String value, boolean isAccepted) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new CodeObjectField(name, value, isAccepted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeObjectField)) {
            return false;
        }
        CodeObjectField codeObjectField = (CodeObjectField) other;
        return Intrinsics.areEqual(this.name, codeObjectField.name) && Intrinsics.areEqual(this.value, codeObjectField.value) && this.isAccepted == codeObjectField.isAccepted;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.value.hashCode()) * 31) + Boolean.hashCode(this.isAccepted);
    }

    public String toString() {
        return "CodeObjectField(name=" + this.name + ", value=" + this.value + ", isAccepted=" + this.isAccepted + ')';
    }

    public CodeObjectField(String name, String value, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.isAccepted = z;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean isAccepted() {
        return this.isAccepted;
    }
}
