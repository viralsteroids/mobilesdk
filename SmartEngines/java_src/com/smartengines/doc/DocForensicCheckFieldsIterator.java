package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocForensicCheckFieldsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocForensicCheckFieldsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocForensicCheckFieldsIterator docForensicCheckFieldsIterator) {
        if (docForensicCheckFieldsIterator == null) {
            return 0L;
        }
        return docForensicCheckFieldsIterator.swigCPtr;
    }

    public static long swigRelease(DocForensicCheckFieldsIterator docForensicCheckFieldsIterator) {
        if (docForensicCheckFieldsIterator == null) {
            return 0L;
        }
        if (!docForensicCheckFieldsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docForensicCheckFieldsIterator.swigCPtr;
        docForensicCheckFieldsIterator.swigCMemOwn = false;
        docForensicCheckFieldsIterator.delete();
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
                jnidocengineJNI.delete_DocForensicCheckFieldsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocForensicCheckFieldsIterator(DocForensicCheckFieldsIterator docForensicCheckFieldsIterator) {
        this(jnidocengineJNI.new_DocForensicCheckFieldsIterator(getCPtr(docForensicCheckFieldsIterator), docForensicCheckFieldsIterator), true);
    }

    public String GetKey() {
        return jnidocengineJNI.DocForensicCheckFieldsIterator_GetKey(this.swigCPtr, this);
    }

    public DocForensicCheckField GetField() {
        return new DocForensicCheckField(jnidocengineJNI.DocForensicCheckFieldsIterator_GetField(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocForensicCheckFieldsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocForensicCheckFieldsIterator docForensicCheckFieldsIterator) {
        return jnidocengineJNI.DocForensicCheckFieldsIterator_Equals(this.swigCPtr, this, getCPtr(docForensicCheckFieldsIterator), docForensicCheckFieldsIterator);
    }
}
