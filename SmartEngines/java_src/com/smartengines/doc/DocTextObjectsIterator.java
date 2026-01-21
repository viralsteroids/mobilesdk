package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocTextObjectsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocTextObjectsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocTextObjectsIterator docTextObjectsIterator) {
        if (docTextObjectsIterator == null) {
            return 0L;
        }
        return docTextObjectsIterator.swigCPtr;
    }

    public static long swigRelease(DocTextObjectsIterator docTextObjectsIterator) {
        if (docTextObjectsIterator == null) {
            return 0L;
        }
        if (!docTextObjectsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docTextObjectsIterator.swigCPtr;
        docTextObjectsIterator.swigCMemOwn = false;
        docTextObjectsIterator.delete();
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
                jnidocengineJNI.delete_DocTextObjectsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocTextObjectsIterator(DocTextObjectsIterator docTextObjectsIterator) {
        this(jnidocengineJNI.new_DocTextObjectsIterator(getCPtr(docTextObjectsIterator), docTextObjectsIterator), true);
    }

    public DocTextObject GetTextObject() {
        return new DocTextObject(jnidocengineJNI.DocTextObjectsIterator_GetTextObject(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocTextObjectsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocTextObjectsIterator docTextObjectsIterator) {
        return jnidocengineJNI.DocTextObjectsIterator_Equals(this.swigCPtr, this, getCPtr(docTextObjectsIterator), docTextObjectsIterator);
    }
}
