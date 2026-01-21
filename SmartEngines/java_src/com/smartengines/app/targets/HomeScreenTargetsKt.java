package com.smartengines.app.targets;

import android.content.Context;
import com.smartengines.app.C3069R;
import com.smartengines.targets.code.CodeTargets;
import com.smartengines.targets.p008id.IdTarget;
import com.smartengines.targets.text.TextTarget;
import com.smartengines.utils.Name;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeScreenTargets.kt */
@Metadata(m513d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m514d2 = {"TAG", "", "loadHomeScreenTargets", "", "Lcom/smartengines/app/targets/TreeItem;", "context", "Landroid/content/Context;", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class HomeScreenTargetsKt {
    private static final String TAG = "myapp.HomeScreenTargets";

    public static final List<TreeItem> loadHomeScreenTargets(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return CollectionsKt.listOf((Object[]) new TreeLeaf[]{new TreeLeaf(new Name("Russian Passport", "Паспорт РФ"), Integer.valueOf(C3069R.drawable.home_rus_passport), null, 0, false, null, new IdTarget("default", "rus.passport.national"), 60, null), new TreeLeaf(new Name("Registration", "Прописка"), Integer.valueOf(C3069R.drawable.home_registration), null, 0, false, null, new IdTarget("anyrus", "rus.passport.registration"), 60, null), new TreeLeaf(new Name("Birth Certificate", "Свидетельство\nо рождении"), new Icon(C3069R.drawable.home_birth_certificate_light, C3069R.drawable.home_birth_certificate_dark), null, 0, false, null, new IdTarget("default", "rus.birth_certificate.*"), 60, null), new TreeLeaf(new Name("Any Document", "Автовыбор ДУЛ"), Integer.valueOf(C3069R.drawable.home_anydoc), null, 0, false, null, new IdTarget("anydoc", "*"), 60, null), new TreeLeaf(new Name("CIS Documents", "ДУЛ СНГ"), Integer.valueOf(C3069R.drawable.home_anycis), null, 0, false, null, new IdTarget("anycis", "*"), 60, null), new TreeLeaf(new Name("Any Russian Document", "ДУЛ РФ"), Integer.valueOf(C3069R.drawable.home_anyrus), null, 0, false, null, new IdTarget("anyrus", "*/rus.passport.previous"), 60, null), new TreeLeaf(new Name("QR and other barcodes", "QR и другие баркоды"), Integer.valueOf(C3069R.drawable.home_barcode), null, 0, false, null, new CodeTargets.Barcode(), 60, null), new TreeLeaf(new Name("Bank Card", "Банковская\nкарта"), Integer.valueOf(C3069R.drawable.home_bank_card), null, 0, false, null, new CodeTargets.BankCard(), 60, null), new TreeLeaf(new Name("Meters", "Коммунальные счётчики"), Integer.valueOf(C3069R.drawable.home_meters), null, 0, false, null, new CodeTargets.CodeTextLineMeters(), 60, null), new TreeLeaf(new Name("Russian DL and VRC", "ВУ и СТС РФ"), Integer.valueOf(C3069R.drawable.home_drvlic), null, 0, false, null, new IdTarget("anyrus", "rus.sts.*,rus.drvlic.*"), 60, null), new TreeLeaf(new Name("License Plate", "Номера автомобилей"), Integer.valueOf(C3069R.drawable.home_license_plates), null, 0, false, null, new CodeTargets.LicensePlate(), 60, null), new TreeLeaf(new Name("Text recognition (OCR)", "Распознавание текста (OCR)"), Integer.valueOf(C3069R.drawable.home_text), null, 0, false, null, new TextTarget(), 60, null)});
    }
}
