package com.smartengines.targets.text;

import android.util.Log;
import com.smartengines.engine.Engine;
import com.smartengines.engine.EngineId;
import com.smartengines.engine.RecognitionTarget;
import com.smartengines.engine.Session;
import com.smartengines.engine.SessionSettingsLogger;
import com.smartengines.engine.SessionType;
import com.smartengines.engine.text.TextEngineWrapper;
import com.smartengines.engine.text.TextSessionWrapper;
import com.smartengines.targets.TargetSettingsKt;
import com.smartengines.text.TextEngine;
import com.smartengines.text.TextSessionSettings;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextTarget.kt */
@Metadata(m513d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m514d2 = {"Lcom/smartengines/targets/text/TextTarget;", "Lcom/smartengines/engine/RecognitionTarget;", "<init>", "()V", "engineId", "Lcom/smartengines/engine/EngineId;", "getEngineId", "()Lcom/smartengines/engine/EngineId;", "sessionTypes", "", "Lcom/smartengines/engine/SessionType;", "getSessionTypes", "()Ljava/util/Set;", "createSession", "Lcom/smartengines/engine/Session;", "engine", "Lcom/smartengines/engine/Engine;", "sessionType", "logger", "Lcom/smartengines/engine/SessionSettingsLogger;", "toString", "", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TextTarget implements RecognitionTarget {
    private final EngineId engineId = EngineId.TEXT;
    private final Set<SessionType> sessionTypes = SetsKt.setOf((Object[]) new SessionType[]{SessionType.PHOTO_SESSION, SessionType.GALLERY_SESSION});

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
        TextEngineWrapper textEngineWrapper = (TextEngineWrapper) engine;
        TextSessionSettings textSessionSettingsCreateSessionSettings = textEngineWrapper.getTextEngine().CreateSessionSettings();
        Intrinsics.checkNotNull(textSessionSettingsCreateSessionSettings);
        TextSessionOptions textSessionOptions = TextSessionOptionsKt.parse(textSessionSettingsCreateSessionSettings);
        TextTargetKt.setOption(textSessionSettingsCreateSessionSettings, "enableMultiThreading", String.valueOf(TargetSettingsKt.getTargetSettings().getCommon().getMultiThreading()), logger);
        TextTargetKt.setOption(textSessionSettingsCreateSessionSettings, "mode", TargetSettingsKt.getTargetSettings().getText().getPageDetection() ? "page" : "standard", logger);
        TextTargetKt.addEnabledLanguages(textSessionSettingsCreateSessionSettings, "punct", logger);
        Set<String> languages = TargetSettingsKt.getTargetSettings().getText().getLanguages();
        Log.w("myapp.TextTarget", "enabled languages: " + languages);
        Log.w("myapp.TextTarget", "options.languages: " + textSessionOptions.getLanguages());
        for (String str : textSessionOptions.getLanguages()) {
            if (languages.contains(str)) {
                TextTargetKt.addEnabledLanguages(textSessionSettingsCreateSessionSettings, str, logger);
            }
        }
        if (logger != null) {
            Intrinsics.checkNotNull(textSessionSettingsCreateSessionSettings);
            TextTargetKt.dump(logger, textSessionSettingsCreateSessionSettings);
        }
        TextEngine textEngine = textEngineWrapper.getTextEngine();
        Intrinsics.checkNotNull(textSessionSettingsCreateSessionSettings);
        return new TextSessionWrapper(textEngine, textSessionSettingsCreateSessionSettings, textEngineWrapper.getSignature());
    }

    public String toString() {
        return "TextTarget";
    }
}
