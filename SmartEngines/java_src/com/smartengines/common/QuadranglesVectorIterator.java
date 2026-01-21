package com.smartengines.common;

/* loaded from: classes3.dex */
public class QuadranglesVectorIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public QuadranglesVectorIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(QuadranglesVectorIterator quadranglesVectorIterator) {
        if (quadranglesVectorIterator == null) {
            return 0L;
        }
        return quadranglesVectorIterator.swigCPtr;
    }

    public static long swigRelease(QuadranglesVectorIterator quadranglesVectorIterator) {
        if (quadranglesVectorIterator == null) {
            return 0L;
        }
        if (!quadranglesVectorIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = quadranglesVectorIterator.swigCPtr;
        quadranglesVectorIterator.swigCMemOwn = false;
        quadranglesVectorIterator.delete();
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
                jnisecommonJNI.delete_QuadranglesVectorIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public QuadranglesVectorIterator(QuadranglesVectorIterator quadranglesVectorIterator) {
        this(jnisecommonJNI.new_QuadranglesVectorIterator(getCPtr(quadranglesVectorIterator), quadranglesVectorIterator), true);
    }

    public Quadrangle GetValue() {
        return new Quadrangle(jnisecommonJNI.QuadranglesVectorIterator_GetValue(this.swigCPtr, this), false);
    }

    public boolean Equals(QuadranglesVectorIterator quadranglesVectorIterator) {
        return jnisecommonJNI.QuadranglesVectorIterator_Equals(this.swigCPtr, this, getCPtr(quadranglesVectorIterator), quadranglesVectorIterator);
    }

    public void Advance() {
        jnisecommonJNI.QuadranglesVectorIterator_Advance(this.swigCPtr, this);
    }
}
