package com.smartengines.app.p004ui.settings;

import android.content.Context;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.C3069R;
import com.smartengines.app.p004ui.AppContentKt;
import com.smartengines.app.p004ui.settings.HomeCodeKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.CodeSettings;
import com.smartengines.targets.code.CodeTargets;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeCode.kt */
@Metadata(m513d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\t¨\u0006\u000b"}, m514d2 = {"HomeCode", "", "navigate", "Lkotlin/Function1;", "", "codeSettings", "Lcom/smartengines/app/settings/CodeSettings;", "(Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/CodeSettings;Landroidx/compose/runtime/Composer;I)V", "Preview_Dark", "(Landroidx/compose/runtime/Composer;I)V", "Preview_Light", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class HomeCodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeCode$lambda$0(Function1 navigate, CodeSettings codeSettings, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(navigate, "$navigate");
        Intrinsics.checkNotNullParameter(codeSettings, "$codeSettings");
        HomeCode(navigate, codeSettings, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Dark$lambda$1(int i, Composer composer, int i2) {
        Preview_Dark(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Light$lambda$2(int i, Composer composer, int i2) {
        Preview_Light(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HomeCode(final Function1<? super String, Unit> navigate, final CodeSettings codeSettings, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(navigate, "navigate");
        Intrinsics.checkNotNullParameter(codeSettings, "codeSettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(-241465314);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HomeCode)P(1)16@544L7,17@610L589,17@556L643:HomeCode.kt#v86m6v");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(navigate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            FragmentsKt.Section(context.getString(C3069R.string.code_engine_name), ComposableLambdaKt.rememberComposableLambda(-1877375179, true, new C32601(context, navigate), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeCodeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeCodeKt.HomeCode$lambda$0(navigate, codeSettings, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: HomeCode.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.settings.HomeCodeKt$HomeCode$1 */
    static final class C32601 implements Function3<ColumnScope, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Function1<String, Unit> $navigate;

        /* JADX WARN: Multi-variable type inference failed */
        C32601(Context context, Function1<? super String, Unit> function1) {
            this.$context = context;
            this.$navigate = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 navigate) {
            Intrinsics.checkNotNullParameter(navigate, "$navigate");
            navigate.invoke("barcodes");
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope Section, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Section, "$this$Section");
            ComposerKt.sourceInformation(composer, "C18@672L23,18@620L75,19@756L20,19@704L72,20@833L24,20@785L72,21@918L21,21@866L73,22@1000L23,22@948L75,23@1084L21,23@1032L73:HomeCode.kt#v86m6v");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            String string = this.$context.getString(C3069R.string.s_barcodes);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            composer.startReplaceGroup(2114663065);
            ComposerKt.sourceInformation(composer, "CC(remember):HomeCode.kt#9igjgp");
            boolean zChanged = composer.changed(this.$navigate);
            final Function1<String, Unit> function1 = this.$navigate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.smartengines.app.ui.settings.HomeCodeKt$HomeCode$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeCodeKt.C32601.invoke$lambda$1$lambda$0(function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            FragmentsKt.LinkRow(string, (Function0) objRememberedValue, composer, 0);
            String string2 = this.$context.getString(C3069R.string.s_cards);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            composer.startReplaceGroup(2114665750);
            ComposerKt.sourceInformation(composer, "CC(remember):HomeCode.kt#9igjgp");
            boolean zChanged2 = composer.changed(this.$navigate);
            final Function1<String, Unit> function12 = this.$navigate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.smartengines.app.ui.settings.HomeCodeKt$HomeCode$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeCodeKt.C32601.invoke$lambda$3$lambda$2(function12);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            FragmentsKt.LinkRow(string2, (Function0) objRememberedValue2, composer, 0);
            String string3 = this.$context.getString(C3069R.string.s_lines);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            composer.startReplaceGroup(2114668218);
            ComposerKt.sourceInformation(composer, "CC(remember):HomeCode.kt#9igjgp");
            boolean zChanged3 = composer.changed(this.$navigate);
            final Function1<String, Unit> function13 = this.$navigate;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.smartengines.app.ui.settings.HomeCodeKt$HomeCode$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeCodeKt.C32601.invoke$lambda$5$lambda$4(function13);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            FragmentsKt.LinkRow(string3, (Function0) objRememberedValue3, composer, 0);
            String string4 = this.$context.getString(C3069R.string.s_meters);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            composer.startReplaceGroup(2114670935);
            ComposerKt.sourceInformation(composer, "CC(remember):HomeCode.kt#9igjgp");
            boolean zChanged4 = composer.changed(this.$navigate);
            final Function1<String, Unit> function14 = this.$navigate;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.smartengines.app.ui.settings.HomeCodeKt$HomeCode$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeCodeKt.C32601.invoke$lambda$7$lambda$6(function14);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            FragmentsKt.LinkRow(string4, (Function0) objRememberedValue4, composer, 0);
            String string5 = this.$context.getString(C3069R.string.s_payments);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            composer.startReplaceGroup(2114673561);
            ComposerKt.sourceInformation(composer, "CC(remember):HomeCode.kt#9igjgp");
            boolean zChanged5 = composer.changed(this.$navigate);
            final Function1<String, Unit> function15 = this.$navigate;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.smartengines.app.ui.settings.HomeCodeKt$HomeCode$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeCodeKt.C32601.invoke$lambda$9$lambda$8(function15);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            FragmentsKt.LinkRow(string5, (Function0) objRememberedValue5, composer, 0);
            String string6 = this.$context.getString(C3069R.string.s_plates);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            composer.startReplaceGroup(2114676247);
            ComposerKt.sourceInformation(composer, "CC(remember):HomeCode.kt#9igjgp");
            boolean zChanged6 = composer.changed(this.$navigate);
            final Function1<String, Unit> function16 = this.$navigate;
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.smartengines.app.ui.settings.HomeCodeKt$HomeCode$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeCodeKt.C32601.invoke$lambda$11$lambda$10(function16);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            FragmentsKt.LinkRow(string6, (Function0) objRememberedValue6, composer, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Function1 navigate) {
            Intrinsics.checkNotNullParameter(navigate, "$navigate");
            navigate.invoke("cards");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(Function1 navigate) {
            Intrinsics.checkNotNullParameter(navigate, "$navigate");
            navigate.invoke("textlines");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(Function1 navigate) {
            Intrinsics.checkNotNullParameter(navigate, "$navigate");
            navigate.invoke(CodeTargets.CodeTextLineMeters.ALLOWED_TYPE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(Function1 navigate) {
            Intrinsics.checkNotNullParameter(navigate, "$navigate");
            navigate.invoke("payments");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10(Function1 navigate) {
            Intrinsics.checkNotNullParameter(navigate, "$navigate");
            navigate.invoke("plates");
            return Unit.INSTANCE;
        }
    }

    private static final void Preview_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1383642146);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Dark)33@1425L184:HomeCode.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$HomeCodeKt.INSTANCE.m7723getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeCodeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeCodeKt.Preview_Dark$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Light(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-368311912);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Light)45@1734L185:HomeCode.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(false, ComposableSingletons$HomeCodeKt.INSTANCE.m7725getLambda4$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeCodeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeCodeKt.Preview_Light$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
