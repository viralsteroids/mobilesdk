package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p000ui.graphics.GraphicsContext;
import androidx.compose.p000ui.layout.MeasureScope;
import androidx.compose.p000ui.layout.Placeable;
import androidx.compose.p000ui.unit.Constraints;
import androidx.compose.p000ui.unit.ConstraintsKt;
import androidx.compose.p000ui.unit.IntSize;
import androidx.compose.p000ui.unit.IntSizeKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* compiled from: LazyStaggeredGridMeasure.kt */
@Metadata(m513d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082\b\u001a5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\n0\u000e¢\u0006\u0002\b\u000fH\u0083\b¢\u0006\u0002\u0010\u0010\u001aR\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u000e2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u0001H\u0083\b\u001a;\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\"\u001a\u001d\u0010#\u001a\u00020\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001dH\u0002¢\u0006\u0002\u0010$\u001a\u001c\u0010%\u001a\u00020\u0005*\u00020\u00142\u0006\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0003H\u0002\u001a7\u0010(\u001a\u00020\u0005\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00122\b\b\u0002\u0010)\u001a\u00020\u00012\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\b\u001a\u001c\u0010+\u001a\u00020\u0003*\u00020\u00142\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0002\u001a+\u0010.\u001a\u00020\u0005*\u00020/2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\bø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\f\u00102\u001a\u00020\u0003*\u00020 H\u0002\u001a2\u00103\u001a\u00020\u0003\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u001d2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b¢\u0006\u0002\u00104\u001a\u0016\u00105\u001a\u00020\u0003*\u00020 2\b\b\u0002\u00106\u001a\u00020\u0003H\u0000\u001a\u001e\u00107\u001a\u00020\u0003*\u00020 2\u0006\u00108\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a,\u0010;\u001a\u00020<*\u00020\u00142\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020 2\u0006\u0010@\u001a\u00020\u0001H\u0003\u001a\u008c\u0001\u0010A\u001a\u00020<*\u00020\f2\u0006\u0010B\u001a\u00020C2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020\u00012\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010R\u001a\u00020\u00032\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a\u0014\u0010Y\u001a\u00020\u0005*\u00020 2\u0006\u0010Z\u001a\u00020\u0003H\u0002\u001a!\u0010[\u001a\u00020 *\u00020 2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\\"}, m514d2 = {"DebugLoggingEnabled", "", "Unset", "", "debugLog", "", "message", "Lkotlin/Function0;", "", "withDebugLogging", ExifInterface.GPS_DIRECTION_TRUE, "scope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "calculateExtraItems", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "position", "filter", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "itemIndex", "beforeVisibleBounds", "calculateVisibleItems", "measuredItems", "", "Lkotlin/collections/ArrayDeque;", "itemScrollOffsets", "", "mainAxisLayoutSize", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;", "debugRender", "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;", "ensureIndicesInRange", "indices", "itemCount", "fastForEach", "reverse", "action", "findPreviousItemIndex", "item", "lane", "forEach", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkotlin/jvm/functions/Function1;)V", "indexOfMaxValue", "indexOfMinBy", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "indexOfMinValue", "minBound", "maxInRange", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "measure", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "initialScrollDelta", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measureStaggeredGrid", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "pinnedItems", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "resolvedSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "reverseLayout", "contentOffset", "Landroidx/compose/ui/unit/IntOffset;", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "measureStaggeredGrid-XtK8cYQ", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "offsetBy", "delta", "transform", "foundation_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    private static final void debugLog(Function0<String> function0) {
    }

    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, Function1<? super LazyLayoutMeasureScope, ? extends T> function1) {
        return function1.invoke(lazyLayoutMeasureScope);
    }

    private static final String debugRender(ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr) {
        return "";
    }

    /* renamed from: measureStaggeredGrid-XtK8cYQ, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m1646measureStaggeredGridXtK8cYQ(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4, CoroutineScope coroutineScope, GraphicsContext graphicsContext) {
        int i5;
        int iM1645maxInRangejy6DScQ;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j, z, lazyLayoutMeasureScope, i, j2, i3, i4, z2, i2, coroutineScope, graphicsContext, null);
        int[] iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition().getScrollOffsets();
        if (iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr = new int[laneCount];
            int i6 = 0;
            while (i6 < laneCount) {
                if (i6 >= iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (iM1645maxInRangejy6DScQ = iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release[i6]) == -1) {
                    iM1645maxInRangejy6DScQ = i6 == 0 ? 0 : m1645maxInRangejy6DScQ(iArr, SpanRange.m1656constructorimpl(0, i6)) + 1;
                }
                iArr[i6] = iM1645maxInRangejy6DScQ;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i6], i6);
                i6++;
            }
            iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = iArr;
        }
        if (scrollOffsets.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr2 = new int[laneCount2];
            int i7 = 0;
            while (i7 < laneCount2) {
                if (i7 < scrollOffsets.length) {
                    i5 = scrollOffsets[i7];
                } else {
                    i5 = i7 == 0 ? 0 : iArr2[i7 - 1];
                }
                iArr2[i7] = i5;
                i7++;
            }
            scrollOffsets = iArr2;
        }
        return measure(lazyStaggeredGridMeasureContext, Math.round(lazyStaggeredGridState.getScrollToBeConsumed()), iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, scrollOffsets, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x02f0, code lost:
    
        r4 = indexOfMinValue$default(r8, 0, 1, null);
        r5 = indexOfMaxValue(r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02fb, code lost:
    
        if (r4 == r5) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0301, code lost:
    
        if (r8[r4] != r8[r5]) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0303, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0305, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0306, code lost:
    
        r5 = r29[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0309, code lost:
    
        if (r5 != (-1)) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x030b, code lost:
    
        r5 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x030c, code lost:
    
        r5 = findPreviousItemIndex(r0, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0310, code lost:
    
        if (r5 >= 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0312, code lost:
    
        r7 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0314, code lost:
    
        if (r1 != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x031a, code lost:
    
        if (measure$lambda$41$misalignedStart(r7, r0, r8, r4) == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x031c, code lost:
    
        if (r47 == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x031e, code lost:
    
        r0.getLaneInfo().reset();
        r1 = r7.length;
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0329, code lost:
    
        if (r3 >= r1) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x032b, code lost:
    
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0332, code lost:
    
        r1 = r8.length;
        r3 = new int[r1];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0336, code lost:
    
        if (r5 >= r1) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0338, code lost:
    
        r3[r5] = r8[r4];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0346, code lost:
    
        return measure(r0, r30, r2, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0347, code lost:
    
        r7 = r29;
        r10 = r30;
        r46 = r1;
        r45 = r2;
        r1 = r0.m1641getSpanRangelOCCd4c(r0.getItemProvider(), r5, r4);
        r4 = r0.getLaneInfo();
        r9 = r12;
        r26 = r13;
        r12 = (int) (r1 & org.bouncycastle.asn1.cmc.BodyPartID.bodyIdMax);
        r29 = r14;
        r13 = (int) (r1 >> 32);
        r14 = r12 - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0369, code lost:
    
        if (r14 == 1) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x036b, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x036e, code lost:
    
        r23 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0370, code lost:
    
        if (r23 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0372, code lost:
    
        r15 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0374, code lost:
    
        r15 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0375, code lost:
    
        r4.setLane(r5, r15);
        r4 = r0.getMeasuredItemProvider().m1650getAndMeasurejy6DScQ(r5, r1);
        r1 = m1645maxInRangejy6DScQ(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0385, code lost:
    
        if (r14 == 1) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0387, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0389, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x038a, code lost:
    
        if (r2 == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x038c, code lost:
    
        r2 = r0.getLaneInfo().getGaps(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0395, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0396, code lost:
    
        r14 = r13;
        r13 = r46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0399, code lost:
    
        if (r14 >= r12) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x039d, code lost:
    
        if (r8[r14] == r1) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x039f, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03a0, code lost:
    
        r27[r14].addFirst(r4);
        r7[r14] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03a7, code lost:
    
        if (r2 != null) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03a9, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03ab, code lost:
    
        r15 = r2[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03ad, code lost:
    
        r8[r14] = (r1 + r4.getMainAxisSizeWithSpacings()) + r15;
        r14 = r14 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0759  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final LazyStaggeredGridMeasureResult measure(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int[] iArr, int[] iArr2, boolean z) {
        int i2;
        int iIndexOf;
        int i3;
        int i4;
        int i5;
        int[] iArr3;
        int[] iArr4;
        int i6;
        int[] iArr5;
        int i7;
        int i8;
        int[] iArr6;
        int[] iArr7;
        int i9;
        int i10;
        int[] iArr8;
        int i11;
        int[] iArr9;
        boolean z2;
        int iM7025constrainWidthK40F9xA;
        int iM7007getMaxHeightimpl;
        int i12;
        List listEmptyList;
        int i13;
        int i14;
        boolean z3;
        boolean z4;
        boolean z5;
        List<Integer> list;
        boolean z6;
        List list2;
        int i15;
        int[] iArr10;
        boolean z7;
        int i16;
        int i17;
        int[] gaps;
        boolean z8;
        final LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
        LazyLayoutMeasureScope measureScope = lazyStaggeredGridMeasureContext2.getMeasureScope();
        int itemCount = lazyStaggeredGridMeasureContext2.getItemProvider().getItemCount();
        if (itemCount <= 0 || lazyStaggeredGridMeasureContext2.getLaneCount() == 0) {
            int iM7010getMinWidthimpl = Constraints.m7010getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints());
            int iM7009getMinHeightimpl = Constraints.m7009getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints());
            lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation_release().onMeasured(0, iM7010getMinWidthimpl, iM7009getMinHeightimpl, new ArrayList(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), false, lazyStaggeredGridMeasureContext.getLaneCount(), false, 0, 0, lazyStaggeredGridMeasureContext.getCoroutineScope(), lazyStaggeredGridMeasureContext.getGraphicsContext());
            long jM1600getMinSizeToFitDisappearingItemsYbymL2g = lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation_release().m1600getMinSizeToFitDisappearingItemsYbymL2g();
            if (!IntSize.m7223equalsimpl0(jM1600getMinSizeToFitDisappearingItemsYbymL2g, IntSize.INSTANCE.m7230getZeroYbymL2g())) {
                iM7010getMinWidthimpl = ConstraintsKt.m7025constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), IntSize.m7225getWidthimpl(jM1600getMinSizeToFitDisappearingItemsYbymL2g));
                iM7009getMinHeightimpl = ConstraintsKt.m7024constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), IntSize.m7224getHeightimpl(jM1600getMinSizeToFitDisappearingItemsYbymL2g));
            }
            return new LazyStaggeredGridMeasureResult(iArr, iArr2, 0.0f, MeasureScope.layout$default(measureScope, iM7010getMinWidthimpl, iM7009getMinHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null), false, lazyStaggeredGridMeasureContext.getIsVertical(), false, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), measureScope, itemCount, CollectionsKt.emptyList(), IntSizeKt.IntSize(Constraints.m7010getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()), Constraints.m7009getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints())), -lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        String str = "copyOf(this, size)";
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, size)");
        int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf2, "copyOf(this, size)");
        ensureIndicesInRange(lazyStaggeredGridMeasureContext2, iArrCopyOf, itemCount);
        offsetBy(iArrCopyOf2, -i);
        int laneCount = lazyStaggeredGridMeasureContext2.getLaneCount();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[laneCount];
        for (int i18 = 0; i18 < laneCount; i18++) {
            arrayDequeArr[i18] = new ArrayDeque(16);
        }
        offsetBy(iArrCopyOf2, -lazyStaggeredGridMeasureContext2.getBeforeContentPadding());
        boolean z9 = false;
        while (true) {
            if (!measure$lambda$41$hasSpaceBeforeFirst(iArrCopyOf, iArrCopyOf2, lazyStaggeredGridMeasureContext2)) {
                i2 = 0;
                iIndexOf = -1;
                break;
            }
            iIndexOf = indexOfMaxValue(iArrCopyOf);
            int i19 = iArrCopyOf[iIndexOf];
            int length = iArrCopyOf2.length;
            i2 = 0;
            for (int i20 = 0; i20 < length; i20++) {
                if (iArrCopyOf[i20] != iArrCopyOf[iIndexOf]) {
                    int i21 = iArrCopyOf2[i20];
                    int i22 = iArrCopyOf2[iIndexOf];
                    if (i21 < i22) {
                        iArrCopyOf2[i20] = i22;
                    }
                }
            }
            int iFindPreviousItemIndex = findPreviousItemIndex(lazyStaggeredGridMeasureContext2, i19, iIndexOf);
            if (iFindPreviousItemIndex < 0) {
                break;
            }
            long jM1641getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext2.m1641getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext2.getItemProvider(), iFindPreviousItemIndex, iIndexOf);
            LazyStaggeredGridLaneInfo laneInfo = lazyStaggeredGridMeasureContext2.getLaneInfo();
            int i23 = (int) (jM1641getSpanRangelOCCd4c & BodyPartID.bodyIdMax);
            boolean z10 = z9;
            int i24 = (int) (jM1641getSpanRangelOCCd4c >> 32);
            int i25 = i23 - i24;
            laneInfo.setLane(iFindPreviousItemIndex, i25 != 1 ? -2 : i24);
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().m1650getAndMeasurejy6DScQ(iFindPreviousItemIndex, jM1641getSpanRangelOCCd4c);
            int iM1645maxInRangejy6DScQ = m1645maxInRangejy6DScQ(iArrCopyOf2, jM1641getSpanRangelOCCd4c);
            int[] gaps2 = i25 != 1 ? lazyStaggeredGridMeasureContext2.getLaneInfo().getGaps(iFindPreviousItemIndex) : null;
            boolean z11 = z10;
            while (i24 < i23) {
                iArrCopyOf[i24] = iFindPreviousItemIndex;
                int mainAxisSizeWithSpacings = iM1645maxInRangejy6DScQ + lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ.getMainAxisSizeWithSpacings() + (gaps2 == null ? 0 : gaps2[i24]);
                iArrCopyOf2[i24] = mainAxisSizeWithSpacings;
                if (lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize() + mainAxisSizeWithSpacings <= 0) {
                    z11 = true;
                }
                i24++;
            }
            z9 = z11;
        }
        boolean z12 = z9;
        int i26 = -lazyStaggeredGridMeasureContext2.getBeforeContentPadding();
        int i27 = iArrCopyOf2[i2];
        if (i27 < i26) {
            i3 = i + i27;
            offsetBy(iArrCopyOf2, i26 - i27);
        } else {
            i3 = i;
        }
        offsetBy(iArrCopyOf2, lazyStaggeredGridMeasureContext2.getBeforeContentPadding());
        int i28 = -1;
        if (iIndexOf == -1) {
            iIndexOf = ArraysKt.indexOf(iArrCopyOf, i2);
        }
        if (iIndexOf != -1 && measure$lambda$41$misalignedStart(iArrCopyOf, lazyStaggeredGridMeasureContext2, iArrCopyOf2, iIndexOf) && z) {
            lazyStaggeredGridMeasureContext2.getLaneInfo().reset();
            int length2 = iArrCopyOf.length;
            int[] iArr11 = new int[length2];
            int i29 = 0;
            while (i29 < length2) {
                iArr11[i29] = i28;
                i29++;
                i28 = -1;
            }
            int length3 = iArrCopyOf2.length;
            int[] iArr12 = new int[length3];
            for (int i30 = 0; i30 < length3; i30++) {
                iArr12[i30] = iArrCopyOf2[iIndexOf];
            }
            return measure(lazyStaggeredGridMeasureContext2, i3, iArr11, iArr12, false);
        }
        int[] iArrCopyOf3 = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf3, "copyOf(this, size)");
        int length4 = iArrCopyOf2.length;
        int[] iArr13 = new int[length4];
        for (int i31 = 0; i31 < length4; i31++) {
            iArr13[i31] = -iArrCopyOf2[i31];
        }
        int mainAxisSpacing = i26 + lazyStaggeredGridMeasureContext2.getMainAxisSpacing();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext2.getAfterContentPadding(), 0);
        LazyLayoutMeasureScope lazyLayoutMeasureScope = measureScope;
        boolean z13 = z12;
        int iIndexOfMinValue$default = indexOfMinValue$default(iArrCopyOf3, 0, 1, null);
        int laneCount2 = 0;
        for (int i32 = -1; iIndexOfMinValue$default != i32 && laneCount2 < lazyStaggeredGridMeasureContext2.getLaneCount(); i32 = -1) {
            int i33 = iArrCopyOf3[iIndexOfMinValue$default];
            int iIndexOfMinValue = indexOfMinValue(iArrCopyOf3, i33);
            laneCount2++;
            if (i33 >= 0) {
                long jM1641getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext2.m1641getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext2.getItemProvider(), i33, iIndexOfMinValue$default);
                ArrayDeque[] arrayDequeArr2 = arrayDequeArr;
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().m1650getAndMeasurejy6DScQ(i33, jM1641getSpanRangelOCCd4c2);
                String str2 = str;
                LazyStaggeredGridLaneInfo laneInfo2 = lazyStaggeredGridMeasureContext2.getLaneInfo();
                int[] iArr14 = iArrCopyOf;
                int[] iArr15 = iArrCopyOf2;
                int i34 = (int) (jM1641getSpanRangelOCCd4c2 & BodyPartID.bodyIdMax);
                int i35 = i3;
                int i36 = itemCount;
                int i37 = (int) (jM1641getSpanRangelOCCd4c2 >> 32);
                int i38 = i34 - i37;
                laneInfo2.setLane(i33, i38 != 1 ? -2 : i37);
                int iM1645maxInRangejy6DScQ2 = m1645maxInRangejy6DScQ(iArr13, jM1641getSpanRangelOCCd4c2);
                for (int i39 = i37; i39 < i34; i39++) {
                    iArr13[i39] = lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ2.getMainAxisSizeWithSpacings() + iM1645maxInRangejy6DScQ2;
                    iArrCopyOf3[i39] = i33;
                    arrayDequeArr2[i39].addLast(lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ2);
                }
                if (iM1645maxInRangejy6DScQ2 >= mainAxisSpacing || iArr13[i37] > mainAxisSpacing) {
                    z8 = z13;
                } else {
                    lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ2.setVisible(false);
                    z8 = true;
                }
                laneCount2 = i38 != 1 ? lazyStaggeredGridMeasureContext2.getLaneCount() : laneCount2;
                iArrCopyOf2 = iArr15;
                z13 = z8;
                iIndexOfMinValue$default = iIndexOfMinValue;
                arrayDequeArr = arrayDequeArr2;
                str = str2;
                iArrCopyOf = iArr14;
                i3 = i35;
                itemCount = i36;
            } else {
                iIndexOfMinValue$default = iIndexOfMinValue;
            }
        }
        String str3 = str;
        int[] iArr16 = iArrCopyOf;
        int[] iArr17 = iArrCopyOf2;
        ArrayDeque[] arrayDequeArr3 = arrayDequeArr;
        int i40 = i3;
        int i41 = itemCount;
        loop9: while (true) {
            int i42 = 0;
            while (true) {
                if (i42 >= length4) {
                    for (int i43 = 0; i43 < laneCount; i43++) {
                        if (!arrayDequeArr3[i43].isEmpty()) {
                            i4 = i41;
                            i5 = 1;
                            break loop9;
                        }
                    }
                } else {
                    int i44 = iArr13[i42];
                    if (i44 < iCoerceAtLeast || i44 <= 0) {
                        break;
                    }
                    i42++;
                }
            }
            i5 = 1;
            int iIndexOfMinValue$default2 = indexOfMinValue$default(iArr13, 0, 1, null);
            int iMaxOrThrow = ArraysKt.maxOrThrow(iArrCopyOf3) + 1;
            i4 = i41;
            if (iMaxOrThrow >= i4) {
                break;
            }
            boolean z14 = z13;
            int[] iArr18 = iArr17;
            int[] iArr19 = iArrCopyOf3;
            int i45 = length4;
            int[] iArr20 = iArr13;
            LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
            String str4 = str3;
            int i46 = i40;
            int i47 = iCoerceAtLeast;
            int i48 = laneCount;
            long jM1641getSpanRangelOCCd4c3 = lazyStaggeredGridMeasureContext2.m1641getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext2.getItemProvider(), iMaxOrThrow, iIndexOfMinValue$default2);
            LazyStaggeredGridLaneInfo laneInfo3 = lazyStaggeredGridMeasureContext2.getLaneInfo();
            int i49 = (int) (jM1641getSpanRangelOCCd4c3 & BodyPartID.bodyIdMax);
            int i50 = (int) (jM1641getSpanRangelOCCd4c3 >> 32);
            int i51 = i49 - i50;
            laneInfo3.setLane(iMaxOrThrow, i51 != 1 ? -2 : i50);
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ3 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1650getAndMeasurejy6DScQ(iMaxOrThrow, jM1641getSpanRangelOCCd4c3);
            int iM1645maxInRangejy6DScQ3 = m1645maxInRangejy6DScQ(iArr20, jM1641getSpanRangelOCCd4c3);
            if (i51 != 1) {
                gaps = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(iMaxOrThrow);
                if (gaps == null) {
                    gaps = new int[lazyStaggeredGridMeasureContext.getLaneCount()];
                }
            } else {
                gaps = null;
            }
            for (int i52 = i50; i52 < i49; i52++) {
                if (gaps != null) {
                    gaps[i52] = iM1645maxInRangejy6DScQ3 - iArr20[i52];
                }
                iArr19[i52] = iMaxOrThrow;
                iArr20[i52] = iM1645maxInRangejy6DScQ3 + lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ3.getMainAxisSizeWithSpacings();
                arrayDequeArr3[i52].addLast(lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ3);
            }
            lazyStaggeredGridMeasureContext.getLaneInfo().setGaps(iMaxOrThrow, gaps);
            if (iM1645maxInRangejy6DScQ3 < mainAxisSpacing && iArr20[i50] <= mainAxisSpacing) {
                lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ3.setVisible(false);
            }
            lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
            lazyLayoutMeasureScope = lazyLayoutMeasureScope2;
            i40 = i46;
            i41 = i4;
            iCoerceAtLeast = i47;
            z13 = z14;
            iArr17 = iArr18;
            laneCount = i48;
            iArr13 = iArr20;
            str3 = str4;
            length4 = i45;
            iArrCopyOf3 = iArr19;
        }
        int i53 = 0;
        while (i53 < laneCount) {
            ArrayDeque arrayDeque = arrayDequeArr3[i53];
            while (arrayDeque.size() > i5 && !((LazyStaggeredGridMeasuredItem) arrayDeque.first()).getIsVisible()) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) arrayDeque.removeFirst();
                int[] gaps3 = lazyStaggeredGridMeasuredItem.getSpan() != i5 ? lazyStaggeredGridMeasureContext2.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem.getIndex()) : null;
                iArr17[i53] = iArr17[i53] - (lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings() + (gaps3 == null ? 0 : gaps3[i53]));
                i5 = 1;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) arrayDeque.firstOrNull();
            iArr16[i53] = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getIndex() : -1;
            i53++;
            i5 = 1;
        }
        int length5 = iArrCopyOf3.length;
        int i54 = 0;
        while (true) {
            if (i54 >= length5) {
                break;
            }
            if (iArrCopyOf3[i54] == i4 - 1) {
                offsetBy(iArr13, -lazyStaggeredGridMeasureContext2.getMainAxisSpacing());
                break;
            }
            i54++;
        }
        int i55 = 0;
        while (true) {
            if (i55 < length4) {
                if (iArr13[i55] >= lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize()) {
                    iArr3 = iArr17;
                    i6 = iCoerceAtLeast;
                    iArr5 = iArrCopyOf3;
                    i7 = length4;
                    iArr6 = iArr13;
                    iArr4 = iArr16;
                    i8 = i40;
                    break;
                }
                i55++;
            } else {
                int mainAxisAvailableSize = lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize() - iArr13[indexOfMaxValue(iArr13)];
                iArr3 = iArr17;
                offsetBy(iArr3, -mainAxisAvailableSize);
                offsetBy(iArr13, mainAxisAvailableSize);
                boolean z15 = false;
                loop26: while (true) {
                    int length6 = iArr3.length;
                    int i56 = 0;
                    while (true) {
                        if (i56 >= length6) {
                            iArr4 = iArr16;
                            break loop26;
                        }
                        if (iArr3[i56] < lazyStaggeredGridMeasureContext2.getBeforeContentPadding()) {
                            break;
                        }
                        i56++;
                        iArr16 = iArr16;
                    }
                    iCoerceAtLeast = i10;
                    iArrCopyOf3 = iArr8;
                    i40 = i9;
                    z15 = z2;
                    length4 = i11;
                    iArr13 = iArr9;
                    iArr16 = iArr7;
                }
                int i57 = i40;
                i6 = iCoerceAtLeast;
                iArr5 = iArrCopyOf3;
                i7 = length4;
                int[] iArr21 = iArr13;
                if (z15 && z) {
                    lazyStaggeredGridMeasureContext2.getLaneInfo().reset();
                    return measure(lazyStaggeredGridMeasureContext2, i57, iArr4, iArr3, false);
                }
                i8 = i57 + mainAxisAvailableSize;
                int i58 = iArr3[indexOfMinValue$default(iArr3, 0, 1, null)];
                if (i58 < 0) {
                    i8 += i58;
                    iArr6 = iArr21;
                    offsetBy(iArr6, i58);
                    offsetBy(iArr3, -i58);
                } else {
                    iArr6 = iArr21;
                }
            }
        }
        float scrollToBeConsumed = (MathKt.getSign(Math.round(lazyStaggeredGridMeasureContext2.getState().getScrollToBeConsumed())) != MathKt.getSign(i8) || Math.abs(Math.round(lazyStaggeredGridMeasureContext2.getState().getScrollToBeConsumed())) < Math.abs(i8)) ? lazyStaggeredGridMeasureContext2.getState().getScrollToBeConsumed() : i8;
        int[] iArrCopyOf4 = Arrays.copyOf(iArr3, iArr3.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf4, str3);
        int length7 = iArrCopyOf4.length;
        for (int i59 = 0; i59 < length7; i59++) {
            iArrCopyOf4[i59] = -iArrCopyOf4[i59];
        }
        if (lazyStaggeredGridMeasureContext2.getBeforeContentPadding() > lazyStaggeredGridMeasureContext2.getMainAxisSpacing()) {
            for (int i60 = 0; i60 < laneCount; i60++) {
                ArrayDeque arrayDeque2 = arrayDequeArr3[i60];
                int size = arrayDeque2.size();
                int i61 = 0;
                while (i61 < size) {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (LazyStaggeredGridMeasuredItem) arrayDeque2.get(i61);
                    int[] gaps4 = lazyStaggeredGridMeasureContext2.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem3.getIndex());
                    int mainAxisSizeWithSpacings2 = lazyStaggeredGridMeasuredItem3.getMainAxisSizeWithSpacings() + (gaps4 == null ? 0 : gaps4[i60]);
                    if (i61 == CollectionsKt.getLastIndex(arrayDeque2) || (i17 = iArr3[i60]) == 0 || i17 < mainAxisSizeWithSpacings2) {
                        break;
                    }
                    iArr3[i60] = i17 - mainAxisSizeWithSpacings2;
                    i61++;
                    iArr4[i60] = ((LazyStaggeredGridMeasuredItem) arrayDeque2.get(i61)).getIndex();
                }
            }
        }
        int beforeContentPadding = lazyStaggeredGridMeasureContext2.getBeforeContentPadding() + lazyStaggeredGridMeasureContext2.getAfterContentPadding();
        if (lazyStaggeredGridMeasureContext2.getIsVertical()) {
            iM7025constrainWidthK40F9xA = Constraints.m7008getMaxWidthimpl(lazyStaggeredGridMeasureContext2.getConstraints());
        } else {
            iM7025constrainWidthK40F9xA = ConstraintsKt.m7025constrainWidthK40F9xA(lazyStaggeredGridMeasureContext2.getConstraints(), ArraysKt.maxOrThrow(iArr6) + beforeContentPadding);
        }
        int i62 = iM7025constrainWidthK40F9xA;
        if (lazyStaggeredGridMeasureContext2.getIsVertical()) {
            iM7007getMaxHeightimpl = ConstraintsKt.m7024constrainHeightK40F9xA(lazyStaggeredGridMeasureContext2.getConstraints(), ArraysKt.maxOrThrow(iArr6) + beforeContentPadding);
        } else {
            iM7007getMaxHeightimpl = Constraints.m7007getMaxHeightimpl(lazyStaggeredGridMeasureContext2.getConstraints());
        }
        int i63 = iM7007getMaxHeightimpl;
        int iMin = (Math.min(lazyStaggeredGridMeasureContext2.getIsVertical() ? i63 : i62, lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize()) - lazyStaggeredGridMeasureContext2.getBeforeContentPadding()) + lazyStaggeredGridMeasureContext2.getAfterContentPadding();
        int i64 = iArrCopyOf4[0];
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext2.getPinnedItems();
        int size2 = pinnedItems.size() - 1;
        if (size2 >= 0) {
            int i65 = size2;
            int mainAxisSizeWithSpacings3 = i64;
            listEmptyList = null;
            while (true) {
                int i66 = i65 - 1;
                int iIntValue = pinnedItems.get(i65).intValue();
                int lane = lazyStaggeredGridMeasureContext2.getLaneInfo().getLane(iIntValue);
                i12 = beforeContentPadding;
                if (lane == -2 || lane == -1) {
                    for (int i67 = 0; i67 < laneCount; i67++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem4 = (LazyStaggeredGridMeasuredItem) arrayDequeArr3[i67].firstOrNull();
                        if (!((lazyStaggeredGridMeasuredItem4 != null ? lazyStaggeredGridMeasuredItem4.getIndex() : -1) > iIntValue)) {
                            z7 = false;
                            break;
                        }
                    }
                    z7 = true;
                } else {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem5 = (LazyStaggeredGridMeasuredItem) arrayDequeArr3[lane].firstOrNull();
                    if ((lazyStaggeredGridMeasuredItem5 != null ? lazyStaggeredGridMeasuredItem5.getIndex() : -1) <= iIntValue) {
                        z7 = false;
                        break;
                    }
                    z7 = true;
                }
                if (z7) {
                    List list3 = listEmptyList;
                    i16 = laneCount;
                    long jM1641getSpanRangelOCCd4c4 = lazyStaggeredGridMeasureContext2.m1641getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext2.getItemProvider(), iIntValue, 0);
                    ArrayList arrayList = list3 == null ? new ArrayList() : list3;
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ4 = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().m1650getAndMeasurejy6DScQ(iIntValue, jM1641getSpanRangelOCCd4c4);
                    mainAxisSizeWithSpacings3 -= lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ4.getMainAxisSizeWithSpacings();
                    lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ4.position(mainAxisSizeWithSpacings3, 0, iMin);
                    arrayList.add(lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ4);
                    listEmptyList = arrayList;
                } else {
                    i16 = laneCount;
                }
                if (i66 < 0) {
                    break;
                }
                beforeContentPadding = i12;
                i65 = i66;
                laneCount = i16;
            }
        } else {
            i12 = beforeContentPadding;
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<LazyStaggeredGridMeasuredItem> listCalculateVisibleItems = calculateVisibleItems(lazyStaggeredGridMeasureContext2, arrayDequeArr3, iArrCopyOf4, iMin);
        int mainAxisSizeWithSpacings4 = iArrCopyOf4[0];
        List<Integer> pinnedItems2 = lazyStaggeredGridMeasureContext2.getPinnedItems();
        int size3 = pinnedItems2.size();
        int i68 = 0;
        ArrayList arrayListEmptyList = null;
        while (i68 < size3) {
            int iIntValue2 = pinnedItems2.get(i68).intValue();
            if (iIntValue2 >= i4) {
                list = pinnedItems2;
            } else {
                int lane2 = lazyStaggeredGridMeasureContext2.getLaneInfo().getLane(iIntValue2);
                list = pinnedItems2;
                if (lane2 == -2 || lane2 == -1) {
                    for (int i69 : iArr5) {
                        if (i69 < iIntValue2) {
                        }
                    }
                    z6 = true;
                } else {
                    if (iArr5[lane2] >= iIntValue2) {
                        z6 = false;
                        break;
                    }
                    z6 = true;
                }
                if (z6) {
                    list2 = listEmptyList;
                    i15 = size3;
                    iArr10 = iArr4;
                } else {
                    list2 = listEmptyList;
                    i15 = size3;
                    long jM1641getSpanRangelOCCd4c5 = lazyStaggeredGridMeasureContext2.m1641getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext2.getItemProvider(), iIntValue2, 0);
                    if (arrayListEmptyList == null) {
                        arrayListEmptyList = new ArrayList();
                    }
                    iArr10 = iArr4;
                    List list4 = arrayListEmptyList;
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ5 = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().m1650getAndMeasurejy6DScQ(iIntValue2, jM1641getSpanRangelOCCd4c5);
                    lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ5.position(mainAxisSizeWithSpacings4, 0, iMin);
                    mainAxisSizeWithSpacings4 += lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ5.getMainAxisSizeWithSpacings();
                    list4.add(lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ5);
                    arrayListEmptyList = list4;
                }
                i68++;
                pinnedItems2 = list;
                listEmptyList = list2;
                size3 = i15;
                iArr4 = iArr10;
            }
            z6 = false;
            if (z6) {
            }
            i68++;
            pinnedItems2 = list;
            listEmptyList = list2;
            size3 = i15;
            iArr4 = iArr10;
        }
        List list5 = listEmptyList;
        int[] iArr22 = iArr4;
        if (arrayListEmptyList == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        final ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(list5);
        arrayList2.addAll(listCalculateVisibleItems);
        arrayList2.addAll(arrayListEmptyList);
        lazyStaggeredGridMeasureContext2.getState().getItemAnimator$foundation_release().onMeasured((int) scrollToBeConsumed, i62, i63, arrayList2, lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext2.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext2.getIsVertical(), false, lazyStaggeredGridMeasureContext2.getLaneCount(), false, ArraysKt.minOrThrow(iArr3), ArraysKt.maxOrThrow(iArr6) + i12, lazyStaggeredGridMeasureContext2.getCoroutineScope(), lazyStaggeredGridMeasureContext2.getGraphicsContext());
        long jM1600getMinSizeToFitDisappearingItemsYbymL2g2 = lazyStaggeredGridMeasureContext2.getState().getItemAnimator$foundation_release().m1600getMinSizeToFitDisappearingItemsYbymL2g();
        if (IntSize.m7223equalsimpl0(jM1600getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.INSTANCE.m7230getZeroYbymL2g())) {
            i13 = i63;
            i14 = i62;
        } else {
            int i70 = lazyStaggeredGridMeasureContext2.getIsVertical() ? i63 : i62;
            int iM7025constrainWidthK40F9xA2 = ConstraintsKt.m7025constrainWidthK40F9xA(lazyStaggeredGridMeasureContext2.getConstraints(), Math.max(i62, IntSize.m7225getWidthimpl(jM1600getMinSizeToFitDisappearingItemsYbymL2g2)));
            int iM7024constrainHeightK40F9xA = ConstraintsKt.m7024constrainHeightK40F9xA(lazyStaggeredGridMeasureContext2.getConstraints(), Math.max(i63, IntSize.m7224getHeightimpl(jM1600getMinSizeToFitDisappearingItemsYbymL2g2)));
            int i71 = lazyStaggeredGridMeasureContext2.getIsVertical() ? iM7024constrainHeightK40F9xA : iM7025constrainWidthK40F9xA2;
            if (i71 != i70) {
                int size4 = arrayList2.size();
                for (int i72 = 0; i72 < size4; i72++) {
                    ((LazyStaggeredGridMeasuredItem) arrayList2.get(i72)).updateMainAxisLayoutSize(i71);
                }
            }
            i14 = iM7025constrainWidthK40F9xA2;
            i13 = iM7024constrainHeightK40F9xA;
        }
        int i73 = i7;
        int i74 = 0;
        while (true) {
            if (i74 >= i73) {
                z3 = false;
                break;
            }
            if (iArr6[i74] > lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize()) {
                z3 = true;
                break;
            }
            i74++;
        }
        if (!z3) {
            int length8 = iArr5.length;
            int i75 = 0;
            while (true) {
                if (i75 >= length8) {
                    z5 = true;
                    break;
                }
                if (!(iArr5[i75] < i4 + (-1))) {
                    z5 = false;
                    break;
                }
                i75++;
            }
            z4 = z5;
        }
        return new LazyStaggeredGridMeasureResult(iArr22, iArr3, scrollToBeConsumed, MeasureScope.layout$default(lazyLayoutMeasureScope, i14, i13, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$33
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
                List<LazyStaggeredGridMeasuredItem> list6 = arrayList2;
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext2;
                int size5 = list6.size();
                for (int i76 = 0; i76 < size5; i76++) {
                    list6.get(i76).place(placementScope, lazyStaggeredGridMeasureContext3);
                }
                ObservableScopeInvalidator.m1609attachToScopeimpl(lazyStaggeredGridMeasureContext2.getState().m1654getPlacementScopeInvalidatorzYiylxw$foundation_release());
            }
        }, 4, null), z4, lazyStaggeredGridMeasureContext2.getIsVertical(), z13, lazyStaggeredGridMeasureContext2.getResolvedSlots(), lazyStaggeredGridMeasureContext2.getItemProvider().getSpanProvider(), lazyLayoutMeasureScope, i4, listCalculateVisibleItems, IntSizeKt.IntSize(i14, i13), i26, i6, lazyStaggeredGridMeasureContext2.getBeforeContentPadding(), lazyStaggeredGridMeasureContext2.getAfterContentPadding(), lazyStaggeredGridMeasureContext2.getMainAxisSpacing(), lazyStaggeredGridMeasureContext2.getCoroutineScope(), null);
    }

    private static final boolean measure$lambda$41$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$41$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i) {
        int size = 0;
        for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque : arrayDequeArr) {
            size += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i2 = -1;
                    int i3 = Integer.MAX_VALUE;
                    for (int i4 = 0; i4 < length; i4++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemFirstOrNull = arrayDequeArr[i4].firstOrNull();
                        int index = lazyStaggeredGridMeasuredItemFirstOrNull != null ? lazyStaggeredGridMeasuredItemFirstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i3 > index) {
                            i2 = i4;
                            i3 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemRemoveFirst = arrayDequeArr[i2].removeFirst();
                    if (lazyStaggeredGridMeasuredItemRemoveFirst.getLane() == i2) {
                        long jM1656constructorimpl = SpanRange.m1656constructorimpl(lazyStaggeredGridMeasuredItemRemoveFirst.getLane(), lazyStaggeredGridMeasuredItemRemoveFirst.getSpan());
                        int iM1645maxInRangejy6DScQ = m1645maxInRangejy6DScQ(iArr, jM1656constructorimpl);
                        lazyStaggeredGridMeasuredItemRemoveFirst.position(iM1645maxInRangejy6DScQ, lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i2], i);
                        arrayList.add(lazyStaggeredGridMeasuredItemRemoveFirst);
                        int i5 = (int) (jM1656constructorimpl & BodyPartID.bodyIdMax);
                        for (int i6 = (int) (jM1656constructorimpl >> 32); i6 < i5; i6++) {
                            iArr[i6] = lazyStaggeredGridMeasuredItemRemoveFirst.getMainAxisSizeWithSpacings() + iM1645maxInRangejy6DScQ;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, Function1<? super LazyStaggeredGridMeasuredItem, Unit> function1, Function1<? super Integer, Boolean> function12, boolean z) {
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        ArrayList arrayList = null;
        if (z) {
            int size = pinnedItems.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    int iIntValue = pinnedItems.get(size).intValue();
                    if (function12.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                        long jM1641getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m1641getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1650getAndMeasurejy6DScQ(iIntValue, jM1641getSpanRangelOCCd4c);
                        function1.invoke(lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ);
                        arrayList.add(lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ);
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
        } else {
            int size2 = pinnedItems.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iIntValue2 = pinnedItems.get(i2).intValue();
                if (function12.invoke(Integer.valueOf(iIntValue2)).booleanValue()) {
                    long jM1641getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m1641getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1650getAndMeasurejy6DScQ(iIntValue2, jM1641getSpanRangelOCCd4c2);
                    function1.invoke(lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ2);
                    arrayList.add(lazyStaggeredGridMeasuredItemM1650getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m1644forEachnIS5qE8(long j, Function1<? super Integer, Unit> function1) {
        int i = (int) (j & BodyPartID.bodyIdMax);
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            function1.invoke(Integer.valueOf(i2));
        }
    }

    private static final void offsetBy(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    /* renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m1645maxInRangejy6DScQ(int[] iArr, long j) {
        int i = (int) (j & BodyPartID.bodyIdMax);
        int iMax = Integer.MIN_VALUE;
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            iMax = Math.max(iMax, iArr[i2]);
        }
        return iMax;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i);
    }

    public static final int indexOfMinValue(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i + 1;
            int i6 = iArr[i4];
            if (i5 <= i6 && i6 < i3) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    private static final <T> int indexOfMinBy(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int iIntValue = function1.invoke(tArr[i3]).intValue();
            if (i2 > iIntValue) {
                i = i3;
                i2 = iIntValue;
            }
        }
        return i;
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    private static final int[] transform(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = function1.invoke(Integer.valueOf(iArr[i])).intValue();
        }
        return iArr;
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            while (true) {
                if (iArr[length] < i && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int i2) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i, i2);
    }

    private static final <T> void fastForEach(List<? extends T> list, boolean z, Function1<? super T, Unit> function1) {
        if (z) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i = size - 1;
                function1.invoke(list.get(size));
                if (i < 0) {
                    return;
                } else {
                    size = i;
                }
            }
        } else {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                function1.invoke(list.get(i2));
            }
        }
    }

    static /* synthetic */ void fastForEach$default(List list, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if (z) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i2 = size - 1;
                function1.invoke(list.get(size));
                if (i2 < 0) {
                    return;
                } else {
                    size = i2;
                }
            }
        } else {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                function1.invoke(list.get(i3));
            }
        }
    }
}
