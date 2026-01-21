package com.smartengines.app.p004ui;

import androidx.camera.view.LifecycleCameraController;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.Model;
import com.smartengines.camera.CameraScreenKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AppContent.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$AppContentKt {
    public static final ComposableSingletons$AppContentKt INSTANCE = new ComposableSingletons$AppContentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f1971lambda1 = ComposableLambdaKt.composableLambdaInstance(-1789668741, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$AppContentKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C*87@3806L16:AppContent.kt#83idza");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            LifecycleCameraController cameraController = Model.INSTANCE.getCameraController();
            if (cameraController == null) {
                return;
            }
            CameraScreenKt.CameraScreen(cameraController, null, composer, 8, 2);
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7416getLambda1$app_storeRelease() {
        return f1971lambda1;
    }
}
