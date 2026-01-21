package com.smartengines.app.p004ui;

import android.content.Context;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.AppKt;
import com.smartengines.app.AppViewModel;
import com.smartengines.app.FacesModel2;
import com.smartengines.app.Model;
import com.smartengines.app.Photo;
import com.smartengines.app.com.smartengines.app.p003ui.AppExitDialogKt;
import com.smartengines.app.p004ui.AppContentKt;
import com.smartengines.app.p004ui.MainRoute;
import com.smartengines.app.p004ui.settings.SettingsScreenKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.CommonSettings;
import com.smartengines.app.targets.IdTargetTestUtils;
import com.smartengines.app.targets.TreeLeaf;
import com.smartengines.engine.ImageProcessingState;
import com.smartengines.targets.p008id.LivenessTarget;
import com.smartengines.utils.VersionKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppContent.kt */
@Metadata(m513d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u0006X\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m514d2 = {"TAG", "", "AppContent", "", "(Landroidx/compose/runtime/Composer;I)V", "isPreview", "", "()Z", "setPreview", "(Z)V", "app_storeRelease", "commonSettings", "Lcom/smartengines/app/settings/CommonSettings;", "modelIsLoaded", "showIntro", "imageProcessingState", "Lcom/smartengines/engine/ImageProcessingState;"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class AppContentKt {
    private static final String TAG = "myapp.AppContent";
    private static boolean isPreview;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppContent$lambda$2(int i, Composer composer, int i2) {
        AppContent(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AppContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1599496968);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AppContent)39@1633L7,42@1665L16,45@1721L35,46@1808L16,47@1853L16,49@1881L35,53@2097L2852,53@2041L2908:AppContent.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            ScreenDataKt.ReadScreenData(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-491486161);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):AppContent.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = Long.valueOf(VersionKt.appVersionCode(context));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final long jLongValue = ((Number) objRememberedValue).longValue();
            composerStartRestartGroup.endReplaceGroup();
            final State stateCollectAsState = SnapshotStateKt.collectAsState(AppKt.getCommonSettingsStore().getData(), null, composerStartRestartGroup, 8, 1);
            final Throwable th = (Throwable) SnapshotStateKt.collectAsState(Model.INSTANCE.getError(), null, composerStartRestartGroup, 8, 1).getValue();
            BackHandlerKt.BackHandler(false, new C30881(Model.INSTANCE), composerStartRestartGroup, 0, 1);
            ThemeKt.SmartEnginesTheme(AppContent$lambda$1(stateCollectAsState).getDarkTheme(), ComposableLambdaKt.rememberComposableLambda(465990013, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.AppContentKt.AppContent.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C54@2150L2793,54@2106L2837:AppContent.kt#83idza");
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final long j = jLongValue;
                        final Throwable th2 = th;
                        final State<CommonSettings> state = stateCollectAsState;
                        ScaffoldKt.m2843ScaffoldTvnljyQ(modifierFillMaxSize$default, null, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-932322994, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.AppContentKt.AppContent.2.1

                            /* compiled from: AppContent.kt */
                            @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                            /* renamed from: com.smartengines.app.ui.AppContentKt$AppContent$2$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C40051 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ long $appVersion;
                                final /* synthetic */ State<CommonSettings> $commonSettings$delegate;
                                final /* synthetic */ Throwable $error;

                                C40051(long j, Throwable th, State<CommonSettings> state) {
                                    this.$appVersion = j;
                                    this.$error = th;
                                    this.$commonSettings$delegate = state;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) {
                                    ComposerKt.sourceInformation(composer, "C*105@4873L44:AppContent.kt#83idza");
                                    if ((i & 11) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    MainRoute mainRoute = AppViewModel.INSTANCE.getMainRoute();
                                    if (Intrinsics.areEqual(mainRoute, MainRoute.Home.INSTANCE)) {
                                        composer.startReplaceGroup(-493691754);
                                        ComposerKt.sourceInformation(composer, "61@2420L16,62@2461L163");
                                        HomeScreenKt.HomeScreen(invoke$lambda$0(SnapshotStateKt.collectAsState(Model.INSTANCE.getLoadedState(), null, composer, 8, 1)), Model.INSTANCE.getHomeScreenTargets(), composer, 64);
                                        composer.endReplaceGroup();
                                    } else if (mainRoute instanceof MainRoute.TargetList) {
                                        composer.startReplaceGroup(-493326140);
                                        ComposerKt.sourceInformation(composer, "70@2756L37");
                                        TargetsScreenKt.TargetsScreen(((MainRoute.TargetList) mainRoute).getTargetsViewModel(), composer, TargetsViewModel.$stable);
                                        composer.endReplaceGroup();
                                    } else {
                                        if (!(mainRoute instanceof MainRoute.TargetProcessing)) {
                                            composer.startReplaceGroup(538261468);
                                            composer.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer.startReplaceGroup(-493118440);
                                        ComposerKt.sourceInformation(composer, "75@2954L104,85@3636L16,86@3681L173");
                                        composer.startReplaceGroup(538282769);
                                        ComposerKt.sourceInformation(composer, "CC(remember):AppContent.kt#9igjgp");
                                        State<CommonSettings> state = this.$commonSettings$delegate;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf((((MainRoute.TargetProcessing) mainRoute).getSelectedLeaf().getTarget() instanceof LivenessTarget) && AppContentKt.AppContent$lambda$1(state).getLivenessIntro()), null, 2, null);
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        ProcessingScreenKt.ProcessingScreen(((MainRoute.TargetProcessing) mainRoute).getSelectedLeaf(), invoke$lambda$4(SnapshotStateKt.collectAsState(Model.INSTANCE.getImageProcessor().getState(), null, composer, 8, 1)), ComposableSingletons$AppContentKt.INSTANCE.m7416getLambda1$app_storeRelease(), composer, TreeLeaf.$stable | 448);
                                        composer.endReplaceGroup();
                                    }
                                    composer.startReplaceGroup(538316062);
                                    ComposerKt.sourceInformation(composer, "94@4020L60");
                                    if (AppViewModel.INSTANCE.getShowInfo()) {
                                        InfoScreenKt.InfoScreen(new Function0() { // from class: com.smartengines.app.ui.AppContentKt$AppContent$2$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return AppContentKt.C30892.AnonymousClass1.C40051.invoke$lambda$5();
                                            }
                                        }, AppContentKt.AppContent$lambda$1(this.$commonSettings$delegate), composer, (CommonSettings.$stable << 3) | 6);
                                    }
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(538319365);
                                    ComposerKt.sourceInformation(composer, "95@4198L16,95@4122L99");
                                    if (AppViewModel.INSTANCE.getShowTestErrors()) {
                                        TestScreenKt.TestScreen(new Function0() { // from class: com.smartengines.app.ui.AppContentKt$AppContent$2$1$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return AppContentKt.C30892.AnonymousClass1.C40051.invoke$lambda$6();
                                            }
                                        }, (List) SnapshotStateKt.collectAsState(IdTargetTestUtils.INSTANCE.getErrors(), null, composer, 8, 1).getValue(), composer, 70);
                                    }
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(538323793);
                                    ComposerKt.sourceInformation(composer, "96@4263L15");
                                    if (AppViewModel.INSTANCE.getShowExit()) {
                                        AppExitDialogKt.AppExitDialog(composer, 0);
                                    }
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(538325662);
                                    ComposerKt.sourceInformation(composer, "97@4320L60");
                                    if (AppViewModel.INSTANCE.getShowSettings()) {
                                        SettingsScreenKt.SettingsScreen(new Function0() { // from class: com.smartengines.app.ui.AppContentKt$AppContent$2$1$1$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return AppContentKt.C30892.AnonymousClass1.C40051.invoke$lambda$7();
                                            }
                                        }, composer, 6);
                                    }
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(538328889);
                                    ComposerKt.sourceInformation(composer, "98@4422L23");
                                    if (AppViewModel.INSTANCE.getShowSessionSettings()) {
                                        SessionSettingsScreenKt.SessionSettingsScreen(null, composer, 0, 1);
                                    }
                                    composer.endReplaceGroup();
                                    FacesModel2 facesModel = AppViewModel.INSTANCE.getFacesModel();
                                    composer.startReplaceGroup(538331335);
                                    ComposerKt.sourceInformation(composer, "*99@4486L16");
                                    if (facesModel != null) {
                                        FacesScreen2Kt.FacesScreen2(facesModel, composer, FacesModel2.$stable);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer.endReplaceGroup();
                                    Function1<Photo, Unit> onPhotoTaken = AppViewModel.INSTANCE.getOnPhotoTaken();
                                    composer.startReplaceGroup(538333334);
                                    ComposerKt.sourceInformation(composer, "*100@4546L64");
                                    if (onPhotoTaken != null) {
                                        PhotoDialogKt.PhotoDialog(new Function0() { // from class: com.smartengines.app.ui.AppContentKt$AppContent$2$1$1$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return AppContentKt.C30892.AnonymousClass1.C40051.invoke$lambda$10$lambda$9();
                                            }
                                        }, onPhotoTaken, composer, 6);
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                    composer.endReplaceGroup();
                                    if (this.$appVersion != AppContentKt.AppContent$lambda$1(this.$commonSettings$delegate).getEulaVersion()) {
                                        composer.startReplaceGroup(538339253);
                                        ComposerKt.sourceInformation(composer, "102@4722L12");
                                        EulaScreenKt.EulaScreen(null, null, composer, 0, 3);
                                        composer.endReplaceGroup();
                                    } else {
                                        if (AppContentKt.AppContent$lambda$1(this.$commonSettings$delegate).getTutorialShown()) {
                                            composer.startReplaceGroup(-491269383);
                                        } else {
                                            composer.startReplaceGroup(538341619);
                                            ComposerKt.sourceInformation(composer, "103@4796L10");
                                            TutorialKt.Tutorial(composer, 0);
                                        }
                                        composer.endReplaceGroup();
                                    }
                                    Throwable th = this.$error;
                                    if (th == null) {
                                        return;
                                    }
                                    ErrorDialogKt.ErrorDialog(th, new Function0() { // from class: com.smartengines.app.ui.AppContentKt$AppContent$2$1$1$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AppContentKt.C30892.AnonymousClass1.C40051.invoke$lambda$12$lambda$11();
                                        }
                                    }, composer, 56);
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$5() {
                                    AppViewModel.INSTANCE.setShowInfo(false);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$6() {
                                    AppViewModel.INSTANCE.setShowTestErrors(false);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$7() {
                                    AppViewModel.INSTANCE.setShowSettings(!AppViewModel.INSTANCE.getShowSettings());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$10$lambda$9() {
                                    AppViewModel.INSTANCE.setOnPhotoTaken(null);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$12$lambda$11() {
                                    Model.INSTANCE.getError().setValue(null);
                                    return Unit.INSTANCE;
                                }

                                private static final boolean invoke$lambda$0(State<Boolean> state) {
                                    return state.getValue().booleanValue();
                                }

                                private static final ImageProcessingState invoke$lambda$4(State<? extends ImageProcessingState> state) {
                                    return state.getValue();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues innerPadding, Composer composer3, int i3) {
                                int i4;
                                Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                                ComposerKt.sourceInformation(composer3, "C55@2220L2714,55@2180L2754:AppContent.kt#83idza");
                                if ((i3 & 14) == 0) {
                                    i4 = i3 | (composer3.changed(innerPadding) ? 4 : 2);
                                } else {
                                    i4 = i3;
                                }
                                if ((i4 & 91) != 18 || !composer3.getSkipping()) {
                                    SurfaceKt.m2978SurfaceT9BRK9s(PaddingKt.padding(Modifier.INSTANCE, innerPadding), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-504449303, true, new C40051(j, th2, state), composer3, 54), composer3, 12582912, 126);
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306374, 510);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.AppContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppContentKt.AppContent$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AppContent.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.AppContentKt$AppContent$1 */
    /* synthetic */ class C30881 extends FunctionReferenceImpl implements Function0<Unit> {
        C30881(Object obj) {
            super(0, obj, Model.class, "onBack", "onBack()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((Model) this.receiver).onBack();
        }
    }

    public static final boolean isPreview() {
        return isPreview;
    }

    public static final void setPreview(boolean z) {
        isPreview = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonSettings AppContent$lambda$1(State<CommonSettings> state) {
        return state.getValue();
    }
}
