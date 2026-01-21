package com.smartengines.p006id;

import com.smartengines.common.Image;

/* loaded from: classes3.dex */
public class IdAnimatedField {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdAnimatedField(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdAnimatedField idAnimatedField) {
        if (idAnimatedField == null) {
            return 0L;
        }
        return idAnimatedField.swigCPtr;
    }

    public static long swigRelease(IdAnimatedField idAnimatedField) {
        if (idAnimatedField == null) {
            return 0L;
        }
        if (!idAnimatedField.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idAnimatedField.swigCPtr;
        idAnimatedField.swigCMemOwn = false;
        idAnimatedField.delete();
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
                jniidengineJNI.delete_IdAnimatedField(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdAnimatedField() {
        this(jniidengineJNI.new_IdAnimatedField__SWIG_0(), true);
    }

    public IdAnimatedField(String str, boolean z, double d) {
        this(jniidengineJNI.new_IdAnimatedField__SWIG_1(str, z, d), true);
    }

    public IdAnimatedField(String str, boolean z) {
        this(jniidengineJNI.new_IdAnimatedField__SWIG_2(str, z), true);
    }

    public IdAnimatedField(String str) {
        this(jniidengineJNI.new_IdAnimatedField__SWIG_3(str), true);
    }

    public IdAnimatedField(IdAnimatedField idAnimatedField) {
        this(jniidengineJNI.new_IdAnimatedField__SWIG_4(getCPtr(idAnimatedField), idAnimatedField), true);
    }

    public String GetName() {
        return jniidengineJNI.IdAnimatedField_GetName(this.swigCPtr, this);
    }

    public void SetName(String str) {
        jniidengineJNI.IdAnimatedField_SetName(this.swigCPtr, this, str);
    }

    public int GetFramesCount() {
        return jniidengineJNI.IdAnimatedField_GetFramesCount(this.swigCPtr, this);
    }

    public Image GetFrame(int i) {
        return new Image(jniidengineJNI.IdAnimatedField_GetFrame(this.swigCPtr, this, i), false);
    }

    public void AppendFrame(Image image) {
        jniidengineJNI.IdAnimatedField_AppendFrame(this.swigCPtr, this, Image.getCPtr(image), image);
    }

    public void ClearFrames() {
        jniidengineJNI.IdAnimatedField_ClearFrames(this.swigCPtr, this);
    }

    public IdBaseFieldInfo GetBaseFieldInfo() {
        return new IdBaseFieldInfo(jniidengineJNI.IdAnimatedField_GetBaseFieldInfo(this.swigCPtr, this), false);
    }

    public IdBaseFieldInfo GetMutableBaseFieldInfo() {
        return new IdBaseFieldInfo(jniidengineJNI.IdAnimatedField_GetMutableBaseFieldInfo(this.swigCPtr, this), false);
    }
}
