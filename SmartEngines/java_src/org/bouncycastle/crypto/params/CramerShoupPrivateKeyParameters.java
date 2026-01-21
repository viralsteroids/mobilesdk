package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: pk */
    private CramerShoupPublicKeyParameters f1471pk;

    /* renamed from: x1 */
    private BigInteger f1472x1;

    /* renamed from: x2 */
    private BigInteger f1473x2;

    /* renamed from: y1 */
    private BigInteger f1474y1;

    /* renamed from: y2 */
    private BigInteger f1475y2;

    /* renamed from: z */
    private BigInteger f1476z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f1472x1 = bigInteger;
        this.f1473x2 = bigInteger2;
        this.f1474y1 = bigInteger3;
        this.f1475y2 = bigInteger4;
        this.f1476z = bigInteger5;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f1472x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f1473x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f1474y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f1475y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f1476z) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.f1471pk;
    }

    public BigInteger getX1() {
        return this.f1472x1;
    }

    public BigInteger getX2() {
        return this.f1473x2;
    }

    public BigInteger getY1() {
        return this.f1474y1;
    }

    public BigInteger getY2() {
        return this.f1475y2;
    }

    public BigInteger getZ() {
        return this.f1476z;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((((this.f1472x1.hashCode() ^ this.f1473x2.hashCode()) ^ this.f1474y1.hashCode()) ^ this.f1475y2.hashCode()) ^ this.f1476z.hashCode()) ^ super.hashCode();
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.f1471pk = cramerShoupPublicKeyParameters;
    }
}
