package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocObjectsCollectionsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocObjectsCollectionsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocObjectsCollectionsIterator docObjectsCollectionsIterator) {
        if (docObjectsCollectionsIterator == null) {
            return 0L;
        }
        return docObjectsCollectionsIterator.swigCPtr;
    }

    public static long swigRelease(DocObjectsCollectionsIterator docObjectsCollectionsIterator) {
        if (docObjectsCollectionsIterator == null) {
            return 0L;
        }
        if (!docObjectsCollectionsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docObjectsCollectionsIterator.swigCPtr;
        docObjectsCollectionsIterator.swigCMemOwn = false;
        docObjectsCollectionsIterator.delete();
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
                jnidocengineJNI.delete_DocObjectsCollectionsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocObjectsCollectionsIterator(DocObjectsCollectionsIterator docObjectsCollectionsIterator) {
        this(jnidocengineJNI.new_DocObjectsCollectionsIterator(getCPtr(docObjectsCollectionsIterator), docObjectsCollectionsIterator), true);
    }

    public int GetID() {
        return jnidocengineJNI.DocObjectsCollectionsIterator_GetID(this.swigCPtr, this);
    }

    public DocObjectsCollection GetObjectsCollection() {
        return new DocObjectsCollection(jnidocengineJNI.DocObjectsCollectionsIterator_GetObjectsCollection(this.swigCPtr, this), false);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocObjectsCollectionsIterator_GetTags(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocObjectsCollectionsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocObjectsCollectionsIterator docObjectsCollectionsIterator) {
        return jnidocengineJNI.DocObjectsCollectionsIterator_Equals(this.swigCPtr, this, getCPtr(docObjectsCollectionsIterator), docObjectsCollectionsIterator);
    }
}
