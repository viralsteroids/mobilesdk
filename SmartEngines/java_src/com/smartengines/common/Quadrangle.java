package com.smartengines.common;

/* loaded from: classes3.dex */
public class Quadrangle {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public Quadrangle(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(Quadrangle quadrangle) {
        if (quadrangle == null) {
            return 0L;
        }
        return quadrangle.swigCPtr;
    }

    public static long swigRelease(Quadrangle quadrangle) {
        if (quadrangle == null) {
            return 0L;
        }
        if (!quadrangle.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = quadrangle.swigCPtr;
        quadrangle.swigCMemOwn = false;
        quadrangle.delete();
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
                jnisecommonJNI.delete_Quadrangle(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public Quadrangle() {
        this(jnisecommonJNI.new_Quadrangle__SWIG_0(), true);
    }

    public Quadrangle(Point point, Point point2, Point point3, Point point4) {
        this(jnisecommonJNI.new_Quadrangle__SWIG_1(Point.getCPtr(point), point, Point.getCPtr(point2), point2, Point.getCPtr(point3), point3, Point.getCPtr(point4), point4), true);
    }

    public Point GetPoint(int i) {
        return new Point(jnisecommonJNI.Quadrangle_GetPoint(this.swigCPtr, this, i), false);
    }

    public Point GetMutablePoint(int i) {
        return new Point(jnisecommonJNI.Quadrangle_GetMutablePoint(this.swigCPtr, this, i), false);
    }

    public void SetPoint(int i, Point point) {
        jnisecommonJNI.Quadrangle_SetPoint(this.swigCPtr, this, i, Point.getCPtr(point), point);
    }

    public Rectangle GetBoundingRectangle() {
        return new Rectangle(jnisecommonJNI.Quadrangle_GetBoundingRectangle(this.swigCPtr, this), true);
    }

    public void Serialize(Serializer serializer) {
        jnisecommonJNI.Quadrangle_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
