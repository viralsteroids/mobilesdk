package com.smartengines.doc;

import com.smartengines.common.Serializer;
import com.smartengines.common.StringsVectorIterator;

/* loaded from: classes3.dex */
public class DocResult {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocResult docResult) {
        if (docResult == null) {
            return 0L;
        }
        return docResult.swigCPtr;
    }

    public static long swigRelease(DocResult docResult) {
        if (docResult == null) {
            return 0L;
        }
        if (!docResult.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docResult.swigCPtr;
        docResult.swigCMemOwn = false;
        docResult.delete();
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
                jnidocengineJNI.delete_DocResult(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocResult PartialClone() {
        long jDocResult_PartialClone = jnidocengineJNI.DocResult_PartialClone(this.swigCPtr, this);
        if (jDocResult_PartialClone == 0) {
            return null;
        }
        return new DocResult(jDocResult_PartialClone, false);
    }

    public DocResult Clone() {
        long jDocResult_Clone = jnidocengineJNI.DocResult_Clone(this.swigCPtr, this);
        if (jDocResult_Clone == 0) {
            return null;
        }
        return new DocResult(jDocResult_Clone, false);
    }

    public int GetDocumentsCount() {
        return jnidocengineJNI.DocResult_GetDocumentsCount(this.swigCPtr, this);
    }

    public boolean HasDocument(int i) {
        return jnidocengineJNI.DocResult_HasDocument(this.swigCPtr, this, i);
    }

    public Document GetDocument(int i) {
        return new Document(jnidocengineJNI.DocResult_GetDocument(this.swigCPtr, this, i), false);
    }

    public DocumentsIterator DocumentsBegin() {
        return new DocumentsIterator(jnidocengineJNI.DocResult_DocumentsBegin(this.swigCPtr, this), true);
    }

    public DocumentsIterator DocumentsEnd() {
        return new DocumentsIterator(jnidocengineJNI.DocResult_DocumentsEnd(this.swigCPtr, this), true);
    }

    public void Serialize(Serializer serializer) {
        jnidocengineJNI.DocResult_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }

    public DocPhysicalDocument GetPhysicalDocument(int i) {
        return new DocPhysicalDocument(jnidocengineJNI.DocResult_GetPhysicalDocument(this.swigCPtr, this, i), false);
    }

    public DocPhysicalDocument GetPhysicalDocumentPtr(int i) {
        long jDocResult_GetPhysicalDocumentPtr = jnidocengineJNI.DocResult_GetPhysicalDocumentPtr(this.swigCPtr, this, i);
        if (jDocResult_GetPhysicalDocumentPtr == 0) {
            return null;
        }
        return new DocPhysicalDocument(jDocResult_GetPhysicalDocumentPtr, false);
    }

    public int GetScenesCount() {
        return jnidocengineJNI.DocResult_GetScenesCount(this.swigCPtr, this);
    }

    public DocSceneInfo GetSceneInfo(int i) {
        return new DocSceneInfo(jnidocengineJNI.DocResult_GetSceneInfo(this.swigCPtr, this, i), false);
    }

    public DocSceneInfo GetLastSceneInfo() {
        return new DocSceneInfo(jnidocengineJNI.DocResult_GetLastSceneInfo(this.swigCPtr, this), false);
    }

    public DocSceneInfo GetSceneInfoPtr(int i) {
        long jDocResult_GetSceneInfoPtr = jnidocengineJNI.DocResult_GetSceneInfoPtr(this.swigCPtr, this, i);
        if (jDocResult_GetSceneInfoPtr == 0) {
            return null;
        }
        return new DocSceneInfo(jDocResult_GetSceneInfoPtr, false);
    }

    public DocSceneInfo GetLastSceneInfoPtr() {
        long jDocResult_GetLastSceneInfoPtr = jnidocengineJNI.DocResult_GetLastSceneInfoPtr(this.swigCPtr, this);
        if (jDocResult_GetLastSceneInfoPtr == 0) {
            return null;
        }
        return new DocSceneInfo(jDocResult_GetLastSceneInfoPtr, false);
    }

    public DocGraphicalStructure GetGraphicalStructure() {
        return new DocGraphicalStructure(jnidocengineJNI.DocResult_GetGraphicalStructure(this.swigCPtr, this), false);
    }

    public DocGraphicalStructure GetMutableGraphicalStructure() {
        return new DocGraphicalStructure(jnidocengineJNI.DocResult_GetMutableGraphicalStructure(this.swigCPtr, this), false);
    }

    public Document GetMutableDocument(int i) {
        return new Document(jnidocengineJNI.DocResult_GetMutableDocument(this.swigCPtr, this, i), false);
    }

    public DocTagsCollection GetDocumentTags(int i) {
        return new DocTagsCollection(jnidocengineJNI.DocResult_GetDocumentTags(this.swigCPtr, this, i), false);
    }

    public DocumentsMutableIterator AddDocument(Document document) {
        return new DocumentsMutableIterator(jnidocengineJNI.DocResult_AddDocument(this.swigCPtr, this, Document.getCPtr(document), document), true);
    }

    public void SetDocument(int i, Document document) {
        jnidocengineJNI.DocResult_SetDocument(this.swigCPtr, this, i, Document.getCPtr(document), document);
    }

    public void RemoveDocument(int i) {
        jnidocengineJNI.DocResult_RemoveDocument(this.swigCPtr, this, i);
    }

    public DocumentsMutableIterator MutableDocumentsBegin() {
        return new DocumentsMutableIterator(jnidocengineJNI.DocResult_MutableDocumentsBegin(this.swigCPtr, this), true);
    }

    public DocumentsMutableIterator MutableDocumentsEnd() {
        return new DocumentsMutableIterator(jnidocengineJNI.DocResult_MutableDocumentsEnd(this.swigCPtr, this), true);
    }

    public DocumentsSliceIterator DocumentsSlice(String str) {
        return new DocumentsSliceIterator(jnidocengineJNI.DocResult_DocumentsSlice(this.swigCPtr, this, str), true);
    }

    public DocumentsMutableSliceIterator MutableDocumentsSlice(String str) {
        return new DocumentsMutableSliceIterator(jnidocengineJNI.DocResult_MutableDocumentsSlice(this.swigCPtr, this, str), true);
    }

    public boolean CanBuildPDFABuffer() {
        return jnidocengineJNI.DocResult_CanBuildPDFABuffer(this.swigCPtr, this);
    }

    public void BuildPDFABuffer() {
        jnidocengineJNI.DocResult_BuildPDFABuffer(this.swigCPtr, this);
    }

    public void GetPDFABuffer(byte[] bArr) {
        jnidocengineJNI.DocResult_GetPDFABuffer(this.swigCPtr, this, bArr);
    }

    public int GetPDFABufferSize() {
        return jnidocengineJNI.DocResult_GetPDFABufferSize(this.swigCPtr, this);
    }

    public void SetAddTextMode(String str) {
        jnidocengineJNI.DocResult_SetAddTextMode(this.swigCPtr, this, str);
    }

    public String GetAddTextMode() {
        return jnidocengineJNI.DocResult_GetAddTextMode(this.swigCPtr, this);
    }

    public boolean HasAddTextMode(String str) {
        return jnidocengineJNI.DocResult_HasAddTextMode(this.swigCPtr, this, str);
    }

    public StringsVectorIterator AddTextModesBegin() {
        return new StringsVectorIterator(jnidocengineJNI.DocResult_AddTextModesBegin(this.swigCPtr, this), true);
    }

    public StringsVectorIterator AddTextModesEnd() {
        return new StringsVectorIterator(jnidocengineJNI.DocResult_AddTextModesEnd(this.swigCPtr, this), true);
    }

    public void SetTextTypeMode(String str) {
        jnidocengineJNI.DocResult_SetTextTypeMode(this.swigCPtr, this, str);
    }

    public String GetTextTypeMode() {
        return jnidocengineJNI.DocResult_GetTextTypeMode(this.swigCPtr, this);
    }

    public boolean HasTextTypeMode(String str) {
        return jnidocengineJNI.DocResult_HasTextTypeMode(this.swigCPtr, this, str);
    }

    public StringsVectorIterator TextTypeModesBegin() {
        return new StringsVectorIterator(jnidocengineJNI.DocResult_TextTypeModesBegin(this.swigCPtr, this), true);
    }

    public StringsVectorIterator TextTypeModesEnd() {
        return new StringsVectorIterator(jnidocengineJNI.DocResult_TextTypeModesEnd(this.swigCPtr, this), true);
    }

    public void SetColourMode(boolean z) {
        jnidocengineJNI.DocResult_SetColourMode(this.swigCPtr, this, z);
    }

    public boolean GetColourMode() {
        return jnidocengineJNI.DocResult_GetColourMode(this.swigCPtr, this);
    }
}
