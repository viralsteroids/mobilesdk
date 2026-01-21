package com.smartengines.p006id;

/* loaded from: classes3.dex */
public class IdTextFieldsMapIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdTextFieldsMapIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdTextFieldsMapIterator idTextFieldsMapIterator) {
        if (idTextFieldsMapIterator == null) {
            return 0L;
        }
        return idTextFieldsMapIterator.swigCPtr;
    }

    public static long swigRelease(IdTextFieldsMapIterator idTextFieldsMapIterator) {
        if (idTextFieldsMapIterator == null) {
            return 0L;
        }
        if (!idTextFieldsMapIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idTextFieldsMapIterator.swigCPtr;
        idTextFieldsMapIterator.swigCMemOwn = false;
        idTextFieldsMapIterator.delete();
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
                jniidengineJNI.delete_IdTextFieldsMapIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdTextFieldsMapIterator(IdTextFieldsMapIterator idTextFieldsMapIterator) {
        this(jniidengineJNI.new_IdTextFieldsMapIterator(getCPtr(idTextFieldsMapIterator), idTextFieldsMapIterator), true);
    }

    public String GetKey() {
        return jniidengineJNI.IdTextFieldsMapIterator_GetKey(this.swigCPtr, this);
    }

    public IdTextField GetValue() {
        return new IdTextField(jniidengineJNI.IdTextFieldsMapIterator_GetValue(this.swigCPtr, this), false);
    }

    public boolean Equals(IdTextFieldsMapIterator idTextFieldsMapIterator) {
        return jniidengineJNI.IdTextFieldsMapIterator_Equals(this.swigCPtr, this, getCPtr(idTextFieldsMapIterator), idTextFieldsMapIterator);
    }

    public void Advance() {
        jniidengineJNI.IdTextFieldsMapIterator_Advance(this.swigCPtr, this);
    }
}
