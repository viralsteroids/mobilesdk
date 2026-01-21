package com.smartengines.common;

/* loaded from: classes3.dex */
public class Size {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public Size(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(Size size) {
        if (size == null) {
            return 0L;
        }
        return size.swigCPtr;
    }

    public static long swigRelease(Size size) {
        if (size == null) {
            return 0L;
        }
        if (!size.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = size.swigCPtr;
        size.swigCMemOwn = false;
        size.delete();
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
                jnisecommonJNI.delete_Size(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public Size() {
        this(jnisecommonJNI.new_Size__SWIG_0(), true);
    }

    public Size(int i, int i2) {
        this(jnisecommonJNI.new_Size__SWIG_1(i, i2), true);
    }

    public void Serialize(Serializer serializer) {
        jnisecommonJNI.Size_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }

    public void setWidth(int i) {
        jnisecommonJNI.Size_width_set(this.swigCPtr, this, i);
    }

    public int getWidth() {
        return jnisecommonJNI.Size_width_get(this.swigCPtr, this);
    }

    public void setHeight(int i) {
        jnisecommonJNI.Size_height_set(this.swigCPtr, this, i);
    }

    public int getHeight() {
        return jnisecommonJNI.Size_height_get(this.swigCPtr, this);
    }
}
