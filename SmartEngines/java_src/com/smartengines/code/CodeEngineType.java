package com.smartengines.code;

/* loaded from: classes3.dex */
public final class CodeEngineType {
    public static final CodeEngineType CodeEngine_BankCard;
    public static final CodeEngineType CodeEngine_Barcode;
    public static final CodeEngineType CodeEngine_CodeTextLine;
    public static final CodeEngineType CodeEngine_LicensePlate;
    public static final CodeEngineType CodeEngine_MRZ;
    public static final CodeEngineType CodeEngine_PaymentDetails;
    public static final CodeEngineType CodeEngine_RFID;
    public static final CodeEngineType CodeEngine_ShippingContainer;
    private static int swigNext;
    private static CodeEngineType[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        CodeEngineType codeEngineType = new CodeEngineType("CodeEngine_Barcode", jnicodeengineJNI.CodeEngine_Barcode_get());
        CodeEngine_Barcode = codeEngineType;
        CodeEngineType codeEngineType2 = new CodeEngineType("CodeEngine_CodeTextLine", jnicodeengineJNI.CodeEngine_CodeTextLine_get());
        CodeEngine_CodeTextLine = codeEngineType2;
        CodeEngineType codeEngineType3 = new CodeEngineType("CodeEngine_MRZ", jnicodeengineJNI.CodeEngine_MRZ_get());
        CodeEngine_MRZ = codeEngineType3;
        CodeEngineType codeEngineType4 = new CodeEngineType("CodeEngine_BankCard", jnicodeengineJNI.CodeEngine_BankCard_get());
        CodeEngine_BankCard = codeEngineType4;
        CodeEngineType codeEngineType5 = new CodeEngineType("CodeEngine_PaymentDetails", jnicodeengineJNI.CodeEngine_PaymentDetails_get());
        CodeEngine_PaymentDetails = codeEngineType5;
        CodeEngineType codeEngineType6 = new CodeEngineType("CodeEngine_LicensePlate", jnicodeengineJNI.CodeEngine_LicensePlate_get());
        CodeEngine_LicensePlate = codeEngineType6;
        CodeEngineType codeEngineType7 = new CodeEngineType("CodeEngine_ShippingContainer", jnicodeengineJNI.CodeEngine_ShippingContainer_get());
        CodeEngine_ShippingContainer = codeEngineType7;
        CodeEngineType codeEngineType8 = new CodeEngineType("CodeEngine_RFID", jnicodeengineJNI.CodeEngine_RFID_get());
        CodeEngine_RFID = codeEngineType8;
        swigValues = new CodeEngineType[]{codeEngineType, codeEngineType2, codeEngineType3, codeEngineType4, codeEngineType5, codeEngineType6, codeEngineType7, codeEngineType8};
        swigNext = 0;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    public static CodeEngineType swigToEnum(int i) {
        CodeEngineType[] codeEngineTypeArr = swigValues;
        if (i < codeEngineTypeArr.length && i >= 0) {
            CodeEngineType codeEngineType = codeEngineTypeArr[i];
            if (codeEngineType.swigValue == i) {
                return codeEngineType;
            }
        }
        int i2 = 0;
        while (true) {
            CodeEngineType[] codeEngineTypeArr2 = swigValues;
            if (i2 < codeEngineTypeArr2.length) {
                CodeEngineType codeEngineType2 = codeEngineTypeArr2[i2];
                if (codeEngineType2.swigValue == i) {
                    return codeEngineType2;
                }
                i2++;
            } else {
                throw new IllegalArgumentException("No enum " + CodeEngineType.class + " with value " + i);
            }
        }
    }

    private CodeEngineType(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    private CodeEngineType(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private CodeEngineType(String str, CodeEngineType codeEngineType) {
        this.swigName = str;
        int i = codeEngineType.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
