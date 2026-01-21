package com.smartengines.p006id;

import com.smartengines.common.Image;

/* loaded from: classes3.dex */
public class IdFileAnalysisSession {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdFileAnalysisSession(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdFileAnalysisSession idFileAnalysisSession) {
        if (idFileAnalysisSession == null) {
            return 0L;
        }
        return idFileAnalysisSession.swigCPtr;
    }

    public static long swigRelease(IdFileAnalysisSession idFileAnalysisSession) {
        if (idFileAnalysisSession == null) {
            return 0L;
        }
        if (!idFileAnalysisSession.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idFileAnalysisSession.swigCPtr;
        idFileAnalysisSession.swigCMemOwn = false;
        idFileAnalysisSession.delete();
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
                jniidengineJNI.delete_IdFileAnalysisSession(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String GetActivationRequest() {
        return jniidengineJNI.IdFileAnalysisSession_GetActivationRequest(this.swigCPtr, this);
    }

    public void Activate(String str) {
        jniidengineJNI.IdFileAnalysisSession_Activate(this.swigCPtr, this, str);
    }

    public boolean IsActivated() {
        return jniidengineJNI.IdFileAnalysisSession_IsActivated(this.swigCPtr, this);
    }

    public IdResult Process(Image image) {
        return new IdResult(jniidengineJNI.IdFileAnalysisSession_Process(this.swigCPtr, this, Image.getCPtr(image), image), false);
    }

    public IdResult GetCurrentResult() {
        return new IdResult(jniidengineJNI.IdFileAnalysisSession_GetCurrentResult(this.swigCPtr, this), false);
    }

    public void Reset() {
        jniidengineJNI.IdFileAnalysisSession_Reset(this.swigCPtr, this);
    }
}
