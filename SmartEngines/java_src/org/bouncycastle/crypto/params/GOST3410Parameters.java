package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes3.dex */
public class GOST3410Parameters implements CipherParameters {

    /* renamed from: a */
    private BigInteger f1505a;

    /* renamed from: p */
    private BigInteger f1506p;

    /* renamed from: q */
    private BigInteger f1507q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f1506p = bigInteger;
        this.f1507q = bigInteger2;
        this.f1505a = bigInteger3;
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f1505a = bigInteger3;
        this.f1506p = bigInteger;
        this.f1507q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f1506p) && gOST3410Parameters.getQ().equals(this.f1507q) && gOST3410Parameters.getA().equals(this.f1505a);
    }

    public BigInteger getA() {
        return this.f1505a;
    }

    public BigInteger getP() {
        return this.f1506p;
    }

    public BigInteger getQ() {
        return this.f1507q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f1506p.hashCode() ^ this.f1507q.hashCode()) ^ this.f1505a.hashCode();
    }
}
