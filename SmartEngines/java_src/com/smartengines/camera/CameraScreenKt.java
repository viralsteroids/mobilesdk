package com.smartengines.camera;

import android.util.Log;
import androidx.camera.view.LifecycleCameraController;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.LifecycleOwner;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStateKt;
import com.google.accompanist.permissions.PermissionsUtilKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: CameraScreen.kt */
@Metadata(m513d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m514d2 = {"TAG", "", "CameraScreen", "", "cameraController", "Landroidx/camera/view/LifecycleCameraController;", "previewScaleType", "Lcom/smartengines/camera/PreviewScaleType;", "(Landroidx/camera/view/LifecycleCameraController;Lcom/smartengines/camera/PreviewScaleType;Landroidx/compose/runtime/Composer;II)V", "NoPermissions", "permissionState", "Lcom/google/accompanist/permissions/PermissionState;", "(Lcom/google/accompanist/permissions/PermissionState;Landroidx/compose/runtime/Composer;I)V", "camera_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CameraScreenKt {
    private static final String TAG = "myapp.CameraScreen";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraScreen$lambda$2(LifecycleCameraController cameraController, PreviewScaleType previewScaleType, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(cameraController, "$cameraController");
        CameraScreen(cameraController, previewScaleType, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoPermissions$lambda$5(PermissionState permissionState, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(permissionState, "$permissionState");
        NoPermissions(permissionState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CameraScreen(final LifecycleCameraController cameraController, PreviewScaleType previewScaleType, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Composer composerStartRestartGroup = composer.startRestartGroup(1110216207);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CameraScreen)56@2068L51,57@2124L50,61@2330L7,62@2342L437,78@2904L1497:CameraScreen.kt#7douci");
        final PreviewScaleType previewScaleType2 = (i2 & 2) != 0 ? PreviewScaleType.FILL : previewScaleType;
        final PermissionState permissionStateRememberPermissionState = PermissionStateKt.rememberPermissionState("android.permission.CAMERA", null, composerStartRestartGroup, 0, 2);
        CameraStaffKt.AutoRequestCameraPermission(permissionStateRememberPermissionState, composerStartRestartGroup, 0);
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localLifecycleOwner);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) objConsume;
        EffectsKt.SideEffect(new Function0() { // from class: com.smartengines.camera.CameraScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraScreenKt.CameraScreen$lambda$0(permissionStateRememberPermissionState, cameraController, lifecycleOwner);
            }
        }, composerStartRestartGroup, 0);
        Modifier modifierM990backgroundbw27NRU$default = BackgroundKt.m990backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m4621getBlack0d7_KjU(), null, 2, null);
        Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomCenter, false);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM990backgroundbw27NRU$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composerStartRestartGroup);
        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1318481673, "C:CameraScreen.kt#7douci");
        if (PermissionsUtilKt.isGranted(permissionStateRememberPermissionState.getStatus())) {
            composerStartRestartGroup.startReplaceGroup(1318520825);
            ComposerKt.sourceInformation(composerStartRestartGroup, "85@3158L1126,85@3115L1169");
            SurfaceKt.m2978SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-215567669, true, new CameraScreenKt$CameraScreen$2$1(previewScaleType2, cameraController), composerStartRestartGroup, 54), composerStartRestartGroup, 12582918, 126);
            composerStartRestartGroup.endReplaceGroup();
        } else {
            composerStartRestartGroup.startReplaceGroup(1319676195);
            ComposerKt.sourceInformation(composerStartRestartGroup, "109@4349L36");
            NoPermissions(permissionStateRememberPermissionState, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.camera.CameraScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CameraScreenKt.CameraScreen$lambda$2(cameraController, previewScaleType2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraScreen$lambda$0(PermissionState cameraPermissionState, LifecycleCameraController cameraController, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(cameraPermissionState, "$cameraPermissionState");
        Intrinsics.checkNotNullParameter(cameraController, "$cameraController");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "$lifecycleOwner");
        if (PermissionsUtilKt.isGranted(cameraPermissionState.getStatus())) {
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

    public static final void NoPermissions(final PermissionState permissionState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(permissionState, "permissionState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1164973720);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NoPermissions)117@4516L537:CameraScreen.kt#7douci");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(permissionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifierM1435padding3ABfNKs = PaddingKt.m1435padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), C1959Dp.m7055constructorimpl(20));
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1435padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composerStartRestartGroup);
            Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2132846231, "C124@4733L53:CameraScreen.kt#7douci");
            int i3 = i2;
            TextKt.m3128Text4IGK_g("The camera permissions are not granted", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 6, 0, 131070);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(900087406);
            ComposerKt.sourceInformation(composerStartRestartGroup, "126@4856L41,127@4927L40,127@4910L127");
            if (PermissionsUtilKt.getShouldShowRationale(permissionState.getStatus())) {
                SpacerKt.Spacer(SizeKt.m1466height3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(50)), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(900091418);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):CameraScreen.kt#9igjgp");
                boolean z = (i3 & 14) == 4;
                CameraScreenKt$NoPermissions$1$1$1 cameraScreenKt$NoPermissions$1$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || cameraScreenKt$NoPermissions$1$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    cameraScreenKt$NoPermissions$1$1$1RememberedValue = new CameraScreenKt$NoPermissions$1$1$1(permissionState);
                    composerStartRestartGroup.updateRememberedValue(cameraScreenKt$NoPermissions$1$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ButtonKt.Button((Function0) ((KFunction) cameraScreenKt$NoPermissions$1$1$1RememberedValue), null, false, null, null, null, null, null, null, ComposableSingletons$CameraScreenKt.INSTANCE.m7808getLambda1$camera_release(), composerStartRestartGroup, 805306368, 510);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.camera.CameraScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CameraScreenKt.NoPermissions$lambda$5(permissionState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
