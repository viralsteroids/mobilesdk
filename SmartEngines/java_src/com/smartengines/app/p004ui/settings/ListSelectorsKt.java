package com.smartengines.app.p004ui.settings;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.RotateKt;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.C3069R;
import com.smartengines.app.p004ui.AppContentKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.dictionaries.KeyName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ListSelectors.kt */
@Metadata(m513d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u001a?\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001a_\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0013\u0012\u0004\u0012\u00020\b0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0017\u001a3\u0010\u0018\u001a\u0004\u0018\u00010\u00152\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u001aA\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u00152\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010\u001d\u001a\r\u0010!\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\"\u001a\r\u0010#\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\"\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00048CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$²\u0006\n\u0010%\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020\u0015X\u008a\u008e\u0002"}, m514d2 = {"ICON_SIZE", "Landroidx/compose/ui/unit/Dp;", "F", "ICON_COLOR", "Landroidx/compose/ui/graphics/Color;", "getICON_COLOR", "(Landroidx/compose/runtime/Composer;I)J", "SingleFromList", "", AnnotatedPrivateKey.LABEL, "", "value", "onChange", "Lkotlin/Function1;", "choices", "", "Lcom/smartengines/dictionaries/KeyName;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "MultiFromList", "", "invertedLogic", "", "initiallyExpanded", "(Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Ljava/util/List;ZZLandroidx/compose/runtime/Composer;II)V", "calculateValueAll", "(Ljava/util/Set;Ljava/util/List;Z)Ljava/lang/Boolean;", "all", "calculateValueOnCheckAllClick", "valueAll", "(Ljava/lang/Boolean;Ljava/util/Set;Ljava/util/List;Z)Ljava/util/Set;", "previewChoices", "getPreviewChoices", "()Ljava/util/List;", "Preview_Dark", "(Landroidx/compose/runtime/Composer;I)V", "Preview_Light", "app_storeRelease", "expanded"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ListSelectorsKt {
    private static final float ICON_SIZE = C1959Dp.m7055constructorimpl(24);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiFromList$lambda$16(String label, Set value, Function1 onChange, List choices, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(label, "$label");
        Intrinsics.checkNotNullParameter(value, "$value");
        Intrinsics.checkNotNullParameter(onChange, "$onChange");
        Intrinsics.checkNotNullParameter(choices, "$choices");
        MultiFromList(label, value, onChange, choices, z, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Dark$lambda$20(int i, Composer composer, int i2) {
        Preview_Dark(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Light$lambda$21(int i, Composer composer, int i2) {
        Preview_Light(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleFromList$lambda$7(String label, String value, Function1 onChange, List choices, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(label, "$label");
        Intrinsics.checkNotNullParameter(value, "$value");
        Intrinsics.checkNotNullParameter(onChange, "$onChange");
        Intrinsics.checkNotNullParameter(choices, "$choices");
        SingleFromList(label, value, onChange, choices, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getICON_COLOR(Composer composer, int i) {
        composer.startReplaceGroup(2062999137);
        ComposerKt.sourceInformation(composer, "C39@1628L11:ListSelectors.kt#v86m6v");
        long primary = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary();
        composer.endReplaceGroup();
        return primary;
    }

    public static final void SingleFromList(final String label, final String value, final Function1<? super String, Unit> onChange, final List<KeyName> choices, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        Intrinsics.checkNotNullParameter(choices, "choices");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1761951752);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SingleFromList)P(1,3,2)48@1803L38,50@1847L1672:ListSelectors.kt#v86m6v");
        composerStartRestartGroup.startReplaceGroup(90520749);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ListSelectors.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(AppContentKt.isPreview()), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1944946593, "C52@1885L289,62@2278L1235,60@2217L1296:ListSelectors.kt#v86m6v");
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composerStartRestartGroup);
        Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2079645890, "C53@1976L32,54@2046L24,54@2072L92,54@2021L143:ListSelectors.kt#v86m6v");
        TextKt.m3128Text4IGK_g(label, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i & 14, 0, 131068);
        composerStartRestartGroup.startReplaceGroup(2006750077);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ListSelectors.kt#9igjgp");
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.smartengines.app.ui.settings.ListSelectorsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ListSelectorsKt.SingleFromList$lambda$6$lambda$5$lambda$4$lambda$3(mutableState);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceGroup();
        ButtonKt.OutlinedButton((Function0) objRememberedValue2, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1675693628, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ListSelectorsKt$SingleFromList$1$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                invoke(rowScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope OutlinedButton, Composer composer2, int i2) {
                Object next;
                String name;
                Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                ComposerKt.sourceInformation(composer2, "C55@2090L60:ListSelectors.kt#v86m6v");
                if ((i2 & 81) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                List<KeyName> list = choices;
                String str = value;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.areEqual(((KeyName) next).getKey(), str)) {
                            break;
                        }
                    }
                }
                KeyName keyName = (KeyName) next;
                if (keyName == null || (name = keyName.getName()) == null) {
                    name = "[ " + value + " ]";
                }
                TextKt.m3128Text4IGK_g(name, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306374, 510);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, SingleFromList$lambda$1(mutableState), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-1424090170, true, new ListSelectorsKt$SingleFromList$1$2(choices, onChange, mutableState, value), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 30);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.ListSelectorsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ListSelectorsKt.SingleFromList$lambda$7(label, value, onChange, choices, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean SingleFromList$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SingleFromList$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleFromList$lambda$6$lambda$5$lambda$4$lambda$3(MutableState expanded$delegate) {
        Intrinsics.checkNotNullParameter(expanded$delegate, "$expanded$delegate");
        SingleFromList$lambda$2(expanded$delegate, !SingleFromList$lambda$1(expanded$delegate));
        return Unit.INSTANCE;
    }

    public static final void MultiFromList(final String label, final Set<String> value, final Function1<? super Set<String>, Unit> onChange, final List<KeyName> choices, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        final MutableState mutableState;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        Intrinsics.checkNotNullParameter(choices, "choices");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1119301866);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MultiFromList)P(3,5,4!1,2)108@3860L84,112@4028L3184:ListSelectors.kt#v86m6v");
        final boolean z3 = (i2 & 16) != 0 ? false : z;
        boolean z4 = (i2 & 32) != 0 ? false : z2;
        composerStartRestartGroup.startReplaceGroup(552591390);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ListSelectors.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(AppContentKt.isPreview() ? true : z4), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState2 = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceGroup();
        final Boolean boolCalculateValueAll = calculateValueAll(value, choices, z3);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1510961335, "C114@4066L1273,150@5444L1761,148@5383L1822:ListSelectors.kt#v86m6v");
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composerStartRestartGroup);
        Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 66971886, "C125@4585L10,126@4624L296,116@4196L738,136@4969L32,138@5066L24,138@5092L237,138@5045L284:ListSelectors.kt#v86m6v");
        Modifier modifierM1023clickableXHw0xAI$default = ClickableKt.m1023clickableXHw0xAI$default(SizeKt.m1480size3ABfNKs(PaddingKt.m1437paddingVpY3zN4$default(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(10), 0.0f, 2, null), ICON_SIZE), false, null, null, new Function0() { // from class: com.smartengines.app.ui.settings.ListSelectorsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListSelectorsKt.MultiFromList$lambda$15$lambda$14$lambda$11(onChange, boolCalculateValueAll, value, choices, z3);
            }
        }, 7, null);
        long icon_color = getICON_COLOR(composerStartRestartGroup, 0);
        if (Intrinsics.areEqual((Object) boolCalculateValueAll, (Object) true)) {
            i3 = C3069R.drawable.ic_check_box_checked;
        } else if (Intrinsics.areEqual((Object) boolCalculateValueAll, (Object) false)) {
            i3 = C3069R.drawable.ic_check_box_unchecked;
        } else {
            if (boolCalculateValueAll != null) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = C3069R.drawable.ic_check_box_indeterminate;
        }
        IconKt.m2584Iconww6aTOc(PainterResources_androidKt.painterResource(i3, composerStartRestartGroup, 0), "", modifierM1023clickableXHw0xAI$default, icon_color, composerStartRestartGroup, 56, 0);
        final boolean z5 = z3;
        TextKt.m3128Text4IGK_g(label, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i & 14, 0, 131068);
        composerStartRestartGroup.startReplaceGroup(1803302432);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ListSelectors.kt#9igjgp");
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            mutableState = mutableState2;
            objRememberedValue2 = new Function0() { // from class: com.smartengines.app.ui.settings.ListSelectorsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ListSelectorsKt.MultiFromList$lambda$15$lambda$14$lambda$13$lambda$12(mutableState);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        } else {
            mutableState = mutableState2;
        }
        composerStartRestartGroup.endReplaceGroup();
        IconButtonKt.IconButton((Function0) objRememberedValue2, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(947929933, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ListSelectorsKt$MultiFromList$1$1$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                ComposerKt.sourceInformation(composer2, "C140@5136L42,142@5286L10,139@5110L205:ListSelectors.kt#v86m6v");
                if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                    IconKt.m2584Iconww6aTOc(PainterResources_androidKt.painterResource(C3069R.drawable.ic_arrow_right, composer2, 0), "", RotateKt.rotate(Modifier.INSTANCE, ListSelectorsKt.MultiFromList$lambda$9(mutableState) ? 90.0f : 0.0f), ListSelectorsKt.getICON_COLOR(composer2, 0), composer2, 56, 0);
                } else {
                    composer2.skipToGroupEnd();
                }
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, MultiFromList$lambda$9(mutableState), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(900392420, true, new ListSelectorsKt$MultiFromList$1$2(choices, onChange, value, z5), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 30);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z6 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.ListSelectorsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ListSelectorsKt.MultiFromList$lambda$16(label, value, onChange, choices, z5, z6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void MultiFromList$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MultiFromList$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiFromList$lambda$15$lambda$14$lambda$11(Function1 onChange, Boolean bool, Set value, List choices, boolean z) {
        Intrinsics.checkNotNullParameter(onChange, "$onChange");
        Intrinsics.checkNotNullParameter(value, "$value");
        Intrinsics.checkNotNullParameter(choices, "$choices");
        onChange.invoke(calculateValueOnCheckAllClick(bool, value, choices, z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiFromList$lambda$15$lambda$14$lambda$13$lambda$12(MutableState expanded$delegate) {
        Intrinsics.checkNotNullParameter(expanded$delegate, "$expanded$delegate");
        MultiFromList$lambda$10(expanded$delegate, !MultiFromList$lambda$9(expanded$delegate));
        return Unit.INSTANCE;
    }

    private static final Boolean calculateValueAll(Set<String> set, List<KeyName> list, boolean z) {
        boolean zContains = set.contains(((KeyName) CollectionsKt.first((List) list)).getKey());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (set.contains(((KeyName) it.next()).getKey()) != zContains) {
                return null;
            }
        }
        if (z) {
            zContains = !zContains;
        }
        return Boolean.valueOf(zContains);
    }

    private static final Set<String> all(List<KeyName> list) {
        List<KeyName> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((KeyName) it.next()).getKey());
        }
        return CollectionsKt.toSet(arrayList);
    }

    private static final Set<String> calculateValueOnCheckAllClick(Boolean bool, Set<String> set, List<KeyName> list, boolean z) {
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            Set<String> setAll = all(list);
            return z ? SetsKt.plus((Set) set, (Iterable) setAll) : SetsKt.minus((Set) set, (Iterable) setAll);
        }
        if (Intrinsics.areEqual((Object) bool, (Object) false)) {
            Set<String> setAll2 = all(list);
            return z ? SetsKt.minus((Set) set, (Iterable) setAll2) : SetsKt.plus((Set) set, (Iterable) setAll2);
        }
        if (bool != null) {
            throw new NoWhenBranchMatchedException();
        }
        Set<String> setAll3 = all(list);
        return z ? SetsKt.plus((Set) set, (Iterable) setAll3) : SetsKt.minus((Set) set, (Iterable) setAll3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KeyName> getPreviewChoices() {
        return CollectionsKt.listOf((Object[]) new KeyName[]{new KeyName("one", "First"), new KeyName("two", "Second"), new KeyName("three", "Third"), new KeyName("four", "Fourth"), new KeyName("five", "Fifths")});
    }

    private static final void Preview_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(855647818);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Dark)239@8675L704:ListSelectors.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$ListSelectorsKt.INSTANCE.m7753getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.ListSelectorsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ListSelectorsKt.Preview_Dark$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Light(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1915694444);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Light)266@9504L285:ListSelectors.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(false, ComposableSingletons$ListSelectorsKt.INSTANCE.m7755getLambda4$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.ListSelectorsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ListSelectorsKt.Preview_Light$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
