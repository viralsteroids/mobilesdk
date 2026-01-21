package com.smartengines.app.targets;

import android.content.Context;
import com.smartengines.app.C3069R;
import com.smartengines.app.targets.TreeGroupViewType;
import com.smartengines.dictionaries.C3289R;
import com.smartengines.doc.DocEngine;
import com.smartengines.doc.DocSessionSettings;
import com.smartengines.engine.RecognitionTarget;
import com.smartengines.targets.DocumentTypesStatistics;
import com.smartengines.targets.code.CodeTargets;
import com.smartengines.targets.doc.DocSessionOptions;
import com.smartengines.targets.doc.DocSessionOptionsKt;
import com.smartengines.targets.doc.DocTarget;
import com.smartengines.targets.text.TextTarget;
import com.smartengines.utils.Name;
import com.smartengines.utils.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocTargetsList.kt */
@Metadata(m513d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n\u001a \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m514d2 = {"TAG", "", "loadDocTargetSections", "", "Lcom/smartengines/app/targets/DocSection;", "context", "Landroid/content/Context;", "docEngine", "Lcom/smartengines/doc/DocEngine;", "statistics", "Lcom/smartengines/targets/DocumentTypesStatistics;", "loadDocTargetList", "Lcom/smartengines/app/targets/TreeItem;", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DocTargetsListKt {
    private static final String TAG = "myapp.DocTargetsList";

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<DocSection> loadDocTargetSections(Context context, DocEngine docEngine, DocumentTypesStatistics documentTypesStatistics) {
        Set<String> doctypesEN;
        Set<String> doctypesEN2;
        Set<String> doctypesEN3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(docEngine, "docEngine");
        String currentLanguage = UtilsKt.getCurrentLanguage(context, CollectionsKt.listOf((Object[]) new String[]{"en", "ru"}));
        DocSessionSettings docSessionSettingsCreateSessionSettings = docEngine.CreateSessionSettings();
        Intrinsics.checkNotNullExpressionValue(docSessionSettingsCreateSessionSettings, "CreateSessionSettings(...)");
        DocSessionOptions docSessionOptions = DocSessionOptionsKt.parse(docSessionSettingsCreateSessionSettings);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(new DocSection(DocSectionType.TEXT_ENGINE, null, CollectionsKt.listOf(new TreeLeaf(new Name("Text recognition (OCR)", "Распознавание текста (OCR)"), Integer.valueOf(C3069R.drawable.home_text), null, 0, false, null, new TextTarget(), 60, null)), 2, null));
        TreeLeaf[] treeLeafArr = new TreeLeaf[3];
        DocTarget docTarget = new DocTarget("primary_accounting", "*");
        Name name = new Name("Primary Accounting Documents", "Первичные бухгалтерские документы");
        int i = C3289R.drawable.accounting;
        if (Intrinsics.areEqual(currentLanguage, "ru")) {
            DocSessionOptions.Mode mode = docSessionOptions.getModes().get("primary_accounting");
            doctypesEN = mode != null ? mode.getDoctypesRU() : null;
        } else {
            DocSessionOptions.Mode mode2 = docSessionOptions.getModes().get("primary_accounting");
            if (mode2 != null) {
                doctypesEN = mode2.getDoctypesEN();
            }
        }
        treeLeafArr[0] = new TreeLeaf(name, Integer.valueOf(i), null, 0, true, doctypesEN != null ? CollectionsKt.toList(doctypesEN) : null, docTarget, 12, null);
        DocTarget docTarget2 = new DocTarget("hiring", "*");
        Name name2 = new Name("Personnel Documents", "Кадровые документы");
        int i2 = C3289R.drawable.document_folder;
        if (Intrinsics.areEqual(currentLanguage, "ru")) {
            DocSessionOptions.Mode mode3 = docSessionOptions.getModes().get("hiring");
            doctypesEN2 = mode3 != null ? mode3.getDoctypesRU() : null;
        } else {
            DocSessionOptions.Mode mode4 = docSessionOptions.getModes().get("hiring");
            if (mode4 != null) {
                doctypesEN2 = mode4.getDoctypesEN();
            }
        }
        treeLeafArr[1] = new TreeLeaf(name2, Integer.valueOf(i2), null, 0, true, doctypesEN2 != null ? CollectionsKt.toList(doctypesEN2) : null, docTarget2, 12, null);
        DocTarget docTarget3 = new DocTarget("legal_entity_pack", "*");
        Name name3 = new Name("Legal Entity Documents", "Документы юридических лиц и ИП");
        int i3 = C3289R.drawable.owner_register;
        if (Intrinsics.areEqual(currentLanguage, "ru")) {
            DocSessionOptions.Mode mode5 = docSessionOptions.getModes().get("legal_entity_pack");
            doctypesEN3 = mode5 != null ? mode5.getDoctypesRU() : null;
        } else {
            DocSessionOptions.Mode mode6 = docSessionOptions.getModes().get("legal_entity_pack");
            if (mode6 != null) {
                doctypesEN3 = mode6.getDoctypesEN();
            }
        }
        treeLeafArr[2] = new TreeLeaf(name3, Integer.valueOf(i3), null, 0, true, doctypesEN3 != null ? CollectionsKt.toList(doctypesEN3) : null, docTarget3, 12, null);
        List listListOf = CollectionsKt.listOf((Object[]) treeLeafArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            Set<String> setKeySet = docSessionOptions.getModes().keySet();
            RecognitionTarget target = ((TreeLeaf) obj).getTarget();
            Intrinsics.checkNotNull(target, "null cannot be cast to non-null type com.smartengines.targets.doc.DocTarget");
            if (setKeySet.contains(((DocTarget) target).getMode())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            listCreateListBuilder.add(new DocSection(DocSectionType.AUTO_SELECT, new Name("Autoselect", "Автовыбор"), arrayList2));
        }
        List listListOf2 = CollectionsKt.listOf((Object[]) new TreeLeaf[]{new TreeLeaf(new Name("Personal income form", "Справка о доходах и суммах налога физического лица (2НДФЛ)"), Integer.valueOf(C3289R.drawable.taxes), null, 0, false, null, new DocTarget("primary_accounting", "rus.2ndfl.type1"), 60, null), new TreeLeaf(new Name("Certificate", "Акт"), Integer.valueOf(C3289R.drawable.taxes), null, 0, false, null, new DocTarget("primary_accounting", "rus.act.type1"), 60, null), new TreeLeaf(new Name("Payment bill", "Счёт"), Integer.valueOf(C3289R.drawable.taxes), null, 0, false, null, new DocTarget("primary_accounting", "rus.invoice.type1"), 60, null), new TreeLeaf(new Name("TIN", "ИНН"), Integer.valueOf(C3289R.drawable.owner_register), null, 0, false, null, new DocTarget(CodeTargets.CodeTextLineInn.ALLOWED_TYPE, "*"), 60, null), new TreeLeaf(new Name("TORG-12 form", "Товарная накладная ТОРГ-12"), Integer.valueOf(C3289R.drawable.taxes), null, 0, false, null, new DocTarget("primary_accounting", "rus.torg12.type1"), 60, null), new TreeLeaf(new Name("Universal transfer document", "УПД"), Integer.valueOf(C3289R.drawable.accounting), null, 0, false, null, new DocTarget("primary_accounting", "rus.upd.type1"), 60, null), new TreeLeaf(new Name("EGRIP record", "Выписка ЕГРИП"), Integer.valueOf(C3289R.drawable.accounting), null, 0, false, null, new DocTarget("primary_accounting", "rus.egrip.type1"), 60, null), new TreeLeaf(new Name("Universal transfer document", "Выписка ЕГРЮЛ"), Integer.valueOf(C3289R.drawable.accounting), null, 0, false, null, new DocTarget("primary_accounting", "rus.egrul.type1"), 60, null), new TreeLeaf(new Name("SNILS/ADI-REG", "СНИЛС/АДИ-РЕГ "), Integer.valueOf(C3289R.drawable.document_folder), null, 0, false, null, new DocTarget("snils_adireg", "*"), 60, null), new TreeLeaf(new Name("Electronic Vehicle Passport", "ЭПТС"), Integer.valueOf(C3289R.drawable.document_folder), null, 0, false, null, new DocTarget("default", "rus.epts.type1"), 60, null), new TreeLeaf(new Name("Electronic Self-Propelled Vehicle Passport", "ЭПСМ"), Integer.valueOf(C3289R.drawable.document_folder), null, 0, false, null, new DocTarget("default", "rus.epsm.type1"), 60, null)});
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listListOf2) {
            Set<String> setKeySet2 = docSessionOptions.getModes().keySet();
            RecognitionTarget target2 = ((TreeLeaf) obj2).getTarget();
            Intrinsics.checkNotNull(target2, "null cannot be cast to non-null type com.smartengines.targets.doc.DocTarget");
            if (setKeySet2.contains(((DocTarget) target2).getMode())) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            listCreateListBuilder.add(new DocSection(DocSectionType.POPULAR_DOCUMENTS, new Name("Popular Documents", "Популярные документы"), arrayList4));
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public static final TreeItem loadDocTargetList(Context context, DocEngine docEngine, DocumentTypesStatistics documentTypesStatistics) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(docEngine, "docEngine");
        List<DocSection> listLoadDocTargetSections = loadDocTargetSections(context, docEngine, documentTypesStatistics);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listLoadDocTargetSections.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((DocSection) it.next()).getItems());
        }
        String string = context.getString(C3069R.string.doc_engine_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new TreeGroup(new Name(string), null, arrayList, 0, null, new TreeGroupViewType.OneLevelIcons(2), 24, null);
    }
}
