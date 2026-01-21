package com.smartengines.engine;

import android.content.Context;
import android.util.Log;
import com.smartengines.engine.EngineBundle;
import com.smartengines.engine.EngineLoadingState;
import com.smartengines.utils.UtilsKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlin.time.DurationKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: EngineLoader.kt */
@Metadata(m513d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JG\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a¢\u0006\u0002\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m514d2 = {"Lcom/smartengines/engine/EngineLoader;", "", "engine", "Lcom/smartengines/engine/Engine;", "<init>", "(Lcom/smartengines/engine/Engine;)V", "getEngine", "()Lcom/smartengines/engine/Engine;", "_loadingState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/smartengines/engine/EngineLoadingState;", "loadingState", "Lkotlinx/coroutines/flow/StateFlow;", "getLoadingState", "()Lkotlinx/coroutines/flow/StateFlow;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "load", "", "context", "Landroid/content/Context;", "jniLibrary", "", "bundle", "Lcom/smartengines/engine/EngineBundle;", "onLoaded", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Landroid/content/Context;Ljava/lang/String;Lcom/smartengines/engine/EngineBundle;Lkotlin/jvm/functions/Function2;)V", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class EngineLoader {
    private final MutableStateFlow<EngineLoadingState> _loadingState;
    private final Engine engine;
    private final StateFlow<EngineLoadingState> loadingState;
    private final CoroutineScope scope;

    public EngineLoader(Engine engine) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        this.engine = engine;
        MutableStateFlow<EngineLoadingState> MutableStateFlow = StateFlowKt.MutableStateFlow(EngineLoadingState.Unloaded.INSTANCE);
        this._loadingState = MutableStateFlow;
        this.loadingState = FlowKt.asStateFlow(MutableStateFlow);
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
    }

    public final Engine getEngine() {
        return this.engine;
    }

    public final StateFlow<EngineLoadingState> getLoadingState() {
        return this.loadingState;
    }

    public final void load(Context context, String jniLibrary, EngineBundle bundle, Function2<? super Engine, ? super Continuation<? super Unit>, ? extends Object> onLoaded) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jniLibrary, "jniLibrary");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(onLoaded, "onLoaded");
        Log.d("engine.Engine", "load, jniLibrary: " + jniLibrary + "  bundle: " + bundle);
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C32901(jniLibrary, bundle, context, onLoaded, null), 3, null);
    }

    /* compiled from: EngineLoader.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.engine.EngineLoader$load$1", m533f = "EngineLoader.kt", m534i = {1}, m535l = {54, 86, 89, 95}, m536m = "invokeSuspend", m537n = {"timeStart"}, m538s = {"J$0"})
    /* renamed from: com.smartengines.engine.EngineLoader$load$1 */
    static final class C32901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EngineBundle $bundle;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $jniLibrary;
        final /* synthetic */ Function2<Engine, Continuation<? super Unit>, Object> $onLoaded;
        long J$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C32901(String str, EngineBundle engineBundle, Context context, Function2<? super Engine, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C32901> continuation) {
            super(2, continuation);
            this.$jniLibrary = str;
            this.$bundle = engineBundle;
            this.$context = context;
            this.$onLoaded = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EngineLoader.this.new C32901(this.$jniLibrary, this.$bundle, this.$context, this.$onLoaded, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x01da, code lost:
        
            if (r14.this$0._loadingState.emit(new com.smartengines.engine.EngineLoadingState.Error(r14.this$0.getEngine(), r15), r14) != r0) goto L57;
         */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0195  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            byte[] assetsFile;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Log.e("engine.Engine", EngineLoader.this.getEngine().getClass().getSimpleName() + ": engine loading error", th);
                this.label = 4;
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (EngineLoader.this._loadingState.emit(EngineLoadingState.Loading.INSTANCE, this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                j = this.J$0;
                ResultKt.throwOnFailure(obj);
                this.label = 3;
                if (EngineLoader.this._loadingState.emit(new EngineLoadingState.Loaded(EngineLoader.this.getEngine(), System.currentTimeMillis() - j), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            System.loadLibrary(this.$jniLibrary);
            EngineBundle engineBundle = this.$bundle;
            if (engineBundle instanceof EngineBundle.File) {
                assetsFile = UtilsKt.readAssetsFile(this.$context, ((EngineBundle.File) engineBundle).getFilePath());
            } else {
                String str = null;
                if (engineBundle instanceof EngineBundle.FirstFound) {
                    String[] list = this.$context.getAssets().list(((EngineBundle.FirstFound) this.$bundle).getDirToSearch());
                    if (list != null) {
                        EngineBundle engineBundle2 = this.$bundle;
                        int length = list.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            String str2 = list[i2];
                            Intrinsics.checkNotNull(str2);
                            if (StringsKt.endsWith$default(str2, ((EngineBundle.FirstFound) engineBundle2).getFileExtension(), false, 2, (Object) null)) {
                                str = str2;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (str == null) {
                        throw new Exception("bundle file not found, dir: \"assets/" + ((EngineBundle.FirstFound) this.$bundle).getDirToSearch() + "\" file extension: \"" + ((EngineBundle.FirstFound) this.$bundle).getFileExtension() + Typography.quote);
                    }
                    assetsFile = UtilsKt.readAssetsFile(this.$context, ((EngineBundle.FirstFound) this.$bundle).getDirToSearch() + File.separator + str);
                } else {
                    if (!Intrinsics.areEqual(engineBundle, EngineBundle.Embedded.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    assetsFile = null;
                }
            }
            if (assetsFile != null) {
                Boxing.boxInt(Log.d("engine.Engine", "bundle data is loaded (size:" + (assetsFile.length / DurationKt.NANOS_IN_MILLIS) + "Mb)"));
            }
            EngineLoader.this.getEngine().createEngine(assetsFile);
            Log.d("engine.Engine", EngineLoader.this.getEngine().getClass().getSimpleName() + ": engine is created");
            Function2<Engine, Continuation<? super Unit>, Object> function2 = this.$onLoaded;
            Engine engine = EngineLoader.this.getEngine();
            this.J$0 = jCurrentTimeMillis;
            this.label = 2;
            if (function2.invoke(engine, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = jCurrentTimeMillis;
            this.label = 3;
            if (EngineLoader.this._loadingState.emit(new EngineLoadingState.Loaded(EngineLoader.this.getEngine(), System.currentTimeMillis() - j), this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
    }
}
