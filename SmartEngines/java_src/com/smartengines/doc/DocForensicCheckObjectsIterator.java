package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocForensicCheckObjectsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocForensicCheckObjectsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocForensicCheckObjectsIterator docForensicCheckObjectsIterator) {
        if (docForensicCheckObjectsIterator == null) {
            return 0L;
        }
        return docForensicCheckObjectsIterator.swigCPtr;
    }

    public static long swigRelease(DocForensicCheckObjectsIterator docForensicCheckObjectsIterator) {
        if (docForensicCheckObjectsIterator == null) {
            return 0L;
        }
        if (!docForensicCheckObjectsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docForensicCheckObjectsIterator.swigCPtr;
        docForensicCheckObjectsIterator.swigCMemOwn = false;
        docForensicCheckObjectsIterator.delete();
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
                jnidocengineJNI.delete_DocForensicCheckObjectsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocForensicCheckObjectsIterator(DocForensicCheckObjectsIterator docForensicCheckObjectsIterator) {
        this(jnidocengineJNI.new_DocForensicCheckObjectsIterator(getCPtr(docForensicCheckObjectsIterator), docForensicCheckObjectsIterator), true);
    }

    public DocForensicCheckObject GetForensicCheckObject() {
        return new DocForensicCheckObject(jnidocengineJNI.DocForensicCheckObjectsIterator_GetForensicCheckObject(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocForensicCheckObjectsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocForensicCheckObjectsIterator docForensicCheckObjectsIterator) {
        return jnidocengineJNI.DocForensicCheckObjectsIterator_Equals(this.swigCPtr, this, getCPtr(docForensicCheckObjectsIterator), docForensicCheckObjectsIterator);
    }
}
