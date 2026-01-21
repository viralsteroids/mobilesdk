package org.bouncycastle.jce.spec;

import org.bouncycastle.math.p023ec.ECPoint;

/* loaded from: classes3.dex */
public class ECPublicKeySpec extends ECKeySpec {

    /* renamed from: q */
    private ECPoint f1614q;

    public ECPublicKeySpec(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        if (eCPoint.getCurve() != null) {
            this.f1614q = eCPoint.normalize();
        } else {
            this.f1614q = eCPoint;
        }
    }

    public ECPoint getQ() {
        return this.f1614q;
    }
}
