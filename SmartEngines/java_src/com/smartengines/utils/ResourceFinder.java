package com.smartengines.utils;

import android.content.Context;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResourceFinder.kt */
@Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m514d2 = {"Lcom/smartengines/utils/ResourceFinder;", "", "defaultResource", "", "<init>", "(I)V", "hash", "Ljava/util/HashMap;", "", "findResourceIdByString", "context", "Landroid/content/Context;", "stringId", "theDefault", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;)I", "utils_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ResourceFinder {
    private final int defaultResource;
    private final HashMap<String, Integer> hash = new HashMap<>();

    public ResourceFinder(int i) {
        this.defaultResource = i;
    }

    public static /* synthetic */ int findResourceIdByString$default(ResourceFinder resourceFinder, Context context, String str, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return resourceFinder.findResourceIdByString(context, str, num);
    }

    public final int findResourceIdByString(Context context, String stringId, Integer theDefault) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (stringId == null) {
            return theDefault != null ? theDefault.intValue() : this.defaultResource;
        }
        Integer num = this.hash.get(stringId);
        int iIntValue = num != null ? num.intValue() : context.getResources().getIdentifier(stringId, "drawable", context.getPackageName());
        return iIntValue != 0 ? iIntValue : theDefault != null ? theDefault.intValue() : this.defaultResource;
    }
}
