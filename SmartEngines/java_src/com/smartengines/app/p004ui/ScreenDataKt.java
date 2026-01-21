package com.smartengines.app.p004ui;

import android.content.res.Configuration;
import androidx.compose.material3.adaptive.AndroidWindowAdaptiveInfo_androidKt;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.window.core.layout.WindowHeightSizeClass;
import androidx.window.core.layout.WindowSizeClass;
import androidx.window.core.layout.WindowWidthSizeClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenData.kt */
@Metadata(m513d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m514d2 = {"screenData", "Lcom/smartengines/app/ui/ScreenData;", "getScreenData", "()Lcom/smartengines/app/ui/ScreenData;", "setScreenData", "(Lcom/smartengines/app/ui/ScreenData;)V", "ReadScreenData", "", "(Landroidx/compose/runtime/Composer;I)V", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ScreenDataKt {
    public static ScreenData screenData;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReadScreenData$lambda$1(int i, Composer composer, int i2) {
        ReadScreenData(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final ScreenData getScreenData() {
        ScreenData screenData2 = screenData;
        if (screenData2 != null) {
            return screenData2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screenData");
        return null;
    }

    public static final void setScreenData(ScreenData screenData2) {
        Intrinsics.checkNotNullParameter(screenData2, "<set-?>");
        screenData = screenData2;
    }

    public static final void ReadScreenData(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-492527274);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ReadScreenData)25@771L7,26@822L27,27@883L334:ScreenData.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localConfiguration);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Configuration configuration = (Configuration) objConsume;
            WindowSizeClass windowSizeClass = AndroidWindowAdaptiveInfo_androidKt.currentWindowAdaptiveInfo(composerStartRestartGroup, 0).getWindowSizeClass();
            composerStartRestartGroup.startReplaceGroup(-426446098);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ScreenData.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                ScreenData screenData2 = new ScreenData(C1959Dp.m7055constructorimpl(configuration.screenWidthDp), C1959Dp.m7055constructorimpl(configuration.screenHeightDp), !Intrinsics.areEqual(windowSizeClass.getWindowWidthSizeClass(), WindowWidthSizeClass.COMPACT), !Intrinsics.areEqual(windowSizeClass.getWindowHeightSizeClass(), WindowHeightSizeClass.COMPACT), null);
                composerStartRestartGroup.updateRememberedValue(screenData2);
                objRememberedValue = screenData2;
            }
            composerStartRestartGroup.endReplaceGroup();
            setScreenData((ScreenData) objRememberedValue);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.ScreenDataKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenDataKt.ReadScreenData$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
