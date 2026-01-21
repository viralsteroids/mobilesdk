package com.smartengines.targets.p008id;

import android.util.Log;
import com.smartengines.common.StringsSetIterator;
import com.smartengines.p006id.IdSessionSettings;
import com.smartengines.targets.p008id.IdSessionOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: IdSessionOptions.kt */
@Metadata(m513d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u0004\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0001\u001a\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m514d2 = {"TAG", "", "parse", "Lcom/smartengines/targets/id/IdSessionOptions;", "Lcom/smartengines/id/IdSessionSettings;", "loadSupportedModes", "", "loadInternalEngines", "mode", "loadSupportedDocumentTypes", "internalEngine", "targets_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdSessionOptionsKt {
    private static final String TAG = "engine.IdSessionOptions";

    public static final IdSessionOptions parse(IdSessionSettings idSessionSettings) {
        Intrinsics.checkNotNullParameter(idSessionSettings, "<this>");
        String strGetCurrentMode = idSessionSettings.GetCurrentMode();
        HashMap map = new HashMap();
        for (String str : loadSupportedModes(idSessionSettings)) {
            HashMap map2 = new HashMap();
            for (String str2 : loadInternalEngines(idSessionSettings, str)) {
                map2.put(str2, new IdSessionOptions.InternalEngine(str2, loadSupportedDocumentTypes(idSessionSettings, str2)));
            }
            Unit unit = Unit.INSTANCE;
            map.put(str, new IdSessionOptions.Mode(str, map2));
        }
        idSessionSettings.SetCurrentMode(strGetCurrentMode);
        return new IdSessionOptions(map);
    }

    public static final List<String> loadSupportedModes(IdSessionSettings idSessionSettings) {
        Intrinsics.checkNotNullParameter(idSessionSettings, "<this>");
        ArrayList arrayList = new ArrayList();
        StringsSetIterator stringsSetIteratorSupportedModesBegin = idSessionSettings.SupportedModesBegin();
        StringsSetIterator stringsSetIteratorSupportedModesEnd = idSessionSettings.SupportedModesEnd();
        while (!stringsSetIteratorSupportedModesBegin.Equals(stringsSetIteratorSupportedModesEnd)) {
            String strGetValue = stringsSetIteratorSupportedModesBegin.GetValue();
            Intrinsics.checkNotNull(strGetValue);
            if (!StringsKt.contains$default((CharSequence) strGetValue, (CharSequence) "singleshot", false, 2, (Object) null)) {
                arrayList.add(strGetValue);
            }
            stringsSetIteratorSupportedModesBegin.Advance();
        }
        Log.w(TAG, "ID SUPPORTED MODES: " + arrayList);
        return arrayList;
    }

    public static final List<String> loadInternalEngines(IdSessionSettings idSessionSettings, String mode) {
        Intrinsics.checkNotNullParameter(idSessionSettings, "<this>");
        Intrinsics.checkNotNullParameter(mode, "mode");
        idSessionSettings.SetCurrentMode(mode);
        ArrayList arrayList = new ArrayList();
        StringsSetIterator stringsSetIteratorInternalEngineNamesBegin = idSessionSettings.InternalEngineNamesBegin();
        StringsSetIterator stringsSetIteratorInternalEngineNamesEnd = idSessionSettings.InternalEngineNamesEnd();
        while (!stringsSetIteratorInternalEngineNamesBegin.Equals(stringsSetIteratorInternalEngineNamesEnd)) {
            arrayList.add(stringsSetIteratorInternalEngineNamesBegin.GetValue());
            stringsSetIteratorInternalEngineNamesBegin.Advance();
        }
        return arrayList;
    }

    public static final List<String> loadSupportedDocumentTypes(IdSessionSettings idSessionSettings, String internalEngine) {
        Intrinsics.checkNotNullParameter(idSessionSettings, "<this>");
        Intrinsics.checkNotNullParameter(internalEngine, "internalEngine");
        ArrayList arrayList = new ArrayList();
        StringsSetIterator stringsSetIteratorSupportedDocumentTypesBegin = idSessionSettings.SupportedDocumentTypesBegin(internalEngine);
        StringsSetIterator stringsSetIteratorSupportedDocumentTypesEnd = idSessionSettings.SupportedDocumentTypesEnd(internalEngine);
        while (!stringsSetIteratorSupportedDocumentTypesBegin.Equals(stringsSetIteratorSupportedDocumentTypesEnd)) {
            arrayList.add(stringsSetIteratorSupportedDocumentTypesBegin.GetValue());
            stringsSetIteratorSupportedDocumentTypesBegin.Advance();
        }
        return arrayList;
    }
}
