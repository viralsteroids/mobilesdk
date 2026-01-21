package com.smartengines.common;

/* loaded from: classes3.dex */
public final class YUVType {
    public static final YUVType YUVTYPE_420_888;
    public static final YUVType YUVTYPE_NV21;
    public static final YUVType YUVTYPE_UNDEFINED;
    private static int swigNext;
    private static YUVType[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        YUVType yUVType = new YUVType("YUVTYPE_UNDEFINED", jnisecommonJNI.YUVTYPE_UNDEFINED_get());
        YUVTYPE_UNDEFINED = yUVType;
        YUVType yUVType2 = new YUVType("YUVTYPE_NV21", jnisecommonJNI.YUVTYPE_NV21_get());
        YUVTYPE_NV21 = yUVType2;
        YUVType yUVType3 = new YUVType("YUVTYPE_420_888", jnisecommonJNI.YUVTYPE_420_888_get());
        YUVTYPE_420_888 = yUVType3;
        swigValues = new YUVType[]{yUVType, yUVType2, yUVType3};
        swigNext = 0;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    public static YUVType swigToEnum(int i) {
        YUVType[] yUVTypeArr = swigValues;
        if (i < yUVTypeArr.length && i >= 0) {
            YUVType yUVType = yUVTypeArr[i];
            if (yUVType.swigValue == i) {
                return yUVType;
            }
        }
        int i2 = 0;
        while (true) {
            YUVType[] yUVTypeArr2 = swigValues;
            if (i2 < yUVTypeArr2.length) {
                YUVType yUVType2 = yUVTypeArr2[i2];
                if (yUVType2.swigValue == i) {
                    return yUVType2;
                }
                i2++;
            } else {
                throw new IllegalArgumentException("No enum " + YUVType.class + " with value " + i);
            }
        }
    }

    private YUVType(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    private YUVType(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private YUVType(String str, YUVType yUVType) {
        this.swigName = str;
        int i = yUVType.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
