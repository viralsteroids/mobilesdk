package com.smartengines.p006id;

import com.smartengines.common.Image;

/* loaded from: classes3.dex */
public class IdImageField {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdImageField(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdImageField idImageField) {
        if (idImageField == null) {
            return 0L;
        }
        return idImageField.swigCPtr;
    }

    public static long swigRelease(IdImageField idImageField) {
        if (idImageField == null) {
            return 0L;
        }
        if (!idImageField.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idImageField.swigCPtr;
        idImageField.swigCMemOwn = false;
        idImageField.delete();
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
                jniidengineJNI.delete_IdImageField(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdImageField() {
        this(jniidengineJNI.new_IdImageField__SWIG_0(), true);
    }

    public IdImageField(String str, Image image, boolean z, double d) {
        this(jniidengineJNI.new_IdImageField__SWIG_1(str, Image.getCPtr(image), image, z, d), true);
    }

    public IdImageField(String str, Image image, boolean z) {
        this(jniidengineJNI.new_IdImageField__SWIG_2(str, Image.getCPtr(image), image, z), true);
    }

    public IdImageField(String str, Image image) {
        this(jniidengineJNI.new_IdImageField__SWIG_3(str, Image.getCPtr(image), image), true);
    }

    public IdImageField(IdImageField idImageField) {
        this(jniidengineJNI.new_IdImageField__SWIG_4(getCPtr(idImageField), idImageField), true);
    }

    public String GetName() {
        return jniidengineJNI.IdImageField_GetName(this.swigCPtr, this);
    }

    public void SetName(String str) {
        jniidengineJNI.IdImageField_SetName(this.swigCPtr, this, str);
    }

    public Image GetValue() {
        return new Image(jniidengineJNI.IdImageField_GetValue(this.swigCPtr, this), false);
    }

    public void SetValue(Image image) {
        jniidengineJNI.IdImageField_SetValue(this.swigCPtr, this, Image.getCPtr(image), image);
    }

    public IdBaseFieldInfo GetBaseFieldInfo() {
        return new IdBaseFieldInfo(jniidengineJNI.IdImageField_GetBaseFieldInfo(this.swigCPtr, this), false);
    }

    public IdBaseFieldInfo GetMutableBaseFieldInfo() {
        return new IdBaseFieldInfo(jniidengineJNI.IdImageField_GetMutableBaseFieldInfo(this.swigCPtr, this), false);
    }
}
