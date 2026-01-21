package org.bouncycastle.crypto.macs;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class Poly1305 implements Mac {
    private static final int BLOCK_SIZE = 16;
    private final BlockCipher cipher;
    private final byte[] currentBlock;
    private int currentBlockOffset;

    /* renamed from: h0 */
    private int f1383h0;

    /* renamed from: h1 */
    private int f1384h1;

    /* renamed from: h2 */
    private int f1385h2;

    /* renamed from: h3 */
    private int f1386h3;

    /* renamed from: h4 */
    private int f1387h4;

    /* renamed from: k0 */
    private int f1388k0;

    /* renamed from: k1 */
    private int f1389k1;

    /* renamed from: k2 */
    private int f1390k2;

    /* renamed from: k3 */
    private int f1391k3;

    /* renamed from: r0 */
    private int f1392r0;

    /* renamed from: r1 */
    private int f1393r1;

    /* renamed from: r2 */
    private int f1394r2;

    /* renamed from: r3 */
    private int f1395r3;

    /* renamed from: r4 */
    private int f1396r4;

    /* renamed from: s1 */
    private int f1397s1;

    /* renamed from: s2 */
    private int f1398s2;

    /* renamed from: s3 */
    private int f1399s3;

    /* renamed from: s4 */
    private int f1400s4;
    private final byte[] singleByte;

    public Poly1305() {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        this.cipher = null;
    }

    public Poly1305(BlockCipher blockCipher) {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.cipher = blockCipher;
    }

    private static final long mul32x32_64(int i, int i2) {
        return (i & BodyPartID.bodyIdMax) * i2;
    }

    private void processBlock() {
        int i = this.currentBlockOffset;
        if (i < 16) {
            this.currentBlock[i] = 1;
            for (int i2 = i + 1; i2 < 16; i2++) {
                this.currentBlock[i2] = 0;
            }
        }
        long jLittleEndianToInt = Pack.littleEndianToInt(this.currentBlock, 0);
        long j = jLittleEndianToInt & BodyPartID.bodyIdMax;
        long jLittleEndianToInt2 = Pack.littleEndianToInt(this.currentBlock, 4) & BodyPartID.bodyIdMax;
        long jLittleEndianToInt3 = Pack.littleEndianToInt(this.currentBlock, 8) & BodyPartID.bodyIdMax;
        long jLittleEndianToInt4 = BodyPartID.bodyIdMax & Pack.littleEndianToInt(this.currentBlock, 12);
        int i3 = (int) (this.f1383h0 + (jLittleEndianToInt & 67108863));
        this.f1383h0 = i3;
        this.f1384h1 = (int) (this.f1384h1 + ((((jLittleEndianToInt2 << 32) | j) >>> 26) & 67108863));
        this.f1385h2 = (int) (this.f1385h2 + (((jLittleEndianToInt2 | (jLittleEndianToInt3 << 32)) >>> 20) & 67108863));
        this.f1386h3 = (int) (this.f1386h3 + ((((jLittleEndianToInt4 << 32) | jLittleEndianToInt3) >>> 14) & 67108863));
        int i4 = (int) (this.f1387h4 + (jLittleEndianToInt4 >>> 8));
        this.f1387h4 = i4;
        if (this.currentBlockOffset == 16) {
            this.f1387h4 = i4 + 16777216;
        }
        long jMul32x32_64 = mul32x32_64(i3, this.f1392r0) + mul32x32_64(this.f1384h1, this.f1400s4) + mul32x32_64(this.f1385h2, this.f1399s3) + mul32x32_64(this.f1386h3, this.f1398s2) + mul32x32_64(this.f1387h4, this.f1397s1);
        long jMul32x32_642 = mul32x32_64(this.f1383h0, this.f1393r1) + mul32x32_64(this.f1384h1, this.f1392r0) + mul32x32_64(this.f1385h2, this.f1400s4) + mul32x32_64(this.f1386h3, this.f1399s3) + mul32x32_64(this.f1387h4, this.f1398s2);
        long jMul32x32_643 = mul32x32_64(this.f1383h0, this.f1394r2) + mul32x32_64(this.f1384h1, this.f1393r1) + mul32x32_64(this.f1385h2, this.f1392r0) + mul32x32_64(this.f1386h3, this.f1400s4) + mul32x32_64(this.f1387h4, this.f1399s3);
        long jMul32x32_644 = mul32x32_64(this.f1383h0, this.f1395r3) + mul32x32_64(this.f1384h1, this.f1394r2) + mul32x32_64(this.f1385h2, this.f1393r1) + mul32x32_64(this.f1386h3, this.f1392r0) + mul32x32_64(this.f1387h4, this.f1400s4);
        long jMul32x32_645 = mul32x32_64(this.f1383h0, this.f1396r4) + mul32x32_64(this.f1384h1, this.f1395r3) + mul32x32_64(this.f1385h2, this.f1394r2) + mul32x32_64(this.f1386h3, this.f1393r1) + mul32x32_64(this.f1387h4, this.f1392r0);
        long j2 = jMul32x32_642 + (jMul32x32_64 >>> 26);
        long j3 = jMul32x32_643 + (j2 >>> 26);
        this.f1385h2 = ((int) j3) & 67108863;
        long j4 = jMul32x32_644 + (j3 >>> 26);
        this.f1386h3 = ((int) j4) & 67108863;
        long j5 = jMul32x32_645 + (j4 >>> 26);
        this.f1387h4 = ((int) j5) & 67108863;
        int i5 = (((int) jMul32x32_64) & 67108863) + (((int) (j5 >>> 26)) * 5);
        this.f1384h1 = (((int) j2) & 67108863) + (i5 >>> 26);
        this.f1383h0 = i5 & 67108863;
    }

    private void setKey(byte[] bArr, byte[] bArr2) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        int i = 16;
        if (this.cipher != null && (bArr2 == null || bArr2.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
        this.f1392r0 = 67108863 & iLittleEndianToInt;
        int i2 = ((iLittleEndianToInt >>> 26) | (iLittleEndianToInt2 << 6)) & 67108611;
        this.f1393r1 = i2;
        int i3 = ((iLittleEndianToInt2 >>> 20) | (iLittleEndianToInt3 << 12)) & 67092735;
        this.f1394r2 = i3;
        int i4 = ((iLittleEndianToInt3 >>> 14) | (iLittleEndianToInt4 << 18)) & 66076671;
        this.f1395r3 = i4;
        int i5 = (iLittleEndianToInt4 >>> 8) & 1048575;
        this.f1396r4 = i5;
        this.f1397s1 = i2 * 5;
        this.f1398s2 = i3 * 5;
        this.f1399s3 = i4 * 5;
        this.f1400s4 = i5 * 5;
        BlockCipher blockCipher = this.cipher;
        if (blockCipher != null) {
            byte[] bArr3 = new byte[16];
            blockCipher.init(true, new KeyParameter(bArr, 16, 16));
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            i = 0;
            bArr = bArr3;
        }
        this.f1388k0 = Pack.littleEndianToInt(bArr, i);
        this.f1389k1 = Pack.littleEndianToInt(bArr, i + 4);
        this.f1390k2 = Pack.littleEndianToInt(bArr, i + 8);
        this.f1391k3 = Pack.littleEndianToInt(bArr, i + 12);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        if (i + 16 > bArr.length) {
            throw new OutputLengthException("Output buffer is too short.");
        }
        if (this.currentBlockOffset > 0) {
            processBlock();
        }
        int i2 = this.f1384h1;
        int i3 = this.f1383h0;
        int i4 = i2 + (i3 >>> 26);
        int i5 = this.f1385h2 + (i4 >>> 26);
        int i6 = this.f1386h3 + (i5 >>> 26);
        int i7 = i5 & 67108863;
        int i8 = this.f1387h4 + (i6 >>> 26);
        int i9 = i6 & 67108863;
        int i10 = (i3 & 67108863) + ((i8 >>> 26) * 5);
        int i11 = i8 & 67108863;
        int i12 = (i4 & 67108863) + (i10 >>> 26);
        int i13 = i10 & 67108863;
        int i14 = i13 + 5;
        int i15 = (i14 >>> 26) + i12;
        int i16 = (i15 >>> 26) + i7;
        int i17 = (i16 >>> 26) + i9;
        int i18 = 67108863 & i17;
        int i19 = ((i17 >>> 26) + i11) - AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        int i20 = (i19 >>> 31) - 1;
        int i21 = ~i20;
        this.f1383h0 = (i13 & i21) | (i14 & 67108863 & i20);
        this.f1384h1 = (i12 & i21) | (i15 & 67108863 & i20);
        this.f1385h2 = (i7 & i21) | (i16 & 67108863 & i20);
        this.f1386h3 = (i18 & i20) | (i9 & i21);
        this.f1387h4 = (i11 & i21) | (i19 & i20);
        long j = ((r1 | (r0 << 26)) & BodyPartID.bodyIdMax) + (this.f1388k0 & BodyPartID.bodyIdMax);
        long j2 = (((r0 >>> 6) | (r3 << 20)) & BodyPartID.bodyIdMax) + (this.f1389k1 & BodyPartID.bodyIdMax);
        long j3 = (((r3 >>> 12) | (r2 << 14)) & BodyPartID.bodyIdMax) + (this.f1390k2 & BodyPartID.bodyIdMax);
        long j4 = (((r2 >>> 18) | (r4 << 8)) & BodyPartID.bodyIdMax) + (BodyPartID.bodyIdMax & this.f1391k3);
        Pack.intToLittleEndian((int) j, bArr, i);
        long j5 = j2 + (j >>> 32);
        Pack.intToLittleEndian((int) j5, bArr, i + 4);
        long j6 = j3 + (j5 >>> 32);
        Pack.intToLittleEndian((int) j6, bArr, i + 8);
        Pack.intToLittleEndian((int) (j4 + (j6 >>> 32)), bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.cipher == null ? "Poly1305" : "Poly1305-" + this.cipher.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        byte[] iv;
        if (this.cipher == null) {
            iv = null;
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        }
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        setKey(((KeyParameter) cipherParameters).getKey(), iv);
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.currentBlockOffset = 0;
        this.f1387h4 = 0;
        this.f1386h3 = 0;
        this.f1385h2 = 0;
        this.f1384h1 = 0;
        this.f1383h0 = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) throws IllegalStateException, DataLengthException {
        byte[] bArr = this.singleByte;
        bArr[0] = b;
        update(bArr, 0, 1);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws IllegalStateException, DataLengthException {
        int i3 = 0;
        while (i2 > i3) {
            if (this.currentBlockOffset == 16) {
                processBlock();
                this.currentBlockOffset = 0;
            }
            int iMin = Math.min(i2 - i3, 16 - this.currentBlockOffset);
            System.arraycopy(bArr, i3 + i, this.currentBlock, this.currentBlockOffset, iMin);
            i3 += iMin;
            this.currentBlockOffset += iMin;
        }
    }
}
