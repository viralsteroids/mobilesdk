package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocObjectsCollectionsMutableIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocObjectsCollectionsMutableIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocObjectsCollectionsMutableIterator docObjectsCollectionsMutableIterator) {
        if (docObjectsCollectionsMutableIterator == null) {
            return 0L;
        }
        return docObjectsCollectionsMutableIterator.swigCPtr;
    }

    public static long swigRelease(DocObjectsCollectionsMutableIterator docObjectsCollectionsMutableIterator) {
        if (docObjectsCollectionsMutableIterator == null) {
            return 0L;
        }
        if (!docObjectsCollectionsMutableIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docObjectsCollectionsMutableIterator.swigCPtr;
        docObjectsCollectionsMutableIterator.swigCMemOwn = false;
        docObjectsCollectionsMutableIterator.delete();
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
                jnidocengineJNI.delete_DocObjectsCollectionsMutableIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocObjectsCollectionsMutableIterator(DocObjectsCollectionsMutableIterator docObjectsCollectionsMutableIterator) {
        this(jnidocengineJNI.new_DocObjectsCollectionsMutableIterator(getCPtr(docObjectsCollectionsMutableIterator), docObjectsCollectionsMutableIterator), true);
    }

    public int GetID() {
        return jnidocengineJNI.DocObjectsCollectionsMutableIterator_GetID(this.swigCPtr, this);
    }

    public DocObjectsCollection GetObjectsCollection() {
        return new DocObjectsCollection(jnidocengineJNI.DocObjectsCollectionsMutableIterator_GetObjectsCollection(this.swigCPtr, this), false);
    }

    public DocObjectsCollection GetMutableObjectsCollection() {
        return new DocObjectsCollection(jnidocengineJNI.DocObjectsCollectionsMutableIterator_GetMutableObjectsCollection(this.swigCPtr, this), false);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocObjectsCollectionsMutableIterator_GetTags(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocObjectsCollectionsMutableIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocObjectsCollectionsMutableIterator docObjectsCollectionsMutableIterator) {
        return jnidocengineJNI.DocObjectsCollectionsMutableIterator_Equals(this.swigCPtr, this, getCPtr(docObjectsCollectionsMutableIterator), docObjectsCollectionsMutableIterator);
    }
}
