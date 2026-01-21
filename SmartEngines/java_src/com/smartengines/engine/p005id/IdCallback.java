package com.smartengines.engine.p005id;

import android.util.Log;
import com.smartengines.common.Quadrangle;
import com.smartengines.common.QuadranglesMapIterator;
import com.smartengines.engine.EngineUtilsKt;
import com.smartengines.p006id.IdFeedback;
import com.smartengines.p006id.IdFeedbackContainer;
import com.smartengines.p006id.IdResult;
import com.smartengines.p006id.IdTemplateDetectionResult;
import com.smartengines.p006id.IdTemplateSegmentationResult;
import com.smartengines.visualization.Quad;
import com.smartengines.visualization.QuadPoint;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* compiled from: IdCallback.kt */
@Metadata(m513d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0011H\u0016J\b\u0010 \u001a\u00020\u0006H\u0016R#\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m514d2 = {"Lcom/smartengines/engine/id/IdCallback;", "Lcom/smartengines/id/IdFeedback;", "onDetection", "Lkotlin/Function1;", "", "Lcom/smartengines/visualization/Quad;", "", "onSegmentation", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnDetection", "()Lkotlin/jvm/functions/Function1;", "getOnSegmentation", "value", "", "isSessionEnded", "()Z", "Lcom/smartengines/id/IdResult;", "idResult", "getIdResult", "()Lcom/smartengines/id/IdResult;", "FeedbackReceived", "p0", "Lcom/smartengines/id/IdFeedbackContainer;", "TemplateDetectionResultReceived", "detectionResult", "Lcom/smartengines/id/IdTemplateDetectionResult;", "TemplateSegmentationResultReceived", "segmentationResult", "Lcom/smartengines/id/IdTemplateSegmentationResult;", "ResultReceived", "result", "SessionEnded", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdCallback extends IdFeedback {
    private IdResult idResult;
    private boolean isSessionEnded;
    private final Function1<Set<Quad>, Unit> onDetection;
    private final Function1<Set<Quad>, Unit> onSegmentation;

    @Override // com.smartengines.p006id.IdFeedback
    public void FeedbackReceived(IdFeedbackContainer p0) {
    }

    public final Function1<Set<Quad>, Unit> getOnDetection() {
        return this.onDetection;
    }

    public final Function1<Set<Quad>, Unit> getOnSegmentation() {
        return this.onSegmentation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IdCallback(Function1<? super Set<Quad>, Unit> onDetection, Function1<? super Set<Quad>, Unit> onSegmentation) {
        Intrinsics.checkNotNullParameter(onDetection, "onDetection");
        Intrinsics.checkNotNullParameter(onSegmentation, "onSegmentation");
        this.onDetection = onDetection;
        this.onSegmentation = onSegmentation;
    }

    /* renamed from: isSessionEnded, reason: from getter */
    public final boolean getIsSessionEnded() {
        return this.isSessionEnded;
    }

    public final IdResult getIdResult() {
        return this.idResult;
    }

    @Override // com.smartengines.p006id.IdFeedback
    public void TemplateDetectionResultReceived(IdTemplateDetectionResult detectionResult) {
        String strGetAttribute;
        Intrinsics.checkNotNullParameter(detectionResult, "detectionResult");
        String strGetTemplateName = detectionResult.GetTemplateName();
        HashSet hashSet = new HashSet();
        try {
            Quadrangle quadrangleGetQuadrangle = detectionResult.GetQuadrangle();
            Intrinsics.checkNotNullExpressionValue(quadrangleGetQuadrangle, "GetQuadrangle(...)");
            hashSet.add(EngineUtilsKt.toQuad(quadrangleGetQuadrangle));
            if (detectionResult.HasAttribute("document_presenter_face_quad")) {
                strGetAttribute = detectionResult.GetAttribute("document_presenter_face_quad");
            } else {
                strGetAttribute = detectionResult.HasAttribute("document_presenter_face_rect") ? detectionResult.GetAttribute("document_presenter_face_rect") : null;
            }
            if (strGetAttribute != null) {
                Log.d("myapp.IdCallback", "   ---> face: " + strGetAttribute);
                JSONArray jSONArray = new JSONArray(strGetAttribute);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < 4; i++) {
                    JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(i);
                    arrayList.add(new QuadPoint(jSONArrayOptJSONArray.getInt(0), jSONArrayOptJSONArray.getInt(1)));
                }
                hashSet.add(new Quad(arrayList));
            }
            Log.d("myapp.IdCallback", "   ---> TemplateDetectionResultReceived " + strGetTemplateName + ", quads: " + hashSet.size());
            this.onDetection.invoke(hashSet);
        } catch (Exception e) {
            Log.e("myapp.IdCallback", "   ---> TemplateDetectionResultReceived " + strGetTemplateName, e);
        }
    }

    @Override // com.smartengines.p006id.IdFeedback
    public void TemplateSegmentationResultReceived(IdTemplateSegmentationResult segmentationResult) {
        Intrinsics.checkNotNullParameter(segmentationResult, "segmentationResult");
        HashSet hashSet = new HashSet();
        try {
            QuadranglesMapIterator quadranglesMapIteratorRawFieldQuadranglesBegin = segmentationResult.RawFieldQuadranglesBegin();
            while (!quadranglesMapIteratorRawFieldQuadranglesBegin.Equals(segmentationResult.RawFieldQuadranglesEnd())) {
                Quadrangle quadrangleGetValue = quadranglesMapIteratorRawFieldQuadranglesBegin.GetValue();
                Intrinsics.checkNotNullExpressionValue(quadrangleGetValue, "GetValue(...)");
                hashSet.add(EngineUtilsKt.toQuad(quadrangleGetValue));
                quadranglesMapIteratorRawFieldQuadranglesBegin.Advance();
            }
            if (hashSet.isEmpty()) {
                Log.d("myapp.IdCallback", "   ---> TemplateSegmentationResultReceived size: 0 => ignored");
            } else {
                Log.d("myapp.IdCallback", "   ---> TemplateSegmentationResultReceived size: " + hashSet.size());
                this.onSegmentation.invoke(hashSet);
            }
        } catch (Exception e) {
            Log.e("myapp.IdCallback", "   ---> TemplateSegmentationResultReceived", e);
        }
    }

    @Override // com.smartengines.p006id.IdFeedback
    public void ResultReceived(IdResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Log.d("myapp.IdCallback", "   ---> ResultReceived isTerminal=" + result.GetIsTerminal());
        this.idResult = result;
    }

    @Override // com.smartengines.p006id.IdFeedback
    public void SessionEnded() {
        Log.e("myapp.IdCallback", "   ---> SessionEnded");
        this.isSessionEnded = true;
    }
}
