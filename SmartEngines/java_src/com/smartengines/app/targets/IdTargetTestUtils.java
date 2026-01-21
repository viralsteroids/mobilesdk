package com.smartengines.app.targets;

import android.util.Log;
import androidx.autofill.HintConstants;
import com.smartengines.app.Model;
import com.smartengines.dictionaries.C3289R;
import com.smartengines.dictionaries.IdDocTypesRus;
import com.smartengines.engine.Engine;
import com.smartengines.engine.RecognitionTarget;
import com.smartengines.engine.p005id.IdEngineWrapper;
import com.smartengines.p006id.IdSessionSettings;
import com.smartengines.targets.code.CodeTargets;
import com.smartengines.targets.p008id.IdSessionOptions;
import com.smartengines.targets.p008id.IdSessionOptionsKt;
import com.smartengines.targets.p008id.IdTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: IdTargetTestUtils.kt */
@Metadata(m513d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fJ\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0002R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, m514d2 = {"Lcom/smartengines/app/targets/IdTargetTestUtils;", "", "<init>", "()V", "errors", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "getErrors", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "runTests", "", "getRussianUnknownDocTypes", "getNonRussianUnknownDocTypes", "getRussianDictionaryUnusedMasks", "", "getRussianLoadedMasks", "", "getNonRussianLoadedMasks", "getRussianExistedTypes", "getNonRussianExistedTypes", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdTargetTestUtils {
    public static final IdTargetTestUtils INSTANCE = new IdTargetTestUtils();
    private static final MutableStateFlow<List<String>> errors = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
    public static final int $stable = 8;

    private IdTargetTestUtils() {
    }

    public final MutableStateFlow<List<String>> getErrors() {
        return errors;
    }

    public final void runTests() {
        MutableStateFlow<List<String>> mutableStateFlow = errors;
        ArrayList arrayList = new ArrayList();
        List<String> russianUnknownDocTypes = INSTANCE.getRussianUnknownDocTypes();
        if (!russianUnknownDocTypes.isEmpty()) {
            arrayList.add("RUSSIAN UNKNOWN DOC TYPES:");
        }
        Iterator<T> it = russianUnknownDocTypes.iterator();
        while (it.hasNext()) {
            arrayList.add("   " + ((String) it.next()));
        }
        List<String> nonRussianUnknownDocTypes = INSTANCE.getNonRussianUnknownDocTypes();
        if (!nonRussianUnknownDocTypes.isEmpty()) {
            arrayList.add("NON-RUSSIAN UNKNOWN DOC TYPES:");
        }
        Iterator<T> it2 = nonRussianUnknownDocTypes.iterator();
        while (it2.hasNext()) {
            arrayList.add("   " + ((String) it2.next()));
        }
        mutableStateFlow.setValue(arrayList);
    }

    public final List<String> getRussianUnknownDocTypes() {
        Set<String> russianLoadedMasks = getRussianLoadedMasks();
        Log.d("myapp.IdTestUtils", "Russian loaded masks list size: " + russianLoadedMasks.size());
        Set<String> russianExistedTypes = getRussianExistedTypes();
        Log.d("myapp.IdTestUtils", "Russian existed doc types list size: " + russianExistedTypes.size());
        Set<String> set = russianLoadedMasks;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.removeSuffix((String) it.next(), (CharSequence) "*"));
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : russianExistedTypes) {
            String str = (String) obj;
            ArrayList arrayList4 = arrayList2;
            if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    if (StringsKt.startsWith$default(str, (String) it2.next(), false, 2, (Object) null)) {
                        break;
                    }
                }
            }
            arrayList3.add(obj);
        }
        return arrayList3;
    }

    public final List<String> getNonRussianUnknownDocTypes() {
        Set<String> nonRussianLoadedMasks = getNonRussianLoadedMasks();
        Log.d("myapp.IdTestUtils", "non-Russian loaded masks list size: " + nonRussianLoadedMasks.size());
        Set<String> nonRussianExistedTypes = getNonRussianExistedTypes();
        Log.d("myapp.IdTestUtils", "non-Russian existed doc types list size: " + nonRussianExistedTypes.size());
        Set<String> set = nonRussianLoadedMasks;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.removeSuffix((String) it.next(), (CharSequence) "*"));
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : nonRussianExistedTypes) {
            String str = (String) obj;
            ArrayList arrayList4 = arrayList2;
            if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    if (StringsKt.startsWith$default(str, (String) it2.next(), false, 2, (Object) null)) {
                        break;
                    }
                }
            }
            arrayList3.add(obj);
        }
        return arrayList3;
    }

    public final Collection<String> getRussianDictionaryUnusedMasks() {
        Set<String> russianLoadedMasks = getRussianLoadedMasks();
        Log.d("myapp.IdTestUtils", "Russian loaded masks list size: " + russianLoadedMasks.size());
        List<IdDocTypesRus.IdDocType> data = IdDocTypesRus.INSTANCE.getData();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(((IdDocTypesRus.IdDocType) it.next()).getMask());
        }
        Set set = CollectionsKt.toSet(arrayList);
        Log.d("myapp.IdTestUtils", "Russian dictionary masks list size: " + set.size());
        return SetsKt.minus(set, (Iterable) russianLoadedMasks);
    }

    private final Set<String> getRussianLoadedMasks() {
        Object next;
        List<TreeItem> children = Model.INSTANCE.getEngines().getId().getTargets().getChildren();
        Intrinsics.checkNotNull(children);
        Iterator<T> it = children.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer icon = ((TreeItem) next).getIcon();
            int i = C3289R.drawable.flag_rus;
            if (icon != null && icon.intValue() == i) {
                break;
            }
        }
        TreeItem treeItem = (TreeItem) next;
        HashSet hashSet = new HashSet();
        Intrinsics.checkNotNull(treeItem);
        List<TreeItem> children2 = treeItem.getChildren();
        Intrinsics.checkNotNull(children2);
        for (TreeItem treeItem2 : children2) {
            Intrinsics.checkNotNull(treeItem2, "null cannot be cast to non-null type com.smartengines.app.targets.TreeLeaf");
            RecognitionTarget target = ((TreeLeaf) treeItem2).getTarget();
            Intrinsics.checkNotNull(target, "null cannot be cast to non-null type com.smartengines.targets.id.IdTarget");
            hashSet.addAll(((IdTarget) target).getEnabledMasks());
        }
        return hashSet;
    }

    private final Set<String> getNonRussianLoadedMasks() {
        List<TreeItem> children = Model.INSTANCE.getEngines().getId().getTargets().getChildren();
        Intrinsics.checkNotNull(children);
        ArrayList arrayList = new ArrayList();
        for (Object obj : children) {
            Integer icon = ((TreeItem) obj).getIcon();
            int i = C3289R.drawable.flag_rus;
            if (icon == null || icon.intValue() != i) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<TreeItem> children2 = ((TreeItem) it.next()).getChildren();
            if (children2 != null) {
                for (TreeItem treeItem : children2) {
                    Intrinsics.checkNotNull(treeItem, "null cannot be cast to non-null type com.smartengines.app.targets.TreeLeaf");
                    RecognitionTarget target = ((TreeLeaf) treeItem).getTarget();
                    Intrinsics.checkNotNull(target, "null cannot be cast to non-null type com.smartengines.targets.id.IdTarget");
                    hashSet.addAll(((IdTarget) target).getEnabledMasks());
                }
            }
        }
        return hashSet;
    }

    private final Set<String> getRussianExistedTypes() {
        Engine engine = Model.INSTANCE.getEngines().getId().getLoader().getEngine();
        Intrinsics.checkNotNull(engine, "null cannot be cast to non-null type com.smartengines.engine.id.IdEngineWrapper");
        IdSessionSettings idSessionSettingsCreateSessionSettings = ((IdEngineWrapper) engine).getIdEngine().CreateSessionSettings();
        Intrinsics.checkNotNullExpressionValue(idSessionSettingsCreateSessionSettings, "CreateSessionSettings(...)");
        IdSessionOptions idSessionOptions = IdSessionOptionsKt.parse(idSessionSettingsCreateSessionSettings);
        HashSet hashSet = new HashSet();
        Iterator<T> it = idSessionOptions.getModes().values().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((IdSessionOptions.Mode) it.next()).getInternalEngines().values().iterator();
            while (it2.hasNext()) {
                List<String> supportedDocumentTypes = ((IdSessionOptions.InternalEngine) it2.next()).getSupportedDocumentTypes();
                ArrayList arrayList = new ArrayList();
                for (Object obj : supportedDocumentTypes) {
                    if (StringsKt.startsWith$default((String) obj, "rus.", false, 2, (Object) null)) {
                        arrayList.add(obj);
                    }
                }
                hashSet.addAll(arrayList);
            }
        }
        return hashSet;
    }

    private final Set<String> getNonRussianExistedTypes() {
        Engine engine = Model.INSTANCE.getEngines().getId().getLoader().getEngine();
        Intrinsics.checkNotNull(engine, "null cannot be cast to non-null type com.smartengines.engine.id.IdEngineWrapper");
        IdSessionSettings idSessionSettingsCreateSessionSettings = ((IdEngineWrapper) engine).getIdEngine().CreateSessionSettings();
        Intrinsics.checkNotNullExpressionValue(idSessionSettingsCreateSessionSettings, "CreateSessionSettings(...)");
        IdSessionOptions idSessionOptions = IdSessionOptionsKt.parse(idSessionSettingsCreateSessionSettings);
        HashSet hashSet = new HashSet();
        Set of = SetsKt.setOf((Object[]) new String[]{"document_crop", "face", "aus_edrvlic"});
        Set of2 = SetsKt.setOf((Object[]) new String[]{"rus", CodeTargets.Barcode.INTERNAL_ENGINE, "card", CodeTargets.Mrz.INTERNAL_ENGINE, "rus_phone_lines", "card_number_lines", CodeTargets.CodeTextLineCardNumber.ALLOWED_TYPE, HintConstants.AUTOFILL_HINT_PHONE, "lib", "uto_midv", "ipp", "zar", "pnw", "poc", "pos", "iru", "uka", "kgl", "hau", "kha", "rvn", "idl", "rwb", "yug", "psp", "bhd", "rho", "wsa", "frw", "tnr", "nsk", "ger", "man", "cnr", "urs", "kog", "koh", "cor", "uto", "rot", "ant", "bek", "glr", "zaq", "kun", "lot", "shi", "fre", "trd"});
        Set of3 = SetsKt.setOf("gypsies");
        Iterator<T> it = idSessionOptions.getModes().values().iterator();
        while (it.hasNext()) {
            Collection<IdSessionOptions.InternalEngine> collectionValues = ((IdSessionOptions.Mode) it.next()).getInternalEngines().values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (!of.contains(((IdSessionOptions.InternalEngine) obj).getName())) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                List<String> supportedDocumentTypes = ((IdSessionOptions.InternalEngine) it2.next()).getSupportedDocumentTypes();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : supportedDocumentTypes) {
                    List listSplit$default = StringsKt.split$default((CharSequence) obj2, new String[]{"."}, false, 0, 6, (Object) null);
                    String str = (String) CollectionsKt.first(listSplit$default);
                    String str2 = (String) CollectionsKt.getOrNull(listSplit$default, 1);
                    if (!of2.contains(str) && !CollectionsKt.contains(of3, str2)) {
                        arrayList2.add(obj2);
                    }
                }
                hashSet.addAll(arrayList2);
            }
        }
        return hashSet;
    }
}
