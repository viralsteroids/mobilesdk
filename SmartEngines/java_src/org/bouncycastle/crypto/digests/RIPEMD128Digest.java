package org.bouncycastle.crypto.digests;

import kotlin.UByte;
import org.bouncycastle.util.Memoable;

/* loaded from: classes3.dex */
public class RIPEMD128Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 16;

    /* renamed from: H0 */
    private int f1147H0;

    /* renamed from: H1 */
    private int f1148H1;

    /* renamed from: H2 */
    private int f1149H2;

    /* renamed from: H3 */
    private int f1150H3;

    /* renamed from: X */
    private int[] f1151X;
    private int xOff;

    public RIPEMD128Digest() {
        this.f1151X = new int[16];
        reset();
    }

    public RIPEMD128Digest(RIPEMD128Digest rIPEMD128Digest) {
        super(rIPEMD128Digest);
        this.f1151X = new int[16];
        copyIn(rIPEMD128Digest);
    }

    /* renamed from: F1 */
    private int m579F1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m583RL(i + m584f1(i2, i3, i4) + i5, i6);
    }

    /* renamed from: F2 */
    private int m580F2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m583RL(i + m585f2(i2, i3, i4) + i5 + 1518500249, i6);
    }

    /* renamed from: F3 */
    private int m581F3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m583RL(i + m586f3(i2, i3, i4) + i5 + 1859775393, i6);
    }

    /* renamed from: F4 */
    private int m582F4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m583RL(((i + m587f4(i2, i3, i4)) + i5) - 1894007588, i6);
    }

    private int FF1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m583RL(i + m584f1(i2, i3, i4) + i5, i6);
    }

    private int FF2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m583RL(i + m585f2(i2, i3, i4) + i5 + 1836072691, i6);
    }

    private int FF3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m583RL(i + m586f3(i2, i3, i4) + i5 + 1548603684, i6);
    }

    private int FF4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m583RL(i + m587f4(i2, i3, i4) + i5 + 1352829926, i6);
    }

    /* renamed from: RL */
    private int m583RL(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void copyIn(RIPEMD128Digest rIPEMD128Digest) {
        super.copyIn((GeneralDigest) rIPEMD128Digest);
        this.f1147H0 = rIPEMD128Digest.f1147H0;
        this.f1148H1 = rIPEMD128Digest.f1148H1;
        this.f1149H2 = rIPEMD128Digest.f1149H2;
        this.f1150H3 = rIPEMD128Digest.f1150H3;
        int[] iArr = rIPEMD128Digest.f1151X;
        System.arraycopy(iArr, 0, this.f1151X, 0, iArr.length);
        this.xOff = rIPEMD128Digest.xOff;
    }

    /* renamed from: f1 */
    private int m584f1(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* renamed from: f2 */
    private int m585f2(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: f3 */
    private int m586f3(int i, int i2, int i3) {
        return (i | (~i2)) ^ i3;
    }

    /* renamed from: f4 */
    private int m587f4(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    private void unpackWord(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new RIPEMD128Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        unpackWord(this.f1147H0, bArr, i);
        unpackWord(this.f1148H1, bArr, i + 4);
        unpackWord(this.f1149H2, bArr, i + 8);
        unpackWord(this.f1150H3, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "RIPEMD128";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        int i = this.f1147H0;
        int i2 = this.f1148H1;
        int i3 = this.f1149H2;
        int i4 = this.f1150H3;
        int iM579F1 = m579F1(i, i2, i3, i4, this.f1151X[0], 11);
        int iM579F12 = m579F1(i4, iM579F1, i2, i3, this.f1151X[1], 14);
        int iM579F13 = m579F1(i3, iM579F12, iM579F1, i2, this.f1151X[2], 15);
        int iM579F14 = m579F1(i2, iM579F13, iM579F12, iM579F1, this.f1151X[3], 12);
        int iM579F15 = m579F1(iM579F1, iM579F14, iM579F13, iM579F12, this.f1151X[4], 5);
        int iM579F16 = m579F1(iM579F12, iM579F15, iM579F14, iM579F13, this.f1151X[5], 8);
        int iM579F17 = m579F1(iM579F13, iM579F16, iM579F15, iM579F14, this.f1151X[6], 7);
        int iM579F18 = m579F1(iM579F14, iM579F17, iM579F16, iM579F15, this.f1151X[7], 9);
        int iM579F19 = m579F1(iM579F15, iM579F18, iM579F17, iM579F16, this.f1151X[8], 11);
        int iM579F110 = m579F1(iM579F16, iM579F19, iM579F18, iM579F17, this.f1151X[9], 13);
        int iM579F111 = m579F1(iM579F17, iM579F110, iM579F19, iM579F18, this.f1151X[10], 14);
        int iM579F112 = m579F1(iM579F18, iM579F111, iM579F110, iM579F19, this.f1151X[11], 15);
        int iM579F113 = m579F1(iM579F19, iM579F112, iM579F111, iM579F110, this.f1151X[12], 6);
        int iM579F114 = m579F1(iM579F110, iM579F113, iM579F112, iM579F111, this.f1151X[13], 7);
        int iM579F115 = m579F1(iM579F111, iM579F114, iM579F113, iM579F112, this.f1151X[14], 9);
        int iM579F116 = m579F1(iM579F112, iM579F115, iM579F114, iM579F113, this.f1151X[15], 8);
        int iM580F2 = m580F2(iM579F113, iM579F116, iM579F115, iM579F114, this.f1151X[7], 7);
        int iM580F22 = m580F2(iM579F114, iM580F2, iM579F116, iM579F115, this.f1151X[4], 6);
        int iM580F23 = m580F2(iM579F115, iM580F22, iM580F2, iM579F116, this.f1151X[13], 8);
        int iM580F24 = m580F2(iM579F116, iM580F23, iM580F22, iM580F2, this.f1151X[1], 13);
        int iM580F25 = m580F2(iM580F2, iM580F24, iM580F23, iM580F22, this.f1151X[10], 11);
        int iM580F26 = m580F2(iM580F22, iM580F25, iM580F24, iM580F23, this.f1151X[6], 9);
        int iM580F27 = m580F2(iM580F23, iM580F26, iM580F25, iM580F24, this.f1151X[15], 7);
        int iM580F28 = m580F2(iM580F24, iM580F27, iM580F26, iM580F25, this.f1151X[3], 15);
        int iM580F29 = m580F2(iM580F25, iM580F28, iM580F27, iM580F26, this.f1151X[12], 7);
        int iM580F210 = m580F2(iM580F26, iM580F29, iM580F28, iM580F27, this.f1151X[0], 12);
        int iM580F211 = m580F2(iM580F27, iM580F210, iM580F29, iM580F28, this.f1151X[9], 15);
        int iM580F212 = m580F2(iM580F28, iM580F211, iM580F210, iM580F29, this.f1151X[5], 9);
        int iM580F213 = m580F2(iM580F29, iM580F212, iM580F211, iM580F210, this.f1151X[2], 11);
        int iM580F214 = m580F2(iM580F210, iM580F213, iM580F212, iM580F211, this.f1151X[14], 7);
        int iM580F215 = m580F2(iM580F211, iM580F214, iM580F213, iM580F212, this.f1151X[11], 13);
        int iM580F216 = m580F2(iM580F212, iM580F215, iM580F214, iM580F213, this.f1151X[8], 12);
        int iM581F3 = m581F3(iM580F213, iM580F216, iM580F215, iM580F214, this.f1151X[3], 11);
        int iM581F32 = m581F3(iM580F214, iM581F3, iM580F216, iM580F215, this.f1151X[10], 13);
        int iM581F33 = m581F3(iM580F215, iM581F32, iM581F3, iM580F216, this.f1151X[14], 6);
        int iM581F34 = m581F3(iM580F216, iM581F33, iM581F32, iM581F3, this.f1151X[4], 7);
        int iM581F35 = m581F3(iM581F3, iM581F34, iM581F33, iM581F32, this.f1151X[9], 14);
        int iM581F36 = m581F3(iM581F32, iM581F35, iM581F34, iM581F33, this.f1151X[15], 9);
        int iM581F37 = m581F3(iM581F33, iM581F36, iM581F35, iM581F34, this.f1151X[8], 13);
        int iM581F38 = m581F3(iM581F34, iM581F37, iM581F36, iM581F35, this.f1151X[1], 15);
        int iM581F39 = m581F3(iM581F35, iM581F38, iM581F37, iM581F36, this.f1151X[2], 14);
        int iM581F310 = m581F3(iM581F36, iM581F39, iM581F38, iM581F37, this.f1151X[7], 8);
        int iM581F311 = m581F3(iM581F37, iM581F310, iM581F39, iM581F38, this.f1151X[0], 13);
        int iM581F312 = m581F3(iM581F38, iM581F311, iM581F310, iM581F39, this.f1151X[6], 6);
        int iM581F313 = m581F3(iM581F39, iM581F312, iM581F311, iM581F310, this.f1151X[13], 5);
        int iM581F314 = m581F3(iM581F310, iM581F313, iM581F312, iM581F311, this.f1151X[11], 12);
        int iM581F315 = m581F3(iM581F311, iM581F314, iM581F313, iM581F312, this.f1151X[5], 7);
        int iM581F316 = m581F3(iM581F312, iM581F315, iM581F314, iM581F313, this.f1151X[12], 5);
        int iM582F4 = m582F4(iM581F313, iM581F316, iM581F315, iM581F314, this.f1151X[1], 11);
        int iM582F42 = m582F4(iM581F314, iM582F4, iM581F316, iM581F315, this.f1151X[9], 12);
        int iM582F43 = m582F4(iM581F315, iM582F42, iM582F4, iM581F316, this.f1151X[11], 14);
        int iM582F44 = m582F4(iM581F316, iM582F43, iM582F42, iM582F4, this.f1151X[10], 15);
        int iM582F45 = m582F4(iM582F4, iM582F44, iM582F43, iM582F42, this.f1151X[0], 14);
        int iM582F46 = m582F4(iM582F42, iM582F45, iM582F44, iM582F43, this.f1151X[8], 15);
        int iM582F47 = m582F4(iM582F43, iM582F46, iM582F45, iM582F44, this.f1151X[12], 9);
        int iM582F48 = m582F4(iM582F44, iM582F47, iM582F46, iM582F45, this.f1151X[4], 8);
        int iM582F49 = m582F4(iM582F45, iM582F48, iM582F47, iM582F46, this.f1151X[13], 9);
        int iM582F410 = m582F4(iM582F46, iM582F49, iM582F48, iM582F47, this.f1151X[3], 14);
        int iM582F411 = m582F4(iM582F47, iM582F410, iM582F49, iM582F48, this.f1151X[7], 5);
        int iM582F412 = m582F4(iM582F48, iM582F411, iM582F410, iM582F49, this.f1151X[15], 6);
        int iM582F413 = m582F4(iM582F49, iM582F412, iM582F411, iM582F410, this.f1151X[14], 8);
        int iM582F414 = m582F4(iM582F410, iM582F413, iM582F412, iM582F411, this.f1151X[5], 6);
        int iM582F415 = m582F4(iM582F411, iM582F414, iM582F413, iM582F412, this.f1151X[6], 5);
        int iM582F416 = m582F4(iM582F412, iM582F415, iM582F414, iM582F413, this.f1151X[2], 12);
        int iFF4 = FF4(i, i2, i3, i4, this.f1151X[5], 8);
        int iFF42 = FF4(i4, iFF4, i2, i3, this.f1151X[14], 9);
        int iFF43 = FF4(i3, iFF42, iFF4, i2, this.f1151X[7], 9);
        int iFF44 = FF4(i2, iFF43, iFF42, iFF4, this.f1151X[0], 11);
        int iFF45 = FF4(iFF4, iFF44, iFF43, iFF42, this.f1151X[9], 13);
        int iFF46 = FF4(iFF42, iFF45, iFF44, iFF43, this.f1151X[2], 15);
        int iFF47 = FF4(iFF43, iFF46, iFF45, iFF44, this.f1151X[11], 15);
        int iFF48 = FF4(iFF44, iFF47, iFF46, iFF45, this.f1151X[4], 5);
        int iFF49 = FF4(iFF45, iFF48, iFF47, iFF46, this.f1151X[13], 7);
        int iFF410 = FF4(iFF46, iFF49, iFF48, iFF47, this.f1151X[6], 7);
        int iFF411 = FF4(iFF47, iFF410, iFF49, iFF48, this.f1151X[15], 8);
        int iFF412 = FF4(iFF48, iFF411, iFF410, iFF49, this.f1151X[8], 11);
        int iFF413 = FF4(iFF49, iFF412, iFF411, iFF410, this.f1151X[1], 14);
        int iFF414 = FF4(iFF410, iFF413, iFF412, iFF411, this.f1151X[10], 14);
        int iFF415 = FF4(iFF411, iFF414, iFF413, iFF412, this.f1151X[3], 12);
        int iFF416 = FF4(iFF412, iFF415, iFF414, iFF413, this.f1151X[12], 6);
        int iFF3 = FF3(iFF413, iFF416, iFF415, iFF414, this.f1151X[6], 9);
        int iFF32 = FF3(iFF414, iFF3, iFF416, iFF415, this.f1151X[11], 13);
        int iFF33 = FF3(iFF415, iFF32, iFF3, iFF416, this.f1151X[3], 15);
        int iFF34 = FF3(iFF416, iFF33, iFF32, iFF3, this.f1151X[7], 7);
        int iFF35 = FF3(iFF3, iFF34, iFF33, iFF32, this.f1151X[0], 12);
        int iFF36 = FF3(iFF32, iFF35, iFF34, iFF33, this.f1151X[13], 8);
        int iFF37 = FF3(iFF33, iFF36, iFF35, iFF34, this.f1151X[5], 9);
        int iFF38 = FF3(iFF34, iFF37, iFF36, iFF35, this.f1151X[10], 11);
        int iFF39 = FF3(iFF35, iFF38, iFF37, iFF36, this.f1151X[14], 7);
        int iFF310 = FF3(iFF36, iFF39, iFF38, iFF37, this.f1151X[15], 7);
        int iFF311 = FF3(iFF37, iFF310, iFF39, iFF38, this.f1151X[8], 12);
        int iFF312 = FF3(iFF38, iFF311, iFF310, iFF39, this.f1151X[12], 7);
        int iFF313 = FF3(iFF39, iFF312, iFF311, iFF310, this.f1151X[4], 6);
        int iFF314 = FF3(iFF310, iFF313, iFF312, iFF311, this.f1151X[9], 15);
        int iFF315 = FF3(iFF311, iFF314, iFF313, iFF312, this.f1151X[1], 13);
        int iFF316 = FF3(iFF312, iFF315, iFF314, iFF313, this.f1151X[2], 11);
        int iFF2 = FF2(iFF313, iFF316, iFF315, iFF314, this.f1151X[15], 9);
        int iFF22 = FF2(iFF314, iFF2, iFF316, iFF315, this.f1151X[5], 7);
        int iFF23 = FF2(iFF315, iFF22, iFF2, iFF316, this.f1151X[1], 15);
        int iFF24 = FF2(iFF316, iFF23, iFF22, iFF2, this.f1151X[3], 11);
        int iFF25 = FF2(iFF2, iFF24, iFF23, iFF22, this.f1151X[7], 8);
        int iFF26 = FF2(iFF22, iFF25, iFF24, iFF23, this.f1151X[14], 6);
        int iFF27 = FF2(iFF23, iFF26, iFF25, iFF24, this.f1151X[6], 6);
        int iFF28 = FF2(iFF24, iFF27, iFF26, iFF25, this.f1151X[9], 14);
        int iFF29 = FF2(iFF25, iFF28, iFF27, iFF26, this.f1151X[11], 12);
        int iFF210 = FF2(iFF26, iFF29, iFF28, iFF27, this.f1151X[8], 13);
        int iFF211 = FF2(iFF27, iFF210, iFF29, iFF28, this.f1151X[12], 5);
        int iFF212 = FF2(iFF28, iFF211, iFF210, iFF29, this.f1151X[2], 14);
        int iFF213 = FF2(iFF29, iFF212, iFF211, iFF210, this.f1151X[10], 13);
        int iFF214 = FF2(iFF210, iFF213, iFF212, iFF211, this.f1151X[0], 13);
        int iFF215 = FF2(iFF211, iFF214, iFF213, iFF212, this.f1151X[4], 7);
        int iFF216 = FF2(iFF212, iFF215, iFF214, iFF213, this.f1151X[13], 5);
        int iFF1 = FF1(iFF213, iFF216, iFF215, iFF214, this.f1151X[8], 15);
        int iFF12 = FF1(iFF214, iFF1, iFF216, iFF215, this.f1151X[6], 5);
        int iFF13 = FF1(iFF215, iFF12, iFF1, iFF216, this.f1151X[4], 8);
        int iFF14 = FF1(iFF216, iFF13, iFF12, iFF1, this.f1151X[1], 11);
        int iFF15 = FF1(iFF1, iFF14, iFF13, iFF12, this.f1151X[3], 14);
        int iFF16 = FF1(iFF12, iFF15, iFF14, iFF13, this.f1151X[11], 14);
        int iFF17 = FF1(iFF13, iFF16, iFF15, iFF14, this.f1151X[15], 6);
        int iFF18 = FF1(iFF14, iFF17, iFF16, iFF15, this.f1151X[0], 14);
        int iFF19 = FF1(iFF15, iFF18, iFF17, iFF16, this.f1151X[5], 6);
        int iFF110 = FF1(iFF16, iFF19, iFF18, iFF17, this.f1151X[12], 9);
        int iFF111 = FF1(iFF17, iFF110, iFF19, iFF18, this.f1151X[2], 12);
        int iFF112 = FF1(iFF18, iFF111, iFF110, iFF19, this.f1151X[13], 9);
        int iFF113 = FF1(iFF19, iFF112, iFF111, iFF110, this.f1151X[9], 12);
        int iFF114 = FF1(iFF110, iFF113, iFF112, iFF111, this.f1151X[7], 5);
        int iFF115 = FF1(iFF111, iFF114, iFF113, iFF112, this.f1151X[10], 15);
        int iFF116 = FF1(iFF112, iFF115, iFF114, iFF113, this.f1151X[14], 8);
        int i5 = iFF114 + iM582F415 + this.f1148H1;
        this.f1148H1 = this.f1149H2 + iM582F414 + iFF113;
        this.f1149H2 = this.f1150H3 + iM582F413 + iFF116;
        this.f1150H3 = this.f1147H0 + iM582F416 + iFF115;
        this.f1147H0 = i5;
        this.xOff = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.f1151X;
            if (i6 == iArr.length) {
                return;
            }
            iArr[i6] = 0;
            i6++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f1151X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        int[] iArr = this.f1151X;
        int i2 = this.xOff;
        int i3 = i2 + 1;
        this.xOff = i3;
        iArr[i2] = ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
        if (i3 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f1147H0 = 1732584193;
        this.f1148H1 = -271733879;
        this.f1149H2 = -1732584194;
        this.f1150H3 = 271733878;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f1151X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((RIPEMD128Digest) memoable);
    }
}
