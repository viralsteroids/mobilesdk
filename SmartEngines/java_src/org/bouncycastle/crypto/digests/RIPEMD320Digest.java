package org.bouncycastle.crypto.digests;

import kotlin.UByte;
import org.bouncycastle.util.Memoable;

/* loaded from: classes3.dex */
public class RIPEMD320Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 40;

    /* renamed from: H0 */
    private int f1167H0;

    /* renamed from: H1 */
    private int f1168H1;

    /* renamed from: H2 */
    private int f1169H2;

    /* renamed from: H3 */
    private int f1170H3;

    /* renamed from: H4 */
    private int f1171H4;

    /* renamed from: H5 */
    private int f1172H5;

    /* renamed from: H6 */
    private int f1173H6;

    /* renamed from: H7 */
    private int f1174H7;

    /* renamed from: H8 */
    private int f1175H8;

    /* renamed from: H9 */
    private int f1176H9;

    /* renamed from: X */
    private int[] f1177X;
    private int xOff;

    public RIPEMD320Digest() {
        this.f1177X = new int[16];
        reset();
    }

    public RIPEMD320Digest(RIPEMD320Digest rIPEMD320Digest) {
        super(rIPEMD320Digest);
        this.f1177X = new int[16];
        doCopy(rIPEMD320Digest);
    }

    /* renamed from: RL */
    private int m603RL(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void doCopy(RIPEMD320Digest rIPEMD320Digest) {
        super.copyIn(rIPEMD320Digest);
        this.f1167H0 = rIPEMD320Digest.f1167H0;
        this.f1168H1 = rIPEMD320Digest.f1168H1;
        this.f1169H2 = rIPEMD320Digest.f1169H2;
        this.f1170H3 = rIPEMD320Digest.f1170H3;
        this.f1171H4 = rIPEMD320Digest.f1171H4;
        this.f1172H5 = rIPEMD320Digest.f1172H5;
        this.f1173H6 = rIPEMD320Digest.f1173H6;
        this.f1174H7 = rIPEMD320Digest.f1174H7;
        this.f1175H8 = rIPEMD320Digest.f1175H8;
        this.f1176H9 = rIPEMD320Digest.f1176H9;
        int[] iArr = rIPEMD320Digest.f1177X;
        System.arraycopy(iArr, 0, this.f1177X, 0, iArr.length);
        this.xOff = rIPEMD320Digest.xOff;
    }

    /* renamed from: f1 */
    private int m604f1(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* renamed from: f2 */
    private int m605f2(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: f3 */
    private int m606f3(int i, int i2, int i3) {
        return (i | (~i2)) ^ i3;
    }

    /* renamed from: f4 */
    private int m607f4(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    /* renamed from: f5 */
    private int m608f5(int i, int i2, int i3) {
        return i ^ (i2 | (~i3));
    }

    private void unpackWord(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new RIPEMD320Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        unpackWord(this.f1167H0, bArr, i);
        unpackWord(this.f1168H1, bArr, i + 4);
        unpackWord(this.f1169H2, bArr, i + 8);
        unpackWord(this.f1170H3, bArr, i + 12);
        unpackWord(this.f1171H4, bArr, i + 16);
        unpackWord(this.f1172H5, bArr, i + 20);
        unpackWord(this.f1173H6, bArr, i + 24);
        unpackWord(this.f1174H7, bArr, i + 28);
        unpackWord(this.f1175H8, bArr, i + 32);
        unpackWord(this.f1176H9, bArr, i + 36);
        reset();
        return 40;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "RIPEMD320";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 40;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        int i = this.f1167H0;
        int i2 = this.f1168H1;
        int i3 = this.f1169H2;
        int i4 = this.f1170H3;
        int i5 = this.f1171H4;
        int i6 = this.f1172H5;
        int i7 = this.f1173H6;
        int i8 = this.f1174H7;
        int i9 = this.f1175H8;
        int i10 = this.f1176H9;
        int iM603RL = m603RL(i + m604f1(i2, i3, i4) + this.f1177X[0], 11) + i5;
        int iM603RL2 = m603RL(i3, 10);
        int iM603RL3 = m603RL(i5 + m604f1(iM603RL, i2, iM603RL2) + this.f1177X[1], 14) + i4;
        int iM603RL4 = m603RL(i2, 10);
        int iM603RL5 = m603RL(i4 + m604f1(iM603RL3, iM603RL, iM603RL4) + this.f1177X[2], 15) + iM603RL2;
        int iM603RL6 = m603RL(iM603RL, 10);
        int iM603RL7 = m603RL(iM603RL2 + m604f1(iM603RL5, iM603RL3, iM603RL6) + this.f1177X[3], 12) + iM603RL4;
        int iM603RL8 = m603RL(iM603RL3, 10);
        int iM603RL9 = m603RL(iM603RL4 + m604f1(iM603RL7, iM603RL5, iM603RL8) + this.f1177X[4], 5) + iM603RL6;
        int iM603RL10 = m603RL(iM603RL5, 10);
        int iM603RL11 = m603RL(iM603RL6 + m604f1(iM603RL9, iM603RL7, iM603RL10) + this.f1177X[5], 8) + iM603RL8;
        int iM603RL12 = m603RL(iM603RL7, 10);
        int iM603RL13 = m603RL(iM603RL8 + m604f1(iM603RL11, iM603RL9, iM603RL12) + this.f1177X[6], 7) + iM603RL10;
        int iM603RL14 = m603RL(iM603RL9, 10);
        int iM603RL15 = m603RL(iM603RL10 + m604f1(iM603RL13, iM603RL11, iM603RL14) + this.f1177X[7], 9) + iM603RL12;
        int iM603RL16 = m603RL(iM603RL11, 10);
        int iM603RL17 = m603RL(iM603RL12 + m604f1(iM603RL15, iM603RL13, iM603RL16) + this.f1177X[8], 11) + iM603RL14;
        int iM603RL18 = m603RL(iM603RL13, 10);
        int iM603RL19 = m603RL(iM603RL14 + m604f1(iM603RL17, iM603RL15, iM603RL18) + this.f1177X[9], 13) + iM603RL16;
        int iM603RL20 = m603RL(iM603RL15, 10);
        int iM603RL21 = m603RL(iM603RL16 + m604f1(iM603RL19, iM603RL17, iM603RL20) + this.f1177X[10], 14) + iM603RL18;
        int iM603RL22 = m603RL(iM603RL17, 10);
        int iM603RL23 = m603RL(iM603RL18 + m604f1(iM603RL21, iM603RL19, iM603RL22) + this.f1177X[11], 15) + iM603RL20;
        int iM603RL24 = m603RL(iM603RL19, 10);
        int iM603RL25 = m603RL(iM603RL20 + m604f1(iM603RL23, iM603RL21, iM603RL24) + this.f1177X[12], 6) + iM603RL22;
        int iM603RL26 = m603RL(iM603RL21, 10);
        int iM603RL27 = m603RL(iM603RL22 + m604f1(iM603RL25, iM603RL23, iM603RL26) + this.f1177X[13], 7) + iM603RL24;
        int iM603RL28 = m603RL(iM603RL23, 10);
        int iM603RL29 = m603RL(iM603RL24 + m604f1(iM603RL27, iM603RL25, iM603RL28) + this.f1177X[14], 9) + iM603RL26;
        int iM603RL30 = m603RL(iM603RL25, 10);
        int iM603RL31 = m603RL(iM603RL26 + m604f1(iM603RL29, iM603RL27, iM603RL30) + this.f1177X[15], 8) + iM603RL28;
        int iM603RL32 = m603RL(iM603RL27, 10);
        int iM603RL33 = m603RL(i6 + m608f5(i7, i8, i9) + this.f1177X[5] + 1352829926, 8) + i10;
        int iM603RL34 = m603RL(i8, 10);
        int iM603RL35 = m603RL(i10 + m608f5(iM603RL33, i7, iM603RL34) + this.f1177X[14] + 1352829926, 9) + i9;
        int iM603RL36 = m603RL(i7, 10);
        int iM603RL37 = m603RL(i9 + m608f5(iM603RL35, iM603RL33, iM603RL36) + this.f1177X[7] + 1352829926, 9) + iM603RL34;
        int iM603RL38 = m603RL(iM603RL33, 10);
        int iM603RL39 = m603RL(iM603RL34 + m608f5(iM603RL37, iM603RL35, iM603RL38) + this.f1177X[0] + 1352829926, 11) + iM603RL36;
        int iM603RL40 = m603RL(iM603RL35, 10);
        int iM603RL41 = m603RL(iM603RL36 + m608f5(iM603RL39, iM603RL37, iM603RL40) + this.f1177X[9] + 1352829926, 13) + iM603RL38;
        int iM603RL42 = m603RL(iM603RL37, 10);
        int iM603RL43 = m603RL(iM603RL38 + m608f5(iM603RL41, iM603RL39, iM603RL42) + this.f1177X[2] + 1352829926, 15) + iM603RL40;
        int iM603RL44 = m603RL(iM603RL39, 10);
        int iM603RL45 = m603RL(iM603RL40 + m608f5(iM603RL43, iM603RL41, iM603RL44) + this.f1177X[11] + 1352829926, 15) + iM603RL42;
        int iM603RL46 = m603RL(iM603RL41, 10);
        int iM603RL47 = m603RL(iM603RL42 + m608f5(iM603RL45, iM603RL43, iM603RL46) + this.f1177X[4] + 1352829926, 5) + iM603RL44;
        int iM603RL48 = m603RL(iM603RL43, 10);
        int iM603RL49 = m603RL(iM603RL44 + m608f5(iM603RL47, iM603RL45, iM603RL48) + this.f1177X[13] + 1352829926, 7) + iM603RL46;
        int iM603RL50 = m603RL(iM603RL45, 10);
        int iM603RL51 = m603RL(iM603RL46 + m608f5(iM603RL49, iM603RL47, iM603RL50) + this.f1177X[6] + 1352829926, 7) + iM603RL48;
        int iM603RL52 = m603RL(iM603RL47, 10);
        int iM603RL53 = m603RL(iM603RL48 + m608f5(iM603RL51, iM603RL49, iM603RL52) + this.f1177X[15] + 1352829926, 8) + iM603RL50;
        int iM603RL54 = m603RL(iM603RL49, 10);
        int iM603RL55 = m603RL(iM603RL50 + m608f5(iM603RL53, iM603RL51, iM603RL54) + this.f1177X[8] + 1352829926, 11) + iM603RL52;
        int iM603RL56 = m603RL(iM603RL51, 10);
        int iM603RL57 = m603RL(iM603RL52 + m608f5(iM603RL55, iM603RL53, iM603RL56) + this.f1177X[1] + 1352829926, 14) + iM603RL54;
        int iM603RL58 = m603RL(iM603RL53, 10);
        int iM603RL59 = m603RL(iM603RL54 + m608f5(iM603RL57, iM603RL55, iM603RL58) + this.f1177X[10] + 1352829926, 14) + iM603RL56;
        int iM603RL60 = m603RL(iM603RL55, 10);
        int iM603RL61 = m603RL(iM603RL56 + m608f5(iM603RL59, iM603RL57, iM603RL60) + this.f1177X[3] + 1352829926, 12) + iM603RL58;
        int iM603RL62 = m603RL(iM603RL57, 10);
        int iM603RL63 = m603RL(iM603RL58 + m608f5(iM603RL61, iM603RL59, iM603RL62) + this.f1177X[12] + 1352829926, 6) + iM603RL60;
        int iM603RL64 = m603RL(iM603RL59, 10);
        int iM603RL65 = m603RL(iM603RL28 + m605f2(iM603RL63, iM603RL29, iM603RL32) + this.f1177X[7] + 1518500249, 7) + iM603RL30;
        int iM603RL66 = m603RL(iM603RL29, 10);
        int iM603RL67 = m603RL(iM603RL30 + m605f2(iM603RL65, iM603RL63, iM603RL66) + this.f1177X[4] + 1518500249, 6) + iM603RL32;
        int iM603RL68 = m603RL(iM603RL63, 10);
        int iM603RL69 = m603RL(iM603RL32 + m605f2(iM603RL67, iM603RL65, iM603RL68) + this.f1177X[13] + 1518500249, 8) + iM603RL66;
        int iM603RL70 = m603RL(iM603RL65, 10);
        int iM603RL71 = m603RL(iM603RL66 + m605f2(iM603RL69, iM603RL67, iM603RL70) + this.f1177X[1] + 1518500249, 13) + iM603RL68;
        int iM603RL72 = m603RL(iM603RL67, 10);
        int iM603RL73 = m603RL(iM603RL68 + m605f2(iM603RL71, iM603RL69, iM603RL72) + this.f1177X[10] + 1518500249, 11) + iM603RL70;
        int iM603RL74 = m603RL(iM603RL69, 10);
        int iM603RL75 = m603RL(iM603RL70 + m605f2(iM603RL73, iM603RL71, iM603RL74) + this.f1177X[6] + 1518500249, 9) + iM603RL72;
        int iM603RL76 = m603RL(iM603RL71, 10);
        int iM603RL77 = m603RL(iM603RL72 + m605f2(iM603RL75, iM603RL73, iM603RL76) + this.f1177X[15] + 1518500249, 7) + iM603RL74;
        int iM603RL78 = m603RL(iM603RL73, 10);
        int iM603RL79 = m603RL(iM603RL74 + m605f2(iM603RL77, iM603RL75, iM603RL78) + this.f1177X[3] + 1518500249, 15) + iM603RL76;
        int iM603RL80 = m603RL(iM603RL75, 10);
        int iM603RL81 = m603RL(iM603RL76 + m605f2(iM603RL79, iM603RL77, iM603RL80) + this.f1177X[12] + 1518500249, 7) + iM603RL78;
        int iM603RL82 = m603RL(iM603RL77, 10);
        int iM603RL83 = m603RL(iM603RL78 + m605f2(iM603RL81, iM603RL79, iM603RL82) + this.f1177X[0] + 1518500249, 12) + iM603RL80;
        int iM603RL84 = m603RL(iM603RL79, 10);
        int iM603RL85 = m603RL(iM603RL80 + m605f2(iM603RL83, iM603RL81, iM603RL84) + this.f1177X[9] + 1518500249, 15) + iM603RL82;
        int iM603RL86 = m603RL(iM603RL81, 10);
        int iM603RL87 = m603RL(iM603RL82 + m605f2(iM603RL85, iM603RL83, iM603RL86) + this.f1177X[5] + 1518500249, 9) + iM603RL84;
        int iM603RL88 = m603RL(iM603RL83, 10);
        int iM603RL89 = m603RL(iM603RL84 + m605f2(iM603RL87, iM603RL85, iM603RL88) + this.f1177X[2] + 1518500249, 11) + iM603RL86;
        int iM603RL90 = m603RL(iM603RL85, 10);
        int iM603RL91 = m603RL(iM603RL86 + m605f2(iM603RL89, iM603RL87, iM603RL90) + this.f1177X[14] + 1518500249, 7) + iM603RL88;
        int iM603RL92 = m603RL(iM603RL87, 10);
        int iM603RL93 = m603RL(iM603RL88 + m605f2(iM603RL91, iM603RL89, iM603RL92) + this.f1177X[11] + 1518500249, 13) + iM603RL90;
        int iM603RL94 = m603RL(iM603RL89, 10);
        int iM603RL95 = m603RL(iM603RL90 + m605f2(iM603RL93, iM603RL91, iM603RL94) + this.f1177X[8] + 1518500249, 12) + iM603RL92;
        int iM603RL96 = m603RL(iM603RL91, 10);
        int iM603RL97 = m603RL(iM603RL60 + m607f4(iM603RL31, iM603RL61, iM603RL64) + this.f1177X[6] + 1548603684, 9) + iM603RL62;
        int iM603RL98 = m603RL(iM603RL61, 10);
        int iM603RL99 = m603RL(iM603RL62 + m607f4(iM603RL97, iM603RL31, iM603RL98) + this.f1177X[11] + 1548603684, 13) + iM603RL64;
        int iM603RL100 = m603RL(iM603RL31, 10);
        int iM603RL101 = m603RL(iM603RL64 + m607f4(iM603RL99, iM603RL97, iM603RL100) + this.f1177X[3] + 1548603684, 15) + iM603RL98;
        int iM603RL102 = m603RL(iM603RL97, 10);
        int iM603RL103 = m603RL(iM603RL98 + m607f4(iM603RL101, iM603RL99, iM603RL102) + this.f1177X[7] + 1548603684, 7) + iM603RL100;
        int iM603RL104 = m603RL(iM603RL99, 10);
        int iM603RL105 = m603RL(iM603RL100 + m607f4(iM603RL103, iM603RL101, iM603RL104) + this.f1177X[0] + 1548603684, 12) + iM603RL102;
        int iM603RL106 = m603RL(iM603RL101, 10);
        int iM603RL107 = m603RL(iM603RL102 + m607f4(iM603RL105, iM603RL103, iM603RL106) + this.f1177X[13] + 1548603684, 8) + iM603RL104;
        int iM603RL108 = m603RL(iM603RL103, 10);
        int iM603RL109 = m603RL(iM603RL104 + m607f4(iM603RL107, iM603RL105, iM603RL108) + this.f1177X[5] + 1548603684, 9) + iM603RL106;
        int iM603RL110 = m603RL(iM603RL105, 10);
        int iM603RL111 = m603RL(iM603RL106 + m607f4(iM603RL109, iM603RL107, iM603RL110) + this.f1177X[10] + 1548603684, 11) + iM603RL108;
        int iM603RL112 = m603RL(iM603RL107, 10);
        int iM603RL113 = m603RL(iM603RL108 + m607f4(iM603RL111, iM603RL109, iM603RL112) + this.f1177X[14] + 1548603684, 7) + iM603RL110;
        int iM603RL114 = m603RL(iM603RL109, 10);
        int iM603RL115 = m603RL(iM603RL110 + m607f4(iM603RL113, iM603RL111, iM603RL114) + this.f1177X[15] + 1548603684, 7) + iM603RL112;
        int iM603RL116 = m603RL(iM603RL111, 10);
        int iM603RL117 = m603RL(iM603RL112 + m607f4(iM603RL115, iM603RL113, iM603RL116) + this.f1177X[8] + 1548603684, 12) + iM603RL114;
        int iM603RL118 = m603RL(iM603RL113, 10);
        int iM603RL119 = m603RL(iM603RL114 + m607f4(iM603RL117, iM603RL115, iM603RL118) + this.f1177X[12] + 1548603684, 7) + iM603RL116;
        int iM603RL120 = m603RL(iM603RL115, 10);
        int iM603RL121 = m603RL(iM603RL116 + m607f4(iM603RL119, iM603RL117, iM603RL120) + this.f1177X[4] + 1548603684, 6) + iM603RL118;
        int iM603RL122 = m603RL(iM603RL117, 10);
        int iM603RL123 = m603RL(iM603RL118 + m607f4(iM603RL121, iM603RL119, iM603RL122) + this.f1177X[9] + 1548603684, 15) + iM603RL120;
        int iM603RL124 = m603RL(iM603RL119, 10);
        int iM603RL125 = m603RL(iM603RL120 + m607f4(iM603RL123, iM603RL121, iM603RL124) + this.f1177X[1] + 1548603684, 13) + iM603RL122;
        int iM603RL126 = m603RL(iM603RL121, 10);
        int iM603RL127 = m603RL(iM603RL122 + m607f4(iM603RL125, iM603RL123, iM603RL126) + this.f1177X[2] + 1548603684, 11) + iM603RL124;
        int iM603RL128 = m603RL(iM603RL123, 10);
        int iM603RL129 = m603RL(iM603RL92 + m606f3(iM603RL95, iM603RL93, iM603RL128) + this.f1177X[3] + 1859775393, 11) + iM603RL94;
        int iM603RL130 = m603RL(iM603RL93, 10);
        int iM603RL131 = m603RL(iM603RL94 + m606f3(iM603RL129, iM603RL95, iM603RL130) + this.f1177X[10] + 1859775393, 13) + iM603RL128;
        int iM603RL132 = m603RL(iM603RL95, 10);
        int iM603RL133 = m603RL(iM603RL128 + m606f3(iM603RL131, iM603RL129, iM603RL132) + this.f1177X[14] + 1859775393, 6) + iM603RL130;
        int iM603RL134 = m603RL(iM603RL129, 10);
        int iM603RL135 = m603RL(iM603RL130 + m606f3(iM603RL133, iM603RL131, iM603RL134) + this.f1177X[4] + 1859775393, 7) + iM603RL132;
        int iM603RL136 = m603RL(iM603RL131, 10);
        int iM603RL137 = m603RL(iM603RL132 + m606f3(iM603RL135, iM603RL133, iM603RL136) + this.f1177X[9] + 1859775393, 14) + iM603RL134;
        int iM603RL138 = m603RL(iM603RL133, 10);
        int iM603RL139 = m603RL(iM603RL134 + m606f3(iM603RL137, iM603RL135, iM603RL138) + this.f1177X[15] + 1859775393, 9) + iM603RL136;
        int iM603RL140 = m603RL(iM603RL135, 10);
        int iM603RL141 = m603RL(iM603RL136 + m606f3(iM603RL139, iM603RL137, iM603RL140) + this.f1177X[8] + 1859775393, 13) + iM603RL138;
        int iM603RL142 = m603RL(iM603RL137, 10);
        int iM603RL143 = m603RL(iM603RL138 + m606f3(iM603RL141, iM603RL139, iM603RL142) + this.f1177X[1] + 1859775393, 15) + iM603RL140;
        int iM603RL144 = m603RL(iM603RL139, 10);
        int iM603RL145 = m603RL(iM603RL140 + m606f3(iM603RL143, iM603RL141, iM603RL144) + this.f1177X[2] + 1859775393, 14) + iM603RL142;
        int iM603RL146 = m603RL(iM603RL141, 10);
        int iM603RL147 = m603RL(iM603RL142 + m606f3(iM603RL145, iM603RL143, iM603RL146) + this.f1177X[7] + 1859775393, 8) + iM603RL144;
        int iM603RL148 = m603RL(iM603RL143, 10);
        int iM603RL149 = m603RL(iM603RL144 + m606f3(iM603RL147, iM603RL145, iM603RL148) + this.f1177X[0] + 1859775393, 13) + iM603RL146;
        int iM603RL150 = m603RL(iM603RL145, 10);
        int iM603RL151 = m603RL(iM603RL146 + m606f3(iM603RL149, iM603RL147, iM603RL150) + this.f1177X[6] + 1859775393, 6) + iM603RL148;
        int iM603RL152 = m603RL(iM603RL147, 10);
        int iM603RL153 = m603RL(iM603RL148 + m606f3(iM603RL151, iM603RL149, iM603RL152) + this.f1177X[13] + 1859775393, 5) + iM603RL150;
        int iM603RL154 = m603RL(iM603RL149, 10);
        int iM603RL155 = m603RL(iM603RL150 + m606f3(iM603RL153, iM603RL151, iM603RL154) + this.f1177X[11] + 1859775393, 12) + iM603RL152;
        int iM603RL156 = m603RL(iM603RL151, 10);
        int iM603RL157 = m603RL(iM603RL152 + m606f3(iM603RL155, iM603RL153, iM603RL156) + this.f1177X[5] + 1859775393, 7) + iM603RL154;
        int iM603RL158 = m603RL(iM603RL153, 10);
        int iM603RL159 = m603RL(iM603RL154 + m606f3(iM603RL157, iM603RL155, iM603RL158) + this.f1177X[12] + 1859775393, 5) + iM603RL156;
        int iM603RL160 = m603RL(iM603RL155, 10);
        int iM603RL161 = m603RL(iM603RL124 + m606f3(iM603RL127, iM603RL125, iM603RL96) + this.f1177X[15] + 1836072691, 9) + iM603RL126;
        int iM603RL162 = m603RL(iM603RL125, 10);
        int iM603RL163 = m603RL(iM603RL126 + m606f3(iM603RL161, iM603RL127, iM603RL162) + this.f1177X[5] + 1836072691, 7) + iM603RL96;
        int iM603RL164 = m603RL(iM603RL127, 10);
        int iM603RL165 = m603RL(iM603RL96 + m606f3(iM603RL163, iM603RL161, iM603RL164) + this.f1177X[1] + 1836072691, 15) + iM603RL162;
        int iM603RL166 = m603RL(iM603RL161, 10);
        int iM603RL167 = m603RL(iM603RL162 + m606f3(iM603RL165, iM603RL163, iM603RL166) + this.f1177X[3] + 1836072691, 11) + iM603RL164;
        int iM603RL168 = m603RL(iM603RL163, 10);
        int iM603RL169 = m603RL(iM603RL164 + m606f3(iM603RL167, iM603RL165, iM603RL168) + this.f1177X[7] + 1836072691, 8) + iM603RL166;
        int iM603RL170 = m603RL(iM603RL165, 10);
        int iM603RL171 = m603RL(iM603RL166 + m606f3(iM603RL169, iM603RL167, iM603RL170) + this.f1177X[14] + 1836072691, 6) + iM603RL168;
        int iM603RL172 = m603RL(iM603RL167, 10);
        int iM603RL173 = m603RL(iM603RL168 + m606f3(iM603RL171, iM603RL169, iM603RL172) + this.f1177X[6] + 1836072691, 6) + iM603RL170;
        int iM603RL174 = m603RL(iM603RL169, 10);
        int iM603RL175 = m603RL(iM603RL170 + m606f3(iM603RL173, iM603RL171, iM603RL174) + this.f1177X[9] + 1836072691, 14) + iM603RL172;
        int iM603RL176 = m603RL(iM603RL171, 10);
        int iM603RL177 = m603RL(iM603RL172 + m606f3(iM603RL175, iM603RL173, iM603RL176) + this.f1177X[11] + 1836072691, 12) + iM603RL174;
        int iM603RL178 = m603RL(iM603RL173, 10);
        int iM603RL179 = m603RL(iM603RL174 + m606f3(iM603RL177, iM603RL175, iM603RL178) + this.f1177X[8] + 1836072691, 13) + iM603RL176;
        int iM603RL180 = m603RL(iM603RL175, 10);
        int iM603RL181 = m603RL(iM603RL176 + m606f3(iM603RL179, iM603RL177, iM603RL180) + this.f1177X[12] + 1836072691, 5) + iM603RL178;
        int iM603RL182 = m603RL(iM603RL177, 10);
        int iM603RL183 = m603RL(iM603RL178 + m606f3(iM603RL181, iM603RL179, iM603RL182) + this.f1177X[2] + 1836072691, 14) + iM603RL180;
        int iM603RL184 = m603RL(iM603RL179, 10);
        int iM603RL185 = m603RL(iM603RL180 + m606f3(iM603RL183, iM603RL181, iM603RL184) + this.f1177X[10] + 1836072691, 13) + iM603RL182;
        int iM603RL186 = m603RL(iM603RL181, 10);
        int iM603RL187 = m603RL(iM603RL182 + m606f3(iM603RL185, iM603RL183, iM603RL186) + this.f1177X[0] + 1836072691, 13) + iM603RL184;
        int iM603RL188 = m603RL(iM603RL183, 10);
        int iM603RL189 = m603RL(iM603RL184 + m606f3(iM603RL187, iM603RL185, iM603RL188) + this.f1177X[4] + 1836072691, 7) + iM603RL186;
        int iM603RL190 = m603RL(iM603RL185, 10);
        int iM603RL191 = m603RL(iM603RL186 + m606f3(iM603RL189, iM603RL187, iM603RL190) + this.f1177X[13] + 1836072691, 5) + iM603RL188;
        int iM603RL192 = m603RL(iM603RL187, 10);
        int iM603RL193 = m603RL(((iM603RL188 + m607f4(iM603RL159, iM603RL157, iM603RL160)) + this.f1177X[1]) - 1894007588, 11) + iM603RL158;
        int iM603RL194 = m603RL(iM603RL157, 10);
        int iM603RL195 = m603RL(((iM603RL158 + m607f4(iM603RL193, iM603RL159, iM603RL194)) + this.f1177X[9]) - 1894007588, 12) + iM603RL160;
        int iM603RL196 = m603RL(iM603RL159, 10);
        int iM603RL197 = m603RL(((iM603RL160 + m607f4(iM603RL195, iM603RL193, iM603RL196)) + this.f1177X[11]) - 1894007588, 14) + iM603RL194;
        int iM603RL198 = m603RL(iM603RL193, 10);
        int iM603RL199 = m603RL(((iM603RL194 + m607f4(iM603RL197, iM603RL195, iM603RL198)) + this.f1177X[10]) - 1894007588, 15) + iM603RL196;
        int iM603RL200 = m603RL(iM603RL195, 10);
        int iM603RL201 = m603RL(((iM603RL196 + m607f4(iM603RL199, iM603RL197, iM603RL200)) + this.f1177X[0]) - 1894007588, 14) + iM603RL198;
        int iM603RL202 = m603RL(iM603RL197, 10);
        int iM603RL203 = m603RL(((iM603RL198 + m607f4(iM603RL201, iM603RL199, iM603RL202)) + this.f1177X[8]) - 1894007588, 15) + iM603RL200;
        int iM603RL204 = m603RL(iM603RL199, 10);
        int iM603RL205 = m603RL(((iM603RL200 + m607f4(iM603RL203, iM603RL201, iM603RL204)) + this.f1177X[12]) - 1894007588, 9) + iM603RL202;
        int iM603RL206 = m603RL(iM603RL201, 10);
        int iM603RL207 = m603RL(((iM603RL202 + m607f4(iM603RL205, iM603RL203, iM603RL206)) + this.f1177X[4]) - 1894007588, 8) + iM603RL204;
        int iM603RL208 = m603RL(iM603RL203, 10);
        int iM603RL209 = m603RL(((iM603RL204 + m607f4(iM603RL207, iM603RL205, iM603RL208)) + this.f1177X[13]) - 1894007588, 9) + iM603RL206;
        int iM603RL210 = m603RL(iM603RL205, 10);
        int iM603RL211 = m603RL(((iM603RL206 + m607f4(iM603RL209, iM603RL207, iM603RL210)) + this.f1177X[3]) - 1894007588, 14) + iM603RL208;
        int iM603RL212 = m603RL(iM603RL207, 10);
        int iM603RL213 = m603RL(((iM603RL208 + m607f4(iM603RL211, iM603RL209, iM603RL212)) + this.f1177X[7]) - 1894007588, 5) + iM603RL210;
        int iM603RL214 = m603RL(iM603RL209, 10);
        int iM603RL215 = m603RL(((iM603RL210 + m607f4(iM603RL213, iM603RL211, iM603RL214)) + this.f1177X[15]) - 1894007588, 6) + iM603RL212;
        int iM603RL216 = m603RL(iM603RL211, 10);
        int iM603RL217 = m603RL(((iM603RL212 + m607f4(iM603RL215, iM603RL213, iM603RL216)) + this.f1177X[14]) - 1894007588, 8) + iM603RL214;
        int iM603RL218 = m603RL(iM603RL213, 10);
        int iM603RL219 = m603RL(((iM603RL214 + m607f4(iM603RL217, iM603RL215, iM603RL218)) + this.f1177X[5]) - 1894007588, 6) + iM603RL216;
        int iM603RL220 = m603RL(iM603RL215, 10);
        int iM603RL221 = m603RL(((iM603RL216 + m607f4(iM603RL219, iM603RL217, iM603RL220)) + this.f1177X[6]) - 1894007588, 5) + iM603RL218;
        int iM603RL222 = m603RL(iM603RL217, 10);
        int iM603RL223 = m603RL(((iM603RL218 + m607f4(iM603RL221, iM603RL219, iM603RL222)) + this.f1177X[2]) - 1894007588, 12) + iM603RL220;
        int iM603RL224 = m603RL(iM603RL219, 10);
        int iM603RL225 = m603RL(iM603RL156 + m605f2(iM603RL191, iM603RL189, iM603RL192) + this.f1177X[8] + 2053994217, 15) + iM603RL190;
        int iM603RL226 = m603RL(iM603RL189, 10);
        int iM603RL227 = m603RL(iM603RL190 + m605f2(iM603RL225, iM603RL191, iM603RL226) + this.f1177X[6] + 2053994217, 5) + iM603RL192;
        int iM603RL228 = m603RL(iM603RL191, 10);
        int iM603RL229 = m603RL(iM603RL192 + m605f2(iM603RL227, iM603RL225, iM603RL228) + this.f1177X[4] + 2053994217, 8) + iM603RL226;
        int iM603RL230 = m603RL(iM603RL225, 10);
        int iM603RL231 = m603RL(iM603RL226 + m605f2(iM603RL229, iM603RL227, iM603RL230) + this.f1177X[1] + 2053994217, 11) + iM603RL228;
        int iM603RL232 = m603RL(iM603RL227, 10);
        int iM603RL233 = m603RL(iM603RL228 + m605f2(iM603RL231, iM603RL229, iM603RL232) + this.f1177X[3] + 2053994217, 14) + iM603RL230;
        int iM603RL234 = m603RL(iM603RL229, 10);
        int iM603RL235 = m603RL(iM603RL230 + m605f2(iM603RL233, iM603RL231, iM603RL234) + this.f1177X[11] + 2053994217, 14) + iM603RL232;
        int iM603RL236 = m603RL(iM603RL231, 10);
        int iM603RL237 = m603RL(iM603RL232 + m605f2(iM603RL235, iM603RL233, iM603RL236) + this.f1177X[15] + 2053994217, 6) + iM603RL234;
        int iM603RL238 = m603RL(iM603RL233, 10);
        int iM603RL239 = m603RL(iM603RL234 + m605f2(iM603RL237, iM603RL235, iM603RL238) + this.f1177X[0] + 2053994217, 14) + iM603RL236;
        int iM603RL240 = m603RL(iM603RL235, 10);
        int iM603RL241 = m603RL(iM603RL236 + m605f2(iM603RL239, iM603RL237, iM603RL240) + this.f1177X[5] + 2053994217, 6) + iM603RL238;
        int iM603RL242 = m603RL(iM603RL237, 10);
        int iM603RL243 = m603RL(iM603RL238 + m605f2(iM603RL241, iM603RL239, iM603RL242) + this.f1177X[12] + 2053994217, 9) + iM603RL240;
        int iM603RL244 = m603RL(iM603RL239, 10);
        int iM603RL245 = m603RL(iM603RL240 + m605f2(iM603RL243, iM603RL241, iM603RL244) + this.f1177X[2] + 2053994217, 12) + iM603RL242;
        int iM603RL246 = m603RL(iM603RL241, 10);
        int iM603RL247 = m603RL(iM603RL242 + m605f2(iM603RL245, iM603RL243, iM603RL246) + this.f1177X[13] + 2053994217, 9) + iM603RL244;
        int iM603RL248 = m603RL(iM603RL243, 10);
        int iM603RL249 = m603RL(iM603RL244 + m605f2(iM603RL247, iM603RL245, iM603RL248) + this.f1177X[9] + 2053994217, 12) + iM603RL246;
        int iM603RL250 = m603RL(iM603RL245, 10);
        int iM603RL251 = m603RL(iM603RL246 + m605f2(iM603RL249, iM603RL247, iM603RL250) + this.f1177X[7] + 2053994217, 5) + iM603RL248;
        int iM603RL252 = m603RL(iM603RL247, 10);
        int iM603RL253 = m603RL(iM603RL248 + m605f2(iM603RL251, iM603RL249, iM603RL252) + this.f1177X[10] + 2053994217, 15) + iM603RL250;
        int iM603RL254 = m603RL(iM603RL249, 10);
        int iM603RL255 = m603RL(iM603RL250 + m605f2(iM603RL253, iM603RL251, iM603RL254) + this.f1177X[14] + 2053994217, 8) + iM603RL252;
        int iM603RL256 = m603RL(iM603RL251, 10);
        int iM603RL257 = m603RL(((iM603RL220 + m608f5(iM603RL223, iM603RL253, iM603RL224)) + this.f1177X[4]) - 1454113458, 9) + iM603RL222;
        int iM603RL258 = m603RL(iM603RL253, 10);
        int iM603RL259 = m603RL(((iM603RL222 + m608f5(iM603RL257, iM603RL223, iM603RL258)) + this.f1177X[0]) - 1454113458, 15) + iM603RL224;
        int iM603RL260 = m603RL(iM603RL223, 10);
        int iM603RL261 = m603RL(((iM603RL224 + m608f5(iM603RL259, iM603RL257, iM603RL260)) + this.f1177X[5]) - 1454113458, 5) + iM603RL258;
        int iM603RL262 = m603RL(iM603RL257, 10);
        int iM603RL263 = m603RL(((iM603RL258 + m608f5(iM603RL261, iM603RL259, iM603RL262)) + this.f1177X[9]) - 1454113458, 11) + iM603RL260;
        int iM603RL264 = m603RL(iM603RL259, 10);
        int iM603RL265 = m603RL(((iM603RL260 + m608f5(iM603RL263, iM603RL261, iM603RL264)) + this.f1177X[7]) - 1454113458, 6) + iM603RL262;
        int iM603RL266 = m603RL(iM603RL261, 10);
        int iM603RL267 = m603RL(((iM603RL262 + m608f5(iM603RL265, iM603RL263, iM603RL266)) + this.f1177X[12]) - 1454113458, 8) + iM603RL264;
        int iM603RL268 = m603RL(iM603RL263, 10);
        int iM603RL269 = m603RL(((iM603RL264 + m608f5(iM603RL267, iM603RL265, iM603RL268)) + this.f1177X[2]) - 1454113458, 13) + iM603RL266;
        int iM603RL270 = m603RL(iM603RL265, 10);
        int iM603RL271 = m603RL(((iM603RL266 + m608f5(iM603RL269, iM603RL267, iM603RL270)) + this.f1177X[10]) - 1454113458, 12) + iM603RL268;
        int iM603RL272 = m603RL(iM603RL267, 10);
        int iM603RL273 = m603RL(((iM603RL268 + m608f5(iM603RL271, iM603RL269, iM603RL272)) + this.f1177X[14]) - 1454113458, 5) + iM603RL270;
        int iM603RL274 = m603RL(iM603RL269, 10);
        int iM603RL275 = m603RL(((iM603RL270 + m608f5(iM603RL273, iM603RL271, iM603RL274)) + this.f1177X[1]) - 1454113458, 12) + iM603RL272;
        int iM603RL276 = m603RL(iM603RL271, 10);
        int iM603RL277 = m603RL(((iM603RL272 + m608f5(iM603RL275, iM603RL273, iM603RL276)) + this.f1177X[3]) - 1454113458, 13) + iM603RL274;
        int iM603RL278 = m603RL(iM603RL273, 10);
        int iM603RL279 = m603RL(((iM603RL274 + m608f5(iM603RL277, iM603RL275, iM603RL278)) + this.f1177X[8]) - 1454113458, 14) + iM603RL276;
        int iM603RL280 = m603RL(iM603RL275, 10);
        int iM603RL281 = m603RL(((iM603RL276 + m608f5(iM603RL279, iM603RL277, iM603RL280)) + this.f1177X[11]) - 1454113458, 11) + iM603RL278;
        int iM603RL282 = m603RL(iM603RL277, 10);
        int iM603RL283 = m603RL(((iM603RL278 + m608f5(iM603RL281, iM603RL279, iM603RL282)) + this.f1177X[6]) - 1454113458, 8) + iM603RL280;
        int iM603RL284 = m603RL(iM603RL279, 10);
        int iM603RL285 = m603RL(((iM603RL280 + m608f5(iM603RL283, iM603RL281, iM603RL284)) + this.f1177X[15]) - 1454113458, 5) + iM603RL282;
        int iM603RL286 = m603RL(iM603RL281, 10);
        int iM603RL287 = m603RL(((iM603RL282 + m608f5(iM603RL285, iM603RL283, iM603RL286)) + this.f1177X[13]) - 1454113458, 6) + iM603RL284;
        int iM603RL288 = m603RL(iM603RL283, 10);
        int iM603RL289 = m603RL(iM603RL252 + m604f1(iM603RL255, iM603RL221, iM603RL256) + this.f1177X[12], 8) + iM603RL254;
        int iM603RL290 = m603RL(iM603RL221, 10);
        int iM603RL291 = m603RL(iM603RL254 + m604f1(iM603RL289, iM603RL255, iM603RL290) + this.f1177X[15], 5) + iM603RL256;
        int iM603RL292 = m603RL(iM603RL255, 10);
        int iM603RL293 = m603RL(iM603RL256 + m604f1(iM603RL291, iM603RL289, iM603RL292) + this.f1177X[10], 12) + iM603RL290;
        int iM603RL294 = m603RL(iM603RL289, 10);
        int iM603RL295 = m603RL(iM603RL290 + m604f1(iM603RL293, iM603RL291, iM603RL294) + this.f1177X[4], 9) + iM603RL292;
        int iM603RL296 = m603RL(iM603RL291, 10);
        int iM603RL297 = m603RL(iM603RL292 + m604f1(iM603RL295, iM603RL293, iM603RL296) + this.f1177X[1], 12) + iM603RL294;
        int iM603RL298 = m603RL(iM603RL293, 10);
        int iM603RL299 = m603RL(iM603RL294 + m604f1(iM603RL297, iM603RL295, iM603RL298) + this.f1177X[5], 5) + iM603RL296;
        int iM603RL300 = m603RL(iM603RL295, 10);
        int iM603RL301 = m603RL(iM603RL296 + m604f1(iM603RL299, iM603RL297, iM603RL300) + this.f1177X[8], 14) + iM603RL298;
        int iM603RL302 = m603RL(iM603RL297, 10);
        int iM603RL303 = m603RL(iM603RL298 + m604f1(iM603RL301, iM603RL299, iM603RL302) + this.f1177X[7], 6) + iM603RL300;
        int iM603RL304 = m603RL(iM603RL299, 10);
        int iM603RL305 = m603RL(iM603RL300 + m604f1(iM603RL303, iM603RL301, iM603RL304) + this.f1177X[6], 8) + iM603RL302;
        int iM603RL306 = m603RL(iM603RL301, 10);
        int iM603RL307 = m603RL(iM603RL302 + m604f1(iM603RL305, iM603RL303, iM603RL306) + this.f1177X[2], 13) + iM603RL304;
        int iM603RL308 = m603RL(iM603RL303, 10);
        int iM603RL309 = m603RL(iM603RL304 + m604f1(iM603RL307, iM603RL305, iM603RL308) + this.f1177X[13], 6) + iM603RL306;
        int iM603RL310 = m603RL(iM603RL305, 10);
        int iM603RL311 = m603RL(iM603RL306 + m604f1(iM603RL309, iM603RL307, iM603RL310) + this.f1177X[14], 5) + iM603RL308;
        int iM603RL312 = m603RL(iM603RL307, 10);
        int iM603RL313 = m603RL(iM603RL308 + m604f1(iM603RL311, iM603RL309, iM603RL312) + this.f1177X[0], 15) + iM603RL310;
        int iM603RL314 = m603RL(iM603RL309, 10);
        int iM603RL315 = m603RL(iM603RL310 + m604f1(iM603RL313, iM603RL311, iM603RL314) + this.f1177X[3], 13) + iM603RL312;
        int iM603RL316 = m603RL(iM603RL311, 10);
        int iM603RL317 = m603RL(iM603RL312 + m604f1(iM603RL315, iM603RL313, iM603RL316) + this.f1177X[9], 11) + iM603RL314;
        int iM603RL318 = m603RL(iM603RL313, 10);
        int iM603RL319 = m603RL(iM603RL314 + m604f1(iM603RL317, iM603RL315, iM603RL318) + this.f1177X[11], 11) + iM603RL316;
        int iM603RL320 = m603RL(iM603RL315, 10);
        this.f1167H0 += iM603RL284;
        this.f1168H1 += iM603RL287;
        this.f1169H2 += iM603RL285;
        this.f1170H3 += iM603RL288;
        this.f1171H4 += iM603RL318;
        this.f1172H5 += iM603RL316;
        this.f1173H6 += iM603RL319;
        this.f1174H7 += iM603RL317;
        this.f1175H8 += iM603RL320;
        this.f1176H9 += iM603RL286;
        this.xOff = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f1177X;
            if (i11 == iArr.length) {
                return;
            }
            iArr[i11] = 0;
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f1177X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        int[] iArr = this.f1177X;
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
        this.f1167H0 = 1732584193;
        this.f1168H1 = -271733879;
        this.f1169H2 = -1732584194;
        this.f1170H3 = 271733878;
        this.f1171H4 = -1009589776;
        this.f1172H5 = 1985229328;
        this.f1173H6 = -19088744;
        this.f1174H7 = -1985229329;
        this.f1175H8 = 19088743;
        this.f1176H9 = 1009589775;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f1177X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        doCopy((RIPEMD320Digest) memoable);
    }
}
