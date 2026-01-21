package org.bouncycastle.math.p023ec.custom.p024gm;

import java.math.BigInteger;
import org.bouncycastle.math.p023ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes2.dex */
public class SM2P256V1FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: Q */
    public static final BigInteger f1659Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));

    /* renamed from: x */
    protected int[] f1660x;

    public SM2P256V1FieldElement() {
        this.f1660x = Nat256.create();
    }

    public SM2P256V1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f1659Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.f1660x = SM2P256V1Field.fromBigInteger(bigInteger);
    }

    protected SM2P256V1FieldElement(int[] iArr) {
        this.f1660x = iArr;
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SM2P256V1Field.add(this.f1660x, ((SM2P256V1FieldElement) eCFieldElement).f1660x, iArrCreate);
        return new SM2P256V1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat256.create();
        SM2P256V1Field.addOne(this.f1660x, iArrCreate);
        return new SM2P256V1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Mod.invert(SM2P256V1Field.f1658P, ((SM2P256V1FieldElement) eCFieldElement).f1660x, iArrCreate);
        SM2P256V1Field.multiply(iArrCreate, this.f1660x, iArrCreate);
        return new SM2P256V1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SM2P256V1FieldElement) {
            return Nat256.m668eq(this.f1660x, ((SM2P256V1FieldElement) obj).f1660x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public String getFieldName() {
        return "SM2P256V1Field";
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public int getFieldSize() {
        return f1659Q.bitLength();
    }

    public int hashCode() {
        return f1659Q.hashCode() ^ Arrays.hashCode(this.f1660x, 0, 8);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat256.create();
        Mod.invert(SM2P256V1Field.f1658P, this.f1660x, iArrCreate);
        return new SM2P256V1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne(this.f1660x);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero(this.f1660x);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SM2P256V1Field.multiply(this.f1660x, ((SM2P256V1FieldElement) eCFieldElement).f1660x, iArrCreate);
        return new SM2P256V1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat256.create();
        SM2P256V1Field.negate(this.f1660x, iArrCreate);
        return new SM2P256V1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f1660x;
        if (Nat256.isZero(iArr) || Nat256.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat256.create();
        SM2P256V1Field.square(iArr, iArrCreate);
        SM2P256V1Field.multiply(iArrCreate, iArr, iArrCreate);
        int[] iArrCreate2 = Nat256.create();
        SM2P256V1Field.squareN(iArrCreate, 2, iArrCreate2);
        SM2P256V1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        int[] iArrCreate3 = Nat256.create();
        SM2P256V1Field.squareN(iArrCreate2, 2, iArrCreate3);
        SM2P256V1Field.multiply(iArrCreate3, iArrCreate, iArrCreate3);
        SM2P256V1Field.squareN(iArrCreate3, 6, iArrCreate);
        SM2P256V1Field.multiply(iArrCreate, iArrCreate3, iArrCreate);
        int[] iArrCreate4 = Nat256.create();
        SM2P256V1Field.squareN(iArrCreate, 12, iArrCreate4);
        SM2P256V1Field.multiply(iArrCreate4, iArrCreate, iArrCreate4);
        SM2P256V1Field.squareN(iArrCreate4, 6, iArrCreate);
        SM2P256V1Field.multiply(iArrCreate, iArrCreate3, iArrCreate);
        SM2P256V1Field.square(iArrCreate, iArrCreate3);
        SM2P256V1Field.multiply(iArrCreate3, iArr, iArrCreate3);
        SM2P256V1Field.squareN(iArrCreate3, 31, iArrCreate4);
        SM2P256V1Field.multiply(iArrCreate4, iArrCreate3, iArrCreate);
        SM2P256V1Field.squareN(iArrCreate4, 32, iArrCreate4);
        SM2P256V1Field.multiply(iArrCreate4, iArrCreate, iArrCreate4);
        SM2P256V1Field.squareN(iArrCreate4, 62, iArrCreate4);
        SM2P256V1Field.multiply(iArrCreate4, iArrCreate, iArrCreate4);
        SM2P256V1Field.squareN(iArrCreate4, 4, iArrCreate4);
        SM2P256V1Field.multiply(iArrCreate4, iArrCreate2, iArrCreate4);
        SM2P256V1Field.squareN(iArrCreate4, 32, iArrCreate4);
        SM2P256V1Field.multiply(iArrCreate4, iArr, iArrCreate4);
        SM2P256V1Field.squareN(iArrCreate4, 62, iArrCreate4);
        SM2P256V1Field.square(iArrCreate4, iArrCreate2);
        if (Nat256.m668eq(iArr, iArrCreate2)) {
            return new SM2P256V1FieldElement(iArrCreate4);
        }
        return null;
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat256.create();
        SM2P256V1Field.square(this.f1660x, iArrCreate);
        return new SM2P256V1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SM2P256V1Field.subtract(this.f1660x, ((SM2P256V1FieldElement) eCFieldElement).f1660x, iArrCreate);
        return new SM2P256V1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public boolean testBitZero() {
        return Nat256.getBit(this.f1660x, 0) == 1;
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.f1660x);
    }
}
