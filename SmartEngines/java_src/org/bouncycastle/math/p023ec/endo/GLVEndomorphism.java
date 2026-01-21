package org.bouncycastle.math.p023ec.endo;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public interface GLVEndomorphism extends ECEndomorphism {
    BigInteger[] decomposeScalar(BigInteger bigInteger);
}
