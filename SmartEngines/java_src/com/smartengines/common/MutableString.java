package com.smartengines.common;

/* loaded from: classes3.dex */
public class MutableString {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public MutableString(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(MutableString mutableString) {
        if (mutableString == null) {
            return 0L;
        }
        return mutableString.swigCPtr;
    }

    public static long swigRelease(MutableString mutableString) {
        if (mutableString == null) {
            return 0L;
        }
        if (!mutableString.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = mutableString.swigCPtr;
        mutableString.swigCMemOwn = false;
        mutableString.delete();
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
                jnisecommonJNI.delete_MutableString(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public MutableString() {
        this(jnisecommonJNI.new_MutableString__SWIG_0(), true);
    }

    public MutableString(String str) {
        this(jnisecommonJNI.new_MutableString__SWIG_1(str), true);
    }

    public MutableString(MutableString mutableString) {
        this(jnisecommonJNI.new_MutableString__SWIG_2(getCPtr(mutableString), mutableString), true);
    }

    public String GetCStr() {
        return jnisecommonJNI.MutableString_GetCStr(this.swigCPtr, this);
    }

    public int GetLength() {
        return jnisecommonJNI.MutableString_GetLength(this.swigCPtr, this);
    }

    public void Serialize(Serializer serializer) {
        jnisecommonJNI.MutableString_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
