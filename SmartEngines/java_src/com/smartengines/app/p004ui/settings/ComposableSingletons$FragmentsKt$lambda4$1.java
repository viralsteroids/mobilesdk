package com.smartengines.app.p004ui.settings;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Fragments.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.settings.ComposableSingletons$FragmentsKt$lambda-4$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$FragmentsKt$lambda4$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$FragmentsKt$lambda4$1 INSTANCE = new ComposableSingletons$FragmentsKt$lambda4$1();

    ComposableSingletons$FragmentsKt$lambda4$1() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope Section, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Section, "$this$Section");
        ComposerKt.sourceInformation(composer, "C201@6348L23,202@6388L43,203@6448L33,204@6498L34:Fragments.kt#v86m6v");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            FragmentsKt.LinkRow("Link row", new Function0() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$FragmentsKt$lambda-4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, composer, 54);
            FragmentsKt.IntRow("Int row", 13, 0, 13, 1, new Function1() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$FragmentsKt$lambda-4$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$FragmentsKt$lambda4$1.invoke$lambda$1(((Integer) obj).intValue());
                }
            }, false, composer, 224694, 64);
            FragmentsKt.BooleanRow("Boolean row", true, new Function1() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$FragmentsKt$lambda-4$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$FragmentsKt$lambda4$1.invoke$lambda$2(((Boolean) obj).booleanValue());
                }
            }, composer, 438);
            FragmentsKt.StringRow("String row", "value", new Function1() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$FragmentsKt$lambda-4$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$FragmentsKt$lambda4$1.invoke$lambda$3((String) obj);
                }
            }, composer, 438);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
