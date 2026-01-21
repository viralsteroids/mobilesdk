package com.smartengines.code;

/* loaded from: classes3.dex */
public final class CodeObjectType {
    public static final CodeObjectType CodeObject_BankCard;
    public static final CodeObjectType CodeObject_CodeTextLine;
    public static final CodeObjectType CodeObject_Container;
    public static final CodeObjectType CodeObject_Face;
    public static final CodeObjectType CodeObject_LinearBarcode;
    public static final CodeObjectType CodeObject_MRZ;
    public static final CodeObjectType CodeObject_MatrixBarcode;
    public static final CodeObjectType CodeObject_PaymentDetails;
    public static final CodeObjectType CodeObject_RFID;
    private static int swigNext;
    private static CodeObjectType[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        CodeObjectType codeObjectType = new CodeObjectType("CodeObject_LinearBarcode", jnicodeengineJNI.CodeObject_LinearBarcode_get());
        CodeObject_LinearBarcode = codeObjectType;
        CodeObjectType codeObjectType2 = new CodeObjectType("CodeObject_MatrixBarcode", jnicodeengineJNI.CodeObject_MatrixBarcode_get());
        CodeObject_MatrixBarcode = codeObjectType2;
        CodeObjectType codeObjectType3 = new CodeObjectType("CodeObject_CodeTextLine", jnicodeengineJNI.CodeObject_CodeTextLine_get());
        CodeObject_CodeTextLine = codeObjectType3;
        CodeObjectType codeObjectType4 = new CodeObjectType("CodeObject_MRZ", jnicodeengineJNI.CodeObject_MRZ_get());
        CodeObject_MRZ = codeObjectType4;
        CodeObjectType codeObjectType5 = new CodeObjectType("CodeObject_BankCard", jnicodeengineJNI.CodeObject_BankCard_get());
        CodeObject_BankCard = codeObjectType5;
        CodeObjectType codeObjectType6 = new CodeObjectType("CodeObject_PaymentDetails", jnicodeengineJNI.CodeObject_PaymentDetails_get());
        CodeObject_PaymentDetails = codeObjectType6;
        CodeObjectType codeObjectType7 = new CodeObjectType("CodeObject_Face", jnicodeengineJNI.CodeObject_Face_get());
        CodeObject_Face = codeObjectType7;
        CodeObjectType codeObjectType8 = new CodeObjectType("CodeObject_Container", jnicodeengineJNI.CodeObject_Container_get());
        CodeObject_Container = codeObjectType8;
        CodeObjectType codeObjectType9 = new CodeObjectType("CodeObject_RFID", jnicodeengineJNI.CodeObject_RFID_get());
        CodeObject_RFID = codeObjectType9;
        swigValues = new CodeObjectType[]{codeObjectType, codeObjectType2, codeObjectType3, codeObjectType4, codeObjectType5, codeObjectType6, codeObjectType7, codeObjectType8, codeObjectType9};
        swigNext = 0;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    public static CodeObjectType swigToEnum(int i) {
        CodeObjectType[] codeObjectTypeArr = swigValues;
        if (i < codeObjectTypeArr.length && i >= 0) {
            CodeObjectType codeObjectType = codeObjectTypeArr[i];
            if (codeObjectType.swigValue == i) {
                return codeObjectType;
            }
        }
        int i2 = 0;
        while (true) {
            CodeObjectType[] codeObjectTypeArr2 = swigValues;
            if (i2 < codeObjectTypeArr2.length) {
                CodeObjectType codeObjectType2 = codeObjectTypeArr2[i2];
                if (codeObjectType2.swigValue == i) {
                    return codeObjectType2;
                }
                i2++;
            } else {
                throw new IllegalArgumentException("No enum " + CodeObjectType.class + " with value " + i);
            }
        }
    }

    private CodeObjectType(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    private CodeObjectType(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private CodeObjectType(String str, CodeObjectType codeObjectType) {
        this.swigName = str;
        int i = codeObjectType.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
