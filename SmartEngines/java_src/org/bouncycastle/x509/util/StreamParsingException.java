package org.bouncycastle.x509.util;

/* loaded from: classes2.dex */
public class StreamParsingException extends Exception {

    /* renamed from: _e */
    Throwable f1881_e;

    public StreamParsingException(String str, Throwable th) {
        super(str);
        this.f1881_e = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f1881_e;
    }
}
