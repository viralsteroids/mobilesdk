package com.smartengines.app.p004ui;

import android.content.Context;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.Photo;
import com.smartengines.app.mock.MockComposesKt;
import com.smartengines.app.mock.MockSelectorsKt;
import com.smartengines.utils.UtilsKt;
import com.smartengines.visualization.MockKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ProcessingScreenPhoto.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProcessingScreenPhotoKt {
    public static final ComposableSingletons$ProcessingScreenPhotoKt INSTANCE = new ComposableSingletons$ProcessingScreenPhotoKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2032lambda1 = ComposableLambdaKt.composableLambdaInstance(454750158, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$ProcessingScreenPhotoKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C78@2836L21:ProcessingScreenPhoto.kt#83idza");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                MockComposesKt.MockProcessingTitle(composer, 0);
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2033lambda2 = ComposableLambdaKt.composableLambdaInstance(-370178871, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$ProcessingScreenPhotoKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C69@2497L7,70@2529L103,74@2646L227:ProcessingScreenPhoto.kt#83idza");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Context context = (Context) objConsume;
                composer.startReplaceGroup(-1680011745);
                ComposerKt.sourceInformation(composer, "CC(remember):ProcessingScreenPhoto.kt#9igjgp");
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Photo(UtilsKt.loadBitmapFromAssetFile(context, "sample_camera.png"));
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                ProcessingScreenPhotoKt.ProcessingScreenPhoto((Photo) objRememberedValue, MockKt.getMockVisualizations(), MockSelectorsKt.getMockSelectedTreeLeaf(), ComposableSingletons$ProcessingScreenPhotoKt.INSTANCE.m7488getLambda1$app_storeRelease(), composer, 3656, 0);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2034lambda3 = ComposableLambdaKt.composableLambdaInstance(-1846073084, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$ProcessingScreenPhotoKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C68@2448L435:ProcessingScreenPhoto.kt#83idza");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ProcessingScreenPhotoKt.INSTANCE.m7489getLambda2$app_storeRelease(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7488getLambda1$app_storeRelease() {
        return f2032lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7489getLambda2$app_storeRelease() {
        return f2033lambda2;
    }

    /* renamed from: getLambda-3$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7490getLambda3$app_storeRelease() {
        return f2034lambda3;
    }
}
