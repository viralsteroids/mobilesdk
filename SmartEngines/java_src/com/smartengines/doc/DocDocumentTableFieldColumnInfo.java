package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocDocumentTableFieldColumnInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocDocumentTableFieldColumnInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocDocumentTableFieldColumnInfo docDocumentTableFieldColumnInfo) {
        if (docDocumentTableFieldColumnInfo == null) {
            return 0L;
        }
        return docDocumentTableFieldColumnInfo.swigCPtr;
    }

    public static long swigRelease(DocDocumentTableFieldColumnInfo docDocumentTableFieldColumnInfo) {
        if (docDocumentTableFieldColumnInfo == null) {
            return 0L;
        }
        if (!docDocumentTableFieldColumnInfo.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docDocumentTableFieldColumnInfo.swigCPtr;
        docDocumentTableFieldColumnInfo.swigCMemOwn = false;
        docDocumentTableFieldColumnInfo.delete();
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
                jnidocengineJNI.delete_DocDocumentTableFieldColumnInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String GetDocumentTableFieldColumnName() {
        return jnidocengineJNI.DocDocumentTableFieldColumnInfo_GetDocumentTableFieldColumnName(this.swigCPtr, this);
    }

    public String GetDocumentTableFieldColumnNameLocal() {
        return jnidocengineJNI.m488x501653c9(this.swigCPtr, this);
    }

    public String GetDocumentTableFieldColumnShortNameLocal() {
        return jnidocengineJNI.m489x86eeebfb(this.swigCPtr, this);
    }

    public String GetDocumentTableFieldColumnFormat() {
        return jnidocengineJNI.m487x9a26106e(this.swigCPtr, this);
    }

    public String GetDocumentTableFieldColumnExtFormat() {
        return jnidocengineJNI.m486xae3d91a1(this.swigCPtr, this);
    }

    public String GetDocumentTableFieldColumnType() {
        return jnidocengineJNI.DocDocumentTableFieldColumnInfo_GetDocumentTableFieldColumnType(this.swigCPtr, this);
    }
}
