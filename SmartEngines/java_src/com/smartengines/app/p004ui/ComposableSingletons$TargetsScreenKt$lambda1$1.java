package com.smartengines.app.p004ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.smartengines.app.Model;
import com.smartengines.app.targets.TreeItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TargetsScreen.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.ComposableSingletons$TargetsScreenKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$TargetsScreenKt$lambda1$1 implements Function3<TreeItem, Composer, Integer, Unit> {
    public static final ComposableSingletons$TargetsScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$TargetsScreenKt$lambda1$1();

    ComposableSingletons$TargetsScreenKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(TreeItem treeItem, Composer composer, Integer num) {
        invoke(treeItem, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(final TreeItem node, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(node, "node");
        ComposerKt.sourceInformation(composer, "C119@4631L142:TargetsScreen.kt#83idza");
        if ((i & 14) == 0) {
            i |= composer.changed(node) ? 4 : 2;
        }
        if ((i & 91) != 18 || !composer.getSkipping()) {
            TargetsScreenKt.ItemView(node, new Function0() { // from class: com.smartengines.app.ui.ComposableSingletons$TargetsScreenKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ComposableSingletons$TargetsScreenKt$lambda1$1.invoke$lambda$0(node);
                }
            }, composer, i & 14);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(TreeItem node) {
        Intrinsics.checkNotNullParameter(node, "$node");
        Model.INSTANCE.onNodeClick(node);
        return Unit.INSTANCE;
    }
}
