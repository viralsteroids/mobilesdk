package com.smartengines.app.com.smartengines.app;

import android.content.Context;
import android.util.Log;
import com.smartengines.app.Model;
import com.smartengines.app.targets.DocTargetsListKt;
import com.smartengines.app.targets.IdTargetsKt;
import com.smartengines.engine.Engine;
import com.smartengines.engine.doc.DocEngineWrapper;
import com.smartengines.engine.p005id.IdEngineWrapper;
import com.smartengines.targets.DocumentTypesStatistics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: Statistics.kt */
@Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m514d2 = {"Lcom/smartengines/app/com/smartengines/app/Statistics;", "", "context", "Landroid/content/Context;", "engineType", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "getEngineType", "()Ljava/lang/String;", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/smartengines/app/com/smartengines/app/Statistics$State;", "getState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "State", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class Statistics {
    public static final int $stable = 8;
    private final String engineType;
    private final MutableStateFlow<State> state;

    /* compiled from: Statistics.kt */
    @Metadata(m513d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m514d2 = {"Lcom/smartengines/app/com/smartengines/app/Statistics$State;", "", "Loading", "Error", "Success", "Lcom/smartengines/app/com/smartengines/app/Statistics$State$Error;", "Lcom/smartengines/app/com/smartengines/app/Statistics$State$Loading;", "Lcom/smartengines/app/com/smartengines/app/Statistics$State$Success;", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public interface State {

        /* compiled from: Statistics.kt */
        @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m514d2 = {"Lcom/smartengines/app/com/smartengines/app/Statistics$State$Loading;", "Lcom/smartengines/app/com/smartengines/app/Statistics$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
        public static final /* data */ class Loading implements State {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loading)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -758384908;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }
        }

        /* compiled from: Statistics.kt */
        @Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m514d2 = {"Lcom/smartengines/app/com/smartengines/app/Statistics$State$Error;", "Lcom/smartengines/app/com/smartengines/app/Statistics$State;", "error", "", "<init>", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
        public static final /* data */ class Error implements State {
            public static final int $stable = 0;
            private final String error;

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.error;
                }
                return error.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getError() {
                return this.error;
            }

            public final Error copy(String error) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new Error(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ')';
            }

            public Error(String error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final String getError() {
                return this.error;
            }
        }

        /* compiled from: Statistics.kt */
        @Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m514d2 = {"Lcom/smartengines/app/com/smartengines/app/Statistics$State$Success;", "Lcom/smartengines/app/com/smartengines/app/Statistics$State;", "idStatistics", "Lcom/smartengines/targets/DocumentTypesStatistics$Calculated;", "<init>", "(Lcom/smartengines/targets/DocumentTypesStatistics$Calculated;)V", "getIdStatistics", "()Lcom/smartengines/targets/DocumentTypesStatistics$Calculated;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
        public static final /* data */ class Success implements State {
            public static final int $stable = 8;
            private final DocumentTypesStatistics.Calculated idStatistics;

            public static /* synthetic */ Success copy$default(Success success, DocumentTypesStatistics.Calculated calculated, int i, Object obj) {
                if ((i & 1) != 0) {
                    calculated = success.idStatistics;
                }
                return success.copy(calculated);
            }

            /* renamed from: component1, reason: from getter */
            public final DocumentTypesStatistics.Calculated getIdStatistics() {
                return this.idStatistics;
            }

            public final Success copy(DocumentTypesStatistics.Calculated idStatistics) {
                Intrinsics.checkNotNullParameter(idStatistics, "idStatistics");
                return new Success(idStatistics);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.idStatistics, ((Success) other).idStatistics);
            }

            public int hashCode() {
                return this.idStatistics.hashCode();
            }

            public String toString() {
                return "Success(idStatistics=" + this.idStatistics + ')';
            }

            public Success(DocumentTypesStatistics.Calculated idStatistics) {
                Intrinsics.checkNotNullParameter(idStatistics, "idStatistics");
                this.idStatistics = idStatistics;
            }

            public final DocumentTypesStatistics.Calculated getIdStatistics() {
                return this.idStatistics;
            }
        }
    }

    public Statistics(Context context, String engineType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(engineType, "engineType");
        this.engineType = engineType;
        this.state = StateFlowKt.MutableStateFlow(State.Loading.INSTANCE);
        Log.d("myapp.Statistics", "init");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C30711(context, null), 3, null);
    }

    public final String getEngineType() {
        return this.engineType;
    }

    public final MutableStateFlow<State> getState() {
        return this.state;
    }

    /* compiled from: Statistics.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.com.smartengines.app.Statistics$1", m533f = "Statistics.kt", m534i = {}, m535l = {31, 46, 48}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.app.com.smartengines.app.Statistics$1 */
    static final class C30711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30711(Context context, Continuation<? super C30711> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Statistics.this.new C30711(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00f7, code lost:
        
            if (r0.emit(new com.smartengines.app.com.smartengines.app.Statistics.State.Error(r4), r7) != r1) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                MutableStateFlow<State> state = Statistics.this.getState();
                String message = e.getMessage();
                if (message == null) {
                    message = e.toString();
                }
                this.label = 3;
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Statistics.this.getState().emit(State.Loading.INSTANCE, this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            DocumentTypesStatistics documentTypesStatistics = new DocumentTypesStatistics(null, 1, null);
            String engineType = Statistics.this.getEngineType();
            if (Intrinsics.areEqual(engineType, "id")) {
                Context context = this.$context;
                Engine engine = Model.INSTANCE.getEngines().getId().getLoader().getEngine();
                Intrinsics.checkNotNull(engine, "null cannot be cast to non-null type com.smartengines.engine.id.IdEngineWrapper");
                IdTargetsKt.loadIdTargetList(context, ((IdEngineWrapper) engine).getIdEngine(), documentTypesStatistics);
            } else {
                if (!Intrinsics.areEqual(engineType, "doc")) {
                    throw new Exception("Unknown engine type: " + Statistics.this.getEngineType());
                }
                Context context2 = this.$context;
                Engine engine2 = Model.INSTANCE.getEngines().getDoc().getLoader().getEngine();
                Intrinsics.checkNotNull(engine2, "null cannot be cast to non-null type com.smartengines.engine.doc.DocEngineWrapper");
                DocTargetsListKt.loadDocTargetList(context2, ((DocEngineWrapper) engine2).getDocEngine(), documentTypesStatistics);
            }
            DocumentTypesStatistics.Calculated calculatedCalculate = documentTypesStatistics.calculate();
            this.label = 2;
            if (Statistics.this.getState().emit(new State.Success(calculatedCalculate), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }
}
