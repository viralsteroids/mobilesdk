package com.smartengines.p006id;

import com.smartengines.common.ByteString;
import com.smartengines.common.Image;

/* loaded from: classes3.dex */
public class IdSession {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdSession(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdSession idSession) {
        if (idSession == null) {
            return 0L;
        }
        return idSession.swigCPtr;
    }

    public static long swigRelease(IdSession idSession) {
        if (idSession == null) {
            return 0L;
        }
        if (!idSession.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idSession.swigCPtr;
        idSession.swigCMemOwn = false;
        idSession.delete();
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
                jniidengineJNI.delete_IdSession(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String GetActivationRequest() {
        return jniidengineJNI.IdSession_GetActivationRequest(this.swigCPtr, this);
    }

    public void Activate(String str) {
        jniidengineJNI.IdSession_Activate(this.swigCPtr, this, str);
    }

    public boolean IsActivated() {
        return jniidengineJNI.IdSession_IsActivated(this.swigCPtr, this);
    }

    public IdResult Process(Image image) {
        return new IdResult(jniidengineJNI.IdSession_Process__SWIG_0(this.swigCPtr, this, Image.getCPtr(image), image), false);
    }

    public IdResult Process(ByteString byteString) {
        return new IdResult(jniidengineJNI.IdSession_Process__SWIG_1(this.swigCPtr, this, ByteString.getCPtr(byteString), byteString), false);
    }

    public IdResult GetCurrentResult() {
        return new IdResult(jniidengineJNI.IdSession_GetCurrentResult(this.swigCPtr, this), false);
    }

    public boolean IsResultTerminal() {
        return jniidengineJNI.IdSession_IsResultTerminal(this.swigCPtr, this);
    }

    public void Reset() {
        jniidengineJNI.IdSession_Reset(this.swigCPtr, this);
    }
}
