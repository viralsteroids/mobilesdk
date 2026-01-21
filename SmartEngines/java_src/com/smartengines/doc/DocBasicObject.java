package com.smartengines.doc;

import com.smartengines.common.Serializer;

/* loaded from: classes3.dex */
public class DocBasicObject {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocBasicObject(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocBasicObject docBasicObject) {
        if (docBasicObject == null) {
            return 0L;
        }
        return docBasicObject.swigCPtr;
    }

    public static long swigRelease(DocBasicObject docBasicObject) {
        if (docBasicObject == null) {
            return 0L;
        }
        if (!docBasicObject.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docBasicObject.swigCPtr;
        docBasicObject.swigCMemOwn = false;
        docBasicObject.delete();
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
                jnidocengineJNI.delete_DocBasicObject(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public static String BaseClassNameStatic() {
        return jnidocengineJNI.DocBasicObject_BaseClassNameStatic();
    }

    public String ObjectType() {
        return jnidocengineJNI.DocBasicObject_ObjectType(this.swigCPtr, this);
    }

    public DocBaseObjectInfo GetBaseObjectInfo() {
        return new DocBaseObjectInfo(jnidocengineJNI.DocBasicObject_GetBaseObjectInfo(this.swigCPtr, this), false);
    }

    public DocBaseObjectInfo GetMutableBaseObjectInfo() {
        return new DocBaseObjectInfo(jnidocengineJNI.DocBasicObject_GetMutableBaseObjectInfo(this.swigCPtr, this), false);
    }

    public void Serialize(Serializer serializer) {
        jnidocengineJNI.DocBasicObject_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
