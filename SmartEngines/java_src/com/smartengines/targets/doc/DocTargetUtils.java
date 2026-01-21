package com.smartengines.targets.doc;

import com.smartengines.targets.doc.DocSessionOptions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DocTargetUtils.kt */
@Metadata(m513d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0004\u001a>\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\bj\b\u0012\u0004\u0012\u00020\u0006`\u00070\tj\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\bj\b\u0012\u0004\u0012\u00020\u0006`\u0007`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ3\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\bj\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m514d2 = {"Lcom/smartengines/targets/doc/DocTargetUtils;", "", "<init>", "()V", "fillCountryList", "Lkotlin/collections/HashMap;", "", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "Ljava/util/HashMap;", "mode", "Lcom/smartengines/targets/doc/DocSessionOptions$Mode;", "countryIndex", "", "(Lcom/smartengines/targets/doc/DocSessionOptions$Mode;I)Ljava/util/HashMap;", "fillCountryDocTypes", "country", "(Lcom/smartengines/targets/doc/DocSessionOptions$Mode;Ljava/lang/String;I)Ljava/util/HashSet;", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DocTargetUtils {
    public static final DocTargetUtils INSTANCE = new DocTargetUtils();

    private DocTargetUtils() {
    }

    public final HashMap<String, HashSet<String>> fillCountryList(DocSessionOptions.Mode mode, int countryIndex) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        HashMap<String, HashSet<String>> map = new HashMap<>();
        Iterator<T> it = mode.getInternalEngines().iterator();
        while (it.hasNext()) {
            for (String str : ((DocSessionOptions.InternalEngine) it.next()).getSupportedDocumentTypes()) {
                List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
                if (listSplit$default.size() >= 2) {
                    String str2 = (String) listSplit$default.get(countryIndex);
                    HashSet<String> hashSet = map.get(str2);
                    if (hashSet == null) {
                        hashSet = new HashSet<>();
                        map.put(str2, hashSet);
                    }
                    hashSet.add(str);
                }
            }
        }
        return map;
    }

    public final HashSet<String> fillCountryDocTypes(DocSessionOptions.Mode mode, String country, int countryIndex) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(country, "country");
        HashSet<String> hashSet = new HashSet<>();
        Iterator<T> it = mode.getInternalEngines().iterator();
        while (it.hasNext()) {
            for (String str : ((DocSessionOptions.InternalEngine) it.next()).getSupportedDocumentTypes()) {
                List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
                if (listSplit$default.size() >= 2 && Intrinsics.areEqual((String) listSplit$default.get(countryIndex), country)) {
                    hashSet.add(str);
                }
            }
        }
        return hashSet;
    }
}
