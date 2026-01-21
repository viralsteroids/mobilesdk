package com.smartengines.engine.p005id;

import android.graphics.Bitmap;
import android.util.Log;
import com.smartengines.engine.ImageFactory;
import com.smartengines.engine.Result;
import com.smartengines.engine.Session;
import com.smartengines.p006id.IdEngine;
import com.smartengines.p006id.IdResult;
import com.smartengines.p006id.IdSession;
import com.smartengines.p006id.IdSessionSettings;
import com.smartengines.utils.UtilsKt;
import com.smartengines.visualization.Visualization;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdSessionWrapper.kt */
@Metadata(m513d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020$H\u0016J\u000e\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"0!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\u0004\u0018\u00010)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, m514d2 = {"Lcom/smartengines/engine/id/IdSessionWrapper;", "Lcom/smartengines/engine/Session;", "idEngine", "Lcom/smartengines/id/IdEngine;", "idSessionSettings", "Lcom/smartengines/id/IdSessionSettings;", "signature", "", "<init>", "(Lcom/smartengines/id/IdEngine;Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)V", "getIdSessionSettings", "()Lcom/smartengines/id/IdSessionSettings;", "idSession", "Lcom/smartengines/id/IdSession;", "getIdSession", "()Lcom/smartengines/id/IdSession;", "isEnded", "", "()Z", "quadsPrimary", "Lcom/smartengines/visualization/Visualization$Quads;", "quadsSecondary", "visualizations", "", "getVisualizations", "()Ljava/util/List;", "idCallback", "Lcom/smartengines/engine/id/IdCallback;", "getIdCallback", "()Lcom/smartengines/engine/id/IdCallback;", "idResultData", "Lcom/smartengines/engine/id/IdResultData;", "templates", "", "Lcom/smartengines/engine/id/Template;", "processImage", "", "bitmap", "Landroid/graphics/Bitmap;", "delete", "currentResult", "Lcom/smartengines/engine/Result;", "getCurrentResult", "()Lcom/smartengines/engine/Result;", "hasRFID", "docType", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdSessionWrapper implements Session {
    private final IdCallback idCallback;
    private IdResultData idResultData;
    private final IdSession idSession;
    private final IdSessionSettings idSessionSettings;
    private final Visualization.Quads quadsPrimary;
    private final Visualization.Quads quadsSecondary;
    private Map<String, Template> templates;
    private final List<Visualization.Quads> visualizations;

    public IdSessionWrapper(IdEngine idEngine, IdSessionSettings idSessionSettings, String signature) {
        Intrinsics.checkNotNullParameter(idEngine, "idEngine");
        Intrinsics.checkNotNullParameter(idSessionSettings, "idSessionSettings");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.idSessionSettings = idSessionSettings;
        Visualization.Quads quads = new Visualization.Quads(null, 1, null);
        this.quadsPrimary = quads;
        Visualization.Quads quads2 = new Visualization.Quads(null, 1, null);
        this.quadsSecondary = quads2;
        this.visualizations = CollectionsKt.listOf((Object[]) new Visualization.Quads[]{quads, quads2});
        IdCallback idCallback = new IdCallback(new IdSessionWrapper$idCallback$1(quads), new IdSessionWrapper$idCallback$2(quads2));
        this.idCallback = idCallback;
        this.templates = MapsKt.emptyMap();
        this.idSession = idEngine.SpawnSession(idSessionSettings, signature, idCallback);
        Log.w("myapp.IdSessionWrapper", "Session created");
    }

    public final IdSessionSettings getIdSessionSettings() {
        return this.idSessionSettings;
    }

    public final IdSession getIdSession() {
        return this.idSession;
    }

    @Override // com.smartengines.engine.Session
    /* renamed from: isEnded */
    public boolean getIsEnded() {
        return this.idCallback.getIsSessionEnded();
    }

    @Override // com.smartengines.engine.Session
    public List<Visualization.Quads> getVisualizations() {
        return this.visualizations;
    }

    public final IdCallback getIdCallback() {
        return this.idCallback;
    }

    @Override // com.smartengines.engine.Session
    public void processImage(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.quadsPrimary.setFrameSize(UtilsKt.getSize(bitmap));
        this.quadsSecondary.setFrameSize(UtilsKt.getSize(bitmap));
        this.idSession.Process(ImageFactory.INSTANCE.imageFromBitmap(bitmap));
        Map<String, Template> map = this.templates;
        IdResult idResultGetCurrentResult = this.idSession.GetCurrentResult();
        Intrinsics.checkNotNullExpressionValue(idResultGetCurrentResult, "GetCurrentResult(...)");
        this.templates = IdResultParserKt.mergeTemplates(map, IdResultParserKt.parseTemplates(idResultGetCurrentResult));
        IdResult idResultGetCurrentResult2 = this.idSession.GetCurrentResult();
        Intrinsics.checkNotNullExpressionValue(idResultGetCurrentResult2, "GetCurrentResult(...)");
        this.idResultData = IdResultParserKt.parse(idResultGetCurrentResult2, this.templates);
    }

    @Override // com.smartengines.engine.Session
    public void delete() {
        this.idSession.delete();
        Log.w("myapp.IdSessionWrapper", "Session deleted");
    }

    @Override // com.smartengines.engine.Session
    public Result getCurrentResult() {
        return this.idResultData;
    }

    public final boolean hasRFID(String docType) {
        Intrinsics.checkNotNullParameter(docType, "docType");
        return this.idSessionSettings.GetDocumentInfo(docType).SupportedRFID() == 1;
    }
}
