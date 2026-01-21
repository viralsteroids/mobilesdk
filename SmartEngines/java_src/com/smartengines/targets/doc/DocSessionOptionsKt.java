package com.smartengines.targets.doc;

import android.util.Log;
import com.smartengines.common.StringsVectorIterator;
import com.smartengines.doc.DocDocumentInfo;
import com.smartengines.doc.DocSessionSettings;
import com.smartengines.targets.doc.DocSessionOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DocSessionOptions.kt */
@Metadata(m513d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u0004H\u0002\u001a\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0001H\u0002\u001a\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b*\u00020\u00042\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m514d2 = {"TAG", "", "parse", "Lcom/smartengines/targets/doc/DocSessionOptions;", "Lcom/smartengines/doc/DocSessionSettings;", "loadSupportedModes", "", "loadInternalEngines", "Lcom/smartengines/targets/doc/DocSessionOptions$InternalEngine;", "mode", "getDoctypes", "", "language", "targets_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DocSessionOptionsKt {
    private static final String TAG = "myapp.DocSessionOptions";

    public static final DocSessionOptions parse(DocSessionSettings docSessionSettings) {
        Intrinsics.checkNotNullParameter(docSessionSettings, "<this>");
        String strGetCurrentMode = docSessionSettings.GetCurrentMode();
        HashMap map = new HashMap();
        for (String str : loadSupportedModes(docSessionSettings)) {
            map.put(str, new DocSessionOptions.Mode(str, loadInternalEngines(docSessionSettings, str), getDoctypes(docSessionSettings, str, "ru"), getDoctypes(docSessionSettings, str, "en")));
        }
        docSessionSettings.SetCurrentMode(strGetCurrentMode);
        DocSessionOptions docSessionOptions = new DocSessionOptions(map);
        Log.d(TAG, String.valueOf(docSessionOptions.toString().length()));
        return docSessionOptions;
    }

    private static final List<String> loadSupportedModes(DocSessionSettings docSessionSettings) {
        ArrayList arrayList = new ArrayList();
        StringsVectorIterator stringsVectorIteratorSupportedModesBegin = docSessionSettings.SupportedModesBegin();
        StringsVectorIterator stringsVectorIteratorSupportedModesEnd = docSessionSettings.SupportedModesEnd();
        while (!stringsVectorIteratorSupportedModesBegin.Equals(stringsVectorIteratorSupportedModesEnd)) {
            arrayList.add(stringsVectorIteratorSupportedModesBegin.GetValue());
            stringsVectorIteratorSupportedModesBegin.Advance();
        }
        Log.w(TAG, "DOC SUPPORTED MODES: " + arrayList);
        return arrayList;
    }

    private static final List<DocSessionOptions.InternalEngine> loadInternalEngines(DocSessionSettings docSessionSettings, String str) {
        ArrayList arrayList = new ArrayList();
        docSessionSettings.SetCurrentMode(str);
        int iGetInternalEnginesCount = docSessionSettings.GetInternalEnginesCount();
        for (int i = 0; i < iGetInternalEnginesCount; i++) {
            ArrayList arrayList2 = new ArrayList();
            int iGetSupportedDocumentTypesCount = docSessionSettings.GetSupportedDocumentTypesCount(i);
            for (int i2 = 0; i2 < iGetSupportedDocumentTypesCount; i2++) {
                arrayList2.add(docSessionSettings.GetSupportedDocumentType(i, i2));
            }
            Unit unit = Unit.INSTANCE;
            arrayList.add(new DocSessionOptions.InternalEngine(i, arrayList2));
        }
        return arrayList;
    }

    private static final Set<String> getDoctypes(DocSessionSettings docSessionSettings, String str, String str2) {
        String strGetDocumentName;
        TreeSet treeSetSortedSetOf = SetsKt.sortedSetOf(new String[0]);
        docSessionSettings.SetCurrentMode(str);
        int iGetInternalEnginesCount = docSessionSettings.GetInternalEnginesCount();
        for (int i = 0; i < iGetInternalEnginesCount; i++) {
            int iGetSupportedDocumentTypesCount = docSessionSettings.GetSupportedDocumentTypesCount(i);
            for (int i2 = 0; i2 < iGetSupportedDocumentTypesCount; i2++) {
                DocDocumentInfo docDocumentInfoGetDocumentInfo = docSessionSettings.GetDocumentInfo(docSessionSettings.GetSupportedDocumentType(i, i2));
                if (StringsKt.equals(str2, "ru", true)) {
                    strGetDocumentName = docDocumentInfoGetDocumentInfo.GetDocumentShortNameLocal();
                    String str3 = strGetDocumentName;
                    if (str3 == null || str3.length() == 0) {
                        strGetDocumentName = docDocumentInfoGetDocumentInfo.GetDocumentNameLocal();
                    }
                } else {
                    strGetDocumentName = docDocumentInfoGetDocumentInfo.GetDocumentName();
                }
                String str4 = strGetDocumentName;
                if (str4 != null && str4.length() != 0) {
                    treeSetSortedSetOf.add(strGetDocumentName);
                }
            }
        }
        return treeSetSortedSetOf;
    }
}
