package com.smartengines.doc;

import com.smartengines.common.OcrString;

/* loaded from: classes3.dex */
public class DocCheckboxObject extends DocBasicObject {
    private transient long swigCPtr;

    public DocCheckboxObject(long j, boolean z) {
        super(jnidocengineJNI.DocCheckboxObject_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(DocCheckboxObject docCheckboxObject) {
        if (docCheckboxObject == null) {
            return 0L;
        }
        return docCheckboxObject.swigCPtr;
    }

    public static long swigRelease(DocCheckboxObject docCheckboxObject) {
        if (docCheckboxObject == null) {
            return 0L;
        }
        if (!docCheckboxObject.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docCheckboxObject.swigCPtr;
        docCheckboxObject.swigCMemOwn = false;
        docCheckboxObject.delete();
        return j;
    }

    @Override // com.smartengines.doc.DocBasicObject
    protected void finalize() {
        delete();
    }

    @Override // com.smartengines.doc.DocBasicObject
    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                jnidocengineJNI.delete_DocCheckboxObject(this.swigCPtr);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static String ObjectTypeStatic() {
        return jnidocengineJNI.DocCheckboxObject_ObjectTypeStatic();
    }

    public OcrString GetOcrString() {
        return new OcrString(jnidocengineJNI.DocCheckboxObject_GetOcrString(this.swigCPtr, this), false);
    }

    public OcrString GetMutableOcrString() {
        return new OcrString(jnidocengineJNI.DocCheckboxObject_GetMutableOcrString(this.swigCPtr, this), false);
    }

    public void SetOcrString(OcrString ocrString) {
        jnidocengineJNI.DocCheckboxObject_SetOcrString(this.swigCPtr, this, OcrString.getCPtr(ocrString), ocrString);
    }
}
