package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p000ui.input.pointer.PointerEvent;
import androidx.compose.p000ui.input.pointer.PointerEventKt;
import androidx.compose.p000ui.input.pointer.PointerEventPass;
import androidx.compose.p000ui.input.pointer.PointerInputChange;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.Channel;

/* compiled from: Transformable.kt */
@Metadata(m513d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0082@¢\u0006\u0002\u0010\u000b\u001a<\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u0007\u001a&\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004¨\u0006\u0012"}, m514d2 = {"detectZoom", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "panZoomLock", "", "channel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/TransformEvent;", "canPan", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlinx/coroutines/channels/Channel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformable", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/TransformableState;", "lockRotationOnZoomPan", "enabled", "foundation_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class TransformableKt {

    /* compiled from: Transformable.kt */
    @Metadata(m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
    @DebugMetadata(m532c = "androidx.compose.foundation.gestures.TransformableKt", m533f = "Transformable.kt", m534i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, m535l = {216, 218, 262}, m536m = "detectZoom", m537n = {"$this$detectZoom", "channel", "canPan", "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", NotificationCompat.CATEGORY_EVENT, "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "canceled"}, m538s = {"L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "I$2"})
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 */
    static final class C06491 extends ContinuationImpl {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C06491(Continuation<? super C06491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.detectZoom(null, false, null, null, this);
        }
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, z, z2);
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, boolean z, boolean z2) {
        return transformable(modifier, transformableState, new Function1<Offset, Boolean>() { // from class: androidx.compose.foundation.gestures.TransformableKt.transformable.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Offset offset) {
                return m1265invokek4lQ0M(offset.getPackedValue());
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final Boolean m1265invokek4lQ0M(long j) {
                return true;
            }
        }, z, z2);
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, Function1 function1, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, function1, z, z2);
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, Function1<? super Offset, Boolean> function1, boolean z, boolean z2) {
        return modifier.then(new TransformableElement(transformableState, function1, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02b1, code lost:
    
        if (r6 != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02b3, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b8 A[EDGE_INSN: B:101:0x02b8->B:90:0x02b8 BREAK  A[LOOP:0: B:84:0x02a3->B:89:0x02b5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0287 -> B:83:0x0296). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object detectZoom(AwaitPointerEventScope awaitPointerEventScope, boolean z, Channel<TransformEvent> channel, Function1<? super Offset, Boolean> function1, Continuation<? super Unit> continuation) {
        C06491 c06491;
        Channel<TransformEvent> channel2;
        Function1<? super Offset, Boolean> function12;
        boolean z2;
        float f;
        long j;
        int i;
        int i2;
        float f2;
        float f3;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1<? super Offset, Boolean> function13;
        AwaitPointerEventScope awaitPointerEventScope3;
        float f4;
        float f5;
        Channel<TransformEvent> channel3;
        int size;
        int i3;
        int i4;
        C06491 c064912;
        float f6;
        long j2;
        int i5;
        int i6;
        Object objAwaitPointerEvent;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerEvent pointerEvent;
        float f7;
        int i7;
        int i8;
        Channel<TransformEvent> channel4;
        long j3;
        float f8;
        long j4;
        int size2;
        int i9;
        int size3;
        int i10;
        int size4;
        int i11;
        if (continuation instanceof C06491) {
            c06491 = (C06491) continuation;
            if ((c06491.label & Integer.MIN_VALUE) != 0) {
                c06491.label -= Integer.MIN_VALUE;
            } else {
                c06491 = new C06491(continuation);
            }
        }
        C06491 c064913 = c06491;
        Object objAwaitPointerEvent$default = c064913.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c064913.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objAwaitPointerEvent$default);
            long jM4370getZeroF1C5BW0 = Offset.INSTANCE.m4370getZeroF1C5BW0();
            float touchSlop = awaitPointerEventScope.getViewConfiguration().getTouchSlop();
            c064913.L$0 = awaitPointerEventScope;
            channel2 = channel;
            c064913.L$1 = channel2;
            function12 = function1;
            c064913.L$2 = function12;
            z2 = z;
            c064913.Z$0 = z2;
            c064913.F$0 = 0.0f;
            c064913.F$1 = 1.0f;
            c064913.J$0 = jM4370getZeroF1C5BW0;
            c064913.I$0 = 0;
            c064913.F$2 = touchSlop;
            c064913.I$1 = 0;
            c064913.label = 1;
            if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, c064913, 2, null) != coroutine_suspended) {
                f = touchSlop;
                j = jM4370getZeroF1C5BW0;
                i = 0;
                i2 = 0;
                f2 = 1.0f;
                f3 = 0.0f;
                awaitPointerEventScope2 = awaitPointerEventScope;
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = c064913.I$2;
                i7 = c064913.I$1;
                f7 = c064913.F$2;
                i8 = c064913.I$0;
                j3 = c064913.J$0;
                float f9 = c064913.F$1;
                f3 = c064913.F$0;
                boolean z3 = c064913.Z$0;
                pointerEvent = (PointerEvent) c064913.L$3;
                Function1<? super Offset, Boolean> function14 = (Function1) c064913.L$2;
                Channel<TransformEvent> channel5 = (Channel) c064913.L$1;
                AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) c064913.L$0;
                ResultKt.throwOnFailure(objAwaitPointerEvent$default);
                f2 = f9;
                channel4 = channel5;
                awaitPointerEventScope4 = awaitPointerEventScope5;
                function12 = function14;
                z2 = z3;
                objAwaitPointerEvent = objAwaitPointerEvent$default;
                List<PointerInputChange> changes = ((PointerEvent) objAwaitPointerEvent).getChanges();
                size3 = changes.size();
                Object obj = coroutine_suspended;
                i10 = 0;
                while (true) {
                    if (i10 >= size3) {
                        break;
                    }
                    if (changes.get(i10).isConsumed()) {
                        break;
                    }
                    i10++;
                }
                boolean z4 = false;
                if (i4 == 0 && !z4) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    size4 = changes2.size();
                    for (i11 = 0; i11 < size4; i11++) {
                        if (changes2.get(i11).getPressed()) {
                            i = i7;
                            f = f7;
                            i2 = i8;
                            channel2 = channel4;
                            j = j3;
                            awaitPointerEventScope2 = awaitPointerEventScope4;
                            coroutine_suspended = obj;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            i = c064913.I$1;
            f = c064913.F$2;
            i2 = c064913.I$0;
            j = c064913.J$0;
            float f10 = c064913.F$1;
            float f11 = c064913.F$0;
            boolean z5 = c064913.Z$0;
            Function1<? super Offset, Boolean> function15 = (Function1) c064913.L$2;
            Channel<TransformEvent> channel6 = (Channel) c064913.L$1;
            AwaitPointerEventScope awaitPointerEventScope6 = (AwaitPointerEventScope) c064913.L$0;
            ResultKt.throwOnFailure(objAwaitPointerEvent$default);
            f5 = f10;
            channel3 = channel6;
            z2 = z5;
            f4 = f11;
            function13 = function15;
            awaitPointerEventScope3 = awaitPointerEventScope6;
            PointerEvent pointerEvent2 = (PointerEvent) objAwaitPointerEvent$default;
            List<PointerInputChange> changes3 = pointerEvent2.getChanges();
            size = changes3.size();
            int i13 = i;
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i4 = 0;
                    break;
                }
                if (changes3.get(i3).isConsumed()) {
                    i4 = 1;
                    break;
                }
                i3++;
            }
            if (i4 != 0) {
                float fCalculateZoom = TransformGestureDetectorKt.calculateZoom(pointerEvent2);
                float fCalculateRotation = TransformGestureDetectorKt.calculateRotation(pointerEvent2);
                float f12 = f5;
                float f13 = f4;
                long jCalculatePan = TransformGestureDetectorKt.calculatePan(pointerEvent2);
                if (i2 == 0) {
                    f6 = f12 * fCalculateZoom;
                    float f14 = f13 + fCalculateRotation;
                    long jM4359plusMKHz9U = Offset.m4359plusMKHz9U(j, jCalculatePan);
                    int i14 = i2;
                    float fCalculateCentroidSize = TransformGestureDetectorKt.calculateCentroidSize(pointerEvent2, false);
                    float fAbs = Math.abs(1 - f6) * fCalculateCentroidSize;
                    float fAbs2 = Math.abs(((3.1415927f * f14) * fCalculateCentroidSize) / 180.0f);
                    float fM4352getDistanceimpl = Offset.m4352getDistanceimpl(jM4359plusMKHz9U);
                    if (fAbs > f || fAbs2 > f || (fM4352getDistanceimpl > f && function13.invoke(Offset.m4343boximpl(jCalculatePan)).booleanValue())) {
                        i5 = (!z2 || fAbs2 >= f) ? 0 : 1;
                        channel3.mo9352trySendJP2dKIU(TransformEvent.TransformStarted.INSTANCE);
                        j4 = jM4359plusMKHz9U;
                        i6 = 1;
                    } else {
                        i5 = i13;
                        j4 = jM4359plusMKHz9U;
                        i6 = i14;
                    }
                    f8 = f14;
                } else {
                    f6 = f12;
                    f8 = f13;
                    j4 = j;
                    i5 = i13;
                    i6 = i2;
                }
                if (i6 == 0) {
                    c064912 = c064913;
                } else {
                    float f15 = i5 != 0 ? 0.0f : fCalculateRotation;
                    if (f15 == 0.0f && fCalculateZoom == 1.0f) {
                        c064912 = c064913;
                        if (!Offset.m4351equalsimpl0(jCalculatePan, Offset.INSTANCE.m4370getZeroF1C5BW0()) && function13.invoke(Offset.m4343boximpl(jCalculatePan)).booleanValue()) {
                        }
                        List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                        size2 = changes4.size();
                        for (i9 = 0; i9 < size2; i9++) {
                            PointerInputChange pointerInputChange = changes4.get(i9);
                            if (PointerEventKt.positionChanged(pointerInputChange)) {
                                pointerInputChange.consume();
                            }
                        }
                    } else {
                        c064912 = c064913;
                    }
                    channel3.mo9352trySendJP2dKIU(new TransformEvent.TransformDelta(fCalculateZoom, jCalculatePan, f15, null));
                    List<PointerInputChange> changes42 = pointerEvent2.getChanges();
                    size2 = changes42.size();
                    while (i9 < size2) {
                    }
                }
                j2 = j4;
                f3 = f8;
            } else {
                int i15 = i2;
                c064912 = c064913;
                channel3.mo9352trySendJP2dKIU(TransformEvent.TransformStopped.INSTANCE);
                f6 = f5;
                f3 = f4;
                j2 = j;
                i5 = i13;
                i6 = i15;
            }
            PointerEventPass pointerEventPass = PointerEventPass.Final;
            C06491 c064914 = c064912;
            c064914.L$0 = awaitPointerEventScope3;
            c064914.L$1 = channel3;
            c064914.L$2 = function13;
            c064914.L$3 = pointerEvent2;
            c064914.Z$0 = z2;
            c064914.F$0 = f3;
            c064914.F$1 = f6;
            c064914.J$0 = j2;
            c064914.I$0 = i6;
            c064914.F$2 = f;
            c064914.I$1 = i5;
            c064914.I$2 = i4;
            c064914.label = 3;
            objAwaitPointerEvent = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass, c064914);
            if (objAwaitPointerEvent != coroutine_suspended) {
                awaitPointerEventScope4 = awaitPointerEventScope3;
                function12 = function13;
                pointerEvent = pointerEvent2;
                long j5 = j2;
                f7 = f;
                i7 = i5;
                i8 = i6;
                channel4 = channel3;
                c064913 = c064914;
                f2 = f6;
                j3 = j5;
                List<PointerInputChange> changes5 = ((PointerEvent) objAwaitPointerEvent).getChanges();
                size3 = changes5.size();
                Object obj2 = coroutine_suspended;
                i10 = 0;
                while (true) {
                    if (i10 >= size3) {
                    }
                    i10++;
                }
                boolean z42 = false;
                if (i4 == 0) {
                    List<PointerInputChange> changes22 = pointerEvent.getChanges();
                    size4 = changes22.size();
                    while (i11 < size4) {
                    }
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        i = c064913.I$1;
        f = c064913.F$2;
        i2 = c064913.I$0;
        j = c064913.J$0;
        f2 = c064913.F$1;
        f3 = c064913.F$0;
        boolean z6 = c064913.Z$0;
        function12 = (Function1) c064913.L$2;
        Channel<TransformEvent> channel7 = (Channel) c064913.L$1;
        awaitPointerEventScope2 = (AwaitPointerEventScope) c064913.L$0;
        ResultKt.throwOnFailure(objAwaitPointerEvent$default);
        z2 = z6;
        channel2 = channel7;
        c064913.L$0 = awaitPointerEventScope2;
        c064913.L$1 = channel2;
        c064913.L$2 = function12;
        c064913.L$3 = null;
        c064913.Z$0 = z2;
        c064913.F$0 = f3;
        c064913.F$1 = f2;
        c064913.J$0 = j;
        c064913.I$0 = i2;
        c064913.F$2 = f;
        c064913.I$1 = i;
        c064913.label = 2;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, c064913, 1, null);
        if (objAwaitPointerEvent$default != coroutine_suspended) {
            float f16 = f3;
            f5 = f2;
            channel3 = channel2;
            f4 = f16;
            AwaitPointerEventScope awaitPointerEventScope7 = awaitPointerEventScope2;
            function13 = function12;
            awaitPointerEventScope3 = awaitPointerEventScope7;
            PointerEvent pointerEvent22 = (PointerEvent) objAwaitPointerEvent$default;
            List<PointerInputChange> changes32 = pointerEvent22.getChanges();
            size = changes32.size();
            int i132 = i;
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                }
                i3++;
            }
            if (i4 != 0) {
            }
            PointerEventPass pointerEventPass2 = PointerEventPass.Final;
            C06491 c0649142 = c064912;
            c0649142.L$0 = awaitPointerEventScope3;
            c0649142.L$1 = channel3;
            c0649142.L$2 = function13;
            c0649142.L$3 = pointerEvent22;
            c0649142.Z$0 = z2;
            c0649142.F$0 = f3;
            c0649142.F$1 = f6;
            c0649142.J$0 = j2;
            c0649142.I$0 = i6;
            c0649142.F$2 = f;
            c0649142.I$1 = i5;
            c0649142.I$2 = i4;
            c0649142.label = 3;
            objAwaitPointerEvent = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass2, c0649142);
            if (objAwaitPointerEvent != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
