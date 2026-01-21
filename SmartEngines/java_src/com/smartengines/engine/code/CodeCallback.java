package com.smartengines.engine.code;

import android.util.Log;
import com.smartengines.code.CodeEngineFeedbackContainer;
import com.smartengines.code.CodeEngineVisualizationFeedback;
import com.smartengines.common.Quadrangle;
import com.smartengines.common.QuadranglesMapIterator;
import com.smartengines.engine.EngineUtilsKt;
import com.smartengines.visualization.Quad;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CodeCallback.kt */
@Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B=\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u001a\u0010\u0007\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R#\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR%\u0010\u0007\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0010"}, m514d2 = {"Lcom/smartengines/engine/code/CodeCallback;", "Lcom/smartengines/code/CodeEngineVisualizationFeedback;", "onQuads", "Lkotlin/Function1;", "", "Lcom/smartengines/visualization/Quad;", "", "onRoi", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnQuads", "()Lkotlin/jvm/functions/Function1;", "getOnRoi", "FeedbackReceived", "feedbackContainer", "Lcom/smartengines/code/CodeEngineFeedbackContainer;", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CodeCallback extends CodeEngineVisualizationFeedback {
    private final Function1<Set<Quad>, Unit> onQuads;
    private final Function1<Set<Quad>, Unit> onRoi;

    public final Function1<Set<Quad>, Unit> getOnQuads() {
        return this.onQuads;
    }

    public final Function1<Set<Quad>, Unit> getOnRoi() {
        return this.onRoi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CodeCallback(Function1<? super Set<Quad>, Unit> onQuads, Function1<? super Set<Quad>, Unit> function1) {
        Intrinsics.checkNotNullParameter(onQuads, "onQuads");
        this.onQuads = onQuads;
        this.onRoi = function1;
    }

    @Override // com.smartengines.code.CodeEngineVisualizationFeedback
    public void FeedbackReceived(CodeEngineFeedbackContainer feedbackContainer) {
        Intrinsics.checkNotNullParameter(feedbackContainer, "feedbackContainer");
        Log.d("myapp.CodeCallback", "===> FeedbackReceived");
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        try {
            QuadranglesMapIterator quadranglesMapIteratorQuadranglesBegin = feedbackContainer.QuadranglesBegin();
            while (!quadranglesMapIteratorQuadranglesBegin.Equals(feedbackContainer.QuadranglesEnd())) {
                String strGetKey = quadranglesMapIteratorQuadranglesBegin.GetKey();
                Intrinsics.checkNotNull(strGetKey);
                if (StringsKt.startsWith$default(strGetKey, "roi", false, 2, (Object) null)) {
                    Quadrangle quadrangleGetValue = quadranglesMapIteratorQuadranglesBegin.GetValue();
                    Intrinsics.checkNotNullExpressionValue(quadrangleGetValue, "GetValue(...)");
                    hashSet2.add(EngineUtilsKt.toQuad(quadrangleGetValue));
                } else {
                    Quadrangle quadrangleGetValue2 = quadranglesMapIteratorQuadranglesBegin.GetValue();
                    Intrinsics.checkNotNullExpressionValue(quadrangleGetValue2, "GetValue(...)");
                    hashSet.add(EngineUtilsKt.toQuad(quadrangleGetValue2));
                }
                quadranglesMapIteratorQuadranglesBegin.Advance();
            }
        } catch (Exception e) {
            Log.e("myapp.CodeCallback", "quads calculation error " + e.getMessage());
            e.printStackTrace();
        }
        this.onQuads.invoke(hashSet);
        Function1<Set<Quad>, Unit> function1 = this.onRoi;
        if (function1 != null) {
            function1.invoke(hashSet2);
        }
    }
}
