package com.smartengines.doc;

import com.smartengines.common.Serializer;
import com.smartengines.common.StringsMapIterator;

/* loaded from: classes3.dex */
public class Document {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public Document(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(Document document) {
        if (document == null) {
            return 0L;
        }
        return document.swigCPtr;
    }

    public static long swigRelease(Document document) {
        if (document == null) {
            return 0L;
        }
        if (!document.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = document.swigCPtr;
        document.swigCMemOwn = false;
        document.delete();
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
                jnidocengineJNI.delete_Document(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public static String BaseClassNameStatic() {
        return jnidocengineJNI.Document_BaseClassNameStatic();
    }

    public int GetTextFieldsCount() {
        return jnidocengineJNI.Document_GetTextFieldsCount(this.swigCPtr, this);
    }

    public boolean HasTextField(String str) {
        return jnidocengineJNI.Document_HasTextField(this.swigCPtr, this, str);
    }

    public DocTextField GetTextField(String str) {
        return new DocTextField(jnidocengineJNI.Document_GetTextField(this.swigCPtr, this, str), false);
    }

    public DocTextFieldsIterator TextFieldsBegin() {
        return new DocTextFieldsIterator(jnidocengineJNI.Document_TextFieldsBegin(this.swigCPtr, this), true);
    }

    public DocTextFieldsIterator TextFieldsEnd() {
        return new DocTextFieldsIterator(jnidocengineJNI.Document_TextFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetImageFieldsCount() {
        return jnidocengineJNI.Document_GetImageFieldsCount(this.swigCPtr, this);
    }

    public boolean HasImageField(String str) {
        return jnidocengineJNI.Document_HasImageField(this.swigCPtr, this, str);
    }

    public DocImageField GetImageField(String str) {
        return new DocImageField(jnidocengineJNI.Document_GetImageField(this.swigCPtr, this, str), false);
    }

    public DocImageFieldsIterator ImageFieldsBegin() {
        return new DocImageFieldsIterator(jnidocengineJNI.Document_ImageFieldsBegin(this.swigCPtr, this), true);
    }

    public DocImageFieldsIterator ImageFieldsEnd() {
        return new DocImageFieldsIterator(jnidocengineJNI.Document_ImageFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetCheckboxFieldsCount() {
        return jnidocengineJNI.Document_GetCheckboxFieldsCount(this.swigCPtr, this);
    }

    public boolean HasCheckboxField(String str) {
        return jnidocengineJNI.Document_HasCheckboxField(this.swigCPtr, this, str);
    }

    public DocCheckboxField GetCheckboxField(String str) {
        return new DocCheckboxField(jnidocengineJNI.Document_GetCheckboxField(this.swigCPtr, this, str), false);
    }

    public DocCheckboxFieldsIterator CheckboxFieldsBegin() {
        return new DocCheckboxFieldsIterator(jnidocengineJNI.Document_CheckboxFieldsBegin(this.swigCPtr, this), true);
    }

    public DocCheckboxFieldsIterator CheckboxFieldsEnd() {
        return new DocCheckboxFieldsIterator(jnidocengineJNI.Document_CheckboxFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetForensicFieldsCount() {
        return jnidocengineJNI.Document_GetForensicFieldsCount(this.swigCPtr, this);
    }

    public boolean HasForensicField(String str) {
        return jnidocengineJNI.Document_HasForensicField(this.swigCPtr, this, str);
    }

    public DocForensicField GetForensicField(String str) {
        return new DocForensicField(jnidocengineJNI.Document_GetForensicField(this.swigCPtr, this, str), false);
    }

    public DocForensicFieldsIterator ForensicFieldsBegin() {
        return new DocForensicFieldsIterator(jnidocengineJNI.Document_ForensicFieldsBegin(this.swigCPtr, this), true);
    }

    public DocForensicFieldsIterator ForensicFieldsEnd() {
        return new DocForensicFieldsIterator(jnidocengineJNI.Document_ForensicFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetForensicCheckFieldsCount() {
        return jnidocengineJNI.Document_GetForensicCheckFieldsCount(this.swigCPtr, this);
    }

    public boolean HasForensicCheckField(String str) {
        return jnidocengineJNI.Document_HasForensicCheckField(this.swigCPtr, this, str);
    }

    public DocForensicCheckField GetForensicCheckField(String str) {
        return new DocForensicCheckField(jnidocengineJNI.Document_GetForensicCheckField(this.swigCPtr, this, str), false);
    }

    public DocForensicCheckField GetForensicCheckFieldPtr(String str) {
        long jDocument_GetForensicCheckFieldPtr = jnidocengineJNI.Document_GetForensicCheckFieldPtr(this.swigCPtr, this, str);
        if (jDocument_GetForensicCheckFieldPtr == 0) {
            return null;
        }
        return new DocForensicCheckField(jDocument_GetForensicCheckFieldPtr, false);
    }

    public DocForensicCheckFieldsIterator ForensicCheckFieldsBegin() {
        return new DocForensicCheckFieldsIterator(jnidocengineJNI.Document_ForensicCheckFieldsBegin(this.swigCPtr, this), true);
    }

    public DocForensicCheckFieldsIterator ForensicCheckFieldsEnd() {
        return new DocForensicCheckFieldsIterator(jnidocengineJNI.Document_ForensicCheckFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetTableFieldsCount() {
        return jnidocengineJNI.Document_GetTableFieldsCount(this.swigCPtr, this);
    }

    public boolean HasTableField(String str) {
        return jnidocengineJNI.Document_HasTableField(this.swigCPtr, this, str);
    }

    public DocTableField GetTableField(String str) {
        return new DocTableField(jnidocengineJNI.Document_GetTableField(this.swigCPtr, this, str), false);
    }

    public DocTableFieldsIterator TableFieldsBegin() {
        return new DocTableFieldsIterator(jnidocengineJNI.Document_TableFieldsBegin(this.swigCPtr, this), true);
    }

    public DocTableFieldsIterator TableFieldsEnd() {
        return new DocTableFieldsIterator(jnidocengineJNI.Document_TableFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetBarcodeFieldsCount() {
        return jnidocengineJNI.Document_GetBarcodeFieldsCount(this.swigCPtr, this);
    }

    public boolean HasBarcodeField(String str) {
        return jnidocengineJNI.Document_HasBarcodeField(this.swigCPtr, this, str);
    }

    public DocBarcodeField GetBarcodeField(String str) {
        return new DocBarcodeField(jnidocengineJNI.Document_GetBarcodeField(this.swigCPtr, this, str), false);
    }

    public DocBarcodeFieldsIterator BarcodeFieldsBegin() {
        return new DocBarcodeFieldsIterator(jnidocengineJNI.Document_BarcodeFieldsBegin(this.swigCPtr, this), true);
    }

    public DocBarcodeFieldsIterator BarcodeFieldsEnd() {
        return new DocBarcodeFieldsIterator(jnidocengineJNI.Document_BarcodeFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetAttributesCount() {
        return jnidocengineJNI.Document_GetAttributesCount(this.swigCPtr, this);
    }

    public boolean HasAttribute(String str) {
        return jnidocengineJNI.Document_HasAttribute(this.swigCPtr, this, str);
    }

    public String GetAttribute(String str) {
        return jnidocengineJNI.Document_GetAttribute(this.swigCPtr, this, str);
    }

    public void SetAttribute(String str, String str2) {
        jnidocengineJNI.Document_SetAttribute(this.swigCPtr, this, str, str2);
    }

    public void RemoveAttribute(String str) {
        jnidocengineJNI.Document_RemoveAttribute(this.swigCPtr, this, str);
    }

    public StringsMapIterator AttributesBegin() {
        return new StringsMapIterator(jnidocengineJNI.Document_AttributesBegin(this.swigCPtr, this), true);
    }

    public StringsMapIterator AttributesEnd() {
        return new StringsMapIterator(jnidocengineJNI.Document_AttributesEnd(this.swigCPtr, this), true);
    }

    public String GetType() {
        return jnidocengineJNI.Document_GetType(this.swigCPtr, this);
    }

    public void Serialize(Serializer serializer) {
        jnidocengineJNI.Document_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }

    public int GetPhysicalDocIdx() {
        return jnidocengineJNI.Document_GetPhysicalDocIdx(this.swigCPtr, this);
    }

    public DocTextField GetMutableTextField(String str) {
        return new DocTextField(jnidocengineJNI.Document_GetMutableTextField(this.swigCPtr, this, str), false);
    }

    public void SetTextField(String str, DocTextField docTextField) {
        jnidocengineJNI.Document_SetTextField(this.swigCPtr, this, str, DocTextField.getCPtr(docTextField), docTextField);
    }

    public void RemoveTextField(String str) {
        jnidocengineJNI.Document_RemoveTextField(this.swigCPtr, this, str);
    }

    public DocImageField GetMutableImageField(String str) {
        return new DocImageField(jnidocengineJNI.Document_GetMutableImageField(this.swigCPtr, this, str), false);
    }

    public void SetImageField(String str, DocImageField docImageField) {
        jnidocengineJNI.Document_SetImageField(this.swigCPtr, this, str, DocImageField.getCPtr(docImageField), docImageField);
    }

    public void RemoveImageField(String str) {
        jnidocengineJNI.Document_RemoveImageField(this.swigCPtr, this, str);
    }

    public DocCheckboxField GetMutableCheckboxField(String str) {
        return new DocCheckboxField(jnidocengineJNI.Document_GetMutableCheckboxField(this.swigCPtr, this, str), false);
    }

    public void SetCheckboxField(String str, DocCheckboxField docCheckboxField) {
        jnidocengineJNI.Document_SetCheckboxField(this.swigCPtr, this, str, DocCheckboxField.getCPtr(docCheckboxField), docCheckboxField);
    }

    public void RemoveCheckboxField(String str) {
        jnidocengineJNI.Document_RemoveCheckboxField(this.swigCPtr, this, str);
    }

    public DocForensicField GetMutableForensicField(String str) {
        return new DocForensicField(jnidocengineJNI.Document_GetMutableForensicField(this.swigCPtr, this, str), false);
    }

    public void SetForensicField(String str, DocForensicField docForensicField) {
        jnidocengineJNI.Document_SetForensicField(this.swigCPtr, this, str, DocForensicField.getCPtr(docForensicField), docForensicField);
    }

    public void RemoveForensicField(String str) {
        jnidocengineJNI.Document_RemoveForensicField(this.swigCPtr, this, str);
    }

    public DocForensicCheckField GetMutableForensicCheckField(String str) {
        return new DocForensicCheckField(jnidocengineJNI.Document_GetMutableForensicCheckField(this.swigCPtr, this, str), false);
    }

    public DocForensicCheckField GetMutableForensicCheckFieldPtr(String str) {
        long jDocument_GetMutableForensicCheckFieldPtr = jnidocengineJNI.Document_GetMutableForensicCheckFieldPtr(this.swigCPtr, this, str);
        if (jDocument_GetMutableForensicCheckFieldPtr == 0) {
            return null;
        }
        return new DocForensicCheckField(jDocument_GetMutableForensicCheckFieldPtr, false);
    }

    public void SetForensicCheckField(String str, DocForensicCheckField docForensicCheckField) {
        jnidocengineJNI.Document_SetForensicCheckField(this.swigCPtr, this, str, DocForensicCheckField.getCPtr(docForensicCheckField), docForensicCheckField);
    }

    public void RemoveForensicCheckField(String str) {
        jnidocengineJNI.Document_RemoveForensicCheckField(this.swigCPtr, this, str);
    }

    public DocTableField GetMutableTableField(String str) {
        return new DocTableField(jnidocengineJNI.Document_GetMutableTableField(this.swigCPtr, this, str), false);
    }

    public void SetTableField(String str, DocTableField docTableField) {
        jnidocengineJNI.Document_SetTableField(this.swigCPtr, this, str, DocTableField.getCPtr(docTableField), docTableField);
    }

    public void RemoveTableField(String str) {
        jnidocengineJNI.Document_RemoveTableField(this.swigCPtr, this, str);
    }

    public DocBarcodeField GetMutableBarcodeField(String str) {
        return new DocBarcodeField(jnidocengineJNI.Document_GetMutableBarcodeField(this.swigCPtr, this, str), false);
    }

    public void SetBarcodeField(String str, DocBarcodeField docBarcodeField) {
        jnidocengineJNI.Document_SetBarcodeField(this.swigCPtr, this, str, DocBarcodeField.getCPtr(docBarcodeField), docBarcodeField);
    }

    public void RemoveBarcodeField(String str) {
        jnidocengineJNI.Document_RemoveBarcodeField(this.swigCPtr, this, str);
    }
}
