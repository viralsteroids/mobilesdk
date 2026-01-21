package com.smartengines.p006id;

/* loaded from: classes3.dex */
public class IdVideoAuthenticationCallbacks {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdVideoAuthenticationCallbacks(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks) {
        if (idVideoAuthenticationCallbacks == null) {
            return 0L;
        }
        return idVideoAuthenticationCallbacks.swigCPtr;
    }

    public static long swigRelease(IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks) {
        if (idVideoAuthenticationCallbacks == null) {
            return 0L;
        }
        if (!idVideoAuthenticationCallbacks.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idVideoAuthenticationCallbacks.swigCPtr;
        idVideoAuthenticationCallbacks.swigCMemOwn = false;
        idVideoAuthenticationCallbacks.delete();
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
                jniidengineJNI.delete_IdVideoAuthenticationCallbacks(j);
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
        jniidengineJNI.IdVideoAuthenticationCallbacks_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        jniidengineJNI.IdVideoAuthenticationCallbacks_change_ownership(this, this.swigCPtr, true);
    }

    public void InstructionReceived(int i, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction) {
        jniidengineJNI.IdVideoAuthenticationCallbacks_InstructionReceived(this.swigCPtr, this, i, IdVideoAuthenticationInstruction.getCPtr(idVideoAuthenticationInstruction), idVideoAuthenticationInstruction);
    }

    public void AnomalyRegistered(int i, IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly) {
        jniidengineJNI.IdVideoAuthenticationCallbacks_AnomalyRegistered(this.swigCPtr, this, i, IdVideoAuthenticationAnomaly.getCPtr(idVideoAuthenticationAnomaly), idVideoAuthenticationAnomaly);
    }

    public void DocumentResultUpdated(IdResult idResult) {
        jniidengineJNI.IdVideoAuthenticationCallbacks_DocumentResultUpdated(this.swigCPtr, this, IdResult.getCPtr(idResult), idResult);
    }

    public void FaceMatchingResultUpdated(IdFaceSimilarityResult idFaceSimilarityResult) {
        jniidengineJNI.IdVideoAuthenticationCallbacks_FaceMatchingResultUpdated(this.swigCPtr, this, IdFaceSimilarityResult.getCPtr(idFaceSimilarityResult), idFaceSimilarityResult);
    }

    public void FaceLivenessResultUpdated(IdFaceLivenessResult idFaceLivenessResult) {
        jniidengineJNI.IdVideoAuthenticationCallbacks_FaceLivenessResultUpdated(this.swigCPtr, this, IdFaceLivenessResult.getCPtr(idFaceLivenessResult), idFaceLivenessResult);
    }

    public void AuthenticationStatusUpdated(IdCheckStatus idCheckStatus) {
        jniidengineJNI.IdVideoAuthenticationCallbacks_AuthenticationStatusUpdated(this.swigCPtr, this, idCheckStatus.swigValue());
    }

    public void GlobalTimeoutReached() {
        jniidengineJNI.IdVideoAuthenticationCallbacks_GlobalTimeoutReached(this.swigCPtr, this);
    }

    public void InstructionTimeoutReached() {
        jniidengineJNI.IdVideoAuthenticationCallbacks_InstructionTimeoutReached(this.swigCPtr, this);
    }

    public void SessionEnded() {
        jniidengineJNI.IdVideoAuthenticationCallbacks_SessionEnded(this.swigCPtr, this);
    }

    public void MessageReceived(String str) {
        jniidengineJNI.IdVideoAuthenticationCallbacks_MessageReceived(this.swigCPtr, this, str);
    }

    public IdVideoAuthenticationCallbacks() {
        this(jniidengineJNI.new_IdVideoAuthenticationCallbacks(), true);
        jniidengineJNI.IdVideoAuthenticationCallbacks_director_connect(this, this.swigCPtr, true, true);
    }
}
