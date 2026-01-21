package com.smartengines.nfc;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.util.Log;
import com.smartengines.nfc.NfcAdapterWrapper;
import com.smartengines.nfc.PassportReaderState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jmrtd.BACKey;

/* compiled from: PassportReader.kt */
@Metadata(m513d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!J,\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0002J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!J\u0016\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+2\u0006\u0010 \u001a\u00020!R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001a¨\u0006,"}, m514d2 = {"Lcom/smartengines/nfc/PassportReader;", "", "readingEngine", "Lcom/smartengines/nfc/ReadingEngine;", "<init>", "(Lcom/smartengines/nfc/ReadingEngine;)V", "getReadingEngine", "()Lcom/smartengines/nfc/ReadingEngine;", "setReadingEngine", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "passportKeyFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/smartengines/nfc/PassportKey;", "getPassportKeyFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setPassportKeyFlow", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "_stateFlow", "Lcom/smartengines/nfc/PassportReaderState;", "stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "isActive", "", "()Z", "changeReadingEngine", "", "newReadingEngine", "setNotSupported", "activate", "activity", "Landroid/app/Activity;", "reset", "readPassportData", "isoDep", "Landroid/nfc/tech/IsoDep;", "checkChip", "checkData", "onResumeActivity", "onNewIntent", "intent", "Landroid/content/Intent;", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class PassportReader {
    private final MutableStateFlow<PassportReaderState> _stateFlow;
    private final CoroutineScope coroutineScope;
    private MutableStateFlow<PassportKey> passportKeyFlow;
    private ReadingEngine readingEngine;

    /* compiled from: PassportReader.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NfcAdapterWrapper.ActivationResult.values().length];
            try {
                iArr[NfcAdapterWrapper.ActivationResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NfcAdapterWrapper.ActivationResult.ERROR_DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NfcAdapterWrapper.ActivationResult.ERROR_NOT_SUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PassportReader() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public PassportReader(ReadingEngine readingEngine) {
        Intrinsics.checkNotNullParameter(readingEngine, "readingEngine");
        this.readingEngine = readingEngine;
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        this.passportKeyFlow = StateFlowKt.MutableStateFlow(null);
        this._stateFlow = StateFlowKt.MutableStateFlow(PassportReaderState.Disabled.INSTANCE);
    }

    public /* synthetic */ PassportReader(ReadingEngineScuba readingEngineScuba, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ReadingEngineScuba() : readingEngineScuba);
    }

    public final ReadingEngine getReadingEngine() {
        return this.readingEngine;
    }

    public final void setReadingEngine(ReadingEngine readingEngine) {
        Intrinsics.checkNotNullParameter(readingEngine, "<set-?>");
        this.readingEngine = readingEngine;
    }

    public final MutableStateFlow<PassportKey> getPassportKeyFlow() {
        return this.passportKeyFlow;
    }

    public final void setPassportKeyFlow(MutableStateFlow<PassportKey> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.passportKeyFlow = mutableStateFlow;
    }

    public final StateFlow<PassportReaderState> getStateFlow() {
        return this._stateFlow;
    }

    public final boolean isActive() {
        return SetsKt.setOf((Object[]) new PassportReaderState[]{PassportReaderState.Waiting.INSTANCE, PassportReaderState.Reading.INSTANCE}).contains(getStateFlow().getValue());
    }

    public final void changeReadingEngine(ReadingEngine newReadingEngine) {
        Intrinsics.checkNotNullParameter(newReadingEngine, "newReadingEngine");
        Log.w("myapp.PassportReader", "changeReadingEngine " + newReadingEngine);
        this.readingEngine = newReadingEngine;
    }

    private final void setNotSupported() {
        this._stateFlow.setValue(PassportReaderState.NotSupported.INSTANCE);
    }

    public final void activate(Activity activity) {
        PassportReaderState.Waiting error;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Log.d("myapp.PassportReader", "activate");
        if (isActive()) {
            return;
        }
        NfcAdapterWrapper.ActivationResult activationResultEnableNfcReceiving = NfcAdapterWrapper.INSTANCE.enableNfcReceiving(activity, true);
        MutableStateFlow<PassportReaderState> mutableStateFlow = this._stateFlow;
        int i = WhenMappings.$EnumSwitchMapping$0[activationResultEnableNfcReceiving.ordinal()];
        if (i == 1) {
            error = PassportReaderState.Waiting.INSTANCE;
        } else if (i == 2) {
            error = new PassportReaderState.Error("NFC adapter is disabled");
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            error = PassportReaderState.NotSupported.INSTANCE;
        }
        mutableStateFlow.setValue(error);
    }

    public final void reset(Activity activity) {
        Log.d("myapp.PassportReader", "reset");
        this._stateFlow.setValue(PassportReaderState.Disabled.INSTANCE);
        if (activity != null) {
            NfcAdapterWrapper.INSTANCE.enableNfcReceiving(activity, false);
        }
    }

    static /* synthetic */ void readPassportData$default(PassportReader passportReader, IsoDep isoDep, Activity activity, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        passportReader.readPassportData(isoDep, activity, z, z2);
    }

    private final void readPassportData(IsoDep isoDep, Activity activity, boolean checkChip, boolean checkData) {
        PassportKey value = this.passportKeyFlow.getValue();
        Log.d("myapp.PassportReader", "readPassportData, passportKey: " + value);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C32941(value, isoDep, activity, null), 3, null);
    }

    /* compiled from: PassportReader.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.nfc.PassportReader$readPassportData$1", m533f = "PassportReader.kt", m534i = {}, m535l = {}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.nfc.PassportReader$readPassportData$1 */
    static final class C32941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ IsoDep $isoDep;
        final /* synthetic */ PassportKey $passportKey;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32941(PassportKey passportKey, IsoDep isoDep, Activity activity, Continuation<? super C32941> continuation) {
            super(2, continuation);
            this.$passportKey = passportKey;
            this.$isoDep = isoDep;
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PassportReader.this.new C32941(this.$passportKey, this.$isoDep, this.$activity, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            PassportKey passportKey;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    PassportReader.this._stateFlow.setValue(PassportReaderState.Reading.INSTANCE);
                    passportKey = this.$passportKey;
                } catch (Exception e) {
                    Log.e("myapp.PassportReader", "readPassportData", e);
                    MutableStateFlow mutableStateFlow = PassportReader.this._stateFlow;
                    String message = e.getMessage();
                    if (message == null) {
                        message = e.toString();
                    }
                    mutableStateFlow.setValue(new PassportReaderState.Error(message));
                }
                if (passportKey == null) {
                    throw new Exception("passport key is null");
                }
                BACKey bACKey = new BACKey(passportKey.getPassportNumber(), passportKey.getBirthDate(), passportKey.getExpirationDate());
                PassportReader.this.getReadingEngine().open(this.$isoDep);
                PassportData passportData = PassportReader.this.getReadingEngine().readPassportData(bACKey);
                Log.w("myapp.PassportReader", "Success");
                PassportReader.this._stateFlow.setValue(new PassportReaderState.Data(passportData));
                PassportReader.this.getReadingEngine().close();
                NfcAdapterWrapper.INSTANCE.enableNfcReceiving(this.$activity, false);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onResumeActivity(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Log.d("myapp.PassportReader", "onResumeActivity nfcEnabled:" + isActive());
        if (!(getStateFlow().getValue() instanceof PassportReaderState.NotSupported) && NfcAdapterWrapper.INSTANCE.enableNfcReceiving(activity, isActive()) == NfcAdapterWrapper.ActivationResult.ERROR_NOT_SUPPORTED) {
            setNotSupported();
        }
    }

    public final void onNewIntent(Intent intent, Activity activity) {
        Tag isoDepTag;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Log.d("myapp.PassportReader", "onNewIntent intent:" + intent);
        if (!isActive() || (isoDepTag = NfcAdapterWrapper.INSTANCE.getIsoDepTag(intent)) == null) {
            return;
        }
        IsoDep isoDep = IsoDep.get(isoDepTag);
        Intrinsics.checkNotNullExpressionValue(isoDep, "get(...)");
        readPassportData$default(this, isoDep, activity, false, false, 12, null);
    }
}
