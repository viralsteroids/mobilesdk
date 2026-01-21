package com.smartengines.targets;

import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentTypesStatistics.kt */
@Metadata(m513d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m514d2 = {"Lcom/smartengines/targets/DocumentTypesStatistics;", "", "dictionary", "", "", "<init>", "(Ljava/util/Set;)V", "getDictionary", "()Ljava/util/Set;", "setDictionary", "all", "Ljava/util/HashSet;", "getAll", "()Ljava/util/HashSet;", "calculate", "Lcom/smartengines/targets/DocumentTypesStatistics$Calculated;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Calculated", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DocumentTypesStatistics {
    private final HashSet<String> all;
    private Set<String> dictionary;

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentTypesStatistics() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentTypesStatistics copy$default(DocumentTypesStatistics documentTypesStatistics, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = documentTypesStatistics.dictionary;
        }
        return documentTypesStatistics.copy(set);
    }

    public final Set<String> component1() {
        return this.dictionary;
    }

    public final DocumentTypesStatistics copy(Set<String> dictionary) {
        Intrinsics.checkNotNullParameter(dictionary, "dictionary");
        return new DocumentTypesStatistics(dictionary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DocumentTypesStatistics) && Intrinsics.areEqual(this.dictionary, ((DocumentTypesStatistics) other).dictionary);
    }

    public int hashCode() {
        return this.dictionary.hashCode();
    }

    public String toString() {
        return "DocumentTypesStatistics(dictionary=" + this.dictionary + ')';
    }

    public DocumentTypesStatistics(Set<String> dictionary) {
        Intrinsics.checkNotNullParameter(dictionary, "dictionary");
        this.dictionary = dictionary;
        this.all = new HashSet<>();
    }

    public /* synthetic */ DocumentTypesStatistics(Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SetsKt.emptySet() : set);
    }

    public final Set<String> getDictionary() {
        return this.dictionary;
    }

    public final void setDictionary(Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.dictionary = set;
    }

    public final HashSet<String> getAll() {
        return this.all;
    }

    /* compiled from: DocumentTypesStatistics.kt */
    @Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003JY\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001d"}, m514d2 = {"Lcom/smartengines/targets/DocumentTypesStatistics$Calculated;", "", "all", "", "", "dictionary", "reduced", "notFound", "unused", "<init>", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V", "getAll", "()Ljava/util/Set;", "getDictionary", "getReduced", "getNotFound", "getUnused", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Calculated {
        private final Set<String> all;
        private final Set<String> dictionary;
        private final Set<String> notFound;
        private final Set<String> reduced;
        private final Set<String> unused;

        public static /* synthetic */ Calculated copy$default(Calculated calculated, Set set, Set set2, Set set3, Set set4, Set set5, int i, Object obj) {
            if ((i & 1) != 0) {
                set = calculated.all;
            }
            if ((i & 2) != 0) {
                set2 = calculated.dictionary;
            }
            if ((i & 4) != 0) {
                set3 = calculated.reduced;
            }
            if ((i & 8) != 0) {
                set4 = calculated.notFound;
            }
            if ((i & 16) != 0) {
                set5 = calculated.unused;
            }
            Set set6 = set5;
            Set set7 = set3;
            return calculated.copy(set, set2, set7, set4, set6);
        }

        public final Set<String> component1() {
            return this.all;
        }

        public final Set<String> component2() {
            return this.dictionary;
        }

        public final Set<String> component3() {
            return this.reduced;
        }

        public final Set<String> component4() {
            return this.notFound;
        }

        public final Set<String> component5() {
            return this.unused;
        }

        public final Calculated copy(Set<String> all, Set<String> dictionary, Set<String> reduced, Set<String> notFound, Set<String> unused) {
            Intrinsics.checkNotNullParameter(all, "all");
            Intrinsics.checkNotNullParameter(dictionary, "dictionary");
            Intrinsics.checkNotNullParameter(reduced, "reduced");
            Intrinsics.checkNotNullParameter(notFound, "notFound");
            Intrinsics.checkNotNullParameter(unused, "unused");
            return new Calculated(all, dictionary, reduced, notFound, unused);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Calculated)) {
                return false;
            }
            Calculated calculated = (Calculated) other;
            return Intrinsics.areEqual(this.all, calculated.all) && Intrinsics.areEqual(this.dictionary, calculated.dictionary) && Intrinsics.areEqual(this.reduced, calculated.reduced) && Intrinsics.areEqual(this.notFound, calculated.notFound) && Intrinsics.areEqual(this.unused, calculated.unused);
        }

        public int hashCode() {
            return (((((((this.all.hashCode() * 31) + this.dictionary.hashCode()) * 31) + this.reduced.hashCode()) * 31) + this.notFound.hashCode()) * 31) + this.unused.hashCode();
        }

        public String toString() {
            return "Calculated(all=" + this.all + ", dictionary=" + this.dictionary + ", reduced=" + this.reduced + ", notFound=" + this.notFound + ", unused=" + this.unused + ')';
        }

        public Calculated(Set<String> all, Set<String> dictionary, Set<String> reduced, Set<String> notFound, Set<String> unused) {
            Intrinsics.checkNotNullParameter(all, "all");
            Intrinsics.checkNotNullParameter(dictionary, "dictionary");
            Intrinsics.checkNotNullParameter(reduced, "reduced");
            Intrinsics.checkNotNullParameter(notFound, "notFound");
            Intrinsics.checkNotNullParameter(unused, "unused");
            this.all = all;
            this.dictionary = dictionary;
            this.reduced = reduced;
            this.notFound = notFound;
            this.unused = unused;
        }

        public final Set<String> getAll() {
            return this.all;
        }

        public final Set<String> getDictionary() {
            return this.dictionary;
        }

        public final Set<String> getReduced() {
            return this.reduced;
        }

        public final Set<String> getNotFound() {
            return this.notFound;
        }

        public final Set<String> getUnused() {
            return this.unused;
        }
    }

    public final Calculated calculate() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Set<String> setReduceByDictionary = TargetUtilsKt.reduceByDictionary(this.all, this.dictionary, hashSet, hashSet2);
        HashSet<String> hashSet3 = this.all;
        Set<String> set = this.dictionary;
        return new Calculated(hashSet3, set, setReduceByDictionary, hashSet, SetsKt.minus((Set) set, (Iterable) hashSet2));
    }
}
