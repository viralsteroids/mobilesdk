package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocCheckboxObjectsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocCheckboxObjectsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocCheckboxObjectsIterator docCheckboxObjectsIterator) {
        if (docCheckboxObjectsIterator == null) {
            return 0L;
        }
        return docCheckboxObjectsIterator.swigCPtr;
    }

    public static long swigRelease(DocCheckboxObjectsIterator docCheckboxObjectsIterator) {
        if (docCheckboxObjectsIterator == null) {
            return 0L;
        }
        if (!docCheckboxObjectsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docCheckboxObjectsIterator.swigCPtr;
        docCheckboxObjectsIterator.swigCMemOwn = false;
        docCheckboxObjectsIterator.delete();
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
                jnidocengineJNI.delete_DocCheckboxObjectsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocCheckboxObjectsIterator(DocCheckboxObjectsIterator docCheckboxObjectsIterator) {
        this(jnidocengineJNI.new_DocCheckboxObjectsIterator(getCPtr(docCheckboxObjectsIterator), docCheckboxObjectsIterator), true);
    }

    public DocCheckboxObject GetCheckboxObject() {
        return new DocCheckboxObject(jnidocengineJNI.DocCheckboxObjectsIterator_GetCheckboxObject(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocCheckboxObjectsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocCheckboxObjectsIterator docCheckboxObjectsIterator) {
        return jnidocengineJNI.DocCheckboxObjectsIterator_Equals(this.swigCPtr, this, getCPtr(docCheckboxObjectsIterator), docCheckboxObjectsIterator);
    }
}
