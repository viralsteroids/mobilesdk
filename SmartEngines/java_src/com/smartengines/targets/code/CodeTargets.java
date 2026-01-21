package com.smartengines.targets.code;

import android.util.Log;
import androidx.camera.core.processing.util.GLUtils;
import androidx.compose.material3.internal.TextFieldImplKt;
import com.smartengines.code.CodeEngineSessionSettings;
import com.smartengines.engine.Engine;
import com.smartengines.engine.EngineId;
import com.smartengines.engine.RecognitionTarget;
import com.smartengines.engine.Session;
import com.smartengines.engine.SessionSettingsLogger;
import com.smartengines.engine.SessionType;
import com.smartengines.engine.code.CodeEngineWrapper;
import com.smartengines.engine.code.CodeSessionWrapper;
import com.smartengines.targets.CommonSettings;
import com.smartengines.targets.TargetSettingsKt;
import com.smartengines.targets.code.CodeSessionOptions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeTargets.kt */
@Metadata(m513d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\"\bÆ\u0002\u0018\u00002\u00020\u0001:\u0018 !\"#$%&'()*+,-./01234567B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0012J\u0018\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0002J\"\u0010\u0018\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\"\u0010\u001b\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u001c\u0010\u001d\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u00068"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets;", "", "<init>", "()V", "sessionOptions", "Lcom/smartengines/targets/code/CodeSessionOptions;", "getSessionOptions", "()Lcom/smartengines/targets/code/CodeSessionOptions;", "setSessionOptions", "(Lcom/smartengines/targets/code/CodeSessionOptions;)V", "sessionSettingsLogger", "Lcom/smartengines/engine/SessionSettingsLogger;", "getSessionSettingsLogger", "()Lcom/smartengines/engine/SessionSettingsLogger;", "setSessionSettingsLogger", "(Lcom/smartengines/engine/SessionSettingsLogger;)V", "loadEngineSupportedTypes", "", "", "engine", "setGlobalOptions", "", "Lcom/smartengines/code/CodeEngineSessionSettings;", "sessionTimeout", "fillEngineSupportedTypesByDisabled", "internalEngine", "disabledTypes", "fillEngineSupportedTypesByAllowed", "allowedTypes", "setOption", "key", "value", "CodeTargetBase", "BankCard", "Barcode", "BarcodeSession", "BarcodePayment", "PaymentDetails", "LicensePlate", "LicensePlateAre", "CodeTextLine", "CodeTextLineNumbers", "CodeTextLineMeters", "CodeTextLineIban", "CodeTextLinePhone", "CodeTextLinePhoneCis", "CodeTextLineCardNumber", "CodeTextLineInn", "CodeTextLineKpp", "CodeTextLineBic", "CodeTextLineVin", "CodeTextLineBankAccount", "CodeTextLineContainerNumber", "Mrz", "UniversalPay", TextFieldImplKt.ContainerId, "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CodeTargets {
    public static final CodeTargets INSTANCE = new CodeTargets();
    public static CodeSessionOptions sessionOptions;
    private static SessionSettingsLogger sessionSettingsLogger;

    private CodeTargets() {
    }

    public final CodeSessionOptions getSessionOptions() {
        CodeSessionOptions codeSessionOptions = sessionOptions;
        if (codeSessionOptions != null) {
            return codeSessionOptions;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionOptions");
        return null;
    }

    public final void setSessionOptions(CodeSessionOptions codeSessionOptions) {
        Intrinsics.checkNotNullParameter(codeSessionOptions, "<set-?>");
        sessionOptions = codeSessionOptions;
    }

    public final SessionSettingsLogger getSessionSettingsLogger() {
        return sessionSettingsLogger;
    }

    public final void setSessionSettingsLogger(SessionSettingsLogger sessionSettingsLogger2) {
        sessionSettingsLogger = sessionSettingsLogger2;
    }

    public final Set<String> loadEngineSupportedTypes(String engine) {
        List<CodeSessionOptions.Option> subtypes;
        Intrinsics.checkNotNullParameter(engine, "engine");
        HashSet hashSet = new HashSet();
        CodeSessionOptions.InternalEngine internalEngine = INSTANCE.getSessionOptions().getInternalEngines().get(engine);
        if (internalEngine != null && (subtypes = internalEngine.getSubtypes()) != null) {
            Iterator<T> it = subtypes.iterator();
            while (it.hasNext()) {
                hashSet.add(((CodeSessionOptions.Option) it.next()).getSubkeys().get(1));
            }
        }
        return hashSet;
    }

    static /* synthetic */ void setGlobalOptions$default(CodeTargets codeTargets, CodeEngineSessionSettings codeEngineSessionSettings, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        codeTargets.setGlobalOptions(codeEngineSessionSettings, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setGlobalOptions(CodeEngineSessionSettings codeEngineSessionSettings, String str) {
        CommonSettings common = TargetSettingsKt.getTargetSettings().getCommon();
        CodeTargets codeTargets = INSTANCE;
        if (str == null) {
            str = common.getSessionTimeout() + ".0";
        }
        codeTargets.setOption(codeEngineSessionSettings, "global.sessionTimeout", str);
        codeTargets.setOption(codeEngineSessionSettings, "global.enableMultiThreading", String.valueOf(common.getMultiThreading()));
        codeTargets.setOption(codeEngineSessionSettings, "_computeMetrics", String.valueOf(common.getComputeMetrics()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fillEngineSupportedTypesByDisabled(CodeEngineSessionSettings codeEngineSessionSettings, String str, Set<String> set) {
        for (String str2 : loadEngineSupportedTypes(str)) {
            INSTANCE.setOption(codeEngineSessionSettings, str + '.' + str2 + ".enabled", set.contains(str2) ? "false" : "true");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fillEngineSupportedTypesByAllowed(CodeEngineSessionSettings codeEngineSessionSettings, String str, Set<String> set) {
        for (String str2 : loadEngineSupportedTypes(str)) {
            INSTANCE.setOption(codeEngineSessionSettings, str + '.' + str2 + ".enabled", set.contains(str2) ? "true" : "false");
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0014\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0011\u001a\u00020\nH&R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;", "Lcom/smartengines/engine/RecognitionTarget;", "<init>", "()V", "engineId", "Lcom/smartengines/engine/EngineId;", "getEngineId", "()Lcom/smartengines/engine/EngineId;", "sessionTypes", "", "Lcom/smartengines/engine/SessionType;", "getSessionTypes", "()Ljava/util/Set;", "createSession", "Lcom/smartengines/engine/Session;", "engine", "Lcom/smartengines/engine/Engine;", "sessionType", "logger", "Lcom/smartengines/engine/SessionSettingsLogger;", "fill", "", "Lcom/smartengines/code/CodeEngineSessionSettings;", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static abstract class CodeTargetBase implements RecognitionTarget {
        private final EngineId engineId = EngineId.CODE;
        private final Set<SessionType> sessionTypes = SetsKt.setOf((Object[]) new SessionType[]{SessionType.VIDEO_SESSION, SessionType.PHOTO_SESSION, SessionType.GALLERY_SESSION});

        public abstract void fill(CodeEngineSessionSettings codeEngineSessionSettings, SessionType sessionType);

        @Override // com.smartengines.engine.RecognitionTarget
        public EngineId getEngineId() {
            return this.engineId;
        }

        @Override // com.smartengines.engine.RecognitionTarget
        public Set<SessionType> getSessionTypes() {
            return this.sessionTypes;
        }

        @Override // com.smartengines.engine.RecognitionTarget
        public Session createSession(Engine engine, SessionType sessionType, SessionSettingsLogger logger) {
            Intrinsics.checkNotNullParameter(engine, "engine");
            Intrinsics.checkNotNullParameter(sessionType, "sessionType");
            CodeTargets.INSTANCE.setSessionSettingsLogger(logger);
            CodeEngineWrapper codeEngineWrapper = (CodeEngineWrapper) engine;
            CodeEngineSessionSettings codeEngineSessionSettingsGetDefaultSessionSettings = codeEngineWrapper.getCodeEngine().GetDefaultSessionSettings();
            Intrinsics.checkNotNull(codeEngineSessionSettingsGetDefaultSessionSettings);
            fill(codeEngineSessionSettingsGetDefaultSessionSettings, sessionType);
            if (logger != null) {
                CodeTargetsKt.dump(logger, codeEngineSessionSettingsGetDefaultSessionSettings);
            }
            return new CodeSessionWrapper(codeEngineWrapper.getCodeEngine(), codeEngineSessionSettingsGetDefaultSessionSettings, codeEngineWrapper.getSignature());
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$BankCard;", "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;", "<init>", "()V", "internalEngine", "", "getInternalEngine", "()Ljava/lang/String;", "fill", "", "Lcom/smartengines/code/CodeEngineSessionSettings;", "sessionType", "Lcom/smartengines/engine/SessionType;", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class BankCard extends CodeTargetBase {
        private final String internalEngine = "bank_card";

        /* compiled from: CodeTargets.kt */
        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SessionType.values().length];
                try {
                    iArr[SessionType.VIDEO_SESSION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SessionType.GALLERY_SESSION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SessionType.PHOTO_SESSION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final String getInternalEngine() {
            return this.internalEngine;
        }

        @Override // com.smartengines.targets.code.CodeTargets.CodeTargetBase
        public void fill(CodeEngineSessionSettings codeEngineSessionSettings, SessionType sessionType) {
            Intrinsics.checkNotNullParameter(codeEngineSessionSettings, "<this>");
            Intrinsics.checkNotNullParameter(sessionType, "sessionType");
            CodeTargets.setGlobalOptions$default(CodeTargets.INSTANCE, codeEngineSessionSettings, null, 1, null);
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "bank_card.enabled", "true");
            CodeTargets.INSTANCE.fillEngineSupportedTypesByDisabled(codeEngineSessionSettings, "bank_card", TargetSettingsKt.getTargetSettings().getCode().getCardTypes());
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "bank_card.enableStoppers", String.valueOf(TargetSettingsKt.getTargetSettings().getCommon().getEnableStoppers()));
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "bank_card.extractBankCardImages.enabled", "true");
            int i = WhenMappings.$EnumSwitchMapping$0[sessionType.ordinal()];
            if (i == 1 || i == 2) {
                CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "bank_card.captureMode", "anywhere");
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$Barcode;", "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;", "<init>", "()V", "fill", "", "Lcom/smartengines/code/CodeEngineSessionSettings;", "sessionType", "Lcom/smartengines/engine/SessionType;", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class Barcode extends CodeTargetBase {
        public static final String INTERNAL_ENGINE = "barcode";

        @Override // com.smartengines.targets.code.CodeTargets.CodeTargetBase
        public void fill(CodeEngineSessionSettings codeEngineSessionSettings, SessionType sessionType) {
            Intrinsics.checkNotNullParameter(codeEngineSessionSettings, "<this>");
            Intrinsics.checkNotNullParameter(sessionType, "sessionType");
            CodeSettings code = TargetSettingsKt.getTargetSettings().getCode();
            CodeTargets.setGlobalOptions$default(CodeTargets.INSTANCE, codeEngineSessionSettings, null, 1, null);
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.enabled", "true");
            CodeTargets.INSTANCE.fillEngineSupportedTypesByDisabled(codeEngineSessionSettings, INTERNAL_ENGINE, code.getBarcodeTypes());
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.feedMode", "single");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.effortLevel", code.getBarcodeEffort());
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.maxAllowedCodes", String.valueOf(code.getBarcodeMax()));
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.roiDetectionMode", sessionType.isVideo() ? code.getBarcodeRoi() : "anywhere");
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$BarcodeSession;", "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;", "<init>", "()V", "fill", "", "Lcom/smartengines/code/CodeEngineSessionSettings;", "sessionType", "Lcom/smartengines/engine/SessionType;", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class BarcodeSession extends CodeTargetBase {
        @Override // com.smartengines.targets.code.CodeTargets.CodeTargetBase
        public void fill(CodeEngineSessionSettings codeEngineSessionSettings, SessionType sessionType) {
            Intrinsics.checkNotNullParameter(codeEngineSessionSettings, "<this>");
            Intrinsics.checkNotNullParameter(sessionType, "sessionType");
            CodeSettings code = TargetSettingsKt.getTargetSettings().getCode();
            CodeTargets.INSTANCE.setGlobalOptions(codeEngineSessionSettings, GLUtils.VERSION_UNKNOWN);
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.enabled", "true");
            CodeTargets.INSTANCE.fillEngineSupportedTypesByDisabled(codeEngineSessionSettings, Barcode.INTERNAL_ENGINE, code.getBarcodeTypes());
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.feedMode", sessionType.isVideo() ? "sequence" : "single");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.effortLevel", code.getBarcodeEffort());
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.maxAllowedCodes", "50");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.roiDetectionMode", sessionType.isVideo() ? code.getBarcodeRoi() : "anywhere");
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$BarcodePayment;", "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;", "<init>", "()V", "fill", "", "Lcom/smartengines/code/CodeEngineSessionSettings;", "sessionType", "Lcom/smartengines/engine/SessionType;", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class BarcodePayment extends CodeTargetBase {
        @Override // com.smartengines.targets.code.CodeTargets.CodeTargetBase
        public void fill(CodeEngineSessionSettings codeEngineSessionSettings, SessionType sessionType) {
            Intrinsics.checkNotNullParameter(codeEngineSessionSettings, "<this>");
            Intrinsics.checkNotNullParameter(sessionType, "sessionType");
            CodeSettings code = TargetSettingsKt.getTargetSettings().getCode();
            CodeTargets.setGlobalOptions$default(CodeTargets.INSTANCE, codeEngineSessionSettings, null, 1, null);
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.enabled", "true");
            CodeTargets.INSTANCE.fillEngineSupportedTypesByDisabled(codeEngineSessionSettings, Barcode.INTERNAL_ENGINE, code.getBarcodeTypes());
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.feedMode", "single");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.effortLevel", code.getBarcodeEffort());
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.maxAllowedCodes", "1");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.roiDetectionMode", sessionType.isVideo() ? code.getBarcodeRoi() : "anywhere");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.smartPaymentBarDecoding", String.valueOf(code.getBarcodeSmart()));
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.preset", "PAYMENT|URL");
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$PaymentDetails;", "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;", "<init>", "()V", "fill", "", "Lcom/smartengines/code/CodeEngineSessionSettings;", "sessionType", "Lcom/smartengines/engine/SessionType;", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class PaymentDetails extends CodeTargetBase {
        public static final String INTERNAL_ENGINE = "payment_details";

        @Override // com.smartengines.targets.code.CodeTargets.CodeTargetBase
        public void fill(CodeEngineSessionSettings codeEngineSessionSettings, SessionType sessionType) {
            Intrinsics.checkNotNullParameter(codeEngineSessionSettings, "<this>");
            Intrinsics.checkNotNullParameter(sessionType, "sessionType");
            CodeSettings code = TargetSettingsKt.getTargetSettings().getCode();
            CodeTargets.setGlobalOptions$default(CodeTargets.INSTANCE, codeEngineSessionSettings, null, 1, null);
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "payment_details.enabled", "true");
            CodeTargets.INSTANCE.fillEngineSupportedTypesByDisabled(codeEngineSessionSettings, INTERNAL_ENGINE, code.getPaymentTypes());
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "payment_details.captureMode", sessionType.isVideo() ? "mobile" : "anywhere");
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$LicensePlate;", "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;", "<init>", "()V", "fill", "", "Lcom/smartengines/code/CodeEngineSessionSettings;", "sessionType", "Lcom/smartengines/engine/SessionType;", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class LicensePlate extends CodeTargetBase {
        public static final String INTERNAL_ENGINE = "license_plate";

        @Override // com.smartengines.targets.code.CodeTargets.CodeTargetBase
        public void fill(CodeEngineSessionSettings codeEngineSessionSettings, SessionType sessionType) {
            Intrinsics.checkNotNullParameter(codeEngineSessionSettings, "<this>");
            Intrinsics.checkNotNullParameter(sessionType, "sessionType");
            CodeTargets.setGlobalOptions$default(CodeTargets.INSTANCE, codeEngineSessionSettings, null, 1, null);
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "license_plate.enabled", "true");
            CodeTargets.INSTANCE.fillEngineSupportedTypesByDisabled(codeEngineSessionSettings, "license_plate", SetsKt.plus(TargetSettingsKt.getTargetSettings().getCode().getPlateTypes(), "are"));
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$LicensePlateAre;", "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;", "<init>", "()V", "fill", "", "Lcom/smartengines/code/CodeEngineSessionSettings;", "sessionType", "Lcom/smartengines/engine/SessionType;", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class LicensePlateAre extends CodeTargetBase {
        public static final String INTERNAL_ENGINE = "license_plate";

        @Override // com.smartengines.targets.code.CodeTargets.CodeTargetBase
        public void fill(CodeEngineSessionSettings codeEngineSessionSettings, SessionType sessionType) {
            Intrinsics.checkNotNullParameter(codeEngineSessionSettings, "<this>");
            Intrinsics.checkNotNullParameter(sessionType, "sessionType");
            CodeTargets.setGlobalOptions$default(CodeTargets.INSTANCE, codeEngineSessionSettings, null, 1, null);
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "license_plate.enabled", "true");
            CodeTargets.INSTANCE.fillEngineSupportedTypesByAllowed(codeEngineSessionSettings, "license_plate", SetsKt.setOf("are"));
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;", "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;", "allowedTypes", "", "", "<init>", "(Ljava/util/Set;)V", "fill", "", "Lcom/smartengines/code/CodeEngineSessionSettings;", "sessionType", "Lcom/smartengines/engine/SessionType;", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static abstract class CodeTextLine extends CodeTargetBase {
        public static final String INTERNAL_ENGINE = "code_text_line";
        private final Set<String> allowedTypes;

        public CodeTextLine(Set<String> allowedTypes) {
            Intrinsics.checkNotNullParameter(allowedTypes, "allowedTypes");
            this.allowedTypes = allowedTypes;
        }

        @Override // com.smartengines.targets.code.CodeTargets.CodeTargetBase
        public void fill(CodeEngineSessionSettings codeEngineSessionSettings, SessionType sessionType) {
            Intrinsics.checkNotNullParameter(codeEngineSessionSettings, "<this>");
            Intrinsics.checkNotNullParameter(sessionType, "sessionType");
            CodeTargets.setGlobalOptions$default(CodeTargets.INSTANCE, codeEngineSessionSettings, null, 1, null);
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "code_text_line.enabled", "true");
            CodeTargets.INSTANCE.fillEngineSupportedTypesByAllowed(codeEngineSessionSettings, INTERNAL_ENGINE, this.allowedTypes);
            CodeSettings code = TargetSettingsKt.getTargetSettings().getCode();
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "code_text_line.maxAllowedObjects", this.allowedTypes.contains(CodeTextLineMeters.ALLOWED_TYPE) ? String.valueOf(code.getMeterMax()) : String.valueOf(code.getLineMax()));
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$CodeTextLineNumbers;", "Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;", "<init>", "()V", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class CodeTextLineNumbers extends CodeTextLine {
        public CodeTextLineNumbers() {
            super(SetsKt.setOf((Object[]) new String[]{CodeTextLineCardNumber.ALLOWED_TYPE, CodeTextLinePhone.ALLOWED_TYPE, CodeTextLinePhoneCis.ALLOWED_TYPE}));
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$CodeTextLineMeters;", "Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;", "<init>", "()V", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class CodeTextLineMeters extends CodeTextLine {
        public static final String ALLOWED_TYPE = "meters";

        public CodeTextLineMeters() {
            super(SetsKt.setOf(ALLOWED_TYPE));
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$CodeTextLineIban;", "Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;", "<init>", "()V", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class CodeTextLineIban extends CodeTextLine {
        public static final String ALLOWED_TYPE = "iban";

        public CodeTextLineIban() {
            super(SetsKt.setOf(ALLOWED_TYPE));
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$CodeTextLinePhone;", "Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;", "<init>", "()V", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class CodeTextLinePhone extends CodeTextLine {
        public static final String ALLOWED_TYPE = "phone_number";

        public CodeTextLinePhone() {
            super(SetsKt.setOf(ALLOWED_TYPE));
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$CodeTextLinePhoneCis;", "Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;", "<init>", "()V", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class CodeTextLinePhoneCis extends CodeTextLine {
        public static final String ALLOWED_TYPE = "phone_number_cis";

        public CodeTextLinePhoneCis() {
            super(SetsKt.setOf(ALLOWED_TYPE));
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$CodeTextLineCardNumber;", "Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;", "<init>", "()V", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class CodeTextLineCardNumber extends CodeTextLine {
        public static final String ALLOWED_TYPE = "card_number";

        public CodeTextLineCardNumber() {
            super(SetsKt.setOf(ALLOWED_TYPE));
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$CodeTextLineInn;", "Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;", "<init>", "()V", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class CodeTextLineInn extends CodeTextLine {
        public static final String ALLOWED_TYPE = "inn";

        public CodeTextLineInn() {
            super(SetsKt.setOf(ALLOWED_TYPE));
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$CodeTextLineKpp;", "Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;", "<init>", "()V", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class CodeTextLineKpp extends CodeTextLine {
        public static final String ALLOWED_TYPE = "kpp";

        public CodeTextLineKpp() {
            super(SetsKt.setOf(ALLOWED_TYPE));
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$CodeTextLineBic;", "Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;", "<init>", "()V", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class CodeTextLineBic extends CodeTextLine {
        public static final String ALLOWED_TYPE = "rcbic";

        public CodeTextLineBic() {
            super(SetsKt.setOf(ALLOWED_TYPE));
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$CodeTextLineVin;", "Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;", "<init>", "()V", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class CodeTextLineVin extends CodeTextLine {
        public static final String ALLOWED_TYPE = "vin";

        public CodeTextLineVin() {
            super(SetsKt.setOf(ALLOWED_TYPE));
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$CodeTextLineBankAccount;", "Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;", "<init>", "()V", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class CodeTextLineBankAccount extends CodeTextLine {
        public static final String ALLOWED_TYPE = "rus_bank_account";

        public CodeTextLineBankAccount() {
            super(SetsKt.setOf(ALLOWED_TYPE));
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$CodeTextLineContainerNumber;", "Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;", "<init>", "()V", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class CodeTextLineContainerNumber extends CodeTextLine {
        public static final String ALLOWED_TYPE = "container_seal_number";

        public CodeTextLineContainerNumber() {
            super(SetsKt.setOf(ALLOWED_TYPE));
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$Mrz;", "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;", "<init>", "()V", "fill", "", "Lcom/smartengines/code/CodeEngineSessionSettings;", "sessionType", "Lcom/smartengines/engine/SessionType;", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class Mrz extends CodeTargetBase {
        public static final String INTERNAL_ENGINE = "mrz";

        @Override // com.smartengines.targets.code.CodeTargets.CodeTargetBase
        public void fill(CodeEngineSessionSettings codeEngineSessionSettings, SessionType sessionType) {
            Intrinsics.checkNotNullParameter(codeEngineSessionSettings, "<this>");
            Intrinsics.checkNotNullParameter(sessionType, "sessionType");
            CodeTargets.setGlobalOptions$default(CodeTargets.INSTANCE, codeEngineSessionSettings, null, 1, null);
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "mrz.enabled", "true");
            if (codeEngineSessionSettings.HasOption("mrz.MRZCountriesListAddition")) {
                CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "mrz.MRZCountriesListAddition", "UTO");
            }
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$UniversalPay;", "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;", "<init>", "()V", "fill", "", "Lcom/smartengines/code/CodeEngineSessionSettings;", "sessionType", "Lcom/smartengines/engine/SessionType;", "toString", "", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class UniversalPay extends CodeTargetBase {
        @Override // com.smartengines.targets.code.CodeTargets.CodeTargetBase
        public void fill(CodeEngineSessionSettings codeEngineSessionSettings, SessionType sessionType) {
            Intrinsics.checkNotNullParameter(codeEngineSessionSettings, "<this>");
            Intrinsics.checkNotNullParameter(sessionType, "sessionType");
            CodeSettings code = TargetSettingsKt.getTargetSettings().getCode();
            CodeTargets.setGlobalOptions$default(CodeTargets.INSTANCE, codeEngineSessionSettings, null, 1, null);
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "_simulateROI", "true");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "_ROItype", "centered_roi");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "_offsetX", "0");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "_aspectRatio", "0.5");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "global.workflow", "universalPay");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.enabled", "true");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.QR_CODE.enabled", "true");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.AZTEC.enabled", "true");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.DATA_MATRIX.enabled", "true");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.preset", "PAYMENT|URL");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.feedMode", "sequence");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "barcode.smartPaymentBarDecoding", String.valueOf(code.getBarcodeSmart()));
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "global.universalPay.collectNonPaymentBarcodes", String.valueOf(code.getBarcodeNonpayment()));
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "bank_card.enabled", "true");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "bank_card.extractBankCardImages.enabled", "true");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "bank_card.captureMode", "anywhere");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "code_text_line.enabled", "true");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "code_text_line.phone_number.enabled", "true");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "code_text_line.card_number.enabled", "true");
        }

        public String toString() {
            return "UniversalPay: barcode + bank card + text lines";
        }
    }

    /* compiled from: CodeTargets.kt */
    @Metadata(m513d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, m514d2 = {"Lcom/smartengines/targets/code/CodeTargets$Container;", "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;", "<init>", "()V", "fill", "", "Lcom/smartengines/code/CodeEngineSessionSettings;", "sessionType", "Lcom/smartengines/engine/SessionType;", "Companion", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class Container extends CodeTargetBase {
        public static final String INTERNAL_ENGINE = "shipping_container";

        @Override // com.smartengines.targets.code.CodeTargets.CodeTargetBase
        public void fill(CodeEngineSessionSettings codeEngineSessionSettings, SessionType sessionType) {
            Intrinsics.checkNotNullParameter(codeEngineSessionSettings, "<this>");
            Intrinsics.checkNotNullParameter(sessionType, "sessionType");
            CodeSettings code = TargetSettingsKt.getTargetSettings().getCode();
            CodeTargets.setGlobalOptions$default(CodeTargets.INSTANCE, codeEngineSessionSettings, null, 1, null);
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "shipping_container.enabled", "true");
            CodeTargets.INSTANCE.setOption(codeEngineSessionSettings, "shipping_container.maxAllowedObjects", String.valueOf(code.getContainerMax()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOption(CodeEngineSessionSettings codeEngineSessionSettings, String str, String str2) {
        Log.w("myapp.CodeTarget", "      - SetOption: " + str + " >>> " + str2);
        SessionSettingsLogger sessionSettingsLogger2 = sessionSettingsLogger;
        if (sessionSettingsLogger2 != null) {
            sessionSettingsLogger2.logAction(new SessionSettingsLogger.Action("SetOption", CollectionsKt.listOf((Object[]) new String[]{str, str2})));
        }
        codeEngineSessionSettings.SetOption(str, str2);
    }
}
