package com.smartengines.doc;

import com.smartengines.common.MutableString;

/* loaded from: classes3.dex */
public class DocBarcodeObject extends DocBasicObject {
    private transient long swigCPtr;

    public DocBarcodeObject(long j, boolean z) {
        super(jnidocengineJNI.DocBarcodeObject_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(DocBarcodeObject docBarcodeObject) {
        if (docBarcodeObject == null) {
            return 0L;
        }
        return docBarcodeObject.swigCPtr;
    }

    public static long swigRelease(DocBarcodeObject docBarcodeObject) {
        if (docBarcodeObject == null) {
            return 0L;
        }
        if (!docBarcodeObject.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docBarcodeObject.swigCPtr;
        docBarcodeObject.swigCMemOwn = false;
        docBarcodeObject.delete();
        return j;
    }

    @Override // com.smartengines.doc.DocBasicObject
    protected void finalize() {
        delete();
    }

    @Override // com.smartengines.doc.DocBasicObject
    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                jnidocengineJNI.delete_DocBarcodeObject(this.swigCPtr);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static String ObjectTypeStatic() {
        return jnidocengineJNI.DocBarcodeObject_ObjectTypeStatic();
    }

    public MutableString GetDecodedString() {
        return new MutableString(jnidocengineJNI.DocBarcodeObject_GetDecodedString(this.swigCPtr, this), false);
    }

    public MutableString GetMutableDecodedString() {
        return new MutableString(jnidocengineJNI.DocBarcodeObject_GetMutableDecodedString(this.swigCPtr, this), false);
    }

    public void SetDecodedString(MutableString mutableString) {
        jnidocengineJNI.DocBarcodeObject_SetDecodedString(this.swigCPtr, this, MutableString.getCPtr(mutableString), mutableString);
    }
}
