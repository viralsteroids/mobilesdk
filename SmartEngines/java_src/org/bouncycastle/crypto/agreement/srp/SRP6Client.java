package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes3.dex */
public class SRP6Client {

    /* renamed from: A */
    protected BigInteger f1066A;

    /* renamed from: B */
    protected BigInteger f1067B;
    protected BigInteger Key;

    /* renamed from: M1 */
    protected BigInteger f1068M1;

    /* renamed from: M2 */
    protected BigInteger f1069M2;

    /* renamed from: N */
    protected BigInteger f1070N;

    /* renamed from: S */
    protected BigInteger f1071S;

    /* renamed from: a */
    protected BigInteger f1072a;
    protected Digest digest;

    /* renamed from: g */
    protected BigInteger f1073g;
    protected SecureRandom random;

    /* renamed from: u */
    protected BigInteger f1074u;

    /* renamed from: x */
    protected BigInteger f1075x;

    private BigInteger calculateS() {
        BigInteger bigIntegerCalculateK = SRP6Util.calculateK(this.digest, this.f1070N, this.f1073g);
        return this.f1067B.subtract(this.f1073g.modPow(this.f1075x, this.f1070N).multiply(bigIntegerCalculateK).mod(this.f1070N)).mod(this.f1070N).modPow(this.f1074u.multiply(this.f1075x).add(this.f1072a), this.f1070N);
    }

    public BigInteger calculateClientEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f1066A;
        if (bigInteger3 == null || (bigInteger = this.f1067B) == null || (bigInteger2 = this.f1071S) == null) {
            throw new CryptoException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        BigInteger bigIntegerCalculateM1 = SRP6Util.calculateM1(this.digest, this.f1070N, bigInteger3, bigInteger, bigInteger2);
        this.f1068M1 = bigIntegerCalculateM1;
        return bigIntegerCalculateM1;
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = SRP6Util.validatePublicValue(this.f1070N, bigInteger);
        this.f1067B = bigIntegerValidatePublicValue;
        this.f1074u = SRP6Util.calculateU(this.digest, this.f1070N, this.f1066A, bigIntegerValidatePublicValue);
        BigInteger bigIntegerCalculateS = calculateS();
        this.f1071S = bigIntegerCalculateS;
        return bigIntegerCalculateS;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f1071S;
        if (bigInteger == null || this.f1068M1 == null || this.f1069M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = SRP6Util.calculateKey(this.digest, this.f1070N, bigInteger);
        this.Key = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f1075x = SRP6Util.calculateX(this.digest, this.f1070N, bArr, bArr2, bArr3);
        BigInteger bigIntegerSelectPrivateValue = selectPrivateValue();
        this.f1072a = bigIntegerSelectPrivateValue;
        BigInteger bigIntegerModPow = this.f1073g.modPow(bigIntegerSelectPrivateValue, this.f1070N);
        this.f1066A = bigIntegerModPow;
        return bigIntegerModPow;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest, SecureRandom secureRandom) {
        this.f1070N = bigInteger;
        this.f1073g = bigInteger2;
        this.digest = digest;
        this.random = secureRandom;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), digest, secureRandom);
    }

    protected BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f1070N, this.f1073g, this.random);
    }

    public boolean verifyServerEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f1066A;
        if (bigInteger4 == null || (bigInteger2 = this.f1068M1) == null || (bigInteger3 = this.f1071S) == null) {
            throw new CryptoException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        }
        if (!SRP6Util.calculateM2(this.digest, this.f1070N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f1069M2 = bigInteger;
        return true;
    }
}
