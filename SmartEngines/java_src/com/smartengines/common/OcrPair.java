package com.smartengines.common;

/* loaded from: classes3.dex */
public class OcrPair {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public OcrPair(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(OcrPair ocrPair) {
        if (ocrPair == null) {
            return 0L;
        }
        return ocrPair.swigCPtr;
    }

    public static long swigRelease(OcrPair ocrPair) {
        if (ocrPair == null) {
            return 0L;
        }
        if (!ocrPair.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = ocrPair.swigCPtr;
        ocrPair.swigCMemOwn = false;
        ocrPair.delete();
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
                jnisecommonJNI.delete_OcrPair(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public OcrPair() {
        this(jnisecommonJNI.new_OcrPair__SWIG_0(), true);
    }

    public OcrPair(MutableString mutableString, float f) {
        this(jnisecommonJNI.new_OcrPair__SWIG_1(MutableString.getCPtr(mutableString), mutableString, f), true);
    }

    public OcrPair(String str, float f) {
        this(jnisecommonJNI.new_OcrPair__SWIG_2(str, f), true);
    }

    public OcrPair(MutableString mutableString, int i) {
        this(jnisecommonJNI.new_OcrPair__SWIG_3(MutableString.getCPtr(mutableString), mutableString, i), true);
    }

    public OcrPair(String str, int i) {
        this(jnisecommonJNI.new_OcrPair__SWIG_4(str, i), true);
    }

    public String GetCharacter() {
        return jnisecommonJNI.OcrPair_GetCharacter(this.swigCPtr, this);
    }

    public void SetCharacter(MutableString mutableString) {
        jnisecommonJNI.OcrPair_SetCharacter__SWIG_0(this.swigCPtr, this, MutableString.getCPtr(mutableString), mutableString);
    }

    public void SetCharacter(String str) {
        jnisecommonJNI.OcrPair_SetCharacter__SWIG_1(this.swigCPtr, this, str);
    }

    public short GetConfidence() {
        return jnisecommonJNI.OcrPair_GetConfidence(this.swigCPtr, this);
    }

    public void SetConfidence(float f) {
        jnisecommonJNI.OcrPair_SetConfidence__SWIG_0(this.swigCPtr, this, f);
    }

    public void SetConfidence(int i) {
        jnisecommonJNI.OcrPair_SetConfidence__SWIG_1(this.swigCPtr, this, i);
    }

    public void Serialize(Serializer serializer) {
        jnisecommonJNI.OcrPair_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
