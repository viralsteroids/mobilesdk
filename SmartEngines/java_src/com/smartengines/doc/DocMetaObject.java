package com.smartengines.doc;

import com.smartengines.common.OcrString;

/* loaded from: classes3.dex */
public class DocMetaObject extends DocBasicObject {
    private transient long swigCPtr;

    public DocMetaObject(long j, boolean z) {
        super(jnidocengineJNI.DocMetaObject_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(DocMetaObject docMetaObject) {
        if (docMetaObject == null) {
            return 0L;
        }
        return docMetaObject.swigCPtr;
    }

    public static long swigRelease(DocMetaObject docMetaObject) {
        if (docMetaObject == null) {
            return 0L;
        }
        if (!docMetaObject.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docMetaObject.swigCPtr;
        docMetaObject.swigCMemOwn = false;
        docMetaObject.delete();
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
                jnidocengineJNI.delete_DocMetaObject(this.swigCPtr);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static String ObjectTypeStatic() {
        return jnidocengineJNI.DocMetaObject_ObjectTypeStatic();
    }

    public OcrString GetOcrString() {
        return new OcrString(jnidocengineJNI.DocMetaObject_GetOcrString(this.swigCPtr, this), false);
    }

    public OcrString GetMutableOcrString() {
        return new OcrString(jnidocengineJNI.DocMetaObject_GetMutableOcrString(this.swigCPtr, this), false);
    }

    public void SetOcrString(OcrString ocrString) {
        jnidocengineJNI.DocMetaObject_SetOcrString(this.swigCPtr, this, OcrString.getCPtr(ocrString), ocrString);
    }
}
