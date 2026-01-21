package com.smartengines.visualization;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.smartengines.visualization.Visualization;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jmrtd.lds.LDSFile;

/* compiled from: QuadsViewFading.kt */
@Metadata(m513d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\u001a'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\u0010\u001a\u00020\t*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0002\u001a0\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00180\u0017H\u0082@¢\u0006\u0002\u0010\u0019\u001a\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018*\b\u0012\u0004\u0012\u00020\u00110\u0018H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b²\u0006\u0010\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018X\u008a\u0084\u0002"}, m514d2 = {"TAG", "", "QuadsViewFading", "", "visObject", "Lcom/smartengines/visualization/Visualization$Quads;", "lineColor", "Landroidx/compose/ui/graphics/Color;", "lineWidth", "", "QuadsViewFading-iJQMabo", "(Lcom/smartengines/visualization/Visualization$Quads;JFLandroidx/compose/runtime/Composer;I)V", "LIFE_TIME", "", "YOUTH_TIME", "MIN_ALPHA", "calculateAlpha", "Lcom/smartengines/visualization/QuadFrame;", "time", "backgroundTask", "input", "Lkotlinx/coroutines/flow/Flow;", "data", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recalculate", "visualization_release", "frames"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class QuadsViewFadingKt {
    private static final long LIFE_TIME = 2000;
    private static final float MIN_ALPHA = 0.1f;
    private static final String TAG = "myapp.QuadsFading";
    private static final long YOUTH_TIME = 300;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuadsViewFading_iJQMabo$lambda$5(Visualization.Quads visObject, long j, float f, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(visObject, "$visObject");
        m7841QuadsViewFadingiJQMabo(visObject, j, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: QuadsViewFading-iJQMabo, reason: not valid java name */
    public static final void m7841QuadsViewFadingiJQMabo(final Visualization.Quads visObject, final long j, final float f, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(visObject, "visObject");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1902525436);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(QuadsViewFading)P(2,0:c#ui.graphics.Color)28@895L16,32@1073L574,32@1032L615:QuadsViewFading.kt#hal2ob");
        boolean z = true;
        final State stateCollectAsState = SnapshotStateKt.collectAsState(visObject.getDataFlow(), null, composerStartRestartGroup, 8, 1);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceGroup(-134903355);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):QuadsViewFading.kt#9igjgp");
        boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState) | ((((i & LDSFile.EF_DG16_TAG) ^ 48) > 32 && composerStartRestartGroup.changed(j)) || (i & 48) == 32);
        if ((((i & 896) ^ 384) <= 256 || !composerStartRestartGroup.changed(f)) && (i & 384) != 256) {
            z = false;
        }
        boolean z2 = zChanged | z;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.smartengines.visualization.QuadsViewFadingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return QuadsViewFadingKt.QuadsViewFading_iJQMabo$lambda$4$lambda$3(stateCollectAsState, j, f, (DrawScope) obj);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceGroup();
        CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue, composerStartRestartGroup, 6);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.visualization.QuadsViewFadingKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuadsViewFadingKt.QuadsViewFading_iJQMabo$lambda$5(visObject, j, f, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuadsViewFading_iJQMabo$lambda$4$lambda$3(State frames$delegate, long j, float f, DrawScope drawScope) throws Throwable {
        Intrinsics.checkNotNullParameter(frames$delegate, "$frames$delegate");
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (QuadFrame quadFrame : QuadsViewFading_iJQMabo$lambda$0(frames$delegate)) {
            float fCalculateAlpha = calculateAlpha(quadFrame, jCurrentTimeMillis);
            if (fCalculateAlpha > 0.1f) {
                long jM4594copywmQWz5c$default = Color.m4594copywmQWz5c$default(j, fCalculateAlpha, 0.0f, 0.0f, 0.0f, 14, null);
                Iterator<T> it = quadFrame.getQuads().iterator();
                while (it.hasNext()) {
                    QuadDrawingKt.m7840drawQuadPointsXOJAsU(((Quad) it.next()).getPoints(), quadFrame.getImageSize(), jM4594copywmQWz5c$default, f, Canvas);
                    Canvas = drawScope;
                }
            }
            Canvas = drawScope;
        }
        return Unit.INSTANCE;
    }

    private static final float calculateAlpha(QuadFrame quadFrame, long j) {
        float timestamp = 1.0f - ((j - (quadFrame.getTimestamp() + YOUTH_TIME)) / LIFE_TIME);
        if (timestamp > 1.0f) {
            return 1.0f;
        }
        if (timestamp < 0.0f) {
            return 0.0f;
        }
        return timestamp;
    }

    /* compiled from: QuadsViewFading.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.visualization.QuadsViewFadingKt$backgroundTask$2 */
    static final class C33142<T> implements FlowCollector {
        final /* synthetic */ MutableStateFlow<List<QuadFrame>> $data;
        final /* synthetic */ Ref.ObjectRef<Job> $deathTimer;

        C33142(Ref.ObjectRef<Job> objectRef, MutableStateFlow<List<QuadFrame>> mutableStateFlow) {
            this.$deathTimer = objectRef;
            this.$data = mutableStateFlow;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(QuadFrame quadFrame, Continuation<? super Unit> continuation) {
            QuadsViewFadingKt$backgroundTask$2$emit$1 quadsViewFadingKt$backgroundTask$2$emit$1;
            C33142<T> c33142;
            if (continuation instanceof QuadsViewFadingKt$backgroundTask$2$emit$1) {
                quadsViewFadingKt$backgroundTask$2$emit$1 = (QuadsViewFadingKt$backgroundTask$2$emit$1) continuation;
                if ((quadsViewFadingKt$backgroundTask$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                    quadsViewFadingKt$backgroundTask$2$emit$1.label -= Integer.MIN_VALUE;
                } else {
                    quadsViewFadingKt$backgroundTask$2$emit$1 = new QuadsViewFadingKt$backgroundTask$2$emit$1(this, continuation);
                }
            }
            Object obj = quadsViewFadingKt$backgroundTask$2$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = quadsViewFadingKt$backgroundTask$2$emit$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Job job = this.$deathTimer.element;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                MutableStateFlow<List<QuadFrame>> mutableStateFlow = this.$data;
                List<QuadFrame> listPlus = CollectionsKt.plus((Collection<? extends QuadFrame>) mutableStateFlow.getValue(), quadFrame);
                quadsViewFadingKt$backgroundTask$2$emit$1.L$0 = this;
                quadsViewFadingKt$backgroundTask$2$emit$1.label = 1;
                if (mutableStateFlow.emit(listPlus, quadsViewFadingKt$backgroundTask$2$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c33142 = this;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c33142 = (C33142) quadsViewFadingKt$backgroundTask$2$emit$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            c33142.$deathTimer.element = (T) BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(quadsViewFadingKt$backgroundTask$2$emit$1.getContext()), null, null, new AnonymousClass1(c33142.$data, null), 3, null);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((QuadFrame) obj, (Continuation<? super Unit>) continuation);
        }

        /* compiled from: QuadsViewFading.kt */
        @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
        @DebugMetadata(m532c = "com.smartengines.visualization.QuadsViewFadingKt$backgroundTask$2$1", m533f = "QuadsViewFading.kt", m534i = {0, 1}, m535l = {84, 88}, m536m = "invokeSuspend", m537n = {"i", "i"}, m538s = {"I$0", "I$0"})
        /* renamed from: com.smartengines.visualization.QuadsViewFadingKt$backgroundTask$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ MutableStateFlow<List<QuadFrame>> $data;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MutableStateFlow<List<QuadFrame>> mutableStateFlow, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$data = mutableStateFlow;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$data, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:11:0x0027). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i;
                MutableStateFlow<List<QuadFrame>> mutableStateFlow;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    i = 0;
                } else {
                    if (i2 == 1) {
                        i = this.I$0;
                        ResultKt.throwOnFailure(obj);
                        i++;
                        mutableStateFlow = this.$data;
                        this.I$0 = i;
                        this.label = 2;
                        if (mutableStateFlow.emit(QuadsViewFadingKt.recalculate(mutableStateFlow.getValue()), this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (this.$data.getValue().isEmpty()) {
                    this.I$0 = i;
                    this.label = 1;
                    if (DelayKt.delay(100L, this) != coroutine_suspended) {
                        i++;
                        mutableStateFlow = this.$data;
                        this.I$0 = i;
                        this.label = 2;
                        if (mutableStateFlow.emit(QuadsViewFadingKt.recalculate(mutableStateFlow.getValue()), this) != coroutine_suspended) {
                            if (this.$data.getValue().isEmpty()) {
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    return coroutine_suspended;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object backgroundTask(Flow<QuadFrame> flow, MutableStateFlow<List<QuadFrame>> mutableStateFlow, Continuation<? super Unit> continuation) {
        Object objCollect = flow.collect(new C33142(new Ref.ObjectRef(), mutableStateFlow), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<QuadFrame> recalculate(List<QuadFrame> list) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (jCurrentTimeMillis - ((QuadFrame) obj).getTimestamp() < LIFE_TIME) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static final List<QuadFrame> QuadsViewFading_iJQMabo$lambda$0(State<? extends List<QuadFrame>> state) {
        return state.getValue();
    }
}
