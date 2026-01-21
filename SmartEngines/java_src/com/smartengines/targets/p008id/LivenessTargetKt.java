package com.smartengines.targets.p008id;

import android.util.Log;
import com.smartengines.common.StringsMapIterator;
import com.smartengines.engine.SessionSettingsLogger;
import com.smartengines.p006id.IdFaceSessionSettings;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: LivenessTarget.kt */
@Metadata(m513d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\u001a\u0014\u0010\t\u001a\u00020\u0003*\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m514d2 = {"TAG", "", "setOption", "", "Lcom/smartengines/id/IdFaceSessionSettings;", "key", "value", "logger", "Lcom/smartengines/engine/SessionSettingsLogger;", "dump", "sessionSettings", "targets_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class LivenessTargetKt {
    private static final String TAG = "myapp.LivenessTarget";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOption(IdFaceSessionSettings idFaceSessionSettings, String str, String str2, SessionSettingsLogger sessionSettingsLogger) {
        Log.w(TAG, "      - SetOption: " + str + " >>> " + str2);
        if (sessionSettingsLogger != null) {
            sessionSettingsLogger.logAction(new SessionSettingsLogger.Action("SetOption", CollectionsKt.listOf((Object[]) new String[]{str, str2})));
        }
        idFaceSessionSettings.SetOption(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dump(SessionSettingsLogger sessionSettingsLogger, IdFaceSessionSettings idFaceSessionSettings) {
        HashMap map = new HashMap();
        StringsMapIterator stringsMapIteratorOptionsBegin = idFaceSessionSettings.OptionsBegin();
        StringsMapIterator stringsMapIteratorOptionsEnd = idFaceSessionSettings.OptionsEnd();
        while (!stringsMapIteratorOptionsBegin.Equals(stringsMapIteratorOptionsEnd)) {
            map.put(stringsMapIteratorOptionsBegin.GetKey(), stringsMapIteratorOptionsBegin.GetValue());
            stringsMapIteratorOptionsBegin.Advance();
        }
        Unit unit = Unit.INSTANCE;
        sessionSettingsLogger.logData("session_settings", map);
    }
}
