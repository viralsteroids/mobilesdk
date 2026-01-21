package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocTextObjectsCrossPageIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocTextObjectsCrossPageIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocTextObjectsCrossPageIterator docTextObjectsCrossPageIterator) {
        if (docTextObjectsCrossPageIterator == null) {
            return 0L;
        }
        return docTextObjectsCrossPageIterator.swigCPtr;
    }

    public static long swigRelease(DocTextObjectsCrossPageIterator docTextObjectsCrossPageIterator) {
        if (docTextObjectsCrossPageIterator == null) {
            return 0L;
        }
        if (!docTextObjectsCrossPageIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docTextObjectsCrossPageIterator.swigCPtr;
        docTextObjectsCrossPageIterator.swigCMemOwn = false;
        docTextObjectsCrossPageIterator.delete();
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
                jnidocengineJNI.delete_DocTextObjectsCrossPageIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocTextObjectsCrossPageIterator(DocTextObjectsCrossPageIterator docTextObjectsCrossPageIterator) {
        this(jnidocengineJNI.new_DocTextObjectsCrossPageIterator(getCPtr(docTextObjectsCrossPageIterator), docTextObjectsCrossPageIterator), true);
    }

    public int GetPhysicalPageID() {
        return jnidocengineJNI.DocTextObjectsCrossPageIterator_GetPhysicalPageID(this.swigCPtr, this);
    }

    public int GetObjectID() {
        return jnidocengineJNI.DocTextObjectsCrossPageIterator_GetObjectID(this.swigCPtr, this);
    }

    public DocTextObject GetTextObject() {
        return new DocTextObject(jnidocengineJNI.DocTextObjectsCrossPageIterator_GetTextObject(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocTextObjectsCrossPageIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocTextObjectsCrossPageIterator docTextObjectsCrossPageIterator) {
        return jnidocengineJNI.DocTextObjectsCrossPageIterator_Equals(this.swigCPtr, this, getCPtr(docTextObjectsCrossPageIterator), docTextObjectsCrossPageIterator);
    }
}
