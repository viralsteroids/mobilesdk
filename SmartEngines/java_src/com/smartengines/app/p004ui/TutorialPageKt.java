package com.smartengines.app.p004ui;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.ColorFilter;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.C3069R;
import com.smartengines.app.p004ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: TutorialPage.kt */
@Metadata(m513d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000b\u001a\u0015\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0015"}, m514d2 = {"TutorialPage", "", "index", "", "columnScope", "Landroidx/compose/foundation/layout/ColumnScope;", "(ILandroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "TutorialText", "context", "Landroid/content/Context;", "resId", "(Landroid/content/Context;ILandroidx/compose/runtime/Composer;I)V", "Preview", "(ILandroidx/compose/runtime/Composer;I)V", "Preview1", "(Landroidx/compose/runtime/Composer;I)V", "Preview2", "Preview3", "Preview4", "Preview5", "Preview6", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TutorialPageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$7(int i, int i2, Composer composer, int i3) {
        Preview(i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview1$lambda$8(int i, Composer composer, int i2) {
        Preview1(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview2$lambda$9(int i, Composer composer, int i2) {
        Preview2(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview3$lambda$10(int i, Composer composer, int i2) {
        Preview3(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview4$lambda$11(int i, Composer composer, int i2) {
        Preview4(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview5$lambda$12(int i, Composer composer, int i2) {
        Preview5(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview6$lambda$13(int i, Composer composer, int i2) {
        Preview6(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TutorialPage$lambda$5(int i, ColumnScope columnScope, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(columnScope, "$columnScope");
        TutorialPage(i, columnScope, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TutorialText$lambda$6(Context context, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(context, "$context");
        TutorialText(context, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void TutorialPage(final int i, ColumnScope columnScope, Composer composer, final int i2) {
        int i3;
        final ColumnScope columnScope2 = columnScope;
        Intrinsics.checkNotNullParameter(columnScope2, "columnScope");
        Composer composerStartRestartGroup = composer.startRestartGroup(-611986875);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TutorialPage)P(1)26@1073L7:TutorialPage.kt#83idza");
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & LDSFile.EF_DG16_TAG) == 0) {
            i3 |= composerStartRestartGroup.changed(columnScope2) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            if (i == 0) {
                composerStartRestartGroup.startReplaceGroup(1563748356);
                ComposerKt.sourceInformation(composerStartRestartGroup, "32@1175L27,33@1225L33,33@1219L85,35@1321L27,36@1365L42,37@1424L27");
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                ImageKt.Image(PainterResources_androidKt.painterResource(C3069R.drawable.tut_1, composerStartRestartGroup, 0), "", ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 2.0f, false, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, MenuKt.InTransitionDuration);
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                TutorialText(context, C3069R.string.tut_1_text, composerStartRestartGroup, 8);
                columnScope2 = columnScope;
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope2, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i == 1) {
                composerStartRestartGroup.startReplaceGroup(1564082660);
                ComposerKt.sourceInformation(composerStartRestartGroup, "41@1512L27,42@1562L33,42@1556L85,44@1658L27,45@1702L42,46@1761L27");
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                ImageKt.Image(PainterResources_androidKt.painterResource(C3069R.drawable.tut_2, composerStartRestartGroup, 0), "", ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 2.0f, false, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, MenuKt.InTransitionDuration);
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                TutorialText(context, C3069R.string.tut_2_text, composerStartRestartGroup, 8);
                columnScope2 = columnScope;
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope2, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i == 2) {
                composerStartRestartGroup.startReplaceGroup(1564435502);
                ComposerKt.sourceInformation(composerStartRestartGroup, "50@1849L27,51@1893L44,52@1954L29,53@2000L422,58@2439L27,59@2483L44,60@2544L29,61@2596L33,61@2590L89,63@2696L27");
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                TutorialText(context, C3069R.string.tut_3_text_1, composerStartRestartGroup, 8);
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 0.3f, false, 2, null), composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical spaceAround = Arrangement.INSTANCE.getSpaceAround();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceAround, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composerStartRestartGroup);
                Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -114163436, "C54@2100L84,55@2205L84,56@2310L94:TutorialPage.kt#83idza");
                String string = context.getString(C3069R.string.tut_3_card_1);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                HomeCardKt.m7550HomeCard942rkJo(string, Integer.valueOf(C3069R.drawable.home_rus_passport), 0.0f, new Function0() { // from class: com.smartengines.app.ui.TutorialPageKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 3072, 4);
                String string2 = context.getString(C3069R.string.tut_3_card_2);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                HomeCardKt.m7550HomeCard942rkJo(string2, Integer.valueOf(C3069R.drawable.home_registration), 0.0f, new Function0() { // from class: com.smartengines.app.ui.TutorialPageKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 3072, 4);
                String string3 = context.getString(C3069R.string.tut_3_card_3);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                HomeCardKt.m7550HomeCard942rkJo(string3, Integer.valueOf(C3069R.drawable.home_birth_certificate_dark), 0.0f, new Function0() { // from class: com.smartengines.app.ui.TutorialPageKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 3072, 4);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                TutorialText(context, C3069R.string.tut_3_text_2, composerStartRestartGroup, 8);
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 0.3f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                ImageKt.Image(PainterResources_androidKt.painterResource(C3069R.drawable.tut_3, composerStartRestartGroup, 0), "", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, MenuKt.InTransitionDuration);
                columnScope2 = columnScope;
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope2, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i == 3) {
                composerStartRestartGroup.startReplaceGroup(1565344484);
                ComposerKt.sourceInformation(composerStartRestartGroup, "67@2784L27,68@2828L42,69@2887L27,70@2937L33,70@2931L85,72@3033L27");
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                TutorialText(context, C3069R.string.tut_4_text, composerStartRestartGroup, 8);
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                ImageKt.Image(PainterResources_androidKt.painterResource(C3069R.drawable.tut_4, composerStartRestartGroup, 0), "", ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 2.0f, false, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, MenuKt.InTransitionDuration);
                columnScope2 = columnScope;
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope2, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i == 4) {
                composerStartRestartGroup.startReplaceGroup(1565678788);
                ComposerKt.sourceInformation(composerStartRestartGroup, "76@3121L27,77@3165L42,78@3224L27,79@3274L33,79@3268L85,81@3370L27");
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                TutorialText(context, C3069R.string.tut_5_text, composerStartRestartGroup, 8);
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                ImageKt.Image(PainterResources_androidKt.painterResource(C3069R.drawable.tut_5, composerStartRestartGroup, 0), "", ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 4.0f, false, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, MenuKt.InTransitionDuration);
                columnScope2 = columnScope;
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope2, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i == 5) {
                composerStartRestartGroup.startReplaceGroup(1566013092);
                ComposerKt.sourceInformation(composerStartRestartGroup, "85@3458L27,86@3502L42,87@3561L27,88@3611L33,88@3605L85,90@3707L27");
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope2, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                TutorialText(context, C3069R.string.tut_6_text, composerStartRestartGroup, 8);
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                ImageKt.Image(PainterResources_androidKt.painterResource(C3069R.drawable.tut_6, composerStartRestartGroup, 0), "", ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 4.0f, false, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, MenuKt.InTransitionDuration);
                columnScope2 = columnScope;
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope2, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1334946180);
                ComposerKt.sourceInformation(composerStartRestartGroup, "93@3770L28");
                TextKt.m3128Text4IGK_g("TUTORIAL PAGE " + i, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131070);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TutorialPageKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TutorialPageKt.TutorialPage$lambda$5(i, columnScope2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void TutorialText(final Context context, final int i, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2088458292);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TutorialText)99@3888L89:TutorialPage.kt#83idza");
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        TextKt.m3128Text4IGK_g(string, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6937boximpl(TextAlign.INSTANCE.m6944getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 130558);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TutorialPageKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TutorialPageKt.TutorialText$lambda$6(context, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview(final int i, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-136043054);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview)108@4168L265,108@4132L301:TutorialPage.kt#83idza");
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            ThemeKt.SmartEnginesTheme(true, ComposableLambdaKt.rememberComposableLambda(1485466375, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.TutorialPageKt.Preview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    ComposerKt.sourceInformation(composer2, "C109@4188L239,109@4178L249:TutorialPage.kt#83idza");
                    if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                        final int i5 = i;
                        SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(969948812, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.TutorialPageKt.Preview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                ComposerKt.sourceInformation(composer3, "C110@4202L215:TutorialPage.kt#83idza");
                                if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                                    Modifier modifierM1466height3ABfNKs = SizeKt.m1466height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1959Dp.m7055constructorimpl(500));
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    int i7 = i5;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM1466height3ABfNKs);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer3);
                                    Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -297118983, "C114@4378L25:TutorialPage.kt#83idza");
                                    TutorialPageKt.TutorialPage(i7, columnScopeInstance, composer3, 48);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, 12582912, 127);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TutorialPageKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TutorialPageKt.Preview$lambda$7(i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview1(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1804818370);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview1)123@4529L10:TutorialPage.kt#83idza");
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Preview(0, composerStartRestartGroup, 6);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TutorialPageKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TutorialPageKt.Preview1$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview2(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1825155745);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview2)127@4634L10:TutorialPage.kt#83idza");
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Preview(1, composerStartRestartGroup, 6);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TutorialPageKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TutorialPageKt.Preview2$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview3(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1845493120);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview3)131@4739L10:TutorialPage.kt#83idza");
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Preview(2, composerStartRestartGroup, 6);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TutorialPageKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TutorialPageKt.Preview3$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview4(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1865830495);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview4)135@4844L10:TutorialPage.kt#83idza");
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Preview(3, composerStartRestartGroup, 6);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TutorialPageKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TutorialPageKt.Preview4$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview5(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1886167870);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview5)139@4949L10:TutorialPage.kt#83idza");
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Preview(4, composerStartRestartGroup, 6);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TutorialPageKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TutorialPageKt.Preview5$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview6(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1906505245);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview6)143@5054L10:TutorialPage.kt#83idza");
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Preview(5, composerStartRestartGroup, 6);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TutorialPageKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TutorialPageKt.Preview6$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
