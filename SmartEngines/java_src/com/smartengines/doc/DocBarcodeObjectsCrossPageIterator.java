package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocBarcodeObjectsCrossPageIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocBarcodeObjectsCrossPageIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocBarcodeObjectsCrossPageIterator docBarcodeObjectsCrossPageIterator) {
        if (docBarcodeObjectsCrossPageIterator == null) {
            return 0L;
        }
        return docBarcodeObjectsCrossPageIterator.swigCPtr;
    }

    public static long swigRelease(DocBarcodeObjectsCrossPageIterator docBarcodeObjectsCrossPageIterator) {
        if (docBarcodeObjectsCrossPageIterator == null) {
            return 0L;
        }
        if (!docBarcodeObjectsCrossPageIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docBarcodeObjectsCrossPageIterator.swigCPtr;
        docBarcodeObjectsCrossPageIterator.swigCMemOwn = false;
        docBarcodeObjectsCrossPageIterator.delete();
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
                jnidocengineJNI.delete_DocBarcodeObjectsCrossPageIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocBarcodeObjectsCrossPageIterator(DocBarcodeObjectsCrossPageIterator docBarcodeObjectsCrossPageIterator) {
        this(jnidocengineJNI.new_DocBarcodeObjectsCrossPageIterator(getCPtr(docBarcodeObjectsCrossPageIterator), docBarcodeObjectsCrossPageIterator), true);
    }

    public int GetPhysicalPageID() {
        return jnidocengineJNI.DocBarcodeObjectsCrossPageIterator_GetPhysicalPageID(this.swigCPtr, this);
    }

    public int GetObjectID() {
        return jnidocengineJNI.DocBarcodeObjectsCrossPageIterator_GetObjectID(this.swigCPtr, this);
    }

    public DocBarcodeObject GetBarcodeObject() {
        return new DocBarcodeObject(jnidocengineJNI.DocBarcodeObjectsCrossPageIterator_GetBarcodeObject(this.swigCPtr, this), false);
    }

    public DocBarcodeObject GetBarcodeObjectPtr() {
        long jDocBarcodeObjectsCrossPageIterator_GetBarcodeObjectPtr = jnidocengineJNI.DocBarcodeObjectsCrossPageIterator_GetBarcodeObjectPtr(this.swigCPtr, this);
        if (jDocBarcodeObjectsCrossPageIterator_GetBarcodeObjectPtr == 0) {
            return null;
        }
        return new DocBarcodeObject(jDocBarcodeObjectsCrossPageIterator_GetBarcodeObjectPtr, false);
    }

    public void Advance() {
        jnidocengineJNI.DocBarcodeObjectsCrossPageIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocBarcodeObjectsCrossPageIterator docBarcodeObjectsCrossPageIterator) {
        return jnidocengineJNI.DocBarcodeObjectsCrossPageIterator_Equals(this.swigCPtr, this, getCPtr(docBarcodeObjectsCrossPageIterator), docBarcodeObjectsCrossPageIterator);
    }
}
