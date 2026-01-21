package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BufferedChannel.kt */
@Metadata(m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
@DebugMetadata(m532c = "kotlinx.coroutines.channels.BufferedChannel", m533f = "BufferedChannel.kt", m534i = {0, 0, 0, 0}, m535l = {3056}, m536m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", m537n = {"this", "segment", "index", "r"}, m538s = {"L$0", "L$1", "I$0", "J$0"})
/* loaded from: classes3.dex */
final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel<E> bufferedChannel, Continuation<? super BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> continuation) {
        super(continuation);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM9355receiveCatchingOnNoWaiterSuspendGKJJFZk = this.this$0.m9355receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
        return objM9355receiveCatchingOnNoWaiterSuspendGKJJFZk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM9355receiveCatchingOnNoWaiterSuspendGKJJFZk : ChannelResult.m9362boximpl(objM9355receiveCatchingOnNoWaiterSuspendGKJJFZk);
    }
}
