package com.smartengines.p006id;

/* loaded from: classes3.dex */
public class IdAnimatedFieldsMapIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdAnimatedFieldsMapIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdAnimatedFieldsMapIterator idAnimatedFieldsMapIterator) {
        if (idAnimatedFieldsMapIterator == null) {
            return 0L;
        }
        return idAnimatedFieldsMapIterator.swigCPtr;
    }

    public static long swigRelease(IdAnimatedFieldsMapIterator idAnimatedFieldsMapIterator) {
        if (idAnimatedFieldsMapIterator == null) {
            return 0L;
        }
        if (!idAnimatedFieldsMapIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idAnimatedFieldsMapIterator.swigCPtr;
        idAnimatedFieldsMapIterator.swigCMemOwn = false;
        idAnimatedFieldsMapIterator.delete();
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
                jniidengineJNI.delete_IdAnimatedFieldsMapIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdAnimatedFieldsMapIterator(IdAnimatedFieldsMapIterator idAnimatedFieldsMapIterator) {
        this(jniidengineJNI.new_IdAnimatedFieldsMapIterator(getCPtr(idAnimatedFieldsMapIterator), idAnimatedFieldsMapIterator), true);
    }

    public String GetKey() {
        return jniidengineJNI.IdAnimatedFieldsMapIterator_GetKey(this.swigCPtr, this);
    }

    public IdAnimatedField GetValue() {
        return new IdAnimatedField(jniidengineJNI.IdAnimatedFieldsMapIterator_GetValue(this.swigCPtr, this), false);
    }

    public boolean Equals(IdAnimatedFieldsMapIterator idAnimatedFieldsMapIterator) {
        return jniidengineJNI.IdAnimatedFieldsMapIterator_Equals(this.swigCPtr, this, getCPtr(idAnimatedFieldsMapIterator), idAnimatedFieldsMapIterator);
    }

    public void Advance() {
        jniidengineJNI.IdAnimatedFieldsMapIterator_Advance(this.swigCPtr, this);
    }
}
