package com.smartengines.app.p004ui.results;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.p000ui.unit.Density;
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
import com.smartengines.app.C3069R;
import com.smartengines.app.Model;
import com.smartengines.app.Photo;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.VisualizationSettings;
import com.smartengines.engine.ImageProcessingState;
import com.smartengines.engine.Result;
import com.smartengines.engine.Session;
import com.smartengines.engine.SessionType;
import com.smartengines.utils.UtilsKt;
import com.smartengines.visualization.Quad;
import com.smartengines.visualization.QuadDrawingKt;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: ResultPreview.kt */
@Metadata(m513d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m514d2 = {"ResultPreview", "", "finishedState", "Lcom/smartengines/engine/ImageProcessingState$FINISHED;", "onClose", "Lkotlin/Function0;", "visualizationSettings", "Lcom/smartengines/app/settings/VisualizationSettings;", "(Lcom/smartengines/engine/ImageProcessingState$FINISHED;Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/VisualizationSettings;Landroidx/compose/runtime/Composer;II)V", "Dark_Preview", "(Landroidx/compose/runtime/Composer;I)V", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ResultPreviewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dark_Preview$lambda$9(int i, Composer composer, int i2) throws Exception {
        Dark_Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultPreview$lambda$7(ImageProcessingState.FINISHED finishedState, Function0 onClose, VisualizationSettings visualizationSettings, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(finishedState, "$finishedState");
        Intrinsics.checkNotNullParameter(onClose, "$onClose");
        ResultPreview(finishedState, onClose, visualizationSettings, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ResultPreview(final ImageProcessingState.FINISHED finishedState, final Function0<Unit> onClose, VisualizationSettings visualizationSettings, Composer composer, final int i, final int i2) {
        final VisualizationSettings visualizationSettings2;
        int i3;
        Result currentResult;
        Intrinsics.checkNotNullParameter(finishedState, "finishedState");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Composer composerStartRestartGroup = composer.startRestartGroup(699611817);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ResultPreview)38@1458L7,39@1497L7,40@1521L48,42@1575L29,49@1860L92,71@2477L196:ResultPreview.kt#4ipo3i");
        if ((i2 & 4) != 0) {
            visualizationSettings2 = Model.INSTANCE.getVisualizationSettings();
            i3 = i & (-897);
        } else {
            visualizationSettings2 = visualizationSettings;
            i3 = i;
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        final Context context = (Context) objConsume;
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composerStartRestartGroup.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        final Density density = (Density) objConsume2;
        composerStartRestartGroup.startReplaceGroup(-1920884177);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ResultPreview.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Session session = Model.INSTANCE.getSession();
            objRememberedValue = (session == null || (currentResult = session.getCurrentResult()) == null) ? null : currentResult.getQuads();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final Collection collection = (Collection) objRememberedValue;
        composerStartRestartGroup.endReplaceGroup();
        BackHandlerKt.BackHandler(false, onClose, composerStartRestartGroup, i3 & LDSFile.EF_DG16_TAG, 1);
        Photo photo = new Photo(finishedState.getLastImage());
        Bitmap lastImage = finishedState.getLastImage();
        final Size size = new Size(lastImage.getWidth(), lastImage.getHeight());
        int i4 = i3;
        ImageKt.m1046Image5hnEew(photo.getImageBitmap(), "preview", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 0.0f, null, 0, composerStartRestartGroup, 440, 248);
        composerStartRestartGroup.startReplaceGroup(-1920869128);
        ComposerKt.sourceInformation(composerStartRestartGroup, "*56@1992L453");
        if (collection != null) {
            CanvasKt.Canvas(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new Function1() { // from class: com.smartengines.app.ui.results.ResultPreviewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ResultPreviewKt.ResultPreview$lambda$5$lambda$4(collection, size, visualizationSettings2, density, (DrawScope) obj);
                }
            }, composerStartRestartGroup, 6);
            Unit unit = Unit.INSTANCE;
        }
        composerStartRestartGroup.endReplaceGroup();
        Modifier modifierM1439paddingqDBjuR0$default = PaddingKt.m1439paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C1959Dp.m7055constructorimpl(20), 7, null);
        Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomCenter, false);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1439paddingqDBjuR0$default);
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
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 601930736, "C72@2598L69,72@2582L85:ResultPreview.kt#4ipo3i");
        ButtonKt.Button(onClose, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(266109855, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ResultPreviewKt$ResultPreview$2$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                invoke(rowScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope Button, Composer composer2, int i5) {
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                ComposerKt.sourceInformation(composer2, "C73@2612L45:ResultPreview.kt#4ipo3i");
                if ((i5 & 81) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                String string = context.getString(C3069R.string.result_show);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                TextKt.m3128Text4IGK_g(string, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | 805306368, 510);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final VisualizationSettings visualizationSettings3 = visualizationSettings2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.ResultPreviewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResultPreviewKt.ResultPreview$lambda$7(finishedState, onClose, visualizationSettings3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultPreview$lambda$5$lambda$4(Collection it, Size frameSize, VisualizationSettings visualizationSettings, Density density, DrawScope Canvas) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(frameSize, "$frameSize");
        Intrinsics.checkNotNullParameter(density, "$density");
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        Iterator it2 = it.iterator();
        while (it2.hasNext()) {
            QuadDrawingKt.m7840drawQuadPointsXOJAsU(((Quad) it2.next()).getPoints(), frameSize, visualizationSettings.m7398getPrimaryLineColor0d7_KjU(), density.mo1127toPx0680j_4(visualizationSettings.m7399getPrimaryLineWidthD9Ej5fM()), Canvas);
        }
        return Unit.INSTANCE;
    }

    private static final void Dark_Preview(Composer composer, final int i) throws Exception {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2139158542);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Dark_Preview)82@2904L7,83@2928L66,84@3035L178,84@2999L214:ResultPreview.kt#4ipo3i");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            composerStartRestartGroup.startReplaceGroup(-1689420243);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ResultPreview.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = UtilsKt.loadBitmapFromAssetFile(context, "sample_photo.png");
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Bitmap bitmap = (Bitmap) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            ThemeKt.SmartEnginesTheme(true, ComposableLambdaKt.rememberComposableLambda(-713891939, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ResultPreviewKt.Dark_Preview.1

                /* compiled from: ResultPreview.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.results.ResultPreviewKt$Dark_Preview$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Bitmap $photo;

                    AnonymousClass1(Bitmap bitmap) {
                        this.$photo = bitmap;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        ComposerKt.sourceInformation(composer, "C86@3069L128:ResultPreview.kt#4ipo3i");
                        if ((i & 11) != 2 || !composer.getSkipping()) {
                            ResultPreviewKt.ResultPreview(new ImageProcessingState.FINISHED(SessionType.PHOTO_SESSION, this.$photo), new Function0() { // from class: com.smartengines.app.ui.results.ResultPreviewKt$Dark_Preview$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            }, null, composer, 56, 4);
                        } else {
                            composer.skipToGroupEnd();
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C85@3055L152,85@3045L162:ResultPreview.kt#4ipo3i");
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1369839352, true, new AnonymousClass1(bitmap), composer2, 54), composer2, 12582912, 127);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.ResultPreviewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResultPreviewKt.Dark_Preview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
