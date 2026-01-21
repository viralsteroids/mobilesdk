package com.smartengines.app.p004ui.theme;

import androidx.compose.material3.Typography;
import androidx.compose.p000ui.layout.LayoutKt;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.unit.TextUnitKt;
import kotlin.Metadata;

/* compiled from: Type.kt */
@Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m514d2 = {"Typography", "Landroidx/compose/material3/Typography;", "getTypography", "()Landroidx/compose/material3/Typography;", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TypeKt {
    private static final Typography Typography;

    static {
        Typography typography = new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LayoutKt.LargeDimension, null);
        Typography = typography.copy((20351 & 1) != 0 ? typography.displayLarge : null, (20351 & 2) != 0 ? typography.displayMedium : null, (20351 & 4) != 0 ? typography.displaySmall : null, (20351 & 8) != 0 ? typography.headlineLarge : null, (20351 & 16) != 0 ? typography.headlineMedium : null, (20351 & 32) != 0 ? typography.headlineSmall : null, (20351 & 64) != 0 ? typography.titleLarge : null, (20351 & 128) != 0 ? typography.titleMedium : TextStyle.m6553copyp1EtxEg$default(typography.getTitleMedium(), 0L, TextUnitKt.getSp(20), FontWeight.INSTANCE.getW700(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777209, null), (20351 & 256) != 0 ? typography.titleSmall : null, (20351 & 512) != 0 ? typography.bodyLarge : null, (20351 & 1024) != 0 ? typography.bodyMedium : null, (20351 & 2048) != 0 ? typography.bodySmall : null, (20351 & 4096) != 0 ? typography.labelLarge : TextStyle.m6553copyp1EtxEg$default(typography.getLabelLarge(), 0L, TextUnitKt.getSp(16), FontWeight.INSTANCE.getW600(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777209, null), (20351 & 8192) != 0 ? typography.labelMedium : TextStyle.m6553copyp1EtxEg$default(typography.getLabelMedium(), 0L, TextUnitKt.getSp(12), FontWeight.INSTANCE.getW600(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777209, null), (20351 & 16384) != 0 ? typography.labelSmall : null);
    }

    public static final Typography getTypography() {
        return Typography;
    }
}
