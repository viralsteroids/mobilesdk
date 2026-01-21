package com.smartengines.text;

import com.smartengines.common.Image;

/* loaded from: classes3.dex */
public class TextSession {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TextSession(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(TextSession textSession) {
        if (textSession == null) {
            return 0L;
        }
        return textSession.swigCPtr;
    }

    public static long swigRelease(TextSession textSession) {
        if (textSession == null) {
            return 0L;
        }
        if (!textSession.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = textSession.swigCPtr;
        textSession.swigCMemOwn = false;
        textSession.delete();
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
                jnitextengineJNI.delete_TextSession(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String GetActivationRequest() {
        return jnitextengineJNI.TextSession_GetActivationRequest(this.swigCPtr, this);
    }

    public void Activate(String str) {
        jnitextengineJNI.TextSession_Activate(this.swigCPtr, this, str);
    }

    public boolean IsActivated() {
        return jnitextengineJNI.TextSession_IsActivated(this.swigCPtr, this);
    }

    public void ProcessImage(Image image) {
        jnitextengineJNI.TextSession_ProcessImage(this.swigCPtr, this, Image.getCPtr(image), image);
    }

    public void Reset() {
        jnitextengineJNI.TextSession_Reset(this.swigCPtr, this);
    }

    public TextResult GetCurrentResult() {
        return new TextResult(jnitextengineJNI.TextSession_GetCurrentResult(this.swigCPtr, this), false);
    }
}
