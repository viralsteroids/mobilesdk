package com.smartengines.engine.text;

import com.smartengines.engine.Geometry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextResultData.kt */
@Metadata(m513d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m514d2 = {"Lcom/smartengines/engine/text/TextResultChunk;", "", "value", "", "confidence", "", "isAccepted", "", "geometry", "Lcom/smartengines/engine/Geometry;", "<init>", "(Ljava/lang/String;DZLcom/smartengines/engine/Geometry;)V", "getValue", "()Ljava/lang/String;", "getConfidence", "()D", "()Z", "getGeometry", "()Lcom/smartengines/engine/Geometry;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextResultChunk {
    private final double confidence;
    private final Geometry geometry;
    private final boolean isAccepted;
    private final String value;

    public static /* synthetic */ TextResultChunk copy$default(TextResultChunk textResultChunk, String str, double d, boolean z, Geometry geometry, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textResultChunk.value;
        }
        if ((i & 2) != 0) {
            d = textResultChunk.confidence;
        }
        if ((i & 4) != 0) {
            z = textResultChunk.isAccepted;
        }
        if ((i & 8) != 0) {
            geometry = textResultChunk.geometry;
        }
        return textResultChunk.copy(str, d, z, geometry);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final double getConfidence() {
        return this.confidence;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAccepted() {
        return this.isAccepted;
    }

    /* renamed from: component4, reason: from getter */
    public final Geometry getGeometry() {
        return this.geometry;
    }

    public final TextResultChunk copy(String value, double confidence, boolean isAccepted, Geometry geometry) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        return new TextResultChunk(value, confidence, isAccepted, geometry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextResultChunk)) {
            return false;
        }
        TextResultChunk textResultChunk = (TextResultChunk) other;
        return Intrinsics.areEqual(this.value, textResultChunk.value) && Double.compare(this.confidence, textResultChunk.confidence) == 0 && this.isAccepted == textResultChunk.isAccepted && Intrinsics.areEqual(this.geometry, textResultChunk.geometry);
    }

    public int hashCode() {
        return (((((this.value.hashCode() * 31) + Double.hashCode(this.confidence)) * 31) + Boolean.hashCode(this.isAccepted)) * 31) + this.geometry.hashCode();
    }

    public String toString() {
        return "TextResultChunk(value=" + this.value + ", confidence=" + this.confidence + ", isAccepted=" + this.isAccepted + ", geometry=" + this.geometry + ')';
    }

    public TextResultChunk(String value, double d, boolean z, Geometry geometry) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        this.value = value;
        this.confidence = d;
        this.isAccepted = z;
        this.geometry = geometry;
    }

    public final String getValue() {
        return this.value;
    }

    public final double getConfidence() {
        return this.confidence;
    }

    public final boolean isAccepted() {
        return this.isAccepted;
    }

    public final Geometry getGeometry() {
        return this.geometry;
    }
}
