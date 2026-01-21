package com.smartengines.app.p004ui.settings;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.smartengines.app.ImageSaver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeleteImagesDialog.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.settings.ComposableSingletons$DeleteImagesDialogKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$DeleteImagesDialogKt$lambda3$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$DeleteImagesDialogKt$lambda3$1 INSTANCE = new ComposableSingletons$DeleteImagesDialogKt$lambda3$1();

    ComposableSingletons$DeleteImagesDialogKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope SettingsScaffold, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
        ComposerKt.sourceInformation(composer, "C83@3080L44:DeleteImagesDialog.kt#v86m6v");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            DeleteImagesDialogKt.DeleteImagesDialog(ImageSaver.Dir.Photo, new Function0() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$DeleteImagesDialogKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, composer, 54);
        }
    }
}
