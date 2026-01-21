package com.smartengines.app.p004ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TargetsScreen.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class TargetsScreenKt$TargetsScreen$1$1$2$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    TargetsScreenKt$TargetsScreen$1$1$2$1(Object obj) {
        super(1, obj, TargetsViewModel.class, "onFilterChanged", "onFilterChanged(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((TargetsViewModel) this.receiver).onFilterChanged(p0);
    }
}
