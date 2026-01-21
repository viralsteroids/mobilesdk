package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocumentsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocumentsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocumentsIterator documentsIterator) {
        if (documentsIterator == null) {
            return 0L;
        }
        return documentsIterator.swigCPtr;
    }

    public static long swigRelease(DocumentsIterator documentsIterator) {
        if (documentsIterator == null) {
            return 0L;
        }
        if (!documentsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = documentsIterator.swigCPtr;
        documentsIterator.swigCMemOwn = false;
        documentsIterator.delete();
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
                jnidocengineJNI.delete_DocumentsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocumentsIterator(DocumentsIterator documentsIterator) {
        this(jnidocengineJNI.new_DocumentsIterator(getCPtr(documentsIterator), documentsIterator), true);
    }

    public int GetID() {
        return jnidocengineJNI.DocumentsIterator_GetID(this.swigCPtr, this);
    }

    public Document GetDocument() {
        return new Document(jnidocengineJNI.DocumentsIterator_GetDocument(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocumentsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocumentsIterator documentsIterator) {
        return jnidocengineJNI.DocumentsIterator_Equals(this.swigCPtr, this, getCPtr(documentsIterator), documentsIterator);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocumentsIterator_GetTags(this.swigCPtr, this), false);
    }
}
