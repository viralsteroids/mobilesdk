package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocViewsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocViewsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocViewsIterator docViewsIterator) {
        if (docViewsIterator == null) {
            return 0L;
        }
        return docViewsIterator.swigCPtr;
    }

    public static long swigRelease(DocViewsIterator docViewsIterator) {
        if (docViewsIterator == null) {
            return 0L;
        }
        if (!docViewsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docViewsIterator.swigCPtr;
        docViewsIterator.swigCMemOwn = false;
        docViewsIterator.delete();
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
                jnidocengineJNI.delete_DocViewsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocViewsIterator(DocViewsIterator docViewsIterator) {
        this(jnidocengineJNI.new_DocViewsIterator(getCPtr(docViewsIterator), docViewsIterator), true);
    }

    public int GetID() {
        return jnidocengineJNI.DocViewsIterator_GetID(this.swigCPtr, this);
    }

    public DocView GetView() {
        return new DocView(jnidocengineJNI.DocViewsIterator_GetView(this.swigCPtr, this), false);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocViewsIterator_GetTags(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocViewsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocViewsIterator docViewsIterator) {
        return jnidocengineJNI.DocViewsIterator_Equals(this.swigCPtr, this, getCPtr(docViewsIterator), docViewsIterator);
    }
}
