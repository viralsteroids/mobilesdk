package com.smartengines.common;

/* loaded from: classes3.dex */
public class RectanglesVectorIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public RectanglesVectorIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(RectanglesVectorIterator rectanglesVectorIterator) {
        if (rectanglesVectorIterator == null) {
            return 0L;
        }
        return rectanglesVectorIterator.swigCPtr;
    }

    public static long swigRelease(RectanglesVectorIterator rectanglesVectorIterator) {
        if (rectanglesVectorIterator == null) {
            return 0L;
        }
        if (!rectanglesVectorIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = rectanglesVectorIterator.swigCPtr;
        rectanglesVectorIterator.swigCMemOwn = false;
        rectanglesVectorIterator.delete();
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
                jnisecommonJNI.delete_RectanglesVectorIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public RectanglesVectorIterator(RectanglesVectorIterator rectanglesVectorIterator) {
        this(jnisecommonJNI.new_RectanglesVectorIterator(getCPtr(rectanglesVectorIterator), rectanglesVectorIterator), true);
    }

    public Rectangle GetValue() {
        return new Rectangle(jnisecommonJNI.RectanglesVectorIterator_GetValue(this.swigCPtr, this), false);
    }

    public boolean Equals(RectanglesVectorIterator rectanglesVectorIterator) {
        return jnisecommonJNI.RectanglesVectorIterator_Equals(this.swigCPtr, this, getCPtr(rectanglesVectorIterator), rectanglesVectorIterator);
    }

    public void Advance() {
        jnisecommonJNI.RectanglesVectorIterator_Advance(this.swigCPtr, this);
    }
}
