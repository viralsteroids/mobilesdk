package com.smartengines.p006id;

import com.smartengines.common.StringsMapIterator;

/* loaded from: classes3.dex */
public class IdVideoAuthenticationInstruction {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdVideoAuthenticationInstruction(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdVideoAuthenticationInstruction idVideoAuthenticationInstruction) {
        if (idVideoAuthenticationInstruction == null) {
            return 0L;
        }
        return idVideoAuthenticationInstruction.swigCPtr;
    }

    public static long swigRelease(IdVideoAuthenticationInstruction idVideoAuthenticationInstruction) {
        if (idVideoAuthenticationInstruction == null) {
            return 0L;
        }
        if (!idVideoAuthenticationInstruction.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idVideoAuthenticationInstruction.swigCPtr;
        idVideoAuthenticationInstruction.swigCMemOwn = false;
        idVideoAuthenticationInstruction.delete();
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
                jniidengineJNI.delete_IdVideoAuthenticationInstruction(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdVideoAuthenticationInstruction(int i, String str) {
        this(jniidengineJNI.new_IdVideoAuthenticationInstruction__SWIG_0(i, str), true);
    }

    public IdVideoAuthenticationInstruction(IdVideoAuthenticationInstruction idVideoAuthenticationInstruction) {
        this(jniidengineJNI.new_IdVideoAuthenticationInstruction__SWIG_1(getCPtr(idVideoAuthenticationInstruction), idVideoAuthenticationInstruction), true);
    }

    public int GetFrameIndex() {
        return jniidengineJNI.IdVideoAuthenticationInstruction_GetFrameIndex(this.swigCPtr, this);
    }

    public void SetFrameIndex(int i) {
        jniidengineJNI.IdVideoAuthenticationInstruction_SetFrameIndex(this.swigCPtr, this, i);
    }

    public String GetInstructionCode() {
        return jniidengineJNI.IdVideoAuthenticationInstruction_GetInstructionCode(this.swigCPtr, this);
    }

    public void SetInstructionCode(String str) {
        jniidengineJNI.IdVideoAuthenticationInstruction_SetInstructionCode(this.swigCPtr, this, str);
    }

    public int GetParametersCount() {
        return jniidengineJNI.IdVideoAuthenticationInstruction_GetParametersCount(this.swigCPtr, this);
    }

    public String GetParameter(String str) {
        return jniidengineJNI.IdVideoAuthenticationInstruction_GetParameter(this.swigCPtr, this, str);
    }

    public boolean HasParameter(String str) {
        return jniidengineJNI.IdVideoAuthenticationInstruction_HasParameter(this.swigCPtr, this, str);
    }

    public void SetParameter(String str, String str2) {
        jniidengineJNI.IdVideoAuthenticationInstruction_SetParameter(this.swigCPtr, this, str, str2);
    }

    public void RemoveParameter(String str) {
        jniidengineJNI.IdVideoAuthenticationInstruction_RemoveParameter(this.swigCPtr, this, str);
    }

    public StringsMapIterator ParametersBegin() {
        return new StringsMapIterator(jniidengineJNI.IdVideoAuthenticationInstruction_ParametersBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator ParametersEnd() {
        return new StringsMapIterator(jniidengineJNI.IdVideoAuthenticationInstruction_ParametersEnd(this.swigCPtr, this), true);
    }
}
