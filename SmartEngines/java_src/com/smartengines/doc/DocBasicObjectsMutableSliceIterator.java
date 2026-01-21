package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocBasicObjectsMutableSliceIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocBasicObjectsMutableSliceIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocBasicObjectsMutableSliceIterator docBasicObjectsMutableSliceIterator) {
        if (docBasicObjectsMutableSliceIterator == null) {
            return 0L;
        }
        return docBasicObjectsMutableSliceIterator.swigCPtr;
    }

    public static long swigRelease(DocBasicObjectsMutableSliceIterator docBasicObjectsMutableSliceIterator) {
        if (docBasicObjectsMutableSliceIterator == null) {
            return 0L;
        }
        if (!docBasicObjectsMutableSliceIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docBasicObjectsMutableSliceIterator.swigCPtr;
        docBasicObjectsMutableSliceIterator.swigCMemOwn = false;
        docBasicObjectsMutableSliceIterator.delete();
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
                jnidocengineJNI.delete_DocBasicObjectsMutableSliceIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocBasicObjectsMutableSliceIterator(DocBasicObjectsMutableSliceIterator docBasicObjectsMutableSliceIterator) {
        this(jnidocengineJNI.new_DocBasicObjectsMutableSliceIterator(getCPtr(docBasicObjectsMutableSliceIterator), docBasicObjectsMutableSliceIterator), true);
    }

    public int GetID() {
        return jnidocengineJNI.DocBasicObjectsMutableSliceIterator_GetID(this.swigCPtr, this);
    }

    public DocBasicObject GetBasicObject() {
        return new DocBasicObject(jnidocengineJNI.DocBasicObjectsMutableSliceIterator_GetBasicObject(this.swigCPtr, this), false);
    }

    public DocBasicObject GetMutableBasicObject() {
        return new DocBasicObject(jnidocengineJNI.DocBasicObjectsMutableSliceIterator_GetMutableBasicObject(this.swigCPtr, this), false);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocBasicObjectsMutableSliceIterator_GetTags(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocBasicObjectsMutableSliceIterator_Advance(this.swigCPtr, this);
    }

    public boolean Finished() {
        return jnidocengineJNI.DocBasicObjectsMutableSliceIterator_Finished(this.swigCPtr, this);
    }
}
