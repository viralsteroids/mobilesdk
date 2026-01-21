package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocRawFieldsFeedbackContainer {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocRawFieldsFeedbackContainer(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocRawFieldsFeedbackContainer docRawFieldsFeedbackContainer) {
        if (docRawFieldsFeedbackContainer == null) {
            return 0L;
        }
        return docRawFieldsFeedbackContainer.swigCPtr;
    }

    public static long swigRelease(DocRawFieldsFeedbackContainer docRawFieldsFeedbackContainer) {
        if (docRawFieldsFeedbackContainer == null) {
            return 0L;
        }
        if (!docRawFieldsFeedbackContainer.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docRawFieldsFeedbackContainer.swigCPtr;
        docRawFieldsFeedbackContainer.swigCMemOwn = false;
        docRawFieldsFeedbackContainer.delete();
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
                jnidocengineJNI.delete_DocRawFieldsFeedbackContainer(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int GetRawFieldCount() {
        return jnidocengineJNI.DocRawFieldsFeedbackContainer_GetRawFieldCount(this.swigCPtr, this);
    }

    public int GetSourcePageID() {
        return jnidocengineJNI.DocRawFieldsFeedbackContainer_GetSourcePageID(this.swigCPtr, this);
    }

    public DocRawFieldFeedback GetRawFieldFeedback(int i) {
        return new DocRawFieldFeedback(jnidocengineJNI.DocRawFieldsFeedbackContainer_GetRawFieldFeedback(this.swigCPtr, this, i), false);
    }
}
