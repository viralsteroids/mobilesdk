package com.smartengines.p006id;

import com.smartengines.common.OcrString;

/* loaded from: classes3.dex */
public class IdTextField {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdTextField(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdTextField idTextField) {
        if (idTextField == null) {
            return 0L;
        }
        return idTextField.swigCPtr;
    }

    public static long swigRelease(IdTextField idTextField) {
        if (idTextField == null) {
            return 0L;
        }
        if (!idTextField.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idTextField.swigCPtr;
        idTextField.swigCMemOwn = false;
        idTextField.delete();
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
                jniidengineJNI.delete_IdTextField(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdTextField() {
        this(jniidengineJNI.new_IdTextField__SWIG_0(), true);
    }

    public IdTextField(String str, OcrString ocrString, boolean z, double d) {
        this(jniidengineJNI.new_IdTextField__SWIG_1(str, OcrString.getCPtr(ocrString), ocrString, z, d), true);
    }

    public IdTextField(String str, OcrString ocrString, boolean z) {
        this(jniidengineJNI.new_IdTextField__SWIG_2(str, OcrString.getCPtr(ocrString), ocrString, z), true);
    }

    public IdTextField(String str, OcrString ocrString) {
        this(jniidengineJNI.new_IdTextField__SWIG_3(str, OcrString.getCPtr(ocrString), ocrString), true);
    }

    public IdTextField(String str, String str2, boolean z, double d) {
        this(jniidengineJNI.new_IdTextField__SWIG_4(str, str2, z, d), true);
    }

    public IdTextField(String str, String str2, boolean z) {
        this(jniidengineJNI.new_IdTextField__SWIG_5(str, str2, z), true);
    }

    public IdTextField(String str, String str2) {
        this(jniidengineJNI.new_IdTextField__SWIG_6(str, str2), true);
    }

    public IdTextField(IdTextField idTextField) {
        this(jniidengineJNI.new_IdTextField__SWIG_7(getCPtr(idTextField), idTextField), true);
    }

    public String GetName() {
        return jniidengineJNI.IdTextField_GetName(this.swigCPtr, this);
    }

    public void SetName(String str) {
        jniidengineJNI.IdTextField_SetName(this.swigCPtr, this, str);
    }

    public OcrString GetValue() {
        return new OcrString(jniidengineJNI.IdTextField_GetValue(this.swigCPtr, this), false);
    }

    public void SetValue(OcrString ocrString) {
        jniidengineJNI.IdTextField_SetValue__SWIG_0(this.swigCPtr, this, OcrString.getCPtr(ocrString), ocrString);
    }

    public void SetValue(String str) {
        jniidengineJNI.IdTextField_SetValue__SWIG_1(this.swigCPtr, this, str);
    }

    public IdBaseFieldInfo GetBaseFieldInfo() {
        return new IdBaseFieldInfo(jniidengineJNI.IdTextField_GetBaseFieldInfo(this.swigCPtr, this), false);
    }

    public IdBaseFieldInfo GetMutableBaseFieldInfo() {
        return new IdBaseFieldInfo(jniidengineJNI.IdTextField_GetMutableBaseFieldInfo(this.swigCPtr, this), false);
    }
}
