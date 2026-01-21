package com.smartengines.text;

import com.smartengines.common.Image;

/* loaded from: classes3.dex */
public class TextScene {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TextScene(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(TextScene textScene) {
        if (textScene == null) {
            return 0L;
        }
        return textScene.swigCPtr;
    }

    public static long swigRelease(TextScene textScene) {
        if (textScene == null) {
            return 0L;
        }
        if (!textScene.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = textScene.swigCPtr;
        textScene.swigCMemOwn = false;
        textScene.delete();
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
                jnitextengineJNI.delete_TextScene(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public TextIterator CreateIterator(String str) {
        long jTextScene_CreateIterator__SWIG_0 = jnitextengineJNI.TextScene_CreateIterator__SWIG_0(this.swigCPtr, this, str);
        if (jTextScene_CreateIterator__SWIG_0 == 0) {
            return null;
        }
        return new TextIterator(jTextScene_CreateIterator__SWIG_0, true);
    }

    public TextIterator CreateIterator() {
        long jTextScene_CreateIterator__SWIG_1 = jnitextengineJNI.TextScene_CreateIterator__SWIG_1(this.swigCPtr, this);
        if (jTextScene_CreateIterator__SWIG_1 == 0) {
            return null;
        }
        return new TextIterator(jTextScene_CreateIterator__SWIG_1, true);
    }

    public boolean IsGarbage() {
        return jnitextengineJNI.TextScene_IsGarbage(this.swigCPtr, this);
    }

    public Image GetPageImage() {
        return new Image(jnitextengineJNI.TextScene_GetPageImage(this.swigCPtr, this), false);
    }
}
