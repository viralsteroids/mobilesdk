package com.smartengines.app.p004ui.results;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.mock.MockTextKt;
import com.smartengines.app.p004ui.AppContentKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.engine.text.TextResultData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextResultScreenBodyHtml.kt */
@Metadata(m513d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m514d2 = {"TAG", "", "TextResultScreenBodyHtml", "", "resultData", "Lcom/smartengines/engine/text/TextResultData;", "bitmap", "Landroid/graphics/Bitmap;", "(Lcom/smartengines/engine/text/TextResultData;Landroid/graphics/Bitmap;Landroidx/compose/runtime/Composer;I)V", "DataResultScreen_Preview", "(Landroidx/compose/runtime/Composer;I)V", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TextResultScreenBodyHtmlKt {
    private static final String TAG = "myapp.TextResultScr";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataResultScreen_Preview$lambda$8(int i, Composer composer, int i2) {
        DataResultScreen_Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextResultScreenBodyHtml$lambda$5(TextResultData resultData, Bitmap bitmap, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(resultData, "$resultData");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        TextResultScreenBodyHtml(resultData, bitmap, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TextResultScreenBodyHtml(final TextResultData resultData, final Bitmap bitmap, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Composer composerStartRestartGroup = composer.startRestartGroup(-21645181);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextResultScreenBodyHtml)P(1)24@832L7,25@855L67,40@1322L78,29@928L473:TextResultScreenBodyHtml.kt#4ipo3i");
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        Context context = (Context) objConsume;
        composerStartRestartGroup.startReplaceGroup(1173778290);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TextResultScreenBodyHtml.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = TextResultToHtmlKt.toHtml(resultData, context, bitmap);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final String str = (String) objRememberedValue;
        composerStartRestartGroup.endReplaceGroup();
        Function1 function1 = new Function1() { // from class: com.smartengines.app.ui.results.TextResultScreenBodyHtmlKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TextResultScreenBodyHtmlKt.TextResultScreenBodyHtml$lambda$2((Context) obj);
            }
        };
        composerStartRestartGroup.startReplaceGroup(1173793245);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TextResultScreenBodyHtml.kt#9igjgp");
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.smartengines.app.ui.results.TextResultScreenBodyHtmlKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TextResultScreenBodyHtmlKt.TextResultScreenBodyHtml$lambda$4$lambda$3(str, (WebView) obj);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceGroup();
        AndroidView_androidKt.AndroidView(function1, null, (Function1) objRememberedValue2, composerStartRestartGroup, 390, 2);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.TextResultScreenBodyHtmlKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextResultScreenBodyHtmlKt.TextResultScreenBodyHtml$lambda$5(resultData, bitmap, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView TextResultScreenBodyHtml$lambda$2(Context it) {
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
    public static final Unit TextResultScreenBodyHtml$lambda$4$lambda$3(String html, WebView it) {
        Intrinsics.checkNotNullParameter(html, "$html");
        Intrinsics.checkNotNullParameter(it, "it");
        it.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
        return Unit.INSTANCE;
    }

    private static final void DataResultScreen_Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1191681841);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DataResultScreen_Preview)51@1675L7,52@1700L36,53@1758L31,55@1831L162,55@1795L198:TextResultScreenBodyHtml.kt#4ipo3i");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            composerStartRestartGroup.startReplaceGroup(942176908);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TextResultScreenBodyHtml.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = MockTextKt.mockTextBitmap(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Bitmap bitmap = (Bitmap) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(942178759);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TextResultScreenBodyHtml.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = MockTextKt.getMockTextResultData();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final TextResultData textResultData = (TextResultData) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            ThemeKt.SmartEnginesTheme(true, ComposableLambdaKt.rememberComposableLambda(-1262725338, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.TextResultScreenBodyHtmlKt.DataResultScreen_Preview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C56@1851L136,56@1841L146:TextResultScreenBodyHtml.kt#4ipo3i");
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final TextResultData textResultData2 = textResultData;
                        final Bitmap bitmap2 = bitmap;
                        SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(426314091, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.TextResultScreenBodyHtmlKt.DataResultScreen_Preview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                ComposerKt.sourceInformation(composer3, "C57@1865L112:TextResultScreenBodyHtml.kt#4ipo3i");
                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                    TextResultScreenBodyHtmlKt.TextResultScreenBodyHtml(textResultData2, bitmap2, composer3, 72);
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                            }
                        }, composer2, 54), composer2, 12582912, 127);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.TextResultScreenBodyHtmlKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextResultScreenBodyHtmlKt.DataResultScreen_Preview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
