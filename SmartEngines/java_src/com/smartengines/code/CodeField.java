package com.smartengines.code;

import com.smartengines.common.ByteString;
import com.smartengines.common.OcrString;

/* loaded from: classes3.dex */
public class CodeField {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CodeField(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(CodeField codeField) {
        if (codeField == null) {
            return 0L;
        }
        return codeField.swigCPtr;
    }

    public static long swigRelease(CodeField codeField) {
        if (codeField == null) {
            return 0L;
        }
        if (!codeField.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = codeField.swigCPtr;
        codeField.swigCMemOwn = false;
        codeField.delete();
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
                jnicodeengineJNI.delete_CodeField(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public CodeField() {
        this(jnicodeengineJNI.new_CodeField__SWIG_0(), true);
    }

    public CodeField(String str, ByteString byteString, boolean z, float f) {
        this(jnicodeengineJNI.new_CodeField__SWIG_1(str, ByteString.getCPtr(byteString), byteString, z, f), true);
    }

    public CodeField(String str, ByteString byteString, boolean z) {
        this(jnicodeengineJNI.new_CodeField__SWIG_2(str, ByteString.getCPtr(byteString), byteString, z), true);
    }

    public CodeField(String str, ByteString byteString) {
        this(jnicodeengineJNI.new_CodeField__SWIG_3(str, ByteString.getCPtr(byteString), byteString), true);
    }

    public CodeField(String str, OcrString ocrString, boolean z, float f) {
        this(jnicodeengineJNI.new_CodeField__SWIG_4(str, OcrString.getCPtr(ocrString), ocrString, z, f), true);
    }

    public CodeField(String str, OcrString ocrString, boolean z) {
        this(jnicodeengineJNI.new_CodeField__SWIG_5(str, OcrString.getCPtr(ocrString), ocrString, z), true);
    }

    public CodeField(String str, OcrString ocrString) {
        this(jnicodeengineJNI.new_CodeField__SWIG_6(str, OcrString.getCPtr(ocrString), ocrString), true);
    }

    public CodeField(CodeField codeField) {
        this(jnicodeengineJNI.new_CodeField__SWIG_7(getCPtr(codeField), codeField), true);
    }

    public String Name() {
        return jnicodeengineJNI.CodeField_Name(this.swigCPtr, this);
    }

    public void SetName(String str) {
        jnicodeengineJNI.CodeField_SetName(this.swigCPtr, this, str);
    }

    public boolean IsAccepted() {
        return jnicodeengineJNI.CodeField_IsAccepted(this.swigCPtr, this);
    }

    public void SetIsAccepted(boolean z) {
        jnicodeengineJNI.CodeField_SetIsAccepted(this.swigCPtr, this, z);
    }

    public double GetConfidence() {
        return jnicodeengineJNI.CodeField_GetConfidence(this.swigCPtr, this);
    }

    public void SetConfidence(float f) {
        jnicodeengineJNI.CodeField_SetConfidence(this.swigCPtr, this, f);
    }

    public boolean IsTerminal() {
        return jnicodeengineJNI.CodeField_IsTerminal(this.swigCPtr, this);
    }

    public void SetIsTerminal(boolean z) {
        jnicodeengineJNI.CodeField_SetIsTerminal(this.swigCPtr, this, z);
    }

    public boolean HasBinaryRepresentation() {
        return jnicodeengineJNI.CodeField_HasBinaryRepresentation(this.swigCPtr, this);
    }

    public ByteString GetBinaryRepresentation() {
        return new ByteString(jnicodeengineJNI.CodeField_GetBinaryRepresentation(this.swigCPtr, this), false);
    }

    public void SetBinaryRepresentation(ByteString byteString) {
        jnicodeengineJNI.CodeField_SetBinaryRepresentation(this.swigCPtr, this, ByteString.getCPtr(byteString), byteString);
    }

    public boolean HasOcrStringRepresentation() {
        return jnicodeengineJNI.CodeField_HasOcrStringRepresentation(this.swigCPtr, this);
    }

    public OcrString GetOcrString() {
        return new OcrString(jnicodeengineJNI.CodeField_GetOcrString(this.swigCPtr, this), false);
    }

    public void SetOcrStringRepresentation(OcrString ocrString) {
        jnicodeengineJNI.CodeField_SetOcrStringRepresentation(this.swigCPtr, this, OcrString.getCPtr(ocrString), ocrString);
    }
}
