package com.smartengines.text;

/* loaded from: classes3.dex */
public class TextFeedback {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TextFeedback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(TextFeedback textFeedback) {
        if (textFeedback == null) {
            return 0L;
        }
        return textFeedback.swigCPtr;
    }

    public static long swigRelease(TextFeedback textFeedback) {
        if (textFeedback == null) {
            return 0L;
        }
        if (!textFeedback.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = textFeedback.swigCPtr;
        textFeedback.swigCMemOwn = false;
        textFeedback.delete();
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
                jnitextengineJNI.delete_TextFeedback(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        jnitextengineJNI.TextFeedback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        jnitextengineJNI.TextFeedback_change_ownership(this, this.swigCPtr, true);
    }

    public void FeedbackReceived(TextFeedbackContainer textFeedbackContainer) {
        jnitextengineJNI.TextFeedback_FeedbackReceived(this.swigCPtr, this, TextFeedbackContainer.getCPtr(textFeedbackContainer), textFeedbackContainer);
    }

    public void PagesLocalizationFeedbackReceived(TextPagesFeedbackContainer textPagesFeedbackContainer) {
        jnitextengineJNI.TextFeedback_PagesLocalizationFeedbackReceived(this.swigCPtr, this, TextPagesFeedbackContainer.getCPtr(textPagesFeedbackContainer), textPagesFeedbackContainer);
    }

    public void TextLocalizationFeedbackReceived(TextLocalizationFeedbackContainer textLocalizationFeedbackContainer) {
        jnitextengineJNI.TextFeedback_TextLocalizationFeedbackReceived(this.swigCPtr, this, TextLocalizationFeedbackContainer.getCPtr(textLocalizationFeedbackContainer), textLocalizationFeedbackContainer);
    }

    public TextFeedback() {
        this(jnitextengineJNI.new_TextFeedback(), true);
        jnitextengineJNI.TextFeedback_director_connect(this, this.swigCPtr, true, true);
    }
}
