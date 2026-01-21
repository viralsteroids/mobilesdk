package com.smartengines.app.p004ui;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.smartengines.app.p004ui.TestScreenKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: TestScreen.kt */
@Metadata(m513d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u001a)\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m514d2 = {"TAG", "", "TestScreen", "", "onDismiss", "Lkotlin/Function0;", "strings", "", "(Lkotlin/jvm/functions/Function0;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "Preview_Dark", "(Landroidx/compose/runtime/Composer;I)V", "Preview_Light", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TestScreenKt {
    private static final String TAG = "myapp.InfoScreen";

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
    public static final Unit TestScreen$lambda$0(Function0 onDismiss, List strings, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(onDismiss, "$onDismiss");
        Intrinsics.checkNotNullParameter(strings, "$strings");
        TestScreen(onDismiss, strings, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TestScreen(final Function0<Unit> onDismiss, final List<String> strings, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Composer composerStartRestartGroup = composer.startRestartGroup(921753774);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TestScreen)33@1218L31,36@1301L1137,36@1269L1169:TestScreen.kt#83idza");
        BackHandlerKt.BackHandler(false, onDismiss, composerStartRestartGroup, (i << 3) & LDSFile.EF_DG16_TAG, 1);
        SurfaceKt.m2978SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1780804809, true, new C31671(onDismiss, strings), composerStartRestartGroup, 54), composerStartRestartGroup, 12582918, 126);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TestScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TestScreenKt.TestScreen$lambda$0(onDismiss, strings, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: TestScreen.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.TestScreenKt$TestScreen$1 */
    static final class C31671 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ List<String> $strings;

        C31671(Function0<Unit> function0, List<String> list) {
            this.$onDismiss = function0;
            this.$strings = list;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C38@1330L1102:TestScreen.kt#83idza");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Function0<Unit> function0 = this.$onDismiss;
                final List<String> list = this.$strings;
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer);
                Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1825487854, "C41@1397L467,52@1905L517:TestScreen.kt#83idza");
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composer);
                Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 767732409, "C42@1535L233,48@1827L10,48@1785L65:TestScreen.kt#83idza");
                IconButtonKt.IconButton(function0, null, false, null, null, ComposableSingletons$TestScreenKt.INSTANCE.m7521getLambda1$app_storeRelease(), composer, ProfileVerifier.CompilationStatus.f285xf2722a21, 30);
                TextKt.m3128Text4IGK_g("Test errors", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 6, 0, 65534);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                float f = 5;
                LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, PaddingKt.m1430PaddingValuesYgX7TsA$default(0.0f, C1959Dp.m7055constructorimpl(f), 1, null), false, Arrangement.INSTANCE.m1315spacedBy0680j_4(C1959Dp.m7055constructorimpl(f)), null, null, false, new Function1() { // from class: com.smartengines.app.ui.TestScreenKt$TestScreen$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TestScreenKt.C31671.invoke$lambda$3$lambda$2(list, (LazyListScope) obj);
                    }
                }, composer, 24966, 234);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(final List strings, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(strings, "$strings");
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.items$default(LazyColumn, strings.size(), new Function1() { // from class: com.smartengines.app.ui.TestScreenKt$TestScreen$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(((Integer) obj).intValue());
                }
            }, null, ComposableLambdaKt.composableLambdaInstance(-1322180650, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.TestScreenKt$TestScreen$1$1$2$2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
                    int i3;
                    Intrinsics.checkNotNullParameter(items, "$this$items");
                    ComposerKt.sourceInformation(composer, "C61@2247L143:TestScreen.kt#83idza");
                    if ((i2 & LDSFile.EF_DG16_TAG) == 0) {
                        i3 = i2 | (composer.changed(i) ? 32 : 16);
                    } else {
                        i3 = i2;
                    }
                    if ((i3 & 721) != 144 || !composer.getSkipping()) {
                        TextKt.m3128Text4IGK_g(strings.get(i), PaddingKt.m1437paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1959Dp.m7055constructorimpl(10), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 48, 0, 131068);
                    } else {
                        composer.skipToGroupEnd();
                    }
                }
            }), 4, null);
            return Unit.INSTANCE;
        }
    }

    private static final void Preview_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(441600205);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Dark)77@2664L153:TestScreen.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$TestScreenKt.INSTANCE.m7523getLambda3$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TestScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TestScreenKt.Preview_Dark$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Light(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(635147287);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Light)86@2920L154:TestScreen.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ThemeKt.SmartEnginesTheme(false, ComposableSingletons$TestScreenKt.INSTANCE.m7525getLambda5$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TestScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TestScreenKt.Preview_Light$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
