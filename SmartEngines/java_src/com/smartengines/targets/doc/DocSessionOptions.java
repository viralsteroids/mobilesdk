package com.smartengines.targets.doc;

import androidx.autofill.HintConstants;
import com.smartengines.targets.doc.DocSessionOptions;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocSessionOptions.kt */
@Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m514d2 = {"Lcom/smartengines/targets/doc/DocSessionOptions;", "", "modes", "", "", "Lcom/smartengines/targets/doc/DocSessionOptions$Mode;", "<init>", "(Ljava/util/Map;)V", "getModes", "()Ljava/util/Map;", "toString", "component1", "copy", "equals", "", "other", "hashCode", "", "Mode", "InternalEngine", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DocSessionOptions {
    private final Map<String, Mode> modes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocSessionOptions copy$default(DocSessionOptions docSessionOptions, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = docSessionOptions.modes;
        }
        return docSessionOptions.copy(map);
    }

    public final Map<String, Mode> component1() {
        return this.modes;
    }

    public final DocSessionOptions copy(Map<String, Mode> modes) {
        Intrinsics.checkNotNullParameter(modes, "modes");
        return new DocSessionOptions(modes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DocSessionOptions) && Intrinsics.areEqual(this.modes, ((DocSessionOptions) other).modes);
    }

    public int hashCode() {
        return this.modes.hashCode();
    }

    public DocSessionOptions(Map<String, Mode> modes) {
        Intrinsics.checkNotNullParameter(modes, "modes");
        this.modes = modes;
    }

    public final Map<String, Mode> getModes() {
        return this.modes;
    }

    /* compiled from: DocSessionOptions.kt */
    @Metadata(m513d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, m514d2 = {"Lcom/smartengines/targets/doc/DocSessionOptions$Mode;", "", HintConstants.AUTOFILL_HINT_NAME, "", "internalEngines", "", "Lcom/smartengines/targets/doc/DocSessionOptions$InternalEngine;", "doctypesRU", "", "doctypesEN", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V", "getName", "()Ljava/lang/String;", "getInternalEngines", "()Ljava/util/List;", "getDoctypesRU", "()Ljava/util/Set;", "getDoctypesEN", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Mode {
        private final Set<String> doctypesEN;
        private final Set<String> doctypesRU;
        private final List<InternalEngine> internalEngines;
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Mode copy$default(Mode mode, String str, List list, Set set, Set set2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mode.name;
            }
            if ((i & 2) != 0) {
                list = mode.internalEngines;
            }
            if ((i & 4) != 0) {
                set = mode.doctypesRU;
            }
            if ((i & 8) != 0) {
                set2 = mode.doctypesEN;
            }
            return mode.copy(str, list, set, set2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final List<InternalEngine> component2() {
            return this.internalEngines;
        }

        public final Set<String> component3() {
            return this.doctypesRU;
        }

        public final Set<String> component4() {
            return this.doctypesEN;
        }

        public final Mode copy(String name, List<InternalEngine> internalEngines, Set<String> doctypesRU, Set<String> doctypesEN) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(internalEngines, "internalEngines");
            Intrinsics.checkNotNullParameter(doctypesRU, "doctypesRU");
            Intrinsics.checkNotNullParameter(doctypesEN, "doctypesEN");
            return new Mode(name, internalEngines, doctypesRU, doctypesEN);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Mode)) {
                return false;
            }
            Mode mode = (Mode) other;
            return Intrinsics.areEqual(this.name, mode.name) && Intrinsics.areEqual(this.internalEngines, mode.internalEngines) && Intrinsics.areEqual(this.doctypesRU, mode.doctypesRU) && Intrinsics.areEqual(this.doctypesEN, mode.doctypesEN);
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.internalEngines.hashCode()) * 31) + this.doctypesRU.hashCode()) * 31) + this.doctypesEN.hashCode();
        }

        public String toString() {
            return "Mode(name=" + this.name + ", internalEngines=" + this.internalEngines + ", doctypesRU=" + this.doctypesRU + ", doctypesEN=" + this.doctypesEN + ')';
        }

        public Mode(String name, List<InternalEngine> internalEngines, Set<String> doctypesRU, Set<String> doctypesEN) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(internalEngines, "internalEngines");
            Intrinsics.checkNotNullParameter(doctypesRU, "doctypesRU");
            Intrinsics.checkNotNullParameter(doctypesEN, "doctypesEN");
            this.name = name;
            this.internalEngines = internalEngines;
            this.doctypesRU = doctypesRU;
            this.doctypesEN = doctypesEN;
        }

        public final String getName() {
            return this.name;
        }

        public final List<InternalEngine> getInternalEngines() {
            return this.internalEngines;
        }

        public final Set<String> getDoctypesRU() {
            return this.doctypesRU;
        }

        public final Set<String> getDoctypesEN() {
            return this.doctypesEN;
        }
    }

    /* compiled from: DocSessionOptions.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m514d2 = {"Lcom/smartengines/targets/doc/DocSessionOptions$InternalEngine;", "", "index", "", "supportedDocumentTypes", "", "", "<init>", "(ILjava/util/List;)V", "getIndex", "()I", "getSupportedDocumentTypes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class InternalEngine {
        private final int index;
        private final List<String> supportedDocumentTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InternalEngine copy$default(InternalEngine internalEngine, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = internalEngine.index;
            }
            if ((i2 & 2) != 0) {
                list = internalEngine.supportedDocumentTypes;
            }
            return internalEngine.copy(i, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final List<String> component2() {
            return this.supportedDocumentTypes;
        }

        public final InternalEngine copy(int index, List<String> supportedDocumentTypes) {
            Intrinsics.checkNotNullParameter(supportedDocumentTypes, "supportedDocumentTypes");
            return new InternalEngine(index, supportedDocumentTypes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InternalEngine)) {
                return false;
            }
            InternalEngine internalEngine = (InternalEngine) other;
            return this.index == internalEngine.index && Intrinsics.areEqual(this.supportedDocumentTypes, internalEngine.supportedDocumentTypes);
        }

        public int hashCode() {
            return (Integer.hashCode(this.index) * 31) + this.supportedDocumentTypes.hashCode();
        }

        public String toString() {
            return "InternalEngine(index=" + this.index + ", supportedDocumentTypes=" + this.supportedDocumentTypes + ')';
        }

        public InternalEngine(int i, List<String> supportedDocumentTypes) {
            Intrinsics.checkNotNullParameter(supportedDocumentTypes, "supportedDocumentTypes");
            this.index = i;
            this.supportedDocumentTypes = supportedDocumentTypes;
        }

        public final int getIndex() {
            return this.index;
        }

        public final List<String> getSupportedDocumentTypes() {
            return this.supportedDocumentTypes;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("mode / internal engine / supported document type\n------------------------------------------------\n");
        for (Mode mode : CollectionsKt.sortedWith(this.modes.values(), new Comparator() { // from class: com.smartengines.targets.doc.DocSessionOptions$toString$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((DocSessionOptions.Mode) t).getName(), ((DocSessionOptions.Mode) t2).getName());
            }
        })) {
            for (InternalEngine internalEngine : mode.getInternalEngines()) {
                Iterator it = CollectionsKt.sortedWith(internalEngine.getSupportedDocumentTypes(), new Comparator() { // from class: com.smartengines.targets.doc.DocSessionOptions$toString$lambda$4$lambda$3$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues((String) t, (String) t2);
                    }
                }).iterator();
                while (it.hasNext()) {
                    sb.append(mode.getName() + " / " + internalEngine.getIndex() + " / " + ((String) it.next()) + '\n');
                }
                sb.append("\n");
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
