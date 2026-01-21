package com.smartengines.p006id;

/* loaded from: classes3.dex */
public final class IdFieldType {
    public static final IdFieldType IdFieldType_Animated;
    public static final IdFieldType IdFieldType_Check;
    public static final IdFieldType IdFieldType_Image;
    public static final IdFieldType IdFieldType_Text;
    private static int swigNext;
    private static IdFieldType[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        IdFieldType idFieldType = new IdFieldType("IdFieldType_Text");
        IdFieldType_Text = idFieldType;
        IdFieldType idFieldType2 = new IdFieldType("IdFieldType_Image");
        IdFieldType_Image = idFieldType2;
        IdFieldType idFieldType3 = new IdFieldType("IdFieldType_Animated");
        IdFieldType_Animated = idFieldType3;
        IdFieldType idFieldType4 = new IdFieldType("IdFieldType_Check");
        IdFieldType_Check = idFieldType4;
        swigValues = new IdFieldType[]{idFieldType, idFieldType2, idFieldType3, idFieldType4};
        swigNext = 0;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    public static IdFieldType swigToEnum(int i) {
        IdFieldType[] idFieldTypeArr = swigValues;
        if (i < idFieldTypeArr.length && i >= 0) {
            IdFieldType idFieldType = idFieldTypeArr[i];
            if (idFieldType.swigValue == i) {
                return idFieldType;
            }
        }
        int i2 = 0;
        while (true) {
            IdFieldType[] idFieldTypeArr2 = swigValues;
            if (i2 < idFieldTypeArr2.length) {
                IdFieldType idFieldType2 = idFieldTypeArr2[i2];
                if (idFieldType2.swigValue == i) {
                    return idFieldType2;
                }
                i2++;
            } else {
                throw new IllegalArgumentException("No enum " + IdFieldType.class + " with value " + i);
            }
        }
    }

    private IdFieldType(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    private IdFieldType(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private IdFieldType(String str, IdFieldType idFieldType) {
        this.swigName = str;
        int i = idFieldType.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
