package com.smartengines.app.settings;

import android.content.Context;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.exifinterface.media.ExifInterface;
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

/* compiled from: CommonSettings.kt */
@Metadata(m513d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, m514d2 = {"Lcom/smartengines/app/settings/CommonSettingsStore;", "Lcom/smartengines/app/settings/SettingsStore;", "Lcom/smartengines/app/settings/CommonSettingWriter;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "data", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/smartengines/app/settings/CommonSettings;", "getData", "()Lkotlinx/coroutines/flow/StateFlow;", "writeExtendedMode", "", "value", "", "writeTutorialShown", "writeEulaVersion", "", "writeDarkTheme", "writeShowQuads", "writeResultPreview", "writeAlwaysAccepted", "writeSavePhoto", "writeSaveVideo", "writeLivenessIntro", "writeSessionTimeout", "", "writeMultiThreading", "writeComputeMetrics", "writeIgnoreTerminal", "writeEnableStoppers", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CommonSettingsStore extends SettingsStore implements CommonSettingWriter {
    public static final int $stable = 8;
    private final StateFlow<CommonSettings> data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonSettingsStore(Context context) {
        super(CommonSettingsKt.getCommonDataStore(context));
        Intrinsics.checkNotNullParameter(context, "context");
        final Flow<Preferences> data = getDataStore().getData();
        this.data = FlowKt.stateIn(new Flow<CommonSettings>() { // from class: com.smartengines.app.settings.CommonSettingsStore$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m514d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
            /* renamed from: com.smartengines.app.settings.CommonSettingsStore$special$$inlined$map$1$2 */
            public static final class C30802<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                @DebugMetadata(m532c = "com.smartengines.app.settings.CommonSettingsStore$special$$inlined$map$1$2", m533f = "CommonSettings.kt", m534i = {}, m535l = {223}, m536m = "emit", m537n = {}, m538s = {})
                /* renamed from: com.smartengines.app.settings.CommonSettingsStore$special$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C30802.this.emit(null, this);
                    }
                }

                public C30802(FlowCollector flowCollector) {
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
                        CommonSettings commonSettings = new CommonSettings((Preferences) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(commonSettings, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super CommonSettings> flowCollector, Continuation continuation) {
                Object objCollect = data.collect(new C30802(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, getCoroutineScope(), SharingStarted.INSTANCE.getEagerly(), new CommonSettings(PreferencesFactory.createEmpty()));
    }

    public final StateFlow<CommonSettings> getData() {
        return this.data;
    }

    @Override // com.smartengines.app.settings.CommonSettingWriter
    public void writeExtendedMode(boolean value) {
        writeValue(CommonSettingsKt.EXTENDED_MODE, Boolean.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CommonSettingWriter
    public void writeTutorialShown(boolean value) {
        writeValue(CommonSettingsKt.TUTORIAL_SHOWN, Boolean.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CommonSettingWriter
    public void writeEulaVersion(long value) {
        writeValue(CommonSettingsKt.EULA_VERSION, Long.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CommonSettingWriter
    public void writeDarkTheme(boolean value) {
        writeValue(CommonSettingsKt.DARK_THEME, Boolean.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CommonSettingWriter
    public void writeShowQuads(boolean value) {
        writeValue(CommonSettingsKt.SHOW_QUADS, Boolean.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CommonSettingWriter
    public void writeResultPreview(boolean value) {
        writeValue(CommonSettingsKt.RESULT_PREVIEW, Boolean.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CommonSettingWriter
    public void writeAlwaysAccepted(boolean value) {
        writeValue(CommonSettingsKt.ALWAYS_ACCEPTED, Boolean.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CommonSettingWriter
    public void writeSavePhoto(boolean value) {
        writeValue(CommonSettingsKt.SAVE_PHOTO, Boolean.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CommonSettingWriter
    public void writeSaveVideo(boolean value) {
        writeValue(CommonSettingsKt.SAVE_VIDEO, Boolean.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CommonSettingWriter
    public void writeLivenessIntro(boolean value) {
        writeValue(CommonSettingsKt.LIVENESS_INTRO, Boolean.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CommonSettingWriter
    public void writeSessionTimeout(int value) {
        writeValue(CommonSettingsKt.SESSION_TIMEOUT, Integer.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CommonSettingWriter
    public void writeMultiThreading(boolean value) {
        writeValue(CommonSettingsKt.MULTI_THREADING, Boolean.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CommonSettingWriter
    public void writeComputeMetrics(boolean value) {
        writeValue(CommonSettingsKt.COMPUTE_METRICS, Boolean.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CommonSettingWriter
    public void writeIgnoreTerminal(boolean value) {
        writeValue(CommonSettingsKt.IGNORE_TERMINAL, Boolean.valueOf(value));
    }

    @Override // com.smartengines.app.settings.CommonSettingWriter
    public void writeEnableStoppers(boolean value) {
        writeValue(CommonSettingsKt.ENABLE_STOPPERS, Boolean.valueOf(value));
    }
}
