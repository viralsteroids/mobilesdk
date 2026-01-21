package com.smartengines.nfc;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* compiled from: NfcAdapterWrapper.kt */
@Metadata(m513d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000f"}, m514d2 = {"Lcom/smartengines/nfc/NfcAdapterWrapper;", "", "<init>", "()V", "enableNfcReceiving", "Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;", "activity", "Landroid/app/Activity;", "enable", "", "getIsoDepTag", "Landroid/nfc/Tag;", "intent", "Landroid/content/Intent;", "ActivationResult", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class NfcAdapterWrapper {
    public static final NfcAdapterWrapper INSTANCE = new NfcAdapterWrapper();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NfcAdapterWrapper.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m514d2 = {"Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR_NOT_SUPPORTED", "ERROR_DISABLED", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class ActivationResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ActivationResult[] $VALUES;
        public static final ActivationResult SUCCESS = new ActivationResult("SUCCESS", 0);
        public static final ActivationResult ERROR_NOT_SUPPORTED = new ActivationResult("ERROR_NOT_SUPPORTED", 1);
        public static final ActivationResult ERROR_DISABLED = new ActivationResult("ERROR_DISABLED", 2);

        private static final /* synthetic */ ActivationResult[] $values() {
            return new ActivationResult[]{SUCCESS, ERROR_NOT_SUPPORTED, ERROR_DISABLED};
        }

        public static EnumEntries<ActivationResult> getEntries() {
            return $ENTRIES;
        }

        private ActivationResult(String str, int i) {
        }

        static {
            ActivationResult[] activationResultArr$values = $values();
            $VALUES = activationResultArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(activationResultArr$values);
        }

        public static ActivationResult valueOf(String str) {
            return (ActivationResult) Enum.valueOf(ActivationResult.class, str);
        }

        public static ActivationResult[] values() {
            return (ActivationResult[]) $VALUES.clone();
        }
    }

    private NfcAdapterWrapper() {
    }

    public final ActivationResult enableNfcReceiving(Activity activity, boolean enable) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Activity activity2 = activity;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity2);
        if (defaultAdapter != null) {
            if (!defaultAdapter.isEnabled()) {
                return ActivationResult.ERROR_DISABLED;
            }
            if (enable) {
                Log.w("myapp.NfcAdapterWrapper", ">>> enable NFC Receiving");
                Intent intent = new Intent(activity.getApplicationContext(), activity.getClass());
                intent.setFlags(PKIFailureInfo.duplicateCertReq);
                defaultAdapter.enableForegroundDispatch(activity, PendingIntent.getActivity(activity2, 0, intent, 33554432), null, new String[][]{new String[]{"android.nfc.tech.IsoDep"}});
            } else {
                Log.w("myapp.NfcAdapterWrapper", "<<< disable NFC Receiving");
                defaultAdapter.disableForegroundDispatch(activity);
            }
            return ActivationResult.SUCCESS;
        }
        return ActivationResult.ERROR_NOT_SUPPORTED;
    }

    public final Tag getIsoDepTag(Intent intent) {
        String[] techList;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Log.w("myapp.NfcAdapterWrapper", "getPassportTag " + intent);
        if (Intrinsics.areEqual("android.nfc.action.TECH_DISCOVERED", intent.getAction())) {
            Bundle extras = intent.getExtras();
            Tag tag = extras != null ? (Tag) extras.getParcelable("android.nfc.extra.TAG") : null;
            if (tag != null && (techList = tag.getTechList()) != null && ArraysKt.contains(techList, "android.nfc.tech.IsoDep")) {
                return tag;
            }
        }
        return null;
    }
}
