package org.bouncycastle.crypto.params;

/* loaded from: classes3.dex */
public class GOST3410ValidationParameters {

    /* renamed from: c */
    private int f1510c;

    /* renamed from: cL */
    private long f1511cL;

    /* renamed from: x0 */
    private int f1512x0;
    private long x0L;

    public GOST3410ValidationParameters(int i, int i2) {
        this.f1512x0 = i;
        this.f1510c = i2;
    }

    public GOST3410ValidationParameters(long j, long j2) {
        this.x0L = j;
        this.f1511cL = j2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ValidationParameters)) {
            return false;
        }
        GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.f1510c == this.f1510c && gOST3410ValidationParameters.f1512x0 == this.f1512x0 && gOST3410ValidationParameters.f1511cL == this.f1511cL && gOST3410ValidationParameters.x0L == this.x0L;
    }

    public int getC() {
        return this.f1510c;
    }

    public long getCL() {
        return this.f1511cL;
    }

    public int getX0() {
        return this.f1512x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i = this.f1512x0 ^ this.f1510c;
        long j = this.x0L;
        int i2 = (i ^ ((int) j)) ^ ((int) (j >> 32));
        long j2 = this.f1511cL;
        return (i2 ^ ((int) j2)) ^ ((int) (j2 >> 32));
    }
}
