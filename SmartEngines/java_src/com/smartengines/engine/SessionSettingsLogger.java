package com.smartengines.engine;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SessionSettingsLogger.kt */
@Metadata(m513d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0013J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H&J\b\u0010\u0012\u001a\u00020\u0003H&R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m514d2 = {"Lcom/smartengines/engine/SessionSettingsLogger;", "", "logAction", "", "action", "Lcom/smartengines/engine/SessionSettingsLogger$Action;", "actions", "", "getActions", "()Ljava/util/List;", "logData", "key", "", "value", "data", "", "getData", "()Ljava/util/Map;", "clear", "Action", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface SessionSettingsLogger {
    void clear();

    List<Action> getActions();

    Map<String, Object> getData();

    void logAction(Action action);

    void logData(String key, Object value);

    /* compiled from: SessionSettingsLogger.kt */
    @Metadata(m513d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m514d2 = {"Lcom/smartengines/engine/SessionSettingsLogger$Action;", "", "method", "", "arguments", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getMethod", "()Ljava/lang/String;", "getArguments", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Action {
        private final List<String> arguments;
        private final String method;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Action copy$default(Action action, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = action.method;
            }
            if ((i & 2) != 0) {
                list = action.arguments;
            }
            return action.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        public final List<String> component2() {
            return this.arguments;
        }

        public final Action copy(String method, List<String> arguments) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            return new Action(method, arguments);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return Intrinsics.areEqual(this.method, action.method) && Intrinsics.areEqual(this.arguments, action.arguments);
        }

        public int hashCode() {
            return (this.method.hashCode() * 31) + this.arguments.hashCode();
        }

        public String toString() {
            return "Action(method=" + this.method + ", arguments=" + this.arguments + ')';
        }

        public Action(String method, List<String> arguments) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            this.method = method;
            this.arguments = arguments;
        }

        public final List<String> getArguments() {
            return this.arguments;
        }

        public final String getMethod() {
            return this.method;
        }
    }
}
