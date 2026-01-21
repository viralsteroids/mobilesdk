package androidx.compose.p000ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jmrtd.lds.LDSFile;

/* compiled from: NestedScrollNode.kt */
@Metadata(m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
@DebugMetadata(m532c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", m533f = "NestedScrollNode.kt", m534i = {0, 0, 1}, m535l = {LDSFile.EF_DG1_TAG, 98}, m536m = "onPreFling-QWom1Mo", m537n = {"this", "available", "parentPreConsumed"}, m538s = {"L$0", "J$0", "J$0"})
/* loaded from: classes2.dex */
final class NestedScrollNode$onPreFling$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollNode$onPreFling$1(NestedScrollNode nestedScrollNode, Continuation<? super NestedScrollNode$onPreFling$1> continuation) {
        super(continuation);
        this.this$0 = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo1510onPreFlingQWom1Mo(0L, this);
    }
}
