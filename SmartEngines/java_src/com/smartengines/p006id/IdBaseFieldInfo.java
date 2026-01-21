package com.smartengines.p006id;

import com.smartengines.common.StringsMapIterator;

/* loaded from: classes3.dex */
public class IdBaseFieldInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdBaseFieldInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdBaseFieldInfo idBaseFieldInfo) {
        if (idBaseFieldInfo == null) {
            return 0L;
        }
        return idBaseFieldInfo.swigCPtr;
    }

    public static long swigRelease(IdBaseFieldInfo idBaseFieldInfo) {
        if (idBaseFieldInfo == null) {
            return 0L;
        }
        if (!idBaseFieldInfo.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idBaseFieldInfo.swigCPtr;
        idBaseFieldInfo.swigCMemOwn = false;
        idBaseFieldInfo.delete();
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
                jniidengineJNI.delete_IdBaseFieldInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdBaseFieldInfo(boolean z, double d) {
        this(jniidengineJNI.new_IdBaseFieldInfo__SWIG_0(z, d), true);
    }

    public IdBaseFieldInfo(boolean z) {
        this(jniidengineJNI.new_IdBaseFieldInfo__SWIG_1(z), true);
    }

    public IdBaseFieldInfo() {
        this(jniidengineJNI.new_IdBaseFieldInfo__SWIG_2(), true);
    }

    public IdBaseFieldInfo(IdBaseFieldInfo idBaseFieldInfo) {
        this(jniidengineJNI.new_IdBaseFieldInfo__SWIG_3(getCPtr(idBaseFieldInfo), idBaseFieldInfo), true);
    }

    public boolean GetIsAccepted() {
        return jniidengineJNI.IdBaseFieldInfo_GetIsAccepted(this.swigCPtr, this);
    }

    public void SetIsAccepted(boolean z) {
        jniidengineJNI.IdBaseFieldInfo_SetIsAccepted(this.swigCPtr, this, z);
    }

    public double GetConfidence() {
        return jniidengineJNI.IdBaseFieldInfo_GetConfidence(this.swigCPtr, this);
    }

    public void SetConfidence(double d) {
        jniidengineJNI.IdBaseFieldInfo_SetConfidence(this.swigCPtr, this, d);
    }

    public int GetAttributesCount() {
        return jniidengineJNI.IdBaseFieldInfo_GetAttributesCount(this.swigCPtr, this);
    }

    public String GetAttribute(String str) {
        return jniidengineJNI.IdBaseFieldInfo_GetAttribute(this.swigCPtr, this, str);
    }

    public boolean HasAttribute(String str) {
        return jniidengineJNI.IdBaseFieldInfo_HasAttribute(this.swigCPtr, this, str);
    }

    public void SetAttribute(String str, String str2) {
        jniidengineJNI.IdBaseFieldInfo_SetAttribute(this.swigCPtr, this, str, str2);
    }

    public void RemoveAttribute(String str) {
        jniidengineJNI.IdBaseFieldInfo_RemoveAttribute(this.swigCPtr, this, str);
    }

    public StringsMapIterator AttributesBegin() {
        return new StringsMapIterator(jniidengineJNI.IdBaseFieldInfo_AttributesBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator AttributesEnd() {
        return new StringsMapIterator(jniidengineJNI.IdBaseFieldInfo_AttributesEnd(this.swigCPtr, this), true);
    }
}
