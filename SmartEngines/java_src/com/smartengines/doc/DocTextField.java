package com.smartengines.doc;

import com.smartengines.common.OcrString;
import com.smartengines.common.Serializer;

/* loaded from: classes3.dex */
public class DocTextField {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocTextField(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocTextField docTextField) {
        if (docTextField == null) {
            return 0L;
        }
        return docTextField.swigCPtr;
    }

    public static long swigRelease(DocTextField docTextField) {
        if (docTextField == null) {
            return 0L;
        }
        if (!docTextField.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docTextField.swigCPtr;
        docTextField.swigCMemOwn = false;
        docTextField.delete();
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
                jnidocengineJNI.delete_DocTextField(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocBaseFieldInfo GetBaseFieldInfo() {
        return new DocBaseFieldInfo(jnidocengineJNI.DocTextField_GetBaseFieldInfo(this.swigCPtr, this), false);
    }

    public DocBaseFieldInfo GetMutableBaseFieldInfo() {
        return new DocBaseFieldInfo(jnidocengineJNI.DocTextField_GetMutableBaseFieldInfo(this.swigCPtr, this), false);
    }

    public OcrString GetOcrString() {
        return new OcrString(jnidocengineJNI.DocTextField_GetOcrString(this.swigCPtr, this), false);
    }

    public OcrString GetMutableOcrString() {
        return new OcrString(jnidocengineJNI.DocTextField_GetMutableOcrString(this.swigCPtr, this), false);
    }

    public void SetOcrString(OcrString ocrString) {
        jnidocengineJNI.DocTextField_SetOcrString(this.swigCPtr, this, OcrString.getCPtr(ocrString), ocrString);
    }

    public void Serialize(Serializer serializer) {
        jnidocengineJNI.DocTextField_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
