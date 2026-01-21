package com.smartengines.targets.doc;

import com.smartengines.doc.DocEngine;
import com.smartengines.doc.DocSessionSettings;
import com.smartengines.engine.Engine;
import com.smartengines.engine.EngineId;
import com.smartengines.engine.RecognitionTarget;
import com.smartengines.engine.Session;
import com.smartengines.engine.SessionSettingsLogger;
import com.smartengines.engine.SessionType;
import com.smartengines.engine.doc.DocEngineWrapper;
import com.smartengines.engine.doc.DocSessionWrapper;
import com.smartengines.targets.CommonSettings;
import com.smartengines.targets.TargetSettingsKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocTarget.kt */
@Metadata(m513d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, m514d2 = {"Lcom/smartengines/targets/doc/DocTarget;", "Lcom/smartengines/engine/RecognitionTarget;", "mode", "", "mask", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMode", "()Ljava/lang/String;", "getMask", "engineId", "Lcom/smartengines/engine/EngineId;", "getEngineId", "()Lcom/smartengines/engine/EngineId;", "sessionTypes", "", "Lcom/smartengines/engine/SessionType;", "getSessionTypes", "()Ljava/util/Set;", "createSession", "Lcom/smartengines/engine/Session;", "engine", "Lcom/smartengines/engine/Engine;", "sessionType", "logger", "Lcom/smartengines/engine/SessionSettingsLogger;", "toString", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DocTarget implements RecognitionTarget {
    private final EngineId engineId;
    private final String mask;
    private final String mode;
    private final Set<SessionType> sessionTypes;

    public static /* synthetic */ DocTarget copy$default(DocTarget docTarget, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = docTarget.mode;
        }
        if ((i & 2) != 0) {
            str2 = docTarget.mask;
        }
        return docTarget.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMask() {
        return this.mask;
    }

    public final DocTarget copy(String mode, String mask) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(mask, "mask");
        return new DocTarget(mode, mask);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocTarget)) {
            return false;
        }
        DocTarget docTarget = (DocTarget) other;
        return Intrinsics.areEqual(this.mode, docTarget.mode) && Intrinsics.areEqual(this.mask, docTarget.mask);
    }

    public int hashCode() {
        return (this.mode.hashCode() * 31) + this.mask.hashCode();
    }

    public DocTarget(String mode, String mask) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.mode = mode;
        this.mask = mask;
        this.engineId = EngineId.DOC;
        this.sessionTypes = SetsKt.setOf((Object[]) new SessionType[]{SessionType.PHOTO_SESSION, SessionType.GALLERY_SESSION});
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getMask() {
        return this.mask;
    }

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
        DocEngineWrapper docEngineWrapper = (DocEngineWrapper) engine;
        DocSessionSettings docSessionSettingsCreateSessionSettings = docEngineWrapper.getDocEngine().CreateSessionSettings();
        CommonSettings common = TargetSettingsKt.getTargetSettings().getCommon();
        Intrinsics.checkNotNull(docSessionSettingsCreateSessionSettings);
        DocTargetKt.setOption(docSessionSettingsCreateSessionSettings, "enableMultiThreading", String.valueOf(common.getMultiThreading()), logger);
        DocTargetKt.setCurrentMode(docSessionSettingsCreateSessionSettings, this.mode, logger);
        DocTargetKt.addEnabledDocumentTypes(docSessionSettingsCreateSessionSettings, this.mask, logger);
        if (logger != null) {
            Intrinsics.checkNotNull(docSessionSettingsCreateSessionSettings);
            DocTargetKt.dump(logger, docSessionSettingsCreateSessionSettings);
        }
        DocEngine docEngine = docEngineWrapper.getDocEngine();
        Intrinsics.checkNotNull(docSessionSettingsCreateSessionSettings);
        return new DocSessionWrapper(docEngine, docSessionSettingsCreateSessionSettings, docEngineWrapper.getSignature());
    }

    public String toString() {
        return "DocTarget: " + this.mode + "  " + this.mask;
    }
}
