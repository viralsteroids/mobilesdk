package com.smartengines.code;

/* loaded from: classes3.dex */
public class CodeFieldsMapIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CodeFieldsMapIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(CodeFieldsMapIterator codeFieldsMapIterator) {
        if (codeFieldsMapIterator == null) {
            return 0L;
        }
        return codeFieldsMapIterator.swigCPtr;
    }

    public static long swigRelease(CodeFieldsMapIterator codeFieldsMapIterator) {
        if (codeFieldsMapIterator == null) {
            return 0L;
        }
        if (!codeFieldsMapIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = codeFieldsMapIterator.swigCPtr;
        codeFieldsMapIterator.swigCMemOwn = false;
        codeFieldsMapIterator.delete();
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
                jnicodeengineJNI.delete_CodeFieldsMapIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public CodeFieldsMapIterator(CodeFieldsMapIterator codeFieldsMapIterator) {
        this(jnicodeengineJNI.new_CodeFieldsMapIterator(getCPtr(codeFieldsMapIterator), codeFieldsMapIterator), true);
    }

    public String GetKey() {
        return jnicodeengineJNI.CodeFieldsMapIterator_GetKey(this.swigCPtr, this);
    }

    public CodeField GetValue() {
        return new CodeField(jnicodeengineJNI.CodeFieldsMapIterator_GetValue(this.swigCPtr, this), false);
    }

    public boolean Equals(CodeFieldsMapIterator codeFieldsMapIterator) {
        return jnicodeengineJNI.CodeFieldsMapIterator_Equals(this.swigCPtr, this, getCPtr(codeFieldsMapIterator), codeFieldsMapIterator);
    }

    public void Advance() {
        jnicodeengineJNI.CodeFieldsMapIterator_Advance(this.swigCPtr, this);
    }
}
