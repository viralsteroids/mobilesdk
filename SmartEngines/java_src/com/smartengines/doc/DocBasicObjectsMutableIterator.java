package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocBasicObjectsMutableIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocBasicObjectsMutableIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocBasicObjectsMutableIterator docBasicObjectsMutableIterator) {
        if (docBasicObjectsMutableIterator == null) {
            return 0L;
        }
        return docBasicObjectsMutableIterator.swigCPtr;
    }

    public static long swigRelease(DocBasicObjectsMutableIterator docBasicObjectsMutableIterator) {
        if (docBasicObjectsMutableIterator == null) {
            return 0L;
        }
        if (!docBasicObjectsMutableIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docBasicObjectsMutableIterator.swigCPtr;
        docBasicObjectsMutableIterator.swigCMemOwn = false;
        docBasicObjectsMutableIterator.delete();
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
                jnidocengineJNI.delete_DocBasicObjectsMutableIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocBasicObjectsMutableIterator(DocBasicObjectsMutableIterator docBasicObjectsMutableIterator) {
        this(jnidocengineJNI.new_DocBasicObjectsMutableIterator(getCPtr(docBasicObjectsMutableIterator), docBasicObjectsMutableIterator), true);
    }

    public int GetID() {
        return jnidocengineJNI.DocBasicObjectsMutableIterator_GetID(this.swigCPtr, this);
    }

    public DocBasicObject GetBasicObject() {
        return new DocBasicObject(jnidocengineJNI.DocBasicObjectsMutableIterator_GetBasicObject(this.swigCPtr, this), false);
    }

    public DocBasicObject GetMutableBasicObject() {
        return new DocBasicObject(jnidocengineJNI.DocBasicObjectsMutableIterator_GetMutableBasicObject(this.swigCPtr, this), false);
    }

    public DocTagsCollection GetTags() {
        return new DocTagsCollection(jnidocengineJNI.DocBasicObjectsMutableIterator_GetTags(this.swigCPtr, this), false);
    }

    public void Advance() {
        jnidocengineJNI.DocBasicObjectsMutableIterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocBasicObjectsMutableIterator docBasicObjectsMutableIterator) {
        return jnidocengineJNI.DocBasicObjectsMutableIterator_Equals(this.swigCPtr, this, getCPtr(docBasicObjectsMutableIterator), docBasicObjectsMutableIterator);
    }
}
