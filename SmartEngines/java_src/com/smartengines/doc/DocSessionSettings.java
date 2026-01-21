package com.smartengines.doc;

import com.smartengines.common.StringsMapIterator;
import com.smartengines.common.StringsSetIterator;
import com.smartengines.common.StringsVectorIterator;

/* loaded from: classes3.dex */
public class DocSessionSettings {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocSessionSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocSessionSettings docSessionSettings) {
        if (docSessionSettings == null) {
            return 0L;
        }
        return docSessionSettings.swigCPtr;
    }

    public static long swigRelease(DocSessionSettings docSessionSettings) {
        if (docSessionSettings == null) {
            return 0L;
        }
        if (!docSessionSettings.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docSessionSettings.swigCPtr;
        docSessionSettings.swigCMemOwn = false;
        docSessionSettings.delete();
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
                jnidocengineJNI.delete_DocSessionSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocSessionSettings Clone() {
        long jDocSessionSettings_Clone = jnidocengineJNI.DocSessionSettings_Clone(this.swigCPtr, this);
        if (jDocSessionSettings_Clone == 0) {
            return null;
        }
        return new DocSessionSettings(jDocSessionSettings_Clone, true);
    }

    public int GetOptionsCount() {
        return jnidocengineJNI.DocSessionSettings_GetOptionsCount(this.swigCPtr, this);
    }

    public boolean HasOption(String str) {
        return jnidocengineJNI.DocSessionSettings_HasOption(this.swigCPtr, this, str);
    }

    public String GetOption(String str) {
        return jnidocengineJNI.DocSessionSettings_GetOption(this.swigCPtr, this, str);
    }

    public void SetOption(String str, String str2) {
        jnidocengineJNI.DocSessionSettings_SetOption(this.swigCPtr, this, str, str2);
    }

    public void RemoveOption(String str) {
        jnidocengineJNI.DocSessionSettings_RemoveOption(this.swigCPtr, this, str);
    }

    public StringsMapIterator OptionsBegin() {
        return new StringsMapIterator(jnidocengineJNI.DocSessionSettings_OptionsBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator OptionsEnd() {
        return new StringsMapIterator(jnidocengineJNI.DocSessionSettings_OptionsEnd(this.swigCPtr, this), true);
    }

    public int GetSupportedModesCount() {
        return jnidocengineJNI.DocSessionSettings_GetSupportedModesCount(this.swigCPtr, this);
    }

    public boolean HasSupportedMode(String str) {
        return jnidocengineJNI.DocSessionSettings_HasSupportedMode(this.swigCPtr, this, str);
    }

    public String GetSupportedMode(int i) {
        return jnidocengineJNI.DocSessionSettings_GetSupportedMode(this.swigCPtr, this, i);
    }

    public StringsVectorIterator SupportedModesBegin() {
        return new StringsVectorIterator(jnidocengineJNI.DocSessionSettings_SupportedModesBegin(this.swigCPtr, this), true);
    }

    public StringsVectorIterator SupportedModesEnd() {
        return new StringsVectorIterator(jnidocengineJNI.DocSessionSettings_SupportedModesEnd(this.swigCPtr, this), true);
    }

    public String GetCurrentMode() {
        return jnidocengineJNI.DocSessionSettings_GetCurrentMode(this.swigCPtr, this);
    }

    public void SetCurrentMode(String str) {
        jnidocengineJNI.DocSessionSettings_SetCurrentMode(this.swigCPtr, this, str);
    }

    public int GetInternalEnginesCount() {
        return jnidocengineJNI.DocSessionSettings_GetInternalEnginesCount(this.swigCPtr, this);
    }

    public int GetSupportedDocumentTypesCount(int i) {
        return jnidocengineJNI.DocSessionSettings_GetSupportedDocumentTypesCount(this.swigCPtr, this, i);
    }

    public boolean HasSupportedDocumentType(int i, String str) {
        return jnidocengineJNI.DocSessionSettings_HasSupportedDocumentType(this.swigCPtr, this, i, str);
    }

    public String GetSupportedDocumentType(int i, int i2) {
        return jnidocengineJNI.DocSessionSettings_GetSupportedDocumentType(this.swigCPtr, this, i, i2);
    }

    public int GetEnabledDocumentTypesCount() {
        return jnidocengineJNI.DocSessionSettings_GetEnabledDocumentTypesCount(this.swigCPtr, this);
    }

    public boolean HasEnabledDocumentType(String str) {
        return jnidocengineJNI.DocSessionSettings_HasEnabledDocumentType(this.swigCPtr, this, str);
    }

    public String GetEnabledDocumentType(int i) {
        return jnidocengineJNI.DocSessionSettings_GetEnabledDocumentType(this.swigCPtr, this, i);
    }

    public DocDocumentInfo GetDocumentInfo(String str) {
        return new DocDocumentInfo(jnidocengineJNI.DocSessionSettings_GetDocumentInfo(this.swigCPtr, this, str), false);
    }

    public void AddEnabledDocumentTypes(String str) {
        jnidocengineJNI.DocSessionSettings_AddEnabledDocumentTypes(this.swigCPtr, this, str);
    }

    public void RemoveEnabledDocumentTypes(String str) {
        jnidocengineJNI.DocSessionSettings_RemoveEnabledDocumentTypes(this.swigCPtr, this, str);
    }

    public StringsSetIterator PermissiblePrefixDocMasksBegin() {
        return new StringsSetIterator(jnidocengineJNI.DocSessionSettings_PermissiblePrefixDocMasksBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator PermissiblePrefixDocMasksEnd() {
        return new StringsSetIterator(jnidocengineJNI.DocSessionSettings_PermissiblePrefixDocMasksEnd(this.swigCPtr, this), true);
    }

    public boolean IsForensicsEnabled() {
        return jnidocengineJNI.DocSessionSettings_IsForensicsEnabled(this.swigCPtr, this);
    }

    public void EnableForensics() {
        jnidocengineJNI.DocSessionSettings_EnableForensics(this.swigCPtr, this);
    }

    public void DisableForensics() {
        jnidocengineJNI.DocSessionSettings_DisableForensics(this.swigCPtr, this);
    }
}
