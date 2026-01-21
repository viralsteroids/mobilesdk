package com.smartengines.nfc;

import android.content.Context;
import android.nfc.tech.IsoDep;
import android.util.Log;
import com.smartengines.nfc.AuthResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.BACKey;
import org.jmrtd.lds.icao.DG1File;
import org.jmrtd.lds.icao.DG2File;
import org.jmrtd.lds.icao.MRZInfo;
import org.jmrtd.lds.iso19794.FaceInfo;

/* compiled from: ReadingEngineMock.kt */
@Metadata(m513d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m514d2 = {"Lcom/smartengines/nfc/ReadingEngineMock;", "Lcom/smartengines/nfc/ReadingEngine;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "open", "", "isoDep", "Landroid/nfc/tech/IsoDep;", "close", "readPassportData", "Lcom/smartengines/nfc/PassportData;", "bacKey", "Lorg/jmrtd/BACKey;", "doChipAuth", "Lcom/smartengines/nfc/AuthResult;", "doDataAuth", "generateAuthResult", "nfc-mock_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ReadingEngineMock implements ReadingEngine {
    private final Context context;

    public ReadingEngineMock(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.smartengines.nfc.ReadingEngine
    public void open(IsoDep isoDep) {
        Intrinsics.checkNotNullParameter(isoDep, "isoDep");
        Log.d("myapp.RdEngineMock", "open,  isoDep: " + isoDep);
    }

    @Override // com.smartengines.nfc.ReadingEngine
    public void close() {
        Log.d("myapp.RdEngineMock", "close");
    }

    @Override // com.smartengines.nfc.ReadingEngine
    public PassportData readPassportData(BACKey bacKey) {
        Intrinsics.checkNotNullParameter(bacKey, "bacKey");
        DG1File dG1File = new DG1File(this.context.getAssets().open("dg1-igor.mock"));
        DG2File dG2File = new DG2File(this.context.getAssets().open("dg2-igor.mock"));
        MRZInfo mRZInfo = dG1File.getMRZInfo();
        Intrinsics.checkNotNullExpressionValue(mRZInfo, "getMRZInfo(...)");
        MrzInfo mrzInfo = new MrzInfo(mRZInfo);
        List<FaceInfo> faceInfos = dG2File.getFaceInfos();
        Intrinsics.checkNotNullExpressionValue(faceInfos, "getFaceInfos(...)");
        return new PassportData(mrzInfo, FaceImageDataKt.toFaceImageDataList(faceInfos), null, null, null, 4, null);
    }

    @Override // com.smartengines.nfc.ReadingEngine
    public AuthResult doChipAuth() {
        AuthResult authResultGenerateAuthResult = generateAuthResult();
        Log.d("myapp.RdEngineMock", "doChipAuth  " + authResultGenerateAuthResult);
        return authResultGenerateAuthResult;
    }

    @Override // com.smartengines.nfc.ReadingEngine
    public AuthResult doDataAuth(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AuthResult authResultGenerateAuthResult = generateAuthResult();
        Log.d("myapp.RdEngineMock", "doDataAuth  " + authResultGenerateAuthResult);
        return authResultGenerateAuthResult;
    }

    private final AuthResult generateAuthResult() {
        return Math.random() > 0.5d ? AuthResult.Passed.INSTANCE : new AuthResult.Failed("Failed for debug");
    }
}
