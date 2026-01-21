package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocTemplateObject extends DocBasicObject {
    private transient long swigCPtr;

    public DocTemplateObject(long j, boolean z) {
        super(jnidocengineJNI.DocTemplateObject_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(DocTemplateObject docTemplateObject) {
        if (docTemplateObject == null) {
            return 0L;
        }
        return docTemplateObject.swigCPtr;
    }

    public static long swigRelease(DocTemplateObject docTemplateObject) {
        if (docTemplateObject == null) {
            return 0L;
        }
        if (!docTemplateObject.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docTemplateObject.swigCPtr;
        docTemplateObject.swigCMemOwn = false;
        docTemplateObject.delete();
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
                jnidocengineJNI.delete_DocTemplateObject(this.swigCPtr);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static String ObjectTypeStatic() {
        return jnidocengineJNI.DocTemplateObject_ObjectTypeStatic();
    }
}
