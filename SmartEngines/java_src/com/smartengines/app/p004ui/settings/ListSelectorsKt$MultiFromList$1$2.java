package com.smartengines.app.p004ui.settings;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
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
import com.smartengines.app.C3069R;
import com.smartengines.dictionaries.KeyName;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListSelectors.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
final class ListSelectorsKt$MultiFromList$1$2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ List<KeyName> $choices;
    final /* synthetic */ boolean $invertedLogic;
    final /* synthetic */ Function1<Set<String>, Unit> $onChange;
    final /* synthetic */ Set<String> $value;

    /* JADX WARN: Multi-variable type inference failed */
    ListSelectorsKt$MultiFromList$1$2(List<KeyName> list, Function1<? super Set<String>, Unit> function1, Set<String> set, boolean z) {
        this.$choices = list;
        this.$onChange = function1;
        this.$value = set;
        this.$invertedLogic = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        int i2;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation(composer2, "C155@5616L11,151@5458L1737:ListSelectors.kt#v86m6v");
        float f = 0.0f;
        int i3 = 1;
        Object obj = null;
        float f2 = 3;
        float f3 = 8;
        Modifier modifierM1435padding3ABfNKs = PaddingKt.m1435padding3ABfNKs(BorderKt.m1001borderxT4_qwU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1959Dp.m7055constructorimpl(f2), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurface(), RoundedCornerShapeKt.m1718RoundedCornerShape0680j_4(C1959Dp.m7055constructorimpl(f3))), C1959Dp.m7055constructorimpl(f3));
        List<KeyName> list = this.$choices;
        final Function1<Set<String>, Unit> function1 = this.$onChange;
        final Set<String> set = this.$value;
        boolean z = this.$invertedLogic;
        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
        String str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1435padding3ABfNKs);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        float f4 = f2;
        boolean z2 = z;
        String str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor);
        } else {
            composer2.useNode();
        }
        Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer2);
        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer2, 1846835334, "C:ListSelectors.kt#v86m6v");
        composer2.startReplaceGroup(-217519083);
        ComposerKt.sourceInformation(composer2, "*161@5831L1332");
        for (final KeyName keyName : list) {
            Modifier modifierM1435padding3ABfNKs2 = PaddingKt.m1435padding3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m1023clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, new Function0() { // from class: com.smartengines.app.ui.settings.ListSelectorsKt$MultiFromList$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ListSelectorsKt$MultiFromList$1$2.invoke$lambda$4$lambda$3$lambda$1(function1, keyName, set);
                }
            }, 7, null), f, i3, obj), C1959Dp.m7055constructorimpl(f4));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1435padding3ABfNKs2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composer2);
            Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -134918565, "C175@6469L10,176@6519L521,173@6338L728,186@7091L50:ListSelectors.kt#v86m6v");
            Modifier modifierM1480size3ABfNKs = SizeKt.m1480size3ABfNKs(Modifier.INSTANCE, ListSelectorsKt.ICON_SIZE);
            long icon_color = ListSelectorsKt.getICON_COLOR(composer2, 0);
            if (z2) {
                i2 = set.contains(keyName.getKey()) ? C3069R.drawable.ic_check_box_unchecked : C3069R.drawable.ic_check_box_checked;
            } else {
                i2 = set.contains(keyName.getKey()) ? C3069R.drawable.ic_check_box_checked : C3069R.drawable.ic_check_box_unchecked;
            }
            IconKt.m2584Iconww6aTOc(PainterResources_androidKt.painterResource(i2, composer2, 0), "", modifierM1480size3ABfNKs, icon_color, composer2, 440, 0);
            TextKt.m3128Text4IGK_g(keyName.getName(), PaddingKt.m1439paddingqDBjuR0$default(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(10), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 48, 0, 131068);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer2 = composer;
            str = str;
            f4 = f4;
            set = set;
            z2 = z2;
            f = 0.0f;
            i3 = i3;
            function1 = function1;
            obj = obj;
            str2 = str2;
        }
        composer.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$1(Function1 onChange, KeyName choice, Set value) {
        Intrinsics.checkNotNullParameter(onChange, "$onChange");
        Intrinsics.checkNotNullParameter(choice, "$choice");
        Intrinsics.checkNotNullParameter(value, "$value");
        String key = choice.getKey();
        onChange.invoke(value.contains(key) ? SetsKt.minus((Set<? extends String>) value, key) : SetsKt.plus((Set<? extends String>) value, key));
        return Unit.INSTANCE;
    }
}
