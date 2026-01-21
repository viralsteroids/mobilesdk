package com.smartengines.p006id;

import com.smartengines.common.StringsMapIterator;
import com.smartengines.common.StringsSetIterator;

/* loaded from: classes3.dex */
public class IdSessionSettings {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdSessionSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdSessionSettings idSessionSettings) {
        if (idSessionSettings == null) {
            return 0L;
        }
        return idSessionSettings.swigCPtr;
    }

    public static long swigRelease(IdSessionSettings idSessionSettings) {
        if (idSessionSettings == null) {
            return 0L;
        }
        if (!idSessionSettings.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idSessionSettings.swigCPtr;
        idSessionSettings.swigCMemOwn = false;
        idSessionSettings.delete();
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
                jniidengineJNI.delete_IdSessionSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdSessionSettings Clone() {
        long jIdSessionSettings_Clone = jniidengineJNI.IdSessionSettings_Clone(this.swigCPtr, this);
        if (jIdSessionSettings_Clone == 0) {
            return null;
        }
        return new IdSessionSettings(jIdSessionSettings_Clone, true);
    }

    public int GetOptionsCount() {
        return jniidengineJNI.IdSessionSettings_GetOptionsCount(this.swigCPtr, this);
    }

    public String GetOption(String str) {
        return jniidengineJNI.IdSessionSettings_GetOption(this.swigCPtr, this, str);
    }

    public boolean HasOption(String str) {
        return jniidengineJNI.IdSessionSettings_HasOption(this.swigCPtr, this, str);
    }

    public void SetOption(String str, String str2) {
        jniidengineJNI.IdSessionSettings_SetOption(this.swigCPtr, this, str, str2);
    }

    public void RemoveOption(String str) {
        jniidengineJNI.IdSessionSettings_RemoveOption(this.swigCPtr, this, str);
    }

    public StringsMapIterator OptionsBegin() {
        return new StringsMapIterator(jniidengineJNI.IdSessionSettings_OptionsBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator OptionsEnd() {
        return new StringsMapIterator(jniidengineJNI.IdSessionSettings_OptionsEnd(this.swigCPtr, this), true);
    }

    public int GetSupportedModesCount() {
        return jniidengineJNI.IdSessionSettings_GetSupportedModesCount(this.swigCPtr, this);
    }

    public boolean HasSupportedMode(String str) {
        return jniidengineJNI.IdSessionSettings_HasSupportedMode(this.swigCPtr, this, str);
    }

    public StringsSetIterator SupportedModesBegin() {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_SupportedModesBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator SupportedModesEnd() {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_SupportedModesEnd(this.swigCPtr, this), true);
    }

    public String GetCurrentMode() {
        return jniidengineJNI.IdSessionSettings_GetCurrentMode(this.swigCPtr, this);
    }

    public void SetCurrentMode(String str) {
        jniidengineJNI.IdSessionSettings_SetCurrentMode(this.swigCPtr, this, str);
    }

    public int GetInternalEnginesCount() {
        return jniidengineJNI.IdSessionSettings_GetInternalEnginesCount(this.swigCPtr, this);
    }

    public boolean HasInternalEngine(String str) {
        return jniidengineJNI.IdSessionSettings_HasInternalEngine(this.swigCPtr, this, str);
    }

    public StringsSetIterator InternalEngineNamesBegin() {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_InternalEngineNamesBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator InternalEngineNamesEnd() {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_InternalEngineNamesEnd(this.swigCPtr, this), true);
    }

    public int GetSupportedDocumentTypesCount(String str) {
        return jniidengineJNI.IdSessionSettings_GetSupportedDocumentTypesCount(this.swigCPtr, this, str);
    }

    public boolean HasSupportedDocumentType(String str, String str2) {
        return jniidengineJNI.IdSessionSettings_HasSupportedDocumentType(this.swigCPtr, this, str, str2);
    }

    public StringsSetIterator SupportedDocumentTypesBegin(String str) {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_SupportedDocumentTypesBegin(this.swigCPtr, this, str), true);
    }

    public StringsSetIterator SupportedDocumentTypesEnd(String str) {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_SupportedDocumentTypesEnd(this.swigCPtr, this, str), true);
    }

    public int GetEnabledDocumentTypesCount() {
        return jniidengineJNI.IdSessionSettings_GetEnabledDocumentTypesCount(this.swigCPtr, this);
    }

    public boolean HasEnabledDocumentType(String str) {
        return jniidengineJNI.IdSessionSettings_HasEnabledDocumentType(this.swigCPtr, this, str);
    }

    public StringsSetIterator EnabledDocumentTypesBegin() {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_EnabledDocumentTypesBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator EnabledDocumentTypesEnd() {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_EnabledDocumentTypesEnd(this.swigCPtr, this), true);
    }

    public void AddEnabledDocumentTypes(String str) {
        jniidengineJNI.IdSessionSettings_AddEnabledDocumentTypes(this.swigCPtr, this, str);
    }

    public void RemoveEnabledDocumentTypes(String str) {
        jniidengineJNI.IdSessionSettings_RemoveEnabledDocumentTypes(this.swigCPtr, this, str);
    }

    public IdDocumentInfo GetDocumentInfo(String str) {
        return new IdDocumentInfo(jniidengineJNI.IdSessionSettings_GetDocumentInfo(this.swigCPtr, this, str), false);
    }

    public int GetSupportedFieldsCount(String str) {
        return jniidengineJNI.IdSessionSettings_GetSupportedFieldsCount(this.swigCPtr, this, str);
    }

    public boolean HasSupportedField(String str, String str2) {
        return jniidengineJNI.IdSessionSettings_HasSupportedField(this.swigCPtr, this, str, str2);
    }

    public StringsSetIterator SupportedFieldsBegin(String str) {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_SupportedFieldsBegin(this.swigCPtr, this, str), true);
    }

    public StringsSetIterator SupportedFieldsEnd(String str) {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_SupportedFieldsEnd(this.swigCPtr, this, str), true);
    }

    public IdFieldType GetFieldType(String str, String str2) {
        return IdFieldType.swigToEnum(jniidengineJNI.IdSessionSettings_GetFieldType(this.swigCPtr, this, str, str2));
    }

    public int GetEnabledFieldsCount(String str) {
        return jniidengineJNI.IdSessionSettings_GetEnabledFieldsCount(this.swigCPtr, this, str);
    }

    public boolean HasEnabledField(String str, String str2) {
        return jniidengineJNI.IdSessionSettings_HasEnabledField(this.swigCPtr, this, str, str2);
    }

    public StringsSetIterator EnabledFieldsBegin(String str) {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_EnabledFieldsBegin(this.swigCPtr, this, str), true);
    }

    public StringsSetIterator EnabledFieldsEnd(String str) {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_EnabledFieldsEnd(this.swigCPtr, this, str), true);
    }

    public void EnableField(String str, String str2) {
        jniidengineJNI.IdSessionSettings_EnableField(this.swigCPtr, this, str, str2);
    }

    public void DisableField(String str, String str2) {
        jniidengineJNI.IdSessionSettings_DisableField(this.swigCPtr, this, str, str2);
    }

    public boolean IsForensicsEnabled() {
        return jniidengineJNI.IdSessionSettings_IsForensicsEnabled(this.swigCPtr, this);
    }

    public void EnableForensics() {
        jniidengineJNI.IdSessionSettings_EnableForensics(this.swigCPtr, this);
    }

    public void DisableForensics() {
        jniidengineJNI.IdSessionSettings_DisableForensics(this.swigCPtr, this);
    }

    public int GetSupportedForensicFieldsCount(String str) {
        return jniidengineJNI.IdSessionSettings_GetSupportedForensicFieldsCount(this.swigCPtr, this, str);
    }

    public boolean HasSupportedForensicField(String str, String str2) {
        return jniidengineJNI.IdSessionSettings_HasSupportedForensicField(this.swigCPtr, this, str, str2);
    }

    public StringsSetIterator SupportedForensicFieldsBegin(String str) {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_SupportedForensicFieldsBegin(this.swigCPtr, this, str), true);
    }

    public StringsSetIterator SupportedForensicFieldsEnd(String str) {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_SupportedForensicFieldsEnd(this.swigCPtr, this, str), true);
    }

    public IdFieldType GetForensicFieldType(String str, String str2) {
        return IdFieldType.swigToEnum(jniidengineJNI.IdSessionSettings_GetForensicFieldType(this.swigCPtr, this, str, str2));
    }

    public int GetEnabledForensicFieldsCount(String str) {
        return jniidengineJNI.IdSessionSettings_GetEnabledForensicFieldsCount(this.swigCPtr, this, str);
    }

    public boolean HasEnabledForensicField(String str, String str2) {
        return jniidengineJNI.IdSessionSettings_HasEnabledForensicField(this.swigCPtr, this, str, str2);
    }

    public StringsSetIterator EnabledForensicFieldsBegin(String str) {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_EnabledForensicFieldsBegin(this.swigCPtr, this, str), true);
    }

    public StringsSetIterator EnabledForensicFieldsEnd(String str) {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_EnabledForensicFieldsEnd(this.swigCPtr, this, str), true);
    }

    public void EnableForensicField(String str, String str2) {
        jniidengineJNI.IdSessionSettings_EnableForensicField(this.swigCPtr, this, str, str2);
    }

    public void DisableForensicField(String str, String str2) {
        jniidengineJNI.IdSessionSettings_DisableForensicField(this.swigCPtr, this, str, str2);
    }

    public StringsSetIterator PermissiblePrefixDocMasksBegin() {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_PermissiblePrefixDocMasksBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator PermissiblePrefixDocMasksEnd() {
        return new StringsSetIterator(jniidengineJNI.IdSessionSettings_PermissiblePrefixDocMasksEnd(this.swigCPtr, this), true);
    }
}
