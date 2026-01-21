package com.smartengines.visualization;

import com.smartengines.visualization.QuadsViewFadingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: QuadsViewFading.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
@DebugMetadata(m532c = "com.smartengines.visualization.QuadsViewFadingKt$backgroundTask$2", m533f = "QuadsViewFading.kt", m534i = {0}, m535l = {78}, m536m = "emit", m537n = {"this"}, m538s = {"L$0"})
/* loaded from: classes3.dex */
final class QuadsViewFadingKt$backgroundTask$2$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QuadsViewFadingKt.C33142<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    QuadsViewFadingKt$backgroundTask$2$emit$1(QuadsViewFadingKt.C33142<? super T> c33142, Continuation<? super QuadsViewFadingKt$backgroundTask$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = c33142;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((QuadFrame) null, (Continuation<? super Unit>) this);
    }
}
