package androidx.compose.foundation.gestures;

import androidx.compose.p000ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: Scrollable.kt */
@Metadata(m513d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m514d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "velocity"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
@DebugMetadata(m532c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", m533f = "Scrollable.kt", m534i = {0, 1, 1, 2, 2}, m535l = {745, 748, 751}, m536m = "invokeSuspend", m537n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, m538s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
/* loaded from: classes.dex */
final class ScrollingLogic$onDragStopped$performFling$1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, Continuation<? super ScrollingLogic$onDragStopped$performFling$1> continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, continuation);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((Velocity) obj).getPackedValue();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
        return m1254invokesFctU(velocity.getPackedValue(), continuation);
    }

    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m1254invokesFctU(long j, Continuation<? super Velocity> continuation) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(Velocity.m7283boximpl(j), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM5680dispatchPreFlingQWom1Mo;
        long j;
        long jM7295minusAH228Gc;
        Object objM1247doFlingAnimationQWom1Mo;
        long packedValue;
        Object objM5678dispatchPostFlingRZ2iAVY;
        long j2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j3 = this.J$0;
            this.J$0 = j3;
            this.label = 1;
            objM5680dispatchPreFlingQWom1Mo = this.this$0.nestedScrollDispatcher.m5680dispatchPreFlingQWom1Mo(j3, this);
            if (objM5680dispatchPreFlingQWom1Mo != coroutine_suspended) {
                j = j3;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j4 = this.J$1;
                j2 = this.J$0;
                ResultKt.throwOnFailure(obj);
                packedValue = j4;
                objM5678dispatchPostFlingRZ2iAVY = obj;
                return Velocity.m7283boximpl(Velocity.m7295minusAH228Gc(j2, Velocity.m7295minusAH228Gc(packedValue, ((Velocity) objM5678dispatchPostFlingRZ2iAVY).getPackedValue())));
            }
            long j5 = this.J$1;
            long j6 = this.J$0;
            ResultKt.throwOnFailure(obj);
            jM7295minusAH228Gc = j5;
            j = j6;
            objM1247doFlingAnimationQWom1Mo = obj;
            packedValue = ((Velocity) objM1247doFlingAnimationQWom1Mo).getPackedValue();
            this.J$0 = j;
            this.J$1 = packedValue;
            this.label = 3;
            objM5678dispatchPostFlingRZ2iAVY = this.this$0.nestedScrollDispatcher.m5678dispatchPostFlingRZ2iAVY(Velocity.m7295minusAH228Gc(jM7295minusAH228Gc, packedValue), packedValue, this);
            if (objM5678dispatchPostFlingRZ2iAVY != coroutine_suspended) {
                j2 = j;
                return Velocity.m7283boximpl(Velocity.m7295minusAH228Gc(j2, Velocity.m7295minusAH228Gc(packedValue, ((Velocity) objM5678dispatchPostFlingRZ2iAVY).getPackedValue())));
            }
            return coroutine_suspended;
        }
        j = this.J$0;
        ResultKt.throwOnFailure(obj);
        objM5680dispatchPreFlingQWom1Mo = obj;
        jM7295minusAH228Gc = Velocity.m7295minusAH228Gc(j, ((Velocity) objM5680dispatchPreFlingQWom1Mo).getPackedValue());
        this.J$0 = j;
        this.J$1 = jM7295minusAH228Gc;
        this.label = 2;
        objM1247doFlingAnimationQWom1Mo = this.this$0.m1247doFlingAnimationQWom1Mo(jM7295minusAH228Gc, this);
        if (objM1247doFlingAnimationQWom1Mo != coroutine_suspended) {
            packedValue = ((Velocity) objM1247doFlingAnimationQWom1Mo).getPackedValue();
            this.J$0 = j;
            this.J$1 = packedValue;
            this.label = 3;
            objM5678dispatchPostFlingRZ2iAVY = this.this$0.nestedScrollDispatcher.m5678dispatchPostFlingRZ2iAVY(Velocity.m7295minusAH228Gc(jM7295minusAH228Gc, packedValue), packedValue, this);
            if (objM5678dispatchPostFlingRZ2iAVY != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
