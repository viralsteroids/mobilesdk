package com.smartengines.p006id;

/* loaded from: classes3.dex */
public class IdFaceFeedback {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdFaceFeedback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdFaceFeedback idFaceFeedback) {
        if (idFaceFeedback == null) {
            return 0L;
        }
        return idFaceFeedback.swigCPtr;
    }

    public static long swigRelease(IdFaceFeedback idFaceFeedback) {
        if (idFaceFeedback == null) {
            return 0L;
        }
        if (!idFaceFeedback.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idFaceFeedback.swigCPtr;
        idFaceFeedback.swigCMemOwn = false;
        idFaceFeedback.delete();
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
                jniidengineJNI.delete_IdFaceFeedback(j);
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
        jniidengineJNI.IdFaceFeedback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        jniidengineJNI.IdFaceFeedback_change_ownership(this, this.swigCPtr, true);
    }

    public void MessageReceived(String str) {
        jniidengineJNI.IdFaceFeedback_MessageReceived(this.swigCPtr, this, str);
    }

    public IdFaceFeedback() {
        this(jniidengineJNI.new_IdFaceFeedback(), true);
        jniidengineJNI.IdFaceFeedback_director_connect(this, this.swigCPtr, true, true);
    }
}
