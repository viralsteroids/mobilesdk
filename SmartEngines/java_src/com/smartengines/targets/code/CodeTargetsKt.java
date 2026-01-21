package com.smartengines.targets.code;

import com.smartengines.code.CodeEngineSessionSettings;
import com.smartengines.common.StringsMapIterator;
import com.smartengines.engine.SessionSettingsLogger;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: CodeTargets.kt */
@Metadata(m513d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m514d2 = {"TAG", "", "dump", "", "Lcom/smartengines/engine/SessionSettingsLogger;", "sessionSettings", "Lcom/smartengines/code/CodeEngineSessionSettings;", "targets_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CodeTargetsKt {
    private static final String TAG = "myapp.CodeTarget";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dump(SessionSettingsLogger sessionSettingsLogger, CodeEngineSessionSettings codeEngineSessionSettings) {
        HashMap map = new HashMap();
        StringsMapIterator stringsMapIteratorSettingsBegin = codeEngineSessionSettings.SettingsBegin();
        StringsMapIterator stringsMapIteratorSettingsEnd = codeEngineSessionSettings.SettingsEnd();
        while (!stringsMapIteratorSettingsBegin.Equals(stringsMapIteratorSettingsEnd)) {
            map.put(stringsMapIteratorSettingsBegin.GetKey(), stringsMapIteratorSettingsBegin.GetValue());
            stringsMapIteratorSettingsBegin.Advance();
        }
        Unit unit = Unit.INSTANCE;
        sessionSettingsLogger.logData("session_settings", map);
    }
}
