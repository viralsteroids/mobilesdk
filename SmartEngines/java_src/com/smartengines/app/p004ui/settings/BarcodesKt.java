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
import com.smartengines.app.AppKt;
import com.smartengines.app.C3069R;
import com.smartengines.app.p004ui.AppContentKt;
import com.smartengines.app.p004ui.settings.BarcodesKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.CodeSettings;
import com.smartengines.app.settings.CodeSettingsWriter;
import com.smartengines.dictionaries.CodeDictionaries;
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

/* compiled from: Barcodes.kt */
@Metadata(m513d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aA\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a-\u0010\f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0013"}, m514d2 = {"SettingsBarcodes", "", "onBack", "Lkotlin/Function0;", "navigate", "Lkotlin/Function1;", "", "codeSettings", "Lcom/smartengines/app/settings/CodeSettings;", "codeWriter", "Lcom/smartengines/app/settings/CodeSettingsWriter;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/CodeSettingsWriter;Landroidx/compose/runtime/Composer;II)V", "SettingsBarcodeTypes", "(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/CodeSettingsWriter;Landroidx/compose/runtime/Composer;II)V", "Preview_Dark", "(Landroidx/compose/runtime/Composer;I)V", "Preview_DarkTypes", "Preview_Light", "Preview_LightTypes", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class BarcodesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Dark$lambda$2(int i, Composer composer, int i2) {
        Preview_Dark(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_DarkTypes$lambda$3(int i, Composer composer, int i2) {
        Preview_DarkTypes(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Light$lambda$4(int i, Composer composer, int i2) {
        Preview_Light(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_LightTypes$lambda$5(int i, Composer composer, int i2) {
        Preview_LightTypes(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsBarcodeTypes$lambda$1(Function0 onBack, CodeSettings codeSettings, CodeSettingsWriter codeSettingsWriter, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(onBack, "$onBack");
        Intrinsics.checkNotNullParameter(codeSettings, "$codeSettings");
        SettingsBarcodeTypes(onBack, codeSettings, codeSettingsWriter, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsBarcodes$lambda$0(Function0 onBack, Function1 navigate, CodeSettings codeSettings, CodeSettingsWriter codeSettingsWriter, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(onBack, "$onBack");
        Intrinsics.checkNotNullParameter(navigate, "$navigate");
        Intrinsics.checkNotNullParameter(codeSettings, "$codeSettings");
        SettingsBarcodes(onBack, navigate, codeSettings, codeSettingsWriter, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SettingsBarcodes(final Function0<Unit> onBack, final Function1<? super String, Unit> navigate, final CodeSettings codeSettings, CodeSettingsWriter codeSettingsWriter, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(navigate, "navigate");
        Intrinsics.checkNotNullParameter(codeSettings, "codeSettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(1330863476);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SettingsBarcodes)P(3,2)28@1110L7,29@1186L1343,29@1122L1407:Barcodes.kt#v86m6v");
        if ((i2 & 8) != 0) {
            codeSettingsWriter = AppKt.getCodeSettingsStore();
            i3 = i & (-7169);
        } else {
            i3 = i;
        }
        final CodeSettingsWriter codeSettingsWriter2 = codeSettingsWriter;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        final Context context = (Context) objConsume;
        String string = context.getString(C3069R.string.s_barcodes);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        FragmentsKt.SettingsScaffold(string, onBack, ComposableLambdaKt.rememberComposableLambda(-1076513716, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.BarcodesKt.SettingsBarcodes.1

            /* compiled from: Barcodes.kt */
            @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
            /* renamed from: com.smartengines.app.ui.settings.BarcodesKt$SettingsBarcodes$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function3<ColumnScope, Composer, Integer, Unit> {
                final /* synthetic */ CodeSettings $codeSettings;
                final /* synthetic */ CodeSettingsWriter $codeWriter;
                final /* synthetic */ Context $context;
                final /* synthetic */ Function1<String, Unit> $navigate;

                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(Context context, Function1<? super String, Unit> function1, CodeSettings codeSettings, CodeSettingsWriter codeSettingsWriter) {
                    this.$context = context;
                    this.$navigate = function1;
                    this.$codeSettings = codeSettings;
                    this.$codeWriter = codeSettingsWriter;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                    invoke(columnScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(Function1 navigate) {
                    Intrinsics.checkNotNullParameter(navigate, "$navigate");
                    navigate.invoke("barcode-types");
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Section, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(Section, "$this$Section");
                    ComposerKt.sourceInformation(composer, "C31@1270L27,31@1217L80,32@1310L177,37@1500L206,42@1719L218,47@1950L162,51@2125L159,55@2297L29,56@2339L174:Barcodes.kt#v86m6v");
                    if ((i & 81) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    String string = this.$context.getString(C3069R.string.s_barcode_types);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    composer.startReplaceGroup(680551078);
                    ComposerKt.sourceInformation(composer, "CC(remember):Barcodes.kt#9igjgp");
                    boolean zChanged = composer.changed(this.$navigate);
                    final Function1<String, Unit> function1 = this.$navigate;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.smartengines.app.ui.settings.BarcodesKt$SettingsBarcodes$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BarcodesKt.C32021.AnonymousClass1.invoke$lambda$1$lambda$0(function1);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    FragmentsKt.LinkRow(string, (Function0) objRememberedValue, composer, 0);
                    String string2 = this.$context.getString(C3069R.string.s_max_barcodes);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    FragmentsKt.IntRow(string2, this.$codeSettings.getBarcodeMax(), 0, 50, 1, new AnonymousClass2(this.$codeWriter), false, composer, 28032, 64);
                    String string3 = this.$context.getString(C3069R.string.s_barcode_roi);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    ListSelectorsKt.SingleFromList(string3, this.$codeSettings.getBarcodeRoi(), new AnonymousClass3(this.$codeWriter), CodeDictionaries.INSTANCE.getBarcodeRoiList(), composer, 4096);
                    String string4 = this.$context.getString(C3069R.string.s_barcode_effort);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    ListSelectorsKt.SingleFromList(string4, this.$codeSettings.getBarcodeEffort(), new AnonymousClass4(this.$codeWriter), CodeDictionaries.INSTANCE.getBarcodeEffortList(), composer, 4096);
                    String string5 = this.$context.getString(C3069R.string.s_barcode_decode);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    FragmentsKt.BooleanRow(string5, this.$codeSettings.getBarcodeDecode(), new AnonymousClass5(this.$codeWriter), composer, 0);
                    String string6 = this.$context.getString(C3069R.string.s_barcode_smart);
                    Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                    FragmentsKt.BooleanRow(string6, this.$codeSettings.getBarcodeSmart(), new AnonymousClass6(this.$codeWriter), composer, 0);
                    SpacerKt.Spacer(SizeKt.m1466height3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(5)), composer, 6);
                    String string7 = this.$context.getString(C3069R.string.s_barcode_nonpayment);
                    Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                    FragmentsKt.BooleanRow(string7, this.$codeSettings.getBarcodeNonpayment(), new AnonymousClass7(this.$codeWriter), composer, 0);
                }

                /* compiled from: Barcodes.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.BarcodesKt$SettingsBarcodes$1$1$2, reason: invalid class name */
                /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                    AnonymousClass2(Object obj) {
                        super(1, obj, CodeSettingsWriter.class, "writeBarcodeMax", "writeBarcodeMax(I)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        invoke(num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i) {
                        ((CodeSettingsWriter) this.receiver).writeBarcodeMax(i);
                    }
                }

                /* compiled from: Barcodes.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.BarcodesKt$SettingsBarcodes$1$1$3, reason: invalid class name */
                /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<String, Unit> {
                    AnonymousClass3(Object obj) {
                        super(1, obj, CodeSettingsWriter.class, "writeBarcodeRoi", "writeBarcodeRoi(Ljava/lang/String;)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        ((CodeSettingsWriter) this.receiver).writeBarcodeRoi(p0);
                    }
                }

                /* compiled from: Barcodes.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.BarcodesKt$SettingsBarcodes$1$1$4, reason: invalid class name */
                /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<String, Unit> {
                    AnonymousClass4(Object obj) {
                        super(1, obj, CodeSettingsWriter.class, "writeBarcodeEffort", "writeBarcodeEffort(Ljava/lang/String;)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        ((CodeSettingsWriter) this.receiver).writeBarcodeEffort(p0);
                    }
                }

                /* compiled from: Barcodes.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.BarcodesKt$SettingsBarcodes$1$1$5, reason: invalid class name */
                /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass5(Object obj) {
                        super(1, obj, CodeSettingsWriter.class, "writeBarcodeDecode", "writeBarcodeDecode(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((CodeSettingsWriter) this.receiver).writeBarcodeDecode(z);
                    }
                }

                /* compiled from: Barcodes.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.BarcodesKt$SettingsBarcodes$1$1$6, reason: invalid class name */
                /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass6(Object obj) {
                        super(1, obj, CodeSettingsWriter.class, "writeBarcodeSmart", "writeBarcodeSmart(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((CodeSettingsWriter) this.receiver).writeBarcodeSmart(z);
                    }
                }

                /* compiled from: Barcodes.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.BarcodesKt$SettingsBarcodes$1$1$7, reason: invalid class name */
                /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass7(Object obj) {
                        super(1, obj, CodeSettingsWriter.class, "writeBarcodeNonpayment", "writeBarcodeNonpayment(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((CodeSettingsWriter) this.receiver).writeBarcodeNonpayment(z);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope SettingsScaffold, Composer composer2, int i4) {
                Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
                ComposerKt.sourceInformation(composer2, "C30@1203L1320,30@1196L1327:Barcodes.kt#v86m6v");
                if ((i4 & 81) != 16 || !composer2.getSkipping()) {
                    FragmentsKt.Section(null, ComposableLambdaKt.rememberComposableLambda(410820053, true, new AnonymousClass1(context, navigate, codeSettings, codeSettingsWriter2), composer2, 54), composer2, 48, 1);
                } else {
                    composer2.skipToGroupEnd();
                }
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 3) & LDSFile.EF_DG16_TAG) | 384);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.BarcodesKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BarcodesKt.SettingsBarcodes$lambda$0(onBack, navigate, codeSettings, codeSettingsWriter2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SettingsBarcodeTypes(final Function0<Unit> onBack, final CodeSettings codeSettings, CodeSettingsWriter codeSettingsWriter, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(codeSettings, "codeSettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(2142104955);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SettingsBarcodeTypes)P(2)70@2717L7,71@2798L845,71@2729L914:Barcodes.kt#v86m6v");
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
        String string = context.getString(C3069R.string.s_barcode_types);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        FragmentsKt.SettingsScaffold(string, onBack, ComposableLambdaKt.rememberComposableLambda(-1156561325, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.BarcodesKt.SettingsBarcodeTypes.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope SettingsScaffold, Composer composer2, int i4) {
                Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
                ComposerKt.sourceInformation(composer2, "C72@2815L260,72@2808L267,79@3091L260,79@3084L267,86@3367L270,86@3360L277:Barcodes.kt#v86m6v");
                if ((i4 & 81) != 16 || !composer2.getSkipping()) {
                    final Context context2 = context;
                    final CodeSettings codeSettings2 = codeSettings;
                    final CodeSettingsWriter codeSettingsWriter3 = codeSettingsWriter2;
                    FragmentsKt.Section(null, ComposableLambdaKt.rememberComposableLambda(795036316, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.BarcodesKt.SettingsBarcodeTypes.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                            invoke(columnScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope Section, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(Section, "$this$Section");
                            ComposerKt.sourceInformation(composer3, "C73@2829L236:Barcodes.kt#v86m6v");
                            if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                                String string2 = context2.getString(C3069R.string.s_barcode_types_1d);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                ListSelectorsKt.MultiFromList(string2, codeSettings2.getBarcodeTypes(), new C40061(codeSettingsWriter3), CodeDictionaries.INSTANCE.getBarcodeTypes1D(), true, false, composer3, 28736, 32);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }

                        /* compiled from: Barcodes.kt */
                        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                        /* renamed from: com.smartengines.app.ui.settings.BarcodesKt$SettingsBarcodeTypes$1$1$1, reason: invalid class name and collision with other inner class name */
                        /* synthetic */ class C40061 extends FunctionReferenceImpl implements Function1<Set<? extends String>, Unit> {
                            C40061(Object obj) {
                                super(1, obj, CodeSettingsWriter.class, "writeBarcodeTypes", "writeBarcodeTypes(Ljava/util/Set;)V", 0);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Set<? extends String> set) {
                                invoke2((Set<String>) set);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Set<String> p0) {
                                Intrinsics.checkNotNullParameter(p0, "p0");
                                ((CodeSettingsWriter) this.receiver).writeBarcodeTypes(p0);
                            }
                        }
                    }, composer2, 54), composer2, 48, 1);
                    final Context context3 = context;
                    final CodeSettings codeSettings3 = codeSettings;
                    final CodeSettingsWriter codeSettingsWriter4 = codeSettingsWriter2;
                    FragmentsKt.Section(null, ComposableLambdaKt.rememberComposableLambda(-1506687149, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.BarcodesKt.SettingsBarcodeTypes.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                            invoke(columnScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope Section, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(Section, "$this$Section");
                            ComposerKt.sourceInformation(composer3, "C80@3105L236:Barcodes.kt#v86m6v");
                            if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                                String string2 = context3.getString(C3069R.string.s_barcode_types_2d);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                ListSelectorsKt.MultiFromList(string2, codeSettings3.getBarcodeTypes(), new AnonymousClass1(codeSettingsWriter4), CodeDictionaries.INSTANCE.getBarcodeTypes2D(), true, false, composer3, 28736, 32);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }

                        /* compiled from: Barcodes.kt */
                        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                        /* renamed from: com.smartengines.app.ui.settings.BarcodesKt$SettingsBarcodeTypes$1$2$1, reason: invalid class name */
                        /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Set<? extends String>, Unit> {
                            AnonymousClass1(Object obj) {
                                super(1, obj, CodeSettingsWriter.class, "writeBarcodeTypes", "writeBarcodeTypes(Ljava/util/Set;)V", 0);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Set<? extends String> set) {
                                invoke2((Set<String>) set);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Set<String> p0) {
                                Intrinsics.checkNotNullParameter(p0, "p0");
                                ((CodeSettingsWriter) this.receiver).writeBarcodeTypes(p0);
                            }
                        }
                    }, composer2, 54), composer2, 48, 1);
                    final Context context4 = context;
                    final CodeSettings codeSettings4 = codeSettings;
                    final CodeSettingsWriter codeSettingsWriter5 = codeSettingsWriter2;
                    FragmentsKt.Section(null, ComposableLambdaKt.rememberComposableLambda(702437332, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.BarcodesKt.SettingsBarcodeTypes.1.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                            invoke(columnScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope Section, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(Section, "$this$Section");
                            ComposerKt.sourceInformation(composer3, "C87@3381L246:Barcodes.kt#v86m6v");
                            if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                                String string2 = context4.getString(C3069R.string.s_barcode_types_stacked);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                ListSelectorsKt.MultiFromList(string2, codeSettings4.getBarcodeTypes(), new AnonymousClass1(codeSettingsWriter5), CodeDictionaries.INSTANCE.getBarcodeTypesStacked(), true, false, composer3, 28736, 32);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }

                        /* compiled from: Barcodes.kt */
                        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                        /* renamed from: com.smartengines.app.ui.settings.BarcodesKt$SettingsBarcodeTypes$1$3$1, reason: invalid class name */
                        /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Set<? extends String>, Unit> {
                            AnonymousClass1(Object obj) {
                                super(1, obj, CodeSettingsWriter.class, "writeBarcodeTypes", "writeBarcodeTypes(Ljava/util/Set;)V", 0);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Set<? extends String> set) {
                                invoke2((Set<String>) set);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Set<String> p0) {
                                Intrinsics.checkNotNullParameter(p0, "p0");
                                ((CodeSettingsWriter) this.receiver).writeBarcodeTypes(p0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.BarcodesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BarcodesKt.SettingsBarcodeTypes$lambda$1(onBack, codeSettings, codeSettingsWriter2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1819444677);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Dark)103@3880L236:Barcodes.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$BarcodesKt.INSTANCE.m7686getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.BarcodesKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BarcodesKt.Preview_Dark$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_DarkTypes(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-558459330);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_DarkTypes)116@4244L237:Barcodes.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$BarcodesKt.INSTANCE.m7688getLambda4$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.BarcodesKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BarcodesKt.Preview_DarkTypes$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Light(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(723568561);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Light)129@4606L237:Barcodes.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(false, ComposableSingletons$BarcodesKt.INSTANCE.m7690getLambda6$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.BarcodesKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BarcodesKt.Preview_Light$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_LightTypes(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(965165704);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_LightTypes)142@4973L238:Barcodes.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(false, ComposableSingletons$BarcodesKt.INSTANCE.m7692getLambda8$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.BarcodesKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BarcodesKt.Preview_LightTypes$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
