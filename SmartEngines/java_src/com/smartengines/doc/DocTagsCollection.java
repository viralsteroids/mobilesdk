package com.smartengines.doc;

import com.smartengines.common.Serializer;
import com.smartengines.common.StringsSetIterator;

/* loaded from: classes3.dex */
public class DocTagsCollection {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocTagsCollection(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocTagsCollection docTagsCollection) {
        if (docTagsCollection == null) {
            return 0L;
        }
        return docTagsCollection.swigCPtr;
    }

    public static long swigRelease(DocTagsCollection docTagsCollection) {
        if (docTagsCollection == null) {
            return 0L;
        }
        if (!docTagsCollection.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docTagsCollection.swigCPtr;
        docTagsCollection.swigCMemOwn = false;
        docTagsCollection.delete();
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
                jnidocengineJNI.delete_DocTagsCollection(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int GetTagsCount() {
        return jnidocengineJNI.DocTagsCollection_GetTagsCount(this.swigCPtr, this);
    }

    public boolean HasTag(String str) {
        return jnidocengineJNI.DocTagsCollection_HasTag(this.swigCPtr, this, str);
    }

    public void AddTag(String str) {
        jnidocengineJNI.DocTagsCollection_AddTag(this.swigCPtr, this, str);
    }

    public void RemoveTag(String str) {
        jnidocengineJNI.DocTagsCollection_RemoveTag(this.swigCPtr, this, str);
    }

    public StringsSetIterator TagsBegin() {
        return new StringsSetIterator(jnidocengineJNI.DocTagsCollection_TagsBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator TagsEnd() {
        return new StringsSetIterator(jnidocengineJNI.DocTagsCollection_TagsEnd(this.swigCPtr, this), true);
    }

    public void Serialize(Serializer serializer) {
        jnidocengineJNI.DocTagsCollection_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }

    public static DocTagsCollection Create() {
        long jDocTagsCollection_Create = jnidocengineJNI.DocTagsCollection_Create();
        if (jDocTagsCollection_Create == 0) {
            return null;
        }
        return new DocTagsCollection(jDocTagsCollection_Create, true);
    }
}
