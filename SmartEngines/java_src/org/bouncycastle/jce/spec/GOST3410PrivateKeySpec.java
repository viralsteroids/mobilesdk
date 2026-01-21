package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes3.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* renamed from: a */
    private BigInteger f1619a;

    /* renamed from: p */
    private BigInteger f1620p;

    /* renamed from: q */
    private BigInteger f1621q;

    /* renamed from: x */
    private BigInteger f1622x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f1622x = bigInteger;
        this.f1620p = bigInteger2;
        this.f1621q = bigInteger3;
        this.f1619a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f1619a;
    }

    public BigInteger getP() {
        return this.f1620p;
    }

    public BigInteger getQ() {
        return this.f1621q;
    }

    public BigInteger getX() {
        return this.f1622x;
    }
}
