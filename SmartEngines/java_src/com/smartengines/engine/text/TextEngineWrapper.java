package com.smartengines.engine.text;

import com.smartengines.engine.Engine;
import com.smartengines.text.TextEngine;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextEngineWrapper.kt */
@Metadata(m513d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000f¨\u0006\u0014"}, m514d2 = {"Lcom/smartengines/engine/text/TextEngineWrapper;", "Lcom/smartengines/engine/Engine;", "signature", "", "<init>", "(Ljava/lang/String;)V", "getSignature", "()Ljava/lang/String;", "value", "Lcom/smartengines/text/TextEngine;", "textEngine", "getTextEngine", "()Lcom/smartengines/text/TextEngine;", "isVideoModeAllowed", "", "()Z", "createEngine", "", "bundle", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TextEngineWrapper implements Engine {
    private final boolean isVideoModeAllowed;
    private final String signature;
    private TextEngine textEngine;

    public TextEngineWrapper(String signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.signature = signature;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final TextEngine getTextEngine() {
        TextEngine textEngine = this.textEngine;
        if (textEngine != null) {
            return textEngine;
        }
        Intrinsics.throwUninitializedPropertyAccessException("textEngine");
        return null;
    }

    @Override // com.smartengines.engine.Engine
    /* renamed from: isVideoModeAllowed, reason: from getter */
    public boolean getIsVideoModeAllowed() {
        return this.isVideoModeAllowed;
    }

    @Override // com.smartengines.engine.Engine
    public void createEngine(byte[] bundle) {
        TextEngine textEngineCreateFromEmbeddedBundle;
        if (bundle != null) {
            textEngineCreateFromEmbeddedBundle = TextEngine.Create(bundle, true);
        } else {
            textEngineCreateFromEmbeddedBundle = TextEngine.CreateFromEmbeddedBundle(true);
        }
        this.textEngine = textEngineCreateFromEmbeddedBundle;
    }
}
