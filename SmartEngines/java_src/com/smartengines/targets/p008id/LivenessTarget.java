package com.smartengines.targets.p008id;

import com.smartengines.engine.Engine;
import com.smartengines.engine.EngineId;
import com.smartengines.engine.RecognitionTarget;
import com.smartengines.engine.Session;
import com.smartengines.engine.SessionSettingsLogger;
import com.smartengines.engine.SessionType;
import com.smartengines.engine.p005id.IdEngineWrapper;
import com.smartengines.engine.p005id.LvSessionWrapper;
import com.smartengines.p006id.IdEngine;
import com.smartengines.p006id.IdFaceSessionSettings;
import com.smartengines.targets.CommonSettings;
import com.smartengines.targets.TargetSettingsKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LivenessTarget.kt */
@Metadata(m513d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m514d2 = {"Lcom/smartengines/targets/id/LivenessTarget;", "Lcom/smartengines/engine/RecognitionTarget;", "<init>", "()V", "engineId", "Lcom/smartengines/engine/EngineId;", "getEngineId", "()Lcom/smartengines/engine/EngineId;", "sessionTypes", "", "Lcom/smartengines/engine/SessionType;", "getSessionTypes", "()Ljava/util/Set;", "createSession", "Lcom/smartengines/engine/Session;", "engine", "Lcom/smartengines/engine/Engine;", "sessionType", "logger", "Lcom/smartengines/engine/SessionSettingsLogger;", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class LivenessTarget implements RecognitionTarget {
    private final EngineId engineId = EngineId.f368ID;
    private final Set<SessionType> sessionTypes = SetsKt.setOf(SessionType.VIDEO_SESSION);

    @Override // com.smartengines.engine.RecognitionTarget
    public EngineId getEngineId() {
        return this.engineId;
    }

    @Override // com.smartengines.engine.RecognitionTarget
    public Set<SessionType> getSessionTypes() {
        return this.sessionTypes;
    }

    @Override // com.smartengines.engine.RecognitionTarget
    public Session createSession(Engine engine, SessionType sessionType, SessionSettingsLogger logger) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        IdEngineWrapper idEngineWrapper = (IdEngineWrapper) engine;
        IdFaceSessionSettings idFaceSessionSettingsCreateFaceSessionSettings = idEngineWrapper.getIdEngine().CreateFaceSessionSettings();
        CommonSettings common = TargetSettingsKt.getTargetSettings().getCommon();
        Intrinsics.checkNotNull(idFaceSessionSettingsCreateFaceSessionSettings);
        LivenessTargetKt.setOption(idFaceSessionSettingsCreateFaceSessionSettings, "common.enableMultiThreading", String.valueOf(common.getMultiThreading()), logger);
        IdSettings id = TargetSettingsKt.getTargetSettings().getId();
        LivenessTargetKt.setOption(idFaceSessionSettingsCreateFaceSessionSettings, "faceMinInstructionTime", String.valueOf(id.getMinInstrTime() * 1000), logger);
        LivenessTargetKt.setOption(idFaceSessionSettingsCreateFaceSessionSettings, "faceMaxInstructionTime", String.valueOf(id.getMaxInstrTime() * 1000), logger);
        LivenessTargetKt.setOption(idFaceSessionSettingsCreateFaceSessionSettings, "alwaysPass", String.valueOf(id.getAlwaysPass()), logger);
        LivenessTargetKt.setOption(idFaceSessionSettingsCreateFaceSessionSettings, "instructionsCountBase", String.valueOf(id.getInstrCount()), logger);
        LivenessTargetKt.setOption(idFaceSessionSettingsCreateFaceSessionSettings, "instructionsCountDeltaRandom", String.valueOf(id.getInstrCountDeltaRandom()), logger);
        LivenessTargetKt.setOption(idFaceSessionSettingsCreateFaceSessionSettings, "allowedNumberOfFailedInstructions", String.valueOf(id.getInstrFailed()), logger);
        LivenessTargetKt.setOption(idFaceSessionSettingsCreateFaceSessionSettings, "minPassTime", String.valueOf(id.getMinPassTime()), logger);
        if (logger != null) {
            Intrinsics.checkNotNull(idFaceSessionSettingsCreateFaceSessionSettings);
            LivenessTargetKt.dump(logger, idFaceSessionSettingsCreateFaceSessionSettings);
        }
        IdEngine idEngine = idEngineWrapper.getIdEngine();
        Intrinsics.checkNotNull(idFaceSessionSettingsCreateFaceSessionSettings);
        return new LvSessionWrapper(idEngine, idFaceSessionSettingsCreateFaceSessionSettings, idEngineWrapper.getSignature());
    }
}
