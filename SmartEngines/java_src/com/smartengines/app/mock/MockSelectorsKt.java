package com.smartengines.app.mock;

import com.smartengines.app.C3069R;
import com.smartengines.app.targets.TreeLeaf;
import com.smartengines.targets.p008id.IdTarget;
import com.smartengines.utils.Name;
import kotlin.Metadata;

/* compiled from: MockSelectors.kt */
@Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m514d2 = {"mockSelectedTreeLeaf", "Lcom/smartengines/app/targets/TreeLeaf;", "getMockSelectedTreeLeaf", "()Lcom/smartengines/app/targets/TreeLeaf;", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class MockSelectorsKt {
    private static final TreeLeaf mockSelectedTreeLeaf = new TreeLeaf(new Name("Any doc", "Any doc"), Integer.valueOf(C3069R.drawable.home_anydoc), null, 0, false, null, new IdTarget("anydoc", "*"), 60, null);

    public static final TreeLeaf getMockSelectedTreeLeaf() {
        return mockSelectedTreeLeaf;
    }
}
