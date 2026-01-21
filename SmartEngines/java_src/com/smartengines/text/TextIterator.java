package com.smartengines.text;

/* loaded from: classes3.dex */
public class TextIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TextIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(TextIterator textIterator) {
        if (textIterator == null) {
            return 0L;
        }
        return textIterator.swigCPtr;
    }

    public static long swigRelease(TextIterator textIterator) {
        if (textIterator == null) {
            return 0L;
        }
        if (!textIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = textIterator.swigCPtr;
        textIterator.swigCMemOwn = false;
        textIterator.delete();
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
                jnitextengineJNI.delete_TextIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public TextIterator(TextIterator textIterator) {
        this(jnitextengineJNI.new_TextIterator(getCPtr(textIterator), textIterator), true);
    }

    public TextChunk GetTextChunk() {
        return new TextChunk(jnitextengineJNI.TextIterator_GetTextChunk(this.swigCPtr, this), false);
    }

    public TextChunk GetTextChunkPtr() {
        long jTextIterator_GetTextChunkPtr = jnitextengineJNI.TextIterator_GetTextChunkPtr(this.swigCPtr, this);
        if (jTextIterator_GetTextChunkPtr == 0) {
            return null;
        }
        return new TextChunk(jTextIterator_GetTextChunkPtr, false);
    }

    public TextChunk GetMutableTextChunk() {
        return new TextChunk(jnitextengineJNI.TextIterator_GetMutableTextChunk(this.swigCPtr, this), false);
    }

    public TextChunk GetMutableTextChunkPtr() {
        long jTextIterator_GetMutableTextChunkPtr = jnitextengineJNI.TextIterator_GetMutableTextChunkPtr(this.swigCPtr, this);
        if (jTextIterator_GetMutableTextChunkPtr == 0) {
            return null;
        }
        return new TextChunk(jTextIterator_GetMutableTextChunkPtr, false);
    }

    public void Advance() {
        jnitextengineJNI.TextIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(TextIterator textIterator) {
        return jnitextengineJNI.TextIterator_Equals(this.swigCPtr, this, getCPtr(textIterator), textIterator);
    }

    public boolean Finished() {
        return jnitextengineJNI.TextIterator_Finished(this.swigCPtr, this);
    }
}
