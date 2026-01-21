package androidx.compose.p000ui.graphics.drawscope;

import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.geometry.Size;
import androidx.compose.p000ui.geometry.SizeKt;
import androidx.compose.p000ui.graphics.Canvas;
import androidx.compose.p000ui.graphics.InlineClassHelperKt;
import androidx.compose.p000ui.graphics.Path;
import kotlin.Metadata;

/* compiled from: CanvasDrawScope.kt */
@Metadata(m513d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m514d2 = {"asDrawTransform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class CanvasDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt.asDrawTransform.1
            @Override // androidx.compose.p000ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc, reason: not valid java name */
            public long mo5077getSizeNHjbRc() {
                return drawContext.mo5072getSizeNHjbRc();
            }

            @Override // androidx.compose.p000ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public long mo5076getCenterF1C5BW0() {
                return SizeKt.m4433getCenteruvyYCjk(mo5077getSizeNHjbRc());
            }

            @Override // androidx.compose.p000ui.graphics.drawscope.DrawTransform
            public void inset(float left, float top, float right, float bottom) {
                Canvas canvas = drawContext.getCanvas();
                DrawContext drawContext2 = drawContext;
                long jSize = SizeKt.Size(Size.m4423getWidthimpl(mo5077getSizeNHjbRc()) - (right + left), Size.m4420getHeightimpl(mo5077getSizeNHjbRc()) - (bottom + top));
                if (!(Size.m4423getWidthimpl(jSize) >= 0.0f && Size.m4420getHeightimpl(jSize) >= 0.0f)) {
                    InlineClassHelperKt.throwIllegalArgumentException("Width and height must be greater than or equal to zero");
                }
                drawContext2.mo5073setSizeuvyYCjk(jSize);
                canvas.translate(left, top);
            }

            @Override // androidx.compose.p000ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg, reason: not valid java name */
            public void mo5075clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
                drawContext.getCanvas().mo4449clipRectN_I0leg(left, top, right, bottom, clipOp);
            }

            @Override // androidx.compose.p000ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public void mo5074clipPathmtrdDE(Path path, int clipOp) {
                drawContext.getCanvas().mo4448clipPathmtrdDE(path, clipOp);
            }

            @Override // androidx.compose.p000ui.graphics.drawscope.DrawTransform
            public void translate(float left, float top) {
                drawContext.getCanvas().translate(left, top);
            }

            @Override // androidx.compose.p000ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public void mo5078rotateUv8p0NA(float degrees, long pivot) {
                Canvas canvas = drawContext.getCanvas();
                canvas.translate(Offset.m4354getXimpl(pivot), Offset.m4355getYimpl(pivot));
                canvas.rotate(degrees);
                canvas.translate(-Offset.m4354getXimpl(pivot), -Offset.m4355getYimpl(pivot));
            }

            @Override // androidx.compose.p000ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0, reason: not valid java name */
            public void mo5079scale0AR0LA0(float scaleX, float scaleY, long pivot) {
                Canvas canvas = drawContext.getCanvas();
                canvas.translate(Offset.m4354getXimpl(pivot), Offset.m4355getYimpl(pivot));
                canvas.scale(scaleX, scaleY);
                canvas.translate(-Offset.m4354getXimpl(pivot), -Offset.m4355getYimpl(pivot));
            }

            @Override // androidx.compose.p000ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc, reason: not valid java name */
            public void mo5080transform58bKbWc(float[] matrix) {
                drawContext.getCanvas().mo4450concat58bKbWc(matrix);
            }
        };
    }
}
