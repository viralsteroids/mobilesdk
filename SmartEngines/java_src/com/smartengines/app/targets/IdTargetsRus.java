package com.smartengines.app.targets;

import com.smartengines.dictionaries.IdDocTypesRus;
import com.smartengines.targets.p008id.IdTarget;
import com.smartengines.utils.Name;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdTargetsRus.kt */
@Metadata(m513d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m514d2 = {"Lcom/smartengines/app/targets/IdTargetsRus;", "", "<init>", "()V", "list", "", "Lcom/smartengines/app/targets/TreeLeaf;", "getList", "()Ljava/util/List;", "list$delegate", "Lkotlin/Lazy;", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdTargetsRus {
    public static final IdTargetsRus INSTANCE = new IdTargetsRus();

    /* renamed from: list$delegate, reason: from kotlin metadata */
    private static final Lazy list = LazyKt.lazy(new Function0() { // from class: com.smartengines.app.targets.IdTargetsRus$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IdTargetsRus.list_delegate$lambda$4();
        }
    });
    public static final int $stable = 8;

    private IdTargetsRus() {
    }

    public final List<TreeLeaf> getList() {
        return (List) list.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List list_delegate$lambda$4() {
        List<IdDocTypesRus.IdDocType> data = IdDocTypesRus.INSTANCE.getData();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
        for (IdDocTypesRus.IdDocType idDocType : data) {
            String str = idDocType.getName().get("en");
            Intrinsics.checkNotNull(str);
            String str2 = idDocType.getName().get("ru");
            Intrinsics.checkNotNull(str2);
            Name name = new Name(str, str2);
            int icon = idDocType.getIcon();
            IdTarget idTarget = new IdTarget(idDocType.getMode(), idDocType.getMask());
            arrayList.add(new TreeLeaf(name, Integer.valueOf(icon), null, idDocType.getPriority(), false, null, idTarget, 52, null));
        }
        final Function2 function2 = new Function2() { // from class: com.smartengines.app.targets.IdTargetsRus$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(IdTargetsRus.list_delegate$lambda$4$lambda$2((TreeLeaf) obj, (TreeLeaf) obj2));
            }
        };
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.smartengines.app.targets.IdTargetsRus$$ExternalSyntheticLambda2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return IdTargetsRus.list_delegate$lambda$4$lambda$3(function2, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int list_delegate$lambda$4$lambda$3(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int list_delegate$lambda$4$lambda$2(TreeLeaf treeLeaf, TreeLeaf treeLeaf2) {
        int priority = treeLeaf2.getPriority() - treeLeaf.getPriority();
        return priority != 0 ? priority : treeLeaf.getName().toString().compareTo(treeLeaf2.getName().toString());
    }
}
