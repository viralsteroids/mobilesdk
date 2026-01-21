package com.smartengines.common;

/* loaded from: classes3.dex */
public class OcrString {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public OcrString(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(OcrString ocrString) {
        if (ocrString == null) {
            return 0L;
        }
        return ocrString.swigCPtr;
    }

    public static long swigRelease(OcrString ocrString) {
        if (ocrString == null) {
            return 0L;
        }
        if (!ocrString.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = ocrString.swigCPtr;
        ocrString.swigCMemOwn = false;
        ocrString.delete();
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
                jnisecommonJNI.delete_OcrString(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public OcrString() {
        this(jnisecommonJNI.new_OcrString__SWIG_0(), true);
    }

    public OcrString(String str) {
        this(jnisecommonJNI.new_OcrString__SWIG_1(str), true);
    }

    public OcrString(OcrChar ocrChar, int i) {
        this(jnisecommonJNI.new_OcrString__SWIG_2(OcrChar.getCPtr(ocrChar), ocrChar, i), true);
    }

    public OcrString(OcrString ocrString) {
        this(jnisecommonJNI.new_OcrString__SWIG_3(getCPtr(ocrString), ocrString), true);
    }

    public int GetCharsCount() {
        return jnisecommonJNI.OcrString_GetCharsCount(this.swigCPtr, this);
    }

    public OcrChar GetChars() {
        long jOcrString_GetChars = jnisecommonJNI.OcrString_GetChars(this.swigCPtr, this);
        if (jOcrString_GetChars == 0) {
            return null;
        }
        return new OcrChar(jOcrString_GetChars, false);
    }

    public OcrChar GetChar(int i) {
        return new OcrChar(jnisecommonJNI.OcrString_GetChar(this.swigCPtr, this, i), false);
    }

    public OcrChar GetMutableChar(int i) {
        return new OcrChar(jnisecommonJNI.OcrString_GetMutableChar(this.swigCPtr, this, i), false);
    }

    public void SetChar(int i, OcrChar ocrChar) {
        jnisecommonJNI.OcrString_SetChar(this.swigCPtr, this, i, OcrChar.getCPtr(ocrChar), ocrChar);
    }

    public void AppendChar(OcrChar ocrChar) {
        jnisecommonJNI.OcrString_AppendChar(this.swigCPtr, this, OcrChar.getCPtr(ocrChar), ocrChar);
    }

    public void AppendString(OcrString ocrString) {
        jnisecommonJNI.OcrString_AppendString(this.swigCPtr, this, getCPtr(ocrString), ocrString);
    }

    public void Resize(int i) {
        jnisecommonJNI.OcrString_Resize(this.swigCPtr, this, i);
    }

    public Quadrangle GetQuadrangleByIndex(int i) {
        return new Quadrangle(jnisecommonJNI.OcrString_GetQuadrangleByIndex(this.swigCPtr, this, i), true);
    }

    public boolean GetAcceptFlag() {
        return jnisecommonJNI.OcrString_GetAcceptFlag(this.swigCPtr, this);
    }

    public boolean GetCellAcceptFlagByIndex(int i) {
        return jnisecommonJNI.OcrString_GetCellAcceptFlagByIndex(this.swigCPtr, this, i);
    }

    public float GetBestVariantConfidenceByIndex(int i) {
        return jnisecommonJNI.OcrString_GetBestVariantConfidenceByIndex(this.swigCPtr, this, i);
    }

    public void SortVariants() {
        jnisecommonJNI.OcrString_SortVariants(this.swigCPtr, this);
    }

    public MutableString GetFirstString() {
        return new MutableString(jnisecommonJNI.OcrString_GetFirstString(this.swigCPtr, this), true);
    }

    public void UnpackChars() {
        jnisecommonJNI.OcrString_UnpackChars(this.swigCPtr, this);
    }

    public void RepackChars() {
        jnisecommonJNI.OcrString_RepackChars(this.swigCPtr, this);
    }

    public void Serialize(Serializer serializer) {
        jnisecommonJNI.OcrString_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }

    public OcrPair GetPairTable() {
        long jOcrString_GetPairTable = jnisecommonJNI.OcrString_GetPairTable(this.swigCPtr, this);
        if (jOcrString_GetPairTable == 0) {
            return null;
        }
        return new OcrPair(jOcrString_GetPairTable, false);
    }
}
