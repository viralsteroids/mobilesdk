package com.smartengines.app.p004ui;

import androidx.camera.view.LifecycleCameraController;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.Model;
import com.smartengines.app.mock.MockComposesKt;
import com.smartengines.camera.CameraScreenKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PhotoDialog.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PhotoDialogKt {
    public static final ComposableSingletons$PhotoDialogKt INSTANCE = new ComposableSingletons$PhotoDialogKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2027lambda1 = ComposableLambdaKt.composableLambdaInstance(877303265, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$PhotoDialogKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C*44@1719L16:PhotoDialog.kt#83idza");
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

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2028lambda2 = ComposableLambdaKt.composableLambdaInstance(1760814367, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$PhotoDialogKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C114@3804L12:PhotoDialog.kt#83idza");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                MockComposesKt.MockCamera(composer, 0);
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2029lambda3 = ComposableLambdaKt.composableLambdaInstance(1907936720, false, ComposableSingletons$PhotoDialogKt$lambda3$1.INSTANCE);

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7483getLambda1$app_storeRelease() {
        return f2027lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7484getLambda2$app_storeRelease() {
        return f2028lambda2;
    }

    /* renamed from: getLambda-3$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7485getLambda3$app_storeRelease() {
        return f2029lambda3;
    }
}
