package com.smartengines.targets.p008id;

import android.util.Log;
import com.smartengines.engine.Engine;
import com.smartengines.engine.EngineId;
import com.smartengines.engine.RecognitionTarget;
import com.smartengines.engine.Session;
import com.smartengines.engine.SessionSettingsLogger;
import com.smartengines.engine.SessionType;
import com.smartengines.engine.p005id.IdEngineWrapper;
import com.smartengines.engine.p005id.IdSessionWrapper;
import com.smartengines.engine.p005id.VaSessionWrapper;
import com.smartengines.p006id.IdSessionSettings;
import com.smartengines.p006id.IdVideoAuthenticationSessionSettings;
import com.smartengines.targets.CommonSettings;
import com.smartengines.targets.TargetSettingsKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: IdTarget.kt */
@Metadata(m513d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u001d\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006*"}, m514d2 = {"Lcom/smartengines/targets/id/IdTarget;", "Lcom/smartengines/engine/RecognitionTarget;", "mode", "", "mask", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMode", "()Ljava/lang/String;", "getMask", "enabledMasks", "", "getEnabledMasks", "()Ljava/util/List;", "disabledMasks", "getDisabledMasks", "engineId", "Lcom/smartengines/engine/EngineId;", "getEngineId", "()Lcom/smartengines/engine/EngineId;", "sessionTypes", "", "Lcom/smartengines/engine/SessionType;", "getSessionTypes", "()Ljava/util/Set;", "createSession", "Lcom/smartengines/engine/Session;", "engine", "Lcom/smartengines/engine/Engine;", "sessionType", "logger", "Lcom/smartengines/engine/SessionSettingsLogger;", "toString", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IdTarget implements RecognitionTarget {
    private final List<String> disabledMasks;
    private final List<String> enabledMasks;
    private final EngineId engineId;
    private final String mask;
    private final String mode;
    private final Set<SessionType> sessionTypes;

    public static /* synthetic */ IdTarget copy$default(IdTarget idTarget, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = idTarget.mode;
        }
        if ((i & 2) != 0) {
            str2 = idTarget.mask;
        }
        return idTarget.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMask() {
        return this.mask;
    }

    public final IdTarget copy(String mode, String mask) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(mask, "mask");
        return new IdTarget(mode, mask);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdTarget)) {
            return false;
        }
        IdTarget idTarget = (IdTarget) other;
        return Intrinsics.areEqual(this.mode, idTarget.mode) && Intrinsics.areEqual(this.mask, idTarget.mask);
    }

    public int hashCode() {
        return (this.mode.hashCode() * 31) + this.mask.hashCode();
    }

    public IdTarget(String mode, String mask) {
        List<String> listSplit$default;
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.mode = mode;
        this.mask = mask;
        List listSplit$default2 = StringsKt.split$default((CharSequence) mask, new String[]{"/"}, false, 0, 6, (Object) null);
        this.enabledMasks = StringsKt.split$default((CharSequence) listSplit$default2.get(0), new String[]{","}, false, 0, 6, (Object) null);
        String str = (String) CollectionsKt.getOrNull(listSplit$default2, 1);
        this.disabledMasks = (str == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null)) == null) ? CollectionsKt.emptyList() : listSplit$default;
        this.engineId = EngineId.f368ID;
        this.sessionTypes = SetsKt.setOf((Object[]) new SessionType[]{SessionType.VIDEO_SESSION, SessionType.PHOTO_SESSION, SessionType.GALLERY_SESSION});
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getMask() {
        return this.mask;
    }

    public final List<String> getEnabledMasks() {
        return this.enabledMasks;
    }

    public final List<String> getDisabledMasks() {
        return this.disabledMasks;
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
        String str;
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        IdEngineWrapper idEngineWrapper = (IdEngineWrapper) engine;
        if (TargetSettingsKt.getTargetSettings().getId().getVauthEnabled() && sessionType == SessionType.VIDEO_SESSION) {
            IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettingsCreateVideoAuthenticationSessionSettings = idEngineWrapper.getIdEngine().CreateVideoAuthenticationSessionSettings();
            Intrinsics.checkNotNullExpressionValue(idVideoAuthenticationSessionSettingsCreateVideoAuthenticationSessionSettings, "CreateVideoAuthenticationSessionSettings(...)");
            CommonSettings common = TargetSettingsKt.getTargetSettings().getCommon();
            idVideoAuthenticationSessionSettingsCreateVideoAuthenticationSessionSettings.SetOption("common.sessionTimeout", String.valueOf(common.getSessionTimeout()));
            idVideoAuthenticationSessionSettingsCreateVideoAuthenticationSessionSettings.SetOption("common.enableMultiThreading", String.valueOf(common.getMultiThreading()));
            idVideoAuthenticationSessionSettingsCreateVideoAuthenticationSessionSettings.SetOption("common.computeMetrics", String.valueOf(common.getComputeMetrics()));
            idVideoAuthenticationSessionSettingsCreateVideoAuthenticationSessionSettings.SetOption("common.ignoreInternalTerminality", String.valueOf(common.getIgnoreTerminal()));
            idVideoAuthenticationSessionSettingsCreateVideoAuthenticationSessionSettings.SetOption("common.enableStoppers", String.valueOf(common.getEnableStoppers()));
            idVideoAuthenticationSessionSettingsCreateVideoAuthenticationSessionSettings.SetOption("common.extractTemplateImages", "true");
            TargetSettingsKt.getTargetSettings().getId();
            idVideoAuthenticationSessionSettingsCreateVideoAuthenticationSessionSettings.SetCurrentMode(this.mode);
            Iterator<T> it = this.enabledMasks.iterator();
            while (it.hasNext()) {
                idVideoAuthenticationSessionSettingsCreateVideoAuthenticationSessionSettings.AddEnabledDocumentTypes((String) it.next());
            }
            return new VaSessionWrapper(idEngineWrapper.getIdEngine(), idVideoAuthenticationSessionSettingsCreateVideoAuthenticationSessionSettings, idEngineWrapper.getSignature());
        }
        IdSessionSettings idSessionSettingsCreateSessionSettings = idEngineWrapper.getIdEngine().CreateSessionSettings();
        Intrinsics.checkNotNullExpressionValue(idSessionSettingsCreateSessionSettings, "CreateSessionSettings(...)");
        CommonSettings common2 = TargetSettingsKt.getTargetSettings().getCommon();
        IdTargetKt.setOption(idSessionSettingsCreateSessionSettings, "common.sessionTimeout", common2.getSessionTimeout() + ".0", logger);
        IdTargetKt.setOption(idSessionSettingsCreateSessionSettings, "common.enableMultiThreading", String.valueOf(common2.getMultiThreading()), logger);
        IdTargetKt.setOption(idSessionSettingsCreateSessionSettings, "common.computeMetrics", String.valueOf(common2.getComputeMetrics()), logger);
        IdTargetKt.setOption(idSessionSettingsCreateSessionSettings, "common.ignoreInternalTerminality", String.valueOf(common2.getIgnoreTerminal()), logger);
        IdTargetKt.setOption(idSessionSettingsCreateSessionSettings, "common.enableStoppers", String.valueOf(common2.getEnableStoppers()), logger);
        IdTargetKt.setOption(idSessionSettingsCreateSessionSettings, "common.extractTemplateImages", "true", logger);
        IdTargetKt.setOption(idSessionSettingsCreateSessionSettings, "common.MRZCountriesListAddition", "UTO", logger);
        if (sessionType.isSingleShot()) {
            String str2 = this.mode;
            if (Intrinsics.areEqual(str2, "default")) {
                str = "singleshot";
            } else {
                str = Intrinsics.areEqual(str2, "face_control") ? "face_control" : this.mode + "-singleshot";
            }
        } else {
            str = this.mode;
        }
        IdTargetKt.setCurrentMode(idSessionSettingsCreateSessionSettings, str, logger);
        Iterator<T> it2 = this.enabledMasks.iterator();
        while (it2.hasNext()) {
            IdTargetKt.addEnabledDocumentTypes(idSessionSettingsCreateSessionSettings, (String) it2.next(), logger);
        }
        Iterator<T> it3 = this.disabledMasks.iterator();
        while (it3.hasNext()) {
            IdTargetKt.removeEnabledDocumentTypes(idSessionSettingsCreateSessionSettings, (String) it3.next(), logger);
        }
        if (Intrinsics.areEqual(this.mode, "face_control")) {
            IdTargetKt.setOption(idSessionSettingsCreateSessionSettings, "common.selfieWithPassportEnabled", "true", logger);
            IdTargetKt.setOption(idSessionSettingsCreateSessionSettings, "common.faceControlCheckEnabled", "true", logger);
            IdTargetKt.setOption(idSessionSettingsCreateSessionSettings, "common.reflectionEnabled", "true", logger);
        }
        if (TargetSettingsKt.getTargetSettings().getId().getEnableForensics()) {
            Log.w("myapp.IdTarget", "enable forensic");
            IdTargetKt.setOption(idSessionSettingsCreateSessionSettings, "common.enableForensics", "true", logger);
            String str3 = new SimpleDateFormat("dd.MM.yyyy", Locale.US).format(new Date());
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            IdTargetKt.setOption(idSessionSettingsCreateSessionSettings, "common.currentDate", str3, logger);
            IdTargetKt.enableForensics(idSessionSettingsCreateSessionSettings, logger);
        }
        if (logger != null) {
            IdTargetKt.dump(logger, idSessionSettingsCreateSessionSettings);
        }
        return new IdSessionWrapper(idEngineWrapper.getIdEngine(), idSessionSettingsCreateSessionSettings, idEngineWrapper.getSignature());
    }

    public String toString() {
        return "IdTarget: " + this.mode + "  " + this.mask;
    }
}
