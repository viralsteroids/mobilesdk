package com.smartengines.p006id;

import com.smartengines.common.Quadrangle;
import com.smartengines.common.QuadranglesMapIterator;

/* loaded from: classes3.dex */
public class IdFeedbackContainer {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdFeedbackContainer(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdFeedbackContainer idFeedbackContainer) {
        if (idFeedbackContainer == null) {
            return 0L;
        }
        return idFeedbackContainer.swigCPtr;
    }

    public static long swigRelease(IdFeedbackContainer idFeedbackContainer) {
        if (idFeedbackContainer == null) {
            return 0L;
        }
        if (!idFeedbackContainer.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idFeedbackContainer.swigCPtr;
        idFeedbackContainer.swigCMemOwn = false;
        idFeedbackContainer.delete();
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
                jniidengineJNI.delete_IdFeedbackContainer(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdFeedbackContainer() {
        this(jniidengineJNI.new_IdFeedbackContainer__SWIG_0(), true);
    }

    public IdFeedbackContainer(IdFeedbackContainer idFeedbackContainer) {
        this(jniidengineJNI.new_IdFeedbackContainer__SWIG_1(getCPtr(idFeedbackContainer), idFeedbackContainer), true);
    }

    public int GetQuadranglesCount() {
        return jniidengineJNI.IdFeedbackContainer_GetQuadranglesCount(this.swigCPtr, this);
    }

    public boolean HasQuadrangle(String str) {
        return jniidengineJNI.IdFeedbackContainer_HasQuadrangle(this.swigCPtr, this, str);
    }

    public Quadrangle GetQuadrangle(String str) {
        return new Quadrangle(jniidengineJNI.IdFeedbackContainer_GetQuadrangle(this.swigCPtr, this, str), false);
    }

    public void SetQuadrangle(String str, Quadrangle quadrangle) {
        jniidengineJNI.IdFeedbackContainer_SetQuadrangle(this.swigCPtr, this, str, Quadrangle.getCPtr(quadrangle), quadrangle);
    }

    public void RemoveQuadrangle(String str) {
        jniidengineJNI.IdFeedbackContainer_RemoveQuadrangle(this.swigCPtr, this, str);
    }

    public QuadranglesMapIterator QuadranglesBegin() {
        return new QuadranglesMapIterator(jniidengineJNI.IdFeedbackContainer_QuadranglesBegin(this.swigCPtr, this), true);
    }

    public QuadranglesMapIterator QuadranglesEnd() {
        return new QuadranglesMapIterator(jniidengineJNI.IdFeedbackContainer_QuadranglesEnd(this.swigCPtr, this), true);
    }
}
