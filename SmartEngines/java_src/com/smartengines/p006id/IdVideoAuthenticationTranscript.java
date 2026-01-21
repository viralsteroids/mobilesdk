package com.smartengines.p006id;

/* loaded from: classes3.dex */
public class IdVideoAuthenticationTranscript {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdVideoAuthenticationTranscript(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdVideoAuthenticationTranscript idVideoAuthenticationTranscript) {
        if (idVideoAuthenticationTranscript == null) {
            return 0L;
        }
        return idVideoAuthenticationTranscript.swigCPtr;
    }

    public static long swigRelease(IdVideoAuthenticationTranscript idVideoAuthenticationTranscript) {
        if (idVideoAuthenticationTranscript == null) {
            return 0L;
        }
        if (!idVideoAuthenticationTranscript.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idVideoAuthenticationTranscript.swigCPtr;
        idVideoAuthenticationTranscript.swigCMemOwn = false;
        idVideoAuthenticationTranscript.delete();
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
                jniidengineJNI.delete_IdVideoAuthenticationTranscript(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdVideoAuthenticationTranscript(IdVideoAuthenticationInstruction idVideoAuthenticationInstruction) {
        this(jniidengineJNI.new_IdVideoAuthenticationTranscript__SWIG_0(IdVideoAuthenticationInstruction.getCPtr(idVideoAuthenticationInstruction), idVideoAuthenticationInstruction), true);
    }

    public IdVideoAuthenticationTranscript(IdVideoAuthenticationTranscript idVideoAuthenticationTranscript) {
        this(jniidengineJNI.new_IdVideoAuthenticationTranscript__SWIG_1(getCPtr(idVideoAuthenticationTranscript), idVideoAuthenticationTranscript), true);
    }

    public int GetFrameInfosCount() {
        return jniidengineJNI.IdVideoAuthenticationTranscript_GetFrameInfosCount(this.swigCPtr, this);
    }

    public IdVideoAuthenticationFrameInfo GetFrameInfo(int i) {
        return new IdVideoAuthenticationFrameInfo(jniidengineJNI.IdVideoAuthenticationTranscript_GetFrameInfo(this.swigCPtr, this, i), false);
    }

    public IdVideoAuthenticationFrameInfo GetMutableFrameInfo(int i) {
        return new IdVideoAuthenticationFrameInfo(jniidengineJNI.IdVideoAuthenticationTranscript_GetMutableFrameInfo(this.swigCPtr, this, i), false);
    }

    public void AppendFrameInfo(IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo) {
        jniidengineJNI.IdVideoAuthenticationTranscript_AppendFrameInfo(this.swigCPtr, this, IdVideoAuthenticationFrameInfo.getCPtr(idVideoAuthenticationFrameInfo), idVideoAuthenticationFrameInfo);
    }

    public void SetFrameInfo(int i, IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo) {
        jniidengineJNI.IdVideoAuthenticationTranscript_SetFrameInfo(this.swigCPtr, this, i, IdVideoAuthenticationFrameInfo.getCPtr(idVideoAuthenticationFrameInfo), idVideoAuthenticationFrameInfo);
    }

    public void ResizeFrameInfosContainer(int i) {
        jniidengineJNI.IdVideoAuthenticationTranscript_ResizeFrameInfosContainer(this.swigCPtr, this, i);
    }

    public int GetInstructionsCount() {
        return jniidengineJNI.IdVideoAuthenticationTranscript_GetInstructionsCount(this.swigCPtr, this);
    }

    public IdVideoAuthenticationInstruction GetInstruction(int i) {
        return new IdVideoAuthenticationInstruction(jniidengineJNI.IdVideoAuthenticationTranscript_GetInstruction(this.swigCPtr, this, i), false);
    }

    public IdVideoAuthenticationInstruction GetMutableInstruction(int i) {
        return new IdVideoAuthenticationInstruction(jniidengineJNI.IdVideoAuthenticationTranscript_GetMutableInstruction(this.swigCPtr, this, i), false);
    }

    public void AppendInstruction(IdVideoAuthenticationInstruction idVideoAuthenticationInstruction) {
        jniidengineJNI.IdVideoAuthenticationTranscript_AppendInstruction(this.swigCPtr, this, IdVideoAuthenticationInstruction.getCPtr(idVideoAuthenticationInstruction), idVideoAuthenticationInstruction);
    }

    public void SetInstruction(int i, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction) {
        jniidengineJNI.IdVideoAuthenticationTranscript_SetInstruction(this.swigCPtr, this, i, IdVideoAuthenticationInstruction.getCPtr(idVideoAuthenticationInstruction), idVideoAuthenticationInstruction);
    }

    public void ResizeInstructionsContainer(int i) {
        jniidengineJNI.IdVideoAuthenticationTranscript_ResizeInstructionsContainer(this.swigCPtr, this, i);
    }

    public int GetAnomaliesCount() {
        return jniidengineJNI.IdVideoAuthenticationTranscript_GetAnomaliesCount(this.swigCPtr, this);
    }

    public IdVideoAuthenticationAnomaly GetAnomaly(int i) {
        return new IdVideoAuthenticationAnomaly(jniidengineJNI.IdVideoAuthenticationTranscript_GetAnomaly(this.swigCPtr, this, i), false);
    }

    public IdVideoAuthenticationAnomaly GetMutableAnomaly(int i) {
        return new IdVideoAuthenticationAnomaly(jniidengineJNI.IdVideoAuthenticationTranscript_GetMutableAnomaly(this.swigCPtr, this, i), false);
    }

    public void AppendAnomaly(IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly) {
        jniidengineJNI.IdVideoAuthenticationTranscript_AppendAnomaly(this.swigCPtr, this, IdVideoAuthenticationAnomaly.getCPtr(idVideoAuthenticationAnomaly), idVideoAuthenticationAnomaly);
    }

    public void SetAnomaly(int i, IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly) {
        jniidengineJNI.IdVideoAuthenticationTranscript_SetAnomaly(this.swigCPtr, this, i, IdVideoAuthenticationAnomaly.getCPtr(idVideoAuthenticationAnomaly), idVideoAuthenticationAnomaly);
    }

    public void ResizeAnomaliesContainer(int i) {
        jniidengineJNI.IdVideoAuthenticationTranscript_ResizeAnomaliesContainer(this.swigCPtr, this, i);
    }

    public IdVideoAuthenticationInstruction GetCurrentInstruction() {
        return new IdVideoAuthenticationInstruction(jniidengineJNI.IdVideoAuthenticationTranscript_GetCurrentInstruction(this.swigCPtr, this), false);
    }

    public IdVideoAuthenticationInstruction GetMutableCurrentInstruction() {
        return new IdVideoAuthenticationInstruction(jniidengineJNI.IdVideoAuthenticationTranscript_GetMutableCurrentInstruction(this.swigCPtr, this), false);
    }

    public void SetCurrentInstruction(IdVideoAuthenticationInstruction idVideoAuthenticationInstruction) {
        jniidengineJNI.IdVideoAuthenticationTranscript_SetCurrentInstruction(this.swigCPtr, this, IdVideoAuthenticationInstruction.getCPtr(idVideoAuthenticationInstruction), idVideoAuthenticationInstruction);
    }
}
