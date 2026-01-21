package com.smartengines.engine;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EngineLoadingState.kt */
@Metadata(m513d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m514d2 = {"Lcom/smartengines/engine/EngineLoadingState;", "", "Unloaded", "Loading", "Loaded", "Error", "Lcom/smartengines/engine/EngineLoadingState$Error;", "Lcom/smartengines/engine/EngineLoadingState$Loaded;", "Lcom/smartengines/engine/EngineLoadingState$Loading;", "Lcom/smartengines/engine/EngineLoadingState$Unloaded;", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface EngineLoadingState {

    /* compiled from: EngineLoadingState.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m514d2 = {"Lcom/smartengines/engine/EngineLoadingState$Unloaded;", "Lcom/smartengines/engine/EngineLoadingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Unloaded implements EngineLoadingState {
        public static final Unloaded INSTANCE = new Unloaded();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unloaded)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 444839650;
        }

        public String toString() {
            return "Unloaded";
        }

        private Unloaded() {
        }
    }

    /* compiled from: EngineLoadingState.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m514d2 = {"Lcom/smartengines/engine/EngineLoadingState$Loading;", "Lcom/smartengines/engine/EngineLoadingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Loading implements EngineLoadingState {
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -334929480;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: EngineLoadingState.kt */
    @Metadata(m513d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m514d2 = {"Lcom/smartengines/engine/EngineLoadingState$Loaded;", "Lcom/smartengines/engine/EngineLoadingState;", "engine", "Lcom/smartengines/engine/Engine;", "loadingTime", "", "<init>", "(Lcom/smartengines/engine/Engine;J)V", "getEngine", "()Lcom/smartengines/engine/Engine;", "getLoadingTime", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Loaded implements EngineLoadingState {
        private final Engine engine;
        private final long loadingTime;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, Engine engine, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                engine = loaded.engine;
            }
            if ((i & 2) != 0) {
                j = loaded.loadingTime;
            }
            return loaded.copy(engine, j);
        }

        /* renamed from: component1, reason: from getter */
        public final Engine getEngine() {
            return this.engine;
        }

        /* renamed from: component2, reason: from getter */
        public final long getLoadingTime() {
            return this.loadingTime;
        }

        public final Loaded copy(Engine engine, long loadingTime) {
            Intrinsics.checkNotNullParameter(engine, "engine");
            return new Loaded(engine, loadingTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.engine, loaded.engine) && this.loadingTime == loaded.loadingTime;
        }

        public int hashCode() {
            return (this.engine.hashCode() * 31) + Long.hashCode(this.loadingTime);
        }

        public String toString() {
            return "Loaded(engine=" + this.engine + ", loadingTime=" + this.loadingTime + ')';
        }

        public Loaded(Engine engine, long j) {
            Intrinsics.checkNotNullParameter(engine, "engine");
            this.engine = engine;
            this.loadingTime = j;
        }

        public final Engine getEngine() {
            return this.engine;
        }

        public final long getLoadingTime() {
            return this.loadingTime;
        }
    }

    /* compiled from: EngineLoadingState.kt */
    @Metadata(m513d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m514d2 = {"Lcom/smartengines/engine/EngineLoadingState$Error;", "Lcom/smartengines/engine/EngineLoadingState;", "engine", "Lcom/smartengines/engine/Engine;", "error", "", "<init>", "(Lcom/smartengines/engine/Engine;Ljava/lang/Throwable;)V", "getEngine", "()Lcom/smartengines/engine/Engine;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Error implements EngineLoadingState {
        private final Engine engine;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Engine engine, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                engine = error.engine;
            }
            if ((i & 2) != 0) {
                th = error.error;
            }
            return error.copy(engine, th);
        }

        /* renamed from: component1, reason: from getter */
        public final Engine getEngine() {
            return this.engine;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Engine engine, Throwable error) {
            Intrinsics.checkNotNullParameter(engine, "engine");
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(engine, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.engine, error.engine) && Intrinsics.areEqual(this.error, error.error);
        }

        public int hashCode() {
            return (this.engine.hashCode() * 31) + this.error.hashCode();
        }

        public String toString() {
            return "Error(engine=" + this.engine + ", error=" + this.error + ')';
        }

        public Error(Engine engine, Throwable error) {
            Intrinsics.checkNotNullParameter(engine, "engine");
            Intrinsics.checkNotNullParameter(error, "error");
            this.engine = engine;
            this.error = error;
        }

        public final Engine getEngine() {
            return this.engine;
        }

        public final Throwable getError() {
            return this.error;
        }
    }
}
