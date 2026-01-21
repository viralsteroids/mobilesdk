package com.smartengines.app.p004ui.results;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.p000ui.window.AndroidDialog_androidKt;
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
import com.smartengines.app.p004ui.ScreenDataKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.engine.p005id.Attribute;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttributesDialog.kt */
@Metadata(m513d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\t¨\u0006\u000b"}, m514d2 = {"AttributesDialog", "", "attributes", "", "Lcom/smartengines/engine/id/Attribute;", "onDismiss", "Lkotlin/Function0;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PreviewEmpty", "(Landroidx/compose/runtime/Composer;I)V", "PreviewFilled", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class AttributesDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttributesDialog$lambda$0(List attributes, Function0 onDismiss, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(attributes, "$attributes");
        Intrinsics.checkNotNullParameter(onDismiss, "$onDismiss");
        AttributesDialog(attributes, onDismiss, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewEmpty$lambda$1(int i, Composer composer, int i2) {
        PreviewEmpty(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFilled$lambda$3(int i, Composer composer, int i2) {
        PreviewFilled(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AttributesDialog(final List<Attribute> attributes, final Function0<Unit> onDismiss, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(643387196);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AttributesDialog)29@1127L1014,29@1109L1032:AttributesDialog.kt#4ipo3i");
        AndroidDialog_androidKt.Dialog(onDismiss, null, ComposableLambdaKt.rememberComposableLambda(123763411, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.AttributesDialogKt.AttributesDialog.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                ComposerKt.sourceInformation(composer2, "C34@1270L865,30@1137L998:AttributesDialog.kt#4ipo3i");
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    Modifier modifierM1487widthInVpY3zN4$default = SizeKt.m1487widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, C1959Dp.m7055constructorimpl(300), 1, null);
                    RoundedCornerShape roundedCornerShapeM1718RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1718RoundedCornerShape0680j_4(C1959Dp.m7055constructorimpl(16));
                    final List<Attribute> list = attributes;
                    CardKt.Card(modifierM1487widthInVpY3zN4$default, roundedCornerShapeM1718RoundedCornerShape0680j_4, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1912317627, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.AttributesDialogKt.AttributesDialog.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                            invoke(columnScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope Card, Composer composer3, int i3) {
                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                            ComposerKt.sourceInformation(composer3, "C35@1284L841:AttributesDialog.kt#4ipo3i");
                            if ((i3 & 81) != 16 || !composer3.getSkipping()) {
                                Modifier modifierM1435padding3ABfNKs = PaddingKt.m1435padding3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(16));
                                List<Attribute> list2 = list;
                                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM1435padding3ABfNKs);
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
                                ComposerKt.sourceInformationMarkerStart(composer3, -1185399854, "C:AttributesDialog.kt#4ipo3i");
                                if (list2.isEmpty()) {
                                    composer3.startReplaceGroup(-1185395422);
                                    ComposerKt.sourceInformation(composer3, "37@1382L48");
                                    TextKt.m3128Text4IGK_g("The field doesn't contain any attribute.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 6, 0, 131070);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-1185284535);
                                    ComposerKt.sourceInformation(composer3, "43@1696L10,39@1476L264,45@1761L19,*48@1940L10,49@2012L11,47@1846L186,50@2057L14");
                                    TextKt.m3128Text4IGK_g("Field attributes", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6937boximpl(TextAlign.INSTANCE.m6944getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleMedium(), composer3, 6, 0, 65022);
                                    Composer composer4 = composer3;
                                    DividerKt.m2507HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer4, 0, 7);
                                    for (Attribute attribute : list2) {
                                        TextKt.m3128Text4IGK_g(attribute.getKey(), PaddingKt.m1439paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C1959Dp.m7055constructorimpl(10), 0.0f, 0.0f, 13, null), MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer3, 48, 0, 65528);
                                        TextKt.m3128Text4IGK_g(attribute.getValue(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                        composer4 = composer3;
                                    }
                                    composer3.endReplaceGroup();
                                }
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
                    }, composer2, 54), composer2, 196614, 28);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i >> 3) & 14) | 384, 2);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.AttributesDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttributesDialogKt.AttributesDialog$lambda$0(attributes, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewEmpty(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(382245772);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PreviewEmpty)63@2394L16,64@2442L7,65@2454L117:AttributesDialog.kt#4ipo3i");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ScreenDataKt.ReadScreenData(composerStartRestartGroup, 0);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$AttributesDialogKt.INSTANCE.m7597getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.AttributesDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttributesDialogKt.PreviewEmpty$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewFilled(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1857624157);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PreviewFilled)75@2713L16,76@2761L7,77@2784L41,78@2830L615:AttributesDialog.kt#4ipo3i");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ScreenDataKt.ReadScreenData(composerStartRestartGroup, 0);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            composerStartRestartGroup.startReplaceGroup(-1106910553);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):AttributesDialog.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = IdResultScreenKt.getMockIdResultData(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$AttributesDialogKt.INSTANCE.m7599getLambda4$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.AttributesDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttributesDialogKt.PreviewFilled$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
