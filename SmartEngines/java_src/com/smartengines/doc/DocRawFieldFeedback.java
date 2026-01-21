package com.smartengines.doc;

import com.smartengines.common.OcrString;
import com.smartengines.common.Quadrangle;

/* loaded from: classes3.dex */
public class DocRawFieldFeedback {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocRawFieldFeedback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocRawFieldFeedback docRawFieldFeedback) {
        if (docRawFieldFeedback == null) {
            return 0L;
        }
        return docRawFieldFeedback.swigCPtr;
    }

    public static long swigRelease(DocRawFieldFeedback docRawFieldFeedback) {
        if (docRawFieldFeedback == null) {
            return 0L;
        }
        if (!docRawFieldFeedback.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docRawFieldFeedback.swigCPtr;
        docRawFieldFeedback.swigCMemOwn = false;
        docRawFieldFeedback.delete();
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
                jnidocengineJNI.delete_DocRawFieldFeedback(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String GetName() {
        return jnidocengineJNI.DocRawFieldFeedback_GetName(this.swigCPtr, this);
    }

    public boolean HasQuadrangle() {
        return jnidocengineJNI.DocRawFieldFeedback_HasQuadrangle(this.swigCPtr, this);
    }

    public Quadrangle GetQuadrangle() {
        return new Quadrangle(jnidocengineJNI.DocRawFieldFeedback_GetQuadrangle(this.swigCPtr, this), false);
    }

    public String GetType() {
        return jnidocengineJNI.DocRawFieldFeedback_GetType(this.swigCPtr, this);
    }

    public OcrString GetOcrString() {
        return new OcrString(jnidocengineJNI.DocRawFieldFeedback_GetOcrString(this.swigCPtr, this), true);
    }
}
