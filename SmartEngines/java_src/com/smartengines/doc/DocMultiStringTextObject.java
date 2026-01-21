package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocMultiStringTextObject extends DocBasicObject {
    private transient long swigCPtr;

    public DocMultiStringTextObject(long j, boolean z) {
        super(jnidocengineJNI.DocMultiStringTextObject_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(DocMultiStringTextObject docMultiStringTextObject) {
        if (docMultiStringTextObject == null) {
            return 0L;
        }
        return docMultiStringTextObject.swigCPtr;
    }

    public static long swigRelease(DocMultiStringTextObject docMultiStringTextObject) {
        if (docMultiStringTextObject == null) {
            return 0L;
        }
        if (!docMultiStringTextObject.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docMultiStringTextObject.swigCPtr;
        docMultiStringTextObject.swigCMemOwn = false;
        docMultiStringTextObject.delete();
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
                jnidocengineJNI.delete_DocMultiStringTextObject(this.swigCPtr);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static String ObjectTypeStatic() {
        return jnidocengineJNI.DocMultiStringTextObject_ObjectTypeStatic();
    }

    public int GetStringsCount() {
        return jnidocengineJNI.DocMultiStringTextObject_GetStringsCount(this.swigCPtr, this);
    }

    public void SetStringsCount(int i) {
        jnidocengineJNI.DocMultiStringTextObject_SetStringsCount(this.swigCPtr, this, i);
    }

    public DocTextObject GetStringObject(int i) {
        return new DocTextObject(jnidocengineJNI.DocMultiStringTextObject_GetStringObject(this.swigCPtr, this, i), false);
    }

    public DocTextObject GetMutableStringObject(int i) {
        return new DocTextObject(jnidocengineJNI.DocMultiStringTextObject_GetMutableStringObject(this.swigCPtr, this, i), false);
    }

    public void SetStringObject(int i, DocTextObject docTextObject) {
        jnidocengineJNI.DocMultiStringTextObject_SetStringObject(this.swigCPtr, this, i, DocTextObject.getCPtr(docTextObject), docTextObject);
    }
}
