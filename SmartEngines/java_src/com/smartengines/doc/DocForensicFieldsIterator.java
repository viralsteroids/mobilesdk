package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocForensicFieldsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocForensicFieldsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocForensicFieldsIterator docForensicFieldsIterator) {
        if (docForensicFieldsIterator == null) {
            return 0L;
        }
        return docForensicFieldsIterator.swigCPtr;
    }

    public static long swigRelease(DocForensicFieldsIterator docForensicFieldsIterator) {
        if (docForensicFieldsIterator == null) {
            return 0L;
        }
        if (!docForensicFieldsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docForensicFieldsIterator.swigCPtr;
        docForensicFieldsIterator.swigCMemOwn = false;
        docForensicFieldsIterator.delete();
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
                jnidocengineJNI.delete_DocForensicFieldsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocForensicFieldsIterator(DocForensicFieldsIterator docForensicFieldsIterator) {
        this(jnidocengineJNI.new_DocForensicFieldsIterator(getCPtr(docForensicFieldsIterator), docForensicFieldsIterator), true);
    }

    public String GetKey() {
        return jnidocengineJNI.DocForensicFieldsIterator_GetKey(this.swigCPtr, this);
    }

    public DocForensicField GetField() {
        return new DocForensicField(jnidocengineJNI.DocForensicFieldsIterator_GetField(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocForensicFieldsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocForensicFieldsIterator docForensicFieldsIterator) {
        return jnidocengineJNI.DocForensicFieldsIterator_Equals(this.swigCPtr, this, getCPtr(docForensicFieldsIterator), docForensicFieldsIterator);
    }
}
