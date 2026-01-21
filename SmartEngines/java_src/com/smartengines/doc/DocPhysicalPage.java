package com.smartengines.doc;

import com.smartengines.common.Image;
import com.smartengines.common.Polygon;
import com.smartengines.common.Quadrangle;

/* loaded from: classes3.dex */
public class DocPhysicalPage {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocPhysicalPage(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocPhysicalPage docPhysicalPage) {
        if (docPhysicalPage == null) {
            return 0L;
        }
        return docPhysicalPage.swigCPtr;
    }

    public static long swigRelease(DocPhysicalPage docPhysicalPage) {
        if (docPhysicalPage == null) {
            return 0L;
        }
        if (!docPhysicalPage.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docPhysicalPage.swigCPtr;
        docPhysicalPage.swigCMemOwn = false;
        docPhysicalPage.delete();
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
                jnidocengineJNI.delete_DocPhysicalPage(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int GetSourceSceneID() {
        return jnidocengineJNI.DocPhysicalPage_GetSourceSceneID(this.swigCPtr, this);
    }

    public DocTextObjectsIterator TextObjectsBegin(String str) {
        return new DocTextObjectsIterator(jnidocengineJNI.DocPhysicalPage_TextObjectsBegin(this.swigCPtr, this, str), true);
    }

    public DocTextObjectsIterator TextObjectsEnd(String str) {
        return new DocTextObjectsIterator(jnidocengineJNI.DocPhysicalPage_TextObjectsEnd(this.swigCPtr, this, str), true);
    }

    public DocImageObjectsIterator ImageObjectsBegin(String str) {
        return new DocImageObjectsIterator(jnidocengineJNI.DocPhysicalPage_ImageObjectsBegin(this.swigCPtr, this, str), true);
    }

    public DocImageObjectsIterator ImageObjectsEnd(String str) {
        return new DocImageObjectsIterator(jnidocengineJNI.DocPhysicalPage_ImageObjectsEnd(this.swigCPtr, this, str), true);
    }

    public DocTableObjectsIterator TableObjectsBegin(String str) {
        return new DocTableObjectsIterator(jnidocengineJNI.DocPhysicalPage_TableObjectsBegin(this.swigCPtr, this, str), true);
    }

    public DocTableObjectsIterator TableObjectsEnd(String str) {
        return new DocTableObjectsIterator(jnidocengineJNI.DocPhysicalPage_TableObjectsEnd(this.swigCPtr, this, str), true);
    }

    public DocBarcodeObjectsIterator BarcodeObjectsBegin(String str) {
        return new DocBarcodeObjectsIterator(jnidocengineJNI.DocPhysicalPage_BarcodeObjectsBegin(this.swigCPtr, this, str), true);
    }

    public DocBarcodeObjectsIterator BarcodeObjectsEnd(String str) {
        return new DocBarcodeObjectsIterator(jnidocengineJNI.DocPhysicalPage_BarcodeObjectsEnd(this.swigCPtr, this, str), true);
    }

    public DocCheckboxObjectsIterator CheckboxObjectsBegin(String str) {
        return new DocCheckboxObjectsIterator(jnidocengineJNI.DocPhysicalPage_CheckboxObjectsBegin(this.swigCPtr, this, str), true);
    }

    public DocCheckboxObjectsIterator CheckboxObjectsEnd(String str) {
        return new DocCheckboxObjectsIterator(jnidocengineJNI.DocPhysicalPage_CheckboxObjectsEnd(this.swigCPtr, this, str), true);
    }

    public DocMetaObjectsIterator ForensicObjectsBegin(String str) {
        return new DocMetaObjectsIterator(jnidocengineJNI.DocPhysicalPage_ForensicObjectsBegin(this.swigCPtr, this, str), true);
    }

    public DocMetaObjectsIterator ForensicObjectsEnd(String str) {
        return new DocMetaObjectsIterator(jnidocengineJNI.DocPhysicalPage_ForensicObjectsEnd(this.swigCPtr, this, str), true);
    }

    public DocForensicCheckObjectsIterator ForensicCheckObjectsBegin(String str) {
        return new DocForensicCheckObjectsIterator(jnidocengineJNI.DocPhysicalPage_ForensicCheckObjectsBegin(this.swigCPtr, this, str), true);
    }

    public DocForensicCheckObjectsIterator ForensicCheckObjectsEnd(String str) {
        return new DocForensicCheckObjectsIterator(jnidocengineJNI.DocPhysicalPage_ForensicCheckObjectsEnd(this.swigCPtr, this, str), true);
    }

    public int GetTextObjectsCount(String str) {
        return jnidocengineJNI.DocPhysicalPage_GetTextObjectsCount(this.swigCPtr, this, str);
    }

    public int GetImageObjectsCount(String str) {
        return jnidocengineJNI.DocPhysicalPage_GetImageObjectsCount(this.swigCPtr, this, str);
    }

    public int GetTableObjectsCount(String str) {
        return jnidocengineJNI.DocPhysicalPage_GetTableObjectsCount(this.swigCPtr, this, str);
    }

    public int GetBarcodeObjectsCount(String str) {
        return jnidocengineJNI.DocPhysicalPage_GetBarcodeObjectsCount(this.swigCPtr, this, str);
    }

    public int GetCheckboxObjectsCount(String str) {
        return jnidocengineJNI.DocPhysicalPage_GetCheckboxObjectsCount(this.swigCPtr, this, str);
    }

    public int GetForensicObjectsCount(String str) {
        return jnidocengineJNI.DocPhysicalPage_GetForensicObjectsCount(this.swigCPtr, this, str);
    }

    public int GetForensicCheckObjectsCount(String str) {
        return jnidocengineJNI.DocPhysicalPage_GetForensicCheckObjectsCount(this.swigCPtr, this, str);
    }

    public boolean HasBasicObjects() {
        return jnidocengineJNI.DocPhysicalPage_HasBasicObjects(this.swigCPtr, this);
    }

    public DocPageInfo GetPageInfo() {
        return new DocPageInfo(jnidocengineJNI.DocPhysicalPage_GetPageInfo(this.swigCPtr, this), false);
    }

    public DocPageInfo GetPageInfoPtr() {
        long jDocPhysicalPage_GetPageInfoPtr = jnidocengineJNI.DocPhysicalPage_GetPageInfoPtr(this.swigCPtr, this);
        if (jDocPhysicalPage_GetPageInfoPtr == 0) {
            return null;
        }
        return new DocPageInfo(jDocPhysicalPage_GetPageInfoPtr, false);
    }

    public Quadrangle GetPageQuadrangle() {
        return new Quadrangle(jnidocengineJNI.DocPhysicalPage_GetPageQuadrangle(this.swigCPtr, this), false);
    }

    public Polygon GetPagePolygon() {
        return new Polygon(jnidocengineJNI.DocPhysicalPage_GetPagePolygon(this.swigCPtr, this), false);
    }

    public Quadrangle GetPageQuadranglePtr() {
        long jDocPhysicalPage_GetPageQuadranglePtr = jnidocengineJNI.DocPhysicalPage_GetPageQuadranglePtr(this.swigCPtr, this);
        if (jDocPhysicalPage_GetPageQuadranglePtr == 0) {
            return null;
        }
        return new Quadrangle(jDocPhysicalPage_GetPageQuadranglePtr, false);
    }

    public Polygon GetPagePolygonPtr() {
        long jDocPhysicalPage_GetPagePolygonPtr = jnidocengineJNI.DocPhysicalPage_GetPagePolygonPtr(this.swigCPtr, this);
        if (jDocPhysicalPage_GetPagePolygonPtr == 0) {
            return null;
        }
        return new Polygon(jDocPhysicalPage_GetPagePolygonPtr, false);
    }

    public DocTextObjectsIterator GetFulltextBasicObjectsBegin() {
        return new DocTextObjectsIterator(jnidocengineJNI.DocPhysicalPage_GetFulltextBasicObjectsBegin(this.swigCPtr, this), true);
    }

    public DocTextObjectsIterator GetFulltextBasicObjectsEnd() {
        return new DocTextObjectsIterator(jnidocengineJNI.DocPhysicalPage_GetFulltextBasicObjectsEnd(this.swigCPtr, this), true);
    }

    public Image GetPageImageFromScene(Image image) {
        long jDocPhysicalPage_GetPageImageFromScene = jnidocengineJNI.DocPhysicalPage_GetPageImageFromScene(this.swigCPtr, this, Image.getCPtr(image), image);
        if (jDocPhysicalPage_GetPageImageFromScene == 0) {
            return null;
        }
        return new Image(jDocPhysicalPage_GetPageImageFromScene, false);
    }

    public DocTextObjectsIterator RawTextObjectsBegin() {
        return new DocTextObjectsIterator(jnidocengineJNI.DocPhysicalPage_RawTextObjectsBegin(this.swigCPtr, this), true);
    }

    public DocTextObjectsIterator RawTextObjectsEnd() {
        return new DocTextObjectsIterator(jnidocengineJNI.DocPhysicalPage_RawTextObjectsEnd(this.swigCPtr, this), true);
    }

    public int GetRawTextObjectsCount() {
        return jnidocengineJNI.DocPhysicalPage_GetRawTextObjectsCount(this.swigCPtr, this);
    }

    public boolean HasRawTextObject(String str) {
        return jnidocengineJNI.DocPhysicalPage_HasRawTextObject(this.swigCPtr, this, str);
    }

    public DocTextObject GetRawTextObject(String str) {
        return new DocTextObject(jnidocengineJNI.DocPhysicalPage_GetRawTextObject(this.swigCPtr, this, str), false);
    }

    public DocBasicObjectsIterator BasicObjectsBegin(String str) {
        return new DocBasicObjectsIterator(jnidocengineJNI.DocPhysicalPage_BasicObjectsBegin(this.swigCPtr, this, str), true);
    }

    public DocBasicObjectsIterator BasicObjectsEnd(String str) {
        return new DocBasicObjectsIterator(jnidocengineJNI.DocPhysicalPage_BasicObjectsEnd(this.swigCPtr, this, str), true);
    }

    public int GetBasicObjectsCount(String str) {
        return jnidocengineJNI.DocPhysicalPage_GetBasicObjectsCount(this.swigCPtr, this, str);
    }
}
