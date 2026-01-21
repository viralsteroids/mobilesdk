package com.smartengines.engine.code;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.smartengines.code.CodeEngineResult;
import com.smartengines.code.CodeField;
import com.smartengines.code.CodeFieldsMapIterator;
import com.smartengines.code.CodeObject;
import com.smartengines.code.CodeObjectsMapIterator;
import com.smartengines.common.Quadrangle;
import com.smartengines.engine.EngineUtilsKt;
import com.smartengines.visualization.Quad;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeResultParser.kt */
@Metadata(m513d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0004H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0007*\u00020\bH\u0002\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u0004H\u0002¨\u0006\u000b"}, m514d2 = {"parse", "Lcom/smartengines/engine/code/CodeResultData;", "Lcom/smartengines/code/CodeEngineResult;", "Lcom/smartengines/engine/code/CodeObjectData;", "Lcom/smartengines/code/CodeObject;", "parseFields", "", "Lcom/smartengines/engine/code/CodeObjectField;", "Lcom/smartengines/code/CodeField;", "parseImage", "Landroid/graphics/Bitmap;", "engine_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CodeResultParserKt {
    public static final CodeResultData parse(CodeEngineResult codeEngineResult) {
        Intrinsics.checkNotNullParameter(codeEngineResult, "<this>");
        ArrayList arrayList = new ArrayList();
        CodeObjectsMapIterator codeObjectsMapIteratorObjectsBegin = codeEngineResult.ObjectsBegin();
        CodeObjectsMapIterator codeObjectsMapIteratorObjectsEnd = codeEngineResult.ObjectsEnd();
        while (!codeObjectsMapIteratorObjectsBegin.Equals(codeObjectsMapIteratorObjectsEnd)) {
            CodeObject codeObjectGetValue = codeObjectsMapIteratorObjectsBegin.GetValue();
            Intrinsics.checkNotNullExpressionValue(codeObjectGetValue, "GetValue(...)");
            arrayList.add(parse(codeObjectGetValue));
            codeObjectsMapIteratorObjectsBegin.Advance();
        }
        return new CodeResultData(arrayList);
    }

    private static final CodeObjectData parse(CodeObject codeObject) {
        Quad quad;
        String strGetTypeStr = codeObject.GetTypeStr();
        Intrinsics.checkNotNullExpressionValue(strGetTypeStr, "GetTypeStr(...)");
        List<CodeObjectField> fields = parseFields(codeObject);
        Bitmap image = parseImage(codeObject);
        if (codeObject.HasQuadrangle()) {
            Quadrangle quadrangleGetQuadrangle = codeObject.GetQuadrangle();
            Intrinsics.checkNotNullExpressionValue(quadrangleGetQuadrangle, "GetQuadrangle(...)");
            quad = EngineUtilsKt.toQuad(quadrangleGetQuadrangle);
        } else {
            quad = null;
        }
        return new CodeObjectData(strGetTypeStr, fields, image, quad);
    }

    private static final List<CodeObjectField> parseFields(CodeObject codeObject) {
        ArrayList arrayList = new ArrayList();
        CodeFieldsMapIterator codeFieldsMapIteratorFieldsBegin = codeObject.FieldsBegin();
        CodeFieldsMapIterator codeFieldsMapIteratorFieldsEnd = codeObject.FieldsEnd();
        while (!codeFieldsMapIteratorFieldsBegin.Equals(codeFieldsMapIteratorFieldsEnd)) {
            CodeField codeFieldGetValue = codeFieldsMapIteratorFieldsBegin.GetValue();
            Intrinsics.checkNotNullExpressionValue(codeFieldGetValue, "GetValue(...)");
            arrayList.add(parse(codeFieldGetValue));
            codeFieldsMapIteratorFieldsBegin.Advance();
        }
        return arrayList;
    }

    private static final CodeObjectField parse(CodeField codeField) {
        String strGetCStr;
        String strName = codeField.Name();
        Intrinsics.checkNotNullExpressionValue(strName, "Name(...)");
        if (codeField.HasOcrStringRepresentation()) {
            strGetCStr = codeField.GetOcrString().GetFirstString().GetCStr();
        } else {
            strGetCStr = codeField.GetBinaryRepresentation().GetBase64String().GetCStr();
        }
        Intrinsics.checkNotNull(strGetCStr);
        return new CodeObjectField(strName, strGetCStr, codeField.IsAccepted());
    }

    private static final Bitmap parseImage(CodeObject codeObject) {
        if (!codeObject.HasImage()) {
            return null;
        }
        byte[] bArrDecode = Base64.decode(codeObject.GetImage().GetBase64String().GetCStr(), 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }
}
