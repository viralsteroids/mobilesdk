package androidx.compose.material3.internal;

import androidx.autofill.HintConstants;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p000ui.input.pointer.PointerEvent;
import androidx.compose.p000ui.input.pointer.PointerEventKt;
import androidx.compose.p000ui.input.pointer.PointerEventPass;
import androidx.compose.p000ui.input.pointer.PointerId;
import androidx.compose.p000ui.input.pointer.PointerInputChange;
import androidx.compose.p000ui.input.pointer.PointerType;
import androidx.compose.p000ui.platform.ViewConfiguration;
import androidx.compose.p000ui.unit.C1959Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: DragGestureDetectorCopy.kt */
@Metadata(m513d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aa\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f26\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aW\u0010\u0016\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u0018H\u0082Hø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001e\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001e\u0010!\u001a\u00020\u0005*\u00020\"2\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010$\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, m514d2 = {"defaultTouchSlop", "Landroidx/compose/ui/unit/Dp;", "F", "mouseSlop", "mouseToTouchSlopRatio", "", "awaitHorizontalPointerSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "onPointerSlopReached", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "change", "overSlop", "", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "getDragDirectionValue", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPointerUp", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "material3_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class DragGestureDetectorCopyKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0166 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0124 -> B:56:0x0167). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x015e -> B:53:0x0160). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0182 -> B:56:0x0167). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3328awaitHorizontalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        C1638x2966ccbb c1638x2966ccbb;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        Ref.LongRef longRef;
        C1638x2966ccbb c1638x2966ccbb2;
        float f;
        float fM4354getXimpl;
        Ref.LongRef longRef2;
        C1638x2966ccbb c1638x2966ccbb3;
        float f2;
        float f3;
        int size;
        int i2;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i3;
        Object objAwaitPointerEvent$default;
        if (continuation instanceof C1638x2966ccbb) {
            c1638x2966ccbb = (C1638x2966ccbb) continuation;
            if ((c1638x2966ccbb.label & Integer.MIN_VALUE) != 0) {
                c1638x2966ccbb.label -= Integer.MIN_VALUE;
            } else {
                c1638x2966ccbb = new C1638x2966ccbb(continuation);
            }
        }
        Object obj3 = c1638x2966ccbb.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c1638x2966ccbb.label;
        int i5 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj3);
            if (m3330isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                return null;
            }
            float fM3331pointerSlopE8SPZFQ = m3331pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
            Ref.LongRef longRef3 = new Ref.LongRef();
            longRef3.element = j;
            awaitPointerEventScope2 = awaitPointerEventScope;
            function22 = function2;
            longRef = longRef3;
            c1638x2966ccbb2 = c1638x2966ccbb;
            f = fM3331pointerSlopE8SPZFQ;
            fM4354getXimpl = 0.0f;
            c1638x2966ccbb2.L$0 = function22;
            c1638x2966ccbb2.L$1 = awaitPointerEventScope2;
            c1638x2966ccbb2.L$2 = longRef;
            c1638x2966ccbb2.L$3 = pointerEventPass2;
            c1638x2966ccbb2.F$0 = f;
            c1638x2966ccbb2.F$1 = fM4354getXimpl;
            c1638x2966ccbb2.label = i5;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, c1638x2966ccbb2, i5, pointerEventPass2);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f4 = c1638x2966ccbb.F$1;
            float f5 = c1638x2966ccbb.F$0;
            PointerInputChange pointerInputChange2 = (PointerInputChange) c1638x2966ccbb.L$3;
            Ref.LongRef longRef4 = (Ref.LongRef) c1638x2966ccbb.L$2;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) c1638x2966ccbb.L$1;
            Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) c1638x2966ccbb.L$0;
            ResultKt.throwOnFailure(obj3);
            fM4354getXimpl = f4;
            pointerEventPass = null;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            longRef2 = longRef4;
            c1638x2966ccbb3 = c1638x2966ccbb;
            f = f5;
            function22 = function23;
            if (pointerInputChange2.isConsumed()) {
                return pointerEventPass;
            }
            c1638x2966ccbb2 = c1638x2966ccbb3;
            longRef = longRef2;
            pointerEventPass2 = pointerEventPass;
            i5 = 1;
            c1638x2966ccbb2.L$0 = function22;
            c1638x2966ccbb2.L$1 = awaitPointerEventScope2;
            c1638x2966ccbb2.L$2 = longRef;
            c1638x2966ccbb2.L$3 = pointerEventPass2;
            c1638x2966ccbb2.F$0 = f;
            c1638x2966ccbb2.F$1 = fM4354getXimpl;
            c1638x2966ccbb2.label = i5;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, c1638x2966ccbb2, i5, pointerEventPass2);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
                float f6 = f;
                f3 = fM4354getXimpl;
                obj3 = objAwaitPointerEvent$default;
                longRef2 = longRef;
                c1638x2966ccbb3 = c1638x2966ccbb2;
                f2 = f6;
                PointerEvent pointerEvent = (PointerEvent) obj3;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                size = changes.size();
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        pointerEventPass = pointerEventPass2;
                        obj = pointerEventPass;
                        break;
                    }
                    obj = changes.get(i2);
                    pointerEventPass = pointerEventPass2;
                    i3 = i2;
                    if (PointerId.m5784equalsimpl0(((PointerInputChange) obj).getId(), longRef2.element)) {
                        break;
                    }
                    i2 = i3 + 1;
                    pointerEventPass2 = pointerEventPass;
                }
                Intrinsics.checkNotNull(obj);
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange.isConsumed()) {
                    return pointerEventPass;
                }
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size2) {
                            obj2 = pointerEventPass;
                            break;
                        }
                        obj2 = changes2.get(i6);
                        if (((PointerInputChange) obj2).getPressed()) {
                            break;
                        }
                        i6++;
                    }
                    PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                    if (pointerInputChange3 == null) {
                        return pointerEventPass;
                    }
                    longRef2.element = pointerInputChange3.getId();
                    fM4354getXimpl = f3;
                    f = f2;
                } else {
                    fM4354getXimpl = (Offset.m4354getXimpl(pointerInputChange.getPosition()) - Offset.m4354getXimpl(pointerInputChange.getPreviousPosition())) + f3;
                    if (Math.abs(fM4354getXimpl) < f2) {
                        PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                        c1638x2966ccbb3.L$0 = function22;
                        c1638x2966ccbb3.L$1 = awaitPointerEventScope2;
                        c1638x2966ccbb3.L$2 = longRef2;
                        c1638x2966ccbb3.L$3 = pointerInputChange;
                        c1638x2966ccbb3.F$0 = f2;
                        c1638x2966ccbb3.F$1 = fM4354getXimpl;
                        c1638x2966ccbb3.label = 2;
                        if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass3, c1638x2966ccbb3) != coroutine_suspended) {
                            f = f2;
                            pointerInputChange2 = pointerInputChange;
                            if (pointerInputChange2.isConsumed()) {
                            }
                        }
                    } else {
                        function22.invoke(pointerInputChange, Boxing.boxFloat(fM4354getXimpl - (Math.signum(fM4354getXimpl) * f2)));
                        if (pointerInputChange.isConsumed()) {
                            return pointerInputChange;
                        }
                        f = f2;
                        fM4354getXimpl = 0.0f;
                    }
                }
                c1638x2966ccbb2 = c1638x2966ccbb3;
                longRef = longRef2;
                pointerEventPass2 = pointerEventPass;
                i5 = 1;
                c1638x2966ccbb2.L$0 = function22;
                c1638x2966ccbb2.L$1 = awaitPointerEventScope2;
                c1638x2966ccbb2.L$2 = longRef;
                c1638x2966ccbb2.L$3 = pointerEventPass2;
                c1638x2966ccbb2.F$0 = f;
                c1638x2966ccbb2.F$1 = fM4354getXimpl;
                c1638x2966ccbb2.label = i5;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, c1638x2966ccbb2, i5, pointerEventPass2);
                if (objAwaitPointerEvent$default != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        float f7 = c1638x2966ccbb.F$1;
        float f8 = c1638x2966ccbb.F$0;
        Ref.LongRef longRef5 = (Ref.LongRef) c1638x2966ccbb.L$2;
        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) c1638x2966ccbb.L$1;
        Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) c1638x2966ccbb.L$0;
        ResultKt.throwOnFailure(obj3);
        C1638x2966ccbb c1638x2966ccbb4 = c1638x2966ccbb;
        f3 = f7;
        awaitPointerEventScope2 = awaitPointerEventScope4;
        c1638x2966ccbb3 = c1638x2966ccbb4;
        f2 = f8;
        function22 = function24;
        longRef2 = longRef5;
        PointerEvent pointerEvent2 = (PointerEvent) obj3;
        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
        size = changes3.size();
        i2 = 0;
        while (true) {
            if (i2 < size) {
            }
            i2 = i3 + 1;
            pointerEventPass2 = pointerEventPass;
        }
        Intrinsics.checkNotNull(obj);
        pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange.isConsumed()) {
        }
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    private static final Object m3329awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function1<? super Offset, Float> function1, Continuation<? super PointerInputChange> continuation) {
        float f;
        PointerInputChange pointerInputChange;
        float f2;
        PointerInputChange pointerInputChange2;
        if (m3330isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float fM3331pointerSlopE8SPZFQ = m3331pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        float f3 = 0.0f;
        while (true) {
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    f = f3;
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i3);
                f = f3;
                if (Boolean.valueOf(PointerId.m5784equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                    break;
                }
                i3++;
                f3 = f;
            }
            Intrinsics.checkNotNull(pointerInputChange);
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i2 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i2);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i2++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                longRef.element = pointerInputChange4.getId();
                f2 = f;
            } else {
                float fFloatValue = f + (function1.invoke(Offset.m4343boximpl(pointerInputChange3.getPosition())).floatValue() - function1.invoke(Offset.m4343boximpl(pointerInputChange3.getPreviousPosition())).floatValue());
                if (Math.abs(fFloatValue) < fM3331pointerSlopE8SPZFQ) {
                    awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Final, continuation);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                    f2 = fFloatValue;
                } else {
                    function2.invoke(pointerInputChange3, Float.valueOf(fFloatValue - (Math.signum(fFloatValue) * fM3331pointerSlopE8SPZFQ)));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    f2 = 0.0f;
                    f3 = f2;
                }
            }
            f3 = f2;
        }
    }

    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m3330isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i);
            if (PointerId.m5784equalsimpl0(pointerInputChange.getId(), j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m3331pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i) {
        return PointerType.m5874equalsimpl0(i, PointerType.INSTANCE.m5879getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }

    static {
        float fM7055constructorimpl = C1959Dp.m7055constructorimpl((float) 0.125d);
        mouseSlop = fM7055constructorimpl;
        float fM7055constructorimpl2 = C1959Dp.m7055constructorimpl(18);
        defaultTouchSlop = fM7055constructorimpl2;
        mouseToTouchSlopRatio = fM7055constructorimpl / fM7055constructorimpl2;
    }
}
