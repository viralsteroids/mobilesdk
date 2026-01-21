package com.smartengines.camera;

import android.content.Context;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.view.CameraController;
import androidx.camera.view.LifecycleCameraController;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionsUtilKt;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: CameraStaff.kt */
@Metadata(m513d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\u000e\u001a<\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u001a\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0014\u001a\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017\u001a?\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00032'\u0010\u0019\u001a#\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\r0\u001a\u001a\u0015\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0007¢\u0006\u0002\u0010!\u001a\u001d\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0003¢\u0006\u0002\u0010$\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, m514d2 = {"TAG", "", "rememberCameraController", "Landroidx/camera/view/LifecycleCameraController;", "context", "Landroid/content/Context;", "cameraSelector", "Landroidx/camera/core/CameraSelector;", "analyzerExecutor", "Ljava/util/concurrent/Executor;", "onVideoFrame", "Lkotlin/Function1;", "Landroidx/camera/core/ImageProxy;", "", "(Landroid/content/Context;Landroidx/camera/core/CameraSelector;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/camera/view/LifecycleCameraController;", "initCamera", "StartStopCameraEffect", "isCameraEnabled", "", "cameraController", "(ZLandroidx/camera/view/LifecycleCameraController;Landroidx/compose/runtime/Composer;I)V", "switchCamera", "controller", "Landroidx/camera/view/CameraController;", "takePhoto", "onPhotoTaken", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "isFrontCamera", "AutoRequestCameraPermission", "permissionState", "Lcom/google/accompanist/permissions/PermissionState;", "(Lcom/google/accompanist/permissions/PermissionState;Landroidx/compose/runtime/Composer;I)V", "CameraPermissionRequestEffectLauncher", "isGranted", "(ZLcom/google/accompanist/permissions/PermissionState;Landroidx/compose/runtime/Composer;I)V", "camera_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CameraStaffKt {
    private static final String TAG = "myapp.CameraStaff";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutoRequestCameraPermission$lambda$4(PermissionState permissionState, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(permissionState, "$permissionState");
        AutoRequestCameraPermission(permissionState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraPermissionRequestEffectLauncher$lambda$7(boolean z, PermissionState permissionState, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(permissionState, "$permissionState");
        CameraPermissionRequestEffectLauncher(z, permissionState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StartStopCameraEffect$lambda$3(boolean z, LifecycleCameraController cameraController, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(cameraController, "$cameraController");
        StartStopCameraEffect(z, cameraController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final LifecycleCameraController rememberCameraController(Context context, CameraSelector cameraSelector, Executor executor, Function1<? super ImageProxy, Unit> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        composer.startReplaceGroup(483000717);
        ComposerKt.sourceInformation(composer, "C(rememberCameraController)P(2,1)35@1277L92:CameraStaff.kt#7douci");
        if ((i2 & 2) != 0) {
            cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
        }
        if ((i2 & 4) != 0) {
            executor = null;
        }
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        composer.startReplaceGroup(-1113342374);
        ComposerKt.sourceInformation(composer, "CC(remember):CameraStaff.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = initCamera(context, cameraSelector, executor, function1);
            composer.updateRememberedValue(objRememberedValue);
        }
        LifecycleCameraController lifecycleCameraController = (LifecycleCameraController) objRememberedValue;
        composer.endReplaceGroup();
        composer.endReplaceGroup();
        return lifecycleCameraController;
    }

    public static /* synthetic */ LifecycleCameraController initCamera$default(Context context, CameraSelector cameraSelector, Executor executor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
        }
        if ((i & 4) != 0) {
            executor = null;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        return initCamera(context, cameraSelector, executor, function1);
    }

    public static final LifecycleCameraController initCamera(Context context, CameraSelector cameraSelector, Executor executor, final Function1<? super ImageProxy, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Log.w(TAG, "init camera");
        LifecycleCameraController lifecycleCameraController = new LifecycleCameraController(context);
        if (executor != null && function1 != null) {
            lifecycleCameraController.setImageAnalysisAnalyzer(executor, new ImageAnalysis.Analyzer() { // from class: com.smartengines.camera.CameraStaffKt$$ExternalSyntheticLambda2
                @Override // androidx.camera.core.ImageAnalysis.Analyzer
                public final void analyze(ImageProxy imageProxy) {
                    CameraStaffKt.initCamera$lambda$1(function1, imageProxy);
                }
            });
        }
        lifecycleCameraController.setEnabledUseCases(0);
        lifecycleCameraController.setCameraSelector(cameraSelector);
        ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setResolutionStrategy(ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY).build();
        Intrinsics.checkNotNullExpressionValue(resolutionSelectorBuild, "build(...)");
        lifecycleCameraController.setImageAnalysisResolutionSelector(resolutionSelectorBuild);
        lifecycleCameraController.setImageCaptureResolutionSelector(resolutionSelectorBuild);
        return lifecycleCameraController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCamera$lambda$1(Function1 function1, ImageProxy p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        function1.invoke(p0);
    }

    public static final void StartStopCameraEffect(final boolean z, final LifecycleCameraController cameraController, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Composer composerStartRestartGroup = composer.startRestartGroup(575591790);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(StartStopCameraEffect)P(1)74@2716L7,75@2728L414:CameraStaff.kt#7douci");
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localLifecycleOwner);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) objConsume;
        EffectsKt.SideEffect(new Function0() { // from class: com.smartengines.camera.CameraStaffKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraStaffKt.StartStopCameraEffect$lambda$2(z, cameraController, lifecycleOwner);
            }
        }, composerStartRestartGroup, 0);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.camera.CameraStaffKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CameraStaffKt.StartStopCameraEffect$lambda$3(z, cameraController, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StartStopCameraEffect$lambda$2(boolean z, LifecycleCameraController cameraController, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(cameraController, "$cameraController");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "$lifecycleOwner");
        if (z) {
            if (cameraController.getCameraInfo() == null) {
                Log.e(TAG, "start the camera");
                cameraController.bindToLifecycle(lifecycleOwner);
            }
        } else if (cameraController.getCameraInfo() != null) {
            Log.e(TAG, "stop the camera");
            cameraController.unbind();
        }
        return Unit.INSTANCE;
    }

    public static final void switchCamera(CameraController controller) {
        CameraSelector cameraSelector;
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (Intrinsics.areEqual(controller.getCameraSelector(), CameraSelector.DEFAULT_BACK_CAMERA)) {
            cameraSelector = CameraSelector.DEFAULT_FRONT_CAMERA;
        } else {
            cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
        }
        controller.setCameraSelector(cameraSelector);
    }

    public static final void takePhoto(Context context, final LifecycleCameraController cameraController, final Function2<? super ImageProxy, ? super Boolean, Unit> onPhotoTaken) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(onPhotoTaken, "onPhotoTaken");
        cameraController.takePicture(ContextCompat.getMainExecutor(context), new ImageCapture.OnImageCapturedCallback() { // from class: com.smartengines.camera.CameraStaffKt.takePhoto.1
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(ImageProxy image) {
                Intrinsics.checkNotNullParameter(image, "image");
                Log.w(CameraStaffKt.TAG, "onCaptureSuccess image size:" + image.getWidth() + 'x' + image.getHeight() + ' ');
                onPhotoTaken.invoke(image, Boolean.valueOf(Intrinsics.areEqual(cameraController.getCameraSelector(), CameraSelector.DEFAULT_FRONT_CAMERA)));
            }
        });
    }

    public static final void AutoRequestCameraPermission(final PermissionState permissionState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(permissionState, "permissionState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1865129351);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AutoRequestCameraPermission)115@4090L88:CameraStaff.kt#7douci");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(permissionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            CameraPermissionRequestEffectLauncher(PermissionsUtilKt.isGranted(permissionState.getStatus()), permissionState, composerStartRestartGroup, (i2 << 3) & LDSFile.EF_DG16_TAG);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.camera.CameraStaffKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CameraStaffKt.AutoRequestCameraPermission$lambda$4(permissionState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CameraPermissionRequestEffectLauncher(final boolean z, final PermissionState permissionState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(701841317);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CameraPermissionRequestEffectLauncher)120@4354L72,120@4343L83:CameraStaff.kt#7douci");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & LDSFile.EF_DG16_TAG) == 0) {
            i2 |= composerStartRestartGroup.changed(permissionState) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startReplaceGroup(1493751076);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):CameraStaff.kt#9igjgp");
            boolean z2 = ((i2 & 14) == 4) | ((i2 & LDSFile.EF_DG16_TAG) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.smartengines.camera.CameraStaffKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CameraStaffKt.CameraPermissionRequestEffectLauncher$lambda$6$lambda$5(z, permissionState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.camera.CameraStaffKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CameraStaffKt.CameraPermissionRequestEffectLauncher$lambda$7(z, permissionState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraPermissionRequestEffectLauncher$lambda$6$lambda$5(boolean z, PermissionState permissionState) {
        Intrinsics.checkNotNullParameter(permissionState, "$permissionState");
        if (!z) {
            permissionState.launchPermissionRequest();
        }
        return Unit.INSTANCE;
    }
}
