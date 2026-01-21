package com.smartengines.app.p004ui.results;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.smartengines.app.p004ui.AppContentKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.DocSettings;
import com.smartengines.engine.doc.DocResultData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocResultScreenBodyHtml.kt */
@Metadata(m513d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\t"}, m514d2 = {"DocResultScreenBodyHtml", "", "resultData", "Lcom/smartengines/engine/doc/DocResultData;", "docSettings", "Lcom/smartengines/app/settings/DocSettings;", "(Lcom/smartengines/engine/doc/DocResultData;Lcom/smartengines/app/settings/DocSettings;Landroidx/compose/runtime/Composer;I)V", "DataResultScreen_Preview", "(Landroidx/compose/runtime/Composer;I)V", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DocResultScreenBodyHtmlKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataResultScreen_Preview$lambda$7(int i, Composer composer, int i2) {
        DataResultScreen_Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocResultScreenBodyHtml$lambda$6(DocResultData resultData, DocSettings docSettings, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(resultData, "$resultData");
        Intrinsics.checkNotNullParameter(docSettings, "$docSettings");
        DocResultScreenBodyHtml(resultData, docSettings, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void DocResultScreenBodyHtml(final DocResultData resultData, final DocSettings docSettings, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        Intrinsics.checkNotNullParameter(docSettings, "docSettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1588624060);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DocResultScreenBodyHtml)P(1)24@892L7,25@915L288,31@1209L579:DocResultScreenBodyHtml.kt#4ipo3i");
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        Context context = (Context) objConsume;
        composerStartRestartGroup.startReplaceGroup(2026006658);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):DocResultScreenBodyHtml.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = DocResultToHtmlKt.toHtml(resultData, context, docSettings.getShowImages(), docSettings.getShowTables(), docSettings.getShowAttrib());
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final String str = (String) objRememberedValue;
        composerStartRestartGroup.endReplaceGroup();
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -438173035, "C43@1695L86,32@1257L525:DocResultScreenBodyHtml.kt#4ipo3i");
        Function1 function1 = new Function1() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyHtmlKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocResultScreenBodyHtmlKt.DocResultScreenBodyHtml$lambda$5$lambda$2((Context) obj);
            }
        };
        composerStartRestartGroup.startReplaceGroup(124426295);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):DocResultScreenBodyHtml.kt#9igjgp");
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyHtmlKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocResultScreenBodyHtmlKt.DocResultScreenBodyHtml$lambda$5$lambda$4$lambda$3(str, (WebView) obj);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceGroup();
        AndroidView_androidKt.AndroidView(function1, null, (Function1) objRememberedValue2, composerStartRestartGroup, 390, 2);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyHtmlKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocResultScreenBodyHtmlKt.DocResultScreenBodyHtml$lambda$6(resultData, docSettings, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView DocResultScreenBodyHtml$lambda$5$lambda$2(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WebView webView = new WebView(it);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (!AppContentKt.isPreview()) {
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setBuiltInZoomControls(true);
        }
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocResultScreenBodyHtml$lambda$5$lambda$4$lambda$3(String html, WebView it) {
        Intrinsics.checkNotNullParameter(html, "$html");
        Intrinsics.checkNotNullParameter(it, "it");
        it.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
        return Unit.INSTANCE;
    }

    private static final void DataResultScreen_Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1646104404);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DataResultScreen_Preview)56@2037L139:DocResultScreenBodyHtml.kt#4ipo3i");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$DocResultScreenBodyHtmlKt.INSTANCE.m7602getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyHtmlKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocResultScreenBodyHtmlKt.DataResultScreen_Preview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
