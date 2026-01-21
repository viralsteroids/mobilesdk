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
import com.smartengines.app.Model;
import com.smartengines.app.p004ui.AppContentKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.BuildFlavor;
import com.smartengines.app.settings.TextSettings;
import com.smartengines.app.settings.TextSettingsWriter;
import com.smartengines.dictionaries.KeyName;
import com.smartengines.dictionaries.TextDictionaries;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: Texts.kt */
@Metadata(m513d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\f"}, m514d2 = {"SettingsTexts", "", "onBack", "Lkotlin/Function0;", "textSettings", "Lcom/smartengines/app/settings/TextSettings;", "textSettingsWriter", "Lcom/smartengines/app/settings/TextSettingsWriter;", "(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/TextSettings;Lcom/smartengines/app/settings/TextSettingsWriter;Landroidx/compose/runtime/Composer;II)V", "Preview_Dark", "(Landroidx/compose/runtime/Composer;I)V", "Preview_Light", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TextsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Dark$lambda$2(int i, Composer composer, int i2) {
        Preview_Dark(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Light$lambda$3(int i, Composer composer, int i2) {
        Preview_Light(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsTexts$lambda$1(Function0 onBack, TextSettings textSettings, TextSettingsWriter textSettingsWriter, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(onBack, "$onBack");
        Intrinsics.checkNotNullParameter(textSettings, "$textSettings");
        SettingsTexts(onBack, textSettings, textSettingsWriter, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SettingsTexts(final Function0<Unit> onBack, final TextSettings textSettings, final TextSettingsWriter textSettingsWriter, Composer composer, final int i, final int i2) {
        int i3;
        Object objRememberedValue;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(textSettings, "textSettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(386134821);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SettingsTexts)27@1075L7,28@1104L132,33@1307L321,33@1242L386:Texts.kt#v86m6v");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBack) ? 4 : 2) | i;
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
                if (i4 != 0) {
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final Context context = (Context) objConsume;
                composerStartRestartGroup.startReplaceGroup(-10655216);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Texts.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final List list = (List) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                String string = context.getString(C3069R.string.target_text);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                FragmentsKt.SettingsScaffold(string, onBack, ComposableLambdaKt.rememberComposableLambda(-755041795, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.TextsKt.SettingsTexts.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope SettingsScaffold, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
                        ComposerKt.sourceInformation(composer2, "C34@1324L298,34@1317L305:Texts.kt#v86m6v");
                        if ((i5 & 81) != 16 || !composer2.getSkipping()) {
                            final Context context2 = context;
                            final TextSettings textSettings2 = textSettings;
                            final TextSettingsWriter textSettingsWriter2 = textSettingsWriter;
                            final List<KeyName> list2 = list;
                            FragmentsKt.Section(null, ComposableLambdaKt.rememberComposableLambda(1616123270, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.TextsKt.SettingsTexts.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                                    invoke(columnScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(ColumnScope Section, Composer composer3, int i6) {
                                    Intrinsics.checkNotNullParameter(Section, "$this$Section");
                                    ComposerKt.sourceInformation(composer3, "C35@1338L274:Texts.kt#v86m6v");
                                    if ((i6 & 81) != 16 || !composer3.getSkipping()) {
                                        String string2 = context2.getString(C3069R.string.s_text_languages);
                                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                        ListSelectorsKt.MultiFromList(string2, textSettings2.getLanguages(), new C40141(textSettingsWriter2), list2, false, true, composer3, 225344, 0);
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }

                                /* compiled from: Texts.kt */
                                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                                /* renamed from: com.smartengines.app.ui.settings.TextsKt$SettingsTexts$1$1$1, reason: invalid class name and collision with other inner class name */
                                /* synthetic */ class C40141 extends FunctionReferenceImpl implements Function1<Set<? extends String>, Unit> {
                                    C40141(Object obj) {
                                        super(1, obj, TextSettingsWriter.class, "writeLanguages", "writeLanguages(Ljava/util/Set;)V", 0);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Set<? extends String> set) {
                                        invoke2((Set<String>) set);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Set<String> p0) {
                                        Intrinsics.checkNotNullParameter(p0, "p0");
                                        ((TextSettingsWriter) this.receiver).writeLanguages(p0);
                                    }
                                }
                            }, composer2, 54), composer2, 48, 1);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 3) & LDSFile.EF_DG16_TAG) | 384);
            } else {
                if (i4 != 0) {
                    textSettingsWriter = AppKt.getTextSettingsStore();
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localContext2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final Context context2 = (Context) objConsume2;
                composerStartRestartGroup.startReplaceGroup(-10655216);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Texts.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = TextDictionaries.INSTANCE.loadTextLanguages(context2, Model.INSTANCE.getBuildFlavor() == BuildFlavor.STORE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final List<KeyName> list2 = (List) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                String string2 = context2.getString(C3069R.string.target_text);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                FragmentsKt.SettingsScaffold(string2, onBack, ComposableLambdaKt.rememberComposableLambda(-755041795, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.TextsKt.SettingsTexts.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope SettingsScaffold, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
                        ComposerKt.sourceInformation(composer2, "C34@1324L298,34@1317L305:Texts.kt#v86m6v");
                        if ((i5 & 81) != 16 || !composer2.getSkipping()) {
                            final Context context22 = context2;
                            final TextSettings textSettings2 = textSettings;
                            final TextSettingsWriter textSettingsWriter2 = textSettingsWriter;
                            final List<KeyName> list22 = list2;
                            FragmentsKt.Section(null, ComposableLambdaKt.rememberComposableLambda(1616123270, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.TextsKt.SettingsTexts.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                                    invoke(columnScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(ColumnScope Section, Composer composer3, int i6) {
                                    Intrinsics.checkNotNullParameter(Section, "$this$Section");
                                    ComposerKt.sourceInformation(composer3, "C35@1338L274:Texts.kt#v86m6v");
                                    if ((i6 & 81) != 16 || !composer3.getSkipping()) {
                                        String string22 = context22.getString(C3069R.string.s_text_languages);
                                        Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
                                        ListSelectorsKt.MultiFromList(string22, textSettings2.getLanguages(), new C40141(textSettingsWriter2), list22, false, true, composer3, 225344, 0);
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }

                                /* compiled from: Texts.kt */
                                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                                /* renamed from: com.smartengines.app.ui.settings.TextsKt$SettingsTexts$1$1$1, reason: invalid class name and collision with other inner class name */
                                /* synthetic */ class C40141 extends FunctionReferenceImpl implements Function1<Set<? extends String>, Unit> {
                                    C40141(Object obj) {
                                        super(1, obj, TextSettingsWriter.class, "writeLanguages", "writeLanguages(Ljava/util/Set;)V", 0);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Set<? extends String> set) {
                                        invoke2((Set<String>) set);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Set<String> p0) {
                                        Intrinsics.checkNotNullParameter(p0, "p0");
                                        ((TextSettingsWriter) this.receiver).writeLanguages(p0);
                                    }
                                }
                            }, composer2, 54), composer2, 48, 1);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 3) & LDSFile.EF_DG16_TAG) | 384);
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final TextSettingsWriter textSettingsWriter2 = textSettingsWriter;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.TextsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextsKt.SettingsTexts$lambda$1(onBack, textSettings, textSettingsWriter2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1204785626);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Dark)53@1865L230:Texts.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$TextsKt.INSTANCE.m7775getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.TextsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextsKt.Preview_Dark$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Light(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1949423580);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Light)66@2220L231:Texts.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(false, ComposableSingletons$TextsKt.INSTANCE.m7777getLambda4$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.TextsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextsKt.Preview_Light$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
