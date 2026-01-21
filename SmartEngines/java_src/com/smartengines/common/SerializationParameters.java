package com.smartengines.common;

/* loaded from: classes3.dex */
public class SerializationParameters {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public SerializationParameters(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(SerializationParameters serializationParameters) {
        if (serializationParameters == null) {
            return 0L;
        }
        return serializationParameters.swigCPtr;
    }

    public static long swigRelease(SerializationParameters serializationParameters) {
        if (serializationParameters == null) {
            return 0L;
        }
        if (!serializationParameters.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = serializationParameters.swigCPtr;
        serializationParameters.swigCMemOwn = false;
        serializationParameters.delete();
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
                jnisecommonJNI.delete_SerializationParameters(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public SerializationParameters() {
        this(jnisecommonJNI.new_SerializationParameters__SWIG_0(), true);
    }

    public SerializationParameters(SerializationParameters serializationParameters) {
        this(jnisecommonJNI.new_SerializationParameters__SWIG_1(getCPtr(serializationParameters), serializationParameters), true);
    }

    public boolean HasIgnoredObjectType(String str) {
        return jnisecommonJNI.SerializationParameters_HasIgnoredObjectType(this.swigCPtr, this, str);
    }

    public void AddIgnoredObjectType(String str) {
        jnisecommonJNI.SerializationParameters_AddIgnoredObjectType(this.swigCPtr, this, str);
    }

    public void RemoveIgnoredObjectType(String str) {
        jnisecommonJNI.SerializationParameters_RemoveIgnoredObjectType(this.swigCPtr, this, str);
    }

    public StringsSetIterator IgnoredObjectTypesBegin() {
        return new StringsSetIterator(jnisecommonJNI.SerializationParameters_IgnoredObjectTypesBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator IgnoredObjectTypesEnd() {
        return new StringsSetIterator(jnisecommonJNI.SerializationParameters_IgnoredObjectTypesEnd(this.swigCPtr, this), true);
    }

    public boolean HasIgnoredKey(String str) {
        return jnisecommonJNI.SerializationParameters_HasIgnoredKey(this.swigCPtr, this, str);
    }

    public void AddIgnoredKey(String str) {
        jnisecommonJNI.SerializationParameters_AddIgnoredKey(this.swigCPtr, this, str);
    }

    public void RemoveIgnoredKey(String str) {
        jnisecommonJNI.SerializationParameters_RemoveIgnoredKey(this.swigCPtr, this, str);
    }

    public StringsSetIterator IgnoredKeysBegin() {
        return new StringsSetIterator(jnisecommonJNI.SerializationParameters_IgnoredKeysBegin(this.swigCPtr, this), true);
    }

    public StringsSetIterator IgnoredKeysEnd() {
        return new StringsSetIterator(jnisecommonJNI.SerializationParameters_IgnoredKeysEnd(this.swigCPtr, this), true);
    }
}
