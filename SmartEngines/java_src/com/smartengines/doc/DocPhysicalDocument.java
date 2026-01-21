package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocPhysicalDocument {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocPhysicalDocument(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocPhysicalDocument docPhysicalDocument) {
        if (docPhysicalDocument == null) {
            return 0L;
        }
        return docPhysicalDocument.swigCPtr;
    }

    public static long swigRelease(DocPhysicalDocument docPhysicalDocument) {
        if (docPhysicalDocument == null) {
            return 0L;
        }
        if (!docPhysicalDocument.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docPhysicalDocument.swigCPtr;
        docPhysicalDocument.swigCMemOwn = false;
        docPhysicalDocument.delete();
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
                jnidocengineJNI.delete_DocPhysicalDocument(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int GetTextObjectsCount(String str) {
        return jnidocengineJNI.DocPhysicalDocument_GetTextObjectsCount(this.swigCPtr, this, str);
    }

    public int GetTableObjectsCount(String str) {
        return jnidocengineJNI.DocPhysicalDocument_GetTableObjectsCount(this.swigCPtr, this, str);
    }

    public int GetImageObjectsCount(String str) {
        return jnidocengineJNI.DocPhysicalDocument_GetImageObjectsCount(this.swigCPtr, this, str);
    }

    public int GetForensicObjectsCount(String str) {
        return jnidocengineJNI.DocPhysicalDocument_GetForensicObjectsCount(this.swigCPtr, this, str);
    }

    public int GetForensicCheckObjectsCount(String str) {
        return jnidocengineJNI.DocPhysicalDocument_GetForensicCheckObjectsCount(this.swigCPtr, this, str);
    }

    public int GetBarcodeObjectsCount(String str) {
        return jnidocengineJNI.DocPhysicalDocument_GetBarcodeObjectsCount(this.swigCPtr, this, str);
    }

    public int GetCheckboxObjectsCount(String str) {
        return jnidocengineJNI.DocPhysicalDocument_GetCheckboxObjectsCount(this.swigCPtr, this, str);
    }

    public int GetPagesCount() {
        return jnidocengineJNI.DocPhysicalDocument_GetPagesCount(this.swigCPtr, this);
    }

    public DocPhysicalPage GetPhysicalPage(int i) {
        return new DocPhysicalPage(jnidocengineJNI.DocPhysicalDocument_GetPhysicalPage(this.swigCPtr, this, i), false);
    }

    public DocPhysicalPage GetPhysicalPagePtr(int i) {
        long jDocPhysicalDocument_GetPhysicalPagePtr = jnidocengineJNI.DocPhysicalDocument_GetPhysicalPagePtr(this.swigCPtr, this, i);
        if (jDocPhysicalDocument_GetPhysicalPagePtr == 0) {
            return null;
        }
        return new DocPhysicalPage(jDocPhysicalDocument_GetPhysicalPagePtr, false);
    }

    public int GetBasicObjectsCount(String str) {
        return jnidocengineJNI.DocPhysicalDocument_GetBasicObjectsCount(this.swigCPtr, this, str);
    }
}
