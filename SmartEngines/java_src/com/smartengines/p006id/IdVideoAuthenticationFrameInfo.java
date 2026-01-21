package com.smartengines.p006id;

import com.smartengines.common.Image;
import com.smartengines.common.Size;

/* loaded from: classes3.dex */
public class IdVideoAuthenticationFrameInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdVideoAuthenticationFrameInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo) {
        if (idVideoAuthenticationFrameInfo == null) {
            return 0L;
        }
        return idVideoAuthenticationFrameInfo.swigCPtr;
    }

    public static long swigRelease(IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo) {
        if (idVideoAuthenticationFrameInfo == null) {
            return 0L;
        }
        if (!idVideoAuthenticationFrameInfo.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idVideoAuthenticationFrameInfo.swigCPtr;
        idVideoAuthenticationFrameInfo.swigCMemOwn = false;
        idVideoAuthenticationFrameInfo.delete();
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
                jniidengineJNI.delete_IdVideoAuthenticationFrameInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdVideoAuthenticationFrameInfo() {
        this(jniidengineJNI.new_IdVideoAuthenticationFrameInfo__SWIG_0(), true);
    }

    public IdVideoAuthenticationFrameInfo(Image image, int i) {
        this(jniidengineJNI.new_IdVideoAuthenticationFrameInfo__SWIG_1(Image.getCPtr(image), image, i), true);
    }

    public IdVideoAuthenticationFrameInfo(IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo) {
        this(jniidengineJNI.new_IdVideoAuthenticationFrameInfo__SWIG_2(getCPtr(idVideoAuthenticationFrameInfo), idVideoAuthenticationFrameInfo), true);
    }

    public int GetWidth() {
        return jniidengineJNI.IdVideoAuthenticationFrameInfo_GetWidth(this.swigCPtr, this);
    }

    public void SetWidth(int i) {
        jniidengineJNI.IdVideoAuthenticationFrameInfo_SetWidth(this.swigCPtr, this, i);
    }

    public int GetHeight() {
        return jniidengineJNI.IdVideoAuthenticationFrameInfo_GetHeight(this.swigCPtr, this);
    }

    public void SetHeight(int i) {
        jniidengineJNI.IdVideoAuthenticationFrameInfo_SetHeight(this.swigCPtr, this, i);
    }

    public int GetStride() {
        return jniidengineJNI.IdVideoAuthenticationFrameInfo_GetStride(this.swigCPtr, this);
    }

    public void SetStride(int i) {
        jniidengineJNI.IdVideoAuthenticationFrameInfo_SetStride(this.swigCPtr, this, i);
    }

    public int GetChannels() {
        return jniidengineJNI.IdVideoAuthenticationFrameInfo_GetChannels(this.swigCPtr, this);
    }

    public void SetChannels(int i) {
        jniidengineJNI.IdVideoAuthenticationFrameInfo_SetChannels(this.swigCPtr, this, i);
    }

    public Size GetSize() {
        return new Size(jniidengineJNI.IdVideoAuthenticationFrameInfo_GetSize(this.swigCPtr, this), true);
    }

    public void SetSize(Size size) {
        jniidengineJNI.IdVideoAuthenticationFrameInfo_SetSize(this.swigCPtr, this, Size.getCPtr(size), size);
    }

    public int GetTimestamp() {
        return jniidengineJNI.IdVideoAuthenticationFrameInfo_GetTimestamp(this.swigCPtr, this);
    }

    public void SetTimestamp(int i) {
        jniidengineJNI.IdVideoAuthenticationFrameInfo_SetTimestamp(this.swigCPtr, this, i);
    }
}
