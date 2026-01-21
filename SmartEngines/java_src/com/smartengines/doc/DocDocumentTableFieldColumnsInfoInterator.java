package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocDocumentTableFieldColumnsInfoInterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocDocumentTableFieldColumnsInfoInterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocDocumentTableFieldColumnsInfoInterator docDocumentTableFieldColumnsInfoInterator) {
        if (docDocumentTableFieldColumnsInfoInterator == null) {
            return 0L;
        }
        return docDocumentTableFieldColumnsInfoInterator.swigCPtr;
    }

    public static long swigRelease(DocDocumentTableFieldColumnsInfoInterator docDocumentTableFieldColumnsInfoInterator) {
        if (docDocumentTableFieldColumnsInfoInterator == null) {
            return 0L;
        }
        if (!docDocumentTableFieldColumnsInfoInterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docDocumentTableFieldColumnsInfoInterator.swigCPtr;
        docDocumentTableFieldColumnsInfoInterator.swigCMemOwn = false;
        docDocumentTableFieldColumnsInfoInterator.delete();
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
                jnidocengineJNI.delete_DocDocumentTableFieldColumnsInfoInterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocDocumentTableFieldColumnsInfoInterator(DocDocumentTableFieldColumnsInfoInterator docDocumentTableFieldColumnsInfoInterator) {
        this(jnidocengineJNI.new_DocDocumentTableFieldColumnsInfoInterator(getCPtr(docDocumentTableFieldColumnsInfoInterator), docDocumentTableFieldColumnsInfoInterator), true);
    }

    public String GetKey() {
        return jnidocengineJNI.DocDocumentTableFieldColumnsInfoInterator_GetKey(this.swigCPtr, this);
    }

    public DocDocumentTableFieldColumnInfo GetDocumentTableFieldColumnInfo() {
        return new DocDocumentTableFieldColumnInfo(jnidocengineJNI.m490xfa5add48(this.swigCPtr, this), false);
    }

    public DocDocumentTableFieldColumnInfo GetDocumentTableFieldColumnInfoPtr() {
        long jM491x13fdf886 = jnidocengineJNI.m491x13fdf886(this.swigCPtr, this);
        if (jM491x13fdf886 == 0) {
            return null;
        }
        return new DocDocumentTableFieldColumnInfo(jM491x13fdf886, false);
    }

    public void Advance() {
        jnidocengineJNI.DocDocumentTableFieldColumnsInfoInterator_Advance(this.swigCPtr, this);
    }

    public boolean Equals(DocDocumentTableFieldColumnsInfoInterator docDocumentTableFieldColumnsInfoInterator) {
        return jnidocengineJNI.DocDocumentTableFieldColumnsInfoInterator_Equals(this.swigCPtr, this, getCPtr(docDocumentTableFieldColumnsInfoInterator), docDocumentTableFieldColumnsInfoInterator);
    }
}
