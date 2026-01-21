package com.smartengines.targets.p008id;

import com.smartengines.targets.p008id.IdSessionOptions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: IdTargetUtils.kt */
@Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m514d2 = {"Lcom/smartengines/targets/id/IdTargetUtils;", "", "<init>", "()V", "TAG", "", "loadDocumentTypesForManyInternalEngines", "", "country", "internalEngines", "", "Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdTargetUtils {
    public static final IdTargetUtils INSTANCE = new IdTargetUtils();
    private static final String TAG = "myapp.IdTargetUtils";

    private IdTargetUtils() {
    }

    public final List<String> loadDocumentTypesForManyInternalEngines(String country, Iterable<IdSessionOptions.InternalEngine> internalEngines) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(internalEngines, "internalEngines");
        ArrayList arrayList = new ArrayList();
        for (IdSessionOptions.InternalEngine internalEngine : internalEngines) {
            if (Intrinsics.areEqual(internalEngine.getName(), country) || StringsKt.startsWith$default(internalEngine.getName(), country + '.', false, 2, (Object) null)) {
                arrayList.addAll(internalEngine.getSupportedDocumentTypes());
            }
        }
        return arrayList;
    }
}
