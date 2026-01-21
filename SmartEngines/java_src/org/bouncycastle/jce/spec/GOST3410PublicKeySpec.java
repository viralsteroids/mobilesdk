package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes3.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* renamed from: a */
    private BigInteger f1626a;

    /* renamed from: p */
    private BigInteger f1627p;

    /* renamed from: q */
    private BigInteger f1628q;

    /* renamed from: y */
    private BigInteger f1629y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f1629y = bigInteger;
        this.f1627p = bigInteger2;
        this.f1628q = bigInteger3;
        this.f1626a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f1626a;
    }

    public BigInteger getP() {
        return this.f1627p;
    }

    public BigInteger getQ() {
        return this.f1628q;
    }

    public BigInteger getY() {
        return this.f1629y;
    }
}
