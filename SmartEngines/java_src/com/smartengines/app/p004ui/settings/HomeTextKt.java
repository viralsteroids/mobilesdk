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
import com.smartengines.app.AppKt;
import com.smartengines.app.C3069R;
import com.smartengines.app.p004ui.AppContentKt;
import com.smartengines.app.p004ui.settings.HomeTextKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.TextSettings;
import com.smartengines.app.settings.TextSettingsWriter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: HomeText.kt */
@Metadata(m513d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\r"}, m514d2 = {"HomeText", "", "navigate", "Lkotlin/Function1;", "", "textSettings", "Lcom/smartengines/app/settings/TextSettings;", "textSettingsWriter", "Lcom/smartengines/app/settings/TextSettingsWriter;", "(Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/TextSettings;Lcom/smartengines/app/settings/TextSettingsWriter;Landroidx/compose/runtime/Composer;II)V", "Preview_Dark", "(Landroidx/compose/runtime/Composer;I)V", "Preview_Light", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class HomeTextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeText$lambda$0(Function1 navigate, TextSettings textSettings, TextSettingsWriter textSettingsWriter, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(navigate, "$navigate");
        Intrinsics.checkNotNullParameter(textSettings, "$textSettings");
        HomeText(navigate, textSettings, textSettingsWriter, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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

    public static final void HomeText(final Function1<? super String, Unit> navigate, final TextSettings textSettings, TextSettingsWriter textSettingsWriter, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(navigate, "navigate");
        Intrinsics.checkNotNullParameter(textSettings, "textSettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(-504143503);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HomeText)22@856L7,23@918L264,23@868L314:HomeText.kt#v86m6v");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(navigate) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & LDSFile.EF_DG16_TAG) == 0) {
            i3 |= composerStartRestartGroup.changed(textSettings) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 128;
        }
        if (i4 != 4 || (i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else if (i4 != 0) {
                textSettingsWriter = AppKt.getTextSettingsStore();
            }
            composerStartRestartGroup.endDefaults();
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            FragmentsKt.Section(context.getString(C3069R.string.s_text_title), ComposableLambdaKt.rememberComposableLambda(879314170, true, new C32671(context, navigate, textSettings, textSettingsWriter), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final TextSettingsWriter textSettingsWriter2 = textSettingsWriter;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeTextKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeTextKt.HomeText$lambda$0(navigate, textSettings, textSettingsWriter2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: HomeText.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.settings.HomeTextKt$HomeText$1 */
    static final class C32671 implements Function3<ColumnScope, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Function1<String, Unit> $navigate;
        final /* synthetic */ TextSettings $textSettings;
        final /* synthetic */ TextSettingsWriter $textSettingsWriter;

        /* JADX WARN: Multi-variable type inference failed */
        C32671(Context context, Function1<? super String, Unit> function1, TextSettings textSettings, TextSettingsWriter textSettingsWriter) {
            this.$context = context;
            this.$navigate = function1;
            this.$textSettings = textSettings;
            this.$textSettingsWriter = textSettingsWriter;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 navigate) {
            Intrinsics.checkNotNullParameter(navigate, "$navigate");
            navigate.invoke("texts");
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope Section, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Section, "$this$Section");
            ComposerKt.sourceInformation(composer, "C24@984L20,24@928L76,25@1013L163:HomeText.kt#v86m6v");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            String string = this.$context.getString(C3069R.string.s_text_languages);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            composer.startReplaceGroup(1213808854);
            ComposerKt.sourceInformation(composer, "CC(remember):HomeText.kt#9igjgp");
            boolean zChanged = composer.changed(this.$navigate);
            final Function1<String, Unit> function1 = this.$navigate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.smartengines.app.ui.settings.HomeTextKt$HomeText$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeTextKt.C32671.invoke$lambda$1$lambda$0(function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            FragmentsKt.LinkRow(string, (Function0) objRememberedValue, composer, 0);
            String string2 = this.$context.getString(C3069R.string.s_text_page_detection);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            FragmentsKt.BooleanRow(string2, this.$textSettings.getPageDetection(), new AnonymousClass2(this.$textSettingsWriter), composer, 0);
        }

        /* compiled from: HomeText.kt */
        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
        /* renamed from: com.smartengines.app.ui.settings.HomeTextKt$HomeText$1$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
            AnonymousClass2(Object obj) {
                super(1, obj, TextSettingsWriter.class, "writePageDetection", "writePageDetection(Z)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                ((TextSettingsWriter) this.receiver).writePageDetection(z);
            }
        }
    }

    private static final void Preview_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-976038686);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Dark)37@1408L161:HomeText.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$HomeTextKt.INSTANCE.m7747getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeTextKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeTextKt.Preview_Dark$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Light(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1566974552);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Light)47@1694L162:HomeText.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(false, ComposableSingletons$HomeTextKt.INSTANCE.m7749getLambda4$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeTextKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeTextKt.Preview_Light$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
