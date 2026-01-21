package com.smartengines.doc;

import com.smartengines.common.Serializer;

/* loaded from: classes3.dex */
public class DocCheckboxField {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocCheckboxField(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocCheckboxField docCheckboxField) {
        if (docCheckboxField == null) {
            return 0L;
        }
        return docCheckboxField.swigCPtr;
    }

    public static long swigRelease(DocCheckboxField docCheckboxField) {
        if (docCheckboxField == null) {
            return 0L;
        }
        if (!docCheckboxField.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docCheckboxField.swigCPtr;
        docCheckboxField.swigCMemOwn = false;
        docCheckboxField.delete();
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
                jnidocengineJNI.delete_DocCheckboxField(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocBaseFieldInfo GetBaseFieldInfo() {
        return new DocBaseFieldInfo(jnidocengineJNI.DocCheckboxField_GetBaseFieldInfo(this.swigCPtr, this), false);
    }

    public DocBaseFieldInfo GetMutableBaseFieldInfo() {
        return new DocBaseFieldInfo(jnidocengineJNI.DocCheckboxField_GetMutableBaseFieldInfo(this.swigCPtr, this), false);
    }

    public boolean GetTickStatus() {
        return jnidocengineJNI.DocCheckboxField_GetTickStatus(this.swigCPtr, this);
    }

    public void SetTickStatus(boolean z) {
        jnidocengineJNI.DocCheckboxField_SetTickStatus(this.swigCPtr, this, z);
    }

    public void Serialize(Serializer serializer) {
        jnidocengineJNI.DocCheckboxField_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
