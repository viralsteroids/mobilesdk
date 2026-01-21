package com.smartengines.code;

/* loaded from: classes3.dex */
public class CodeEngineResult {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CodeEngineResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(CodeEngineResult codeEngineResult) {
        if (codeEngineResult == null) {
            return 0L;
        }
        return codeEngineResult.swigCPtr;
    }

    public static long swigRelease(CodeEngineResult codeEngineResult) {
        if (codeEngineResult == null) {
            return 0L;
        }
        if (!codeEngineResult.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = codeEngineResult.swigCPtr;
        codeEngineResult.swigCMemOwn = false;
        codeEngineResult.delete();
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
                jnicodeengineJNI.delete_CodeEngineResult(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public CodeEngineResult(boolean z) {
        this(jnicodeengineJNI.new_CodeEngineResult__SWIG_0(z), true);
    }

    public CodeEngineResult() {
        this(jnicodeengineJNI.new_CodeEngineResult__SWIG_1(), true);
    }

    public CodeEngineResult(CodeEngineResult codeEngineResult) {
        this(jnicodeengineJNI.new_CodeEngineResult__SWIG_2(getCPtr(codeEngineResult), codeEngineResult), true);
    }

    public int GetObjectCount() {
        return jnicodeengineJNI.CodeEngineResult_GetObjectCount(this.swigCPtr, this);
    }

    public boolean HasObject(String str) {
        return jnicodeengineJNI.CodeEngineResult_HasObject(this.swigCPtr, this, str);
    }

    public CodeObject GetCodeObject(String str) {
        return new CodeObject(jnicodeengineJNI.CodeEngineResult_GetCodeObject(this.swigCPtr, this, str), false);
    }

    public void SetCodeObject(String str, CodeObject codeObject) {
        jnicodeengineJNI.CodeEngineResult_SetCodeObject(this.swigCPtr, this, str, CodeObject.getCPtr(codeObject), codeObject);
    }

    public CodeObjectsMapIterator ObjectsBegin() {
        return new CodeObjectsMapIterator(jnicodeengineJNI.CodeEngineResult_ObjectsBegin(this.swigCPtr, this), true);
    }

    public CodeObjectsMapIterator ObjectsEnd() {
        return new CodeObjectsMapIterator(jnicodeengineJNI.CodeEngineResult_ObjectsEnd(this.swigCPtr, this), true);
    }

    public boolean IsTerminal() {
        return jnicodeengineJNI.CodeEngineResult_IsTerminal(this.swigCPtr, this);
    }

    public void SetTerminal(boolean z) {
        jnicodeengineJNI.CodeEngineResult_SetTerminal__SWIG_0(this.swigCPtr, this, z);
    }

    public void SetTerminal() {
        jnicodeengineJNI.CodeEngineResult_SetTerminal__SWIG_1(this.swigCPtr, this);
    }

    public void Reset() {
        jnicodeengineJNI.CodeEngineResult_Reset(this.swigCPtr, this);
    }
}
