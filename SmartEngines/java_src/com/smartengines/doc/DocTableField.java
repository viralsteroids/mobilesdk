package com.smartengines.doc;

import com.smartengines.common.Serializer;

/* loaded from: classes3.dex */
public class DocTableField {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocTableField(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocTableField docTableField) {
        if (docTableField == null) {
            return 0L;
        }
        return docTableField.swigCPtr;
    }

    public static long swigRelease(DocTableField docTableField) {
        if (docTableField == null) {
            return 0L;
        }
        if (!docTableField.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docTableField.swigCPtr;
        docTableField.swigCMemOwn = false;
        docTableField.delete();
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
                jnidocengineJNI.delete_DocTableField(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocBaseFieldInfo GetBaseFieldInfo() {
        return new DocBaseFieldInfo(jnidocengineJNI.DocTableField_GetBaseFieldInfo(this.swigCPtr, this), false);
    }

    public DocBaseFieldInfo GetMutableBaseFieldInfo() {
        return new DocBaseFieldInfo(jnidocengineJNI.DocTableField_GetMutableBaseFieldInfo(this.swigCPtr, this), false);
    }

    public int GetRowsCount() {
        return jnidocengineJNI.DocTableField_GetRowsCount(this.swigCPtr, this);
    }

    public int GetColsCount() {
        return jnidocengineJNI.DocTableField_GetColsCount(this.swigCPtr, this);
    }

    public DocTextField GetCell(int i, int i2) {
        return new DocTextField(jnidocengineJNI.DocTableField_GetCell(this.swigCPtr, this, i, i2), false);
    }

    public DocTextField GetMutableCell(int i, int i2) {
        return new DocTextField(jnidocengineJNI.DocTableField_GetMutableCell(this.swigCPtr, this, i, i2), false);
    }

    public void SetCell(int i, int i2, DocTextField docTextField) {
        jnidocengineJNI.DocTableField_SetCell(this.swigCPtr, this, i, i2, DocTextField.getCPtr(docTextField), docTextField);
    }

    public boolean HasColumnIndexByName(String str) {
        return jnidocengineJNI.DocTableField_HasColumnIndexByName(this.swigCPtr, this, str);
    }

    public int GetColumnIndexByName(String str) {
        return jnidocengineJNI.DocTableField_GetColumnIndexByName(this.swigCPtr, this, str);
    }

    public void ResizeRows(int i) {
        jnidocengineJNI.DocTableField_ResizeRows__SWIG_0(this.swigCPtr, this, i);
    }

    public void ResizeRows(int i, DocTextField docTextField) {
        jnidocengineJNI.DocTableField_ResizeRows__SWIG_1(this.swigCPtr, this, i, DocTextField.getCPtr(docTextField), docTextField);
    }

    public void ResizeCols(int i) {
        jnidocengineJNI.DocTableField_ResizeCols__SWIG_0(this.swigCPtr, this, i);
    }

    public void ResizeCols(int i, DocTextField docTextField) {
        jnidocengineJNI.DocTableField_ResizeCols__SWIG_1(this.swigCPtr, this, i, DocTextField.getCPtr(docTextField), docTextField);
    }

    public void Serialize(Serializer serializer) {
        jnidocengineJNI.DocTableField_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }

    public int GetHeaderRowsCount() {
        return jnidocengineJNI.DocTableField_GetHeaderRowsCount(this.swigCPtr, this);
    }

    public int GetHeaderColsCount() {
        return jnidocengineJNI.DocTableField_GetHeaderColsCount(this.swigCPtr, this);
    }

    public DocTextField GetHeaderCell(int i, int i2) {
        return new DocTextField(jnidocengineJNI.DocTableField_GetHeaderCell(this.swigCPtr, this, i, i2), false);
    }

    public DocTextField GetHeaderMutableCell(int i, int i2) {
        return new DocTextField(jnidocengineJNI.DocTableField_GetHeaderMutableCell(this.swigCPtr, this, i, i2), false);
    }

    public DocTextField GetHeaderCellPtr(int i, int i2) {
        long jDocTableField_GetHeaderCellPtr = jnidocengineJNI.DocTableField_GetHeaderCellPtr(this.swigCPtr, this, i, i2);
        if (jDocTableField_GetHeaderCellPtr == 0) {
            return null;
        }
        return new DocTextField(jDocTableField_GetHeaderCellPtr, false);
    }

    public DocTextField GetHeaderMutableCellPtr(int i, int i2) {
        long jDocTableField_GetHeaderMutableCellPtr = jnidocengineJNI.DocTableField_GetHeaderMutableCellPtr(this.swigCPtr, this, i, i2);
        if (jDocTableField_GetHeaderMutableCellPtr == 0) {
            return null;
        }
        return new DocTextField(jDocTableField_GetHeaderMutableCellPtr, false);
    }

    public void SetHeaderCell(int i, int i2, DocTextField docTextField) {
        jnidocengineJNI.DocTableField_SetHeaderCell(this.swigCPtr, this, i, i2, DocTextField.getCPtr(docTextField), docTextField);
    }

    public void ResizeHeaderRows(int i) {
        jnidocengineJNI.DocTableField_ResizeHeaderRows__SWIG_0(this.swigCPtr, this, i);
    }

    public void ResizeHeaderRows(int i, DocTextField docTextField) {
        jnidocengineJNI.DocTableField_ResizeHeaderRows__SWIG_1(this.swigCPtr, this, i, DocTextField.getCPtr(docTextField), docTextField);
    }

    public void ResizeHeaderCols(int i) {
        jnidocengineJNI.DocTableField_ResizeHeaderCols__SWIG_0(this.swigCPtr, this, i);
    }

    public void ResizeHeaderCols(int i, DocTextField docTextField) {
        jnidocengineJNI.DocTableField_ResizeHeaderCols__SWIG_1(this.swigCPtr, this, i, DocTextField.getCPtr(docTextField), docTextField);
    }

    public String GetColName(int i) {
        return jnidocengineJNI.DocTableField_GetColName(this.swigCPtr, this, i);
    }

    public void SetColName(int i, String str) {
        jnidocengineJNI.DocTableField_SetColName(this.swigCPtr, this, i, str);
    }
}
