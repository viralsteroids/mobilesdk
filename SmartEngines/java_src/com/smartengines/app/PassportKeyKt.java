package com.smartengines.app;

import com.smartengines.engine.code.CodeObjectData;
import com.smartengines.engine.code.CodeObjectField;
import com.smartengines.engine.code.CodeResultData;
import com.smartengines.engine.p005id.IdResultData;
import com.smartengines.engine.p005id.TextField;
import com.smartengines.nfc.PassportKey;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PassportKey.kt */
@Metadata(m513d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0003¨\u0006\u0004"}, m514d2 = {"calculatePassportKey", "Lcom/smartengines/nfc/PassportKey;", "Lcom/smartengines/engine/code/CodeResultData;", "Lcom/smartengines/engine/id/IdResultData;", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class PassportKeyKt {
    public static final PassportKey calculatePassportKey(CodeResultData codeResultData) {
        Object next;
        Intrinsics.checkNotNullParameter(codeResultData, "<this>");
        try {
            Iterator<T> it = codeResultData.getObjects().iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((CodeObjectData) it.next()).getFields().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (Intrinsics.areEqual(((CodeObjectField) next).getName(), "full_mrz")) {
                        break;
                    }
                }
                CodeObjectField codeObjectField = (CodeObjectField) next;
                if (codeObjectField != null) {
                    return PassportKey.INSTANCE.fromMRZ(codeObjectField.getValue());
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final PassportKey calculatePassportKey(IdResultData idResultData) {
        Object next;
        Intrinsics.checkNotNullParameter(idResultData, "<this>");
        try {
            Iterator<T> it = idResultData.getTextFields().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((TextField) next).getKey(), "full_mrz")) {
                    break;
                }
            }
            TextField textField = (TextField) next;
            if (textField != null) {
                return PassportKey.INSTANCE.fromMRZ(textField.getValue());
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
