package com.smartengines.targets.doc;

import android.util.Log;
import com.smartengines.common.StringsMapIterator;
import com.smartengines.doc.DocSessionSettings;
import com.smartengines.engine.SessionSettingsLogger;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocTarget.kt */
@Metadata(m513d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a&\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\u001a\u001e\u0010\t\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\n\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\u001a\u001e\u0010\u000b\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\f\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\u001a\u0014\u0010\r\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m514d2 = {"TAG", "", "setOption", "", "Lcom/smartengines/doc/DocSessionSettings;", "key", "value", "logger", "Lcom/smartengines/engine/SessionSettingsLogger;", "setCurrentMode", "mode", "addEnabledDocumentTypes", "mask", "dump", "sessionSettings", "targets_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DocTargetKt {
    private static final String TAG = "myapp.DocTarget";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOption(DocSessionSettings docSessionSettings, String str, String str2, SessionSettingsLogger sessionSettingsLogger) {
        Log.w(TAG, "      - SetOption: " + str + " >>> " + str2);
        if (sessionSettingsLogger != null) {
            sessionSettingsLogger.logAction(new SessionSettingsLogger.Action("SetOption", CollectionsKt.listOf((Object[]) new String[]{str, str2})));
        }
        docSessionSettings.SetOption(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCurrentMode(DocSessionSettings docSessionSettings, String str, SessionSettingsLogger sessionSettingsLogger) {
        Log.w(TAG, "      - SetCurrentMode: " + str);
        if (sessionSettingsLogger != null) {
            sessionSettingsLogger.logAction(new SessionSettingsLogger.Action("SetCurrentMode", CollectionsKt.listOf(str)));
        }
        docSessionSettings.SetCurrentMode(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEnabledDocumentTypes(DocSessionSettings docSessionSettings, String str, SessionSettingsLogger sessionSettingsLogger) {
        Log.w(TAG, "      - AddEnabledDocumentTypes: " + str);
        if (sessionSettingsLogger != null) {
            sessionSettingsLogger.logAction(new SessionSettingsLogger.Action("AddEnabledDocumentTypes", CollectionsKt.listOf(str)));
        }
        docSessionSettings.AddEnabledDocumentTypes(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dump(SessionSettingsLogger sessionSettingsLogger, DocSessionSettings docSessionSettings) {
        Object objGetCurrentMode = docSessionSettings.GetCurrentMode();
        Intrinsics.checkNotNullExpressionValue(objGetCurrentMode, "GetCurrentMode(...)");
        sessionSettingsLogger.logData("mode", objGetCurrentMode);
        ArrayList arrayList = new ArrayList();
        int iGetEnabledDocumentTypesCount = docSessionSettings.GetEnabledDocumentTypesCount();
        for (int i = 0; i < iGetEnabledDocumentTypesCount; i++) {
            arrayList.add(docSessionSettings.GetEnabledDocumentType(i));
        }
        Unit unit = Unit.INSTANCE;
        sessionSettingsLogger.logData("mask", arrayList);
        HashMap map = new HashMap();
        StringsMapIterator stringsMapIteratorOptionsBegin = docSessionSettings.OptionsBegin();
        StringsMapIterator stringsMapIteratorOptionsEnd = docSessionSettings.OptionsEnd();
        while (!stringsMapIteratorOptionsBegin.Equals(stringsMapIteratorOptionsEnd)) {
            map.put(stringsMapIteratorOptionsBegin.GetKey(), stringsMapIteratorOptionsBegin.GetValue());
            stringsMapIteratorOptionsBegin.Advance();
        }
        Unit unit2 = Unit.INSTANCE;
        sessionSettingsLogger.logData("session_settings", map);
    }
}
