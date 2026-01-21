package com.smartengines.app.p004ui;

import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.C3069R;
import com.smartengines.engine.SessionSettingsLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: SessionSettingsScreen.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$SessionSettingsScreenKt {
    public static final ComposableSingletons$SessionSettingsScreenKt INSTANCE = new ComposableSingletons$SessionSettingsScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2051lambda1 = ComposableLambdaKt.composableLambdaInstance(243895840, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$SessionSettingsScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C51@1972L56,51@1967L71:SessionSettingsScreen.kt#83idza");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                IconKt.m2584Iconww6aTOc(PainterResources_androidKt.painterResource(C3069R.drawable.ic_back, composer, 0), "back", (Modifier) null, 0L, composer, 56, 12);
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2052lambda2 = ComposableLambdaKt.composableLambdaInstance(-1597445447, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$SessionSettingsScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C111@4362L392:SessionSettingsScreen.kt#83idza");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SessionSettingsScreenKt.SessionSettingsScreen(CollectionsKt.listOf((Object[]) new SessionSettingsLogger.Action[]{new SessionSettingsLogger.Action("SetOption", CollectionsKt.listOf((Object[]) new String[]{"code_txt_line.rcbic.enabled", "false"})), new SessionSettingsLogger.Action("SetOption", CollectionsKt.listOf((Object[]) new String[]{"barcode.effortLevel", "normal"})), new SessionSettingsLogger.Action("SetCurrentMode", CollectionsKt.listOf("anydoc")), new SessionSettingsLogger.Action("SetOption", CollectionsKt.listOf((Object[]) new String[]{"bank_card.extractBankCardImages.enabled_long", "true"}))}), composer, 8, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2053lambda3 = ComposableLambdaKt.composableLambdaInstance(-1620492706, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$SessionSettingsScreenKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C110@4338L426:SessionSettingsScreen.kt#83idza");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$SessionSettingsScreenKt.INSTANCE.m7508getLambda2$app_storeRelease(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7507getLambda1$app_storeRelease() {
        return f2051lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7508getLambda2$app_storeRelease() {
        return f2052lambda2;
    }

    /* renamed from: getLambda-3$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7509getLambda3$app_storeRelease() {
        return f2053lambda3;
    }
}
