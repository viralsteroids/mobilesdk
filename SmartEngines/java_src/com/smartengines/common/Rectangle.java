package com.smartengines.common;

/* loaded from: classes3.dex */
public class Rectangle {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public Rectangle(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(Rectangle rectangle) {
        if (rectangle == null) {
            return 0L;
        }
        return rectangle.swigCPtr;
    }

    public static long swigRelease(Rectangle rectangle) {
        if (rectangle == null) {
            return 0L;
        }
        if (!rectangle.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = rectangle.swigCPtr;
        rectangle.swigCMemOwn = false;
        rectangle.delete();
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
                jnisecommonJNI.delete_Rectangle(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public Rectangle() {
        this(jnisecommonJNI.new_Rectangle__SWIG_0(), true);
    }

    public Rectangle(int i, int i2, int i3, int i4) {
        this(jnisecommonJNI.new_Rectangle__SWIG_1(i, i2, i3, i4), true);
    }

    public void Serialize(Serializer serializer) {
        jnisecommonJNI.Rectangle_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }

    public void setX(int i) {
        jnisecommonJNI.Rectangle_x_set(this.swigCPtr, this, i);
    }

    public int getX() {
        return jnisecommonJNI.Rectangle_x_get(this.swigCPtr, this);
    }

    public void setY(int i) {
        jnisecommonJNI.Rectangle_y_set(this.swigCPtr, this, i);
    }

    public int getY() {
        return jnisecommonJNI.Rectangle_y_get(this.swigCPtr, this);
    }

    public void setWidth(int i) {
        jnisecommonJNI.Rectangle_width_set(this.swigCPtr, this, i);
    }

    public int getWidth() {
        return jnisecommonJNI.Rectangle_width_get(this.swigCPtr, this);
    }

    public void setHeight(int i) {
        jnisecommonJNI.Rectangle_height_set(this.swigCPtr, this, i);
    }

    public int getHeight() {
        return jnisecommonJNI.Rectangle_height_get(this.swigCPtr, this);
    }
}
