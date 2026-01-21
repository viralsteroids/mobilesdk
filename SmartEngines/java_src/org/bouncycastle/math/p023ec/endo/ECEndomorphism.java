package org.bouncycastle.math.p023ec.endo;

import org.bouncycastle.math.p023ec.ECPointMap;

/* loaded from: classes2.dex */
public interface ECEndomorphism {
    ECPointMap getPointMap();

    boolean hasEfficientPointMap();
}
