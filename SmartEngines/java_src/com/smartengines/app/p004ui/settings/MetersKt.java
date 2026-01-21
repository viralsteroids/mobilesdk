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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: Meters.kt */
@Metadata(m513d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\f"}, m514d2 = {"SettingsMeters", "", "onBack", "Lkotlin/Function0;", "codeSettings", "Lcom/smartengines/app/settings/CodeSettings;", "codeSettingsWriter", "Lcom/smartengines/app/settings/CodeSettingsWriter;", "(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/CodeSettingsWriter;Landroidx/compose/runtime/Composer;II)V", "Preview_Dark", "(Landroidx/compose/runtime/Composer;I)V", "Preview_Light", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class MetersKt {
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
    public static final Unit SettingsMeters$lambda$0(Function0 onBack, CodeSettings codeSettings, CodeSettingsWriter codeSettingsWriter, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(onBack, "$onBack");
        Intrinsics.checkNotNullParameter(codeSettings, "$codeSettings");
        SettingsMeters(onBack, codeSettings, codeSettingsWriter, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SettingsMeters(final Function0<Unit> onBack, final CodeSettings codeSettings, CodeSettingsWriter codeSettingsWriter, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(codeSettings, "codeSettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(1972265267);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SettingsMeters)P(2)23@898L7,24@973L225,24@910L288:Meters.kt#v86m6v");
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
        String string = context.getString(C3069R.string.s_meters);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        FragmentsKt.SettingsScaffold(string, onBack, ComposableLambdaKt.rememberComposableLambda(518197771, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.MetersKt.SettingsMeters.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope SettingsScaffold, Composer composer2, int i4) {
                Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
                ComposerKt.sourceInformation(composer2, "C25@991L201,25@983L209:Meters.kt#v86m6v");
                if ((i4 & 81) != 16 || !composer2.getSkipping()) {
                    final Context context2 = context;
                    final CodeSettings codeSettings2 = codeSettings;
                    final CodeSettingsWriter codeSettingsWriter3 = codeSettingsWriter2;
                    FragmentsKt.Section(null, ComposableLambdaKt.rememberComposableLambda(-1419808940, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.MetersKt.SettingsMeters.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                            invoke(columnScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope Section, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(Section, "$this$Section");
                            ComposerKt.sourceInformation(composer3, "C26@1005L177:Meters.kt#v86m6v");
                            if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                                String string2 = context2.getString(C3069R.string.s_max_objects);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                FragmentsKt.IntRow(string2, codeSettings2.getMeterMax(), 1, 10, 1, new C40111(codeSettingsWriter3), false, composer3, 28032, 64);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }

                        /* compiled from: Meters.kt */
                        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                        /* renamed from: com.smartengines.app.ui.settings.MetersKt$SettingsMeters$1$1$1, reason: invalid class name and collision with other inner class name */
                        /* synthetic */ class C40111 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                            C40111(Object obj) {
                                super(1, obj, CodeSettingsWriter.class, "writeMeterMax", "writeMeterMax(I)V", 0);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i) {
                                ((CodeSettingsWriter) this.receiver).writeMeterMax(i);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.MetersKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MetersKt.SettingsMeters$lambda$0(onBack, codeSettings, codeSettingsWriter2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1222483324);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Dark)42@1435L231:Meters.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$MetersKt.INSTANCE.m7760getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.MetersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MetersKt.Preview_Dark$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Light(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-218720902);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Light)55@1791L232:Meters.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(false, ComposableSingletons$MetersKt.INSTANCE.m7762getLambda4$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.MetersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MetersKt.Preview_Light$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
