package com.smartengines.text;

import com.smartengines.common.Quadrangle;

/* loaded from: classes3.dex */
public class TextPageFeedback {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TextPageFeedback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(TextPageFeedback textPageFeedback) {
        if (textPageFeedback == null) {
            return 0L;
        }
        return textPageFeedback.swigCPtr;
    }

    public static long swigRelease(TextPageFeedback textPageFeedback) {
        if (textPageFeedback == null) {
            return 0L;
        }
        if (!textPageFeedback.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = textPageFeedback.swigCPtr;
        textPageFeedback.swigCMemOwn = false;
        textPageFeedback.delete();
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
                jnitextengineJNI.delete_TextPageFeedback(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public Quadrangle GetQuadrangle() {
        return new Quadrangle(jnitextengineJNI.TextPageFeedback_GetQuadrangle(this.swigCPtr, this), false);
    }

    public boolean IsPageRejected() {
        return jnitextengineJNI.TextPageFeedback_IsPageRejected(this.swigCPtr, this);
    }
}
