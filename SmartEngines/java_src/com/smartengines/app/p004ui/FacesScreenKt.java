package com.smartengines.app.p004ui;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.AndroidImageBitmap_androidKt;
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
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.AppViewModel;
import com.smartengines.app.C3069R;
import com.smartengines.app.CameraButtonsState;
import com.smartengines.app.com.smartengines.app.FacesModel;
import com.smartengines.app.com.smartengines.app.SlotState;
import com.smartengines.app.p004ui.FacesScreenKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.camera.CameraScreenKt;
import com.smartengines.camera.PreviewScaleType;
import com.smartengines.engine.p005id.FacesResult;
import com.smartengines.utils.UtilsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: FacesScreen.kt */
@Metadata(m513d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a|\u0010\u0002\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u0014H\u0003¢\u0006\u0002\u0010\u0015\u001a(\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\t2\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u0014H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001c\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m514d2 = {"TAG", "", "FacesScreen", "", "photo", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;Landroidx/compose/runtime/Composer;I)V", "slots", "", "Lcom/smartengines/app/com/smartengines/app/SlotState;", "result", "Lcom/smartengines/engine/id/FacesResult;", "onSlotClick", "Lkotlin/Function1;", "", "onShooter", "Lkotlin/Function0;", "onGallery", "onCameraSwitch", "cameraContent", "Landroidx/compose/runtime/Composable;", "(Ljava/util/List;Lcom/smartengines/engine/id/FacesResult;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SlotView", "state", "(Lcom/smartengines/app/com/smartengines/app/SlotState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Preview1", "(Landroidx/compose/runtime/Composer;I)V", "Preview2", "Preview1Llight", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class FacesScreenKt {
    private static final String TAG = "myapp.FacesScreen";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FacesScreen$lambda$1(Bitmap bitmap, int i, Composer composer, int i2) {
        FacesScreen(bitmap, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FacesScreen$lambda$3(List slots, FacesResult facesResult, Function1 onSlotClick, Function0 onShooter, Function1 onGallery, Function0 onCameraSwitch, Function2 cameraContent, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(slots, "$slots");
        Intrinsics.checkNotNullParameter(onSlotClick, "$onSlotClick");
        Intrinsics.checkNotNullParameter(onShooter, "$onShooter");
        Intrinsics.checkNotNullParameter(onGallery, "$onGallery");
        Intrinsics.checkNotNullParameter(onCameraSwitch, "$onCameraSwitch");
        Intrinsics.checkNotNullParameter(cameraContent, "$cameraContent");
        FacesScreen(slots, facesResult, onSlotClick, onShooter, onGallery, onCameraSwitch, cameraContent, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview1$lambda$5(int i, Composer composer, int i2) {
        Preview1(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview1Llight$lambda$7(int i, Composer composer, int i2) {
        Preview1Llight(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview2$lambda$6(int i, Composer composer, int i2) {
        Preview2(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SlotView$lambda$4(SlotState state, Function2 cameraContent, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(cameraContent, "$cameraContent");
        SlotView(state, cameraContent, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FacesScreen(final Bitmap bitmap, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-902537269);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FacesScreen)45@1822L7,46@1846L39,57@2287L74,50@2006L355:FacesScreen.kt#83idza");
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        Context context = (Context) objConsume;
        composerStartRestartGroup.startReplaceGroup(2042643157);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):FacesScreen.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new FacesModel(context, bitmap);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final FacesModel facesModel = (FacesModel) objRememberedValue;
        composerStartRestartGroup.endReplaceGroup();
        FacesScreen(facesModel.getSlots(), facesModel.getResult(), new C31291(facesModel), new C31302(facesModel), new C31313(facesModel), new C31324(facesModel), ComposableLambdaKt.rememberComposableLambda(-1594392676, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.FacesScreenKt.FacesScreen.5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                ComposerKt.sourceInformation(composer2, "C58@2297L58:FacesScreen.kt#83idza");
                if ((i2 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    CameraScreenKt.CameraScreen(facesModel.getCameraController(), PreviewScaleType.FIT, composer2, 56, 0);
                }
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572936);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.FacesScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FacesScreenKt.FacesScreen$lambda$1(bitmap, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: FacesScreen.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.FacesScreenKt$FacesScreen$1 */
    /* synthetic */ class C31291 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        C31291(Object obj) {
            super(1, obj, FacesModel.class, "onSlotClick", "onSlotClick(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((FacesModel) this.receiver).onSlotClick(i);
        }
    }

    /* compiled from: FacesScreen.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.FacesScreenKt$FacesScreen$2 */
    /* synthetic */ class C31302 extends FunctionReferenceImpl implements Function0<Unit> {
        C31302(Object obj) {
            super(0, obj, FacesModel.class, "takePhoto", "takePhoto()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((FacesModel) this.receiver).takePhoto();
        }
    }

    /* compiled from: FacesScreen.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.FacesScreenKt$FacesScreen$3 */
    /* synthetic */ class C31313 extends FunctionReferenceImpl implements Function1<Bitmap, Unit> {
        C31313(Object obj) {
            super(1, obj, FacesModel.class, "onPhotoTaken", "onPhotoTaken(Landroid/graphics/Bitmap;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
            invoke2(bitmap);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Bitmap p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((FacesModel) this.receiver).onPhotoTaken(p0);
        }
    }

    /* compiled from: FacesScreen.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.FacesScreenKt$FacesScreen$4 */
    /* synthetic */ class C31324 extends FunctionReferenceImpl implements Function0<Unit> {
        C31324(Object obj) {
            super(0, obj, FacesModel.class, "switchCamera", "switchCamera()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((FacesModel) this.receiver).switchCamera();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FacesScreen(final List<? extends SlotState> list, final FacesResult facesResult, final Function1<? super Integer, Unit> function1, final Function0<Unit> function0, final Function1<? super Bitmap, Unit> function12, final Function0<Unit> function02, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1699418268);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FacesScreen)P(6,5,4,3,2,1)76@2731L7,79@2795L26,81@2859L1913,81@2827L1945:FacesScreen.kt#83idza");
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        Function0 function03 = new Function0() { // from class: com.smartengines.app.ui.FacesScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FacesScreenKt.FacesScreen$lambda$2();
            }
        };
        BackHandlerKt.BackHandler(false, function03, composerStartRestartGroup, 48, 1);
        SurfaceKt.m2978SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1450879871, true, new C31347((Context) objConsume, function03, list, function1, function2, function0, function12, function02, facesResult), composerStartRestartGroup, 54), composerStartRestartGroup, 12582918, 126);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.FacesScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FacesScreenKt.FacesScreen$lambda$3(list, facesResult, function1, function0, function12, function02, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FacesScreen$lambda$2() {
        AppViewModel.INSTANCE.setFacesModel(null);
        return Unit.INSTANCE;
    }

    /* compiled from: FacesScreen.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.FacesScreenKt$FacesScreen$7 */
    static final class C31347 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $cameraContent;
        final /* synthetic */ Context $context;
        final /* synthetic */ Function0<Unit> $onBack;
        final /* synthetic */ Function0<Unit> $onCameraSwitch;
        final /* synthetic */ Function1<Bitmap, Unit> $onGallery;
        final /* synthetic */ Function0<Unit> $onShooter;
        final /* synthetic */ Function1<Integer, Unit> $onSlotClick;
        final /* synthetic */ FacesResult $result;
        final /* synthetic */ List<SlotState> $slots;

        /* JADX WARN: Multi-variable type inference failed */
        C31347(Context context, Function0<Unit> function0, List<? extends SlotState> list, Function1<? super Integer, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, Function0<Unit> function02, Function1<? super Bitmap, Unit> function12, Function0<Unit> function03, FacesResult facesResult) {
            this.$context = context;
            this.$onBack = function0;
            this.$slots = list;
            this.$onSlotClick = function1;
            this.$cameraContent = function2;
            this.$onShooter = function02;
            this.$onGallery = function12;
            this.$onCameraSwitch = function03;
            this.$result = facesResult;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Composer composer2 = composer;
            ComposerKt.sourceInformation(composer2, "C82@2869L1897:FacesScreen.kt#83idza");
            if ((i & 11) != 2 || !composer2.getSkipping()) {
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Context context = this.$context;
                Function0<Unit> function0 = this.$onBack;
                List<SlotState> list = this.$slots;
                final Function1<Integer, Unit> function1 = this.$onSlotClick;
                Function2<Composer, Integer, Unit> function2 = this.$cameraContent;
                Function0<Unit> function02 = this.$onShooter;
                Function1<Bitmap, Unit> function12 = this.$onGallery;
                Function0<Unit> function03 = this.$onCameraSwitch;
                FacesResult facesResult = this.$result;
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer2);
                Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -2080697065, "C89@3092L212,107@3666L1090:FacesScreen.kt#83idza");
                String string = context.getString(C3069R.string.faces_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String str = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                FragmentsKt.AppTitle(string, function0, false, false, false, false, composer2, 28080, 32);
                composer2.startReplaceGroup(209982117);
                ComposerKt.sourceInformation(composer2, "*100@3503L22,97@3391L221");
                Iterator it = list.iterator();
                final int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    SlotState slotState = (SlotState) next;
                    Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                    composer2.startReplaceGroup(780510561);
                    ComposerKt.sourceInformation(composer2, "CC(remember):FacesScreen.kt#9igjgp");
                    boolean zChanged = composer2.changed(function1) | composer2.changed(i2);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.smartengines.app.ui.FacesScreenKt$FacesScreen$7$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FacesScreenKt.C31347.invoke$lambda$5$lambda$3$lambda$1$lambda$0(function1, i2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierM1023clickableXHw0xAI$default = ClickableKt.m1023clickableXHw0xAI$default(modifierWeight$default, false, null, null, (Function0) objRememberedValue, 7, null);
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1023clickableXHw0xAI$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    Iterator it2 = it;
                    String str2 = str;
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composer2);
                    Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1933528579, "C102@3566L28:FacesScreen.kt#83idza");
                    FacesScreenKt.SlotView(slotState, function2, composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    i2 = i3;
                    str = str2;
                    it = it2;
                }
                composer2.endReplaceGroup();
                Modifier modifierM1466height3ABfNKs = SizeKt.m1466height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), CameraButtonsViewKt.getCAMERA_BUTTONS_ROW_HEIGHT());
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM1466height3ABfNKs);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM4088constructorimpl3 = Updater.m4088constructorimpl(composer2);
                Updater.m4095setimpl(composerM4088constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4095setimpl(composerM4088constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4088constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM4088constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM4088constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m4095setimpl(composerM4088constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -1573624408, "C:FacesScreen.kt#83idza");
                if (list.contains(SlotState.CAMERA.INSTANCE)) {
                    composer2.startReplaceGroup(-1573605561);
                    ComposerKt.sourceInformation(composer2, "116@4142L11,113@3927L258");
                    CameraButtonsViewKt.m7412CameraButtonsyrwZFoE(new CameraButtonsState(false, false, false, false, 9, null), function02, function12, function03, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface(), composer2, 0, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1573262112);
                    ComposerKt.sourceInformation(composer2, "");
                    if (facesResult instanceof FacesResult.Success) {
                        composer2.startReplaceGroup(780536772);
                        ComposerKt.sourceInformation(composer2, "121@4321L57");
                        TextKt.m3128Text4IGK_g("Similarity: " + Math.round(((FacesResult.Success) facesResult).getSimilarity() * 100) + '%', (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
                        composer2 = composer;
                        composer2.endReplaceGroup();
                    } else if (facesResult instanceof FacesResult.Error) {
                        composer2.startReplaceGroup(780541027);
                        ComposerKt.sourceInformation(composer2, "123@4455L24");
                        TextKt.m3128Text4IGK_g("Error: " + facesResult, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
                        composer2 = composer;
                        composer2.endReplaceGroup();
                    } else if (facesResult instanceof FacesResult.Exception) {
                        composer2.startReplaceGroup(780545135);
                        ComposerKt.sourceInformation(composer2, "125@4583L36");
                        TextKt.m3128Text4IGK_g("Exception: " + ((FacesResult.Exception) facesResult).getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
                        composer2 = composer;
                        composer2.endReplaceGroup();
                    } else {
                        if (facesResult != null) {
                            composer2.startReplaceGroup(780534266);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(780548224);
                        ComposerKt.sourceInformation(composer2, "127@4680L21");
                        TextKt.m3128Text4IGK_g("Processing...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
                        composer2 = composer;
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                return;
            }
            composer2.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$3$lambda$1$lambda$0(Function1 onSlotClick, int i) {
            Intrinsics.checkNotNullParameter(onSlotClick, "$onSlotClick");
            onSlotClick.invoke(Integer.valueOf(i));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SlotView(final SlotState slotState, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2064087891);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SlotView)P(1)143@5026L11,146@5158L335,140@4881L612:FacesScreen.kt#83idza");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(slotState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & LDSFile.EF_DG16_TAG) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            float f = 20;
            SurfaceKt.m2978SurfaceT9BRK9s(BorderKt.m1001borderxT4_qwU(PaddingKt.m1436paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), C1959Dp.m7055constructorimpl(10), C1959Dp.m7055constructorimpl(5)), C1959Dp.m7055constructorimpl(3), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getPrimary(), RoundedCornerShapeKt.m1718RoundedCornerShape0680j_4(C1959Dp.m7055constructorimpl(f))), RoundedCornerShapeKt.m1718RoundedCornerShape0680j_4(C1959Dp.m7055constructorimpl(f)), 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1582513106, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.FacesScreenKt.SlotView.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposerKt.sourceInformation(composer2, "C:FacesScreen.kt#83idza");
                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                        SlotState slotState2 = slotState;
                        if (Intrinsics.areEqual(slotState2, SlotState.EMPTY.INSTANCE)) {
                            composer2.startReplaceGroup(-240402532);
                            composer2.endReplaceGroup();
                            return;
                        }
                        if (Intrinsics.areEqual(slotState2, SlotState.CAMERA.INSTANCE)) {
                            composer2.startReplaceGroup(-240351754);
                            ComposerKt.sourceInformation(composer2, "154@5296L8");
                            function2.invoke(composer2, 0);
                            composer2.endReplaceGroup();
                            return;
                        }
                        if (!(slotState2 instanceof SlotState.PHOTO)) {
                            composer2.startReplaceGroup(-1670324075);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-240260335);
                        ComposerKt.sourceInformation(composer2, "158@5372L91");
                        ImageKt.m1046Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(((SlotState.PHOTO) slotState).getBitmap()), "", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 0.0f, null, 0, composer2, 440, 248);
                        composer2.endReplaceGroup();
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 124);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.FacesScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FacesScreenKt.SlotView$lambda$4(slotState, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview1(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1348127171);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview1)170@5731L7,171@5743L16,172@5800L211,172@5764L247:FacesScreen.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ScreenDataKt.ReadScreenData(composerStartRestartGroup, 0);
            ThemeKt.SmartEnginesTheme(true, ComposableLambdaKt.rememberComposableLambda(-1938881240, true, new C31351((Context) objConsume), composerStartRestartGroup, 54), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.FacesScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FacesScreenKt.Preview1$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: FacesScreen.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.FacesScreenKt$Preview1$1 */
    static final class C31351 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Context $context;

        C31351(Context context) {
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C173@5810L195:FacesScreen.kt#83idza");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                FacesScreenKt.FacesScreen(CollectionsKt.listOf((Object[]) new SlotState[]{new SlotState.PHOTO(UtilsKt.loadBitmapFromAssetFile(this.$context, "sample_photo.png")), SlotState.CAMERA.INSTANCE}), null, new Function1() { // from class: com.smartengines.app.ui.FacesScreenKt$Preview1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FacesScreenKt.C31351.invoke$lambda$0(((Integer) obj).intValue());
                    }
                }, new Function0() { // from class: com.smartengines.app.ui.FacesScreenKt$Preview1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                }, new Function1() { // from class: com.smartengines.app.ui.FacesScreenKt$Preview1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FacesScreenKt.C31351.invoke$lambda$2((Bitmap) obj);
                    }
                }, new Function0() { // from class: com.smartengines.app.ui.FacesScreenKt$Preview1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                }, ComposableSingletons$FacesScreenKt.INSTANCE.m7438getLambda1$app_storeRelease(), composer, 1797552);
            } else {
                composer.skipToGroupEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$0(int i) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2(Bitmap it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    private static final void Preview2(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-654734466);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview2)185@6137L7,186@6149L16,187@6170L194:FacesScreen.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ScreenDataKt.ReadScreenData(composerStartRestartGroup, 0);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$FacesScreenKt.INSTANCE.m7440getLambda3$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.FacesScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FacesScreenKt.Preview2$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview1Llight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1007574585);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview1Llight)199@6495L7,200@6507L16,201@6565L211,201@6528L248:FacesScreen.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ScreenDataKt.ReadScreenData(composerStartRestartGroup, 0);
            ThemeKt.SmartEnginesTheme(false, ComposableLambdaKt.rememberComposableLambda(-117353358, true, new C31361((Context) objConsume), composerStartRestartGroup, 54), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.FacesScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FacesScreenKt.Preview1Llight$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: FacesScreen.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.FacesScreenKt$Preview1Llight$1 */
    static final class C31361 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Context $context;

        C31361(Context context) {
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C202@6575L195:FacesScreen.kt#83idza");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                FacesScreenKt.FacesScreen(CollectionsKt.listOf((Object[]) new SlotState[]{new SlotState.PHOTO(UtilsKt.loadBitmapFromAssetFile(this.$context, "sample_photo.png")), SlotState.CAMERA.INSTANCE}), null, new Function1() { // from class: com.smartengines.app.ui.FacesScreenKt$Preview1Llight$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FacesScreenKt.C31361.invoke$lambda$0(((Integer) obj).intValue());
                    }
                }, new Function0() { // from class: com.smartengines.app.ui.FacesScreenKt$Preview1Llight$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                }, new Function1() { // from class: com.smartengines.app.ui.FacesScreenKt$Preview1Llight$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FacesScreenKt.C31361.invoke$lambda$2((Bitmap) obj);
                    }
                }, new Function0() { // from class: com.smartengines.app.ui.FacesScreenKt$Preview1Llight$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                }, ComposableSingletons$FacesScreenKt.INSTANCE.m7441getLambda4$app_storeRelease(), composer, 1797552);
            } else {
                composer.skipToGroupEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$0(int i) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2(Bitmap it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }
}
