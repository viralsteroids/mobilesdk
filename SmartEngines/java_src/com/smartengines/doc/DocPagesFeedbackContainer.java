package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocPagesFeedbackContainer {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocPagesFeedbackContainer(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocPagesFeedbackContainer docPagesFeedbackContainer) {
        if (docPagesFeedbackContainer == null) {
            return 0L;
        }
        return docPagesFeedbackContainer.swigCPtr;
    }

    public static long swigRelease(DocPagesFeedbackContainer docPagesFeedbackContainer) {
        if (docPagesFeedbackContainer == null) {
            return 0L;
        }
        if (!docPagesFeedbackContainer.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docPagesFeedbackContainer.swigCPtr;
        docPagesFeedbackContainer.swigCMemOwn = false;
        docPagesFeedbackContainer.delete();
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
                jnidocengineJNI.delete_DocPagesFeedbackContainer(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int GetPageCount() {
        return jnidocengineJNI.DocPagesFeedbackContainer_GetPageCount(this.swigCPtr, this);
    }

    public DocPageFeedback GetPageFeedback(int i) {
        return new DocPageFeedback(jnidocengineJNI.DocPagesFeedbackContainer_GetPageFeedback(this.swigCPtr, this, i), false);
    }
}
