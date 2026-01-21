package com.smartengines.p006id;

/* loaded from: classes3.dex */
public class IdFaceSimilarityResult {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdFaceSimilarityResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdFaceSimilarityResult idFaceSimilarityResult) {
        if (idFaceSimilarityResult == null) {
            return 0L;
        }
        return idFaceSimilarityResult.swigCPtr;
    }

    public static long swigRelease(IdFaceSimilarityResult idFaceSimilarityResult) {
        if (idFaceSimilarityResult == null) {
            return 0L;
        }
        if (!idFaceSimilarityResult.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idFaceSimilarityResult.swigCPtr;
        idFaceSimilarityResult.swigCMemOwn = false;
        idFaceSimilarityResult.delete();
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
                jniidengineJNI.delete_IdFaceSimilarityResult(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdFaceSimilarityResult(double d, IdFaceStatus idFaceStatus) {
        this(jniidengineJNI.new_IdFaceSimilarityResult__SWIG_0(d, idFaceStatus.swigValue()), true);
    }

    public IdFaceSimilarityResult(double d) {
        this(jniidengineJNI.new_IdFaceSimilarityResult__SWIG_1(d), true);
    }

    public IdFaceSimilarityResult() {
        this(jniidengineJNI.new_IdFaceSimilarityResult__SWIG_2(), true);
    }

    public IdFaceSimilarityResult(IdFaceSimilarityResult idFaceSimilarityResult) {
        this(jniidengineJNI.new_IdFaceSimilarityResult__SWIG_3(getCPtr(idFaceSimilarityResult), idFaceSimilarityResult), true);
    }

    public double GetSimilarityEstimation() {
        return jniidengineJNI.IdFaceSimilarityResult_GetSimilarityEstimation(this.swigCPtr, this);
    }

    public void SetSimilarityEstimation(double d) {
        jniidengineJNI.IdFaceSimilarityResult_SetSimilarityEstimation(this.swigCPtr, this, d);
    }

    public IdFaceStatus GetStatus() {
        return IdFaceStatus.swigToEnum(jniidengineJNI.IdFaceSimilarityResult_GetStatus(this.swigCPtr, this));
    }

    public void SetStatus(IdFaceStatus idFaceStatus) {
        jniidengineJNI.IdFaceSimilarityResult_SetStatus(this.swigCPtr, this, idFaceStatus.swigValue());
    }

    public IdFaceSimilarity GetSimilarity() {
        return IdFaceSimilarity.swigToEnum(jniidengineJNI.IdFaceSimilarityResult_GetSimilarity(this.swigCPtr, this));
    }
}
