package com.smartengines.code;

/* loaded from: classes3.dex */
public class CodeEngineWorkflowFeedback {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CodeEngineWorkflowFeedback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(CodeEngineWorkflowFeedback codeEngineWorkflowFeedback) {
        if (codeEngineWorkflowFeedback == null) {
            return 0L;
        }
        return codeEngineWorkflowFeedback.swigCPtr;
    }

    public static long swigRelease(CodeEngineWorkflowFeedback codeEngineWorkflowFeedback) {
        if (codeEngineWorkflowFeedback == null) {
            return 0L;
        }
        if (!codeEngineWorkflowFeedback.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = codeEngineWorkflowFeedback.swigCPtr;
        codeEngineWorkflowFeedback.swigCMemOwn = false;
        codeEngineWorkflowFeedback.delete();
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
                jnicodeengineJNI.delete_CodeEngineWorkflowFeedback(j);
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
        jnicodeengineJNI.CodeEngineWorkflowFeedback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        jnicodeengineJNI.CodeEngineWorkflowFeedback_change_ownership(this, this.swigCPtr, true);
    }

    public void ResultReceived(CodeEngineResult codeEngineResult) {
        jnicodeengineJNI.CodeEngineWorkflowFeedback_ResultReceived(this.swigCPtr, this, CodeEngineResult.getCPtr(codeEngineResult), codeEngineResult);
    }

    public void SessionEnded() {
        jnicodeengineJNI.CodeEngineWorkflowFeedback_SessionEnded(this.swigCPtr, this);
    }

    public CodeEngineWorkflowFeedback() {
        this(jnicodeengineJNI.new_CodeEngineWorkflowFeedback(), true);
        jnicodeengineJNI.CodeEngineWorkflowFeedback_director_connect(this, this.swigCPtr, true, true);
    }
}
