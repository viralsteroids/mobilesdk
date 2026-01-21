package com.smartengines.app.p004ui.settings;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.datastore.preferences.core.PreferencesFactory;
import com.smartengines.app.mock.MockDocSettingsWriter;
import com.smartengines.app.settings.DocSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeDoc.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$HomeDocKt {
    public static final ComposableSingletons$HomeDocKt INSTANCE = new ComposableSingletons$HomeDocKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f2148lambda1 = ComposableLambdaKt.composableLambdaInstance(189810532, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$HomeDocKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope SettingsScaffold, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
            ComposerKt.sourceInformation(composer, "C45@1699L111:HomeDoc.kt#v86m6v");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                HomeDocKt.HomeDoc(new DocSettings(PreferencesFactory.createEmpty()), new MockDocSettingsWriter(), composer, DocSettings.$stable, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2149lambda2 = ComposableLambdaKt.composableLambdaInstance(-630749892, false, ComposableSingletons$HomeDocKt$lambda2$1.INSTANCE);

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7734getLambda1$app_storeRelease() {
        return f2148lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7735getLambda2$app_storeRelease() {
        return f2149lambda2;
    }
}
