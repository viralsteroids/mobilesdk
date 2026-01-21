package com.smartengines.targets.text;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextSessionOptions.kt */
@Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, m514d2 = {"Lcom/smartengines/targets/text/TextSessionOptions;", "", "languages", "", "", "iterators", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getLanguages", "()Ljava/util/List;", "getIterators", "toString", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextSessionOptions {
    private final List<String> iterators;
    private final List<String> languages;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextSessionOptions copy$default(TextSessionOptions textSessionOptions, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = textSessionOptions.languages;
        }
        if ((i & 2) != 0) {
            list2 = textSessionOptions.iterators;
        }
        return textSessionOptions.copy(list, list2);
    }

    public final List<String> component1() {
        return this.languages;
    }

    public final List<String> component2() {
        return this.iterators;
    }

    public final TextSessionOptions copy(List<String> languages, List<String> iterators) {
        Intrinsics.checkNotNullParameter(languages, "languages");
        Intrinsics.checkNotNullParameter(iterators, "iterators");
        return new TextSessionOptions(languages, iterators);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextSessionOptions)) {
            return false;
        }
        TextSessionOptions textSessionOptions = (TextSessionOptions) other;
        return Intrinsics.areEqual(this.languages, textSessionOptions.languages) && Intrinsics.areEqual(this.iterators, textSessionOptions.iterators);
    }

    public int hashCode() {
        return (this.languages.hashCode() * 31) + this.iterators.hashCode();
    }

    public TextSessionOptions(List<String> languages, List<String> iterators) {
        Intrinsics.checkNotNullParameter(languages, "languages");
        Intrinsics.checkNotNullParameter(iterators, "iterators");
        this.languages = languages;
        this.iterators = iterators;
    }

    public final List<String> getLanguages() {
        return this.languages;
    }

    public final List<String> getIterators() {
        return this.iterators;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("supported iterators:\n");
        Iterator it = CollectionsKt.sortedWith(this.iterators, new Comparator() { // from class: com.smartengines.targets.text.TextSessionOptions$toString$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((String) t, (String) t2);
            }
        }).iterator();
        while (it.hasNext()) {
            sb.append("   " + ((String) it.next()) + '\n');
        }
        sb.append("\nsupported languages:\n");
        Iterator it2 = CollectionsKt.sortedWith(this.languages, new Comparator() { // from class: com.smartengines.targets.text.TextSessionOptions$toString$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((String) t, (String) t2);
            }
        }).iterator();
        while (it2.hasNext()) {
            sb.append("   " + ((String) it2.next()) + '\n');
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
