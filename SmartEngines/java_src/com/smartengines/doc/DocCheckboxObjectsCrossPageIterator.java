package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocCheckboxObjectsCrossPageIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocCheckboxObjectsCrossPageIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocCheckboxObjectsCrossPageIterator docCheckboxObjectsCrossPageIterator) {
        if (docCheckboxObjectsCrossPageIterator == null) {
            return 0L;
        }
        return docCheckboxObjectsCrossPageIterator.swigCPtr;
    }

    public static long swigRelease(DocCheckboxObjectsCrossPageIterator docCheckboxObjectsCrossPageIterator) {
        if (docCheckboxObjectsCrossPageIterator == null) {
            return 0L;
        }
        if (!docCheckboxObjectsCrossPageIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docCheckboxObjectsCrossPageIterator.swigCPtr;
        docCheckboxObjectsCrossPageIterator.swigCMemOwn = false;
        docCheckboxObjectsCrossPageIterator.delete();
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
                jnidocengineJNI.delete_DocCheckboxObjectsCrossPageIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocCheckboxObjectsCrossPageIterator(DocCheckboxObjectsCrossPageIterator docCheckboxObjectsCrossPageIterator) {
        this(jnidocengineJNI.new_DocCheckboxObjectsCrossPageIterator(getCPtr(docCheckboxObjectsCrossPageIterator), docCheckboxObjectsCrossPageIterator), true);
    }

    public int GetPhysicalPageID() {
        return jnidocengineJNI.DocCheckboxObjectsCrossPageIterator_GetPhysicalPageID(this.swigCPtr, this);
    }

    public int GetObjectID() {
        return jnidocengineJNI.DocCheckboxObjectsCrossPageIterator_GetObjectID(this.swigCPtr, this);
    }

    public DocCheckboxObject GetCheckboxObject() {
        return new DocCheckboxObject(jnidocengineJNI.DocCheckboxObjectsCrossPageIterator_GetCheckboxObject(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocCheckboxObjectsCrossPageIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocCheckboxObjectsCrossPageIterator docCheckboxObjectsCrossPageIterator) {
        return jnidocengineJNI.DocCheckboxObjectsCrossPageIterator_Equals(this.swigCPtr, this, getCPtr(docCheckboxObjectsCrossPageIterator), docCheckboxObjectsCrossPageIterator);
    }
}
