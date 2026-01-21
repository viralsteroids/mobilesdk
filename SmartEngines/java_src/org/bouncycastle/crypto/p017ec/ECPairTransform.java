package org.bouncycastle.crypto.p017ec;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes3.dex */
public interface ECPairTransform {
    void init(CipherParameters cipherParameters);

    ECPair transform(ECPair eCPair);
}
