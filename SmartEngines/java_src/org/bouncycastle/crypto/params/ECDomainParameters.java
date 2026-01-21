package org.bouncycastle.crypto.params;

import androidx.core.view.InputDeviceCompat;
import java.math.BigInteger;
import org.bouncycastle.math.p023ec.ECAlgorithms;
import org.bouncycastle.math.p023ec.ECConstants;
import org.bouncycastle.math.p023ec.ECCurve;
import org.bouncycastle.math.p023ec.ECPoint;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class ECDomainParameters implements ECConstants {

    /* renamed from: G */
    private final ECPoint f1495G;
    private final ECCurve curve;

    /* renamed from: h */
    private final BigInteger f1496h;
    private BigInteger hInv;

    /* renamed from: n */
    private final BigInteger f1497n;
    private final byte[] seed;

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, ONE, null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.hInv = null;
        if (eCCurve == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new NullPointerException("n");
        }
        this.curve = eCCurve;
        this.f1495G = validatePublicPoint(eCCurve, eCPoint);
        this.f1497n = bigInteger;
        this.f1496h = bigInteger2;
        this.seed = Arrays.clone(bArr);
    }

    static ECPoint validatePublicPoint(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCPoint == null) {
            throw new NullPointerException("Point cannot be null");
        }
        ECPoint eCPointNormalize = ECAlgorithms.importPoint(eCCurve, eCPoint).normalize();
        if (eCPointNormalize.isInfinity()) {
            throw new IllegalArgumentException("Point at infinity");
        }
        if (eCPointNormalize.isValid()) {
            return eCPointNormalize;
        }
        throw new IllegalArgumentException("Point not on curve");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECDomainParameters)) {
            return false;
        }
        ECDomainParameters eCDomainParameters = (ECDomainParameters) obj;
        return this.curve.equals(eCDomainParameters.curve) && this.f1495G.equals(eCDomainParameters.f1495G) && this.f1497n.equals(eCDomainParameters.f1497n);
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f1495G;
    }

    public BigInteger getH() {
        return this.f1496h;
    }

    public synchronized BigInteger getHInv() {
        if (this.hInv == null) {
            this.hInv = this.f1496h.modInverse(this.f1497n);
        }
        return this.hInv;
    }

    public BigInteger getN() {
        return this.f1497n;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public int hashCode() {
        return ((((this.curve.hashCode() ^ 1028) * InputDeviceCompat.SOURCE_KEYBOARD) ^ this.f1495G.hashCode()) * InputDeviceCompat.SOURCE_KEYBOARD) ^ this.f1497n.hashCode();
    }

    public BigInteger validatePrivateScalar(BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new NullPointerException("Scalar cannot be null");
        }
        if (bigInteger.compareTo(ECConstants.ONE) < 0 || bigInteger.compareTo(getN()) >= 0) {
            throw new IllegalArgumentException("Scalar is not in the interval [1, n - 1]");
        }
        return bigInteger;
    }

    public ECPoint validatePublicPoint(ECPoint eCPoint) {
        return validatePublicPoint(getCurve(), eCPoint);
    }
}
