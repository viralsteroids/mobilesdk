package com.smartengines.common;

/* loaded from: classes3.dex */
public class Polygon {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public Polygon(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(Polygon polygon) {
        if (polygon == null) {
            return 0L;
        }
        return polygon.swigCPtr;
    }

    public static long swigRelease(Polygon polygon) {
        if (polygon == null) {
            return 0L;
        }
        if (!polygon.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = polygon.swigCPtr;
        polygon.swigCMemOwn = false;
        polygon.delete();
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
                jnisecommonJNI.delete_Polygon(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public Polygon() {
        this(jnisecommonJNI.new_Polygon__SWIG_0(), true);
    }

    public Polygon(Point point, int i) {
        this(jnisecommonJNI.new_Polygon__SWIG_1(Point.getCPtr(point), point, i), true);
    }

    public Polygon(Polygon polygon) {
        this(jnisecommonJNI.new_Polygon__SWIG_2(getCPtr(polygon), polygon), true);
    }

    public int GetPointsCount() {
        return jnisecommonJNI.Polygon_GetPointsCount(this.swigCPtr, this);
    }

    public Point GetPoints() {
        long jPolygon_GetPoints = jnisecommonJNI.Polygon_GetPoints(this.swigCPtr, this);
        if (jPolygon_GetPoints == 0) {
            return null;
        }
        return new Point(jPolygon_GetPoints, false);
    }

    public Point GetPoint(int i) {
        return new Point(jnisecommonJNI.Polygon_GetPoint(this.swigCPtr, this, i), false);
    }

    public Point GetMutablePoint(int i) {
        return new Point(jnisecommonJNI.Polygon_GetMutablePoint(this.swigCPtr, this, i), false);
    }

    public void SetPoint(int i, Point point) {
        jnisecommonJNI.Polygon_SetPoint(this.swigCPtr, this, i, Point.getCPtr(point), point);
    }

    public void Resize(int i) {
        jnisecommonJNI.Polygon_Resize(this.swigCPtr, this, i);
    }

    public Rectangle GetBoundingRectangle() {
        return new Rectangle(jnisecommonJNI.Polygon_GetBoundingRectangle(this.swigCPtr, this), true);
    }

    public void Serialize(Serializer serializer) {
        jnisecommonJNI.Polygon_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
