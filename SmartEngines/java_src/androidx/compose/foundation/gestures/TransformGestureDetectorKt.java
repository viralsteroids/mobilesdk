package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p000ui.input.pointer.PointerEvent;
import androidx.compose.p000ui.input.pointer.PointerEventKt;
import androidx.compose.p000ui.input.pointer.PointerInputChange;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* compiled from: TransformGestureDetector.kt */
@Metadata(m513d1 = {"\u00004\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0002*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\u000f\u0010\u000b\u001a\u00020\u0002*\u00020\u0006¢\u0006\u0002\u0010\f\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0006\u001a~\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\b2`\u0010\u0013\u001a\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00100\u0014H\u0086@¢\u0006\u0002\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m514d2 = {"angle", "", "Landroidx/compose/ui/geometry/Offset;", "angle-k-4lQ0M", "(J)F", "calculateCentroid", "Landroidx/compose/ui/input/pointer/PointerEvent;", "useCurrent", "", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "calculateCentroidSize", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "calculateRotation", "calculateZoom", "detectTransformGestures", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "panZoomLock", "onGesture", "Lkotlin/Function4;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "centroid", "pan", "zoom", "rotation", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class TransformGestureDetectorKt {
    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z, Function4 function4, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return detectTransformGestures(pointerInputScope, z, function4, continuation);
    }

    /* compiled from: TransformGestureDetector.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
    @DebugMetadata(m532c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", m533f = "TransformGestureDetector.kt", m534i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m535l = {59, 61}, m536m = "invokeSuspend", m537n = {"$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, m538s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
    /* renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2 */
    static final class C06482 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function4<Offset, Offset, Float, Float, Unit> $onGesture;
        final /* synthetic */ boolean $panZoomLock;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06482(boolean z, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation<? super C06482> continuation) {
            super(2, continuation);
            this.$panZoomLock = z;
            this.$onGesture = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C06482 c06482 = new C06482(this.$panZoomLock, this.$onGesture, continuation);
            c06482.L$0 = obj;
            return c06482;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C06482) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x009e, code lost:
        
            if (r3 == r1) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:56:0x015c  */
        /* JADX WARN: Type inference failed for: r5v15 */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x009e -> B:17:0x00a1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            float f;
            float f2;
            int i;
            long jM4359plusMKHz9U;
            AwaitPointerEventScope awaitPointerEventScope;
            float f3;
            int i2;
            float f4;
            Object objAwaitPointerEvent$default;
            boolean z;
            Object obj2;
            boolean z2;
            float f5;
            int i3;
            int size;
            int i4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.label;
            float f6 = 1.0f;
            int i6 = 2;
            float f7 = 0.0f;
            boolean z3 = false;
            boolean z4 = true;
            z4 = true;
            z4 = true;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                long jM4370getZeroF1C5BW0 = Offset.INSTANCE.m4370getZeroF1C5BW0();
                float touchSlop = awaitPointerEventScope2.getViewConfiguration().getTouchSlop();
                this.L$0 = awaitPointerEventScope2;
                this.F$0 = 0.0f;
                this.F$1 = 1.0f;
                this.J$0 = jM4370getZeroF1C5BW0;
                this.I$0 = 0;
                this.F$2 = touchSlop;
                this.I$1 = 0;
                this.label = 1;
                if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, this, 2, null) != coroutine_suspended) {
                    f = 1.0f;
                    f2 = 0.0f;
                    i = 0;
                    jM4359plusMKHz9U = jM4370getZeroF1C5BW0;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    f3 = touchSlop;
                    i2 = 0;
                }
                return coroutine_suspended;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.I$1;
                f3 = this.F$2;
                i = this.I$0;
                jM4359plusMKHz9U = this.J$0;
                f = this.F$1;
                f2 = this.F$0;
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                f4 = 1.0f;
                objAwaitPointerEvent$default = obj;
                PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size2 = changes.size();
                float f8 = f7;
                ?? r5 = z3;
                while (true) {
                    if (r5 >= size2) {
                        z = z3;
                        break;
                    }
                    if (changes.get(r5).isConsumed()) {
                        z = z4;
                        break;
                    }
                    r5++;
                }
                if (z) {
                    obj2 = coroutine_suspended;
                    z2 = z4;
                    f5 = f3;
                } else {
                    float fCalculateZoom = TransformGestureDetectorKt.calculateZoom(pointerEvent);
                    float fCalculateRotation = TransformGestureDetectorKt.calculateRotation(pointerEvent);
                    f5 = f3;
                    long jCalculatePan = TransformGestureDetectorKt.calculatePan(pointerEvent);
                    if (i == 0) {
                        f *= fCalculateZoom;
                        f2 += fCalculateRotation;
                        jM4359plusMKHz9U = Offset.m4359plusMKHz9U(jM4359plusMKHz9U, jCalculatePan);
                        float fCalculateCentroidSize = TransformGestureDetectorKt.calculateCentroidSize(pointerEvent, z3);
                        obj2 = coroutine_suspended;
                        z2 = true;
                        float fAbs = Math.abs(1 - f) * fCalculateCentroidSize;
                        float fAbs2 = Math.abs(((3.1415927f * f2) * fCalculateCentroidSize) / 180.0f);
                        float fM4352getDistanceimpl = Offset.m4352getDistanceimpl(jM4359plusMKHz9U);
                        if (fAbs > f5 || fAbs2 > f5 || fM4352getDistanceimpl > f5) {
                            i2 = (!this.$panZoomLock || fAbs2 >= f5) ? 0 : 1;
                            i = 1;
                        }
                    } else {
                        obj2 = coroutine_suspended;
                        z2 = true;
                    }
                    if (i != 0) {
                        long jCalculateCentroid = TransformGestureDetectorKt.calculateCentroid(pointerEvent, false);
                        if (i2 != 0) {
                            fCalculateRotation = f8;
                        }
                        if (fCalculateRotation == f8 && fCalculateZoom == f4) {
                            i3 = i2;
                            if (!Offset.m4351equalsimpl0(jCalculatePan, Offset.INSTANCE.m4370getZeroF1C5BW0())) {
                            }
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            size = changes2.size();
                            for (i4 = 0; i4 < size; i4++) {
                                PointerInputChange pointerInputChange = changes2.get(i4);
                                if (PointerEventKt.positionChanged(pointerInputChange)) {
                                    pointerInputChange.consume();
                                }
                            }
                        } else {
                            i3 = i2;
                        }
                        this.$onGesture.invoke(Offset.m4343boximpl(jCalculateCentroid), Offset.m4343boximpl(jCalculatePan), Boxing.boxFloat(fCalculateZoom), Boxing.boxFloat(fCalculateRotation));
                        List<PointerInputChange> changes22 = pointerEvent.getChanges();
                        size = changes22.size();
                        while (i4 < size) {
                        }
                    } else {
                        i3 = i2;
                    }
                    i2 = i3;
                }
                if (!z) {
                    List<PointerInputChange> changes3 = pointerEvent.getChanges();
                    int size3 = changes3.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        if (changes3.get(i7).getPressed()) {
                            f3 = f5;
                            z4 = z2;
                            f6 = f4;
                            f7 = f8;
                            coroutine_suspended = obj2;
                            i6 = 2;
                            z3 = false;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            i2 = this.I$1;
            f3 = this.F$2;
            i = this.I$0;
            jM4359plusMKHz9U = this.J$0;
            f = this.F$1;
            f2 = this.F$0;
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = awaitPointerEventScope;
            this.F$0 = f2;
            this.F$1 = f;
            this.J$0 = jM4359plusMKHz9U;
            this.I$0 = i;
            this.F$2 = f3;
            this.I$1 = i2;
            this.label = i6;
            f4 = f6;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, this, z4 ? 1 : 0, null);
        }
    }

    public static final Object detectTransformGestures(PointerInputScope pointerInputScope, boolean z, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C06482(z, function4, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    public static final float calculateRotation(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 < 2) {
            return 0.0f;
        }
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        long jCalculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size2; i4++) {
            PointerInputChange pointerInputChange2 = changes2.get(i4);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long position = pointerInputChange2.getPosition();
                long jM4358minusMKHz9U = Offset.m4358minusMKHz9U(pointerInputChange2.getPreviousPosition(), jCalculateCentroid2);
                long jM4358minusMKHz9U2 = Offset.m4358minusMKHz9U(position, jCalculateCentroid);
                float fM1262anglek4lQ0M = m1262anglek4lQ0M(jM4358minusMKHz9U2) - m1262anglek4lQ0M(jM4358minusMKHz9U);
                float fM4352getDistanceimpl = Offset.m4352getDistanceimpl(Offset.m4359plusMKHz9U(jM4358minusMKHz9U2, jM4358minusMKHz9U)) / 2.0f;
                if (fM1262anglek4lQ0M > 180.0f) {
                    fM1262anglek4lQ0M -= 360.0f;
                } else if (fM1262anglek4lQ0M < -180.0f) {
                    fM1262anglek4lQ0M += 360.0f;
                }
                f2 += fM1262anglek4lQ0M * fM4352getDistanceimpl;
                f += fM4352getDistanceimpl;
            }
        }
        if (f == 0.0f) {
            return 0.0f;
        }
        return f2 / f;
    }

    /* renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m1262anglek4lQ0M(long j) {
        if (Offset.m4354getXimpl(j) == 0.0f && Offset.m4355getYimpl(j) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Offset.m4354getXimpl(j), Offset.m4355getYimpl(j)))) * 180.0f) / 3.1415927f;
    }

    public static final float calculateZoom(PointerEvent pointerEvent) {
        float fCalculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float fCalculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (fCalculateCentroidSize == 0.0f || fCalculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return fCalculateCentroidSize / fCalculateCentroidSize2;
    }

    public static final long calculatePan(PointerEvent pointerEvent) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        if (Offset.m4351equalsimpl0(jCalculateCentroid, Offset.INSTANCE.m4369getUnspecifiedF1C5BW0())) {
            return Offset.INSTANCE.m4370getZeroF1C5BW0();
        }
        return Offset.m4358minusMKHz9U(jCalculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return calculateCentroidSize(pointerEvent, z);
    }

    public static final float calculateCentroidSize(PointerEvent pointerEvent, boolean z) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, z);
        float fM4352getDistanceimpl = 0.0f;
        if (Offset.m4351equalsimpl0(jCalculateCentroid, Offset.INSTANCE.m4369getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                fM4352getDistanceimpl += Offset.m4352getDistanceimpl(Offset.m4358minusMKHz9U(z ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), jCalculateCentroid));
                i++;
            }
        }
        return fM4352getDistanceimpl / i;
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return calculateCentroid(pointerEvent, z);
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z) {
        long jM4370getZeroF1C5BW0 = Offset.INSTANCE.m4370getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jM4370getZeroF1C5BW0 = Offset.m4359plusMKHz9U(jM4370getZeroF1C5BW0, z ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i++;
            }
        }
        if (i == 0) {
            return Offset.INSTANCE.m4369getUnspecifiedF1C5BW0();
        }
        return Offset.m4349divtuRUvjQ(jM4370getZeroF1C5BW0, i);
    }
}
