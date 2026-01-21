package com.smartengines.text;

/* loaded from: classes3.dex */
public class TextResult {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TextResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(TextResult textResult) {
        if (textResult == null) {
            return 0L;
        }
        return textResult.swigCPtr;
    }

    public static long swigRelease(TextResult textResult) {
        if (textResult == null) {
            return 0L;
        }
        if (!textResult.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = textResult.swigCPtr;
        textResult.swigCMemOwn = false;
        textResult.delete();
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
                jnitextengineJNI.delete_TextResult(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public TextScene GetCurrentScene() {
        return new TextScene(jnitextengineJNI.TextResult_GetCurrentScene(this.swigCPtr, this), false);
    }
}
