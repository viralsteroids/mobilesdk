package com.smartengines.app.targets;

import android.content.Context;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.smartengines.app.Model;
import com.smartengines.app.SessionSettingsLoggerImpl;
import com.smartengines.engine.RecognitionTarget;
import com.smartengines.engine.SessionSettingsLogger;
import com.smartengines.engine.SessionType;
import com.smartengines.utils.MediaStoreWrapper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.cbeff.ISO781611;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TargetsLogger.kt */
@Metadata(m513d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u00011B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0014J\u0006\u0010\u001b\u001a\u00020\u0014J(\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0082@¢\u0006\u0002\u0010#J\u001e\u0010$\u001a\u00020 2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010&H\u0082@¢\u0006\u0002\u0010'J\u001e\u0010(\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140*H\u0002J\u0018\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020-2\u0006\u0010!\u001a\u00020\"H\u0002J\u0014\u0010.\u001a\u00020 *\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0014\u0010/\u001a\u000200*\u0002002\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, m514d2 = {"Lcom/smartengines/app/targets/TargetsLogger;", "", "<init>", "()V", "TAG", "", "coroutineContext", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getCoroutineContext$annotations", "job", "Lkotlinx/coroutines/Job;", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/smartengines/app/targets/TargetsLogger$State;", "getState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "size", "", "index", "startProgress", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProgress", "logAllTargets", "context", "Landroid/content/Context;", "cancel", "reset", "processTree", "node", "Lcom/smartengines/app/targets/TreeItem;", "json", "Lorg/json/JSONArray;", "logger", "Lcom/smartengines/engine/SessionSettingsLogger;", "(Lcom/smartengines/app/targets/TreeItem;Lorg/json/JSONArray;Lcom/smartengines/engine/SessionSettingsLogger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processChildren", "children", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countTargets", "onFound", "Lkotlin/Function0;", "processTarget", "target", "Lcom/smartengines/engine/RecognitionTarget;", "writeActionLogs", "writeDataLogs", "Lorg/json/JSONObject;", "State", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TargetsLogger {
    private static final String TAG = "myapp.TargetsLogger";
    private static int index;
    private static Job job;
    public static final TargetsLogger INSTANCE = new TargetsLogger();
    private static final ExecutorCoroutineDispatcher coroutineContext = ThreadPoolDispatcherKt.newSingleThreadContext("TargetsLogger");
    private static final MutableStateFlow<State> state = StateFlowKt.MutableStateFlow(State.Ready.INSTANCE);
    private static int size = 1;
    public static final int $stable = 8;

    /* compiled from: TargetsLogger.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.targets.TargetsLogger", m533f = "TargetsLogger.kt", m534i = {0}, m535l = {CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384}, m536m = "processChildren", m537n = {"jsonArray"}, m538s = {"L$1"})
    /* renamed from: com.smartengines.app.targets.TargetsLogger$processChildren$1 */
    static final class C30861 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C30861(Continuation<? super C30861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TargetsLogger.this.processChildren(null, this);
        }
    }

    /* compiled from: TargetsLogger.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.targets.TargetsLogger", m533f = "TargetsLogger.kt", m534i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2}, m535l = {ISO781611.BIOMETRIC_SUBTYPE_TAG, 134, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384}, m536m = "processTree", m537n = {"this", "node", "json", "logger", "this", "node", "json", "logger", "node", "json"}, m538s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    /* renamed from: com.smartengines.app.targets.TargetsLogger$processTree$1 */
    static final class C30871 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C30871(Continuation<? super C30871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TargetsLogger.this.processTree(null, null, null, this);
        }
    }

    private static /* synthetic */ void getCoroutineContext$annotations() {
    }

    private TargetsLogger() {
    }

    /* compiled from: TargetsLogger.kt */
    @Metadata(m513d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m514d2 = {"Lcom/smartengines/app/targets/TargetsLogger$State;", "", "Ready", "Working", "Success", "Error", "Lcom/smartengines/app/targets/TargetsLogger$State$Error;", "Lcom/smartengines/app/targets/TargetsLogger$State$Ready;", "Lcom/smartengines/app/targets/TargetsLogger$State$Success;", "Lcom/smartengines/app/targets/TargetsLogger$State$Working;", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public interface State {

        /* compiled from: TargetsLogger.kt */
        @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m514d2 = {"Lcom/smartengines/app/targets/TargetsLogger$State$Ready;", "Lcom/smartengines/app/targets/TargetsLogger$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
        public static final /* data */ class Ready implements State {
            public static final int $stable = 0;
            public static final Ready INSTANCE = new Ready();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Ready)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -393716456;
            }

            public String toString() {
                return "Ready";
            }

            private Ready() {
            }
        }

        /* compiled from: TargetsLogger.kt */
        @Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m514d2 = {"Lcom/smartengines/app/targets/TargetsLogger$State$Working;", "Lcom/smartengines/app/targets/TargetsLogger$State;", NotificationCompat.CATEGORY_PROGRESS, "", "<init>", "(F)V", "getProgress", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
        public static final /* data */ class Working implements State {
            public static final int $stable = 0;
            private final float progress;

            public static /* synthetic */ Working copy$default(Working working, float f, int i, Object obj) {
                if ((i & 1) != 0) {
                    f = working.progress;
                }
                return working.copy(f);
            }

            /* renamed from: component1, reason: from getter */
            public final float getProgress() {
                return this.progress;
            }

            public final Working copy(float progress) {
                return new Working(progress);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Working) && Float.compare(this.progress, ((Working) other).progress) == 0;
            }

            public int hashCode() {
                return Float.hashCode(this.progress);
            }

            public String toString() {
                return "Working(progress=" + this.progress + ')';
            }

            public Working(float f) {
                this.progress = f;
            }

            public final float getProgress() {
                return this.progress;
            }
        }

        /* compiled from: TargetsLogger.kt */
        @Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m514d2 = {"Lcom/smartengines/app/targets/TargetsLogger$State$Success;", "Lcom/smartengines/app/targets/TargetsLogger$State;", NotificationCompat.CATEGORY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
        public static final /* data */ class Success implements State {
            public static final int $stable = 0;
            private final String msg;

            public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.msg;
                }
                return success.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMsg() {
                return this.msg;
            }

            public final Success copy(String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                return new Success(msg);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.msg, ((Success) other).msg);
            }

            public int hashCode() {
                return this.msg.hashCode();
            }

            public String toString() {
                return "Success(msg=" + this.msg + ')';
            }

            public Success(String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                this.msg = msg;
            }

            public final String getMsg() {
                return this.msg;
            }
        }

        /* compiled from: TargetsLogger.kt */
        @Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m514d2 = {"Lcom/smartengines/app/targets/TargetsLogger$State$Error;", "Lcom/smartengines/app/targets/TargetsLogger$State;", NotificationCompat.CATEGORY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
        public static final /* data */ class Error implements State {
            public static final int $stable = 0;
            private final String msg;

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.msg;
                }
                return error.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMsg() {
                return this.msg;
            }

            public final Error copy(String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                return new Error(msg);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.msg, ((Error) other).msg);
            }

            public int hashCode() {
                return this.msg.hashCode();
            }

            public String toString() {
                return "Error(msg=" + this.msg + ')';
            }

            public Error(String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                this.msg = msg;
            }

            public final String getMsg() {
                return this.msg;
            }
        }
    }

    public final MutableStateFlow<State> getState() {
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startProgress(Continuation<? super Unit> continuation) {
        index = 0;
        size = 1;
        Object objEmit = state.emit(new State.Working(0.0f), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateProgress(Continuation<? super Unit> continuation) {
        index++;
        Object objEmit = state.emit(new State.Working(index / size), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    /* compiled from: TargetsLogger.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.targets.TargetsLogger$logAllTargets$1", m533f = "TargetsLogger.kt", m534i = {1}, m535l = {69, EACTags.ANSWER_TO_RESET, 104, 108}, m536m = "invokeSuspend", m537n = {"json"}, m538s = {"L$0"})
    /* renamed from: com.smartengines.app.targets.TargetsLogger$logAllTargets$1 */
    static final class C30851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30851(Context context, Continuation<? super C30851> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30851(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0111, code lost:
        
            if (com.smartengines.app.targets.TargetsLogger.INSTANCE.getState().emit(new com.smartengines.app.targets.TargetsLogger.State.Success("data saved in file:\nDocuments/\n    " + r16), r18) != r4) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0158, code lost:
        
            if (r2.emit(new com.smartengines.app.targets.TargetsLogger.State.Error(r5), r18) == r4) goto L41;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            JSONObject jSONObject;
            String str;
            Object objProcessChildren;
            JSONObject jSONObject2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                } catch (Exception e) {
                    Log.e(TargetsLogger.TAG, "logAllTargets error", e);
                    if (!Intrinsics.areEqual(TargetsLogger.INSTANCE.getState().getValue(), State.Ready.INSTANCE)) {
                        MutableStateFlow<State> state = TargetsLogger.INSTANCE.getState();
                        String message = e.getMessage();
                        if (message == null) {
                            message = e.toString();
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                    }
                }
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (TargetsLogger.INSTANCE.startProgress(this) == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3 && i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    str = (String) this.L$2;
                    jSONObject = (JSONObject) this.L$1;
                    JSONObject jSONObject3 = (JSONObject) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    jSONObject2 = jSONObject3;
                    objProcessChildren = obj;
                    jSONObject.put(str, objProcessChildren);
                    String string = jSONObject2.toString(2);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    byte[] bytes = string.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    String str2 = "SE LOG " + new SimpleDateFormat("YYYY-MM-dd HH.mm").format(new Date()) + ".json";
                    MediaStoreWrapper.INSTANCE.saveFile(this.$context, bytes, MediaStoreWrapper.FileDirectories.Documents, str2, "application/json");
                    Log.w(TargetsLogger.TAG, "SUCCESS. Targets data saved in file: " + str2);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                }
                jSONObject = new JSONObject();
                TargetsLogger targetsLogger = TargetsLogger.INSTANCE;
                TargetsLogger.size = Model.INSTANCE.getHomeScreenTargets().size();
                str = "quick_start";
                this.L$0 = jSONObject;
                this.L$1 = jSONObject;
                this.L$2 = "quick_start";
                this.label = 2;
                objProcessChildren = TargetsLogger.INSTANCE.processChildren(Model.INSTANCE.getHomeScreenTargets(), this);
                if (objProcessChildren == coroutine_suspended) {
                    return coroutine_suspended;
                }
                jSONObject2 = jSONObject;
                jSONObject.put(str, objProcessChildren);
                String string2 = jSONObject2.toString(2);
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                byte[] bytes2 = string2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                String str22 = "SE LOG " + new SimpleDateFormat("YYYY-MM-dd HH.mm").format(new Date()) + ".json";
                MediaStoreWrapper.INSTANCE.saveFile(this.$context, bytes2, MediaStoreWrapper.FileDirectories.Documents, str22, "application/json");
                Log.w(TargetsLogger.TAG, "SUCCESS. Targets data saved in file: " + str22);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
            } finally {
                TargetsLogger targetsLogger2 = TargetsLogger.INSTANCE;
                TargetsLogger.job = null;
            }
        }
    }

    public final void logAllTargets(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (job != null) {
            return;
        }
        job = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineContext), null, null, new C30851(context, null), 3, null);
    }

    public final void cancel() {
        Log.w(TAG, "reset job=" + job + " coroutineContext=" + coroutineContext);
        Job job2 = job;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
    }

    public final void reset() {
        Job job2 = job;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        state.setValue(State.Ready.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processTree(TreeItem treeItem, JSONArray jSONArray, SessionSettingsLogger sessionSettingsLogger, Continuation<? super Unit> continuation) throws JSONException {
        C30871 c30871;
        TargetsLogger targetsLogger;
        TreeItem treeItem2;
        JSONArray jSONArray2;
        TreeItem treeItem3;
        SessionSettingsLogger sessionSettingsLogger2;
        TargetsLogger targetsLogger2;
        if (continuation instanceof C30871) {
            c30871 = (C30871) continuation;
            if ((c30871.label & Integer.MIN_VALUE) != 0) {
                c30871.label -= Integer.MIN_VALUE;
            } else {
                c30871 = new C30871(continuation);
            }
        }
        Object objProcessChildren = c30871.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c30871.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objProcessChildren);
            c30871.L$0 = this;
            c30871.L$1 = treeItem;
            c30871.L$2 = jSONArray;
            c30871.L$3 = sessionSettingsLogger;
            c30871.label = 1;
            if (DelayKt.delay(1L, c30871) != coroutine_suspended) {
                targetsLogger = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jSONArray2 = (JSONArray) c30871.L$1;
                treeItem2 = (TreeItem) c30871.L$0;
                ResultKt.throwOnFailure(objProcessChildren);
                jSONArray2.put(new JSONObject().put(treeItem2.getName().toString(), (JSONArray) objProcessChildren));
                return Unit.INSTANCE;
            }
            sessionSettingsLogger2 = (SessionSettingsLogger) c30871.L$3;
            jSONArray = (JSONArray) c30871.L$2;
            treeItem3 = (TreeItem) c30871.L$1;
            targetsLogger2 = (TargetsLogger) c30871.L$0;
            ResultKt.throwOnFailure(objProcessChildren);
            TreeLeaf treeLeaf = (TreeLeaf) treeItem3;
            Log.d(TAG, " - (" + index + " of " + size + ") " + treeLeaf.getName() + " : " + StringsKt.replace$default(treeLeaf.getTarget().toString(), "\n", ", ", false, 4, (Object) null));
            targetsLogger2.processTarget(treeLeaf.getTarget(), sessionSettingsLogger2);
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            String string = treeLeaf.getTarget().getEngineId().toString();
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = string.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            JSONObject jSONObjectPut = jSONObject.put("engine", sb.append(lowerCase).append("engine").toString());
            jSONObjectPut.put("name_en", treeLeaf.getName().getEn());
            jSONObjectPut.put("name_ru", treeLeaf.getName().getRu());
            Unit unit = Unit.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "apply(...)");
            jSONArray.put(targetsLogger2.writeDataLogs(jSONObjectPut, sessionSettingsLogger2));
            sessionSettingsLogger2.clear();
            return Unit.INSTANCE;
        }
        sessionSettingsLogger = (SessionSettingsLogger) c30871.L$3;
        jSONArray = (JSONArray) c30871.L$2;
        treeItem = (TreeItem) c30871.L$1;
        targetsLogger = (TargetsLogger) c30871.L$0;
        ResultKt.throwOnFailure(objProcessChildren);
        if (treeItem instanceof TreeLeaf) {
            c30871.L$0 = targetsLogger;
            c30871.L$1 = treeItem;
            c30871.L$2 = jSONArray;
            c30871.L$3 = sessionSettingsLogger;
            c30871.label = 2;
            if (targetsLogger.updateProgress(c30871) != coroutine_suspended) {
                SessionSettingsLogger sessionSettingsLogger3 = sessionSettingsLogger;
                treeItem3 = treeItem;
                sessionSettingsLogger2 = sessionSettingsLogger3;
                targetsLogger2 = targetsLogger;
                TreeLeaf treeLeaf2 = (TreeLeaf) treeItem3;
                Log.d(TAG, " - (" + index + " of " + size + ") " + treeLeaf2.getName() + " : " + StringsKt.replace$default(treeLeaf2.getTarget().toString(), "\n", ", ", false, 4, (Object) null));
                targetsLogger2.processTarget(treeLeaf2.getTarget(), sessionSettingsLogger2);
                JSONObject jSONObject2 = new JSONObject();
                StringBuilder sb2 = new StringBuilder();
                String string2 = treeLeaf2.getTarget().getEngineId().toString();
                Locale US2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase2 = string2.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                JSONObject jSONObjectPut2 = jSONObject2.put("engine", sb2.append(lowerCase2).append("engine").toString());
                jSONObjectPut2.put("name_en", treeLeaf2.getName().getEn());
                jSONObjectPut2.put("name_ru", treeLeaf2.getName().getRu());
                Unit unit2 = Unit.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(jSONObjectPut2, "apply(...)");
                jSONArray.put(targetsLogger2.writeDataLogs(jSONObjectPut2, sessionSettingsLogger2));
                sessionSettingsLogger2.clear();
                return Unit.INSTANCE;
            }
        } else {
            Log.d(TAG, treeItem.getName().toString());
            List<TreeItem> children = treeItem.getChildren();
            c30871.L$0 = treeItem;
            c30871.L$1 = jSONArray;
            c30871.L$2 = null;
            c30871.L$3 = null;
            c30871.label = 3;
            objProcessChildren = targetsLogger.processChildren(children, c30871);
            if (objProcessChildren != coroutine_suspended) {
                JSONArray jSONArray3 = jSONArray;
                treeItem2 = treeItem;
                jSONArray2 = jSONArray3;
                jSONArray2.put(new JSONObject().put(treeItem2.getName().toString(), (JSONArray) objProcessChildren));
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }

    static /* synthetic */ Object processTree$default(TargetsLogger targetsLogger, TreeItem treeItem, JSONArray jSONArray, SessionSettingsLogger sessionSettingsLogger, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            sessionSettingsLogger = SessionSettingsLoggerImpl.INSTANCE;
        }
        return targetsLogger.processTree(treeItem, jSONArray, sessionSettingsLogger, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processChildren(List<? extends TreeItem> list, Continuation<? super JSONArray> continuation) {
        C30861 c30861;
        JSONArray jSONArray;
        Iterator it;
        JSONArray jSONArray2;
        C30861 c308612;
        if (continuation instanceof C30861) {
            c30861 = (C30861) continuation;
            if ((c30861.label & Integer.MIN_VALUE) != 0) {
                c30861.label -= Integer.MIN_VALUE;
            } else {
                c30861 = new C30861(continuation);
            }
        }
        Object obj = c30861.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c30861.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            jSONArray = new JSONArray();
            if (list != null) {
                it = list.iterator();
                jSONArray2 = jSONArray;
                c308612 = c30861;
            }
            return jSONArray;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = (Iterator) c30861.L$2;
        JSONArray jSONArray3 = (JSONArray) c30861.L$1;
        JSONArray jSONArray4 = (JSONArray) c30861.L$0;
        ResultKt.throwOnFailure(obj);
        c308612 = c30861;
        jSONArray2 = jSONArray3;
        jSONArray = jSONArray4;
        while (it.hasNext()) {
            TreeItem treeItem = (TreeItem) it.next();
            TargetsLogger targetsLogger = INSTANCE;
            c308612.L$0 = jSONArray;
            c308612.L$1 = jSONArray2;
            c308612.L$2 = it;
            c308612.label = 1;
            if (processTree$default(targetsLogger, treeItem, jSONArray2, null, c308612, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return jSONArray;
    }

    private final void countTargets(TreeItem node, Function0<Unit> onFound) {
        if (node instanceof TreeLeaf) {
            onFound.invoke();
        }
        List<TreeItem> children = node.getChildren();
        if (children != null) {
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                INSTANCE.countTargets((TreeItem) it.next(), onFound);
            }
        }
    }

    private final void processTarget(RecognitionTarget target, SessionSettingsLogger logger) {
        try {
            logger.clear();
            target.createSession(Model.INSTANCE.getEngineById(target.getEngineId()).getLoader().getEngine(), SessionType.VIDEO_SESSION, logger).delete();
        } catch (Throwable th) {
            Log.e(TAG, "processTarget " + target, th);
        }
    }

    private final JSONArray writeActionLogs(JSONArray jSONArray, SessionSettingsLogger sessionSettingsLogger) throws JSONException {
        for (SessionSettingsLogger.Action action : sessionSettingsLogger.getActions()) {
            JSONObject jSONObjectPut = new JSONObject().put("method", action.getMethod());
            JSONArray jSONArray2 = new JSONArray();
            Iterator<T> it = action.getArguments().iterator();
            while (it.hasNext()) {
                jSONArray2.put((String) it.next());
            }
            Unit unit = Unit.INSTANCE;
            jSONArray.put(jSONObjectPut.put("arguments", jSONArray2));
        }
        return jSONArray;
    }

    private final JSONObject writeDataLogs(final JSONObject jSONObject, SessionSettingsLogger sessionSettingsLogger) {
        Map<String, Object> data = sessionSettingsLogger.getData();
        final Function2 function2 = new Function2() { // from class: com.smartengines.app.targets.TargetsLogger$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TargetsLogger.writeDataLogs$lambda$11(jSONObject, (String) obj, obj2);
            }
        };
        data.forEach(new BiConsumer() { // from class: com.smartengines.app.targets.TargetsLogger$$ExternalSyntheticLambda2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                TargetsLogger.writeDataLogs$lambda$12(function2, obj, obj2);
            }
        });
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeDataLogs$lambda$12(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeDataLogs$lambda$11(JSONObject this_writeDataLogs, String key, Object value) throws JSONException {
        Intrinsics.checkNotNullParameter(this_writeDataLogs, "$this_writeDataLogs");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof List)) {
            if (value instanceof Map) {
                final JSONObject jSONObject = new JSONObject();
                final Function2<?, Object, Unit> function2 = new Function2<?, Object, Unit>() { // from class: com.smartengines.app.targets.TargetsLogger$writeDataLogs$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) throws JSONException {
                        invoke2((Object) obj, obj2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object obj, Object obj2) throws JSONException {
                        jSONObject.put(String.valueOf(obj), obj2);
                    }
                };
                ((Map) value).forEach(new BiConsumer() { // from class: com.smartengines.app.targets.TargetsLogger$$ExternalSyntheticLambda0
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        TargetsLogger.writeDataLogs$lambda$11$lambda$10$lambda$9(function2, obj, obj2);
                    }
                });
                Unit unit = Unit.INSTANCE;
                this_writeDataLogs.put(key, jSONObject);
            } else {
                this_writeDataLogs.put(key, value);
            }
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Iterable) value).iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            Unit unit2 = Unit.INSTANCE;
            this_writeDataLogs.put(key, jSONArray);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeDataLogs$lambda$11$lambda$10$lambda$9(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj, obj2);
    }
}
