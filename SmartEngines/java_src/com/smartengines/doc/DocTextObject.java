package com.smartengines.doc;

import com.smartengines.common.OcrString;

/* loaded from: classes3.dex */
public class DocTextObject extends DocBasicObject {
    private transient long swigCPtr;

    public DocTextObject(long j, boolean z) {
        super(jnidocengineJNI.DocTextObject_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(DocTextObject docTextObject) {
        if (docTextObject == null) {
            return 0L;
        }
        return docTextObject.swigCPtr;
    }

    public static long swigRelease(DocTextObject docTextObject) {
        if (docTextObject == null) {
            return 0L;
        }
        if (!docTextObject.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docTextObject.swigCPtr;
        docTextObject.swigCMemOwn = false;
        docTextObject.delete();
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
                jnidocengineJNI.delete_DocTextObject(this.swigCPtr);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static String ObjectTypeStatic() {
        return jnidocengineJNI.DocTextObject_ObjectTypeStatic();
    }

    public OcrString GetOcrString() {
        return new OcrString(jnidocengineJNI.DocTextObject_GetOcrString(this.swigCPtr, this), false);
    }

    public int GetTextLineObjectsCount() {
        return jnidocengineJNI.DocTextObject_GetTextLineObjectsCount(this.swigCPtr, this);
    }

    public DocTextLineObject GetTextLineObject(int i) {
        return new DocTextLineObject(jnidocengineJNI.DocTextObject_GetTextLineObject(this.swigCPtr, this, i), false);
    }

    public DocTextLineObject GetTextLineObjectPtr(int i) {
        long jDocTextObject_GetTextLineObjectPtr = jnidocengineJNI.DocTextObject_GetTextLineObjectPtr(this.swigCPtr, this, i);
        if (jDocTextObject_GetTextLineObjectPtr == 0) {
            return null;
        }
        return new DocTextLineObject(jDocTextObject_GetTextLineObjectPtr, false);
    }

    public OcrString GetMutableOcrString() {
        return new OcrString(jnidocengineJNI.DocTextObject_GetMutableOcrString(this.swigCPtr, this), false);
    }

    public void SetOcrString(OcrString ocrString) {
        jnidocengineJNI.DocTextObject_SetOcrString(this.swigCPtr, this, OcrString.getCPtr(ocrString), ocrString);
    }
}
