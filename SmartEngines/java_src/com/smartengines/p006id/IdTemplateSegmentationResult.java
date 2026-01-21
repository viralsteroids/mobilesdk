package com.smartengines.p006id;

import com.smartengines.common.Quadrangle;
import com.smartengines.common.QuadranglesMapIterator;

/* loaded from: classes3.dex */
public class IdTemplateSegmentationResult {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdTemplateSegmentationResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdTemplateSegmentationResult idTemplateSegmentationResult) {
        if (idTemplateSegmentationResult == null) {
            return 0L;
        }
        return idTemplateSegmentationResult.swigCPtr;
    }

    public static long swigRelease(IdTemplateSegmentationResult idTemplateSegmentationResult) {
        if (idTemplateSegmentationResult == null) {
            return 0L;
        }
        if (!idTemplateSegmentationResult.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idTemplateSegmentationResult.swigCPtr;
        idTemplateSegmentationResult.swigCMemOwn = false;
        idTemplateSegmentationResult.delete();
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
                jniidengineJNI.delete_IdTemplateSegmentationResult(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdTemplateSegmentationResult(boolean z, double d) {
        this(jniidengineJNI.new_IdTemplateSegmentationResult__SWIG_0(z, d), true);
    }

    public IdTemplateSegmentationResult(boolean z) {
        this(jniidengineJNI.new_IdTemplateSegmentationResult__SWIG_1(z), true);
    }

    public IdTemplateSegmentationResult() {
        this(jniidengineJNI.new_IdTemplateSegmentationResult__SWIG_2(), true);
    }

    public IdTemplateSegmentationResult(IdTemplateSegmentationResult idTemplateSegmentationResult) {
        this(jniidengineJNI.new_IdTemplateSegmentationResult__SWIG_3(getCPtr(idTemplateSegmentationResult), idTemplateSegmentationResult), true);
    }

    public boolean GetIsAccepted() {
        return jniidengineJNI.IdTemplateSegmentationResult_GetIsAccepted(this.swigCPtr, this);
    }

    public void SetIsAccepted(boolean z) {
        jniidengineJNI.IdTemplateSegmentationResult_SetIsAccepted(this.swigCPtr, this, z);
    }

    public double GetConfidence() {
        return jniidengineJNI.IdTemplateSegmentationResult_GetConfidence(this.swigCPtr, this);
    }

    public void SetConfidence(double d) {
        jniidengineJNI.IdTemplateSegmentationResult_SetConfidence(this.swigCPtr, this, d);
    }

    public int GetRawFieldsCount() {
        return jniidengineJNI.IdTemplateSegmentationResult_GetRawFieldsCount(this.swigCPtr, this);
    }

    public boolean HasRawField(String str) {
        return jniidengineJNI.IdTemplateSegmentationResult_HasRawField(this.swigCPtr, this, str);
    }

    public Quadrangle GetRawFieldQuadrangle(String str) {
        return new Quadrangle(jniidengineJNI.IdTemplateSegmentationResult_GetRawFieldQuadrangle(this.swigCPtr, this, str), false);
    }

    public Quadrangle GetRawFieldTemplateQuadrangle(String str) {
        return new Quadrangle(jniidengineJNI.IdTemplateSegmentationResult_GetRawFieldTemplateQuadrangle(this.swigCPtr, this, str), false);
    }

    public void SetRawFieldQuadrangles(String str, Quadrangle quadrangle, Quadrangle quadrangle2) {
        jniidengineJNI.IdTemplateSegmentationResult_SetRawFieldQuadrangles(this.swigCPtr, this, str, Quadrangle.getCPtr(quadrangle), quadrangle, Quadrangle.getCPtr(quadrangle2), quadrangle2);
    }

    public void RemoveRawField(String str) {
        jniidengineJNI.IdTemplateSegmentationResult_RemoveRawField(this.swigCPtr, this, str);
    }

    public QuadranglesMapIterator RawFieldQuadranglesBegin() {
        return new QuadranglesMapIterator(jniidengineJNI.IdTemplateSegmentationResult_RawFieldQuadranglesBegin(this.swigCPtr, this), true);
    }

    public QuadranglesMapIterator RawFieldQuadranglesEnd() {
        return new QuadranglesMapIterator(jniidengineJNI.IdTemplateSegmentationResult_RawFieldQuadranglesEnd(this.swigCPtr, this), true);
    }

    public QuadranglesMapIterator RawFieldTemplateQuadranglesBegin() {
        return new QuadranglesMapIterator(jniidengineJNI.IdTemplateSegmentationResult_RawFieldTemplateQuadranglesBegin(this.swigCPtr, this), true);
    }

    public QuadranglesMapIterator RawFieldTemplateQuadranglesEnd() {
        return new QuadranglesMapIterator(jniidengineJNI.IdTemplateSegmentationResult_RawFieldTemplateQuadranglesEnd(this.swigCPtr, this), true);
    }
}
