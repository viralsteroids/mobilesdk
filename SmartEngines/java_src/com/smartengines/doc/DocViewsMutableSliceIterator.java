package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocViewsMutableSliceIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocViewsMutableSliceIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocViewsMutableSliceIterator docViewsMutableSliceIterator) {
        if (docViewsMutableSliceIterator == null) {
            return 0L;
        }
        return docViewsMutableSliceIterator.swigCPtr;
    }

    public static long swigRelease(DocViewsMutableSliceIterator docViewsMutableSliceIterator) {
        if (docViewsMutableSliceIterator == null) {
            return 0L;
        }
        if (!docViewsMutableSliceIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docViewsMutableSliceIterator.swigCPtr;
        docViewsMutableSliceIterator.swigCMemOwn = false;
        docViewsMutableSliceIterator.delete();
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
                jnidocengineJNI.delete_DocViewsMutableSliceIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocViewsMutableSliceIterator(DocViewsMutableSliceIterator docViewsMutableSliceIterator) {
        this(jnidocengineJNI.new_DocViewsMutableSliceIterator(getCPtr(docViewsMutableSliceIterator), docViewsMutableSliceIterator), true);
    }

    public int GetID() {
        return jnidocengineJNI.DocViewsMutableSliceIterator_GetID(this.swigCPtr, this);
    }

    public DocView GetView() {
        return new DocView(jnidocengineJNI.DocViewsMutableSliceIterator_GetView(this.swigCPtr, this), false);
    }

    public DocView GetMutableView() {
        return new DocView(jnidocengineJNI.DocViewsMutableSliceIterator_GetMutableView(this.swigCPtr, this), false);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocViewsMutableSliceIterator_GetTags(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocViewsMutableSliceIterator_Advance(this.swigCPtr, this);
    }

    public boolean Finished() {
        return jnidocengineJNI.DocViewsMutableSliceIterator_Finished(this.swigCPtr, this);
    }
}
