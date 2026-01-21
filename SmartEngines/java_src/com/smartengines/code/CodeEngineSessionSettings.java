package com.smartengines.code;

import com.smartengines.common.StringsMapIterator;

/* loaded from: classes3.dex */
public class CodeEngineSessionSettings {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CodeEngineSessionSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(CodeEngineSessionSettings codeEngineSessionSettings) {
        if (codeEngineSessionSettings == null) {
            return 0L;
        }
        return codeEngineSessionSettings.swigCPtr;
    }

    public static long swigRelease(CodeEngineSessionSettings codeEngineSessionSettings) {
        if (codeEngineSessionSettings == null) {
            return 0L;
        }
        if (!codeEngineSessionSettings.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = codeEngineSessionSettings.swigCPtr;
        codeEngineSessionSettings.swigCMemOwn = false;
        codeEngineSessionSettings.delete();
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
                jnicodeengineJNI.delete_CodeEngineSessionSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public CodeEngineSessionSettings Clone() {
        long jCodeEngineSessionSettings_Clone = jnicodeengineJNI.CodeEngineSessionSettings_Clone(this.swigCPtr, this);
        if (jCodeEngineSessionSettings_Clone == 0) {
            return null;
        }
        return new CodeEngineSessionSettings(jCodeEngineSessionSettings_Clone, true);
    }

    public String GetOption(String str) {
        return jnicodeengineJNI.CodeEngineSessionSettings_GetOption(this.swigCPtr, this, str);
    }

    public StringsMapIterator SettingsBegin() {
        return new StringsMapIterator(jnicodeengineJNI.CodeEngineSessionSettings_SettingsBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator SettingsEnd() {
        return new StringsMapIterator(jnicodeengineJNI.CodeEngineSessionSettings_SettingsEnd(this.swigCPtr, this), true);
    }

    public boolean HasOption(String str) {
        return jnicodeengineJNI.CodeEngineSessionSettings_HasOption(this.swigCPtr, this, str);
    }

    public void SetOption(String str, String str2) {
        jnicodeengineJNI.CodeEngineSessionSettings_SetOption(this.swigCPtr, this, str, str2);
    }
}
