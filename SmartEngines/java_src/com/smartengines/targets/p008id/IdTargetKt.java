package com.smartengines.targets.p008id;

import android.util.Log;
import com.smartengines.common.StringsMapIterator;
import com.smartengines.common.StringsSetIterator;
import com.smartengines.engine.SessionSettingsLogger;
import com.smartengines.p006id.IdSessionSettings;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdTarget.kt */
@Metadata(m513d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a&\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\u001a\u001e\u0010\t\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\n\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\u001a\u001e\u0010\u000b\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\f\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\u001a\u001e\u0010\r\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\f\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\u001a\u0016\u0010\u000e\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m514d2 = {"TAG", "", "setOption", "", "Lcom/smartengines/id/IdSessionSettings;", "key", "value", "logger", "Lcom/smartengines/engine/SessionSettingsLogger;", "setCurrentMode", "mode", "addEnabledDocumentTypes", "mask", "removeEnabledDocumentTypes", "enableForensics", "dump", "sessionSettings", "targets_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdTargetKt {
    private static final String TAG = "myapp.IdTarget";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOption(IdSessionSettings idSessionSettings, String str, String str2, SessionSettingsLogger sessionSettingsLogger) {
        Log.w(TAG, "      - SetOption: " + str + " >>> " + str2);
        if (sessionSettingsLogger != null) {
            sessionSettingsLogger.logAction(new SessionSettingsLogger.Action("SetOption", CollectionsKt.listOf((Object[]) new String[]{str, str2})));
        }
        idSessionSettings.SetOption(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCurrentMode(IdSessionSettings idSessionSettings, String str, SessionSettingsLogger sessionSettingsLogger) {
        Log.w(TAG, "      - SetCurrentMode: " + str);
        if (sessionSettingsLogger != null) {
            sessionSettingsLogger.logAction(new SessionSettingsLogger.Action("SetCurrentMode", CollectionsKt.listOf(str)));
        }
        idSessionSettings.SetCurrentMode(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEnabledDocumentTypes(IdSessionSettings idSessionSettings, String str, SessionSettingsLogger sessionSettingsLogger) {
        Log.w(TAG, "      - AddEnabledDocumentTypes: " + str);
        if (sessionSettingsLogger != null) {
            sessionSettingsLogger.logAction(new SessionSettingsLogger.Action("AddEnabledDocumentTypes", CollectionsKt.listOf(str)));
        }
        idSessionSettings.AddEnabledDocumentTypes(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeEnabledDocumentTypes(IdSessionSettings idSessionSettings, String str, SessionSettingsLogger sessionSettingsLogger) {
        Log.w(TAG, "      - RemoveEnabledDocumentTypes: " + str);
        if (sessionSettingsLogger != null) {
            sessionSettingsLogger.logAction(new SessionSettingsLogger.Action("RemoveEnabledDocumentTypes", CollectionsKt.listOf(str)));
        }
        idSessionSettings.RemoveEnabledDocumentTypes(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableForensics(IdSessionSettings idSessionSettings, SessionSettingsLogger sessionSettingsLogger) {
        Log.w(TAG, "      - EnableForensics");
        if (sessionSettingsLogger != null) {
            sessionSettingsLogger.logAction(new SessionSettingsLogger.Action("EnableForensics", CollectionsKt.emptyList()));
        }
        idSessionSettings.EnableForensics();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dump(SessionSettingsLogger sessionSettingsLogger, IdSessionSettings idSessionSettings) {
        Object objGetCurrentMode = idSessionSettings.GetCurrentMode();
        Intrinsics.checkNotNullExpressionValue(objGetCurrentMode, "GetCurrentMode(...)");
        sessionSettingsLogger.logData("mode", objGetCurrentMode);
        ArrayList arrayList = new ArrayList();
        StringsSetIterator stringsSetIteratorEnabledDocumentTypesBegin = idSessionSettings.EnabledDocumentTypesBegin();
        StringsSetIterator stringsSetIteratorEnabledDocumentTypesEnd = idSessionSettings.EnabledDocumentTypesEnd();
        while (!stringsSetIteratorEnabledDocumentTypesBegin.Equals(stringsSetIteratorEnabledDocumentTypesEnd)) {
            arrayList.add(stringsSetIteratorEnabledDocumentTypesBegin.GetValue());
            stringsSetIteratorEnabledDocumentTypesBegin.Advance();
        }
        Unit unit = Unit.INSTANCE;
        sessionSettingsLogger.logData("mask", arrayList);
        HashMap map = new HashMap();
        StringsMapIterator stringsMapIteratorOptionsBegin = idSessionSettings.OptionsBegin();
        StringsMapIterator stringsMapIteratorOptionsEnd = idSessionSettings.OptionsEnd();
        while (!stringsMapIteratorOptionsBegin.Equals(stringsMapIteratorOptionsEnd)) {
            map.put(stringsMapIteratorOptionsBegin.GetKey(), stringsMapIteratorOptionsBegin.GetValue());
            stringsMapIteratorOptionsBegin.Advance();
        }
        Unit unit2 = Unit.INSTANCE;
        sessionSettingsLogger.logData("session_settings", map);
    }
}
