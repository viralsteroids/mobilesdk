package com.smartengines.engine.p005id;

import android.graphics.Bitmap;
import android.util.Log;
import com.smartengines.engine.ImageFactory;
import com.smartengines.engine.Result;
import com.smartengines.engine.Session;
import com.smartengines.p006id.IdEngine;
import com.smartengines.p006id.IdResult;
import com.smartengines.p006id.IdVideoAuthenticationSession;
import com.smartengines.p006id.IdVideoAuthenticationSessionSettings;
import com.smartengines.utils.UtilsKt;
import com.smartengines.visualization.Visualization;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VaSessionWrapper.kt */
@Metadata(m513d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020%H\u0016J\u000e\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010)\u001a\u0004\u0018\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, m514d2 = {"Lcom/smartengines/engine/id/VaSessionWrapper;", "Lcom/smartengines/engine/Session;", "idEngine", "Lcom/smartengines/id/IdEngine;", "vaSessionSettings", "Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;", "signature", "", "<init>", "(Lcom/smartengines/id/IdEngine;Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)V", "getVaSessionSettings", "()Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;", "vaSession", "Lcom/smartengines/id/IdVideoAuthenticationSession;", "getVaSession", "()Lcom/smartengines/id/IdVideoAuthenticationSession;", "isEnded", "", "()Z", "quadsPrimary", "Lcom/smartengines/visualization/Visualization$Quads;", "quadsSecondary", "instruction", "Lcom/smartengines/visualization/Visualization$Instruction;", "visualizations", "", "getVisualizations", "()Ljava/util/List;", "idCallback", "Lcom/smartengines/engine/id/IdCallback;", "getIdCallback", "()Lcom/smartengines/engine/id/IdCallback;", "vaCallback", "Lcom/smartengines/engine/id/VaCallback;", "getVaCallback", "()Lcom/smartengines/engine/id/VaCallback;", "processImage", "", "bitmap", "Landroid/graphics/Bitmap;", "delete", "currentResult", "Lcom/smartengines/engine/Result;", "getCurrentResult", "()Lcom/smartengines/engine/Result;", "hasRFID", "docType", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class VaSessionWrapper implements Session {
    private final IdCallback idCallback;
    private final Visualization.Instruction instruction;
    private final Visualization.Quads quadsPrimary;
    private final Visualization.Quads quadsSecondary;
    private final VaCallback vaCallback;
    private final IdVideoAuthenticationSession vaSession;
    private final IdVideoAuthenticationSessionSettings vaSessionSettings;
    private final List<Visualization.Quads> visualizations;

    public VaSessionWrapper(IdEngine idEngine, IdVideoAuthenticationSessionSettings vaSessionSettings, String signature) {
        Intrinsics.checkNotNullParameter(idEngine, "idEngine");
        Intrinsics.checkNotNullParameter(vaSessionSettings, "vaSessionSettings");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.vaSessionSettings = vaSessionSettings;
        Visualization.Quads quads = new Visualization.Quads(null, 1, null);
        this.quadsPrimary = quads;
        Visualization.Quads quads2 = new Visualization.Quads(null, 1, null);
        this.quadsSecondary = quads2;
        Visualization.Instruction instruction = new Visualization.Instruction(null, 1, null);
        this.instruction = instruction;
        this.visualizations = CollectionsKt.listOf((Object[]) new Visualization.Quads[]{quads, quads2});
        IdCallback idCallback = new IdCallback(new VaSessionWrapper$idCallback$1(quads), new VaSessionWrapper$idCallback$2(quads2));
        this.idCallback = idCallback;
        VaCallback vaCallback = new VaCallback(new VaSessionWrapper$vaCallback$1(instruction));
        this.vaCallback = vaCallback;
        this.vaSession = idEngine.SpawnVideoAuthenticationSession(vaSessionSettings, signature, vaCallback, idCallback);
        Log.w("myapp.VaSessionWrapper", "Session created");
    }

    public final IdVideoAuthenticationSessionSettings getVaSessionSettings() {
        return this.vaSessionSettings;
    }

    public final IdVideoAuthenticationSession getVaSession() {
        return this.vaSession;
    }

    @Override // com.smartengines.engine.Session
    /* renamed from: isEnded */
    public boolean getIsEnded() {
        return this.vaCallback.getSessionEnded();
    }

    @Override // com.smartengines.engine.Session
    public List<Visualization.Quads> getVisualizations() {
        return this.visualizations;
    }

    public final IdCallback getIdCallback() {
        return this.idCallback;
    }

    public final VaCallback getVaCallback() {
        return this.vaCallback;
    }

    @Override // com.smartengines.engine.Session
    public void processImage(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.quadsPrimary.setFrameSize(UtilsKt.getSize(bitmap));
        this.quadsSecondary.setFrameSize(UtilsKt.getSize(bitmap));
        this.vaSession.ProcessFrame(ImageFactory.INSTANCE.imageFromBitmap(bitmap));
    }

    @Override // com.smartengines.engine.Session
    public void delete() {
        this.vaSession.delete();
        Log.w("myapp.VaSessionWrapper", "Session deleted");
    }

    @Override // com.smartengines.engine.Session
    public Result getCurrentResult() {
        IdResult idResultGetDocumentResult = this.vaSession.GetDocumentResult();
        Intrinsics.checkNotNullExpressionValue(idResultGetDocumentResult, "GetDocumentResult(...)");
        return IdResultParserKt.parse(idResultGetDocumentResult, MapsKt.emptyMap());
    }

    public final boolean hasRFID(String docType) {
        Intrinsics.checkNotNullParameter(docType, "docType");
        return this.vaSessionSettings.GetDocumentInfo(docType).SupportedRFID() == 1;
    }
}
