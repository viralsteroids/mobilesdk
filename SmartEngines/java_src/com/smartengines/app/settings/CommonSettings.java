package com.smartengines.app.settings;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonSettings.kt */
@Metadata(m513d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010*\u001a\u00020\u0003HÂ\u0003J\u0013\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010,\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010.H×\u0003J\t\u0010/\u001a\u00020\u001fH×\u0001J\t\u00100\u001a\u000201H×\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0011\u0010\u0016\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u0011\u0010\u0018\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u0011\u0010\u001a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\tR\u0014\u0010$\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\tR\u0014\u0010&\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\tR\u0014\u0010(\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\t¨\u00062"}, m514d2 = {"Lcom/smartengines/app/settings/CommonSettings;", "Lcom/smartengines/targets/CommonSettings;", "prefs", "Landroidx/datastore/preferences/core/Preferences;", "<init>", "(Landroidx/datastore/preferences/core/Preferences;)V", "extendedMode", "", "getExtendedMode", "()Z", "tutorialShown", "getTutorialShown", "eulaVersion", "", "getEulaVersion", "()J", "darkTheme", "getDarkTheme", "showQuads", "getShowQuads", "resultPreview", "getResultPreview", "alwaysAccepted", "getAlwaysAccepted", "savePhoto", "getSavePhoto", "saveVideo", "getSaveVideo", "livenessIntro", "getLivenessIntro", "sessionTimeout", "", "getSessionTimeout", "()I", "multiThreading", "getMultiThreading", "computeMetrics", "getComputeMetrics", "ignoreTerminal", "getIgnoreTerminal", "enableStoppers", "getEnableStoppers", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CommonSettings implements com.smartengines.targets.CommonSettings {
    public static final int $stable = 8;
    private final Preferences prefs;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonSettings() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final Preferences getPrefs() {
        return this.prefs;
    }

    public static /* synthetic */ CommonSettings copy$default(CommonSettings commonSettings, Preferences preferences, int i, Object obj) {
        if ((i & 1) != 0) {
            preferences = commonSettings.prefs;
        }
        return commonSettings.copy(preferences);
    }

    public final CommonSettings copy(Preferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new CommonSettings(prefs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CommonSettings) && Intrinsics.areEqual(this.prefs, ((CommonSettings) other).prefs);
    }

    public int hashCode() {
        return this.prefs.hashCode();
    }

    public String toString() {
        return "CommonSettings(prefs=" + this.prefs + ')';
    }

    public CommonSettings(Preferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
    }

    public /* synthetic */ CommonSettings(Preferences preferences, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PreferencesFactory.createEmpty() : preferences);
    }

    public final boolean getExtendedMode() {
        Boolean bool = (Boolean) this.prefs.get(CommonSettingsKt.EXTENDED_MODE);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean getTutorialShown() {
        Boolean bool = (Boolean) this.prefs.get(CommonSettingsKt.TUTORIAL_SHOWN);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final long getEulaVersion() {
        Long l = (Long) this.prefs.get(CommonSettingsKt.EULA_VERSION);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final boolean getDarkTheme() {
        Boolean bool = (Boolean) this.prefs.get(CommonSettingsKt.DARK_THEME);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean getShowQuads() {
        Boolean bool = (Boolean) this.prefs.get(CommonSettingsKt.SHOW_QUADS);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean getResultPreview() {
        Boolean bool = (Boolean) this.prefs.get(CommonSettingsKt.RESULT_PREVIEW);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean getAlwaysAccepted() {
        Boolean bool = (Boolean) this.prefs.get(CommonSettingsKt.ALWAYS_ACCEPTED);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean getSavePhoto() {
        Boolean bool = (Boolean) this.prefs.get(CommonSettingsKt.SAVE_PHOTO);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean getSaveVideo() {
        Boolean bool = (Boolean) this.prefs.get(CommonSettingsKt.SAVE_VIDEO);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean getLivenessIntro() {
        Boolean bool = (Boolean) this.prefs.get(CommonSettingsKt.LIVENESS_INTRO);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.smartengines.targets.CommonSettings
    public int getSessionTimeout() {
        Integer num = (Integer) this.prefs.get(CommonSettingsKt.SESSION_TIMEOUT);
        if (num != null) {
            return num.intValue();
        }
        return 5;
    }

    @Override // com.smartengines.targets.CommonSettings
    public boolean getMultiThreading() {
        Boolean bool = (Boolean) this.prefs.get(CommonSettingsKt.MULTI_THREADING);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.smartengines.targets.CommonSettings
    public boolean getComputeMetrics() {
        Boolean bool = (Boolean) this.prefs.get(CommonSettingsKt.COMPUTE_METRICS);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.smartengines.targets.CommonSettings
    public boolean getIgnoreTerminal() {
        Boolean bool = (Boolean) this.prefs.get(CommonSettingsKt.IGNORE_TERMINAL);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.smartengines.targets.CommonSettings
    public boolean getEnableStoppers() {
        Boolean bool = (Boolean) this.prefs.get(CommonSettingsKt.ENABLE_STOPPERS);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
