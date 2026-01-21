package com.smartengines.visualization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: QuadPoint.kt */
@Metadata(m513d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\rJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, m514d2 = {"Lcom/smartengines/visualization/QuadPoint;", "", "x", "", "y", "<init>", "(FF)V", "", "(II)V", "", "(DD)V", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "getX", "()F", "getY", "toString", "", "getJson", "()Lorg/json/JSONObject;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "visualization_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QuadPoint {
    public static final int $stable = 0;
    private final float x;
    private final float y;

    public static /* synthetic */ QuadPoint copy$default(QuadPoint quadPoint, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = quadPoint.x;
        }
        if ((i & 2) != 0) {
            f2 = quadPoint.y;
        }
        return quadPoint.copy(f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    public final QuadPoint copy(float x, float y) {
        return new QuadPoint(x, y);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuadPoint)) {
            return false;
        }
        QuadPoint quadPoint = (QuadPoint) other;
        return Float.compare(this.x, quadPoint.x) == 0 && Float.compare(this.y, quadPoint.y) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
    }

    public QuadPoint(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public String toString() {
        return new StringBuilder().append((int) this.x).append(' ').append((int) this.y).toString();
    }

    public QuadPoint(int i, int i2) {
        this(i, i2);
    }

    public QuadPoint(double d, double d2) {
        this((float) d, (float) d2);
    }

    public final JSONObject getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", this.x);
        jSONObject.put("y", this.y);
        return jSONObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuadPoint(JSONObject json) {
        this((float) json.getDouble("x"), (float) json.getDouble("y"));
        Intrinsics.checkNotNullParameter(json, "json");
    }
}
