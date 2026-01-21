package com.smartengines.doc;

import com.smartengines.common.Image;
import com.smartengines.common.Serializer;

/* loaded from: classes3.dex */
public class DocImageField {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocImageField(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocImageField docImageField) {
        if (docImageField == null) {
            return 0L;
        }
        return docImageField.swigCPtr;
    }

    public static long swigRelease(DocImageField docImageField) {
        if (docImageField == null) {
            return 0L;
        }
        if (!docImageField.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docImageField.swigCPtr;
        docImageField.swigCMemOwn = false;
        docImageField.delete();
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
                jnidocengineJNI.delete_DocImageField(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocBaseFieldInfo GetBaseFieldInfo() {
        return new DocBaseFieldInfo(jnidocengineJNI.DocImageField_GetBaseFieldInfo(this.swigCPtr, this), false);
    }

    public DocBaseFieldInfo GetMutableBaseFieldInfo() {
        return new DocBaseFieldInfo(jnidocengineJNI.DocImageField_GetMutableBaseFieldInfo(this.swigCPtr, this), false);
    }

    public Image GetImage() {
        return new Image(jnidocengineJNI.DocImageField_GetImage(this.swigCPtr, this), false);
    }

    public Image GetMutableImage() {
        return new Image(jnidocengineJNI.DocImageField_GetMutableImage(this.swigCPtr, this), false);
    }

    public void SetImage(Image image) {
        jnidocengineJNI.DocImageField_SetImage(this.swigCPtr, this, Image.getCPtr(image), image);
    }

    public void Serialize(Serializer serializer) {
        jnidocengineJNI.DocImageField_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
