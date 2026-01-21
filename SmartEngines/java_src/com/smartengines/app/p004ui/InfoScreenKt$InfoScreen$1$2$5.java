package com.smartengines.app.p004ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: InfoScreen.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class InfoScreenKt$InfoScreen$1$2$5 extends FunctionReferenceImpl implements Function0<Unit> {
    InfoScreenKt$InfoScreen$1$2$5(Object obj) {
        super(0, obj, InfoViewModel.class, "showTutorial", "showTutorial()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((InfoViewModel) this.receiver).showTutorial();
    }
}
