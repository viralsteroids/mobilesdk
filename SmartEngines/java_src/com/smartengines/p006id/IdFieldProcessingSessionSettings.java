package com.smartengines.p006id;

import com.smartengines.common.StringsMapIterator;
import com.smartengines.common.StringsSetIterator;

/* loaded from: classes3.dex */
public class IdFieldProcessingSessionSettings {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdFieldProcessingSessionSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdFieldProcessingSessionSettings idFieldProcessingSessionSettings) {
        if (idFieldProcessingSessionSettings == null) {
            return 0L;
        }
        return idFieldProcessingSessionSettings.swigCPtr;
    }

    public static long swigRelease(IdFieldProcessingSessionSettings idFieldProcessingSessionSettings) {
        if (idFieldProcessingSessionSettings == null) {
            return 0L;
        }
        if (!idFieldProcessingSessionSettings.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idFieldProcessingSessionSettings.swigCPtr;
        idFieldProcessingSessionSettings.swigCMemOwn = false;
        idFieldProcessingSessionSettings.delete();
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
                jniidengineJNI.delete_IdFieldProcessingSessionSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdFieldProcessingSessionSettings Clone() {
        long jIdFieldProcessingSessionSettings_Clone = jniidengineJNI.IdFieldProcessingSessionSettings_Clone(this.swigCPtr, this);
        if (jIdFieldProcessingSessionSettings_Clone == 0) {
            return null;
        }
        return new IdFieldProcessingSessionSettings(jIdFieldProcessingSessionSettings_Clone, true);
    }

    public int GetSupportedFieldProcessorsCount() {
        return jniidengineJNI.m497x5aa97904(this.swigCPtr, this);
    }

    public boolean HasSupportedFieldProcessor(String str) {
        return jniidengineJNI.IdFieldProcessingSessionSettings_HasSupportedFieldProcessor(this.swigCPtr, this, str);
    }

    public StringsSetIterator SupportedFieldProcessorsBegin() {
        return new StringsSetIterator(jniidengineJNI.IdFieldProcessingSessionSettings_SupportedFieldProcessorsBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator SupportedFieldProcessorsEnd() {
        return new StringsSetIterator(jniidengineJNI.IdFieldProcessingSessionSettings_SupportedFieldProcessorsEnd(this.swigCPtr, this), true);
    }

    public String GetCurrentFieldProcessor() {
        return jniidengineJNI.IdFieldProcessingSessionSettings_GetCurrentFieldProcessor(this.swigCPtr, this);
    }

    public void SetCurrentFieldProcessor(String str) {
        jniidengineJNI.IdFieldProcessingSessionSettings_SetCurrentFieldProcessor(this.swigCPtr, this, str);
    }

    public int GetOptionsCount() {
        return jniidengineJNI.IdFieldProcessingSessionSettings_GetOptionsCount(this.swigCPtr, this);
    }

    public String GetOption(String str) {
        return jniidengineJNI.IdFieldProcessingSessionSettings_GetOption(this.swigCPtr, this, str);
    }

    public boolean HasOption(String str) {
        return jniidengineJNI.IdFieldProcessingSessionSettings_HasOption(this.swigCPtr, this, str);
    }

    public void SetOption(String str, String str2) {
        jniidengineJNI.IdFieldProcessingSessionSettings_SetOption(this.swigCPtr, this, str, str2);
    }

    public void RemoveOption(String str) {
        jniidengineJNI.IdFieldProcessingSessionSettings_RemoveOption(this.swigCPtr, this, str);
    }

    public StringsMapIterator OptionsBegin() {
        return new StringsMapIterator(jniidengineJNI.IdFieldProcessingSessionSettings_OptionsBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator OptionsEnd() {
        return new StringsMapIterator(jniidengineJNI.IdFieldProcessingSessionSettings_OptionsEnd(this.swigCPtr, this), true);
    }
}
