package com.smartengines.app.com.smartengines.app.p003ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppExitDialog.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$AppExitDialogKt {
    public static final ComposableSingletons$AppExitDialogKt INSTANCE = new ComposableSingletons$AppExitDialogKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f1958lambda1 = ComposableLambdaKt.composableLambdaInstance(-1189245467, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.com.smartengines.app.ui.ComposableSingletons$AppExitDialogKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            ComposerKt.sourceInformation(composer, "C47@1862L14:AppExitDialog.kt#bje8no");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TextKt.m3128Text4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f1959lambda2 = ComposableLambdaKt.composableLambdaInstance(-1191938034, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.com.smartengines.app.ui.ComposableSingletons$AppExitDialogKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            ComposerKt.sourceInformation(composer, "C54@2168L10:AppExitDialog.kt#bje8no");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TextKt.m3128Text4IGK_g("OK", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f1960lambda3 = ComposableLambdaKt.composableLambdaInstance(-1087395011, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.com.smartengines.app.ui.ComposableSingletons$AppExitDialogKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C69@2526L15:AppExitDialog.kt#bje8no");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                AppExitDialogKt.AppExitDialog(composer, 0);
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f1961lambda4 = ComposableLambdaKt.composableLambdaInstance(-1110442270, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.com.smartengines.app.ui.ComposableSingletons$AppExitDialogKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C68@2504L47:AppExitDialog.kt#bje8no");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$AppExitDialogKt.INSTANCE.m7378getLambda3$app_storeRelease(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7376getLambda1$app_storeRelease() {
        return f1958lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7377getLambda2$app_storeRelease() {
        return f1959lambda2;
    }

    /* renamed from: getLambda-3$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7378getLambda3$app_storeRelease() {
        return f1960lambda3;
    }

    /* renamed from: getLambda-4$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7379getLambda4$app_storeRelease() {
        return f1961lambda4;
    }
}
