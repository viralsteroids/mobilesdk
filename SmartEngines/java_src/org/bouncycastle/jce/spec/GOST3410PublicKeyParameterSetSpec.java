package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* renamed from: a */
    private BigInteger f1623a;

    /* renamed from: p */
    private BigInteger f1624p;

    /* renamed from: q */
    private BigInteger f1625q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f1624p = bigInteger;
        this.f1625q = bigInteger2;
        this.f1623a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            if (this.f1623a.equals(gOST3410PublicKeyParameterSetSpec.f1623a) && this.f1624p.equals(gOST3410PublicKeyParameterSetSpec.f1624p) && this.f1625q.equals(gOST3410PublicKeyParameterSetSpec.f1625q)) {
                return true;
            }
        }
        return false;
    }

    public BigInteger getA() {
        return this.f1623a;
    }

    public BigInteger getP() {
        return this.f1624p;
    }

    public BigInteger getQ() {
        return this.f1625q;
    }

    public int hashCode() {
        return (this.f1623a.hashCode() ^ this.f1624p.hashCode()) ^ this.f1625q.hashCode();
    }
}
