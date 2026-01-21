package com.smartengines.p006id;

import com.smartengines.common.StringsMapIterator;
import com.smartengines.common.StringsSetIterator;

/* loaded from: classes3.dex */
public class IdFileAnalysisSessionSettings {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdFileAnalysisSessionSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdFileAnalysisSessionSettings idFileAnalysisSessionSettings) {
        if (idFileAnalysisSessionSettings == null) {
            return 0L;
        }
        return idFileAnalysisSessionSettings.swigCPtr;
    }

    public static long swigRelease(IdFileAnalysisSessionSettings idFileAnalysisSessionSettings) {
        if (idFileAnalysisSessionSettings == null) {
            return 0L;
        }
        if (!idFileAnalysisSessionSettings.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idFileAnalysisSessionSettings.swigCPtr;
        idFileAnalysisSessionSettings.swigCMemOwn = false;
        idFileAnalysisSessionSettings.delete();
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
                jniidengineJNI.delete_IdFileAnalysisSessionSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdFileAnalysisSessionSettings Clone() {
        long jIdFileAnalysisSessionSettings_Clone = jniidengineJNI.IdFileAnalysisSessionSettings_Clone(this.swigCPtr, this);
        if (jIdFileAnalysisSessionSettings_Clone == 0) {
            return null;
        }
        return new IdFileAnalysisSessionSettings(jIdFileAnalysisSessionSettings_Clone, true);
    }

    public int GetOptionsCount() {
        return jniidengineJNI.IdFileAnalysisSessionSettings_GetOptionsCount(this.swigCPtr, this);
    }

    public String GetOption(String str) {
        return jniidengineJNI.IdFileAnalysisSessionSettings_GetOption(this.swigCPtr, this, str);
    }

    public boolean HasOption(String str) {
        return jniidengineJNI.IdFileAnalysisSessionSettings_HasOption(this.swigCPtr, this, str);
    }

    public void SetOption(String str, String str2) {
        jniidengineJNI.IdFileAnalysisSessionSettings_SetOption(this.swigCPtr, this, str, str2);
    }

    public void RemoveOption(String str) {
        jniidengineJNI.IdFileAnalysisSessionSettings_RemoveOption(this.swigCPtr, this, str);
    }

    public StringsMapIterator OptionsBegin() {
        return new StringsMapIterator(jniidengineJNI.IdFileAnalysisSessionSettings_OptionsBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator OptionsEnd() {
        return new StringsMapIterator(jniidengineJNI.IdFileAnalysisSessionSettings_OptionsEnd(this.swigCPtr, this), true);
    }

    public int GetSupportedForensicFieldsCount() {
        return jniidengineJNI.IdFileAnalysisSessionSettings_GetSupportedForensicFieldsCount(this.swigCPtr, this);
    }

    public boolean HasSupportedForensicField(String str) {
        return jniidengineJNI.IdFileAnalysisSessionSettings_HasSupportedForensicField(this.swigCPtr, this, str);
    }

    public StringsSetIterator SupportedForensicFieldsBegin() {
        return new StringsSetIterator(jniidengineJNI.IdFileAnalysisSessionSettings_SupportedForensicFieldsBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator SupportedForensicFieldsEnd() {
        return new StringsSetIterator(jniidengineJNI.IdFileAnalysisSessionSettings_SupportedForensicFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetEnabledForensicFieldsCount() {
        return jniidengineJNI.IdFileAnalysisSessionSettings_GetEnabledForensicFieldsCount(this.swigCPtr, this);
    }

    public boolean HasEnabledForensicField(String str) {
        return jniidengineJNI.IdFileAnalysisSessionSettings_HasEnabledForensicField(this.swigCPtr, this, str);
    }

    public StringsSetIterator EnabledForensicFieldsBegin() {
        return new StringsSetIterator(jniidengineJNI.IdFileAnalysisSessionSettings_EnabledForensicFieldsBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator EnabledForensicFieldsEnd() {
        return new StringsSetIterator(jniidengineJNI.IdFileAnalysisSessionSettings_EnabledForensicFieldsEnd(this.swigCPtr, this), true);
    }

    public void EnableForensicField(String str) {
        jniidengineJNI.IdFileAnalysisSessionSettings_EnableForensicField(this.swigCPtr, this, str);
    }

    public void DisableForensicField(String str) {
        jniidengineJNI.IdFileAnalysisSessionSettings_DisableForensicField(this.swigCPtr, this, str);
    }
}
