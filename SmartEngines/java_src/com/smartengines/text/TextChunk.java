package com.smartengines.text;

import com.smartengines.common.OcrString;
import com.smartengines.common.Polygon;
import com.smartengines.common.StringsMapIterator;

/* loaded from: classes3.dex */
public class TextChunk {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TextChunk(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(TextChunk textChunk) {
        if (textChunk == null) {
            return 0L;
        }
        return textChunk.swigCPtr;
    }

    public static long swigRelease(TextChunk textChunk) {
        if (textChunk == null) {
            return 0L;
        }
        if (!textChunk.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = textChunk.swigCPtr;
        textChunk.swigCMemOwn = false;
        textChunk.delete();
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
                jnitextengineJNI.delete_TextChunk(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public OcrString GetOcrString() {
        return new OcrString(jnitextengineJNI.TextChunk_GetOcrString(this.swigCPtr, this), false);
    }

    public OcrString GetMutableOcrString() {
        return new OcrString(jnitextengineJNI.TextChunk_GetMutableOcrString(this.swigCPtr, this), false);
    }

    public OcrString GetFilteredOcrString(String str) {
        return new OcrString(jnitextengineJNI.TextChunk_GetFilteredOcrString(this.swigCPtr, this, str), false);
    }

    public Polygon GetGeometry() {
        return new Polygon(jnitextengineJNI.TextChunk_GetGeometry(this.swigCPtr, this), false);
    }

    public double GetConfidence() {
        return jnitextengineJNI.TextChunk_GetConfidence(this.swigCPtr, this);
    }

    public boolean GetAcceptFlag() {
        return jnitextengineJNI.TextChunk_GetAcceptFlag(this.swigCPtr, this);
    }

    public int GetAttributesCount() {
        return jnitextengineJNI.TextChunk_GetAttributesCount(this.swigCPtr, this);
    }

    public boolean HasAttribute(String str) {
        return jnitextengineJNI.TextChunk_HasAttribute(this.swigCPtr, this, str);
    }

    public String GetAttribute(String str) {
        return jnitextengineJNI.TextChunk_GetAttribute(this.swigCPtr, this, str);
    }

    public StringsMapIterator AttributesBegin() {
        return new StringsMapIterator(jnitextengineJNI.TextChunk_AttributesBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator AttributesEnd() {
        return new StringsMapIterator(jnitextengineJNI.TextChunk_AttributesEnd(this.swigCPtr, this), true);
    }
}
