package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

/* loaded from: classes2.dex */
public class McEliecePublicKey extends ASN1Object {

    /* renamed from: g */
    private final GF2Matrix f1773g;

    /* renamed from: n */
    private final int f1774n;

    /* renamed from: t */
    private final int f1775t;

    public McEliecePublicKey(int i, int i2, GF2Matrix gF2Matrix) {
        this.f1774n = i;
        this.f1775t = i2;
        this.f1773g = new GF2Matrix(gF2Matrix);
    }

    private McEliecePublicKey(ASN1Sequence aSN1Sequence) {
        this.f1774n = ((ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact();
        this.f1775t = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intValueExact();
        this.f1773g = new GF2Matrix(((ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets());
    }

    public static McEliecePublicKey getInstance(Object obj) {
        if (obj instanceof McEliecePublicKey) {
            return (McEliecePublicKey) obj;
        }
        if (obj != null) {
            return new McEliecePublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GF2Matrix getG() {
        return new GF2Matrix(this.f1773g);
    }

    public int getN() {
        return this.f1774n;
    }

    public int getT() {
        return this.f1775t;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f1774n));
        aSN1EncodableVector.add(new ASN1Integer(this.f1775t));
        aSN1EncodableVector.add(new DEROctetString(this.f1773g.getEncoded()));
        return new DERSequence(aSN1EncodableVector);
    }
}
