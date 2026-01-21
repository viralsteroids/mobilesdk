package com.smartengines.doc;

import com.smartengines.common.Polygon;
import com.smartengines.common.Serializer;
import com.smartengines.common.StringsMapIterator;

/* loaded from: classes3.dex */
public class DocBaseObjectInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocBaseObjectInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocBaseObjectInfo docBaseObjectInfo) {
        if (docBaseObjectInfo == null) {
            return 0L;
        }
        return docBaseObjectInfo.swigCPtr;
    }

    public static long swigRelease(DocBaseObjectInfo docBaseObjectInfo) {
        if (docBaseObjectInfo == null) {
            return 0L;
        }
        if (!docBaseObjectInfo.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docBaseObjectInfo.swigCPtr;
        docBaseObjectInfo.swigCMemOwn = false;
        docBaseObjectInfo.delete();
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
                jnidocengineJNI.delete_DocBaseObjectInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public double GetConfidence() {
        return jnidocengineJNI.DocBaseObjectInfo_GetConfidence(this.swigCPtr, this);
    }

    public boolean GetAcceptFlag() {
        return jnidocengineJNI.DocBaseObjectInfo_GetAcceptFlag(this.swigCPtr, this);
    }

    public Polygon GetGeometryOnPage() {
        return new Polygon(jnidocengineJNI.DocBaseObjectInfo_GetGeometryOnPage(this.swigCPtr, this), false);
    }

    public Polygon GetGeometryOnPagePtr() {
        long jDocBaseObjectInfo_GetGeometryOnPagePtr = jnidocengineJNI.DocBaseObjectInfo_GetGeometryOnPagePtr(this.swigCPtr, this);
        if (jDocBaseObjectInfo_GetGeometryOnPagePtr == 0) {
            return null;
        }
        return new Polygon(jDocBaseObjectInfo_GetGeometryOnPagePtr, false);
    }

    public Polygon GetGeometryOnScene() {
        return new Polygon(jnidocengineJNI.DocBaseObjectInfo_GetGeometryOnScene(this.swigCPtr, this), false);
    }

    public Polygon GetGeometryOnScenePtr() {
        long jDocBaseObjectInfo_GetGeometryOnScenePtr = jnidocengineJNI.DocBaseObjectInfo_GetGeometryOnScenePtr(this.swigCPtr, this);
        if (jDocBaseObjectInfo_GetGeometryOnScenePtr == 0) {
            return null;
        }
        return new Polygon(jDocBaseObjectInfo_GetGeometryOnScenePtr, false);
    }

    public int GetAttributesCount() {
        return jnidocengineJNI.DocBaseObjectInfo_GetAttributesCount(this.swigCPtr, this);
    }

    public boolean HasAttribute(String str) {
        return jnidocengineJNI.DocBaseObjectInfo_HasAttribute(this.swigCPtr, this, str);
    }

    public String GetAttribute(String str) {
        return jnidocengineJNI.DocBaseObjectInfo_GetAttribute(this.swigCPtr, this, str);
    }

    public StringsMapIterator AttributesBegin() {
        return new StringsMapIterator(jnidocengineJNI.DocBaseObjectInfo_AttributesBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator AttributesEnd() {
        return new StringsMapIterator(jnidocengineJNI.DocBaseObjectInfo_AttributesEnd(this.swigCPtr, this), true);
    }

    public void Serialize(Serializer serializer) {
        jnidocengineJNI.DocBaseObjectInfo_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }

    public void SetConfidence(double d) {
        jnidocengineJNI.DocBaseObjectInfo_SetConfidence(this.swigCPtr, this, d);
    }

    public void SetAcceptFlag(boolean z) {
        jnidocengineJNI.DocBaseObjectInfo_SetAcceptFlag(this.swigCPtr, this, z);
    }

    public void SetAttribute(String str, String str2) {
        jnidocengineJNI.DocBaseObjectInfo_SetAttribute(this.swigCPtr, this, str, str2);
    }

    public void RemoveAttribute(String str) {
        jnidocengineJNI.DocBaseObjectInfo_RemoveAttribute(this.swigCPtr, this, str);
    }

    public Polygon GetGeometry() {
        return new Polygon(jnidocengineJNI.DocBaseObjectInfo_GetGeometry(this.swigCPtr, this), false);
    }

    public Polygon GetMutableGeometry() {
        return new Polygon(jnidocengineJNI.DocBaseObjectInfo_GetMutableGeometry(this.swigCPtr, this), false);
    }

    public void SetGeometry(Polygon polygon) {
        jnidocengineJNI.DocBaseObjectInfo_SetGeometry(this.swigCPtr, this, Polygon.getCPtr(polygon), polygon);
    }

    public int GetViewID() {
        return jnidocengineJNI.DocBaseObjectInfo_GetViewID(this.swigCPtr, this);
    }

    public void SetViewID(int i) {
        jnidocengineJNI.DocBaseObjectInfo_SetViewID(this.swigCPtr, this, i);
    }
}
