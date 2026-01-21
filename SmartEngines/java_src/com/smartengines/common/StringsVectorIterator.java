package com.smartengines.common;

/* loaded from: classes3.dex */
public class StringsVectorIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public StringsVectorIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(StringsVectorIterator stringsVectorIterator) {
        if (stringsVectorIterator == null) {
            return 0L;
        }
        return stringsVectorIterator.swigCPtr;
    }

    public static long swigRelease(StringsVectorIterator stringsVectorIterator) {
        if (stringsVectorIterator == null) {
            return 0L;
        }
        if (!stringsVectorIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = stringsVectorIterator.swigCPtr;
        stringsVectorIterator.swigCMemOwn = false;
        stringsVectorIterator.delete();
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
                jnisecommonJNI.delete_StringsVectorIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public StringsVectorIterator(StringsVectorIterator stringsVectorIterator) {
        this(jnisecommonJNI.new_StringsVectorIterator(getCPtr(stringsVectorIterator), stringsVectorIterator), true);
    }

    public String GetValue() {
        return jnisecommonJNI.StringsVectorIterator_GetValue(this.swigCPtr, this);
    }

    public boolean Equals(StringsVectorIterator stringsVectorIterator) {
        return jnisecommonJNI.StringsVectorIterator_Equals(this.swigCPtr, this, getCPtr(stringsVectorIterator), stringsVectorIterator);
    }

    public void Advance() {
        jnisecommonJNI.StringsVectorIterator_Advance(this.swigCPtr, this);
    }
}
