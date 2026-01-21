package com.smartengines.app.p004ui;

import androidx.compose.p000ui.unit.C1959Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ScreenData.kt */
@Metadata(m513d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J8\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001d\u001a\u00020\u001eH×\u0001J\t\u0010\u001f\u001a\u00020 H×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006!"}, m514d2 = {"Lcom/smartengines/app/ui/ScreenData;", "", "width", "Landroidx/compose/ui/unit/Dp;", "height", "isWide", "", "isTall", "<init>", "(FFZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getWidth-D9Ej5fM", "()F", "F", "getHeight-D9Ej5fM", "()Z", "bodyWidthFraction", "", "getBodyWidthFraction", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component4", "copy", "copy-i1RSzL4", "(FFZZ)Lcom/smartengines/app/ui/ScreenData;", "equals", "other", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ScreenData {
    public static final int $stable = 0;
    private final float height;
    private final boolean isTall;
    private final boolean isWide;
    private final float width;

    public /* synthetic */ ScreenData(float f, float f2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, z, z2);
    }

    /* renamed from: copy-i1RSzL4$default, reason: not valid java name */
    public static /* synthetic */ ScreenData m7571copyi1RSzL4$default(ScreenData screenData, float f, float f2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = screenData.width;
        }
        if ((i & 2) != 0) {
            f2 = screenData.height;
        }
        if ((i & 4) != 0) {
            z = screenData.isWide;
        }
        if ((i & 8) != 0) {
            z2 = screenData.isTall;
        }
        return screenData.m7574copyi1RSzL4(f, f2, z, z2);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsWide() {
        return this.isWide;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsTall() {
        return this.isTall;
    }

    /* renamed from: copy-i1RSzL4, reason: not valid java name */
    public final ScreenData m7574copyi1RSzL4(float width, float height, boolean isWide, boolean isTall) {
        return new ScreenData(width, height, isWide, isTall, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenData)) {
            return false;
        }
        ScreenData screenData = (ScreenData) other;
        return C1959Dp.m7060equalsimpl0(this.width, screenData.width) && C1959Dp.m7060equalsimpl0(this.height, screenData.height) && this.isWide == screenData.isWide && this.isTall == screenData.isTall;
    }

    public int hashCode() {
        return (((((C1959Dp.m7061hashCodeimpl(this.width) * 31) + C1959Dp.m7061hashCodeimpl(this.height)) * 31) + Boolean.hashCode(this.isWide)) * 31) + Boolean.hashCode(this.isTall);
    }

    public String toString() {
        return "ScreenData(width=" + ((Object) C1959Dp.m7066toStringimpl(this.width)) + ", height=" + ((Object) C1959Dp.m7066toStringimpl(this.height)) + ", isWide=" + this.isWide + ", isTall=" + this.isTall + ')';
    }

    private ScreenData(float f, float f2, boolean z, boolean z2) {
        this.width = f;
        this.height = f2;
        this.isWide = z;
        this.isTall = z2;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m7576getWidthD9Ej5fM() {
        return this.width;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m7575getHeightD9Ej5fM() {
        return this.height;
    }

    public final boolean isWide() {
        return this.isWide;
    }

    public final boolean isTall() {
        return this.isTall;
    }

    public final float getBodyWidthFraction() {
        return this.isWide ? 0.7f : 1.0f;
    }
}
