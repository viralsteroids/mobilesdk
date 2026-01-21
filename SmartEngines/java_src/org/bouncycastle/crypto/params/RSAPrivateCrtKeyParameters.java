package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {

    /* renamed from: dP */
    private BigInteger f1525dP;

    /* renamed from: dQ */
    private BigInteger f1526dQ;

    /* renamed from: e */
    private BigInteger f1527e;

    /* renamed from: p */
    private BigInteger f1528p;

    /* renamed from: q */
    private BigInteger f1529q;
    private BigInteger qInv;

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        super(true, bigInteger, bigInteger3);
        this.f1527e = bigInteger2;
        this.f1528p = bigInteger4;
        this.f1529q = bigInteger5;
        this.f1525dP = bigInteger6;
        this.f1526dQ = bigInteger7;
        this.qInv = bigInteger8;
    }

    public BigInteger getDP() {
        return this.f1525dP;
    }

    public BigInteger getDQ() {
        return this.f1526dQ;
    }

    public BigInteger getP() {
        return this.f1528p;
    }

    public BigInteger getPublicExponent() {
        return this.f1527e;
    }

    public BigInteger getQ() {
        return this.f1529q;
    }

    public BigInteger getQInv() {
        return this.qInv;
    }
}
