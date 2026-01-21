package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocBasicObjectsMutableCrossSliceIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocBasicObjectsMutableCrossSliceIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocBasicObjectsMutableCrossSliceIterator docBasicObjectsMutableCrossSliceIterator) {
        if (docBasicObjectsMutableCrossSliceIterator == null) {
            return 0L;
        }
        return docBasicObjectsMutableCrossSliceIterator.swigCPtr;
    }

    public static long swigRelease(DocBasicObjectsMutableCrossSliceIterator docBasicObjectsMutableCrossSliceIterator) {
        if (docBasicObjectsMutableCrossSliceIterator == null) {
            return 0L;
        }
        if (!docBasicObjectsMutableCrossSliceIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docBasicObjectsMutableCrossSliceIterator.swigCPtr;
        docBasicObjectsMutableCrossSliceIterator.swigCMemOwn = false;
        docBasicObjectsMutableCrossSliceIterator.delete();
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
                jnidocengineJNI.delete_DocBasicObjectsMutableCrossSliceIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocBasicObjectsMutableCrossSliceIterator(DocBasicObjectsMutableCrossSliceIterator docBasicObjectsMutableCrossSliceIterator) {
        this(jnidocengineJNI.new_DocBasicObjectsMutableCrossSliceIterator(getCPtr(docBasicObjectsMutableCrossSliceIterator), docBasicObjectsMutableCrossSliceIterator), true);
    }

    public int GetCollectionID() {
        return jnidocengineJNI.DocBasicObjectsMutableCrossSliceIterator_GetCollectionID(this.swigCPtr, this);
    }

    public int GetObjectID() {
        return jnidocengineJNI.DocBasicObjectsMutableCrossSliceIterator_GetObjectID(this.swigCPtr, this);
    }

    public DocBasicObject GetBasicObject() {
        return new DocBasicObject(jnidocengineJNI.DocBasicObjectsMutableCrossSliceIterator_GetBasicObject(this.swigCPtr, this), false);
    }

    public DocBasicObject GetMutableBasicObject() {
        return new DocBasicObject(jnidocengineJNI.DocBasicObjectsMutableCrossSliceIterator_GetMutableBasicObject(this.swigCPtr, this), false);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocBasicObjectsMutableCrossSliceIterator_GetTags(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocBasicObjectsMutableCrossSliceIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocBasicObjectsMutableCrossSliceIterator docBasicObjectsMutableCrossSliceIterator) {
        return jnidocengineJNI.DocBasicObjectsMutableCrossSliceIterator_Equals(this.swigCPtr, this, getCPtr(docBasicObjectsMutableCrossSliceIterator), docBasicObjectsMutableCrossSliceIterator);
    }
}
