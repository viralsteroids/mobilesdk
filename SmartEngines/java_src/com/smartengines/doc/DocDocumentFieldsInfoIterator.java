package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocDocumentFieldsInfoIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocDocumentFieldsInfoIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocDocumentFieldsInfoIterator docDocumentFieldsInfoIterator) {
        if (docDocumentFieldsInfoIterator == null) {
            return 0L;
        }
        return docDocumentFieldsInfoIterator.swigCPtr;
    }

    public static long swigRelease(DocDocumentFieldsInfoIterator docDocumentFieldsInfoIterator) {
        if (docDocumentFieldsInfoIterator == null) {
            return 0L;
        }
        if (!docDocumentFieldsInfoIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docDocumentFieldsInfoIterator.swigCPtr;
        docDocumentFieldsInfoIterator.swigCMemOwn = false;
        docDocumentFieldsInfoIterator.delete();
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
                jnidocengineJNI.delete_DocDocumentFieldsInfoIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocDocumentFieldsInfoIterator(DocDocumentFieldsInfoIterator docDocumentFieldsInfoIterator) {
        this(jnidocengineJNI.new_DocDocumentFieldsInfoIterator(getCPtr(docDocumentFieldsInfoIterator), docDocumentFieldsInfoIterator), true);
    }

    public String GetKey() {
        return jnidocengineJNI.DocDocumentFieldsInfoIterator_GetKey(this.swigCPtr, this);
    }

    public DocDocumentFieldInfo GetDocumentFieldInfo() {
        return new DocDocumentFieldInfo(jnidocengineJNI.DocDocumentFieldsInfoIterator_GetDocumentFieldInfo(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocDocumentFieldsInfoIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocDocumentFieldsInfoIterator docDocumentFieldsInfoIterator) {
        return jnidocengineJNI.DocDocumentFieldsInfoIterator_Equals(this.swigCPtr, this, getCPtr(docDocumentFieldsInfoIterator), docDocumentFieldsInfoIterator);
    }
}
