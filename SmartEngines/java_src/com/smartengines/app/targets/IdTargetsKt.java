package com.smartengines.app.targets;

import android.content.Context;
import android.util.Log;
import com.smartengines.app.C3069R;
import com.smartengines.app.Model;
import com.smartengines.app.targets.TreeGroupViewType;
import com.smartengines.dictionaries.C3289R;
import com.smartengines.dictionaries.IdAutoselectionModes;
import com.smartengines.dictionaries.IdDocTypesNoRus;
import com.smartengines.dictionaries.Issuers;
import com.smartengines.p006id.IdEngine;
import com.smartengines.p006id.IdSessionSettings;
import com.smartengines.targets.DocumentTypesStatistics;
import com.smartengines.targets.FacesTarget;
import com.smartengines.targets.p008id.IdSessionOptions;
import com.smartengines.targets.p008id.IdSessionOptionsKt;
import com.smartengines.targets.p008id.IdTarget;
import com.smartengines.targets.p008id.LivenessTarget;
import com.smartengines.utils.Name;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: IdTargets.kt */
@Metadata(m513d1 = {"\u0000X\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u001a&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u001a\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0014\u0010\u0012\u001a\u00020\u0010*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0002\u001a2\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001aH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m514d2 = {"TAG", "", "loadIdTargetList", "Lcom/smartengines/app/targets/TreeItem;", "context", "Landroid/content/Context;", "idEngine", "Lcom/smartengines/id/IdEngine;", "stat", "Lcom/smartengines/targets/DocumentTypesStatistics;", "loadCountryList", "", "sessionSettings", "Lcom/smartengines/targets/id/IdSessionOptions;", "statistics", "checkTargetValidity", "", "Lcom/smartengines/targets/id/IdTarget;", "containsDocumentsForMask", "Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;", "mask", "loadCountryListItems", "Lcom/smartengines/app/targets/TreeLeaf;", "country", "documentTypesDictionary", "", "Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;", "getName", "Lcom/smartengines/utils/Name;", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdTargetsKt {
    private static final String TAG = "myapp.IdTargets";

    public static /* synthetic */ TreeItem loadIdTargetList$default(Context context, IdEngine idEngine, DocumentTypesStatistics documentTypesStatistics, int i, Object obj) {
        if ((i & 4) != 0) {
            documentTypesStatistics = null;
        }
        return loadIdTargetList(context, idEngine, documentTypesStatistics);
    }

    public static final TreeItem loadIdTargetList(Context context, IdEngine idEngine, DocumentTypesStatistics documentTypesStatistics) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(idEngine, "idEngine");
        IdSessionSettings idSessionSettingsCreateSessionSettings = idEngine.CreateSessionSettings();
        Intrinsics.checkNotNullExpressionValue(idSessionSettingsCreateSessionSettings, "CreateSessionSettings(...)");
        IdSessionOptions idSessionOptions = IdSessionOptionsKt.parse(idSessionSettingsCreateSessionSettings);
        TreeGroupViewType.OneLevelIcons oneLevelIcons = new TreeGroupViewType.OneLevelIcons(2);
        String string = context.getString(C3069R.string.id_engine_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Name name = new Name(string);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TreeLeaf(new Name("Compare Faces", "Сравнить лица"), Integer.valueOf(C3289R.drawable.id_faces), null, 0, false, null, new FacesTarget(null), 60, null));
        if (Model.INSTANCE.getBuildFlavor().isPrivate()) {
            arrayList.add(new TreeLeaf(new Name("Face Liveness", "Живость лица"), Integer.valueOf(C3289R.drawable.id_liveness), null, 0, false, null, new LivenessTarget(), 60, null));
        }
        for (IdAutoselectionModes.Item item : IdAutoselectionModes.INSTANCE.getData()) {
            if (idSessionOptions.getModes().keySet().contains(item.getMode())) {
                arrayList.add(new TreeLeaf(new Name(item.getName()), Integer.valueOf(item.getIcon()), null, 0, false, null, new IdTarget(item.getMode(), item.getMask()), 60, null));
            }
        }
        arrayList.addAll(loadCountryList(context, idSessionOptions, documentTypesStatistics));
        return new TreeGroup(name, null, arrayList, 0, null, oneLevelIcons, 24, null);
    }

    public static final List<TreeItem> loadCountryList(Context context, IdSessionOptions sessionSettings, DocumentTypesStatistics documentTypesStatistics) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionSettings, "sessionSettings");
        Map<String, Issuers.Issuer> mapLoadDictionary = Issuers.INSTANCE.loadDictionary();
        Map<String, IdDocTypesNoRus.IdDocType> mapLoadDictionary2 = IdDocTypesNoRus.INSTANCE.loadDictionary();
        if (documentTypesStatistics != null) {
            documentTypesStatistics.setDictionary(mapLoadDictionary2.keySet());
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Issuers.Issuer> entry : mapLoadDictionary.entrySet()) {
            String key = entry.getKey();
            Issuers.Issuer value = entry.getValue();
            if (Intrinsics.areEqual(key, "rus")) {
                Name name = new Name(value.getName());
                String altName = value.getAltName();
                int icon = value.getIcon();
                List<TreeLeaf> list = IdTargetsRus.INSTANCE.getList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    TreeLeaf treeLeaf = (TreeLeaf) obj;
                    if (treeLeaf.getTarget() instanceof IdTarget ? checkTargetValidity((IdTarget) treeLeaf.getTarget(), sessionSettings) : false) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.add(new TreeGroup(name, Integer.valueOf(icon), arrayList2, 0, altName, null, 40, null));
            } else {
                List<TreeLeaf> listLoadCountryListItems = loadCountryListItems(key, sessionSettings, mapLoadDictionary2);
                if (!listLoadCountryListItems.isEmpty()) {
                    arrayList.add(new TreeGroup(new Name(value.getName()), Integer.valueOf(value.getIcon()), listLoadCountryListItems, 0, value.getAltName(), null, 40, null));
                }
            }
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.smartengines.app.targets.IdTargetsKt$loadCountryList$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((TreeItem) t).getName().toString(), ((TreeItem) t2).getName().toString());
            }
        });
    }

    private static final boolean checkTargetValidity(IdTarget idTarget, IdSessionOptions idSessionOptions) {
        Object next;
        IdSessionOptions.Mode mode = idSessionOptions.getModes().get(idTarget.getMode());
        if (mode == null) {
            return false;
        }
        for (String str : idTarget.getEnabledMasks()) {
            Iterator<T> it = mode.getInternalEngines().values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (containsDocumentsForMask((IdSessionOptions.InternalEngine) next, str)) {
                    break;
                }
            }
            if (((IdSessionOptions.InternalEngine) next) == null) {
                return false;
            }
        }
        return true;
    }

    private static final boolean containsDocumentsForMask(IdSessionOptions.InternalEngine internalEngine, String str) {
        Object obj;
        String strRemoveSuffix = StringsKt.removeSuffix(str, (CharSequence) "*");
        Iterator<T> it = internalEngine.getSupportedDocumentTypes().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (StringsKt.startsWith$default((String) next, strRemoveSuffix, false, 2, (Object) null)) {
                obj = next;
                break;
            }
        }
        return obj != null;
    }

    private static final List<TreeLeaf> loadCountryListItems(String str, IdSessionOptions idSessionOptions, Map<String, IdDocTypesNoRus.IdDocType> map) {
        List<String> listListOf;
        IdDocTypesNoRus.IdDocType idDocType;
        IdDocTypesNoRus.IdDocType idDocType2;
        Object obj;
        Map<String, IdSessionOptions.InternalEngine> internalEngines;
        IdSessionOptions.InternalEngine internalEngine;
        List<String> supportedDocumentTypes;
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.areEqual(str, "usa")) {
            listListOf = CollectionsKt.listOf((Object[]) new String[]{str, "usa.medcard", "usa.vrc", "usa.naturalization_certificate"});
        } else {
            listListOf = Intrinsics.areEqual(str, "eue") ? CollectionsKt.listOf((Object[]) new String[]{str, "eue.medcard", "eue.payslip"}) : CollectionsKt.listOf(str);
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : listListOf) {
            IdSessionOptions.Mode mode = idSessionOptions.getModes().get("default");
            if (mode != null && (internalEngines = mode.getInternalEngines()) != null && (internalEngine = internalEngines.get(str2)) != null && (supportedDocumentTypes = internalEngine.getSupportedDocumentTypes()) != null) {
                arrayList2.addAll(supportedDocumentTypes);
            }
        }
        for (Map.Entry<String, IdDocTypesNoRus.IdDocType> entry : map.entrySet()) {
            String key = entry.getKey();
            IdDocTypesNoRus.IdDocType value = entry.getValue();
            String str3 = str + '.' + key;
            Iterator it = arrayList2.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (StringsKt.startsWith$default((String) next, str3, false, 2, (Object) null)) {
                    obj = next;
                    break;
                }
            }
            String str4 = (String) obj;
            if (str4 != null) {
                boolean zAreEqual = Intrinsics.areEqual(str4, str3);
                if (zAreEqual) {
                    Log.d(TAG, " is the same " + str3);
                }
                arrayList.add(new TreeLeaf(getName(value), Integer.valueOf(value.getIcon()), null, value.getPriority(), false, null, new IdTarget("default", str3 + (zAreEqual ? "" : ".*")), 52, null));
            }
        }
        if (Intrinsics.areEqual(str, "blr") && (idDocType2 = map.get("passport.registration")) != null) {
            arrayList.add(new TreeLeaf(getName(idDocType2), Integer.valueOf(idDocType2.getIcon()), null, idDocType2.getPriority(), false, null, new IdTarget("blr.passport.registration", "blr.passport.registration"), 52, null));
        }
        if (Intrinsics.areEqual(str, "usa") && (idDocType = map.get("AAMVA.drvlic")) != null) {
            arrayList.add(new TreeLeaf(getName(idDocType), Integer.valueOf(idDocType.getIcon()), null, idDocType.getPriority(), false, null, new IdTarget("extended", "usa.*"), 52, null));
        }
        final Function2 function2 = new Function2() { // from class: com.smartengines.app.targets.IdTargetsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return Integer.valueOf(IdTargetsKt.loadCountryListItems$lambda$20((TreeLeaf) obj2, (TreeLeaf) obj3));
            }
        };
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.smartengines.app.targets.IdTargetsKt$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return IdTargetsKt.loadCountryListItems$lambda$21(function2, obj2, obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int loadCountryListItems$lambda$21(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int loadCountryListItems$lambda$20(TreeLeaf treeLeaf, TreeLeaf treeLeaf2) {
        int priority = treeLeaf2.getPriority() - treeLeaf.getPriority();
        return priority != 0 ? priority : treeLeaf.getName().toString().compareTo(treeLeaf2.getName().toString());
    }

    private static final Name getName(IdDocTypesNoRus.IdDocType idDocType) {
        String str = idDocType.getName().get("en");
        Intrinsics.checkNotNull(str);
        String str2 = idDocType.getName().get("ru");
        Intrinsics.checkNotNull(str2);
        return new Name(str, str2);
    }
}
