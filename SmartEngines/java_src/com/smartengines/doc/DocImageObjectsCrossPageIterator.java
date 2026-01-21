package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocImageObjectsCrossPageIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocImageObjectsCrossPageIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocImageObjectsCrossPageIterator docImageObjectsCrossPageIterator) {
        if (docImageObjectsCrossPageIterator == null) {
            return 0L;
        }
        return docImageObjectsCrossPageIterator.swigCPtr;
    }

    public static long swigRelease(DocImageObjectsCrossPageIterator docImageObjectsCrossPageIterator) {
        if (docImageObjectsCrossPageIterator == null) {
            return 0L;
        }
        if (!docImageObjectsCrossPageIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docImageObjectsCrossPageIterator.swigCPtr;
        docImageObjectsCrossPageIterator.swigCMemOwn = false;
        docImageObjectsCrossPageIterator.delete();
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
                jnidocengineJNI.delete_DocImageObjectsCrossPageIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocImageObjectsCrossPageIterator(DocImageObjectsCrossPageIterator docImageObjectsCrossPageIterator) {
        this(jnidocengineJNI.new_DocImageObjectsCrossPageIterator(getCPtr(docImageObjectsCrossPageIterator), docImageObjectsCrossPageIterator), true);
    }

    public int GetPhysicalPageID() {
        return jnidocengineJNI.DocImageObjectsCrossPageIterator_GetPhysicalPageID(this.swigCPtr, this);
    }

    public int GetObjectID() {
        return jnidocengineJNI.DocImageObjectsCrossPageIterator_GetObjectID(this.swigCPtr, this);
    }

    public DocImageObject GetImageObject() {
        return new DocImageObject(jnidocengineJNI.DocImageObjectsCrossPageIterator_GetImageObject(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocImageObjectsCrossPageIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocImageObjectsCrossPageIterator docImageObjectsCrossPageIterator) {
        return jnidocengineJNI.DocImageObjectsCrossPageIterator_Equals(this.swigCPtr, this, getCPtr(docImageObjectsCrossPageIterator), docImageObjectsCrossPageIterator);
    }
}
