package com.smartengines.app.p004ui;

import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.TransformOriginKt;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.p000ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.Photo;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.utils.UtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.PassportService;

/* compiled from: PhotoPreview.kt */
@Metadata(m513d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002"}, m514d2 = {"PhotoPreview", "", "photo", "Lcom/smartengines/app/Photo;", "(Lcom/smartengines/app/Photo;Landroidx/compose/runtime/Composer;I)V", "PreviewPhotoReady", "(Landroidx/compose/runtime/Composer;I)V", "app_storeRelease", "scale", "", "offset", "Landroidx/compose/ui/geometry/Offset;"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class PhotoPreviewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhotoPreview$lambda$8(Photo photo, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(photo, "$photo");
        PhotoPreview(photo, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPhotoReady$lambda$10(int i, Composer composer, int i2) {
        PreviewPhotoReady(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PhotoPreview(final Photo photo, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-750018794);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PhotoPreview)32@1303L31,33@1353L40,47@1827L665,35@1399L1658:PhotoPreview.kt#83idza");
        composerStartRestartGroup.startReplaceGroup(569115017);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):PhotoPreview.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceGroup();
        composerStartRestartGroup.startReplaceGroup(569116626);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):PhotoPreview.kt#9igjgp");
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4343boximpl(Offset.INSTANCE.m4370getZeroF1C5BW0()), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        composerStartRestartGroup.endReplaceGroup();
        Modifier modifierM4756graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m4756graphicsLayerAp8cVGQ$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), PhotoPreview$lambda$1(mutableState), PhotoPreview$lambda$1(mutableState), 0.0f, Offset.m4354getXimpl(PhotoPreview$lambda$4(mutableState2)), Offset.m4355getYimpl(PhotoPreview$lambda$4(mutableState2)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, TransformOriginKt.TransformOrigin(0.0f, 0.0f), null, false, null, 0L, 0L, 0, 130020, null);
        Unit unit = Unit.INSTANCE;
        composerStartRestartGroup.startReplaceGroup(569132419);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):PhotoPreview.kt#9igjgp");
        PhotoPreviewKt$PhotoPreview$1$1 photoPreviewKt$PhotoPreview$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
        if (photoPreviewKt$PhotoPreview$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
            photoPreviewKt$PhotoPreview$1$1RememberedValue = new PhotoPreviewKt$PhotoPreview$1$1(mutableState, mutableState2, null);
            composerStartRestartGroup.updateRememberedValue(photoPreviewKt$PhotoPreview$1$1RememberedValue);
        }
        composerStartRestartGroup.endReplaceGroup();
        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierM4756graphicsLayerAp8cVGQ$default, unit, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) photoPreviewKt$PhotoPreview$1$1RememberedValue);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPointerInput);
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
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 485595761, "C66@2589L248:PhotoPreview.kt#83idza");
        Log.w("myapp.Ph", " ============================ ");
        ImageKt.m1046Image5hnEew(photo.getImageBitmap(), "image", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter(), ContentScale.INSTANCE.getFit(), 0.0f, null, 0, composerStartRestartGroup, 28088, PassportService.DEFAULT_MAX_BLOCKSIZE);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.PhotoPreviewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PhotoPreviewKt.PhotoPreview$lambda$8(photo, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float PhotoPreview$lambda$1(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PhotoPreview$lambda$2(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long PhotoPreview$lambda$4(MutableState<Offset> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PhotoPreview$lambda$5(MutableState<Offset> mutableState, long j) {
        mutableState.setValue(Offset.m4343boximpl(j));
    }

    private static final void PreviewPhotoReady(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2033480443);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PreviewPhotoReady)86@3295L7,87@3319L86,90@3446L68,90@3410L104:PhotoPreview.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            composerStartRestartGroup.startReplaceGroup(319411995);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):PhotoPreview.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Photo(UtilsKt.loadBitmapFromAssetFile(context, "sample_photo.png"));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Photo photo = (Photo) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            ThemeKt.SmartEnginesTheme(true, ComposableLambdaKt.rememberComposableLambda(1914434096, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.PhotoPreviewKt.PreviewPhotoReady.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C91@3464L44,91@3456L52:PhotoPreview.kt#83idza");
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final Photo photo2 = photo;
                        SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(422514443, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.PhotoPreviewKt.PreviewPhotoReady.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                ComposerKt.sourceInformation(composer3, "C92@3478L20:PhotoPreview.kt#83idza");
                                if ((i3 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    PhotoPreviewKt.PhotoPreview(photo2, composer3, 8);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.PhotoPreviewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PhotoPreviewKt.PreviewPhotoReady$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
