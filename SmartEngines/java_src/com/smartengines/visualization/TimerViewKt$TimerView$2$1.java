package com.smartengines.visualization;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.State;
import com.smartengines.visualization.Visualization;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.bouncycastle.crypto.tls.CipherSuite;

/* compiled from: TimerView.kt */
@Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
@DebugMetadata(m532c = "com.smartengines.visualization.TimerViewKt$TimerView$2$1", m533f = "TimerView.kt", m534i = {}, m535l = {CipherSuite.TLS_DH_DSS_WITH_AES_128_CBC_SHA256}, m536m = "invokeSuspend", m537n = {}, m538s = {})
/* loaded from: classes3.dex */
final class TimerViewKt$TimerView$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Visualization.Timer.Data> $data$delegate;
    final /* synthetic */ MutableLongState $delayTime;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerViewKt$TimerView$2$1(MutableLongState mutableLongState, State<Visualization.Timer.Data> state, Continuation<? super TimerViewKt$TimerView$2$1> continuation) {
        super(2, continuation);
        this.$delayTime = mutableLongState;
        this.$data$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TimerViewKt$TimerView$2$1(this.$delayTime, this.$data$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TimerViewKt$TimerView$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            this.$delayTime.setLongValue(System.currentTimeMillis() - TimerViewKt.TimerView$lambda$0(this.$data$delegate).getStartTime());
            if (this.$delayTime.getLongValue() > TimerViewKt.TimerView$lambda$0(this.$data$delegate).getLength()) {
                return Unit.INSTANCE;
            }
            this.label = 1;
        } while (DelayKt.delay(100L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
