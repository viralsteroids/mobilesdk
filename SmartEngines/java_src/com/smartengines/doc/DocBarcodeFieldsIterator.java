package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocBarcodeFieldsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocBarcodeFieldsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocBarcodeFieldsIterator docBarcodeFieldsIterator) {
        if (docBarcodeFieldsIterator == null) {
            return 0L;
        }
        return docBarcodeFieldsIterator.swigCPtr;
    }

    public static long swigRelease(DocBarcodeFieldsIterator docBarcodeFieldsIterator) {
        if (docBarcodeFieldsIterator == null) {
            return 0L;
        }
        if (!docBarcodeFieldsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docBarcodeFieldsIterator.swigCPtr;
        docBarcodeFieldsIterator.swigCMemOwn = false;
        docBarcodeFieldsIterator.delete();
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
                jnidocengineJNI.delete_DocBarcodeFieldsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocBarcodeFieldsIterator(DocBarcodeFieldsIterator docBarcodeFieldsIterator) {
        this(jnidocengineJNI.new_DocBarcodeFieldsIterator(getCPtr(docBarcodeFieldsIterator), docBarcodeFieldsIterator), true);
    }

    public String GetKey() {
        return jnidocengineJNI.DocBarcodeFieldsIterator_GetKey(this.swigCPtr, this);
    }

    public DocBarcodeField GetField() {
        return new DocBarcodeField(jnidocengineJNI.DocBarcodeFieldsIterator_GetField(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocBarcodeFieldsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocBarcodeFieldsIterator docBarcodeFieldsIterator) {
        return jnidocengineJNI.DocBarcodeFieldsIterator_Equals(this.swigCPtr, this, getCPtr(docBarcodeFieldsIterator), docBarcodeFieldsIterator);
    }
}
