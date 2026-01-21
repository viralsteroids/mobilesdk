package org.bouncycastle.util;

/* loaded from: classes2.dex */
public class StoreException extends RuntimeException {

    /* renamed from: _e */
    private Throwable f1878_e;

    public StoreException(String str, Throwable th) {
        super(str);
        this.f1878_e = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f1878_e;
    }
}
