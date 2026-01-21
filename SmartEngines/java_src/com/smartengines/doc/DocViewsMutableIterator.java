package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocViewsMutableIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocViewsMutableIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocViewsMutableIterator docViewsMutableIterator) {
        if (docViewsMutableIterator == null) {
            return 0L;
        }
        return docViewsMutableIterator.swigCPtr;
    }

    public static long swigRelease(DocViewsMutableIterator docViewsMutableIterator) {
        if (docViewsMutableIterator == null) {
            return 0L;
        }
        if (!docViewsMutableIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docViewsMutableIterator.swigCPtr;
        docViewsMutableIterator.swigCMemOwn = false;
        docViewsMutableIterator.delete();
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
                jnidocengineJNI.delete_DocViewsMutableIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocViewsMutableIterator(DocViewsMutableIterator docViewsMutableIterator) {
        this(jnidocengineJNI.new_DocViewsMutableIterator(getCPtr(docViewsMutableIterator), docViewsMutableIterator), true);
    }

    public int GetID() {
        return jnidocengineJNI.DocViewsMutableIterator_GetID(this.swigCPtr, this);
    }

    public DocView GetView() {
        return new DocView(jnidocengineJNI.DocViewsMutableIterator_GetView(this.swigCPtr, this), false);
    }

    public DocView GetMutableView() {
        return new DocView(jnidocengineJNI.DocViewsMutableIterator_GetMutableView(this.swigCPtr, this), false);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocViewsMutableIterator_GetTags(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocViewsMutableIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocViewsMutableIterator docViewsMutableIterator) {
        return jnidocengineJNI.DocViewsMutableIterator_Equals(this.swigCPtr, this, getCPtr(docViewsMutableIterator), docViewsMutableIterator);
    }
}
