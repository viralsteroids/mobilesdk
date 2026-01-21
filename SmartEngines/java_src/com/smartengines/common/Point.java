package com.smartengines.common;

/* loaded from: classes3.dex */
public class Point {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public Point(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(Point point) {
        if (point == null) {
            return 0L;
        }
        return point.swigCPtr;
    }

    public static long swigRelease(Point point) {
        if (point == null) {
            return 0L;
        }
        if (!point.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = point.swigCPtr;
        point.swigCMemOwn = false;
        point.delete();
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
                jnisecommonJNI.delete_Point(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public Point() {
        this(jnisecommonJNI.new_Point__SWIG_0(), true);
    }

    public Point(double d, double d2) {
        this(jnisecommonJNI.new_Point__SWIG_1(d, d2), true);
    }

    public void Serialize(Serializer serializer) {
        jnisecommonJNI.Point_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }

    public void setX(double d) {
        jnisecommonJNI.Point_x_set(this.swigCPtr, this, d);
    }

    public double getX() {
        return jnisecommonJNI.Point_x_get(this.swigCPtr, this);
    }

    public void setY(double d) {
        jnisecommonJNI.Point_y_set(this.swigCPtr, this, d);
    }

    public double getY() {
        return jnisecommonJNI.Point_y_get(this.swigCPtr, this);
    }
}
