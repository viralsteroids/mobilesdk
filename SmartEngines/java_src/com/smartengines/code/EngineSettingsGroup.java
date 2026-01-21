package com.smartengines.code;

/* loaded from: classes3.dex */
public final class EngineSettingsGroup {
    public static final EngineSettingsGroup Barcode;
    public static final EngineSettingsGroup Card;
    public static final EngineSettingsGroup CodeTextLine;
    public static final EngineSettingsGroup Global;
    public static final EngineSettingsGroup LicensePlate;
    public static final EngineSettingsGroup Mrz;
    public static final EngineSettingsGroup PaymentDetails;
    public static final EngineSettingsGroup RFID;
    public static final EngineSettingsGroup ShippingContainer;
    private static int swigNext;
    private static EngineSettingsGroup[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        EngineSettingsGroup engineSettingsGroup = new EngineSettingsGroup("Global", jnicodeengineJNI.EngineSettingsGroup_Global_get());
        Global = engineSettingsGroup;
        EngineSettingsGroup engineSettingsGroup2 = new EngineSettingsGroup("Barcode", jnicodeengineJNI.EngineSettingsGroup_Barcode_get());
        Barcode = engineSettingsGroup2;
        EngineSettingsGroup engineSettingsGroup3 = new EngineSettingsGroup("Card", jnicodeengineJNI.EngineSettingsGroup_Card_get());
        Card = engineSettingsGroup3;
        EngineSettingsGroup engineSettingsGroup4 = new EngineSettingsGroup("CodeTextLine", jnicodeengineJNI.EngineSettingsGroup_CodeTextLine_get());
        CodeTextLine = engineSettingsGroup4;
        EngineSettingsGroup engineSettingsGroup5 = new EngineSettingsGroup("Mrz", jnicodeengineJNI.EngineSettingsGroup_Mrz_get());
        Mrz = engineSettingsGroup5;
        EngineSettingsGroup engineSettingsGroup6 = new EngineSettingsGroup("PaymentDetails", jnicodeengineJNI.EngineSettingsGroup_PaymentDetails_get());
        PaymentDetails = engineSettingsGroup6;
        EngineSettingsGroup engineSettingsGroup7 = new EngineSettingsGroup("LicensePlate", jnicodeengineJNI.EngineSettingsGroup_LicensePlate_get());
        LicensePlate = engineSettingsGroup7;
        EngineSettingsGroup engineSettingsGroup8 = new EngineSettingsGroup("ShippingContainer", jnicodeengineJNI.EngineSettingsGroup_ShippingContainer_get());
        ShippingContainer = engineSettingsGroup8;
        EngineSettingsGroup engineSettingsGroup9 = new EngineSettingsGroup("RFID", jnicodeengineJNI.EngineSettingsGroup_RFID_get());
        RFID = engineSettingsGroup9;
        swigValues = new EngineSettingsGroup[]{engineSettingsGroup, engineSettingsGroup2, engineSettingsGroup3, engineSettingsGroup4, engineSettingsGroup5, engineSettingsGroup6, engineSettingsGroup7, engineSettingsGroup8, engineSettingsGroup9};
        swigNext = 0;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    public static EngineSettingsGroup swigToEnum(int i) {
        EngineSettingsGroup[] engineSettingsGroupArr = swigValues;
        if (i < engineSettingsGroupArr.length && i >= 0) {
            EngineSettingsGroup engineSettingsGroup = engineSettingsGroupArr[i];
            if (engineSettingsGroup.swigValue == i) {
                return engineSettingsGroup;
            }
        }
        int i2 = 0;
        while (true) {
            EngineSettingsGroup[] engineSettingsGroupArr2 = swigValues;
            if (i2 < engineSettingsGroupArr2.length) {
                EngineSettingsGroup engineSettingsGroup2 = engineSettingsGroupArr2[i2];
                if (engineSettingsGroup2.swigValue == i) {
                    return engineSettingsGroup2;
                }
                i2++;
            } else {
                throw new IllegalArgumentException("No enum " + EngineSettingsGroup.class + " with value " + i);
            }
        }
    }

    private EngineSettingsGroup(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    private EngineSettingsGroup(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private EngineSettingsGroup(String str, EngineSettingsGroup engineSettingsGroup) {
        this.swigName = str;
        int i = engineSettingsGroup.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
