package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocFeedback {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocFeedback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocFeedback docFeedback) {
        if (docFeedback == null) {
            return 0L;
        }
        return docFeedback.swigCPtr;
    }

    public static long swigRelease(DocFeedback docFeedback) {
        if (docFeedback == null) {
            return 0L;
        }
        if (!docFeedback.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docFeedback.swigCPtr;
        docFeedback.swigCMemOwn = false;
        docFeedback.delete();
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
                jnidocengineJNI.delete_DocFeedback(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        jnidocengineJNI.DocFeedback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        jnidocengineJNI.DocFeedback_change_ownership(this, this.swigCPtr, true);
    }

    public void FeedbackReceived(DocFeedbackContainer docFeedbackContainer) {
        jnidocengineJNI.DocFeedback_FeedbackReceived(this.swigCPtr, this, DocFeedbackContainer.getCPtr(docFeedbackContainer), docFeedbackContainer);
    }

    public boolean AcceptsPagesLocalizationFeedback() {
        return getClass() == DocFeedback.class ? jnidocengineJNI.DocFeedback_AcceptsPagesLocalizationFeedback(this.swigCPtr, this) : jnidocengineJNI.m493xe7a9038e(this.swigCPtr, this);
    }

    public void PagesLocalizationFeedbackReceived(DocPagesFeedbackContainer docPagesFeedbackContainer) {
        jnidocengineJNI.DocFeedback_PagesLocalizationFeedbackReceived(this.swigCPtr, this, DocPagesFeedbackContainer.getCPtr(docPagesFeedbackContainer), docPagesFeedbackContainer);
    }

    public boolean AcceptsPagePreprocessingFeedback() {
        return getClass() == DocFeedback.class ? jnidocengineJNI.DocFeedback_AcceptsPagePreprocessingFeedback(this.swigCPtr, this) : jnidocengineJNI.m492xf0f6c324(this.swigCPtr, this);
    }

    public void PagePrepocessingFeedbackReceived(DocPagesFeedbackContainer docPagesFeedbackContainer) {
        jnidocengineJNI.DocFeedback_PagePrepocessingFeedbackReceived(this.swigCPtr, this, DocPagesFeedbackContainer.getCPtr(docPagesFeedbackContainer), docPagesFeedbackContainer);
    }

    public boolean AcceptsRawFieldsLocalizationFeedback() {
        return getClass() == DocFeedback.class ? jnidocengineJNI.DocFeedback_AcceptsRawFieldsLocalizationFeedback(this.swigCPtr, this) : jnidocengineJNI.m494x56eeedb1(this.swigCPtr, this);
    }

    public void RawFieldsLocalizationFeedbackReceived(DocRawFieldsFeedbackContainer docRawFieldsFeedbackContainer) {
        jnidocengineJNI.DocFeedback_RawFieldsLocalizationFeedbackReceived(this.swigCPtr, this, DocRawFieldsFeedbackContainer.getCPtr(docRawFieldsFeedbackContainer), docRawFieldsFeedbackContainer);
    }

    public boolean AcceptsRawFieldsRecognitionFeedback() {
        return getClass() == DocFeedback.class ? jnidocengineJNI.DocFeedback_AcceptsRawFieldsRecognitionFeedback(this.swigCPtr, this) : jnidocengineJNI.m495x8c3cda83(this.swigCPtr, this);
    }

    public void RawFiedlsRecognitionFeedbackReceived(DocRawFieldsFeedbackContainer docRawFieldsFeedbackContainer) {
        jnidocengineJNI.DocFeedback_RawFiedlsRecognitionFeedbackReceived(this.swigCPtr, this, DocRawFieldsFeedbackContainer.getCPtr(docRawFieldsFeedbackContainer), docRawFieldsFeedbackContainer);
    }

    public void ResultReceived(DocResult docResult) {
        jnidocengineJNI.DocFeedback_ResultReceived(this.swigCPtr, this, DocResult.getCPtr(docResult), docResult);
    }

    public DocFeedback() {
        this(jnidocengineJNI.new_DocFeedback(), true);
        jnidocengineJNI.DocFeedback_director_connect(this, this.swigCPtr, true, true);
    }
}
