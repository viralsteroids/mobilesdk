package com.smartengines.p006id;

import com.smartengines.common.Rectangle;
import com.smartengines.common.RectanglesVectorIterator;

/* loaded from: classes3.dex */
public class IdFaceRectsResult {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdFaceRectsResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdFaceRectsResult idFaceRectsResult) {
        if (idFaceRectsResult == null) {
            return 0L;
        }
        return idFaceRectsResult.swigCPtr;
    }

    public static long swigRelease(IdFaceRectsResult idFaceRectsResult) {
        if (idFaceRectsResult == null) {
            return 0L;
        }
        if (!idFaceRectsResult.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idFaceRectsResult.swigCPtr;
        idFaceRectsResult.swigCMemOwn = false;
        idFaceRectsResult.delete();
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
                jniidengineJNI.delete_IdFaceRectsResult(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdFaceRectsResult() {
        this(jniidengineJNI.new_IdFaceRectsResult__SWIG_0(), true);
    }

    public IdFaceRectsResult(IdFaceRectsResult idFaceRectsResult) {
        this(jniidengineJNI.new_IdFaceRectsResult__SWIG_1(getCPtr(idFaceRectsResult), idFaceRectsResult), true);
    }

    public void AddFaceRect(Rectangle rectangle) {
        jniidengineJNI.IdFaceRectsResult_AddFaceRect(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle);
    }

    public void Clear() {
        jniidengineJNI.IdFaceRectsResult_Clear(this.swigCPtr, this);
    }

    public int Size() {
        return jniidengineJNI.IdFaceRectsResult_Size(this.swigCPtr, this);
    }

    public RectanglesVectorIterator RectanglesBegin() {
        return new RectanglesVectorIterator(jniidengineJNI.IdFaceRectsResult_RectanglesBegin(this.swigCPtr, this), true);
    }

    public RectanglesVectorIterator RectanglesEnd() {
        return new RectanglesVectorIterator(jniidengineJNI.IdFaceRectsResult_RectanglesEnd(this.swigCPtr, this), true);
    }
}
