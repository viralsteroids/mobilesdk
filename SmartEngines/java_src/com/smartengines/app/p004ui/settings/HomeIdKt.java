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
import com.smartengines.app.p004ui.settings.HomeIdKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.BuildFlavor;
import com.smartengines.app.settings.IdSettings;
import com.smartengines.app.settings.IdSettingsStore;
import com.smartengines.app.settings.IdSettingsWriter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: HomeId.kt */
@Metadata(m513d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m514d2 = {"HomeId", "", "navigate", "Lkotlin/Function1;", "", "idSettings", "Lcom/smartengines/app/settings/IdSettings;", "idSettingsWriter", "Lcom/smartengines/app/settings/IdSettingsWriter;", "(Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;Landroidx/compose/runtime/Composer;II)V", "Preview_Dark", "(Landroidx/compose/runtime/Composer;I)V", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class HomeIdKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeId$lambda$0(Function1 navigate, IdSettings idSettings, IdSettingsWriter idSettingsWriter, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(navigate, "$navigate");
        Intrinsics.checkNotNullParameter(idSettings, "$idSettings");
        HomeId(navigate, idSettings, idSettingsWriter, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Dark$lambda$1(int i, Composer composer, int i2) {
        Preview_Dark(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HomeId(final Function1<? super String, Unit> navigate, final IdSettings idSettings, IdSettingsWriter idSettingsWriter, Composer composer, final int i, final int i2) {
        int i3;
        final IdSettingsStore idSettingsStore;
        Intrinsics.checkNotNullParameter(navigate, "navigate");
        Intrinsics.checkNotNullParameter(idSettings, "idSettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(548249045);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HomeId)P(2)22@830L7,23@894L341,23@842L393,33@1261L688,33@1241L708:HomeId.kt#v86m6v");
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
            i3 |= composerStartRestartGroup.changed(idSettings) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 128;
        }
        if (i4 != 4 || (i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    idSettingsStore = AppKt.getIdSettingsStore();
                }
                composerStartRestartGroup.endDefaults();
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final Context context = (Context) objConsume;
                FragmentsKt.Section(context.getString(C3069R.string.id_engine_name), ComposableLambdaKt.rememberComposableLambda(650123870, true, new C32631(context, idSettings, idSettingsStore, navigate), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
                FragmentsKt.Section("Forensic", ComposableLambdaKt.rememberComposableLambda(-999989547, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.HomeIdKt.HomeId.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Section, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(Section, "$this$Section");
                        ComposerKt.sourceInformation(composer2, "C34@1271L158,38@1438L161,42@1608L163,46@1780L163:HomeId.kt#v86m6v");
                        if ((i5 & 81) != 16 || !composer2.getSkipping()) {
                            String string = context.getString(C3069R.string.s_flash_by_default);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            FragmentsKt.BooleanRow(string, idSettings.getFlashByDefault(), new AnonymousClass1(idSettingsStore), composer2, 0);
                            String string2 = context.getString(C3069R.string.s_show_undef_checks);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            FragmentsKt.BooleanRow(string2, idSettings.getShowUndefChecks(), new AnonymousClass2(idSettingsStore), composer2, 0);
                            String string3 = context.getString(C3069R.string.s_show_checks_filter);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            FragmentsKt.StringRow(string3, idSettings.getShowChecksFilter(), new AnonymousClass3(idSettingsStore), composer2, 0);
                            String string4 = context.getString(C3069R.string.s_hide_checks_filter);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            FragmentsKt.StringRow(string4, idSettings.getHideChecksFilter(), new AnonymousClass4(idSettingsStore), composer2, 0);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* compiled from: HomeId.kt */
                    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                    /* renamed from: com.smartengines.app.ui.settings.HomeIdKt$HomeId$2$1, reason: invalid class name */
                    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                        AnonymousClass1(Object obj) {
                            super(1, obj, IdSettingsWriter.class, "writeFlashByDefault", "writeFlashByDefault(Z)V", 0);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            ((IdSettingsWriter) this.receiver).writeFlashByDefault(z);
                        }
                    }

                    /* compiled from: HomeId.kt */
                    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                    /* renamed from: com.smartengines.app.ui.settings.HomeIdKt$HomeId$2$2, reason: invalid class name */
                    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                        AnonymousClass2(Object obj) {
                            super(1, obj, IdSettingsWriter.class, "writeShowUndefChecks", "writeShowUndefChecks(Z)V", 0);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            ((IdSettingsWriter) this.receiver).writeShowUndefChecks(z);
                        }
                    }

                    /* compiled from: HomeId.kt */
                    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                    /* renamed from: com.smartengines.app.ui.settings.HomeIdKt$HomeId$2$3, reason: invalid class name */
                    /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<String, Unit> {
                        AnonymousClass3(Object obj) {
                            super(1, obj, IdSettingsWriter.class, "writeShowChecksFilter", "writeShowChecksFilter(Ljava/lang/String;)V", 0);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke2(str);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String p0) {
                            Intrinsics.checkNotNullParameter(p0, "p0");
                            ((IdSettingsWriter) this.receiver).writeShowChecksFilter(p0);
                        }
                    }

                    /* compiled from: HomeId.kt */
                    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                    /* renamed from: com.smartengines.app.ui.settings.HomeIdKt$HomeId$2$4, reason: invalid class name */
                    /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<String, Unit> {
                        AnonymousClass4(Object obj) {
                            super(1, obj, IdSettingsWriter.class, "writeHideChecksFilter", "writeHideChecksFilter(Ljava/lang/String;)V", 0);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke2(str);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String p0) {
                            Intrinsics.checkNotNullParameter(p0, "p0");
                            ((IdSettingsWriter) this.receiver).writeHideChecksFilter(p0);
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 54, 0);
            }
            idSettingsStore = idSettingsWriter;
            composerStartRestartGroup.endDefaults();
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context2 = (Context) objConsume2;
            FragmentsKt.Section(context2.getString(C3069R.string.id_engine_name), ComposableLambdaKt.rememberComposableLambda(650123870, true, new C32631(context2, idSettings, idSettingsStore, navigate), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
            FragmentsKt.Section("Forensic", ComposableLambdaKt.rememberComposableLambda(-999989547, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.HomeIdKt.HomeId.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Section, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(Section, "$this$Section");
                    ComposerKt.sourceInformation(composer2, "C34@1271L158,38@1438L161,42@1608L163,46@1780L163:HomeId.kt#v86m6v");
                    if ((i5 & 81) != 16 || !composer2.getSkipping()) {
                        String string = context2.getString(C3069R.string.s_flash_by_default);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        FragmentsKt.BooleanRow(string, idSettings.getFlashByDefault(), new AnonymousClass1(idSettingsStore), composer2, 0);
                        String string2 = context2.getString(C3069R.string.s_show_undef_checks);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        FragmentsKt.BooleanRow(string2, idSettings.getShowUndefChecks(), new AnonymousClass2(idSettingsStore), composer2, 0);
                        String string3 = context2.getString(C3069R.string.s_show_checks_filter);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        FragmentsKt.StringRow(string3, idSettings.getShowChecksFilter(), new AnonymousClass3(idSettingsStore), composer2, 0);
                        String string4 = context2.getString(C3069R.string.s_hide_checks_filter);
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        FragmentsKt.StringRow(string4, idSettings.getHideChecksFilter(), new AnonymousClass4(idSettingsStore), composer2, 0);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* compiled from: HomeId.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeIdKt$HomeId$2$1, reason: invalid class name */
                /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass1(Object obj) {
                        super(1, obj, IdSettingsWriter.class, "writeFlashByDefault", "writeFlashByDefault(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((IdSettingsWriter) this.receiver).writeFlashByDefault(z);
                    }
                }

                /* compiled from: HomeId.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeIdKt$HomeId$2$2, reason: invalid class name */
                /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass2(Object obj) {
                        super(1, obj, IdSettingsWriter.class, "writeShowUndefChecks", "writeShowUndefChecks(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((IdSettingsWriter) this.receiver).writeShowUndefChecks(z);
                    }
                }

                /* compiled from: HomeId.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeIdKt$HomeId$2$3, reason: invalid class name */
                /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<String, Unit> {
                    AnonymousClass3(Object obj) {
                        super(1, obj, IdSettingsWriter.class, "writeShowChecksFilter", "writeShowChecksFilter(Ljava/lang/String;)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        ((IdSettingsWriter) this.receiver).writeShowChecksFilter(p0);
                    }
                }

                /* compiled from: HomeId.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeIdKt$HomeId$2$4, reason: invalid class name */
                /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<String, Unit> {
                    AnonymousClass4(Object obj) {
                        super(1, obj, IdSettingsWriter.class, "writeHideChecksFilter", "writeHideChecksFilter(Ljava/lang/String;)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        ((IdSettingsWriter) this.receiver).writeHideChecksFilter(p0);
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 54, 0);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            idSettingsStore = idSettingsWriter;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeIdKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeIdKt.HomeId$lambda$0(navigate, idSettings, idSettingsStore, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: HomeId.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.settings.HomeIdKt$HomeId$1 */
    static final class C32631 implements Function3<ColumnScope, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IdSettings $idSettings;
        final /* synthetic */ IdSettingsWriter $idSettingsWriter;
        final /* synthetic */ Function1<String, Unit> $navigate;

        /* JADX WARN: Multi-variable type inference failed */
        C32631(Context context, IdSettings idSettings, IdSettingsWriter idSettingsWriter, Function1<? super String, Unit> function1) {
            this.$context = context;
            this.$idSettings = idSettings;
            this.$idSettingsWriter = idSettingsWriter;
            this.$navigate = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope Section, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Section, "$this$Section");
            ComposerKt.sourceInformation(composer, "C30@1206L23,30@1154L75:HomeId.kt#v86m6v");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            composer.startReplaceGroup(-1201150815);
            ComposerKt.sourceInformation(composer, "25@963L172");
            if (Model.INSTANCE.getBuildFlavor() != BuildFlavor.FORENSIC) {
                String string = this.$context.getString(C3069R.string.s_enable_forensics);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                FragmentsKt.BooleanRow(string, this.$idSettings.getEnableForensics(), new AnonymousClass1(this.$idSettingsWriter), composer, 0);
            }
            composer.endReplaceGroup();
            String string2 = this.$context.getString(C3069R.string.s_liveness);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            composer.startReplaceGroup(-1201141369);
            ComposerKt.sourceInformation(composer, "CC(remember):HomeId.kt#9igjgp");
            boolean zChanged = composer.changed(this.$navigate);
            final Function1<String, Unit> function1 = this.$navigate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.smartengines.app.ui.settings.HomeIdKt$HomeId$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeIdKt.C32631.invoke$lambda$1$lambda$0(function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            FragmentsKt.LinkRow(string2, (Function0) objRememberedValue, composer, 0);
        }

        /* compiled from: HomeId.kt */
        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
        /* renamed from: com.smartengines.app.ui.settings.HomeIdKt$HomeId$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
            AnonymousClass1(Object obj) {
                super(1, obj, IdSettingsWriter.class, "writeEnableForensics", "writeEnableForensics(Z)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                ((IdSettingsWriter) this.receiver).writeEnableForensics(z);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 navigate) {
            Intrinsics.checkNotNullParameter(navigate, "$navigate");
            navigate.invoke("liveness");
            return Unit.INSTANCE;
        }
    }

    private static final void Preview_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1812186164);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Dark)58@2175L220:HomeId.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$HomeIdKt.INSTANCE.m7738getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeIdKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeIdKt.Preview_Dark$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
