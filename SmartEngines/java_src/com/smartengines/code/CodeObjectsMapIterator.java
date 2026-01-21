package com.smartengines.code;

/* loaded from: classes3.dex */
public class CodeObjectsMapIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CodeObjectsMapIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(CodeObjectsMapIterator codeObjectsMapIterator) {
        if (codeObjectsMapIterator == null) {
            return 0L;
        }
        return codeObjectsMapIterator.swigCPtr;
    }

    public static long swigRelease(CodeObjectsMapIterator codeObjectsMapIterator) {
        if (codeObjectsMapIterator == null) {
            return 0L;
        }
        if (!codeObjectsMapIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = codeObjectsMapIterator.swigCPtr;
        codeObjectsMapIterator.swigCMemOwn = false;
        codeObjectsMapIterator.delete();
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
                jnicodeengineJNI.delete_CodeObjectsMapIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public CodeObjectsMapIterator(CodeObjectsMapIterator codeObjectsMapIterator) {
        this(jnicodeengineJNI.new_CodeObjectsMapIterator(getCPtr(codeObjectsMapIterator), codeObjectsMapIterator), true);
    }

    public String GetKey() {
        return jnicodeengineJNI.CodeObjectsMapIterator_GetKey(this.swigCPtr, this);
    }

    public CodeObject GetValue() {
        return new CodeObject(jnicodeengineJNI.CodeObjectsMapIterator_GetValue(this.swigCPtr, this), false);
    }

    public boolean Equals(CodeObjectsMapIterator codeObjectsMapIterator) {
        return jnicodeengineJNI.CodeObjectsMapIterator_Equals(this.swigCPtr, this, getCPtr(codeObjectsMapIterator), codeObjectsMapIterator);
    }

    public void Advance() {
        jnicodeengineJNI.CodeObjectsMapIterator_Advance(this.swigCPtr, this);
    }
}
