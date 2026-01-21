package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes3.dex */
public class DSAParameters implements CipherParameters {

    /* renamed from: g */
    private BigInteger f1490g;

    /* renamed from: p */
    private BigInteger f1491p;

    /* renamed from: q */
    private BigInteger f1492q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f1490g = bigInteger3;
        this.f1491p = bigInteger;
        this.f1492q = bigInteger2;
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f1490g = bigInteger3;
        this.f1491p = bigInteger;
        this.f1492q = bigInteger2;
        this.validation = dSAValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f1491p) && dSAParameters.getQ().equals(this.f1492q) && dSAParameters.getG().equals(this.f1490g);
    }

    public BigInteger getG() {
        return this.f1490g;
    }

    public BigInteger getP() {
        return this.f1491p;
    }

    public BigInteger getQ() {
        return this.f1492q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }
}
