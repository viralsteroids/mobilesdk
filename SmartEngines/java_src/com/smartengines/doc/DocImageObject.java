package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocImageObject extends DocBasicObject {
    private transient long swigCPtr;

    public DocImageObject(long j, boolean z) {
        super(jnidocengineJNI.DocImageObject_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(DocImageObject docImageObject) {
        if (docImageObject == null) {
            return 0L;
        }
        return docImageObject.swigCPtr;
    }

    public static long swigRelease(DocImageObject docImageObject) {
        if (docImageObject == null) {
            return 0L;
        }
        if (!docImageObject.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docImageObject.swigCPtr;
        docImageObject.swigCMemOwn = false;
        docImageObject.delete();
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
                jnidocengineJNI.delete_DocImageObject(this.swigCPtr);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static String ObjectTypeStatic() {
        return jnidocengineJNI.DocImageObject_ObjectTypeStatic();
    }
}
