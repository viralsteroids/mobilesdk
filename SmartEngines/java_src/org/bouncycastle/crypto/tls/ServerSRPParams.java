package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class ServerSRPParams {

    /* renamed from: B */
    protected BigInteger f1554B;

    /* renamed from: N */
    protected BigInteger f1555N;

    /* renamed from: g */
    protected BigInteger f1556g;

    /* renamed from: s */
    protected byte[] f1557s;

    public ServerSRPParams(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, BigInteger bigInteger3) {
        this.f1555N = bigInteger;
        this.f1556g = bigInteger2;
        this.f1557s = Arrays.clone(bArr);
        this.f1554B = bigInteger3;
    }

    public static ServerSRPParams parse(InputStream inputStream) throws IOException {
        return new ServerSRPParams(TlsSRPUtils.readSRPParameter(inputStream), TlsSRPUtils.readSRPParameter(inputStream), TlsUtils.readOpaque8(inputStream), TlsSRPUtils.readSRPParameter(inputStream));
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsSRPUtils.writeSRPParameter(this.f1555N, outputStream);
        TlsSRPUtils.writeSRPParameter(this.f1556g, outputStream);
        TlsUtils.writeOpaque8(this.f1557s, outputStream);
        TlsSRPUtils.writeSRPParameter(this.f1554B, outputStream);
    }

    public BigInteger getB() {
        return this.f1554B;
    }

    public BigInteger getG() {
        return this.f1556g;
    }

    public BigInteger getN() {
        return this.f1555N;
    }

    public byte[] getS() {
        return this.f1557s;
    }
}
