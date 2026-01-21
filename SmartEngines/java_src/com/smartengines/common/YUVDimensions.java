package com.smartengines.common;

/* loaded from: classes3.dex */
public class YUVDimensions {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public YUVDimensions(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(YUVDimensions yUVDimensions) {
        if (yUVDimensions == null) {
            return 0L;
        }
        return yUVDimensions.swigCPtr;
    }

    public static long swigRelease(YUVDimensions yUVDimensions) {
        if (yUVDimensions == null) {
            return 0L;
        }
        if (!yUVDimensions.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = yUVDimensions.swigCPtr;
        yUVDimensions.swigCMemOwn = false;
        yUVDimensions.delete();
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
                jnisecommonJNI.delete_YUVDimensions(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public YUVDimensions() {
        this(jnisecommonJNI.new_YUVDimensions__SWIG_0(), true);
    }

    public YUVDimensions(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, YUVType yUVType) {
        this(jnisecommonJNI.new_YUVDimensions__SWIG_1(i, i2, i3, i4, i5, i6, i7, i8, yUVType.swigValue()), true);
    }

    public void setY_plane_pixel_stride(int i) {
        jnisecommonJNI.YUVDimensions_y_plane_pixel_stride_set(this.swigCPtr, this, i);
    }

    public int getY_plane_pixel_stride() {
        return jnisecommonJNI.YUVDimensions_y_plane_pixel_stride_get(this.swigCPtr, this);
    }

    public void setY_plane_row_stride(int i) {
        jnisecommonJNI.YUVDimensions_y_plane_row_stride_set(this.swigCPtr, this, i);
    }

    public int getY_plane_row_stride() {
        return jnisecommonJNI.YUVDimensions_y_plane_row_stride_get(this.swigCPtr, this);
    }

    public void setU_plane_pixel_stride(int i) {
        jnisecommonJNI.YUVDimensions_u_plane_pixel_stride_set(this.swigCPtr, this, i);
    }

    public int getU_plane_pixel_stride() {
        return jnisecommonJNI.YUVDimensions_u_plane_pixel_stride_get(this.swigCPtr, this);
    }

    public void setU_plane_row_stride(int i) {
        jnisecommonJNI.YUVDimensions_u_plane_row_stride_set(this.swigCPtr, this, i);
    }

    public int getU_plane_row_stride() {
        return jnisecommonJNI.YUVDimensions_u_plane_row_stride_get(this.swigCPtr, this);
    }

    public void setV_plane_pixel_stride(int i) {
        jnisecommonJNI.YUVDimensions_v_plane_pixel_stride_set(this.swigCPtr, this, i);
    }

    public int getV_plane_pixel_stride() {
        return jnisecommonJNI.YUVDimensions_v_plane_pixel_stride_get(this.swigCPtr, this);
    }

    public void setV_plane_row_stride(int i) {
        jnisecommonJNI.YUVDimensions_v_plane_row_stride_set(this.swigCPtr, this, i);
    }

    public int getV_plane_row_stride() {
        return jnisecommonJNI.YUVDimensions_v_plane_row_stride_get(this.swigCPtr, this);
    }

    public void setWidth(int i) {
        jnisecommonJNI.YUVDimensions_width_set(this.swigCPtr, this, i);
    }

    public int getWidth() {
        return jnisecommonJNI.YUVDimensions_width_get(this.swigCPtr, this);
    }

    public void setHeight(int i) {
        jnisecommonJNI.YUVDimensions_height_set(this.swigCPtr, this, i);
    }

    public int getHeight() {
        return jnisecommonJNI.YUVDimensions_height_get(this.swigCPtr, this);
    }

    public void setType(YUVType yUVType) {
        jnisecommonJNI.YUVDimensions_type_set(this.swigCPtr, this, yUVType.swigValue());
    }

    public YUVType getType() {
        return YUVType.swigToEnum(jnisecommonJNI.YUVDimensions_type_get(this.swigCPtr, this));
    }
}
