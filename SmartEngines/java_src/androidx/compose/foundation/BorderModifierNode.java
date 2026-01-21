package androidx.compose.foundation;

import androidx.compose.p000ui.draw.CacheDrawModifierNode;
import androidx.compose.p000ui.draw.CacheDrawScope;
import androidx.compose.p000ui.draw.DrawModifierKt;
import androidx.compose.p000ui.draw.DrawResult;
import androidx.compose.p000ui.geometry.CornerRadius;
import androidx.compose.p000ui.geometry.OffsetKt;
import androidx.compose.p000ui.geometry.Rect;
import androidx.compose.p000ui.geometry.RoundRectKt;
import androidx.compose.p000ui.geometry.Size;
import androidx.compose.p000ui.geometry.SizeKt;
import androidx.compose.p000ui.graphics.BlendMode;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Canvas;
import androidx.compose.p000ui.graphics.ClipOp;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorFilter;
import androidx.compose.p000ui.graphics.ImageBitmap;
import androidx.compose.p000ui.graphics.ImageBitmapConfig;
import androidx.compose.p000ui.graphics.ImageBitmapKt;
import androidx.compose.p000ui.graphics.Outline;
import androidx.compose.p000ui.graphics.Path;
import androidx.compose.p000ui.graphics.PathOperation;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.graphics.SolidColor;
import androidx.compose.p000ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p000ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p000ui.graphics.drawscope.DrawContext;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.graphics.drawscope.Stroke;
import androidx.compose.p000ui.node.DelegatingNode;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.p000ui.unit.IntSize;
import androidx.compose.p000ui.unit.IntSizeKt;
import androidx.compose.p000ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: Border.kt */
@Metadata(m513d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ,\u0010\u001e\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002JF\u0010'\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R,\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, m514d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "widthParameter", "Landroidx/compose/ui/unit/Dp;", "brushParameter", "Landroidx/compose/ui/graphics/Brush;", "shapeParameter", "Landroidx/compose/ui/graphics/Shape;", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "borderCache", "Landroidx/compose/foundation/BorderCache;", "value", "brush", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "drawWithCacheModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "shape", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "width", "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V", "F", "drawGenericBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "outline", "Landroidx/compose/ui/graphics/Outline$Generic;", "fillArea", "", "strokeWidth", "", "drawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "drawRoundRectBorder-JqoCqck", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "foundation_release"}, m515k = 1, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode {
    public static final int $stable = 8;
    private BorderCache borderCache;
    private Brush brush;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private Shape shape;
    private float width;

    public /* synthetic */ BorderModifierNode(float f, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, shape);
    }

    private BorderModifierNode(float f, Brush brush, Shape shape) {
        this.width = f;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                if (cacheDrawScope.mo1127toPx0680j_4(this.this$0.getWidth()) < 0.0f || Size.m4422getMinDimensionimpl(cacheDrawScope.m4244getSizeNHjbRc()) <= 0.0f) {
                    return BorderKt.drawContentWithoutBorder(cacheDrawScope);
                }
                float f2 = 2;
                float fMin = Math.min(C1959Dp.m7060equalsimpl0(this.this$0.getWidth(), C1959Dp.INSTANCE.m7073getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo1127toPx0680j_4(this.this$0.getWidth())), (float) Math.ceil(Size.m4422getMinDimensionimpl(cacheDrawScope.m4244getSizeNHjbRc()) / f2));
                float f3 = fMin / f2;
                long jOffset = OffsetKt.Offset(f3, f3);
                long jSize = SizeKt.Size(Size.m4423getWidthimpl(cacheDrawScope.m4244getSizeNHjbRc()) - fMin, Size.m4420getHeightimpl(cacheDrawScope.m4244getSizeNHjbRc()) - fMin);
                boolean z = f2 * fMin > Size.m4422getMinDimensionimpl(cacheDrawScope.m4244getSizeNHjbRc());
                Outline outlineMo1038createOutlinePq9zytI = this.this$0.getShape().mo1038createOutlinePq9zytI(cacheDrawScope.m4244getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                if (outlineMo1038createOutlinePq9zytI instanceof Outline.Generic) {
                    BorderModifierNode borderModifierNode = this.this$0;
                    return borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.getBrush(), (Outline.Generic) outlineMo1038createOutlinePq9zytI, z, fMin);
                }
                if (outlineMo1038createOutlinePq9zytI instanceof Outline.Rounded) {
                    BorderModifierNode borderModifierNode2 = this.this$0;
                    return borderModifierNode2.m1007drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode2.getBrush(), (Outline.Rounded) outlineMo1038createOutlinePq9zytI, jOffset, jSize, z, fMin);
                }
                if (outlineMo1038createOutlinePq9zytI instanceof Outline.Rectangle) {
                    return BorderKt.m1004drawRectBorderNsqcLGU(cacheDrawScope, this.this$0.getBrush(), jOffset, jSize, z, fMin);
                }
                throw new NoWhenBranchMatchedException();
            }
        }));
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m1009setWidth0680j_4(float f) {
        if (C1959Dp.m7060equalsimpl0(this.width, f)) {
            return;
        }
        this.width = f;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final void setBrush(Brush brush) {
        if (Intrinsics.areEqual(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final void setShape(Shape shape) {
        if (Intrinsics.areEqual(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARN: Type inference failed for: r21v1, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DrawResult drawGenericBorder(CacheDrawScope cacheDrawScope, final Brush brush, final Outline.Generic generic, boolean z, float f) throws Throwable {
        int iM4816getArgb8888_sVssgQ;
        ColorFilter colorFilterM4636tintxETnrds$default;
        BorderCache borderCache;
        Ref.ObjectRef objectRef;
        ImageBitmap imageBitmap;
        Canvas canvas;
        float f2;
        long j;
        if (z) {
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode.drawGenericBorder.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope contentDrawScope) {
                    contentDrawScope.drawContent();
                    DrawScope.m5140drawPathGBMwjPU$default(contentDrawScope, generic.getPath(), brush, 0.0f, null, null, 0, 60, null);
                }
            });
        }
        if (brush instanceof SolidColor) {
            iM4816getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m4815getAlpha8_sVssgQ();
            colorFilterM4636tintxETnrds$default = ColorFilter.Companion.m4636tintxETnrds$default(ColorFilter.INSTANCE, ((SolidColor) brush).getValue(), 0, 2, null);
        } else {
            iM4816getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m4816getArgb8888_sVssgQ();
            colorFilterM4636tintxETnrds$default = null;
        }
        int i = iM4816getArgb8888_sVssgQ;
        final Rect bounds = generic.getPath().getBounds();
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache2 = this.borderCache;
        Intrinsics.checkNotNull(borderCache2);
        Path pathObtainPath = borderCache2.obtainPath();
        pathObtainPath.reset();
        Path.addRect$default(pathObtainPath, bounds, null, 2, null);
        pathObtainPath.mo4487opN5in7k0(pathObtainPath, generic.getPath(), PathOperation.INSTANCE.m4887getDifferenceb3I0S0c());
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final long jIntSize = IntSizeKt.IntSize((int) Math.ceil(bounds.getWidth()), (int) Math.ceil(bounds.getHeight()));
        BorderCache borderCache3 = this.borderCache;
        Intrinsics.checkNotNull(borderCache3);
        ImageBitmap imageBitmap2 = borderCache3.imageBitmap;
        Canvas canvas2 = borderCache3.canvas;
        ImageBitmapConfig imageBitmapConfigM4808boximpl = imageBitmap2 != null ? ImageBitmapConfig.m4808boximpl(imageBitmap2.mo4462getConfig_sVssgQ()) : null;
        boolean z2 = false;
        if (imageBitmapConfigM4808boximpl == null ? false : ImageBitmapConfig.m4811equalsimpl0(imageBitmapConfigM4808boximpl.m4814unboximpl(), ImageBitmapConfig.INSTANCE.m4816getArgb8888_sVssgQ())) {
            z2 = true;
        } else {
            if (ImageBitmapConfig.m4810equalsimpl(i, imageBitmap2 != null ? ImageBitmapConfig.m4808boximpl(imageBitmap2.mo4462getConfig_sVssgQ()) : null)) {
            }
        }
        if (imageBitmap2 == null || canvas2 == null || Size.m4423getWidthimpl(cacheDrawScope.m4244getSizeNHjbRc()) > imageBitmap2.getWidth() || Size.m4420getHeightimpl(cacheDrawScope.m4244getSizeNHjbRc()) > imageBitmap2.getHeight() || !z2) {
            borderCache = borderCache3;
            objectRef = objectRef2;
            ImageBitmap imageBitmapM4821ImageBitmapx__hDU$default = ImageBitmapKt.m4821ImageBitmapx__hDU$default(IntSize.m7225getWidthimpl(jIntSize), IntSize.m7224getHeightimpl(jIntSize), i, false, null, 24, null);
            borderCache.imageBitmap = imageBitmapM4821ImageBitmapx__hDU$default;
            Canvas Canvas = androidx.compose.p000ui.graphics.CanvasKt.Canvas(imageBitmapM4821ImageBitmapx__hDU$default);
            borderCache.canvas = Canvas;
            imageBitmap = imageBitmapM4821ImageBitmapx__hDU$default;
            canvas = Canvas;
        } else {
            borderCache = borderCache3;
            objectRef = objectRef2;
            canvas = canvas2;
            imageBitmap = imageBitmap2;
        }
        CanvasDrawScope canvasDrawScope = borderCache.canvasDrawScope;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            borderCache.canvasDrawScope = canvasDrawScope;
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        long jM7237toSizeozmzZPI = IntSizeKt.m7237toSizeozmzZPI(jIntSize);
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas3 = drawParams.getCanvas();
        long size = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m5071setSizeuvyYCjk(jM7237toSizeozmzZPI);
        canvas.save();
        CanvasDrawScope canvasDrawScope3 = canvasDrawScope2;
        DrawScope.m5145drawRectnJ9OG0$default(canvasDrawScope3, Color.INSTANCE.m4621getBlack0d7_KjU(), 0L, jM7237toSizeozmzZPI, 0.0f, null, null, BlendMode.INSTANCE.m4510getClear0nO6VwU(), 58, null);
        float f3 = -bounds.getLeft();
        float f4 = -bounds.getTop();
        canvasDrawScope3.getDrawContext().getTransform().translate(f3, f4);
        try {
            final Ref.ObjectRef objectRef3 = objectRef;
            final ColorFilter colorFilter = colorFilterM4636tintxETnrds$default;
            Canvas canvas4 = canvas;
            ?? r21 = imageBitmap;
            f2 = f4;
            try {
                DrawScope.m5140drawPathGBMwjPU$default(canvasDrawScope3, generic.getPath(), brush, 0.0f, new Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                float f5 = 1;
                float fM4423getWidthimpl = (Size.m4423getWidthimpl(canvasDrawScope3.mo5151getSizeNHjbRc()) + f5) / Size.m4423getWidthimpl(canvasDrawScope3.mo5151getSizeNHjbRc());
                float fM4420getHeightimpl = (Size.m4420getHeightimpl(canvasDrawScope3.mo5151getSizeNHjbRc()) + f5) / Size.m4420getHeightimpl(canvasDrawScope3.mo5151getSizeNHjbRc());
                long jMo5150getCenterF1C5BW0 = canvasDrawScope3.mo5150getCenterF1C5BW0();
                DrawContext drawContext = canvasDrawScope3.getDrawContext();
                long jMo5072getSizeNHjbRc = drawContext.mo5072getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo5079scale0AR0LA0(fM4423getWidthimpl, fM4420getHeightimpl, jMo5150getCenterF1C5BW0);
                    j = jMo5072getSizeNHjbRc;
                    try {
                        DrawScope.m5140drawPathGBMwjPU$default(canvasDrawScope3, pathObtainPath, brush, 0.0f, null, null, BlendMode.INSTANCE.m4510getClear0nO6VwU(), 28, null);
                        drawContext.getCanvas().restore();
                        drawContext.mo5073setSizeuvyYCjk(j);
                        canvasDrawScope3.getDrawContext().getTransform().translate(-f3, -f2);
                        canvas4.restore();
                        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
                        drawParams3.setDensity(density);
                        drawParams3.setLayoutDirection(layoutDirection2);
                        drawParams3.setCanvas(canvas3);
                        drawParams3.m5071setSizeuvyYCjk(size);
                        r21.prepareToDraw();
                        objectRef3.element = r21;
                        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode.drawGenericBorder.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) throws Throwable {
                                invoke2(contentDrawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ContentDrawScope contentDrawScope) throws Throwable {
                                float f6;
                                float f7;
                                contentDrawScope.drawContent();
                                ContentDrawScope contentDrawScope2 = contentDrawScope;
                                float left = bounds.getLeft();
                                float top = bounds.getTop();
                                Ref.ObjectRef<ImageBitmap> objectRef4 = objectRef3;
                                long j2 = jIntSize;
                                ColorFilter colorFilter2 = colorFilter;
                                contentDrawScope2.getDrawContext().getTransform().translate(left, top);
                                try {
                                    f6 = left;
                                    try {
                                        DrawScope.m5134drawImageAZ2fEMs$default(contentDrawScope2, objectRef4.element, 0L, j2, 0L, 0L, 0.0f, null, colorFilter2, 0, 0, 890, null);
                                        contentDrawScope2.getDrawContext().getTransform().translate(-f6, -top);
                                    } catch (Throwable th) {
                                        th = th;
                                        f7 = top;
                                        contentDrawScope2.getDrawContext().getTransform().translate(-f6, -f7);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    f6 = left;
                                    f7 = top;
                                }
                            }
                        });
                    } catch (Throwable th) {
                        th = th;
                        drawContext.getCanvas().restore();
                        drawContext.mo5073setSizeuvyYCjk(j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = jMo5072getSizeNHjbRc;
                }
            } catch (Throwable th3) {
                th = th3;
                canvasDrawScope3.getDrawContext().getTransform().translate(-f3, -f2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            f2 = f4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public final DrawResult m1007drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j, final long j2, final boolean z, final float f) {
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long jM4404getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m4404getTopLeftCornerRadiuskKHJgLs();
            final float f2 = f / 2;
            final Stroke stroke = new Stroke(f, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) throws Throwable {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope contentDrawScope) throws Throwable {
                    long j3;
                    contentDrawScope.drawContent();
                    if (z) {
                        DrawScope.m5146drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, jM4404getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                        return;
                    }
                    float fM4329getXimpl = CornerRadius.m4329getXimpl(jM4404getTopLeftCornerRadiuskKHJgLs);
                    float f3 = f2;
                    if (fM4329getXimpl < f3) {
                        ContentDrawScope contentDrawScope2 = contentDrawScope;
                        float f4 = f;
                        float fM4423getWidthimpl = Size.m4423getWidthimpl(contentDrawScope.mo5151getSizeNHjbRc()) - f;
                        float fM4420getHeightimpl = Size.m4420getHeightimpl(contentDrawScope.mo5151getSizeNHjbRc()) - f;
                        int iM4583getDifferencertfAjoo = ClipOp.INSTANCE.m4583getDifferencertfAjoo();
                        Brush brush2 = brush;
                        long j4 = jM4404getTopLeftCornerRadiuskKHJgLs;
                        DrawContext drawContext = contentDrawScope2.getDrawContext();
                        long jMo5072getSizeNHjbRc = drawContext.mo5072getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        try {
                            drawContext.getTransform().mo5075clipRectN_I0leg(f4, f4, fM4423getWidthimpl, fM4420getHeightimpl, iM4583getDifferencertfAjoo);
                        } catch (Throwable th) {
                            th = th;
                            j3 = jMo5072getSizeNHjbRc;
                        }
                        try {
                            DrawScope.m5146drawRoundRectZuiqVtQ$default(contentDrawScope2, brush2, 0L, 0L, j4, 0.0f, null, null, 0, 246, null);
                            drawContext.getCanvas().restore();
                            drawContext.mo5073setSizeuvyYCjk(jMo5072getSizeNHjbRc);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            j3 = jMo5072getSizeNHjbRc;
                            drawContext.getCanvas().restore();
                            drawContext.mo5073setSizeuvyYCjk(j3);
                            throw th;
                        }
                    }
                    DrawScope.m5146drawRoundRectZuiqVtQ$default(contentDrawScope, brush, j, j2, BorderKt.m1005shrinkKibmq7A(jM4404getTopLeftCornerRadiuskKHJgLs, f3), 0.0f, stroke, null, 0, 208, null);
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        final Path pathCreateRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f, z);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m5140drawPathGBMwjPU$default(contentDrawScope, pathCreateRoundRectPath, brush, 0.0f, null, null, 0, 60, null);
            }
        });
    }
}
