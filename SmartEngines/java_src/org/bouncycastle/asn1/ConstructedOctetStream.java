package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
class ConstructedOctetStream extends InputStream {
    private InputStream _currentStream;
    private boolean _first = true;
    private final ASN1StreamParser _parser;

    ConstructedOctetStream(ASN1StreamParser aSN1StreamParser) {
        this._parser = aSN1StreamParser;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        ASN1Encodable object;
        if (this._currentStream == null) {
            if (!this._first || (object = this._parser.readObject()) == null) {
                return -1;
            }
            if (!(object instanceof ASN1OctetStringParser)) {
                throw new IOException("unknown object encountered: " + object.getClass());
            }
            ASN1OctetStringParser aSN1OctetStringParser = (ASN1OctetStringParser) object;
            this._first = false;
            this._currentStream = aSN1OctetStringParser.getOctetStream();
        }
        while (true) {
            int i = this._currentStream.read();
            if (i >= 0) {
                return i;
            }
            ASN1Encodable object2 = this._parser.readObject();
            if (object2 == null) {
                this._currentStream = null;
                return -1;
            }
            if (!(object2 instanceof ASN1OctetStringParser)) {
                throw new IOException("unknown object encountered: " + object2.getClass());
            }
            this._currentStream = ((ASN1OctetStringParser) object2).getOctetStream();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        ASN1Encodable object;
        int i3 = 0;
        if (this._currentStream == null) {
            if (!this._first || (object = this._parser.readObject()) == null) {
                return -1;
            }
            if (!(object instanceof ASN1OctetStringParser)) {
                throw new IOException("unknown object encountered: " + object.getClass());
            }
            ASN1OctetStringParser aSN1OctetStringParser = (ASN1OctetStringParser) object;
            this._first = false;
            this._currentStream = aSN1OctetStringParser.getOctetStream();
        }
        while (true) {
            int i4 = this._currentStream.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                ASN1Encodable object2 = this._parser.readObject();
                if (object2 == null) {
                    this._currentStream = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                if (!(object2 instanceof ASN1OctetStringParser)) {
                    throw new IOException("unknown object encountered: " + object2.getClass());
                }
                this._currentStream = ((ASN1OctetStringParser) object2).getOctetStream();
            }
        }
    }
}
