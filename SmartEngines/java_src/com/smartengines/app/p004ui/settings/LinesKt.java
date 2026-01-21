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
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.CodeSettings;
import com.smartengines.app.settings.CodeSettingsWriter;
import com.smartengines.dictionaries.CodeDictionaries;
import com.smartengines.dictionaries.KeyName;
import com.smartengines.dictionaries.KeyNameKt;
import com.smartengines.utils.UtilsKt;
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

/* compiled from: Lines.kt */
@Metadata(m513d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m514d2 = {"SettingsTextLines", "", "onBack", "Lkotlin/Function0;", "codeSettings", "Lcom/smartengines/app/settings/CodeSettings;", "codeSettingsWriter", "Lcom/smartengines/app/settings/CodeSettingsWriter;", "(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/CodeSettingsWriter;Landroidx/compose/runtime/Composer;II)V", "Preview_Dark", "(Landroidx/compose/runtime/Composer;I)V", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class LinesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Dark$lambda$2(int i, Composer composer, int i2) {
        Preview_Dark(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsTextLines$lambda$1(Function0 onBack, CodeSettings codeSettings, CodeSettingsWriter codeSettingsWriter, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(onBack, "$onBack");
        Intrinsics.checkNotNullParameter(codeSettings, "$codeSettings");
        SettingsTextLines(onBack, codeSettings, codeSettingsWriter, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SettingsTextLines(final Function0<Unit> onBack, final CodeSettings codeSettings, CodeSettingsWriter codeSettingsWriter, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(codeSettings, "codeSettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(1212325080);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SettingsTextLines)P(2)26@1037L7,27@1066L99,30@1232L505,30@1170L567:Lines.kt#v86m6v");
        if ((i2 & 4) != 0) {
            codeSettingsWriter = AppKt.getCodeSettingsStore();
            i3 = i & (-897);
        } else {
            i3 = i;
        }
        final CodeSettingsWriter codeSettingsWriter2 = codeSettingsWriter;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        final Context context = (Context) objConsume;
        composerStartRestartGroup.startReplaceGroup(-371047397);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Lines.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = KeyNameKt.filterByLanguage(CodeDictionaries.INSTANCE.getLineNumberTypes(), UtilsKt.getCurrentLanguage(context));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final List list = (List) objRememberedValue;
        composerStartRestartGroup.endReplaceGroup();
        String string = context.getString(C3069R.string.s_lines);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        FragmentsKt.SettingsScaffold(string, onBack, ComposableLambdaKt.rememberComposableLambda(-282167376, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.LinesKt.SettingsTextLines.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope SettingsScaffold, Composer composer2, int i4) {
                Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
                ComposerKt.sourceInformation(composer2, "C31@1250L481,31@1242L489:Lines.kt#v86m6v");
                if ((i4 & 81) != 16 || !composer2.getSkipping()) {
                    final Context context2 = context;
                    final CodeSettings codeSettings2 = codeSettings;
                    final CodeSettingsWriter codeSettingsWriter3 = codeSettingsWriter2;
                    final List<KeyName> list2 = list;
                    FragmentsKt.Section(null, ComposableLambdaKt.rememberComposableLambda(1309189817, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.LinesKt.SettingsTextLines.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                            invoke(columnScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope Section, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(Section, "$this$Section");
                            ComposerKt.sourceInformation(composer3, "C32@1264L175,37@1452L269:Lines.kt#v86m6v");
                            if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                                String string2 = context2.getString(C3069R.string.s_max_objects);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                FragmentsKt.IntRow(string2, codeSettings2.getLineMax(), 1, 10, 1, new C40091(codeSettingsWriter3), false, composer3, 28032, 64);
                                String string3 = context2.getString(C3069R.string.s_line_types);
                                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                                ListSelectorsKt.MultiFromList(string3, codeSettings2.getLineTypes(), new AnonymousClass2(codeSettingsWriter3), list2, true, true, composer3, 225344, 0);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }

                        /* compiled from: Lines.kt */
                        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                        /* renamed from: com.smartengines.app.ui.settings.LinesKt$SettingsTextLines$1$1$1, reason: invalid class name and collision with other inner class name */
                        /* synthetic */ class C40091 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                            C40091(Object obj) {
                                super(1, obj, CodeSettingsWriter.class, "writeLineMax", "writeLineMax(I)V", 0);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i) {
                                ((CodeSettingsWriter) this.receiver).writeLineMax(i);
                            }
                        }

                        /* compiled from: Lines.kt */
                        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                        /* renamed from: com.smartengines.app.ui.settings.LinesKt$SettingsTextLines$1$1$2, reason: invalid class name */
                        /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Set<? extends String>, Unit> {
                            AnonymousClass2(Object obj) {
                                super(1, obj, CodeSettingsWriter.class, "writeLineTypes", "writeLineTypes(Ljava/util/Set;)V", 0);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Set<? extends String> set) {
                                invoke2((Set<String>) set);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Set<String> p0) {
                                Intrinsics.checkNotNullParameter(p0, "p0");
                                ((CodeSettingsWriter) this.receiver).writeLineTypes(p0);
                            }
                        }
                    }, composer2, 54), composer2, 48, 1);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 3) & LDSFile.EF_DG16_TAG) | 384);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.LinesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinesKt.SettingsTextLines$lambda$1(onBack, codeSettings, codeSettingsWriter2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-897892063);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Dark)54@1973L216:Lines.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$LinesKt.INSTANCE.m7751getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.LinesKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinesKt.Preview_Dark$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
