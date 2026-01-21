package com.smartengines.app.settings;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextSettings.kt */
@Metadata(m513d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\bH×\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, m514d2 = {"Lcom/smartengines/app/settings/TextSettings;", "Lcom/smartengines/targets/text/TextSettings;", "prefs", "Landroidx/datastore/preferences/core/Preferences;", "<init>", "(Landroidx/datastore/preferences/core/Preferences;)V", "languages", "", "", "getLanguages", "()Ljava/util/Set;", "pageDetection", "", "getPageDetection", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextSettings implements com.smartengines.targets.text.TextSettings {
    public static final int $stable = 8;
    private final Preferences prefs;

    /* JADX WARN: Multi-variable type inference failed */
    public TextSettings() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final Preferences getPrefs() {
        return this.prefs;
    }

    public static /* synthetic */ TextSettings copy$default(TextSettings textSettings, Preferences preferences, int i, Object obj) {
        if ((i & 1) != 0) {
            preferences = textSettings.prefs;
        }
        return textSettings.copy(preferences);
    }

    public final TextSettings copy(Preferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new TextSettings(prefs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TextSettings) && Intrinsics.areEqual(this.prefs, ((TextSettings) other).prefs);
    }

    public int hashCode() {
        return this.prefs.hashCode();
    }

    public String toString() {
        return "TextSettings(prefs=" + this.prefs + ')';
    }

    public TextSettings(Preferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
    }

    public /* synthetic */ TextSettings(Preferences preferences, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PreferencesFactory.createEmpty() : preferences);
    }

    @Override // com.smartengines.targets.text.TextSettings
    public Set<String> getLanguages() {
        Set<String> set = (Set) this.prefs.get(TextSettingsKt.LANGUAGES);
        return set == null ? SetsKt.setOf((Object[]) new String[]{"digits", "eng", "rus"}) : set;
    }

    @Override // com.smartengines.targets.text.TextSettings
    public boolean getPageDetection() {
        Boolean bool = (Boolean) this.prefs.get(TextSettingsKt.PAGE_DETECTION);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
