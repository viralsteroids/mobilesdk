package com.smartengines.doc;

import com.smartengines.common.Serializer;

/* loaded from: classes3.dex */
public class DocObjectsCollection {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocObjectsCollection(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocObjectsCollection docObjectsCollection) {
        if (docObjectsCollection == null) {
            return 0L;
        }
        return docObjectsCollection.swigCPtr;
    }

    public static long swigRelease(DocObjectsCollection docObjectsCollection) {
        if (docObjectsCollection == null) {
            return 0L;
        }
        if (!docObjectsCollection.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docObjectsCollection.swigCPtr;
        docObjectsCollection.swigCMemOwn = false;
        docObjectsCollection.delete();
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
                jnidocengineJNI.delete_DocObjectsCollection(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public static String BaseClassNameStatic() {
        return jnidocengineJNI.DocObjectsCollection_BaseClassNameStatic();
    }

    public static DocObjectsCollection Create(String str) {
        long jDocObjectsCollection_Create = jnidocengineJNI.DocObjectsCollection_Create(str);
        if (jDocObjectsCollection_Create == 0) {
            return null;
        }
        return new DocObjectsCollection(jDocObjectsCollection_Create, true);
    }

    public DocBasicObject CreateObject() {
        long jDocObjectsCollection_CreateObject = jnidocengineJNI.DocObjectsCollection_CreateObject(this.swigCPtr, this);
        if (jDocObjectsCollection_CreateObject == 0) {
            return null;
        }
        return new DocBasicObject(jDocObjectsCollection_CreateObject, true);
    }

    public DocObjectsCollection Clone() {
        long jDocObjectsCollection_Clone = jnidocengineJNI.DocObjectsCollection_Clone(this.swigCPtr, this);
        if (jDocObjectsCollection_Clone == 0) {
            return null;
        }
        return new DocObjectsCollection(jDocObjectsCollection_Clone, true);
    }

    public String ObjectType() {
        return jnidocengineJNI.DocObjectsCollection_ObjectType(this.swigCPtr, this);
    }

    public int GetFrameID() {
        return jnidocengineJNI.DocObjectsCollection_GetFrameID(this.swigCPtr, this);
    }

    public void SetFrameID(int i) {
        jnidocengineJNI.DocObjectsCollection_SetFrameID(this.swigCPtr, this, i);
    }

    public int GetObjectsCount() {
        return jnidocengineJNI.DocObjectsCollection_GetObjectsCount(this.swigCPtr, this);
    }

    public boolean HasObject(int i) {
        return jnidocengineJNI.DocObjectsCollection_HasObject(this.swigCPtr, this, i);
    }

    public DocBasicObject GetObject(int i) {
        return new DocBasicObject(jnidocengineJNI.DocObjectsCollection_GetObject(this.swigCPtr, this, i), false);
    }

    public DocBasicObject GetMutableObject(int i) {
        return new DocBasicObject(jnidocengineJNI.DocObjectsCollection_GetMutableObject(this.swigCPtr, this, i), false);
    }

    public DocTagsCollection GetObjectTags(int i) {
        return new DocTagsCollection(jnidocengineJNI.DocObjectsCollection_GetObjectTags(this.swigCPtr, this, i), false);
    }

    public DocBasicObjectsMutableIterator AddObject(DocBasicObject docBasicObject) {
        return new DocBasicObjectsMutableIterator(jnidocengineJNI.DocObjectsCollection_AddObject(this.swigCPtr, this, DocBasicObject.getCPtr(docBasicObject), docBasicObject), true);
    }

    public void SetObject(int i, DocBasicObject docBasicObject) {
        jnidocengineJNI.DocObjectsCollection_SetObject(this.swigCPtr, this, i, DocBasicObject.getCPtr(docBasicObject), docBasicObject);
    }

    public void RemoveObject(int i) {
        jnidocengineJNI.DocObjectsCollection_RemoveObject(this.swigCPtr, this, i);
    }

    public void RemoveObjectDeep(int i, DocViewsCollection docViewsCollection) {
        jnidocengineJNI.DocObjectsCollection_RemoveObjectDeep(this.swigCPtr, this, i, DocViewsCollection.getCPtr(docViewsCollection), docViewsCollection);
    }

    public DocBasicObjectsIterator BasicObjectsBegin() {
        return new DocBasicObjectsIterator(jnidocengineJNI.DocObjectsCollection_BasicObjectsBegin(this.swigCPtr, this), true);
    }

    public DocBasicObjectsIterator BasicObjectsEnd() {
        return new DocBasicObjectsIterator(jnidocengineJNI.DocObjectsCollection_BasicObjectsEnd(this.swigCPtr, this), true);
    }

    public DocBasicObjectsMutableIterator MutableBasicObjectsBegin() {
        return new DocBasicObjectsMutableIterator(jnidocengineJNI.DocObjectsCollection_MutableBasicObjectsBegin(this.swigCPtr, this), true);
    }

    public DocBasicObjectsMutableIterator MutableBasicObjectsEnd() {
        return new DocBasicObjectsMutableIterator(jnidocengineJNI.DocObjectsCollection_MutableBasicObjectsEnd(this.swigCPtr, this), true);
    }

    public DocBasicObjectsSliceIterator BasicObjectsSlice(String str) {
        return new DocBasicObjectsSliceIterator(jnidocengineJNI.DocObjectsCollection_BasicObjectsSlice(this.swigCPtr, this, str), true);
    }

    public DocBasicObjectsMutableSliceIterator MutableBasicObjectsSlice(String str) {
        return new DocBasicObjectsMutableSliceIterator(jnidocengineJNI.DocObjectsCollection_MutableBasicObjectsSlice(this.swigCPtr, this, str), true);
    }

    public void Serialize(Serializer serializer) {
        jnidocengineJNI.DocObjectsCollection_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
