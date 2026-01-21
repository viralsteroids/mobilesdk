package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes3.dex */
public class SRP6Server {

    /* renamed from: A */
    protected BigInteger f1076A;

    /* renamed from: B */
    protected BigInteger f1077B;
    protected BigInteger Key;

    /* renamed from: M1 */
    protected BigInteger f1078M1;

    /* renamed from: M2 */
    protected BigInteger f1079M2;

    /* renamed from: N */
    protected BigInteger f1080N;

    /* renamed from: S */
    protected BigInteger f1081S;

    /* renamed from: b */
    protected BigInteger f1082b;
    protected Digest digest;

    /* renamed from: g */
    protected BigInteger f1083g;
    protected SecureRandom random;

    /* renamed from: u */
    protected BigInteger f1084u;

    /* renamed from: v */
    protected BigInteger f1085v;

    private BigInteger calculateS() {
        return this.f1085v.modPow(this.f1084u, this.f1080N).multiply(this.f1076A).mod(this.f1080N).modPow(this.f1082b, this.f1080N);
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = SRP6Util.validatePublicValue(this.f1080N, bigInteger);
        this.f1076A = bigIntegerValidatePublicValue;
        this.f1084u = SRP6Util.calculateU(this.digest, this.f1080N, bigIntegerValidatePublicValue, this.f1077B);
        BigInteger bigIntegerCalculateS = calculateS();
        this.f1081S = bigIntegerCalculateS;
        return bigIntegerCalculateS;
    }

    public BigInteger calculateServerEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f1076A;
        if (bigInteger3 == null || (bigInteger = this.f1078M1) == null || (bigInteger2 = this.f1081S) == null) {
            throw new CryptoException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
        }
        BigInteger bigIntegerCalculateM2 = SRP6Util.calculateM2(this.digest, this.f1080N, bigInteger3, bigInteger, bigInteger2);
        this.f1079M2 = bigIntegerCalculateM2;
        return bigIntegerCalculateM2;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f1081S;
        if (bigInteger == null || this.f1078M1 == null || this.f1079M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = SRP6Util.calculateKey(this.digest, this.f1080N, bigInteger);
        this.Key = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateServerCredentials() {
        BigInteger bigIntegerCalculateK = SRP6Util.calculateK(this.digest, this.f1080N, this.f1083g);
        this.f1082b = selectPrivateValue();
        BigInteger bigIntegerMod = bigIntegerCalculateK.multiply(this.f1085v).mod(this.f1080N).add(this.f1083g.modPow(this.f1082b, this.f1080N)).mod(this.f1080N);
        this.f1077B = bigIntegerMod;
        return bigIntegerMod;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest, SecureRandom secureRandom) {
        this.f1080N = bigInteger;
        this.f1083g = bigInteger2;
        this.f1085v = bigInteger3;
        this.random = secureRandom;
        this.digest = digest;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, BigInteger bigInteger, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), bigInteger, digest, secureRandom);
    }

    protected BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f1080N, this.f1083g, this.random);
    }

    public boolean verifyClientEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f1076A;
        if (bigInteger4 == null || (bigInteger2 = this.f1077B) == null || (bigInteger3 = this.f1081S) == null) {
            throw new CryptoException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
        }
        if (!SRP6Util.calculateM1(this.digest, this.f1080N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f1078M1 = bigInteger;
        return true;
    }
}
