package com.smartengines.common;

/* loaded from: classes3.dex */
public class Serializer {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public Serializer(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(Serializer serializer) {
        if (serializer == null) {
            return 0L;
        }
        return serializer.swigCPtr;
    }

    public static long swigRelease(Serializer serializer) {
        if (serializer == null) {
            return 0L;
        }
        if (!serializer.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = serializer.swigCPtr;
        serializer.swigCMemOwn = false;
        serializer.delete();
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
                jnisecommonJNI.delete_Serializer(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void Reset() {
        jnisecommonJNI.Serializer_Reset(this.swigCPtr, this);
    }

    public String GetCStr() {
        return jnisecommonJNI.Serializer_GetCStr(this.swigCPtr, this);
    }

    public String SerializerType() {
        return jnisecommonJNI.Serializer_SerializerType(this.swigCPtr, this);
    }

    public static Serializer CreateJSONSerializer(SerializationParameters serializationParameters) {
        long jSerializer_CreateJSONSerializer = jnisecommonJNI.Serializer_CreateJSONSerializer(SerializationParameters.getCPtr(serializationParameters), serializationParameters);
        if (jSerializer_CreateJSONSerializer == 0) {
            return null;
        }
        return new Serializer(jSerializer_CreateJSONSerializer, false);
    }
}
