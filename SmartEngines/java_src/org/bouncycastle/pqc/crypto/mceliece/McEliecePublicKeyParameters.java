package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

/* loaded from: classes2.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* renamed from: g */
    private GF2Matrix f1832g;

    /* renamed from: n */
    private int f1833n;

    /* renamed from: t */
    private int f1834t;

    public McEliecePublicKeyParameters(int i, int i2, GF2Matrix gF2Matrix) {
        super(false, null);
        this.f1833n = i;
        this.f1834t = i2;
        this.f1832g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f1832g;
    }

    public int getK() {
        return this.f1832g.getNumRows();
    }

    public int getN() {
        return this.f1833n;
    }

    public int getT() {
        return this.f1834t;
    }
}
