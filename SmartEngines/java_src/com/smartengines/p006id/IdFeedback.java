package com.smartengines.p006id;

/* loaded from: classes3.dex */
public class IdFeedback {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdFeedback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdFeedback idFeedback) {
        if (idFeedback == null) {
            return 0L;
        }
        return idFeedback.swigCPtr;
    }

    public static long swigRelease(IdFeedback idFeedback) {
        if (idFeedback == null) {
            return 0L;
        }
        if (!idFeedback.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idFeedback.swigCPtr;
        idFeedback.swigCMemOwn = false;
        idFeedback.delete();
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
                jniidengineJNI.delete_IdFeedback(j);
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
        jniidengineJNI.IdFeedback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        jniidengineJNI.IdFeedback_change_ownership(this, this.swigCPtr, true);
    }

    public void FeedbackReceived(IdFeedbackContainer idFeedbackContainer) {
        jniidengineJNI.IdFeedback_FeedbackReceived(this.swigCPtr, this, IdFeedbackContainer.getCPtr(idFeedbackContainer), idFeedbackContainer);
    }

    public void TemplateDetectionResultReceived(IdTemplateDetectionResult idTemplateDetectionResult) {
        jniidengineJNI.IdFeedback_TemplateDetectionResultReceived(this.swigCPtr, this, IdTemplateDetectionResult.getCPtr(idTemplateDetectionResult), idTemplateDetectionResult);
    }

    public void TemplateSegmentationResultReceived(IdTemplateSegmentationResult idTemplateSegmentationResult) {
        jniidengineJNI.IdFeedback_TemplateSegmentationResultReceived(this.swigCPtr, this, IdTemplateSegmentationResult.getCPtr(idTemplateSegmentationResult), idTemplateSegmentationResult);
    }

    public void ResultReceived(IdResult idResult) {
        jniidengineJNI.IdFeedback_ResultReceived(this.swigCPtr, this, IdResult.getCPtr(idResult), idResult);
    }

    public void SessionEnded() {
        jniidengineJNI.IdFeedback_SessionEnded(this.swigCPtr, this);
    }

    public IdFeedback() {
        this(jniidengineJNI.new_IdFeedback(), true);
        jniidengineJNI.IdFeedback_director_connect(this, this.swigCPtr, true, true);
    }
}
