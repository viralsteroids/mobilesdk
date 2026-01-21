package com.smartengines.text;

/* loaded from: classes3.dex */
public class TextPagesFeedbackContainer {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TextPagesFeedbackContainer(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(TextPagesFeedbackContainer textPagesFeedbackContainer) {
        if (textPagesFeedbackContainer == null) {
            return 0L;
        }
        return textPagesFeedbackContainer.swigCPtr;
    }

    public static long swigRelease(TextPagesFeedbackContainer textPagesFeedbackContainer) {
        if (textPagesFeedbackContainer == null) {
            return 0L;
        }
        if (!textPagesFeedbackContainer.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = textPagesFeedbackContainer.swigCPtr;
        textPagesFeedbackContainer.swigCMemOwn = false;
        textPagesFeedbackContainer.delete();
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
                jnitextengineJNI.delete_TextPagesFeedbackContainer(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int GetPageCount() {
        return jnitextengineJNI.TextPagesFeedbackContainer_GetPageCount(this.swigCPtr, this);
    }

    public TextPageFeedback GetPageFeedback(int i) {
        return new TextPageFeedback(jnitextengineJNI.TextPagesFeedbackContainer_GetPageFeedback(this.swigCPtr, this, i), false);
    }
}
