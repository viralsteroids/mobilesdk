package com.smartengines.p006id;

/* loaded from: classes3.dex */
public class IdCheckFieldsMapIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdCheckFieldsMapIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdCheckFieldsMapIterator idCheckFieldsMapIterator) {
        if (idCheckFieldsMapIterator == null) {
            return 0L;
        }
        return idCheckFieldsMapIterator.swigCPtr;
    }

    public static long swigRelease(IdCheckFieldsMapIterator idCheckFieldsMapIterator) {
        if (idCheckFieldsMapIterator == null) {
            return 0L;
        }
        if (!idCheckFieldsMapIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idCheckFieldsMapIterator.swigCPtr;
        idCheckFieldsMapIterator.swigCMemOwn = false;
        idCheckFieldsMapIterator.delete();
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
                jniidengineJNI.delete_IdCheckFieldsMapIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdCheckFieldsMapIterator(IdCheckFieldsMapIterator idCheckFieldsMapIterator) {
        this(jniidengineJNI.new_IdCheckFieldsMapIterator(getCPtr(idCheckFieldsMapIterator), idCheckFieldsMapIterator), true);
    }

    public String GetKey() {
        return jniidengineJNI.IdCheckFieldsMapIterator_GetKey(this.swigCPtr, this);
    }

    public IdCheckField GetValue() {
        return new IdCheckField(jniidengineJNI.IdCheckFieldsMapIterator_GetValue(this.swigCPtr, this), false);
    }

    public boolean Equals(IdCheckFieldsMapIterator idCheckFieldsMapIterator) {
        return jniidengineJNI.IdCheckFieldsMapIterator_Equals(this.swigCPtr, this, getCPtr(idCheckFieldsMapIterator), idCheckFieldsMapIterator);
    }

    public void Advance() {
        jniidengineJNI.IdCheckFieldsMapIterator_Advance(this.swigCPtr, this);
    }
}
