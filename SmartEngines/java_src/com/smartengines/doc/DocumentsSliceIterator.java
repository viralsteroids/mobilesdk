package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocumentsSliceIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocumentsSliceIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocumentsSliceIterator documentsSliceIterator) {
        if (documentsSliceIterator == null) {
            return 0L;
        }
        return documentsSliceIterator.swigCPtr;
    }

    public static long swigRelease(DocumentsSliceIterator documentsSliceIterator) {
        if (documentsSliceIterator == null) {
            return 0L;
        }
        if (!documentsSliceIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = documentsSliceIterator.swigCPtr;
        documentsSliceIterator.swigCMemOwn = false;
        documentsSliceIterator.delete();
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
                jnidocengineJNI.delete_DocumentsSliceIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocumentsSliceIterator(DocumentsSliceIterator documentsSliceIterator) {
        this(jnidocengineJNI.new_DocumentsSliceIterator(getCPtr(documentsSliceIterator), documentsSliceIterator), true);
    }

    public int GetID() {
        return jnidocengineJNI.DocumentsSliceIterator_GetID(this.swigCPtr, this);
    }

    public Document GetDocument() {
        return new Document(jnidocengineJNI.DocumentsSliceIterator_GetDocument(this.swigCPtr, this), false);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocumentsSliceIterator_GetTags(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocumentsSliceIterator_Advance(this.swigCPtr, this);
    }

    public boolean Finished() {
        return jnidocengineJNI.DocumentsSliceIterator_Finished(this.swigCPtr, this);
    }
}
