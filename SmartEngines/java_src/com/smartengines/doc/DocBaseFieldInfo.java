package com.smartengines.doc;

import com.smartengines.common.Serializer;
import com.smartengines.common.StringsMapIterator;

/* loaded from: classes3.dex */
public class DocBaseFieldInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocBaseFieldInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocBaseFieldInfo docBaseFieldInfo) {
        if (docBaseFieldInfo == null) {
            return 0L;
        }
        return docBaseFieldInfo.swigCPtr;
    }

    public static long swigRelease(DocBaseFieldInfo docBaseFieldInfo) {
        if (docBaseFieldInfo == null) {
            return 0L;
        }
        if (!docBaseFieldInfo.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docBaseFieldInfo.swigCPtr;
        docBaseFieldInfo.swigCMemOwn = false;
        docBaseFieldInfo.delete();
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
                jnidocengineJNI.delete_DocBaseFieldInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String GetName() {
        return jnidocengineJNI.DocBaseFieldInfo_GetName(this.swigCPtr, this);
    }

    public double GetConfidence() {
        return jnidocengineJNI.DocBaseFieldInfo_GetConfidence(this.swigCPtr, this);
    }

    public boolean GetAcceptFlag() {
        return jnidocengineJNI.DocBaseFieldInfo_GetAcceptFlag(this.swigCPtr, this);
    }

    public boolean IsValid() {
        return jnidocengineJNI.DocBaseFieldInfo_IsValid(this.swigCPtr, this);
    }

    public boolean IsFictive() {
        return jnidocengineJNI.DocBaseFieldInfo_IsFictive(this.swigCPtr, this);
    }

    public int GetAttributesCount() {
        return jnidocengineJNI.DocBaseFieldInfo_GetAttributesCount(this.swigCPtr, this);
    }

    public boolean HasAttribute(String str) {
        return jnidocengineJNI.DocBaseFieldInfo_HasAttribute(this.swigCPtr, this, str);
    }

    public String GetAttribute(String str) {
        return jnidocengineJNI.DocBaseFieldInfo_GetAttribute(this.swigCPtr, this, str);
    }

    public StringsMapIterator AttributesBegin() {
        return new StringsMapIterator(jnidocengineJNI.DocBaseFieldInfo_AttributesBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator AttributesEnd() {
        return new StringsMapIterator(jnidocengineJNI.DocBaseFieldInfo_AttributesEnd(this.swigCPtr, this), true);
    }

    public DocTextObjectsCrossPageIterator ConnectedTextObjectsBegin(DocPhysicalDocument docPhysicalDocument) {
        return new DocTextObjectsCrossPageIterator(jnidocengineJNI.DocBaseFieldInfo_ConnectedTextObjectsBegin(this.swigCPtr, this, DocPhysicalDocument.getCPtr(docPhysicalDocument), docPhysicalDocument), true);
    }

    public DocTextObjectsCrossPageIterator ConnectedTextObjectsEnd(DocPhysicalDocument docPhysicalDocument) {
        return new DocTextObjectsCrossPageIterator(jnidocengineJNI.DocBaseFieldInfo_ConnectedTextObjectsEnd(this.swigCPtr, this, DocPhysicalDocument.getCPtr(docPhysicalDocument), docPhysicalDocument), true);
    }

    public DocTableObjectsCrossPageIterator ConnectedTableObjectsBegin(DocPhysicalDocument docPhysicalDocument) {
        return new DocTableObjectsCrossPageIterator(jnidocengineJNI.DocBaseFieldInfo_ConnectedTableObjectsBegin(this.swigCPtr, this, DocPhysicalDocument.getCPtr(docPhysicalDocument), docPhysicalDocument), true);
    }

    public DocTableObjectsCrossPageIterator ConnectedTableObjectsEnd(DocPhysicalDocument docPhysicalDocument) {
        return new DocTableObjectsCrossPageIterator(jnidocengineJNI.DocBaseFieldInfo_ConnectedTableObjectsEnd(this.swigCPtr, this, DocPhysicalDocument.getCPtr(docPhysicalDocument), docPhysicalDocument), true);
    }

    public DocImageObjectsCrossPageIterator ConnectedImageObjectsBegin(DocPhysicalDocument docPhysicalDocument) {
        return new DocImageObjectsCrossPageIterator(jnidocengineJNI.DocBaseFieldInfo_ConnectedImageObjectsBegin(this.swigCPtr, this, DocPhysicalDocument.getCPtr(docPhysicalDocument), docPhysicalDocument), true);
    }

    public DocImageObjectsCrossPageIterator ConnectedImageObjectsEnd(DocPhysicalDocument docPhysicalDocument) {
        return new DocImageObjectsCrossPageIterator(jnidocengineJNI.DocBaseFieldInfo_ConnectedImageObjectsEnd(this.swigCPtr, this, DocPhysicalDocument.getCPtr(docPhysicalDocument), docPhysicalDocument), true);
    }

    public DocCheckboxObjectsCrossPageIterator ConnectedCheckboxObjectsBegin(DocPhysicalDocument docPhysicalDocument) {
        return new DocCheckboxObjectsCrossPageIterator(jnidocengineJNI.DocBaseFieldInfo_ConnectedCheckboxObjectsBegin(this.swigCPtr, this, DocPhysicalDocument.getCPtr(docPhysicalDocument), docPhysicalDocument), true);
    }

    public DocCheckboxObjectsCrossPageIterator ConnectedCheckboxObjectsEnd(DocPhysicalDocument docPhysicalDocument) {
        return new DocCheckboxObjectsCrossPageIterator(jnidocengineJNI.DocBaseFieldInfo_ConnectedCheckboxObjectsEnd(this.swigCPtr, this, DocPhysicalDocument.getCPtr(docPhysicalDocument), docPhysicalDocument), true);
    }

    public DocTextObjectsCrossPageIterator ConnectedForensicCheckObjectsBegin(DocPhysicalDocument docPhysicalDocument) {
        return new DocTextObjectsCrossPageIterator(jnidocengineJNI.DocBaseFieldInfo_ConnectedForensicCheckObjectsBegin(this.swigCPtr, this, DocPhysicalDocument.getCPtr(docPhysicalDocument), docPhysicalDocument), true);
    }

    public DocTextObjectsCrossPageIterator ConnectedForensicCheckObjectsEnd(DocPhysicalDocument docPhysicalDocument) {
        return new DocTextObjectsCrossPageIterator(jnidocengineJNI.DocBaseFieldInfo_ConnectedForensicCheckObjectsEnd(this.swigCPtr, this, DocPhysicalDocument.getCPtr(docPhysicalDocument), docPhysicalDocument), true);
    }

    public DocMetaObjectsCrossPageIterator ConnectedForensicObjectsBegin(DocPhysicalDocument docPhysicalDocument) {
        return new DocMetaObjectsCrossPageIterator(jnidocengineJNI.DocBaseFieldInfo_ConnectedForensicObjectsBegin(this.swigCPtr, this, DocPhysicalDocument.getCPtr(docPhysicalDocument), docPhysicalDocument), true);
    }

    public DocMetaObjectsCrossPageIterator ConnectedForensicObjectsEnd(DocPhysicalDocument docPhysicalDocument) {
        return new DocMetaObjectsCrossPageIterator(jnidocengineJNI.DocBaseFieldInfo_ConnectedForensicObjectsEnd(this.swigCPtr, this, DocPhysicalDocument.getCPtr(docPhysicalDocument), docPhysicalDocument), true);
    }

    public DocBarcodeObjectsCrossPageIterator ConnectedBarcodeObjectsBegin(DocPhysicalDocument docPhysicalDocument) {
        return new DocBarcodeObjectsCrossPageIterator(jnidocengineJNI.DocBaseFieldInfo_ConnectedBarcodeObjectsBegin(this.swigCPtr, this, DocPhysicalDocument.getCPtr(docPhysicalDocument), docPhysicalDocument), true);
    }

    public DocBarcodeObjectsCrossPageIterator ConnectedBarcodeObjectsEnd(DocPhysicalDocument docPhysicalDocument) {
        return new DocBarcodeObjectsCrossPageIterator(jnidocengineJNI.DocBaseFieldInfo_ConnectedBarcodeObjectsEnd(this.swigCPtr, this, DocPhysicalDocument.getCPtr(docPhysicalDocument), docPhysicalDocument), true);
    }

    public void Serialize(Serializer serializer) {
        jnidocengineJNI.DocBaseFieldInfo_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }

    public void SetName(String str) {
        jnidocengineJNI.DocBaseFieldInfo_SetName(this.swigCPtr, this, str);
    }

    public void SetConfidence(double d) {
        jnidocengineJNI.DocBaseFieldInfo_SetConfidence(this.swigCPtr, this, d);
    }

    public void SetAcceptFlag(boolean z) {
        jnidocengineJNI.DocBaseFieldInfo_SetAcceptFlag(this.swigCPtr, this, z);
    }

    public void SetAttribute(String str, String str2) {
        jnidocengineJNI.DocBaseFieldInfo_SetAttribute(this.swigCPtr, this, str, str2);
    }

    public void RemoveAttribute(String str) {
        jnidocengineJNI.DocBaseFieldInfo_RemoveAttribute(this.swigCPtr, this, str);
    }

    public DocBasicObjectsCrossSliceIterator ConnectedBasicObjectsBegin(DocGraphicalStructure docGraphicalStructure) {
        return new DocBasicObjectsCrossSliceIterator(jnidocengineJNI.DocBaseFieldInfo_ConnectedBasicObjectsBegin(this.swigCPtr, this, DocGraphicalStructure.getCPtr(docGraphicalStructure), docGraphicalStructure), true);
    }

    public DocBasicObjectsCrossSliceIterator ConnectedBasicObjectsEnd(DocGraphicalStructure docGraphicalStructure) {
        return new DocBasicObjectsCrossSliceIterator(jnidocengineJNI.DocBaseFieldInfo_ConnectedBasicObjectsEnd(this.swigCPtr, this, DocGraphicalStructure.getCPtr(docGraphicalStructure), docGraphicalStructure), true);
    }

    public DocBasicObjectsMutableCrossSliceIterator MutableConnectedBasicObjectsBegin(DocGraphicalStructure docGraphicalStructure) {
        return new DocBasicObjectsMutableCrossSliceIterator(jnidocengineJNI.DocBaseFieldInfo_MutableConnectedBasicObjectsBegin(this.swigCPtr, this, DocGraphicalStructure.getCPtr(docGraphicalStructure), docGraphicalStructure), true);
    }

    public DocBasicObjectsMutableCrossSliceIterator MutableConnectedBasicObjectsEnd(DocGraphicalStructure docGraphicalStructure) {
        return new DocBasicObjectsMutableCrossSliceIterator(jnidocengineJNI.DocBaseFieldInfo_MutableConnectedBasicObjectsEnd(this.swigCPtr, this, DocGraphicalStructure.getCPtr(docGraphicalStructure), docGraphicalStructure), true);
    }

    public void ConnectBasicObject(int i, int i2) {
        jnidocengineJNI.DocBaseFieldInfo_ConnectBasicObject(this.swigCPtr, this, i, i2);
    }
}
