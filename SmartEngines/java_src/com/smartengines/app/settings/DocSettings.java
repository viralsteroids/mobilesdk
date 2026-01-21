package com.smartengines.app.settings;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocSettings.kt */
@Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0016"}, m514d2 = {"Lcom/smartengines/app/settings/DocSettings;", "", "prefs", "Landroidx/datastore/preferences/core/Preferences;", "<init>", "(Landroidx/datastore/preferences/core/Preferences;)V", "showImages", "", "getShowImages", "()Z", "showTables", "getShowTables", "showAttrib", "getShowAttrib", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DocSettings {
    public static final int $stable = 8;
    private final Preferences prefs;

    /* JADX WARN: Multi-variable type inference failed */
    public DocSettings() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final Preferences getPrefs() {
        return this.prefs;
    }

    public static /* synthetic */ DocSettings copy$default(DocSettings docSettings, Preferences preferences, int i, Object obj) {
        if ((i & 1) != 0) {
            preferences = docSettings.prefs;
        }
        return docSettings.copy(preferences);
    }

    public final DocSettings copy(Preferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new DocSettings(prefs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DocSettings) && Intrinsics.areEqual(this.prefs, ((DocSettings) other).prefs);
    }

    public int hashCode() {
        return this.prefs.hashCode();
    }

    public String toString() {
        return "DocSettings(prefs=" + this.prefs + ')';
    }

    public DocSettings(Preferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
    }

    public /* synthetic */ DocSettings(Preferences preferences, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PreferencesFactory.createEmpty() : preferences);
    }

    public final boolean getShowImages() {
        Boolean bool = (Boolean) this.prefs.get(DocSettingsKt.SHOW_IMAGES);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean getShowTables() {
        Boolean bool = (Boolean) this.prefs.get(DocSettingsKt.SHOW_TABLES);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean getShowAttrib() {
        Boolean bool = (Boolean) this.prefs.get(DocSettingsKt.SHOW_ATTRIB);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
