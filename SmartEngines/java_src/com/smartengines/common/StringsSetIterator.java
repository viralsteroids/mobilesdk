package com.smartengines.common;

/* loaded from: classes3.dex */
public class StringsSetIterator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public StringsSetIterator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(StringsSetIterator stringsSetIterator) {
        if (stringsSetIterator == null) {
            return 0L;
        }
        return stringsSetIterator.swigCPtr;
    }

    public static long swigRelease(StringsSetIterator stringsSetIterator) {
        if (stringsSetIterator == null) {
            return 0L;
        }
        if (!stringsSetIterator.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = stringsSetIterator.swigCPtr;
        stringsSetIterator.swigCMemOwn = false;
        stringsSetIterator.delete();
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
                jnisecommonJNI.delete_StringsSetIterator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public StringsSetIterator(StringsSetIterator stringsSetIterator) {
        this(jnisecommonJNI.new_StringsSetIterator(getCPtr(stringsSetIterator), stringsSetIterator), true);
    }

    public String GetValue() {
        return jnisecommonJNI.StringsSetIterator_GetValue(this.swigCPtr, this);
    }

    public boolean Equals(StringsSetIterator stringsSetIterator) {
        return jnisecommonJNI.StringsSetIterator_Equals(this.swigCPtr, this, getCPtr(stringsSetIterator), stringsSetIterator);
    }

    public void Advance() {
        jnisecommonJNI.StringsSetIterator_Advance(this.swigCPtr, this);
    }
}
