package com.smartengines.doc;

import com.smartengines.common.Image;

/* loaded from: classes3.dex */
public class DocVideoSession {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocVideoSession(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocVideoSession docVideoSession) {
        if (docVideoSession == null) {
            return 0L;
        }
        return docVideoSession.swigCPtr;
    }

    public static long swigRelease(DocVideoSession docVideoSession) {
        if (docVideoSession == null) {
            return 0L;
        }
        if (!docVideoSession.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docVideoSession.swigCPtr;
        docVideoSession.swigCMemOwn = false;
        docVideoSession.delete();
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
                jnidocengineJNI.delete_DocVideoSession(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocProcessingSettings CreateProcessingSettings() {
        long jDocVideoSession_CreateProcessingSettings = jnidocengineJNI.DocVideoSession_CreateProcessingSettings(this.swigCPtr, this);
        if (jDocVideoSession_CreateProcessingSettings == 0) {
            return null;
        }
        return new DocProcessingSettings(jDocVideoSession_CreateProcessingSettings, true);
    }

    public String GetActivationRequest() {
        return jnidocengineJNI.DocVideoSession_GetActivationRequest(this.swigCPtr, this);
    }

    public void Activate(String str) {
        jnidocengineJNI.DocVideoSession_Activate(this.swigCPtr, this, str);
    }

    public boolean IsActivated() {
        return jnidocengineJNI.DocVideoSession_IsActivated(this.swigCPtr, this);
    }

    public void ProcessImage(Image image, DocProcessingSettings docProcessingSettings) {
        jnidocengineJNI.DocVideoSession_ProcessImage(this.swigCPtr, this, Image.getCPtr(image), image, DocProcessingSettings.getCPtr(docProcessingSettings), docProcessingSettings);
    }

    public void Reset() {
        jnidocengineJNI.DocVideoSession_Reset(this.swigCPtr, this);
    }

    public DocResult GetCurrentResult() {
        return new DocResult(jnidocengineJNI.DocVideoSession_GetCurrentResult(this.swigCPtr, this), false);
    }

    public DocResult GetMutableCurrentResult() {
        return new DocResult(jnidocengineJNI.DocVideoSession_GetMutableCurrentResult(this.swigCPtr, this), false);
    }
}
