package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocTableObjectsCrossPageIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocTableObjectsCrossPageIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocTableObjectsCrossPageIterator docTableObjectsCrossPageIterator) {
        if (docTableObjectsCrossPageIterator == null) {
            return 0L;
        }
        return docTableObjectsCrossPageIterator.swigCPtr;
    }

    public static long swigRelease(DocTableObjectsCrossPageIterator docTableObjectsCrossPageIterator) {
        if (docTableObjectsCrossPageIterator == null) {
            return 0L;
        }
        if (!docTableObjectsCrossPageIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docTableObjectsCrossPageIterator.swigCPtr;
        docTableObjectsCrossPageIterator.swigCMemOwn = false;
        docTableObjectsCrossPageIterator.delete();
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
                jnidocengineJNI.delete_DocTableObjectsCrossPageIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocTableObjectsCrossPageIterator(DocTableObjectsCrossPageIterator docTableObjectsCrossPageIterator) {
        this(jnidocengineJNI.new_DocTableObjectsCrossPageIterator(getCPtr(docTableObjectsCrossPageIterator), docTableObjectsCrossPageIterator), true);
    }

    public int GetPhysicalPageID() {
        return jnidocengineJNI.DocTableObjectsCrossPageIterator_GetPhysicalPageID(this.swigCPtr, this);
    }

    public int GetObjectID() {
        return jnidocengineJNI.DocTableObjectsCrossPageIterator_GetObjectID(this.swigCPtr, this);
    }

    public DocTableObject GetTableObject() {
        return new DocTableObject(jnidocengineJNI.DocTableObjectsCrossPageIterator_GetTableObject(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocTableObjectsCrossPageIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocTableObjectsCrossPageIterator docTableObjectsCrossPageIterator) {
        return jnidocengineJNI.DocTableObjectsCrossPageIterator_Equals(this.swigCPtr, this, getCPtr(docTableObjectsCrossPageIterator), docTableObjectsCrossPageIterator);
    }
}
