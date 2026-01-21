package com.smartengines.common;

/* loaded from: classes3.dex */
public class QuadranglesMapIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public QuadranglesMapIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(QuadranglesMapIterator quadranglesMapIterator) {
        if (quadranglesMapIterator == null) {
            return 0L;
        }
        return quadranglesMapIterator.swigCPtr;
    }

    public static long swigRelease(QuadranglesMapIterator quadranglesMapIterator) {
        if (quadranglesMapIterator == null) {
            return 0L;
        }
        if (!quadranglesMapIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = quadranglesMapIterator.swigCPtr;
        quadranglesMapIterator.swigCMemOwn = false;
        quadranglesMapIterator.delete();
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
                jnisecommonJNI.delete_QuadranglesMapIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public QuadranglesMapIterator(QuadranglesMapIterator quadranglesMapIterator) {
        this(jnisecommonJNI.new_QuadranglesMapIterator(getCPtr(quadranglesMapIterator), quadranglesMapIterator), true);
    }

    public String GetKey() {
        return jnisecommonJNI.QuadranglesMapIterator_GetKey(this.swigCPtr, this);
    }

    public Quadrangle GetValue() {
        return new Quadrangle(jnisecommonJNI.QuadranglesMapIterator_GetValue(this.swigCPtr, this), false);
    }

    public boolean Equals(QuadranglesMapIterator quadranglesMapIterator) {
        return jnisecommonJNI.QuadranglesMapIterator_Equals(this.swigCPtr, this, getCPtr(quadranglesMapIterator), quadranglesMapIterator);
    }

    public void Advance() {
        jnisecommonJNI.QuadranglesMapIterator_Advance(this.swigCPtr, this);
    }
}
