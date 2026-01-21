package com.smartengines.app.p004ui.results;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.PainterResources_androidKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.C3069R;
import com.smartengines.app.mock.MockSelectorsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResFragments.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ResFragmentsKt {
    public static final ComposableSingletons$ResFragmentsKt INSTANCE = new ComposableSingletons$ResFragmentsKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2094lambda1 = ComposableLambdaKt.composableLambdaInstance(-2078792216, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$ResFragmentsKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C61@2452L56,60@2430L101:ResFragments.kt#4ipo3i");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                IconKt.m2584Iconww6aTOc(PainterResources_androidKt.painterResource(C3069R.drawable.ic_back, composer, 0), "back", (Modifier) null, 0L, composer, 56, 12);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2101lambda2 = ComposableLambdaKt.composableLambdaInstance(-1072272606, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$ResFragmentsKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C79@3021L37,79@3016L52:ResFragments.kt#4ipo3i");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                IconKt.m2584Iconww6aTOc(PainterResources_androidKt.painterResource(C3069R.drawable.ic_selfie, composer, 0), "selfie", (Modifier) null, 0L, composer, 56, 12);
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2102lambda3 = ComposableLambdaKt.composableLambdaInstance(1862498989, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$ResFragmentsKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C87@3335L68,86@3309L121:ResFragments.kt#4ipo3i");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                IconKt.m2584Iconww6aTOc(PainterResources_androidKt.painterResource(C3069R.drawable.ic_session_settings, composer, 0), "back", (Modifier) null, 0L, composer, 56, 12);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2103lambda4 = ComposableLambdaKt.composableLambdaInstance(117039270, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$ResFragmentsKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C206@6906L35:ResFragments.kt#4ipo3i");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                ResFragmentsKt.ResultBottomBar(true, composer, 6, 0);
            }
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2104lambda5 = ComposableLambdaKt.composableLambdaInstance(93992011, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$ResFragmentsKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C205@6882L69:ResFragments.kt#4ipo3i");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ResFragmentsKt.INSTANCE.m7628getLambda4$app_storeRelease(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2105lambda6 = ComposableLambdaKt.composableLambdaInstance(-1688941600, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$ResFragmentsKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C216@7132L30:ResFragments.kt#4ipo3i");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                ResFragmentsKt.NoResult(MockSelectorsKt.getMockSelectedTreeLeaf(), null, composer, 8, 2);
            }
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2106lambda7 = ComposableLambdaKt.composableLambdaInstance(1329464603, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$ResFragmentsKt$lambda-7$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C215@7110L62:ResFragments.kt#4ipo3i");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ResFragmentsKt.INSTANCE.m7630getLambda6$app_storeRelease(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f2107lambda8 = ComposableLambdaKt.composableLambdaInstance(-1320427815, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$ResFragmentsKt$lambda-8$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope ResultCard, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(ResultCard, "$this$ResultCard");
            ComposerKt.sourceInformation(composer, "C226@7415L21:ResFragments.kt#4ipo3i");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TextKt.m3128Text4IGK_g("Result Card 1", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            }
        }
    });

    /* renamed from: lambda-9, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f2108lambda9 = ComposableLambdaKt.composableLambdaInstance(748623888, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$ResFragmentsKt$lambda-9$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope ResultCard, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(ResultCard, "$this$ResultCard");
            ComposerKt.sourceInformation(composer, "C227@7468L21:ResFragments.kt#4ipo3i");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TextKt.m3128Text4IGK_g("Result Card 2", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            }
        }
    });

    /* renamed from: lambda-10, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2095lambda10 = ComposableLambdaKt.composableLambdaInstance(1613037688, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$ResFragmentsKt$lambda-10$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C225@7352L153:ResFragments.kt#4ipo3i");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Modifier modifierM1435padding3ABfNKs = PaddingKt.m1435padding3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(20));
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1435padding3ABfNKs);
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
                Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1848089722, "C226@7402L36,227@7455L36:ResFragments.kt#4ipo3i");
                ResFragmentsKt.ResultCard(null, ComposableSingletons$ResFragmentsKt.INSTANCE.m7632getLambda8$app_storeRelease(), composer, 48, 1);
                ResFragmentsKt.ResultCard(null, ComposableSingletons$ResFragmentsKt.INSTANCE.m7633getLambda9$app_storeRelease(), composer, 48, 1);
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
    });

    /* renamed from: lambda-11, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2096lambda11 = ComposableLambdaKt.composableLambdaInstance(336476595, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$ResFragmentsKt$lambda-11$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C224@7330L185:ResFragments.kt#4ipo3i");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ResFragmentsKt.INSTANCE.m7620getLambda10$app_storeRelease(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-12, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f2097lambda12 = ComposableLambdaKt.composableLambdaInstance(-1586825089, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$ResFragmentsKt$lambda-12$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope ResultCard, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(ResultCard, "$this$ResultCard");
            ComposerKt.sourceInformation(composer, "C238@7760L21:ResFragments.kt#4ipo3i");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TextKt.m3128Text4IGK_g("Result Card 1", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            }
        }
    });

    /* renamed from: lambda-13, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f2098lambda13 = ComposableLambdaKt.composableLambdaInstance(-1870731736, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$ResFragmentsKt$lambda-13$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope ResultCard, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(ResultCard, "$this$ResultCard");
            ComposerKt.sourceInformation(composer, "C239@7813L21:ResFragments.kt#4ipo3i");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TextKt.m3128Text4IGK_g("Result Card 2", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            }
        }
    });

    /* renamed from: lambda-14, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2099lambda14 = ComposableLambdaKt.composableLambdaInstance(-843707712, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$ResFragmentsKt$lambda-14$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C237@7697L153:ResFragments.kt#4ipo3i");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Modifier modifierM1435padding3ABfNKs = PaddingKt.m1435padding3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(20));
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1435padding3ABfNKs);
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
                Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 1428273634, "C238@7747L36,239@7800L36:ResFragments.kt#4ipo3i");
                ResFragmentsKt.ResultCard(null, ComposableSingletons$ResFragmentsKt.INSTANCE.m7622getLambda12$app_storeRelease(), composer, 48, 1);
                ResFragmentsKt.ResultCard(null, ComposableSingletons$ResFragmentsKt.INSTANCE.m7623getLambda13$app_storeRelease(), composer, 48, 1);
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
    });

    /* renamed from: lambda-15, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2100lambda15 = ComposableLambdaKt.composableLambdaInstance(-1762395931, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$ResFragmentsKt$lambda-15$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C236@7675L185:ResFragments.kt#4ipo3i");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ResFragmentsKt.INSTANCE.m7624getLambda14$app_storeRelease(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7619getLambda1$app_storeRelease() {
        return f2094lambda1;
    }

    /* renamed from: getLambda-10$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7620getLambda10$app_storeRelease() {
        return f2095lambda10;
    }

    /* renamed from: getLambda-11$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7621getLambda11$app_storeRelease() {
        return f2096lambda11;
    }

    /* renamed from: getLambda-12$app_storeRelease, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7622getLambda12$app_storeRelease() {
        return f2097lambda12;
    }

    /* renamed from: getLambda-13$app_storeRelease, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7623getLambda13$app_storeRelease() {
        return f2098lambda13;
    }

    /* renamed from: getLambda-14$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7624getLambda14$app_storeRelease() {
        return f2099lambda14;
    }

    /* renamed from: getLambda-15$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7625getLambda15$app_storeRelease() {
        return f2100lambda15;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7626getLambda2$app_storeRelease() {
        return f2101lambda2;
    }

    /* renamed from: getLambda-3$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7627getLambda3$app_storeRelease() {
        return f2102lambda3;
    }

    /* renamed from: getLambda-4$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7628getLambda4$app_storeRelease() {
        return f2103lambda4;
    }

    /* renamed from: getLambda-5$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7629getLambda5$app_storeRelease() {
        return f2104lambda5;
    }

    /* renamed from: getLambda-6$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7630getLambda6$app_storeRelease() {
        return f2105lambda6;
    }

    /* renamed from: getLambda-7$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7631getLambda7$app_storeRelease() {
        return f2106lambda7;
    }

    /* renamed from: getLambda-8$app_storeRelease, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7632getLambda8$app_storeRelease() {
        return f2107lambda8;
    }

    /* renamed from: getLambda-9$app_storeRelease, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7633getLambda9$app_storeRelease() {
        return f2108lambda9;
    }
}
