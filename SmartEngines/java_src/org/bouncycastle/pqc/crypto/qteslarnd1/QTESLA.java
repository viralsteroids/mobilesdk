package org.bouncycastle.pqc.crypto.qteslarnd1;

import java.security.SecureRandom;

/* loaded from: classes2.dex */
public class QTESLA {
    private static int absolute(int i) {
        int i2 = i >> 31;
        return (i ^ i2) - i2;
    }

    private static long absolute(long j) {
        long j2 = j >> 63;
        return (j ^ j2) - j2;
    }

    private static boolean checkPolynomial(int[] iArr, int i, int i2, int i3) {
        int i4;
        int[] iArr2 = new int[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            iArr2[i5] = absolute(iArr[i5]);
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            while (true) {
                i4 = i2 - 1;
                if (i8 < i4) {
                    int i9 = i8 + 1;
                    int i10 = iArr2[i9];
                    int i11 = iArr2[i8];
                    int i12 = (i10 - i11) >> 31;
                    int i13 = ~i12;
                    iArr2[i9] = (i10 & i13) | (i11 & i12);
                    iArr2[i8] = (i10 & i12) | (i11 & i13);
                    i8 = i9;
                }
            }
            i6 += iArr2[i4];
            i2--;
        }
        return i6 > i;
    }

    private static boolean checkPolynomial(long[] jArr, int i, int i2, int i3, int i4) {
        int i5;
        short[] sArr = new short[i3];
        for (int i6 = 0; i6 < i3; i6++) {
            sArr[i6] = (short) absolute(jArr[i + i6]);
        }
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            while (true) {
                i5 = i3 - 1;
                if (i9 < i5) {
                    int i10 = i9 + 1;
                    short s = sArr[i10];
                    short s2 = sArr[i9];
                    short s3 = (short) ((s - s2) >> 15);
                    int i11 = ~s3;
                    sArr[i10] = (short) ((s & i11) | (s2 & s3));
                    sArr[i9] = (short) ((s & s3) | (s2 & i11));
                    i9 = i10;
                }
            }
            i7 += sArr[i5];
            i3--;
        }
        return i7 > i2;
    }

    private static int generateKeyPair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom, int i, int i2, int i3, int i4, long j, int i5, int i6, int i7, double d, long[] jArr, int i8, int i9) {
        long[] jArr2;
        int i10;
        char c;
        int i11 = i;
        int i12 = i2;
        char c2 = ' ';
        byte[] bArr3 = new byte[32];
        int i13 = (i12 + 3) * 32;
        byte[] bArr4 = new byte[i13];
        long[] jArr3 = new long[i11];
        long[] jArr4 = new long[i11];
        int i14 = i11 * i12;
        long[] jArr5 = new long[i14];
        long[] jArr6 = new long[i14];
        long[] jArr7 = new long[i14];
        secureRandom.nextBytes(bArr3);
        if (i4 == 485978113) {
            jArr2 = jArr6;
            i10 = 485978113;
            HashUtils.secureHashAlgorithmKECCAK128(bArr4, 0, i13, bArr3, 0, 32);
        } else {
            jArr2 = jArr6;
            i10 = 485978113;
        }
        if (i4 == 1129725953) {
            HashUtils.secureHashAlgorithmKECCAK256(bArr4, 0, i13, bArr3, 0, 32);
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i16 < i12) {
            while (true) {
                if (i4 == i10) {
                    c = c2;
                    i17++;
                    Sample.polynomialGaussSamplerIP(jArr5, i11 * i16, bArr4, i16 * 32, i17);
                } else {
                    c = c2;
                }
                if (i4 == 1129725953) {
                    i17++;
                    Sample.polynomialGaussSamplerIIIP(jArr5, i11 * i16, bArr4, i16 * 32, i17);
                }
                if (!checkPolynomial(jArr5, i11 * i16, i8, i11, i3)) {
                    break;
                }
                c2 = c;
            }
            i16++;
            c2 = c;
        }
        while (true) {
            if (i4 == i10) {
                i17++;
                Sample.polynomialGaussSamplerIP(jArr3, i15, bArr4, i12 * 32, i17);
            }
            if (i4 == 1129725953) {
                i17++;
                Sample.polynomialGaussSamplerIIIP(jArr3, i15, bArr4, i12 * 32, i17);
            }
            if (!checkPolynomial(jArr3, i15, i9, i11, i3)) {
                break;
            }
            i15 = i15;
            i11 = i;
            i12 = i2;
        }
        int i18 = (i12 + 1) * 32;
        long[] jArr8 = jArr7;
        int i19 = i15;
        long[] jArr9 = jArr2;
        Polynomial.polynomialUniform(jArr9, bArr4, i18, i11, i12, i4, j, i5, i6, i7);
        int i20 = i12;
        Polynomial.polynomialNumberTheoreticTransform(jArr4, jArr3, i11);
        int i21 = i19;
        while (i21 < i20) {
            int i22 = i21;
            int i23 = i11 * i22;
            long[] jArr10 = jArr4;
            long[] jArr11 = jArr9;
            long[] jArr12 = jArr8;
            Polynomial.polynomialMultiplication(jArr12, i23, jArr11, i23, jArr10, 0, i, i4, j);
            long[] jArr13 = jArr5;
            long[] jArr14 = jArr8;
            Polynomial.polynomialAddition(jArr14, i23, jArr12, i23, jArr13, i23, i);
            i11 = i;
            for (int i24 = i19; i24 < i11; i24++) {
                long j2 = i4;
                int i25 = i23 + i24;
                long j3 = jArr14[i25];
                jArr14[i25] = j3 - (j2 & ((j2 - j3) >> 63));
            }
            jArr5 = jArr13;
            jArr8 = jArr14;
            jArr9 = jArr11;
            jArr4 = jArr10;
            i21 = i22 + 1;
        }
        long[] jArr15 = jArr8;
        Pack.packPrivateKey(bArr2, jArr3, jArr5, bArr4, i18, i11, i20);
        if (i4 == i10) {
            Pack.encodePublicKeyIP(bArr, jArr15, bArr4, i18);
        }
        if (i4 == 1129725953) {
            Pack.encodePublicKeyIIIP(bArr, jArr15, bArr4, i18);
        }
        return i19;
    }

    private static int generateKeyPair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom, int i, int i2, int i3, long j, int i4, int i5, int i6, double d, int[] iArr, int i7, int i8) {
        byte[] bArr3;
        int i9;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int i10;
        int i11;
        boolean z;
        int[] iArr6;
        int[] iArr7;
        boolean z2;
        int i12;
        int i13;
        int[] iArr8;
        byte[] bArr4;
        byte[] bArr5;
        int[] iArr9;
        int i14 = i;
        int i15 = 32;
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[128];
        int[] iArr10 = new int[i14];
        int[] iArr11 = new int[i14];
        int[] iArr12 = new int[i14];
        int[] iArr13 = new int[i14];
        secureRandom.nextBytes(bArr6);
        int i16 = Parameter.Q_I;
        if (i3 == 4205569) {
            bArr3 = bArr6;
            HashUtils.secureHashAlgorithmKECCAK128(bArr7, 0, 128, bArr3, 0, 32);
        } else {
            bArr3 = bArr6;
        }
        int i17 = Parameter.Q_III_SPEED;
        int i18 = Parameter.Q_III_SIZE;
        if (i3 == 4206593 || i3 == 8404993) {
            HashUtils.secureHashAlgorithmKECCAK256(bArr7, 0, 128, bArr3, 0, 32);
        }
        int i19 = 0;
        int i20 = 0;
        while (true) {
            if (i3 == i16) {
                i20++;
                Sample.polynomialGaussSamplerI(iArr11, 0, bArr7, 0, i20);
            }
            if (i3 == i18) {
                int i21 = i20 + 1;
                iArr2 = iArr11;
                iArr5 = iArr13;
                iArr3 = iArr10;
                iArr4 = iArr12;
                i11 = i16;
                Sample.polynomialGaussSamplerIII(iArr2, 0, bArr7, 0, i21, i14, d, Sample.EXPONENTIAL_DISTRIBUTION_III_SIZE);
                i10 = i21;
                i9 = Parameter.Q_III_SPEED;
            } else {
                int[] iArr14 = iArr11;
                i9 = i17;
                iArr2 = iArr14;
                iArr3 = iArr10;
                iArr4 = iArr12;
                iArr5 = iArr13;
                i10 = i20;
                i11 = i16;
            }
            if (i3 == i9) {
                int i22 = i10 + 1;
                i14 = i;
                Sample.polynomialGaussSamplerIII(iArr2, 0, bArr7, 0, i22, i14, d, Sample.EXPONENTIAL_DISTRIBUTION_III_SPEED);
                i10 = i22;
            } else {
                i14 = i;
            }
            z = true;
            if (!checkPolynomial(iArr2, i7, i14, i2)) {
                break;
            }
            i16 = i11;
            iArr11 = iArr2;
            iArr12 = iArr4;
            iArr13 = iArr5;
            i18 = Parameter.Q_III_SIZE;
            i20 = i10;
            iArr10 = iArr3;
            i17 = Parameter.Q_III_SPEED;
        }
        while (true) {
            if (i3 == i11) {
                i10++;
                Sample.polynomialGaussSamplerI(iArr3, i19, bArr7, i15, i10);
            }
            if (i3 == 4206593) {
                int i23 = i10 + 1;
                int[] iArr15 = iArr3;
                iArr6 = iArr2;
                iArr7 = iArr15;
                z2 = z;
                Sample.polynomialGaussSamplerIII(iArr7, 0, bArr7, 32, i23, i14, d, Sample.EXPONENTIAL_DISTRIBUTION_III_SIZE);
                i10 = i23;
            } else {
                int[] iArr16 = iArr3;
                iArr6 = iArr2;
                iArr7 = iArr16;
                z2 = z;
            }
            if (i3 == 8404993) {
                int i24 = i10 + 1;
                i14 = i;
                i12 = i19;
                i13 = 8404993;
                Sample.polynomialGaussSamplerIII(iArr7, 0, bArr7, 32, i24, i14, d, Sample.EXPONENTIAL_DISTRIBUTION_III_SPEED);
                i10 = i24;
            } else {
                i14 = i;
                i12 = i19;
                i13 = 8404993;
            }
            if (checkPolynomial(iArr7, i8, i14, i2) != z2) {
                break;
            }
            byte[] bArr8 = bArr7;
            int i25 = i10;
            int[] iArr17 = iArr6;
            iArr3 = iArr7;
            iArr2 = iArr17;
            i19 = i12;
            i10 = i25;
            bArr7 = bArr8;
            z = z2;
            i15 = 32;
        }
        byte[] bArr9 = bArr7;
        int[] iArr18 = iArr4;
        int[] iArr19 = iArr7;
        int i26 = i14;
        Polynomial.polynomialUniform(iArr18, bArr9, 64, i26, i3, j, i4, i5, i6);
        int[] iArr20 = iArr5;
        Polynomial.polynomialMultiplication(iArr20, iArr18, iArr19, i26, i3, j, iArr);
        Polynomial.polynomialAdditionCorrection(iArr20, iArr20, iArr6, i26, i3);
        if (i3 == i11) {
            Pack.encodePrivateKeyI(bArr2, iArr19, iArr6, bArr9, 64);
            Pack.encodePublicKey(bArr, iArr20, bArr9, 64, 512, 23);
            iArr8 = iArr20;
            bArr4 = bArr9;
        } else {
            iArr8 = iArr20;
            bArr4 = bArr9;
        }
        if (i3 == 4206593) {
            Pack.encodePrivateKeyIIISize(bArr2, iArr19, iArr6, bArr4, 64);
            byte[] bArr10 = bArr4;
            int[] iArr21 = iArr8;
            Pack.encodePublicKey(bArr, iArr21, bArr10, 64, 1024, 23);
            iArr9 = iArr21;
            bArr5 = bArr10;
        } else {
            bArr5 = bArr4;
            iArr9 = iArr8;
        }
        if (i3 == i13) {
            Pack.encodePrivateKeyIIISpeed(bArr2, iArr19, iArr6, bArr5, 64);
            Pack.encodePublicKeyIIISpeed(bArr, iArr9, bArr5, 64);
        }
        return i12;
    }

    public static int generateKeyPairI(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        return generateKeyPair(bArr, bArr2, secureRandom, 512, 30, Parameter.Q_I, Parameter.Q_INVERSE_I, 23, 19, Parameter.INVERSE_NUMBER_THEORETIC_TRANSFORM_I, 27.0d, PolynomialHeuristic.ZETA_I, 1586, 1586);
    }

    public static int generateKeyPairIIIP(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        return generateKeyPair(bArr, bArr2, secureRandom, 2048, 5, 40, Parameter.Q_III_P, Parameter.Q_INVERSE_III_P, 31, 180, Parameter.INVERSE_NUMBER_THEORETIC_TRANSFORM_III_P, 10.0d, PolynomialProvablySecure.ZETA_III_P, 901, 901);
    }

    public static int generateKeyPairIIISize(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        return generateKeyPair(bArr, bArr2, secureRandom, 1024, 48, Parameter.Q_III_SIZE, Parameter.Q_INVERSE_III_SIZE, 23, 38, Parameter.INVERSE_NUMBER_THEORETIC_TRANSFORM_III_SIZE, 9.0d, PolynomialHeuristic.ZETA_III_SIZE, 910, 910);
    }

    public static int generateKeyPairIIISpeed(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        return generateKeyPair(bArr, bArr2, secureRandom, 1024, 48, Parameter.Q_III_SPEED, Parameter.Q_INVERSE_III_SPEED, 24, 38, Parameter.INVERSE_NUMBER_THEORETIC_TRANSFORM_III_SPEED, 12.0d, PolynomialHeuristic.ZETA_III_SPEED, 1147, 1233);
    }

    public static int generateKeyPairIP(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        return generateKeyPair(bArr, bArr2, secureRandom, 1024, 4, 25, Parameter.Q_I_P, Parameter.Q_INVERSE_I_P, 29, 108, Parameter.INVERSE_NUMBER_THEORETIC_TRANSFORM_I_P, 10.0d, PolynomialProvablySecure.ZETA_I_P, 554, 554);
    }

    private static void hashFunction(byte[] bArr, int i, int[] iArr, byte[] bArr2, int i2, int i3, int i4, int i5) {
        int i6 = i3 + 64;
        byte[] bArr3 = new byte[i6];
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = iArr[i7];
            int i9 = ((i5 / 2) - i8) >> 31;
            int i10 = ((~i9) & i8) | ((i8 - i5) & i9);
            iArr[i7] = i10;
            int i11 = 1 << i4;
            int i12 = (i11 - 1) & i10;
            int i13 = ((1 << (i4 - 1)) - i12) >> 31;
            bArr3[i7] = (byte) ((i10 - (((~i13) & i12) | ((i12 - i11) & i13))) >> i4);
        }
        System.arraycopy(bArr2, i2, bArr3, i3, 64);
        if (i5 == 4205569) {
            HashUtils.secureHashAlgorithmKECCAK128(bArr, i, 32, bArr3, 0, i6);
        }
        if (i5 == 4206593 || i5 == 8404993) {
            HashUtils.secureHashAlgorithmKECCAK256(bArr, i, 32, bArr3, 0, i6);
        }
    }

    private static void hashFunction(byte[] bArr, int i, long[] jArr, byte[] bArr2, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        byte[] bArr3;
        int i8 = i3 * i4;
        int i9 = i8 + 64;
        byte[] bArr4 = new byte[i9];
        int i10 = 0;
        while (i10 < i4) {
            int i11 = i3 * i10;
            int i12 = 0;
            while (i12 < i3) {
                long j = jArr[i11];
                long j2 = ((i6 / 2) - j) >> 63;
                int i13 = 1 << i5;
                long j3 = ((1 << (i5 - 1)) - ((i13 - 1) & (((j - i6) & j2) | (j & (~j2))))) >> 63;
                bArr4[i11] = (byte) ((r6 - (((r12 - i13) & j3) | (r12 & (~j3)))) >> i5);
                i12++;
                i11++;
                i10 = i10;
            }
            i10++;
        }
        System.arraycopy(bArr2, i2, bArr4, i8, 64);
        if (i6 == 485978113) {
            HashUtils.secureHashAlgorithmKECCAK128(bArr, i, 32, bArr4, 0, i9);
            bArr3 = bArr4;
            i7 = i9;
        } else {
            i7 = i9;
            bArr3 = bArr4;
        }
        if (i6 == 1129725953) {
            HashUtils.secureHashAlgorithmKECCAK256(bArr, i, 32, bArr3, 0, i7);
        }
    }

    private static int signing(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, SecureRandom secureRandom, int i3, int i4, int i5, int i6, long j, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        long[] jArr;
        byte[] bArr4;
        long[] jArr2;
        boolean zTestV;
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[128];
        byte[] bArr8 = new byte[32];
        short[] sArr = new short[i5];
        int i19 = i3 * i4;
        long[] jArr3 = new long[i19];
        long[] jArr4 = new long[i19];
        long[] jArr5 = new long[i3];
        long[] jArr6 = new long[i3];
        long[] jArr7 = new long[i3];
        long[] jArr8 = new long[i19];
        long[] jArr9 = new long[i3];
        secureRandom.nextBytes(bArr8);
        int[] iArr = new int[i5];
        System.arraycopy(bArr8, 0, bArr7, 32, 32);
        System.arraycopy(bArr3, i15 - 32, bArr7, 0, 32);
        if (i6 == 485978113) {
            HashUtils.secureHashAlgorithmKECCAK128(bArr7, 64, 64, bArr2, 0, i2);
            HashUtils.secureHashAlgorithmKECCAK128(bArr6, 0, 32, bArr7, 0, 128);
            bArr7 = bArr7;
        }
        if (i6 == 1129725953) {
            HashUtils.secureHashAlgorithmKECCAK256(bArr7, 64, 64, bArr2, 0, i2);
            byte[] bArr9 = bArr7;
            HashUtils.secureHashAlgorithmKECCAK256(bArr6, 0, 32, bArr9, 0, 128);
            bArr7 = bArr9;
        }
        long[] jArr10 = jArr8;
        long[] jArr11 = jArr4;
        long[] jArr12 = jArr5;
        long[] jArr13 = jArr7;
        short[] sArr2 = sArr;
        long[] jArr14 = jArr6;
        byte[] bArr10 = bArr5;
        Polynomial.polynomialUniform(jArr3, bArr3, i15 - 64, i3, i4, i6, j, i7, i13, i14);
        long[] jArr15 = jArr3;
        int i20 = 0;
        boolean z = false;
        while (true) {
            boolean z2 = true;
            int i21 = i20 + 1;
            byte[] bArr11 = bArr6;
            long[] jArr16 = jArr12;
            Sample.sampleY(jArr16, bArr11, 0, i21, i3, i6, i8, i9);
            int i22 = i3;
            Polynomial.polynomialNumberTheoreticTransform(jArr14, jArr16, i22);
            int i23 = 0;
            while (i23 < i4) {
                int i24 = i23;
                int i25 = i22 * i24;
                long[] jArr17 = jArr14;
                long[] jArr18 = jArr16;
                long[] jArr19 = jArr11;
                long[] jArr20 = jArr15;
                Polynomial.polynomialMultiplication(jArr19, i25, jArr20, i25, jArr17, 0, i22, i6, j);
                i23 = i24 + 1;
                i22 = i3;
                jArr11 = jArr19;
                jArr16 = jArr18;
                z2 = z2;
                jArr15 = jArr20;
                jArr14 = jArr17;
            }
            long[] jArr21 = jArr15;
            boolean z3 = z2;
            long[] jArr22 = jArr14;
            long[] jArr23 = jArr16;
            long[] jArr24 = jArr11;
            byte[] bArr12 = bArr10;
            hashFunction(bArr12, 0, jArr24, bArr7, 64, i3, i4, i10, i6);
            jArr11 = jArr24;
            short[] sArr3 = sArr2;
            int[] iArr2 = iArr;
            Sample.encodeC(iArr2, sArr3, bArr12, 0, i3, i5);
            byte[] bArr13 = bArr12;
            int i26 = i3;
            long[] jArr25 = jArr13;
            Polynomial.sparsePolynomialMultiplication8(jArr25, 0, bArr3, 0, iArr2, sArr3, i26, i5);
            iArr = iArr2;
            sArr2 = sArr3;
            long[] jArr26 = jArr9;
            Polynomial.polynomialAddition(jArr26, 0, jArr23, 0, jArr25, 0, i26);
            if (testRejection(jArr26, i26, i8, i11) != z3) {
                int i27 = 0;
                while (true) {
                    if (i27 >= i4) {
                        i18 = i6;
                        jArr = jArr26;
                        bArr4 = bArr13;
                        jArr2 = jArr11;
                        zTestV = z;
                        break;
                    }
                    int i28 = i27;
                    int i29 = i26 * i28;
                    int i30 = i28 + 1;
                    jArr = jArr26;
                    long[] jArr27 = jArr10;
                    Polynomial.sparsePolynomialMultiplication8(jArr27, i29, bArr3, i26 * i30, iArr, sArr2, i26, i5);
                    bArr4 = bArr13;
                    jArr2 = jArr11;
                    Polynomial.polynomialSubtraction(jArr2, i29, jArr11, i29, jArr27, i29, i3, i6, i16, i17);
                    jArr10 = jArr27;
                    zTestV = testV(jArr2, i29, i3, i10, i6, i12);
                    i18 = i6;
                    if (zTestV == z3) {
                        break;
                    }
                    z = zTestV;
                    i27 = i30;
                    i26 = i3;
                    jArr11 = jArr2;
                    jArr26 = jArr;
                    bArr13 = bArr4;
                }
                if (zTestV != z3) {
                    break;
                }
                jArr11 = jArr2;
                z = zTestV;
                i20 = i21;
                bArr6 = bArr11;
                jArr15 = jArr21;
                jArr14 = jArr22;
                bArr10 = bArr4;
                jArr12 = jArr23;
                jArr13 = jArr25;
                jArr9 = jArr;
            } else {
                jArr9 = jArr26;
                i20 = i21;
                bArr6 = bArr11;
                jArr12 = jArr23;
                jArr13 = jArr25;
                bArr10 = bArr13;
                jArr15 = jArr21;
                jArr14 = jArr22;
            }
        }
        long[] jArr28 = jArr;
        byte[] bArr14 = bArr4;
        if (i18 == 485978113) {
            Pack.encodeSignatureIP(bArr, 0, bArr14, 0, jArr28);
        }
        if (i18 == 1129725953) {
            Pack.encodeSignatureIIIP(bArr, 0, bArr14, 0, jArr28);
        }
        return 0;
    }

    private static int signing(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, SecureRandom secureRandom, int i3, int i4, int i5, long j, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        byte[] bArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int i16;
        byte[] bArr5;
        short[] sArr;
        int[] iArr8;
        int[] iArr9;
        byte[] bArr6;
        byte[] bArr7 = new byte[32];
        byte[] bArr8 = new byte[32];
        byte[] bArr9 = new byte[128];
        byte[] bArr10 = new byte[64];
        byte[] bArr11 = new byte[32];
        int[] iArr10 = new int[i4];
        short[] sArr2 = new short[i4];
        short[] sArr3 = new short[i3];
        short[] sArr4 = new short[i3];
        int[] iArr11 = new int[i3];
        int[] iArr12 = new int[i3];
        int[] iArr13 = new int[i3];
        int[] iArr14 = new int[i3];
        int[] iArr15 = new int[i3];
        int[] iArr16 = new int[i3];
        if (i5 == 4205569) {
            Pack.decodePrivateKeyI(bArr10, sArr3, sArr4, bArr3);
        }
        if (i5 == 4206593) {
            Pack.decodePrivateKeyIIISize(bArr10, sArr3, sArr4, bArr3);
        }
        if (i5 == 8404993) {
            Pack.decodePrivateKeyIIISpeed(bArr10, sArr3, sArr4, bArr3);
        }
        secureRandom.nextBytes(bArr11);
        System.arraycopy(bArr11, 0, bArr9, 32, 32);
        System.arraycopy(bArr10, 32, bArr9, 0, 32);
        if (i5 == 4205569) {
            iArr2 = iArr16;
            iArr4 = iArr12;
            bArr4 = bArr10;
            iArr6 = iArr13;
            iArr5 = iArr11;
            iArr7 = iArr15;
            i16 = Parameter.Q_III_SIZE;
            iArr3 = iArr14;
            HashUtils.secureHashAlgorithmKECCAK128(bArr9, 64, 64, bArr2, 0, i2);
            HashUtils.secureHashAlgorithmKECCAK128(bArr8, 0, 32, bArr9, 0, 128);
            bArr9 = bArr9;
        } else {
            iArr2 = iArr16;
            iArr3 = iArr14;
            iArr4 = iArr12;
            bArr4 = bArr10;
            iArr5 = iArr11;
            iArr6 = iArr13;
            iArr7 = iArr15;
            i16 = Parameter.Q_III_SIZE;
        }
        if (i5 == i16 || i5 == 8404993) {
            HashUtils.secureHashAlgorithmKECCAK256(bArr9, 64, 64, bArr2, 0, i2);
            byte[] bArr12 = bArr9;
            HashUtils.secureHashAlgorithmKECCAK256(bArr8, 0, 32, bArr12, 0, 128);
            bArr9 = bArr12;
        }
        int[] iArr17 = iArr5;
        int[] iArr18 = iArr10;
        short[] sArr5 = sArr2;
        short[] sArr6 = sArr4;
        int[] iArr19 = iArr3;
        Polynomial.polynomialUniform(iArr17, bArr4, 0, i3, i5, j, i6, i12, i13);
        int[] iArr20 = iArr17;
        int i17 = 0;
        while (true) {
            int i18 = i17 + 1;
            int[] iArr21 = iArr6;
            Sample.sampleY(iArr21, bArr8, 0, i18, i3, i5, i7, i8);
            int[] iArr22 = iArr20;
            int[] iArr23 = iArr4;
            Polynomial.polynomialMultiplication(iArr23, iArr22, iArr21, i3, i5, j, iArr);
            bArr5 = bArr7;
            hashFunction(bArr5, 0, iArr23, bArr9, 64, i3, i9, i5);
            int[] iArr24 = iArr18;
            short[] sArr7 = sArr5;
            Sample.encodeC(iArr24, sArr7, bArr5, 0, i3, i4);
            int[] iArr25 = iArr7;
            Polynomial.sparsePolynomialMultiplication16(iArr25, sArr3, iArr24, sArr7, i3, i4);
            Polynomial.polynomialAddition(iArr19, iArr21, iArr25, i3);
            if (!testRejection(iArr19, i3, i7, i10)) {
                sArr = sArr6;
                iArr8 = iArr25;
                int[] iArr26 = iArr2;
                Polynomial.sparsePolynomialMultiplication16(iArr26, sArr, iArr24, sArr7, i3, i4);
                Polynomial.polynomialSubtractionCorrection(iArr23, iArr23, iArr26, i3, i5);
                iArr9 = iArr26;
                if (!testV(iArr23, i3, i9, i5, i11)) {
                    break;
                }
            } else {
                sArr = sArr6;
                iArr9 = iArr2;
                iArr8 = iArr25;
            }
            iArr2 = iArr9;
            sArr5 = sArr7;
            i17 = i18;
            iArr6 = iArr21;
            bArr7 = bArr5;
            iArr7 = iArr8;
            iArr20 = iArr22;
            sArr6 = sArr;
            iArr18 = iArr24;
            iArr4 = iArr23;
        }
        if (i5 == 4205569) {
            Pack.encodeSignature(bArr, 0, bArr5, 0, iArr19, i3, i9);
            bArr6 = bArr5;
        } else {
            bArr6 = bArr5;
        }
        if (i5 == 4206593) {
            Pack.encodeSignature(bArr, 0, bArr6, 0, iArr19, i3, i9);
        }
        if (i5 != 8404993) {
            return 0;
        }
        Pack.encodeSignatureIIISpeed(bArr, 0, bArr6, 0, iArr19);
        return 0;
    }

    static int signingI(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, SecureRandom secureRandom) {
        return signing(bArr, bArr2, i, i2, bArr3, secureRandom, 512, 30, Parameter.Q_I, Parameter.Q_INVERSE_I, 23, 1048575, 20, 21, 1586, 1586, 19, Parameter.INVERSE_NUMBER_THEORETIC_TRANSFORM_I, 1021, 32, PolynomialHeuristic.ZETA_I);
    }

    public static int signingIIIP(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, SecureRandom secureRandom) {
        return signing(bArr, bArr2, i, i2, bArr3, secureRandom, 2048, 5, 40, Parameter.Q_III_P, Parameter.Q_INVERSE_III_P, 31, Parameter.B_III_P, 23, 24, 901, 901, 180, Parameter.INVERSE_NUMBER_THEORETIC_TRANSFORM_III_P, Polynomial.PRIVATE_KEY_III_P, 15, 34);
    }

    static int signingIIISize(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, SecureRandom secureRandom) {
        return signing(bArr, bArr2, i, i2, bArr3, secureRandom, 1024, 48, Parameter.Q_III_SIZE, Parameter.Q_INVERSE_III_SIZE, 23, 1048575, 20, 21, 910, 910, 38, Parameter.INVERSE_NUMBER_THEORETIC_TRANSFORM_III_SIZE, 1021, 32, PolynomialHeuristic.ZETA_III_SIZE);
    }

    static int signingIIISpeed(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, SecureRandom secureRandom) {
        return signing(bArr, bArr2, i, i2, bArr3, secureRandom, 1024, 48, Parameter.Q_III_SPEED, Parameter.Q_INVERSE_III_SPEED, 24, 2097151, 21, 22, 1233, 1147, 38, Parameter.INVERSE_NUMBER_THEORETIC_TRANSFORM_III_SPEED, 511, 32, PolynomialHeuristic.ZETA_III_SPEED);
    }

    public static int signingIP(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, SecureRandom secureRandom) {
        return signing(bArr, bArr2, i, i2, bArr3, secureRandom, 1024, 4, 25, Parameter.Q_I_P, Parameter.Q_INVERSE_I_P, 29, 2097151, 21, 22, 554, 554, 108, Parameter.INVERSE_NUMBER_THEORETIC_TRANSFORM_I_P, Polynomial.PRIVATE_KEY_I_P, 1, 29);
    }

    private static boolean testRejection(int[] iArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i; i4++) {
            if (absolute(iArr[i4]) > i2 - i3) {
                return true;
            }
        }
        return false;
    }

    private static boolean testRejection(long[] jArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i; i4++) {
            if (absolute(jArr[i4]) > i2 - i3) {
                return true;
            }
        }
        return false;
    }

    private static boolean testV(int[] iArr, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i3 / 2;
            int i7 = iArr[i5];
            int i8 = (i6 - i7) >> 31;
            int i9 = (i7 & (~i8)) | ((i7 - i3) & i8);
            int i10 = 1 << (i2 - 1);
            if ((((~(absolute(i9) - (i6 - i4))) | (~(absolute(i9 - ((((i9 + i10) - 1) >> i2) << i2)) - (i10 - i4)))) >>> 31) == 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean testV(long[] jArr, int i, int i2, int i3, int i4, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            long j = jArr[i + i6];
            long j2 = ((i4 / 2) - j) >> 63;
            long j3 = ((~j2) & j) | ((j - i4) & j2);
            long j4 = ~(absolute(j3) - (r4 - i5));
            int i7 = 1 << (i3 - 1);
            if ((((~(absolute(j3 - (((int) (((i7 + j3) - 1) >> i3)) << i3)) - (i7 - i5))) | j4) >>> 63) == 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean testZ(int[] iArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = iArr[i4];
            int i6 = i2 - i3;
            if (i5 < (-i6) || i5 > i6) {
                return true;
            }
        }
        return false;
    }

    private static boolean testZ(long[] jArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i; i4++) {
            long j = jArr[i4];
            int i5 = i2 - i3;
            if (j < (-i5) || j > i5) {
                return true;
            }
        }
        return false;
    }

    private static int verifying(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, int i3, int i4, int i5, int i6, long j, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, long[] jArr) {
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[64];
        int i16 = i3 * i4;
        int[] iArr = new int[i16];
        int[] iArr2 = new int[i5];
        short[] sArr = new short[i5];
        long[] jArr2 = new long[i16];
        long[] jArr3 = new long[i3];
        long[] jArr4 = new long[i3];
        long[] jArr5 = new long[i16];
        long[] jArr6 = new long[i16];
        if (i2 < i11) {
            return -1;
        }
        if (i6 == 485978113) {
            Pack.decodeSignatureIP(bArr4, jArr3, bArr2, i);
        }
        if (i6 == 1129725953) {
            Pack.decodeSignatureIIIP(bArr4, jArr3, bArr2, i);
        }
        if (testZ(jArr3, i3, i8, i10)) {
            return -2;
        }
        if (i6 == 485978113) {
            Pack.decodePublicKeyIP(iArr, bArr6, 0, bArr3);
        }
        if (i6 == 1129725953) {
            Pack.decodePublicKeyIIIP(iArr, bArr6, 0, bArr3);
        }
        Polynomial.polynomialUniform(jArr6, bArr6, 0, i3, i4, i6, j, i7, i12, i13);
        long[] jArr7 = jArr6;
        int i17 = i4;
        int i18 = i3;
        byte[] bArr8 = bArr4;
        Sample.encodeC(iArr2, sArr, bArr8, 0, i18, i5);
        Polynomial.polynomialNumberTheoreticTransform(jArr4, jArr3, i18);
        int i19 = 0;
        while (i19 < i17) {
            int i20 = i18 * i19;
            long[] jArr8 = jArr4;
            byte[] bArr9 = bArr8;
            long[] jArr9 = jArr7;
            Polynomial.polynomialMultiplication(jArr2, i20, jArr9, i20, jArr8, 0, i18, i6, j);
            long[] jArr10 = jArr5;
            Polynomial.sparsePolynomialMultiplication32(jArr10, i20, iArr, i20, iArr2, sArr, i3, i5, i6, i14, i15);
            Polynomial.polynomialSubtraction(jArr2, i20, jArr2, i20, jArr10, i20, i3, i6, i14, i15);
            i19++;
            i18 = i3;
            i17 = i4;
            jArr5 = jArr10;
            bArr8 = bArr9;
            jArr4 = jArr8;
            jArr7 = jArr9;
        }
        byte[] bArr10 = bArr8;
        if (i6 == 485978113) {
            HashUtils.secureHashAlgorithmKECCAK128(bArr7, 0, 64, bArr, 0, bArr.length);
        }
        if (i6 == 1129725953) {
            HashUtils.secureHashAlgorithmKECCAK256(bArr7, 0, 64, bArr, 0, bArr.length);
        }
        hashFunction(bArr5, 0, jArr2, bArr7, 0, i3, i4, i9, i6);
        return !CommonFunction.memoryEqual(bArr10, 0, bArr5, 0, 32) ? -3 : 0;
    }

    private static int verifying(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, int i3, int i4, int i5, long j, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        int i16;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        byte[] bArr4;
        byte[] bArr5;
        int[] iArr6;
        byte[] bArr6;
        int[] iArr7;
        int i17;
        byte[] bArr7;
        byte[] bArr8 = new byte[32];
        byte[] bArr9 = new byte[32];
        byte[] bArr10 = new byte[32];
        byte[] bArr11 = new byte[64];
        int[] iArr8 = new int[i3];
        int[] iArr9 = new int[i4];
        short[] sArr = new short[i4];
        int[] iArr10 = new int[i3];
        int[] iArr11 = new int[i3];
        int[] iArr12 = new int[i3];
        int[] iArr13 = new int[i3];
        if (i2 < i11) {
            return -1;
        }
        if (i5 == 4205569 || i5 == 4206593) {
            i16 = 4205569;
            iArr2 = iArr10;
            iArr3 = iArr11;
            iArr4 = iArr12;
            iArr5 = iArr13;
            bArr4 = bArr8;
            Pack.decodeSignature(bArr4, iArr3, bArr2, i, i3, i8);
        } else {
            i16 = 4205569;
            iArr2 = iArr10;
            iArr3 = iArr11;
            iArr4 = iArr12;
            iArr5 = iArr13;
            bArr4 = bArr8;
        }
        if (i5 == 8404993) {
            Pack.decodeSignatureIIISpeed(bArr4, iArr3, bArr2, i);
        }
        if (testZ(iArr3, i3, i7, i9)) {
            return -2;
        }
        if (i5 == i16 || i5 == 4206593) {
            bArr5 = bArr4;
            iArr6 = iArr3;
            bArr6 = bArr10;
            iArr7 = iArr8;
            i17 = 8404993;
            Pack.decodePublicKey(iArr7, bArr6, 0, bArr3, i3, i6);
        } else {
            bArr5 = bArr4;
            iArr6 = iArr3;
            bArr6 = bArr10;
            iArr7 = iArr8;
            i17 = 8404993;
        }
        if (i5 == i17) {
            Pack.decodePublicKeyIIISpeed(iArr7, bArr6, 0, bArr3);
        }
        int[] iArr14 = iArr5;
        Polynomial.polynomialUniform(iArr14, bArr6, 0, i3, i5, j, i6, i12, i13);
        byte[] bArr12 = bArr5;
        Sample.encodeC(iArr9, sArr, bArr12, 0, i3, i4);
        Polynomial.sparsePolynomialMultiplication32(iArr4, iArr7, iArr9, sArr, i3, i4);
        int[] iArr15 = iArr2;
        Polynomial.polynomialMultiplication(iArr15, iArr14, iArr6, i3, i5, j, iArr);
        Polynomial.polynomialSubtractionMontgomery(iArr15, iArr15, iArr4, i3, i5, j, i10);
        if (i5 == i16) {
            HashUtils.secureHashAlgorithmKECCAK128(bArr11, 0, 64, bArr, 0, bArr.length);
            bArr7 = bArr11;
        } else {
            bArr7 = bArr11;
        }
        if (i5 == 4206593 || i5 == 8404993) {
            HashUtils.secureHashAlgorithmKECCAK256(bArr7, 0, 64, bArr, 0, bArr.length);
        }
        hashFunction(bArr9, 0, iArr15, bArr7, 0, i3, i8, i5);
        return !CommonFunction.memoryEqual(bArr12, 0, bArr9, 0, 32) ? -3 : 0;
    }

    static int verifyingI(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3) {
        return verifying(bArr, bArr2, i, i2, bArr3, 512, 30, Parameter.Q_I, Parameter.Q_INVERSE_I, 23, 1048575, 21, 1586, Parameter.R_I, Polynomial.SIGNATURE_I, 19, Parameter.INVERSE_NUMBER_THEORETIC_TRANSFORM_I, 1021, 32, PolynomialHeuristic.ZETA_I);
    }

    static int verifyingIIISize(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3) {
        return verifying(bArr, bArr2, i, i2, bArr3, 1024, 48, Parameter.Q_III_SIZE, Parameter.Q_INVERSE_III_SIZE, 23, 1048575, 21, 910, Parameter.R_III_SIZE, Polynomial.SIGNATURE_III_SIZE, 38, Parameter.INVERSE_NUMBER_THEORETIC_TRANSFORM_III_SIZE, 1021, 32, PolynomialHeuristic.ZETA_III_SIZE);
    }

    static int verifyingIIISpeed(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3) {
        return verifying(bArr, bArr2, i, i2, bArr3, 1024, 48, Parameter.Q_III_SPEED, Parameter.Q_INVERSE_III_SPEED, 24, 2097151, 22, 1233, Parameter.R_III_SPEED, 2848, 38, Parameter.INVERSE_NUMBER_THEORETIC_TRANSFORM_III_SPEED, 511, 32, PolynomialHeuristic.ZETA_III_SPEED);
    }

    static int verifyingPI(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3) {
        return verifying(bArr, bArr2, i, i2, bArr3, 1024, 4, 25, Parameter.Q_I_P, Parameter.Q_INVERSE_I_P, 29, 2097151, 22, 554, 2848, 108, Parameter.INVERSE_NUMBER_THEORETIC_TRANSFORM_I_P, 1, 29, PolynomialProvablySecure.ZETA_I_P);
    }

    static int verifyingPIII(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3) {
        return verifying(bArr, bArr2, i, i2, bArr3, 2048, 5, 40, Parameter.Q_III_P, Parameter.Q_INVERSE_III_P, 31, Parameter.B_III_P, 24, 901, Polynomial.SIGNATURE_III_P, 180, Parameter.INVERSE_NUMBER_THEORETIC_TRANSFORM_III_P, 15, 34, PolynomialProvablySecure.ZETA_III_P);
    }
}
