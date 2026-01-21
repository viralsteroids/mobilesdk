package com.smartengines.doc;

import com.smartengines.common.Image;
import com.smartengines.common.ProjectiveTransform;
import com.smartengines.common.Serializer;

/* loaded from: classes3.dex */
public class DocView {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocView(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocView docView) {
        if (docView == null) {
            return 0L;
        }
        return docView.swigCPtr;
    }

    public static long swigRelease(DocView docView) {
        if (docView == null) {
            return 0L;
        }
        if (!docView.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docView.swigCPtr;
        docView.swigCMemOwn = false;
        docView.delete();
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
                jnidocengineJNI.delete_DocView(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public static String BaseClassNameStatic() {
        return jnidocengineJNI.DocView_BaseClassNameStatic();
    }

    public Image GetImage() {
        return new Image(jnidocengineJNI.DocView_GetImage(this.swigCPtr, this), false);
    }

    public Image GetMutableImage() {
        return new Image(jnidocengineJNI.DocView_GetMutableImage(this.swigCPtr, this), false);
    }

    public void SetImage(Image image) {
        jnidocengineJNI.DocView_SetImage(this.swigCPtr, this, Image.getCPtr(image), image);
    }

    public int GetAncestorID() {
        return jnidocengineJNI.DocView_GetAncestorID(this.swigCPtr, this);
    }

    public void SetAncestorID(int i) {
        jnidocengineJNI.DocView_SetAncestorID(this.swigCPtr, this, i);
    }

    public int GetRootAncestorID() {
        return jnidocengineJNI.DocView_GetRootAncestorID(this.swigCPtr, this);
    }

    public void SetRootAncestorID(int i) {
        jnidocengineJNI.DocView_SetRootAncestorID(this.swigCPtr, this, i);
    }

    public ProjectiveTransform GetTransform() {
        return new ProjectiveTransform(jnidocengineJNI.DocView_GetTransform(this.swigCPtr, this), false);
    }

    public ProjectiveTransform GetMutableTransform() {
        return new ProjectiveTransform(jnidocengineJNI.DocView_GetMutableTransform(this.swigCPtr, this), false);
    }

    public void SetTransform(ProjectiveTransform projectiveTransform) {
        jnidocengineJNI.DocView_SetTransform(this.swigCPtr, this, ProjectiveTransform.getCPtr(projectiveTransform), projectiveTransform);
    }

    public void Serialize(Serializer serializer) {
        jnidocengineJNI.DocView_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
