package com.smartengines.targets.code;

import com.smartengines.code.CodeEngineSessionSettings;
import com.smartengines.common.StringsMapIterator;
import com.smartengines.targets.code.CodeSessionOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeSessionOptions.kt */
@Metadata(m513d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m514d2 = {"TAG", "", "parse", "Lcom/smartengines/targets/code/CodeSessionOptions;", "Lcom/smartengines/code/CodeEngineSessionSettings;", "targets_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CodeSessionOptionsKt {
    private static final String TAG = "myapp.CodeSessionOptions";

    public static final CodeSessionOptions parse(CodeEngineSessionSettings codeEngineSessionSettings) {
        Intrinsics.checkNotNullParameter(codeEngineSessionSettings, "<this>");
        ArrayList<CodeSessionOptions.Option> arrayList = new ArrayList();
        StringsMapIterator stringsMapIteratorSettingsBegin = codeEngineSessionSettings.SettingsBegin();
        StringsMapIterator stringsMapIteratorSettingsEnd = codeEngineSessionSettings.SettingsEnd();
        while (!stringsMapIteratorSettingsBegin.Equals(stringsMapIteratorSettingsEnd)) {
            String strGetKey = stringsMapIteratorSettingsBegin.GetKey();
            Intrinsics.checkNotNullExpressionValue(strGetKey, "GetKey(...)");
            String strGetValue = stringsMapIteratorSettingsBegin.GetValue();
            Intrinsics.checkNotNullExpressionValue(strGetValue, "GetValue(...)");
            arrayList.add(new CodeSessionOptions.Option(strGetKey, strGetValue));
            stringsMapIteratorSettingsBegin.Advance();
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        for (CodeSessionOptions.Option option : arrayList) {
            String str = option.getSubkeys().get(0);
            if (Intrinsics.areEqual(str, "global")) {
                arrayList2.add(option);
            } else {
                CodeSessionOptions.InternalEngine internalEngine = (CodeSessionOptions.InternalEngine) map.get(str);
                if (internalEngine == null) {
                    internalEngine = new CodeSessionOptions.InternalEngine(str, new ArrayList(), new ArrayList());
                    map.put(str, internalEngine);
                }
                if (option.getSubkeys().size() == 3 && Intrinsics.areEqual(option.getSubkeys().get(0), internalEngine.getName()) && Intrinsics.areEqual(option.getSubkeys().get(2), "enabled")) {
                    List<CodeSessionOptions.Option> subtypes = internalEngine.getSubtypes();
                    Intrinsics.checkNotNull(subtypes, "null cannot be cast to non-null type java.util.ArrayList<com.smartengines.targets.code.CodeSessionOptions.Option>");
                    ((ArrayList) subtypes).add(option);
                } else {
                    List<CodeSessionOptions.Option> options = internalEngine.getOptions();
                    Intrinsics.checkNotNull(options, "null cannot be cast to non-null type java.util.ArrayList<com.smartengines.targets.code.CodeSessionOptions.Option>");
                    ((ArrayList) options).add(option);
                }
            }
        }
        return new CodeSessionOptions(arrayList2, map);
    }
}
