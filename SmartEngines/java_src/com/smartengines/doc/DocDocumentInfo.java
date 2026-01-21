package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocDocumentInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocDocumentInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocDocumentInfo docDocumentInfo) {
        if (docDocumentInfo == null) {
            return 0L;
        }
        return docDocumentInfo.swigCPtr;
    }

    public static long swigRelease(DocDocumentInfo docDocumentInfo) {
        if (docDocumentInfo == null) {
            return 0L;
        }
        if (!docDocumentInfo.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docDocumentInfo.swigCPtr;
        docDocumentInfo.swigCMemOwn = false;
        docDocumentInfo.delete();
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
                jnidocengineJNI.delete_DocDocumentInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String GetDocumentName() {
        return jnidocengineJNI.DocDocumentInfo_GetDocumentName(this.swigCPtr, this);
    }

    public String GetDocumentNameLocal() {
        return jnidocengineJNI.DocDocumentInfo_GetDocumentNameLocal(this.swigCPtr, this);
    }

    public String GetDocumentShortNameLocal() {
        return jnidocengineJNI.DocDocumentInfo_GetDocumentShortNameLocal(this.swigCPtr, this);
    }

    public boolean GetDocumentNoFields() {
        return jnidocengineJNI.DocDocumentInfo_GetDocumentNoFields(this.swigCPtr, this);
    }

    public DocDocumentFieldsInfoIterator DocumentFieldsInfoBegin() {
        return new DocDocumentFieldsInfoIterator(jnidocengineJNI.DocDocumentInfo_DocumentFieldsInfoBegin(this.swigCPtr, this), true);
    }

    public DocDocumentFieldsInfoIterator DocumentFieldsInfoEnd() {
        return new DocDocumentFieldsInfoIterator(jnidocengineJNI.DocDocumentInfo_DocumentFieldsInfoEnd(this.swigCPtr, this), true);
    }

    public DocDocumentFieldInfo GetDocumentFieldInfo(String str) {
        return new DocDocumentFieldInfo(jnidocengineJNI.DocDocumentInfo_GetDocumentFieldInfo(this.swigCPtr, this, str), false);
    }

    public boolean GetDocumentMultipageInfo() {
        return jnidocengineJNI.DocDocumentInfo_GetDocumentMultipageInfo(this.swigCPtr, this);
    }
}
