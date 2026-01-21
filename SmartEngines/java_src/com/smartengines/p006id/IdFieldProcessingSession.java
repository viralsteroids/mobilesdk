package com.smartengines.p006id;

/* loaded from: classes3.dex */
public class IdFieldProcessingSession {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdFieldProcessingSession(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdFieldProcessingSession idFieldProcessingSession) {
        if (idFieldProcessingSession == null) {
            return 0L;
        }
        return idFieldProcessingSession.swigCPtr;
    }

    public static long swigRelease(IdFieldProcessingSession idFieldProcessingSession) {
        if (idFieldProcessingSession == null) {
            return 0L;
        }
        if (!idFieldProcessingSession.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idFieldProcessingSession.swigCPtr;
        idFieldProcessingSession.swigCMemOwn = false;
        idFieldProcessingSession.delete();
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
                jniidengineJNI.delete_IdFieldProcessingSession(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String GetActivationRequest() {
        return jniidengineJNI.IdFieldProcessingSession_GetActivationRequest(this.swigCPtr, this);
    }

    public void Activate(String str) {
        jniidengineJNI.IdFieldProcessingSession_Activate(this.swigCPtr, this, str);
    }

    public boolean IsActivated() {
        return jniidengineJNI.IdFieldProcessingSession_IsActivated(this.swigCPtr, this);
    }

    public void Process() {
        jniidengineJNI.IdFieldProcessingSession_Process(this.swigCPtr, this);
    }

    public int GetTextFieldsCount() {
        return jniidengineJNI.IdFieldProcessingSession_GetTextFieldsCount(this.swigCPtr, this);
    }

    public boolean HasTextField(String str) {
        return jniidengineJNI.IdFieldProcessingSession_HasTextField(this.swigCPtr, this, str);
    }

    public IdTextField GetTextField(String str) {
        return new IdTextField(jniidengineJNI.IdFieldProcessingSession_GetTextField(this.swigCPtr, this, str), false);
    }

    public void SetTextField(String str, IdTextField idTextField) {
        jniidengineJNI.IdFieldProcessingSession_SetTextField(this.swigCPtr, this, str, IdTextField.getCPtr(idTextField), idTextField);
    }

    public void RemoveTextField(String str) {
        jniidengineJNI.IdFieldProcessingSession_RemoveTextField(this.swigCPtr, this, str);
    }

    public IdTextFieldsMapIterator TextFieldsBegin() {
        return new IdTextFieldsMapIterator(jniidengineJNI.IdFieldProcessingSession_TextFieldsBegin(this.swigCPtr, this), true);
    }

    public IdTextFieldsMapIterator TextFieldsEnd() {
        return new IdTextFieldsMapIterator(jniidengineJNI.IdFieldProcessingSession_TextFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetImageFieldsCount() {
        return jniidengineJNI.IdFieldProcessingSession_GetImageFieldsCount(this.swigCPtr, this);
    }

    public boolean HasImageField(String str) {
        return jniidengineJNI.IdFieldProcessingSession_HasImageField(this.swigCPtr, this, str);
    }

    public IdImageField GetImageField(String str) {
        return new IdImageField(jniidengineJNI.IdFieldProcessingSession_GetImageField(this.swigCPtr, this, str), false);
    }

    public void SetImageField(String str, IdImageField idImageField) {
        jniidengineJNI.IdFieldProcessingSession_SetImageField(this.swigCPtr, this, str, IdImageField.getCPtr(idImageField), idImageField);
    }

    public void RemoveImageField(String str) {
        jniidengineJNI.IdFieldProcessingSession_RemoveImageField(this.swigCPtr, this, str);
    }

    public IdImageFieldsMapIterator ImageFieldsBegin() {
        return new IdImageFieldsMapIterator(jniidengineJNI.IdFieldProcessingSession_ImageFieldsBegin(this.swigCPtr, this), true);
    }

    public IdImageFieldsMapIterator ImageFieldsEnd() {
        return new IdImageFieldsMapIterator(jniidengineJNI.IdFieldProcessingSession_ImageFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetAnimatedFieldsCount() {
        return jniidengineJNI.IdFieldProcessingSession_GetAnimatedFieldsCount(this.swigCPtr, this);
    }

    public boolean HasAnimatedField(String str) {
        return jniidengineJNI.IdFieldProcessingSession_HasAnimatedField(this.swigCPtr, this, str);
    }

    public IdAnimatedField GetAnimatedField(String str) {
        return new IdAnimatedField(jniidengineJNI.IdFieldProcessingSession_GetAnimatedField(this.swigCPtr, this, str), false);
    }

    public void SetAnimatedField(String str, IdAnimatedField idAnimatedField) {
        jniidengineJNI.IdFieldProcessingSession_SetAnimatedField(this.swigCPtr, this, str, IdAnimatedField.getCPtr(idAnimatedField), idAnimatedField);
    }

    public void RemoveAnimatedField(String str) {
        jniidengineJNI.IdFieldProcessingSession_RemoveAnimatedField(this.swigCPtr, this, str);
    }

    public IdAnimatedFieldsMapIterator AnimatedFieldsBegin() {
        return new IdAnimatedFieldsMapIterator(jniidengineJNI.IdFieldProcessingSession_AnimatedFieldsBegin(this.swigCPtr, this), true);
    }

    public IdAnimatedFieldsMapIterator AnimatedFieldsEnd() {
        return new IdAnimatedFieldsMapIterator(jniidengineJNI.IdFieldProcessingSession_AnimatedFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetCheckFieldsCount() {
        return jniidengineJNI.IdFieldProcessingSession_GetCheckFieldsCount(this.swigCPtr, this);
    }

    public boolean HasCheckField(String str) {
        return jniidengineJNI.IdFieldProcessingSession_HasCheckField(this.swigCPtr, this, str);
    }

    public IdCheckField GetCheckField(String str) {
        return new IdCheckField(jniidengineJNI.IdFieldProcessingSession_GetCheckField(this.swigCPtr, this, str), false);
    }

    public void SetCheckField(String str, IdCheckField idCheckField) {
        jniidengineJNI.IdFieldProcessingSession_SetCheckField(this.swigCPtr, this, str, IdCheckField.getCPtr(idCheckField), idCheckField);
    }

    public void RemoveCheckField(String str) {
        jniidengineJNI.IdFieldProcessingSession_RemoveCheckField(this.swigCPtr, this, str);
    }

    public IdCheckFieldsMapIterator CheckFieldsBegin() {
        return new IdCheckFieldsMapIterator(jniidengineJNI.IdFieldProcessingSession_CheckFieldsBegin(this.swigCPtr, this), true);
    }

    public IdCheckFieldsMapIterator CheckFieldsEnd() {
        return new IdCheckFieldsMapIterator(jniidengineJNI.IdFieldProcessingSession_CheckFieldsEnd(this.swigCPtr, this), true);
    }

    public void Reset() {
        jniidengineJNI.IdFieldProcessingSession_Reset(this.swigCPtr, this);
    }
}
