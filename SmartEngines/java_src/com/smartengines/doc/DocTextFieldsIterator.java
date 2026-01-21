package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocTextFieldsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocTextFieldsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocTextFieldsIterator docTextFieldsIterator) {
        if (docTextFieldsIterator == null) {
            return 0L;
        }
        return docTextFieldsIterator.swigCPtr;
    }

    public static long swigRelease(DocTextFieldsIterator docTextFieldsIterator) {
        if (docTextFieldsIterator == null) {
            return 0L;
        }
        if (!docTextFieldsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docTextFieldsIterator.swigCPtr;
        docTextFieldsIterator.swigCMemOwn = false;
        docTextFieldsIterator.delete();
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
                jnidocengineJNI.delete_DocTextFieldsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocTextFieldsIterator(DocTextFieldsIterator docTextFieldsIterator) {
        this(jnidocengineJNI.new_DocTextFieldsIterator(getCPtr(docTextFieldsIterator), docTextFieldsIterator), true);
    }

    public String GetKey() {
        return jnidocengineJNI.DocTextFieldsIterator_GetKey(this.swigCPtr, this);
    }

    public DocTextField GetField() {
        return new DocTextField(jnidocengineJNI.DocTextFieldsIterator_GetField(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocTextFieldsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocTextFieldsIterator docTextFieldsIterator) {
        return jnidocengineJNI.DocTextFieldsIterator_Equals(this.swigCPtr, this, getCPtr(docTextFieldsIterator), docTextFieldsIterator);
    }
}
