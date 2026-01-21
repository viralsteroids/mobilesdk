package com.smartengines.doc;

import com.smartengines.common.Size;

/* loaded from: classes3.dex */
public class DocZoneObject extends DocBasicObject {
    private transient long swigCPtr;

    public DocZoneObject(long j, boolean z) {
        super(jnidocengineJNI.DocZoneObject_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(DocZoneObject docZoneObject) {
        if (docZoneObject == null) {
            return 0L;
        }
        return docZoneObject.swigCPtr;
    }

    public static long swigRelease(DocZoneObject docZoneObject) {
        if (docZoneObject == null) {
            return 0L;
        }
        if (!docZoneObject.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docZoneObject.swigCPtr;
        docZoneObject.swigCMemOwn = false;
        docZoneObject.delete();
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
                jnidocengineJNI.delete_DocZoneObject(this.swigCPtr);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static String ObjectTypeStatic() {
        return jnidocengineJNI.DocZoneObject_ObjectTypeStatic();
    }

    public Size GetSize() {
        return new Size(jnidocengineJNI.DocZoneObject_GetSize(this.swigCPtr, this), false);
    }

    public Size GetMutableSize() {
        return new Size(jnidocengineJNI.DocZoneObject_GetMutableSize(this.swigCPtr, this), false);
    }

    public void SetSize(Size size) {
        jnidocengineJNI.DocZoneObject_SetSize(this.swigCPtr, this, Size.getCPtr(size), size);
    }
}
