package com.smartengines.app.settings;

import android.content.Context;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.exifinterface.media.ExifInterface;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CodeSettings.kt */
@Metadata(m513d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0016H\u0016J\u0016\u0010\u0019\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0016H\u0016J\u0016\u0010\u001b\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J\u0016\u0010\u001d\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J\u0016\u0010\u001f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0012H\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006!"}, m514d2 = {"Lcom/smartengines/app/settings/CodeSettingsStore;", "Lcom/smartengines/app/settings/SettingsStore;", "Lcom/smartengines/app/settings/CodeSettingsWriter;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "data", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/smartengines/app/settings/CodeSettings;", "getData", "()Lkotlinx/coroutines/flow/StateFlow;", "writeBarcodeTypes", "", "value", "", "", "writeBarcodeMax", "", "writeBarcodeRoi", "writeBarcodeEffort", "writeBarcodeDecode", "", "writeBarcodeSmart", "writeBarcodeNonpayment", "writeCardTypes", "writeShowOptionalData", "writePaymentTypes", "writeLineMax", "writeLineTypes", "writeMeterMax", "writePlateTypes", "writeContainerMax", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CodeSettingsStore extends SettingsStore implements CodeSettingsWriter {
    public static final int $stable = 8;
    private final StateFlow<CodeSettings> data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeSettingsStore(Context context) {
        super(CodeSettingsKt.getCodeDataStore(context));
        Intrinsics.checkNotNullParameter(context, "context");
        final Flow<Preferences> data = getDataStore().getData();
        this.data = FlowKt.stateIn(new Flow<CodeSettings>() { // from class: com.smartengines.app.settings.CodeSettingsStore$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m514d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
            /* renamed from: com.smartengines.app.settings.CodeSettingsStore$special$$inlined$map$1$2 */
            public static final class C30792<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                @DebugMetadata(m532c = "com.smartengines.app.settings.CodeSettingsStore$special$$inlined$map$1$2", m533f = "CodeSettings.kt", m534i = {}, m535l = {223}, m536m = "emit", m537n = {}, m538s = {})
                /* renamed from: com.smartengines.app.settings.CodeSettingsStore$special$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C30792.this.emit(null, this);
                    }
                }

                public C30792(FlowCollector flowCollector) {
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
                        CodeSettings codeSettings = new CodeSettings((Preferences) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(codeSettings, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super CodeSettings> flowCollector, Continuation continuation) {
                Object objCollect = data.collect(new C30792(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, getCoroutineScope(), SharingStarted.INSTANCE.getEagerly(), new CodeSettings(PreferencesFactory.createEmpty()));
    }

    public final StateFlow<CodeSettings> getData() {
        return this.data;
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeBarcodeTypes(Set<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        writeValue(CodeSettingsKt.BARCODE_TYPES, value);
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeBarcodeMax(int value) {
        writeValue(CodeSettingsKt.BARCODE_MAX, Integer.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeBarcodeRoi(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        writeValue(CodeSettingsKt.BARCODE_ROI, value);
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeBarcodeEffort(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        writeValue(CodeSettingsKt.BARCODE_EFFORT, value);
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeBarcodeDecode(boolean value) {
        writeValue(CodeSettingsKt.BARCODE_DECODE, Boolean.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeBarcodeSmart(boolean value) {
        writeValue(CodeSettingsKt.BARCODE_SMART, Boolean.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeBarcodeNonpayment(boolean value) {
        writeValue(CodeSettingsKt.BARCODE_NONPAYMENT, Boolean.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeCardTypes(Set<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        writeValue(CodeSettingsKt.CARD_TYPES, value);
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeShowOptionalData(boolean value) {
        writeValue(CodeSettingsKt.CARD_OPTIONAL, Boolean.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writePaymentTypes(Set<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        writeValue(CodeSettingsKt.PAYMENT_TYPES, value);
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeLineMax(int value) {
        writeValue(CodeSettingsKt.LINE_MAX, Integer.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeLineTypes(Set<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        writeValue(CodeSettingsKt.LINE_TYPES, value);
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeMeterMax(int value) {
        writeValue(CodeSettingsKt.METER_MAX, Integer.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writePlateTypes(Set<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        writeValue(CodeSettingsKt.PLATE_TYPES, value);
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeContainerMax(int value) {
        writeValue(CodeSettingsKt.CONTAINER_MAX, Integer.valueOf(value));
    }
}
