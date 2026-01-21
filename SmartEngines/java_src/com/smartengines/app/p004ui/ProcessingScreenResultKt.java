package com.smartengines.app.p004ui;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.AppKt;
import com.smartengines.app.Model;
import com.smartengines.app.mock.MockSelectorsKt;
import com.smartengines.app.p004ui.results.CodeResultScreenKt;
import com.smartengines.app.p004ui.results.DocResultScreenKt;
import com.smartengines.app.p004ui.results.IdResultScreenKt;
import com.smartengines.app.p004ui.results.LivenessResultScreenKt;
import com.smartengines.app.p004ui.results.ResFragmentsKt;
import com.smartengines.app.p004ui.results.ResultPreviewKt;
import com.smartengines.app.p004ui.results.TextResultScreenKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.CommonSettings;
import com.smartengines.app.targets.TreeLeaf;
import com.smartengines.engine.ImageProcessingState;
import com.smartengines.engine.Result;
import com.smartengines.engine.SessionType;
import com.smartengines.engine.code.CodeResultData;
import com.smartengines.engine.doc.DocResultData;
import com.smartengines.engine.p005id.IdResultData;
import com.smartengines.engine.p005id.LvResultData;
import com.smartengines.engine.text.TextResultData;
import com.smartengines.utils.UtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProcessingScreenResult.kt */
@Metadata(m513d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\u001a'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, m514d2 = {"TAG", "", "ProcessingScreenResult", "", "state", "Lcom/smartengines/engine/ImageProcessingState$FINISHED;", "selectedTreeLeaf", "Lcom/smartengines/app/targets/TreeLeaf;", "commonSettings", "Lcom/smartengines/app/settings/CommonSettings;", "(Lcom/smartengines/engine/ImageProcessingState$FINISHED;Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/app/settings/CommonSettings;Landroidx/compose/runtime/Composer;II)V", "Dark_Preview", "(Landroidx/compose/runtime/Composer;I)V", "Light_Preview", "app_storeRelease", "showPreview", ""}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ProcessingScreenResultKt {
    private static final String TAG = "myapp.ResultScreen";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dark_Preview$lambda$7(int i, Composer composer, int i2) throws Exception {
        Dark_Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Light_Preview$lambda$9(int i, Composer composer, int i2) throws Exception {
        Light_Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProcessingScreenResult$lambda$5(ImageProcessingState.FINISHED state, TreeLeaf selectedTreeLeaf, CommonSettings commonSettings, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(selectedTreeLeaf, "$selectedTreeLeaf");
        ProcessingScreenResult(state, selectedTreeLeaf, commonSettings, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ProcessingScreenResult(final ImageProcessingState.FINISHED state, final TreeLeaf selectedTreeLeaf, CommonSettings commonSettings, Composer composer, final int i, final int i2) {
        CommonSettings value;
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(selectedTreeLeaf, "selectedTreeLeaf");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1921484412);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ProcessingScreenResult)P(2,1)70@3058L217:ProcessingScreenResult.kt#83idza");
        if ((i2 & 4) != 0) {
            i3 = i & (-897);
            value = AppKt.getCommonSettingsStore().getData().getValue();
        } else {
            value = commonSettings;
            i3 = i;
        }
        composerStartRestartGroup.startReplaceGroup(1267033161);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ProcessingScreenResult.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(value.getResultPreview() && (state.getSessionType() == SessionType.PHOTO_SESSION || state.getSessionType() == SessionType.GALLERY_SESSION)), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceGroup();
        if (ProcessingScreenResult$lambda$1(mutableState)) {
            composerStartRestartGroup.startReplaceGroup(623669343);
            ComposerKt.sourceInformation(composerStartRestartGroup, "80@3468L19,80@3448L40");
            composerStartRestartGroup.startReplaceGroup(1267046083);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ProcessingScreenResult.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.smartengines.app.ui.ProcessingScreenResultKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProcessingScreenResultKt.ProcessingScreenResult$lambda$4$lambda$3(mutableState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            ResultPreviewKt.ResultPreview(state, (Function0) objRememberedValue2, null, composer2, 56, 4);
            composer2.endReplaceGroup();
        } else {
            composer2 = composerStartRestartGroup;
            composer2.startReplaceGroup(623776479);
            ComposerKt.sourceInformation(composer2, "85@3559L16");
            Result result = (Result) SnapshotStateKt.collectAsState(Model.INSTANCE.getResult(), null, composer2, 8, 1).getValue();
            if (result == null || result.isEmpty()) {
                composer2.startReplaceGroup(1267053482);
                ComposerKt.sourceInformation(composer2, "87@3699L26");
                ResFragmentsKt.NoResult(selectedTreeLeaf, null, composer2, TreeLeaf.$stable | ((i3 >> 3) & 14), 2);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(624005972);
                ComposerKt.sourceInformation(composer2, "");
                if (result instanceof CodeResultData) {
                    composer2.startReplaceGroup(1267056350);
                    ComposerKt.sourceInformation(composer2, "89@3788L46");
                    CodeResultScreenKt.CodeResultScreen(selectedTreeLeaf, (CodeResultData) result, null, null, null, composer2, TreeLeaf.$stable | 64 | ((i3 >> 3) & 14), 28);
                    composer2.endReplaceGroup();
                } else if (result instanceof IdResultData) {
                    composer2.startReplaceGroup(1267058910);
                    ComposerKt.sourceInformation(composer2, "90@3868L46");
                    IdResultScreenKt.IdResultScreen(selectedTreeLeaf, (IdResultData) result, false, null, null, null, composer2, TreeLeaf.$stable | 64 | ((i3 >> 3) & 14), 60);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                } else if (result instanceof DocResultData) {
                    composer2.startReplaceGroup(1267061470);
                    ComposerKt.sourceInformation(composer2, "91@3948L46");
                    DocResultScreenKt.DocResultScreen(selectedTreeLeaf, (DocResultData) result, null, null, composer2, TreeLeaf.$stable | 64 | ((i3 >> 3) & 14), 12);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                } else if (result instanceof LvResultData) {
                    composer2.startReplaceGroup(1267064030);
                    ComposerKt.sourceInformation(composer2, "92@4028L46");
                    LivenessResultScreenKt.LivenessResultScreen(selectedTreeLeaf, (LvResultData) result, null, composer2, TreeLeaf.$stable | 64 | ((i3 >> 3) & 14), 4);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                } else if (result instanceof TextResultData) {
                    composer2.startReplaceGroup(1267066590);
                    ComposerKt.sourceInformation(composer2, "93@4108L46");
                    TextResultScreenKt.TextResultScreen(selectedTreeLeaf, (TextResultData) result, null, null, composer2, TreeLeaf.$stable | 64 | ((i3 >> 3) & 14), 12);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(1267068720);
                    ComposerKt.sourceInformation(composer2, "94@4175L32");
                    TextKt.m3128Text4IGK_g("THE RESULT DATA: " + result, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
            }
            composer2.endReplaceGroup();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final CommonSettings commonSettings2 = value;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.ProcessingScreenResultKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProcessingScreenResultKt.ProcessingScreenResult$lambda$5(state, selectedTreeLeaf, commonSettings2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean ProcessingScreenResult$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ProcessingScreenResult$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProcessingScreenResult$lambda$4$lambda$3(MutableState showPreview$delegate) {
        Intrinsics.checkNotNullParameter(showPreview$delegate, "$showPreview$delegate");
        ProcessingScreenResult$lambda$2(showPreview$delegate, false);
        return Unit.INSTANCE;
    }

    private static final void Dark_Preview(Composer composer, final int i) throws Exception {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1014815907);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Dark_Preview)106@4467L7,107@4491L66,108@4598L239,108@4562L275:ProcessingScreenResult.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            composerStartRestartGroup.startReplaceGroup(-1671002987);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ProcessingScreenResult.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = UtilsKt.loadBitmapFromAssetFile(context, "sample_photo.png");
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Bitmap bitmap = (Bitmap) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            ThemeKt.SmartEnginesTheme(true, ComposableLambdaKt.rememberComposableLambda(218775826, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ProcessingScreenResultKt.Dark_Preview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C109@4618L213,109@4608L223:ProcessingScreenResult.kt#83idza");
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final Bitmap bitmap2 = bitmap;
                        SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(389936407, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ProcessingScreenResultKt.Dark_Preview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                ComposerKt.sourceInformation(composer3, "C110@4632L189:ProcessingScreenResult.kt#83idza");
                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                    ProcessingScreenResultKt.ProcessingScreenResult(new ImageProcessingState.FINISHED(SessionType.PHOTO_SESSION, bitmap2), MockSelectorsKt.getMockSelectedTreeLeaf(), new CommonSettings(null, 1, null), composer3, (TreeLeaf.$stable << 3) | 8 | (CommonSettings.$stable << 6), 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.ProcessingScreenResultKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProcessingScreenResultKt.Dark_Preview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Light_Preview(Composer composer, final int i) throws Exception {
        Composer composerStartRestartGroup = composer.startRestartGroup(1023249369);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Light_Preview)121@4967L7,122@4991L66,123@5099L239,123@5062L276:ProcessingScreenResult.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            composerStartRestartGroup.startReplaceGroup(649835917);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ProcessingScreenResult.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = UtilsKt.loadBitmapFromAssetFile(context, "sample_photo.png");
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Bitmap bitmap = (Bitmap) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            ThemeKt.SmartEnginesTheme(false, ComposableLambdaKt.rememberComposableLambda(609887428, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ProcessingScreenResultKt.Light_Preview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C124@5119L213,124@5109L223:ProcessingScreenResult.kt#83idza");
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final Bitmap bitmap2 = bitmap;
                        SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1620898143, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ProcessingScreenResultKt.Light_Preview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                ComposerKt.sourceInformation(composer3, "C125@5133L189:ProcessingScreenResult.kt#83idza");
                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                    ProcessingScreenResultKt.ProcessingScreenResult(new ImageProcessingState.FINISHED(SessionType.PHOTO_SESSION, bitmap2), MockSelectorsKt.getMockSelectedTreeLeaf(), new CommonSettings(null, 1, null), composer3, (TreeLeaf.$stable << 3) | 8 | (CommonSettings.$stable << 6), 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.ProcessingScreenResultKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProcessingScreenResultKt.Light_Preview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
