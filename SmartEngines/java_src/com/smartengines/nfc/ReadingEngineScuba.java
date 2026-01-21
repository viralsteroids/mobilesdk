package com.smartengines.nfc;

import android.content.Context;
import android.nfc.tech.IsoDep;
import android.util.Base64;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p010io.ByteStreamsKt;
import net.p012sf.scuba.smartcards.CardFileInputStream;
import net.p012sf.scuba.smartcards.CardService;
import net.p012sf.scuba.smartcards.CardServiceException;
import org.jmrtd.BACKey;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CardAccessFile;
import org.jmrtd.lds.PACEInfo;
import org.jmrtd.lds.SecurityInfo;
import org.jmrtd.lds.icao.DG1File;
import org.jmrtd.lds.icao.DG2File;
import org.jmrtd.lds.icao.MRZInfo;
import org.jmrtd.lds.iso19794.FaceInfo;

/* compiled from: ReadingEngineScuba.kt */
@Metadata(m513d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m514d2 = {"Lcom/smartengines/nfc/ReadingEngineScuba;", "Lcom/smartengines/nfc/ReadingEngine;", "<init>", "()V", NotificationCompat.CATEGORY_SERVICE, "Lorg/jmrtd/PassportService;", "dg1File", "Lorg/jmrtd/lds/icao/DG1File;", "dg2File", "Lorg/jmrtd/lds/icao/DG2File;", "open", "", "isoDep", "Landroid/nfc/tech/IsoDep;", "close", "readPassportData", "Lcom/smartengines/nfc/PassportData;", "bacKey", "Lorg/jmrtd/BACKey;", "doChipAuth", "Lcom/smartengines/nfc/AuthResult;", "doDataAuth", "context", "Landroid/content/Context;", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ReadingEngineScuba implements ReadingEngine {
    private DG1File dg1File;
    private DG2File dg2File;
    private PassportService service;

    @Override // com.smartengines.nfc.ReadingEngine
    public void open(IsoDep isoDep) throws ClassNotFoundException, CardServiceException {
        Intrinsics.checkNotNullParameter(isoDep, "isoDep");
        Log.w("myapp.RdEngineScuba", "open " + isoDep);
        Log.d("myapp.RdEngineScuba", "Creating a new passport service for accessing the passport.");
        isoDep.setTimeout(10000);
        CardService cardService = CardService.getInstance(isoDep);
        cardService.open();
        PassportService passportService = new PassportService(cardService, 256, PassportService.DEFAULT_MAX_BLOCKSIZE, false, false);
        this.service = passportService;
        passportService.open();
    }

    @Override // com.smartengines.nfc.ReadingEngine
    public void close() {
        try {
            PassportService passportService = this.service;
            if (passportService == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
                passportService = null;
            }
            passportService.close();
        } catch (Exception unused) {
        }
    }

    @Override // com.smartengines.nfc.ReadingEngine
    public PassportData readPassportData(BACKey bacKey) throws CardServiceException {
        Intrinsics.checkNotNullParameter(bacKey, "bacKey");
        Log.d("myapp.RdEngineScuba", "Performs the PACE 2.0 / SAC protocol. A secure messaging channel is set up as a result.");
        DG2File dG2File = null;
        boolean z = false;
        try {
            PassportService passportService = this.service;
            if (passportService == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
                passportService = null;
            }
            for (SecurityInfo securityInfo : new CardAccessFile(passportService.getInputStream((short) 284)).getSecurityInfos()) {
                Intrinsics.checkNotNullExpressionValue(securityInfo, "next(...)");
                SecurityInfo securityInfo2 = securityInfo;
                if (securityInfo2 instanceof PACEInfo) {
                    PassportService passportService2 = this.service;
                    if (passportService2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
                        passportService2 = null;
                    }
                    passportService2.doPACE(bacKey, ((PACEInfo) securityInfo2).getObjectIdentifier(), PACEInfo.toParameterSpec(((PACEInfo) securityInfo2).getParameterId()), null);
                    z = true;
                }
            }
        } catch (Exception e) {
            Log.e("myapp.RdEngineScuba", "doPACE: " + e.getMessage());
        }
        PassportService passportService3 = this.service;
        if (passportService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
            passportService3 = null;
        }
        passportService3.sendSelectApplet(z);
        if (!z) {
            try {
                PassportService passportService4 = this.service;
                if (passportService4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
                    passportService4 = null;
                }
                passportService4.getInputStream(PassportService.EF_COM).read();
            } catch (Exception unused) {
                PassportService passportService5 = this.service;
                if (passportService5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
                    passportService5 = null;
                }
                passportService5.doBAC(bacKey);
                Log.w("myapp.RdEngineScuba", "doBAC " + bacKey);
            }
        }
        PassportService passportService6 = this.service;
        if (passportService6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
            passportService6 = null;
        }
        DG1File dG1File = new DG1File(passportService6.getInputStream(PassportService.EF_DG1));
        this.dg1File = dG1File;
        Log.w("myapp.RdEngineScuba", String.valueOf(dG1File));
        PassportService passportService7 = this.service;
        if (passportService7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
            passportService7 = null;
        }
        DG2File dG2File2 = new DG2File(passportService7.getInputStream(PassportService.EF_DG2));
        this.dg2File = dG2File2;
        Log.w("myapp.RdEngineScuba", String.valueOf(dG2File2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            PassportService passportService8 = this.service;
            if (passportService8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
                passportService8 = null;
            }
            CardFileInputStream inputStream = passportService8.getInputStream(PassportService.EF_COM);
            Intrinsics.checkNotNull(inputStream);
            String strEncodeToString = Base64.encodeToString(ByteStreamsKt.readBytes(inputStream), 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
            linkedHashMap.put("COM", strEncodeToString);
        } catch (Exception e2) {
            Log.e("myapp.RdEngineScuba", "COM reading error: " + e2.getMessage());
        }
        try {
            PassportService passportService9 = this.service;
            if (passportService9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
                passportService9 = null;
            }
            CardFileInputStream inputStream2 = passportService9.getInputStream((short) 285);
            Intrinsics.checkNotNull(inputStream2);
            String strEncodeToString2 = Base64.encodeToString(ByteStreamsKt.readBytes(inputStream2), 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString2, "encodeToString(...)");
            linkedHashMap.put("SOD", strEncodeToString2);
        } catch (Exception e3) {
            Log.e("myapp.RdEngineScuba", "SOD reading error: " + e3.getMessage());
        }
        try {
            PassportService passportService10 = this.service;
            if (passportService10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
                passportService10 = null;
            }
            CardFileInputStream inputStream3 = passportService10.getInputStream(PassportService.EF_DG1);
            Intrinsics.checkNotNull(inputStream3);
            String strEncodeToString3 = Base64.encodeToString(ByteStreamsKt.readBytes(inputStream3), 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString3, "encodeToString(...)");
            linkedHashMap.put("DG1", strEncodeToString3);
        } catch (Exception e4) {
            Log.e("myapp.RdEngineScuba", "DG1 reading error: " + e4.getMessage());
        }
        try {
            PassportService passportService11 = this.service;
            if (passportService11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
                passportService11 = null;
            }
            CardFileInputStream inputStream4 = passportService11.getInputStream(PassportService.EF_DG2);
            Intrinsics.checkNotNull(inputStream4);
            String strEncodeToString4 = Base64.encodeToString(ByteStreamsKt.readBytes(inputStream4), 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString4, "encodeToString(...)");
            linkedHashMap.put("DG2", strEncodeToString4);
        } catch (Exception e5) {
            Log.e("myapp.RdEngineScuba", "DG2 reading error: " + e5.getMessage());
        }
        try {
            PassportService passportService12 = this.service;
            if (passportService12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
                passportService12 = null;
            }
            CardFileInputStream inputStream5 = passportService12.getInputStream(PassportService.EF_DG7);
            Intrinsics.checkNotNull(inputStream5);
            String strEncodeToString5 = Base64.encodeToString(ByteStreamsKt.readBytes(inputStream5), 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString5, "encodeToString(...)");
            linkedHashMap.put("DG7", strEncodeToString5);
        } catch (Exception e6) {
            Log.e("myapp.RdEngineScuba", "DG7 reading error: " + e6.getMessage());
        }
        try {
            PassportService passportService13 = this.service;
            if (passportService13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
                passportService13 = null;
            }
            CardFileInputStream inputStream6 = passportService13.getInputStream(PassportService.EF_DG11);
            Intrinsics.checkNotNull(inputStream6);
            String strEncodeToString6 = Base64.encodeToString(ByteStreamsKt.readBytes(inputStream6), 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString6, "encodeToString(...)");
            linkedHashMap.put("DG11", strEncodeToString6);
        } catch (Exception e7) {
            Log.e("myapp.RdEngineScuba", "DG11 reading error: " + e7.getMessage());
        }
        try {
            PassportService passportService14 = this.service;
            if (passportService14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
                passportService14 = null;
            }
            CardFileInputStream inputStream7 = passportService14.getInputStream(PassportService.EF_DG12);
            Intrinsics.checkNotNull(inputStream7);
            String strEncodeToString7 = Base64.encodeToString(ByteStreamsKt.readBytes(inputStream7), 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString7, "encodeToString(...)");
            linkedHashMap.put("DG12", strEncodeToString7);
        } catch (Exception e8) {
            Log.e("myapp.RdEngineScuba", "DG12 reading error: " + e8.getMessage());
        }
        try {
            PassportService passportService15 = this.service;
            if (passportService15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
                passportService15 = null;
            }
            CardFileInputStream inputStream8 = passportService15.getInputStream(PassportService.EF_DG14);
            Intrinsics.checkNotNull(inputStream8);
            String strEncodeToString8 = Base64.encodeToString(ByteStreamsKt.readBytes(inputStream8), 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString8, "encodeToString(...)");
            linkedHashMap.put("DG2", strEncodeToString8);
        } catch (Exception e9) {
            Log.e("myapp.RdEngineScuba", "DG14 reading error: " + e9.getMessage());
        }
        try {
            PassportService passportService16 = this.service;
            if (passportService16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
                passportService16 = null;
            }
            CardFileInputStream inputStream9 = passportService16.getInputStream(PassportService.EF_DG15);
            Intrinsics.checkNotNull(inputStream9);
            String strEncodeToString9 = Base64.encodeToString(ByteStreamsKt.readBytes(inputStream9), 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString9, "encodeToString(...)");
            linkedHashMap.put("DG15", strEncodeToString9);
        } catch (Exception e10) {
            Log.e("myapp.RdEngineScuba", "DG15 reading error: " + e10.getMessage());
        }
        Log.d("myapp.RdEngineScuba", "other fields: " + linkedHashMap);
        DG1File dG1File2 = this.dg1File;
        if (dG1File2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dg1File");
            dG1File2 = null;
        }
        MRZInfo mRZInfo = dG1File2.getMRZInfo();
        Intrinsics.checkNotNullExpressionValue(mRZInfo, "getMRZInfo(...)");
        MrzInfo mrzInfo = new MrzInfo(mRZInfo);
        DG2File dG2File3 = this.dg2File;
        if (dG2File3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dg2File");
        } else {
            dG2File = dG2File3;
        }
        List<FaceInfo> faceInfos = dG2File.getFaceInfos();
        Intrinsics.checkNotNullExpressionValue(faceInfos, "getFaceInfos(...)");
        return new PassportData(mrzInfo, FaceImageDataKt.toFaceImageDataList(faceInfos), linkedHashMap, null, null);
    }

    @Override // com.smartengines.nfc.ReadingEngine
    public AuthResult doChipAuth() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.smartengines.nfc.ReadingEngine
    public AuthResult doDataAuth(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
