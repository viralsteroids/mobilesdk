package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocImageObjectsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocImageObjectsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocImageObjectsIterator docImageObjectsIterator) {
        if (docImageObjectsIterator == null) {
            return 0L;
        }
        return docImageObjectsIterator.swigCPtr;
    }

    public static long swigRelease(DocImageObjectsIterator docImageObjectsIterator) {
        if (docImageObjectsIterator == null) {
            return 0L;
        }
        if (!docImageObjectsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docImageObjectsIterator.swigCPtr;
        docImageObjectsIterator.swigCMemOwn = false;
        docImageObjectsIterator.delete();
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
                jnidocengineJNI.delete_DocImageObjectsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocImageObjectsIterator(DocImageObjectsIterator docImageObjectsIterator) {
        this(jnidocengineJNI.new_DocImageObjectsIterator(getCPtr(docImageObjectsIterator), docImageObjectsIterator), true);
    }

    public DocImageObject GetImageObject() {
        return new DocImageObject(jnidocengineJNI.DocImageObjectsIterator_GetImageObject(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocImageObjectsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocImageObjectsIterator docImageObjectsIterator) {
        return jnidocengineJNI.DocImageObjectsIterator_Equals(this.swigCPtr, this, getCPtr(docImageObjectsIterator), docImageObjectsIterator);
    }
}
