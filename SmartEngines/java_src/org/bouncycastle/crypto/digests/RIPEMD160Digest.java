package org.bouncycastle.crypto.digests;

import kotlin.UByte;
import org.bouncycastle.util.Memoable;

/* loaded from: classes3.dex */
public class RIPEMD160Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 20;

    /* renamed from: H0 */
    private int f1152H0;

    /* renamed from: H1 */
    private int f1153H1;

    /* renamed from: H2 */
    private int f1154H2;

    /* renamed from: H3 */
    private int f1155H3;

    /* renamed from: H4 */
    private int f1156H4;

    /* renamed from: X */
    private int[] f1157X;
    private int xOff;

    public RIPEMD160Digest() {
        this.f1157X = new int[16];
        reset();
    }

    public RIPEMD160Digest(RIPEMD160Digest rIPEMD160Digest) {
        super(rIPEMD160Digest);
        this.f1157X = new int[16];
        copyIn(rIPEMD160Digest);
    }

    /* renamed from: RL */
    private int m588RL(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void copyIn(RIPEMD160Digest rIPEMD160Digest) {
        super.copyIn((GeneralDigest) rIPEMD160Digest);
        this.f1152H0 = rIPEMD160Digest.f1152H0;
        this.f1153H1 = rIPEMD160Digest.f1153H1;
        this.f1154H2 = rIPEMD160Digest.f1154H2;
        this.f1155H3 = rIPEMD160Digest.f1155H3;
        this.f1156H4 = rIPEMD160Digest.f1156H4;
        int[] iArr = rIPEMD160Digest.f1157X;
        System.arraycopy(iArr, 0, this.f1157X, 0, iArr.length);
        this.xOff = rIPEMD160Digest.xOff;
    }

    /* renamed from: f1 */
    private int m589f1(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* renamed from: f2 */
    private int m590f2(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: f3 */
    private int m591f3(int i, int i2, int i3) {
        return (i | (~i2)) ^ i3;
    }

    /* renamed from: f4 */
    private int m592f4(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    /* renamed from: f5 */
    private int m593f5(int i, int i2, int i3) {
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
        return new RIPEMD160Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        unpackWord(this.f1152H0, bArr, i);
        unpackWord(this.f1153H1, bArr, i + 4);
        unpackWord(this.f1154H2, bArr, i + 8);
        unpackWord(this.f1155H3, bArr, i + 12);
        unpackWord(this.f1156H4, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "RIPEMD160";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        int i = this.f1152H0;
        int i2 = this.f1153H1;
        int i3 = this.f1154H2;
        int i4 = this.f1155H3;
        int i5 = this.f1156H4;
        int iM588RL = m588RL(m589f1(i2, i3, i4) + i + this.f1157X[0], 11) + i5;
        int iM588RL2 = m588RL(i3, 10);
        int iM588RL3 = m588RL(m589f1(iM588RL, i2, iM588RL2) + i5 + this.f1157X[1], 14) + i4;
        int iM588RL4 = m588RL(i2, 10);
        int iM588RL5 = m588RL(m589f1(iM588RL3, iM588RL, iM588RL4) + i4 + this.f1157X[2], 15) + iM588RL2;
        int iM588RL6 = m588RL(iM588RL, 10);
        int iM588RL7 = m588RL(iM588RL2 + m589f1(iM588RL5, iM588RL3, iM588RL6) + this.f1157X[3], 12) + iM588RL4;
        int iM588RL8 = m588RL(iM588RL3, 10);
        int iM588RL9 = m588RL(iM588RL4 + m589f1(iM588RL7, iM588RL5, iM588RL8) + this.f1157X[4], 5) + iM588RL6;
        int iM588RL10 = m588RL(iM588RL5, 10);
        int iM588RL11 = m588RL(iM588RL6 + m589f1(iM588RL9, iM588RL7, iM588RL10) + this.f1157X[5], 8) + iM588RL8;
        int iM588RL12 = m588RL(iM588RL7, 10);
        int iM588RL13 = m588RL(iM588RL8 + m589f1(iM588RL11, iM588RL9, iM588RL12) + this.f1157X[6], 7) + iM588RL10;
        int iM588RL14 = m588RL(iM588RL9, 10);
        int iM588RL15 = m588RL(iM588RL10 + m589f1(iM588RL13, iM588RL11, iM588RL14) + this.f1157X[7], 9) + iM588RL12;
        int iM588RL16 = m588RL(iM588RL11, 10);
        int iM588RL17 = m588RL(iM588RL12 + m589f1(iM588RL15, iM588RL13, iM588RL16) + this.f1157X[8], 11) + iM588RL14;
        int iM588RL18 = m588RL(iM588RL13, 10);
        int iM588RL19 = m588RL(iM588RL14 + m589f1(iM588RL17, iM588RL15, iM588RL18) + this.f1157X[9], 13) + iM588RL16;
        int iM588RL20 = m588RL(iM588RL15, 10);
        int iM588RL21 = m588RL(iM588RL16 + m589f1(iM588RL19, iM588RL17, iM588RL20) + this.f1157X[10], 14) + iM588RL18;
        int iM588RL22 = m588RL(iM588RL17, 10);
        int iM588RL23 = m588RL(iM588RL18 + m589f1(iM588RL21, iM588RL19, iM588RL22) + this.f1157X[11], 15) + iM588RL20;
        int iM588RL24 = m588RL(iM588RL19, 10);
        int iM588RL25 = m588RL(iM588RL20 + m589f1(iM588RL23, iM588RL21, iM588RL24) + this.f1157X[12], 6) + iM588RL22;
        int iM588RL26 = m588RL(iM588RL21, 10);
        int iM588RL27 = m588RL(iM588RL22 + m589f1(iM588RL25, iM588RL23, iM588RL26) + this.f1157X[13], 7) + iM588RL24;
        int iM588RL28 = m588RL(iM588RL23, 10);
        int iM588RL29 = m588RL(iM588RL24 + m589f1(iM588RL27, iM588RL25, iM588RL28) + this.f1157X[14], 9) + iM588RL26;
        int iM588RL30 = m588RL(iM588RL25, 10);
        int iM588RL31 = m588RL(iM588RL26 + m589f1(iM588RL29, iM588RL27, iM588RL30) + this.f1157X[15], 8) + iM588RL28;
        int iM588RL32 = m588RL(iM588RL27, 10);
        int iM588RL33 = m588RL(i + m593f5(i2, i3, i4) + this.f1157X[5] + 1352829926, 8) + i5;
        int iM588RL34 = m588RL(i3, 10);
        int iM588RL35 = m588RL(i5 + m593f5(iM588RL33, i2, iM588RL34) + this.f1157X[14] + 1352829926, 9) + i4;
        int iM588RL36 = m588RL(i2, 10);
        int iM588RL37 = m588RL(i4 + m593f5(iM588RL35, iM588RL33, iM588RL36) + this.f1157X[7] + 1352829926, 9) + iM588RL34;
        int iM588RL38 = m588RL(iM588RL33, 10);
        int iM588RL39 = m588RL(iM588RL34 + m593f5(iM588RL37, iM588RL35, iM588RL38) + this.f1157X[0] + 1352829926, 11) + iM588RL36;
        int iM588RL40 = m588RL(iM588RL35, 10);
        int iM588RL41 = m588RL(iM588RL36 + m593f5(iM588RL39, iM588RL37, iM588RL40) + this.f1157X[9] + 1352829926, 13) + iM588RL38;
        int iM588RL42 = m588RL(iM588RL37, 10);
        int iM588RL43 = m588RL(iM588RL38 + m593f5(iM588RL41, iM588RL39, iM588RL42) + this.f1157X[2] + 1352829926, 15) + iM588RL40;
        int iM588RL44 = m588RL(iM588RL39, 10);
        int iM588RL45 = m588RL(iM588RL40 + m593f5(iM588RL43, iM588RL41, iM588RL44) + this.f1157X[11] + 1352829926, 15) + iM588RL42;
        int iM588RL46 = m588RL(iM588RL41, 10);
        int iM588RL47 = m588RL(iM588RL42 + m593f5(iM588RL45, iM588RL43, iM588RL46) + this.f1157X[4] + 1352829926, 5) + iM588RL44;
        int iM588RL48 = m588RL(iM588RL43, 10);
        int iM588RL49 = m588RL(iM588RL44 + m593f5(iM588RL47, iM588RL45, iM588RL48) + this.f1157X[13] + 1352829926, 7) + iM588RL46;
        int iM588RL50 = m588RL(iM588RL45, 10);
        int iM588RL51 = m588RL(iM588RL46 + m593f5(iM588RL49, iM588RL47, iM588RL50) + this.f1157X[6] + 1352829926, 7) + iM588RL48;
        int iM588RL52 = m588RL(iM588RL47, 10);
        int iM588RL53 = m588RL(iM588RL48 + m593f5(iM588RL51, iM588RL49, iM588RL52) + this.f1157X[15] + 1352829926, 8) + iM588RL50;
        int iM588RL54 = m588RL(iM588RL49, 10);
        int iM588RL55 = m588RL(iM588RL50 + m593f5(iM588RL53, iM588RL51, iM588RL54) + this.f1157X[8] + 1352829926, 11) + iM588RL52;
        int iM588RL56 = m588RL(iM588RL51, 10);
        int iM588RL57 = m588RL(iM588RL52 + m593f5(iM588RL55, iM588RL53, iM588RL56) + this.f1157X[1] + 1352829926, 14) + iM588RL54;
        int iM588RL58 = m588RL(iM588RL53, 10);
        int iM588RL59 = m588RL(iM588RL54 + m593f5(iM588RL57, iM588RL55, iM588RL58) + this.f1157X[10] + 1352829926, 14) + iM588RL56;
        int iM588RL60 = m588RL(iM588RL55, 10);
        int iM588RL61 = m588RL(iM588RL56 + m593f5(iM588RL59, iM588RL57, iM588RL60) + this.f1157X[3] + 1352829926, 12) + iM588RL58;
        int iM588RL62 = m588RL(iM588RL57, 10);
        int iM588RL63 = m588RL(iM588RL58 + m593f5(iM588RL61, iM588RL59, iM588RL62) + this.f1157X[12] + 1352829926, 6) + iM588RL60;
        int iM588RL64 = m588RL(iM588RL59, 10);
        int iM588RL65 = m588RL(iM588RL28 + m590f2(iM588RL31, iM588RL29, iM588RL32) + this.f1157X[7] + 1518500249, 7) + iM588RL30;
        int iM588RL66 = m588RL(iM588RL29, 10);
        int iM588RL67 = m588RL(iM588RL30 + m590f2(iM588RL65, iM588RL31, iM588RL66) + this.f1157X[4] + 1518500249, 6) + iM588RL32;
        int iM588RL68 = m588RL(iM588RL31, 10);
        int iM588RL69 = m588RL(iM588RL32 + m590f2(iM588RL67, iM588RL65, iM588RL68) + this.f1157X[13] + 1518500249, 8) + iM588RL66;
        int iM588RL70 = m588RL(iM588RL65, 10);
        int iM588RL71 = m588RL(iM588RL66 + m590f2(iM588RL69, iM588RL67, iM588RL70) + this.f1157X[1] + 1518500249, 13) + iM588RL68;
        int iM588RL72 = m588RL(iM588RL67, 10);
        int iM588RL73 = m588RL(iM588RL68 + m590f2(iM588RL71, iM588RL69, iM588RL72) + this.f1157X[10] + 1518500249, 11) + iM588RL70;
        int iM588RL74 = m588RL(iM588RL69, 10);
        int iM588RL75 = m588RL(iM588RL70 + m590f2(iM588RL73, iM588RL71, iM588RL74) + this.f1157X[6] + 1518500249, 9) + iM588RL72;
        int iM588RL76 = m588RL(iM588RL71, 10);
        int iM588RL77 = m588RL(iM588RL72 + m590f2(iM588RL75, iM588RL73, iM588RL76) + this.f1157X[15] + 1518500249, 7) + iM588RL74;
        int iM588RL78 = m588RL(iM588RL73, 10);
        int iM588RL79 = m588RL(iM588RL74 + m590f2(iM588RL77, iM588RL75, iM588RL78) + this.f1157X[3] + 1518500249, 15) + iM588RL76;
        int iM588RL80 = m588RL(iM588RL75, 10);
        int iM588RL81 = m588RL(iM588RL76 + m590f2(iM588RL79, iM588RL77, iM588RL80) + this.f1157X[12] + 1518500249, 7) + iM588RL78;
        int iM588RL82 = m588RL(iM588RL77, 10);
        int iM588RL83 = m588RL(iM588RL78 + m590f2(iM588RL81, iM588RL79, iM588RL82) + this.f1157X[0] + 1518500249, 12) + iM588RL80;
        int iM588RL84 = m588RL(iM588RL79, 10);
        int iM588RL85 = m588RL(iM588RL80 + m590f2(iM588RL83, iM588RL81, iM588RL84) + this.f1157X[9] + 1518500249, 15) + iM588RL82;
        int iM588RL86 = m588RL(iM588RL81, 10);
        int iM588RL87 = m588RL(iM588RL82 + m590f2(iM588RL85, iM588RL83, iM588RL86) + this.f1157X[5] + 1518500249, 9) + iM588RL84;
        int iM588RL88 = m588RL(iM588RL83, 10);
        int iM588RL89 = m588RL(iM588RL84 + m590f2(iM588RL87, iM588RL85, iM588RL88) + this.f1157X[2] + 1518500249, 11) + iM588RL86;
        int iM588RL90 = m588RL(iM588RL85, 10);
        int iM588RL91 = m588RL(iM588RL86 + m590f2(iM588RL89, iM588RL87, iM588RL90) + this.f1157X[14] + 1518500249, 7) + iM588RL88;
        int iM588RL92 = m588RL(iM588RL87, 10);
        int iM588RL93 = m588RL(iM588RL88 + m590f2(iM588RL91, iM588RL89, iM588RL92) + this.f1157X[11] + 1518500249, 13) + iM588RL90;
        int iM588RL94 = m588RL(iM588RL89, 10);
        int iM588RL95 = m588RL(iM588RL90 + m590f2(iM588RL93, iM588RL91, iM588RL94) + this.f1157X[8] + 1518500249, 12) + iM588RL92;
        int iM588RL96 = m588RL(iM588RL91, 10);
        int iM588RL97 = m588RL(iM588RL60 + m592f4(iM588RL63, iM588RL61, iM588RL64) + this.f1157X[6] + 1548603684, 9) + iM588RL62;
        int iM588RL98 = m588RL(iM588RL61, 10);
        int iM588RL99 = m588RL(iM588RL62 + m592f4(iM588RL97, iM588RL63, iM588RL98) + this.f1157X[11] + 1548603684, 13) + iM588RL64;
        int iM588RL100 = m588RL(iM588RL63, 10);
        int iM588RL101 = m588RL(iM588RL64 + m592f4(iM588RL99, iM588RL97, iM588RL100) + this.f1157X[3] + 1548603684, 15) + iM588RL98;
        int iM588RL102 = m588RL(iM588RL97, 10);
        int iM588RL103 = m588RL(iM588RL98 + m592f4(iM588RL101, iM588RL99, iM588RL102) + this.f1157X[7] + 1548603684, 7) + iM588RL100;
        int iM588RL104 = m588RL(iM588RL99, 10);
        int iM588RL105 = m588RL(iM588RL100 + m592f4(iM588RL103, iM588RL101, iM588RL104) + this.f1157X[0] + 1548603684, 12) + iM588RL102;
        int iM588RL106 = m588RL(iM588RL101, 10);
        int iM588RL107 = m588RL(iM588RL102 + m592f4(iM588RL105, iM588RL103, iM588RL106) + this.f1157X[13] + 1548603684, 8) + iM588RL104;
        int iM588RL108 = m588RL(iM588RL103, 10);
        int iM588RL109 = m588RL(iM588RL104 + m592f4(iM588RL107, iM588RL105, iM588RL108) + this.f1157X[5] + 1548603684, 9) + iM588RL106;
        int iM588RL110 = m588RL(iM588RL105, 10);
        int iM588RL111 = m588RL(iM588RL106 + m592f4(iM588RL109, iM588RL107, iM588RL110) + this.f1157X[10] + 1548603684, 11) + iM588RL108;
        int iM588RL112 = m588RL(iM588RL107, 10);
        int iM588RL113 = m588RL(iM588RL108 + m592f4(iM588RL111, iM588RL109, iM588RL112) + this.f1157X[14] + 1548603684, 7) + iM588RL110;
        int iM588RL114 = m588RL(iM588RL109, 10);
        int iM588RL115 = m588RL(iM588RL110 + m592f4(iM588RL113, iM588RL111, iM588RL114) + this.f1157X[15] + 1548603684, 7) + iM588RL112;
        int iM588RL116 = m588RL(iM588RL111, 10);
        int iM588RL117 = m588RL(iM588RL112 + m592f4(iM588RL115, iM588RL113, iM588RL116) + this.f1157X[8] + 1548603684, 12) + iM588RL114;
        int iM588RL118 = m588RL(iM588RL113, 10);
        int iM588RL119 = m588RL(iM588RL114 + m592f4(iM588RL117, iM588RL115, iM588RL118) + this.f1157X[12] + 1548603684, 7) + iM588RL116;
        int iM588RL120 = m588RL(iM588RL115, 10);
        int iM588RL121 = m588RL(iM588RL116 + m592f4(iM588RL119, iM588RL117, iM588RL120) + this.f1157X[4] + 1548603684, 6) + iM588RL118;
        int iM588RL122 = m588RL(iM588RL117, 10);
        int iM588RL123 = m588RL(iM588RL118 + m592f4(iM588RL121, iM588RL119, iM588RL122) + this.f1157X[9] + 1548603684, 15) + iM588RL120;
        int iM588RL124 = m588RL(iM588RL119, 10);
        int iM588RL125 = m588RL(iM588RL120 + m592f4(iM588RL123, iM588RL121, iM588RL124) + this.f1157X[1] + 1548603684, 13) + iM588RL122;
        int iM588RL126 = m588RL(iM588RL121, 10);
        int iM588RL127 = m588RL(iM588RL122 + m592f4(iM588RL125, iM588RL123, iM588RL126) + this.f1157X[2] + 1548603684, 11) + iM588RL124;
        int iM588RL128 = m588RL(iM588RL123, 10);
        int iM588RL129 = m588RL(iM588RL92 + m591f3(iM588RL95, iM588RL93, iM588RL96) + this.f1157X[3] + 1859775393, 11) + iM588RL94;
        int iM588RL130 = m588RL(iM588RL93, 10);
        int iM588RL131 = m588RL(iM588RL94 + m591f3(iM588RL129, iM588RL95, iM588RL130) + this.f1157X[10] + 1859775393, 13) + iM588RL96;
        int iM588RL132 = m588RL(iM588RL95, 10);
        int iM588RL133 = m588RL(iM588RL96 + m591f3(iM588RL131, iM588RL129, iM588RL132) + this.f1157X[14] + 1859775393, 6) + iM588RL130;
        int iM588RL134 = m588RL(iM588RL129, 10);
        int iM588RL135 = m588RL(iM588RL130 + m591f3(iM588RL133, iM588RL131, iM588RL134) + this.f1157X[4] + 1859775393, 7) + iM588RL132;
        int iM588RL136 = m588RL(iM588RL131, 10);
        int iM588RL137 = m588RL(iM588RL132 + m591f3(iM588RL135, iM588RL133, iM588RL136) + this.f1157X[9] + 1859775393, 14) + iM588RL134;
        int iM588RL138 = m588RL(iM588RL133, 10);
        int iM588RL139 = m588RL(iM588RL134 + m591f3(iM588RL137, iM588RL135, iM588RL138) + this.f1157X[15] + 1859775393, 9) + iM588RL136;
        int iM588RL140 = m588RL(iM588RL135, 10);
        int iM588RL141 = m588RL(iM588RL136 + m591f3(iM588RL139, iM588RL137, iM588RL140) + this.f1157X[8] + 1859775393, 13) + iM588RL138;
        int iM588RL142 = m588RL(iM588RL137, 10);
        int iM588RL143 = m588RL(iM588RL138 + m591f3(iM588RL141, iM588RL139, iM588RL142) + this.f1157X[1] + 1859775393, 15) + iM588RL140;
        int iM588RL144 = m588RL(iM588RL139, 10);
        int iM588RL145 = m588RL(iM588RL140 + m591f3(iM588RL143, iM588RL141, iM588RL144) + this.f1157X[2] + 1859775393, 14) + iM588RL142;
        int iM588RL146 = m588RL(iM588RL141, 10);
        int iM588RL147 = m588RL(iM588RL142 + m591f3(iM588RL145, iM588RL143, iM588RL146) + this.f1157X[7] + 1859775393, 8) + iM588RL144;
        int iM588RL148 = m588RL(iM588RL143, 10);
        int iM588RL149 = m588RL(iM588RL144 + m591f3(iM588RL147, iM588RL145, iM588RL148) + this.f1157X[0] + 1859775393, 13) + iM588RL146;
        int iM588RL150 = m588RL(iM588RL145, 10);
        int iM588RL151 = m588RL(iM588RL146 + m591f3(iM588RL149, iM588RL147, iM588RL150) + this.f1157X[6] + 1859775393, 6) + iM588RL148;
        int iM588RL152 = m588RL(iM588RL147, 10);
        int iM588RL153 = m588RL(iM588RL148 + m591f3(iM588RL151, iM588RL149, iM588RL152) + this.f1157X[13] + 1859775393, 5) + iM588RL150;
        int iM588RL154 = m588RL(iM588RL149, 10);
        int iM588RL155 = m588RL(iM588RL150 + m591f3(iM588RL153, iM588RL151, iM588RL154) + this.f1157X[11] + 1859775393, 12) + iM588RL152;
        int iM588RL156 = m588RL(iM588RL151, 10);
        int iM588RL157 = m588RL(iM588RL152 + m591f3(iM588RL155, iM588RL153, iM588RL156) + this.f1157X[5] + 1859775393, 7) + iM588RL154;
        int iM588RL158 = m588RL(iM588RL153, 10);
        int iM588RL159 = m588RL(iM588RL154 + m591f3(iM588RL157, iM588RL155, iM588RL158) + this.f1157X[12] + 1859775393, 5) + iM588RL156;
        int iM588RL160 = m588RL(iM588RL155, 10);
        int iM588RL161 = m588RL(iM588RL124 + m591f3(iM588RL127, iM588RL125, iM588RL128) + this.f1157X[15] + 1836072691, 9) + iM588RL126;
        int iM588RL162 = m588RL(iM588RL125, 10);
        int iM588RL163 = m588RL(iM588RL126 + m591f3(iM588RL161, iM588RL127, iM588RL162) + this.f1157X[5] + 1836072691, 7) + iM588RL128;
        int iM588RL164 = m588RL(iM588RL127, 10);
        int iM588RL165 = m588RL(iM588RL128 + m591f3(iM588RL163, iM588RL161, iM588RL164) + this.f1157X[1] + 1836072691, 15) + iM588RL162;
        int iM588RL166 = m588RL(iM588RL161, 10);
        int iM588RL167 = m588RL(iM588RL162 + m591f3(iM588RL165, iM588RL163, iM588RL166) + this.f1157X[3] + 1836072691, 11) + iM588RL164;
        int iM588RL168 = m588RL(iM588RL163, 10);
        int iM588RL169 = m588RL(iM588RL164 + m591f3(iM588RL167, iM588RL165, iM588RL168) + this.f1157X[7] + 1836072691, 8) + iM588RL166;
        int iM588RL170 = m588RL(iM588RL165, 10);
        int iM588RL171 = m588RL(iM588RL166 + m591f3(iM588RL169, iM588RL167, iM588RL170) + this.f1157X[14] + 1836072691, 6) + iM588RL168;
        int iM588RL172 = m588RL(iM588RL167, 10);
        int iM588RL173 = m588RL(iM588RL168 + m591f3(iM588RL171, iM588RL169, iM588RL172) + this.f1157X[6] + 1836072691, 6) + iM588RL170;
        int iM588RL174 = m588RL(iM588RL169, 10);
        int iM588RL175 = m588RL(iM588RL170 + m591f3(iM588RL173, iM588RL171, iM588RL174) + this.f1157X[9] + 1836072691, 14) + iM588RL172;
        int iM588RL176 = m588RL(iM588RL171, 10);
        int iM588RL177 = m588RL(iM588RL172 + m591f3(iM588RL175, iM588RL173, iM588RL176) + this.f1157X[11] + 1836072691, 12) + iM588RL174;
        int iM588RL178 = m588RL(iM588RL173, 10);
        int iM588RL179 = m588RL(iM588RL174 + m591f3(iM588RL177, iM588RL175, iM588RL178) + this.f1157X[8] + 1836072691, 13) + iM588RL176;
        int iM588RL180 = m588RL(iM588RL175, 10);
        int iM588RL181 = m588RL(iM588RL176 + m591f3(iM588RL179, iM588RL177, iM588RL180) + this.f1157X[12] + 1836072691, 5) + iM588RL178;
        int iM588RL182 = m588RL(iM588RL177, 10);
        int iM588RL183 = m588RL(iM588RL178 + m591f3(iM588RL181, iM588RL179, iM588RL182) + this.f1157X[2] + 1836072691, 14) + iM588RL180;
        int iM588RL184 = m588RL(iM588RL179, 10);
        int iM588RL185 = m588RL(iM588RL180 + m591f3(iM588RL183, iM588RL181, iM588RL184) + this.f1157X[10] + 1836072691, 13) + iM588RL182;
        int iM588RL186 = m588RL(iM588RL181, 10);
        int iM588RL187 = m588RL(iM588RL182 + m591f3(iM588RL185, iM588RL183, iM588RL186) + this.f1157X[0] + 1836072691, 13) + iM588RL184;
        int iM588RL188 = m588RL(iM588RL183, 10);
        int iM588RL189 = m588RL(iM588RL184 + m591f3(iM588RL187, iM588RL185, iM588RL188) + this.f1157X[4] + 1836072691, 7) + iM588RL186;
        int iM588RL190 = m588RL(iM588RL185, 10);
        int iM588RL191 = m588RL(iM588RL186 + m591f3(iM588RL189, iM588RL187, iM588RL190) + this.f1157X[13] + 1836072691, 5) + iM588RL188;
        int iM588RL192 = m588RL(iM588RL187, 10);
        int iM588RL193 = m588RL(((iM588RL156 + m592f4(iM588RL159, iM588RL157, iM588RL160)) + this.f1157X[1]) - 1894007588, 11) + iM588RL158;
        int iM588RL194 = m588RL(iM588RL157, 10);
        int iM588RL195 = m588RL(((iM588RL158 + m592f4(iM588RL193, iM588RL159, iM588RL194)) + this.f1157X[9]) - 1894007588, 12) + iM588RL160;
        int iM588RL196 = m588RL(iM588RL159, 10);
        int iM588RL197 = m588RL(((iM588RL160 + m592f4(iM588RL195, iM588RL193, iM588RL196)) + this.f1157X[11]) - 1894007588, 14) + iM588RL194;
        int iM588RL198 = m588RL(iM588RL193, 10);
        int iM588RL199 = m588RL(((iM588RL194 + m592f4(iM588RL197, iM588RL195, iM588RL198)) + this.f1157X[10]) - 1894007588, 15) + iM588RL196;
        int iM588RL200 = m588RL(iM588RL195, 10);
        int iM588RL201 = m588RL(((iM588RL196 + m592f4(iM588RL199, iM588RL197, iM588RL200)) + this.f1157X[0]) - 1894007588, 14) + iM588RL198;
        int iM588RL202 = m588RL(iM588RL197, 10);
        int iM588RL203 = m588RL(((iM588RL198 + m592f4(iM588RL201, iM588RL199, iM588RL202)) + this.f1157X[8]) - 1894007588, 15) + iM588RL200;
        int iM588RL204 = m588RL(iM588RL199, 10);
        int iM588RL205 = m588RL(((iM588RL200 + m592f4(iM588RL203, iM588RL201, iM588RL204)) + this.f1157X[12]) - 1894007588, 9) + iM588RL202;
        int iM588RL206 = m588RL(iM588RL201, 10);
        int iM588RL207 = m588RL(((iM588RL202 + m592f4(iM588RL205, iM588RL203, iM588RL206)) + this.f1157X[4]) - 1894007588, 8) + iM588RL204;
        int iM588RL208 = m588RL(iM588RL203, 10);
        int iM588RL209 = m588RL(((iM588RL204 + m592f4(iM588RL207, iM588RL205, iM588RL208)) + this.f1157X[13]) - 1894007588, 9) + iM588RL206;
        int iM588RL210 = m588RL(iM588RL205, 10);
        int iM588RL211 = m588RL(((iM588RL206 + m592f4(iM588RL209, iM588RL207, iM588RL210)) + this.f1157X[3]) - 1894007588, 14) + iM588RL208;
        int iM588RL212 = m588RL(iM588RL207, 10);
        int iM588RL213 = m588RL(((iM588RL208 + m592f4(iM588RL211, iM588RL209, iM588RL212)) + this.f1157X[7]) - 1894007588, 5) + iM588RL210;
        int iM588RL214 = m588RL(iM588RL209, 10);
        int iM588RL215 = m588RL(((iM588RL210 + m592f4(iM588RL213, iM588RL211, iM588RL214)) + this.f1157X[15]) - 1894007588, 6) + iM588RL212;
        int iM588RL216 = m588RL(iM588RL211, 10);
        int iM588RL217 = m588RL(((iM588RL212 + m592f4(iM588RL215, iM588RL213, iM588RL216)) + this.f1157X[14]) - 1894007588, 8) + iM588RL214;
        int iM588RL218 = m588RL(iM588RL213, 10);
        int iM588RL219 = m588RL(((iM588RL214 + m592f4(iM588RL217, iM588RL215, iM588RL218)) + this.f1157X[5]) - 1894007588, 6) + iM588RL216;
        int iM588RL220 = m588RL(iM588RL215, 10);
        int iM588RL221 = m588RL(((iM588RL216 + m592f4(iM588RL219, iM588RL217, iM588RL220)) + this.f1157X[6]) - 1894007588, 5) + iM588RL218;
        int iM588RL222 = m588RL(iM588RL217, 10);
        int iM588RL223 = m588RL(((iM588RL218 + m592f4(iM588RL221, iM588RL219, iM588RL222)) + this.f1157X[2]) - 1894007588, 12) + iM588RL220;
        int iM588RL224 = m588RL(iM588RL219, 10);
        int iM588RL225 = m588RL(iM588RL188 + m590f2(iM588RL191, iM588RL189, iM588RL192) + this.f1157X[8] + 2053994217, 15) + iM588RL190;
        int iM588RL226 = m588RL(iM588RL189, 10);
        int iM588RL227 = m588RL(iM588RL190 + m590f2(iM588RL225, iM588RL191, iM588RL226) + this.f1157X[6] + 2053994217, 5) + iM588RL192;
        int iM588RL228 = m588RL(iM588RL191, 10);
        int iM588RL229 = m588RL(iM588RL192 + m590f2(iM588RL227, iM588RL225, iM588RL228) + this.f1157X[4] + 2053994217, 8) + iM588RL226;
        int iM588RL230 = m588RL(iM588RL225, 10);
        int iM588RL231 = m588RL(iM588RL226 + m590f2(iM588RL229, iM588RL227, iM588RL230) + this.f1157X[1] + 2053994217, 11) + iM588RL228;
        int iM588RL232 = m588RL(iM588RL227, 10);
        int iM588RL233 = m588RL(iM588RL228 + m590f2(iM588RL231, iM588RL229, iM588RL232) + this.f1157X[3] + 2053994217, 14) + iM588RL230;
        int iM588RL234 = m588RL(iM588RL229, 10);
        int iM588RL235 = m588RL(iM588RL230 + m590f2(iM588RL233, iM588RL231, iM588RL234) + this.f1157X[11] + 2053994217, 14) + iM588RL232;
        int iM588RL236 = m588RL(iM588RL231, 10);
        int iM588RL237 = m588RL(iM588RL232 + m590f2(iM588RL235, iM588RL233, iM588RL236) + this.f1157X[15] + 2053994217, 6) + iM588RL234;
        int iM588RL238 = m588RL(iM588RL233, 10);
        int iM588RL239 = m588RL(iM588RL234 + m590f2(iM588RL237, iM588RL235, iM588RL238) + this.f1157X[0] + 2053994217, 14) + iM588RL236;
        int iM588RL240 = m588RL(iM588RL235, 10);
        int iM588RL241 = m588RL(iM588RL236 + m590f2(iM588RL239, iM588RL237, iM588RL240) + this.f1157X[5] + 2053994217, 6) + iM588RL238;
        int iM588RL242 = m588RL(iM588RL237, 10);
        int iM588RL243 = m588RL(iM588RL238 + m590f2(iM588RL241, iM588RL239, iM588RL242) + this.f1157X[12] + 2053994217, 9) + iM588RL240;
        int iM588RL244 = m588RL(iM588RL239, 10);
        int iM588RL245 = m588RL(iM588RL240 + m590f2(iM588RL243, iM588RL241, iM588RL244) + this.f1157X[2] + 2053994217, 12) + iM588RL242;
        int iM588RL246 = m588RL(iM588RL241, 10);
        int iM588RL247 = m588RL(iM588RL242 + m590f2(iM588RL245, iM588RL243, iM588RL246) + this.f1157X[13] + 2053994217, 9) + iM588RL244;
        int iM588RL248 = m588RL(iM588RL243, 10);
        int iM588RL249 = m588RL(iM588RL244 + m590f2(iM588RL247, iM588RL245, iM588RL248) + this.f1157X[9] + 2053994217, 12) + iM588RL246;
        int iM588RL250 = m588RL(iM588RL245, 10);
        int iM588RL251 = m588RL(iM588RL246 + m590f2(iM588RL249, iM588RL247, iM588RL250) + this.f1157X[7] + 2053994217, 5) + iM588RL248;
        int iM588RL252 = m588RL(iM588RL247, 10);
        int iM588RL253 = m588RL(iM588RL248 + m590f2(iM588RL251, iM588RL249, iM588RL252) + this.f1157X[10] + 2053994217, 15) + iM588RL250;
        int iM588RL254 = m588RL(iM588RL249, 10);
        int iM588RL255 = m588RL(iM588RL250 + m590f2(iM588RL253, iM588RL251, iM588RL254) + this.f1157X[14] + 2053994217, 8) + iM588RL252;
        int iM588RL256 = m588RL(iM588RL251, 10);
        int iM588RL257 = m588RL(((iM588RL220 + m593f5(iM588RL223, iM588RL221, iM588RL224)) + this.f1157X[4]) - 1454113458, 9) + iM588RL222;
        int iM588RL258 = m588RL(iM588RL221, 10);
        int iM588RL259 = m588RL(((iM588RL222 + m593f5(iM588RL257, iM588RL223, iM588RL258)) + this.f1157X[0]) - 1454113458, 15) + iM588RL224;
        int iM588RL260 = m588RL(iM588RL223, 10);
        int iM588RL261 = m588RL(((iM588RL224 + m593f5(iM588RL259, iM588RL257, iM588RL260)) + this.f1157X[5]) - 1454113458, 5) + iM588RL258;
        int iM588RL262 = m588RL(iM588RL257, 10);
        int iM588RL263 = m588RL(((iM588RL258 + m593f5(iM588RL261, iM588RL259, iM588RL262)) + this.f1157X[9]) - 1454113458, 11) + iM588RL260;
        int iM588RL264 = m588RL(iM588RL259, 10);
        int iM588RL265 = m588RL(((iM588RL260 + m593f5(iM588RL263, iM588RL261, iM588RL264)) + this.f1157X[7]) - 1454113458, 6) + iM588RL262;
        int iM588RL266 = m588RL(iM588RL261, 10);
        int iM588RL267 = m588RL(((iM588RL262 + m593f5(iM588RL265, iM588RL263, iM588RL266)) + this.f1157X[12]) - 1454113458, 8) + iM588RL264;
        int iM588RL268 = m588RL(iM588RL263, 10);
        int iM588RL269 = m588RL(((iM588RL264 + m593f5(iM588RL267, iM588RL265, iM588RL268)) + this.f1157X[2]) - 1454113458, 13) + iM588RL266;
        int iM588RL270 = m588RL(iM588RL265, 10);
        int iM588RL271 = m588RL(((iM588RL266 + m593f5(iM588RL269, iM588RL267, iM588RL270)) + this.f1157X[10]) - 1454113458, 12) + iM588RL268;
        int iM588RL272 = m588RL(iM588RL267, 10);
        int iM588RL273 = m588RL(((iM588RL268 + m593f5(iM588RL271, iM588RL269, iM588RL272)) + this.f1157X[14]) - 1454113458, 5) + iM588RL270;
        int iM588RL274 = m588RL(iM588RL269, 10);
        int iM588RL275 = m588RL(((iM588RL270 + m593f5(iM588RL273, iM588RL271, iM588RL274)) + this.f1157X[1]) - 1454113458, 12) + iM588RL272;
        int iM588RL276 = m588RL(iM588RL271, 10);
        int iM588RL277 = m588RL(((iM588RL272 + m593f5(iM588RL275, iM588RL273, iM588RL276)) + this.f1157X[3]) - 1454113458, 13) + iM588RL274;
        int iM588RL278 = m588RL(iM588RL273, 10);
        int iM588RL279 = m588RL(((iM588RL274 + m593f5(iM588RL277, iM588RL275, iM588RL278)) + this.f1157X[8]) - 1454113458, 14) + iM588RL276;
        int iM588RL280 = m588RL(iM588RL275, 10);
        int iM588RL281 = m588RL(((iM588RL276 + m593f5(iM588RL279, iM588RL277, iM588RL280)) + this.f1157X[11]) - 1454113458, 11) + iM588RL278;
        int iM588RL282 = m588RL(iM588RL277, 10);
        int iM588RL283 = m588RL(((iM588RL278 + m593f5(iM588RL281, iM588RL279, iM588RL282)) + this.f1157X[6]) - 1454113458, 8) + iM588RL280;
        int iM588RL284 = m588RL(iM588RL279, 10);
        int iM588RL285 = m588RL(((iM588RL280 + m593f5(iM588RL283, iM588RL281, iM588RL284)) + this.f1157X[15]) - 1454113458, 5) + iM588RL282;
        int iM588RL286 = m588RL(iM588RL281, 10);
        int iM588RL287 = m588RL(((iM588RL282 + m593f5(iM588RL285, iM588RL283, iM588RL286)) + this.f1157X[13]) - 1454113458, 6) + iM588RL284;
        int iM588RL288 = m588RL(iM588RL283, 10);
        int iM588RL289 = m588RL(iM588RL252 + m589f1(iM588RL255, iM588RL253, iM588RL256) + this.f1157X[12], 8) + iM588RL254;
        int iM588RL290 = m588RL(iM588RL253, 10);
        int iM588RL291 = m588RL(iM588RL254 + m589f1(iM588RL289, iM588RL255, iM588RL290) + this.f1157X[15], 5) + iM588RL256;
        int iM588RL292 = m588RL(iM588RL255, 10);
        int iM588RL293 = m588RL(iM588RL256 + m589f1(iM588RL291, iM588RL289, iM588RL292) + this.f1157X[10], 12) + iM588RL290;
        int iM588RL294 = m588RL(iM588RL289, 10);
        int iM588RL295 = m588RL(iM588RL290 + m589f1(iM588RL293, iM588RL291, iM588RL294) + this.f1157X[4], 9) + iM588RL292;
        int iM588RL296 = m588RL(iM588RL291, 10);
        int iM588RL297 = m588RL(iM588RL292 + m589f1(iM588RL295, iM588RL293, iM588RL296) + this.f1157X[1], 12) + iM588RL294;
        int iM588RL298 = m588RL(iM588RL293, 10);
        int iM588RL299 = m588RL(iM588RL294 + m589f1(iM588RL297, iM588RL295, iM588RL298) + this.f1157X[5], 5) + iM588RL296;
        int iM588RL300 = m588RL(iM588RL295, 10);
        int iM588RL301 = m588RL(iM588RL296 + m589f1(iM588RL299, iM588RL297, iM588RL300) + this.f1157X[8], 14) + iM588RL298;
        int iM588RL302 = m588RL(iM588RL297, 10);
        int iM588RL303 = m588RL(iM588RL298 + m589f1(iM588RL301, iM588RL299, iM588RL302) + this.f1157X[7], 6) + iM588RL300;
        int iM588RL304 = m588RL(iM588RL299, 10);
        int iM588RL305 = m588RL(iM588RL300 + m589f1(iM588RL303, iM588RL301, iM588RL304) + this.f1157X[6], 8) + iM588RL302;
        int iM588RL306 = m588RL(iM588RL301, 10);
        int iM588RL307 = m588RL(iM588RL302 + m589f1(iM588RL305, iM588RL303, iM588RL306) + this.f1157X[2], 13) + iM588RL304;
        int iM588RL308 = m588RL(iM588RL303, 10);
        int iM588RL309 = m588RL(iM588RL304 + m589f1(iM588RL307, iM588RL305, iM588RL308) + this.f1157X[13], 6) + iM588RL306;
        int iM588RL310 = m588RL(iM588RL305, 10);
        int iM588RL311 = m588RL(iM588RL306 + m589f1(iM588RL309, iM588RL307, iM588RL310) + this.f1157X[14], 5) + iM588RL308;
        int iM588RL312 = m588RL(iM588RL307, 10);
        int iM588RL313 = m588RL(iM588RL308 + m589f1(iM588RL311, iM588RL309, iM588RL312) + this.f1157X[0], 15) + iM588RL310;
        int iM588RL314 = m588RL(iM588RL309, 10);
        int iM588RL315 = m588RL(iM588RL310 + m589f1(iM588RL313, iM588RL311, iM588RL314) + this.f1157X[3], 13) + iM588RL312;
        int iM588RL316 = m588RL(iM588RL311, 10);
        int iM588RL317 = m588RL(iM588RL312 + m589f1(iM588RL315, iM588RL313, iM588RL316) + this.f1157X[9], 11) + iM588RL314;
        int iM588RL318 = m588RL(iM588RL313, 10);
        int iM588RL319 = m588RL(iM588RL314 + m589f1(iM588RL317, iM588RL315, iM588RL318) + this.f1157X[11], 11) + iM588RL316;
        int iM588RL320 = m588RL(iM588RL315, 10) + iM588RL285 + this.f1153H1;
        this.f1153H1 = this.f1154H2 + iM588RL288 + iM588RL318;
        this.f1154H2 = this.f1155H3 + iM588RL286 + iM588RL316;
        this.f1155H3 = this.f1156H4 + iM588RL284 + iM588RL319;
        this.f1156H4 = this.f1152H0 + iM588RL287 + iM588RL317;
        this.f1152H0 = iM588RL320;
        this.xOff = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.f1157X;
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
        int[] iArr = this.f1157X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        int[] iArr = this.f1157X;
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
        this.f1152H0 = 1732584193;
        this.f1153H1 = -271733879;
        this.f1154H2 = -1732584194;
        this.f1155H3 = 271733878;
        this.f1156H4 = -1009589776;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f1157X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((RIPEMD160Digest) memoable);
    }
}
