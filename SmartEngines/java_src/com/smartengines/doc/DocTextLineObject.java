package com.smartengines.doc;

import com.smartengines.common.OcrString;
import com.smartengines.common.Quadrangle;
import com.smartengines.common.QuadranglesVectorIterator;

/* loaded from: classes3.dex */
public class DocTextLineObject extends DocBasicObject {
    private transient long swigCPtr;

    public DocTextLineObject(long j, boolean z) {
        super(jnidocengineJNI.DocTextLineObject_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(DocTextLineObject docTextLineObject) {
        if (docTextLineObject == null) {
            return 0L;
        }
        return docTextLineObject.swigCPtr;
    }

    public static long swigRelease(DocTextLineObject docTextLineObject) {
        if (docTextLineObject == null) {
            return 0L;
        }
        if (!docTextLineObject.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docTextLineObject.swigCPtr;
        docTextLineObject.swigCMemOwn = false;
        docTextLineObject.delete();
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
                jnidocengineJNI.delete_DocTextLineObject(this.swigCPtr);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static String ObjectTypeStatic() {
        return jnidocengineJNI.DocTextLineObject_ObjectTypeStatic();
    }

    public OcrString GetOcrString() {
        return new OcrString(jnidocengineJNI.DocTextLineObject_GetOcrString(this.swigCPtr, this), false);
    }

    public QuadranglesVectorIterator CellQuadranglesOnSceneBegin() {
        return new QuadranglesVectorIterator(jnidocengineJNI.DocTextLineObject_CellQuadranglesOnSceneBegin(this.swigCPtr, this), true);
    }

    public QuadranglesVectorIterator CellQuadranglesOnSceneEnd() {
        return new QuadranglesVectorIterator(jnidocengineJNI.DocTextLineObject_CellQuadranglesOnSceneEnd(this.swigCPtr, this), true);
    }

    public QuadranglesVectorIterator CellQuadranglesOnPageBegin() {
        return new QuadranglesVectorIterator(jnidocengineJNI.DocTextLineObject_CellQuadranglesOnPageBegin(this.swigCPtr, this), true);
    }

    public QuadranglesVectorIterator CellQuadranglesOnPageEnd() {
        return new QuadranglesVectorIterator(jnidocengineJNI.DocTextLineObject_CellQuadranglesOnPageEnd(this.swigCPtr, this), true);
    }

    public Quadrangle GetCellQuadOnScene(int i) {
        return new Quadrangle(jnidocengineJNI.DocTextLineObject_GetCellQuadOnScene(this.swigCPtr, this, i), false);
    }

    public Quadrangle GetCellQuadOnPage(int i) {
        return new Quadrangle(jnidocengineJNI.DocTextLineObject_GetCellQuadOnPage(this.swigCPtr, this, i), false);
    }
}
