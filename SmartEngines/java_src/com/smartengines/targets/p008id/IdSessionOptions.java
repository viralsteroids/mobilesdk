package com.smartengines.targets.p008id;

import androidx.autofill.HintConstants;
import com.smartengines.targets.p008id.IdSessionOptions;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdSessionOptions.kt */
@Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m514d2 = {"Lcom/smartengines/targets/id/IdSessionOptions;", "", "modes", "", "", "Lcom/smartengines/targets/id/IdSessionOptions$Mode;", "<init>", "(Ljava/util/Map;)V", "getModes", "()Ljava/util/Map;", "toString", "component1", "copy", "equals", "", "other", "hashCode", "", "Mode", "InternalEngine", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IdSessionOptions {
    private final Map<String, Mode> modes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdSessionOptions copy$default(IdSessionOptions idSessionOptions, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = idSessionOptions.modes;
        }
        return idSessionOptions.copy(map);
    }

    public final Map<String, Mode> component1() {
        return this.modes;
    }

    public final IdSessionOptions copy(Map<String, Mode> modes) {
        Intrinsics.checkNotNullParameter(modes, "modes");
        return new IdSessionOptions(modes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IdSessionOptions) && Intrinsics.areEqual(this.modes, ((IdSessionOptions) other).modes);
    }

    public int hashCode() {
        return this.modes.hashCode();
    }

    public IdSessionOptions(Map<String, Mode> modes) {
        Intrinsics.checkNotNullParameter(modes, "modes");
        this.modes = modes;
    }

    public final Map<String, Mode> getModes() {
        return this.modes;
    }

    /* compiled from: IdSessionOptions.kt */
    @Metadata(m513d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m514d2 = {"Lcom/smartengines/targets/id/IdSessionOptions$Mode;", "", HintConstants.AUTOFILL_HINT_NAME, "", "internalEngines", "", "Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getInternalEngines", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Mode {
        private final Map<String, InternalEngine> internalEngines;
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Mode copy$default(Mode mode, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mode.name;
            }
            if ((i & 2) != 0) {
                map = mode.internalEngines;
            }
            return mode.copy(str, map);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Map<String, InternalEngine> component2() {
            return this.internalEngines;
        }

        public final Mode copy(String name, Map<String, InternalEngine> internalEngines) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(internalEngines, "internalEngines");
            return new Mode(name, internalEngines);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Mode)) {
                return false;
            }
            Mode mode = (Mode) other;
            return Intrinsics.areEqual(this.name, mode.name) && Intrinsics.areEqual(this.internalEngines, mode.internalEngines);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.internalEngines.hashCode();
        }

        public String toString() {
            return "Mode(name=" + this.name + ", internalEngines=" + this.internalEngines + ')';
        }

        public Mode(String name, Map<String, InternalEngine> internalEngines) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(internalEngines, "internalEngines");
            this.name = name;
            this.internalEngines = internalEngines;
        }

        public final String getName() {
            return this.name;
        }

        public final Map<String, InternalEngine> getInternalEngines() {
            return this.internalEngines;
        }
    }

    /* compiled from: IdSessionOptions.kt */
    @Metadata(m513d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m514d2 = {"Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;", "", HintConstants.AUTOFILL_HINT_NAME, "", "supportedDocumentTypes", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getSupportedDocumentTypes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class InternalEngine {
        private final String name;
        private final List<String> supportedDocumentTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InternalEngine copy$default(InternalEngine internalEngine, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = internalEngine.name;
            }
            if ((i & 2) != 0) {
                list = internalEngine.supportedDocumentTypes;
            }
            return internalEngine.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final List<String> component2() {
            return this.supportedDocumentTypes;
        }

        public final InternalEngine copy(String name, List<String> supportedDocumentTypes) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(supportedDocumentTypes, "supportedDocumentTypes");
            return new InternalEngine(name, supportedDocumentTypes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InternalEngine)) {
                return false;
            }
            InternalEngine internalEngine = (InternalEngine) other;
            return Intrinsics.areEqual(this.name, internalEngine.name) && Intrinsics.areEqual(this.supportedDocumentTypes, internalEngine.supportedDocumentTypes);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.supportedDocumentTypes.hashCode();
        }

        public String toString() {
            return "InternalEngine(name=" + this.name + ", supportedDocumentTypes=" + this.supportedDocumentTypes + ')';
        }

        public InternalEngine(String name, List<String> supportedDocumentTypes) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(supportedDocumentTypes, "supportedDocumentTypes");
            this.name = name;
            this.supportedDocumentTypes = supportedDocumentTypes;
        }

        public final String getName() {
            return this.name;
        }

        public final List<String> getSupportedDocumentTypes() {
            return this.supportedDocumentTypes;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("mode / internal engine / supported document type\n------------------------------------------------\n");
        for (Mode mode : CollectionsKt.sortedWith(this.modes.values(), new Comparator() { // from class: com.smartengines.targets.id.IdSessionOptions$toString$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((IdSessionOptions.Mode) t).getName(), ((IdSessionOptions.Mode) t2).getName());
            }
        })) {
            for (InternalEngine internalEngine : CollectionsKt.sortedWith(mode.getInternalEngines().values(), new Comparator() { // from class: com.smartengines.targets.id.IdSessionOptions$toString$lambda$5$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((IdSessionOptions.InternalEngine) t).getName(), ((IdSessionOptions.InternalEngine) t2).getName());
                }
            })) {
                Iterator it = CollectionsKt.sortedWith(internalEngine.getSupportedDocumentTypes(), new Comparator() { // from class: com.smartengines.targets.id.IdSessionOptions$toString$lambda$5$lambda$4$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues((String) t, (String) t2);
                    }
                }).iterator();
                while (it.hasNext()) {
                    sb.append(mode.getName() + " / " + internalEngine.getName() + " / " + ((String) it.next()) + '\n');
                }
                sb.append("\n");
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
