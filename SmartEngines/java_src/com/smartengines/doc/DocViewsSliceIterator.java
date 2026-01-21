package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocViewsSliceIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocViewsSliceIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocViewsSliceIterator docViewsSliceIterator) {
        if (docViewsSliceIterator == null) {
            return 0L;
        }
        return docViewsSliceIterator.swigCPtr;
    }

    public static long swigRelease(DocViewsSliceIterator docViewsSliceIterator) {
        if (docViewsSliceIterator == null) {
            return 0L;
        }
        if (!docViewsSliceIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docViewsSliceIterator.swigCPtr;
        docViewsSliceIterator.swigCMemOwn = false;
        docViewsSliceIterator.delete();
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
                jnidocengineJNI.delete_DocViewsSliceIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocViewsSliceIterator(DocViewsSliceIterator docViewsSliceIterator) {
        this(jnidocengineJNI.new_DocViewsSliceIterator(getCPtr(docViewsSliceIterator), docViewsSliceIterator), true);
    }

    public int GetID() {
        return jnidocengineJNI.DocViewsSliceIterator_GetID(this.swigCPtr, this);
    }

    public DocView GetView() {
        return new DocView(jnidocengineJNI.DocViewsSliceIterator_GetView(this.swigCPtr, this), false);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocViewsSliceIterator_GetTags(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocViewsSliceIterator_Advance(this.swigCPtr, this);
    }

    public boolean Finished() {
        return jnidocengineJNI.DocViewsSliceIterator_Finished(this.swigCPtr, this);
    }
}
