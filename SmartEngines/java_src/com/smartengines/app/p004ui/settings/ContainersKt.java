package com.smartengines.app.p004ui.settings;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.AppKt;
import com.smartengines.app.p004ui.AppContentKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.CodeSettings;
import com.smartengines.app.settings.CodeSettingsStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: Containers.kt */
@Metadata(m513d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\n"}, m514d2 = {"SettingsContainers", "", "onBack", "Lkotlin/Function0;", "codeSettings", "Lcom/smartengines/app/settings/CodeSettings;", "(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/CodeSettings;Landroidx/compose/runtime/Composer;I)V", "Preview_Dark", "(Landroidx/compose/runtime/Composer;I)V", "Preview_Light", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ContainersKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Dark$lambda$1(int i, Composer composer, int i2) {
        Preview_Dark(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Light$lambda$2(int i, Composer composer, int i2) {
        Preview_Light(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsContainers$lambda$0(Function0 onBack, CodeSettings codeSettings, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(onBack, "$onBack");
        Intrinsics.checkNotNullParameter(codeSettings, "$codeSettings");
        SettingsContainers(onBack, codeSettings, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SettingsContainers(final Function0<Unit> onBack, final CodeSettings codeSettings, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(codeSettings, "codeSettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(1851339616);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SettingsContainers)P(1)18@660L233,18@621L272:Containers.kt#v86m6v");
        FragmentsKt.SettingsScaffold("Контейнеры", onBack, ComposableLambdaKt.rememberComposableLambda(2013960584, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ContainersKt.SettingsContainers.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope SettingsScaffold, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
                ComposerKt.sourceInformation(composer2, "C19@678L209,19@670L217:Containers.kt#v86m6v");
                if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                    final CodeSettings codeSettings2 = codeSettings;
                    FragmentsKt.Section(null, ComposableLambdaKt.rememberComposableLambda(-1752977441, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ContainersKt.SettingsContainers.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                            invoke(columnScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope Section, Composer composer3, int i3) {
                            Intrinsics.checkNotNullParameter(Section, "$this$Section");
                            ComposerKt.sourceInformation(composer3, "C20@692L185:Containers.kt#v86m6v");
                            if ((i3 & 81) != 16 || !composer3.getSkipping()) {
                                FragmentsKt.IntRow("Максимальное число уникальных объектов", codeSettings2.getContainerMax(), 0, 50, 1, new C40081(AppKt.getCodeSettingsStore()), false, composer3, 28038, 64);
                            } else {
                                composer3.skipToGroupEnd();
                            }
                        }

                        /* compiled from: Containers.kt */
                        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                        /* renamed from: com.smartengines.app.ui.settings.ContainersKt$SettingsContainers$1$1$1, reason: invalid class name and collision with other inner class name */
                        /* synthetic */ class C40081 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                            C40081(Object obj) {
                                super(1, obj, CodeSettingsStore.class, "writeContainerMax", "writeContainerMax(I)V", 0);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i) {
                                ((CodeSettingsStore) this.receiver).writeContainerMax(i);
                            }
                        }
                    }, composer2, 54), composer2, 48, 1);
                } else {
                    composer2.skipToGroupEnd();
                }
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i << 3) & LDSFile.EF_DG16_TAG) | 390);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.ContainersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContainersKt.SettingsContainers$lambda$0(onBack, codeSettings, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-650341380);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Dark)36@1130L193:Containers.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$ContainersKt.INSTANCE.m7703getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.ContainersKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContainersKt.Preview_Dark$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Light(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-651011086);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Light)48@1448L194:Containers.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(false, ComposableSingletons$ContainersKt.INSTANCE.m7705getLambda4$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.ContainersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContainersKt.Preview_Light$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
