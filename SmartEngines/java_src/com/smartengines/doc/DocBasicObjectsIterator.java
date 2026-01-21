package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocBasicObjectsIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocBasicObjectsIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocBasicObjectsIterator docBasicObjectsIterator) {
        if (docBasicObjectsIterator == null) {
            return 0L;
        }
        return docBasicObjectsIterator.swigCPtr;
    }

    public static long swigRelease(DocBasicObjectsIterator docBasicObjectsIterator) {
        if (docBasicObjectsIterator == null) {
            return 0L;
        }
        if (!docBasicObjectsIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docBasicObjectsIterator.swigCPtr;
        docBasicObjectsIterator.swigCMemOwn = false;
        docBasicObjectsIterator.delete();
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
                jnidocengineJNI.delete_DocBasicObjectsIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocBasicObjectsIterator(DocBasicObjectsIterator docBasicObjectsIterator) {
        this(jnidocengineJNI.new_DocBasicObjectsIterator(getCPtr(docBasicObjectsIterator), docBasicObjectsIterator), true);
    }

    public int GetID() {
        return jnidocengineJNI.DocBasicObjectsIterator_GetID(this.swigCPtr, this);
    }

    public DocBasicObject GetBasicObject() {
        return new DocBasicObject(jnidocengineJNI.DocBasicObjectsIterator_GetBasicObject(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocBasicObjectsIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocBasicObjectsIterator docBasicObjectsIterator) {
        return jnidocengineJNI.DocBasicObjectsIterator_Equals(this.swigCPtr, this, getCPtr(docBasicObjectsIterator), docBasicObjectsIterator);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocBasicObjectsIterator_GetTags(this.swigCPtr, this), false);
    }
}
