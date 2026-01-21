package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import org.bouncycastle.crypto.tls.CipherSuite;

/* compiled from: Reduce.kt */
@Metadata(m515k = 3, m516mv = {1, 8, 0}, m518xi = CipherSuite.TLS_PSK_WITH_NULL_SHA256)
@DebugMetadata(m532c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", m533f = "Reduce.kt", m534i = {}, m535l = {45}, m536m = "emit", m537n = {}, m538s = {})
/* loaded from: classes3.dex */
public final class FlowKt__ReduceKt$fold$2$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__ReduceKt.C35892<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ReduceKt$fold$2$emit$1(FlowKt__ReduceKt.C35892<? super T> c35892, Continuation<? super FlowKt__ReduceKt$fold$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = c35892;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
