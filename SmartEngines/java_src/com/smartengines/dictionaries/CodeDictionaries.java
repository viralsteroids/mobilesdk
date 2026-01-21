package com.smartengines.dictionaries;

import android.content.Context;
import com.smartengines.dictionaries.Issuers;
import com.smartengines.targets.code.CodeTargets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeDictionaries.kt */
@Metadata(m513d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u001f\u001a\u00020 R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\bR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\"¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006&"}, m514d2 = {"Lcom/smartengines/dictionaries/CodeDictionaries;", "", "<init>", "()V", "barcodeRoiList", "", "Lcom/smartengines/dictionaries/KeyName;", "getBarcodeRoiList", "()Ljava/util/List;", "barcodeRoiDefault", "", "getBarcodeRoiDefault", "()Ljava/lang/String;", "barcodeEffortList", "getBarcodeEffortList", "barcodeEffortDefault", "getBarcodeEffortDefault", "barcodeTypes2D", "getBarcodeTypes2D", "barcodeTypes1D", "getBarcodeTypes1D", "barcodeTypesStacked", "getBarcodeTypesStacked", "cardTypes", "getCardTypes", "paymentTypes", "Lcom/smartengines/dictionaries/KeyNames;", "getPaymentTypes", "lineNumberTypes", "getLineNumberTypes", "loadPlateTypes", "context", "Landroid/content/Context;", "plateTypes", "", "plateTypesDefault", "getPlateTypesDefault", "()Ljava/util/Set;", "dictionaries_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CodeDictionaries {
    private static final Set<String> plateTypes;
    private static final Set<String> plateTypesDefault;
    public static final CodeDictionaries INSTANCE = new CodeDictionaries();
    private static final List<KeyName> barcodeRoiList = CollectionsKt.listOf((Object[]) new KeyName[]{new KeyName("dummy", "Simple"), new KeyName("focused", "Focused"), new KeyName("anywhere", "Anywhere")});
    private static final String barcodeRoiDefault = "focused";
    private static final List<KeyName> barcodeEffortList = CollectionsKt.listOf((Object[]) new KeyName[]{new KeyName("high", "High"), new KeyName("normal", "Normal"), new KeyName("low", "Low")});
    private static final String barcodeEffortDefault = "normal";
    private static final List<KeyName> barcodeTypes2D = CollectionsKt.listOf((Object[]) new KeyName[]{new KeyName("AZTEC", "Aztec Code"), new KeyName("QR_CODE", "QR code"), new KeyName("MICRO_QR", "Micro QR code"), new KeyName("RMQR", "rMQR Code"), new KeyName("DATA_MATRIX", "Data Matrix")});
    private static final List<KeyName> barcodeTypes1D = CollectionsKt.listOf((Object[]) new KeyName[]{new KeyName("CODABAR", "Codabar"), new KeyName("CODE_39", "Code 39"), new KeyName("CODE_93", "Code 93"), new KeyName("CODE_128", "Code 128"), new KeyName("EAN_8", "EAN 8"), new KeyName("EAN_13_UPC_A", "EAN 13, UPC-A"), new KeyName("ITF", "ITF"), new KeyName("UPC_E", "UPC-E")});
    private static final List<KeyName> barcodeTypesStacked = CollectionsKt.listOf((Object[]) new KeyName[]{new KeyName("GS1_DATABAR", "GS1 DataBar"), new KeyName("PDF_417", "PDF417"), new KeyName("MICRO_PDF_417", "MicroPDF417")});
    private static final List<KeyName> cardTypes = CollectionsKt.listOf((Object[]) new KeyName[]{new KeyName("embossed", "Embossed"), new KeyName("indent", "Indent"), new KeyName("freeform", "Freeform")});
    private static final List<KeyNames> paymentTypes = CollectionsKt.listOf((Object[]) new KeyNames[]{new KeyNames(CodeTargets.CodeTextLineInn.ALLOWED_TYPE, MapsKt.mapOf(TuplesKt.m521to("en", "INN"), TuplesKt.m521to("ru", "ИНН"))), new KeyNames(CodeTargets.CodeTextLineKpp.ALLOWED_TYPE, MapsKt.mapOf(TuplesKt.m521to("en", "KPP"), TuplesKt.m521to("ru", "КПП"))), new KeyNames("personal_account", MapsKt.mapOf(TuplesKt.m521to("en", "Personal account"), TuplesKt.m521to("ru", "Лицевой счёт"))), new KeyNames(CodeTargets.CodeTextLineBic.ALLOWED_TYPE, MapsKt.mapOf(TuplesKt.m521to("en", "Russian BIC"), TuplesKt.m521to("ru", "Российский БИК"))), new KeyNames(CodeTargets.CodeTextLineBankAccount.ALLOWED_TYPE, MapsKt.mapOf(TuplesKt.m521to("en", "Russian Bank Account"), TuplesKt.m521to("ru", "Номер банковского счёта")))});
    private static final List<KeyNames> lineNumberTypes = CollectionsKt.listOf((Object[]) new KeyNames[]{new KeyNames(CodeTargets.CodeTextLineCardNumber.ALLOWED_TYPE, MapsKt.mapOf(TuplesKt.m521to("en", "Bank Card Line"), TuplesKt.m521to("ru", "Номер банковской карты"))), new KeyNames(CodeTargets.CodeTextLinePhone.ALLOWED_TYPE, MapsKt.mapOf(TuplesKt.m521to("en", "Phone Lines (RUS)"), TuplesKt.m521to("ru", "Номер телефона (РУС)"))), new KeyNames(CodeTargets.CodeTextLinePhoneCis.ALLOWED_TYPE, MapsKt.mapOf(TuplesKt.m521to("en", "Phone Lines (CIS)"), TuplesKt.m521to("ru", "Номер телефона (СНГ)")))});

    private CodeDictionaries() {
    }

    public final List<KeyName> getBarcodeRoiList() {
        return barcodeRoiList;
    }

    static {
        Set<String> of = SetsKt.setOf((Object[]) new String[]{"arm", "aze", "blr", "geo", "kgz", "kz", "mda", "rus", "tjk", "uzb", "deu", "fra", "ita"});
        plateTypes = of;
        ArrayList arrayList = new ArrayList();
        for (Object obj : of) {
            if (!Intrinsics.areEqual((String) obj, "rus")) {
                arrayList.add(obj);
            }
        }
        plateTypesDefault = CollectionsKt.toSet(arrayList);
    }

    public final String getBarcodeRoiDefault() {
        return barcodeRoiDefault;
    }

    public final List<KeyName> getBarcodeEffortList() {
        return barcodeEffortList;
    }

    public final String getBarcodeEffortDefault() {
        return barcodeEffortDefault;
    }

    public final List<KeyName> getBarcodeTypes2D() {
        return barcodeTypes2D;
    }

    public final List<KeyName> getBarcodeTypes1D() {
        return barcodeTypes1D;
    }

    public final List<KeyName> getBarcodeTypesStacked() {
        return barcodeTypesStacked;
    }

    public final List<KeyName> getCardTypes() {
        return cardTypes;
    }

    public final List<KeyNames> getPaymentTypes() {
        return paymentTypes;
    }

    public final List<KeyNames> getLineNumberTypes() {
        return lineNumberTypes;
    }

    public final List<KeyName> loadPlateTypes(Context context) {
        String str;
        Map<String, String> name;
        Intrinsics.checkNotNullParameter(context, "context");
        Map<String, Issuers.Issuer> mapLoadDictionary = Issuers.INSTANCE.loadDictionary();
        Issuers.Issuer issuer = mapLoadDictionary.get("kaz");
        if (issuer != null) {
            mapLoadDictionary = MapsKt.plus(mapLoadDictionary, new Pair("kz", issuer));
        }
        String currentLanguage = DicUtilsKt.getCurrentLanguage(context, null);
        Set<String> set = plateTypes;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        for (String str2 : set) {
            Issuers.Issuer issuer2 = mapLoadDictionary.get(str2);
            if (issuer2 == null || (name = issuer2.getName()) == null || (str = name.get(currentLanguage)) == null) {
                str = "[" + str2 + ']';
            }
            arrayList.add(new KeyName(str2, str));
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.smartengines.dictionaries.CodeDictionaries$loadPlateTypes$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((KeyName) t).getName(), ((KeyName) t2).getName());
            }
        });
    }

    public final Set<String> getPlateTypesDefault() {
        return plateTypesDefault;
    }
}
