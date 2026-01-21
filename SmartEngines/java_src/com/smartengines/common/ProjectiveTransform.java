package com.smartengines.common;

/* loaded from: classes3.dex */
public class ProjectiveTransform {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ProjectiveTransform(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(ProjectiveTransform projectiveTransform) {
        if (projectiveTransform == null) {
            return 0L;
        }
        return projectiveTransform.swigCPtr;
    }

    public static long swigRelease(ProjectiveTransform projectiveTransform) {
        if (projectiveTransform == null) {
            return 0L;
        }
        if (!projectiveTransform.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = projectiveTransform.swigCPtr;
        projectiveTransform.swigCMemOwn = false;
        projectiveTransform.delete();
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
                jnisecommonJNI.delete_ProjectiveTransform(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public static boolean CanCreate(Quadrangle quadrangle, Quadrangle quadrangle2) {
        return jnisecommonJNI.ProjectiveTransform_CanCreate__SWIG_0(Quadrangle.getCPtr(quadrangle), quadrangle, Quadrangle.getCPtr(quadrangle2), quadrangle2);
    }

    public static boolean CanCreate(Quadrangle quadrangle, Size size) {
        return jnisecommonJNI.ProjectiveTransform_CanCreate__SWIG_1(Quadrangle.getCPtr(quadrangle), quadrangle, Size.getCPtr(size), size);
    }

    public static ProjectiveTransform Create() {
        long jProjectiveTransform_Create__SWIG_0 = jnisecommonJNI.ProjectiveTransform_Create__SWIG_0();
        if (jProjectiveTransform_Create__SWIG_0 == 0) {
            return null;
        }
        return new ProjectiveTransform(jProjectiveTransform_Create__SWIG_0, true);
    }

    public static ProjectiveTransform Create(Quadrangle quadrangle, Quadrangle quadrangle2) {
        long jProjectiveTransform_Create__SWIG_1 = jnisecommonJNI.ProjectiveTransform_Create__SWIG_1(Quadrangle.getCPtr(quadrangle), quadrangle, Quadrangle.getCPtr(quadrangle2), quadrangle2);
        if (jProjectiveTransform_Create__SWIG_1 == 0) {
            return null;
        }
        return new ProjectiveTransform(jProjectiveTransform_Create__SWIG_1, true);
    }

    public static ProjectiveTransform Create(Quadrangle quadrangle, Size size) {
        long jProjectiveTransform_Create__SWIG_2 = jnisecommonJNI.ProjectiveTransform_Create__SWIG_2(Quadrangle.getCPtr(quadrangle), quadrangle, Size.getCPtr(size), size);
        if (jProjectiveTransform_Create__SWIG_2 == 0) {
            return null;
        }
        return new ProjectiveTransform(jProjectiveTransform_Create__SWIG_2, true);
    }

    public ProjectiveTransform Clone() {
        long jProjectiveTransform_Clone = jnisecommonJNI.ProjectiveTransform_Clone(this.swigCPtr, this);
        if (jProjectiveTransform_Clone == 0) {
            return null;
        }
        return new ProjectiveTransform(jProjectiveTransform_Clone, true);
    }

    public Point TransformPoint(Point point) {
        return new Point(jnisecommonJNI.ProjectiveTransform_TransformPoint(this.swigCPtr, this, Point.getCPtr(point), point), true);
    }

    public Quadrangle TransformQuad(Quadrangle quadrangle) {
        return new Quadrangle(jnisecommonJNI.ProjectiveTransform_TransformQuad(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle), true);
    }

    public Polygon TransformPolygon(Polygon polygon) {
        return new Polygon(jnisecommonJNI.ProjectiveTransform_TransformPolygon(this.swigCPtr, this, Polygon.getCPtr(polygon), polygon), true);
    }

    public boolean IsInvertable() {
        return jnisecommonJNI.ProjectiveTransform_IsInvertable(this.swigCPtr, this);
    }

    public void Invert() {
        jnisecommonJNI.ProjectiveTransform_Invert(this.swigCPtr, this);
    }

    public ProjectiveTransform CloneInverted() {
        long jProjectiveTransform_CloneInverted = jnisecommonJNI.ProjectiveTransform_CloneInverted(this.swigCPtr, this);
        if (jProjectiveTransform_CloneInverted == 0) {
            return null;
        }
        return new ProjectiveTransform(jProjectiveTransform_CloneInverted, true);
    }

    public void Serialize(Serializer serializer) {
        jnisecommonJNI.ProjectiveTransform_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
