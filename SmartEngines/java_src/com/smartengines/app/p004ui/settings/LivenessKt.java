package com.smartengines.app.p004ui.settings;

import android.content.Context;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.AppKt;
import com.smartengines.app.C3069R;
import com.smartengines.app.p004ui.AppContentKt;
import com.smartengines.app.p004ui.settings.LivenessKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.IdSettings;
import com.smartengines.app.settings.IdSettingsStore;
import com.smartengines.app.settings.IdSettingsWriter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.jmrtd.lds.LDSFile;

/* compiled from: Liveness.kt */
@Metadata(m513d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\u001a-\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002"}, m514d2 = {"SettingsLiveness", "", "onBack", "Lkotlin/Function0;", "idSettings", "Lcom/smartengines/app/settings/IdSettings;", "idSettingsWriter", "Lcom/smartengines/app/settings/IdSettingsWriter;", "(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;Landroidx/compose/runtime/Composer;II)V", "Preview_Dark", "(Landroidx/compose/runtime/Composer;I)V", "app_storeRelease", "highlightDelta", ""}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class LivenessKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Dark$lambda$5(int i, Composer composer, int i2) {
        Preview_Dark(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsLiveness$lambda$4(Function0 onBack, IdSettings idSettings, IdSettingsWriter idSettingsWriter, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(onBack, "$onBack");
        Intrinsics.checkNotNullParameter(idSettings, "$idSettings");
        SettingsLiveness(onBack, idSettings, idSettingsWriter, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SettingsLiveness(final Function0<Unit> onBack, final IdSettings idSettings, IdSettingsWriter idSettingsWriter, Composer composer, final int i, final int i2) {
        int i3;
        IdSettingsStore idSettingsStore;
        Object objRememberedValue;
        LivenessKt$SettingsLiveness$1$1 livenessKt$SettingsLiveness$1$1RememberedValue;
        final IdSettingsWriter idSettingsWriter2;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(idSettings, "idSettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1323454399);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SettingsLiveness)P(2)33@1337L7,36@1436L34,38@1507L106,38@1476L137,45@1684L1859,45@1619L1924:Liveness.kt#v86m6v");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(onBack) ? 4 : 2);
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
                if (i4 != 0) {
                    i3 &= -897;
                }
            } else {
                if (i4 != 0) {
                    idSettingsStore = AppKt.getIdSettingsStore();
                    i3 &= -897;
                }
                int i5 = i3;
                composerStartRestartGroup.endDefaults();
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final Context context = (Context) objConsume;
                final int iCoerceAtLeast = RangesKt.coerceAtLeast(idSettings.getInstrCount() / 4, 0);
                composerStartRestartGroup.startReplaceGroup(-1685685697);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Liveness.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final MutableState mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf = Boolean.valueOf(SettingsLiveness$lambda$1(mutableState));
                composerStartRestartGroup.startReplaceGroup(-1685683353);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Liveness.kt#9igjgp");
                livenessKt$SettingsLiveness$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (livenessKt$SettingsLiveness$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    livenessKt$SettingsLiveness$1$1RememberedValue = new LivenessKt$SettingsLiveness$1$1(mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(livenessKt$SettingsLiveness$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) livenessKt$SettingsLiveness$1$1RememberedValue, composerStartRestartGroup, 64);
                String string = context.getString(C3069R.string.s_liveness);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                final IdSettingsWriter idSettingsWriter3 = idSettingsStore;
                FragmentsKt.SettingsScaffold(string, onBack, ComposableLambdaKt.rememberComposableLambda(1517445401, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.LivenessKt.SettingsLiveness.2

                    /* compiled from: Liveness.kt */
                    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                    /* renamed from: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<ColumnScope, Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ MutableState<Boolean> $highlightDelta$delegate;
                        final /* synthetic */ IdSettings $idSettings;
                        final /* synthetic */ IdSettingsWriter $idSettingsWriter;
                        final /* synthetic */ int $maxDelta;

                        AnonymousClass1(Context context, IdSettings idSettings, IdSettingsWriter idSettingsWriter, int i, MutableState<Boolean> mutableState) {
                            this.$context = context;
                            this.$idSettings = idSettings;
                            this.$idSettingsWriter = idSettingsWriter;
                            this.$maxDelta = i;
                            this.$highlightDelta$delegate = mutableState;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                            invoke(columnScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope Section, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(Section, "$this$Section");
                            ComposerKt.sourceInformation(composer, "C47@1716L208,52@1937L209,57@2159L354,66@2526L236,71@2775L183,76@2971L189,81@3173L157,85@3343L184:Liveness.kt#v86m6v");
                            if ((i & 81) != 16 || !composer.getSkipping()) {
                                String string = this.$context.getString(C3069R.string.s_min_instr_time);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                FragmentsKt.IntRow(string, this.$idSettings.getMinInstrTime(), 1, this.$idSettings.getMaxInstrTime(), 1, new C40101(this.$idSettingsWriter), false, composer, 24960, 64);
                                String string2 = this.$context.getString(C3069R.string.s_max_instr_time);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                FragmentsKt.IntRow(string2, this.$idSettings.getMaxInstrTime(), this.$idSettings.getMinInstrTime(), 10, 1, new AnonymousClass2(this.$idSettingsWriter), false, composer, 27648, 64);
                                String string3 = this.$context.getString(C3069R.string.s_instr_count);
                                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                                int instrCount = this.$idSettings.getInstrCount();
                                final IdSettingsWriter idSettingsWriter = this.$idSettingsWriter;
                                final MutableState<Boolean> mutableState = this.$highlightDelta$delegate;
                                FragmentsKt.IntRow(string3, instrCount, 1, 10, 1, new Function1() { // from class: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return LivenessKt.C32692.AnonymousClass1.invoke$lambda$0(idSettingsWriter, mutableState, ((Integer) obj).intValue());
                                    }
                                }, false, composer, 28032, 64);
                                String string4 = this.$context.getString(C3069R.string.s_instr_count_delta);
                                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                FragmentsKt.IntRow(string4, this.$idSettings.getInstrCountDeltaRandom(), 0, this.$maxDelta, 1, new AnonymousClass4(this.$idSettingsWriter), LivenessKt.SettingsLiveness$lambda$1(this.$highlightDelta$delegate), composer, 24960, 0);
                                String string5 = this.$context.getString(C3069R.string.s_instr_failed);
                                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                FragmentsKt.IntRow(string5, this.$idSettings.getInstrFailed(), 1, 10, 1, new AnonymousClass5(this.$idSettingsWriter), false, composer, 28032, 64);
                                String string6 = this.$context.getString(C3069R.string.s_min_pass_time);
                                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                                FragmentsKt.IntRow(string6, this.$idSettings.getMinPassTime(), 500, 5000, 50, new AnonymousClass6(this.$idSettingsWriter), false, composer, 28032, 64);
                                String string7 = this.$context.getString(C3069R.string.s_always_pass);
                                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                                FragmentsKt.BooleanRow(string7, this.$idSettings.getAlwaysPass(), new AnonymousClass7(this.$idSettingsWriter), composer, 0);
                                String string8 = this.$context.getString(C3069R.string.s_enable_visualization);
                                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                                FragmentsKt.BooleanRow(string8, this.$idSettings.getEnableVisualization(), new AnonymousClass8(this.$idSettingsWriter), composer, 0);
                                return;
                            }
                            composer.skipToGroupEnd();
                        }

                        /* compiled from: Liveness.kt */
                        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                        /* renamed from: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1$1, reason: invalid class name and collision with other inner class name */
                        /* synthetic */ class C40101 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                            C40101(Object obj) {
                                super(1, obj, IdSettingsWriter.class, "writeMinInstrTime", "writeMinInstrTime(I)V", 0);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i) {
                                ((IdSettingsWriter) this.receiver).writeMinInstrTime(i);
                            }
                        }

                        /* compiled from: Liveness.kt */
                        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                        /* renamed from: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1$2, reason: invalid class name */
                        /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                            AnonymousClass2(Object obj) {
                                super(1, obj, IdSettingsWriter.class, "writeMaxInstrTime", "writeMaxInstrTime(I)V", 0);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i) {
                                ((IdSettingsWriter) this.receiver).writeMaxInstrTime(i);
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$0(IdSettingsWriter idSettingsWriter, MutableState highlightDelta$delegate, int i) {
                            Intrinsics.checkNotNullParameter(highlightDelta$delegate, "$highlightDelta$delegate");
                            idSettingsWriter.writeInstrCount(i);
                            idSettingsWriter.resetInstrCountDelta();
                            LivenessKt.SettingsLiveness$lambda$2(highlightDelta$delegate, true);
                            return Unit.INSTANCE;
                        }

                        /* compiled from: Liveness.kt */
                        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                        /* renamed from: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1$4, reason: invalid class name */
                        /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                            AnonymousClass4(Object obj) {
                                super(1, obj, IdSettingsWriter.class, "writeInstrCountDelta", "writeInstrCountDelta(I)V", 0);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i) {
                                ((IdSettingsWriter) this.receiver).writeInstrCountDelta(i);
                            }
                        }

                        /* compiled from: Liveness.kt */
                        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                        /* renamed from: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1$5, reason: invalid class name */
                        /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                            AnonymousClass5(Object obj) {
                                super(1, obj, IdSettingsWriter.class, "writeInstrFailed", "writeInstrFailed(I)V", 0);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i) {
                                ((IdSettingsWriter) this.receiver).writeInstrFailed(i);
                            }
                        }

                        /* compiled from: Liveness.kt */
                        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                        /* renamed from: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1$6, reason: invalid class name */
                        /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                            AnonymousClass6(Object obj) {
                                super(1, obj, IdSettingsWriter.class, "writeMinPassTime", "writeMinPassTime(I)V", 0);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i) {
                                ((IdSettingsWriter) this.receiver).writeMinPassTime(i);
                            }
                        }

                        /* compiled from: Liveness.kt */
                        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                        /* renamed from: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1$7, reason: invalid class name */
                        /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                            AnonymousClass7(Object obj) {
                                super(1, obj, IdSettingsWriter.class, "writeAlwaysPass", "writeAlwaysPass(Z)V", 0);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                ((IdSettingsWriter) this.receiver).writeAlwaysPass(z);
                            }
                        }

                        /* compiled from: Liveness.kt */
                        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                        /* renamed from: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1$8, reason: invalid class name */
                        /* synthetic */ class AnonymousClass8 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                            AnonymousClass8(Object obj) {
                                super(1, obj, IdSettingsWriter.class, "writeEnableVisualization", "writeEnableVisualization(Z)V", 0);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                ((IdSettingsWriter) this.receiver).writeEnableVisualization(z);
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope SettingsScaffold, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
                        ComposerKt.sourceInformation(composer2, "C46@1702L1835,46@1694L1843:Liveness.kt#v86m6v");
                        if ((i6 & 81) != 16 || !composer2.getSkipping()) {
                            FragmentsKt.Section(null, ComposableLambdaKt.rememberComposableLambda(-420561310, true, new AnonymousClass1(context, idSettings, idSettingsWriter3, iCoerceAtLeast, mutableState), composer2, 54), composer2, 48, 1);
                        } else {
                            composer2.skipToGroupEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 << 3) & LDSFile.EF_DG16_TAG) | 384);
                idSettingsWriter2 = idSettingsWriter3;
            }
            idSettingsStore = idSettingsWriter;
            int i52 = i3;
            composerStartRestartGroup.endDefaults();
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context2 = (Context) objConsume2;
            final int iCoerceAtLeast2 = RangesKt.coerceAtLeast(idSettings.getInstrCount() / 4, 0);
            composerStartRestartGroup.startReplaceGroup(-1685685697);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Liveness.kt#9igjgp");
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState<Boolean> mutableState2 = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf2 = Boolean.valueOf(SettingsLiveness$lambda$1(mutableState2));
            composerStartRestartGroup.startReplaceGroup(-1685683353);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Liveness.kt#9igjgp");
            livenessKt$SettingsLiveness$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (livenessKt$SettingsLiveness$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) livenessKt$SettingsLiveness$1$1RememberedValue, composerStartRestartGroup, 64);
            String string2 = context2.getString(C3069R.string.s_liveness);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            final IdSettingsWriter idSettingsWriter32 = idSettingsStore;
            FragmentsKt.SettingsScaffold(string2, onBack, ComposableLambdaKt.rememberComposableLambda(1517445401, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.LivenessKt.SettingsLiveness.2

                /* compiled from: Liveness.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<ColumnScope, Composer, Integer, Unit> {
                    final /* synthetic */ Context $context;
                    final /* synthetic */ MutableState<Boolean> $highlightDelta$delegate;
                    final /* synthetic */ IdSettings $idSettings;
                    final /* synthetic */ IdSettingsWriter $idSettingsWriter;
                    final /* synthetic */ int $maxDelta;

                    AnonymousClass1(Context context, IdSettings idSettings, IdSettingsWriter idSettingsWriter, int i, MutableState<Boolean> mutableState) {
                        this.$context = context;
                        this.$idSettings = idSettings;
                        this.$idSettingsWriter = idSettingsWriter;
                        this.$maxDelta = i;
                        this.$highlightDelta$delegate = mutableState;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                        invoke(columnScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Section, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(Section, "$this$Section");
                        ComposerKt.sourceInformation(composer, "C47@1716L208,52@1937L209,57@2159L354,66@2526L236,71@2775L183,76@2971L189,81@3173L157,85@3343L184:Liveness.kt#v86m6v");
                        if ((i & 81) != 16 || !composer.getSkipping()) {
                            String string = this.$context.getString(C3069R.string.s_min_instr_time);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            FragmentsKt.IntRow(string, this.$idSettings.getMinInstrTime(), 1, this.$idSettings.getMaxInstrTime(), 1, new C40101(this.$idSettingsWriter), false, composer, 24960, 64);
                            String string2 = this.$context.getString(C3069R.string.s_max_instr_time);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            FragmentsKt.IntRow(string2, this.$idSettings.getMaxInstrTime(), this.$idSettings.getMinInstrTime(), 10, 1, new AnonymousClass2(this.$idSettingsWriter), false, composer, 27648, 64);
                            String string3 = this.$context.getString(C3069R.string.s_instr_count);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            int instrCount = this.$idSettings.getInstrCount();
                            final IdSettingsWriter idSettingsWriter = this.$idSettingsWriter;
                            final MutableState mutableState = this.$highlightDelta$delegate;
                            FragmentsKt.IntRow(string3, instrCount, 1, 10, 1, new Function1() { // from class: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return LivenessKt.C32692.AnonymousClass1.invoke$lambda$0(idSettingsWriter, mutableState, ((Integer) obj).intValue());
                                }
                            }, false, composer, 28032, 64);
                            String string4 = this.$context.getString(C3069R.string.s_instr_count_delta);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            FragmentsKt.IntRow(string4, this.$idSettings.getInstrCountDeltaRandom(), 0, this.$maxDelta, 1, new AnonymousClass4(this.$idSettingsWriter), LivenessKt.SettingsLiveness$lambda$1(this.$highlightDelta$delegate), composer, 24960, 0);
                            String string5 = this.$context.getString(C3069R.string.s_instr_failed);
                            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                            FragmentsKt.IntRow(string5, this.$idSettings.getInstrFailed(), 1, 10, 1, new AnonymousClass5(this.$idSettingsWriter), false, composer, 28032, 64);
                            String string6 = this.$context.getString(C3069R.string.s_min_pass_time);
                            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                            FragmentsKt.IntRow(string6, this.$idSettings.getMinPassTime(), 500, 5000, 50, new AnonymousClass6(this.$idSettingsWriter), false, composer, 28032, 64);
                            String string7 = this.$context.getString(C3069R.string.s_always_pass);
                            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                            FragmentsKt.BooleanRow(string7, this.$idSettings.getAlwaysPass(), new AnonymousClass7(this.$idSettingsWriter), composer, 0);
                            String string8 = this.$context.getString(C3069R.string.s_enable_visualization);
                            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                            FragmentsKt.BooleanRow(string8, this.$idSettings.getEnableVisualization(), new AnonymousClass8(this.$idSettingsWriter), composer, 0);
                            return;
                        }
                        composer.skipToGroupEnd();
                    }

                    /* compiled from: Liveness.kt */
                    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                    /* renamed from: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1$1, reason: invalid class name and collision with other inner class name */
                    /* synthetic */ class C40101 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                        C40101(Object obj) {
                            super(1, obj, IdSettingsWriter.class, "writeMinInstrTime", "writeMinInstrTime(I)V", 0);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                            invoke(num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i) {
                            ((IdSettingsWriter) this.receiver).writeMinInstrTime(i);
                        }
                    }

                    /* compiled from: Liveness.kt */
                    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                    /* renamed from: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1$2, reason: invalid class name */
                    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                        AnonymousClass2(Object obj) {
                            super(1, obj, IdSettingsWriter.class, "writeMaxInstrTime", "writeMaxInstrTime(I)V", 0);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                            invoke(num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i) {
                            ((IdSettingsWriter) this.receiver).writeMaxInstrTime(i);
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$0(IdSettingsWriter idSettingsWriter, MutableState highlightDelta$delegate, int i) {
                        Intrinsics.checkNotNullParameter(highlightDelta$delegate, "$highlightDelta$delegate");
                        idSettingsWriter.writeInstrCount(i);
                        idSettingsWriter.resetInstrCountDelta();
                        LivenessKt.SettingsLiveness$lambda$2(highlightDelta$delegate, true);
                        return Unit.INSTANCE;
                    }

                    /* compiled from: Liveness.kt */
                    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                    /* renamed from: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1$4, reason: invalid class name */
                    /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                        AnonymousClass4(Object obj) {
                            super(1, obj, IdSettingsWriter.class, "writeInstrCountDelta", "writeInstrCountDelta(I)V", 0);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                            invoke(num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i) {
                            ((IdSettingsWriter) this.receiver).writeInstrCountDelta(i);
                        }
                    }

                    /* compiled from: Liveness.kt */
                    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                    /* renamed from: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1$5, reason: invalid class name */
                    /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                        AnonymousClass5(Object obj) {
                            super(1, obj, IdSettingsWriter.class, "writeInstrFailed", "writeInstrFailed(I)V", 0);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                            invoke(num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i) {
                            ((IdSettingsWriter) this.receiver).writeInstrFailed(i);
                        }
                    }

                    /* compiled from: Liveness.kt */
                    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                    /* renamed from: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1$6, reason: invalid class name */
                    /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                        AnonymousClass6(Object obj) {
                            super(1, obj, IdSettingsWriter.class, "writeMinPassTime", "writeMinPassTime(I)V", 0);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                            invoke(num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i) {
                            ((IdSettingsWriter) this.receiver).writeMinPassTime(i);
                        }
                    }

                    /* compiled from: Liveness.kt */
                    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                    /* renamed from: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1$7, reason: invalid class name */
                    /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                        AnonymousClass7(Object obj) {
                            super(1, obj, IdSettingsWriter.class, "writeAlwaysPass", "writeAlwaysPass(Z)V", 0);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            ((IdSettingsWriter) this.receiver).writeAlwaysPass(z);
                        }
                    }

                    /* compiled from: Liveness.kt */
                    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                    /* renamed from: com.smartengines.app.ui.settings.LivenessKt$SettingsLiveness$2$1$8, reason: invalid class name */
                    /* synthetic */ class AnonymousClass8 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                        AnonymousClass8(Object obj) {
                            super(1, obj, IdSettingsWriter.class, "writeEnableVisualization", "writeEnableVisualization(Z)V", 0);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            ((IdSettingsWriter) this.receiver).writeEnableVisualization(z);
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope SettingsScaffold, Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
                    ComposerKt.sourceInformation(composer2, "C46@1702L1835,46@1694L1843:Liveness.kt#v86m6v");
                    if ((i6 & 81) != 16 || !composer2.getSkipping()) {
                        FragmentsKt.Section(null, ComposableLambdaKt.rememberComposableLambda(-420561310, true, new AnonymousClass1(context2, idSettings, idSettingsWriter32, iCoerceAtLeast2, mutableState2), composer2, 54), composer2, 48, 1);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i52 << 3) & LDSFile.EF_DG16_TAG) | 384);
            idSettingsWriter2 = idSettingsWriter32;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            idSettingsWriter2 = idSettingsWriter;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.LivenessKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LivenessKt.SettingsLiveness$lambda$4(onBack, idSettings, idSettingsWriter2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SettingsLiveness$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SettingsLiveness$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final void Preview_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-181404949);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Dark)99@3779L229:Liveness.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$LivenessKt.INSTANCE.m7758getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.LivenessKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LivenessKt.Preview_Dark$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
