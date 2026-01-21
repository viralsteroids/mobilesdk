package com.smartengines.doc;

import com.smartengines.common.OcrString;

/* loaded from: classes3.dex */
public class DocForensicCheckObject extends DocBasicObject {
    private transient long swigCPtr;

    public DocForensicCheckObject(long j, boolean z) {
        super(jnidocengineJNI.DocForensicCheckObject_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(DocForensicCheckObject docForensicCheckObject) {
        if (docForensicCheckObject == null) {
            return 0L;
        }
        return docForensicCheckObject.swigCPtr;
    }

    public static long swigRelease(DocForensicCheckObject docForensicCheckObject) {
        if (docForensicCheckObject == null) {
            return 0L;
        }
        if (!docForensicCheckObject.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docForensicCheckObject.swigCPtr;
        docForensicCheckObject.swigCMemOwn = false;
        docForensicCheckObject.delete();
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
                jnidocengineJNI.delete_DocForensicCheckObject(this.swigCPtr);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static String ObjectTypeStatic() {
        return jnidocengineJNI.DocForensicCheckObject_ObjectTypeStatic();
    }

    public OcrString GetOcrString() {
        return new OcrString(jnidocengineJNI.DocForensicCheckObject_GetOcrString(this.swigCPtr, this), false);
    }

    public OcrString GetMutableOcrString() {
        return new OcrString(jnidocengineJNI.DocForensicCheckObject_GetMutableOcrString(this.swigCPtr, this), false);
    }
}
