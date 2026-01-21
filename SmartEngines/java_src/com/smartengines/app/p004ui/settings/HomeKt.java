package com.smartengines.app.p004ui.settings;

import android.content.Context;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.C3069R;
import com.smartengines.app.Model;
import com.smartengines.app.p004ui.AppContentKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.BuildFlavor;
import com.smartengines.app.settings.CodeSettings;
import com.smartengines.app.settings.CommonSettings;
import com.smartengines.app.settings.DocSettings;
import com.smartengines.app.settings.IdSettings;
import com.smartengines.app.settings.TextSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: Home.kt */
@Metadata(m513d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aW\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, m514d2 = {"SettingsHome", "", "onBack", "Lkotlin/Function0;", "navigate", "Lkotlin/Function1;", "", "commonSettings", "Lcom/smartengines/app/settings/CommonSettings;", "codeSettings", "Lcom/smartengines/app/settings/CodeSettings;", "idSettings", "Lcom/smartengines/app/settings/IdSettings;", "docSettings", "Lcom/smartengines/app/settings/DocSettings;", "textSettings", "Lcom/smartengines/app/settings/TextSettings;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/DocSettings;Lcom/smartengines/app/settings/TextSettings;Landroidx/compose/runtime/Composer;I)V", "Preview_Dark", "(Landroidx/compose/runtime/Composer;I)V", "Preview_Light", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class HomeKt {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsHome$lambda$0(Function0 onBack, Function1 navigate, CommonSettings commonSettings, CodeSettings codeSettings, IdSettings idSettings, DocSettings docSettings, TextSettings textSettings, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(onBack, "$onBack");
        Intrinsics.checkNotNullParameter(navigate, "$navigate");
        Intrinsics.checkNotNullParameter(commonSettings, "$commonSettings");
        Intrinsics.checkNotNullParameter(codeSettings, "$codeSettings");
        Intrinsics.checkNotNullParameter(idSettings, "$idSettings");
        Intrinsics.checkNotNullParameter(docSettings, "$docSettings");
        Intrinsics.checkNotNullParameter(textSettings, "$textSettings");
        SettingsHome(onBack, navigate, commonSettings, codeSettings, idSettings, docSettings, textSettings, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SettingsHome(final Function0<Unit> onBack, final Function1<? super String, Unit> navigate, final CommonSettings commonSettings, final CodeSettings codeSettings, final IdSettings idSettings, final DocSettings docSettings, final TextSettings textSettings, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(navigate, "navigate");
        Intrinsics.checkNotNullParameter(commonSettings, "commonSettings");
        Intrinsics.checkNotNullParameter(codeSettings, "codeSettings");
        Intrinsics.checkNotNullParameter(idSettings, "idSettings");
        Intrinsics.checkNotNullParameter(docSettings, "docSettings");
        Intrinsics.checkNotNullParameter(textSettings, "textSettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(-891573590);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SettingsHome)P(5,4,1!1,3)45@1794L7,46@1869L652,46@1806L715:Home.kt#v86m6v");
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        String string = ((Context) objConsume).getString(C3069R.string.settings);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        FragmentsKt.SettingsScaffold(string, onBack, ComposableLambdaKt.rememberComposableLambda(402454914, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.HomeKt.SettingsHome.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope SettingsScaffold, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
                ComposerKt.sourceInformation(composer2, "C48@1880L26,50@1916L34,58@2274L20,60@2304L32,66@2484L30:Home.kt#v86m6v");
                if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                    HomeCommonKt.HomeCommon(commonSettings, null, null, composer2, CommonSettings.$stable, 6);
                    HomeCodeKt.HomeCode(navigate, codeSettings, composer2, 64);
                    composer2.startReplaceGroup(-313710872);
                    ComposerKt.sourceInformation(composer2, "53@2066L28");
                    if (SetsKt.setOf((Object[]) new BuildFlavor[]{BuildFlavor.NIGHTLY, BuildFlavor.BETA, BuildFlavor.FORENSIC}).contains(Model.INSTANCE.getBuildFlavor())) {
                        HomeIdKt.HomeId(navigate, idSettings, null, composer2, IdSettings.$stable << 3, 4);
                    }
                    composer2.endReplaceGroup();
                    HomeDocKt.HomeDoc(docSettings, null, composer2, DocSettings.$stable, 2);
                    HomeTextKt.HomeText(navigate, textSettings, null, composer2, TextSettings.$stable << 3, 4);
                    composer2.startReplaceGroup(-313698696);
                    ComposerKt.sourceInformation(composer2, "63@2452L12");
                    if (SetsKt.setOf((Object[]) new BuildFlavor[]{BuildFlavor.NIGHTLY, BuildFlavor.BETA, BuildFlavor.FORENSIC}).contains(Model.INSTANCE.getBuildFlavor())) {
                        HomeImagesKt.HomeImages(composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m1466height3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(20)), composer2, 6);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i << 3) & LDSFile.EF_DG16_TAG) | 384);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeKt.SettingsHome$lambda$0(onBack, navigate, commonSettings, codeSettings, idSettings, docSettings, textSettings, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-360150705);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Dark)76@2746L299:Home.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$HomeKt.INSTANCE.m7742getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeKt.Preview_Dark$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Light(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1754857925);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Light)92@3170L300:Home.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(false, ComposableSingletons$HomeKt.INSTANCE.m7744getLambda4$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeKt.Preview_Light$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
