package com.smartengines.app.p004ui;

import android.graphics.Bitmap;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.smartengines.app.CameraButtonsState;
import com.smartengines.app.mock.MockComposesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraButtonsView.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.ComposableSingletons$CameraButtonsViewKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$CameraButtonsViewKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CameraButtonsViewKt$lambda3$1 INSTANCE = new ComposableSingletons$CameraButtonsViewKt$lambda3$1();

    ComposableSingletons$CameraButtonsViewKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C276@9746L12,277@9771L91:CameraButtonsView.kt#83idza");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            MockComposesKt.MockCamera(composer, 0);
            CameraButtonsViewKt.m7412CameraButtonsyrwZFoE(new CameraButtonsState(false, false, false, false, 15, null), new Function0() { // from class: com.smartengines.app.ui.ComposableSingletons$CameraButtonsViewKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, new Function1() { // from class: com.smartengines.app.ui.ComposableSingletons$CameraButtonsViewKt$lambda-3$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$CameraButtonsViewKt$lambda3$1.invoke$lambda$1((Bitmap) obj);
                }
            }, new Function0() { // from class: com.smartengines.app.ui.ComposableSingletons$CameraButtonsViewKt$lambda-3$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, Color.INSTANCE.m4632getWhite0d7_KjU(), composer, 28080, 0);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
