package com.smartengines.app.p004ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.smartengines.app.CameraButtonsModel;
import com.smartengines.app.CameraButtonsState;
import com.smartengines.app.Model;
import com.smartengines.app.PhotoTakingState;
import com.smartengines.app.targets.TreeLeaf;
import com.smartengines.engine.ImageProcessingState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProcessingScreen.kt */
@Metadata(m513d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, m514d2 = {"ProcessingScreen", "", "selectedTreeLeaf", "Lcom/smartengines/app/targets/TreeLeaf;", "imageProcessingState", "Lcom/smartengines/engine/ImageProcessingState;", "cameraContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/ImageProcessingState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "app_storeRelease", "cameraButtonsState", "Lcom/smartengines/app/CameraButtonsState;"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ProcessingScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProcessingScreen$lambda$2(TreeLeaf selectedTreeLeaf, ImageProcessingState imageProcessingState, Function2 cameraContent, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(selectedTreeLeaf, "$selectedTreeLeaf");
        Intrinsics.checkNotNullParameter(imageProcessingState, "$imageProcessingState");
        Intrinsics.checkNotNullParameter(cameraContent, "$cameraContent");
        ProcessingScreen(selectedTreeLeaf, imageProcessingState, cameraContent, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ProcessingScreen(TreeLeaf selectedTreeLeaf, final ImageProcessingState imageProcessingState, final Function2<? super Composer, ? super Integer, Unit> cameraContent, Composer composer, final int i) {
        final TreeLeaf treeLeaf;
        Composer composer2;
        Intrinsics.checkNotNullParameter(selectedTreeLeaf, "selectedTreeLeaf");
        Intrinsics.checkNotNullParameter(imageProcessingState, "imageProcessingState");
        Intrinsics.checkNotNullParameter(cameraContent, "cameraContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1323828522);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ProcessingScreen)P(2,1)51@2165L16,56@2351L1034:ProcessingScreen.kt#83idza");
        State stateCollectAsState = SnapshotStateKt.collectAsState(CameraButtonsModel.INSTANCE.getStateFlow(), null, composerStartRestartGroup, 8, 1);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment topCenter = Alignment.INSTANCE.getTopCenter();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topCenter, false);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2051387410, "C:ProcessingScreen.kt#83idza");
        composerStartRestartGroup.startReplaceGroup(1867291608);
        ComposerKt.sourceInformation(composerStartRestartGroup, "64@2659L8,67@2747L10");
        boolean z = imageProcessingState instanceof ImageProcessingState.WAITING;
        if (z || (imageProcessingState instanceof ImageProcessingState.VIDEO_PROCESSING)) {
            cameraContent.invoke(composerStartRestartGroup, Integer.valueOf((i >> 6) & 14));
            if (ProcessingScreen$lambda$0(stateCollectAsState).isCrop()) {
                CropViewKt.CropView(composerStartRestartGroup, 0);
            }
        }
        composerStartRestartGroup.endReplaceGroup();
        if (z) {
            composerStartRestartGroup.startReplaceGroup(1867301923);
            ComposerKt.sourceInformation(composerStartRestartGroup, "74@2879L81");
            composer2 = composerStartRestartGroup;
            ProcessingScreenWaitingKt.ProcessingScreenWaiting(selectedTreeLeaf, Model.INSTANCE.getPhotoTaking(), ProcessingScreen$lambda$0(stateCollectAsState), null, composer2, 8, 8);
            treeLeaf = selectedTreeLeaf;
            composer2.endReplaceGroup();
        } else {
            treeLeaf = selectedTreeLeaf;
            composer2 = composerStartRestartGroup;
            if (imageProcessingState instanceof ImageProcessingState.VIDEO_PROCESSING) {
                composer2.startReplaceGroup(1867305635);
                ComposerKt.sourceInformation(composer2, "75@2996L49");
                ProcessingScreenVideoKt.ProcessingScreenVideo((ImageProcessingState.VIDEO_PROCESSING) imageProcessingState, treeLeaf, null, composer2, 72, 4);
                composer2 = composer2;
                composer2.endReplaceGroup();
            } else if (imageProcessingState instanceof ImageProcessingState.PHOTO_PROCESSING) {
                composer2.startReplaceGroup(1867308424);
                ComposerKt.sourceInformation(composer2, "76@3081L118");
                PhotoTakingState photoTaking = Model.INSTANCE.getPhotoTaking();
                Intrinsics.checkNotNull(photoTaking, "null cannot be cast to non-null type com.smartengines.app.PhotoTakingState.Ready");
                ProcessingScreenPhotoKt.ProcessingScreenPhoto(((PhotoTakingState.Ready) photoTaking).getPhoto(), ((ImageProcessingState.PHOTO_PROCESSING) imageProcessingState).getVisualizations(), treeLeaf, null, composer2, 584, 8);
                treeLeaf = treeLeaf;
                composer2.endReplaceGroup();
            } else if (imageProcessingState instanceof ImageProcessingState.FINISHED) {
                composer2.startReplaceGroup(1867313283);
                ComposerKt.sourceInformation(composer2, "77@3235L49");
                ProcessingScreenResultKt.ProcessingScreenResult((ImageProcessingState.FINISHED) imageProcessingState, treeLeaf, null, composer2, 72, 4);
                composer2 = composer2;
                composer2.endReplaceGroup();
            } else {
                if (!(imageProcessingState instanceof ImageProcessingState.ERROR)) {
                    composer2.startReplaceGroup(1867300792);
                    composer2.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer2.startReplaceGroup(1867316003);
                ComposerKt.sourceInformation(composer2, "78@3320L49");
                ProcessingScreenErrorKt.ProcessingScreenError((ImageProcessingState.ERROR) imageProcessingState, treeLeaf, composer2, 72);
                composer2.endReplaceGroup();
            }
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.ProcessingScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProcessingScreenKt.ProcessingScreen$lambda$2(treeLeaf, imageProcessingState, cameraContent, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final CameraButtonsState ProcessingScreen$lambda$0(State<CameraButtonsState> state) {
        return state.getValue();
    }
}
