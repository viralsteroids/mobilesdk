package com.smartengines.p006id;

import com.smartengines.common.ByteString;
import com.smartengines.common.Image;

/* loaded from: classes3.dex */
public class IdVideoAuthenticationSession {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdVideoAuthenticationSession(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdVideoAuthenticationSession idVideoAuthenticationSession) {
        if (idVideoAuthenticationSession == null) {
            return 0L;
        }
        return idVideoAuthenticationSession.swigCPtr;
    }

    public static long swigRelease(IdVideoAuthenticationSession idVideoAuthenticationSession) {
        if (idVideoAuthenticationSession == null) {
            return 0L;
        }
        if (!idVideoAuthenticationSession.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idVideoAuthenticationSession.swigCPtr;
        idVideoAuthenticationSession.swigCMemOwn = false;
        idVideoAuthenticationSession.delete();
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
                jniidengineJNI.delete_IdVideoAuthenticationSession(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String GetActivationRequest() {
        return jniidengineJNI.IdVideoAuthenticationSession_GetActivationRequest(this.swigCPtr, this);
    }

    public void Activate(String str) {
        jniidengineJNI.IdVideoAuthenticationSession_Activate(this.swigCPtr, this, str);
    }

    public boolean IsActivated() {
        return jniidengineJNI.IdVideoAuthenticationSession_IsActivated(this.swigCPtr, this);
    }

    public void ProcessFrame(Image image) {
        jniidengineJNI.IdVideoAuthenticationSession_ProcessFrame(this.swigCPtr, this, Image.getCPtr(image), image);
    }

    public void ProcessData(ByteString byteString) {
        jniidengineJNI.IdVideoAuthenticationSession_ProcessData(this.swigCPtr, this, ByteString.getCPtr(byteString), byteString);
    }

    public IdVideoAuthenticationInstruction GetCurrentInstruction() {
        return new IdVideoAuthenticationInstruction(jniidengineJNI.IdVideoAuthenticationSession_GetCurrentInstruction(this.swigCPtr, this), false);
    }

    public boolean HasDocumentResult() {
        return jniidengineJNI.IdVideoAuthenticationSession_HasDocumentResult(this.swigCPtr, this);
    }

    public IdResult GetDocumentResult() {
        return new IdResult(jniidengineJNI.IdVideoAuthenticationSession_GetDocumentResult(this.swigCPtr, this), false);
    }

    public boolean HasFaceMatchingResult() {
        return jniidengineJNI.IdVideoAuthenticationSession_HasFaceMatchingResult(this.swigCPtr, this);
    }

    public IdFaceSimilarityResult GetFaceMatchingResult() {
        return new IdFaceSimilarityResult(jniidengineJNI.IdVideoAuthenticationSession_GetFaceMatchingResult(this.swigCPtr, this), false);
    }

    public boolean HasFaceLivenessResult() {
        return jniidengineJNI.IdVideoAuthenticationSession_HasFaceLivenessResult(this.swigCPtr, this);
    }

    public IdFaceLivenessResult GetFaceLivenessResult() {
        return new IdFaceLivenessResult(jniidengineJNI.IdVideoAuthenticationSession_GetFaceLivenessResult(this.swigCPtr, this), false);
    }

    public IdCheckStatus GetAuthenticationStatus() {
        return IdCheckStatus.swigToEnum(jniidengineJNI.IdVideoAuthenticationSession_GetAuthenticationStatus(this.swigCPtr, this));
    }

    public IdVideoAuthenticationTranscript GetTranscript() {
        return new IdVideoAuthenticationTranscript(jniidengineJNI.IdVideoAuthenticationSession_GetTranscript(this.swigCPtr, this), false);
    }

    public void Suspend() {
        jniidengineJNI.IdVideoAuthenticationSession_Suspend(this.swigCPtr, this);
    }

    public void Resume() {
        jniidengineJNI.IdVideoAuthenticationSession_Resume(this.swigCPtr, this);
    }

    public void Reset() {
        jniidengineJNI.IdVideoAuthenticationSession_Reset(this.swigCPtr, this);
    }
}
