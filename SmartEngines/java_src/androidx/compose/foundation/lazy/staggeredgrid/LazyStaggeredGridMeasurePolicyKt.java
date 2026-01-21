package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p000ui.graphics.GraphicsContext;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.p000ui.unit.Constraints;
import androidx.compose.p000ui.unit.ConstraintsKt;
import androidx.compose.p000ui.unit.IntOffsetKt;
import androidx.compose.p000ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jmrtd.lds.LDSFile;

/* compiled from: LazyStaggeredGridMeasurePolicy.kt */
@Metadata(m513d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u007f\u0010\u0000\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a)\u0010\u001c\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002¢\u0006\u0002\u0010\u001f\u001a)\u0010 \u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002¢\u0006\u0002\u0010\u001f\u001a!\u0010!\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0002¢\u0006\u0002\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m514d2 = {"rememberStaggeredGridMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Lkotlin/ExtensionFunctionType;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "rememberStaggeredGridMeasurePolicy-qKj4JfE", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "afterPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/LayoutDirection;)F", "beforePadding", "startPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F", "foundation_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasurePolicyKt {

    /* compiled from: LazyStaggeredGridMeasurePolicy.kt */
    @Metadata(m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0087 A[PHI: r3
  0x0087: PHI (r3v23 androidx.compose.foundation.gestures.Orientation) = (r3v21 androidx.compose.foundation.gestures.Orientation), (r3v24 androidx.compose.foundation.gestures.Orientation) binds: [B:36:0x0085, B:32:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9 A[PHI: r11
  0x00d9: PHI (r11v18 androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider) = 
  (r11v15 androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider)
  (r11v19 androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider)
 binds: [B:64:0x00d7, B:60:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010e  */
    /* renamed from: rememberStaggeredGridMeasurePolicy-qKj4JfE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m1647rememberStaggeredGridMeasurePolicyqKj4JfE(final LazyStaggeredGridState lazyStaggeredGridState, final Function0<? extends LazyStaggeredGridItemProvider> function0, final PaddingValues paddingValues, final boolean z, Orientation orientation, final float f, float f2, final CoroutineScope coroutineScope, LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, final GraphicsContext graphicsContext, Composer composer, int i) {
        Orientation orientation2;
        boolean z2;
        boolean z3;
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider2;
        boolean zChanged;
        Object objRememberedValue;
        ComposerKt.sourceInformationMarkerStart(composer, 1630140849, "C(rememberStaggeredGridMeasurePolicy)P(9,4!1,7,6,5:c#ui.unit.Dp,2:c#ui.unit.Dp!1,8)50@2173L2923:LazyStaggeredGridMeasurePolicy.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1630140849, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:50)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1650675918, "CC(remember):LazyStaggeredGridMeasurePolicy.kt#9igjgp");
        boolean z4 = false;
        boolean zChanged2 = composer.changed(lazyStaggeredGridState) | ((((i & LDSFile.EF_DG16_TAG) ^ 48) > 32 && composer.changed(function0)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(z)) || (i & 3072) == 2048);
        if (((57344 & i) ^ 24576) > 16384) {
            orientation2 = orientation;
            if (composer.changed(orientation2)) {
                z2 = true;
            }
            boolean z5 = zChanged2 | z2;
            if (((458752 & i) ^ ProfileVerifier.CompilationStatus.f285xf2722a21) > 131072 || !composer.changed(f)) {
                z3 = (196608 & i) != 131072;
            }
            boolean z6 = z5 | z3 | ((((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(f2)) || (i & 1572864) == 1048576);
            if (((234881024 & i) ^ 100663296) <= 67108864) {
                lazyGridStaggeredGridSlotsProvider2 = lazyGridStaggeredGridSlotsProvider;
                if (composer.changed(lazyGridStaggeredGridSlotsProvider2)) {
                    z4 = true;
                }
                zChanged = z6 | z4 | composer.changed(graphicsContext);
                objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Orientation orientation3 = orientation2;
                    final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider3 = lazyGridStaggeredGridSlotsProvider2;
                    objRememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ LazyStaggeredGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                            return m1648invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                        }

                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                        public final LazyStaggeredGridMeasureResult m1648invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
                            long jIntOffset;
                            ObservableScopeInvalidator.m1609attachToScopeimpl(lazyStaggeredGridState.m1653getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                            CheckScrollableContainerConstraintsKt.m1018checkScrollableContainerConstraintsK40F9xA(j, orientation3);
                            LazyStaggeredGridSlots lazyStaggeredGridSlotsMo1629invoke0kLqBqw = lazyGridStaggeredGridSlotsProvider3.mo1629invoke0kLqBqw(lazyLayoutMeasureScope, j);
                            boolean z7 = orientation3 == Orientation.Vertical;
                            LazyStaggeredGridItemProvider lazyStaggeredGridItemProviderInvoke = function0.invoke();
                            int i2 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.beforePadding(paddingValues, orientation3, z, lazyLayoutMeasureScope.getLayoutDirection()));
                            int i3 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.afterPadding(paddingValues, orientation3, z, lazyLayoutMeasureScope.getLayoutDirection()));
                            int i4 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.startPadding(paddingValues, orientation3, lazyLayoutMeasureScope.getLayoutDirection()));
                            int iM7007getMaxHeightimpl = ((z7 ? Constraints.m7007getMaxHeightimpl(j) : Constraints.m7008getMaxWidthimpl(j)) - i2) - i3;
                            if (z7) {
                                jIntOffset = IntOffsetKt.IntOffset(i4, i2);
                            } else {
                                jIntOffset = IntOffsetKt.IntOffset(i2, i4);
                            }
                            long j2 = jIntOffset;
                            PaddingValues paddingValues2 = paddingValues;
                            int i5 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(C1959Dp.m7055constructorimpl(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection())));
                            PaddingValues paddingValues3 = paddingValues;
                            boolean z8 = z7;
                            LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultM1646measureStaggeredGridXtK8cYQ = LazyStaggeredGridMeasureKt.m1646measureStaggeredGridXtK8cYQ(lazyLayoutMeasureScope, lazyStaggeredGridState, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyStaggeredGridItemProviderInvoke, lazyStaggeredGridState.getPinnedItems(), lazyStaggeredGridState.getBeyondBoundsInfo()), lazyStaggeredGridItemProviderInvoke, lazyStaggeredGridSlotsMo1629invoke0kLqBqw, Constraints.m6999copyZbe2FdA$default(j, ConstraintsKt.m7025constrainWidthK40F9xA(j, i5), 0, ConstraintsKt.m7024constrainHeightK40F9xA(j, lazyLayoutMeasureScope.mo1121roundToPx0680j_4(C1959Dp.m7055constructorimpl(paddingValues3.getTop() + paddingValues3.getBottom()))), 0, 10, null), z8, z, j2, iM7007getMaxHeightimpl, lazyLayoutMeasureScope.mo1121roundToPx0680j_4(f), i2, i3, coroutineScope, graphicsContext);
                            LazyStaggeredGridState.applyMeasureResult$foundation_release$default(lazyStaggeredGridState, lazyStaggeredGridMeasureResultM1646measureStaggeredGridXtK8cYQ, false, 2, null);
                            return lazyStaggeredGridMeasureResultM1646measureStaggeredGridXtK8cYQ;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2 = (Function2) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                return function2;
            }
            lazyGridStaggeredGridSlotsProvider2 = lazyGridStaggeredGridSlotsProvider;
            if ((i & 100663296) == 67108864) {
            }
            zChanged = z6 | z4 | composer.changed(graphicsContext);
            objRememberedValue = composer.rememberedValue();
            if (zChanged) {
                final Orientation orientation32 = orientation2;
                final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider32 = lazyGridStaggeredGridSlotsProvider2;
                objRememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ LazyStaggeredGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                        return m1648invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final LazyStaggeredGridMeasureResult m1648invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
                        long jIntOffset;
                        ObservableScopeInvalidator.m1609attachToScopeimpl(lazyStaggeredGridState.m1653getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                        CheckScrollableContainerConstraintsKt.m1018checkScrollableContainerConstraintsK40F9xA(j, orientation32);
                        LazyStaggeredGridSlots lazyStaggeredGridSlotsMo1629invoke0kLqBqw = lazyGridStaggeredGridSlotsProvider32.mo1629invoke0kLqBqw(lazyLayoutMeasureScope, j);
                        boolean z7 = orientation32 == Orientation.Vertical;
                        LazyStaggeredGridItemProvider lazyStaggeredGridItemProviderInvoke = function0.invoke();
                        int i2 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.beforePadding(paddingValues, orientation32, z, lazyLayoutMeasureScope.getLayoutDirection()));
                        int i3 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.afterPadding(paddingValues, orientation32, z, lazyLayoutMeasureScope.getLayoutDirection()));
                        int i4 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.startPadding(paddingValues, orientation32, lazyLayoutMeasureScope.getLayoutDirection()));
                        int iM7007getMaxHeightimpl = ((z7 ? Constraints.m7007getMaxHeightimpl(j) : Constraints.m7008getMaxWidthimpl(j)) - i2) - i3;
                        if (z7) {
                            jIntOffset = IntOffsetKt.IntOffset(i4, i2);
                        } else {
                            jIntOffset = IntOffsetKt.IntOffset(i2, i4);
                        }
                        long j2 = jIntOffset;
                        PaddingValues paddingValues2 = paddingValues;
                        int i5 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(C1959Dp.m7055constructorimpl(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection())));
                        PaddingValues paddingValues3 = paddingValues;
                        boolean z8 = z7;
                        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultM1646measureStaggeredGridXtK8cYQ = LazyStaggeredGridMeasureKt.m1646measureStaggeredGridXtK8cYQ(lazyLayoutMeasureScope, lazyStaggeredGridState, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyStaggeredGridItemProviderInvoke, lazyStaggeredGridState.getPinnedItems(), lazyStaggeredGridState.getBeyondBoundsInfo()), lazyStaggeredGridItemProviderInvoke, lazyStaggeredGridSlotsMo1629invoke0kLqBqw, Constraints.m6999copyZbe2FdA$default(j, ConstraintsKt.m7025constrainWidthK40F9xA(j, i5), 0, ConstraintsKt.m7024constrainHeightK40F9xA(j, lazyLayoutMeasureScope.mo1121roundToPx0680j_4(C1959Dp.m7055constructorimpl(paddingValues3.getTop() + paddingValues3.getBottom()))), 0, 10, null), z8, z, j2, iM7007getMaxHeightimpl, lazyLayoutMeasureScope.mo1121roundToPx0680j_4(f), i2, i3, coroutineScope, graphicsContext);
                        LazyStaggeredGridState.applyMeasureResult$foundation_release$default(lazyStaggeredGridState, lazyStaggeredGridMeasureResultM1646measureStaggeredGridXtK8cYQ, false, 2, null);
                        return lazyStaggeredGridMeasureResultM1646measureStaggeredGridXtK8cYQ;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function22 = (Function2) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return function22;
        }
        orientation2 = orientation;
        if ((i & 24576) != 16384) {
            z2 = false;
        }
        boolean z52 = zChanged2 | z2;
        if (((458752 & i) ^ ProfileVerifier.CompilationStatus.f285xf2722a21) > 131072) {
        }
        if ((196608 & i) != 131072) {
        }
        boolean z62 = z52 | z3 | ((((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(f2)) || (i & 1572864) == 1048576);
        if (((234881024 & i) ^ 100663296) <= 67108864) {
        }
        if ((i & 100663296) == 67108864) {
        }
        zChanged = z62 | z4 | composer.changed(graphicsContext);
        objRememberedValue = composer.rememberedValue();
        if (zChanged) {
        }
        Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function222 = (Function2) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return function222;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float startPadding(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        if (i == 2) {
            return paddingValues.getTop();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float beforePadding(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return z ? paddingValues.getBottom() : paddingValues.getTop();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
        }
        return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float afterPadding(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return z ? paddingValues.getTop() : paddingValues.getBottom();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
    }
}
