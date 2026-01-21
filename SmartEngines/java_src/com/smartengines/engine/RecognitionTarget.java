package com.smartengines.engine;

import java.util.Set;
import kotlin.Metadata;

/* compiled from: RecognitionTarget.kt */
@Metadata(m513d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m514d2 = {"Lcom/smartengines/engine/RecognitionTarget;", "", "engineId", "Lcom/smartengines/engine/EngineId;", "getEngineId", "()Lcom/smartengines/engine/EngineId;", "createSession", "Lcom/smartengines/engine/Session;", "engine", "Lcom/smartengines/engine/Engine;", "sessionType", "Lcom/smartengines/engine/SessionType;", "logger", "Lcom/smartengines/engine/SessionSettingsLogger;", "sessionTypes", "", "getSessionTypes", "()Ljava/util/Set;", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface RecognitionTarget {
    Session createSession(Engine engine, SessionType sessionType, SessionSettingsLogger logger);

    EngineId getEngineId();

    Set<SessionType> getSessionTypes();
}
