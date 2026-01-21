package com.smartengines.targets;

import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TargetUtils.kt */
@Metadata(m513d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0000\u001ai\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\b2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\b¢\u0006\u0002\u0010\u000b\u001a*\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m514d2 = {"TAG", "", "reduceByDictionary", "", "source", "", "dictionary", "notFound", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "usedDic", "(Ljava/lang/Iterable;Ljava/util/Set;Ljava/util/HashSet;Ljava/util/HashSet;)Ljava/util/Set;", "searchLongestPrefix", "path", "delimiter", "", "targets_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TargetUtilsKt {
    private static final String TAG = "myapp.TargetUtils";

    public static /* synthetic */ Set reduceByDictionary$default(Iterable iterable, Set set, HashSet hashSet, HashSet hashSet2, int i, Object obj) {
        if ((i & 4) != 0) {
            hashSet = null;
        }
        if ((i & 8) != 0) {
            hashSet2 = null;
        }
        return reduceByDictionary(iterable, set, hashSet, hashSet2);
    }

    public static final Set<String> reduceByDictionary(Iterable<String> source, Set<String> dictionary, HashSet<String> hashSet, HashSet<String> hashSet2) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dictionary, "dictionary");
        HashSet hashSet3 = new HashSet();
        for (String str : source) {
            String strSearchLongestPrefix$default = searchLongestPrefix$default(str, dictionary, (char) 0, 4, null);
            if (strSearchLongestPrefix$default != null) {
                if (Intrinsics.areEqual(strSearchLongestPrefix$default, str)) {
                    if (!hashSet3.contains(str + ".*")) {
                        hashSet3.add(str);
                    }
                } else {
                    hashSet3.add(strSearchLongestPrefix$default + ".*");
                    hashSet3.remove(strSearchLongestPrefix$default);
                }
                if (hashSet2 != null) {
                    hashSet2.add(strSearchLongestPrefix$default);
                }
            } else {
                hashSet3.add(str);
                if (hashSet != null) {
                    hashSet.add(str);
                }
            }
        }
        return hashSet3;
    }

    public static /* synthetic */ String searchLongestPrefix$default(String str, Set set, char c, int i, Object obj) {
        if ((i & 4) != 0) {
            c = '.';
        }
        return searchLongestPrefix(str, set, c);
    }

    public static final String searchLongestPrefix(String path, Set<String> dictionary, char c) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(dictionary, "dictionary");
        while (path.length() > 0) {
            if (dictionary.contains(path)) {
                return path;
            }
            path = StringsKt.substringBeforeLast(path, c, "");
        }
        return null;
    }
}
