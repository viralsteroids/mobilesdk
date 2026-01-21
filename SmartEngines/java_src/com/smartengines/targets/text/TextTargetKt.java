package com.smartengines.targets.text;

import android.util.Log;
import com.smartengines.common.StringsMapIterator;
import com.smartengines.common.StringsSetIterator;
import com.smartengines.engine.SessionSettingsLogger;
import com.smartengines.text.TextSessionSettings;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: TextTarget.kt */
@Metadata(m513d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a&\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\u001a\u001e\u0010\t\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\n\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\u001a\u0014\u0010\u000b\u001a\u00020\u0003*\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m514d2 = {"TAG", "", "setOption", "", "Lcom/smartengines/text/TextSessionSettings;", "key", "value", "logger", "Lcom/smartengines/engine/SessionSettingsLogger;", "addEnabledLanguages", "lang", "dump", "sessionSettings", "targets_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TextTargetKt {
    private static final String TAG = "myapp.TextTarget";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOption(TextSessionSettings textSessionSettings, String str, String str2, SessionSettingsLogger sessionSettingsLogger) {
        Log.w(TAG, "      - SetOption: " + str + " >>> " + str2);
        if (sessionSettingsLogger != null) {
            sessionSettingsLogger.logAction(new SessionSettingsLogger.Action("SetOption", CollectionsKt.listOf((Object[]) new String[]{str, str2})));
        }
        textSessionSettings.SetOption(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEnabledLanguages(TextSessionSettings textSessionSettings, String str, SessionSettingsLogger sessionSettingsLogger) {
        Log.w(TAG, "      - AddEnabledLanguages: " + str);
        if (sessionSettingsLogger != null) {
            sessionSettingsLogger.logAction(new SessionSettingsLogger.Action("AddEnabledLanguages", CollectionsKt.listOf(str)));
        }
        textSessionSettings.AddEnabledLanguages(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dump(SessionSettingsLogger sessionSettingsLogger, TextSessionSettings textSessionSettings) {
        HashMap map = new HashMap();
        StringsMapIterator stringsMapIteratorOptionsBegin = textSessionSettings.OptionsBegin();
        StringsMapIterator stringsMapIteratorOptionsEnd = textSessionSettings.OptionsEnd();
        while (!stringsMapIteratorOptionsBegin.Equals(stringsMapIteratorOptionsEnd)) {
            map.put(stringsMapIteratorOptionsBegin.GetKey(), stringsMapIteratorOptionsBegin.GetValue());
            stringsMapIteratorOptionsBegin.Advance();
        }
        Unit unit = Unit.INSTANCE;
        sessionSettingsLogger.logData("session_settings", map);
        ArrayList arrayList = new ArrayList();
        StringsSetIterator stringsSetIteratorEnabledLanguagesBegin = textSessionSettings.EnabledLanguagesBegin();
        StringsSetIterator stringsSetIteratorEnabledLanguagesEnd = textSessionSettings.EnabledLanguagesEnd();
        while (!stringsSetIteratorEnabledLanguagesBegin.Equals(stringsSetIteratorEnabledLanguagesEnd)) {
            arrayList.add(stringsSetIteratorEnabledLanguagesBegin.GetValue());
            stringsSetIteratorEnabledLanguagesBegin.Advance();
        }
        Unit unit2 = Unit.INSTANCE;
        sessionSettingsLogger.logData("languages", arrayList);
    }
}
