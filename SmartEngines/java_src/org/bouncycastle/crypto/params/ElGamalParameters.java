package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes3.dex */
public class ElGamalParameters implements CipherParameters {

    /* renamed from: g */
    private BigInteger f1500g;

    /* renamed from: l */
    private int f1501l;

    /* renamed from: p */
    private BigInteger f1502p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f1500g = bigInteger2;
        this.f1502p = bigInteger;
        this.f1501l = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f1502p) && elGamalParameters.getG().equals(this.f1500g) && elGamalParameters.getL() == this.f1501l;
    }

    public BigInteger getG() {
        return this.f1500g;
    }

    public int getL() {
        return this.f1501l;
    }

    public BigInteger getP() {
        return this.f1502p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f1501l;
    }
}
