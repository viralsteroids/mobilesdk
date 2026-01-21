package org.bouncycastle.asn1;

import java.io.InputStream;

/* loaded from: classes3.dex */
abstract class LimitedInputStream extends InputStream {
    protected final InputStream _in;
    private int _length;
    private int _limit;

    LimitedInputStream(InputStream inputStream, int i, int i2) {
        this._in = inputStream;
        this._limit = i;
        this._length = i2;
    }

    int getLimit() {
        return this._limit;
    }

    int getRemaining() {
        return this._length;
    }

    protected void setParentEofDetect(boolean z) {
        InputStream inputStream = this._in;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream) inputStream).setEofOn00(z);
        }
    }
}
