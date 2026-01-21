package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocObjectsCollectionsMutableSliceIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocObjectsCollectionsMutableSliceIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocObjectsCollectionsMutableSliceIterator docObjectsCollectionsMutableSliceIterator) {
        if (docObjectsCollectionsMutableSliceIterator == null) {
            return 0L;
        }
        return docObjectsCollectionsMutableSliceIterator.swigCPtr;
    }

    public static long swigRelease(DocObjectsCollectionsMutableSliceIterator docObjectsCollectionsMutableSliceIterator) {
        if (docObjectsCollectionsMutableSliceIterator == null) {
            return 0L;
        }
        if (!docObjectsCollectionsMutableSliceIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docObjectsCollectionsMutableSliceIterator.swigCPtr;
        docObjectsCollectionsMutableSliceIterator.swigCMemOwn = false;
        docObjectsCollectionsMutableSliceIterator.delete();
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
                jnidocengineJNI.delete_DocObjectsCollectionsMutableSliceIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocObjectsCollectionsMutableSliceIterator(DocObjectsCollectionsMutableSliceIterator docObjectsCollectionsMutableSliceIterator) {
        this(jnidocengineJNI.new_DocObjectsCollectionsMutableSliceIterator(getCPtr(docObjectsCollectionsMutableSliceIterator), docObjectsCollectionsMutableSliceIterator), true);
    }

    public int GetID() {
        return jnidocengineJNI.DocObjectsCollectionsMutableSliceIterator_GetID(this.swigCPtr, this);
    }

    public DocObjectsCollection GetObjectsCollection() {
        return new DocObjectsCollection(jnidocengineJNI.DocObjectsCollectionsMutableSliceIterator_GetObjectsCollection(this.swigCPtr, this), false);
    }

    public DocObjectsCollection GetMutableObjectsCollection() {
        return new DocObjectsCollection(jnidocengineJNI.m496xb2923eb6(this.swigCPtr, this), false);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocObjectsCollectionsMutableSliceIterator_GetTags(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocObjectsCollectionsMutableSliceIterator_Advance(this.swigCPtr, this);
    }

    public boolean Finished() {
        return jnidocengineJNI.DocObjectsCollectionsMutableSliceIterator_Finished(this.swigCPtr, this);
    }
}
