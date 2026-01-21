package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocImageFieldsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocImageFieldsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocImageFieldsIterator docImageFieldsIterator) {
        if (docImageFieldsIterator == null) {
            return 0L;
        }
        return docImageFieldsIterator.swigCPtr;
    }

    public static long swigRelease(DocImageFieldsIterator docImageFieldsIterator) {
        if (docImageFieldsIterator == null) {
            return 0L;
        }
        if (!docImageFieldsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docImageFieldsIterator.swigCPtr;
        docImageFieldsIterator.swigCMemOwn = false;
        docImageFieldsIterator.delete();
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
                jnidocengineJNI.delete_DocImageFieldsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocImageFieldsIterator(DocImageFieldsIterator docImageFieldsIterator) {
        this(jnidocengineJNI.new_DocImageFieldsIterator(getCPtr(docImageFieldsIterator), docImageFieldsIterator), true);
    }

    public String GetKey() {
        return jnidocengineJNI.DocImageFieldsIterator_GetKey(this.swigCPtr, this);
    }

    public DocImageField GetField() {
        return new DocImageField(jnidocengineJNI.DocImageFieldsIterator_GetField(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocImageFieldsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocImageFieldsIterator docImageFieldsIterator) {
        return jnidocengineJNI.DocImageFieldsIterator_Equals(this.swigCPtr, this, getCPtr(docImageFieldsIterator), docImageFieldsIterator);
    }
}
