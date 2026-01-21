package com.smartengines.camera;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.camera.view.LifecycleCameraController;
import androidx.camera.view.PreviewView;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraScreen.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
final class CameraScreenKt$CameraScreen$2$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ LifecycleCameraController $cameraController;
    final /* synthetic */ PreviewScaleType $previewScaleType;

    /* compiled from: CameraScreen.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreviewScaleType.values().length];
            try {
                iArr[PreviewScaleType.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreviewScaleType.FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    CameraScreenKt$CameraScreen$2$1(PreviewScaleType previewScaleType, LifecycleCameraController lifecycleCameraController) {
        this.$previewScaleType = previewScaleType;
        this.$cameraController = lifecycleCameraController;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C87@3242L1028:CameraScreen.kt#7douci");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            final PreviewScaleType previewScaleType = this.$previewScaleType;
            final LifecycleCameraController lifecycleCameraController = this.$cameraController;
            AndroidView_androidKt.AndroidView(new Function1() { // from class: com.smartengines.camera.CameraScreenKt$CameraScreen$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CameraScreenKt$CameraScreen$2$1.invoke$lambda$2(previewScaleType, lifecycleCameraController, (Context) obj);
                }
            }, modifierFillMaxSize$default, null, composer, 48, 4);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreviewView invoke$lambda$2(PreviewScaleType previewScaleType, LifecycleCameraController cameraController, Context context) {
        PreviewView.ScaleType scaleType;
        Intrinsics.checkNotNullParameter(cameraController, "$cameraController");
        Intrinsics.checkNotNullParameter(context, "context");
        PreviewView previewView = new PreviewView(context);
        previewView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        previewView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        previewView.setImplementationMode(PreviewView.ImplementationMode.COMPATIBLE);
        int i = WhenMappings.$EnumSwitchMapping$0[previewScaleType.ordinal()];
        if (i == 1) {
            scaleType = PreviewView.ScaleType.FIT_CENTER;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            scaleType = PreviewView.ScaleType.FILL_CENTER;
        }
        previewView.setScaleType(scaleType);
        previewView.setController(cameraController);
        return previewView;
    }
}
