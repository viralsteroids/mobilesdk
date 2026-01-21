package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes3.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: g */
    private BigInteger f1615g;

    /* renamed from: p */
    private BigInteger f1616p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f1616p = bigInteger;
        this.f1615g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f1615g;
    }

    public BigInteger getP() {
        return this.f1616p;
    }
}
