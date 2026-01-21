package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes3.dex */
public class ParametersWithID implements CipherParameters {

    /* renamed from: id */
    private byte[] f1523id;
    private CipherParameters parameters;

    public ParametersWithID(CipherParameters cipherParameters, byte[] bArr) {
        this.parameters = cipherParameters;
        this.f1523id = bArr;
    }

    public byte[] getID() {
        return this.f1523id;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }
}
