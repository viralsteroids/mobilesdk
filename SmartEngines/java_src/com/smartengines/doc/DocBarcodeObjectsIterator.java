package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocBarcodeObjectsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocBarcodeObjectsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocBarcodeObjectsIterator docBarcodeObjectsIterator) {
        if (docBarcodeObjectsIterator == null) {
            return 0L;
        }
        return docBarcodeObjectsIterator.swigCPtr;
    }

    public static long swigRelease(DocBarcodeObjectsIterator docBarcodeObjectsIterator) {
        if (docBarcodeObjectsIterator == null) {
            return 0L;
        }
        if (!docBarcodeObjectsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docBarcodeObjectsIterator.swigCPtr;
        docBarcodeObjectsIterator.swigCMemOwn = false;
        docBarcodeObjectsIterator.delete();
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
                jnidocengineJNI.delete_DocBarcodeObjectsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocBarcodeObjectsIterator(DocBarcodeObjectsIterator docBarcodeObjectsIterator) {
        this(jnidocengineJNI.new_DocBarcodeObjectsIterator(getCPtr(docBarcodeObjectsIterator), docBarcodeObjectsIterator), true);
    }

    public DocBarcodeObject GetBarcodeObject() {
        return new DocBarcodeObject(jnidocengineJNI.DocBarcodeObjectsIterator_GetBarcodeObject(this.swigCPtr, this), false);
    }

    public DocBarcodeObject GetBarcodeObjectPtr() {
        long jDocBarcodeObjectsIterator_GetBarcodeObjectPtr = jnidocengineJNI.DocBarcodeObjectsIterator_GetBarcodeObjectPtr(this.swigCPtr, this);
        if (jDocBarcodeObjectsIterator_GetBarcodeObjectPtr == 0) {
            return null;
        }
        return new DocBarcodeObject(jDocBarcodeObjectsIterator_GetBarcodeObjectPtr, false);
    }

    public void Advance() {
        jnidocengineJNI.DocBarcodeObjectsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocBarcodeObjectsIterator docBarcodeObjectsIterator) {
        return jnidocengineJNI.DocBarcodeObjectsIterator_Equals(this.swigCPtr, this, getCPtr(docBarcodeObjectsIterator), docBarcodeObjectsIterator);
    }
}
