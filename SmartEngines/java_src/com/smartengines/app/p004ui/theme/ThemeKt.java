package com.smartengines.app.p004ui.theme;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.view.WindowCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: Theme.kt */
@Metadata(m513d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m514d2 = {"DarkColorScheme", "Landroidx/compose/material3/ColorScheme;", "LightColorScheme", "SmartEnginesTheme", "", "darkTheme", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ThemeKt {
    private static final ColorScheme DarkColorScheme;
    private static final ColorScheme LightColorScheme;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SmartEnginesTheme$lambda$1(boolean z, Function2 content, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(content, "$content");
        SmartEnginesTheme(z, content, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static {
        long jM4621getBlack0d7_KjU = Color.INSTANCE.m4621getBlack0d7_KjU();
        long jM4632getWhite0d7_KjU = Color.INSTANCE.m4632getWhite0d7_KjU();
        DarkColorScheme = ColorSchemeKt.m2366darkColorSchemeCXl9yA$default(ColorKt.getPrimaryColor(), Color.INSTANCE.m4621getBlack0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288256409L), Color.INSTANCE.m4632getWhite0d7_KjU(), ColorKt.Color(870575082), 0L, Color.INSTANCE.m4621getBlack0d7_KjU(), Color.INSTANCE.m4632getWhite0d7_KjU(), jM4621getBlack0d7_KjU, jM4632getWhite0d7_KjU, ColorKt.Color(4281545523L), Color.INSTANCE.m4632getWhite0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -519684, 15, null);
        long jM4632getWhite0d7_KjU2 = Color.INSTANCE.m4632getWhite0d7_KjU();
        long jM4621getBlack0d7_KjU2 = Color.INSTANCE.m4621getBlack0d7_KjU();
        LightColorScheme = ColorSchemeKt.m2370lightColorSchemeCXl9yA$default(ColorKt.getPrimaryColor(), Color.INSTANCE.m4632getWhite0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4288256409L), Color.INSTANCE.m4632getWhite0d7_KjU(), ColorKt.Color(4293127146L), 0L, Color.INSTANCE.m4632getWhite0d7_KjU(), Color.INSTANCE.m4621getBlack0d7_KjU(), jM4632getWhite0d7_KjU2, jM4621getBlack0d7_KjU2, ColorKt.Color(4293848814L), Color.INSTANCE.m4621getBlack0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -519684, 15, null);
    }

    public static final void SmartEnginesTheme(final boolean z, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        ColorScheme colorScheme;
        final Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1973284432);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SmartEnginesTheme)P(1)96@3362L7,109@4030L114:Theme.kt#h8ymxh");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & LDSFile.EF_DG16_TAG) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (z) {
                colorScheme = DarkColorScheme;
            } else {
                colorScheme = LightColorScheme;
            }
            final ColorScheme colorScheme2 = colorScheme;
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localView);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final View view = (View) objConsume;
            composerStartRestartGroup.startReplaceGroup(-1121649838);
            ComposerKt.sourceInformation(composerStartRestartGroup, "98@3408L610");
            if (!view.isInEditMode()) {
                EffectsKt.SideEffect(new Function0() { // from class: com.smartengines.app.ui.theme.ThemeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ThemeKt.SmartEnginesTheme$lambda$0(view, colorScheme2, z);
                    }
                }, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            function2 = content;
            MaterialThemeKt.MaterialTheme(colorScheme2, null, TypeKt.getTypography(), function2, composerStartRestartGroup, ((i2 << 6) & 7168) | 384, 2);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function2 = content;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.theme.ThemeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.SmartEnginesTheme$lambda$1(z, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SmartEnginesTheme$lambda$0(View view, ColorScheme colorScheme, boolean z) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(colorScheme, "$colorScheme");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        if (Build.VERSION.SDK_INT >= 26) {
            activity.getWindow().setNavigationBarColor(ColorKt.m4649toArgb8_81llA(ColorKt.m4640compositeOverOWjLjI(Color.m4594copywmQWz5c$default(colorScheme.getPrimary(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4594copywmQWz5c$default(colorScheme.getSurface(), 0.0f, 0.0f, 0.0f, 0.0f, 15, null))));
            activity.getWindow().setStatusBarColor(ColorKt.m4649toArgb8_81llA(colorScheme.getBackground()));
            WindowCompat.getInsetsController(activity.getWindow(), view).setAppearanceLightStatusBars(!z);
            WindowCompat.getInsetsController(activity.getWindow(), view).setAppearanceLightNavigationBars(!z);
        }
        return Unit.INSTANCE;
    }
}
