package org.bouncycastle.math.p023ec;

/* loaded from: classes2.dex */
public abstract class AbstractECLookupTable implements ECLookupTable {
    @Override // org.bouncycastle.math.p023ec.ECLookupTable
    public ECPoint lookupVar(int i) {
        return lookup(i);
    }
}
