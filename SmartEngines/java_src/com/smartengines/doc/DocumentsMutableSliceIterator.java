package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocumentsMutableSliceIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocumentsMutableSliceIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocumentsMutableSliceIterator documentsMutableSliceIterator) {
        if (documentsMutableSliceIterator == null) {
            return 0L;
        }
        return documentsMutableSliceIterator.swigCPtr;
    }

    public static long swigRelease(DocumentsMutableSliceIterator documentsMutableSliceIterator) {
        if (documentsMutableSliceIterator == null) {
            return 0L;
        }
        if (!documentsMutableSliceIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = documentsMutableSliceIterator.swigCPtr;
        documentsMutableSliceIterator.swigCMemOwn = false;
        documentsMutableSliceIterator.delete();
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
                jnidocengineJNI.delete_DocumentsMutableSliceIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocumentsMutableSliceIterator(DocumentsMutableSliceIterator documentsMutableSliceIterator) {
        this(jnidocengineJNI.new_DocumentsMutableSliceIterator(getCPtr(documentsMutableSliceIterator), documentsMutableSliceIterator), true);
    }

    public int GetID() {
        return jnidocengineJNI.DocumentsMutableSliceIterator_GetID(this.swigCPtr, this);
    }

    public Document GetDocument() {
        return new Document(jnidocengineJNI.DocumentsMutableSliceIterator_GetDocument(this.swigCPtr, this), false);
    }

    public Document GetMutableDocument() {
        return new Document(jnidocengineJNI.DocumentsMutableSliceIterator_GetMutableDocument(this.swigCPtr, this), false);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocumentsMutableSliceIterator_GetTags(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocumentsMutableSliceIterator_Advance(this.swigCPtr, this);
    }

    public boolean Finished() {
        return jnidocengineJNI.DocumentsMutableSliceIterator_Finished(this.swigCPtr, this);
    }
}
