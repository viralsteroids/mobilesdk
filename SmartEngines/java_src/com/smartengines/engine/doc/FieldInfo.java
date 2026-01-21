package com.smartengines.engine.doc;

import androidx.autofill.HintConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocResultData.kt */
@Metadata(m513d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m514d2 = {"Lcom/smartengines/engine/doc/FieldInfo;", "", "key", "", HintConstants.AUTOFILL_HINT_NAME, "Lcom/smartengines/engine/doc/DocName;", "confidence", "", "isAccepted", "", "attributes", "", "<init>", "(Ljava/lang/String;Lcom/smartengines/engine/doc/DocName;DZLjava/util/Map;)V", "getKey", "()Ljava/lang/String;", "getName", "()Lcom/smartengines/engine/doc/DocName;", "getConfidence", "()D", "()Z", "getAttributes", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FieldInfo {
    private final Map<String, String> attributes;
    private final double confidence;
    private final boolean isAccepted;
    private final String key;
    private final DocName name;

    public static /* synthetic */ FieldInfo copy$default(FieldInfo fieldInfo, String str, DocName docName, double d, boolean z, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fieldInfo.key;
        }
        if ((i & 2) != 0) {
            docName = fieldInfo.name;
        }
        if ((i & 4) != 0) {
            d = fieldInfo.confidence;
        }
        if ((i & 8) != 0) {
            z = fieldInfo.isAccepted;
        }
        if ((i & 16) != 0) {
            map = fieldInfo.attributes;
        }
        double d2 = d;
        return fieldInfo.copy(str, docName, d2, z, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final DocName getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final double getConfidence() {
        return this.confidence;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAccepted() {
        return this.isAccepted;
    }

    public final Map<String, String> component5() {
        return this.attributes;
    }

    public final FieldInfo copy(String key, DocName name, double confidence, boolean isAccepted, Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return new FieldInfo(key, name, confidence, isAccepted, attributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldInfo)) {
            return false;
        }
        FieldInfo fieldInfo = (FieldInfo) other;
        return Intrinsics.areEqual(this.key, fieldInfo.key) && Intrinsics.areEqual(this.name, fieldInfo.name) && Double.compare(this.confidence, fieldInfo.confidence) == 0 && this.isAccepted == fieldInfo.isAccepted && Intrinsics.areEqual(this.attributes, fieldInfo.attributes);
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        DocName docName = this.name;
        return ((((((iHashCode + (docName == null ? 0 : docName.hashCode())) * 31) + Double.hashCode(this.confidence)) * 31) + Boolean.hashCode(this.isAccepted)) * 31) + this.attributes.hashCode();
    }

    public String toString() {
        return "FieldInfo(key=" + this.key + ", name=" + this.name + ", confidence=" + this.confidence + ", isAccepted=" + this.isAccepted + ", attributes=" + this.attributes + ')';
    }

    public FieldInfo(String key, DocName docName, double d, boolean z, Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.key = key;
        this.name = docName;
        this.confidence = d;
        this.isAccepted = z;
        this.attributes = attributes;
    }

    public final String getKey() {
        return this.key;
    }

    public final DocName getName() {
        return this.name;
    }

    public final double getConfidence() {
        return this.confidence;
    }

    public final boolean isAccepted() {
        return this.isAccepted;
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
    }
}
