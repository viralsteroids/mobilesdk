package org.bouncycastle.crypto.tls;

import java.io.IOException;

/* loaded from: classes3.dex */
class DTLSEpoch {
    private final TlsCipher cipher;
    private final int epoch;
    private final DTLSReplayWindow replayWindow = new DTLSReplayWindow();
    private long sequenceNumber = 0;

    DTLSEpoch(int i, TlsCipher tlsCipher) {
        if (i < 0) {
            throw new IllegalArgumentException("'epoch' must be >= 0");
        }
        if (tlsCipher == null) {
            throw new IllegalArgumentException("'cipher' cannot be null");
        }
        this.epoch = i;
        this.cipher = tlsCipher;
    }

    synchronized long allocateSequenceNumber() throws IOException {
        long j;
        j = this.sequenceNumber;
        if (j >= 281474976710656L) {
            throw new TlsFatalAlert((short) 80);
        }
        this.sequenceNumber = 1 + j;
        return j;
    }

    TlsCipher getCipher() {
        return this.cipher;
    }

    int getEpoch() {
        return this.epoch;
    }

    DTLSReplayWindow getReplayWindow() {
        return this.replayWindow;
    }

    synchronized long getSequenceNumber() {
        return this.sequenceNumber;
    }
}
