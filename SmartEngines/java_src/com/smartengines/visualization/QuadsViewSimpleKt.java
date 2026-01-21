package com.smartengines.visualization;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuadsViewSimple.kt */
@Metadata(m513d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a-\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, m514d2 = {"QuadsViewSimple", "", "frames", "", "Lcom/smartengines/visualization/QuadFrame;", "lineColor", "Landroidx/compose/ui/graphics/Color;", "lineWidth", "", "QuadsViewSimple-iJQMabo", "(Ljava/util/List;JFLandroidx/compose/runtime/Composer;I)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "visualization_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class QuadsViewSimpleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$6(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuadsViewSimple_iJQMabo$lambda$3(List frames, long j, float f, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(frames, "$frames");
        m7843QuadsViewSimpleiJQMabo(frames, j, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: QuadsViewSimple-iJQMabo, reason: not valid java name */
    public static final void m7843QuadsViewSimpleiJQMabo(final List<QuadFrame> frames, final long j, final float f, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(frames, "frames");
        Composer composerStartRestartGroup = composer.startRestartGroup(810839868);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(QuadsViewSimple)P(!1,1:c#ui.graphics.Color)21@633L226:QuadsViewSimple.kt#hal2ob");
        CanvasKt.Canvas(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new Function1() { // from class: com.smartengines.visualization.QuadsViewSimpleKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuadsViewSimpleKt.QuadsViewSimple_iJQMabo$lambda$2(frames, j, f, (DrawScope) obj);
            }
        }, composerStartRestartGroup, 6);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.visualization.QuadsViewSimpleKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuadsViewSimpleKt.QuadsViewSimple_iJQMabo$lambda$3(frames, j, f, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuadsViewSimple_iJQMabo$lambda$2(List frames, long j, float f, DrawScope Canvas) throws Throwable {
        Intrinsics.checkNotNullParameter(frames, "$frames");
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        Iterator it = frames.iterator();
        while (it.hasNext()) {
            QuadFrame quadFrame = (QuadFrame) it.next();
            Iterator<T> it2 = quadFrame.getQuads().iterator();
            while (it2.hasNext()) {
                QuadDrawingKt.m7840drawQuadPointsXOJAsU(((Quad) it2.next()).getPoints(), quadFrame.getImageSize(), j, f, Canvas);
            }
        }
        return Unit.INSTANCE;
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-307746990);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview)35@1084L29,36@1132L31,37@1168L42,38@1215L39:QuadsViewSimple.kt#hal2ob");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startReplaceGroup(-1177519646);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):QuadsViewSimple.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = MockKt.getMockQuadsPrimary();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            List list = (List) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1177518108);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):QuadsViewSimple.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = MockKt.getMockQuadsSecondary();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            m7843QuadsViewSimpleiJQMabo(list, Color.INSTANCE.m4626getGreen0d7_KjU(), 12.0f, composerStartRestartGroup, 440);
            m7843QuadsViewSimpleiJQMabo((List) objRememberedValue2, Color.INSTANCE.m4629getRed0d7_KjU(), 8.0f, composerStartRestartGroup, 440);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.visualization.QuadsViewSimpleKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuadsViewSimpleKt.Preview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
