package com.smartengines.text;

/* loaded from: classes3.dex */
public class TextFeedbackContainer {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TextFeedbackContainer(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(TextFeedbackContainer textFeedbackContainer) {
        if (textFeedbackContainer == null) {
            return 0L;
        }
        return textFeedbackContainer.swigCPtr;
    }

    public static long swigRelease(TextFeedbackContainer textFeedbackContainer) {
        if (textFeedbackContainer == null) {
            return 0L;
        }
        if (!textFeedbackContainer.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = textFeedbackContainer.swigCPtr;
        textFeedbackContainer.swigCMemOwn = false;
        textFeedbackContainer.delete();
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
                jnitextengineJNI.delete_TextFeedbackContainer(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public TextFeedbackContainer() {
        this(jnitextengineJNI.new_TextFeedbackContainer(), true);
    }
}
