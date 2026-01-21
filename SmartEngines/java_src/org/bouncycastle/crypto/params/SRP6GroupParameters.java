package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class SRP6GroupParameters {

    /* renamed from: N */
    private BigInteger f1530N;

    /* renamed from: g */
    private BigInteger f1531g;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f1530N = bigInteger;
        this.f1531g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f1531g;
    }

    public BigInteger getN() {
        return this.f1530N;
    }
}
