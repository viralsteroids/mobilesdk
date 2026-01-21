package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocMetaObjectsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocMetaObjectsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocMetaObjectsIterator docMetaObjectsIterator) {
        if (docMetaObjectsIterator == null) {
            return 0L;
        }
        return docMetaObjectsIterator.swigCPtr;
    }

    public static long swigRelease(DocMetaObjectsIterator docMetaObjectsIterator) {
        if (docMetaObjectsIterator == null) {
            return 0L;
        }
        if (!docMetaObjectsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docMetaObjectsIterator.swigCPtr;
        docMetaObjectsIterator.swigCMemOwn = false;
        docMetaObjectsIterator.delete();
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
                jnidocengineJNI.delete_DocMetaObjectsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocMetaObjectsIterator(DocMetaObjectsIterator docMetaObjectsIterator) {
        this(jnidocengineJNI.new_DocMetaObjectsIterator(getCPtr(docMetaObjectsIterator), docMetaObjectsIterator), true);
    }

    public DocMetaObject GetMetaObject() {
        return new DocMetaObject(jnidocengineJNI.DocMetaObjectsIterator_GetMetaObject(this.swigCPtr, this), false);
    }

    public DocMetaObject GetMetaObjectPtr() {
        long jDocMetaObjectsIterator_GetMetaObjectPtr = jnidocengineJNI.DocMetaObjectsIterator_GetMetaObjectPtr(this.swigCPtr, this);
        if (jDocMetaObjectsIterator_GetMetaObjectPtr == 0) {
            return null;
        }
        return new DocMetaObject(jDocMetaObjectsIterator_GetMetaObjectPtr, false);
    }

    public void Advance() {
        jnidocengineJNI.DocMetaObjectsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocMetaObjectsIterator docMetaObjectsIterator) {
        return jnidocengineJNI.DocMetaObjectsIterator_Equals(this.swigCPtr, this, getCPtr(docMetaObjectsIterator), docMetaObjectsIterator);
    }
}
