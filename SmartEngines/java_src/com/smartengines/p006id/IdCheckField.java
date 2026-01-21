package com.smartengines.p006id;

/* loaded from: classes3.dex */
public class IdCheckField {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdCheckField(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdCheckField idCheckField) {
        if (idCheckField == null) {
            return 0L;
        }
        return idCheckField.swigCPtr;
    }

    public static long swigRelease(IdCheckField idCheckField) {
        if (idCheckField == null) {
            return 0L;
        }
        if (!idCheckField.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idCheckField.swigCPtr;
        idCheckField.swigCMemOwn = false;
        idCheckField.delete();
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
                jniidengineJNI.delete_IdCheckField(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdCheckField() {
        this(jniidengineJNI.new_IdCheckField__SWIG_0(), true);
    }

    public IdCheckField(String str, IdCheckStatus idCheckStatus, boolean z, double d) {
        this(jniidengineJNI.new_IdCheckField__SWIG_1(str, idCheckStatus.swigValue(), z, d), true);
    }

    public IdCheckField(String str, IdCheckStatus idCheckStatus, boolean z) {
        this(jniidengineJNI.new_IdCheckField__SWIG_2(str, idCheckStatus.swigValue(), z), true);
    }

    public IdCheckField(String str, IdCheckStatus idCheckStatus) {
        this(jniidengineJNI.new_IdCheckField__SWIG_3(str, idCheckStatus.swigValue()), true);
    }

    public IdCheckField(IdCheckField idCheckField) {
        this(jniidengineJNI.new_IdCheckField__SWIG_4(getCPtr(idCheckField), idCheckField), true);
    }

    public String GetName() {
        return jniidengineJNI.IdCheckField_GetName(this.swigCPtr, this);
    }

    public void SetName(String str) {
        jniidengineJNI.IdCheckField_SetName(this.swigCPtr, this, str);
    }

    public IdCheckStatus GetValue() {
        return IdCheckStatus.swigToEnum(jniidengineJNI.IdCheckField_GetValue(this.swigCPtr, this));
    }

    public void SetValue(IdCheckStatus idCheckStatus) {
        jniidengineJNI.IdCheckField_SetValue(this.swigCPtr, this, idCheckStatus.swigValue());
    }

    public IdBaseFieldInfo GetBaseFieldInfo() {
        return new IdBaseFieldInfo(jniidengineJNI.IdCheckField_GetBaseFieldInfo(this.swigCPtr, this), false);
    }

    public IdBaseFieldInfo GetMutableBaseFieldInfo() {
        return new IdBaseFieldInfo(jniidengineJNI.IdCheckField_GetMutableBaseFieldInfo(this.swigCPtr, this), false);
    }
}
