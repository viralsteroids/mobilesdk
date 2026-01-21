package com.smartengines.code;

import com.smartengines.common.Quadrangle;
import com.smartengines.common.QuadranglesMapIterator;

/* loaded from: classes3.dex */
public class CodeEngineFeedbackContainer {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CodeEngineFeedbackContainer(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(CodeEngineFeedbackContainer codeEngineFeedbackContainer) {
        if (codeEngineFeedbackContainer == null) {
            return 0L;
        }
        return codeEngineFeedbackContainer.swigCPtr;
    }

    public static long swigRelease(CodeEngineFeedbackContainer codeEngineFeedbackContainer) {
        if (codeEngineFeedbackContainer == null) {
            return 0L;
        }
        if (!codeEngineFeedbackContainer.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = codeEngineFeedbackContainer.swigCPtr;
        codeEngineFeedbackContainer.swigCMemOwn = false;
        codeEngineFeedbackContainer.delete();
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
                jnicodeengineJNI.delete_CodeEngineFeedbackContainer(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public CodeEngineFeedbackContainer() {
        this(jnicodeengineJNI.new_CodeEngineFeedbackContainer__SWIG_0(), true);
    }

    public CodeEngineFeedbackContainer(CodeEngineFeedbackContainer codeEngineFeedbackContainer) {
        this(jnicodeengineJNI.new_CodeEngineFeedbackContainer__SWIG_1(getCPtr(codeEngineFeedbackContainer), codeEngineFeedbackContainer), true);
    }

    public int GetQuadranglesCount() {
        return jnicodeengineJNI.CodeEngineFeedbackContainer_GetQuadranglesCount(this.swigCPtr, this);
    }

    public boolean HasQuadrangle(String str) {
        return jnicodeengineJNI.CodeEngineFeedbackContainer_HasQuadrangle(this.swigCPtr, this, str);
    }

    public Quadrangle GetQuadrangle(String str) {
        return new Quadrangle(jnicodeengineJNI.CodeEngineFeedbackContainer_GetQuadrangle(this.swigCPtr, this, str), false);
    }

    public void SetQuadrangle(String str, Quadrangle quadrangle) {
        jnicodeengineJNI.CodeEngineFeedbackContainer_SetQuadrangle(this.swigCPtr, this, str, Quadrangle.getCPtr(quadrangle), quadrangle);
    }

    public void RemoveQuadrangle(String str) {
        jnicodeengineJNI.CodeEngineFeedbackContainer_RemoveQuadrangle(this.swigCPtr, this, str);
    }

    public QuadranglesMapIterator QuadranglesBegin() {
        return new QuadranglesMapIterator(jnicodeengineJNI.CodeEngineFeedbackContainer_QuadranglesBegin(this.swigCPtr, this), true);
    }

    public QuadranglesMapIterator QuadranglesEnd() {
        return new QuadranglesMapIterator(jnicodeengineJNI.CodeEngineFeedbackContainer_QuadranglesEnd(this.swigCPtr, this), true);
    }
}
