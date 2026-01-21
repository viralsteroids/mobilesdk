package com.smartengines.p006id;

/* loaded from: classes3.dex */
public class IdFaceLivenessResult {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdFaceLivenessResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdFaceLivenessResult idFaceLivenessResult) {
        if (idFaceLivenessResult == null) {
            return 0L;
        }
        return idFaceLivenessResult.swigCPtr;
    }

    public static long swigRelease(IdFaceLivenessResult idFaceLivenessResult) {
        if (idFaceLivenessResult == null) {
            return 0L;
        }
        if (!idFaceLivenessResult.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idFaceLivenessResult.swigCPtr;
        idFaceLivenessResult.swigCMemOwn = false;
        idFaceLivenessResult.delete();
        return j;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                jniidengineJNI.delete_IdFaceLivenessResult(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdFaceLivenessResult(double d) {
        this(jniidengineJNI.new_IdFaceLivenessResult__SWIG_0(d), true);
    }

    public IdFaceLivenessResult() {
        this(jniidengineJNI.new_IdFaceLivenessResult__SWIG_1(), true);
    }

    public IdFaceLivenessResult(IdFaceLivenessResult idFaceLivenessResult) {
        this(jniidengineJNI.new_IdFaceLivenessResult__SWIG_2(getCPtr(idFaceLivenessResult), idFaceLivenessResult), true);
    }

    public double GetLivenessEstimation() {
        return jniidengineJNI.IdFaceLivenessResult_GetLivenessEstimation(this.swigCPtr, this);
    }

    public void SetLivenessEstimation(double d) {
        jniidengineJNI.IdFaceLivenessResult_SetLivenessEstimation(this.swigCPtr, this, d);
    }

    public String GetLivenessInstruction() {
        return jniidengineJNI.IdFaceLivenessResult_GetLivenessInstruction(this.swigCPtr, this);
    }

    public void SetLivenessInstruction(String str) {
        jniidengineJNI.IdFaceLivenessResult_SetLivenessInstruction(this.swigCPtr, this, str);
    }
}
