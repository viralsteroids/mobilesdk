package com.smartengines.p006id;

/* loaded from: classes3.dex */
public final class IdFaceStatus {
    public static final IdFaceStatus IdFaceStatus_A_FaceNotFound;
    public static final IdFaceStatus IdFaceStatus_B_FaceNotFound;
    public static final IdFaceStatus IdFaceStatus_FaceNotFound;
    public static final IdFaceStatus IdFaceStatus_NoAccumulatedResult;
    public static final IdFaceStatus IdFaceStatus_NotUsed;
    public static final IdFaceStatus IdFaceStatus_Success;
    private static int swigNext;
    private static IdFaceStatus[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        IdFaceStatus idFaceStatus = new IdFaceStatus("IdFaceStatus_NotUsed");
        IdFaceStatus_NotUsed = idFaceStatus;
        IdFaceStatus idFaceStatus2 = new IdFaceStatus("IdFaceStatus_Success");
        IdFaceStatus_Success = idFaceStatus2;
        IdFaceStatus idFaceStatus3 = new IdFaceStatus("IdFaceStatus_A_FaceNotFound");
        IdFaceStatus_A_FaceNotFound = idFaceStatus3;
        IdFaceStatus idFaceStatus4 = new IdFaceStatus("IdFaceStatus_B_FaceNotFound");
        IdFaceStatus_B_FaceNotFound = idFaceStatus4;
        IdFaceStatus idFaceStatus5 = new IdFaceStatus("IdFaceStatus_FaceNotFound");
        IdFaceStatus_FaceNotFound = idFaceStatus5;
        IdFaceStatus idFaceStatus6 = new IdFaceStatus("IdFaceStatus_NoAccumulatedResult");
        IdFaceStatus_NoAccumulatedResult = idFaceStatus6;
        swigValues = new IdFaceStatus[]{idFaceStatus, idFaceStatus2, idFaceStatus3, idFaceStatus4, idFaceStatus5, idFaceStatus6};
        swigNext = 0;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    public static IdFaceStatus swigToEnum(int i) {
        IdFaceStatus[] idFaceStatusArr = swigValues;
        if (i < idFaceStatusArr.length && i >= 0) {
            IdFaceStatus idFaceStatus = idFaceStatusArr[i];
            if (idFaceStatus.swigValue == i) {
                return idFaceStatus;
            }
        }
        int i2 = 0;
        while (true) {
            IdFaceStatus[] idFaceStatusArr2 = swigValues;
            if (i2 < idFaceStatusArr2.length) {
                IdFaceStatus idFaceStatus2 = idFaceStatusArr2[i2];
                if (idFaceStatus2.swigValue == i) {
                    return idFaceStatus2;
                }
                i2++;
            } else {
                throw new IllegalArgumentException("No enum " + IdFaceStatus.class + " with value " + i);
            }
        }
    }

    private IdFaceStatus(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    private IdFaceStatus(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private IdFaceStatus(String str, IdFaceStatus idFaceStatus) {
        this.swigName = str;
        int i = idFaceStatus.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
