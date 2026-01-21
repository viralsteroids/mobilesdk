package com.smartengines.app.p004ui;

import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.smartengines.app.AppKt;
import com.smartengines.app.Model;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.VisualizationSettings;
import com.smartengines.visualization.IdLivenessInstructions;
import com.smartengines.visualization.InstructionViewKt;
import com.smartengines.visualization.QuadsViewFadingKt;
import com.smartengines.visualization.StepsViewKt;
import com.smartengines.visualization.TimerViewKt;
import com.smartengines.visualization.Visualization;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VisualizationScreen.kt */
@Metadata(m513d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m514d2 = {"VisualizationScreen", "", "visualizations", "", "Lcom/smartengines/visualization/Visualization;", "showQuads", "", "visualizationSettings", "Lcom/smartengines/app/settings/VisualizationSettings;", "(Ljava/util/Collection;ZLcom/smartengines/app/settings/VisualizationSettings;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class VisualizationScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$3(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VisualizationScreen$lambda$2(Collection visualizations, boolean z, VisualizationSettings visualizationSettings, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(visualizations, "$visualizations");
        VisualizationScreen(visualizations, z, visualizationSettings, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void VisualizationScreen(final Collection<? extends Visualization> visualizations, boolean z, VisualizationSettings visualizationSettings, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(visualizations, "visualizations");
        Composer composerStartRestartGroup = composer.startRestartGroup(328509029);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(VisualizationScreen)P(2)25@1100L7:VisualizationScreen.kt#83idza");
        boolean showQuads = (i2 & 2) != 0 ? AppKt.getCommonSettingsStore().getData().getValue().getShowQuads() : z;
        VisualizationSettings visualizationSettings2 = (i2 & 4) != 0 ? Model.INSTANCE.getVisualizationSettings() : visualizationSettings;
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        Density density = (Density) objConsume;
        for (Visualization visualization : visualizations) {
            if (visualization instanceof Visualization.Quads) {
                composerStartRestartGroup.startReplaceGroup(-1549020765);
                ComposerKt.sourceInformation(composerStartRestartGroup, "34@1336L263");
                if (showQuads) {
                    QuadsViewFadingKt.m7841QuadsViewFadingiJQMabo((Visualization.Quads) visualization, visualizationSettings2.m7398getPrimaryLineColor0d7_KjU(), density.mo1127toPx0680j_4(visualizationSettings2.m7399getPrimaryLineWidthD9Ej5fM()), composerStartRestartGroup, Visualization.Quads.$stable);
                }
                composerStartRestartGroup.endReplaceGroup();
            } else if (visualization instanceof Visualization.Instruction) {
                composerStartRestartGroup.startReplaceGroup(-1548567917);
                ComposerKt.sourceInformation(composerStartRestartGroup, "44@1722L212");
                InstructionViewKt.m7838InstructionViewXOJAsU((Visualization.Instruction) visualization, IdLivenessInstructions.INSTANCE.getItems(), visualizationSettings2.m7397getInstructionColor0d7_KjU(), composerStartRestartGroup, Visualization.Instruction.$stable | 64);
                composerStartRestartGroup.endReplaceGroup();
            } else if (visualization instanceof Visualization.Steps) {
                composerStartRestartGroup.startReplaceGroup(-1548269573);
                ComposerKt.sourceInformation(composerStartRestartGroup, "53@2027L76");
                StepsViewKt.StepsView((Visualization.Steps) visualization, composerStartRestartGroup, Visualization.Steps.$stable);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(visualization instanceof Visualization.Timer)) {
                    composerStartRestartGroup.startReplaceGroup(-1296896247);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1548101925);
                ComposerKt.sourceInformation(composerStartRestartGroup, "60@2196L76");
                TimerViewKt.TimerView((Visualization.Timer) visualization, composerStartRestartGroup, Visualization.Timer.$stable);
                composerStartRestartGroup.endReplaceGroup();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z2 = showQuads;
            final VisualizationSettings visualizationSettings3 = visualizationSettings2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.VisualizationScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VisualizationScreenKt.VisualizationScreen$lambda$2(visualizations, z2, visualizationSettings3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1894454930);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview)107@3670L204:VisualizationScreen.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$VisualizationScreenKt.INSTANCE.m7530getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.VisualizationScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VisualizationScreenKt.Preview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
