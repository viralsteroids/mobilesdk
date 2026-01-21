package com.smartengines.app.p004ui.settings;

import android.content.res.Resources;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.PointerIconCompat;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.smartengines.app.AppKt;
import com.smartengines.app.p004ui.settings.SettingsScreenKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.CodeSettings;
import com.smartengines.app.settings.CommonSettings;
import com.smartengines.app.settings.DocSettings;
import com.smartengines.app.settings.IdSettings;
import com.smartengines.app.settings.TextSettings;
import com.smartengines.targets.code.CodeTargets;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import org.jmrtd.lds.iso19794.IrisImageInfo;

/* compiled from: SettingsScreen.kt */
@Metadata(m513d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0006¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, m514d2 = {"SettingsScreen", "", "onDismiss", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Preview_Dark", "(Landroidx/compose/runtime/Composer;I)V", "Preview_Light", "app_storeRelease", "commonSettings", "Lcom/smartengines/app/settings/CommonSettings;", "codeSettings", "Lcom/smartengines/app/settings/CodeSettings;", "idSettings", "Lcom/smartengines/app/settings/IdSettings;", "docSettings", "Lcom/smartengines/app/settings/DocSettings;", "textSettings", "Lcom/smartengines/app/settings/TextSettings;"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class SettingsScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Dark$lambda$6(int i, Composer composer, int i2) {
        Preview_Dark(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Light$lambda$7(int i, Composer composer, int i2) {
        Preview_Light(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsScreen$lambda$5(Function0 onDismiss, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(onDismiss, "$onDismiss");
        SettingsScreen(onDismiss, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SettingsScreen(final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1056284863);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SettingsScreen)47@1887L33,50@1986L16,51@2053L16,52@2118L16,53@2184L16,54@2251L16,59@2409L23,61@2482L2353,61@2438L2397:SettingsScreen.kt#v86m6v");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onDismiss) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            BackHandlerKt.BackHandler(false, onDismiss, composerStartRestartGroup, (i2 << 3) & LDSFile.EF_DG16_TAG, 1);
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2978SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1468177318, true, new C32731(NavHostControllerKt.rememberNavController(new Navigator[0], composerStartRestartGroup, 8), onDismiss, SnapshotStateKt.collectAsState(AppKt.getCommonSettingsStore().getData(), null, composerStartRestartGroup, 8, 1), SnapshotStateKt.collectAsState(AppKt.getCodeSettingsStore().getData(), null, composerStartRestartGroup, 8, 1), SnapshotStateKt.collectAsState(AppKt.getIdSettingsStore().getData(), null, composerStartRestartGroup, 8, 1), SnapshotStateKt.collectAsState(AppKt.getDocSettingsStore().getData(), null, composerStartRestartGroup, 8, 1), SnapshotStateKt.collectAsState(AppKt.getTextSettingsStore().getData(), null, composerStartRestartGroup, 8, 1)), composerStartRestartGroup, 54), composer2, 12582918, 126);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.SettingsScreen$lambda$5(onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SettingsScreen.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1 */
    static final class C32731 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ State<CodeSettings> $codeSettings$delegate;
        final /* synthetic */ State<CommonSettings> $commonSettings$delegate;
        final /* synthetic */ State<DocSettings> $docSettings$delegate;
        final /* synthetic */ State<IdSettings> $idSettings$delegate;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ State<TextSettings> $textSettings$delegate;

        C32731(NavHostController navHostController, Function0<Unit> function0, State<CommonSettings> state, State<CodeSettings> state2, State<IdSettings> state3, State<DocSettings> state4, State<TextSettings> state5) {
            this.$navController = navHostController;
            this.$onDismiss = function0;
            this.$commonSettings$delegate = state;
            this.$codeSettings$delegate = state2;
            this.$idSettings$delegate = state3;
            this.$docSettings$delegate = state4;
            this.$textSettings$delegate = state5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C62@2492L2337:SettingsScreen.kt#v86m6v");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                final NavHostController navHostController = this.$navController;
                final Function0<Unit> function0 = this.$onDismiss;
                final State<CommonSettings> state = this.$commonSettings$delegate;
                final State<CodeSettings> state2 = this.$codeSettings$delegate;
                final State<IdSettings> state3 = this.$idSettings$delegate;
                final State<DocSettings> state4 = this.$docSettings$delegate;
                final State<TextSettings> state5 = this.$textSettings$delegate;
                NavHostKt.NavHost(navHostController, "home", modifierFillMaxSize$default, null, null, null, null, null, null, null, new Function1() { // from class: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SettingsScreenKt.C32731.invoke$lambda$0(function0, navHostController, state, state2, state3, state4, state5, (NavGraphBuilder) obj);
                    }
                }, composer, 440, 0, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$0(final Function0 onDismiss, final NavHostController navController, final State commonSettings$delegate, final State codeSettings$delegate, final State idSettings$delegate, final State docSettings$delegate, final State textSettings$delegate, NavGraphBuilder NavHost) {
            Intrinsics.checkNotNullParameter(onDismiss, "$onDismiss");
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(commonSettings$delegate, "$commonSettings$delegate");
            Intrinsics.checkNotNullParameter(codeSettings$delegate, "$codeSettings$delegate");
            Intrinsics.checkNotNullParameter(idSettings$delegate, "$idSettings$delegate");
            Intrinsics.checkNotNullParameter(docSettings$delegate, "$docSettings$delegate");
            Intrinsics.checkNotNullParameter(textSettings$delegate, "$textSettings$delegate");
            Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
            NavGraphBuilderKt.composable$default(NavHost, "home", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(437788055, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$1
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                    invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: SettingsScreen.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$1$1 */
                /* synthetic */ class C32741 extends AdaptedFunctionReference implements Function1<String, Unit> {
                    C32741(Object obj) {
                        super(1, obj, NavHostController.class, "navigate", "navigate(Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) throws Resources.NotFoundException {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String p0) throws Resources.NotFoundException {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        NavController.navigate$default((NavController) this.receiver, p0, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                    }
                }

                public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(composable, "$this$composable");
                    Intrinsics.checkNotNullParameter(it, "it");
                    ComposerKt.sourceInformation(composer, "C66@2657L275:SettingsScreen.kt#v86m6v");
                    HomeKt.SettingsHome(onDismiss, new C32741(navController), SettingsScreenKt.SettingsScreen$lambda$0(commonSettings$delegate), SettingsScreenKt.SettingsScreen$lambda$1(codeSettings$delegate), SettingsScreenKt.SettingsScreen$lambda$2(idSettings$delegate), SettingsScreenKt.SettingsScreen$lambda$3(docSettings$delegate), SettingsScreenKt.SettingsScreen$lambda$4(textSettings$delegate), composer, 2396672);
                }
            }), IrisImageInfo.IMAGE_QUAL_UNDEF, null);
            NavGraphBuilderKt.composable$default(NavHost, "barcodes", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(689599232, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                    invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: SettingsScreen.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$2$1 */
                /* synthetic */ class C32771 extends AdaptedFunctionReference implements Function0<Unit> {
                    C32771(Object obj) {
                        super(0, obj, NavHostController.class, "navigateUp", "navigateUp()Z", 8);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((NavHostController) this.receiver).navigateUp();
                    }
                }

                /* compiled from: SettingsScreen.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$2$2 */
                /* synthetic */ class C32782 extends AdaptedFunctionReference implements Function1<String, Unit> {
                    C32782(Object obj) {
                        super(1, obj, NavHostController.class, "navigate", "navigate(Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) throws Resources.NotFoundException {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String p0) throws Resources.NotFoundException {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        NavController.navigate$default((NavController) this.receiver, p0, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                    }
                }

                public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(composable, "$this$composable");
                    Intrinsics.checkNotNullParameter(it, "it");
                    ComposerKt.sourceInformation(composer, "C78@3001L160:SettingsScreen.kt#v86m6v");
                    BarcodesKt.SettingsBarcodes(new C32771(navController), new C32782(navController), SettingsScreenKt.SettingsScreen$lambda$1(codeSettings$delegate), null, composer, 512, 8);
                }
            }), IrisImageInfo.IMAGE_QUAL_UNDEF, null);
            NavGraphBuilderKt.composable$default(NavHost, "barcode-types", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1494676705, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$3
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                    invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: SettingsScreen.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$3$1 */
                /* synthetic */ class C32791 extends AdaptedFunctionReference implements Function0<Unit> {
                    C32791(Object obj) {
                        super(0, obj, NavHostController.class, "navigateUp", "navigateUp()Z", 8);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((NavHostController) this.receiver).navigateUp();
                    }
                }

                public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(composable, "$this$composable");
                    Intrinsics.checkNotNullParameter(it, "it");
                    ComposerKt.sourceInformation(composer, "C86@3235L119:SettingsScreen.kt#v86m6v");
                    BarcodesKt.SettingsBarcodeTypes(new C32791(navController), SettingsScreenKt.SettingsScreen$lambda$1(codeSettings$delegate), null, composer, 64, 4);
                }
            }), IrisImageInfo.IMAGE_QUAL_UNDEF, null);
            NavGraphBuilderKt.composable$default(NavHost, "cards", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(616014654, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$4
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                    invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: SettingsScreen.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$4$1 */
                /* synthetic */ class C32801 extends AdaptedFunctionReference implements Function0<Unit> {
                    C32801(Object obj) {
                        super(0, obj, NavHostController.class, "navigateUp", "navigateUp()Z", 8);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((NavHostController) this.receiver).navigateUp();
                    }
                }

                public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(composable, "$this$composable");
                    Intrinsics.checkNotNullParameter(it, "it");
                    ComposerKt.sourceInformation(composer, "C93@3420L112:SettingsScreen.kt#v86m6v");
                    CardsKt.SettingsCards(new C32801(navController), SettingsScreenKt.SettingsScreen$lambda$1(codeSettings$delegate), null, composer, 64, 4);
                }
            }), IrisImageInfo.IMAGE_QUAL_UNDEF, null);
            NavGraphBuilderKt.composable$default(NavHost, "textlines", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1568261283, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$5
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                    invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: SettingsScreen.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$5$1 */
                /* synthetic */ class C32811 extends AdaptedFunctionReference implements Function0<Unit> {
                    C32811(Object obj) {
                        super(0, obj, NavHostController.class, "navigateUp", "navigateUp()Z", 8);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((NavHostController) this.receiver).navigateUp();
                    }
                }

                public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(composable, "$this$composable");
                    Intrinsics.checkNotNullParameter(it, "it");
                    ComposerKt.sourceInformation(composer, "C99@3601L117:SettingsScreen.kt#v86m6v");
                    LinesKt.SettingsTextLines(new C32811(navController), SettingsScreenKt.SettingsScreen$lambda$1(codeSettings$delegate), null, composer, 64, 4);
                }
            }), IrisImageInfo.IMAGE_QUAL_UNDEF, null);
            NavGraphBuilderKt.composable$default(NavHost, "texts", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(542430076, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$6
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                    invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: SettingsScreen.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$6$1 */
                /* synthetic */ class C32821 extends AdaptedFunctionReference implements Function0<Unit> {
                    C32821(Object obj) {
                        super(0, obj, NavHostController.class, "navigateUp", "navigateUp()Z", 8);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((NavHostController) this.receiver).navigateUp();
                    }
                }

                public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(composable, "$this$composable");
                    Intrinsics.checkNotNullParameter(it, "it");
                    ComposerKt.sourceInformation(composer, "C106@3784L112:SettingsScreen.kt#v86m6v");
                    TextsKt.SettingsTexts(new C32821(navController), SettingsScreenKt.SettingsScreen$lambda$4(textSettings$delegate), null, composer, 64, 4);
                }
            }), IrisImageInfo.IMAGE_QUAL_UNDEF, null);
            NavGraphBuilderKt.composable$default(NavHost, CodeTargets.CodeTextLineMeters.ALLOWED_TYPE, null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1641845861, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$7
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                    invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: SettingsScreen.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$7$1 */
                /* synthetic */ class C32831 extends AdaptedFunctionReference implements Function0<Unit> {
                    C32831(Object obj) {
                        super(0, obj, NavHostController.class, "navigateUp", "navigateUp()Z", 8);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((NavHostController) this.receiver).navigateUp();
                    }
                }

                public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(composable, "$this$composable");
                    Intrinsics.checkNotNullParameter(it, "it");
                    ComposerKt.sourceInformation(composer, "C112@3962L113:SettingsScreen.kt#v86m6v");
                    MetersKt.SettingsMeters(new C32831(navController), SettingsScreenKt.SettingsScreen$lambda$1(codeSettings$delegate), null, composer, 64, 4);
                }
            }), IrisImageInfo.IMAGE_QUAL_UNDEF, null);
            NavGraphBuilderKt.composable$default(NavHost, "payments", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(468845498, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$8
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                    invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: SettingsScreen.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$8$1 */
                /* synthetic */ class C32841 extends AdaptedFunctionReference implements Function0<Unit> {
                    C32841(Object obj) {
                        super(0, obj, NavHostController.class, "navigateUp", "navigateUp()Z", 8);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((NavHostController) this.receiver).navigateUp();
                    }
                }

                public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(composable, "$this$composable");
                    Intrinsics.checkNotNullParameter(it, "it");
                    ComposerKt.sourceInformation(composer, "C118@4143L115:SettingsScreen.kt#v86m6v");
                    PaymentsKt.SettingsPayments(new C32841(navController), SettingsScreenKt.SettingsScreen$lambda$1(codeSettings$delegate), null, composer, 64, 4);
                }
            }), IrisImageInfo.IMAGE_QUAL_UNDEF, null);
            NavGraphBuilderKt.composable$default(NavHost, "plates", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1715430439, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$9
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                    invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: SettingsScreen.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$9$1 */
                /* synthetic */ class C32851 extends AdaptedFunctionReference implements Function0<Unit> {
                    C32851(Object obj) {
                        super(0, obj, NavHostController.class, "navigateUp", "navigateUp()Z", 8);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((NavHostController) this.receiver).navigateUp();
                    }
                }

                public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(composable, "$this$composable");
                    Intrinsics.checkNotNullParameter(it, "it");
                    ComposerKt.sourceInformation(composer, "C124@4324L113:SettingsScreen.kt#v86m6v");
                    PlatesKt.SettingsPlates(new C32851(navController), SettingsScreenKt.SettingsScreen$lambda$1(codeSettings$delegate), null, composer, 64, 4);
                }
            }), IrisImageInfo.IMAGE_QUAL_UNDEF, null);
            NavGraphBuilderKt.composable$default(NavHost, "containers", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(395260920, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$10
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                    invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: SettingsScreen.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$10$1 */
                /* synthetic */ class C32751 extends AdaptedFunctionReference implements Function0<Unit> {
                    C32751(Object obj) {
                        super(0, obj, NavHostController.class, "navigateUp", "navigateUp()Z", 8);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((NavHostController) this.receiver).navigateUp();
                    }
                }

                public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(composable, "$this$composable");
                    Intrinsics.checkNotNullParameter(it, "it");
                    ComposerKt.sourceInformation(composer, "C130@4507L117:SettingsScreen.kt#v86m6v");
                    ContainersKt.SettingsContainers(new C32751(navController), SettingsScreenKt.SettingsScreen$lambda$1(codeSettings$delegate), composer, 64);
                }
            }), IrisImageInfo.IMAGE_QUAL_UNDEF, null);
            NavGraphBuilderKt.composable$default(NavHost, "liveness", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1026077068, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$11
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                    invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: SettingsScreen.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.SettingsScreenKt$SettingsScreen$1$1$11$1 */
                /* synthetic */ class C32761 extends AdaptedFunctionReference implements Function0<Unit> {
                    C32761(Object obj) {
                        super(0, obj, NavHostController.class, "navigateUp", "navigateUp()Z", 8);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((NavHostController) this.receiver).navigateUp();
                    }
                }

                public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(composable, "$this$composable");
                    Intrinsics.checkNotNullParameter(it, "it");
                    ComposerKt.sourceInformation(composer, "C136@4692L113:SettingsScreen.kt#v86m6v");
                    LivenessKt.SettingsLiveness(new C32761(navController), SettingsScreenKt.SettingsScreen$lambda$2(idSettings$delegate), null, composer, 64, 4);
                }
            }), IrisImageInfo.IMAGE_QUAL_UNDEF, null);
            return Unit.INSTANCE;
        }
    }

    private static final void Preview_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-890541825);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Dark)149@5038L82:SettingsScreen.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$SettingsScreenKt.INSTANCE.m7772getLambda1$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.Preview_Dark$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Light(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-902806027);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Light)156@5222L83:SettingsScreen.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ThemeKt.SmartEnginesTheme(false, ComposableSingletons$SettingsScreenKt.INSTANCE.m7773getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.Preview_Light$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonSettings SettingsScreen$lambda$0(State<CommonSettings> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CodeSettings SettingsScreen$lambda$1(State<CodeSettings> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdSettings SettingsScreen$lambda$2(State<IdSettings> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocSettings SettingsScreen$lambda$3(State<DocSettings> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextSettings SettingsScreen$lambda$4(State<TextSettings> state) {
        return state.getValue();
    }
}
