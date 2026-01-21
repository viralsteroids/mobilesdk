package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocObjectsCollectionsSliceIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocObjectsCollectionsSliceIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocObjectsCollectionsSliceIterator docObjectsCollectionsSliceIterator) {
        if (docObjectsCollectionsSliceIterator == null) {
            return 0L;
        }
        return docObjectsCollectionsSliceIterator.swigCPtr;
    }

    public static long swigRelease(DocObjectsCollectionsSliceIterator docObjectsCollectionsSliceIterator) {
        if (docObjectsCollectionsSliceIterator == null) {
            return 0L;
        }
        if (!docObjectsCollectionsSliceIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docObjectsCollectionsSliceIterator.swigCPtr;
        docObjectsCollectionsSliceIterator.swigCMemOwn = false;
        docObjectsCollectionsSliceIterator.delete();
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
                jnidocengineJNI.delete_DocObjectsCollectionsSliceIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocObjectsCollectionsSliceIterator(DocObjectsCollectionsSliceIterator docObjectsCollectionsSliceIterator) {
        this(jnidocengineJNI.new_DocObjectsCollectionsSliceIterator(getCPtr(docObjectsCollectionsSliceIterator), docObjectsCollectionsSliceIterator), true);
    }

    public int GetID() {
        return jnidocengineJNI.DocObjectsCollectionsSliceIterator_GetID(this.swigCPtr, this);
    }

    public DocObjectsCollection GetObjectsCollection() {
        return new DocObjectsCollection(jnidocengineJNI.DocObjectsCollectionsSliceIterator_GetObjectsCollection(this.swigCPtr, this), false);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocObjectsCollectionsSliceIterator_GetTags(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocObjectsCollectionsSliceIterator_Advance(this.swigCPtr, this);
    }

    public boolean Finished() {
        return jnidocengineJNI.DocObjectsCollectionsSliceIterator_Finished(this.swigCPtr, this);
    }
}
