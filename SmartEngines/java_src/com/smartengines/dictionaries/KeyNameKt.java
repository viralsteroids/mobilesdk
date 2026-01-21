package com.smartengines.dictionaries;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyName.kt */
@Metadata(m513d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m514d2 = {"filterByLanguage", "", "Lcom/smartengines/dictionaries/KeyName;", "Lcom/smartengines/dictionaries/KeyNames;", "language", "", "dictionaries_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class KeyNameKt {
    public static final List<KeyName> filterByLanguage(List<KeyNames> list, String language) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(language, "language");
        List<KeyNames> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (KeyNames keyNames : list2) {
            String key = keyNames.getKey();
            String str = keyNames.getNames().get(language);
            if (str == null && (str = (String) CollectionsKt.firstOrNull(keyNames.getNames().values())) == null) {
                str = "[empty names for key: " + keyNames.getKey() + ']';
            }
            arrayList.add(new KeyName(key, str));
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.smartengines.dictionaries.KeyNameKt$filterByLanguage$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((KeyName) t).getName(), ((KeyName) t2).getName());
            }
        });
    }
}
