package com.smartengines.engine.doc;

import android.graphics.Bitmap;
import android.util.Log;
import com.smartengines.doc.DocEngine;
import com.smartengines.doc.DocResult;
import com.smartengines.doc.DocSession;
import com.smartengines.doc.DocSessionSettings;
import com.smartengines.engine.ImageFactory;
import com.smartengines.engine.Result;
import com.smartengines.engine.Session;
import com.smartengines.visualization.Visualization;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocSessionWrapper.kt */
@Metadata(m513d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001bH\u0016J\b\u0010$\u001a\u00020!H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00158F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, m514d2 = {"Lcom/smartengines/engine/doc/DocSessionWrapper;", "Lcom/smartengines/engine/Session;", "docEngine", "Lcom/smartengines/doc/DocEngine;", "docSessionSettings", "Lcom/smartengines/doc/DocSessionSettings;", "signature", "", "<init>", "(Lcom/smartengines/doc/DocEngine;Lcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)V", "getDocSessionSettings", "()Lcom/smartengines/doc/DocSessionSettings;", "docSession", "Lcom/smartengines/doc/DocSession;", "getDocSession", "()Lcom/smartengines/doc/DocSession;", "value", "", "isEnded", "()Z", "visualizations", "", "Lcom/smartengines/visualization/Visualization;", "getVisualizations", "()Ljava/util/List;", "_processedImages", "Ljava/util/ArrayList;", "Landroid/graphics/Bitmap;", "processedImages", "getProcessedImages", "_result", "Lcom/smartengines/engine/doc/DocResultData;", "parseResult", "", "processImage", "bitmap", "delete", "currentResult", "Lcom/smartengines/engine/Result;", "getCurrentResult", "()Lcom/smartengines/engine/Result;", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DocSessionWrapper implements Session {
    private final ArrayList<Bitmap> _processedImages;
    private DocResultData _result;
    private final DocSession docSession;
    private final DocSessionSettings docSessionSettings;
    private boolean isEnded;
    private final List<Visualization> visualizations;

    public DocSessionWrapper(DocEngine docEngine, DocSessionSettings docSessionSettings, String signature) {
        Intrinsics.checkNotNullParameter(docEngine, "docEngine");
        Intrinsics.checkNotNullParameter(docSessionSettings, "docSessionSettings");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.docSessionSettings = docSessionSettings;
        this.visualizations = CollectionsKt.emptyList();
        this._processedImages = new ArrayList<>();
        this.docSession = docEngine.SpawnSession(docSessionSettings, signature);
        Log.w("myapp.DocSessionWrapper", "Session created");
    }

    public final DocSessionSettings getDocSessionSettings() {
        return this.docSessionSettings;
    }

    public final DocSession getDocSession() {
        return this.docSession;
    }

    @Override // com.smartengines.engine.Session
    /* renamed from: isEnded, reason: from getter */
    public boolean getIsEnded() {
        return this.isEnded;
    }

    @Override // com.smartengines.engine.Session
    public List<Visualization> getVisualizations() {
        return this.visualizations;
    }

    public final List<Bitmap> getProcessedImages() {
        return this._processedImages;
    }

    private final void parseResult() {
        DocResult docResultGetCurrentResult = this.docSession.GetCurrentResult();
        Intrinsics.checkNotNullExpressionValue(docResultGetCurrentResult, "GetCurrentResult(...)");
        this._result = DocResultNamesFillerKt.fillNames(DocResultParserKt.parse(docResultGetCurrentResult, getProcessedImages()), this.docSessionSettings);
    }

    @Override // com.smartengines.engine.Session
    public void processImage(Bitmap bitmap) {
        List<DocumentData> documents;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.docSession.ProcessImage(ImageFactory.INSTANCE.imageFromBitmap(bitmap), this.docSession.CreateProcessingSettings());
        this._processedImages.add(bitmap);
        this.isEnded = true;
        parseResult();
        StringBuilder sb = new StringBuilder("processImage finished, doc count: ");
        DocResultData docResultData = this._result;
        Log.d("myapp.DocSessionWrapper", sb.append((docResultData == null || (documents = docResultData.getDocuments()) == null) ? null : Integer.valueOf(documents.size())).toString());
    }

    @Override // com.smartengines.engine.Session
    public void delete() {
        this.docSession.delete();
        Log.w("myapp.DocSessionWrapper", "Session deleted");
    }

    @Override // com.smartengines.engine.Session
    public Result getCurrentResult() {
        if (this._result == null) {
            parseResult();
        }
        DocResultData docResultData = this._result;
        Intrinsics.checkNotNull(docResultData);
        return docResultData;
    }
}
