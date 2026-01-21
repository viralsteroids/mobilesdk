package com.smartengines.app.targets;

import com.smartengines.app.AppKt;
import kotlin.Metadata;

/* compiled from: Icon.kt */
@Metadata(m513d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m514d2 = {"Lcom/smartengines/app/targets/Icon;", "", "light", "", "dark", "<init>", "(II)V", "getLight", "()I", "getDark", "toInt", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Icon {
    public static final int $stable = 0;
    private final int dark;
    private final int light;

    public static /* synthetic */ Icon copy$default(Icon icon, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = icon.light;
        }
        if ((i3 & 2) != 0) {
            i2 = icon.dark;
        }
        return icon.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLight() {
        return this.light;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDark() {
        return this.dark;
    }

    public final Icon copy(int light, int dark) {
        return new Icon(light, dark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) other;
        return this.light == icon.light && this.dark == icon.dark;
    }

    public int hashCode() {
        return (Integer.hashCode(this.light) * 31) + Integer.hashCode(this.dark);
    }

    public String toString() {
        return "Icon(light=" + this.light + ", dark=" + this.dark + ')';
    }

    public Icon(int i, int i2) {
        this.light = i;
        this.dark = i2;
    }

    public final int getLight() {
        return this.light;
    }

    public final int getDark() {
        return this.dark;
    }

    public final int toInt() {
        return AppKt.getCommonSettingsStore().getData().getValue().getDarkTheme() ? this.dark : this.light;
    }
}
