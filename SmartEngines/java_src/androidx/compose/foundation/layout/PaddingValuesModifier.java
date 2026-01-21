package androidx.compose.foundation.layout;

import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.Measurable;
import androidx.compose.p000ui.layout.MeasureResult;
import androidx.compose.p000ui.layout.MeasureScope;
import androidx.compose.p000ui.layout.Placeable;
import androidx.compose.p000ui.node.LayoutModifierNode;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.p000ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: Padding.kt */
@Metadata(m513d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J&\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m514d2 = {"Landroidx/compose/foundation/layout/PaddingValuesModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "getPaddingValues", "()Landroidx/compose/foundation/layout/PaddingValues;", "setPaddingValues", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, m515k = 1, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {
    private PaddingValues paddingValues;

    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    public final void setPaddingValues(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    public PaddingValuesModifier(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.p000ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo845measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j) {
        float f = 0;
        if (C1959Dp.m7054compareTo0680j_4(this.paddingValues.mo1386calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection()), C1959Dp.m7055constructorimpl(f)) < 0 || C1959Dp.m7054compareTo0680j_4(this.paddingValues.getTop(), C1959Dp.m7055constructorimpl(f)) < 0 || C1959Dp.m7054compareTo0680j_4(this.paddingValues.mo1387calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()), C1959Dp.m7055constructorimpl(f)) < 0 || C1959Dp.m7054compareTo0680j_4(this.paddingValues.getBottom(), C1959Dp.m7055constructorimpl(f)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
        int i = measureScope.mo1121roundToPx0680j_4(this.paddingValues.mo1386calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope.mo1121roundToPx0680j_4(this.paddingValues.mo1387calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()));
        int i2 = measureScope.mo1121roundToPx0680j_4(this.paddingValues.getTop()) + measureScope.mo1121roundToPx0680j_4(this.paddingValues.getBottom());
        final Placeable placeableMo5931measureBRTryo0 = measurable.mo5931measureBRTryo0(ConstraintsKt.m7027offsetNN6EwU(j, -i, -i2));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m7025constrainWidthK40F9xA(j, placeableMo5931measureBRTryo0.getWidth() + i), ConstraintsKt.m7024constrainHeightK40F9xA(j, placeableMo5931measureBRTryo0.getHeight() + i2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo5931measureBRTryo0, measureScope.mo1121roundToPx0680j_4(this.getPaddingValues().mo1386calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())), measureScope.mo1121roundToPx0680j_4(this.getPaddingValues().getTop()), 0.0f, 4, null);
            }
        }, 4, null);
    }
}
