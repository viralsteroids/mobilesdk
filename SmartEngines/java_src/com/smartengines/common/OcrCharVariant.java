package com.smartengines.common;

/* loaded from: classes3.dex */
public class OcrCharVariant {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public OcrCharVariant(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(OcrCharVariant ocrCharVariant) {
        if (ocrCharVariant == null) {
            return 0L;
        }
        return ocrCharVariant.swigCPtr;
    }

    public static long swigRelease(OcrCharVariant ocrCharVariant) {
        if (ocrCharVariant == null) {
            return 0L;
        }
        if (!ocrCharVariant.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = ocrCharVariant.swigCPtr;
        ocrCharVariant.swigCMemOwn = false;
        ocrCharVariant.delete();
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
                jnisecommonJNI.delete_OcrCharVariant(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public OcrCharVariant() {
        this(jnisecommonJNI.new_OcrCharVariant__SWIG_0(), true);
    }

    public OcrCharVariant(MutableString mutableString, float f) {
        this(jnisecommonJNI.new_OcrCharVariant__SWIG_1(MutableString.getCPtr(mutableString), mutableString, f), true);
    }

    public OcrCharVariant(String str, float f) {
        this(jnisecommonJNI.new_OcrCharVariant__SWIG_2(str, f), true);
    }

    public String GetCharacter() {
        return jnisecommonJNI.OcrCharVariant_GetCharacter(this.swigCPtr, this);
    }

    public void SetCharacter(MutableString mutableString) {
        jnisecommonJNI.OcrCharVariant_SetCharacter__SWIG_0(this.swigCPtr, this, MutableString.getCPtr(mutableString), mutableString);
    }

    public void SetCharacter(String str) {
        jnisecommonJNI.OcrCharVariant_SetCharacter__SWIG_1(this.swigCPtr, this, str);
    }

    public float GetConfidence() {
        return jnisecommonJNI.OcrCharVariant_GetConfidence(this.swigCPtr, this);
    }

    public void SetConfidence(float f) {
        jnisecommonJNI.OcrCharVariant_SetConfidence(this.swigCPtr, this, f);
    }

    public float GetInternalScore() {
        return jnisecommonJNI.OcrCharVariant_GetInternalScore(this.swigCPtr, this);
    }

    public void SetInternalScore(float f) {
        jnisecommonJNI.OcrCharVariant_SetInternalScore(this.swigCPtr, this, f);
    }

    public void Serialize(Serializer serializer) {
        jnisecommonJNI.OcrCharVariant_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
