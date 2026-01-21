package com.smartengines.app.p004ui.settings;

import android.content.Context;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.C3069R;
import com.smartengines.app.ImageSaver;
import com.smartengines.app.p004ui.AppContentKt;
import com.smartengines.app.p004ui.settings.HomeImagesKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeImages.kt */
@Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m514d2 = {"HomeImages", "", "(Landroidx/compose/runtime/Composer;I)V", "Preview_Dark", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class HomeImagesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeImages$lambda$4(int i, Composer composer, int i2) {
        HomeImages(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Dark$lambda$5(int i, Composer composer, int i2) {
        Preview_Dark(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HomeImages(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(506597953);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HomeImages)30@1239L7,31@1269L50,35@1474L11,36@1541L11,34@1421L149,38@1626L339,38@1580L385,*50@2070L24,48@2004L100:HomeImages.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            composerStartRestartGroup.startReplaceGroup(799557664);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeImages.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            FragmentsKt.Section(context.getString(C3069R.string.s_images), ComposableLambdaKt.rememberComposableLambda(-1503299304, true, new C32651(PaddingKt.m1437paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1959Dp.m7055constructorimpl(5), 1, null), ButtonDefaults.INSTANCE.m2243buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getErrorContainer(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnErrorContainer(), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 12), mutableState, context), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
            ImageSaver.Dir dir = (ImageSaver.Dir) mutableState.getValue();
            if (dir != null) {
                composerStartRestartGroup.startReplaceGroup(2118674725);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeImages.kt#9igjgp");
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.smartengines.app.ui.settings.HomeImagesKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeImagesKt.HomeImages$lambda$3$lambda$2$lambda$1(mutableState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                DeleteImagesDialogKt.DeleteImagesDialog(dir, (Function0) objRememberedValue2, composerStartRestartGroup, 48);
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeImagesKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeImagesKt.HomeImages$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: HomeImages.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.settings.HomeImagesKt$HomeImages$1 */
    static final class C32651 implements Function3<ColumnScope, Composer, Integer, Unit> {
        final /* synthetic */ ButtonColors $colors;
        final /* synthetic */ Context $context;
        final /* synthetic */ MutableState<ImageSaver.Dir> $dirToRemove;
        final /* synthetic */ Modifier $modifier;

        C32651(Modifier modifier, ButtonColors buttonColors, MutableState<ImageSaver.Dir> mutableState, Context context) {
            this.$modifier = modifier;
            this.$colors = buttonColors;
            this.$dirToRemove = mutableState;
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(MutableState dirToRemove) {
            Intrinsics.checkNotNullParameter(dirToRemove, "$dirToRemove");
            dirToRemove.setValue(ImageSaver.Dir.Photo);
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope Section, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Section, "$this$Section");
            ComposerKt.sourceInformation(composer, "C39@1643L42,39@1714L79,39@1636L157,42@1809L42,42@1880L79,42@1802L157:HomeImages.kt#v86m6v");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            composer.startReplaceGroup(2118661079);
            ComposerKt.sourceInformation(composer, "CC(remember):HomeImages.kt#9igjgp");
            final MutableState<ImageSaver.Dir> mutableState = this.$dirToRemove;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.smartengines.app.ui.settings.HomeImagesKt$HomeImages$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeImagesKt.C32651.invoke$lambda$1$lambda$0(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            Modifier modifier = this.$modifier;
            ButtonColors buttonColors = this.$colors;
            final Context context = this.$context;
            ButtonKt.Button(function0, modifier, false, null, buttonColors, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-930655992, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.HomeImagesKt.HomeImages.1.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    ComposerKt.sourceInformation(composer2, "C40@1728L55:HomeImages.kt#v86m6v");
                    if ((i2 & 81) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    String string = context.getString(C3069R.string.s_delete_photo_images);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    TextKt.m3128Text4IGK_g(string, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                }
            }, composer, 54), composer, 805306422, 492);
            composer.startReplaceGroup(2118666391);
            ComposerKt.sourceInformation(composer, "CC(remember):HomeImages.kt#9igjgp");
            final MutableState<ImageSaver.Dir> mutableState2 = this.$dirToRemove;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.smartengines.app.ui.settings.HomeImagesKt$HomeImages$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeImagesKt.C32651.invoke$lambda$3$lambda$2(mutableState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            Modifier modifier2 = this.$modifier;
            ButtonColors buttonColors2 = this.$colors;
            final Context context2 = this.$context;
            ButtonKt.Button(function02, modifier2, false, null, buttonColors2, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1009017535, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.HomeImagesKt.HomeImages.1.4
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    ComposerKt.sourceInformation(composer2, "C43@1894L55:HomeImages.kt#v86m6v");
                    if ((i2 & 81) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    String string = context2.getString(C3069R.string.s_delete_video_images);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    TextKt.m3128Text4IGK_g(string, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                }
            }, composer, 54), composer, 805306422, 492);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(MutableState dirToRemove) {
            Intrinsics.checkNotNullParameter(dirToRemove, "$dirToRemove");
            dirToRemove.setValue(ImageSaver.Dir.Video);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeImages$lambda$3$lambda$2$lambda$1(MutableState dirToRemove) {
        Intrinsics.checkNotNullParameter(dirToRemove, "$dirToRemove");
        dirToRemove.setValue(null);
        return Unit.INSTANCE;
    }

    private static final void Preview_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1464522313);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Dark)60@2336L122:HomeImages.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$HomeImagesKt.INSTANCE.m7740getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeImagesKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeImagesKt.Preview_Dark$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
