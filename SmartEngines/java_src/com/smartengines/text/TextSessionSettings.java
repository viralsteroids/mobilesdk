package com.smartengines.text;

import com.smartengines.common.StringsMapIterator;
import com.smartengines.common.StringsSetIterator;

/* loaded from: classes3.dex */
public class TextSessionSettings {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TextSessionSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(TextSessionSettings textSessionSettings) {
        if (textSessionSettings == null) {
            return 0L;
        }
        return textSessionSettings.swigCPtr;
    }

    public static long swigRelease(TextSessionSettings textSessionSettings) {
        if (textSessionSettings == null) {
            return 0L;
        }
        if (!textSessionSettings.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = textSessionSettings.swigCPtr;
        textSessionSettings.swigCMemOwn = false;
        textSessionSettings.delete();
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
                jnitextengineJNI.delete_TextSessionSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public TextSessionSettings Clone() {
        long jTextSessionSettings_Clone = jnitextengineJNI.TextSessionSettings_Clone(this.swigCPtr, this);
        if (jTextSessionSettings_Clone == 0) {
            return null;
        }
        return new TextSessionSettings(jTextSessionSettings_Clone, true);
    }

    public int GetSupportedTextIteratorsCount() {
        return jnitextengineJNI.TextSessionSettings_GetSupportedTextIteratorsCount(this.swigCPtr, this);
    }

    public StringsSetIterator SupportedTextIteratorsBegin() {
        return new StringsSetIterator(jnitextengineJNI.TextSessionSettings_SupportedTextIteratorsBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator SupportedTextIteratorsEnd() {
        return new StringsSetIterator(jnitextengineJNI.TextSessionSettings_SupportedTextIteratorsEnd(this.swigCPtr, this), true);
    }

    public int GetSupportedLanguagesCount() {
        return jnitextengineJNI.TextSessionSettings_GetSupportedLanguagesCount(this.swigCPtr, this);
    }

    public StringsSetIterator SupportedLanguagesBegin() {
        return new StringsSetIterator(jnitextengineJNI.TextSessionSettings_SupportedLanguagesBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator SupportedLanguagesEnd() {
        return new StringsSetIterator(jnitextengineJNI.TextSessionSettings_SupportedLanguagesEnd(this.swigCPtr, this), true);
    }

    public void AddEnabledLanguages(String str) {
        jnitextengineJNI.TextSessionSettings_AddEnabledLanguages(this.swigCPtr, this, str);
    }

    public int GetEnabledLanguagesCount() {
        return jnitextengineJNI.TextSessionSettings_GetEnabledLanguagesCount(this.swigCPtr, this);
    }

    public StringsSetIterator EnabledLanguagesBegin() {
        return new StringsSetIterator(jnitextengineJNI.TextSessionSettings_EnabledLanguagesBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator EnabledLanguagesEnd() {
        return new StringsSetIterator(jnitextengineJNI.TextSessionSettings_EnabledLanguagesEnd(this.swigCPtr, this), true);
    }

    public void DisableLanguages(String str) {
        jnitextengineJNI.TextSessionSettings_DisableLanguages(this.swigCPtr, this, str);
    }

    public void DisableAllLanguages() {
        jnitextengineJNI.TextSessionSettings_DisableAllLanguages(this.swigCPtr, this);
    }

    public String GetLanguageAlphabet(String str) {
        return jnitextengineJNI.TextSessionSettings_GetLanguageAlphabet(this.swigCPtr, this, str);
    }

    public int GetOptionsCount() {
        return jnitextengineJNI.TextSessionSettings_GetOptionsCount(this.swigCPtr, this);
    }

    public boolean HasOption(String str) {
        return jnitextengineJNI.TextSessionSettings_HasOption(this.swigCPtr, this, str);
    }

    public String GetOption(String str) {
        return jnitextengineJNI.TextSessionSettings_GetOption(this.swigCPtr, this, str);
    }

    public void SetOption(String str, String str2) {
        jnitextengineJNI.TextSessionSettings_SetOption(this.swigCPtr, this, str, str2);
    }

    public void RemoveOption(String str) {
        jnitextengineJNI.TextSessionSettings_RemoveOption(this.swigCPtr, this, str);
    }

    public StringsMapIterator OptionsBegin() {
        return new StringsMapIterator(jnitextengineJNI.TextSessionSettings_OptionsBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator OptionsEnd() {
        return new StringsMapIterator(jnitextengineJNI.TextSessionSettings_OptionsEnd(this.swigCPtr, this), true);
    }
}
