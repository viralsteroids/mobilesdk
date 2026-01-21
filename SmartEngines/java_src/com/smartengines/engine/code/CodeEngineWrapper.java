package com.smartengines.engine.code;

import com.smartengines.code.CodeEngine;
import com.smartengines.engine.Engine;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeEngineWrapper.kt */
@Metadata(m513d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0015"}, m514d2 = {"Lcom/smartengines/engine/code/CodeEngineWrapper;", "Lcom/smartengines/engine/Engine;", "signature", "", "<init>", "(Ljava/lang/String;)V", "getSignature", "()Ljava/lang/String;", "codeEngine", "Lcom/smartengines/code/CodeEngine;", "getCodeEngine", "()Lcom/smartengines/code/CodeEngine;", "setCodeEngine", "(Lcom/smartengines/code/CodeEngine;)V", "isVideoModeAllowed", "", "()Z", "createEngine", "", "bundle", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CodeEngineWrapper implements Engine {
    public CodeEngine codeEngine;
    private final boolean isVideoModeAllowed;
    private final String signature;

    public CodeEngineWrapper(String signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.signature = signature;
        this.isVideoModeAllowed = true;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final CodeEngine getCodeEngine() {
        CodeEngine codeEngine = this.codeEngine;
        if (codeEngine != null) {
            return codeEngine;
        }
        Intrinsics.throwUninitializedPropertyAccessException("codeEngine");
        return null;
    }

    public final void setCodeEngine(CodeEngine codeEngine) {
        Intrinsics.checkNotNullParameter(codeEngine, "<set-?>");
        this.codeEngine = codeEngine;
    }

    @Override // com.smartengines.engine.Engine
    /* renamed from: isVideoModeAllowed, reason: from getter */
    public boolean getIsVideoModeAllowed() {
        return this.isVideoModeAllowed;
    }

    @Override // com.smartengines.engine.Engine
    public void createEngine(byte[] bundle) {
        CodeEngine codeEngineCreateFromEmbeddedBundle;
        if (bundle != null) {
            codeEngineCreateFromEmbeddedBundle = CodeEngine.Create(bundle, true);
        } else {
            codeEngineCreateFromEmbeddedBundle = CodeEngine.CreateFromEmbeddedBundle(true);
        }
        setCodeEngine(codeEngineCreateFromEmbeddedBundle);
    }
}
