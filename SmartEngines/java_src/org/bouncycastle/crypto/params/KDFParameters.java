package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

/* loaded from: classes3.dex */
public class KDFParameters implements DerivationParameters {

    /* renamed from: iv */
    byte[] f1520iv;
    byte[] shared;

    public KDFParameters(byte[] bArr, byte[] bArr2) {
        this.shared = bArr;
        this.f1520iv = bArr2;
    }

    public byte[] getIV() {
        return this.f1520iv;
    }

    public byte[] getSharedSecret() {
        return this.shared;
    }
}
