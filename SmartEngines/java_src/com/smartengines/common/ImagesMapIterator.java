package com.smartengines.common;

/* loaded from: classes3.dex */
public class ImagesMapIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ImagesMapIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(ImagesMapIterator imagesMapIterator) {
        if (imagesMapIterator == null) {
            return 0L;
        }
        return imagesMapIterator.swigCPtr;
    }

    public static long swigRelease(ImagesMapIterator imagesMapIterator) {
        if (imagesMapIterator == null) {
            return 0L;
        }
        if (!imagesMapIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = imagesMapIterator.swigCPtr;
        imagesMapIterator.swigCMemOwn = false;
        imagesMapIterator.delete();
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
                jnisecommonJNI.delete_ImagesMapIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public ImagesMapIterator(ImagesMapIterator imagesMapIterator) {
        this(jnisecommonJNI.new_ImagesMapIterator(getCPtr(imagesMapIterator), imagesMapIterator), true);
    }

    public String GetKey() {
        return jnisecommonJNI.ImagesMapIterator_GetKey(this.swigCPtr, this);
    }

    public Image GetValue() {
        return new Image(jnisecommonJNI.ImagesMapIterator_GetValue(this.swigCPtr, this), false);
    }

    public boolean Equals(ImagesMapIterator imagesMapIterator) {
        return jnisecommonJNI.ImagesMapIterator_Equals(this.swigCPtr, this, getCPtr(imagesMapIterator), imagesMapIterator);
    }

    public void Advance() {
        jnisecommonJNI.ImagesMapIterator_Advance(this.swigCPtr, this);
    }
}
