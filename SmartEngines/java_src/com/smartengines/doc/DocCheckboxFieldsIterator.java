package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocCheckboxFieldsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocCheckboxFieldsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocCheckboxFieldsIterator docCheckboxFieldsIterator) {
        if (docCheckboxFieldsIterator == null) {
            return 0L;
        }
        return docCheckboxFieldsIterator.swigCPtr;
    }

    public static long swigRelease(DocCheckboxFieldsIterator docCheckboxFieldsIterator) {
        if (docCheckboxFieldsIterator == null) {
            return 0L;
        }
        if (!docCheckboxFieldsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docCheckboxFieldsIterator.swigCPtr;
        docCheckboxFieldsIterator.swigCMemOwn = false;
        docCheckboxFieldsIterator.delete();
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
                jnidocengineJNI.delete_DocCheckboxFieldsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocCheckboxFieldsIterator(DocCheckboxFieldsIterator docCheckboxFieldsIterator) {
        this(jnidocengineJNI.new_DocCheckboxFieldsIterator(getCPtr(docCheckboxFieldsIterator), docCheckboxFieldsIterator), true);
    }

    public String GetKey() {
        return jnidocengineJNI.DocCheckboxFieldsIterator_GetKey(this.swigCPtr, this);
    }

    public DocCheckboxField GetField() {
        return new DocCheckboxField(jnidocengineJNI.DocCheckboxFieldsIterator_GetField(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocCheckboxFieldsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocCheckboxFieldsIterator docCheckboxFieldsIterator) {
        return jnidocengineJNI.DocCheckboxFieldsIterator_Equals(this.swigCPtr, this, getCPtr(docCheckboxFieldsIterator), docCheckboxFieldsIterator);
    }
}
