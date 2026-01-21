package com.smartengines.app.p004ui;

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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: ErrorDialog.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.ComposableSingletons$ErrorDialogKt$lambda-4$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$ErrorDialogKt$lambda4$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ErrorDialogKt$lambda4$1 INSTANCE = new ComposableSingletons$ErrorDialogKt$lambda4$1();

    ComposableSingletons$ErrorDialogKt$lambda4$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C75@2690L49,76@2752L28:ErrorDialog.kt#83idza");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            ErrorDialogKt.ErrorDialog(new Throwable("The error description"), new Function0() { // from class: com.smartengines.app.ui.ComposableSingletons$ErrorDialogKt$lambda-4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, composer, 56);
            TextKt.m3128Text4IGK_g("Error dialog preview", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
