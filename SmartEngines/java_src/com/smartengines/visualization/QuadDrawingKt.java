package com.smartengines.visualization;

import android.util.Size;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.geometry.OffsetKt;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuadDrawing.kt */
@Metadata(m513d1 = {"\u00008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m514d2 = {"drawQuadPoints", "", "quadPoints", "", "Lcom/smartengines/visualization/QuadPoint;", "field", "Landroid/util/Size;", "color", "Landroidx/compose/ui/graphics/Color;", "lineWidth", "scope", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawQuadPoints-XO-JAsU", "(Ljava/util/List;Landroid/util/Size;JFLandroidx/compose/ui/graphics/drawscope/DrawScope;)F", "offset", "Landroidx/compose/ui/geometry/Offset;", "scale", "(Lcom/smartengines/visualization/QuadPoint;F)J", "Preview", "", "(Landroidx/compose/runtime/Composer;I)V", "visualization_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class QuadDrawingKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$13(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: drawQuadPoints-XO-JAsU, reason: not valid java name */
    public static final float m7840drawQuadPointsXOJAsU(List<QuadPoint> list, Size field, long j, float f, DrawScope drawScope) throws Throwable {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        Intrinsics.checkNotNullParameter(field, "field");
        DrawScope scope = drawScope;
        Intrinsics.checkNotNullParameter(scope, "scope");
        float fMin = Math.min(androidx.compose.p000ui.geometry.Size.m4423getWidthimpl(scope.mo5151getSizeNHjbRc()) / field.getWidth(), androidx.compose.p000ui.geometry.Size.m4420getHeightimpl(scope.mo5151getSizeNHjbRc()) / field.getHeight());
        float f7 = 2;
        float fM4423getWidthimpl = (androidx.compose.p000ui.geometry.Size.m4423getWidthimpl(scope.mo5151getSizeNHjbRc()) - (field.getWidth() * fMin)) / f7;
        float fM4420getHeightimpl = (androidx.compose.p000ui.geometry.Size.m4420getHeightimpl(scope.mo5151getSizeNHjbRc()) - (field.getHeight() * fMin)) / f7;
        scope.getDrawContext().getTransform().translate(fM4423getWidthimpl, fM4420getHeightimpl);
        if (list != null) {
            try {
                int i = 1;
                try {
                    if (list.size() > 1) {
                        int size = list.size();
                        while (i < size) {
                            int i2 = i;
                            int i3 = size;
                            float f8 = fM4420getHeightimpl;
                            float f9 = fM4423getWidthimpl;
                            DrawScope.m5137drawLineNGM6Ib0$default(scope, j, offset(list.get(i - 1), fMin), offset(list.get(i), fMin), f, 0, null, 0.0f, null, 0, 496, null);
                            i = i2 + 1;
                            scope = drawScope;
                            size = i3;
                            fM4423getWidthimpl = f9;
                            fM4420getHeightimpl = f8;
                        }
                        f4 = fM4420getHeightimpl;
                        f5 = fM4423getWidthimpl;
                        DrawScope.m5137drawLineNGM6Ib0$default(drawScope, j, offset((QuadPoint) CollectionsKt.first((List) list), fMin), offset((QuadPoint) CollectionsKt.last((List) list), fMin), f, 0, null, 0.0f, null, 0, 496, null);
                    } else {
                        f4 = fM4420getHeightimpl;
                        f5 = fM4423getWidthimpl;
                        if (list.size() == 1) {
                            DrawScope.m5132drawCircleVaOC9Bg$default(drawScope, j, f, offset((QuadPoint) CollectionsKt.first((List) list), fMin), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                        }
                    }
                    fM4423getWidthimpl = f5;
                    f6 = f4;
                } catch (Throwable th) {
                    th = th;
                    drawScope.getDrawContext().getTransform().translate(-f3, -f2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                f2 = fM4420getHeightimpl;
                f3 = fM4423getWidthimpl;
            }
        } else {
            f6 = fM4420getHeightimpl;
        }
        drawScope.getDrawContext().getTransform().translate(-fM4423getWidthimpl, -f6);
        return fMin;
    }

    private static final long offset(QuadPoint quadPoint, float f) {
        return OffsetKt.Offset(quadPoint.getX() * f, quadPoint.getY() * f);
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1055960354);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview)72@2531L29,73@2579L31,74@2629L34,75@2668L565:QuadDrawing.kt#hal2ob");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startReplaceGroup(-1177473342);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):QuadDrawing.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = MockKt.getMockQuadsPrimary();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final List list = (List) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1177471804);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):QuadDrawing.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = MockKt.getMockQuadsSecondary();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final List list2 = (List) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1177470201);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):QuadDrawing.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = MockKt.getMockQuadsSinglePoints();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final List list3 = (List) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new Function1() { // from class: com.smartengines.visualization.QuadDrawingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return QuadDrawingKt.Preview$lambda$12(list, list2, list3, (DrawScope) obj);
                }
            }, composerStartRestartGroup, 6);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.visualization.QuadDrawingKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuadDrawingKt.Preview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$12(List frames1, List frames2, List frames3, DrawScope Canvas) throws Throwable {
        Intrinsics.checkNotNullParameter(frames1, "$frames1");
        Intrinsics.checkNotNullParameter(frames2, "$frames2");
        Intrinsics.checkNotNullParameter(frames3, "$frames3");
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        Iterator it = frames1.iterator();
        while (it.hasNext()) {
            QuadFrame quadFrame = (QuadFrame) it.next();
            Iterator<T> it2 = quadFrame.getQuads().iterator();
            while (it2.hasNext()) {
                m7840drawQuadPointsXOJAsU(((Quad) it2.next()).getPoints(), quadFrame.getImageSize(), Color.INSTANCE.m4629getRed0d7_KjU(), 8.0f, Canvas);
            }
        }
        Iterator it3 = frames2.iterator();
        while (it3.hasNext()) {
            QuadFrame quadFrame2 = (QuadFrame) it3.next();
            Iterator<T> it4 = quadFrame2.getQuads().iterator();
            while (it4.hasNext()) {
                m7840drawQuadPointsXOJAsU(((Quad) it4.next()).getPoints(), quadFrame2.getImageSize(), Color.INSTANCE.m4622getBlue0d7_KjU(), 8.0f, Canvas);
            }
        }
        Iterator it5 = frames3.iterator();
        while (it5.hasNext()) {
            QuadFrame quadFrame3 = (QuadFrame) it5.next();
            Iterator<T> it6 = quadFrame3.getQuads().iterator();
            while (it6.hasNext()) {
                m7840drawQuadPointsXOJAsU(((Quad) it6.next()).getPoints(), quadFrame3.getImageSize(), Color.INSTANCE.m4633getYellow0d7_KjU(), 8.0f, Canvas);
            }
        }
        return Unit.INSTANCE;
    }
}
