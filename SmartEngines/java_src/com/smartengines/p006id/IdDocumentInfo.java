package com.smartengines.p006id;

import com.smartengines.common.StringsSet;

/* loaded from: classes3.dex */
public class IdDocumentInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdDocumentInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdDocumentInfo idDocumentInfo) {
        if (idDocumentInfo == null) {
            return 0L;
        }
        return idDocumentInfo.swigCPtr;
    }

    public static long swigRelease(IdDocumentInfo idDocumentInfo) {
        if (idDocumentInfo == null) {
            return 0L;
        }
        if (!idDocumentInfo.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idDocumentInfo.swigCPtr;
        idDocumentInfo.swigCMemOwn = false;
        idDocumentInfo.delete();
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
                jniidengineJNI.delete_IdDocumentInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String GetDocumentName() {
        return jniidengineJNI.IdDocumentInfo_GetDocumentName(this.swigCPtr, this);
    }

    public String GetDocumentDescription() {
        return jniidengineJNI.IdDocumentInfo_GetDocumentDescription(this.swigCPtr, this);
    }

    public int HasRFID() {
        return jniidengineJNI.IdDocumentInfo_HasRFID(this.swigCPtr, this);
    }

    public int SupportedRFID() {
        return jniidengineJNI.IdDocumentInfo_SupportedRFID(this.swigCPtr, this);
    }

    public int HasContactChip() {
        return jniidengineJNI.IdDocumentInfo_HasContactChip(this.swigCPtr, this);
    }

    public StringsSet GetPradoLinks() {
        return new StringsSet(jniidengineJNI.IdDocumentInfo_GetPradoLinks(this.swigCPtr, this), false);
    }

    public StringsSet GetDocumentTemplates() {
        return new StringsSet(jniidengineJNI.IdDocumentInfo_GetDocumentTemplates(this.swigCPtr, this), false);
    }

    public float GetDocumentFieldsRejectionThreshold(String str) {
        return jniidengineJNI.IdDocumentInfo_GetDocumentFieldsRejectionThreshold(this.swigCPtr, this, str);
    }
}
