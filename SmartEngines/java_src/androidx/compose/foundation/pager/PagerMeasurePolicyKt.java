package androidx.compose.foundation.pager;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.layout.MeasureResult;
import androidx.compose.p000ui.layout.Placeable;
import androidx.compose.p000ui.unit.Constraints;
import androidx.compose.p000ui.unit.ConstraintsKt;
import androidx.compose.p000ui.unit.IntOffsetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.jmrtd.lds.LDSFile;

/* compiled from: PagerMeasurePolicy.kt */
@Metadata(m513d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¡\u0001\u0010\u0000\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, m514d2 = {"rememberPagerMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "state", "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "beyondViewportPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "pageCount", "rememberPagerMeasurePolicy-8u0NR3k", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class PagerMeasurePolicyKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0141 A[PHI: r3
  0x0141: PHI (r3v22 int) = (r3v20 int), (r3v23 int) binds: [B:104:0x013f, B:100:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081 A[PHI: r4
  0x0081: PHI (r4v19 androidx.compose.foundation.gestures.Orientation) = (r4v17 androidx.compose.foundation.gestures.Orientation), (r4v20 androidx.compose.foundation.gestures.Orientation) binds: [B:36:0x007f, B:32:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d A[PHI: r9
  0x009d: PHI (r9v11 androidx.compose.ui.Alignment$Horizontal) = (r9v8 androidx.compose.ui.Alignment$Horizontal), (r9v12 androidx.compose.ui.Alignment$Horizontal) binds: [B:46:0x009b, B:42:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9 A[PHI: r12
  0x00b9: PHI (r12v12 androidx.compose.ui.Alignment$Vertical) = (r12v9 androidx.compose.ui.Alignment$Vertical), (r12v13 androidx.compose.ui.Alignment$Vertical) binds: [B:56:0x00b7, B:52:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5 A[PHI: r13
  0x00d5: PHI (r13v12 float) = (r13v9 float), (r13v13 float) binds: [B:66:0x00d3, B:62:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1 A[PHI: r14
  0x00f1: PHI (r14v12 androidx.compose.foundation.pager.PageSize) = (r14v9 androidx.compose.foundation.pager.PageSize), (r14v13 androidx.compose.foundation.pager.PageSize) binds: [B:76:0x00ef, B:72:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010b A[PHI: r5
  0x010b: PHI (r5v8 androidx.compose.foundation.gestures.snapping.SnapPosition) = 
  (r5v6 androidx.compose.foundation.gestures.snapping.SnapPosition)
  (r5v9 androidx.compose.foundation.gestures.snapping.SnapPosition)
 binds: [B:86:0x0109, B:82:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012f  */
    /* renamed from: rememberPagerMeasurePolicy-8u0NR3k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> m1678rememberPagerMeasurePolicy8u0NR3k(final Function0<PagerLazyLayoutItemProvider> function0, final PagerState pagerState, final PaddingValues paddingValues, final boolean z, Orientation orientation, int i, float f, PageSize pageSize, Alignment.Horizontal horizontal, Alignment.Vertical vertical, SnapPosition snapPosition, final CoroutineScope coroutineScope, final Function0<Integer> function02, Composer composer, int i2, int i3) {
        Orientation orientation2;
        boolean z2;
        Alignment.Horizontal horizontal2;
        boolean z3;
        Alignment.Vertical vertical2;
        boolean z4;
        float f2;
        boolean z5;
        PageSize pageSize2;
        boolean z6;
        SnapPosition snapPosition2;
        boolean z7;
        int i4;
        boolean z8;
        boolean zChanged;
        Object objRememberedValue;
        ComposerKt.sourceInformationMarkerStart(composer, 1391419623, "C(rememberPagerMeasurePolicy)P(4,11,1,9,5!1,8:c#ui.unit.Dp,7,3,12,10)56@2301L6278:PagerMeasurePolicy.kt#g6yjnt");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1391419623, i2, i3, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:56)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 35232261, "CC(remember):PagerMeasurePolicy.kt#9igjgp");
        boolean z9 = ((((i2 & LDSFile.EF_DG16_TAG) ^ 48) > 32 && composer.changed(pagerState)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.changed(z)) || (i2 & 3072) == 2048);
        if (((57344 & i2) ^ 24576) > 16384) {
            orientation2 = orientation;
            if (composer.changed(orientation2)) {
                z2 = true;
            }
            boolean z10 = z9 | z2;
            if (((234881024 & i2) ^ 100663296) <= 67108864) {
                horizontal2 = horizontal;
                if (composer.changed(horizontal2)) {
                    z3 = true;
                }
                boolean z11 = z10 | z3;
                if (((1879048192 & i2) ^ 805306368) > 536870912) {
                    vertical2 = vertical;
                    if (composer.changed(vertical2)) {
                        z4 = true;
                    }
                    boolean z12 = z11 | z4;
                    if (((3670016 & i2) ^ 1572864) <= 1048576) {
                        f2 = f;
                        if (composer.changed(f2)) {
                            z5 = true;
                        }
                        boolean z13 = z12 | z5;
                        if (((29360128 & i2) ^ 12582912) > 8388608) {
                            pageSize2 = pageSize;
                            if (composer.changed(pageSize2)) {
                                z6 = true;
                            }
                            boolean z14 = z13 | z6;
                            if (((i3 & 14) ^ 6) <= 4) {
                                snapPosition2 = snapPosition;
                                if (composer.changed(snapPosition2)) {
                                    z7 = true;
                                }
                                boolean z15 = ((((i3 & 896) ^ 384) > 256 && composer.changed(function02)) || (i3 & 384) == 256) | z14 | z7;
                                if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.f285xf2722a21) > 131072) {
                                    i4 = i;
                                    if (composer.changed(i4)) {
                                        z8 = true;
                                    }
                                    zChanged = z15 | z8 | composer.changed(coroutineScope);
                                    objRememberedValue = composer.rememberedValue();
                                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        final int i5 = i4;
                                        final SnapPosition snapPosition3 = snapPosition2;
                                        final Alignment.Horizontal horizontal3 = horizontal2;
                                        final Alignment.Vertical vertical3 = vertical2;
                                        final float f3 = f2;
                                        final PageSize pageSize3 = pageSize2;
                                        final Orientation orientation3 = orientation2;
                                        objRememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                                return m1679invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                                            }

                                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                            public final PagerMeasureResult m1679invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                                int i6;
                                                int i7;
                                                int i8;
                                                int iM7008getMaxWidthimpl;
                                                long jIntOffset;
                                                ObservableScopeInvalidator.m1609attachToScopeimpl(pagerState.m1680getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                                boolean z16 = orientation3 == Orientation.Vertical;
                                                CheckScrollableContainerConstraintsKt.m1018checkScrollableContainerConstraintsK40F9xA(j, z16 ? Orientation.Vertical : Orientation.Horizontal);
                                                if (z16) {
                                                    i6 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(paddingValues.mo1386calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                                } else {
                                                    i6 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                                }
                                                if (z16) {
                                                    i7 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(paddingValues.mo1387calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                                } else {
                                                    i7 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                                }
                                                int i9 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(paddingValues.getTop());
                                                int i10 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(paddingValues.getBottom());
                                                final int i11 = i9 + i10;
                                                int i12 = i7;
                                                final int i13 = i6 + i12;
                                                int i14 = z16 ? i11 : i13;
                                                if (z16 && !z) {
                                                    i8 = i9;
                                                } else if (z16 && z) {
                                                    i8 = i10;
                                                } else {
                                                    i8 = (z16 || z) ? i12 : i6;
                                                }
                                                int i15 = i14 - i8;
                                                long jM7027offsetNN6EwU = ConstraintsKt.m7027offsetNN6EwU(j, -i13, -i11);
                                                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                                                pagerState.setDensity$foundation_release(lazyLayoutMeasureScope2);
                                                int i16 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(f3);
                                                if (z16) {
                                                    iM7008getMaxWidthimpl = Constraints.m7007getMaxHeightimpl(j) - i11;
                                                } else {
                                                    iM7008getMaxWidthimpl = Constraints.m7008getMaxWidthimpl(j) - i13;
                                                }
                                                if (!z || iM7008getMaxWidthimpl > 0) {
                                                    jIntOffset = IntOffsetKt.IntOffset(i6, i9);
                                                } else {
                                                    if (!z16) {
                                                        i6 += iM7008getMaxWidthimpl;
                                                    }
                                                    if (z16) {
                                                        i9 += iM7008getMaxWidthimpl;
                                                    }
                                                    jIntOffset = IntOffsetKt.IntOffset(i6, i9);
                                                }
                                                long j2 = jIntOffset;
                                                int iCoerceAtLeast = RangesKt.coerceAtLeast(pageSize3.calculateMainAxisPageSize(lazyLayoutMeasureScope2, iM7008getMaxWidthimpl, i16), 0);
                                                pagerState.m1684setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation3 == Orientation.Vertical ? Constraints.m7008getMaxWidthimpl(jM7027offsetNN6EwU) : iCoerceAtLeast, 0, orientation3 != Orientation.Vertical ? Constraints.m7007getMaxHeightimpl(jM7027offsetNN6EwU) : iCoerceAtLeast, 5, null));
                                                PagerLazyLayoutItemProvider pagerLazyLayoutItemProviderInvoke = function0.invoke();
                                                Snapshot.Companion companion = Snapshot.INSTANCE;
                                                PagerState pagerState2 = pagerState;
                                                SnapPosition snapPosition4 = snapPosition3;
                                                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                                try {
                                                    int iMatchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProviderInvoke, pagerState2.getCurrentPage());
                                                    int iCurrentPageOffset = PagerKt.currentPageOffset(snapPosition4, iM7008getMaxWidthimpl, iCoerceAtLeast, i16, i8, i15, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                                                    Unit unit = Unit.INSTANCE;
                                                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                                    int i17 = iM7008getMaxWidthimpl;
                                                    int i18 = i8;
                                                    PagerMeasureResult pagerMeasureResultM1677measurePagerbmk8ZPk = PagerMeasureKt.m1677measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), pagerLazyLayoutItemProviderInvoke, i17, i18, i15, i16, iMatchScrollPositionWithKey$foundation_release, iCurrentPageOffset, jM7027offsetNN6EwU, orientation3, vertical3, horizontal3, z, j2, iCoerceAtLeast, i5, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(pagerLazyLayoutItemProviderInvoke, pagerState.getPinnedPages(), pagerState.getBeyondBoundsInfo()), snapPosition3, pagerState.m1681getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                            return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                                        }

                                                        public final MeasureResult invoke(int i19, int i20, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                                            return lazyLayoutMeasureScope.layout(ConstraintsKt.m7025constrainWidthK40F9xA(j, i19 + i13), ConstraintsKt.m7024constrainHeightK40F9xA(j, i20 + i11), MapsKt.emptyMap(), function1);
                                                        }
                                                    });
                                                    PagerState.applyMeasureResult$foundation_release$default(pagerState, pagerMeasureResultM1677measurePagerbmk8ZPk, false, 2, null);
                                                    return pagerMeasureResultM1677measurePagerbmk8ZPk;
                                                } catch (Throwable th) {
                                                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                                    throw th;
                                                }
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = (Function2) objRememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    return function2;
                                }
                                i4 = i;
                                if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) != 131072) {
                                    z8 = false;
                                }
                                zChanged = z15 | z8 | composer.changed(coroutineScope);
                                objRememberedValue = composer.rememberedValue();
                                if (!zChanged) {
                                    final int i52 = i4;
                                    final SnapPosition snapPosition32 = snapPosition2;
                                    final Alignment.Horizontal horizontal32 = horizontal2;
                                    final Alignment.Vertical vertical32 = vertical2;
                                    final float f32 = f2;
                                    final PageSize pageSize32 = pageSize2;
                                    final Orientation orientation32 = orientation2;
                                    objRememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                            return m1679invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                                        }

                                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                        public final PagerMeasureResult m1679invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                            int i6;
                                            int i7;
                                            int i8;
                                            int iM7008getMaxWidthimpl;
                                            long jIntOffset;
                                            ObservableScopeInvalidator.m1609attachToScopeimpl(pagerState.m1680getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                            boolean z16 = orientation32 == Orientation.Vertical;
                                            CheckScrollableContainerConstraintsKt.m1018checkScrollableContainerConstraintsK40F9xA(j, z16 ? Orientation.Vertical : Orientation.Horizontal);
                                            if (z16) {
                                                i6 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(paddingValues.mo1386calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                            } else {
                                                i6 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                            }
                                            if (z16) {
                                                i7 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(paddingValues.mo1387calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                            } else {
                                                i7 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                            }
                                            int i9 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(paddingValues.getTop());
                                            int i10 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(paddingValues.getBottom());
                                            final int i11 = i9 + i10;
                                            int i12 = i7;
                                            final int i13 = i6 + i12;
                                            int i14 = z16 ? i11 : i13;
                                            if (z16 && !z) {
                                                i8 = i9;
                                            } else if (z16 && z) {
                                                i8 = i10;
                                            } else {
                                                i8 = (z16 || z) ? i12 : i6;
                                            }
                                            int i15 = i14 - i8;
                                            long jM7027offsetNN6EwU = ConstraintsKt.m7027offsetNN6EwU(j, -i13, -i11);
                                            LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                                            pagerState.setDensity$foundation_release(lazyLayoutMeasureScope2);
                                            int i16 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(f32);
                                            if (z16) {
                                                iM7008getMaxWidthimpl = Constraints.m7007getMaxHeightimpl(j) - i11;
                                            } else {
                                                iM7008getMaxWidthimpl = Constraints.m7008getMaxWidthimpl(j) - i13;
                                            }
                                            if (!z || iM7008getMaxWidthimpl > 0) {
                                                jIntOffset = IntOffsetKt.IntOffset(i6, i9);
                                            } else {
                                                if (!z16) {
                                                    i6 += iM7008getMaxWidthimpl;
                                                }
                                                if (z16) {
                                                    i9 += iM7008getMaxWidthimpl;
                                                }
                                                jIntOffset = IntOffsetKt.IntOffset(i6, i9);
                                            }
                                            long j2 = jIntOffset;
                                            int iCoerceAtLeast = RangesKt.coerceAtLeast(pageSize32.calculateMainAxisPageSize(lazyLayoutMeasureScope2, iM7008getMaxWidthimpl, i16), 0);
                                            pagerState.m1684setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation32 == Orientation.Vertical ? Constraints.m7008getMaxWidthimpl(jM7027offsetNN6EwU) : iCoerceAtLeast, 0, orientation32 != Orientation.Vertical ? Constraints.m7007getMaxHeightimpl(jM7027offsetNN6EwU) : iCoerceAtLeast, 5, null));
                                            PagerLazyLayoutItemProvider pagerLazyLayoutItemProviderInvoke = function0.invoke();
                                            Snapshot.Companion companion = Snapshot.INSTANCE;
                                            PagerState pagerState2 = pagerState;
                                            SnapPosition snapPosition4 = snapPosition32;
                                            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                            try {
                                                int iMatchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProviderInvoke, pagerState2.getCurrentPage());
                                                int iCurrentPageOffset = PagerKt.currentPageOffset(snapPosition4, iM7008getMaxWidthimpl, iCoerceAtLeast, i16, i8, i15, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                                                Unit unit = Unit.INSTANCE;
                                                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                                int i17 = iM7008getMaxWidthimpl;
                                                int i18 = i8;
                                                PagerMeasureResult pagerMeasureResultM1677measurePagerbmk8ZPk = PagerMeasureKt.m1677measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), pagerLazyLayoutItemProviderInvoke, i17, i18, i15, i16, iMatchScrollPositionWithKey$foundation_release, iCurrentPageOffset, jM7027offsetNN6EwU, orientation32, vertical32, horizontal32, z, j2, iCoerceAtLeast, i52, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(pagerLazyLayoutItemProviderInvoke, pagerState.getPinnedPages(), pagerState.getBeyondBoundsInfo()), snapPosition32, pagerState.m1681getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                        return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                                    }

                                                    public final MeasureResult invoke(int i19, int i20, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                                        return lazyLayoutMeasureScope.layout(ConstraintsKt.m7025constrainWidthK40F9xA(j, i19 + i13), ConstraintsKt.m7024constrainHeightK40F9xA(j, i20 + i11), MapsKt.emptyMap(), function1);
                                                    }
                                                });
                                                PagerState.applyMeasureResult$foundation_release$default(pagerState, pagerMeasureResultM1677measurePagerbmk8ZPk, false, 2, null);
                                                return pagerMeasureResultM1677measurePagerbmk8ZPk;
                                            } catch (Throwable th) {
                                                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                                throw th;
                                            }
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22 = (Function2) objRememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                return function22;
                            }
                            snapPosition2 = snapPosition;
                            if ((i3 & 6) == 4) {
                                z7 = false;
                            }
                            boolean z152 = ((((i3 & 896) ^ 384) > 256 && composer.changed(function02)) || (i3 & 384) == 256) | z14 | z7;
                            if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.f285xf2722a21) > 131072) {
                            }
                            if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) != 131072) {
                            }
                            zChanged = z152 | z8 | composer.changed(coroutineScope);
                            objRememberedValue = composer.rememberedValue();
                            if (!zChanged) {
                            }
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function222 = (Function2) objRememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            return function222;
                        }
                        pageSize2 = pageSize;
                        if ((12582912 & i2) != 8388608) {
                            z6 = false;
                        }
                        boolean z142 = z13 | z6;
                        if (((i3 & 14) ^ 6) <= 4) {
                        }
                        if ((i3 & 6) == 4) {
                        }
                        boolean z1522 = ((((i3 & 896) ^ 384) > 256 && composer.changed(function02)) || (i3 & 384) == 256) | z142 | z7;
                        if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.f285xf2722a21) > 131072) {
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) != 131072) {
                        }
                        zChanged = z1522 | z8 | composer.changed(coroutineScope);
                        objRememberedValue = composer.rememberedValue();
                        if (!zChanged) {
                        }
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2222 = (Function2) objRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        return function2222;
                    }
                    f2 = f;
                    if ((1572864 & i2) == 1048576) {
                        z5 = false;
                    }
                    boolean z132 = z12 | z5;
                    if (((29360128 & i2) ^ 12582912) > 8388608) {
                    }
                    if ((12582912 & i2) != 8388608) {
                    }
                    boolean z1422 = z132 | z6;
                    if (((i3 & 14) ^ 6) <= 4) {
                    }
                    if ((i3 & 6) == 4) {
                    }
                    boolean z15222 = ((((i3 & 896) ^ 384) > 256 && composer.changed(function02)) || (i3 & 384) == 256) | z1422 | z7;
                    if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.f285xf2722a21) > 131072) {
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) != 131072) {
                    }
                    zChanged = z15222 | z8 | composer.changed(coroutineScope);
                    objRememberedValue = composer.rememberedValue();
                    if (!zChanged) {
                    }
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22222 = (Function2) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    return function22222;
                }
                vertical2 = vertical;
                if ((805306368 & i2) != 536870912) {
                    z4 = false;
                }
                boolean z122 = z11 | z4;
                if (((3670016 & i2) ^ 1572864) <= 1048576) {
                }
                if ((1572864 & i2) == 1048576) {
                }
                boolean z1322 = z122 | z5;
                if (((29360128 & i2) ^ 12582912) > 8388608) {
                }
                if ((12582912 & i2) != 8388608) {
                }
                boolean z14222 = z1322 | z6;
                if (((i3 & 14) ^ 6) <= 4) {
                }
                if ((i3 & 6) == 4) {
                }
                boolean z152222 = ((((i3 & 896) ^ 384) > 256 && composer.changed(function02)) || (i3 & 384) == 256) | z14222 | z7;
                if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.f285xf2722a21) > 131072) {
                }
                if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) != 131072) {
                }
                zChanged = z152222 | z8 | composer.changed(coroutineScope);
                objRememberedValue = composer.rememberedValue();
                if (!zChanged) {
                }
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function222222 = (Function2) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                return function222222;
            }
            horizontal2 = horizontal;
            if ((100663296 & i2) == 67108864) {
                z3 = false;
            }
            boolean z112 = z10 | z3;
            if (((1879048192 & i2) ^ 805306368) > 536870912) {
            }
            if ((805306368 & i2) != 536870912) {
            }
            boolean z1222 = z112 | z4;
            if (((3670016 & i2) ^ 1572864) <= 1048576) {
            }
            if ((1572864 & i2) == 1048576) {
            }
            boolean z13222 = z1222 | z5;
            if (((29360128 & i2) ^ 12582912) > 8388608) {
            }
            if ((12582912 & i2) != 8388608) {
            }
            boolean z142222 = z13222 | z6;
            if (((i3 & 14) ^ 6) <= 4) {
            }
            if ((i3 & 6) == 4) {
            }
            boolean z1522222 = ((((i3 & 896) ^ 384) > 256 && composer.changed(function02)) || (i3 & 384) == 256) | z142222 | z7;
            if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.f285xf2722a21) > 131072) {
            }
            if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) != 131072) {
            }
            zChanged = z1522222 | z8 | composer.changed(coroutineScope);
            objRememberedValue = composer.rememberedValue();
            if (!zChanged) {
            }
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2222222 = (Function2) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return function2222222;
        }
        orientation2 = orientation;
        if ((i2 & 24576) != 16384) {
            z2 = false;
        }
        boolean z102 = z9 | z2;
        if (((234881024 & i2) ^ 100663296) <= 67108864) {
        }
        if ((100663296 & i2) == 67108864) {
        }
        boolean z1122 = z102 | z3;
        if (((1879048192 & i2) ^ 805306368) > 536870912) {
        }
        if ((805306368 & i2) != 536870912) {
        }
        boolean z12222 = z1122 | z4;
        if (((3670016 & i2) ^ 1572864) <= 1048576) {
        }
        if ((1572864 & i2) == 1048576) {
        }
        boolean z132222 = z12222 | z5;
        if (((29360128 & i2) ^ 12582912) > 8388608) {
        }
        if ((12582912 & i2) != 8388608) {
        }
        boolean z1422222 = z132222 | z6;
        if (((i3 & 14) ^ 6) <= 4) {
        }
        if ((i3 & 6) == 4) {
        }
        boolean z15222222 = ((((i3 & 896) ^ 384) > 256 && composer.changed(function02)) || (i3 & 384) == 256) | z1422222 | z7;
        if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.f285xf2722a21) > 131072) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) != 131072) {
        }
        zChanged = z15222222 | z8 | composer.changed(coroutineScope);
        objRememberedValue = composer.rememberedValue();
        if (!zChanged) {
        }
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22222222 = (Function2) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return function22222222;
    }
}
