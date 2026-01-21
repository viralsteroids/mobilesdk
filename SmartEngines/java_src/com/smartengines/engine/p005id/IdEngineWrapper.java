package com.smartengines.engine.p005id;

import com.smartengines.engine.Engine;
import com.smartengines.p006id.IdEngine;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdEngineWrapper.kt */
@Metadata(m513d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J*\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000f¨\u0006\u0018"}, m514d2 = {"Lcom/smartengines/engine/id/IdEngineWrapper;", "Lcom/smartengines/engine/Engine;", "signature", "", "<init>", "(Ljava/lang/String;)V", "getSignature", "()Ljava/lang/String;", "value", "Lcom/smartengines/id/IdEngine;", "idEngine", "getIdEngine", "()Lcom/smartengines/id/IdEngine;", "isVideoModeAllowed", "", "()Z", "createEngine", "", "bundle", "", "lazyConfiguration", "initConcurrency", "", "delayedInitialization", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdEngineWrapper implements Engine {
    private IdEngine idEngine;
    private final boolean isVideoModeAllowed;
    private final String signature;

    public IdEngineWrapper(String signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.signature = signature;
        this.isVideoModeAllowed = true;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final IdEngine getIdEngine() {
        IdEngine idEngine = this.idEngine;
        if (idEngine != null) {
            return idEngine;
        }
        Intrinsics.throwUninitializedPropertyAccessException("idEngine");
        return null;
    }

    @Override // com.smartengines.engine.Engine
    /* renamed from: isVideoModeAllowed, reason: from getter */
    public boolean getIsVideoModeAllowed() {
        return this.isVideoModeAllowed;
    }

    @Override // com.smartengines.engine.Engine
    public void createEngine(byte[] bundle) {
        createEngine(bundle, true, 0, true);
    }

    private final void createEngine(byte[] bundle, boolean lazyConfiguration, int initConcurrency, boolean delayedInitialization) {
        IdEngine idEngineCreateFromEmbeddedBundle;
        if (bundle != null) {
            idEngineCreateFromEmbeddedBundle = IdEngine.Create(bundle, lazyConfiguration, initConcurrency, delayedInitialization);
        } else {
            idEngineCreateFromEmbeddedBundle = IdEngine.CreateFromEmbeddedBundle(lazyConfiguration, initConcurrency, delayedInitialization);
        }
        this.idEngine = idEngineCreateFromEmbeddedBundle;
    }
}
