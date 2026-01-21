package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocDocumentFieldInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocDocumentFieldInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocDocumentFieldInfo docDocumentFieldInfo) {
        if (docDocumentFieldInfo == null) {
            return 0L;
        }
        return docDocumentFieldInfo.swigCPtr;
    }

    public static long swigRelease(DocDocumentFieldInfo docDocumentFieldInfo) {
        if (docDocumentFieldInfo == null) {
            return 0L;
        }
        if (!docDocumentFieldInfo.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docDocumentFieldInfo.swigCPtr;
        docDocumentFieldInfo.swigCMemOwn = false;
        docDocumentFieldInfo.delete();
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
                jnidocengineJNI.delete_DocDocumentFieldInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String GetDocumentFieldName() {
        return jnidocengineJNI.DocDocumentFieldInfo_GetDocumentFieldName(this.swigCPtr, this);
    }

    public String GetDocumentFieldNameLocal() {
        return jnidocengineJNI.DocDocumentFieldInfo_GetDocumentFieldNameLocal(this.swigCPtr, this);
    }

    public String GetDocumentFieldShortNameLocal() {
        return jnidocengineJNI.DocDocumentFieldInfo_GetDocumentFieldShortNameLocal(this.swigCPtr, this);
    }

    public String GetDocumentFieldFormat() {
        return jnidocengineJNI.DocDocumentFieldInfo_GetDocumentFieldFormat(this.swigCPtr, this);
    }

    public String GetDocumentFieldExtFormat() {
        return jnidocengineJNI.DocDocumentFieldInfo_GetDocumentFieldExtFormat(this.swigCPtr, this);
    }

    public String GetDocumentFieldType() {
        return jnidocengineJNI.DocDocumentFieldInfo_GetDocumentFieldType(this.swigCPtr, this);
    }

    public String GetDocumentFieldCategory() {
        return jnidocengineJNI.DocDocumentFieldInfo_GetDocumentFieldCategory(this.swigCPtr, this);
    }

    public DocDocumentTableFieldColumnsInfoInterator DocumentTableFieldColumnsInfoInteratorBegin() {
        return new DocDocumentTableFieldColumnsInfoInterator(jnidocengineJNI.DocDocumentFieldInfo_DocumentTableFieldColumnsInfoInteratorBegin(this.swigCPtr, this), true);
    }

    public DocDocumentTableFieldColumnsInfoInterator DocumentTableFieldColumnsInfoInteratorEnd() {
        return new DocDocumentTableFieldColumnsInfoInterator(jnidocengineJNI.DocDocumentFieldInfo_DocumentTableFieldColumnsInfoInteratorEnd(this.swigCPtr, this), true);
    }

    public DocDocumentTableFieldColumnInfo GetDocumentTableFieldColumnInfo(String str) {
        return new DocDocumentTableFieldColumnInfo(jnidocengineJNI.DocDocumentFieldInfo_GetDocumentTableFieldColumnInfo(this.swigCPtr, this, str), false);
    }

    public DocDocumentTableFieldColumnInfo GetDocumentTableFieldColumnInfoPtr(String str) {
        long jDocDocumentFieldInfo_GetDocumentTableFieldColumnInfoPtr = jnidocengineJNI.DocDocumentFieldInfo_GetDocumentTableFieldColumnInfoPtr(this.swigCPtr, this, str);
        if (jDocDocumentFieldInfo_GetDocumentTableFieldColumnInfoPtr == 0) {
            return null;
        }
        return new DocDocumentTableFieldColumnInfo(jDocDocumentFieldInfo_GetDocumentTableFieldColumnInfoPtr, false);
    }
}
