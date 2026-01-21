package com.smartengines.doc;

import com.smartengines.common.MutableString;
import com.smartengines.common.Serializer;

/* loaded from: classes3.dex */
public class DocBarcodeField {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocBarcodeField(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocBarcodeField docBarcodeField) {
        if (docBarcodeField == null) {
            return 0L;
        }
        return docBarcodeField.swigCPtr;
    }

    public static long swigRelease(DocBarcodeField docBarcodeField) {
        if (docBarcodeField == null) {
            return 0L;
        }
        if (!docBarcodeField.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docBarcodeField.swigCPtr;
        docBarcodeField.swigCMemOwn = false;
        docBarcodeField.delete();
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
                jnidocengineJNI.delete_DocBarcodeField(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocBaseFieldInfo GetBaseFieldInfo() {
        return new DocBaseFieldInfo(jnidocengineJNI.DocBarcodeField_GetBaseFieldInfo(this.swigCPtr, this), false);
    }

    public DocBaseFieldInfo GetMutableBaseFieldInfo() {
        return new DocBaseFieldInfo(jnidocengineJNI.DocBarcodeField_GetMutableBaseFieldInfo(this.swigCPtr, this), false);
    }

    public MutableString GetDecodedString() {
        return new MutableString(jnidocengineJNI.DocBarcodeField_GetDecodedString(this.swigCPtr, this), false);
    }

    public MutableString GetMutableDecodedString() {
        return new MutableString(jnidocengineJNI.DocBarcodeField_GetMutableDecodedString(this.swigCPtr, this), false);
    }

    public void SetDecodedString(MutableString mutableString) {
        jnidocengineJNI.DocBarcodeField_SetDecodedString(this.swigCPtr, this, MutableString.getCPtr(mutableString), mutableString);
    }

    public void Serialize(Serializer serializer) {
        jnidocengineJNI.DocBarcodeField_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
