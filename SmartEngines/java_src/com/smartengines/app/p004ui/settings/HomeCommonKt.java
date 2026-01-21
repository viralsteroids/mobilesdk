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
import com.smartengines.app.settings.CommonSettingWriter;
import com.smartengines.app.settings.CommonSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeCommon.kt */
@Metadata(m513d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\f"}, m514d2 = {"HomeCommon", "", "commonSettings", "Lcom/smartengines/app/settings/CommonSettings;", "commonWriter", "Lcom/smartengines/app/settings/CommonSettingWriter;", "buildFlavor", "Lcom/smartengines/app/settings/BuildFlavor;", "(Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CommonSettingWriter;Lcom/smartengines/app/settings/BuildFlavor;Landroidx/compose/runtime/Composer;II)V", "Preview_Dark", "(Landroidx/compose/runtime/Composer;I)V", "Preview_Light", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class HomeCommonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeCommon$lambda$0(CommonSettings commonSettings, CommonSettingWriter commonSettingWriter, BuildFlavor buildFlavor, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(commonSettings, "$commonSettings");
        HomeCommon(commonSettings, commonSettingWriter, buildFlavor, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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

    public static final void HomeCommon(final CommonSettings commonSettings, final CommonSettingWriter commonSettingWriter, final BuildFlavor buildFlavor, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(commonSettings, "commonSettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(-247411385);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HomeCommon)P(1,2)26@965L7,27@1030L2063,27@977L2116:HomeCommon.kt#v86m6v");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(commonSettings) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 16;
        }
        if ((i & 896) == 0) {
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(buildFlavor)) ? 256 : 128;
        }
        if (i4 != 2 || (i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    commonSettingWriter = AppKt.getCommonSettingsStore();
                }
                if ((i2 & 4) != 0) {
                    buildFlavor = Model.INSTANCE.getBuildFlavor();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context = (Context) objConsume;
            FragmentsKt.Section(context.getString(C3069R.string.settings_common), ComposableLambdaKt.rememberComposableLambda(1829229534, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.HomeCommonKt.HomeCommon.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Section, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(Section, "$this$Section");
                    ComposerKt.sourceInformation(composer2, "C28@1040L142,32@1191L175,37@1375L149,41@1533L154,54@2015L177,58@2205L171,62@2389L172,66@2574L169,70@2756L154,74@2923L154:HomeCommon.kt#v86m6v");
                    if ((i5 & 81) != 16 || !composer2.getSkipping()) {
                        String string = context.getString(C3069R.string.s_dark_theme);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        FragmentsKt.BooleanRow(string, commonSettings.getDarkTheme(), new AnonymousClass1(commonSettingWriter), composer2, 0);
                        String string2 = context.getString(C3069R.string.settings_timeout);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        FragmentsKt.IntRow(string2, commonSettings.getSessionTimeout(), 0, 10, 1, new AnonymousClass2(commonSettingWriter), false, composer2, 28032, 64);
                        String string3 = context.getString(C3069R.string.settings_show_quads);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        FragmentsKt.BooleanRow(string3, commonSettings.getShowQuads(), new AnonymousClass3(commonSettingWriter), composer2, 0);
                        String string4 = context.getString(C3069R.string.s_result_preview);
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        FragmentsKt.BooleanRow(string4, commonSettings.getResultPreview(), new AnonymousClass4(commonSettingWriter), composer2, 0);
                        composer2.startReplaceGroup(-720544378);
                        ComposerKt.sourceInformation(composer2, "47@1748L169");
                        if (buildFlavor == BuildFlavor.NIGHTLY) {
                            String string5 = context.getString(C3069R.string.s_always_accepted);
                            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                            FragmentsKt.BooleanRow(string5, commonSettings.getAlwaysAccepted(), new AnonymousClass5(commonSettingWriter), composer2, 0);
                        }
                        composer2.endReplaceGroup();
                        if (SetsKt.setOf((Object[]) new BuildFlavor[]{BuildFlavor.NIGHTLY, BuildFlavor.BETA}).contains(buildFlavor)) {
                            String string6 = context.getString(C3069R.string.s_enable_multithreading);
                            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                            FragmentsKt.BooleanRow(string6, commonSettings.getMultiThreading(), new AnonymousClass6(commonSettingWriter), composer2, 0);
                            String string7 = context.getString(C3069R.string.s_calculate_metrics);
                            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                            FragmentsKt.BooleanRow(string7, commonSettings.getComputeMetrics(), new AnonymousClass7(commonSettingWriter), composer2, 0);
                            String string8 = context.getString(C3069R.string.s_ignore_terminality);
                            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                            FragmentsKt.BooleanRow(string8, commonSettings.getIgnoreTerminal(), new AnonymousClass8(commonSettingWriter), composer2, 0);
                            String string9 = context.getString(C3069R.string.s_enable_stoppers);
                            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                            FragmentsKt.BooleanRow(string9, commonSettings.getEnableStoppers(), new AnonymousClass9(commonSettingWriter), composer2, 0);
                            String string10 = context.getString(C3069R.string.s_save_photo);
                            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                            FragmentsKt.BooleanRow(string10, commonSettings.getSavePhoto(), new AnonymousClass10(commonSettingWriter), composer2, 0);
                            String string11 = context.getString(C3069R.string.s_save_video);
                            Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                            FragmentsKt.BooleanRow(string11, commonSettings.getSaveVideo(), new AnonymousClass11(commonSettingWriter), composer2, 0);
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* compiled from: HomeCommon.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeCommonKt$HomeCommon$1$1, reason: invalid class name */
                /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass1(Object obj) {
                        super(1, obj, CommonSettingWriter.class, "writeDarkTheme", "writeDarkTheme(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((CommonSettingWriter) this.receiver).writeDarkTheme(z);
                    }
                }

                /* compiled from: HomeCommon.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeCommonKt$HomeCommon$1$2, reason: invalid class name */
                /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                    AnonymousClass2(Object obj) {
                        super(1, obj, CommonSettingWriter.class, "writeSessionTimeout", "writeSessionTimeout(I)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        invoke(num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i) {
                        ((CommonSettingWriter) this.receiver).writeSessionTimeout(i);
                    }
                }

                /* compiled from: HomeCommon.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeCommonKt$HomeCommon$1$3, reason: invalid class name */
                /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass3(Object obj) {
                        super(1, obj, CommonSettingWriter.class, "writeShowQuads", "writeShowQuads(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((CommonSettingWriter) this.receiver).writeShowQuads(z);
                    }
                }

                /* compiled from: HomeCommon.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeCommonKt$HomeCommon$1$4, reason: invalid class name */
                /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass4(Object obj) {
                        super(1, obj, CommonSettingWriter.class, "writeResultPreview", "writeResultPreview(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((CommonSettingWriter) this.receiver).writeResultPreview(z);
                    }
                }

                /* compiled from: HomeCommon.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeCommonKt$HomeCommon$1$5, reason: invalid class name */
                /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass5(Object obj) {
                        super(1, obj, CommonSettingWriter.class, "writeAlwaysAccepted", "writeAlwaysAccepted(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((CommonSettingWriter) this.receiver).writeAlwaysAccepted(z);
                    }
                }

                /* compiled from: HomeCommon.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeCommonKt$HomeCommon$1$6, reason: invalid class name */
                /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass6(Object obj) {
                        super(1, obj, CommonSettingWriter.class, "writeMultiThreading", "writeMultiThreading(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((CommonSettingWriter) this.receiver).writeMultiThreading(z);
                    }
                }

                /* compiled from: HomeCommon.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeCommonKt$HomeCommon$1$7, reason: invalid class name */
                /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass7(Object obj) {
                        super(1, obj, CommonSettingWriter.class, "writeComputeMetrics", "writeComputeMetrics(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((CommonSettingWriter) this.receiver).writeComputeMetrics(z);
                    }
                }

                /* compiled from: HomeCommon.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeCommonKt$HomeCommon$1$8, reason: invalid class name */
                /* synthetic */ class AnonymousClass8 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass8(Object obj) {
                        super(1, obj, CommonSettingWriter.class, "writeIgnoreTerminal", "writeIgnoreTerminal(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((CommonSettingWriter) this.receiver).writeIgnoreTerminal(z);
                    }
                }

                /* compiled from: HomeCommon.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeCommonKt$HomeCommon$1$9, reason: invalid class name */
                /* synthetic */ class AnonymousClass9 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass9(Object obj) {
                        super(1, obj, CommonSettingWriter.class, "writeEnableStoppers", "writeEnableStoppers(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((CommonSettingWriter) this.receiver).writeEnableStoppers(z);
                    }
                }

                /* compiled from: HomeCommon.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeCommonKt$HomeCommon$1$10, reason: invalid class name */
                /* synthetic */ class AnonymousClass10 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass10(Object obj) {
                        super(1, obj, CommonSettingWriter.class, "writeSavePhoto", "writeSavePhoto(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((CommonSettingWriter) this.receiver).writeSavePhoto(z);
                    }
                }

                /* compiled from: HomeCommon.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeCommonKt$HomeCommon$1$11, reason: invalid class name */
                /* synthetic */ class AnonymousClass11 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass11(Object obj) {
                        super(1, obj, CommonSettingWriter.class, "writeSaveVideo", "writeSaveVideo(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((CommonSettingWriter) this.receiver).writeSaveVideo(z);
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final CommonSettingWriter commonSettingWriter2 = commonSettingWriter;
        final BuildFlavor buildFlavor2 = buildFlavor;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeCommonKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeCommonKt.HomeCommon$lambda$0(commonSettings, commonSettingWriter2, buildFlavor2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2073073308);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Dark)86@3318L248:HomeCommon.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$HomeCommonKt.INSTANCE.m7730getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeCommonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeCommonKt.Preview_Dark$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Light(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2073743014);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Light)100@3691L213:HomeCommon.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(false, ComposableSingletons$HomeCommonKt.INSTANCE.m7732getLambda4$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeCommonKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeCommonKt.Preview_Light$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
