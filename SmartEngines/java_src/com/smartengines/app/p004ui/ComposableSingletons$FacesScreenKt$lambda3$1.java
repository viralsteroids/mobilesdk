package com.smartengines.app.p004ui;

import android.graphics.Bitmap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.smartengines.app.com.smartengines.app.SlotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FacesScreen.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.ComposableSingletons$FacesScreenKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$FacesScreenKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$FacesScreenKt$lambda3$1 INSTANCE = new ComposableSingletons$FacesScreenKt$lambda3$1();

    ComposableSingletons$FacesScreenKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C188@6216L142:FacesScreen.kt#83idza");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            FacesScreenKt.FacesScreen(CollectionsKt.listOf((Object[]) new SlotState[]{SlotState.CAMERA.INSTANCE, SlotState.EMPTY.INSTANCE}), null, new Function1() { // from class: com.smartengines.app.ui.ComposableSingletons$FacesScreenKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$FacesScreenKt$lambda3$1.invoke$lambda$0(((Integer) obj).intValue());
                }
            }, new Function0() { // from class: com.smartengines.app.ui.ComposableSingletons$FacesScreenKt$lambda-3$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, new Function1() { // from class: com.smartengines.app.ui.ComposableSingletons$FacesScreenKt$lambda-3$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$FacesScreenKt$lambda3$1.invoke$lambda$2((Bitmap) obj);
                }
            }, new Function0() { // from class: com.smartengines.app.ui.ComposableSingletons$FacesScreenKt$lambda-3$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, ComposableSingletons$FacesScreenKt.INSTANCE.m7439getLambda2$app_storeRelease(), composer, 1797558);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
