package com.smartengines.p006id;

/* loaded from: classes3.dex */
public final class IdFaceSimilarity {
    public static final IdFaceSimilarity Different;
    public static final IdFaceSimilarity Same;
    public static final IdFaceSimilarity Uncertain;
    private static int swigNext;
    private static IdFaceSimilarity[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        IdFaceSimilarity idFaceSimilarity = new IdFaceSimilarity("Different");
        Different = idFaceSimilarity;
        IdFaceSimilarity idFaceSimilarity2 = new IdFaceSimilarity("Uncertain");
        Uncertain = idFaceSimilarity2;
        IdFaceSimilarity idFaceSimilarity3 = new IdFaceSimilarity("Same");
        Same = idFaceSimilarity3;
        swigValues = new IdFaceSimilarity[]{idFaceSimilarity, idFaceSimilarity2, idFaceSimilarity3};
        swigNext = 0;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    public static IdFaceSimilarity swigToEnum(int i) {
        IdFaceSimilarity[] idFaceSimilarityArr = swigValues;
        if (i < idFaceSimilarityArr.length && i >= 0) {
            IdFaceSimilarity idFaceSimilarity = idFaceSimilarityArr[i];
            if (idFaceSimilarity.swigValue == i) {
                return idFaceSimilarity;
            }
        }
        int i2 = 0;
        while (true) {
            IdFaceSimilarity[] idFaceSimilarityArr2 = swigValues;
            if (i2 < idFaceSimilarityArr2.length) {
                IdFaceSimilarity idFaceSimilarity2 = idFaceSimilarityArr2[i2];
                if (idFaceSimilarity2.swigValue == i) {
                    return idFaceSimilarity2;
                }
                i2++;
            } else {
                throw new IllegalArgumentException("No enum " + IdFaceSimilarity.class + " with value " + i);
            }
        }
    }

    private IdFaceSimilarity(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    private IdFaceSimilarity(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private IdFaceSimilarity(String str, IdFaceSimilarity idFaceSimilarity) {
        this.swigName = str;
        int i = idFaceSimilarity.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
