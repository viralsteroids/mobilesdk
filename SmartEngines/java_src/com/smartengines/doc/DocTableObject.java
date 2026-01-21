package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocTableObject extends DocBasicObject {
    private transient long swigCPtr;

    public DocTableObject(long j, boolean z) {
        super(jnidocengineJNI.DocTableObject_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(DocTableObject docTableObject) {
        if (docTableObject == null) {
            return 0L;
        }
        return docTableObject.swigCPtr;
    }

    public static long swigRelease(DocTableObject docTableObject) {
        if (docTableObject == null) {
            return 0L;
        }
        if (!docTableObject.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docTableObject.swigCPtr;
        docTableObject.swigCMemOwn = false;
        docTableObject.delete();
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
                jnidocengineJNI.delete_DocTableObject(this.swigCPtr);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static String ObjectTypeStatic() {
        return jnidocengineJNI.DocTableObject_ObjectTypeStatic();
    }

    public int GetRowsCount() {
        return jnidocengineJNI.DocTableObject_GetRowsCount(this.swigCPtr, this);
    }

    public int GetColsCount(int i) {
        return jnidocengineJNI.DocTableObject_GetColsCount(this.swigCPtr, this, i);
    }

    public void ResizeRows(int i) {
        jnidocengineJNI.DocTableObject_ResizeRows(this.swigCPtr, this, i);
    }

    public void ResizeCols(int i, int i2) {
        jnidocengineJNI.DocTableObject_ResizeCols(this.swigCPtr, this, i, i2);
    }

    public String GetColName(int i, int i2) {
        return jnidocengineJNI.DocTableObject_GetColName(this.swigCPtr, this, i, i2);
    }

    public void SetColName(int i, int i2, String str) {
        jnidocengineJNI.DocTableObject_SetColName(this.swigCPtr, this, i, i2, str);
    }

    public DocTextObject GetTextCell(int i, int i2) {
        return new DocTextObject(jnidocengineJNI.DocTableObject_GetTextCell(this.swigCPtr, this, i, i2), false);
    }

    public DocTextObject GetTextCellPtr(int i, int i2) {
        long jDocTableObject_GetTextCellPtr = jnidocengineJNI.DocTableObject_GetTextCellPtr(this.swigCPtr, this, i, i2);
        if (jDocTableObject_GetTextCellPtr == 0) {
            return null;
        }
        return new DocTextObject(jDocTableObject_GetTextCellPtr, false);
    }

    public DocMultiStringTextObject GetCell(int i, int i2) {
        return new DocMultiStringTextObject(jnidocengineJNI.DocTableObject_GetCell(this.swigCPtr, this, i, i2), false);
    }

    public DocMultiStringTextObject GetMutableCell(int i, int i2) {
        return new DocMultiStringTextObject(jnidocengineJNI.DocTableObject_GetMutableCell(this.swigCPtr, this, i, i2), false);
    }

    public void SetCell(int i, int i2, DocMultiStringTextObject docMultiStringTextObject) {
        jnidocengineJNI.DocTableObject_SetCell(this.swigCPtr, this, i, i2, DocMultiStringTextObject.getCPtr(docMultiStringTextObject), docMultiStringTextObject);
    }
}
