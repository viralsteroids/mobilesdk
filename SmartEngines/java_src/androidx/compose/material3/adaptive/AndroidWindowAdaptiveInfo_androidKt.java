package androidx.compose.material3.adaptive;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.p000ui.unit.DpSize;
import androidx.compose.p000ui.unit.IntSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.exifinterface.media.ExifInterface;
import androidx.window.core.layout.WindowSizeClass;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetricsCalculator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AndroidWindowAdaptiveInfo.android.kt */
@Metadata(m513d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\n¨\u0006\r"}, m514d2 = {"collectFoldingFeaturesAsState", "Landroidx/compose/runtime/State;", "", "Landroidx/window/layout/FoldingFeature;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "currentWindowAdaptiveInfo", "Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;", "currentWindowDpSize", "Landroidx/compose/ui/unit/DpSize;", "(Landroidx/compose/runtime/Composer;I)J", "currentWindowSize", "Landroidx/compose/ui/unit/IntSize;", "adaptive_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class AndroidWindowAdaptiveInfo_androidKt {
    public static final WindowAdaptiveInfo currentWindowAdaptiveInfo(Composer composer, int i) {
        composer.startReplaceableGroup(-2003129230);
        ComposerKt.sourceInformation(composer, "C(currentWindowAdaptiveInfo)38@1544L21,41@1704L31:AndroidWindowAdaptiveInfo.android.kt#8avflz");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2003129230, i, -1, "androidx.compose.material3.adaptive.currentWindowAdaptiveInfo (AndroidWindowAdaptiveInfo.android.kt:37)");
        }
        long jCurrentWindowDpSize = currentWindowDpSize(composer, 0);
        WindowAdaptiveInfo windowAdaptiveInfo = new WindowAdaptiveInfo(WindowSizeClass.INSTANCE.compute(DpSize.m7153getWidthD9Ej5fM(jCurrentWindowDpSize), DpSize.m7151getHeightD9Ej5fM(jCurrentWindowDpSize)), AndroidPosture_androidKt.calculatePosture(collectFoldingFeaturesAsState(composer, 0).getValue()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return windowAdaptiveInfo;
    }

    public static final long currentWindowDpSize(Composer composer, int i) {
        composer.startReplaceableGroup(692419572);
        ComposerKt.sourceInformation(composer, "C(currentWindowDpSize)*53@2004L7,53@2015L19:AndroidWindowAdaptiveInfo.android.kt#8avflz");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(692419572, i, -1, "androidx.compose.material3.adaptive.currentWindowDpSize (AndroidWindowAdaptiveInfo.android.kt:53)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        long jMo1125toDpSizekrfVVM = ((Density) objConsume).mo1125toDpSizekrfVVM(IntSizeKt.m7237toSizeozmzZPI(currentWindowSize(composer, 0)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jMo1125toDpSizekrfVVM;
    }

    public static final long currentWindowSize(Composer composer, int i) {
        composer.startReplaceableGroup(-1153163183);
        ComposerKt.sourceInformation(composer, "C(currentWindowSize)67@2722L7,70@2853L7:AndroidWindowAdaptiveInfo.android.kt#8avflz");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1153163183, i, -1, "androidx.compose.material3.adaptive.currentWindowSize (AndroidWindowAdaptiveInfo.android.kt:62)");
        }
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        composer.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composer);
        WindowMetricsCalculator orCreate = WindowMetricsCalculator.INSTANCE.getOrCreate();
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Rect bounds = orCreate.computeCurrentWindowMetrics((Context) objConsume).getBounds();
        long jIntSize = IntSizeKt.IntSize(bounds.width(), bounds.height());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jIntSize;
    }

    public static final State<List<FoldingFeature>> collectFoldingFeaturesAsState(Composer composer, int i) {
        composer.startReplaceableGroup(-883534959);
        ComposerKt.sourceInformation(composer, "C(collectFoldingFeaturesAsState)82@3209L7,83@3228L196,88@3434L27:AndroidWindowAdaptiveInfo.android.kt#8avflz");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-883534959, i, -1, "androidx.compose.material3.adaptive.collectFoldingFeaturesAsState (AndroidWindowAdaptiveInfo.android.kt:81)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        composer.startReplaceableGroup(793564314);
        ComposerKt.sourceInformation(composer, "CC(remember):AndroidWindowAdaptiveInfo.android.kt#9igjgp");
        boolean zChanged = composer.changed(context);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            final Flow<WindowLayoutInfo> flowWindowLayoutInfo = WindowInfoTracker.INSTANCE.getOrCreate(context).windowLayoutInfo(context);
            objRememberedValue = (Flow) new Flow<List<? extends FoldingFeature>>() { // from class: androidx.compose.material3.adaptive.AndroidWindowAdaptiveInfo_androidKt$collectFoldingFeaturesAsState$lambda$2$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m514d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                /* renamed from: androidx.compose.material3.adaptive.AndroidWindowAdaptiveInfo_androidKt$collectFoldingFeaturesAsState$lambda$2$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @Metadata(m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                    @DebugMetadata(m532c = "androidx.compose.material3.adaptive.AndroidWindowAdaptiveInfo_androidKt$collectFoldingFeaturesAsState$lambda$2$$inlined$map$1$2", m533f = "AndroidWindowAdaptiveInfo.android.kt", m534i = {}, m535l = {223}, m536m = "emit", m537n = {}, m538s = {})
                    /* renamed from: androidx.compose.material3.adaptive.AndroidWindowAdaptiveInfo_androidKt$collectFoldingFeaturesAsState$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = anonymousClass1.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            List<DisplayFeature> displayFeatures = ((WindowLayoutInfo) obj).getDisplayFeatures();
                            ArrayList arrayList = new ArrayList();
                            for (T t : displayFeatures) {
                                if (t instanceof FoldingFeature) {
                                    arrayList.add(t);
                                }
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends FoldingFeature>> flowCollector, Continuation continuation) {
                    Object objCollect = flowWindowLayoutInfo.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        State<List<FoldingFeature>> stateCollectAsState = SnapshotStateKt.collectAsState((Flow) objRememberedValue, CollectionsKt.emptyList(), null, composer, 48, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateCollectAsState;
    }
}
