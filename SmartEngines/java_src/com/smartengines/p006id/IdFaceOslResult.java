package com.smartengines.p006id;

/* loaded from: classes3.dex */
public class IdFaceOslResult {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdFaceOslResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdFaceOslResult idFaceOslResult) {
        if (idFaceOslResult == null) {
            return 0L;
        }
        return idFaceOslResult.swigCPtr;
    }

    public static long swigRelease(IdFaceOslResult idFaceOslResult) {
        if (idFaceOslResult == null) {
            return 0L;
        }
        if (!idFaceOslResult.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idFaceOslResult.swigCPtr;
        idFaceOslResult.swigCMemOwn = false;
        idFaceOslResult.delete();
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
                jniidengineJNI.delete_IdFaceOslResult(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdFaceOslResult(boolean z, IdFaceOslVerdict idFaceOslVerdict) {
        this(jniidengineJNI.new_IdFaceOslResult__SWIG_0(z, idFaceOslVerdict.swigValue()), true);
    }

    public IdFaceOslResult(boolean z) {
        this(jniidengineJNI.new_IdFaceOslResult__SWIG_1(z), true);
    }

    public IdFaceOslResult() {
        this(jniidengineJNI.new_IdFaceOslResult__SWIG_2(), true);
    }

    public IdFaceOslResult(IdFaceOslResult idFaceOslResult) {
        this(jniidengineJNI.new_IdFaceOslResult__SWIG_3(getCPtr(idFaceOslResult), idFaceOslResult), true);
    }

    public boolean GetOSLEstimation() {
        return jniidengineJNI.IdFaceOslResult_GetOSLEstimation(this.swigCPtr, this);
    }

    public void SetOSLEstimation(boolean z) {
        jniidengineJNI.IdFaceOslResult_SetOSLEstimation(this.swigCPtr, this, z);
    }

    public IdFaceOslVerdict GetOSLVerdict() {
        return IdFaceOslVerdict.swigToEnum(jniidengineJNI.IdFaceOslResult_GetOSLVerdict(this.swigCPtr, this));
    }

    public void SetOSLVerdict(IdFaceOslVerdict idFaceOslVerdict) {
        jniidengineJNI.IdFaceOslResult_SetOSLVerdict(this.swigCPtr, this, idFaceOslVerdict.swigValue());
    }
}
