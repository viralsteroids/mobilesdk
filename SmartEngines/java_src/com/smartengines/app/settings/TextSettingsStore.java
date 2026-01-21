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

/* compiled from: TextSettings.kt */
@Metadata(m513d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0012H\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m514d2 = {"Lcom/smartengines/app/settings/TextSettingsStore;", "Lcom/smartengines/app/settings/SettingsStore;", "Lcom/smartengines/app/settings/TextSettingsWriter;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "data", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/smartengines/app/settings/TextSettings;", "getData", "()Lkotlinx/coroutines/flow/StateFlow;", "writeLanguages", "", "value", "", "", "writePageDetection", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TextSettingsStore extends SettingsStore implements TextSettingsWriter {
    public static final int $stable = 8;
    private final StateFlow<TextSettings> data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSettingsStore(Context context) {
        super(TextSettingsKt.getTextDataStore(context));
        Intrinsics.checkNotNullParameter(context, "context");
        final Flow<Preferences> data = getDataStore().getData();
        this.data = FlowKt.stateIn(new Flow<TextSettings>() { // from class: com.smartengines.app.settings.TextSettingsStore$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m514d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
            /* renamed from: com.smartengines.app.settings.TextSettingsStore$special$$inlined$map$1$2 */
            public static final class C30842<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                @DebugMetadata(m532c = "com.smartengines.app.settings.TextSettingsStore$special$$inlined$map$1$2", m533f = "TextSettings.kt", m534i = {}, m535l = {223}, m536m = "emit", m537n = {}, m538s = {})
                /* renamed from: com.smartengines.app.settings.TextSettingsStore$special$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C30842.this.emit(null, this);
                    }
                }

                public C30842(FlowCollector flowCollector) {
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
                        TextSettings textSettings = new TextSettings((Preferences) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(textSettings, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super TextSettings> flowCollector, Continuation continuation) {
                Object objCollect = data.collect(new C30842(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, getCoroutineScope(), SharingStarted.INSTANCE.getEagerly(), new TextSettings(PreferencesFactory.createEmpty()));
    }

    public final StateFlow<TextSettings> getData() {
        return this.data;
    }

    @Override // com.smartengines.app.settings.TextSettingsWriter
    public void writeLanguages(Set<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        writeValue(TextSettingsKt.LANGUAGES, value);
    }

    @Override // com.smartengines.app.settings.TextSettingsWriter
    public void writePageDetection(boolean value) {
        writeValue(TextSettingsKt.PAGE_DETECTION, Boolean.valueOf(value));
    }
}
