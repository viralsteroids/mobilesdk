package com.smartengines.doc;

import com.smartengines.common.Image;
import com.smartengines.common.ProjectiveTransform;
import com.smartengines.common.Serializer;

/* loaded from: classes3.dex */
public class DocViewsCollection {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocViewsCollection(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocViewsCollection docViewsCollection) {
        if (docViewsCollection == null) {
            return 0L;
        }
        return docViewsCollection.swigCPtr;
    }

    public static long swigRelease(DocViewsCollection docViewsCollection) {
        if (docViewsCollection == null) {
            return 0L;
        }
        if (!docViewsCollection.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docViewsCollection.swigCPtr;
        docViewsCollection.swigCMemOwn = false;
        docViewsCollection.delete();
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
                jnidocengineJNI.delete_DocViewsCollection(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public static String BaseClassNameStatic() {
        return jnidocengineJNI.DocViewsCollection_BaseClassNameStatic();
    }

    public int GetViewsCount() {
        return jnidocengineJNI.DocViewsCollection_GetViewsCount(this.swigCPtr, this);
    }

    public boolean HasView(int i) {
        return jnidocengineJNI.DocViewsCollection_HasView(this.swigCPtr, this, i);
    }

    public DocView GetView(int i) {
        return new DocView(jnidocengineJNI.DocViewsCollection_GetView(this.swigCPtr, this, i), false);
    }

    public DocView GetMutableView(int i) {
        return new DocView(jnidocengineJNI.DocViewsCollection_GetMutableView(this.swigCPtr, this, i), false);
    }

    public DocTagsCollection GetViewTags(int i) {
        return new DocTagsCollection(jnidocengineJNI.DocViewsCollection_GetViewTags(this.swigCPtr, this, i), false);
    }

    public DocViewsMutableIterator RegisterView(Image image) {
        return new DocViewsMutableIterator(jnidocengineJNI.DocViewsCollection_RegisterView(this.swigCPtr, this, Image.getCPtr(image), image), true);
    }

    public DocViewsMutableIterator RegisterDerivedView(Image image, int i, ProjectiveTransform projectiveTransform) {
        return new DocViewsMutableIterator(jnidocengineJNI.DocViewsCollection_RegisterDerivedView(this.swigCPtr, this, Image.getCPtr(image), image, i, ProjectiveTransform.getCPtr(projectiveTransform), projectiveTransform), true);
    }

    public void DeleteOrphans() {
        jnidocengineJNI.DocViewsCollection_DeleteOrphans(this.swigCPtr, this);
    }

    public void DeleteView(int i) {
        jnidocengineJNI.DocViewsCollection_DeleteView(this.swigCPtr, this, i);
    }

    public DocViewsIterator ViewsBegin() {
        return new DocViewsIterator(jnidocengineJNI.DocViewsCollection_ViewsBegin(this.swigCPtr, this), true);
    }

    public DocViewsIterator ViewsEnd() {
        return new DocViewsIterator(jnidocengineJNI.DocViewsCollection_ViewsEnd(this.swigCPtr, this), true);
    }

    public DocViewsMutableIterator MutableViewsBegin() {
        return new DocViewsMutableIterator(jnidocengineJNI.DocViewsCollection_MutableViewsBegin(this.swigCPtr, this), true);
    }

    public DocViewsMutableIterator MutableViewsEnd() {
        return new DocViewsMutableIterator(jnidocengineJNI.DocViewsCollection_MutableViewsEnd(this.swigCPtr, this), true);
    }

    public DocViewsSliceIterator ViewsSlice(String str) {
        return new DocViewsSliceIterator(jnidocengineJNI.DocViewsCollection_ViewsSlice(this.swigCPtr, this, str), true);
    }

    public DocViewsMutableSliceIterator MutableViewsSlice(String str) {
        return new DocViewsMutableSliceIterator(jnidocengineJNI.DocViewsCollection_MutableViewsSlice(this.swigCPtr, this, str), true);
    }

    public void Serialize(Serializer serializer) {
        jnidocengineJNI.DocViewsCollection_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
