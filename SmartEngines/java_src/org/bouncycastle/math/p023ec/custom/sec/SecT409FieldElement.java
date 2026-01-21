package org.bouncycastle.math.p023ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p023ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat448;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class SecT409FieldElement extends ECFieldElement.AbstractF2m {

    /* renamed from: x */
    protected long[] f1727x;

    public SecT409FieldElement() {
        this.f1727x = Nat448.create64();
    }

    public SecT409FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.f1727x = SecT409Field.fromBigInteger(bigInteger);
    }

    protected SecT409FieldElement(long[] jArr) {
        this.f1727x = jArr;
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat448.create64();
        SecT409Field.add(this.f1727x, ((SecT409FieldElement) eCFieldElement).f1727x, jArrCreate64);
        return new SecT409FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrCreate64 = Nat448.create64();
        SecT409Field.addOne(this.f1727x, jArrCreate64);
        return new SecT409FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT409FieldElement) {
            return Nat448.eq64(this.f1727x, ((SecT409FieldElement) obj).f1727x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public String getFieldName() {
        return "SecT409Field";
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public int getFieldSize() {
        return 409;
    }

    public int getK1() {
        return 87;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 409;
    }

    public int getRepresentation() {
        return 2;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public ECFieldElement halfTrace() {
        long[] jArrCreate64 = Nat448.create64();
        SecT409Field.halfTrace(this.f1727x, jArrCreate64);
        return new SecT409FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public boolean hasFastTrace() {
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f1727x, 0, 7) ^ 4090087;
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrCreate64 = Nat448.create64();
        SecT409Field.invert(this.f1727x, jArrCreate64);
        return new SecT409FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public boolean isOne() {
        return Nat448.isOne64(this.f1727x);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public boolean isZero() {
        return Nat448.isZero64(this.f1727x);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat448.create64();
        SecT409Field.multiply(this.f1727x, ((SecT409FieldElement) eCFieldElement).f1727x, jArrCreate64);
        return new SecT409FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f1727x;
        long[] jArr2 = ((SecT409FieldElement) eCFieldElement).f1727x;
        long[] jArr3 = ((SecT409FieldElement) eCFieldElement2).f1727x;
        long[] jArr4 = ((SecT409FieldElement) eCFieldElement3).f1727x;
        long[] jArrCreate64 = Nat.create64(13);
        SecT409Field.multiplyAddToExt(jArr, jArr2, jArrCreate64);
        SecT409Field.multiplyAddToExt(jArr3, jArr4, jArrCreate64);
        long[] jArrCreate642 = Nat448.create64();
        SecT409Field.reduce(jArrCreate64, jArrCreate642);
        return new SecT409FieldElement(jArrCreate642);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrCreate64 = Nat448.create64();
        SecT409Field.sqrt(this.f1727x, jArrCreate64);
        return new SecT409FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrCreate64 = Nat448.create64();
        SecT409Field.square(this.f1727x, jArrCreate64);
        return new SecT409FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f1727x;
        long[] jArr2 = ((SecT409FieldElement) eCFieldElement).f1727x;
        long[] jArr3 = ((SecT409FieldElement) eCFieldElement2).f1727x;
        long[] jArrCreate64 = Nat.create64(13);
        SecT409Field.squareAddToExt(jArr, jArrCreate64);
        SecT409Field.multiplyAddToExt(jArr2, jArr3, jArrCreate64);
        long[] jArrCreate642 = Nat448.create64();
        SecT409Field.reduce(jArrCreate64, jArrCreate642);
        return new SecT409FieldElement(jArrCreate642);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement squarePow(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrCreate64 = Nat448.create64();
        SecT409Field.squareN(this.f1727x, i, jArrCreate64);
        return new SecT409FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f1727x[0] & 1) != 0;
    }

    @Override // org.bouncycastle.math.p023ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat448.toBigInteger64(this.f1727x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public int trace() {
        return SecT409Field.trace(this.f1727x);
    }
}
