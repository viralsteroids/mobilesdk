package com.smartengines.doc;

import com.smartengines.common.Image;

/* loaded from: classes3.dex */
public class DocSession {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocSession(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocSession docSession) {
        if (docSession == null) {
            return 0L;
        }
        return docSession.swigCPtr;
    }

    public static long swigRelease(DocSession docSession) {
        if (docSession == null) {
            return 0L;
        }
        if (!docSession.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docSession.swigCPtr;
        docSession.swigCMemOwn = false;
        docSession.delete();
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
                jnidocengineJNI.delete_DocSession(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocProcessingSettings CreateProcessingSettings() {
        long jDocSession_CreateProcessingSettings = jnidocengineJNI.DocSession_CreateProcessingSettings(this.swigCPtr, this);
        if (jDocSession_CreateProcessingSettings == 0) {
            return null;
        }
        return new DocProcessingSettings(jDocSession_CreateProcessingSettings, true);
    }

    public String GetActivationRequest() {
        return jnidocengineJNI.DocSession_GetActivationRequest(this.swigCPtr, this);
    }

    public void Activate(String str) {
        jnidocengineJNI.DocSession_Activate(this.swigCPtr, this, str);
    }

    public boolean IsActivated() {
        return jnidocengineJNI.DocSession_IsActivated(this.swigCPtr, this);
    }

    public void ProcessImage(Image image, DocProcessingSettings docProcessingSettings) {
        jnidocengineJNI.DocSession_ProcessImage__SWIG_0(this.swigCPtr, this, Image.getCPtr(image), image, DocProcessingSettings.getCPtr(docProcessingSettings), docProcessingSettings);
    }

    public void ProcessImage(Image image) {
        jnidocengineJNI.DocSession_ProcessImage__SWIG_1(this.swigCPtr, this, Image.getCPtr(image), image);
    }

    public void Reset() {
        jnidocengineJNI.DocSession_Reset(this.swigCPtr, this);
    }

    public DocResult GetCurrentResult() {
        return new DocResult(jnidocengineJNI.DocSession_GetCurrentResult(this.swigCPtr, this), false);
    }

    public String GetType() {
        return jnidocengineJNI.DocSession_GetType(this.swigCPtr, this);
    }

    public int RegisterImage(Image image) {
        return jnidocengineJNI.DocSession_RegisterImage(this.swigCPtr, this, Image.getCPtr(image), image);
    }

    public void Process(DocProcessingSettings docProcessingSettings) {
        jnidocengineJNI.DocSession_Process(this.swigCPtr, this, DocProcessingSettings.getCPtr(docProcessingSettings), docProcessingSettings);
    }

    public DocResult GetMutableCurrentResult() {
        return new DocResult(jnidocengineJNI.DocSession_GetMutableCurrentResult(this.swigCPtr, this), false);
    }
}
