package com.smartengines.p006id;

/* loaded from: classes3.dex */
public class IdImageFieldsMapIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdImageFieldsMapIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdImageFieldsMapIterator idImageFieldsMapIterator) {
        if (idImageFieldsMapIterator == null) {
            return 0L;
        }
        return idImageFieldsMapIterator.swigCPtr;
    }

    public static long swigRelease(IdImageFieldsMapIterator idImageFieldsMapIterator) {
        if (idImageFieldsMapIterator == null) {
            return 0L;
        }
        if (!idImageFieldsMapIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idImageFieldsMapIterator.swigCPtr;
        idImageFieldsMapIterator.swigCMemOwn = false;
        idImageFieldsMapIterator.delete();
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
                jniidengineJNI.delete_IdImageFieldsMapIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdImageFieldsMapIterator(IdImageFieldsMapIterator idImageFieldsMapIterator) {
        this(jniidengineJNI.new_IdImageFieldsMapIterator(getCPtr(idImageFieldsMapIterator), idImageFieldsMapIterator), true);
    }

    public String GetKey() {
        return jniidengineJNI.IdImageFieldsMapIterator_GetKey(this.swigCPtr, this);
    }

    public IdImageField GetValue() {
        return new IdImageField(jniidengineJNI.IdImageFieldsMapIterator_GetValue(this.swigCPtr, this), false);
    }

    public boolean Equals(IdImageFieldsMapIterator idImageFieldsMapIterator) {
        return jniidengineJNI.IdImageFieldsMapIterator_Equals(this.swigCPtr, this, getCPtr(idImageFieldsMapIterator), idImageFieldsMapIterator);
    }

    public void Advance() {
        jniidengineJNI.IdImageFieldsMapIterator_Advance(this.swigCPtr, this);
    }
}
