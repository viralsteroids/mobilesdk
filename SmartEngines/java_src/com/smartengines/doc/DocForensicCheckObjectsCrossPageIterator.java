package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocForensicCheckObjectsCrossPageIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocForensicCheckObjectsCrossPageIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocForensicCheckObjectsCrossPageIterator docForensicCheckObjectsCrossPageIterator) {
        if (docForensicCheckObjectsCrossPageIterator == null) {
            return 0L;
        }
        return docForensicCheckObjectsCrossPageIterator.swigCPtr;
    }

    public static long swigRelease(DocForensicCheckObjectsCrossPageIterator docForensicCheckObjectsCrossPageIterator) {
        if (docForensicCheckObjectsCrossPageIterator == null) {
            return 0L;
        }
        if (!docForensicCheckObjectsCrossPageIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docForensicCheckObjectsCrossPageIterator.swigCPtr;
        docForensicCheckObjectsCrossPageIterator.swigCMemOwn = false;
        docForensicCheckObjectsCrossPageIterator.delete();
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
                jnidocengineJNI.delete_DocForensicCheckObjectsCrossPageIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocForensicCheckObjectsCrossPageIterator(DocForensicCheckObjectsCrossPageIterator docForensicCheckObjectsCrossPageIterator) {
        this(jnidocengineJNI.new_DocForensicCheckObjectsCrossPageIterator(getCPtr(docForensicCheckObjectsCrossPageIterator), docForensicCheckObjectsCrossPageIterator), true);
    }

    public int GetPhysicalPageID() {
        return jnidocengineJNI.DocForensicCheckObjectsCrossPageIterator_GetPhysicalPageID(this.swigCPtr, this);
    }

    public DocForensicCheckObject GetForensicCheckObject() {
        return new DocForensicCheckObject(jnidocengineJNI.DocForensicCheckObjectsCrossPageIterator_GetForensicCheckObject(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocForensicCheckObjectsCrossPageIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocForensicCheckObjectsCrossPageIterator docForensicCheckObjectsCrossPageIterator) {
        return jnidocengineJNI.DocForensicCheckObjectsCrossPageIterator_Equals(this.swigCPtr, this, getCPtr(docForensicCheckObjectsCrossPageIterator), docForensicCheckObjectsCrossPageIterator);
    }
}
