package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: c */
    private BigInteger f1477c;

    /* renamed from: d */
    private BigInteger f1478d;

    /* renamed from: h */
    private BigInteger f1479h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f1477c = bigInteger;
        this.f1478d = bigInteger2;
        this.f1479h = bigInteger3;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f1477c) && cramerShoupPublicKeyParameters.getD().equals(this.f1478d) && cramerShoupPublicKeyParameters.getH().equals(this.f1479h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f1477c;
    }

    public BigInteger getD() {
        return this.f1478d;
    }

    public BigInteger getH() {
        return this.f1479h;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f1477c.hashCode() ^ this.f1478d.hashCode()) ^ this.f1479h.hashCode()) ^ super.hashCode();
    }
}
