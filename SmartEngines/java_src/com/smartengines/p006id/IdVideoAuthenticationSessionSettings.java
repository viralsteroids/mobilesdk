package com.smartengines.p006id;

import com.smartengines.common.StringsMapIterator;
import com.smartengines.common.StringsSetIterator;

/* loaded from: classes3.dex */
public class IdVideoAuthenticationSessionSettings {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdVideoAuthenticationSessionSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings) {
        if (idVideoAuthenticationSessionSettings == null) {
            return 0L;
        }
        return idVideoAuthenticationSessionSettings.swigCPtr;
    }

    public static long swigRelease(IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings) {
        if (idVideoAuthenticationSessionSettings == null) {
            return 0L;
        }
        if (!idVideoAuthenticationSessionSettings.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idVideoAuthenticationSessionSettings.swigCPtr;
        idVideoAuthenticationSessionSettings.swigCMemOwn = false;
        idVideoAuthenticationSessionSettings.delete();
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
                jniidengineJNI.delete_IdVideoAuthenticationSessionSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdVideoAuthenticationSessionSettings Clone() {
        long jIdVideoAuthenticationSessionSettings_Clone = jniidengineJNI.IdVideoAuthenticationSessionSettings_Clone(this.swigCPtr, this);
        if (jIdVideoAuthenticationSessionSettings_Clone == 0) {
            return null;
        }
        return new IdVideoAuthenticationSessionSettings(jIdVideoAuthenticationSessionSettings_Clone, true);
    }

    public int GetOptionsCount() {
        return jniidengineJNI.IdVideoAuthenticationSessionSettings_GetOptionsCount(this.swigCPtr, this);
    }

    public String GetOption(String str) {
        return jniidengineJNI.IdVideoAuthenticationSessionSettings_GetOption(this.swigCPtr, this, str);
    }

    public boolean HasOption(String str) {
        return jniidengineJNI.IdVideoAuthenticationSessionSettings_HasOption(this.swigCPtr, this, str);
    }

    public void SetOption(String str, String str2) {
        jniidengineJNI.IdVideoAuthenticationSessionSettings_SetOption(this.swigCPtr, this, str, str2);
    }

    public void RemoveOption(String str) {
        jniidengineJNI.IdVideoAuthenticationSessionSettings_RemoveOption(this.swigCPtr, this, str);
    }

    public StringsMapIterator OptionsBegin() {
        return new StringsMapIterator(jniidengineJNI.IdVideoAuthenticationSessionSettings_OptionsBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator OptionsEnd() {
        return new StringsMapIterator(jniidengineJNI.IdVideoAuthenticationSessionSettings_OptionsEnd(this.swigCPtr, this), true);
    }

    public int GetSupportedModesCount() {
        return jniidengineJNI.IdVideoAuthenticationSessionSettings_GetSupportedModesCount(this.swigCPtr, this);
    }

    public boolean HasSupportedMode(String str) {
        return jniidengineJNI.IdVideoAuthenticationSessionSettings_HasSupportedMode(this.swigCPtr, this, str);
    }

    public StringsSetIterator SupportedModesBegin() {
        return new StringsSetIterator(jniidengineJNI.IdVideoAuthenticationSessionSettings_SupportedModesBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator SupportedModesEnd() {
        return new StringsSetIterator(jniidengineJNI.IdVideoAuthenticationSessionSettings_SupportedModesEnd(this.swigCPtr, this), true);
    }

    public String GetCurrentMode() {
        return jniidengineJNI.IdVideoAuthenticationSessionSettings_GetCurrentMode(this.swigCPtr, this);
    }

    public void SetCurrentMode(String str) {
        jniidengineJNI.IdVideoAuthenticationSessionSettings_SetCurrentMode(this.swigCPtr, this, str);
    }

    public int GetInternalEnginesCount() {
        return jniidengineJNI.IdVideoAuthenticationSessionSettings_GetInternalEnginesCount(this.swigCPtr, this);
    }

    public boolean HasInternalEngine(String str) {
        return jniidengineJNI.IdVideoAuthenticationSessionSettings_HasInternalEngine(this.swigCPtr, this, str);
    }

    public StringsSetIterator InternalEngineNamesBegin() {
        return new StringsSetIterator(jniidengineJNI.IdVideoAuthenticationSessionSettings_InternalEngineNamesBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator InternalEngineNamesEnd() {
        return new StringsSetIterator(jniidengineJNI.IdVideoAuthenticationSessionSettings_InternalEngineNamesEnd(this.swigCPtr, this), true);
    }

    public int GetSupportedDocumentTypesCount(String str) {
        return jniidengineJNI.m500xcf89d4a7(this.swigCPtr, this, str);
    }

    public boolean HasSupportedDocumentType(String str, String str2) {
        return jniidengineJNI.IdVideoAuthenticationSessionSettings_HasSupportedDocumentType(this.swigCPtr, this, str, str2);
    }

    public StringsSetIterator SupportedDocumentTypesBegin(String str) {
        return new StringsSetIterator(jniidengineJNI.IdVideoAuthenticationSessionSettings_SupportedDocumentTypesBegin(this.swigCPtr, this, str), true);
    }

    public StringsSetIterator SupportedDocumentTypesEnd(String str) {
        return new StringsSetIterator(jniidengineJNI.IdVideoAuthenticationSessionSettings_SupportedDocumentTypesEnd(this.swigCPtr, this, str), true);
    }

    public int GetEnabledDocumentTypesCount() {
        return jniidengineJNI.m499x1c717e7a(this.swigCPtr, this);
    }

    public boolean HasEnabledDocumentType(String str) {
        return jniidengineJNI.IdVideoAuthenticationSessionSettings_HasEnabledDocumentType(this.swigCPtr, this, str);
    }

    public StringsSetIterator EnabledDocumentTypesBegin() {
        return new StringsSetIterator(jniidengineJNI.IdVideoAuthenticationSessionSettings_EnabledDocumentTypesBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator EnabledDocumentTypesEnd() {
        return new StringsSetIterator(jniidengineJNI.IdVideoAuthenticationSessionSettings_EnabledDocumentTypesEnd(this.swigCPtr, this), true);
    }

    public void AddEnabledDocumentTypes(String str) {
        jniidengineJNI.IdVideoAuthenticationSessionSettings_AddEnabledDocumentTypes(this.swigCPtr, this, str);
    }

    public void RemoveEnabledDocumentTypes(String str) {
        jniidengineJNI.IdVideoAuthenticationSessionSettings_RemoveEnabledDocumentTypes(this.swigCPtr, this, str);
    }

    public int GetVideoAuthenticationModesCount() {
        return jniidengineJNI.m501x8fe371ba(this.swigCPtr, this);
    }

    public boolean HasVideoAuthenticationMode(String str) {
        return jniidengineJNI.IdVideoAuthenticationSessionSettings_HasVideoAuthenticationMode(this.swigCPtr, this, str);
    }

    public StringsSetIterator VideoAuthenticationModesBegin() {
        return new StringsSetIterator(jniidengineJNI.m505x728c06ce(this.swigCPtr, this), true);
    }

    public StringsSetIterator VideoAuthenticationModesEnd() {
        return new StringsSetIterator(jniidengineJNI.IdVideoAuthenticationSessionSettings_VideoAuthenticationModesEnd(this.swigCPtr, this), true);
    }

    public void SetCurrentVideoAuthenticationMode(String str) {
        jniidengineJNI.m504xb50699a1(this.swigCPtr, this, str);
    }

    public String GetCurrentVideoAuthenticationMode() {
        return jniidengineJNI.m498xcee9c995(this.swigCPtr, this);
    }

    public IdDocumentInfo GetDocumentInfo(String str) {
        return new IdDocumentInfo(jniidengineJNI.IdVideoAuthenticationSessionSettings_GetDocumentInfo(this.swigCPtr, this, str), false);
    }

    public StringsSetIterator PermissiblePrefixDocMasksBegin() {
        return new StringsSetIterator(jniidengineJNI.m502x29ae5f5b(this.swigCPtr, this), true);
    }

    public StringsSetIterator PermissiblePrefixDocMasksEnd() {
        return new StringsSetIterator(jniidengineJNI.m503x1e69740d(this.swigCPtr, this), true);
    }

    public boolean IsForensicsEnabled() {
        return jniidengineJNI.IdVideoAuthenticationSessionSettings_IsForensicsEnabled(this.swigCPtr, this);
    }
}
