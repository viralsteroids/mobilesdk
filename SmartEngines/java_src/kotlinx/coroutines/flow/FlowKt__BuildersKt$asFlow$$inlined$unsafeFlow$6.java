package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SafeCollector.common.kt */
@Metadata(m513d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, m514d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m515k = 1, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6<T> implements Flow<T> {
    final /* synthetic */ Object[] $this_asFlow$inlined;

    /* compiled from: SafeCollector.common.kt */
    @Metadata(m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
    @DebugMetadata(m532c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", m533f = "Builders.kt", m534i = {0, 0}, m535l = {116}, m536m = "collect", m537n = {"$this$asFlow_u24lambda_u2411", "$this$forEach$iv"}, m538s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6$1 */
    public static final class C35371 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C35371(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        C35371 c35371;
        FlowCollector flowCollector2;
        int i;
        int i2;
        Object[] objArr;
        if (continuation instanceof C35371) {
            c35371 = (C35371) continuation;
            if ((c35371.label & Integer.MIN_VALUE) != 0) {
                c35371.label -= Integer.MIN_VALUE;
            } else {
                c35371 = new C35371(continuation);
            }
        }
        Object obj = c35371.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c35371.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Object[] objArr2 = this.$this_asFlow$inlined;
            int length = objArr2.length;
            flowCollector2 = flowCollector;
            i = length;
            i2 = 0;
            objArr = objArr2;
            if (i2 < i) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c35371.I$1;
            i2 = c35371.I$0;
            objArr = (Object[]) c35371.L$1;
            FlowCollector flowCollector3 = (FlowCollector) c35371.L$0;
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector4 = flowCollector3;
            i2++;
            flowCollector2 = flowCollector4;
            if (i2 < i) {
                Object obj2 = objArr[i2];
                c35371.L$0 = flowCollector2;
                c35371.L$1 = objArr;
                c35371.I$0 = i2;
                c35371.I$1 = i;
                c35371.label = 1;
                Object objEmit = flowCollector2.emit(obj2, c35371);
                flowCollector4 = flowCollector2;
                if (objEmit == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2++;
                flowCollector2 = flowCollector4;
                if (i2 < i) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(Object[] objArr) {
        this.$this_asFlow$inlined = objArr;
    }
}
