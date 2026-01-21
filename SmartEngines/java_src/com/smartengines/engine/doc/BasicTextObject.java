package com.smartengines.engine.doc;

import com.smartengines.engine.Geometry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: DocResultData.kt */
@Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, m514d2 = {"Lcom/smartengines/engine/doc/BasicTextObject;", "", TextBundle.TEXT_ENTRY, "", "geometry", "Lcom/smartengines/engine/Geometry;", "isAccepted", "", "<init>", "(Ljava/lang/String;Lcom/smartengines/engine/Geometry;Z)V", "getText", "()Ljava/lang/String;", "getGeometry", "()Lcom/smartengines/engine/Geometry;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BasicTextObject {
    private final Geometry geometry;
    private final boolean isAccepted;
    private final String text;

    public static /* synthetic */ BasicTextObject copy$default(BasicTextObject basicTextObject, String str, Geometry geometry, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basicTextObject.text;
        }
        if ((i & 2) != 0) {
            geometry = basicTextObject.geometry;
        }
        if ((i & 4) != 0) {
            z = basicTextObject.isAccepted;
        }
        return basicTextObject.copy(str, geometry, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Geometry getGeometry() {
        return this.geometry;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAccepted() {
        return this.isAccepted;
    }

    public final BasicTextObject copy(String text, Geometry geometry, boolean isAccepted) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        return new BasicTextObject(text, geometry, isAccepted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicTextObject)) {
            return false;
        }
        BasicTextObject basicTextObject = (BasicTextObject) other;
        return Intrinsics.areEqual(this.text, basicTextObject.text) && Intrinsics.areEqual(this.geometry, basicTextObject.geometry) && this.isAccepted == basicTextObject.isAccepted;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.geometry.hashCode()) * 31) + Boolean.hashCode(this.isAccepted);
    }

    public String toString() {
        return "BasicTextObject(text=" + this.text + ", geometry=" + this.geometry + ", isAccepted=" + this.isAccepted + ')';
    }

    public BasicTextObject(String text, Geometry geometry, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        this.text = text;
        this.geometry = geometry;
        this.isAccepted = z;
    }

    public final String getText() {
        return this.text;
    }

    public final Geometry getGeometry() {
        return this.geometry;
    }

    public final boolean isAccepted() {
        return this.isAccepted;
    }
}
