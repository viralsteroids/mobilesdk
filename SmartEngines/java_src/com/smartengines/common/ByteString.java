package com.smartengines.common;

/* loaded from: classes3.dex */
public class ByteString {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ByteString(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(ByteString byteString) {
        if (byteString == null) {
            return 0L;
        }
        return byteString.swigCPtr;
    }

    public static long swigRelease(ByteString byteString) {
        if (byteString == null) {
            return 0L;
        }
        if (!byteString.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = byteString.swigCPtr;
        byteString.swigCMemOwn = false;
        byteString.delete();
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
                jnisecommonJNI.delete_ByteString(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public ByteString() {
        this(jnisecommonJNI.new_ByteString__SWIG_0(), true);
    }

    public ByteString(byte[] bArr) {
        this(jnisecommonJNI.new_ByteString__SWIG_1(bArr), true);
    }

    public ByteString(ByteString byteString) {
        this(jnisecommonJNI.new_ByteString__SWIG_2(getCPtr(byteString), byteString), true);
    }

    public void swap(ByteString byteString) {
        jnisecommonJNI.ByteString_swap(this.swigCPtr, this, getCPtr(byteString), byteString);
    }

    public int GetLength() {
        return jnisecommonJNI.ByteString_GetLength(this.swigCPtr, this);
    }

    public int GetRequiredBase64BufferLength() {
        return jnisecommonJNI.ByteString_GetRequiredBase64BufferLength(this.swigCPtr, this);
    }

    public int CopyBase64ToBuffer(String str, int i) {
        return jnisecommonJNI.ByteString_CopyBase64ToBuffer(this.swigCPtr, this, str, i);
    }

    public MutableString GetBase64String() {
        return new MutableString(jnisecommonJNI.ByteString_GetBase64String(this.swigCPtr, this), true);
    }

    public int GetRequiredHexBufferLength() {
        return jnisecommonJNI.ByteString_GetRequiredHexBufferLength(this.swigCPtr, this);
    }

    public int CopyHexToBuffer(String str, int i) {
        return jnisecommonJNI.ByteString_CopyHexToBuffer(this.swigCPtr, this, str, i);
    }

    public MutableString GetHexString() {
        return new MutableString(jnisecommonJNI.ByteString_GetHexString(this.swigCPtr, this), true);
    }
}
