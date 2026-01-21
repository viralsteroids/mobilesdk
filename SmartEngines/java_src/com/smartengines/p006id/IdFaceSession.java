package com.smartengines.p006id;

import com.smartengines.common.Image;

/* loaded from: classes3.dex */
public class IdFaceSession {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdFaceSession(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdFaceSession idFaceSession) {
        if (idFaceSession == null) {
            return 0L;
        }
        return idFaceSession.swigCPtr;
    }

    public static long swigRelease(IdFaceSession idFaceSession) {
        if (idFaceSession == null) {
            return 0L;
        }
        if (!idFaceSession.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idFaceSession.swigCPtr;
        idFaceSession.swigCMemOwn = false;
        idFaceSession.delete();
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
                jniidengineJNI.delete_IdFaceSession(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String GetActivationRequest() {
        return jniidengineJNI.IdFaceSession_GetActivationRequest(this.swigCPtr, this);
    }

    public void Activate(String str) {
        jniidengineJNI.IdFaceSession_Activate(this.swigCPtr, this, str);
    }

    public boolean IsActivated() {
        return jniidengineJNI.IdFaceSession_IsActivated(this.swigCPtr, this);
    }

    public IdFaceSimilarityResult GetSimilarity(Image image, Image image2) {
        return new IdFaceSimilarityResult(jniidengineJNI.IdFaceSession_GetSimilarity(this.swigCPtr, this, Image.getCPtr(image), image, Image.getCPtr(image2), image2), true);
    }

    public IdFaceSimilarityResult GetSimilarityWith(Image image) {
        return new IdFaceSimilarityResult(jniidengineJNI.IdFaceSession_GetSimilarityWith(this.swigCPtr, this, Image.getCPtr(image), image), true);
    }

    public void AddFaceImage(Image image) {
        jniidengineJNI.IdFaceSession_AddFaceImage(this.swigCPtr, this, Image.getCPtr(image), image);
    }

    public void SetFaceToMatchWith(Image image) {
        jniidengineJNI.IdFaceSession_SetFaceToMatchWith(this.swigCPtr, this, Image.getCPtr(image), image);
    }

    public IdFaceRectsResult GetRects(Image image) {
        return new IdFaceRectsResult(jniidengineJNI.IdFaceSession_GetRects(this.swigCPtr, this, Image.getCPtr(image), image), true);
    }

    public boolean HasAccumulatedImage() {
        return jniidengineJNI.IdFaceSession_HasAccumulatedImage(this.swigCPtr, this);
    }

    public IdFaceLivenessResult GetLivenessResult() {
        return new IdFaceLivenessResult(jniidengineJNI.IdFaceSession_GetLivenessResult(this.swigCPtr, this), true);
    }

    public long GetInstructionsCount() {
        return jniidengineJNI.IdFaceSession_GetInstructionsCount(this.swigCPtr, this);
    }

    public long GetPushedImagesCount() {
        return jniidengineJNI.IdFaceSession_GetPushedImagesCount(this.swigCPtr, this);
    }

    public long GetAllowedNumberOfFailedINstructions() {
        return jniidengineJNI.IdFaceSession_GetAllowedNumberOfFailedINstructions(this.swigCPtr, this);
    }

    public long GetInitializerInstructionTime() {
        return jniidengineJNI.IdFaceSession_GetInitializerInstructionTime(this.swigCPtr, this);
    }

    public long GetPassAllInstruction() {
        return jniidengineJNI.IdFaceSession_GetPassAllInstruction(this.swigCPtr, this);
    }

    public void Reset() {
        jniidengineJNI.IdFaceSession_Reset(this.swigCPtr, this);
    }
}
