package com.smartengines.engine.doc;

import com.smartengines.doc.DocEngine;
import com.smartengines.engine.Engine;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocEngineWrapper.kt */
@Metadata(m513d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000f¨\u0006\u0014"}, m514d2 = {"Lcom/smartengines/engine/doc/DocEngineWrapper;", "Lcom/smartengines/engine/Engine;", "signature", "", "<init>", "(Ljava/lang/String;)V", "getSignature", "()Ljava/lang/String;", "value", "Lcom/smartengines/doc/DocEngine;", "docEngine", "getDocEngine", "()Lcom/smartengines/doc/DocEngine;", "isVideoModeAllowed", "", "()Z", "createEngine", "", "bundle", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DocEngineWrapper implements Engine {
    private DocEngine docEngine;
    private final boolean isVideoModeAllowed;
    private final String signature;

    public DocEngineWrapper(String signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.signature = signature;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final DocEngine getDocEngine() {
        DocEngine docEngine = this.docEngine;
        if (docEngine != null) {
            return docEngine;
        }
        Intrinsics.throwUninitializedPropertyAccessException("docEngine");
        return null;
    }

    @Override // com.smartengines.engine.Engine
    /* renamed from: isVideoModeAllowed, reason: from getter */
    public boolean getIsVideoModeAllowed() {
        return this.isVideoModeAllowed;
    }

    @Override // com.smartengines.engine.Engine
    public void createEngine(byte[] bundle) {
        DocEngine docEngineCreateFromEmbeddedBundle;
        if (bundle != null) {
            docEngineCreateFromEmbeddedBundle = DocEngine.Create(bundle, true);
        } else {
            docEngineCreateFromEmbeddedBundle = DocEngine.CreateFromEmbeddedBundle(true);
        }
        this.docEngine = docEngineCreateFromEmbeddedBundle;
    }
}
