package com.smartengines.engine.p005id;

import com.smartengines.visualization.Visualization;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VaSessionWrapper.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class VaSessionWrapper$vaCallback$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    VaSessionWrapper$vaCallback$1(Object obj) {
        super(1, obj, Visualization.Instruction.class, "update", "update(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((Visualization.Instruction) this.receiver).update(str);
    }
}
