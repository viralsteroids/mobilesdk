package org.bouncycastle.crypto.digests;

import kotlin.UByte;
import org.bouncycastle.util.Memoable;

/* loaded from: classes3.dex */
public class RIPEMD256Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 32;

    /* renamed from: H0 */
    private int f1158H0;

    /* renamed from: H1 */
    private int f1159H1;

    /* renamed from: H2 */
    private int f1160H2;

    /* renamed from: H3 */
    private int f1161H3;

    /* renamed from: H4 */
    private int f1162H4;

    /* renamed from: H5 */
    private int f1163H5;

    /* renamed from: H6 */
    private int f1164H6;

    /* renamed from: H7 */
    private int f1165H7;

    /* renamed from: X */
    private int[] f1166X;
    private int xOff;

    public RIPEMD256Digest() {
        this.f1166X = new int[16];
        reset();
    }

    public RIPEMD256Digest(RIPEMD256Digest rIPEMD256Digest) {
        super(rIPEMD256Digest);
        this.f1166X = new int[16];
        copyIn(rIPEMD256Digest);
    }

    /* renamed from: F1 */
    private int m594F1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m598RL(i + m599f1(i2, i3, i4) + i5, i6);
    }

    /* renamed from: F2 */
    private int m595F2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m598RL(i + m600f2(i2, i3, i4) + i5 + 1518500249, i6);
    }

    /* renamed from: F3 */
    private int m596F3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m598RL(i + m601f3(i2, i3, i4) + i5 + 1859775393, i6);
    }

    /* renamed from: F4 */
    private int m597F4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m598RL(((i + m602f4(i2, i3, i4)) + i5) - 1894007588, i6);
    }

    private int FF1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m598RL(i + m599f1(i2, i3, i4) + i5, i6);
    }

    private int FF2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m598RL(i + m600f2(i2, i3, i4) + i5 + 1836072691, i6);
    }

    private int FF3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m598RL(i + m601f3(i2, i3, i4) + i5 + 1548603684, i6);
    }

    private int FF4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m598RL(i + m602f4(i2, i3, i4) + i5 + 1352829926, i6);
    }

    /* renamed from: RL */
    private int m598RL(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void copyIn(RIPEMD256Digest rIPEMD256Digest) {
        super.copyIn((GeneralDigest) rIPEMD256Digest);
        this.f1158H0 = rIPEMD256Digest.f1158H0;
        this.f1159H1 = rIPEMD256Digest.f1159H1;
        this.f1160H2 = rIPEMD256Digest.f1160H2;
        this.f1161H3 = rIPEMD256Digest.f1161H3;
        this.f1162H4 = rIPEMD256Digest.f1162H4;
        this.f1163H5 = rIPEMD256Digest.f1163H5;
        this.f1164H6 = rIPEMD256Digest.f1164H6;
        this.f1165H7 = rIPEMD256Digest.f1165H7;
        int[] iArr = rIPEMD256Digest.f1166X;
        System.arraycopy(iArr, 0, this.f1166X, 0, iArr.length);
        this.xOff = rIPEMD256Digest.xOff;
    }

    /* renamed from: f1 */
    private int m599f1(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* renamed from: f2 */
    private int m600f2(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: f3 */
    private int m601f3(int i, int i2, int i3) {
        return (i | (~i2)) ^ i3;
    }

    /* renamed from: f4 */
    private int m602f4(int i, int i2, int i3) {
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
        return new RIPEMD256Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        unpackWord(this.f1158H0, bArr, i);
        unpackWord(this.f1159H1, bArr, i + 4);
        unpackWord(this.f1160H2, bArr, i + 8);
        unpackWord(this.f1161H3, bArr, i + 12);
        unpackWord(this.f1162H4, bArr, i + 16);
        unpackWord(this.f1163H5, bArr, i + 20);
        unpackWord(this.f1164H6, bArr, i + 24);
        unpackWord(this.f1165H7, bArr, i + 28);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "RIPEMD256";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        int i = this.f1158H0;
        int i2 = this.f1159H1;
        int i3 = this.f1160H2;
        int i4 = this.f1161H3;
        int i5 = this.f1162H4;
        int i6 = this.f1163H5;
        int i7 = this.f1164H6;
        int i8 = this.f1165H7;
        int iM594F1 = m594F1(i, i2, i3, i4, this.f1166X[0], 11);
        int iM594F12 = m594F1(i4, iM594F1, i2, i3, this.f1166X[1], 14);
        int iM594F13 = m594F1(i3, iM594F12, iM594F1, i2, this.f1166X[2], 15);
        int iM594F14 = m594F1(i2, iM594F13, iM594F12, iM594F1, this.f1166X[3], 12);
        int iM594F15 = m594F1(iM594F1, iM594F14, iM594F13, iM594F12, this.f1166X[4], 5);
        int iM594F16 = m594F1(iM594F12, iM594F15, iM594F14, iM594F13, this.f1166X[5], 8);
        int iM594F17 = m594F1(iM594F13, iM594F16, iM594F15, iM594F14, this.f1166X[6], 7);
        int iM594F18 = m594F1(iM594F14, iM594F17, iM594F16, iM594F15, this.f1166X[7], 9);
        int iM594F19 = m594F1(iM594F15, iM594F18, iM594F17, iM594F16, this.f1166X[8], 11);
        int iM594F110 = m594F1(iM594F16, iM594F19, iM594F18, iM594F17, this.f1166X[9], 13);
        int iM594F111 = m594F1(iM594F17, iM594F110, iM594F19, iM594F18, this.f1166X[10], 14);
        int iM594F112 = m594F1(iM594F18, iM594F111, iM594F110, iM594F19, this.f1166X[11], 15);
        int iM594F113 = m594F1(iM594F19, iM594F112, iM594F111, iM594F110, this.f1166X[12], 6);
        int iM594F114 = m594F1(iM594F110, iM594F113, iM594F112, iM594F111, this.f1166X[13], 7);
        int iM594F115 = m594F1(iM594F111, iM594F114, iM594F113, iM594F112, this.f1166X[14], 9);
        int iM594F116 = m594F1(iM594F112, iM594F115, iM594F114, iM594F113, this.f1166X[15], 8);
        int iFF4 = FF4(i5, i6, i7, i8, this.f1166X[5], 8);
        int iFF42 = FF4(i8, iFF4, i6, i7, this.f1166X[14], 9);
        int iFF43 = FF4(i7, iFF42, iFF4, i6, this.f1166X[7], 9);
        int iFF44 = FF4(i6, iFF43, iFF42, iFF4, this.f1166X[0], 11);
        int iFF45 = FF4(iFF4, iFF44, iFF43, iFF42, this.f1166X[9], 13);
        int iFF46 = FF4(iFF42, iFF45, iFF44, iFF43, this.f1166X[2], 15);
        int iFF47 = FF4(iFF43, iFF46, iFF45, iFF44, this.f1166X[11], 15);
        int iFF48 = FF4(iFF44, iFF47, iFF46, iFF45, this.f1166X[4], 5);
        int iFF49 = FF4(iFF45, iFF48, iFF47, iFF46, this.f1166X[13], 7);
        int iFF410 = FF4(iFF46, iFF49, iFF48, iFF47, this.f1166X[6], 7);
        int iFF411 = FF4(iFF47, iFF410, iFF49, iFF48, this.f1166X[15], 8);
        int iFF412 = FF4(iFF48, iFF411, iFF410, iFF49, this.f1166X[8], 11);
        int iFF413 = FF4(iFF49, iFF412, iFF411, iFF410, this.f1166X[1], 14);
        int iFF414 = FF4(iFF410, iFF413, iFF412, iFF411, this.f1166X[10], 14);
        int iFF415 = FF4(iFF411, iFF414, iFF413, iFF412, this.f1166X[3], 12);
        int iFF416 = FF4(iFF412, iFF415, iFF414, iFF413, this.f1166X[12], 6);
        int iM595F2 = m595F2(iFF413, iM594F116, iM594F115, iM594F114, this.f1166X[7], 7);
        int iM595F22 = m595F2(iM594F114, iM595F2, iM594F116, iM594F115, this.f1166X[4], 6);
        int iM595F23 = m595F2(iM594F115, iM595F22, iM595F2, iM594F116, this.f1166X[13], 8);
        int iM595F24 = m595F2(iM594F116, iM595F23, iM595F22, iM595F2, this.f1166X[1], 13);
        int iM595F25 = m595F2(iM595F2, iM595F24, iM595F23, iM595F22, this.f1166X[10], 11);
        int iM595F26 = m595F2(iM595F22, iM595F25, iM595F24, iM595F23, this.f1166X[6], 9);
        int iM595F27 = m595F2(iM595F23, iM595F26, iM595F25, iM595F24, this.f1166X[15], 7);
        int iM595F28 = m595F2(iM595F24, iM595F27, iM595F26, iM595F25, this.f1166X[3], 15);
        int iM595F29 = m595F2(iM595F25, iM595F28, iM595F27, iM595F26, this.f1166X[12], 7);
        int iM595F210 = m595F2(iM595F26, iM595F29, iM595F28, iM595F27, this.f1166X[0], 12);
        int iM595F211 = m595F2(iM595F27, iM595F210, iM595F29, iM595F28, this.f1166X[9], 15);
        int iM595F212 = m595F2(iM595F28, iM595F211, iM595F210, iM595F29, this.f1166X[5], 9);
        int iM595F213 = m595F2(iM595F29, iM595F212, iM595F211, iM595F210, this.f1166X[2], 11);
        int iM595F214 = m595F2(iM595F210, iM595F213, iM595F212, iM595F211, this.f1166X[14], 7);
        int iM595F215 = m595F2(iM595F211, iM595F214, iM595F213, iM595F212, this.f1166X[11], 13);
        int iM595F216 = m595F2(iM595F212, iM595F215, iM595F214, iM595F213, this.f1166X[8], 12);
        int iFF3 = FF3(iM594F113, iFF416, iFF415, iFF414, this.f1166X[6], 9);
        int iFF32 = FF3(iFF414, iFF3, iFF416, iFF415, this.f1166X[11], 13);
        int iFF33 = FF3(iFF415, iFF32, iFF3, iFF416, this.f1166X[3], 15);
        int iFF34 = FF3(iFF416, iFF33, iFF32, iFF3, this.f1166X[7], 7);
        int iFF35 = FF3(iFF3, iFF34, iFF33, iFF32, this.f1166X[0], 12);
        int iFF36 = FF3(iFF32, iFF35, iFF34, iFF33, this.f1166X[13], 8);
        int iFF37 = FF3(iFF33, iFF36, iFF35, iFF34, this.f1166X[5], 9);
        int iFF38 = FF3(iFF34, iFF37, iFF36, iFF35, this.f1166X[10], 11);
        int iFF39 = FF3(iFF35, iFF38, iFF37, iFF36, this.f1166X[14], 7);
        int iFF310 = FF3(iFF36, iFF39, iFF38, iFF37, this.f1166X[15], 7);
        int iFF311 = FF3(iFF37, iFF310, iFF39, iFF38, this.f1166X[8], 12);
        int iFF312 = FF3(iFF38, iFF311, iFF310, iFF39, this.f1166X[12], 7);
        int iFF313 = FF3(iFF39, iFF312, iFF311, iFF310, this.f1166X[4], 6);
        int iFF314 = FF3(iFF310, iFF313, iFF312, iFF311, this.f1166X[9], 15);
        int iFF315 = FF3(iFF311, iFF314, iFF313, iFF312, this.f1166X[1], 13);
        int iFF316 = FF3(iFF312, iFF315, iFF314, iFF313, this.f1166X[2], 11);
        int iM596F3 = m596F3(iM595F213, iFF316, iM595F215, iM595F214, this.f1166X[3], 11);
        int iM596F32 = m596F3(iM595F214, iM596F3, iFF316, iM595F215, this.f1166X[10], 13);
        int iM596F33 = m596F3(iM595F215, iM596F32, iM596F3, iFF316, this.f1166X[14], 6);
        int iM596F34 = m596F3(iFF316, iM596F33, iM596F32, iM596F3, this.f1166X[4], 7);
        int iM596F35 = m596F3(iM596F3, iM596F34, iM596F33, iM596F32, this.f1166X[9], 14);
        int iM596F36 = m596F3(iM596F32, iM596F35, iM596F34, iM596F33, this.f1166X[15], 9);
        int iM596F37 = m596F3(iM596F33, iM596F36, iM596F35, iM596F34, this.f1166X[8], 13);
        int iM596F38 = m596F3(iM596F34, iM596F37, iM596F36, iM596F35, this.f1166X[1], 15);
        int iM596F39 = m596F3(iM596F35, iM596F38, iM596F37, iM596F36, this.f1166X[2], 14);
        int iM596F310 = m596F3(iM596F36, iM596F39, iM596F38, iM596F37, this.f1166X[7], 8);
        int iM596F311 = m596F3(iM596F37, iM596F310, iM596F39, iM596F38, this.f1166X[0], 13);
        int iM596F312 = m596F3(iM596F38, iM596F311, iM596F310, iM596F39, this.f1166X[6], 6);
        int iM596F313 = m596F3(iM596F39, iM596F312, iM596F311, iM596F310, this.f1166X[13], 5);
        int iM596F314 = m596F3(iM596F310, iM596F313, iM596F312, iM596F311, this.f1166X[11], 12);
        int iM596F315 = m596F3(iM596F311, iM596F314, iM596F313, iM596F312, this.f1166X[5], 7);
        int iM596F316 = m596F3(iM596F312, iM596F315, iM596F314, iM596F313, this.f1166X[12], 5);
        int iFF2 = FF2(iFF313, iM595F216, iFF315, iFF314, this.f1166X[15], 9);
        int iFF22 = FF2(iFF314, iFF2, iM595F216, iFF315, this.f1166X[5], 7);
        int iFF23 = FF2(iFF315, iFF22, iFF2, iM595F216, this.f1166X[1], 15);
        int iFF24 = FF2(iM595F216, iFF23, iFF22, iFF2, this.f1166X[3], 11);
        int iFF25 = FF2(iFF2, iFF24, iFF23, iFF22, this.f1166X[7], 8);
        int iFF26 = FF2(iFF22, iFF25, iFF24, iFF23, this.f1166X[14], 6);
        int iFF27 = FF2(iFF23, iFF26, iFF25, iFF24, this.f1166X[6], 6);
        int iFF28 = FF2(iFF24, iFF27, iFF26, iFF25, this.f1166X[9], 14);
        int iFF29 = FF2(iFF25, iFF28, iFF27, iFF26, this.f1166X[11], 12);
        int iFF210 = FF2(iFF26, iFF29, iFF28, iFF27, this.f1166X[8], 13);
        int iFF211 = FF2(iFF27, iFF210, iFF29, iFF28, this.f1166X[12], 5);
        int iFF212 = FF2(iFF28, iFF211, iFF210, iFF29, this.f1166X[2], 14);
        int iFF213 = FF2(iFF29, iFF212, iFF211, iFF210, this.f1166X[10], 13);
        int iFF214 = FF2(iFF210, iFF213, iFF212, iFF211, this.f1166X[0], 13);
        int iFF215 = FF2(iFF211, iFF214, iFF213, iFF212, this.f1166X[4], 7);
        int iFF216 = FF2(iFF212, iFF215, iFF214, iFF213, this.f1166X[13], 5);
        int iM597F4 = m597F4(iM596F313, iM596F316, iFF215, iM596F314, this.f1166X[1], 11);
        int iM597F42 = m597F4(iM596F314, iM597F4, iM596F316, iFF215, this.f1166X[9], 12);
        int iM597F43 = m597F4(iFF215, iM597F42, iM597F4, iM596F316, this.f1166X[11], 14);
        int iM597F44 = m597F4(iM596F316, iM597F43, iM597F42, iM597F4, this.f1166X[10], 15);
        int iM597F45 = m597F4(iM597F4, iM597F44, iM597F43, iM597F42, this.f1166X[0], 14);
        int iM597F46 = m597F4(iM597F42, iM597F45, iM597F44, iM597F43, this.f1166X[8], 15);
        int iM597F47 = m597F4(iM597F43, iM597F46, iM597F45, iM597F44, this.f1166X[12], 9);
        int iM597F48 = m597F4(iM597F44, iM597F47, iM597F46, iM597F45, this.f1166X[4], 8);
        int iM597F49 = m597F4(iM597F45, iM597F48, iM597F47, iM597F46, this.f1166X[13], 9);
        int iM597F410 = m597F4(iM597F46, iM597F49, iM597F48, iM597F47, this.f1166X[3], 14);
        int iM597F411 = m597F4(iM597F47, iM597F410, iM597F49, iM597F48, this.f1166X[7], 5);
        int iM597F412 = m597F4(iM597F48, iM597F411, iM597F410, iM597F49, this.f1166X[15], 6);
        int iM597F413 = m597F4(iM597F49, iM597F412, iM597F411, iM597F410, this.f1166X[14], 8);
        int iM597F414 = m597F4(iM597F410, iM597F413, iM597F412, iM597F411, this.f1166X[5], 6);
        int iM597F415 = m597F4(iM597F411, iM597F414, iM597F413, iM597F412, this.f1166X[6], 5);
        int iM597F416 = m597F4(iM597F412, iM597F415, iM597F414, iM597F413, this.f1166X[2], 12);
        int iFF1 = FF1(iFF213, iFF216, iM596F315, iFF214, this.f1166X[8], 15);
        int iFF12 = FF1(iFF214, iFF1, iFF216, iM596F315, this.f1166X[6], 5);
        int iFF13 = FF1(iM596F315, iFF12, iFF1, iFF216, this.f1166X[4], 8);
        int iFF14 = FF1(iFF216, iFF13, iFF12, iFF1, this.f1166X[1], 11);
        int iFF15 = FF1(iFF1, iFF14, iFF13, iFF12, this.f1166X[3], 14);
        int iFF16 = FF1(iFF12, iFF15, iFF14, iFF13, this.f1166X[11], 14);
        int iFF17 = FF1(iFF13, iFF16, iFF15, iFF14, this.f1166X[15], 6);
        int iFF18 = FF1(iFF14, iFF17, iFF16, iFF15, this.f1166X[0], 14);
        int iFF19 = FF1(iFF15, iFF18, iFF17, iFF16, this.f1166X[5], 6);
        int iFF110 = FF1(iFF16, iFF19, iFF18, iFF17, this.f1166X[12], 9);
        int iFF111 = FF1(iFF17, iFF110, iFF19, iFF18, this.f1166X[2], 12);
        int iFF112 = FF1(iFF18, iFF111, iFF110, iFF19, this.f1166X[13], 9);
        int iFF113 = FF1(iFF19, iFF112, iFF111, iFF110, this.f1166X[9], 12);
        int iFF114 = FF1(iFF110, iFF113, iFF112, iFF111, this.f1166X[7], 5);
        int iFF115 = FF1(iFF111, iFF114, iFF113, iFF112, this.f1166X[10], 15);
        int iFF116 = FF1(iFF112, iFF115, iFF114, iFF113, this.f1166X[14], 8);
        this.f1158H0 += iM597F413;
        this.f1159H1 += iM597F416;
        this.f1160H2 += iM597F415;
        this.f1161H3 += iFF114;
        this.f1162H4 += iFF113;
        this.f1163H5 += iFF116;
        this.f1164H6 += iFF115;
        this.f1165H7 += iM597F414;
        this.xOff = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f1166X;
            if (i9 == iArr.length) {
                return;
            }
            iArr[i9] = 0;
            i9++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f1166X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        int[] iArr = this.f1166X;
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
        this.f1158H0 = 1732584193;
        this.f1159H1 = -271733879;
        this.f1160H2 = -1732584194;
        this.f1161H3 = 271733878;
        this.f1162H4 = 1985229328;
        this.f1163H5 = -19088744;
        this.f1164H6 = -1985229329;
        this.f1165H7 = 19088743;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f1166X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((RIPEMD256Digest) memoable);
    }
}
