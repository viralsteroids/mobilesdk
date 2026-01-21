package com.smartengines.targets.code;

import androidx.autofill.HintConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CodeSessionOptions.kt */
@Metadata(m513d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0007H\u0016J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m514d2 = {"Lcom/smartengines/targets/code/CodeSessionOptions;", "", "globalOptions", "", "Lcom/smartengines/targets/code/CodeSessionOptions$Option;", "internalEngines", "", "", "Lcom/smartengines/targets/code/CodeSessionOptions$InternalEngine;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getGlobalOptions", "()Ljava/util/List;", "getInternalEngines", "()Ljava/util/Map;", "toString", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "InternalEngine", "Option", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CodeSessionOptions {
    private final List<Option> globalOptions;
    private final Map<String, InternalEngine> internalEngines;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CodeSessionOptions copy$default(CodeSessionOptions codeSessionOptions, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = codeSessionOptions.globalOptions;
        }
        if ((i & 2) != 0) {
            map = codeSessionOptions.internalEngines;
        }
        return codeSessionOptions.copy(list, map);
    }

    public final List<Option> component1() {
        return this.globalOptions;
    }

    public final Map<String, InternalEngine> component2() {
        return this.internalEngines;
    }

    public final CodeSessionOptions copy(List<Option> globalOptions, Map<String, InternalEngine> internalEngines) {
        Intrinsics.checkNotNullParameter(globalOptions, "globalOptions");
        Intrinsics.checkNotNullParameter(internalEngines, "internalEngines");
        return new CodeSessionOptions(globalOptions, internalEngines);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeSessionOptions)) {
            return false;
        }
        CodeSessionOptions codeSessionOptions = (CodeSessionOptions) other;
        return Intrinsics.areEqual(this.globalOptions, codeSessionOptions.globalOptions) && Intrinsics.areEqual(this.internalEngines, codeSessionOptions.internalEngines);
    }

    public int hashCode() {
        return (this.globalOptions.hashCode() * 31) + this.internalEngines.hashCode();
    }

    public CodeSessionOptions(List<Option> globalOptions, Map<String, InternalEngine> internalEngines) {
        Intrinsics.checkNotNullParameter(globalOptions, "globalOptions");
        Intrinsics.checkNotNullParameter(internalEngines, "internalEngines");
        this.globalOptions = globalOptions;
        this.internalEngines = internalEngines;
    }

    public final List<Option> getGlobalOptions() {
        return this.globalOptions;
    }

    public final Map<String, InternalEngine> getInternalEngines() {
        return this.internalEngines;
    }

    /* compiled from: CodeSessionOptions.kt */
    @Metadata(m513d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m514d2 = {"Lcom/smartengines/targets/code/CodeSessionOptions$InternalEngine;", "", HintConstants.AUTOFILL_HINT_NAME, "", "options", "", "Lcom/smartengines/targets/code/CodeSessionOptions$Option;", "subtypes", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getOptions", "()Ljava/util/List;", "getSubtypes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class InternalEngine {
        private final String name;
        private final List<Option> options;
        private final List<Option> subtypes;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InternalEngine copy$default(InternalEngine internalEngine, String str, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = internalEngine.name;
            }
            if ((i & 2) != 0) {
                list = internalEngine.options;
            }
            if ((i & 4) != 0) {
                list2 = internalEngine.subtypes;
            }
            return internalEngine.copy(str, list, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final List<Option> component2() {
            return this.options;
        }

        public final List<Option> component3() {
            return this.subtypes;
        }

        public final InternalEngine copy(String name, List<Option> options, List<Option> subtypes) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(subtypes, "subtypes");
            return new InternalEngine(name, options, subtypes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InternalEngine)) {
                return false;
            }
            InternalEngine internalEngine = (InternalEngine) other;
            return Intrinsics.areEqual(this.name, internalEngine.name) && Intrinsics.areEqual(this.options, internalEngine.options) && Intrinsics.areEqual(this.subtypes, internalEngine.subtypes);
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.options.hashCode()) * 31) + this.subtypes.hashCode();
        }

        public String toString() {
            return "InternalEngine(name=" + this.name + ", options=" + this.options + ", subtypes=" + this.subtypes + ')';
        }

        public InternalEngine(String name, List<Option> options, List<Option> subtypes) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(subtypes, "subtypes");
            this.name = name;
            this.options = options;
            this.subtypes = subtypes;
        }

        public final String getName() {
            return this.name;
        }

        public final List<Option> getOptions() {
            return this.options;
        }

        public final List<Option> getSubtypes() {
            return this.subtypes;
        }
    }

    /* compiled from: CodeSessionOptions.kt */
    @Metadata(m513d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m514d2 = {"Lcom/smartengines/targets/code/CodeSessionOptions$Option;", "", "key", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "subkeys", "", "getSubkeys", "()Ljava/util/List;", "toString", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Option {
        private final String key;
        private final List<String> subkeys;
        private final String value;

        public static /* synthetic */ Option copy$default(Option option, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = option.key;
            }
            if ((i & 2) != 0) {
                str2 = option.value;
            }
            return option.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final Option copy(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Option(key, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return Intrinsics.areEqual(this.key, option.key) && Intrinsics.areEqual(this.value, option.value);
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.value.hashCode();
        }

        public Option(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.key = key;
            this.value = value;
            this.subkeys = StringsKt.split$default((CharSequence) key, new String[]{"."}, false, 0, 6, (Object) null);
        }

        public final String getKey() {
            return this.key;
        }

        public final String getValue() {
            return this.value;
        }

        public final List<String> getSubkeys() {
            return this.subkeys;
        }

        public String toString() {
            return this.key + " : " + this.value;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = this.globalOptions.iterator();
        while (it.hasNext()) {
            sb.append(new StringBuilder().append((Option) it.next()).append('\n').toString());
        }
        sb.append("\n");
        for (InternalEngine internalEngine : this.internalEngines.values()) {
            Iterator<T> it2 = internalEngine.getOptions().iterator();
            while (it2.hasNext()) {
                sb.append(new StringBuilder().append((Option) it2.next()).append('\n').toString());
            }
            Iterator<T> it3 = internalEngine.getSubtypes().iterator();
            while (it3.hasNext()) {
                sb.append("    " + ((Option) it3.next()) + '\n');
            }
            sb.append("\n");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
