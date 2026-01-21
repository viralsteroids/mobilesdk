package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocumentsMutableIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocumentsMutableIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocumentsMutableIterator documentsMutableIterator) {
        if (documentsMutableIterator == null) {
            return 0L;
        }
        return documentsMutableIterator.swigCPtr;
    }

    public static long swigRelease(DocumentsMutableIterator documentsMutableIterator) {
        if (documentsMutableIterator == null) {
            return 0L;
        }
        if (!documentsMutableIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = documentsMutableIterator.swigCPtr;
        documentsMutableIterator.swigCMemOwn = false;
        documentsMutableIterator.delete();
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
                jnidocengineJNI.delete_DocumentsMutableIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocumentsMutableIterator(DocumentsMutableIterator documentsMutableIterator) {
        this(jnidocengineJNI.new_DocumentsMutableIterator(getCPtr(documentsMutableIterator), documentsMutableIterator), true);
    }

    public int GetID() {
        return jnidocengineJNI.DocumentsMutableIterator_GetID(this.swigCPtr, this);
    }

    public Document GetDocument() {
        return new Document(jnidocengineJNI.DocumentsMutableIterator_GetDocument(this.swigCPtr, this), false);
    }

    public Document GetMutableDocument() {
        return new Document(jnidocengineJNI.DocumentsMutableIterator_GetMutableDocument(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocumentsMutableIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocumentsMutableIterator documentsMutableIterator) {
        return jnidocengineJNI.DocumentsMutableIterator_Equals(this.swigCPtr, this, getCPtr(documentsMutableIterator), documentsMutableIterator);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocumentsMutableIterator_GetTags(this.swigCPtr, this), false);
    }
}
