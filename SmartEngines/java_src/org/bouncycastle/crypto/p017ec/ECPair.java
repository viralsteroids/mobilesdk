package org.bouncycastle.crypto.p017ec;

import org.bouncycastle.math.p023ec.ECPoint;

/* loaded from: classes3.dex */
public class ECPair {

    /* renamed from: x */
    private final ECPoint f1230x;

    /* renamed from: y */
    private final ECPoint f1231y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f1230x = eCPoint;
        this.f1231y = eCPoint2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }

    public ECPoint getX() {
        return this.f1230x;
    }

    public ECPoint getY() {
        return this.f1231y;
    }

    public int hashCode() {
        return this.f1230x.hashCode() + (this.f1231y.hashCode() * 37);
    }
}
