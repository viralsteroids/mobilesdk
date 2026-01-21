package com.smartengines.common;

/* loaded from: classes3.dex */
public class StringsSet {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public StringsSet(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(StringsSet stringsSet) {
        if (stringsSet == null) {
            return 0L;
        }
        return stringsSet.swigCPtr;
    }

    public static long swigRelease(StringsSet stringsSet) {
        if (stringsSet == null) {
            return 0L;
        }
        if (!stringsSet.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = stringsSet.swigCPtr;
        stringsSet.swigCMemOwn = false;
        stringsSet.delete();
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
                jnisecommonJNI.delete_StringsSet(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int GetStringsCount() {
        return jnisecommonJNI.StringsSet_GetStringsCount(this.swigCPtr, this);
    }

    public boolean HasString(String str) {
        return jnisecommonJNI.StringsSet_HasString(this.swigCPtr, this, str);
    }

    public StringsSetIterator StringsBegin() {
        return new StringsSetIterator(jnisecommonJNI.StringsSet_StringsBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator StringsEnd() {
        return new StringsSetIterator(jnisecommonJNI.StringsSet_StringsEnd(this.swigCPtr, this), true);
    }
}
