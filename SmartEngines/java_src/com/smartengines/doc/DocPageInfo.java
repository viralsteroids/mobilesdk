package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocPageInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocPageInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocPageInfo docPageInfo) {
        if (docPageInfo == null) {
            return 0L;
        }
        return docPageInfo.swigCPtr;
    }

    public static long swigRelease(DocPageInfo docPageInfo) {
        if (docPageInfo == null) {
            return 0L;
        }
        if (!docPageInfo.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docPageInfo.swigCPtr;
        docPageInfo.swigCMemOwn = false;
        docPageInfo.delete();
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
                jnidocengineJNI.delete_DocPageInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean IsGarbage() {
        return jnidocengineJNI.DocPageInfo_IsGarbage(this.swigCPtr, this);
    }

    public int GarbageReasonsCount() {
        return jnidocengineJNI.DocPageInfo_GarbageReasonsCount(this.swigCPtr, this);
    }

    public String GarbageReason(int i) {
        return jnidocengineJNI.DocPageInfo_GarbageReason(this.swigCPtr, this, i);
    }
}
