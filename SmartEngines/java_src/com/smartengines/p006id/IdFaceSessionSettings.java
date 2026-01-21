package com.smartengines.p006id;

import com.smartengines.common.StringsMapIterator;

/* loaded from: classes3.dex */
public class IdFaceSessionSettings {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdFaceSessionSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdFaceSessionSettings idFaceSessionSettings) {
        if (idFaceSessionSettings == null) {
            return 0L;
        }
        return idFaceSessionSettings.swigCPtr;
    }

    public static long swigRelease(IdFaceSessionSettings idFaceSessionSettings) {
        if (idFaceSessionSettings == null) {
            return 0L;
        }
        if (!idFaceSessionSettings.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idFaceSessionSettings.swigCPtr;
        idFaceSessionSettings.swigCMemOwn = false;
        idFaceSessionSettings.delete();
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
                jniidengineJNI.delete_IdFaceSessionSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdFaceSessionSettings Clone() {
        long jIdFaceSessionSettings_Clone = jniidengineJNI.IdFaceSessionSettings_Clone(this.swigCPtr, this);
        if (jIdFaceSessionSettings_Clone == 0) {
            return null;
        }
        return new IdFaceSessionSettings(jIdFaceSessionSettings_Clone, true);
    }

    public int GetOptionsCount() {
        return jniidengineJNI.IdFaceSessionSettings_GetOptionsCount(this.swigCPtr, this);
    }

    public String GetOption(String str) {
        return jniidengineJNI.IdFaceSessionSettings_GetOption(this.swigCPtr, this, str);
    }

    public boolean HasOption(String str) {
        return jniidengineJNI.IdFaceSessionSettings_HasOption(this.swigCPtr, this, str);
    }

    public void SetOption(String str, String str2) {
        jniidengineJNI.IdFaceSessionSettings_SetOption(this.swigCPtr, this, str, str2);
    }

    public void RemoveOption(String str) {
        jniidengineJNI.IdFaceSessionSettings_RemoveOption(this.swigCPtr, this, str);
    }

    public StringsMapIterator OptionsBegin() {
        return new StringsMapIterator(jniidengineJNI.IdFaceSessionSettings_OptionsBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator OptionsEnd() {
        return new StringsMapIterator(jniidengineJNI.IdFaceSessionSettings_OptionsEnd(this.swigCPtr, this), true);
    }

    public int GetSupportedLivenessInstructionsCount() {
        return jniidengineJNI.IdFaceSessionSettings_GetSupportedLivenessInstructionsCount(this.swigCPtr, this);
    }

    public boolean HasSupportedLivenessInstruction(String str) {
        return jniidengineJNI.IdFaceSessionSettings_HasSupportedLivenessInstruction(this.swigCPtr, this, str);
    }

    public String GetLivenessInstructionDescription(String str) {
        return jniidengineJNI.IdFaceSessionSettings_GetLivenessInstructionDescription(this.swigCPtr, this, str);
    }

    public StringsMapIterator SupportedLivenessInstructionsBegin() {
        return new StringsMapIterator(jniidengineJNI.IdFaceSessionSettings_SupportedLivenessInstructionsBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator SupportedLivenessInstructionsEnd() {
        return new StringsMapIterator(jniidengineJNI.IdFaceSessionSettings_SupportedLivenessInstructionsEnd(this.swigCPtr, this), true);
    }
}
