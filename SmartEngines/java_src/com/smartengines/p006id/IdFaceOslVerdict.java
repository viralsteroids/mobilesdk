package com.smartengines.p006id;

/* loaded from: classes3.dex */
public final class IdFaceOslVerdict {
    public static final IdFaceOslVerdict DifferentFaces;
    public static final IdFaceOslVerdict NoFace;
    public static final IdFaceOslVerdict NoKeyKeypoint;
    public static final IdFaceOslVerdict None;
    public static final IdFaceOslVerdict PoorQualityImage;
    public static final IdFaceOslVerdict ScreenRecaptured;
    private static int swigNext;
    private static IdFaceOslVerdict[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        IdFaceOslVerdict idFaceOslVerdict = new IdFaceOslVerdict("None");
        None = idFaceOslVerdict;
        IdFaceOslVerdict idFaceOslVerdict2 = new IdFaceOslVerdict("NoFace");
        NoFace = idFaceOslVerdict2;
        IdFaceOslVerdict idFaceOslVerdict3 = new IdFaceOslVerdict("NoKeyKeypoint");
        NoKeyKeypoint = idFaceOslVerdict3;
        IdFaceOslVerdict idFaceOslVerdict4 = new IdFaceOslVerdict("ScreenRecaptured");
        ScreenRecaptured = idFaceOslVerdict4;
        IdFaceOslVerdict idFaceOslVerdict5 = new IdFaceOslVerdict("DifferentFaces");
        DifferentFaces = idFaceOslVerdict5;
        IdFaceOslVerdict idFaceOslVerdict6 = new IdFaceOslVerdict("PoorQualityImage");
        PoorQualityImage = idFaceOslVerdict6;
        swigValues = new IdFaceOslVerdict[]{idFaceOslVerdict, idFaceOslVerdict2, idFaceOslVerdict3, idFaceOslVerdict4, idFaceOslVerdict5, idFaceOslVerdict6};
        swigNext = 0;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    public static IdFaceOslVerdict swigToEnum(int i) {
        IdFaceOslVerdict[] idFaceOslVerdictArr = swigValues;
        if (i < idFaceOslVerdictArr.length && i >= 0) {
            IdFaceOslVerdict idFaceOslVerdict = idFaceOslVerdictArr[i];
            if (idFaceOslVerdict.swigValue == i) {
                return idFaceOslVerdict;
            }
        }
        int i2 = 0;
        while (true) {
            IdFaceOslVerdict[] idFaceOslVerdictArr2 = swigValues;
            if (i2 < idFaceOslVerdictArr2.length) {
                IdFaceOslVerdict idFaceOslVerdict2 = idFaceOslVerdictArr2[i2];
                if (idFaceOslVerdict2.swigValue == i) {
                    return idFaceOslVerdict2;
                }
                i2++;
            } else {
                throw new IllegalArgumentException("No enum " + IdFaceOslVerdict.class + " with value " + i);
            }
        }
    }

    private IdFaceOslVerdict(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    private IdFaceOslVerdict(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private IdFaceOslVerdict(String str, IdFaceOslVerdict idFaceOslVerdict) {
        this.swigName = str;
        int i = idFaceOslVerdict.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
