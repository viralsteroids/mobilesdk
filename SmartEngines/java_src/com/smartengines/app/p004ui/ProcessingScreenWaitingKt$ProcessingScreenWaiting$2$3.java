package com.smartengines.app.p004ui;

import android.graphics.Bitmap;
import com.smartengines.app.Model;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProcessingScreenWaiting.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$3 extends FunctionReferenceImpl implements Function1<Bitmap, Unit> {
    ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$3(Object obj) {
        super(1, obj, Model.class, "onGalleryPhotoLoaded", "onGalleryPhotoLoaded(Landroid/graphics/Bitmap;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((Model) this.receiver).onGalleryPhotoLoaded(p0);
    }
}
