package com.smartengines.app.settings;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import com.smartengines.app.Model;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdSettings.kt */
@Metadata(m513d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010(\u001a\u00020\u0003HÂ\u0003J\u0013\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010,H×\u0003J\t\u0010-\u001a\u00020\rH×\u0001J\t\u0010.\u001a\u00020#H×\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u0011\u0010\u001a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0014\u0010\u001c\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000fR\u0011\u0010\u001e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\tR\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006/"}, m514d2 = {"Lcom/smartengines/app/settings/IdSettings;", "Lcom/smartengines/targets/id/IdSettings;", "prefs", "Landroidx/datastore/preferences/core/Preferences;", "<init>", "(Landroidx/datastore/preferences/core/Preferences;)V", "vauthEnabled", "", "getVauthEnabled", "()Z", "enableForensics", "getEnableForensics", "minInstrTime", "", "getMinInstrTime", "()I", "maxInstrTime", "getMaxInstrTime", "instrCount", "getInstrCount", "instrCountDeltaRandom", "getInstrCountDeltaRandom", "instrFailed", "getInstrFailed", "alwaysPass", "getAlwaysPass", "enableVisualization", "getEnableVisualization", "minPassTime", "getMinPassTime", "flashByDefault", "getFlashByDefault", "showUndefChecks", "getShowUndefChecks", "showChecksFilter", "", "getShowChecksFilter", "()Ljava/lang/String;", "hideChecksFilter", "getHideChecksFilter", "component1", "copy", "equals", "other", "", "hashCode", "toString", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IdSettings implements com.smartengines.targets.p008id.IdSettings {
    public static final int $stable = 8;
    private final Preferences prefs;

    /* JADX WARN: Multi-variable type inference failed */
    public IdSettings() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final Preferences getPrefs() {
        return this.prefs;
    }

    public static /* synthetic */ IdSettings copy$default(IdSettings idSettings, Preferences preferences, int i, Object obj) {
        if ((i & 1) != 0) {
            preferences = idSettings.prefs;
        }
        return idSettings.copy(preferences);
    }

    public final IdSettings copy(Preferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new IdSettings(prefs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IdSettings) && Intrinsics.areEqual(this.prefs, ((IdSettings) other).prefs);
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public boolean getVauthEnabled() {
        return false;
    }

    public int hashCode() {
        return this.prefs.hashCode();
    }

    public String toString() {
        return "IdSettings(prefs=" + this.prefs + ')';
    }

    public IdSettings(Preferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
    }

    public /* synthetic */ IdSettings(Preferences preferences, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PreferencesFactory.createEmpty() : preferences);
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public boolean getEnableForensics() {
        if (Model.INSTANCE.getBuildFlavor() == BuildFlavor.FORENSIC) {
            return true;
        }
        Boolean bool = (Boolean) this.prefs.get(IdSettingsKt.ENABLE_FORENSICS);
        return bool != null ? bool.booleanValue() : false;
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public int getMinInstrTime() {
        Integer num = (Integer) this.prefs.get(IdSettingsKt.MIN_INSTR_TIME);
        if (num != null) {
            return num.intValue();
        }
        return 6;
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public int getMaxInstrTime() {
        Integer num = (Integer) this.prefs.get(IdSettingsKt.MAX_INSTR_TIME);
        if (num != null) {
            return num.intValue();
        }
        return 7;
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public int getInstrCount() {
        Integer num = (Integer) this.prefs.get(IdSettingsKt.INSTR_COUNT);
        if (num != null) {
            return num.intValue();
        }
        return 4;
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public int getInstrCountDeltaRandom() {
        Integer num = (Integer) this.prefs.get(IdSettingsKt.INSTR_COUNT_DELTA);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public int getInstrFailed() {
        Integer num = (Integer) this.prefs.get(IdSettingsKt.INSTR_FAILED);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public boolean getAlwaysPass() {
        Boolean bool = (Boolean) this.prefs.get(IdSettingsKt.ALWAYS_PASS);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean getEnableVisualization() {
        Boolean bool = (Boolean) this.prefs.get(IdSettingsKt.ENABLE_VISUAL);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public int getMinPassTime() {
        Integer num = (Integer) this.prefs.get(IdSettingsKt.MIN_PASS_TIME);
        if (num != null) {
            return num.intValue();
        }
        return 1000;
    }

    public final boolean getFlashByDefault() {
        Boolean bool = (Boolean) this.prefs.get(IdSettingsKt.FLASH_BY_DEFAULT);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean getShowUndefChecks() {
        Boolean bool = (Boolean) this.prefs.get(IdSettingsKt.SHOW_UNDEF_CHECKS);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final String getShowChecksFilter() {
        String str = (String) this.prefs.get(IdSettingsKt.SHOW_CHECKS_FILTER);
        return str == null ? "" : str;
    }

    public final String getHideChecksFilter() {
        String str = (String) this.prefs.get(IdSettingsKt.HIDE_CHECKS_FILTER);
        return str == null ? "" : str;
    }
}
