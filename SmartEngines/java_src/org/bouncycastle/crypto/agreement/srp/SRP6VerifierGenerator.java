package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes3.dex */
public class SRP6VerifierGenerator {

    /* renamed from: N */
    protected BigInteger f1086N;
    protected Digest digest;

    /* renamed from: g */
    protected BigInteger f1087g;

    public BigInteger generateVerifier(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f1087g.modPow(SRP6Util.calculateX(this.digest, this.f1086N, bArr, bArr2, bArr3), this.f1086N);
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest) {
        this.f1086N = bigInteger;
        this.f1087g = bigInteger2;
        this.digest = digest;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest) {
        this.f1086N = sRP6GroupParameters.getN();
        this.f1087g = sRP6GroupParameters.getG();
        this.digest = digest;
    }
}
