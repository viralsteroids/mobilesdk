package com.smartengines.code;

/* loaded from: classes3.dex */
public class CodeEngineVisualizationFeedback {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CodeEngineVisualizationFeedback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(CodeEngineVisualizationFeedback codeEngineVisualizationFeedback) {
        if (codeEngineVisualizationFeedback == null) {
            return 0L;
        }
        return codeEngineVisualizationFeedback.swigCPtr;
    }

    public static long swigRelease(CodeEngineVisualizationFeedback codeEngineVisualizationFeedback) {
        if (codeEngineVisualizationFeedback == null) {
            return 0L;
        }
        if (!codeEngineVisualizationFeedback.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = codeEngineVisualizationFeedback.swigCPtr;
        codeEngineVisualizationFeedback.swigCMemOwn = false;
        codeEngineVisualizationFeedback.delete();
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
                jnicodeengineJNI.delete_CodeEngineVisualizationFeedback(j);
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
        jnicodeengineJNI.CodeEngineVisualizationFeedback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        jnicodeengineJNI.CodeEngineVisualizationFeedback_change_ownership(this, this.swigCPtr, true);
    }

    public void FeedbackReceived(CodeEngineFeedbackContainer codeEngineFeedbackContainer) {
        jnicodeengineJNI.CodeEngineVisualizationFeedback_FeedbackReceived(this.swigCPtr, this, CodeEngineFeedbackContainer.getCPtr(codeEngineFeedbackContainer), codeEngineFeedbackContainer);
    }

    public CodeEngineVisualizationFeedback() {
        this(jnicodeengineJNI.new_CodeEngineVisualizationFeedback(), true);
        jnicodeengineJNI.CodeEngineVisualizationFeedback_director_connect(this, this.swigCPtr, true, true);
    }
}
