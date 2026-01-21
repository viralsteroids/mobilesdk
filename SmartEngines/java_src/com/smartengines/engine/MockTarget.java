package com.smartengines.engine;

import java.util.Set;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Mock.kt */
@Metadata(m513d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m514d2 = {"Lcom/smartengines/engine/MockTarget;", "Lcom/smartengines/engine/RecognitionTarget;", "<init>", "()V", "engineId", "Lcom/smartengines/engine/EngineId;", "getEngineId", "()Lcom/smartengines/engine/EngineId;", "createSession", "Lcom/smartengines/engine/Session;", "engine", "Lcom/smartengines/engine/Engine;", "sessionType", "Lcom/smartengines/engine/SessionType;", "logger", "Lcom/smartengines/engine/SessionSettingsLogger;", "sessionTypes", "", "getSessionTypes", "()Ljava/util/Set;", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class MockTarget implements RecognitionTarget {
    private final Set<SessionType> sessionTypes = SetsKt.setOf((Object[]) new SessionType[]{SessionType.VIDEO_SESSION, SessionType.PHOTO_SESSION});

    @Override // com.smartengines.engine.RecognitionTarget
    public EngineId getEngineId() {
        return EngineId.f368ID;
    }

    @Override // com.smartengines.engine.RecognitionTarget
    public Session createSession(Engine engine, SessionType sessionType, SessionSettingsLogger logger) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.smartengines.engine.RecognitionTarget
    public Set<SessionType> getSessionTypes() {
        return this.sessionTypes;
    }
}
