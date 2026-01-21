package com.smartengines.app.p004ui;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.geometry.Rect;
import androidx.compose.p000ui.geometry.Size;
import androidx.compose.p000ui.graphics.ClipOp;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.graphics.drawscope.DrawContext;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.smartengines.app.p004ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CropView.kt */
@Metadata(m513d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002¨\u0006\n"}, m514d2 = {"CropView", "", "(Landroidx/compose/runtime/Composer;I)V", "calculateCropFrame", "Landroidx/compose/ui/geometry/Rect;", "screen", "Landroidx/compose/ui/geometry/Size;", "calculateCropFrame-uvyYCjk", "(J)Landroidx/compose/ui/geometry/Rect;", "Preview", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CropViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CropView$lambda$3(int i, Composer composer, int i2) {
        CropView(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$4(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CropView(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1881152242);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CropView)24@908L510:CropView.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            CanvasKt.Canvas(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new Function1() { // from class: com.smartengines.app.ui.CropViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CropViewKt.CropView$lambda$2((DrawScope) obj);
                }
            }, composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.CropViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CropViewKt.CropView$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CropView$lambda$2(DrawScope Canvas) throws Throwable {
        long j;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        Rect rectM7532calculateCropFrameuvyYCjk = m7532calculateCropFrameuvyYCjk(Canvas.mo5151getSizeNHjbRc());
        float left = rectM7532calculateCropFrameuvyYCjk.getLeft();
        float top = rectM7532calculateCropFrameuvyYCjk.getTop();
        float right = rectM7532calculateCropFrameuvyYCjk.getRight();
        float bottom = rectM7532calculateCropFrameuvyYCjk.getBottom();
        int iM4583getDifferencertfAjoo = ClipOp.INSTANCE.m4583getDifferencertfAjoo();
        DrawContext drawContext = Canvas.getDrawContext();
        long jMo5072getSizeNHjbRc = drawContext.mo5072getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5075clipRectN_I0leg(left, top, right, bottom, iM4583getDifferencertfAjoo);
            try {
                DrawScope.m5145drawRectnJ9OG0$default(Canvas, ColorKt.Color(2281701376L), 0L, 0L, 0.0f, null, null, 0, 126, null);
                drawContext.getCanvas().restore();
                drawContext.mo5073setSizeuvyYCjk(jMo5072getSizeNHjbRc);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                j = jMo5072getSizeNHjbRc;
                drawContext.getCanvas().restore();
                drawContext.mo5073setSizeuvyYCjk(j);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j = jMo5072getSizeNHjbRc;
        }
    }

    /* renamed from: calculateCropFrame-uvyYCjk, reason: not valid java name */
    public static final Rect m7532calculateCropFrameuvyYCjk(long j) {
        float fM4423getWidthimpl = Size.m4423getWidthimpl(j);
        float f = 2;
        float f2 = fM4423getWidthimpl / f;
        float f3 = (fM4423getWidthimpl - fM4423getWidthimpl) / f;
        float fM4420getHeightimpl = (Size.m4420getHeightimpl(j) - f2) / f;
        return new Rect(f3, fM4420getHeightimpl, fM4423getWidthimpl + f3, f2 + fM4420getHeightimpl);
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-603244457);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview)58@2017L96:CropView.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ThemeKt.SmartEnginesTheme(false, ComposableSingletons$CropViewKt.INSTANCE.m7428getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.CropViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CropViewKt.Preview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
