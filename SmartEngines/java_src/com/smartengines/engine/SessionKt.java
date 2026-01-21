package com.smartengines.engine;

import java.util.Comparator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Session.kt */
@Metadata(m513d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¨\u0006\u0004"}, m514d2 = {"logSessionSettings", "", "options", "", "engine_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class SessionKt {
    public static final String logSessionSettings(Map<String, String> options) {
        Intrinsics.checkNotNullParameter(options, "options");
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : CollectionsKt.sortedWith(options.entrySet(), new Comparator() { // from class: com.smartengines.engine.SessionKt$logSessionSettings$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((String) ((Map.Entry) t).getKey(), (String) ((Map.Entry) t2).getKey());
            }
        })) {
            sb.append("\n   - " + ((String) entry.getKey()) + " : " + ((String) entry.getValue()));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
