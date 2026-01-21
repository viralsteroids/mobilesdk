package com.smartengines.app.targets;

import android.content.Context;
import com.smartengines.app.C3069R;
import com.smartengines.app.targets.TreeGroupViewType;
import com.smartengines.code.CodeEngine;
import com.smartengines.code.CodeEngineSessionSettings;
import com.smartengines.dictionaries.C3289R;
import com.smartengines.targets.code.CodeSessionOptions;
import com.smartengines.targets.code.CodeSessionOptionsKt;
import com.smartengines.targets.code.CodeTargets;
import com.smartengines.utils.Name;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeTargets.kt */
@Metadata(m513d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m514d2 = {"TAG", "", "loadCodeTargetList", "Lcom/smartengines/app/targets/TreeItem;", "context", "Landroid/content/Context;", "codeEngine", "Lcom/smartengines/code/CodeEngine;", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CodeTargetsKt {
    private static final String TAG = "myapp.CodeTargets";

    public static final TreeItem loadCodeTargetList(Context context, CodeEngine codeEngine) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(codeEngine, "codeEngine");
        CodeEngineSessionSettings codeEngineSessionSettingsGetDefaultSessionSettings = codeEngine.GetDefaultSessionSettings();
        Intrinsics.checkNotNullExpressionValue(codeEngineSessionSettingsGetDefaultSessionSettings, "GetDefaultSessionSettings(...)");
        CodeSessionOptions codeSessionOptions = CodeSessionOptionsKt.parse(codeEngineSessionSettingsGetDefaultSessionSettings);
        CodeTargets.INSTANCE.setSessionOptions(codeSessionOptions);
        Set<String> setLoadEngineSupportedTypes = CodeTargets.INSTANCE.loadEngineSupportedTypes(CodeTargets.CodeTextLine.INTERNAL_ENGINE);
        Set<String> setKeySet = codeSessionOptions.getInternalEngines().keySet();
        ArrayList arrayList = new ArrayList();
        Name name = new Name("Universal Pay", "Universal Pay");
        Name name2 = new Name("4 in 1: Payment Barcode, Bank Card, Phone Lines (RUS), Bank Card Line", "4 в 1: Платёжный баркод, Банковская карта, Номер телефона (РУС), Номер банковской карты");
        int i = C3069R.drawable.home_bank_card;
        arrayList.add(new TreeLeaf(name, Integer.valueOf(i), name2, 0, false, null, new CodeTargets.UniversalPay(), 56, null));
        if (setKeySet.contains(CodeTargets.PaymentDetails.INTERNAL_ENGINE)) {
            Name name3 = new Name("Payment Details", "Платёжные реквизиты");
            Name name4 = new Name("5 in 1: INN, KPP, Russian BIC, Russian Bank Account, Personal Account", "5 в 1: ИНН, КПП, Российский БИК, Банковский счёт, Лицевой счёт");
            int i2 = C3069R.drawable.home_bank_card;
            arrayList.add(new TreeLeaf(name3, Integer.valueOf(i2), name4, 0, false, null, new CodeTargets.PaymentDetails(), 56, null));
        }
        if (setKeySet.contains(CodeTargets.CodeTextLine.INTERNAL_ENGINE)) {
            Name name5 = new Name("Code Text Line (number)", "Кодовые текстовые строки (номера)");
            Name name6 = new Name("3 in 1: Bank Card Lines, Phone Lines (RUS), Phone Lines (CIS)", "3 в 1: Номер банковской карты, Номер телефона (РУС), Номер телефона (СНГ)");
            int i3 = C3069R.drawable.home_bank_card;
            arrayList.add(new TreeLeaf(name5, Integer.valueOf(i3), name6, 0, false, null, new CodeTargets.CodeTextLineNumbers(), 56, null));
        }
        if (setKeySet.contains(CodeTargets.Barcode.INTERNAL_ENGINE)) {
            Name name7 = new Name("Payment Barcode", "Платёжный баркод");
            Name name8 = new Name("3 in 1: QR CODE, Aztec, DataMatrix", "3 в 1: QR CODE, Aztec, DataMatrix");
            int i4 = C3069R.drawable.home_payment_barcode;
            arrayList.add(new TreeLeaf(name7, Integer.valueOf(i4), name8, 0, false, null, new CodeTargets.BarcodePayment(), 56, null));
        }
        if (setLoadEngineSupportedTypes.contains(CodeTargets.CodeTextLineIban.ALLOWED_TYPE)) {
            arrayList.add(new TreeLeaf(new Name("IBAN", "Международный номер банковского счёта (IBAN)"), Integer.valueOf(C3069R.drawable.home_bank_card), null, 0, false, null, new CodeTargets.CodeTextLineIban(), 60, null));
        }
        if (setKeySet.contains("bank_card")) {
            arrayList.add(new TreeLeaf(new Name("Bank Card", "Банковская карта"), Integer.valueOf(C3069R.drawable.home_bank_card), null, 0, false, null, new CodeTargets.BankCard(), 60, null));
        }
        if (setKeySet.contains(CodeTargets.Barcode.INTERNAL_ENGINE)) {
            arrayList.add(new TreeLeaf(new Name("Barcode Session", "Баркодная сессия"), Integer.valueOf(C3069R.drawable.home_barcode_session), null, 0, false, null, new CodeTargets.BarcodeSession(), 60, null));
        }
        if (setKeySet.contains(CodeTargets.Barcode.INTERNAL_ENGINE)) {
            arrayList.add(new TreeLeaf(new Name("Barcode", "Баркод"), Integer.valueOf(C3069R.drawable.home_barcode), null, 0, false, null, new CodeTargets.Barcode(), 60, null));
        }
        if (setKeySet.contains(CodeTargets.Mrz.INTERNAL_ENGINE)) {
            arrayList.add(new TreeLeaf(new Name("MRZ", "Машиночитаемая зона паспорта (MRZ)"), Integer.valueOf(C3289R.drawable.code_mrz), null, 0, false, null, new CodeTargets.Mrz(), 60, null));
        }
        if (setLoadEngineSupportedTypes.contains(CodeTargets.CodeTextLineMeters.ALLOWED_TYPE)) {
            arrayList.add(new TreeLeaf(new Name("Meters", "Коммунальные счётчики"), Integer.valueOf(C3069R.drawable.home_meters), null, 0, false, null, new CodeTargets.CodeTextLineMeters(), 60, null));
        }
        CodeSessionOptions.InternalEngine internalEngine = codeSessionOptions.getInternalEngines().get("license_plate");
        if (internalEngine != null) {
            arrayList.add(new TreeLeaf(new Name("License Plate", "Номера автомобилей"), Integer.valueOf(C3069R.drawable.home_license_plates), null, 0, false, null, new CodeTargets.LicensePlate(), 60, null));
            List<CodeSessionOptions.Option> subtypes = internalEngine.getSubtypes();
            if (!(subtypes instanceof Collection) || !subtypes.isEmpty()) {
                Iterator<T> it = subtypes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Intrinsics.areEqual(((CodeSessionOptions.Option) it.next()).getKey(), "license_plate.are.enabled")) {
                        arrayList.add(new TreeLeaf(new Name("License Plate UAE", "Номера автомобилей ОАЭ"), Integer.valueOf(C3069R.drawable.home_license_plates), null, 0, false, null, new CodeTargets.LicensePlateAre(), 60, null));
                        break;
                    }
                }
            }
        }
        if (setLoadEngineSupportedTypes.contains(CodeTargets.CodeTextLinePhone.ALLOWED_TYPE)) {
            arrayList.add(new TreeLeaf(new Name("Phone Lines (RUS)", "Номер телефона (РУС)"), Integer.valueOf(C3069R.drawable.home_phone), null, 0, false, null, new CodeTargets.CodeTextLinePhone(), 60, null));
        }
        if (setLoadEngineSupportedTypes.contains(CodeTargets.CodeTextLinePhoneCis.ALLOWED_TYPE)) {
            arrayList.add(new TreeLeaf(new Name("Phone Lines (CIS)", "Номер телефона (СНГ)"), Integer.valueOf(C3069R.drawable.home_phone), null, 0, false, null, new CodeTargets.CodeTextLinePhoneCis(), 60, null));
        }
        if (setLoadEngineSupportedTypes.contains(CodeTargets.CodeTextLineCardNumber.ALLOWED_TYPE)) {
            arrayList.add(new TreeLeaf(new Name("Bank Card Lines", "Банковская карта (номер)"), Integer.valueOf(C3069R.drawable.home_bank_card), null, 0, false, null, new CodeTargets.CodeTextLineCardNumber(), 60, null));
        }
        if (setLoadEngineSupportedTypes.contains(CodeTargets.CodeTextLineInn.ALLOWED_TYPE)) {
            arrayList.add(new TreeLeaf(new Name("INN", "ИНН"), Integer.valueOf(C3069R.drawable.home_bank_card), null, 0, false, null, new CodeTargets.CodeTextLineInn(), 60, null));
        }
        if (setLoadEngineSupportedTypes.contains(CodeTargets.CodeTextLineKpp.ALLOWED_TYPE)) {
            arrayList.add(new TreeLeaf(new Name("KPP", "КПП"), Integer.valueOf(C3069R.drawable.home_bank_card), null, 0, false, null, new CodeTargets.CodeTextLineKpp(), 60, null));
        }
        if (setLoadEngineSupportedTypes.contains(CodeTargets.CodeTextLineBic.ALLOWED_TYPE)) {
            arrayList.add(new TreeLeaf(new Name("Russian BIC", "БИК"), Integer.valueOf(C3069R.drawable.home_bank_card), null, 0, false, null, new CodeTargets.CodeTextLineBic(), 60, null));
        }
        if (setLoadEngineSupportedTypes.contains(CodeTargets.CodeTextLineBankAccount.ALLOWED_TYPE)) {
            arrayList.add(new TreeLeaf(new Name("Russian Bank Account", "Номер банковского счёта"), Integer.valueOf(C3069R.drawable.home_bank_card), null, 0, false, null, new CodeTargets.CodeTextLineBankAccount(), 60, null));
        }
        if (setLoadEngineSupportedTypes.contains(CodeTargets.CodeTextLineVin.ALLOWED_TYPE)) {
            arrayList.add(new TreeLeaf(new Name("VIN", "VIN"), Integer.valueOf(C3069R.drawable.home_bank_card), null, 0, false, null, new CodeTargets.CodeTextLineVin(), 60, null));
        }
        if (setKeySet.contains(CodeTargets.Container.INTERNAL_ENGINE)) {
            arrayList.add(new TreeLeaf(new Name("Shipping Container", "Грузовой контейнер"), Integer.valueOf(C3069R.drawable.home_bank_card), null, 0, false, null, new CodeTargets.Container(), 60, null));
        }
        if (setLoadEngineSupportedTypes.contains(CodeTargets.CodeTextLineContainerNumber.ALLOWED_TYPE)) {
            arrayList.add(new TreeLeaf(new Name("Container seal number", "Номер пломбы контейнера"), Integer.valueOf(C3069R.drawable.home_bank_card), null, 0, false, null, new CodeTargets.CodeTextLineContainerNumber(), 60, null));
        }
        TreeGroupViewType.TwoLevelsIconsTexts twoLevelsIconsTexts = new TreeGroupViewType.TwoLevelsIconsTexts(2);
        String string = context.getString(C3069R.string.code_engine_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new TreeGroup(new Name(string), null, arrayList, 0, null, twoLevelsIconsTexts, 24, null);
    }
}
