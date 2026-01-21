package com.smartengines.app.p004ui;

import android.graphics.Bitmap;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.CameraButtonsState;
import com.smartengines.app.Model;
import com.smartengines.app.Photo;
import com.smartengines.app.PhotoTakingState;
import com.smartengines.app.p004ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: PhotoDialog.kt */
@Metadata(m513d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001aJ\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\fH\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0011"}, m514d2 = {"PhotoDialog", "", "onCancel", "Lkotlin/Function0;", "onPhotoTaken", "Lkotlin/Function1;", "Lcom/smartengines/app/Photo;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PhotoDialogContent", "photoTakingState", "Lcom/smartengines/app/PhotoTakingState;", "cameraContent", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/PhotoTakingState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "PhotoTakingProgress", "(Landroidx/compose/runtime/Composer;I)V", "Preview1", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class PhotoDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhotoDialog$lambda$0(Function0 onCancel, Function1 onPhotoTaken, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(onCancel, "$onCancel");
        Intrinsics.checkNotNullParameter(onPhotoTaken, "$onPhotoTaken");
        PhotoDialog(onCancel, onPhotoTaken, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhotoDialogContent$lambda$6(Function0 onCancel, Function1 onPhotoTaken, PhotoTakingState photoTakingState, Function2 cameraContent, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(onCancel, "$onCancel");
        Intrinsics.checkNotNullParameter(onPhotoTaken, "$onPhotoTaken");
        Intrinsics.checkNotNullParameter(photoTakingState, "$photoTakingState");
        Intrinsics.checkNotNullParameter(cameraContent, "$cameraContent");
        PhotoDialogContent(onCancel, onPhotoTaken, photoTakingState, cameraContent, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhotoTakingProgress$lambda$7(int i, Composer composer, int i2) {
        PhotoTakingProgress(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview1$lambda$8(int i, Composer composer, int i2) {
        Preview1(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PhotoDialog(final Function0<Unit> onCancel, final Function1<? super Photo, Unit> onPhotoTaken, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onPhotoTaken, "onPhotoTaken");
        Composer composerStartRestartGroup = composer.startRestartGroup(-956443251);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PhotoDialog)39@1427L30,42@1603L150,42@1571L182:PhotoDialog.kt#83idza");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onCancel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & LDSFile.EF_DG16_TAG) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPhotoTaken) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            BackHandlerKt.BackHandler(false, onCancel, composerStartRestartGroup, (i2 << 3) & LDSFile.EF_DG16_TAG, 1);
            SurfaceKt.m2978SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-578093806, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.PhotoDialogKt.PhotoDialog.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposerKt.sourceInformation(composer2, "C43@1613L134:PhotoDialog.kt#83idza");
                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                        PhotoDialogKt.PhotoDialogContent(onCancel, onPhotoTaken, Model.INSTANCE.getPhotoTaking(), ComposableSingletons$PhotoDialogKt.INSTANCE.m7483getLambda1$app_storeRelease(), composer2, 3072);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12582918, 126);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.PhotoDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PhotoDialogKt.PhotoDialog$lambda$0(onCancel, onPhotoTaken, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PhotoDialogContent(final Function0<Unit> function0, final Function1<? super Photo, Unit> function1, final PhotoTakingState photoTakingState, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(526993690);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PhotoDialogContent)P(1,2,3)55@1958L262,55@1947L273,64@2225L710:PhotoDialog.kt#83idza");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & LDSFile.EF_DG16_TAG) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(photoTakingState) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startReplaceGroup(2126886617);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):PhotoDialog.kt#9igjgp");
            boolean z = ((i2 & 14) == 4) | ((i2 & LDSFile.EF_DG16_TAG) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.smartengines.app.ui.PhotoDialogKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PhotoDialogKt.PhotoDialogContent$lambda$3$lambda$2(function0, function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -275428779, "C66@2338L8,69@2383L319:PhotoDialog.kt#83idza");
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 9) & 14));
            CameraButtonsViewKt.m7412CameraButtonsyrwZFoE(new CameraButtonsState(false, false, false, false, 1, null), new PhotoDialogKt$PhotoDialogContent$2$1(Model.INSTANCE), new Function1() { // from class: com.smartengines.app.ui.PhotoDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PhotoDialogKt.PhotoDialogContent$lambda$5$lambda$4((Bitmap) obj);
                }
            }, new PhotoDialogKt$PhotoDialogContent$2$3(Model.INSTANCE), 0L, composerStartRestartGroup, 384, 16);
            composerStartRestartGroup.startReplaceGroup(1515148812);
            ComposerKt.sourceInformation(composerStartRestartGroup, "82@2809L21");
            if (Intrinsics.areEqual(photoTakingState, PhotoTakingState.InProgress.INSTANCE)) {
                PhotoTakingProgress(composerStartRestartGroup, 0);
            } else if (!Intrinsics.areEqual(photoTakingState, PhotoTakingState.Inactive.INSTANCE) && !(photoTakingState instanceof PhotoTakingState.Ready)) {
                throw new NoWhenBranchMatchedException();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.PhotoDialogKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PhotoDialogKt.PhotoDialogContent$lambda$6(function0, function1, photoTakingState, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhotoDialogContent$lambda$3$lambda$2(Function0 onCancel, Function1 onPhotoTaken) {
        Intrinsics.checkNotNullParameter(onCancel, "$onCancel");
        Intrinsics.checkNotNullParameter(onPhotoTaken, "$onPhotoTaken");
        PhotoTakingState photoTaking = Model.INSTANCE.getPhotoTaking();
        if (photoTaking instanceof PhotoTakingState.Ready) {
            Model.INSTANCE.clearTakenPhoto();
            onCancel.invoke();
            onPhotoTaken.invoke(((PhotoTakingState.Ready) photoTaking).getPhoto());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhotoDialogContent$lambda$5$lambda$4(Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void PhotoTakingProgress(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(237294979);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PhotoTakingProgress)93@3014L228:PhotoDialog.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            composer2 = composerStartRestartGroup;
            TextKt.m3128Text4IGK_g("Taking photo...", PaddingKt.m1435padding3ABfNKs(BackgroundKt.m989backgroundbw27NRU(PaddingKt.m1439paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1959Dp.m7055constructorimpl(100), 7, null), ColorKt.Color(2852126720L), RoundedCornerShapeKt.m1718RoundedCornerShape0680j_4(C1959Dp.m7055constructorimpl(10))), C1959Dp.m7055constructorimpl(20)), Color.INSTANCE.m4632getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 390, 0, 131064);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.PhotoDialogKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PhotoDialogKt.PhotoTakingProgress$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview1(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1796276507);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview1)111@3667L16,112@3688L144:PhotoDialog.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ScreenDataKt.ReadScreenData(composerStartRestartGroup, 0);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$PhotoDialogKt.INSTANCE.m7485getLambda3$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.PhotoDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PhotoDialogKt.Preview1$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
