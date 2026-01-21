package com.smartengines.code;

import com.smartengines.common.ByteString;
import com.smartengines.common.Image;

/* loaded from: classes3.dex */
public class CodeEngineSession {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CodeEngineSession(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(CodeEngineSession codeEngineSession) {
        if (codeEngineSession == null) {
            return 0L;
        }
        return codeEngineSession.swigCPtr;
    }

    public static long swigRelease(CodeEngineSession codeEngineSession) {
        if (codeEngineSession == null) {
            return 0L;
        }
        if (!codeEngineSession.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = codeEngineSession.swigCPtr;
        codeEngineSession.swigCMemOwn = false;
        codeEngineSession.delete();
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
                jnicodeengineJNI.delete_CodeEngineSession(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String GetActivationRequest() {
        return jnicodeengineJNI.CodeEngineSession_GetActivationRequest(this.swigCPtr, this);
    }

    public void Activate(String str) {
        jnicodeengineJNI.CodeEngineSession_Activate(this.swigCPtr, this, str);
    }

    public boolean IsActivated() {
        return jnicodeengineJNI.CodeEngineSession_IsActivated(this.swigCPtr, this);
    }

    public CodeEngineResult Process(Image image) {
        return new CodeEngineResult(jnicodeengineJNI.CodeEngineSession_Process__SWIG_0(this.swigCPtr, this, Image.getCPtr(image), image), false);
    }

    public CodeEngineResult Process(ByteString byteString) {
        return new CodeEngineResult(jnicodeengineJNI.CodeEngineSession_Process__SWIG_1(this.swigCPtr, this, ByteString.getCPtr(byteString), byteString), false);
    }

    public CodeEngineResult GetCurrentResult() {
        return new CodeEngineResult(jnicodeengineJNI.CodeEngineSession_GetCurrentResult(this.swigCPtr, this), false);
    }

    public boolean IsResultTerminal() {
        return jnicodeengineJNI.CodeEngineSession_IsResultTerminal(this.swigCPtr, this);
    }

    public void Reset() {
        jnicodeengineJNI.CodeEngineSession_Reset(this.swigCPtr, this);
    }
}
