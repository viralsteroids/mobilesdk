package com.smartengines.doc;

import com.smartengines.common.Quadrangle;
import com.smartengines.common.QuadranglesMapIterator;
import com.smartengines.common.StringsMapIterator;

/* loaded from: classes3.dex */
public class DocFeedbackContainer {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocFeedbackContainer(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocFeedbackContainer docFeedbackContainer) {
        if (docFeedbackContainer == null) {
            return 0L;
        }
        return docFeedbackContainer.swigCPtr;
    }

    public static long swigRelease(DocFeedbackContainer docFeedbackContainer) {
        if (docFeedbackContainer == null) {
            return 0L;
        }
        if (!docFeedbackContainer.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docFeedbackContainer.swigCPtr;
        docFeedbackContainer.swigCMemOwn = false;
        docFeedbackContainer.delete();
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
                jnidocengineJNI.delete_DocFeedbackContainer(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public StringsMapIterator FeedbackFieldIteratorBegin() {
        return new StringsMapIterator(jnidocengineJNI.DocFeedbackContainer_FeedbackFieldIteratorBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator FeedbackFieldIteratorEnd() {
        return new StringsMapIterator(jnidocengineJNI.DocFeedbackContainer_FeedbackFieldIteratorEnd(this.swigCPtr, this), true);
    }

    public QuadranglesMapIterator FeedbackQuadIteratorBegin() {
        return new QuadranglesMapIterator(jnidocengineJNI.DocFeedbackContainer_FeedbackQuadIteratorBegin(this.swigCPtr, this), true);
    }

    public QuadranglesMapIterator FeedbackQuadIteratorEnd() {
        return new QuadranglesMapIterator(jnidocengineJNI.DocFeedbackContainer_FeedbackQuadIteratorEnd(this.swigCPtr, this), true);
    }

    public void SetFeedbackField(String str, String str2) {
        jnidocengineJNI.DocFeedbackContainer_SetFeedbackField(this.swigCPtr, this, str, str2);
    }

    public void SetFeedbackQuad(String str, Quadrangle quadrangle) {
        jnidocengineJNI.DocFeedbackContainer_SetFeedbackQuad(this.swigCPtr, this, str, Quadrangle.getCPtr(quadrangle), quadrangle);
    }
}
