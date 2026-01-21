package com.smartengines.app.p004ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.smartengines.app.Photo;
import com.smartengines.app.PhotoTakingState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhotoDialog.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.ComposableSingletons$PhotoDialogKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$PhotoDialogKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$PhotoDialogKt$lambda3$1 INSTANCE = new ComposableSingletons$PhotoDialogKt$lambda3$1();

    ComposableSingletons$PhotoDialogKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Photo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C113@3734L92:PhotoDialog.kt#83idza");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            PhotoDialogKt.PhotoDialogContent(new Function0() { // from class: com.smartengines.app.ui.ComposableSingletons$PhotoDialogKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, new Function1() { // from class: com.smartengines.app.ui.ComposableSingletons$PhotoDialogKt$lambda-3$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$PhotoDialogKt$lambda3$1.invoke$lambda$1((Photo) obj);
                }
            }, PhotoTakingState.InProgress.INSTANCE, ComposableSingletons$PhotoDialogKt.INSTANCE.m7484getLambda2$app_storeRelease(), composer, 3510);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
