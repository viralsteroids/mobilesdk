package com.smartengines.app.p004ui;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.ColorFilter;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.res.PainterResources_androidKt;
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
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.C3069R;
import com.smartengines.app.CameraButtonsState;
import com.smartengines.app.Model;
import com.smartengines.app.Photo;
import com.smartengines.app.PhotoTakingState;
import com.smartengines.app.mock.MockComposesKt;
import com.smartengines.app.mock.MockSelectorsKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.targets.TreeLeaf;
import com.smartengines.targets.p008id.LivenessTarget;
import com.smartengines.utils.UtilsKt;
import com.smartengines.visualization.C3315R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;

/* compiled from: ProcessingScreenWaiting.kt */
@Metadata(m513d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0013\b\u0002\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0011\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m514d2 = {"TAG", "", "ProcessingScreenWaiting", "", "selectedTreeLeaf", "Lcom/smartengines/app/targets/TreeLeaf;", "photoTakingState", "Lcom/smartengines/app/PhotoTakingState;", "cameraButtonsState", "Lcom/smartengines/app/CameraButtonsState;", MessageBundle.TITLE_ENTRY, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/app/PhotoTakingState;Lcom/smartengines/app/CameraButtonsState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "PreviewPhotoTaking", "PreviewPhotoReady", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ProcessingScreenWaitingKt {
    private static final String TAG = "myapp.ProcessingScreenWaiting";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$6(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPhotoReady$lambda$9(int i, Composer composer, int i2) {
        PreviewPhotoReady(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPhotoTaking$lambda$7(int i, Composer composer, int i2) {
        PreviewPhotoTaking(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ProcessingScreenWaiting$lambda$4$lambda$3(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProcessingScreenWaiting$lambda$5(TreeLeaf selectedTreeLeaf, PhotoTakingState photoTakingState, CameraButtonsState cameraButtonsState, Function2 function2, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(selectedTreeLeaf, "$selectedTreeLeaf");
        Intrinsics.checkNotNullParameter(photoTakingState, "$photoTakingState");
        Intrinsics.checkNotNullParameter(cameraButtonsState, "$cameraButtonsState");
        ProcessingScreenWaiting(selectedTreeLeaf, photoTakingState, cameraButtonsState, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    public static final void ProcessingScreenWaiting(final TreeLeaf selectedTreeLeaf, final PhotoTakingState photoTakingState, final CameraButtonsState cameraButtonsState, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Function2<? super Composer, ? super Integer, Unit> function22;
        Context context;
        int i3;
        ?? r15;
        Composer composer2;
        boolean z;
        Intrinsics.checkNotNullParameter(selectedTreeLeaf, "selectedTreeLeaf");
        Intrinsics.checkNotNullParameter(photoTakingState, "photoTakingState");
        Intrinsics.checkNotNullParameter(cameraButtonsState, "cameraButtonsState");
        Composer composerStartRestartGroup = composer.startRestartGroup(587291397);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ProcessingScreenWaiting)P(2,1)51@2164L35,54@2235L7,58@2363L3674:ProcessingScreenWaiting.kt#83idza");
        ComposableLambda composableLambdaRememberComposableLambda = (i2 & 8) != 0 ? ComposableLambdaKt.rememberComposableLambda(683206673, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ProcessingScreenWaitingKt.ProcessingScreenWaiting.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i4) {
                ComposerKt.sourceInformation(composer3, "C51@2165L33:ProcessingScreenWaiting.kt#83idza");
                if ((i4 & 11) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                } else {
                    ProcessingTitleKt.ProcessingTitle(selectedTreeLeaf, false, composer3, 8, 2);
                }
            }
        }, composerStartRestartGroup, 54) : function2;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        Context context2 = (Context) objConsume;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomCenter, false);
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
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 85345651, "C111@4533L8,126@5069L962,121@4860L1171:ProcessingScreenWaiting.kt#83idza");
        composerStartRestartGroup.startReplaceGroup(-1521269458);
        ComposerKt.sourceInformation(composerStartRestartGroup, "92@3822L147,90@3743L388");
        if (Intrinsics.areEqual(photoTakingState, PhotoTakingState.Inactive.INSTANCE)) {
            composerStartRestartGroup.startReplaceGroup(-1521267529);
            ComposerKt.sourceInformation(composerStartRestartGroup, "65@2775L181");
            if (selectedTreeLeaf.getTarget() instanceof LivenessTarget) {
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composerStartRestartGroup);
                Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -19231265, "C66@2868L65,66@2862L76:ProcessingScreenWaiting.kt#83idza");
                composer2 = composerStartRestartGroup;
                context = context2;
                i3 = 0;
                z = true;
                ImageKt.Image(PainterResources_androidKt.painterResource(C3315R.drawable.mask_s, composerStartRestartGroup, 0), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
            } else {
                context = context2;
                composer2 = composerStartRestartGroup;
                i3 = 0;
                z = true;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1521231252);
            ComposerKt.sourceInformation(composer2, "CC(remember):ProcessingScreenWaiting.kt#9igjgp");
            int i4 = ((((i & 896) ^ 384) <= 256 || !composer2.changed(cameraButtonsState)) && (i & 384) != 256) ? i3 : z ? 1 : 0;
            Object objRememberedValue = composer2.rememberedValue();
            if (i4 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.smartengines.app.ui.ProcessingScreenWaitingKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProcessingScreenWaitingKt.ProcessingScreenWaiting$lambda$4$lambda$2$lambda$1(cameraButtonsState);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            function22 = composableLambdaRememberComposableLambda;
            CameraButtonsViewKt.m7412CameraButtonsyrwZFoE(cameraButtonsState, (Function0) objRememberedValue, new ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$3(Model.INSTANCE), new ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$4(Model.INSTANCE), ProcessingTitleKt.getTEXT_COLOR(), composer2, ((i >> 6) & 14) | 24576, 0);
            r15 = z;
        } else {
            function22 = composableLambdaRememberComposableLambda;
            context = context2;
            i3 = 0;
            r15 = 1;
            composer2 = composerStartRestartGroup;
        }
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(-1521216955);
        ComposerKt.sourceInformation(composer2, "106@4378L21");
        if (Intrinsics.areEqual(photoTakingState, PhotoTakingState.InProgress.INSTANCE)) {
            PhotoDialogKt.PhotoTakingProgress(composer2, i3);
        }
        composer2.endReplaceGroup();
        function22.invoke(composer2, Integer.valueOf((i >> 9) & 14));
        final Context context3 = context;
        Composer composer3 = composer2;
        AnimatedVisibilityKt.AnimatedVisibility(photoTakingState instanceof PhotoTakingState.Ready, (Modifier) null, EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.smartengines.app.ui.ProcessingScreenWaitingKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(ProcessingScreenWaitingKt.ProcessingScreenWaiting$lambda$4$lambda$3(((Integer) obj).intValue()));
            }
        }, r15, null), (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-426841117, r15, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$6
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                invoke(animatedVisibilityScope, composer4, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i5) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                ComposerKt.sourceInformation(composer4, "C130@5146L875,128@5084L937:ProcessingScreenWaiting.kt#83idza");
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                final PhotoTakingState photoTakingState2 = photoTakingState;
                final Context context4 = context3;
                SurfaceKt.m2978SurfaceT9BRK9s(modifierFillMaxSize$default3, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1408813122, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$6.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i6) {
                        ComposerKt.sourceInformation(composer5, "C137@5365L642:ProcessingScreenWaiting.kt#83idza");
                        if ((i6 & 11) != 2 || !composer5.getSkipping()) {
                            composer5.startReplaceGroup(-2041280334);
                            ComposerKt.sourceInformation(composer5, "133@5266L36");
                            PhotoTakingState photoTakingState3 = photoTakingState2;
                            if (photoTakingState3 instanceof PhotoTakingState.Ready) {
                                PhotoPreviewKt.PhotoPreview(((PhotoTakingState.Ready) photoTakingState3).getPhoto(), composer5, 8);
                            }
                            composer5.endReplaceGroup();
                            Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment bottomStart = Alignment.INSTANCE.getBottomStart();
                            final Context context5 = context4;
                            ComposerKt.sourceInformationMarkerStart(composer5, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(bottomStart, false);
                            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxSize$default4);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer5.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor3);
                            } else {
                                composer5.useNode();
                            }
                            Composer composerM4088constructorimpl3 = Updater.m4088constructorimpl(composer5);
                            Updater.m4095setimpl(composerM4088constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4095setimpl(composerM4088constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM4088constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM4088constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM4088constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m4095setimpl(composerM4088constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer5, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer5, -1531017479, "C138@5457L532:ProcessingScreenWaiting.kt#83idza");
                            Modifier modifierM1439paddingqDBjuR0$default = PaddingKt.m1439paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C1959Dp.m7055constructorimpl(30), 7, null);
                            Arrangement.HorizontalOrVertical spaceAround = Arrangement.INSTANCE.getSpaceAround();
                            ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceAround, Alignment.INSTANCE.getTop(), composer5, 6);
                            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer5, modifierM1439paddingqDBjuR0$default);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer5.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor4);
                            } else {
                                composer5.useNode();
                            }
                            Composer composerM4088constructorimpl4 = Updater.m4088constructorimpl(composer5);
                            Updater.m4095setimpl(composerM4088constructorimpl4, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4095setimpl(composerM4088constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM4088constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM4088constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM4088constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m4095setimpl(composerM4088constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer5, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer5, 518044278, "C142@5687L102,142@5655L134,145@5868L99,145@5814L153:ProcessingScreenWaiting.kt#83idza");
                            ButtonKt.Button(new ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$6$1$1$1$1(Model.INSTANCE), null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1025400868, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$6$1$1$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer6, Integer num) {
                                    invoke(rowScope, composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Button, Composer composer6, int i7) {
                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                    ComposerKt.sourceInformation(composer6, "C143@5717L46:ProcessingScreenWaiting.kt#83idza");
                                    if ((i7 & 81) == 16 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    String string = context5.getString(C3069R.string.photo_retake);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    TextKt.m3128Text4IGK_g(string, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer6, 0, 0, 131070);
                                }
                            }, composer5, 54), composer5, 805306368, 510);
                            ButtonKt.Button(new ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$6$1$1$1$3(Model.INSTANCE), null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-662973427, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$6$1$1$1$4
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer6, Integer num) {
                                    invoke(rowScope, composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Button, Composer composer6, int i7) {
                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                    ComposerKt.sourceInformation(composer6, "C146@5898L43:ProcessingScreenWaiting.kt#83idza");
                                    if ((i7 & 81) == 16 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    String string = context5.getString(C3069R.string.photo_use);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    TextKt.m3128Text4IGK_g(string, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer6, 0, 0, 131070);
                                }
                            }, composer5, 54), composer5, 805306368, 510);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            composer5.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            composer5.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            return;
                        }
                        composer5.skipToGroupEnd();
                    }
                }, composer4, 54), composer4, 12582918, 126);
            }
        }, composer2, 54), composer3, 196992, 26);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.ProcessingScreenWaitingKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProcessingScreenWaitingKt.ProcessingScreenWaiting$lambda$5(selectedTreeLeaf, photoTakingState, cameraButtonsState, function23, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProcessingScreenWaiting$lambda$4$lambda$2$lambda$1(CameraButtonsState cameraButtonsState) {
        Intrinsics.checkNotNullParameter(cameraButtonsState, "$cameraButtonsState");
        if (cameraButtonsState.isVideoMode()) {
            Model.INSTANCE.startVideoProcessing();
        } else {
            Model.INSTANCE.takePhoto();
        }
        return Unit.INSTANCE;
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1674134764);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview)160@6319L16,161@6340L308:ProcessingScreenWaiting.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ScreenDataKt.ReadScreenData(composerStartRestartGroup, 0);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$ProcessingScreenWaitingKt.INSTANCE.m7499getLambda3$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.ProcessingScreenWaitingKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProcessingScreenWaitingKt.Preview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewPhotoTaking(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1144742954);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PreviewPhotoTaking)176@6756L16,177@6777L295:ProcessingScreenWaiting.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ScreenDataKt.ReadScreenData(composerStartRestartGroup, 0);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$ProcessingScreenWaitingKt.INSTANCE.m7502getLambda6$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.ProcessingScreenWaitingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProcessingScreenWaitingKt.PreviewPhotoTaking$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewPhotoReady(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1960646917);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PreviewPhotoReady)192@7180L16,193@7228L7,194@7252L72,195@7365L269,195@7329L305:ProcessingScreenWaiting.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ScreenDataKt.ReadScreenData(composerStartRestartGroup, 0);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            composerStartRestartGroup.startReplaceGroup(319537837);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ProcessingScreenWaiting.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Photo(UtilsKt.loadBitmapFromAssetFile(context, "sample_photo.png"));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Photo photo = (Photo) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            ThemeKt.SmartEnginesTheme(true, ComposableLambdaKt.rememberComposableLambda(-1197319430, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ProcessingScreenWaitingKt.PreviewPhotoReady.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C196@7383L245,196@7375L253:ProcessingScreenWaiting.kt#83idza");
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final Photo photo2 = photo;
                        SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-88197313, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ProcessingScreenWaitingKt.PreviewPhotoReady.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                ComposerKt.sourceInformation(composer3, "C197@7397L12,198@7422L196:ProcessingScreenWaiting.kt#83idza");
                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                    MockComposesKt.MockCamera(composer3, 0);
                                    ProcessingScreenWaitingKt.ProcessingScreenWaiting(MockSelectorsKt.getMockSelectedTreeLeaf(), new PhotoTakingState.Ready(photo2, false), new CameraButtonsState(false, false, false, false, 15, null), ComposableSingletons$ProcessingScreenWaitingKt.INSTANCE.m7503getLambda7$app_storeRelease(), composer3, 3144, 0);
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                            }
                        }, composer2, 54), composer2, 12582912, 127);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.ProcessingScreenWaitingKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProcessingScreenWaitingKt.PreviewPhotoReady$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
