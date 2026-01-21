package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocBasicObjectsCrossSliceIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocBasicObjectsCrossSliceIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocBasicObjectsCrossSliceIterator docBasicObjectsCrossSliceIterator) {
        if (docBasicObjectsCrossSliceIterator == null) {
            return 0L;
        }
        return docBasicObjectsCrossSliceIterator.swigCPtr;
    }

    public static long swigRelease(DocBasicObjectsCrossSliceIterator docBasicObjectsCrossSliceIterator) {
        if (docBasicObjectsCrossSliceIterator == null) {
            return 0L;
        }
        if (!docBasicObjectsCrossSliceIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docBasicObjectsCrossSliceIterator.swigCPtr;
        docBasicObjectsCrossSliceIterator.swigCMemOwn = false;
        docBasicObjectsCrossSliceIterator.delete();
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
                jnidocengineJNI.delete_DocBasicObjectsCrossSliceIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocBasicObjectsCrossSliceIterator(DocBasicObjectsCrossSliceIterator docBasicObjectsCrossSliceIterator) {
        this(jnidocengineJNI.new_DocBasicObjectsCrossSliceIterator(getCPtr(docBasicObjectsCrossSliceIterator), docBasicObjectsCrossSliceIterator), true);
    }

    public int GetCollectionID() {
        return jnidocengineJNI.DocBasicObjectsCrossSliceIterator_GetCollectionID(this.swigCPtr, this);
    }

    public int GetObjectID() {
        return jnidocengineJNI.DocBasicObjectsCrossSliceIterator_GetObjectID(this.swigCPtr, this);
    }

    public DocBasicObject GetBasicObject() {
        return new DocBasicObject(jnidocengineJNI.DocBasicObjectsCrossSliceIterator_GetBasicObject(this.swigCPtr, this), false);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocBasicObjectsCrossSliceIterator_GetTags(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocBasicObjectsCrossSliceIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocBasicObjectsCrossSliceIterator docBasicObjectsCrossSliceIterator) {
        return jnidocengineJNI.DocBasicObjectsCrossSliceIterator_Equals(this.swigCPtr, this, getCPtr(docBasicObjectsCrossSliceIterator), docBasicObjectsCrossSliceIterator);
    }
}
