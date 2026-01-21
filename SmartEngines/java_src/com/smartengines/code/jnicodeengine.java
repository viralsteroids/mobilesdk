package com.smartengines.code;

/* loaded from: classes3.dex */
public class jnicodeengine {
    public static EngineSettingsGroup engineSettingsGroupFromString(String str) {
        return EngineSettingsGroup.swigToEnum(jnicodeengineJNI.engineSettingsGroupFromString(str));
    }

    public static String toString(EngineSettingsGroup engineSettingsGroup) {
        return jnicodeengineJNI.toString(engineSettingsGroup.swigValue());
    }

    public static String presetToString(BarcodePreset barcodePreset) {
        return jnicodeengineJNI.presetToString(barcodePreset.swigValue());
    }
}
