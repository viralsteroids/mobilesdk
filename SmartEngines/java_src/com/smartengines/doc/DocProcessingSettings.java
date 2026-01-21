package com.smartengines.doc;

import com.smartengines.common.StringsMapIterator;

/* loaded from: classes3.dex */
public class DocProcessingSettings {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocProcessingSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocProcessingSettings docProcessingSettings) {
        if (docProcessingSettings == null) {
            return 0L;
        }
        return docProcessingSettings.swigCPtr;
    }

    public static long swigRelease(DocProcessingSettings docProcessingSettings) {
        if (docProcessingSettings == null) {
            return 0L;
        }
        if (!docProcessingSettings.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docProcessingSettings.swigCPtr;
        docProcessingSettings.swigCMemOwn = false;
        docProcessingSettings.delete();
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
                jnidocengineJNI.delete_DocProcessingSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int GetOptionsCount() {
        return jnidocengineJNI.DocProcessingSettings_GetOptionsCount(this.swigCPtr, this);
    }

    public boolean HasOption(String str) {
        return jnidocengineJNI.DocProcessingSettings_HasOption(this.swigCPtr, this, str);
    }

    public String GetOption(String str) {
        return jnidocengineJNI.DocProcessingSettings_GetOption(this.swigCPtr, this, str);
    }

    public void SetOption(String str, String str2) {
        jnidocengineJNI.DocProcessingSettings_SetOption(this.swigCPtr, this, str, str2);
    }

    public void RemoveOption(String str) {
        jnidocengineJNI.DocProcessingSettings_RemoveOption(this.swigCPtr, this, str);
    }

    public StringsMapIterator OptionsBegin() {
        return new StringsMapIterator(jnidocengineJNI.DocProcessingSettings_OptionsBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator OptionsEnd() {
        return new StringsMapIterator(jnidocengineJNI.DocProcessingSettings_OptionsEnd(this.swigCPtr, this), true);
    }

    public int GetSessionOptionsCount() {
        return jnidocengineJNI.DocProcessingSettings_GetSessionOptionsCount(this.swigCPtr, this);
    }

    public boolean HasSessionOption(String str) {
        return jnidocengineJNI.DocProcessingSettings_HasSessionOption(this.swigCPtr, this, str);
    }

    public String GetSessionOption(String str) {
        return jnidocengineJNI.DocProcessingSettings_GetSessionOption(this.swigCPtr, this, str);
    }

    public StringsMapIterator SessionOptionsBegin() {
        return new StringsMapIterator(jnidocengineJNI.DocProcessingSettings_SessionOptionsBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator SessionOptionsEnd() {
        return new StringsMapIterator(jnidocengineJNI.DocProcessingSettings_SessionOptionsEnd(this.swigCPtr, this), true);
    }

    public int GetEnabledDocumentTypesCount() {
        return jnidocengineJNI.DocProcessingSettings_GetEnabledDocumentTypesCount(this.swigCPtr, this);
    }

    public boolean HasEnabledDocumentType(String str) {
        return jnidocengineJNI.DocProcessingSettings_HasEnabledDocumentType(this.swigCPtr, this, str);
    }

    public String GetEnabledDocumentType(int i) {
        return jnidocengineJNI.DocProcessingSettings_GetEnabledDocumentType(this.swigCPtr, this, i);
    }

    public int GetCurrentSourceID() {
        return jnidocengineJNI.DocProcessingSettings_GetCurrentSourceID(this.swigCPtr, this);
    }

    public void SetCurrentSourceID(int i) {
        jnidocengineJNI.DocProcessingSettings_SetCurrentSourceID(this.swigCPtr, this, i);
    }

    public int GetAvailableRoutinesCount() {
        return jnidocengineJNI.DocProcessingSettings_GetAvailableRoutinesCount(this.swigCPtr, this);
    }

    public boolean HasAvailableRoutine(String str) {
        return jnidocengineJNI.DocProcessingSettings_HasAvailableRoutine(this.swigCPtr, this, str);
    }

    public StringsMapIterator AvailableRoutinesBegin() {
        return new StringsMapIterator(jnidocengineJNI.DocProcessingSettings_AvailableRoutinesBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator AvailableRoutinesEnd() {
        return new StringsMapIterator(jnidocengineJNI.DocProcessingSettings_AvailableRoutinesEnd(this.swigCPtr, this), true);
    }

    public int RoutinesQueueSize() {
        return jnidocengineJNI.DocProcessingSettings_RoutinesQueueSize(this.swigCPtr, this);
    }

    public String RoutinesQueueFront() {
        return jnidocengineJNI.DocProcessingSettings_RoutinesQueueFront(this.swigCPtr, this);
    }

    public void RoutinesQueuePush(String str) {
        jnidocengineJNI.DocProcessingSettings_RoutinesQueuePush(this.swigCPtr, this, str);
    }

    public void RoutinesQueuePop() {
        jnidocengineJNI.DocProcessingSettings_RoutinesQueuePop(this.swigCPtr, this);
    }

    public void RoutinesQueueClear() {
        jnidocengineJNI.DocProcessingSettings_RoutinesQueueClear(this.swigCPtr, this);
    }

    public void BindFeedbackReporter(DocFeedback docFeedback) {
        jnidocengineJNI.DocProcessingSettings_BindFeedbackReporter(this.swigCPtr, this, DocFeedback.getCPtr(docFeedback), docFeedback);
    }

    public DocFeedback GetFeedbackReporter() {
        long jDocProcessingSettings_GetFeedbackReporter = jnidocengineJNI.DocProcessingSettings_GetFeedbackReporter(this.swigCPtr, this);
        if (jDocProcessingSettings_GetFeedbackReporter == 0) {
            return null;
        }
        return new DocFeedback(jDocProcessingSettings_GetFeedbackReporter, false);
    }
}
