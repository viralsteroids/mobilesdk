package com.smartengines.p006id;

import com.smartengines.common.Quadrangle;
import com.smartengines.common.Size;
import com.smartengines.common.StringsMapIterator;

/* loaded from: classes3.dex */
public class IdTemplateDetectionResult {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdTemplateDetectionResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdTemplateDetectionResult idTemplateDetectionResult) {
        if (idTemplateDetectionResult == null) {
            return 0L;
        }
        return idTemplateDetectionResult.swigCPtr;
    }

    public static long swigRelease(IdTemplateDetectionResult idTemplateDetectionResult) {
        if (idTemplateDetectionResult == null) {
            return 0L;
        }
        if (!idTemplateDetectionResult.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idTemplateDetectionResult.swigCPtr;
        idTemplateDetectionResult.swigCMemOwn = false;
        idTemplateDetectionResult.delete();
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
                jniidengineJNI.delete_IdTemplateDetectionResult(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdTemplateDetectionResult(String str, Quadrangle quadrangle, boolean z, double d, Size size) {
        this(jniidengineJNI.new_IdTemplateDetectionResult__SWIG_0(str, Quadrangle.getCPtr(quadrangle), quadrangle, z, d, Size.getCPtr(size), size), true);
    }

    public IdTemplateDetectionResult(String str, Quadrangle quadrangle, boolean z, double d) {
        this(jniidengineJNI.new_IdTemplateDetectionResult__SWIG_1(str, Quadrangle.getCPtr(quadrangle), quadrangle, z, d), true);
    }

    public IdTemplateDetectionResult(String str, Quadrangle quadrangle, boolean z) {
        this(jniidengineJNI.new_IdTemplateDetectionResult__SWIG_2(str, Quadrangle.getCPtr(quadrangle), quadrangle, z), true);
    }

    public IdTemplateDetectionResult(String str, Quadrangle quadrangle) {
        this(jniidengineJNI.new_IdTemplateDetectionResult__SWIG_3(str, Quadrangle.getCPtr(quadrangle), quadrangle), true);
    }

    public IdTemplateDetectionResult(IdTemplateDetectionResult idTemplateDetectionResult) {
        this(jniidengineJNI.new_IdTemplateDetectionResult__SWIG_4(getCPtr(idTemplateDetectionResult), idTemplateDetectionResult), true);
    }

    public String GetTemplateName() {
        return jniidengineJNI.IdTemplateDetectionResult_GetTemplateName(this.swigCPtr, this);
    }

    public void SetTemplateName(String str) {
        jniidengineJNI.IdTemplateDetectionResult_SetTemplateName(this.swigCPtr, this, str);
    }

    public Quadrangle GetQuadrangle() {
        return new Quadrangle(jniidengineJNI.IdTemplateDetectionResult_GetQuadrangle(this.swigCPtr, this), false);
    }

    public void SetQuadrangle(Quadrangle quadrangle) {
        jniidengineJNI.IdTemplateDetectionResult_SetQuadrangle(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle);
    }

    public boolean GetIsAccepted() {
        return jniidengineJNI.IdTemplateDetectionResult_GetIsAccepted(this.swigCPtr, this);
    }

    public void SetIsAccepted(boolean z) {
        jniidengineJNI.IdTemplateDetectionResult_SetIsAccepted(this.swigCPtr, this, z);
    }

    public double GetConfidence() {
        return jniidengineJNI.IdTemplateDetectionResult_GetConfidence(this.swigCPtr, this);
    }

    public void SetConfidence(double d) {
        jniidengineJNI.IdTemplateDetectionResult_SetConfidence(this.swigCPtr, this, d);
    }

    public Size GetStandardSize() {
        return new Size(jniidengineJNI.IdTemplateDetectionResult_GetStandardSize(this.swigCPtr, this), false);
    }

    public void SetStandardSize(Size size) {
        jniidengineJNI.IdTemplateDetectionResult_SetStandardSize(this.swigCPtr, this, Size.getCPtr(size), size);
    }

    public int GetAttributesCount() {
        return jniidengineJNI.IdTemplateDetectionResult_GetAttributesCount(this.swigCPtr, this);
    }

    public String GetAttribute(String str) {
        return jniidengineJNI.IdTemplateDetectionResult_GetAttribute(this.swigCPtr, this, str);
    }

    public boolean HasAttribute(String str) {
        return jniidengineJNI.IdTemplateDetectionResult_HasAttribute(this.swigCPtr, this, str);
    }

    public void SetAttribute(String str, String str2) {
        jniidengineJNI.IdTemplateDetectionResult_SetAttribute(this.swigCPtr, this, str, str2);
    }

    public void RemoveAttribute(String str) {
        jniidengineJNI.IdTemplateDetectionResult_RemoveAttribute(this.swigCPtr, this, str);
    }

    public StringsMapIterator AttributesBegin() {
        return new StringsMapIterator(jniidengineJNI.IdTemplateDetectionResult_AttributesBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator AttributesEnd() {
        return new StringsMapIterator(jniidengineJNI.IdTemplateDetectionResult_AttributesEnd(this.swigCPtr, this), true);
    }
}
