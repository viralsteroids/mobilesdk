package org.bouncycastle.crypto.p017ec;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.math.p023ec.ECPoint;

/* loaded from: classes3.dex */
public interface ECEncryptor {
    ECPair encrypt(ECPoint eCPoint);

    void init(CipherParameters cipherParameters);
}
