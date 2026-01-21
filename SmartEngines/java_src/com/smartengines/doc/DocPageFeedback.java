package com.smartengines.doc;

import com.smartengines.common.Quadrangle;

/* loaded from: classes3.dex */
public class DocPageFeedback {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocPageFeedback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocPageFeedback docPageFeedback) {
        if (docPageFeedback == null) {
            return 0L;
        }
        return docPageFeedback.swigCPtr;
    }

    public static long swigRelease(DocPageFeedback docPageFeedback) {
        if (docPageFeedback == null) {
            return 0L;
        }
        if (!docPageFeedback.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docPageFeedback.swigCPtr;
        docPageFeedback.swigCMemOwn = false;
        docPageFeedback.delete();
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
                jnidocengineJNI.delete_DocPageFeedback(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public Quadrangle GetQuadrangle() {
        return new Quadrangle(jnidocengineJNI.DocPageFeedback_GetQuadrangle(this.swigCPtr, this), false);
    }

    public int GetID() {
        return jnidocengineJNI.DocPageFeedback_GetID(this.swigCPtr, this);
    }

    public String GetType() {
        return jnidocengineJNI.DocPageFeedback_GetType(this.swigCPtr, this);
    }

    public boolean IsPageRejected() {
        return jnidocengineJNI.DocPageFeedback_IsPageRejected(this.swigCPtr, this);
    }
}
