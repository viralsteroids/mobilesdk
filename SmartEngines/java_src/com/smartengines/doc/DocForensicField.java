package com.smartengines.doc;

import com.smartengines.common.Serializer;

/* loaded from: classes3.dex */
public class DocForensicField {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocForensicField(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocForensicField docForensicField) {
        if (docForensicField == null) {
            return 0L;
        }
        return docForensicField.swigCPtr;
    }

    public static long swigRelease(DocForensicField docForensicField) {
        if (docForensicField == null) {
            return 0L;
        }
        if (!docForensicField.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docForensicField.swigCPtr;
        docForensicField.swigCMemOwn = false;
        docForensicField.delete();
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
                jnidocengineJNI.delete_DocForensicField(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocBaseFieldInfo GetBaseFieldInfo() {
        return new DocBaseFieldInfo(jnidocengineJNI.DocForensicField_GetBaseFieldInfo(this.swigCPtr, this), false);
    }

    public DocBaseFieldInfo GetMutableBaseFieldInfo() {
        return new DocBaseFieldInfo(jnidocengineJNI.DocForensicField_GetMutableBaseFieldInfo(this.swigCPtr, this), false);
    }

    public String GetStatus() {
        return jnidocengineJNI.DocForensicField_GetStatus(this.swigCPtr, this);
    }

    public void SetStatus(String str) {
        jnidocengineJNI.DocForensicField_SetStatus(this.swigCPtr, this, str);
    }

    public void Serialize(Serializer serializer) {
        jnidocengineJNI.DocForensicField_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
