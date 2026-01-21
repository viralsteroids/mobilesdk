package com.smartengines.app.p004ui.results;

import com.smartengines.engine.p005id.CheckField;
import com.smartengines.engine.p005id.CheckStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: ChecksFilter.kt */
@Metadata(m513d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, m514d2 = {"filterChecks", "", "Lcom/smartengines/engine/id/CheckField;", "showUndefChecks", "", "showChecksFilter", "", "hideChecksFilter", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ChecksFilterKt {
    public static final List<CheckField> filterChecks(List<CheckField> list, boolean z, String showChecksFilter, String hideChecksFilter) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(showChecksFilter, "showChecksFilter");
        Intrinsics.checkNotNullParameter(hideChecksFilter, "hideChecksFilter");
        if (!z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((CheckField) obj).getValue() != CheckStatus.UNDEFINED) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        if (showChecksFilter.length() > 0) {
            Regex regex = new Regex(showChecksFilter);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (regex.matches(((CheckField) obj2).getKey())) {
                    arrayList2.add(obj2);
                }
            }
            list = arrayList2;
        }
        if (hideChecksFilter.length() <= 0) {
            return list;
        }
        Regex regex2 = new Regex(hideChecksFilter);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (!regex2.matches(((CheckField) obj3).getKey())) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }
}
