package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocTableFieldsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocTableFieldsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocTableFieldsIterator docTableFieldsIterator) {
        if (docTableFieldsIterator == null) {
            return 0L;
        }
        return docTableFieldsIterator.swigCPtr;
    }

    public static long swigRelease(DocTableFieldsIterator docTableFieldsIterator) {
        if (docTableFieldsIterator == null) {
            return 0L;
        }
        if (!docTableFieldsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docTableFieldsIterator.swigCPtr;
        docTableFieldsIterator.swigCMemOwn = false;
        docTableFieldsIterator.delete();
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
                jnidocengineJNI.delete_DocTableFieldsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocTableFieldsIterator(DocTableFieldsIterator docTableFieldsIterator) {
        this(jnidocengineJNI.new_DocTableFieldsIterator(getCPtr(docTableFieldsIterator), docTableFieldsIterator), true);
    }

    public String GetKey() {
        return jnidocengineJNI.DocTableFieldsIterator_GetKey(this.swigCPtr, this);
    }

    public DocTableField GetField() {
        return new DocTableField(jnidocengineJNI.DocTableFieldsIterator_GetField(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocTableFieldsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocTableFieldsIterator docTableFieldsIterator) {
        return jnidocengineJNI.DocTableFieldsIterator_Equals(this.swigCPtr, this, getCPtr(docTableFieldsIterator), docTableFieldsIterator);
    }
}
