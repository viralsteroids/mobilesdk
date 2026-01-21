package com.smartengines.doc;

import com.smartengines.common.Serializer;

/* loaded from: classes3.dex */
public class DocGraphicalStructure {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocGraphicalStructure(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocGraphicalStructure docGraphicalStructure) {
        if (docGraphicalStructure == null) {
            return 0L;
        }
        return docGraphicalStructure.swigCPtr;
    }

    public static long swigRelease(DocGraphicalStructure docGraphicalStructure) {
        if (docGraphicalStructure == null) {
            return 0L;
        }
        if (!docGraphicalStructure.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docGraphicalStructure.swigCPtr;
        docGraphicalStructure.swigCMemOwn = false;
        docGraphicalStructure.delete();
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
                jnidocengineJNI.delete_DocGraphicalStructure(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int GetCollectionsCount() {
        return jnidocengineJNI.DocGraphicalStructure_GetCollectionsCount(this.swigCPtr, this);
    }

    public boolean HasCollection(int i) {
        return jnidocengineJNI.DocGraphicalStructure_HasCollection(this.swigCPtr, this, i);
    }

    public DocObjectsCollection GetCollection(int i) {
        return new DocObjectsCollection(jnidocengineJNI.DocGraphicalStructure_GetCollection(this.swigCPtr, this, i), false);
    }

    public DocObjectsCollection GetMutableCollection(int i) {
        return new DocObjectsCollection(jnidocengineJNI.DocGraphicalStructure_GetMutableCollection(this.swigCPtr, this, i), false);
    }

    public DocTagsCollection GetCollectionTags(int i) {
        return new DocTagsCollection(jnidocengineJNI.DocGraphicalStructure_GetCollectionTags(this.swigCPtr, this, i), false);
    }

    public DocObjectsCollectionsMutableIterator AddCollection(DocObjectsCollection docObjectsCollection) {
        return new DocObjectsCollectionsMutableIterator(jnidocengineJNI.DocGraphicalStructure_AddCollection__SWIG_0(this.swigCPtr, this, DocObjectsCollection.getCPtr(docObjectsCollection), docObjectsCollection), true);
    }

    public DocObjectsCollectionsMutableIterator AddCollection(DocObjectsCollection docObjectsCollection, DocTagsCollection docTagsCollection) {
        return new DocObjectsCollectionsMutableIterator(jnidocengineJNI.DocGraphicalStructure_AddCollection__SWIG_1(this.swigCPtr, this, DocObjectsCollection.getCPtr(docObjectsCollection), docObjectsCollection, DocTagsCollection.getCPtr(docTagsCollection), docTagsCollection), true);
    }

    public void SetCollection(int i, DocObjectsCollection docObjectsCollection) {
        jnidocengineJNI.DocGraphicalStructure_SetCollection(this.swigCPtr, this, i, DocObjectsCollection.getCPtr(docObjectsCollection), docObjectsCollection);
    }

    public void RemoveCollection(int i) {
        jnidocengineJNI.DocGraphicalStructure_RemoveCollection(this.swigCPtr, this, i);
    }

    public DocObjectsCollectionsIterator ObjectsCollectionsBegin() {
        return new DocObjectsCollectionsIterator(jnidocengineJNI.DocGraphicalStructure_ObjectsCollectionsBegin(this.swigCPtr, this), true);
    }

    public DocObjectsCollectionsIterator ObjectsCollectionsEnd() {
        return new DocObjectsCollectionsIterator(jnidocengineJNI.DocGraphicalStructure_ObjectsCollectionsEnd(this.swigCPtr, this), true);
    }

    public DocObjectsCollectionsMutableIterator MutableObjectsCollectionsBegin() {
        return new DocObjectsCollectionsMutableIterator(jnidocengineJNI.DocGraphicalStructure_MutableObjectsCollectionsBegin(this.swigCPtr, this), true);
    }

    public DocObjectsCollectionsMutableIterator MutableObjectsCollectionsEnd() {
        return new DocObjectsCollectionsMutableIterator(jnidocengineJNI.DocGraphicalStructure_MutableObjectsCollectionsEnd(this.swigCPtr, this), true);
    }

    public DocObjectsCollectionsSliceIterator ObjectsCollectionsSlice(String str) {
        return new DocObjectsCollectionsSliceIterator(jnidocengineJNI.DocGraphicalStructure_ObjectsCollectionsSlice(this.swigCPtr, this, str), true);
    }

    public DocObjectsCollectionsMutableSliceIterator MutableObjectsCollectionsSlice(String str) {
        return new DocObjectsCollectionsMutableSliceIterator(jnidocengineJNI.DocGraphicalStructure_MutableObjectsCollectionsSlice(this.swigCPtr, this, str), true);
    }

    public DocViewsCollection GetViewsCollection() {
        return new DocViewsCollection(jnidocengineJNI.DocGraphicalStructure_GetViewsCollection(this.swigCPtr, this), false);
    }

    public DocViewsCollection GetMutableViewsCollection() {
        return new DocViewsCollection(jnidocengineJNI.DocGraphicalStructure_GetMutableViewsCollection(this.swigCPtr, this), false);
    }

    public void Serialize(Serializer serializer) {
        jnidocengineJNI.DocGraphicalStructure_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
