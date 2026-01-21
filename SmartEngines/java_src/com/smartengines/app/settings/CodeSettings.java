package com.smartengines.app.settings;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import com.smartengines.dictionaries.CodeDictionaries;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeSettings.kt */
@Metadata(m513d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010,\u001a\u00020\u0003HÂ\u0003J\u0013\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010.\u001a\u00020\u00152\b\u0010/\u001a\u0004\u0018\u000100H×\u0003J\t\u00101\u001a\u00020\fH×\u0001J\t\u00102\u001a\u00020\bH×\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\nR\u0014\u0010\"\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\nR\u0014\u0010&\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u000eR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\nR\u0014\u0010*\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u000e¨\u00063"}, m514d2 = {"Lcom/smartengines/app/settings/CodeSettings;", "Lcom/smartengines/targets/code/CodeSettings;", "prefs", "Landroidx/datastore/preferences/core/Preferences;", "<init>", "(Landroidx/datastore/preferences/core/Preferences;)V", "barcodeTypes", "", "", "getBarcodeTypes", "()Ljava/util/Set;", "barcodeMax", "", "getBarcodeMax", "()I", "barcodeRoi", "getBarcodeRoi", "()Ljava/lang/String;", "barcodeEffort", "getBarcodeEffort", "barcodeDecode", "", "getBarcodeDecode", "()Z", "barcodeSmart", "getBarcodeSmart", "barcodeNonpayment", "getBarcodeNonpayment", "cardTypes", "getCardTypes", "cardShowOptionalData", "getCardShowOptionalData", "paymentTypes", "getPaymentTypes", "lineMax", "getLineMax", "lineTypes", "getLineTypes", "meterMax", "getMeterMax", "plateTypes", "getPlateTypes", "containerMax", "getContainerMax", "component1", "copy", "equals", "other", "", "hashCode", "toString", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CodeSettings implements com.smartengines.targets.code.CodeSettings {
    public static final int $stable = 8;
    private final Preferences prefs;

    /* JADX WARN: Multi-variable type inference failed */
    public CodeSettings() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final Preferences getPrefs() {
        return this.prefs;
    }

    public static /* synthetic */ CodeSettings copy$default(CodeSettings codeSettings, Preferences preferences, int i, Object obj) {
        if ((i & 1) != 0) {
            preferences = codeSettings.prefs;
        }
        return codeSettings.copy(preferences);
    }

    public final CodeSettings copy(Preferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new CodeSettings(prefs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CodeSettings) && Intrinsics.areEqual(this.prefs, ((CodeSettings) other).prefs);
    }

    public int hashCode() {
        return this.prefs.hashCode();
    }

    public String toString() {
        return "CodeSettings(prefs=" + this.prefs + ')';
    }

    public CodeSettings(Preferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
    }

    public /* synthetic */ CodeSettings(Preferences preferences, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PreferencesFactory.createEmpty() : preferences);
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public Set<String> getBarcodeTypes() {
        Set<String> set = (Set) this.prefs.get(CodeSettingsKt.BARCODE_TYPES);
        return set == null ? SetsKt.setOf("GS1_DATABAR") : set;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public int getBarcodeMax() {
        Integer num = (Integer) this.prefs.get(CodeSettingsKt.BARCODE_MAX);
        if (num != null) {
            return num.intValue();
        }
        return 5;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public String getBarcodeRoi() {
        String str = (String) this.prefs.get(CodeSettingsKt.BARCODE_ROI);
        return str == null ? CodeDictionaries.INSTANCE.getBarcodeRoiDefault() : str;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public String getBarcodeEffort() {
        String str = (String) this.prefs.get(CodeSettingsKt.BARCODE_EFFORT);
        return str == null ? CodeDictionaries.INSTANCE.getBarcodeEffortDefault() : str;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public boolean getBarcodeDecode() {
        Boolean bool = (Boolean) this.prefs.get(CodeSettingsKt.BARCODE_DECODE);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public boolean getBarcodeSmart() {
        Boolean bool = (Boolean) this.prefs.get(CodeSettingsKt.BARCODE_SMART);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public boolean getBarcodeNonpayment() {
        Boolean bool = (Boolean) this.prefs.get(CodeSettingsKt.BARCODE_NONPAYMENT);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public Set<String> getCardTypes() {
        Set<String> set = (Set) this.prefs.get(CodeSettingsKt.CARD_TYPES);
        return set == null ? SetsKt.emptySet() : set;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public boolean getCardShowOptionalData() {
        Boolean bool = (Boolean) this.prefs.get(CodeSettingsKt.CARD_OPTIONAL);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public Set<String> getPaymentTypes() {
        Set<String> set = (Set) this.prefs.get(CodeSettingsKt.PAYMENT_TYPES);
        return set == null ? SetsKt.emptySet() : set;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public int getLineMax() {
        Integer num = (Integer) this.prefs.get(CodeSettingsKt.LINE_MAX);
        if (num != null) {
            return num.intValue();
        }
        return 2;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public Set<String> getLineTypes() {
        Set<String> set = (Set) this.prefs.get(CodeSettingsKt.LINE_TYPES);
        return set == null ? SetsKt.emptySet() : set;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public int getMeterMax() {
        Integer num = (Integer) this.prefs.get(CodeSettingsKt.METER_MAX);
        if (num != null) {
            return num.intValue();
        }
        return 4;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public Set<String> getPlateTypes() {
        Set<String> set = (Set) this.prefs.get(CodeSettingsKt.PLATE_TYPES);
        return set == null ? CodeDictionaries.INSTANCE.getPlateTypesDefault() : set;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public int getContainerMax() {
        Integer num = (Integer) this.prefs.get(CodeSettingsKt.CONTAINER_MAX);
        if (num != null) {
            return num.intValue();
        }
        return 10;
    }
}
