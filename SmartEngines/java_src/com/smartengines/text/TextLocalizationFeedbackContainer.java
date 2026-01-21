package com.smartengines.text;

/* loaded from: classes3.dex */
public class TextLocalizationFeedbackContainer {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TextLocalizationFeedbackContainer(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(TextLocalizationFeedbackContainer textLocalizationFeedbackContainer) {
        if (textLocalizationFeedbackContainer == null) {
            return 0L;
        }
        return textLocalizationFeedbackContainer.swigCPtr;
    }

    public static long swigRelease(TextLocalizationFeedbackContainer textLocalizationFeedbackContainer) {
        if (textLocalizationFeedbackContainer == null) {
            return 0L;
        }
        if (!textLocalizationFeedbackContainer.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = textLocalizationFeedbackContainer.swigCPtr;
        textLocalizationFeedbackContainer.swigCMemOwn = false;
        textLocalizationFeedbackContainer.delete();
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
                jnitextengineJNI.delete_TextLocalizationFeedbackContainer(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int GetTextChunksCount() {
        return jnitextengineJNI.TextLocalizationFeedbackContainer_GetTextChunksCount(this.swigCPtr, this);
    }

    public TextChunkFeedback GetTextChunkFeedback(int i) {
        return new TextChunkFeedback(jnitextengineJNI.TextLocalizationFeedbackContainer_GetTextChunkFeedback(this.swigCPtr, this, i), false);
    }
}
