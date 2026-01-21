package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocLineObject extends DocBasicObject {
    private transient long swigCPtr;

    public DocLineObject(long j, boolean z) {
        super(jnidocengineJNI.DocLineObject_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(DocLineObject docLineObject) {
        if (docLineObject == null) {
            return 0L;
        }
        return docLineObject.swigCPtr;
    }

    public static long swigRelease(DocLineObject docLineObject) {
        if (docLineObject == null) {
            return 0L;
        }
        if (!docLineObject.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docLineObject.swigCPtr;
        docLineObject.swigCMemOwn = false;
        docLineObject.delete();
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
                jnidocengineJNI.delete_DocLineObject(this.swigCPtr);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static String ObjectTypeStatic() {
        return jnidocengineJNI.DocLineObject_ObjectTypeStatic();
    }
}
