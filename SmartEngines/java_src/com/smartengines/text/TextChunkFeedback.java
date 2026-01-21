package com.smartengines.text;

import com.smartengines.common.Quadrangle;

/* loaded from: classes3.dex */
public class TextChunkFeedback {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TextChunkFeedback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(TextChunkFeedback textChunkFeedback) {
        if (textChunkFeedback == null) {
            return 0L;
        }
        return textChunkFeedback.swigCPtr;
    }

    public static long swigRelease(TextChunkFeedback textChunkFeedback) {
        if (textChunkFeedback == null) {
            return 0L;
        }
        if (!textChunkFeedback.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = textChunkFeedback.swigCPtr;
        textChunkFeedback.swigCMemOwn = false;
        textChunkFeedback.delete();
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
                jnitextengineJNI.delete_TextChunkFeedback(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public Quadrangle GetQuadrangle() {
        return new Quadrangle(jnitextengineJNI.TextChunkFeedback_GetQuadrangle(this.swigCPtr, this), false);
    }
}
