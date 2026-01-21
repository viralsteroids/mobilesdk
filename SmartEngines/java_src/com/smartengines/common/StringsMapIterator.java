package com.smartengines.common;

/* loaded from: classes3.dex */
public class StringsMapIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public StringsMapIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(StringsMapIterator stringsMapIterator) {
        if (stringsMapIterator == null) {
            return 0L;
        }
        return stringsMapIterator.swigCPtr;
    }

    public static long swigRelease(StringsMapIterator stringsMapIterator) {
        if (stringsMapIterator == null) {
            return 0L;
        }
        if (!stringsMapIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = stringsMapIterator.swigCPtr;
        stringsMapIterator.swigCMemOwn = false;
        stringsMapIterator.delete();
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
                jnisecommonJNI.delete_StringsMapIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public StringsMapIterator(StringsMapIterator stringsMapIterator) {
        this(jnisecommonJNI.new_StringsMapIterator(getCPtr(stringsMapIterator), stringsMapIterator), true);
    }

    public String GetKey() {
        return jnisecommonJNI.StringsMapIterator_GetKey(this.swigCPtr, this);
    }

    public String GetValue() {
        return jnisecommonJNI.StringsMapIterator_GetValue(this.swigCPtr, this);
    }

    public boolean Equals(StringsMapIterator stringsMapIterator) {
        return jnisecommonJNI.StringsMapIterator_Equals(this.swigCPtr, this, getCPtr(stringsMapIterator), stringsMapIterator);
    }

    public void Advance() {
        jnisecommonJNI.StringsMapIterator_Advance(this.swigCPtr, this);
    }
}
