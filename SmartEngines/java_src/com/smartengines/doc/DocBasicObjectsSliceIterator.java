package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocBasicObjectsSliceIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocBasicObjectsSliceIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocBasicObjectsSliceIterator docBasicObjectsSliceIterator) {
        if (docBasicObjectsSliceIterator == null) {
            return 0L;
        }
        return docBasicObjectsSliceIterator.swigCPtr;
    }

    public static long swigRelease(DocBasicObjectsSliceIterator docBasicObjectsSliceIterator) {
        if (docBasicObjectsSliceIterator == null) {
            return 0L;
        }
        if (!docBasicObjectsSliceIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docBasicObjectsSliceIterator.swigCPtr;
        docBasicObjectsSliceIterator.swigCMemOwn = false;
        docBasicObjectsSliceIterator.delete();
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
                jnidocengineJNI.delete_DocBasicObjectsSliceIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocBasicObjectsSliceIterator(DocBasicObjectsSliceIterator docBasicObjectsSliceIterator) {
        this(jnidocengineJNI.new_DocBasicObjectsSliceIterator(getCPtr(docBasicObjectsSliceIterator), docBasicObjectsSliceIterator), true);
    }

    public int GetID() {
        return jnidocengineJNI.DocBasicObjectsSliceIterator_GetID(this.swigCPtr, this);
    }

    public DocBasicObject GetBasicObject() {
        return new DocBasicObject(jnidocengineJNI.DocBasicObjectsSliceIterator_GetBasicObject(this.swigCPtr, this), false);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocBasicObjectsSliceIterator_GetTags(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocBasicObjectsSliceIterator_Advance(this.swigCPtr, this);
    }

    public boolean Finished() {
        return jnidocengineJNI.DocBasicObjectsSliceIterator_Finished(this.swigCPtr, this);
    }
}
