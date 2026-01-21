package com.smartengines.code;

import com.smartengines.common.Image;
import com.smartengines.common.Quadrangle;
import com.smartengines.common.QuadranglesMapIterator;
import com.smartengines.common.StringsMapIterator;

/* loaded from: classes3.dex */
public class CodeObject {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CodeObject(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(CodeObject codeObject) {
        if (codeObject == null) {
            return 0L;
        }
        return codeObject.swigCPtr;
    }

    public static long swigRelease(CodeObject codeObject) {
        if (codeObject == null) {
            return 0L;
        }
        if (!codeObject.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = codeObject.swigCPtr;
        codeObject.swigCMemOwn = false;
        codeObject.delete();
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
                jnicodeengineJNI.delete_CodeObject(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public CodeObject() {
        this(jnicodeengineJNI.new_CodeObject__SWIG_0(), true);
    }

    public CodeObject(String str, CodeObjectType codeObjectType, boolean z, float f) {
        this(jnicodeengineJNI.new_CodeObject__SWIG_1(str, codeObjectType.swigValue(), z, f), true);
    }

    public CodeObject(String str, CodeObjectType codeObjectType, boolean z) {
        this(jnicodeengineJNI.new_CodeObject__SWIG_2(str, codeObjectType.swigValue(), z), true);
    }

    public CodeObject(String str, CodeObjectType codeObjectType) {
        this(jnicodeengineJNI.new_CodeObject__SWIG_3(str, codeObjectType.swigValue()), true);
    }

    public CodeObject(CodeObject codeObject) {
        this(jnicodeengineJNI.new_CodeObject__SWIG_4(getCPtr(codeObject), codeObject), true);
    }

    public int GetID() {
        return jnicodeengineJNI.CodeObject_GetID(this.swigCPtr, this);
    }

    public CodeObjectType GetType() {
        return CodeObjectType.swigToEnum(jnicodeengineJNI.CodeObject_GetType(this.swigCPtr, this));
    }

    public String GetTypeStr() {
        return jnicodeengineJNI.CodeObject_GetTypeStr(this.swigCPtr, this);
    }

    public String GetName() {
        return jnicodeengineJNI.CodeObject_GetName(this.swigCPtr, this);
    }

    public boolean IsAccepted() {
        return jnicodeengineJNI.CodeObject_IsAccepted(this.swigCPtr, this);
    }

    public boolean IsValidated() {
        return jnicodeengineJNI.CodeObject_IsValidated(this.swigCPtr, this);
    }

    public float GetConfidence() {
        return jnicodeengineJNI.CodeObject_GetConfidence(this.swigCPtr, this);
    }

    public void SetFirstDetectedFrame(int i) {
        jnicodeengineJNI.CodeObject_SetFirstDetectedFrame(this.swigCPtr, this, i);
    }

    public void SetLastUpdatedFrame(int i) {
        jnicodeengineJNI.CodeObject_SetLastUpdatedFrame(this.swigCPtr, this, i);
    }

    public int GetFirstDetectedFrame() {
        return jnicodeengineJNI.CodeObject_GetFirstDetectedFrame(this.swigCPtr, this);
    }

    public int GetLastUpdatedFrame() {
        return jnicodeengineJNI.CodeObject_GetLastUpdatedFrame(this.swigCPtr, this);
    }

    public boolean GetIsTerminal() {
        return jnicodeengineJNI.CodeObject_GetIsTerminal(this.swigCPtr, this);
    }

    public void SetIsTerminal(boolean z) {
        jnicodeengineJNI.CodeObject_SetIsTerminal(this.swigCPtr, this, z);
    }

    public boolean HasQuadrangle() {
        return jnicodeengineJNI.CodeObject_HasQuadrangle(this.swigCPtr, this);
    }

    public Quadrangle GetQuadrangle() {
        return new Quadrangle(jnicodeengineJNI.CodeObject_GetQuadrangle(this.swigCPtr, this), false);
    }

    public void SetQuadrangle(Quadrangle quadrangle) {
        jnicodeengineJNI.CodeObject_SetQuadrangle(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle);
    }

    public boolean HasImage() {
        return jnicodeengineJNI.CodeObject_HasImage(this.swigCPtr, this);
    }

    public Image GetImage() {
        return new Image(jnicodeengineJNI.CodeObject_GetImage(this.swigCPtr, this), false);
    }

    public void SetImage(Image image) {
        jnicodeengineJNI.CodeObject_SetImage(this.swigCPtr, this, Image.getCPtr(image), image);
    }

    public void RemoveImage() {
        jnicodeengineJNI.CodeObject_RemoveImage(this.swigCPtr, this);
    }

    public int GetComponentsCount() {
        return jnicodeengineJNI.CodeObject_GetComponentsCount(this.swigCPtr, this);
    }

    public Quadrangle GetComponent(String str) {
        return new Quadrangle(jnicodeengineJNI.CodeObject_GetComponent(this.swigCPtr, this, str), false);
    }

    public void SetComponent(String str, Quadrangle quadrangle) {
        jnicodeengineJNI.CodeObject_SetComponent(this.swigCPtr, this, str, Quadrangle.getCPtr(quadrangle), quadrangle);
    }

    public boolean HasComponent(String str) {
        return jnicodeengineJNI.CodeObject_HasComponent(this.swigCPtr, this, str);
    }

    public QuadranglesMapIterator ComponentsBegin() {
        return new QuadranglesMapIterator(jnicodeengineJNI.CodeObject_ComponentsBegin(this.swigCPtr, this), true);
    }

    public QuadranglesMapIterator ComponentsEnd() {
        return new QuadranglesMapIterator(jnicodeengineJNI.CodeObject_ComponentsEnd(this.swigCPtr, this), true);
    }

    public int GetFieldsCount() {
        return jnicodeengineJNI.CodeObject_GetFieldsCount(this.swigCPtr, this);
    }

    public CodeField GetField(String str) {
        return new CodeField(jnicodeengineJNI.CodeObject_GetField(this.swigCPtr, this, str), false);
    }

    public void SetField(String str, CodeField codeField) {
        jnicodeengineJNI.CodeObject_SetField(this.swigCPtr, this, str, CodeField.getCPtr(codeField), codeField);
    }

    public boolean HasField(String str) {
        return jnicodeengineJNI.CodeObject_HasField(this.swigCPtr, this, str);
    }

    public void RemoveField(String str) {
        jnicodeengineJNI.CodeObject_RemoveField(this.swigCPtr, this, str);
    }

    public CodeFieldsMapIterator FieldsBegin() {
        return new CodeFieldsMapIterator(jnicodeengineJNI.CodeObject_FieldsBegin(this.swigCPtr, this), true);
    }

    public CodeFieldsMapIterator FieldsEnd() {
        return new CodeFieldsMapIterator(jnicodeengineJNI.CodeObject_FieldsEnd(this.swigCPtr, this), true);
    }

    public int GetAttributesCount() {
        return jnicodeengineJNI.CodeObject_GetAttributesCount(this.swigCPtr, this);
    }

    public String GetAttribute(String str) {
        return jnicodeengineJNI.CodeObject_GetAttribute(this.swigCPtr, this, str);
    }

    public boolean HasAttribute(String str) {
        return jnicodeengineJNI.CodeObject_HasAttribute(this.swigCPtr, this, str);
    }

    public void SetAttribute(String str, String str2) {
        jnicodeengineJNI.CodeObject_SetAttribute(this.swigCPtr, this, str, str2);
    }

    public StringsMapIterator AttributesBegin() {
        return new StringsMapIterator(jnicodeengineJNI.CodeObject_AttributesBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator AttributesEnd() {
        return new StringsMapIterator(jnicodeengineJNI.CodeObject_AttributesEnd(this.swigCPtr, this), true);
    }
}
