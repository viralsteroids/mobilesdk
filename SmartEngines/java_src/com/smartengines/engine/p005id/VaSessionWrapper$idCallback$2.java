package com.smartengines.engine.p005id;

import com.smartengines.visualization.Quad;
import com.smartengines.visualization.Visualization;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VaSessionWrapper.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class VaSessionWrapper$idCallback$2 extends FunctionReferenceImpl implements Function1<Set<? extends Quad>, Unit> {
    VaSessionWrapper$idCallback$2(Object obj) {
        super(1, obj, Visualization.Quads.class, "append", "append(Ljava/util/Set;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Quad> set) {
        invoke2((Set<Quad>) set);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Set<Quad> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((Visualization.Quads) this.receiver).append(p0);
    }
}
