package com.smartengines.app.p004ui;

import com.smartengines.app.Model;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ProcessingScreenVideo.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class ProcessingScreenVideoKt$Buttons$1$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    ProcessingScreenVideoKt$Buttons$1$1$1(Object obj) {
        super(0, obj, Model.class, "stopProcessing", "stopProcessing()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((Model) this.receiver).stopProcessing();
    }
}
