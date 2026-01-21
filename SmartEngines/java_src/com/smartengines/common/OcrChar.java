package com.smartengines.common;

/* loaded from: classes3.dex */
public class OcrChar {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public OcrChar(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(OcrChar ocrChar) {
        if (ocrChar == null) {
            return 0L;
        }
        return ocrChar.swigCPtr;
    }

    public static long swigRelease(OcrChar ocrChar) {
        if (ocrChar == null) {
            return 0L;
        }
        if (!ocrChar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = ocrChar.swigCPtr;
        ocrChar.swigCMemOwn = false;
        ocrChar.delete();
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
                jnisecommonJNI.delete_OcrChar(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public OcrChar() {
        this(jnisecommonJNI.new_OcrChar__SWIG_0(), true);
    }

    public OcrChar(OcrCharVariant ocrCharVariant, int i, boolean z, Quadrangle quadrangle) {
        this(jnisecommonJNI.new_OcrChar__SWIG_1(OcrCharVariant.getCPtr(ocrCharVariant), ocrCharVariant, i, z, Quadrangle.getCPtr(quadrangle), quadrangle), true);
    }

    public OcrChar(OcrChar ocrChar) {
        this(jnisecommonJNI.new_OcrChar__SWIG_2(getCPtr(ocrChar), ocrChar), true);
    }

    public int GetVariantsCount() {
        return jnisecommonJNI.OcrChar_GetVariantsCount(this.swigCPtr, this);
    }

    public OcrCharVariant GetVariants() {
        long jOcrChar_GetVariants = jnisecommonJNI.OcrChar_GetVariants(this.swigCPtr, this);
        if (jOcrChar_GetVariants == 0) {
            return null;
        }
        return new OcrCharVariant(jOcrChar_GetVariants, false);
    }

    public OcrCharVariant GetVariant(int i) {
        return new OcrCharVariant(jnisecommonJNI.OcrChar_GetVariant(this.swigCPtr, this, i), false);
    }

    public OcrCharVariant GetMutableVariant(int i) {
        return new OcrCharVariant(jnisecommonJNI.OcrChar_GetMutableVariant(this.swigCPtr, this, i), false);
    }

    public void SetVariant(int i, OcrCharVariant ocrCharVariant) {
        jnisecommonJNI.OcrChar_SetVariant(this.swigCPtr, this, i, OcrCharVariant.getCPtr(ocrCharVariant), ocrCharVariant);
    }

    public void Resize(int i) {
        jnisecommonJNI.OcrChar_Resize(this.swigCPtr, this, i);
    }

    public boolean GetIsHighlighted() {
        return jnisecommonJNI.OcrChar_GetIsHighlighted(this.swigCPtr, this);
    }

    public void SetIsHighlighted(boolean z) {
        jnisecommonJNI.OcrChar_SetIsHighlighted(this.swigCPtr, this, z);
    }

    public Quadrangle GetQuadrangle() {
        return new Quadrangle(jnisecommonJNI.OcrChar_GetQuadrangle(this.swigCPtr, this), false);
    }

    public Quadrangle GetMutableQuadrangle() {
        return new Quadrangle(jnisecommonJNI.OcrChar_GetMutableQuadrangle(this.swigCPtr, this), false);
    }

    public void SetQuadrangle(Quadrangle quadrangle) {
        jnisecommonJNI.OcrChar_SetQuadrangle(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle);
    }

    public void SortVariants() {
        jnisecommonJNI.OcrChar_SortVariants(this.swigCPtr, this);
    }

    public OcrCharVariant GetFirstVariant() {
        return new OcrCharVariant(jnisecommonJNI.OcrChar_GetFirstVariant(this.swigCPtr, this), false);
    }

    public void Serialize(Serializer serializer) {
        jnisecommonJNI.OcrChar_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
