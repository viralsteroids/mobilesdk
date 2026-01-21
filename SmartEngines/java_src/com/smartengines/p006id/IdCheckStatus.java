package com.smartengines.p006id;

/* loaded from: classes3.dex */
public final class IdCheckStatus {
    public static final IdCheckStatus IdCheckStatus_Failed;
    public static final IdCheckStatus IdCheckStatus_Passed;
    public static final IdCheckStatus IdCheckStatus_Undefined;
    private static int swigNext;
    private static IdCheckStatus[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        IdCheckStatus idCheckStatus = new IdCheckStatus("IdCheckStatus_Undefined");
        IdCheckStatus_Undefined = idCheckStatus;
        IdCheckStatus idCheckStatus2 = new IdCheckStatus("IdCheckStatus_Passed");
        IdCheckStatus_Passed = idCheckStatus2;
        IdCheckStatus idCheckStatus3 = new IdCheckStatus("IdCheckStatus_Failed");
        IdCheckStatus_Failed = idCheckStatus3;
        swigValues = new IdCheckStatus[]{idCheckStatus, idCheckStatus2, idCheckStatus3};
        swigNext = 0;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    public static IdCheckStatus swigToEnum(int i) {
        IdCheckStatus[] idCheckStatusArr = swigValues;
        if (i < idCheckStatusArr.length && i >= 0) {
            IdCheckStatus idCheckStatus = idCheckStatusArr[i];
            if (idCheckStatus.swigValue == i) {
                return idCheckStatus;
            }
        }
        int i2 = 0;
        while (true) {
            IdCheckStatus[] idCheckStatusArr2 = swigValues;
            if (i2 < idCheckStatusArr2.length) {
                IdCheckStatus idCheckStatus2 = idCheckStatusArr2[i2];
                if (idCheckStatus2.swigValue == i) {
                    return idCheckStatus2;
                }
                i2++;
            } else {
                throw new IllegalArgumentException("No enum " + IdCheckStatus.class + " with value " + i);
            }
        }
    }

    private IdCheckStatus(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    private IdCheckStatus(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private IdCheckStatus(String str, IdCheckStatus idCheckStatus) {
        this.swigName = str;
        int i = idCheckStatus.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
