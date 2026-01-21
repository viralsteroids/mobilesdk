package com.smartengines.p006id;

/* loaded from: classes3.dex */
public class IdVideoAuthenticationAnomaly {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdVideoAuthenticationAnomaly(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly) {
        if (idVideoAuthenticationAnomaly == null) {
            return 0L;
        }
        return idVideoAuthenticationAnomaly.swigCPtr;
    }

    public static long swigRelease(IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly) {
        if (idVideoAuthenticationAnomaly == null) {
            return 0L;
        }
        if (!idVideoAuthenticationAnomaly.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idVideoAuthenticationAnomaly.swigCPtr;
        idVideoAuthenticationAnomaly.swigCMemOwn = false;
        idVideoAuthenticationAnomaly.delete();
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
                jniidengineJNI.delete_IdVideoAuthenticationAnomaly(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdVideoAuthenticationAnomaly(String str, int i, int i2, boolean z, double d) {
        this(jniidengineJNI.new_IdVideoAuthenticationAnomaly__SWIG_0(str, i, i2, z, d), true);
    }

    public IdVideoAuthenticationAnomaly(String str, int i, int i2, boolean z) {
        this(jniidengineJNI.new_IdVideoAuthenticationAnomaly__SWIG_1(str, i, i2, z), true);
    }

    public IdVideoAuthenticationAnomaly(String str, int i, int i2) {
        this(jniidengineJNI.new_IdVideoAuthenticationAnomaly__SWIG_2(str, i, i2), true);
    }

    public IdVideoAuthenticationAnomaly(IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly) {
        this(jniidengineJNI.new_IdVideoAuthenticationAnomaly__SWIG_3(getCPtr(idVideoAuthenticationAnomaly), idVideoAuthenticationAnomaly), true);
    }

    public String GetName() {
        return jniidengineJNI.IdVideoAuthenticationAnomaly_GetName(this.swigCPtr, this);
    }

    public void SetName(String str) {
        jniidengineJNI.IdVideoAuthenticationAnomaly_SetName(this.swigCPtr, this, str);
    }

    public int GetStartFrame() {
        return jniidengineJNI.IdVideoAuthenticationAnomaly_GetStartFrame(this.swigCPtr, this);
    }

    public void SetStartFrame(int i) {
        jniidengineJNI.IdVideoAuthenticationAnomaly_SetStartFrame(this.swigCPtr, this, i);
    }

    public int GetEndFrame() {
        return jniidengineJNI.IdVideoAuthenticationAnomaly_GetEndFrame(this.swigCPtr, this);
    }

    public void SetEndFrame(int i) {
        jniidengineJNI.IdVideoAuthenticationAnomaly_SetEndFrame(this.swigCPtr, this, i);
    }

    public IdBaseFieldInfo GetBaseFieldInfo() {
        return new IdBaseFieldInfo(jniidengineJNI.IdVideoAuthenticationAnomaly_GetBaseFieldInfo(this.swigCPtr, this), false);
    }

    public IdBaseFieldInfo GetMutableBaseFieldInfo() {
        return new IdBaseFieldInfo(jniidengineJNI.IdVideoAuthenticationAnomaly_GetMutableBaseFieldInfo(this.swigCPtr, this), false);
    }
}
