package com.smartengines.nfc;

import android.content.Context;
import android.nfc.tech.IsoDep;
import kotlin.Metadata;
import org.jmrtd.BACKey;

/* compiled from: ReadingEngine.kt */
@Metadata(m513d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, m514d2 = {"Lcom/smartengines/nfc/ReadingEngine;", "", "open", "", "isoDep", "Landroid/nfc/tech/IsoDep;", "close", "readPassportData", "Lcom/smartengines/nfc/PassportData;", "bacKey", "Lorg/jmrtd/BACKey;", "doChipAuth", "Lcom/smartengines/nfc/AuthResult;", "doDataAuth", "context", "Landroid/content/Context;", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface ReadingEngine {
    void close();

    AuthResult doChipAuth();

    AuthResult doDataAuth(Context context);

    void open(IsoDep isoDep);

    PassportData readPassportData(BACKey bacKey);
}
