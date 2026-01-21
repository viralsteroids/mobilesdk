package com.smartengines.code;

/* loaded from: classes3.dex */
public final class BarcodePreset {
    public static final BarcodePreset AAMVA;
    public static final BarcodePreset EMAIL;
    public static final BarcodePreset GEO;
    public static final BarcodePreset GS1;
    public static final BarcodePreset ICALENDAR;
    public static final BarcodePreset ISBN;
    public static final BarcodePreset NONE;
    public static final BarcodePreset PAYMENT;
    public static final BarcodePreset PHONE;
    public static final BarcodePreset SMS;
    public static final BarcodePreset URL;
    public static final BarcodePreset VCARD;
    public static final BarcodePreset WIFI;
    private static int swigNext;
    private static BarcodePreset[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        BarcodePreset barcodePreset = new BarcodePreset("GS1", jnicodeengineJNI.BarcodePreset_GS1_get());
        GS1 = barcodePreset;
        BarcodePreset barcodePreset2 = new BarcodePreset("AAMVA", jnicodeengineJNI.BarcodePreset_AAMVA_get());
        AAMVA = barcodePreset2;
        BarcodePreset barcodePreset3 = new BarcodePreset("URL", jnicodeengineJNI.BarcodePreset_URL_get());
        URL = barcodePreset3;
        BarcodePreset barcodePreset4 = new BarcodePreset("VCARD", jnicodeengineJNI.BarcodePreset_VCARD_get());
        VCARD = barcodePreset4;
        BarcodePreset barcodePreset5 = new BarcodePreset("EMAIL", jnicodeengineJNI.BarcodePreset_EMAIL_get());
        EMAIL = barcodePreset5;
        BarcodePreset barcodePreset6 = new BarcodePreset("ICALENDAR", jnicodeengineJNI.BarcodePreset_ICALENDAR_get());
        ICALENDAR = barcodePreset6;
        BarcodePreset barcodePreset7 = new BarcodePreset("PHONE", jnicodeengineJNI.BarcodePreset_PHONE_get());
        PHONE = barcodePreset7;
        BarcodePreset barcodePreset8 = new BarcodePreset("SMS", jnicodeengineJNI.BarcodePreset_SMS_get());
        SMS = barcodePreset8;
        BarcodePreset barcodePreset9 = new BarcodePreset("ISBN", jnicodeengineJNI.BarcodePreset_ISBN_get());
        ISBN = barcodePreset9;
        BarcodePreset barcodePreset10 = new BarcodePreset("WIFI", jnicodeengineJNI.BarcodePreset_WIFI_get());
        WIFI = barcodePreset10;
        BarcodePreset barcodePreset11 = new BarcodePreset("GEO", jnicodeengineJNI.BarcodePreset_GEO_get());
        GEO = barcodePreset11;
        BarcodePreset barcodePreset12 = new BarcodePreset("PAYMENT", jnicodeengineJNI.BarcodePreset_PAYMENT_get());
        PAYMENT = barcodePreset12;
        BarcodePreset barcodePreset13 = new BarcodePreset("NONE", jnicodeengineJNI.BarcodePreset_NONE_get());
        NONE = barcodePreset13;
        swigValues = new BarcodePreset[]{barcodePreset, barcodePreset2, barcodePreset3, barcodePreset4, barcodePreset5, barcodePreset6, barcodePreset7, barcodePreset8, barcodePreset9, barcodePreset10, barcodePreset11, barcodePreset12, barcodePreset13};
        swigNext = 0;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    public static BarcodePreset swigToEnum(int i) {
        BarcodePreset[] barcodePresetArr = swigValues;
        if (i < barcodePresetArr.length && i >= 0) {
            BarcodePreset barcodePreset = barcodePresetArr[i];
            if (barcodePreset.swigValue == i) {
                return barcodePreset;
            }
        }
        int i2 = 0;
        while (true) {
            BarcodePreset[] barcodePresetArr2 = swigValues;
            if (i2 < barcodePresetArr2.length) {
                BarcodePreset barcodePreset2 = barcodePresetArr2[i2];
                if (barcodePreset2.swigValue == i) {
                    return barcodePreset2;
                }
                i2++;
            } else {
                throw new IllegalArgumentException("No enum " + BarcodePreset.class + " with value " + i);
            }
        }
    }

    private BarcodePreset(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    private BarcodePreset(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private BarcodePreset(String str, BarcodePreset barcodePreset) {
        this.swigName = str;
        int i = barcodePreset.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
